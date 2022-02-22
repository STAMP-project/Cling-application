import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = property2.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime4 = property2.addToCopy((long) 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = property2.addToCopy(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay8 = dateTime7.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet26 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str27 = dateTimeZone16.getShortName((long) 19, locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        int int21 = dateTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime3 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType13.getField(chronology16);
        org.joda.time.DateTime dateTime18 = dateTime10.toDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) instant2, chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant9", (mutableDateTime1.compareTo(instant9) == 0) == mutableDateTime1.equals(instant9));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Calendar calendar9 = dateTime5.toCalendar(locale7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) '4', chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        int int6 = dateTime5.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime1.minusMonths((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime.Property property3 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime4 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths(0);
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        int int11 = localDate9.size();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        org.joda.time.DateTime dateTime20 = localDate9.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime2.toDateTime(dateTimeZone17);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(0L, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.withYear((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType12.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.millisOfSecond();
        java.lang.String str18 = chronology15.toString();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) readablePeriod10, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        int int22 = dateTimeZone16.getOffset((long) 53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, (int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime1.withMillis((long) 26487938);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.LocalDate localDate27 = dateTime25.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant26", (dateTime18.compareTo(instant26) == 0) == dateTime18.equals(instant26));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        long long23 = dateTimeZone16.adjustOffset((-431366459990L), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        int int6 = localDateTime5.getYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) (short) 100);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) instant9);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime14 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant9", (mutableDateTime8.compareTo(instant9) == 0) == mutableDateTime8.equals(instant9));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime15 = localTime9.withFieldAdded(durationFieldType13, 32772);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        boolean boolean19 = mutableDateTime17.isAfter((long) 22);
        boolean boolean21 = mutableDateTime17.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        mutableDateTime17.setZone(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localTime9.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime5.withZoneRetainFields(dateTimeZone24);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime27", (instant4.compareTo(dateTime27) == 0) == instant4.equals(dateTime27));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime4.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime6.addYears(26494213);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        long long25 = dateTimeZone20.previousTransition((long) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("years");
        boolean boolean9 = timeZone8.observesDaylightTime();
        java.util.Locale locale10 = java.util.Locale.UK;
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale11.getDisplayScript(locale17);
        java.lang.String str19 = locale10.getDisplayLanguage(locale17);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone8, locale10);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        int int23 = dateTimeZone21.getOffset((long) 53);
        mutableDateTime1.setZoneRetainFields(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime6", (instant2.compareTo(mutableDateTime6) == 0) == instant2.equals(mutableDateTime6));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime6.add((long) 40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMonths((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime23", (instant0.compareTo(dateTime23) == 0) == instant0.equals(dateTime23));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str24 = dateTimeZone23.toString();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime20.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.weekyear();
        java.lang.String str12 = property11.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        long long20 = dateTimeZone15.getMillisKeepLocal(dateTimeZone18, (long) 10);
        boolean boolean21 = dateTimeZone18.isFixed();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 2, dateTimeZone18);
        long long25 = dateTimeZone18.convertLocalToUTC(0L, false);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) dateTime1, dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = property8.addCopy(19);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime15 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime13.plus(readablePeriod16);
        int int18 = property8.getDifference((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.DurationFieldType durationFieldType10 = dateTimeFieldType8.getDurationType();
        boolean boolean11 = dateTime1.isSupported(dateTimeFieldType8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromCalendarFields(calendar4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property8.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime13 = property8.setCopy(9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.secondOfMinute();
        int int24 = dateTimeFormatter17.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime19, "halfdays", 0);
        java.util.Locale locale25 = java.util.Locale.getDefault();
        java.util.Calendar calendar26 = mutableDateTime19.toCalendar(locale25);
        java.lang.String str27 = dateTimeField3.getAsText((org.joda.time.ReadablePartial) localDateTime13, 26501805, locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar26", (calendar4.compareTo(calendar26) == 0) == calendar4.equals(calendar26));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime6.addMillis(32770);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime11 = dateTime1.minus((long) 26490127);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
        int int18 = localDateTime17.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withFieldAdded(durationFieldType20, (int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime11.withFieldAdded(durationFieldType20, 999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime11 = dateTime1.minus((long) 26490127);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) (short) 10);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.DateTime dateTime19 = dateTime16.withMillisOfSecond((int) (byte) 100);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime23 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = localDate24.toInterval(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate24.plusMonths(0);
        org.joda.time.LocalDate.Property property29 = localDate28.year();
        int int30 = localDate28.size();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        long long38 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) 10);
        org.joda.time.DateTime dateTime39 = localDate28.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime21.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime41 = dateTime16.withZoneRetainFields(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant20", (mutableDateTime6.compareTo(instant20) == 0) == mutableDateTime6.equals(instant20));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.era();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears((int) (byte) 100);
        org.joda.time.Interval interval13 = localDate12.toInterval();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime23 = localDate12.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime7.toMutableDateTime(dateTimeZone16);
        java.lang.Object obj25 = mutableDateTime7.clone();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = localDate26.toInterval(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate26.plusMonths(0);
        org.joda.time.LocalDate.Property property31 = localDate30.weekOfWeekyear();
        java.lang.String str32 = property31.toString();
        org.joda.time.LocalDate localDate33 = property31.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean35 = localDate33.isSupported(dateTimeFieldType34);
        boolean boolean36 = mutableDateTime7.isSupported(dateTimeFieldType34);
        boolean boolean37 = instant2.isBefore((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime15", (instant0.compareTo(mutableDateTime15) == 0) == instant0.equals(mutableDateTime15));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant2.plus(readableDuration10);
        org.joda.time.Instant instant14 = instant2.withDurationAdded((long) (short) 1, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant14", (mutableDateTime1.compareTo(instant14) == 0) == mutableDateTime1.equals(instant14));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.LocalDateTime localDateTime9 = property4.addWrapFieldToCopy(26501007);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) (short) 100);
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) instant15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant15);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.LocalTime.Property property28 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime30 = localTime21.minusMinutes(19);
        org.joda.time.Chronology chronology31 = localTime21.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DurationField durationField33 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfCentury();
        mutableDateTime1.setChronology(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant15", (mutableDateTime4.compareTo(instant15) == 0) == mutableDateTime4.equals(instant15));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(53);
        int int12 = localDateTime11.getMillisOfDay();
        java.util.Date date13 = localDateTime11.toDate();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(1L);
        int int16 = mutableDateTime15.getCenturyOfEra();
        java.util.Locale locale17 = java.util.Locale.getDefault();
        java.util.Calendar calendar18 = mutableDateTime15.toCalendar(locale17);
        java.util.Date date19 = calendar18.getTime();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromCalendarFields(calendar20);
        boolean boolean22 = calendar20.isWeekDateSupported();
        calendar20.setFirstDayOfWeek(5);
        calendar20.setMinimalDaysInFirstWeek((-1));
        calendar20.setMinimalDaysInFirstWeek((-1));
        java.util.Date date29 = calendar20.getTime();
        boolean boolean30 = date19.after(date29);
        boolean boolean31 = date13.after(date29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar20", (calendar0.compareTo(calendar20) == 0) == calendar0.equals(calendar20));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("years");
        boolean boolean48 = timeZone47.observesDaylightTime();
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Locale locale50 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet51 = locale50.getExtensionKeys();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayScript(locale53);
        java.lang.String str55 = locale50.getDisplayScript(locale53);
        java.util.Locale locale56 = java.util.Locale.UK;
        java.lang.String str57 = locale50.getDisplayScript(locale56);
        java.lang.String str58 = locale49.getDisplayLanguage(locale56);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone47, locale49);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        timeZone47.setRawOffset(0);
        java.util.Calendar.Builder builder63 = builder42.setTimeZone(timeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar59", (calendar43.compareTo(calendar59) == 0) == calendar43.equals(calendar59));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime13 = property11.addWrapFieldToCopy(26499265);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime3 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) (short) 100);
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) instant15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant15);
        java.lang.Object obj20 = mutableDateTime1.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and instant15", (mutableDateTime14.compareTo(instant15) == 0) == mutableDateTime14.equals(instant15));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.centuryOfEra();
        int int9 = property8.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime13.add(readablePeriod15, (int) (byte) 100);
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTime dateTime19 = dateTime1.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        long long22 = dateTimeZone16.nextTransition((long) 26494213);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis(10);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTime dateTime35 = dateTime28.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime1.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.weekyear();
        org.joda.time.DateTime dateTime12 = property11.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.DateTime dateTime28 = dateTime25.plusDays(17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant26", (dateTime18.compareTo(instant26) == 0) == dateTime18.equals(instant26));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant2.plus(readableDuration10);
        org.joda.time.Instant instant14 = instant2.withDurationAdded(80501819L, 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime dateTime24 = dateTime1.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime24", (instant0.compareTo(dateTime24) == 0) == instant0.equals(dateTime24));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime dateTime7 = dateTime5.minus((long) (-3600000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime22", (instant0.compareTo(dateTime22) == 0) == instant0.equals(dateTime22));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str24 = dateTimeZone23.toString();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime localTime27 = localTime25.plusHours(32772);
        org.joda.time.LocalTime localTime29 = localTime25.withMillisOfSecond(52);
        org.joda.time.DateTime dateTime30 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime21", (instant0.compareTo(dateTime21) == 0) == instant0.equals(dateTime21));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime4 = property2.addWrapFieldToCopy(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis(10);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTime dateTime35 = dateTime28.withChronology(chronology32);
        org.joda.time.DateTime dateTime37 = dateTime28.plusDays(32769);
        java.util.Date date38 = dateTime37.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        int int16 = dateTimeZone14.getOffset((long) 53);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone14);
        java.lang.String str19 = dateTimeZone14.getNameKey(1645514507123L);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromCalendarFields(calendar20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds(0);
        int int26 = localDateTime25.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withFieldAdded(durationFieldType28, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withYear((int) '#');
        boolean boolean33 = dateTimeZone14.isLocalDateTimeGap(localDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar20", (calendar13.compareTo(calendar20) == 0) == calendar13.equals(calendar20));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime1.minusMonths((int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        int int7 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime10", (instant5.compareTo(mutableDateTime10) == 0) == instant5.equals(mutableDateTime10));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.plusYears(26487938);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        int int26 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate localDate28 = localDate25.plusYears((int) (byte) 100);
        org.joda.time.Interval interval29 = localDate28.toInterval();
        org.joda.time.Chronology chronology30 = localDate28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime24.toDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime33", (dateTime24.compareTo(dateTime33) == 0) == dateTime24.equals(dateTime33));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        long long2 = instant0.getMillis();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTimeISO();
        java.lang.String str5 = mutableDateTime3.toString("\ud55c\uad6d\uc5b4");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime1.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.hourOfDay();
        org.joda.time.DurationField durationField31 = chronology27.weeks();
        org.joda.time.DurationField durationField32 = chronology27.days();
        org.joda.time.DateTimeField dateTimeField33 = chronology27.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.era();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime35.year();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        boolean boolean41 = mutableDateTime39.isAfter((long) 22);
        boolean boolean43 = mutableDateTime39.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        mutableDateTime39.setZone(dateTimeZone46);
        mutableDateTime35.setZoneRetainFields(dateTimeZone46);
        org.joda.time.Chronology chronology49 = chronology27.withZone(dateTimeZone46);
        long long51 = dateTimeZone46.convertUTCToLocal(1645514507224L);
        org.joda.time.DateTime dateTime52 = dateTime1.toDateTime(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra(86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.Instant instant4 = instant0.withDurationAdded(1L, 26497732);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.millisOfDay();
        java.lang.String str16 = mutableDateTime13.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int17 = mutableDateTime13.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        boolean boolean27 = dateTimeZone24.isFixed();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        mutableDateTime13.setZoneRetainFields(dateTimeZone24);
        long long30 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((long) (short) 100);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) instant10);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime9.toMutableDateTimeISO();
        int int17 = dateTimeFormatter7.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "7", (int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime14", (instant10.compareTo(mutableDateTime14) == 0) == instant10.equals(mutableDateTime14));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime1.millisOfSecond();
        java.lang.Class<?> wildcardClass8 = property7.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.LocalTime localTime10 = dateTime9.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Calendar calendar11 = mutableDateTime4.toCalendar(locale10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        boolean boolean14 = timeZone13.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale16.getDisplayScript(locale22);
        java.lang.String str24 = locale15.getDisplayLanguage(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone13, locale15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = localDate27.toInterval(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate27.plusMonths(0);
        org.joda.time.LocalDate.Property property32 = localDate31.year();
        int int33 = localDate31.size();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        long long41 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (long) 10);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.DateTime dateTime44 = property43.getDateTime();
        int int45 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = dateTime44.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property49 = dateTime47.property(dateTimeFieldType48);
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getRangeDurationType();
        mutableDateTime4.add(durationFieldType50, 26518108);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar25", (calendar11.compareTo(calendar25) == 0) == calendar11.equals(calendar25));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale11);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis((long) (short) 100);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant26 = instant20.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean27 = instant20.isAfterNow();
        boolean boolean28 = calendar16.before((java.lang.Object) instant20);
        calendar16.setTimeInMillis(2022L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant20", (mutableDateTime1.compareTo(instant20) == 0) == mutableDateTime1.equals(instant20));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears(912);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        boolean boolean24 = dateTime1.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime1.setMillisOfDay(32770);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime6", (instant2.compareTo(mutableDateTime6) == 0) == instant2.equals(mutableDateTime6));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime4.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.add(4012L);
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundFloor();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField(chronology14);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(chronology14);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime22 = property21.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.roundHalfCeiling();
        java.util.GregorianCalendar gregorianCalendar24 = mutableDateTime23.toGregorianCalendar();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.millisOfSecond();
        boolean boolean26 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) mutableDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(26500802);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        java.lang.String str17 = durationFieldType16.toString();
        boolean boolean18 = localTime15.isSupported(durationFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime21 = localTime15.withFieldAdded(durationFieldType19, 32772);
        org.joda.time.LocalTime.Property property22 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime24 = localTime15.minusMinutes(19);
        org.joda.time.Chronology chronology25 = localTime15.getChronology();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime.Property property29 = dateTime26.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        int int31 = dateTime13.get(dateTimeFieldType30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType32.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.hourOfDay();
        org.joda.time.DurationField durationField39 = chronology35.weeks();
        org.joda.time.DurationField durationField40 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.era();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.year();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        boolean boolean49 = mutableDateTime47.isAfter((long) 22);
        boolean boolean51 = mutableDateTime47.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        mutableDateTime47.setZone(dateTimeZone54);
        mutableDateTime43.setZoneRetainFields(dateTimeZone54);
        org.joda.time.Chronology chronology57 = chronology35.withZone(dateTimeZone54);
        org.joda.time.DurationField durationField58 = chronology35.months();
        org.joda.time.DateTime dateTime59 = dateTime13.withChronology(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime43", (dateTime26.compareTo(mutableDateTime43) == 0) == dateTime26.equals(mutableDateTime43));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        int int12 = dateTime1.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 22);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime23", (instant0.compareTo(dateTime23) == 0) == instant0.equals(dateTime23));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks(59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) 2922789);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDurationAdded(readableDuration13, 20);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean18 = instant16.isSupported(dateTimeFieldType17);
        int int19 = localDateTime15.get(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant16", (mutableDateTime2.compareTo(instant16) == 0) == mutableDateTime2.equals(instant16));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.plusYears(26487938);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        int int26 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate localDate28 = localDate25.plusYears((int) (byte) 100);
        org.joda.time.Interval interval29 = localDate28.toInterval();
        org.joda.time.Chronology chronology30 = localDate28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime24.toDateTime(chronology30);
        org.joda.time.DurationField durationField34 = chronology30.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime33", (dateTime24.compareTo(dateTime33) == 0) == dateTime24.equals(dateTime33));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime13.add(readablePeriod15, (int) (byte) 100);
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusMonths(0);
        org.joda.time.LocalDate.Property property25 = localDate24.year();
        int int26 = localDate24.size();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        long long34 = dateTimeZone29.getMillisKeepLocal(dateTimeZone32, (long) 10);
        org.joda.time.DateTime dateTime35 = localDate24.toDateTimeAtMidnight(dateTimeZone32);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.minus(readableDuration37);
        org.joda.time.Chronology chronology39 = dateTime35.getChronology();
        boolean boolean40 = dateTimeFieldType19.isSupported(chronology39);
        mutableDateTime13.set(dateTimeFieldType19, 2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale3, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet22);
        boolean boolean24 = strSet22.isEmpty();
        java.util.Iterator<java.lang.String> strItor25 = strSet22.iterator();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        boolean boolean28 = timeZone27.observesDaylightTime();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = locale30.getDisplayScript(locale36);
        java.lang.String str38 = locale29.getDisplayLanguage(locale36);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone27, locale29);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        boolean boolean41 = timeZone27.observesDaylightTime();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean43 = strSet22.contains((java.lang.Object) calendar42);
        java.lang.Object[] objArray44 = strSet22.toArray();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar39 and calendar42", (calendar39.compareTo(calendar42) == 0) == calendar39.equals(calendar42));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 912);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        int int6 = dateTime2.compareTo((org.joda.time.ReadableInstant) instant4);
        org.joda.time.DateTime dateTime8 = dateTime2.minusMillis(20);
        int int9 = dateTime8.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone12.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = dateTime8.withZone(dateTimeZone12);
        int int17 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant20 = new org.joda.time.Instant();
        org.joda.time.Instant instant22 = instant20.withMillis((long) (short) 100);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant26 = instant20.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean27 = instant20.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale29 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withLocale(locale29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        long long38 = dateTimeZone33.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter30.withZone(dateTimeZone33);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(dateTimeZone33);
        long long42 = dateTimeZone33.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) instant20, dateTimeZone33);
        org.joda.time.DateTime dateTime44 = dateTime8.withZoneRetainFields(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant20", (dateTime2.compareTo(instant20) == 0) == dateTime2.equals(instant20));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime1.withMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime13.add(readablePeriod15, (int) (byte) 100);
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime1.minus(readablePeriod19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.Instant instant7 = instant4.minus(26534577L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMonths(2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime.Property property6 = dateTime5.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar calendar7 = builder0.build();
        calendar7.setTimeInMillis((long) (short) 100);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone11 = calendar10.getTimeZone();
        java.lang.String str12 = timeZone11.getID();
        calendar7.setTimeZone(timeZone11);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("years");
        boolean boolean16 = timeZone15.observesDaylightTime();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.lang.String str25 = locale18.getDisplayScript(locale24);
        java.lang.String str26 = locale17.getDisplayLanguage(locale24);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone15, locale17);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone15);
        boolean boolean30 = timeZone11.hasSameRules(timeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar27", (calendar10.compareTo(calendar27) == 0) == calendar10.equals(calendar27));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.plusMonths(0);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        int int27 = localDate25.size();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfEra();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime36.minus(readableDuration38);
        org.joda.time.Chronology chronology40 = dateTime36.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = mutableDateTime1.toMutableDateTime(chronology40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now();
        boolean boolean44 = mutableDateTime43.isAfterNow();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.minuteOfHour();
        mutableDateTime43.setTime((long) 32769);
        mutableDateTime41.setMillis((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.Instant instant49 = mutableDateTime43.toInstant();
        mutableDateTime43.setSecondOfDay(26518);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime41 and instant49", (mutableDateTime41.compareTo(instant49) == 0) == mutableDateTime41.equals(instant49));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DurationField durationField14 = chronology11.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime5.add(readablePeriod6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTime dateTime8 = localTime1.toDateTimeToday();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime8.withWeekyear(1);
        org.joda.time.DateTime.Property property12 = dateTime8.year();
        org.joda.time.DateTime dateTime14 = dateTime8.plus(0L);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis((-457));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant9", (dateTime14.compareTo(instant9) == 0) == dateTime14.equals(instant9));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.plus((long) 45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField13 = chronology9.weeks();
        org.joda.time.DurationField durationField14 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.minuteOfHour();
        boolean boolean16 = durationFieldType5.isSupported(chronology9);
        org.joda.time.DateTime dateTime17 = dateTime4.toDateTime(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.Instant instant11 = instant2.withMillis((long) 26519211);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("years");
        boolean boolean21 = timeZone20.observesDaylightTime();
        boolean boolean22 = timeZone18.hasSameRules(timeZone20);
        timeZone20.setID("kor");
        boolean boolean25 = timeZone1.hasSameRules(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar16", (calendar13.compareTo(calendar16) == 0) == calendar13.equals(calendar16));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.DateTime dateTime19 = property16.addToCopy(26496731);
        org.joda.time.Instant instant20 = new org.joda.time.Instant((java.lang.Object) dateTime19);
        org.joda.time.DateTime dateTime22 = dateTime19.minusMillis(8517267);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = localDate23.toInterval(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate23.plusMonths(0);
        org.joda.time.LocalDate.Property property28 = localDate27.year();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("years");
        boolean boolean31 = timeZone30.observesDaylightTime();
        java.util.Locale locale32 = java.util.Locale.UK;
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str38 = locale33.getDisplayScript(locale36);
        java.util.Locale locale39 = java.util.Locale.UK;
        java.lang.String str40 = locale33.getDisplayScript(locale39);
        java.lang.String str41 = locale32.getDisplayLanguage(locale39);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone30, locale32);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = localDate44.toInterval(dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate44.plusMonths(0);
        org.joda.time.LocalDate.Property property49 = localDate48.year();
        int int50 = localDate48.size();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        long long58 = dateTimeZone53.getMillisKeepLocal(dateTimeZone56, (long) 10);
        org.joda.time.DateTime dateTime59 = localDate48.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime61 = property60.getDateTime();
        int int62 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime64 = dateTime61.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property66 = dateTime64.property(dateTimeFieldType65);
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType65.getRangeDurationType();
        boolean boolean68 = localDate27.isSupported(dateTimeFieldType65);
        int int69 = dateTime22.get(dateTimeFieldType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant20", (dateTime19.compareTo(instant20) == 0) == dateTime19.equals(instant20));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.weekyear();
        org.joda.time.DateTime dateTime12 = property11.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.toLanguageTag();
        boolean boolean18 = localDate4.equals((java.lang.Object) str17);
        org.joda.time.LocalDate localDate20 = localDate4.minusWeeks(0);
        int int21 = localDate4.getYear();
        org.joda.time.DateMidnight dateMidnight22 = localDate4.toDateMidnight();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        int int24 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (byte) 100);
        org.joda.time.Interval interval27 = localDate26.toInterval();
        org.joda.time.Chronology chronology28 = localDate26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight22, chronology28);
        org.joda.time.DurationField durationField30 = chronology28.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime29", (dateTime15.compareTo(mutableDateTime29) == 0) == dateTime15.equals(mutableDateTime29));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime11 = dateTime1.minus((long) 26490127);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        mutableDateTime13.setMinuteOfDay(100);
        boolean boolean16 = mutableDateTime13.isAfterNow();
        boolean boolean17 = mutableDateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime13.setZoneRetainFields(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime1, dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime1.withDurationAdded(readableDuration23, 26540968);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime22", (instant0.compareTo(mutableDateTime22) == 0) == instant0.equals(mutableDateTime22));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime1.millisOfSecond();
        java.lang.String str8 = property7.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime12 = localTime6.withFieldAdded(durationFieldType10, 32772);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property13.addCopy(19);
        org.joda.time.LocalTime localTime18 = property13.addNoWrapToCopy(13);
        java.lang.String str19 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.LocalTime.Property property28 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime30 = localTime21.minusMinutes(19);
        org.joda.time.Chronology chronology31 = localTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime32 = org.joda.time.MutableDateTime.now(chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter4.withChronology(chronology31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale36 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter35.withLocale(locale36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone40);
        long long45 = dateTimeZone40.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter37.withZone(dateTimeZone40);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.now(dateTimeZone40);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(18775300557L, dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter33.withZone(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and mutableDateTime39", (mutableDateTime32.compareTo(mutableDateTime39) == 0) == mutableDateTime32.equals(mutableDateTime39));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        long long2 = instant0.getMillis();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTimeISO();
        mutableDateTime3.setMillisOfSecond((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withFieldAdded(durationFieldType8, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.year();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType15.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfMinute();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        java.lang.String str24 = durationFieldType23.toString();
        boolean boolean25 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime28 = localTime22.withFieldAdded(durationFieldType26, 32772);
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime22.minusMinutes(2922789);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Locale locale34 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet35 = locale34.getExtensionKeys();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.lang.String str38 = locale36.getDisplayScript(locale37);
        java.lang.String str39 = locale34.getDisplayScript(locale37);
        java.util.Locale locale40 = java.util.Locale.UK;
        java.lang.String str41 = locale34.getDisplayScript(locale40);
        java.lang.String str42 = locale33.getDisplayLanguage(locale40);
        java.lang.String str43 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localTime31, (int) ' ', locale33);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.years();
        java.lang.String str47 = durationFieldType46.toString();
        boolean boolean48 = localTime45.isSupported(durationFieldType46);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime51 = localTime45.withFieldAdded(durationFieldType49, 32772);
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale52.getDisplayScript(locale53);
        java.lang.String str55 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) localTime51, locale53);
        java.util.Calendar.Builder builder56 = builder14.setLocale(locale53);
        java.util.Locale.Builder builder57 = builder13.setLocale(locale53);
        java.util.TimeZone timeZone59 = java.util.TimeZone.getTimeZone("years");
        boolean boolean60 = timeZone59.observesDaylightTime();
        java.util.Locale locale61 = java.util.Locale.UK;
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale64.getDisplayScript(locale65);
        java.lang.String str67 = locale62.getDisplayScript(locale65);
        java.util.Locale locale68 = java.util.Locale.UK;
        java.lang.String str69 = locale62.getDisplayScript(locale68);
        java.lang.String str70 = locale61.getDisplayLanguage(locale68);
        java.util.Calendar calendar71 = java.util.Calendar.getInstance(timeZone59, locale61);
        java.util.Locale.Builder builder72 = builder13.setLocale(locale61);
        java.lang.String str73 = locale61.getDisplayLanguage();
        java.util.Set<java.lang.String> strSet74 = locale61.getUnicodeLocaleAttributes();
        java.lang.String str75 = localDateTime10.toString("\uc601\uc5b4\uce90\ub098\ub2e4)", locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar71", (calendar0.compareTo(calendar71) == 0) == calendar0.equals(calendar71));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.DateTime dateTime3 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.toLanguageTag();
        boolean boolean18 = localDate4.equals((java.lang.Object) str17);
        org.joda.time.LocalDate localDate20 = localDate4.minusWeeks(0);
        int int21 = localDate4.getYear();
        org.joda.time.DateMidnight dateMidnight22 = localDate4.toDateMidnight();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        int int24 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (byte) 100);
        org.joda.time.Interval interval27 = localDate26.toInterval();
        org.joda.time.Chronology chronology28 = localDate26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight22, chronology28);
        int int30 = dateMidnight22.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime29", (dateTime15.compareTo(mutableDateTime29) == 0) == dateTime15.equals(mutableDateTime29));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant5.plus(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType2.getField(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfMinute();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime15 = localTime9.withFieldAdded(durationFieldType13, 32772);
        org.joda.time.LocalTime.Property property16 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime9.minusMinutes(2922789);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Locale locale21 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale21.getDisplayScript(locale24);
        java.util.Locale locale27 = java.util.Locale.UK;
        java.lang.String str28 = locale21.getDisplayScript(locale27);
        java.lang.String str29 = locale20.getDisplayLanguage(locale27);
        java.lang.String str30 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localTime18, (int) ' ', locale20);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.years();
        java.lang.String str34 = durationFieldType33.toString();
        boolean boolean35 = localTime32.isSupported(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime38 = localTime32.withFieldAdded(durationFieldType36, 32772);
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.lang.String str42 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localTime38, locale40);
        java.util.Calendar.Builder builder43 = builder1.setLocale(locale40);
        java.util.Locale.Builder builder44 = builder0.setLocale(locale40);
        java.util.TimeZone timeZone46 = java.util.TimeZone.getTimeZone("years");
        boolean boolean47 = timeZone46.observesDaylightTime();
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet50 = locale49.getExtensionKeys();
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale51.getDisplayScript(locale52);
        java.lang.String str54 = locale49.getDisplayScript(locale52);
        java.util.Locale locale55 = java.util.Locale.UK;
        java.lang.String str56 = locale49.getDisplayScript(locale55);
        java.lang.String str57 = locale48.getDisplayLanguage(locale55);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone46, locale48);
        java.util.Locale.Builder builder59 = builder0.setLocale(locale48);
        java.util.Locale.Builder builder61 = builder0.setRegion("100");
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder63 = builder0.setLocale(locale62);
        java.util.Locale locale64 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder66 = builder0.setLocale(locale64);
        java.lang.String str67 = locale64.getDisplayCountry();
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(1L);
        int int70 = mutableDateTime69.getCenturyOfEra();
        java.util.Locale locale71 = java.util.Locale.getDefault();
        java.util.Calendar calendar72 = mutableDateTime69.toCalendar(locale71);
        java.util.Date date73 = calendar72.getTime();
        java.util.Calendar calendar74 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone75 = calendar74.getTimeZone();
        java.lang.String str76 = timeZone75.getID();
        calendar72.setTimeZone(timeZone75);
        java.util.Locale locale78 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet79 = locale78.getUnicodeLocaleKeys();
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone75, locale78);
        java.lang.String str81 = locale64.getDisplayName(locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar58 and calendar74", (calendar58.compareTo(calendar74) == 0) == calendar58.equals(calendar74));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Calendar calendar11 = mutableDateTime4.toCalendar(locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int16 = dateTimeZone14.getStandardOffset(0L);
        long long18 = dateTimeZone14.nextTransition((long) '#');
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        int int24 = dateTimeZone22.getStandardOffset(0L);
        java.util.TimeZone timeZone25 = dateTimeZone22.toTimeZone();
        mutableDateTime4.setZoneRetainFields(dateTimeZone22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromCalendarFields(calendar27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str38 = localDateTime36.toString(dateTimeFormatter37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusSeconds(12);
        boolean boolean41 = dateTimeZone22.isLocalDateTimeGap(localDateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar27", (calendar11.compareTo(calendar27) == 0) == calendar11.equals(calendar27));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = durationFieldType0.getField(chronology3);
        org.joda.time.DurationField durationField5 = chronology3.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField5, and durationField4", !(durationField4.compareTo(durationField5) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField5.compareTo(durationField4))));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField22, and durationField21", !(durationField21.compareTo(durationField22) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField22.compareTo(durationField21))));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.year();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        boolean boolean17 = mutableDateTime15.isAfter((long) 22);
        boolean boolean19 = mutableDateTime15.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime15.setZone(dateTimeZone22);
        mutableDateTime11.setZoneRetainFields(dateTimeZone22);
        org.joda.time.Chronology chronology25 = chronology3.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField26 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField27 = chronology3.hours();
        org.joda.time.DurationField durationField28 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField7, and durationField8", !(durationField28.compareTo(durationField7) == 0) || (Math.signum(durationField28.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(26513819);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.eras();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.Interval interval7 = localDate6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        mutableDateTime1.addDays(0);
        mutableDateTime1.setDayOfYear(100);
        mutableDateTime1.setWeekOfWeekyear(5);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("years");
        boolean boolean27 = timeZone26.observesDaylightTime();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale31.getDisplayScript(locale32);
        java.lang.String str34 = locale29.getDisplayScript(locale32);
        java.util.Locale locale35 = java.util.Locale.UK;
        java.lang.String str36 = locale29.getDisplayScript(locale35);
        java.lang.String str37 = locale28.getDisplayLanguage(locale35);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone26, locale28);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.Interval interval42 = localDate40.toInterval(dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate40.plusMonths(0);
        org.joda.time.LocalDate.Property property45 = localDate44.year();
        int int46 = localDate44.size();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        long long54 = dateTimeZone49.getMillisKeepLocal(dateTimeZone52, (long) 10);
        org.joda.time.DateTime dateTime55 = localDate44.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfEra();
        org.joda.time.DateTime dateTime57 = property56.getDateTime();
        int int58 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime57);
        int int60 = dateTimeZone39.getStandardOffset((long) (-23));
        mutableDateTime1.setZone(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str65 = dateTimeZone64.toString();
        org.joda.time.DateTime dateTime66 = mutableDateTime1.toDateTime(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(dateTimeZone64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime66", (mutableDateTime1.compareTo(dateTime66) == 0) == mutableDateTime1.equals(dateTime66));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.dayOfWeek();
        org.joda.time.DurationField durationField23 = chronology20.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField23, and durationField21", !(durationField21.compareTo(durationField23) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField23.compareTo(durationField21))));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField8 = chronology4.weeks();
        org.joda.time.DurationField durationField9 = chronology4.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.clockhourOfDay();
        boolean boolean11 = durationFieldType0.isSupported(chronology4);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.years();
        java.lang.String str15 = durationFieldType14.toString();
        boolean boolean16 = localTime13.isSupported(durationFieldType14);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime19 = localTime13.withFieldAdded(durationFieldType17, 32772);
        org.joda.time.LocalTime.Property property20 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime22 = localTime13.minusMinutes(19);
        org.joda.time.Chronology chronology23 = localTime13.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.yearOfCentury();
        org.joda.time.DurationField durationField27 = durationFieldType0.getField(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField25", Math.signum(durationField8.compareTo(durationField25)) == -Math.signum(durationField25.compareTo(durationField8)));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("years");
        boolean boolean16 = timeZone15.observesDaylightTime();
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.lang.String str23 = locale18.getDisplayScript(locale21);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.lang.String str25 = locale18.getDisplayScript(locale24);
        java.lang.String str26 = locale17.getDisplayLanguage(locale24);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone15, locale17);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        boolean boolean29 = timeZone15.observesDaylightTime();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone15);
        calendar13.setTimeZone(timeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar30", (calendar27.compareTo(calendar30) == 0) == calendar27.equals(calendar30));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DurationField durationField4 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale3, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet22);
        boolean boolean24 = strSet22.isEmpty();
        java.util.Iterator<java.lang.String> strItor25 = strSet22.iterator();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        boolean boolean28 = timeZone27.observesDaylightTime();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = locale30.getDisplayScript(locale36);
        java.lang.String str38 = locale29.getDisplayLanguage(locale36);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone27, locale29);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        boolean boolean41 = timeZone27.observesDaylightTime();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean43 = strSet22.contains((java.lang.Object) calendar42);
        java.util.Iterator<java.lang.String> strItor44 = strSet22.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar39 and calendar42", (calendar39.compareTo(calendar42) == 0) == calendar39.equals(calendar42));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.minus(readableDuration17);
        org.joda.time.Chronology chronology19 = dateTime15.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.months();
        org.joda.time.DurationField durationField21 = chronology19.centuries();
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField20, and durationField21", !(durationField22.compareTo(durationField20) == 0) || (Math.signum(durationField22.compareTo(durationField21)) == Math.signum(durationField20.compareTo(durationField21))));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        boolean boolean14 = timeZone13.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale16.getDisplayScript(locale22);
        java.lang.String str24 = locale15.getDisplayLanguage(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone13, locale15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int28 = dateTimeZone26.getOffset((long) 53);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone26);
        java.lang.String str31 = dateTimeZone26.getNameKey(1645514507123L);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 122, dateTimeZone26);
        int[] intArray34 = chronology10.get((org.joda.time.ReadablePartial) localDateTime32, 7L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar25", (calendar0.compareTo(calendar25) == 0) == calendar0.equals(calendar25));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Calendar calendar11 = mutableDateTime4.toCalendar(locale10);
        java.util.Set<java.lang.String> strSet12 = locale10.getUnicodeLocaleAttributes();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        boolean boolean15 = calendar13.isWeekDateSupported();
        calendar13.clear();
        java.time.Instant instant17 = calendar13.toInstant();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromCalendarFields(calendar18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.era();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plusSeconds((int) 'a');
        java.util.Date date27 = localDateTime26.toDate();
        java.time.Instant instant28 = date27.toInstant();
        java.util.Date date29 = java.util.Date.from(instant28);
        java.util.Date date30 = new java.util.Date();
        date30.setMinutes(12);
        java.time.Instant instant33 = date30.toInstant();
        java.time.temporal.Temporal[] temporalArray34 = new java.time.temporal.Temporal[] { instant17, instant28, instant33 };
        java.time.temporal.Temporal[] temporalArray35 = strSet12.toArray(temporalArray34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar18", (calendar11.compareTo(calendar18) == 0) == calendar11.equals(calendar18));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        long long10 = chronology3.add((long) (byte) 0, (long) 12, 26494213);
        org.joda.time.DurationField durationField11 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.era();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        int int16 = dateTimeField13.get(1645514507224L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.add(3, (int) ' ');
        java.util.Date date11 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date12 = new java.util.Date();
        boolean boolean13 = date11.before(date12);
        long long14 = date12.getTime();
        calendar0.setTime(date12);
        java.time.Instant instant16 = calendar0.toInstant();
        java.util.Date date17 = java.util.Date.from(instant16);
        java.util.Date date18 = java.util.Date.from(instant16);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L);
        int int21 = mutableDateTime20.getCenturyOfEra();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Calendar calendar23 = mutableDateTime20.toCalendar(locale22);
        calendar23.add((int) (short) 10, 12);
        calendar23.set(26549063, 0, 26553846, 26565652, 26522820, 0);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("years");
        boolean boolean38 = timeZone37.observesDaylightTime();
        boolean boolean39 = timeZone35.hasSameRules(timeZone37);
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Locale locale41 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet42 = locale41.getExtensionKeys();
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale43.getDisplayScript(locale44);
        java.lang.String str46 = locale41.getDisplayScript(locale44);
        java.util.Locale locale47 = java.util.Locale.UK;
        java.lang.String str48 = locale41.getDisplayScript(locale47);
        java.lang.String str49 = locale40.getDisplayLanguage(locale47);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone35, locale47);
        calendar23.setTimeZone(timeZone35);
        boolean boolean52 = date18.equals((java.lang.Object) calendar23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar50", (calendar0.compareTo(calendar50) == 0) == calendar0.equals(calendar50));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        date52.setSeconds(5);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone59);
        boolean boolean62 = mutableDateTime60.isAfter((long) 22);
        boolean boolean64 = mutableDateTime60.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        mutableDateTime60.setZone(dateTimeZone67);
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.util.Locale locale71 = java.util.Locale.KOREA;
        java.lang.String str72 = locale70.getDisplayScript(locale71);
        java.lang.String str73 = locale70.getDisplayScript();
        java.lang.String str74 = dateTimeZone67.getShortName((long) 13, locale70);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(locale70);
        java.util.Date date76 = calendar75.getTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime79 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology80 = localTime79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType77.getField(chronology80);
        org.joda.time.DateTimeField dateTimeField82 = chronology80.secondOfDay();
        org.joda.time.DateTimeField dateTimeField83 = chronology80.hourOfDay();
        org.joda.time.DurationField durationField84 = chronology80.weeks();
        org.joda.time.DurationField durationField85 = chronology80.days();
        org.joda.time.LocalTime localTime86 = new org.joda.time.LocalTime((java.lang.Object) date76, chronology80);
        int int87 = date76.getTimezoneOffset();
        boolean boolean88 = date52.before(date76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar75", (calendar43.compareTo(calendar75) == 0) == calendar43.equals(calendar75));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        java.lang.String str8 = durationFieldType5.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        boolean boolean16 = durationFieldType5.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.joda.time.DurationField durationField20 = chronology12.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField20, and durationField19", !(durationField19.compareTo(durationField20) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField20.compareTo(durationField19))));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        long long10 = chronology3.add((long) (byte) 0, (long) 12, 26494213);
        org.joda.time.DurationField durationField11 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.era();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        int int16 = dateTimeField13.getMinimumValue(80501819L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(26497663);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(26516090);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter6.withOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfDay();
        java.lang.String str15 = chronology11.toString();
        org.joda.time.DurationField durationField16 = chronology11.centuries();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter6.withChronology(chronology11);
        org.joda.time.DateTimeField dateTimeField18 = chronology11.era();
        org.joda.time.DurationField durationField19 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField20 = chronology11.dayOfWeek();
        org.joda.time.DurationField durationField21 = chronology11.weeks();
        org.joda.time.DurationField durationField22 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField16, and durationField19", !(durationField22.compareTo(durationField16) == 0) || (Math.signum(durationField22.compareTo(durationField19)) == Math.signum(durationField16.compareTo(durationField19))));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.clear();
        calendar0.add(3, 26487938);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        boolean boolean10 = mutableDateTime8.isAfter((long) 22);
        boolean boolean12 = mutableDateTime8.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime8.setZone(dateTimeZone15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale18.getDisplayScript();
        java.lang.String str22 = dateTimeZone15.getShortName((long) 13, locale18);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale18);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        java.util.Date date25 = calendar23.getTime();
        calendar0.setTime(date25);
        java.time.Instant instant27 = calendar0.toInstant();
        java.util.Date date28 = java.util.Date.from(instant27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar23", (calendar0.compareTo(calendar23) == 0) == calendar0.equals(calendar23));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.era();
        org.joda.time.DurationField durationField7 = chronology3.minutes();
        org.joda.time.DurationField durationField8 = chronology3.hours();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology3.months();
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField7, and durationField8", !(durationField12.compareTo(durationField7) == 0) || (Math.signum(durationField12.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.addWrapFieldToCopy(960);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMinuteOfHour(23);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("years");
        boolean boolean11 = timeZone10.observesDaylightTime();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale12);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.Interval interval26 = localDate24.toInterval(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate24.plusMonths(0);
        org.joda.time.LocalDate.Property property29 = localDate28.year();
        int int30 = localDate28.size();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        long long38 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) 10);
        org.joda.time.DateTime dateTime39 = localDate28.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfEra();
        org.joda.time.DateTime dateTime41 = property40.getDateTime();
        int int42 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime44 = dateTime41.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property46 = dateTime44.property(dateTimeFieldType45);
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType45.getRangeDurationType();
        java.lang.String str48 = durationFieldType47.getName();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime6.withFieldAdded(durationFieldType47, 637);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar22", (calendar0.compareTo(calendar22) == 0) == calendar0.equals(calendar22));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        boolean boolean16 = timeZone2.observesDaylightTime();
        calendar0.setTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar14", (calendar0.compareTo(calendar14) == 0) == calendar0.equals(calendar14));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        timeZone1.setRawOffset(26518191);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder23 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        org.joda.time.LocalTime.Property property38 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime40 = localTime31.minusMinutes(2922789);
        java.util.Locale locale42 = java.util.Locale.UK;
        java.util.Locale locale43 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet44 = locale43.getExtensionKeys();
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale45.getDisplayScript(locale46);
        java.lang.String str48 = locale43.getDisplayScript(locale46);
        java.util.Locale locale49 = java.util.Locale.UK;
        java.lang.String str50 = locale43.getDisplayScript(locale49);
        java.lang.String str51 = locale42.getDisplayLanguage(locale49);
        java.lang.String str52 = dateTimeField29.getAsText((org.joda.time.ReadablePartial) localTime40, (int) ' ', locale42);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        java.lang.String str56 = durationFieldType55.toString();
        boolean boolean57 = localTime54.isSupported(durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime60 = localTime54.withFieldAdded(durationFieldType58, 32772);
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.lang.String str63 = locale61.getDisplayScript(locale62);
        java.lang.String str64 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localTime60, locale62);
        java.util.Calendar.Builder builder65 = builder23.setLocale(locale62);
        java.util.Locale.Builder builder66 = builder22.setLocale(locale62);
        java.util.TimeZone timeZone68 = java.util.TimeZone.getTimeZone("years");
        boolean boolean69 = timeZone68.observesDaylightTime();
        java.util.Locale locale70 = java.util.Locale.UK;
        java.util.Locale locale71 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet72 = locale71.getExtensionKeys();
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.util.Locale locale74 = java.util.Locale.KOREA;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.lang.String str76 = locale71.getDisplayScript(locale74);
        java.util.Locale locale77 = java.util.Locale.UK;
        java.lang.String str78 = locale71.getDisplayScript(locale77);
        java.lang.String str79 = locale70.getDisplayLanguage(locale77);
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone68, locale70);
        java.util.Locale.Builder builder81 = builder22.setLocale(locale70);
        java.lang.String str82 = locale70.getDisplayLanguage();
        java.util.Locale locale83 = locale70.stripExtensions();
        java.lang.String str84 = timeZone1.getDisplayName(locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar80", (calendar13.compareTo(calendar80) == 0) == calendar13.equals(calendar80));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        long long10 = chronology3.add((long) (byte) 0, (long) 12, 26494213);
        org.joda.time.DurationField durationField11 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.era();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        long long16 = dateTimeField13.remainder((long) 60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter6.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = dateTimeField16.getType();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = localTime19.isSupported(durationFieldType20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime25 = localTime19.withFieldAdded(durationFieldType23, 32772);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime28 = localTime19.minusMinutes(19);
        org.joda.time.Chronology chronology29 = localTime19.getChronology();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DurationField durationField31 = chronology29.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.clockhourOfDay();
        boolean boolean33 = dateTimeFieldType17.isSupported(chronology29);
        org.joda.time.DurationField durationField34 = chronology29.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField34, and durationField31", !(durationField31.compareTo(durationField34) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField34.compareTo(durationField31))));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        boolean boolean16 = timeZone1.observesDaylightTime();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder17.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder25 = builder17.setTimeZone(timeZone24);
        int int27 = timeZone24.getOffset((long) 2000);
        boolean boolean28 = timeZone1.hasSameRules(timeZone24);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale locale33 = new java.util.Locale("70", "Property[yearOfCentury]", "millisOfDay");
        java.util.Locale.setDefault(locale33);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone1, locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar29", (calendar13.compareTo(calendar29) == 0) == calendar13.equals(calendar29));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        mutableDateTime6.setMinuteOfDay(100);
        boolean boolean9 = mutableDateTime6.isAfterNow();
        boolean boolean10 = mutableDateTime6.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime6.setZoneRetainFields(dateTimeZone13);
        boolean boolean15 = calendar0.before((java.lang.Object) dateTimeZone13);
        java.lang.String str16 = dateTimeZone13.toString();
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromCalendarFields(calendar18);
        boolean boolean20 = calendar18.isWeekDateSupported();
        calendar18.add(3, (int) ' ');
        java.util.Date date29 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date30 = new java.util.Date();
        boolean boolean31 = date29.before(date30);
        long long32 = date30.getTime();
        calendar18.setTime(date30);
        java.lang.String str34 = date30.toLocaleString();
        int int35 = date30.getSeconds();
        boolean boolean36 = timeZone17.inDaylightTime(date30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar18", (calendar0.compareTo(calendar18) == 0) == calendar0.equals(calendar18));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        java.util.Locale locale57 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet58 = locale57.getExtensionKeys();
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.lang.String str61 = locale59.getDisplayScript(locale60);
        java.lang.String str62 = locale57.getDisplayScript(locale60);
        java.util.Locale locale63 = java.util.Locale.UK;
        java.lang.String str64 = locale57.getDisplayScript(locale63);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(locale63);
        calendar65.setFirstDayOfWeek(41);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType70 = org.joda.time.DurationFieldType.years();
        java.lang.String str71 = durationFieldType70.toString();
        boolean boolean72 = localTime69.isSupported(durationFieldType70);
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime75 = localTime69.withFieldAdded(durationFieldType73, 32772);
        org.joda.time.DateTime dateTime76 = localTime69.toDateTimeToday();
        boolean boolean77 = calendar65.after((java.lang.Object) localTime69);
        int int78 = localTime69.getSecondOfMinute();
        boolean boolean79 = date52.equals((java.lang.Object) localTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar65", (calendar43.compareTo(calendar65) == 0) == calendar43.equals(calendar65));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder8 = builder0.setTimeZone(timeZone7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = property14.setCopy(19);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) ' ');
        int int21 = localDateTime18.getMillisOfDay();
        int int22 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withDayOfMonth(3);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime18.minusMillis(26496335);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime18.withYearOfEra(26523268);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime18.minusYears(2022);
        org.joda.time.LocalDateTime.Property property33 = localDateTime18.yearOfEra();
        java.util.Locale locale35 = new java.util.Locale("1 janvier 1970 00:00:00 +00:00");
        int int36 = property33.getMaximumShortTextLength(locale35);
        java.util.Locale locale37 = locale35.stripExtensions();
        java.lang.String str38 = timeZone7.getDisplayName(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar10", (calendar9.compareTo(calendar10) == 0) == calendar9.equals(calendar10));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone16.toString();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = dateTimeZone16.getName((long) 26487938, locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.lang.String str30 = locale9.getDisplayName(locale26);
        java.util.Calendar.Builder builder31 = builder5.setLocale(locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone33 = calendar32.getTimeZone();
        java.lang.String str34 = timeZone33.getID();
        java.util.Calendar.Builder builder35 = builder31.setTimeZone(timeZone33);
        java.util.Calendar.Builder builder39 = builder31.setTimeOfDay((-3600000), 26500557, 26499265);
        java.util.Calendar.Builder builder40 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder45 = builder40.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone47 = java.util.TimeZone.getTimeZone("years");
        boolean boolean48 = timeZone47.observesDaylightTime();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone47);
        java.util.Calendar.Builder builder50 = builder45.setTimeZone(timeZone47);
        timeZone47.setID("+22:01");
        timeZone47.setID("2022-02-22T07:22:17.526Z");
        java.util.TimeZone.setDefault(timeZone47);
        java.util.Calendar.Builder builder56 = builder31.setTimeZone(timeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar49", (calendar32.compareTo(calendar49) == 0) == calendar32.equals(calendar49));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1);
        boolean boolean18 = timeZone1.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar17", (calendar13.compareTo(calendar17) == 0) == calendar13.equals(calendar17));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(26513819);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology4.add(readablePeriod7, (long) 26502510, 26629);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField6", Math.signum(durationField5.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField5)));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        calendar4.add((int) (short) 10, 12);
        calendar4.set(26549063, 0, 26553846, 26565652, 26522820, 0);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        boolean boolean19 = timeZone18.observesDaylightTime();
        boolean boolean20 = timeZone16.hasSameRules(timeZone18);
        java.util.Locale locale21 = java.util.Locale.UK;
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale22.getDisplayScript(locale25);
        java.util.Locale locale28 = java.util.Locale.UK;
        java.lang.String str29 = locale22.getDisplayScript(locale28);
        java.lang.String str30 = locale21.getDisplayLanguage(locale28);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone16, locale28);
        calendar4.setTimeZone(timeZone16);
        java.util.TimeZone timeZone33 = calendar4.getTimeZone();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        java.lang.String str37 = durationFieldType36.toString();
        boolean boolean38 = localTime35.isSupported(durationFieldType36);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime41 = localTime35.withFieldAdded(durationFieldType39, 32772);
        org.joda.time.LocalTime.Property property42 = localTime35.hourOfDay();
        org.joda.time.LocalTime localTime44 = localTime35.minusMinutes(19);
        org.joda.time.Chronology chronology45 = localTime35.getChronology();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime46.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime.Property property49 = dateTime46.secondOfMinute();
        boolean boolean51 = dateTime46.isEqual(7L);
        java.util.Locale locale54 = new java.util.Locale("26", "");
        java.util.Calendar calendar55 = dateTime46.toCalendar(locale54);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.lang.String str57 = locale54.getDisplayVariant(locale56);
        java.lang.String str58 = timeZone33.getDisplayName(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar55", (calendar31.compareTo(calendar55) == 0) == calendar31.equals(calendar55));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        int int4 = localDateTime3.getDayOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.secondOfMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale7 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withLocale(locale7);
        java.lang.String str9 = property5.getAsShortText(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale11.getDisplayScript(locale17);
        java.lang.String str19 = locale10.getDisplayLanguage(locale17);
        java.lang.String str20 = locale10.getDisplayCountry();
        java.lang.String str21 = locale10.getDisplayName();
        int int22 = property5.getMaximumShortTextLength(locale10);
        org.joda.time.LocalDateTime localDateTime24 = property5.addWrapFieldToCopy(26518585);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusDays(1346686);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.joda.time.DateTime.Property property30 = dateTime29.weekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime29.era();
        org.joda.time.DateTime dateTime33 = dateTime29.plusHours((-2054));
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("years");
        boolean boolean36 = timeZone35.observesDaylightTime();
        java.util.Locale locale37 = java.util.Locale.UK;
        java.util.Locale locale38 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet39 = locale38.getExtensionKeys();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale40.getDisplayScript(locale41);
        java.lang.String str43 = locale38.getDisplayScript(locale41);
        java.util.Locale locale44 = java.util.Locale.UK;
        java.lang.String str45 = locale38.getDisplayScript(locale44);
        java.lang.String str46 = locale37.getDisplayLanguage(locale44);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone35, locale37);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.Interval interval51 = localDate49.toInterval(dateTimeZone50);
        org.joda.time.LocalDate localDate53 = localDate49.plusMonths(0);
        org.joda.time.LocalDate.Property property54 = localDate53.year();
        int int55 = localDate53.size();
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        long long63 = dateTimeZone58.getMillisKeepLocal(dateTimeZone61, (long) 10);
        org.joda.time.DateTime dateTime64 = localDate53.toDateTimeAtMidnight(dateTimeZone61);
        org.joda.time.DateTime.Property property65 = dateTime64.yearOfEra();
        org.joda.time.DateTime dateTime66 = property65.getDateTime();
        int int67 = dateTimeZone48.getOffset((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTime dateTime69 = dateTime66.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property71 = dateTime69.property(dateTimeFieldType70);
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType70.getRangeDurationType();
        int int73 = dateTime29.get(dateTimeFieldType70);
        boolean boolean74 = localDateTime24.isSupported(dateTimeFieldType70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar47", (calendar0.compareTo(calendar47) == 0) == calendar0.equals(calendar47));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = property17.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime22 = property17.setCopy(9);
        org.joda.time.LocalDateTime localDateTime24 = property17.addToCopy(960);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withYear(26507773);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26, chronology27);
        boolean boolean29 = dateTimeZone11.isLocalDateTimeGap(localDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar13", (calendar9.compareTo(calendar13) == 0) == calendar9.equals(calendar13));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Instant instant4 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.clockhourOfHalfday();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology5);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 9, chronology5);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.clockhourOfDay();
        org.joda.time.DurationField durationField11 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField13 = chronology5.weeks();
        long long17 = chronology5.add((long) 26635934, 1645514607613L, 0);
        org.joda.time.DurationField durationField18 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField11, and durationField13", !(durationField18.compareTo(durationField11) == 0) || (Math.signum(durationField18.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(19);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) ' ');
        int int11 = localDateTime8.getMillisOfDay();
        int int12 = localDateTime6.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withDayOfMonth(3);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusMillis(26496335);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readablePeriod17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.property(dateTimeFieldType19);
        java.util.Locale.Builder builder21 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType23.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfMinute();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime.Property property37 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime39 = localTime30.minusMinutes(2922789);
        java.util.Locale locale41 = java.util.Locale.UK;
        java.util.Locale locale42 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet43 = locale42.getExtensionKeys();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale44.getDisplayScript(locale45);
        java.lang.String str47 = locale42.getDisplayScript(locale45);
        java.util.Locale locale48 = java.util.Locale.UK;
        java.lang.String str49 = locale42.getDisplayScript(locale48);
        java.lang.String str50 = locale41.getDisplayLanguage(locale48);
        java.lang.String str51 = dateTimeField28.getAsText((org.joda.time.ReadablePartial) localTime39, (int) ' ', locale41);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.years();
        java.lang.String str55 = durationFieldType54.toString();
        boolean boolean56 = localTime53.isSupported(durationFieldType54);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime59 = localTime53.withFieldAdded(durationFieldType57, 32772);
        java.util.Locale locale60 = java.util.Locale.KOREA;
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.lang.String str62 = locale60.getDisplayScript(locale61);
        java.lang.String str63 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) localTime59, locale61);
        java.util.Calendar.Builder builder64 = builder22.setLocale(locale61);
        java.util.Locale.Builder builder65 = builder21.setLocale(locale61);
        java.util.TimeZone timeZone67 = java.util.TimeZone.getTimeZone("years");
        boolean boolean68 = timeZone67.observesDaylightTime();
        java.util.Locale locale69 = java.util.Locale.UK;
        java.util.Locale locale70 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet71 = locale70.getExtensionKeys();
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.lang.String str74 = locale72.getDisplayScript(locale73);
        java.lang.String str75 = locale70.getDisplayScript(locale73);
        java.util.Locale locale76 = java.util.Locale.UK;
        java.lang.String str77 = locale70.getDisplayScript(locale76);
        java.lang.String str78 = locale69.getDisplayLanguage(locale76);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone67, locale69);
        java.util.Locale.Builder builder80 = builder21.setLocale(locale69);
        java.util.Locale.Builder builder82 = builder21.setRegion("100");
        java.util.Locale locale83 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder84 = builder21.setLocale(locale83);
        java.util.Locale locale85 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet86 = locale85.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder87 = builder21.setLocale(locale85);
        java.util.Locale locale88 = builder21.build();
        int int89 = property20.getMaximumTextLength(locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar79", (calendar0.compareTo(calendar79) == 0) == calendar0.equals(calendar79));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.add((long) 'a');
        boolean boolean7 = mutableDateTime1.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime9.toMutableDateTimeISO();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime9.centuryOfEra();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime9.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str21 = dateTimeZone20.toString();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone20);
        java.lang.String str23 = dateTimeZone20.getID();
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone20);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) mutableDateTime24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 22);
        boolean boolean31 = mutableDateTime27.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(1L);
        int int34 = mutableDateTime33.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.era();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        mutableDateTime36.add(readablePeriod38, (int) (byte) 100);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime36);
        mutableDateTime27.setMillis((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology46 = localTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType43.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = dateTimeField49.getType();
        boolean boolean51 = mutableDateTime27.isSupported(dateTimeFieldType50);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime27.dayOfYear();
        boolean boolean53 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime24", (mutableDateTime1.compareTo(mutableDateTime24) == 0) == mutableDateTime1.equals(mutableDateTime24));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.String[] strArray51 = new java.lang.String[] { "ISOChronology[UTC]", "70", "minuteOfHour", "minuteOfHour", "java.util.GregorianCalendar[time=1664868096416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=277,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=21,SECOND=36,MILLISECOND=416,ZONE_OFFSET=0,DST_OFFSET=0]", "+00:00", "0", "minuteOfHour", "70", "Greenwich Mean Time", "June 22, 0130 7:21:31 AM ", "-01:00", "fr", "22 June 0130 07:21:42 ", "22 June 0130 07:21:34 ", "2022-02-22T07:21:35.943Z", "Sat Oct 04 07:21:41 UTC 2053", "Korean", "22 June 0130 07:21:34 ", "June 22, 0130 7:21:31 AM ", "java.io.IOException", "java.io.IOException", "java.util.GregorianCalendar[time=1664868096416,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=277,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=21,SECOND=36,MILLISECOND=416,ZONE_OFFSET=0,DST_OFFSET=0]", "25 Dec 2022 21:43:07 GMT", "100", "07:21:40.472", "07:21", "1", "English", "42", "2022-02-22T07:21:35.943Z", "2022-02-22T07:20:31.615", "2022-02-22T07:21:35.943Z", "1", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", "22 February 2022 00:00:00 +00:00", "07:21", "70", "22 February 2022 00:00:00 +00:00", "2022-02-22T07:21:37.847Z", "07:21", "yearOfEra", "21", "70", "Etc/UTC", "2022-02-22T07:21:30.757Z", "2022-02-22", "-01:00", "java.util.GregorianCalendar[time=43200001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        java.util.Locale.LanguageRange[] languageRangeArray54 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList55 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55, languageRangeArray54);
        boolean boolean57 = strSet52.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList55);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.fromCalendarFields(calendar58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime63 = localDateTime59.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.plusHours(2922789);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusYears(3);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime.Property property70 = localDateTime67.monthOfYear();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime67.plusMonths(26500690);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.yearOfCentury();
        boolean boolean74 = strSet52.contains((java.lang.Object) localDateTime72);
        java.util.TimeZone timeZone76 = java.util.TimeZone.getTimeZone("23:26:18.000");
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(timeZone76);
        java.lang.String str78 = timeZone76.getID();
        boolean boolean79 = strSet52.remove((java.lang.Object) str78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar58 and calendar77", (calendar58.compareTo(calendar77) == 0) == calendar58.equals(calendar77));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.clear();
        calendar0.add(3, 26487938);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        boolean boolean10 = mutableDateTime8.isAfter((long) 22);
        boolean boolean12 = mutableDateTime8.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime8.setZone(dateTimeZone15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale18.getDisplayScript();
        java.lang.String str22 = dateTimeZone15.getShortName((long) 13, locale18);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale18);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        java.util.Date date25 = calendar23.getTime();
        calendar0.setTime(date25);
        int int27 = date25.getMonth();
        java.util.Date date34 = new java.util.Date(1, 2022, (int) '#', 6, (int) (short) 0, 14);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.fromDateFields(date34);
        boolean boolean36 = date25.after(date34);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromDateFields(date25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar23", (calendar0.compareTo(calendar23) == 0) == calendar0.equals(calendar23));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(53);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusMonths(26507773);
        org.joda.time.LocalDateTime.Property property14 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(30);
        java.util.Locale locale19 = java.util.Locale.GERMAN;
        java.lang.String str20 = locale19.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withPivotYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear((int) (short) 10);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.lang.String str34 = locale27.getDisplayScript(locale33);
        java.lang.String str35 = locale26.getDisplayLanguage(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter25.withLocale(locale26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter25.withPivotYear((java.lang.Integer) 26500690);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter39.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime43.secondOfMinute();
        int int48 = dateTimeFormatter41.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime43, "halfdays", 0);
        java.util.Locale locale49 = java.util.Locale.getDefault();
        java.util.Calendar calendar50 = mutableDateTime43.toCalendar(locale49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter38.withLocale(locale49);
        java.lang.String str52 = locale19.getDisplayCountry(locale49);
        int int53 = property16.getMaximumTextLength(locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar50", (calendar0.compareTo(calendar50) == 0) == calendar0.equals(calendar50));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale3, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet22);
        boolean boolean24 = strSet22.isEmpty();
        java.util.Iterator<java.lang.String> strItor25 = strSet22.iterator();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        boolean boolean28 = timeZone27.observesDaylightTime();
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale32.getDisplayScript(locale33);
        java.lang.String str35 = locale30.getDisplayScript(locale33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.lang.String str37 = locale30.getDisplayScript(locale36);
        java.lang.String str38 = locale29.getDisplayLanguage(locale36);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone27, locale29);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        boolean boolean41 = timeZone27.observesDaylightTime();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean43 = strSet22.contains((java.lang.Object) calendar42);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.fromCalendarFields(calendar44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.hourOfDay();
        org.joda.time.LocalDateTime localDateTime49 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime51 = property48.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusMonths(2022);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.plusMinutes(53);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.yearOfCentury();
        org.joda.time.Interval interval57 = property56.toInterval();
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.Interval interval60 = localDate58.toInterval(dateTimeZone59);
        org.joda.time.LocalDate localDate62 = localDate58.plusMonths(0);
        org.joda.time.LocalDate.Property property63 = localDate62.year();
        int int64 = localDate62.size();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.DateTimeZone dateTimeZone67 = mutableDateTime66.getZone();
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.joda.time.DateTimeZone dateTimeZone70 = mutableDateTime69.getZone();
        long long72 = dateTimeZone67.getMillisKeepLocal(dateTimeZone70, (long) 10);
        org.joda.time.DateTime dateTime73 = localDate62.toDateTimeAtMidnight(dateTimeZone70);
        org.joda.time.DateTime dateTime74 = dateTime73.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime76 = dateTime73.minus((long) 11);
        org.joda.time.DateTime.Property property77 = dateTime76.dayOfYear();
        org.joda.time.DateTime.Property property78 = dateTime76.monthOfYear();
        org.joda.time.DateTime dateTime79 = property78.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property80 = dateTime79.dayOfWeek();
        org.joda.time.Interval interval81 = property80.toInterval();
        org.joda.time.LocalDate localDate82 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.Interval interval84 = localDate82.toInterval(dateTimeZone83);
        org.joda.time.LocalDate localDate86 = localDate82.withYearOfEra((int) (byte) 100);
        org.joda.time.Interval interval87 = localDate82.toInterval();
        org.joda.time.LocalDate localDate91 = new org.joda.time.LocalDate(5, 5, 9);
        org.joda.time.Interval interval92 = localDate91.toInterval();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property94 = localDate93.weekyear();
        org.joda.time.LocalDate localDate95 = property94.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone96 = null;
        org.joda.time.Interval interval97 = localDate95.toInterval(dateTimeZone96);
        org.joda.time.ReadableInterval[] readableIntervalArray98 = new org.joda.time.ReadableInterval[] { interval57, interval81, interval87, interval92, interval97 };
        org.joda.time.ReadableInterval[] readableIntervalArray99 = strSet22.toArray(readableIntervalArray98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar39 and calendar42", (calendar39.compareTo(calendar42) == 0) == calendar39.equals(calendar42));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str5 = dateTimeZone4.toString();
        mutableDateTime1.setZoneRetainFields(dateTimeZone4);
        mutableDateTime1.addMinutes(960);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.era();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime1.toMutableDateTime(chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime17", (mutableDateTime1.compareTo(mutableDateTime17) == 0) == mutableDateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale11);
        calendar16.setLenient(true);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        int int21 = calendar19.getActualMaximum(13);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        boolean boolean25 = mutableDateTime23.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime23.toMutableDateTime();
        mutableDateTime23.addDays(19);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.dayOfMonth();
        mutableDateTime23.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        mutableDateTime23.add(readablePeriod32);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        int int35 = localDate34.getDayOfMonth();
        org.joda.time.LocalDate localDate37 = localDate34.plusYears((int) (byte) 100);
        org.joda.time.Interval interval38 = localDate37.toInterval();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 10);
        java.lang.String str47 = dateTimeZone41.toString();
        org.joda.time.DateTime dateTime48 = localDate37.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfDay((int) (short) 10);
        boolean boolean51 = mutableDateTime23.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime53 = dateTime48.plusYears(26501188);
        boolean boolean54 = calendar19.after((java.lang.Object) dateTime53);
        boolean boolean55 = calendar19.isWeekDateSupported();
        java.util.TimeZone timeZone56 = calendar19.getTimeZone();
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone56);
        calendar16.setTimeZone(timeZone56);
        calendar16.set(26620871, 26686, 26613714, 26683, 26675104, 30);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(1L);
        int int68 = mutableDateTime67.getCenturyOfEra();
        java.util.Locale locale69 = java.util.Locale.getDefault();
        java.util.Calendar calendar70 = mutableDateTime67.toCalendar(locale69);
        java.util.Date date71 = calendar70.getTime();
        java.util.Calendar calendar72 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.fromCalendarFields(calendar72);
        boolean boolean74 = calendar72.isWeekDateSupported();
        calendar72.setFirstDayOfWeek(5);
        calendar72.setMinimalDaysInFirstWeek((-1));
        calendar72.setMinimalDaysInFirstWeek((-1));
        java.util.Date date81 = calendar72.getTime();
        boolean boolean82 = date71.after(date81);
        int int83 = date81.getHours();
        calendar16.setTime(date81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar72", (calendar19.compareTo(calendar72) == 0) == calendar19.equals(calendar72));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        java.util.Calendar.Builder builder58 = builder42.setInstant(1645514507123L);
        java.util.Calendar.Builder builder59 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder64 = builder59.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("years");
        boolean boolean67 = timeZone66.observesDaylightTime();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone66);
        java.util.Calendar.Builder builder69 = builder64.setTimeZone(timeZone66);
        java.util.Calendar.Builder builder70 = builder58.setTimeZone(timeZone66);
        int int71 = timeZone66.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar68", (calendar43.compareTo(calendar68) == 0) == calendar43.equals(calendar68));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.clockhourOfDay();
        org.joda.time.DurationField durationField10 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField8", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        int int8 = dateTimeZone6.getOffset((long) 26512348);
        mutableDateTime1.setZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        boolean boolean20 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 2, dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC(0L, false);
        long long26 = dateTimeZone17.nextTransition(26500734L);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime29", (mutableDateTime1.compareTo(mutableDateTime29) == 0) == mutableDateTime1.equals(mutableDateTime29));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTime();
        org.joda.time.DateTime.Property property29 = dateTime27.era();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 0, 10);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        int int35 = dateTimeZone32.getOffsetFromLocal((long) 'x');
        org.joda.time.DateTime dateTime36 = dateTime27.withZone(dateTimeZone32);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime36", (dateTime27.compareTo(dateTime36) == 0) == dateTime27.equals(dateTime36));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.era();
        org.joda.time.DurationField durationField8 = chronology4.minutes();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (-457), chronology4);
        org.joda.time.DurationField durationField10 = chronology4.eras();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone16.toString();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = dateTimeZone16.getName((long) 26487938, locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.lang.String str30 = locale9.getDisplayName(locale26);
        java.util.Calendar.Builder builder31 = builder5.setLocale(locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone33 = calendar32.getTimeZone();
        java.lang.String str34 = timeZone33.getID();
        java.util.Calendar.Builder builder35 = builder31.setTimeZone(timeZone33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone33, locale36);
        java.util.Calendar.Builder builder38 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder43 = builder38.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("years");
        boolean boolean46 = timeZone45.observesDaylightTime();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone45);
        java.util.Calendar.Builder builder48 = builder43.setTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        timeZone45.setRawOffset(26594359);
        boolean boolean52 = timeZone33.hasSameRules(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar37", (calendar32.compareTo(calendar37) == 0) == calendar32.equals(calendar37));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusMillis((int) 'a');
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay(26551238);
        boolean boolean22 = dateTime19.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long27 = dateTimeZone24.convertLocalToUTC((long) 26572, true);
        org.joda.time.DateTime dateTime28 = dateTime19.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime28", (dateTime19.compareTo(dateTime28) == 0) == dateTime19.equals(dateTime28));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone7 = calendar6.getTimeZone();
        java.lang.String str8 = timeZone7.getID();
        calendar4.setTimeZone(timeZone7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone7, locale10);
        timeZone7.setRawOffset(53180448);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        int int22 = localDate21.getDayOfMonth();
        org.joda.time.LocalDate localDate24 = localDate21.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = localDate26.toInterval(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate26.plusMonths(0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        int int32 = localDate30.size();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime41.property(dateTimeFieldType42);
        int int44 = localDate21.get(dateTimeFieldType42);
        org.joda.time.LocalDate.Property property45 = localDate21.dayOfMonth();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        int int48 = property45.getMaximumTextLength(locale47);
        java.lang.String str49 = property20.getAsShortText(locale47);
        java.util.Locale locale50 = locale47.stripExtensions();
        java.lang.String str51 = locale47.toLanguageTag();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone7, locale47);
        java.lang.String str53 = locale47.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar52", (calendar6.compareTo(calendar52) == 0) == calendar6.equals(calendar52));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime33);
        int int36 = dateTimeZone15.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone15);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate41 = localDate38.withWeekyear((-26519));
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DateTime dateTime45 = instant43.toDateTimeISO();
        org.joda.time.DateTime dateTime46 = localDate41.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.fromCalendarFields(calendar47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        org.joda.time.LocalDateTime localDateTime53 = property51.roundCeilingCopy();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.fromCalendarFields(calendar54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plusSeconds(26523579);
        int int62 = property51.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime57.minusWeeks(26505028);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime57.withWeekyear(241);
        java.lang.String str67 = localDateTime66.toString();
        org.joda.time.DateTime dateTime68 = dateTime45.withFields((org.joda.time.ReadablePartial) localDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar47", (calendar14.compareTo(calendar47) == 0) == calendar14.equals(calendar47));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone7 = calendar6.getTimeZone();
        java.lang.String str8 = timeZone7.getID();
        calendar4.setTimeZone(timeZone7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone7, locale10);
        timeZone7.setRawOffset(53180448);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        int int22 = localDate21.getDayOfMonth();
        org.joda.time.LocalDate localDate24 = localDate21.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = localDate26.toInterval(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate26.plusMonths(0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        int int32 = localDate30.size();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime41.property(dateTimeFieldType42);
        int int44 = localDate21.get(dateTimeFieldType42);
        org.joda.time.LocalDate.Property property45 = localDate21.dayOfMonth();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        int int48 = property45.getMaximumTextLength(locale47);
        java.lang.String str49 = property20.getAsShortText(locale47);
        java.util.Locale locale50 = locale47.stripExtensions();
        java.lang.String str51 = locale47.toLanguageTag();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone7, locale47);
        int int53 = timeZone7.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar52", (calendar6.compareTo(calendar52) == 0) == calendar6.equals(calendar52));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.setCopy(9);
        org.joda.time.LocalDateTime localDateTime11 = property4.addToCopy(960);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear(26507773);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusSeconds(26514743);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusSeconds(26523);
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMinimumValue();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        int int21 = localDate20.getDayOfMonth();
        org.joda.time.LocalDate localDate23 = localDate20.plusYears((int) (byte) 100);
        org.joda.time.Interval interval24 = localDate23.toInterval();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("years");
        boolean boolean27 = timeZone26.observesDaylightTime();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale31.getDisplayScript(locale32);
        java.lang.String str34 = locale29.getDisplayScript(locale32);
        java.util.Locale locale35 = java.util.Locale.UK;
        java.lang.String str36 = locale29.getDisplayScript(locale35);
        java.lang.String str37 = locale28.getDisplayLanguage(locale35);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone26, locale28);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.Interval interval42 = localDate40.toInterval(dateTimeZone41);
        org.joda.time.LocalDate localDate44 = localDate40.plusMonths(0);
        org.joda.time.LocalDate.Property property45 = localDate44.year();
        int int46 = localDate44.size();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        long long54 = dateTimeZone49.getMillisKeepLocal(dateTimeZone52, (long) 10);
        org.joda.time.DateTime dateTime55 = localDate44.toDateTimeAtMidnight(dateTimeZone52);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfEra();
        org.joda.time.DateTime dateTime57 = property56.getDateTime();
        int int58 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTime dateTime60 = dateTime57.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property62 = dateTime60.property(dateTimeFieldType61);
        org.joda.time.DurationFieldType durationFieldType63 = dateTimeFieldType61.getRangeDurationType();
        org.joda.time.LocalDate.Property property64 = localDate23.property(dateTimeFieldType61);
        int int65 = localDate23.getYear();
        org.joda.time.LocalDate localDate67 = localDate23.minusDays(26648231);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDate67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar38", (calendar0.compareTo(calendar38) == 0) == calendar0.equals(calendar38));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.era();
        org.joda.time.DurationField durationField8 = chronology4.minutes();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (-457), chronology4);
        org.joda.time.DurationField durationField10 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology4.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField10", Math.signum(durationField8.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField8)));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        java.lang.String str9 = durationFieldType6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        boolean boolean17 = durationFieldType6.isSupported(chronology13);
        org.joda.time.Chronology chronology18 = chronology13.withUTC();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) 79260000, chronology18);
        org.joda.time.DurationField durationField20 = chronology18.eras();
        org.joda.time.DurationField durationField21 = chronology18.eras();
        org.joda.time.DurationField durationField22 = chronology18.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField22, and durationField20", !(durationField20.compareTo(durationField22) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField22.compareTo(durationField20))));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.dayOfWeek();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField23, and durationField21", !(durationField21.compareTo(durationField23) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField23.compareTo(durationField21))));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        int[] intArray11 = new int[] {};
        java.util.Calendar.Builder builder12 = builder5.setFields(intArray11);
        java.util.Calendar.Builder builder14 = builder5.setLenient(false);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("21");
        int int18 = timeZone16.getOffset((long) 26507773);
        int int19 = timeZone16.getRawOffset();
        java.util.Calendar.Builder builder20 = builder5.setTimeZone(timeZone16);
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder26 = builder21.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("years");
        boolean boolean29 = timeZone28.observesDaylightTime();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone28);
        java.util.Calendar.Builder builder31 = builder26.setTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        int int33 = timeZone28.getRawOffset();
        timeZone28.setID("dayOfMonth");
        java.util.Calendar.Builder builder36 = builder20.setTimeZone(timeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar30", (calendar9.compareTo(calendar30) == 0) == calendar9.equals(calendar30));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusHours(2922789);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.property(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) (short) 100);
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Instant instant21 = instant15.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean22 = instant15.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale24 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withLocale(locale24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        long long33 = dateTimeZone28.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter25.withZone(dateTimeZone28);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.now(dateTimeZone28);
        long long37 = dateTimeZone28.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) instant15, dateTimeZone28);
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = dateTimeZone28.getName(1645514537049L, locale40);
        java.util.Locale locale45 = new java.util.Locale("United Kingdom", "22 June 0130 07:21:42 ", "");
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        java.util.Locale locale47 = java.util.Locale.UK;
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = locale50.getDisplayScript(locale51);
        java.lang.String str53 = locale48.getDisplayScript(locale51);
        java.util.Locale locale54 = java.util.Locale.UK;
        java.lang.String str55 = locale48.getDisplayScript(locale54);
        java.lang.String str56 = locale47.getDisplayLanguage(locale54);
        java.lang.String str57 = locale47.getDisplayCountry();
        java.lang.String str58 = locale47.getDisplayName();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology62 = localTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType59.getField(chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.secondOfDay();
        java.lang.String str66 = dateTimeField64.getAsShortText(10L);
        org.joda.time.DurationField durationField67 = dateTimeField64.getDurationField();
        java.util.Locale locale69 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet70 = locale69.getExtensionKeys();
        java.util.Locale locale71 = java.util.Locale.KOREA;
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.lang.String str73 = locale71.getDisplayScript(locale72);
        java.lang.String str74 = locale69.getDisplayScript(locale72);
        java.util.Locale locale75 = java.util.Locale.UK;
        java.lang.String str76 = locale69.getDisplayScript(locale75);
        java.lang.String str77 = dateTimeField64.getAsShortText(100, locale69);
        java.lang.String str78 = locale47.getDisplayLanguage(locale69);
        java.lang.String str79 = locale45.getDisplayVariant(locale69);
        java.lang.String str80 = locale40.getDisplayVariant(locale45);
        int int81 = property11.getMaximumTextLength(locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar46", (calendar0.compareTo(calendar46) == 0) == calendar0.equals(calendar46));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Calendar calendar11 = mutableDateTime4.toCalendar(locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int16 = dateTimeZone14.getStandardOffset(0L);
        long long18 = dateTimeZone14.nextTransition((long) '#');
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        java.lang.String str28 = dateTimeZone22.toString();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.toLanguageTag();
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.lang.String str33 = locale30.getDisplayCountry(locale32);
        java.lang.String str34 = dateTimeZone22.getName((long) 26487938, locale32);
        long long36 = dateTimeZone14.getMillisKeepLocal(dateTimeZone22, 1645514497771L);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusDays(0);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.fromCalendarFields(calendar40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.era();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plusSeconds((int) 'a');
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.yearOfCentury();
        java.util.Calendar calendar50 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.fromCalendarFields(calendar50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusSeconds(0);
        int int56 = localDateTime55.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType58 = dateTimeFieldType57.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime55.withFieldAdded(durationFieldType58, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime62 = localDateTime45.withFieldAdded(durationFieldType58, 26500557);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime39.withFieldAdded(durationFieldType58, 906);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar40", (calendar11.compareTo(calendar40) == 0) == calendar11.equals(calendar40));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withZoneUTC();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("years");
        boolean boolean18 = timeZone17.observesDaylightTime();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone17, locale19);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter15.withZone(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar29", (calendar0.compareTo(calendar29) == 0) == calendar0.equals(calendar29));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis((long) (short) 100);
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) instant13);
        org.joda.time.Instant instant19 = instant13.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean20 = instant13.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale22 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone26);
        long long31 = dateTimeZone26.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter23.withZone(dateTimeZone26);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(dateTimeZone26);
        long long35 = dateTimeZone26.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) instant13, dateTimeZone26);
        java.util.Locale locale38 = java.util.Locale.US;
        java.lang.String str39 = dateTimeZone26.getName(1645514537049L, locale38);
        java.util.Locale locale43 = new java.util.Locale("United Kingdom", "22 June 0130 07:21:42 ", "");
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        java.util.Locale locale45 = java.util.Locale.UK;
        java.util.Locale locale46 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = locale48.getDisplayScript(locale49);
        java.lang.String str51 = locale46.getDisplayScript(locale49);
        java.util.Locale locale52 = java.util.Locale.UK;
        java.lang.String str53 = locale46.getDisplayScript(locale52);
        java.lang.String str54 = locale45.getDisplayLanguage(locale52);
        java.lang.String str55 = locale45.getDisplayCountry();
        java.lang.String str56 = locale45.getDisplayName();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime59 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology60 = localTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType57.getField(chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.secondOfDay();
        java.lang.String str64 = dateTimeField62.getAsShortText(10L);
        org.joda.time.DurationField durationField65 = dateTimeField62.getDurationField();
        java.util.Locale locale67 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet68 = locale67.getExtensionKeys();
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale69.getDisplayScript(locale70);
        java.lang.String str72 = locale67.getDisplayScript(locale70);
        java.util.Locale locale73 = java.util.Locale.UK;
        java.lang.String str74 = locale67.getDisplayScript(locale73);
        java.lang.String str75 = dateTimeField62.getAsShortText(100, locale67);
        java.lang.String str76 = locale45.getDisplayLanguage(locale67);
        java.lang.String str77 = locale43.getDisplayVariant(locale67);
        java.lang.String str78 = locale38.getDisplayVariant(locale43);
        java.lang.String str79 = timeZone7.getDisplayName(locale38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar44", (calendar9.compareTo(calendar44) == 0) == calendar9.equals(calendar44));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = localDate1.toInterval(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths(0);
        org.joda.time.LocalDate.Property property6 = localDate5.year();
        int int7 = localDate5.size();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.minus(readableDuration18);
        org.joda.time.Chronology chronology20 = dateTime16.getChronology();
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.weeks();
        org.joda.time.DurationField durationField23 = chronology20.months();
        org.joda.time.DurationField durationField24 = chronology20.weeks();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.dayOfMonth();
        org.joda.time.DurationField durationField26 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField22, and durationField23", !(durationField26.compareTo(durationField22) == 0) || (Math.signum(durationField26.compareTo(durationField23)) == Math.signum(durationField22.compareTo(durationField23))));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(26513819);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.weekyears();
        org.joda.time.DurationField durationField6 = chronology4.years();
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField6", (durationField5.compareTo(durationField6) == 0) == durationField5.equals(durationField6));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        int int3 = timeZone1.getOffset((long) 19);
        boolean boolean4 = timeZone1.observesDaylightTime();
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder10 = builder5.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("years");
        boolean boolean13 = timeZone12.observesDaylightTime();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone12);
        java.util.Calendar.Builder builder15 = builder10.setTimeZone(timeZone12);
        timeZone12.setID("+22:01");
        timeZone12.setID("2022-02-22T07:22:17.526Z");
        boolean boolean20 = timeZone1.hasSameRules(timeZone12);
        int int21 = timeZone12.getRawOffset();
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        java.util.Calendar calendar23 = builder22.build();
        java.util.Calendar.Builder builder28 = builder22.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar.Builder builder30 = builder22.setLenient(false);
        java.util.Calendar.Builder builder34 = builder22.setTimeOfDay(26501007, (int) '#', 26487938);
        java.util.Calendar.Builder builder38 = builder34.setWeekDate((int) '4', 6037, 86399);
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        int[] intArray42 = localTime40.getValues();
        java.util.Calendar.Builder builder43 = builder38.setFields(intArray42);
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("Property[dayOfMonth]");
        java.util.Calendar.Builder builder46 = builder43.setTimeZone(timeZone45);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone45);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone45);
        boolean boolean49 = timeZone12.hasSameRules(timeZone45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar47", (calendar14.compareTo(calendar47) == 0) == calendar14.equals(calendar47));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.Chronology chronology12 = dateTimeFormatter10.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeFormatter10.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser15 = dateTimeFormatter14.getParser();
        org.joda.time.format.DateTimeParser dateTimeParser16 = dateTimeFormatter14.getParser();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.Interval interval19 = localDate17.toInterval(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate17.plusMonths(0);
        org.joda.time.LocalDate.Property property22 = localDate21.year();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateMidnight dateMidnight31 = localDate21.toDateMidnight(dateTimeZone25);
        java.util.Locale locale36 = new java.util.Locale("2022-10-04T07:23:10.577", "\uc624\uc804 7:21", "\uc624\uc804 6:23:20");
        java.lang.String str37 = dateTimeZone25.getName(53093743L, locale36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(locale36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter14.withLocale(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar38", (calendar0.compareTo(calendar38) == 0) == calendar0.equals(calendar38));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getRangeDurationType();
        boolean boolean14 = instant11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime7.property(dateTimeFieldType12);
        int int16 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime7.minusYears(6013);
        int int19 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property20 = localDateTime7.era();
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder26 = builder21.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("years");
        boolean boolean29 = timeZone28.observesDaylightTime();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone28);
        java.util.Calendar.Builder builder31 = builder26.setTimeZone(timeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        boolean boolean34 = localDateTime7.equals((java.lang.Object) dateTime33);
        org.joda.time.DateTime dateTime36 = dateTime33.minusMonths(26623184);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar30", (calendar0.compareTo(calendar30) == 0) == calendar0.equals(calendar30));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        java.util.Calendar.Builder builder58 = builder42.setInstant(1645514507123L);
        java.util.Calendar.Builder builder59 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder64 = builder59.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("years");
        boolean boolean67 = timeZone66.observesDaylightTime();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone66);
        java.util.Calendar.Builder builder69 = builder64.setTimeZone(timeZone66);
        java.util.Calendar.Builder builder70 = builder58.setTimeZone(timeZone66);
        java.lang.Class<?> wildcardClass71 = builder58.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar68", (calendar43.compareTo(calendar68) == 0) == calendar43.equals(calendar68));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.setCopy(9);
        org.joda.time.LocalDateTime localDateTime11 = property4.addToCopy(960);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        mutableDateTime13.add(durationFieldType15, (int) (short) 1);
        java.lang.String str18 = durationFieldType15.toString();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime11.withFieldAdded(durationFieldType15, 26523087);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusMonths(2222);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = localDate23.toInterval(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate23.plusMonths(0);
        org.joda.time.LocalDate.Property property28 = localDate27.year();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("years");
        boolean boolean31 = timeZone30.observesDaylightTime();
        java.util.Locale locale32 = java.util.Locale.UK;
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str38 = locale33.getDisplayScript(locale36);
        java.util.Locale locale39 = java.util.Locale.UK;
        java.lang.String str40 = locale33.getDisplayScript(locale39);
        java.lang.String str41 = locale32.getDisplayLanguage(locale39);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone30, locale32);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.Interval interval46 = localDate44.toInterval(dateTimeZone45);
        org.joda.time.LocalDate localDate48 = localDate44.plusMonths(0);
        org.joda.time.LocalDate.Property property49 = localDate48.year();
        int int50 = localDate48.size();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        long long58 = dateTimeZone53.getMillisKeepLocal(dateTimeZone56, (long) 10);
        org.joda.time.DateTime dateTime59 = localDate48.toDateTimeAtMidnight(dateTimeZone56);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfEra();
        org.joda.time.DateTime dateTime61 = property60.getDateTime();
        int int62 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTime dateTime64 = dateTime61.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property66 = dateTime64.property(dateTimeFieldType65);
        org.joda.time.DurationFieldType durationFieldType67 = dateTimeFieldType65.getRangeDurationType();
        boolean boolean68 = localDate27.isSupported(dateTimeFieldType65);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType70 = dateTimeFieldType69.getDurationType();
        int int71 = localDate27.get(dateTimeFieldType69);
        boolean boolean72 = localDateTime20.isSupported(dateTimeFieldType69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar42", (calendar0.compareTo(calendar42) == 0) == calendar0.equals(calendar42));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str2 = dateTimeFieldType1.toString();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType1.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.millisOfDay();
        java.lang.String str8 = mutableDateTime5.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int9 = mutableDateTime5.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        mutableDateTime5.add(durationFieldType10, 8);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        java.lang.String str16 = durationFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(durationFieldType15);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime20 = localTime14.withFieldAdded(durationFieldType18, 32772);
        java.lang.String str21 = durationFieldType18.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.secondOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.hourOfDay();
        boolean boolean29 = durationFieldType18.isSupported(chronology25);
        org.joda.time.DurationField durationField30 = durationFieldType10.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType1.getField(chronology25);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.DurationField durationField33 = chronology25.weekyears();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 26750931, chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField30 and durationField33", (durationField30.compareTo(durationField33) == 0) == durationField30.equals(durationField33));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType2.getField(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfMinute();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime15 = localTime9.withFieldAdded(durationFieldType13, 32772);
        org.joda.time.LocalTime.Property property16 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime9.minusMinutes(2922789);
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Locale locale21 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet22 = locale21.getExtensionKeys();
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale21.getDisplayScript(locale24);
        java.util.Locale locale27 = java.util.Locale.UK;
        java.lang.String str28 = locale21.getDisplayScript(locale27);
        java.lang.String str29 = locale20.getDisplayLanguage(locale27);
        java.lang.String str30 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localTime18, (int) ' ', locale20);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.years();
        java.lang.String str34 = durationFieldType33.toString();
        boolean boolean35 = localTime32.isSupported(durationFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime38 = localTime32.withFieldAdded(durationFieldType36, 32772);
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.lang.String str42 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localTime38, locale40);
        java.util.Calendar.Builder builder43 = builder1.setLocale(locale40);
        java.util.Locale.Builder builder44 = builder0.setLocale(locale40);
        java.util.TimeZone timeZone46 = java.util.TimeZone.getTimeZone("years");
        boolean boolean47 = timeZone46.observesDaylightTime();
        java.util.Locale locale48 = java.util.Locale.UK;
        java.util.Locale locale49 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet50 = locale49.getExtensionKeys();
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale51.getDisplayScript(locale52);
        java.lang.String str54 = locale49.getDisplayScript(locale52);
        java.util.Locale locale55 = java.util.Locale.UK;
        java.lang.String str56 = locale49.getDisplayScript(locale55);
        java.lang.String str57 = locale48.getDisplayLanguage(locale55);
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone46, locale48);
        java.util.Locale.Builder builder59 = builder0.setLocale(locale48);
        java.util.Locale.Builder builder61 = builder0.setRegion("100");
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.util.Locale.Builder builder63 = builder0.setLocale(locale62);
        java.util.Locale locale64 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet65 = locale64.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder66 = builder0.setLocale(locale64);
        java.util.Locale locale67 = java.util.Locale.UK;
        java.lang.String str68 = locale67.getScript();
        java.util.Locale.Builder builder69 = builder66.setLocale(locale67);
        java.util.Locale.Builder builder70 = builder66.clearExtensions();
        java.util.Locale locale71 = java.util.Locale.KOREA;
        java.lang.String str72 = locale71.toLanguageTag();
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.lang.String str74 = locale71.getDisplayCountry(locale73);
        java.lang.String str75 = locale73.getISO3Country();
        java.util.Locale.Builder builder76 = builder66.setLocale(locale73);
        java.util.Locale.Builder builder77 = builder76.clearExtensions();
        java.util.Locale.Builder builder79 = builder76.removeUnicodeLocaleAttribute("2352");
        java.util.Locale.Builder builder81 = builder79.removeUnicodeLocaleAttribute("era");
        java.util.TimeZone timeZone82 = java.util.TimeZone.getDefault();
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale83.getDisplayScript(locale84);
        java.util.Set<java.lang.String> strSet86 = locale83.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet87 = locale83.getUnicodeLocaleAttributes();
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(timeZone82, locale83);
        java.util.Locale.Builder builder89 = builder79.setLocale(locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar58 and calendar88", (calendar58.compareTo(calendar88) == 0) == calendar58.equals(calendar88));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.hourOfDay();
        org.joda.time.DurationField durationField8 = chronology4.weeks();
        org.joda.time.DurationField durationField9 = chronology4.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.clockhourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 26497805, chronology4);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(26547650);
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime15", (dateTime11.compareTo(dateTime15) == 0) == dateTime11.equals(dateTime15));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.getLanguage();
        java.lang.String str6 = nameProvider0.getName(locale1, "clockhourOfHalfday", "1970");
        java.util.Locale locale7 = java.util.Locale.CHINA;
        java.lang.String str10 = nameProvider0.getShortName(locale7, "26507467", "2122-02-22T07:21:45.551Z");
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = nameProvider0.getShortName(locale11, "8", "2022-02-22T07:22:24.710Z");
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) '4');
        org.joda.time.LocalDate.Property property18 = localDate15.era();
        org.joda.time.LocalDate.Property property19 = localDate15.weekyear();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale20.toLanguageTag();
        boolean boolean22 = locale20.hasExtensions();
        java.util.Set<java.lang.String> strSet23 = locale20.getUnicodeLocaleKeys();
        int int24 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str27 = nameProvider0.getName(locale20, "2022-02-22T07:21:53.006Z", "70");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Calendar.Builder builder29 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder34 = builder29.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale38.toLanguageTag();
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str41 = locale38.getDisplayCountry(locale40);
        java.lang.String str42 = locale36.getDisplayCountry(locale38);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        long long50 = dateTimeZone45.getMillisKeepLocal(dateTimeZone48, (long) 10);
        java.lang.String str51 = dateTimeZone45.toString();
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale53.getDisplayCountry(locale55);
        java.lang.String str57 = dateTimeZone45.getName((long) 26487938, locale55);
        java.lang.String str58 = locale55.getDisplayLanguage();
        java.lang.String str59 = locale38.getDisplayName(locale55);
        java.util.Calendar.Builder builder60 = builder34.setLocale(locale55);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone62 = calendar61.getTimeZone();
        java.lang.String str63 = timeZone62.getID();
        java.util.Calendar.Builder builder64 = builder60.setTimeZone(timeZone62);
        java.util.Locale locale65 = java.util.Locale.UK;
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone62, locale65);
        java.lang.String str69 = nameProvider0.getShortName(locale65, "Feb 24, 0019 12:00:00 AM", "de");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar61 and calendar66", (calendar61.compareTo(calendar66) == 0) == calendar61.equals(calendar66));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        org.joda.time.Chronology chronology12 = localTime2.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfCentury();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1645514537049L, chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.secondOfMinute();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = localTime19.isSupported(durationFieldType20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime25 = localTime19.withFieldAdded(durationFieldType23, 32772);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime28 = localTime19.minusMinutes(19);
        org.joda.time.LocalTime.Property property29 = localTime28.millisOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime31 = property29.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime33 = property29.addCopy(1645514545159L);
        org.joda.time.LocalTime localTime34 = property29.withMaximumValue();
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType36.getField(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.millisOfSecond();
        java.lang.String str42 = chronology39.toString();
        org.joda.time.DurationField durationField43 = chronology39.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime46.plus(readablePeriod47);
        int int49 = localTime48.getHourOfDay();
        int int50 = localTime48.getHourOfDay();
        java.lang.String str51 = dateTimeFormatter44.print((org.joda.time.ReadablePartial) localTime48);
        java.util.Calendar.Builder builder52 = new java.util.Calendar.Builder();
        java.util.Calendar calendar53 = builder52.build();
        java.util.Calendar.Builder builder58 = builder52.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar.Builder builder60 = builder52.setLenient(false);
        java.util.Calendar.Builder builder64 = builder52.setTimeOfDay(26501007, (int) '#', 26487938);
        java.util.Calendar.Builder builder68 = builder64.setWeekDate((int) '4', 6037, 86399);
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology71 = localTime70.getChronology();
        int[] intArray72 = localTime70.getValues();
        java.util.Calendar.Builder builder73 = builder68.setFields(intArray72);
        chronology39.validate((org.joda.time.ReadablePartial) localTime48, intArray72);
        int int75 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localTime34, intArray72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField43", Math.signum(durationField14.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField14)));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone2.toString();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.lang.String str14 = dateTimeZone2.getName((long) 26487938, locale12);
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.lang.String str22 = locale16.getDisplayCountry(locale18);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        java.lang.String str31 = dateTimeZone25.toString();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = dateTimeZone25.getName((long) 26487938, locale35);
        java.lang.String str38 = locale35.getDisplayLanguage();
        java.lang.String str39 = locale18.getDisplayName(locale35);
        java.lang.String str40 = locale12.getDisplayName(locale35);
        java.util.Set<java.lang.String> strSet41 = locale12.getUnicodeLocaleKeys();
        java.lang.String str42 = locale12.getISO3Country();
        java.lang.String str43 = locale12.getDisplayName();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale12);
        java.lang.String str45 = locale12.getLanguage();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.years();
        java.lang.String str49 = durationFieldType48.toString();
        boolean boolean50 = localTime47.isSupported(durationFieldType48);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime53 = localTime47.withFieldAdded(durationFieldType51, 32772);
        org.joda.time.LocalTime.Property property54 = localTime47.hourOfDay();
        org.joda.time.LocalTime localTime56 = localTime47.minusMinutes(19);
        org.joda.time.Chronology chronology57 = localTime47.getChronology();
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime58.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime.Property property61 = dateTime58.secondOfMinute();
        boolean boolean63 = dateTime58.isEqual(7L);
        java.util.Locale locale66 = new java.util.Locale("26", "");
        java.util.Calendar calendar67 = dateTime58.toCalendar(locale66);
        java.lang.String str68 = locale12.getDisplayName(locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar44 and calendar67", (calendar44.compareTo(calendar67) == 0) == calendar44.equals(calendar67));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1L);
        int int8 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12, (int) (byte) 100);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.DateTime dateTime28 = localTime21.toDateTimeToday();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale33);
        java.lang.String str38 = localTime21.toString("2022-02-22", locale31);
        java.util.Locale locale39 = locale31.stripExtensions();
        java.lang.String str40 = dateTimeZone18.getShortName(0L, locale31);
        long long42 = dateTimeZone18.nextTransition(1645514565728399L);
        boolean boolean44 = dateTimeZone18.isStandardOffset((long) 82800);
        org.joda.time.DateTime dateTime45 = mutableDateTime1.toDateTime(dateTimeZone18);
        java.util.Calendar calendar46 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.fromCalendarFields(calendar46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minus(readablePeriod48);
        int int50 = localDateTime47.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.plusYears(14);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.weekyear();
        org.joda.time.Chronology chronology54 = localDateTime52.getChronology();
        boolean boolean55 = dateTimeZone18.isLocalDateTimeGap(localDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime45", (mutableDateTime1.compareTo(dateTime45) == 0) == mutableDateTime1.equals(dateTime45));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone7 = calendar6.getTimeZone();
        java.lang.String str8 = timeZone7.getID();
        calendar4.setTimeZone(timeZone7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone7, locale10);
        java.lang.String str13 = timeZone7.getID();
        timeZone7.setRawOffset(1346686);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar12", (calendar6.compareTo(calendar12) == 0) == calendar6.equals(calendar12));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale16.getDisplayScript(locale22);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale22);
        java.util.TimeZone timeZone25 = calendar24.getTimeZone();
        boolean boolean26 = timeZone1.hasSameRules(timeZone25);
        int int27 = timeZone25.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar24", (calendar13.compareTo(calendar24) == 0) == calendar13.equals(calendar24));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundCeilingCopy();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusSeconds(26523579);
        int int15 = property4.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(26526372);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusWeeks(0);
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("years");
        boolean boolean23 = timeZone22.observesDaylightTime();
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale25.getDisplayScript(locale28);
        java.util.Locale locale31 = java.util.Locale.UK;
        java.lang.String str32 = locale25.getDisplayScript(locale31);
        java.lang.String str33 = locale24.getDisplayLanguage(locale31);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone22, locale24);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.Interval interval38 = localDate36.toInterval(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate36.plusMonths(0);
        org.joda.time.LocalDate.Property property41 = localDate40.year();
        int int42 = localDate40.size();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime47.getZone();
        long long50 = dateTimeZone45.getMillisKeepLocal(dateTimeZone48, (long) 10);
        org.joda.time.DateTime dateTime51 = localDate40.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfEra();
        org.joda.time.DateTime dateTime53 = property52.getDateTime();
        int int54 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime53.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property58 = dateTime56.property(dateTimeFieldType57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime20.property(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar34", (calendar0.compareTo(calendar34) == 0) == calendar0.equals(calendar34));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        boolean boolean16 = timeZone1.observesDaylightTime();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder17.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder25 = builder17.setTimeZone(timeZone24);
        int int27 = timeZone24.getOffset((long) 2000);
        boolean boolean28 = timeZone1.hasSameRules(timeZone24);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale.Category category30 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale31 = java.util.Locale.getDefault(category30);
        java.util.Locale locale32 = java.util.Locale.getDefault(category30);
        java.util.Locale locale33 = java.util.Locale.getDefault(category30);
        java.util.Locale locale34 = java.util.Locale.getDefault(category30);
        java.lang.String str35 = timeZone1.getDisplayName(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar29", (calendar13.compareTo(calendar29) == 0) == calendar13.equals(calendar29));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(957572520000L);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = localDate2.toInterval(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths(0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        int int8 = localDate6.size();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfEra();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.joda.time.DateTime dateTime20 = property18.withMinimumValue();
        int int21 = dateTime20.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        int int26 = dateTimeZone24.getOffset((long) 26512348);
        boolean boolean27 = dateTimeZone24.isFixed();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime(dateTimeZone24);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.Chronology chronology30 = mutableDateTime1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.era();
        org.joda.time.DurationField durationField7 = chronology3.minutes();
        org.joda.time.DurationField durationField8 = chronology3.hours();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeField dateTimeField10 = chronology3.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField7, and durationField8", !(durationField11.compareTo(durationField7) == 0) || (Math.signum(durationField11.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1L);
        int int8 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12, (int) (byte) 100);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.DateTime dateTime28 = localTime21.toDateTimeToday();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale33);
        java.lang.String str38 = localTime21.toString("2022-02-22", locale31);
        java.util.Locale locale39 = locale31.stripExtensions();
        java.lang.String str40 = dateTimeZone18.getShortName(0L, locale31);
        long long42 = dateTimeZone18.nextTransition(1645514565728399L);
        boolean boolean44 = dateTimeZone18.isStandardOffset((long) 82800);
        org.joda.time.DateTime dateTime45 = mutableDateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType46.getField(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.hourOfDay();
        org.joda.time.DurationField durationField53 = chronology49.seconds();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology59 = localTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType56.getField(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfDay();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = dateTimeField61.getAsText(7, locale63);
        long long66 = dateTimeField61.roundHalfCeiling((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = dateTimeField61.getType();
        mutableDateTime55.setRounding(dateTimeField61);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime55.property(dateTimeFieldType69);
        org.joda.time.DateTime.Property property71 = dateTime45.property(dateTimeFieldType69);
        int int72 = property71.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime45", (mutableDateTime1.compareTo(dateTime45) == 0) == mutableDateTime1.equals(dateTime45));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(53);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime15 = property12.addToCopy(0);
        java.util.Locale.Builder builder16 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfMinute();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = localTime25.isSupported(durationFieldType26);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime31 = localTime25.withFieldAdded(durationFieldType29, 32772);
        org.joda.time.LocalTime.Property property32 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime34 = localTime25.minusMinutes(2922789);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Locale locale37 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet38 = locale37.getExtensionKeys();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.lang.String str41 = locale39.getDisplayScript(locale40);
        java.lang.String str42 = locale37.getDisplayScript(locale40);
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = locale37.getDisplayScript(locale43);
        java.lang.String str45 = locale36.getDisplayLanguage(locale43);
        java.lang.String str46 = dateTimeField23.getAsText((org.joda.time.ReadablePartial) localTime34, (int) ' ', locale36);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.years();
        java.lang.String str50 = durationFieldType49.toString();
        boolean boolean51 = localTime48.isSupported(durationFieldType49);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime54 = localTime48.withFieldAdded(durationFieldType52, 32772);
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.lang.String str57 = locale55.getDisplayScript(locale56);
        java.lang.String str58 = dateTimeField23.getAsShortText((org.joda.time.ReadablePartial) localTime54, locale56);
        java.util.Calendar.Builder builder59 = builder17.setLocale(locale56);
        java.util.Locale.Builder builder60 = builder16.setLocale(locale56);
        java.util.TimeZone timeZone62 = java.util.TimeZone.getTimeZone("years");
        boolean boolean63 = timeZone62.observesDaylightTime();
        java.util.Locale locale64 = java.util.Locale.UK;
        java.util.Locale locale65 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.lang.String str69 = locale67.getDisplayScript(locale68);
        java.lang.String str70 = locale65.getDisplayScript(locale68);
        java.util.Locale locale71 = java.util.Locale.UK;
        java.lang.String str72 = locale65.getDisplayScript(locale71);
        java.lang.String str73 = locale64.getDisplayLanguage(locale71);
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(timeZone62, locale64);
        java.util.Locale.Builder builder75 = builder16.setLocale(locale64);
        java.util.Locale.Builder builder77 = builder16.setRegion("100");
        java.util.Locale locale78 = builder77.build();
        java.util.Locale locale79 = builder77.build();
        java.util.Locale locale80 = java.util.Locale.KOREA;
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.lang.String str82 = locale80.getDisplayScript(locale81);
        java.util.Set<java.lang.String> strSet83 = locale80.getUnicodeLocaleKeys();
        java.lang.String str84 = locale80.getDisplayLanguage();
        java.lang.String str85 = locale79.getDisplayVariant(locale80);
        java.util.Set<java.lang.String> strSet86 = locale80.getUnicodeLocaleKeys();
        java.util.Locale locale87 = locale80.stripExtensions();
        boolean boolean88 = property12.equals((java.lang.Object) locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar74", (calendar0.compareTo(calendar74) == 0) == calendar0.equals(calendar74));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        int int4 = localDateTime3.getMinuteOfHour();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime12 = property9.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime14 = property9.setCopy(9);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime(dateTimeZone15);
        boolean boolean17 = localDateTime3.equals((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime19 = dateTime16.minusWeeks(1299587);
        org.joda.time.DateTime dateTime21 = dateTime19.withCenturyOfEra(13);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone24.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone24);
        java.lang.String str30 = dateTimeZone24.getNameKey(999L);
        org.joda.time.DateTime dateTime31 = dateTime19.withZone(dateTimeZone24);
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("years");
        boolean boolean34 = timeZone33.observesDaylightTime();
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.util.Locale locale42 = java.util.Locale.UK;
        java.lang.String str43 = locale36.getDisplayScript(locale42);
        java.lang.String str44 = locale35.getDisplayLanguage(locale42);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone33, locale35);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        timeZone33.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("-01:00");
        java.lang.String str54 = dateTimeZone50.getShortName((long) (-26494214), locale53);
        org.joda.time.DateTime dateTime55 = dateTime31.toDateTime(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar45", (calendar0.compareTo(calendar45) == 0) == calendar0.equals(calendar45));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getShortName((long) 963, locale13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate17 = localDate15.withYearOfEra((int) '4');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.minus(readablePeriod18);
        org.joda.time.LocalDate.Property property20 = localDate19.monthOfYear();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfCentury(59);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("years");
        boolean boolean25 = timeZone24.observesDaylightTime();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.lang.String str34 = locale27.getDisplayScript(locale33);
        java.lang.String str35 = locale26.getDisplayLanguage(locale33);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone24, locale26);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        int int39 = dateTimeZone37.getOffset((long) 53);
        org.joda.time.DateTime dateTime40 = localDate19.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = localDate41.toInterval(dateTimeZone42);
        org.joda.time.LocalDate localDate45 = localDate41.plusMonths(0);
        org.joda.time.LocalDate.Property property46 = localDate45.year();
        int int47 = localDate45.size();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        long long55 = dateTimeZone50.getMillisKeepLocal(dateTimeZone53, (long) 10);
        org.joda.time.DateTime dateTime56 = localDate45.toDateTimeAtMidnight(dateTimeZone53);
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale57.toLanguageTag();
        boolean boolean59 = localDate45.equals((java.lang.Object) str58);
        org.joda.time.LocalDate localDate61 = localDate45.minusWeeks(0);
        org.joda.time.Instant instant62 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime63 = instant62.toDateTime();
        org.joda.time.DateTime.Property property64 = dateTime63.minuteOfHour();
        org.joda.time.DateTime dateTime65 = dateTime63.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.Interval interval68 = localDate66.toInterval(dateTimeZone67);
        org.joda.time.LocalDate localDate70 = localDate66.plusMonths(0);
        org.joda.time.LocalDate.Property property71 = localDate70.year();
        int int72 = localDate70.size();
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.MutableDateTime mutableDateTime74 = new org.joda.time.MutableDateTime(dateTimeZone73);
        org.joda.time.DateTimeZone dateTimeZone75 = mutableDateTime74.getZone();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(dateTimeZone76);
        org.joda.time.DateTimeZone dateTimeZone78 = mutableDateTime77.getZone();
        long long80 = dateTimeZone75.getMillisKeepLocal(dateTimeZone78, (long) 10);
        org.joda.time.DateTime dateTime81 = localDate70.toDateTimeAtMidnight(dateTimeZone78);
        org.joda.time.DateTime dateTime82 = dateTime63.toDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime83 = localDate61.toDateTimeAtStartOfDay(dateTimeZone78);
        org.joda.time.DateMidnight dateMidnight84 = localDate19.toDateMidnight(dateTimeZone78);
        long long86 = dateTimeZone11.getMillisKeepLocal(dateTimeZone78, 26552802L);
        java.lang.String str87 = dateTimeZone11.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar36", (calendar9.compareTo(calendar36) == 0) == calendar9.equals(calendar36));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        java.util.Calendar.Builder builder58 = builder42.setLenient(true);
        java.util.Calendar.Builder builder60 = builder58.setInstant((long) 5047);
        java.util.Calendar.Builder builder61 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder66 = builder61.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone68 = java.util.TimeZone.getTimeZone("years");
        boolean boolean69 = timeZone68.observesDaylightTime();
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(timeZone68);
        java.util.Calendar.Builder builder71 = builder66.setTimeZone(timeZone68);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        timeZone68.setRawOffset(822);
        java.util.Calendar.Builder builder75 = builder60.setTimeZone(timeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar70", (calendar43.compareTo(calendar70) == 0) == calendar43.equals(calendar70));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone16.toString();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = dateTimeZone16.getName((long) 26487938, locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.lang.String str30 = locale9.getDisplayName(locale26);
        java.util.Calendar.Builder builder31 = builder5.setLocale(locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone33 = calendar32.getTimeZone();
        java.lang.String str34 = timeZone33.getID();
        java.util.Calendar.Builder builder35 = builder31.setTimeZone(timeZone33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone33, locale36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone33);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromCalendarFields(calendar38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = mutableDateTime45.getZone();
        long long48 = dateTimeZone43.getMillisKeepLocal(dateTimeZone46, (long) 10);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(10L, dateTimeZone43);
        boolean boolean51 = dateTimeZone43.isStandardOffset((long) 2922789);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withYear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.millisOfSecond();
        org.joda.time.DurationField durationField56 = property55.getDurationField();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.weekyear();
        boolean boolean59 = calendar38.before((java.lang.Object) localDateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar37", (calendar32.compareTo(calendar37) == 0) == calendar32.equals(calendar37));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        java.lang.String str5 = dateTimeFormatter2.print(1L);
        org.joda.time.Chronology chronology6 = dateTimeFormatter2.getChronology();
        boolean boolean7 = dateTimeFormatter2.isParser();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        boolean boolean10 = calendar8.isWeekDateSupported();
        calendar8.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        mutableDateTime14.setMinuteOfDay(100);
        boolean boolean17 = mutableDateTime14.isAfterNow();
        boolean boolean18 = mutableDateTime14.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime14.setZoneRetainFields(dateTimeZone21);
        boolean boolean23 = calendar8.before((java.lang.Object) dateTimeZone21);
        java.lang.String str25 = dateTimeZone21.getName((long) 32770);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withZone(dateTimeZone21);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.fromCalendarFields(calendar28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plusHours(2922789);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusYears(3);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMinutes((int) 'u');
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.monthOfYear();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.plusMonths(26500690);
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.parse("2022-02-22T07:22:01.394Z");
        org.joda.time.DateTime dateTime46 = dateTime44.plusSeconds((-30));
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.plus(readableDuration47);
        org.joda.time.DateTime dateTime49 = localDateTime37.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        int int50 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar28", (calendar8.compareTo(calendar28) == 0) == calendar8.equals(calendar28));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = property4.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime9 = property4.setCopy(9);
        org.joda.time.LocalDateTime localDateTime11 = property4.addToCopy(960);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYear(26507773);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str17 = dateTimeFieldType16.getName();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withField(dateTimeFieldType16, 26553928);
        int int20 = localDateTime19.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDurationAdded(readableDuration21, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withWeekyear(3600000);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now();
        boolean boolean27 = mutableDateTime26.isAfterNow();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale30 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withLocale(locale30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter31.withZone(dateTimeZone34);
        org.joda.time.Chronology chronology41 = dateTimeFormatter40.getChronology();
        java.lang.String str42 = mutableDateTime26.toString(dateTimeFormatter40);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.fromCalendarFields(calendar43);
        boolean boolean45 = calendar43.isWeekDateSupported();
        calendar43.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        mutableDateTime49.setMinuteOfDay(100);
        boolean boolean52 = mutableDateTime49.isAfterNow();
        boolean boolean53 = mutableDateTime49.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime49.setZoneRetainFields(dateTimeZone56);
        boolean boolean58 = calendar43.before((java.lang.Object) dateTimeZone56);
        int int60 = dateTimeZone56.getOffsetFromLocal(1645514504670L);
        mutableDateTime26.setZone(dateTimeZone56);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime26.dayOfYear();
        boolean boolean64 = mutableDateTime26.isAfter((long) 26706228);
        org.joda.time.DateTime dateTime65 = localDateTime23.toDateTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateMidnight dateMidnight66 = dateTime65.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar43", (calendar0.compareTo(calendar43) == 0) == calendar0.equals(calendar43));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime4.toGregorianCalendar();
        int int11 = mutableDateTime4.getDayOfMonth();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        boolean boolean14 = timeZone13.observesDaylightTime();
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale16.getDisplayScript(locale19);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale16.getDisplayScript(locale22);
        java.lang.String str24 = locale15.getDisplayLanguage(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone13, locale15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = localDate27.toInterval(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate27.plusMonths(0);
        org.joda.time.LocalDate.Property property32 = localDate31.year();
        int int33 = localDate31.size();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        long long41 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (long) 10);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfEra();
        org.joda.time.DateTime dateTime44 = property43.getDateTime();
        int int45 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = dateTime44.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property49 = dateTime47.property(dateTimeFieldType48);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone("years");
        boolean boolean52 = timeZone51.observesDaylightTime();
        java.util.Locale locale53 = java.util.Locale.UK;
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet55 = locale54.getExtensionKeys();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale56.getDisplayScript(locale57);
        java.lang.String str59 = locale54.getDisplayScript(locale57);
        java.util.Locale locale60 = java.util.Locale.UK;
        java.lang.String str61 = locale54.getDisplayScript(locale60);
        java.lang.String str62 = locale53.getDisplayLanguage(locale60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone51, locale53);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.LocalDate localDate65 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.Interval interval67 = localDate65.toInterval(dateTimeZone66);
        org.joda.time.LocalDate localDate69 = localDate65.plusMonths(0);
        org.joda.time.LocalDate.Property property70 = localDate69.year();
        int int71 = localDate69.size();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime73.getZone();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        long long79 = dateTimeZone74.getMillisKeepLocal(dateTimeZone77, (long) 10);
        org.joda.time.DateTime dateTime80 = localDate69.toDateTimeAtMidnight(dateTimeZone77);
        org.joda.time.DateTime.Property property81 = dateTime80.yearOfEra();
        org.joda.time.DateTime dateTime82 = property81.getDateTime();
        int int83 = dateTimeZone64.getOffset((org.joda.time.ReadableInstant) dateTime82);
        org.joda.time.DateTime dateTime85 = dateTime82.plusYears((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType86 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTime.Property property87 = dateTime85.property(dateTimeFieldType86);
        org.joda.time.DurationFieldType durationFieldType88 = dateTimeFieldType86.getRangeDurationType();
        java.lang.String str89 = durationFieldType88.getName();
        org.joda.time.DateTime dateTime91 = dateTime47.withFieldAdded(durationFieldType88, 26499102);
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) dateTime91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar10 and calendar25", (gregorianCalendar10.compareTo(calendar25) == 0) == gregorianCalendar10.equals(calendar25));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime11.year();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        boolean boolean17 = mutableDateTime15.isAfter((long) 22);
        boolean boolean19 = mutableDateTime15.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        mutableDateTime15.setZone(dateTimeZone22);
        mutableDateTime11.setZoneRetainFields(dateTimeZone22);
        org.joda.time.Chronology chronology25 = chronology3.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField26 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField27 = chronology3.weekyears();
        org.joda.time.DurationField durationField28 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField7, and durationField8", !(durationField28.compareTo(durationField7) == 0) || (Math.signum(durationField28.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.clear();
        calendar0.add(3, 26487938);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        boolean boolean10 = mutableDateTime8.isAfter((long) 22);
        boolean boolean12 = mutableDateTime8.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        mutableDateTime8.setZone(dateTimeZone15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.lang.String str21 = locale18.getDisplayScript();
        java.lang.String str22 = dateTimeZone15.getShortName((long) 13, locale18);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale18);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        java.util.Date date25 = calendar23.getTime();
        calendar0.setTime(date25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.Interval interval29 = localDate27.toInterval(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate27.plusMonths(0);
        org.joda.time.LocalDate.Property property32 = localDate31.weekOfWeekyear();
        java.lang.String str33 = property32.toString();
        org.joda.time.LocalDate localDate34 = property32.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property35 = localDate34.era();
        org.joda.time.LocalDate localDate36 = property35.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate38 = localDate36.minusWeeks(1434683);
        java.util.Date date39 = localDate38.toDate();
        boolean boolean40 = date25.after(date39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar23", (calendar0.compareTo(calendar23) == 0) == calendar0.equals(calendar23));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DurationField durationField14 = chronology11.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField14, and durationField13", !(durationField13.compareTo(durationField14) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField14.compareTo(durationField13))));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1L);
        int int8 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12, (int) (byte) 100);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.DateTime dateTime28 = localTime21.toDateTimeToday();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale33);
        java.lang.String str38 = localTime21.toString("2022-02-22", locale31);
        java.util.Locale locale39 = locale31.stripExtensions();
        java.lang.String str40 = dateTimeZone18.getShortName(0L, locale31);
        long long42 = dateTimeZone18.nextTransition(1645514565728399L);
        boolean boolean44 = dateTimeZone18.isStandardOffset((long) 82800);
        org.joda.time.DateTime dateTime45 = mutableDateTime1.toDateTime(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime50.secondOfMinute();
        int int55 = dateTimeFormatter48.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime50, "halfdays", 0);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.util.Calendar calendar57 = mutableDateTime50.toCalendar(locale56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        int int62 = dateTimeZone60.getStandardOffset(0L);
        long long64 = dateTimeZone60.nextTransition((long) '#');
        mutableDateTime50.setZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone68 = mutableDateTime67.getZone();
        int int70 = dateTimeZone68.getStandardOffset(0L);
        java.util.TimeZone timeZone71 = dateTimeZone68.toTimeZone();
        mutableDateTime50.setZoneRetainFields(dateTimeZone68);
        long long74 = dateTimeZone18.getMillisKeepLocal(dateTimeZone68, (long) 484);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime45", (mutableDateTime1.compareTo(dateTime45) == 0) == mutableDateTime1.equals(dateTime45));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        java.util.Date date8 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date9 = new java.util.Date();
        boolean boolean10 = date8.before(date9);
        calendar0.setTime(date9);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.plusSeconds((int) 'a');
        java.util.Date date21 = localDateTime20.toDate();
        boolean boolean22 = calendar0.before((java.lang.Object) localDateTime20);
        java.util.Date date23 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(110);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Date date27 = calendar0.getTime();
        int int28 = date27.getDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar12", (calendar0.compareTo(calendar12) == 0) == calendar0.equals(calendar12));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder8 = builder0.setTimeZone(timeZone7);
        int int10 = timeZone7.getOffset((long) 2000);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale11.getDisplayScript(locale17);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale17);
        java.util.TimeZone timeZone20 = calendar19.getTimeZone();
        boolean boolean21 = timeZone7.hasSameRules(timeZone20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromCalendarFields(calendar23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.era();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusSeconds((int) 'a');
        java.util.Date date32 = localDateTime31.toDate();
        int int33 = date32.getHours();
        int int34 = date32.getSeconds();
        java.util.Date date40 = new java.util.Date(26490127, 0, 26501188, 8, (int) (short) -1);
        int int41 = date40.getHours();
        long long42 = date40.getTime();
        java.lang.String str43 = date40.toGMTString();
        int int44 = date40.getHours();
        boolean boolean45 = date32.before(date40);
        calendar22.setTime(date32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar23", (calendar19.compareTo(calendar23) == 0) == calendar19.equals(calendar23));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale9.getDisplayCountry(locale11);
        java.lang.String str13 = locale7.getDisplayCountry(locale9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone16.toString();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = dateTimeZone16.getName((long) 26487938, locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.lang.String str30 = locale9.getDisplayName(locale26);
        java.util.Calendar.Builder builder31 = builder5.setLocale(locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone33 = calendar32.getTimeZone();
        java.lang.String str34 = timeZone33.getID();
        java.util.Calendar.Builder builder35 = builder31.setTimeZone(timeZone33);
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone33, locale36);
        boolean boolean38 = timeZone33.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar37", (calendar32.compareTo(calendar37) == 0) == calendar32.equals(calendar37));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant2.toMutableDateTimeISO();
        org.joda.time.Instant instant12 = instant2.withDurationAdded((long) 26496335, 53);
        org.joda.time.Chronology chronology13 = instant2.getChronology();
        org.joda.time.Instant instant15 = instant2.plus(1645514501926L);
        org.joda.time.Instant instant17 = instant2.plus((long) 51);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, 912);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.minus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        mutableDateTime13.add(readablePeriod15, (int) (byte) 100);
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.DateTime dateTime20 = dateTime1.plus((long) 2100);
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra(26572);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.DateTime dateTime3 = instant0.toDateTimeISO();
        boolean boolean4 = instant0.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.era();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.year();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 22);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        mutableDateTime6.setZoneRetainFields(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        mutableDateTime6.add(durationFieldType20, 20);
        int int23 = mutableDateTime6.getWeekOfWeekyear();
        boolean boolean24 = mutableDateTime6.isAfterNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType25.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.hourOfDay();
        org.joda.time.DurationField durationField32 = chronology28.weeks();
        org.joda.time.DurationField durationField33 = chronology28.days();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.era();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.year();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        boolean boolean42 = mutableDateTime40.isAfter((long) 22);
        boolean boolean44 = mutableDateTime40.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        mutableDateTime40.setZone(dateTimeZone47);
        mutableDateTime36.setZoneRetainFields(dateTimeZone47);
        org.joda.time.Chronology chronology50 = chronology28.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField51 = chronology28.months();
        org.joda.time.DurationField durationField52 = chronology28.months();
        mutableDateTime6.setChronology(chronology28);
        org.joda.time.DateTime dateTime54 = instant0.toDateTime(chronology28);
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.now(chronology28);
        org.joda.time.DateTimeZone dateTimeZone56 = chronology28.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) mutableDateTime1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str6 = dateTimeFieldType5.toString();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        java.lang.String str15 = durationFieldType12.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType16.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        boolean boolean23 = durationFieldType12.isSupported(chronology19);
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType5.getField(chronology19);
        boolean boolean25 = instant4.isSupported(dateTimeFieldType5);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant4.plus(readableDuration26);
        org.joda.time.MutableDateTime mutableDateTime28 = instant4.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime33);
        int int36 = dateTimeZone15.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        mutableDateTime41.setMinuteOfDay(100);
        boolean boolean44 = mutableDateTime41.isAfterNow();
        mutableDateTime41.add((long) 'a');
        boolean boolean47 = mutableDateTime41.isAfterNow();
        mutableDateTime41.addDays(1296994);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.DateTime dateTime53 = org.joda.time.DateTime.now(dateTimeZone52);
        int int55 = dateTimeZone52.getOffsetFromLocal((long) (byte) -1);
        long long57 = dateTimeZone52.previousTransition((long) 1);
        java.lang.String str59 = dateTimeZone52.getNameKey((long) 14);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone52);
        mutableDateTime41.setZone(dateTimeZone52);
        long long64 = dateTimeZone52.convertLocalToUTC((long) 43, false);
        long long67 = dateTimeZone52.convertLocalToUTC(0L, true);
        org.joda.time.LocalDate localDate68 = org.joda.time.LocalDate.now(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime39, dateTimeZone52);
        int int70 = mutableDateTime39.getYearOfCentury();
        mutableDateTime39.addDays(26599355);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime37", (mutableDateTime24.compareTo(dateTime37) == 0) == mutableDateTime24.equals(dateTime37));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        int int9 = calendar8.getWeekYear();
        calendar8.set(26500802, 2122, 70, 17, 1313390);
        calendar8.setMinimalDaysInFirstWeek(26523268);
        java.time.Instant instant18 = calendar8.toInstant();
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime20.plus(readablePeriod23);
        int int25 = dateTime20.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.era();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        int int30 = localDate29.getDayOfMonth();
        org.joda.time.LocalDate localDate32 = localDate29.plusYears((int) (byte) 100);
        org.joda.time.Interval interval33 = localDate32.toInterval();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        long long41 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (long) 10);
        java.lang.String str42 = dateTimeZone36.toString();
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime44 = mutableDateTime27.toMutableDateTime(dateTimeZone36);
        java.lang.String str45 = mutableDateTime44.toString();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime44.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime48.secondOfMinute();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime48.secondOfMinute();
        org.joda.time.Chronology chronology52 = mutableDateTime48.getChronology();
        mutableDateTime44.setChronology(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.yearOfCentury();
        org.joda.time.DateTime dateTime56 = dateTime20.toDateTime(chronology52);
        boolean boolean57 = calendar8.equals((java.lang.Object) chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime20", (instant19.compareTo(dateTime20) == 0) == instant19.equals(dateTime20));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-10-04T09:22:32.535Z");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        long long6 = dateTimeZone4.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField15 = chronology11.weeks();
        org.joda.time.DurationField durationField16 = chronology11.days();
        mutableDateTime7.setChronology(chronology11);
        mutableDateTime1.setChronology(chronology11);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology11.add(readablePeriod19, (long) 2122, 53368391);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime7", (mutableDateTime3.compareTo(mutableDateTime7) == 0) == mutableDateTime3.equals(mutableDateTime7));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6, 10);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime12 = localTime6.withFieldAdded(durationFieldType10, 32772);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime15 = localTime6.minusMinutes(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean17 = localTime6.isSupported(dateTimeFieldType16);
        boolean boolean18 = localTime4.isSupported(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.era();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.year();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((java.lang.Object) mutableDateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str25 = dateTimeFieldType24.toString();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        java.lang.String str29 = durationFieldType28.toString();
        boolean boolean30 = localTime27.isSupported(durationFieldType28);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime33 = localTime27.withFieldAdded(durationFieldType31, 32772);
        java.lang.String str34 = durationFieldType31.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType35.getField(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.hourOfDay();
        boolean boolean42 = durationFieldType31.isSupported(chronology38);
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType24.getField(chronology38);
        boolean boolean44 = instant23.isSupported(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property45 = localTime4.property(dateTimeFieldType24);
        org.joda.time.LocalTime localTime47 = localTime2.withField(dateTimeFieldType24, 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType48.getDurationType();
        boolean boolean51 = localTime2.isSupported(durationFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant23", (mutableDateTime20.compareTo(instant23) == 0) == mutableDateTime20.equals(instant23));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        mutableDateTime3.setZone(dateTimeZone5);
        mutableDateTime3.setMillisOfDay(17);
        org.joda.time.Instant instant9 = mutableDateTime3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 26738247);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant9.minus(readableDuration14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant15", (mutableDateTime1.compareTo(instant15) == 0) == mutableDateTime1.equals(instant15));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay((int) (byte) 10, (int) '#', 9);
        java.util.Calendar.Builder builder14 = builder10.setDate((-3600000), 26499102, 190);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("years");
        boolean boolean17 = timeZone16.observesDaylightTime();
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale19.getDisplayScript(locale25);
        java.lang.String str27 = locale18.getDisplayLanguage(locale25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone16, locale18);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        int int30 = timeZone16.getRawOffset();
        timeZone16.setID("2022-02-22T07:23:37.988Z");
        java.util.Calendar.Builder builder33 = builder14.setTimeZone(timeZone16);
        java.util.Locale locale34 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromCalendarFields(calendar35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField40 = property39.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = dateTimeField40.getType();
        int int42 = dateTimeField40.getMinimumValue();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.Instant instant45 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology46 = instant45.getChronology();
        int int47 = dateTime43.compareTo((org.joda.time.ReadableInstant) instant45);
        org.joda.time.DateTime dateTime49 = dateTime43.minusMillis(20);
        org.joda.time.DateTime dateTime51 = dateTime49.minus((long) 48);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.fromCalendarFields(calendar52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minus(readablePeriod54);
        int int56 = localDateTime55.getDayOfYear();
        org.joda.time.LocalDateTime.Property property57 = localDateTime55.secondOfMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale59 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withLocale(locale59);
        java.lang.String str61 = property57.getAsShortText(locale59);
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Locale locale63 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet64 = locale63.getExtensionKeys();
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.lang.String str67 = locale65.getDisplayScript(locale66);
        java.lang.String str68 = locale63.getDisplayScript(locale66);
        java.util.Locale locale69 = java.util.Locale.UK;
        java.lang.String str70 = locale63.getDisplayScript(locale69);
        java.lang.String str71 = locale62.getDisplayLanguage(locale69);
        java.lang.String str72 = locale62.getDisplayCountry();
        java.lang.String str73 = locale62.getDisplayName();
        int int74 = property57.getMaximumShortTextLength(locale62);
        java.util.Calendar calendar75 = dateTime51.toCalendar(locale62);
        int int76 = dateTimeField40.getMaximumShortTextLength(locale62);
        java.lang.String str77 = locale34.getDisplayLanguage(locale62);
        java.lang.String str78 = timeZone16.getDisplayName(locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar35", (calendar28.compareTo(calendar35) == 0) == calendar28.equals(calendar35));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = dateTime25.plusMillis(10);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfHalfday();
        org.joda.time.DateTime dateTime35 = dateTime28.withChronology(chronology32);
        org.joda.time.Instant instant36 = dateTime28.toInstant();
        org.joda.time.Chronology chronology37 = instant36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.era();
        org.joda.time.DurationField durationField39 = chronology37.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone16);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear(445);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.DateTime dateTime3 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.set("21");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        long long4 = dateTimeZone2.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.hourOfDay();
        org.joda.time.DurationField durationField13 = chronology9.weeks();
        org.joda.time.DurationField durationField14 = chronology9.days();
        mutableDateTime5.setChronology(chronology9);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime5.minuteOfDay();
        java.lang.String str17 = property16.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime5", (mutableDateTime1.compareTo(mutableDateTime5) == 0) == mutableDateTime1.equals(mutableDateTime5));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        long long10 = dateTimeZone5.getMillisKeepLocal(dateTimeZone8, (long) 10);
        java.lang.String str11 = dateTimeZone5.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime13 = instant2.toDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        boolean boolean16 = dateTimeZone14.isStandardOffset((long) 32770);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now(dateTimeZone14);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = localTime19.isSupported(durationFieldType20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime25 = localTime19.withFieldAdded(durationFieldType23, 32772);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalTime localTime29 = property26.addCopy(19);
        org.joda.time.LocalTime localTime30 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property26.addCopy((int) '4');
        java.lang.String str33 = property26.getAsText();
        java.util.Locale locale34 = java.util.Locale.ITALY;
        java.lang.String str35 = property26.getAsText(locale34);
        boolean boolean36 = dateTimeZone14.equals((java.lang.Object) property26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime4", (instant0.compareTo(mutableDateTime4) == 0) == instant0.equals(mutableDateTime4));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime26 = property23.addToCopy(26540968);
        java.util.Date date27 = localDateTime26.toDate();
        boolean boolean28 = timeZone1.inDaylightTime(date27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar19", (calendar13.compareTo(calendar19) == 0) == calendar13.equals(calendar19));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) (short) 100);
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) instant15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant15);
        mutableDateTime1.setWeekyear(26650391);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant15", (mutableDateTime4.compareTo(instant15) == 0) == mutableDateTime4.equals(instant15));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, 26596200);
        int int7 = dateTime6.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime6", (instant0.compareTo(dateTime6) == 0) == instant0.equals(dateTime6));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant0.plus((long) 12);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant4.plus(readableDuration6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime5", (instant9.compareTo(mutableDateTime5) == 0) == instant9.equals(mutableDateTime5));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant6.withDurationAdded(readableDuration11, 20);
        long long14 = instant6.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime10", (instant6.compareTo(dateTime10) == 0) == instant6.equals(dateTime10));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths(0);
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        int int11 = localDate9.size();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        org.joda.time.DateTime dateTime20 = localDate9.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        int int23 = localDate0.get(dateTimeFieldType21);
        org.joda.time.LocalDate.Property property24 = localDate0.dayOfMonth();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("hi!");
        int int27 = property24.getMaximumTextLength(locale26);
        org.joda.time.DateTimeField dateTimeField28 = property24.getField();
        org.joda.time.LocalDate localDate29 = property24.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate31 = localDate29.plusWeeks((-1));
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("years");
        boolean boolean34 = timeZone33.observesDaylightTime();
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.util.Locale locale42 = java.util.Locale.UK;
        java.lang.String str43 = locale36.getDisplayScript(locale42);
        java.lang.String str44 = locale35.getDisplayLanguage(locale42);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone33, locale35);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        int int48 = dateTimeZone46.getOffset((long) 53);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone46);
        java.lang.String str51 = dateTimeZone46.getNameKey(1645514507123L);
        org.joda.time.Interval interval52 = localDate29.toInterval(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and dateTime49", (mutableDateTime13.compareTo(dateTime49) == 0) == mutableDateTime13.equals(dateTime49));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        mutableDateTime1.addMillis(10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.secondOfMinute();
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder18 = builder13.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("years");
        boolean boolean21 = timeZone20.observesDaylightTime();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone20);
        java.util.Calendar.Builder builder23 = builder18.setTimeZone(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        mutableDateTime1.setZoneRetainFields(dateTimeZone24);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("years");
        boolean boolean29 = timeZone28.observesDaylightTime();
        java.util.Locale locale30 = java.util.Locale.UK;
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale33.getDisplayScript(locale34);
        java.lang.String str36 = locale31.getDisplayScript(locale34);
        java.util.Locale locale37 = java.util.Locale.UK;
        java.lang.String str38 = locale31.getDisplayScript(locale37);
        java.lang.String str39 = locale30.getDisplayLanguage(locale37);
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone28, locale30);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = localDate42.toInterval(dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate42.plusMonths(0);
        org.joda.time.LocalDate.Property property47 = localDate46.year();
        int int48 = localDate46.size();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = mutableDateTime50.getZone();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        long long56 = dateTimeZone51.getMillisKeepLocal(dateTimeZone54, (long) 10);
        org.joda.time.DateTime dateTime57 = localDate46.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfEra();
        org.joda.time.DateTime dateTime59 = property58.getDateTime();
        int int60 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime59);
        int int62 = dateTimeZone41.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        mutableDateTime1.setZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar40", (calendar22.compareTo(calendar40) == 0) == calendar22.equals(calendar40));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        long long10 = chronology3.add((long) (byte) 0, (long) 12, 26494213);
        org.joda.time.DurationField durationField11 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = chronology3.era();
        org.joda.time.DurationField durationField14 = dateTimeField13.getDurationField();
        java.util.Locale locale16 = java.util.Locale.TAIWAN;
        java.util.Locale.setDefault(locale16);
        java.lang.String str18 = dateTimeField13.getAsShortText(0L, locale16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField14", Math.signum(durationField11.compareTo(durationField14)) == -Math.signum(durationField14.compareTo(durationField11)));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        long long10 = dateTimeZone5.getMillisKeepLocal(dateTimeZone8, (long) 10);
        java.lang.String str11 = dateTimeZone5.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime13 = instant2.toDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType20.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.secondOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.hourOfDay();
        org.joda.time.DurationField durationField27 = chronology23.weeks();
        org.joda.time.DurationField durationField28 = chronology23.days();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.era();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.year();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        boolean boolean37 = mutableDateTime35.isAfter((long) 22);
        boolean boolean39 = mutableDateTime35.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        mutableDateTime35.setZone(dateTimeZone42);
        mutableDateTime31.setZoneRetainFields(dateTimeZone42);
        org.joda.time.Chronology chronology45 = chronology23.withZone(dateTimeZone42);
        long long47 = dateTimeZone42.convertUTCToLocal(1645514507224L);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(0L, dateTimeZone42);
        java.util.TimeZone timeZone49 = dateTimeZone42.toTimeZone();
        org.joda.time.DateTime dateTime50 = dateTime13.withZoneRetainFields(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime18", (instant2.compareTo(mutableDateTime18) == 0) == instant2.equals(mutableDateTime18));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone7 = calendar6.getTimeZone();
        java.lang.String str8 = timeZone7.getID();
        calendar4.setTimeZone(timeZone7);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet11 = locale10.getUnicodeLocaleKeys();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone7, locale10);
        timeZone7.setRawOffset(53180448);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        int int22 = localDate21.getDayOfMonth();
        org.joda.time.LocalDate localDate24 = localDate21.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime25 = localDate21.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.Interval interval28 = localDate26.toInterval(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate26.plusMonths(0);
        org.joda.time.LocalDate.Property property31 = localDate30.year();
        int int32 = localDate30.size();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property43 = dateTime41.property(dateTimeFieldType42);
        int int44 = localDate21.get(dateTimeFieldType42);
        org.joda.time.LocalDate.Property property45 = localDate21.dayOfMonth();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        int int48 = property45.getMaximumTextLength(locale47);
        java.lang.String str49 = property20.getAsShortText(locale47);
        java.util.Locale locale50 = locale47.stripExtensions();
        java.lang.String str51 = locale47.toLanguageTag();
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone7, locale47);
        java.util.Locale locale53 = locale47.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar52", (calendar6.compareTo(calendar52) == 0) == calendar6.equals(calendar52));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        boolean boolean7 = localDateTime5.equals((java.lang.Object) (byte) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.weekOfWeekyear();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("years");
        boolean boolean11 = timeZone10.observesDaylightTime();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale12);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        timeZone10.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("-01:00");
        java.lang.String str31 = dateTimeZone27.getShortName((long) (-26494214), locale30);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTime dateTime33 = localDateTime5.toDateTime(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar22", (calendar0.compareTo(calendar22) == 0) == calendar0.equals(calendar22));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean7 = mutableDateTime1.isSupported(dateTimeFieldType6);
        mutableDateTime1.setMillisOfDay((int) (byte) 1);
        java.util.GregorianCalendar gregorianCalendar10 = mutableDateTime1.toGregorianCalendar();
        java.util.TimeZone timeZone11 = gregorianCalendar10.getTimeZone();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        int int15 = timeZone13.getOffset((long) 19);
        boolean boolean16 = timeZone13.observesDaylightTime();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder17.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("years");
        boolean boolean25 = timeZone24.observesDaylightTime();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone24);
        java.util.Calendar.Builder builder27 = builder22.setTimeZone(timeZone24);
        timeZone24.setID("+22:01");
        timeZone24.setID("2022-02-22T07:22:17.526Z");
        boolean boolean32 = timeZone13.hasSameRules(timeZone24);
        gregorianCalendar10.setTimeZone(timeZone13);
        java.util.Calendar.Builder builder34 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType35.getField(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.secondOfMinute();
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        java.lang.String str44 = durationFieldType43.toString();
        boolean boolean45 = localTime42.isSupported(durationFieldType43);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime48 = localTime42.withFieldAdded(durationFieldType46, 32772);
        org.joda.time.LocalTime.Property property49 = localTime42.hourOfDay();
        org.joda.time.LocalTime localTime51 = localTime42.minusMinutes(2922789);
        java.util.Locale locale53 = java.util.Locale.UK;
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet55 = locale54.getExtensionKeys();
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.lang.String str58 = locale56.getDisplayScript(locale57);
        java.lang.String str59 = locale54.getDisplayScript(locale57);
        java.util.Locale locale60 = java.util.Locale.UK;
        java.lang.String str61 = locale54.getDisplayScript(locale60);
        java.lang.String str62 = locale53.getDisplayLanguage(locale60);
        java.lang.String str63 = dateTimeField40.getAsText((org.joda.time.ReadablePartial) localTime51, (int) ' ', locale53);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.years();
        java.lang.String str67 = durationFieldType66.toString();
        boolean boolean68 = localTime65.isSupported(durationFieldType66);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime71 = localTime65.withFieldAdded(durationFieldType69, 32772);
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.lang.String str74 = locale72.getDisplayScript(locale73);
        java.lang.String str75 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localTime71, locale73);
        java.util.Calendar.Builder builder76 = builder34.setLocale(locale73);
        java.util.Calendar calendar77 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone78 = calendar77.getTimeZone();
        java.util.Calendar.Builder builder79 = builder76.setTimeZone(timeZone78);
        java.util.Date date85 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date86 = new java.util.Date();
        boolean boolean87 = date85.before(date86);
        date86.setSeconds(26490127);
        java.util.Calendar.Builder builder90 = builder76.setInstant(date86);
        date86.setSeconds(5);
        boolean boolean93 = timeZone13.inDaylightTime(date86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar77", (calendar26.compareTo(calendar77) == 0) == calendar26.equals(calendar77));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder8 = builder0.setTimeZone(timeZone7);
        int int10 = timeZone7.getOffset((long) 2000);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.lang.String str16 = locale11.getDisplayScript(locale14);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale11.getDisplayScript(locale17);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone7, locale11);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar19);
        int int21 = localDateTime20.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(912);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.withYearOfEra(1530);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = property30.setCopy(19);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.fromCalendarFields(calendar33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) ' ');
        int int37 = localDateTime34.getMillisOfDay();
        int int38 = localDateTime32.compareTo((org.joda.time.ReadablePartial) localDateTime34);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withDayOfMonth(3);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime34.minusMillis(26496335);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime34.minusMinutes(20);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime34.withYearOfEra(26523268);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime51 = property50.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.minusWeeks(26544894);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.fromCalendarFields(calendar54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withPeriodAdded(readablePeriod59, (int) (short) 100);
        int int62 = localDateTime57.size();
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime57);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime57.minusSeconds(26569262);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.fromCalendarFields(calendar66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime69.plusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean74 = localDateTime72.isSupported(dateTimeFieldType73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime57.withField(dateTimeFieldType73, 995);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime51.withField(dateTimeFieldType73, 49);
        int int79 = localDateTime25.get(dateTimeFieldType73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar26", (calendar19.compareTo(calendar26) == 0) == calendar19.equals(calendar26));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        int int8 = dateTimeZone6.getOffset((long) 26512348);
        mutableDateTime1.setZoneRetainFields(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        boolean boolean20 = dateTimeZone17.isFixed();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 2, dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC(0L, false);
        long long26 = dateTimeZone17.nextTransition(26500734L);
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime1.toMutableDateTime(dateTimeZone17);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime27", (mutableDateTime1.compareTo(mutableDateTime27) == 0) == mutableDateTime1.equals(mutableDateTime27));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int2 = calendar0.getFirstDayOfWeek();
        calendar0.setFirstDayOfWeek(960);
        calendar0.clear();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar calendar10 = builder9.build();
        java.util.Calendar.Builder builder15 = builder9.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar calendar16 = builder15.build();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("years");
        boolean boolean21 = timeZone20.observesDaylightTime();
        boolean boolean22 = timeZone18.hasSameRules(timeZone20);
        java.util.Calendar.Builder builder23 = builder15.setTimeZone(timeZone18);
        calendar6.setTimeZone(timeZone18);
        boolean boolean25 = timeZone18.observesDaylightTime();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18);
        calendar0.setTimeZone(timeZone18);
        timeZone18.setID("\ub144\uc6d4\uc77c\ubaa9\uc624\uc804\uc2dc\ubd84\ucd08");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar10", (calendar0.compareTo(calendar10) == 0) == calendar0.equals(calendar10));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusHours(2922789);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusDays((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMinutes(190);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(1L);
        int int15 = mutableDateTime14.getCenturyOfEra();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Calendar calendar17 = mutableDateTime14.toCalendar(locale16);
        calendar17.add((int) (short) 10, 12);
        calendar17.set(26549063, 0, 26553846, 26565652, 26522820, 0);
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone31 = java.util.TimeZone.getTimeZone("years");
        boolean boolean32 = timeZone31.observesDaylightTime();
        boolean boolean33 = timeZone29.hasSameRules(timeZone31);
        java.util.Locale locale34 = java.util.Locale.UK;
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.lang.String str40 = locale35.getDisplayScript(locale38);
        java.util.Locale locale41 = java.util.Locale.UK;
        java.lang.String str42 = locale35.getDisplayScript(locale41);
        java.lang.String str43 = locale34.getDisplayLanguage(locale41);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(timeZone29, locale41);
        calendar17.setTimeZone(timeZone29);
        java.util.TimeZone timeZone46 = calendar17.getTimeZone();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        int int48 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar44", (calendar0.compareTo(calendar44) == 0) == calendar0.equals(calendar44));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        java.time.ZoneId zoneId19 = timeZone1.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.plusMonths(0);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        int int27 = localDate25.size();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property38 = dateTime36.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale40.getDisplayScript(locale46);
        java.lang.String str48 = locale39.getDisplayLanguage(locale46);
        java.util.Locale.setDefault(locale39);
        boolean boolean50 = locale39.hasExtensions();
        java.lang.String str51 = locale39.getScript();
        java.util.Set<java.lang.String> strSet52 = locale39.getUnicodeLocaleKeys();
        int int53 = property38.getMaximumTextLength(locale39);
        java.lang.String str54 = locale39.getLanguage();
        java.util.Locale.setDefault(locale39);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone20, locale39);
        java.lang.String str57 = locale39.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar56", (calendar13.compareTo(calendar56) == 0) == calendar13.equals(calendar56));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        int int4 = dateTime0.compareTo((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusMillis(20);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 48);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime6.toMutableDateTime(chronology12);
        org.joda.time.DurationField durationField20 = chronology12.eras();
        org.joda.time.DurationField durationField21 = chronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar calendar7 = builder0.build();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        org.joda.time.DurationField durationField16 = chronology12.weeks();
        org.joda.time.DurationField durationField17 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.era();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.year();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        boolean boolean26 = mutableDateTime24.isAfter((long) 22);
        boolean boolean28 = mutableDateTime24.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        mutableDateTime24.setZone(dateTimeZone31);
        mutableDateTime20.setZoneRetainFields(dateTimeZone31);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone31);
        long long36 = dateTimeZone31.convertUTCToLocal(1645514507224L);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(0L, dateTimeZone31);
        java.util.TimeZone timeZone38 = dateTimeZone31.toTimeZone();
        java.util.Calendar.Builder builder39 = builder0.setTimeZone(timeZone38);
        java.util.Calendar calendar40 = builder39.build();
        java.util.Calendar.Builder builder41 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder46 = builder41.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale50.toLanguageTag();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale50.getDisplayCountry(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale50);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        long long62 = dateTimeZone57.getMillisKeepLocal(dateTimeZone60, (long) 10);
        java.lang.String str63 = dateTimeZone57.toString();
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale65.toLanguageTag();
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.lang.String str68 = locale65.getDisplayCountry(locale67);
        java.lang.String str69 = dateTimeZone57.getName((long) 26487938, locale67);
        java.lang.String str70 = locale67.getDisplayLanguage();
        java.lang.String str71 = locale50.getDisplayName(locale67);
        java.util.Calendar.Builder builder72 = builder46.setLocale(locale67);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone74 = calendar73.getTimeZone();
        java.lang.String str75 = timeZone74.getID();
        java.util.Calendar.Builder builder76 = builder72.setTimeZone(timeZone74);
        boolean boolean77 = timeZone74.observesDaylightTime();
        java.util.Calendar.Builder builder78 = builder39.setTimeZone(timeZone74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar40", (calendar7.compareTo(calendar40) == 0) == calendar7.equals(calendar40));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("2022-03-13T07:23:32.929Z");
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale17.getDisplayScript(locale20);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.lang.String str24 = locale17.getDisplayScript(locale23);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale23);
        java.util.TimeZone timeZone26 = calendar25.getTimeZone();
        int int28 = timeZone26.getOffset(1645488000100L);
        int int29 = timeZone26.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        timeZone26.setID("2022-02-22T00:00:00.000Z");
        boolean boolean33 = timeZone16.hasSameRules(timeZone26);
        boolean boolean34 = timeZone7.hasSameRules(timeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar25", (calendar9.compareTo(calendar25) == 0) == calendar9.equals(calendar25));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        int int4 = dateTime0.compareTo((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusMillis(20);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        int int8 = localDate7.getDayOfMonth();
        org.joda.time.LocalDate localDate10 = localDate7.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        boolean boolean14 = mutableDateTime12.isAfter((long) 22);
        boolean boolean16 = mutableDateTime12.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        mutableDateTime12.setZone(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDate7.toDateTimeAtStartOfDay(dateTimeZone19);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str25 = dateTimeZone19.getName((long) 912, locale23);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime6.toMutableDateTime(dateTimeZone19);
        java.util.TimeZone timeZone28 = dateTimeZone19.toTimeZone();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone28);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.Interval interval32 = localDate30.toInterval(dateTimeZone31);
        org.joda.time.LocalDate localDate34 = localDate30.plusMonths(0);
        org.joda.time.LocalDate.Property property35 = localDate34.year();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        long long43 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 10);
        org.joda.time.DateMidnight dateMidnight44 = localDate34.toDateMidnight(dateTimeZone38);
        java.util.Locale locale49 = new java.util.Locale("2022-10-04T07:23:10.577", "\uc624\uc804 7:21", "\uc624\uc804 6:23:20");
        java.lang.String str50 = dateTimeZone38.getName(53093743L, locale49);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale49);
        java.lang.String str52 = timeZone28.getDisplayName(locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar51", (calendar29.compareTo(calendar51) == 0) == calendar29.equals(calendar51));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) 2922789);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone3);
        java.lang.String str13 = localTime12.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.millisOfDay();
        java.lang.String str18 = mutableDateTime15.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.hourOfDay();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime15.weekOfWeekyear();
        boolean boolean21 = localTime12.equals((java.lang.Object) mutableDateTime15);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology32 = localDateTime29.getChronology();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getRangeDurationType();
        boolean boolean36 = instant33.isSupported(dateTimeFieldType34);
        org.joda.time.LocalDateTime.Property property37 = localDateTime29.property(dateTimeFieldType34);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime15.property(dateTimeFieldType34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant33", (mutableDateTime2.compareTo(instant33) == 0) == mutableDateTime2.equals(instant33));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.setMillis((long) 26504717);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime1.copy();
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, (int) (short) 0);
        boolean boolean17 = instant12.isBefore((long) 5);
        java.util.Date date18 = instant12.toDate();
        org.joda.time.Instant instant20 = instant12.withMillis(117L);
        org.joda.time.DateTime dateTime21 = instant12.toDateTimeISO();
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTime dateTime23 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime25 = dateTime21.withYear(26490553);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant12", (mutableDateTime9.compareTo(instant12) == 0) == mutableDateTime9.equals(instant12));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        java.lang.String str8 = durationFieldType5.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        boolean boolean16 = durationFieldType5.isSupported(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType17.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.hourOfDay();
        org.joda.time.DurationField durationField24 = chronology20.weeks();
        org.joda.time.DurationField durationField25 = chronology20.days();
        boolean boolean26 = durationFieldType5.isSupported(chronology20);
        org.joda.time.DurationField durationField27 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField28 = chronology20.weekOfWeekyear();
        long long31 = dateTimeField28.getDifferenceAsLong((long) 912, 1312348L);
        int int32 = dateTimeField28.getMaximumValue();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.years();
        java.lang.String str38 = durationFieldType37.toString();
        boolean boolean39 = localTime36.isSupported(durationFieldType37);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime42 = localTime36.withFieldAdded(durationFieldType40, 32772);
        org.joda.time.LocalTime.Property property43 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime45 = localTime36.minusMinutes(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean47 = localTime36.isSupported(dateTimeFieldType46);
        boolean boolean48 = localTime34.isSupported(dateTimeFieldType46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(dateTimeZone49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.era();
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime50.year();
        org.joda.time.Instant instant53 = new org.joda.time.Instant((java.lang.Object) mutableDateTime50);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str55 = dateTimeFieldType54.toString();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.years();
        java.lang.String str59 = durationFieldType58.toString();
        boolean boolean60 = localTime57.isSupported(durationFieldType58);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime63 = localTime57.withFieldAdded(durationFieldType61, 32772);
        java.lang.String str64 = durationFieldType61.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime67 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology68 = localTime67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType65.getField(chronology68);
        org.joda.time.DateTimeField dateTimeField70 = chronology68.secondOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology68.hourOfDay();
        boolean boolean72 = durationFieldType61.isSupported(chronology68);
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType54.getField(chronology68);
        boolean boolean74 = instant53.isSupported(dateTimeFieldType54);
        org.joda.time.LocalTime.Property property75 = localTime34.property(dateTimeFieldType54);
        org.joda.time.LocalTime localTime76 = property75.roundHalfEvenCopy();
        int int77 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) localTime76);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.dayOfWeek();
        java.lang.String str79 = dateTimeFieldType78.getName();
        boolean boolean80 = localTime76.isSupported(dateTimeFieldType78);
        org.joda.time.DurationFieldType durationFieldType81 = dateTimeFieldType78.getRangeDurationType();
        java.lang.String str82 = durationFieldType81.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime50 and instant53", (mutableDateTime50.compareTo(instant53) == 0) == mutableDateTime50.equals(instant53));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.Instant instant9 = instant2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant9", (mutableDateTime1.compareTo(instant9) == 0) == mutableDateTime1.equals(instant9));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.add(4012L);
        org.joda.time.MutableDateTime mutableDateTime7 = property2.add((long) 7);
        org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant8", (mutableDateTime7.compareTo(instant8) == 0) == mutableDateTime7.equals(instant8));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) (short) 100);
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = instant8.toMutableDateTimeISO();
        org.joda.time.Instant instant18 = instant8.withDurationAdded((long) 26496335, 53);
        org.joda.time.Chronology chronology19 = instant8.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) calendar4, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.DurationField durationField22 = chronology19.weeks();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology19.add(readablePeriod23, 1645514526993L, 26742153);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant8", (mutableDateTime7.compareTo(instant8) == 0) == mutableDateTime7.equals(instant8));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) (short) 100);
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = instant8.toMutableDateTimeISO();
        org.joda.time.Instant instant18 = instant8.withDurationAdded((long) 26496335, 53);
        org.joda.time.Chronology chronology19 = instant8.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) calendar4, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.weekyear();
        int int23 = mutableDateTime21.getWeekyear();
        mutableDateTime21.addMinutes(26642511);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant8", (mutableDateTime7.compareTo(instant8) == 0) == mutableDateTime7.equals(instant8));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.plusYears(26494213);
        org.joda.time.DateTime.Property property29 = dateTime25.millisOfSecond();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.DateTime dateTime31 = property29.roundHalfCeilingCopy();
        java.util.Locale locale35 = new java.util.Locale("8", "3", "04:00:00.100");
        java.util.Calendar calendar36 = dateTime31.toCalendar(locale35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.years();
        java.lang.String str40 = durationFieldType39.toString();
        boolean boolean41 = localTime38.isSupported(durationFieldType39);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime44 = localTime38.withFieldAdded(durationFieldType42, 32772);
        org.joda.time.LocalTime.Property property45 = localTime38.hourOfDay();
        org.joda.time.LocalTime localTime46 = property45.roundCeilingCopy();
        org.joda.time.LocalTime localTime48 = localTime46.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalTime localTime52 = localTime48.withPeriodAdded(readablePeriod50, 32772);
        org.joda.time.LocalTime.Property property53 = localTime48.millisOfSecond();
        org.joda.time.Chronology chronology54 = localTime48.getChronology();
        org.joda.time.DurationField durationField55 = chronology54.seconds();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime31.toMutableDateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime56", (dateTime18.compareTo(mutableDateTime56) == 0) == dateTime18.equals(mutableDateTime56));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.add(3, (int) ' ');
        calendar0.roll(1, 1645514488);
        calendar0.setTimeInMillis(1645514501316L);
        java.util.TimeZone timeZone11 = calendar0.getTimeZone();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.lang.String str13 = calendar0.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.Instant instant18 = instant16.withMillis((long) (short) 100);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Instant instant22 = instant16.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTimeISO();
        org.joda.time.Instant instant26 = instant16.withDurationAdded((long) 26496335, 53);
        org.joda.time.Chronology chronology27 = instant16.getChronology();
        boolean boolean28 = calendar0.after((java.lang.Object) instant16);
        calendar0.set(1705854, (int) (byte) 100, 26905866, 169, 26861184, 26899886);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant16", (mutableDateTime15.compareTo(instant16) == 0) == mutableDateTime15.equals(instant16));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        int int4 = dateTime0.compareTo((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusMillis(20);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 48);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        org.joda.time.DurationField durationField16 = chronology12.weeks();
        org.joda.time.DurationField durationField17 = chronology12.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.era();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.year();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        boolean boolean26 = mutableDateTime24.isAfter((long) 22);
        boolean boolean28 = mutableDateTime24.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        mutableDateTime24.setZone(dateTimeZone31);
        mutableDateTime20.setZoneRetainFields(dateTimeZone31);
        org.joda.time.Chronology chronology34 = chronology12.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField35 = chronology12.months();
        org.joda.time.DateTime dateTime36 = dateTime8.toDateTime(chronology12);
        org.joda.time.DateTime dateTime38 = dateTime36.minusMinutes(2000);
        org.joda.time.DateTime dateTime40 = dateTime38.minusMonths(1511617);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now();
        int int42 = localDate41.getDayOfMonth();
        org.joda.time.LocalDate localDate44 = localDate41.plusYears((int) (byte) 100);
        org.joda.time.Interval interval45 = localDate44.toInterval();
        org.joda.time.Chronology chronology46 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.weekyear();
        org.joda.time.Chronology chronology48 = chronology46.withUTC();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfMonth();
        org.joda.time.DateTime dateTime50 = dateTime38.toDateTime(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime36", (dateTime8.compareTo(dateTime36) == 0) == dateTime8.equals(dateTime36));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.centuryOfEra();
        boolean boolean6 = property5.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        org.joda.time.DateTime dateTime6 = dateTime1.plusYears(26500734);
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        org.joda.time.DateTime.Property property8 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        long long11 = dateTimeField9.roundFloor(1645518105551L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        java.time.ZoneId zoneId19 = timeZone1.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.plusMonths(0);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        int int27 = localDate25.size();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property38 = dateTime36.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale40.getDisplayScript(locale46);
        java.lang.String str48 = locale39.getDisplayLanguage(locale46);
        java.util.Locale.setDefault(locale39);
        boolean boolean50 = locale39.hasExtensions();
        java.lang.String str51 = locale39.getScript();
        java.util.Set<java.lang.String> strSet52 = locale39.getUnicodeLocaleKeys();
        int int53 = property38.getMaximumTextLength(locale39);
        java.lang.String str54 = locale39.getLanguage();
        java.util.Locale.setDefault(locale39);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone20, locale39);
        boolean boolean57 = timeZone20.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar56", (calendar13.compareTo(calendar56) == 0) == calendar13.equals(calendar56));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime33);
        int int36 = dateTimeZone15.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone15);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate41 = localDate38.withWeekyear((-26519));
        org.joda.time.Instant instant43 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology44 = instant43.getChronology();
        org.joda.time.DateTime dateTime45 = instant43.toDateTimeISO();
        org.joda.time.DateTime dateTime46 = localDate41.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.Interval interval49 = localDate47.toInterval(dateTimeZone48);
        org.joda.time.LocalDate localDate51 = localDate47.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = mutableDateTime53.getZone();
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        int int57 = dateTimeZone54.getOffsetFromLocal((long) (byte) -1);
        long long59 = dateTimeZone54.previousTransition((long) 1);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime61 = localDate51.toDateTimeAtStartOfDay(dateTimeZone54);
        org.joda.time.DateTime dateTime62 = dateTime46.withZoneRetainFields(dateTimeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime37", (mutableDateTime24.compareTo(dateTime37) == 0) == mutableDateTime24.equals(dateTime37));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths(0);
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        int int11 = localDate9.size();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        org.joda.time.DateTime dateTime20 = localDate9.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        int int23 = localDate0.get(dateTimeFieldType21);
        org.joda.time.LocalDate.Property property24 = localDate0.dayOfMonth();
        int int25 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate.Property property26 = localDate0.weekyear();
        org.joda.time.LocalDate localDate28 = property26.addToCopy((-6038));
        int[] intArray29 = localDate28.getValues();
        org.joda.time.LocalDate localDate31 = localDate28.withYear(26702683);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now();
        int int33 = localDate32.getDayOfMonth();
        org.joda.time.LocalDate localDate35 = localDate32.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property36 = localDate35.centuryOfEra();
        java.lang.String str37 = property36.getName();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        int int39 = localDate38.getDayOfMonth();
        org.joda.time.LocalDate localDate41 = localDate38.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtStartOfDay();
        int int43 = dateTime42.getMinuteOfDay();
        long long44 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime46 = dateTime42.plusHours(2222);
        java.lang.String str47 = dateTime42.toString();
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.Interval interval50 = localDate48.toInterval(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate48.plusMonths(0);
        org.joda.time.LocalDate.Property property53 = localDate52.year();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = mutableDateTime55.getZone();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        long long61 = dateTimeZone56.getMillisKeepLocal(dateTimeZone59, (long) 10);
        org.joda.time.DateMidnight dateMidnight62 = localDate52.toDateMidnight(dateTimeZone56);
        int int64 = dateTimeZone56.getOffset((long) 742);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        org.joda.time.Instant instant67 = new org.joda.time.Instant();
        org.joda.time.Instant instant69 = instant67.withMillis((long) (short) 100);
        mutableDateTime66.setMillis((org.joda.time.ReadableInstant) instant67);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime73.getZone();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        long long79 = dateTimeZone74.getMillisKeepLocal(dateTimeZone77, (long) 10);
        boolean boolean80 = dateTimeZone77.isFixed();
        org.joda.time.LocalDate localDate81 = new org.joda.time.LocalDate((long) 2, dateTimeZone77);
        long long84 = dateTimeZone77.convertLocalToUTC(0L, false);
        long long86 = dateTimeZone77.nextTransition((long) ' ');
        long long88 = dateTimeZone77.convertUTCToLocal((long) 58);
        mutableDateTime66.setZone(dateTimeZone77);
        long long91 = dateTimeZone56.getMillisKeepLocal(dateTimeZone77, 26490127L);
        org.joda.time.DateTime dateTime92 = dateTime42.withZoneRetainFields(dateTimeZone56);
        org.joda.time.DateMidnight dateMidnight93 = localDate31.toDateMidnight(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant67", (mutableDateTime13.compareTo(instant67) == 0) == mutableDateTime13.equals(instant67));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime33);
        int int36 = dateTimeZone15.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone15);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime37", (mutableDateTime24.compareTo(dateTime37) == 0) == mutableDateTime24.equals(dateTime37));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.Instant instant6 = instant4.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant4.withDurationAdded(readableDuration7, 26696154);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTime.Property property12 = dateTime10.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.DateTime dateTime32 = property31.getDateTime();
        int int33 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime32.withYear(26514743);
        org.joda.time.Instant instant36 = dateTime32.toInstant();
        org.joda.time.DateTime dateTime37 = dateTime32.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant36", (dateTime37.compareTo(instant36) == 0) == dateTime37.equals(instant36));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        java.util.Date date5 = calendar4.getTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) (short) 100);
        mutableDateTime7.setMillis((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = instant8.toMutableDateTimeISO();
        org.joda.time.Instant instant18 = instant8.withDurationAdded((long) 26496335, 53);
        org.joda.time.Chronology chronology19 = instant8.getChronology();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) calendar4, chronology19);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology19);
        java.lang.String str22 = mutableDateTime21.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant8", (mutableDateTime7.compareTo(instant8) == 0) == mutableDateTime7.equals(instant8));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        int int13 = localDate12.getDayOfMonth();
        org.joda.time.LocalDate localDate15 = localDate12.plusYears((int) (byte) 100);
        org.joda.time.Interval interval16 = localDate15.toInterval();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 10);
        java.lang.String str25 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillisOfDay((int) (short) 10);
        boolean boolean29 = mutableDateTime1.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime dateTime32 = dateTime26.withField(dateTimeFieldType30, 7);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        org.joda.time.DateTime dateTime35 = property33.addToCopy((long) 79260000);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMonths(22);
        org.joda.time.DateTime dateTime38 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.minus(readablePeriod39);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime40.getZone();
        boolean boolean43 = dateTimeZone42.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and instant41", (dateTime37.compareTo(instant41) == 0) == dateTime37.equals(instant41));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        long long2 = instant0.getMillis();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(1L);
        int int5 = mutableDateTime4.getCenturyOfEra();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Calendar calendar7 = mutableDateTime4.toCalendar(locale6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate8.toInterval(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate8.plusMonths(0);
        org.joda.time.LocalDate.Property property13 = localDate12.year();
        int int14 = localDate12.size();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        long long22 = dateTimeZone17.getMillisKeepLocal(dateTimeZone20, (long) 10);
        org.joda.time.DateTime dateTime23 = localDate12.toDateTimeAtMidnight(dateTimeZone20);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfEra();
        org.joda.time.DateTime dateTime25 = property24.getDateTime();
        org.joda.time.DateTime dateTime27 = property24.addToCopy(26496731);
        boolean boolean28 = mutableDateTime4.isEqual((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean29 = instant0.isAfter((org.joda.time.ReadableInstant) mutableDateTime4);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet34 = locale30.getUnicodeLocaleAttributes();
        boolean boolean36 = strSet34.remove((java.lang.Object) 12L);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate39 = localDate37.withWeekyear(3);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        boolean boolean41 = strSet34.remove((java.lang.Object) property40);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale45.getDisplayScript(locale46);
        java.util.Set<java.lang.String> strSet48 = locale45.getUnicodeLocaleKeys();
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = locale49.getDisplayCountry(locale51);
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale53.getDisplayScript(locale54);
        java.util.Locale[] localeArray56 = new java.util.Locale[] { locale45, locale51, locale54 };
        java.util.ArrayList<java.util.Locale> localeList57 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList57, localeArray56);
        java.util.Locale locale59 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.util.Locale>) localeList57);
        boolean boolean60 = strSet34.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43);
        boolean boolean61 = mutableDateTime4.equals((java.lang.Object) languageRangeList43);
        mutableDateTime4.setTime(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMillis(26500802);
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder14.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("years");
        boolean boolean22 = timeZone21.observesDaylightTime();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone21);
        java.util.Calendar.Builder builder24 = builder19.setTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTime dateTime26 = dateTime13.withZone(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfDay();
        java.lang.String str31 = mutableDateTime28.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int32 = mutableDateTime28.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.secondOfMinute();
        mutableDateTime28.setMillis((long) 26504717);
        boolean boolean36 = mutableDateTime28.isAfterNow();
        mutableDateTime28.add((-40L));
        int int39 = dateTime13.compareTo((org.joda.time.ReadableInstant) mutableDateTime28);
        org.joda.time.DateTime.Property property40 = dateTime13.weekyear();
        org.joda.time.DateTime dateTime41 = property40.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime26", (dateTime13.compareTo(dateTime26) == 0) == dateTime13.equals(dateTime26));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        java.lang.String str5 = durationFieldType4.toString();
        boolean boolean6 = localTime3.isSupported(durationFieldType4);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime9 = localTime3.withFieldAdded(durationFieldType7, 32772);
        org.joda.time.LocalTime.Property property10 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime12 = localTime3.minusMinutes(19);
        org.joda.time.Chronology chronology13 = localTime3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 'u', chronology13);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 2021, chronology13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.secondOfMinute();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.secondOfMinute();
        org.joda.time.Chronology chronology22 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.monthOfYear();
        boolean boolean24 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime18);
        java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime16.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and mutableDateTime18", (mutableDateTime14.compareTo(mutableDateTime18) == 0) == mutableDateTime14.equals(mutableDateTime18));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.plus(readablePeriod10);
        org.joda.time.DateTime dateTime13 = dateTime1.withWeekyear(686);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra((int) '4');
        org.joda.time.LocalDate.Property property3 = localDate0.era();
        org.joda.time.LocalDate.Property property4 = localDate0.weekyear();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.toLanguageTag();
        boolean boolean7 = locale5.hasExtensions();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleKeys();
        int int9 = property4.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDate localDate11 = property4.addToCopy(26500557);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.secondOfMinute();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime13.secondOfMinute();
        org.joda.time.Chronology chronology17 = mutableDateTime13.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) localDate11, chronology17);
        org.joda.time.Instant instant19 = new org.joda.time.Instant();
        org.joda.time.Instant instant21 = instant19.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant21.withDurationAdded(readableDuration22, (int) (short) 0);
        boolean boolean26 = instant21.isBefore((long) 5);
        java.util.Date date27 = instant21.toDate();
        org.joda.time.Chronology chronology28 = instant21.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = dateTimeField29.getType();
        org.joda.time.LocalDate localDate32 = localDate11.withField(dateTimeFieldType30, 2100);
        org.joda.time.LocalDate localDate34 = localDate11.plusDays(26810636);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and instant19", (mutableDateTime13.compareTo(instant19) == 0) == mutableDateTime13.equals(instant19));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Calendar calendar11 = mutableDateTime4.toCalendar(locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        int int16 = dateTimeZone14.getStandardOffset(0L);
        long long18 = dateTimeZone14.nextTransition((long) '#');
        mutableDateTime4.setZoneRetainFields(dateTimeZone14);
        mutableDateTime4.setSecondOfDay(441);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.millisOfDay();
        java.lang.String str26 = mutableDateTime23.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int27 = mutableDateTime23.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        org.joda.time.MutableDateTime mutableDateTime31 = property28.add(20);
        boolean boolean32 = mutableDateTime4.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.Instant instant33 = mutableDateTime31.toInstant();
        org.joda.time.Instant instant35 = instant33.plus((long) 444);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and instant33", (mutableDateTime23.compareTo(instant33) == 0) == mutableDateTime23.equals(instant33));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(1L);
        int int10 = mutableDateTime9.getCenturyOfEra();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Calendar calendar12 = mutableDateTime9.toCalendar(locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutableDateTime9.setTime(readableInstant13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.minuteOfDay();
        int int16 = dateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone19.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(dateTimeZone19);
        long long26 = dateTimeZone19.convertLocalToUTC((long) 26534577, true, (long) (short) -1);
        org.joda.time.DateTime dateTime27 = dateTime1.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime29 = dateTime27.minusYears(26520873);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime27", (instant0.compareTo(dateTime27) == 0) == instant0.equals(dateTime27));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        long long20 = dateTimeZone15.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone15);
        long long24 = dateTimeZone15.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant2, dateTimeZone15);
        java.util.Locale locale27 = java.util.Locale.US;
        java.lang.String str28 = dateTimeZone15.getName(1645514537049L, locale27);
        java.util.Locale locale32 = new java.util.Locale("United Kingdom", "22 June 0130 07:21:42 ", "");
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale32);
        java.util.Locale locale34 = java.util.Locale.UK;
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.lang.String str40 = locale35.getDisplayScript(locale38);
        java.util.Locale locale41 = java.util.Locale.UK;
        java.lang.String str42 = locale35.getDisplayScript(locale41);
        java.lang.String str43 = locale34.getDisplayLanguage(locale41);
        java.lang.String str44 = locale34.getDisplayCountry();
        java.lang.String str45 = locale34.getDisplayName();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType46.getField(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.secondOfDay();
        java.lang.String str53 = dateTimeField51.getAsShortText(10L);
        org.joda.time.DurationField durationField54 = dateTimeField51.getDurationField();
        java.util.Locale locale56 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet57 = locale56.getExtensionKeys();
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale58.getDisplayScript(locale59);
        java.lang.String str61 = locale56.getDisplayScript(locale59);
        java.util.Locale locale62 = java.util.Locale.UK;
        java.lang.String str63 = locale56.getDisplayScript(locale62);
        java.lang.String str64 = dateTimeField51.getAsShortText(100, locale56);
        java.lang.String str65 = locale34.getDisplayLanguage(locale56);
        java.lang.String str66 = locale32.getDisplayVariant(locale56);
        java.lang.String str67 = locale27.getDisplayVariant(locale32);
        java.lang.Object obj68 = locale32.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int24 = dateTimeZone21.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = localTime1.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = property26.addWrapFieldToCopy(2);
        java.lang.String str29 = property26.getAsShortText();
        org.joda.time.DateTime dateTime30 = property26.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        boolean boolean34 = mutableDateTime32.isAfter((long) 22);
        boolean boolean36 = mutableDateTime32.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        mutableDateTime32.setZone(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        mutableDateTime32.add(readablePeriod41, 11);
        boolean boolean44 = dateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        int int45 = dateTime30.getDayOfYear();
        org.joda.time.DateTime dateTime47 = dateTime30.plusMillis(26557273);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        boolean boolean51 = mutableDateTime49.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime49.toMutableDateTime();
        mutableDateTime52.setMillisOfDay(26518108);
        java.util.TimeZone timeZone56 = java.util.TimeZone.getTimeZone("21");
        int int57 = timeZone56.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        mutableDateTime52.setZone(dateTimeZone58);
        org.joda.time.DateTime dateTime60 = dateTime47.withZone(dateTimeZone58);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime60.minus(readableDuration61);
        org.joda.time.DateTime dateTime64 = dateTime62.plus(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime64", (dateTime47.compareTo(dateTime64) == 0) == dateTime47.equals(dateTime64));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DateTime dateTime3 = instant1.toDateTimeISO();
        org.joda.time.Instant instant6 = instant1.withDurationAdded(1645514549979L, 0);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        java.lang.String str14 = chronology11.toString();
        long long18 = chronology11.add((-431366460000L), (long) (short) 10, (int) (short) 1);
        org.joda.time.DateTime dateTime19 = dateTime7.withChronology(chronology11);
        org.joda.time.DateTime dateTime21 = dateTime19.plusDays((int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekyear((int) (short) -1);
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getRangeDurationType();
        boolean boolean14 = instant11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDateTime.Property property15 = localDateTime7.property(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        java.lang.String str24 = dateTimeZone18.toString();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.lang.String str30 = dateTimeZone18.getName((long) 26487938, locale28);
        java.util.TimeZone timeZone31 = dateTimeZone18.toTimeZone();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        java.util.Calendar.Builder builder34 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder38 = builder34.setDate(26519211, 1313470, 960);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 10);
        java.lang.String str47 = dateTimeZone41.toString();
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.lang.String str50 = locale49.toLanguageTag();
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = locale49.getDisplayCountry(locale51);
        java.lang.String str53 = dateTimeZone41.getName((long) 26487938, locale51);
        java.lang.String str54 = locale51.getDisplayLanguage();
        java.lang.String str55 = locale51.getDisplayName();
        java.util.Calendar.Builder builder56 = builder34.setLocale(locale51);
        java.lang.String str57 = dateTimeZone18.getName(6013036L, locale51);
        org.joda.time.DateTime dateTime58 = localDateTime7.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime60 = dateTime58.minusSeconds((int) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime17", (instant11.compareTo(mutableDateTime17) == 0) == instant11.equals(mutableDateTime17));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = instant2.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) instant2);
        org.joda.time.DateTime dateTime8 = instant2.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.DateTime.Property property11 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = property11.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusYears(26551238);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime1.add(readableDuration5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.yearOfEra();
        org.joda.time.DateTime dateTime16 = mutableDateTime1.toDateTime(chronology11);
        org.joda.time.DurationField durationField17 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology11.dayOfYear();
        boolean boolean19 = dateTimeField18.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime16", (mutableDateTime1.compareTo(dateTime16) == 0) == mutableDateTime1.equals(dateTime16));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.Interval interval7 = localDate6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        java.lang.String str19 = mutableDateTime18.toString();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime18.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis((long) (short) 100);
        mutableDateTime23.setMillis((org.joda.time.ReadableInstant) instant24);
        org.joda.time.Instant instant30 = instant24.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean31 = instant24.isAfterNow();
        long long32 = instant24.getMillis();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant24.minus(readableDuration33);
        org.joda.time.DateTime dateTime35 = instant34.toDateTime();
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readablePeriod37);
        int int39 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant24", (mutableDateTime1.compareTo(instant24) == 0) == mutableDateTime1.equals(instant24));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.plusYears(26487938);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        int int26 = localDate25.getDayOfMonth();
        org.joda.time.LocalDate localDate28 = localDate25.plusYears((int) (byte) 100);
        org.joda.time.Interval interval29 = localDate28.toInterval();
        org.joda.time.Chronology chronology30 = localDate28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime24.toDateTime(chronology30);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter38.withPivotYear(0);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.Interval interval45 = localDate43.toInterval(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate43.plusMonths(0);
        org.joda.time.LocalDate.Property property48 = localDate47.year();
        int int49 = localDate47.size();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime54.getZone();
        long long57 = dateTimeZone52.getMillisKeepLocal(dateTimeZone55, (long) 10);
        org.joda.time.DateTime dateTime58 = localDate47.toDateTimeAtMidnight(dateTimeZone55);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfEra();
        org.joda.time.DateTime dateTime60 = property59.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime62 = property59.addToCopy((int) 'u');
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter38.withChronology(chronology63);
        org.joda.time.Chronology chronology65 = chronology63.withUTC();
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(1312348L, chronology65);
        org.joda.time.MutableDateTime mutableDateTime67 = dateTime34.toMutableDateTime(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime33", (dateTime24.compareTo(dateTime33) == 0) == dateTime24.equals(dateTime33));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusMillis((int) 'a');
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay(26551238);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        int int26 = dateTime22.compareTo((org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMillis(20);
        org.joda.time.DateTime dateTime30 = dateTime28.minus((long) 48);
        org.joda.time.Instant instant31 = dateTime28.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.Interval interval35 = localDate33.toInterval(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate33.plusMonths(0);
        org.joda.time.LocalDate.Property property38 = localDate37.year();
        int int39 = localDate37.size();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = mutableDateTime41.getZone();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime44.getZone();
        long long47 = dateTimeZone42.getMillisKeepLocal(dateTimeZone45, (long) 10);
        org.joda.time.DateTime dateTime48 = localDate37.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfEra();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.minus(readableDuration50);
        org.joda.time.Chronology chronology52 = dateTime48.getChronology();
        boolean boolean53 = dateTimeFieldType32.isSupported(chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology52);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.DateTimeField dateTimeField56 = chronology52.monthOfYear();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.minuteOfHour();
        org.joda.time.DateTime dateTime58 = dateTime28.toDateTime(chronology52);
        org.joda.time.DateTimeField dateTimeField59 = chronology52.minuteOfHour();
        org.joda.time.DateTime dateTime60 = dateTime21.toDateTime(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant31", (dateTime28.compareTo(instant31) == 0) == dateTime28.equals(instant31));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.add(4012L);
        org.joda.time.MutableDateTime mutableDateTime6 = property2.roundFloor();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime10 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField(chronology14);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(chronology14);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = dateTimeField24.getType();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime6.property(dateTimeFieldType25);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime.Property property37 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime39 = localTime30.minusMinutes(19);
        org.joda.time.Chronology chronology40 = localTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime41 = org.joda.time.MutableDateTime.now(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(1645514521003L, chronology40);
        org.joda.time.DateTimeField dateTimeField43 = chronology40.year();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 48, chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = dateTimeField45.getType();
        int int47 = mutableDateTime6.get(dateTimeFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        boolean boolean4 = mutableDateTime2.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime();
        mutableDateTime2.addDays(19);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.dayOfMonth();
        mutableDateTime2.addMonths(22);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        mutableDateTime2.add(readablePeriod11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.minuteOfDay();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.dayOfWeek();
        int int17 = mutableDateTime14.getSecondOfMinute();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.Interval interval20 = localDate18.toInterval(dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate18.plusMonths(0);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate22.minus(readablePeriod24);
        org.joda.time.LocalDate localDate27 = localDate25.withCenturyOfEra(32772);
        org.joda.time.LocalDate localDate29 = localDate27.withMonthOfYear(12);
        org.joda.time.LocalDate localDate31 = localDate29.minusMonths(19);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.Chronology chronology34 = localDate32.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.months();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) localDate29, chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.dayOfYear();
        org.joda.time.DurationField durationField38 = chronology34.weekyears();
        org.joda.time.DateTime dateTime39 = mutableDateTime14.toDateTime(chronology34);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) (-26717968), chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime39", (mutableDateTime2.compareTo(dateTime39) == 0) == mutableDateTime2.equals(dateTime39));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        long long20 = dateTimeZone15.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone15);
        long long24 = dateTimeZone15.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant2, dateTimeZone15);
        java.util.TimeZone timeZone26 = dateTimeZone15.toTimeZone();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(dateTimeZone15);
        boolean boolean28 = dateTimeZone15.isFixed();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        mutableDateTime1.addHours(26523268);
        mutableDateTime1.addMinutes(26524347);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis((long) (short) 100);
        mutableDateTime12.setMillis((org.joda.time.ReadableInstant) instant13);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        long long25 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) 10);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 2, dateTimeZone23);
        long long30 = dateTimeZone23.convertLocalToUTC(0L, false);
        long long32 = dateTimeZone23.nextTransition((long) ' ');
        long long34 = dateTimeZone23.convertUTCToLocal((long) 58);
        mutableDateTime12.setZone(dateTimeZone23);
        mutableDateTime1.setZone(dateTimeZone23);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        mutableDateTime39.setMinuteOfDay(100);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime39.minuteOfHour();
        mutableDateTime39.addHours((int) '#');
        mutableDateTime39.setMinuteOfHour((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.millisOfDay();
        java.lang.String str51 = mutableDateTime48.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int52 = mutableDateTime48.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.secondOfMinute();
        mutableDateTime48.setMillis((long) 26504717);
        boolean boolean56 = mutableDateTime48.isAfterNow();
        mutableDateTime48.add((-40L));
        mutableDateTime39.setDate((org.joda.time.ReadableInstant) mutableDateTime48);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime48.getZone();
        boolean boolean61 = dateTimeZone60.isFixed();
        long long63 = dateTimeZone23.getMillisKeepLocal(dateTimeZone60, (-670L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes(26612380);
        org.joda.time.LocalTime localTime5 = dateTime2.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant4.withDurationAdded(readableDuration6, 99);
        org.joda.time.ReadableInstant readableInstant9 = null;
        boolean boolean10 = instant4.isBefore(readableInstant9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withLocale(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        long long20 = dateTimeZone15.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter12.withZone(dateTimeZone15);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone15);
        long long24 = dateTimeZone15.previousTransition((long) 26490127);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant2, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant2.plus(readableDuration26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant2.withDurationAdded(readableDuration28, 26487938);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant30.minus(readableDuration31);
        org.joda.time.Instant instant33 = instant30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        long long41 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (long) 10);
        java.lang.String str42 = dateTimeZone39.toString();
        org.joda.time.DateTime dateTime43 = org.joda.time.DateTime.now(dateTimeZone39);
        int int44 = dateTime43.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType45.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.hourOfDay();
        org.joda.time.DurationField durationField52 = dateTimeField51.getRangeDurationField();
        int int53 = dateTime43.get(dateTimeField51);
        boolean boolean54 = instant33.isAfter((org.joda.time.ReadableInstant) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant33", (mutableDateTime1.compareTo(instant33) == 0) == mutableDateTime1.equals(instant33));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 26512348);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.hourOfDay();
        org.joda.time.DurationField durationField11 = chronology7.weeks();
        org.joda.time.DurationField durationField12 = chronology7.seconds();
        org.joda.time.DateTimeField dateTimeField13 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 26497805, chronology7);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime.Property property16 = dateTime14.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withDurationAdded(readableDuration17, (int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale21 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withLocale(locale21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        long long30 = dateTimeZone25.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter22.withZone(dateTimeZone25);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(dateTimeZone25);
        long long34 = dateTimeZone25.previousTransition((long) 26490127);
        org.joda.time.DateTime dateTime35 = dateTime14.withZone(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType36.getDurationType();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime1.property(dateTimeFieldType36);
        int int40 = mutableDateTime1.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime35", (dateTime14.compareTo(dateTime35) == 0) == dateTime14.equals(dateTime35));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("years");
        boolean boolean3 = timeZone2.observesDaylightTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Locale locale5 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet6 = locale5.getExtensionKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.lang.String str10 = locale5.getDisplayScript(locale8);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale5.getDisplayScript(locale11);
        java.lang.String str13 = locale4.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone2, locale4);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.Interval interval18 = localDate16.toInterval(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate16.plusMonths(0);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        int int22 = localDate20.size();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone28);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfEra();
        org.joda.time.DateTime dateTime33 = property32.getDateTime();
        int int34 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime33);
        int int36 = dateTimeZone15.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((-431366459990L), dateTimeZone15);
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfCentury();
        org.joda.time.LocalDate localDate41 = localDate38.withWeekyear((-26519));
        int int42 = localDate41.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and dateTime37", (mutableDateTime24.compareTo(dateTime37) == 0) == mutableDateTime24.equals(dateTime37));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.years();
        java.lang.String str5 = durationFieldType4.toString();
        boolean boolean6 = localTime3.isSupported(durationFieldType4);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime9 = localTime3.withFieldAdded(durationFieldType7, 32772);
        org.joda.time.LocalTime.Property property10 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime12 = localTime3.minusMinutes(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean14 = localTime3.isSupported(dateTimeFieldType13);
        boolean boolean15 = localTime1.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.era();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.year();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((java.lang.Object) mutableDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str22 = dateTimeFieldType21.toString();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        java.lang.String str26 = durationFieldType25.toString();
        boolean boolean27 = localTime24.isSupported(durationFieldType25);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime30 = localTime24.withFieldAdded(durationFieldType28, 32772);
        java.lang.String str31 = durationFieldType28.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType32.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.hourOfDay();
        boolean boolean39 = durationFieldType28.isSupported(chronology35);
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType21.getField(chronology35);
        boolean boolean41 = instant20.isSupported(dateTimeFieldType21);
        org.joda.time.LocalTime.Property property42 = localTime1.property(dateTimeFieldType21);
        org.joda.time.LocalTime localTime43 = property42.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime45 = localTime43.withMillisOfSecond(824);
        java.lang.String str46 = localTime45.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant20", (mutableDateTime17.compareTo(instant20) == 0) == mutableDateTime17.equals(instant20));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int2 = calendar0.getFirstDayOfWeek();
        calendar0.setFirstDayOfWeek(960);
        calendar0.clear();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar calendar10 = builder9.build();
        java.util.Calendar.Builder builder15 = builder9.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar calendar16 = builder15.build();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("years");
        boolean boolean21 = timeZone20.observesDaylightTime();
        boolean boolean22 = timeZone18.hasSameRules(timeZone20);
        java.util.Calendar.Builder builder23 = builder15.setTimeZone(timeZone18);
        calendar6.setTimeZone(timeZone18);
        boolean boolean25 = timeZone18.observesDaylightTime();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18);
        calendar0.setTimeZone(timeZone18);
        java.util.Date date28 = calendar0.getTime();
        date28.setTime((long) 31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar10", (calendar0.compareTo(calendar10) == 0) == calendar0.equals(calendar10));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        java.lang.String str8 = durationFieldType5.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        boolean boolean16 = durationFieldType5.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology12.dayOfMonth();
        org.joda.time.DurationField durationField19 = chronology12.eras();
        org.joda.time.DurationField durationField20 = chronology12.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField20, and durationField19", !(durationField19.compareTo(durationField20) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField20.compareTo(durationField19))));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        timeZone1.setRawOffset(26518191);
        java.util.TimeZone.setDefault(timeZone1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.secondOfMinute();
        int int31 = dateTimeFormatter24.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime26, "halfdays", 0);
        java.util.Locale locale32 = java.util.Locale.getDefault();
        java.util.Calendar calendar33 = mutableDateTime26.toCalendar(locale32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        int int38 = dateTimeZone36.getStandardOffset(0L);
        long long40 = dateTimeZone36.nextTransition((long) '#');
        mutableDateTime26.setZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone47 = mutableDateTime46.getZone();
        long long49 = dateTimeZone44.getMillisKeepLocal(dateTimeZone47, (long) 10);
        java.lang.String str50 = dateTimeZone44.toString();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale52.getDisplayCountry(locale54);
        java.lang.String str56 = dateTimeZone44.getName((long) 26487938, locale54);
        long long58 = dateTimeZone36.getMillisKeepLocal(dateTimeZone44, 1645514497771L);
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str61 = dateTimeZone44.getShortName((long) 26487938, locale60);
        java.lang.String str63 = locale60.getUnicodeLocaleType("22");
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone1, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar33", (calendar13.compareTo(calendar33) == 0) == calendar13.equals(calendar33));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        boolean boolean1 = mutableDateTime0.isAfterNow();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime0.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter5.withZone(dateTimeZone8);
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronology();
        java.lang.String str16 = mutableDateTime0.toString(dateTimeFormatter14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        boolean boolean19 = calendar17.isWeekDateSupported();
        calendar17.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        mutableDateTime23.setMinuteOfDay(100);
        boolean boolean26 = mutableDateTime23.isAfterNow();
        boolean boolean27 = mutableDateTime23.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime23.setZoneRetainFields(dateTimeZone30);
        boolean boolean32 = calendar17.before((java.lang.Object) dateTimeZone30);
        int int34 = dateTimeZone30.getOffsetFromLocal(1645514504670L);
        mutableDateTime0.setZone(dateTimeZone30);
        int int37 = dateTimeZone30.getOffset(703913555438743L);
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime7", (mutableDateTime0.compareTo(mutableDateTime7) == 0) == mutableDateTime0.equals(mutableDateTime7));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 22);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime20 = localTime1.plusMinutes(0);
        org.joda.time.LocalTime localTime22 = localTime1.withMillisOfDay(21);
        org.joda.time.DateTime dateTime23 = localTime1.toDateTimeToday();
        org.joda.time.DateTime dateTime25 = dateTime23.minusMillis(26502510);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(3914);
        org.joda.time.DateTime.Property property28 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        org.joda.time.LocalTime.Property property38 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime40 = localTime31.minusMinutes(19);
        org.joda.time.DateTime dateTime41 = localTime40.toDateTimeToday();
        org.joda.time.DateTime dateTime43 = dateTime41.minusMillis(26500802);
        java.util.Calendar.Builder builder44 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder49 = builder44.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getTimeZone("years");
        boolean boolean52 = timeZone51.observesDaylightTime();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone51);
        java.util.Calendar.Builder builder54 = builder49.setTimeZone(timeZone51);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.DateTime dateTime56 = dateTime43.withZone(dateTimeZone55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int58 = dateTime43.get(dateTimeFieldType57);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime61 = dateTime43.withZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(dateTimeZone60);
        org.joda.time.DateTime dateTime63 = dateTime29.withZone(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime62", (mutableDateTime9.compareTo(dateTime62) == 0) == mutableDateTime9.equals(dateTime62));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        boolean boolean16 = timeZone1.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1);
        int int20 = timeZone1.getOffset((long) (-26702648));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar18", (calendar13.compareTo(calendar18) == 0) == calendar13.equals(calendar18));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.era();
        org.joda.time.DurationField durationField7 = chronology3.minutes();
        org.joda.time.DurationField durationField8 = chronology3.minutes();
        org.joda.time.DurationField durationField9 = chronology3.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField9", Math.signum(durationField7.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField7)));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        java.lang.String str5 = property4.getName();
        org.joda.time.DurationField durationField6 = property4.getDurationField();
        org.joda.time.LocalDate localDate7 = property4.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfWeek();
        org.joda.time.Chronology chronology11 = chronology8.withUTC();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DurationField durationField13 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField6, and durationField9", !(durationField13.compareTo(durationField6) == 0) || (Math.signum(durationField13.compareTo(durationField9)) == Math.signum(durationField6.compareTo(durationField9))));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        java.time.ZoneId zoneId19 = timeZone1.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.plusMonths(0);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        int int27 = localDate25.size();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property38 = dateTime36.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale40.getDisplayScript(locale46);
        java.lang.String str48 = locale39.getDisplayLanguage(locale46);
        java.util.Locale.setDefault(locale39);
        boolean boolean50 = locale39.hasExtensions();
        java.lang.String str51 = locale39.getScript();
        java.util.Set<java.lang.String> strSet52 = locale39.getUnicodeLocaleKeys();
        int int53 = property38.getMaximumTextLength(locale39);
        java.lang.String str54 = locale39.getLanguage();
        java.util.Locale.setDefault(locale39);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone20, locale39);
        org.joda.time.Instant instant57 = new org.joda.time.Instant();
        org.joda.time.Instant instant59 = instant57.withMillis((long) (short) 100);
        org.joda.time.DateTime dateTime60 = instant57.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime61 = instant57.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime62 = instant57.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Instant instant65 = instant57.withDurationAdded(readableDuration63, 77174209);
        long long66 = instant57.getMillis();
        boolean boolean67 = locale39.equals((java.lang.Object) instant57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar56", (calendar13.compareTo(calendar56) == 0) == calendar13.equals(calendar56));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.addHours((int) '#');
        mutableDateTime1.setMinuteOfHour((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.millisOfDay();
        java.lang.String str13 = mutableDateTime10.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int14 = mutableDateTime10.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime10.secondOfMinute();
        mutableDateTime10.setMillis((long) 26504717);
        boolean boolean18 = mutableDateTime10.isAfterNow();
        mutableDateTime10.add((-40L));
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime10.getZone();
        boolean boolean23 = dateTimeZone22.isFixed();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("years");
        boolean boolean29 = timeZone28.observesDaylightTime();
        boolean boolean30 = timeZone26.hasSameRules(timeZone28);
        java.util.Locale locale31 = java.util.Locale.UK;
        java.util.Locale locale32 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet33 = locale32.getExtensionKeys();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale34.getDisplayScript(locale35);
        java.lang.String str37 = locale32.getDisplayScript(locale35);
        java.util.Locale locale38 = java.util.Locale.UK;
        java.lang.String str39 = locale32.getDisplayScript(locale38);
        java.lang.String str40 = locale31.getDisplayLanguage(locale38);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(timeZone26, locale38);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime43.add(readablePeriod45, 41);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime43.add(readableDuration48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology53 = localTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType50.getField(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.secondOfDay();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.hourOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology53.weekyear();
        org.joda.time.DateTimeField dateTimeField58 = chronology53.weekyearOfCentury();
        long long62 = chronology53.add(0L, (long) 2022, 20);
        org.joda.time.DateTimeField dateTimeField63 = chronology53.millisOfSecond();
        org.joda.time.Chronology chronology64 = chronology53.withUTC();
        mutableDateTime43.setChronology(chronology53);
        org.joda.time.DateTimeField dateTimeField66 = chronology53.millisOfDay();
        org.joda.time.DateTimeField dateTimeField67 = chronology53.halfdayOfDay();
        java.lang.String str68 = dateTimeField67.toString();
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType72 = org.joda.time.DurationFieldType.years();
        java.lang.String str73 = durationFieldType72.toString();
        boolean boolean74 = localTime71.isSupported(durationFieldType72);
        org.joda.time.DurationFieldType durationFieldType75 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime77 = localTime71.withFieldAdded(durationFieldType75, 32772);
        org.joda.time.LocalTime.Property property78 = localTime71.hourOfDay();
        org.joda.time.LocalTime localTime80 = localTime71.minusMinutes(19);
        org.joda.time.Chronology chronology81 = localTime71.getChronology();
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(chronology81);
        org.joda.time.DateTime dateTime84 = dateTime82.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime.Property property85 = dateTime82.secondOfMinute();
        boolean boolean87 = dateTime82.isEqual(7L);
        java.util.Locale locale90 = new java.util.Locale("26", "");
        java.util.Calendar calendar91 = dateTime82.toCalendar(locale90);
        java.lang.String str92 = dateTimeField67.getAsText(2372708727562000L, locale90);
        java.lang.String str93 = locale38.getDisplayScript(locale90);
        java.lang.String str94 = dateTimeZone22.getName((long) 26497663, locale90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar41 and calendar91", (calendar41.compareTo(calendar91) == 0) == calendar41.equals(calendar91));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        boolean boolean5 = calendar3.isWeekDateSupported();
        calendar3.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        mutableDateTime9.setMinuteOfDay(100);
        boolean boolean12 = mutableDateTime9.isAfterNow();
        boolean boolean13 = mutableDateTime9.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime9.setZoneRetainFields(dateTimeZone16);
        boolean boolean18 = calendar3.before((java.lang.Object) dateTimeZone16);
        java.lang.String str19 = dateTimeZone16.toString();
        java.util.TimeZone timeZone20 = dateTimeZone16.toTimeZone();
        calendar0.setTimeZone(timeZone20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar3", (calendar0.compareTo(calendar3) == 0) == calendar0.equals(calendar3));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        boolean boolean1 = mutableDateTime0.isAfterNow();
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) mutableDateTime0, chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime0.add(readableDuration6, 26518585);
        mutableDateTime0.add(26500734L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        mutableDateTime12.setMinuteOfDay(100);
        boolean boolean15 = mutableDateTime12.isAfterNow();
        boolean boolean16 = mutableDateTime12.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime12.setZoneRetainFields(dateTimeZone19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime12.millisOfDay();
        mutableDateTime12.addDays(26558933);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime12.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str28 = dateTimeZone26.getName((long) 4);
        long long32 = dateTimeZone26.convertLocalToUTC(83887649L, true, 0L);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 53144594, dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime12.toMutableDateTime(dateTimeZone26);
        mutableDateTime0.setTime((org.joda.time.ReadableInstant) mutableDateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime24 and mutableDateTime34", (mutableDateTime24.compareTo(mutableDateTime34) == 0) == mutableDateTime24.equals(mutableDateTime34));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime11 = dateTime1.minus((long) 26490127);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        mutableDateTime13.setMinuteOfDay(100);
        boolean boolean16 = mutableDateTime13.isAfterNow();
        boolean boolean17 = mutableDateTime13.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime13.setZoneRetainFields(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime1, dateTimeZone20);
        long long24 = dateTimeZone20.nextTransition(1366117L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime22", (instant0.compareTo(mutableDateTime22) == 0) == instant0.equals(mutableDateTime22));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        int int2 = calendar0.getFirstDayOfWeek();
        calendar0.setFirstDayOfWeek(960);
        calendar0.clear();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar calendar10 = builder9.build();
        java.util.Calendar.Builder builder15 = builder9.setTimeOfDay((int) 'x', 100, 32769, 441);
        java.util.Calendar calendar16 = builder15.build();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("years");
        boolean boolean21 = timeZone20.observesDaylightTime();
        boolean boolean22 = timeZone18.hasSameRules(timeZone20);
        java.util.Calendar.Builder builder23 = builder15.setTimeZone(timeZone18);
        calendar6.setTimeZone(timeZone18);
        boolean boolean25 = timeZone18.observesDaylightTime();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18);
        calendar0.setTimeZone(timeZone18);
        boolean boolean28 = timeZone18.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar10", (calendar0.compareTo(calendar10) == 0) == calendar0.equals(calendar10));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfEra();
        org.joda.time.DateTime dateTime32 = property31.getDateTime();
        int int33 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime32);
        int int35 = dateTimeZone14.getStandardOffset((long) (-23));
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone14);
        int int37 = dateTime36.getMillisOfSecond();
        boolean boolean38 = dateTime36.isEqualNow();
        org.joda.time.DateTime.Property property39 = dateTime36.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.era();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        int int44 = localDate43.getDayOfMonth();
        org.joda.time.LocalDate localDate46 = localDate43.plusYears((int) (byte) 100);
        org.joda.time.Interval interval47 = localDate46.toInterval();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        long long55 = dateTimeZone50.getMillisKeepLocal(dateTimeZone53, (long) 10);
        java.lang.String str56 = dateTimeZone50.toString();
        org.joda.time.DateTime dateTime57 = localDate46.toDateTimeAtMidnight(dateTimeZone50);
        org.joda.time.MutableDateTime mutableDateTime58 = mutableDateTime41.toMutableDateTime(dateTimeZone50);
        java.lang.String str59 = mutableDateTime58.toString();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime58.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.secondOfMinute();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime62.secondOfMinute();
        org.joda.time.Chronology chronology66 = mutableDateTime62.getChronology();
        mutableDateTime58.setChronology(chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.minuteOfHour();
        java.util.Locale locale71 = new java.util.Locale("KR");
        java.util.Calendar calendar72 = java.util.Calendar.getInstance(locale71);
        java.lang.String str73 = dateTimeField68.getAsText((long) 26757019, locale71);
        int int74 = property39.getMaximumTextLength(locale71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar72", (calendar13.compareTo(calendar72) == 0) == calendar13.equals(calendar72));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(1L);
        int int10 = mutableDateTime9.getCenturyOfEra();
        java.util.Locale locale11 = java.util.Locale.getDefault();
        java.util.Calendar calendar12 = mutableDateTime9.toCalendar(locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutableDateTime9.setTime(readableInstant13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime9.minuteOfDay();
        int int16 = dateTime1.compareTo((org.joda.time.ReadableInstant) mutableDateTime9);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.years();
        java.lang.String str20 = durationFieldType19.toString();
        boolean boolean21 = localTime18.isSupported(durationFieldType19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime24 = localTime18.withFieldAdded(durationFieldType22, 32772);
        org.joda.time.LocalTime.Property property25 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime27 = localTime18.minusMinutes(19);
        org.joda.time.Chronology chronology28 = localTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfHalfday();
        mutableDateTime9.setChronology(chronology28);
        org.joda.time.DurationField durationField31 = chronology28.eras();
        org.joda.time.DurationField durationField32 = chronology28.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField31, durationField32, and durationField31", !(durationField31.compareTo(durationField32) == 0) || (Math.signum(durationField31.compareTo(durationField31)) == Math.signum(durationField32.compareTo(durationField31))));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        int int4 = dateTime0.compareTo((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusMillis(20);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.era();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        boolean boolean14 = mutableDateTime12.isAfter((long) 22);
        boolean boolean16 = mutableDateTime12.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        mutableDateTime12.setZone(dateTimeZone19);
        mutableDateTime8.setZoneRetainFields(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.getShortName(1645514496179L);
        org.joda.time.DateTime dateTime24 = dateTime6.withZoneRetainFields(dateTimeZone19);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromCalendarFields(calendar25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.era();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusSeconds((int) 'a');
        int int34 = localDateTime30.getEra();
        org.joda.time.LocalDateTime.Property property35 = localDateTime30.dayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime24.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime24.plus(readableDuration37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.minus(readablePeriod39);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now();
        int int42 = localDate41.getDayOfMonth();
        org.joda.time.LocalDate localDate44 = localDate41.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        boolean boolean48 = mutableDateTime46.isAfter((long) 22);
        boolean boolean50 = mutableDateTime46.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime(dateTimeZone51);
        org.joda.time.DateTimeZone dateTimeZone53 = mutableDateTime52.getZone();
        mutableDateTime46.setZone(dateTimeZone53);
        org.joda.time.DateTime dateTime55 = localDate41.toDateTimeAtStartOfDay(dateTimeZone53);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter56.withPivotYear(13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter58.withPivotYear((int) (short) 10);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.util.Locale locale62 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet63 = locale62.getExtensionKeys();
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale64.getDisplayScript(locale65);
        java.lang.String str67 = locale62.getDisplayScript(locale65);
        java.util.Locale locale68 = java.util.Locale.UK;
        java.lang.String str69 = locale62.getDisplayScript(locale68);
        java.lang.String str70 = locale61.getDisplayLanguage(locale68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter60.withLocale(locale61);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter73 = dateTimeFormatter60.withPivotYear((java.lang.Integer) 26500690);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter74.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone77);
        org.joda.time.DateTimeZone dateTimeZone79 = mutableDateTime78.getZone();
        org.joda.time.MutableDateTime.Property property80 = mutableDateTime78.secondOfMinute();
        int int83 = dateTimeFormatter76.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime78, "halfdays", 0);
        java.util.Locale locale84 = java.util.Locale.getDefault();
        java.util.Calendar calendar85 = mutableDateTime78.toCalendar(locale84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter73.withLocale(locale84);
        java.lang.String str87 = localDate41.toString(dateTimeFormatter73);
        boolean boolean88 = dateTime40.equals((java.lang.Object) dateTimeFormatter73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar85", (calendar25.compareTo(calendar85) == 0) == calendar25.equals(calendar85));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate4.minus(readablePeriod6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) '4');
        boolean boolean11 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.secondOfMinute();
        int int21 = dateTimeFormatter14.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime16, "halfdays", 0);
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Calendar calendar23 = mutableDateTime16.toCalendar(locale22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        int int28 = dateTimeZone26.getStandardOffset(0L);
        long long30 = dateTimeZone26.nextTransition((long) '#');
        mutableDateTime16.setZoneRetainFields(dateTimeZone26);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime33 = localDate8.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.LocalDate localDate35 = localDate8.plusYears(26601791);
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder41 = builder36.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("years");
        boolean boolean44 = timeZone43.observesDaylightTime();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone43);
        java.util.Calendar.Builder builder46 = builder41.setTimeZone(timeZone43);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone47);
        long long52 = dateTimeZone47.convertLocalToUTC((long) 53189286, false);
        org.joda.time.Interval interval53 = localDate8.toInterval(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar45", (calendar23.compareTo(calendar45) == 0) == calendar23.equals(calendar45));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("de-DE");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = property6.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime11 = property6.setCopy(9);
        org.joda.time.LocalDateTime localDateTime13 = property6.addToCopy(960);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(26507773);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime15, chronology16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str19 = dateTimeFieldType18.getName();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withField(dateTimeFieldType18, 26553928);
        int int22 = localDateTime21.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDurationAdded(readableDuration23, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekyear(3600000);
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now();
        boolean boolean29 = mutableDateTime28.isAfterNow();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.minuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale32 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withLocale(locale32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        long long41 = dateTimeZone36.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter33.withZone(dateTimeZone36);
        org.joda.time.Chronology chronology43 = dateTimeFormatter42.getChronology();
        java.lang.String str44 = mutableDateTime28.toString(dateTimeFormatter42);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.fromCalendarFields(calendar45);
        boolean boolean47 = calendar45.isWeekDateSupported();
        calendar45.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        mutableDateTime51.setMinuteOfDay(100);
        boolean boolean54 = mutableDateTime51.isAfterNow();
        boolean boolean55 = mutableDateTime51.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime51.setZoneRetainFields(dateTimeZone58);
        boolean boolean60 = calendar45.before((java.lang.Object) dateTimeZone58);
        int int62 = dateTimeZone58.getOffsetFromLocal(1645514504670L);
        mutableDateTime28.setZone(dateTimeZone58);
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime28.dayOfYear();
        boolean boolean66 = mutableDateTime28.isAfter((long) 26706228);
        org.joda.time.DateTime dateTime67 = localDateTime25.toDateTime((org.joda.time.ReadableInstant) mutableDateTime28);
        int int70 = dateTimeFormatter1.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime28, "de_DE", 2021);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter1.withPivotYear(380);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar45", (calendar2.compareTo(calendar45) == 0) == calendar2.equals(calendar45));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.Chronology chronology5 = localDate3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.seconds();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, (long) 26501805, 26527581);
        org.joda.time.DurationField durationField11 = chronology5.months();
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DurationField durationField14 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField6, and durationField11", !(durationField14.compareTo(durationField6) == 0) || (Math.signum(durationField14.compareTo(durationField11)) == Math.signum(durationField6.compareTo(durationField11))));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = timeZone1.observesDaylightTime();
        boolean boolean16 = timeZone1.observesDaylightTime();
        java.util.Calendar.Builder builder17 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder22 = builder17.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder25 = builder17.setTimeZone(timeZone24);
        int int27 = timeZone24.getOffset((long) 2000);
        boolean boolean28 = timeZone1.hasSameRules(timeZone24);
        timeZone1.setID("2022-10-04T09:22:43.957Z");
        java.util.Locale.Builder builder31 = new java.util.Locale.Builder();
        java.util.Calendar.Builder builder32 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType33.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.secondOfMinute();
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.years();
        java.lang.String str42 = durationFieldType41.toString();
        boolean boolean43 = localTime40.isSupported(durationFieldType41);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime46 = localTime40.withFieldAdded(durationFieldType44, 32772);
        org.joda.time.LocalTime.Property property47 = localTime40.hourOfDay();
        org.joda.time.LocalTime localTime49 = localTime40.minusMinutes(2922789);
        java.util.Locale locale51 = java.util.Locale.UK;
        java.util.Locale locale52 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale54.getDisplayScript(locale55);
        java.lang.String str57 = locale52.getDisplayScript(locale55);
        java.util.Locale locale58 = java.util.Locale.UK;
        java.lang.String str59 = locale52.getDisplayScript(locale58);
        java.lang.String str60 = locale51.getDisplayLanguage(locale58);
        java.lang.String str61 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localTime49, (int) ' ', locale51);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.years();
        java.lang.String str65 = durationFieldType64.toString();
        boolean boolean66 = localTime63.isSupported(durationFieldType64);
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime69 = localTime63.withFieldAdded(durationFieldType67, 32772);
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.util.Locale locale71 = java.util.Locale.KOREA;
        java.lang.String str72 = locale70.getDisplayScript(locale71);
        java.lang.String str73 = dateTimeField38.getAsShortText((org.joda.time.ReadablePartial) localTime69, locale71);
        java.util.Calendar.Builder builder74 = builder32.setLocale(locale71);
        java.util.Locale.Builder builder75 = builder31.setLocale(locale71);
        org.joda.time.tz.NameProvider nameProvider76 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale77 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet78 = locale77.getExtensionKeys();
        java.lang.String str79 = locale77.getLanguage();
        java.lang.String str82 = nameProvider76.getName(locale77, "clockhourOfHalfday", "1970");
        java.util.Locale locale83 = java.util.Locale.CHINA;
        java.lang.String str86 = nameProvider76.getShortName(locale83, "26507467", "2122-02-22T07:21:45.551Z");
        java.util.Locale.Builder builder87 = builder75.setLocale(locale83);
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(timeZone1, locale83);
        java.lang.String str89 = timeZone1.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar88", (calendar13.compareTo(calendar88) == 0) == calendar13.equals(calendar88));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) 2922789);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) 0);
        org.joda.time.Chronology chronology15 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekOfWeekyear();
        java.util.Date date23 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date24 = new java.util.Date();
        boolean boolean25 = date23.before(date24);
        int int26 = date23.getTimezoneOffset();
        int int27 = date23.getYear();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromDateFields(date23);
        int int29 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        long long37 = dateTimeZone32.getMillisKeepLocal(dateTimeZone35, (long) 10);
        long long40 = dateTimeZone32.convertLocalToUTC(3142821614000L, true);
        org.joda.time.DateTime dateTime41 = localDateTime28.toDateTime(dateTimeZone32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale43 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter42.withLocale(locale43);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale45.getDisplayScript(locale46);
        java.util.Set<java.lang.String> strSet48 = locale45.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter42.withLocale(locale45);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.fromCalendarFields(calendar50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField55 = property54.getField();
        org.joda.time.LocalDateTime localDateTime57 = property54.addWrapFieldToCopy(26496731);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.plusDays(960);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.plusWeeks((int) 'x');
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.withCenturyOfEra((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime61.minus(readablePeriod64);
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.withPeriodAdded(readablePeriod67, (-3600000));
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.minuteOfHour();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.LocalDateTime localDateTime73 = localDateTime69.withDurationAdded(readableDuration71, 93);
        java.lang.String str74 = dateTimeFormatter49.print((org.joda.time.ReadablePartial) localDateTime73);
        boolean boolean75 = dateTimeZone32.isLocalDateTimeGap(localDateTime73);
        java.util.Calendar.Builder builder76 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder81 = builder76.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone83 = java.util.TimeZone.getTimeZone("years");
        boolean boolean84 = timeZone83.observesDaylightTime();
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone83);
        java.util.Calendar.Builder builder86 = builder81.setTimeZone(timeZone83);
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forTimeZone(timeZone83);
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(timeZone83);
        org.joda.time.LocalDateTime localDateTime89 = org.joda.time.LocalDateTime.fromCalendarFields(calendar88);
        boolean boolean90 = dateTimeZone32.isLocalDateTimeGap(localDateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar50 and calendar85", (calendar50.compareTo(calendar85) == 0) == calendar50.equals(calendar85));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        java.time.ZoneId zoneId19 = timeZone1.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.Interval interval23 = localDate21.toInterval(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate21.plusMonths(0);
        org.joda.time.LocalDate.Property property26 = localDate25.year();
        int int27 = localDate25.size();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property38 = dateTime36.millisOfDay();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale40.getDisplayScript(locale46);
        java.lang.String str48 = locale39.getDisplayLanguage(locale46);
        java.util.Locale.setDefault(locale39);
        boolean boolean50 = locale39.hasExtensions();
        java.lang.String str51 = locale39.getScript();
        java.util.Set<java.lang.String> strSet52 = locale39.getUnicodeLocaleKeys();
        int int53 = property38.getMaximumTextLength(locale39);
        java.lang.String str54 = locale39.getLanguage();
        java.util.Locale.setDefault(locale39);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone20, locale39);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar56", (calendar13.compareTo(calendar56) == 0) == calendar13.equals(calendar56));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.weekyear();
        org.joda.time.DurationField durationField23 = chronology20.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField23, and durationField21", !(durationField21.compareTo(durationField23) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField23.compareTo(durationField21))));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.millisOfDay();
        java.lang.String str5 = mutableDateTime2.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int6 = mutableDateTime2.getMonthOfYear();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        mutableDateTime2.add(durationFieldType7, 8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        java.lang.String str13 = durationFieldType12.toString();
        boolean boolean14 = localTime11.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime17 = localTime11.withFieldAdded(durationFieldType15, 32772);
        java.lang.String str18 = durationFieldType15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        boolean boolean26 = durationFieldType15.isSupported(chronology22);
        org.joda.time.DurationField durationField27 = durationFieldType7.getField(chronology22);
        org.joda.time.DurationField durationField28 = chronology22.eras();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) 26960690, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField27 and durationField28", Math.signum(durationField27.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField27)));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        mutableDateTime10.setMinuteOfDay(100);
        mutableDateTime10.addMinutes(0);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("years");
        boolean boolean17 = timeZone16.observesDaylightTime();
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale19.getDisplayScript(locale25);
        java.lang.String str27 = locale18.getDisplayLanguage(locale25);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone16, locale18);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        boolean boolean30 = timeZone16.observesDaylightTime();
        boolean boolean31 = timeZone16.observesDaylightTime();
        java.util.Calendar.Builder builder32 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder37 = builder32.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder40 = builder32.setTimeZone(timeZone39);
        int int42 = timeZone39.getOffset((long) 2000);
        boolean boolean43 = timeZone16.hasSameRules(timeZone39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime10, dateTimeZone44);
        long long47 = chronology3.set((org.joda.time.ReadablePartial) localTime45, 1645514792471L);
        org.joda.time.DurationField durationField48 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField49 = chronology3.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField48", Math.signum(durationField7.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField7)));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1L);
        int int8 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12, (int) (byte) 100);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(31);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        java.lang.String str23 = durationFieldType22.toString();
        boolean boolean24 = localTime21.isSupported(durationFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime27 = localTime21.withFieldAdded(durationFieldType25, 32772);
        org.joda.time.DateTime dateTime28 = localTime21.toDateTimeToday();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale33);
        java.lang.String str38 = localTime21.toString("2022-02-22", locale31);
        java.util.Locale locale39 = locale31.stripExtensions();
        java.lang.String str40 = dateTimeZone18.getShortName(0L, locale31);
        long long42 = dateTimeZone18.nextTransition(1645514565728399L);
        boolean boolean44 = dateTimeZone18.isStandardOffset((long) 82800);
        org.joda.time.DateTime dateTime45 = mutableDateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType46.getField(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.secondOfDay();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.hourOfDay();
        org.joda.time.DurationField durationField53 = chronology49.seconds();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology49);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology59 = localTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType56.getField(chronology59);
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfDay();
        java.util.Locale locale63 = java.util.Locale.FRANCE;
        java.lang.String str64 = dateTimeField61.getAsText(7, locale63);
        long long66 = dateTimeField61.roundHalfCeiling((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = dateTimeField61.getType();
        mutableDateTime55.setRounding(dateTimeField61);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime55.property(dateTimeFieldType69);
        org.joda.time.DateTime.Property property71 = dateTime45.property(dateTimeFieldType69);
        int int72 = property71.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime45", (mutableDateTime1.compareTo(dateTime45) == 0) == mutableDateTime1.equals(dateTime45));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("100");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor3 = strSet2.iterator();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromCalendarFields(calendar4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra(19);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusHours((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withYear(1296994);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.minusMillis(895);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromCalendarFields(calendar18);
        boolean boolean20 = calendar18.isWeekDateSupported();
        calendar18.setFirstDayOfWeek(5);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        mutableDateTime24.setMinuteOfDay(100);
        boolean boolean27 = mutableDateTime24.isAfterNow();
        boolean boolean28 = mutableDateTime24.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime24.setZoneRetainFields(dateTimeZone31);
        boolean boolean33 = calendar18.before((java.lang.Object) dateTimeZone31);
        java.lang.String str35 = dateTimeZone31.getName((long) 32770);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withYear((-2206958));
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.withWeekOfWeekyear(18);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.fromCalendarFields(calendar41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minus(readablePeriod43);
        int int45 = localDateTime42.getDayOfMonth();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.fromCalendarFields(calendar46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        org.joda.time.LocalDateTime localDateTime52 = property50.roundCeilingCopy();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.fromCalendarFields(calendar53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.plusSeconds(26523579);
        int int61 = property50.compareTo((org.joda.time.ReadablePartial) localDateTime56);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime56.minusWeeks(26505028);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime56.withWeekyear(241);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDateTime localDateTime68 = localDateTime56.withPeriodAdded(readablePeriod66, 26592073);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.fromCalendarFields(calendar69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime74 = localDateTime70.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime76 = localDateTime70.plusHours(2922789);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime79 = property77.addToCopy((long) 11);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.minusSeconds(242);
        int int84 = localDateTime83.getSecondOfMinute();
        java.util.Calendar calendar85 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.fromCalendarFields(calendar85);
        org.joda.time.LocalDateTime localDateTime88 = localDateTime86.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property89 = localDateTime88.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField90 = property89.getField();
        org.joda.time.LocalDateTime localDateTime91 = property89.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime93 = localDateTime91.plusSeconds(2024);
        org.joda.time.LocalDateTime localDateTime95 = localDateTime91.minusMinutes(408);
        org.joda.time.LocalDateTime[] localDateTimeArray96 = new org.joda.time.LocalDateTime[] { localDateTime17, localDateTime40, localDateTime42, localDateTime68, localDateTime83, localDateTime91 };
        org.joda.time.LocalDateTime[] localDateTimeArray97 = strSet2.toArray(localDateTimeArray96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar18", (calendar4.compareTo(calendar18) == 0) == calendar4.equals(calendar18));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        boolean boolean19 = mutableDateTime17.isAfter((long) 22);
        boolean boolean21 = mutableDateTime17.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        mutableDateTime17.setZone(dateTimeZone24);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale27.getDisplayScript();
        java.lang.String str31 = dateTimeZone24.getShortName((long) 13, locale27);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusSeconds(0);
        boolean boolean38 = dateTimeZone24.isLocalDateTimeGap(localDateTime35);
        int int39 = localDateTime35.getYearOfEra();
        org.joda.time.LocalDateTime.Property property40 = localDateTime35.weekOfWeekyear();
        int int41 = property40.getMinimumValueOverall();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.fromCalendarFields(calendar42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime47 = property46.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime49 = property46.addToCopy((long) 41);
        org.joda.time.LocalDateTime localDateTime51 = property46.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withYearOfCentury(53);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.minus(readableDuration55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusWeeks(26522820);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusDays((int) 'u');
        org.joda.time.LocalDateTime localDateTime62 = localDateTime58.minusYears(26515792);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.fromCalendarFields(calendar63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = property67.setCopy(19);
        java.util.Calendar calendar70 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.fromCalendarFields(calendar70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.plusWeeks((int) ' ');
        int int74 = localDateTime71.getMillisOfDay();
        int int75 = localDateTime69.compareTo((org.joda.time.ReadablePartial) localDateTime71);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime71.withDayOfMonth(3);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime71.minusMillis(26496335);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plus(readablePeriod80);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDateTime.Property property83 = localDateTime79.property(dateTimeFieldType82);
        int int84 = localDateTime58.get(dateTimeFieldType82);
        org.joda.time.LocalDateTime localDateTime86 = localDateTime58.minusDays(26518108);
        boolean boolean87 = property40.equals((java.lang.Object) localDateTime58);
        boolean boolean88 = dateTimeZone14.isLocalDateTimeGap(localDateTime58);
        long long91 = dateTimeZone14.adjustOffset(7889035934L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar32", (calendar13.compareTo(calendar32) == 0) == calendar13.equals(calendar32));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = property6.addWrapFieldToCopy(1);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("years");
        boolean boolean13 = timeZone12.observesDaylightTime();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale15.getDisplayScript(locale18);
        java.util.Locale locale21 = java.util.Locale.UK;
        java.lang.String str22 = locale15.getDisplayScript(locale21);
        java.lang.String str23 = locale14.getDisplayLanguage(locale21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone12, locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int27 = dateTimeZone25.getOffset((long) 53);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone25);
        java.lang.String str30 = dateTimeZone25.getNameKey(1645514507123L);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 122, dateTimeZone25);
        java.lang.String str32 = dateTimeZone25.getID();
        org.joda.time.DateTime dateTime33 = localDateTime9.toDateTime(dateTimeZone25);
        org.joda.time.DateTimeField[] dateTimeFieldArray34 = localDateTime9.getFields();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar24", (calendar0.compareTo(calendar24) == 0) == calendar0.equals(calendar24));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long8 = dateTimeField5.getDifferenceAsLong((long) 13, (long) 100);
        long long10 = dateTimeField5.roundHalfFloor((long) (byte) -1);
        boolean boolean11 = dateTimeField5.isLenient();
        long long13 = dateTimeField5.roundHalfCeiling((long) 1377370);
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale15);
        java.lang.String str17 = dateTimeField5.getAsText(26731654, locale15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar16", (calendar0.compareTo(calendar16) == 0) == calendar0.equals(calendar16));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 22);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleAttributes();
        java.lang.String str18 = dateTimeZone12.getName((long) 912, locale16);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone12);
        int int20 = dateTime19.getMillisOfSecond();
        java.util.GregorianCalendar gregorianCalendar21 = dateTime19.toGregorianCalendar();
        gregorianCalendar21.clear();
        java.util.TimeZone timeZone23 = gregorianCalendar21.getTimeZone();
        java.util.Calendar.Builder builder24 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder29 = builder24.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = locale31.getDisplayCountry(locale33);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone43 = mutableDateTime42.getZone();
        long long45 = dateTimeZone40.getMillisKeepLocal(dateTimeZone43, (long) 10);
        java.lang.String str46 = dateTimeZone40.toString();
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale48.toLanguageTag();
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale48.getDisplayCountry(locale50);
        java.lang.String str52 = dateTimeZone40.getName((long) 26487938, locale50);
        java.lang.String str53 = locale50.getDisplayLanguage();
        java.lang.String str54 = locale33.getDisplayName(locale50);
        java.util.Calendar.Builder builder55 = builder29.setLocale(locale50);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone57 = calendar56.getTimeZone();
        java.lang.String str58 = timeZone57.getID();
        java.util.Calendar.Builder builder59 = builder55.setTimeZone(timeZone57);
        java.util.Locale locale60 = java.util.Locale.UK;
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone57, locale60);
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(timeZone57);
        gregorianCalendar21.setTimeZone(timeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar56 and calendar61", (calendar56.compareTo(calendar61) == 0) == calendar56.equals(calendar61));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime dateTime12 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime12.toMutableDateTime(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime18", (dateTime11.compareTo(mutableDateTime18) == 0) == dateTime11.equals(mutableDateTime18));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.lang.String str29 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime17, (int) ' ', locale19);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        java.lang.String str33 = durationFieldType32.toString();
        boolean boolean34 = localTime31.isSupported(durationFieldType32);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime37 = localTime31.withFieldAdded(durationFieldType35, 32772);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localTime37, locale39);
        java.util.Calendar.Builder builder42 = builder0.setLocale(locale39);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone44 = calendar43.getTimeZone();
        java.util.Calendar.Builder builder45 = builder42.setTimeZone(timeZone44);
        java.util.Date date51 = new java.util.Date(100, 4, 6, 0, 22);
        java.util.Date date52 = new java.util.Date();
        boolean boolean53 = date51.before(date52);
        date52.setSeconds(26490127);
        java.util.Calendar.Builder builder56 = builder42.setInstant(date52);
        java.util.Calendar.Builder builder58 = builder42.setLenient(true);
        java.util.Calendar.Builder builder60 = builder58.setInstant((long) 5047);
        java.util.Locale.Category category61 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale62 = java.util.Locale.getDefault(category61);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(1L);
        int int65 = mutableDateTime64.getRoundingMode();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime64.minuteOfDay();
        java.util.Locale locale68 = java.util.Locale.forLanguageTag("07:21");
        java.lang.String str70 = locale68.getExtension('u');
        int int71 = property66.getMaximumShortTextLength(locale68);
        java.util.Locale.setDefault(category61, locale68);
        java.util.Locale locale76 = new java.util.Locale("United Kingdom", "22 June 0130 07:21:42 ", "");
        java.util.Calendar calendar77 = java.util.Calendar.getInstance(locale76);
        java.lang.String str78 = locale76.toLanguageTag();
        java.lang.String str79 = locale68.getDisplayScript(locale76);
        java.util.Calendar.Builder builder80 = builder58.setLocale(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar77", (calendar43.compareTo(calendar77) == 0) == calendar43.equals(calendar77));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 22);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(1L);
        int int8 = mutableDateTime7.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        mutableDateTime10.add(readablePeriod12, (int) (byte) 100);
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean18 = mutableDateTime10.isSupported(dateTimeFieldType17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime10.add(readableDuration19, 6);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        int int26 = dateTimeZone24.getOffset((long) 26512348);
        mutableDateTime10.setZoneRetainFields(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromCalendarFields(calendar30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.withPeriodAdded(readablePeriod35, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.weekyear();
        int int39 = localDateTime37.getWeekyear();
        int int40 = localDateTime37.getWeekOfWeekyear();
        int int41 = localDateTime37.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime37.minusMillis(26684455);
        boolean boolean44 = dateTimeZone24.isLocalDateTimeGap(localDateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime29", (mutableDateTime1.compareTo(mutableDateTime29) == 0) == mutableDateTime1.equals(mutableDateTime29));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone7.observesDaylightTime();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone7);
        java.util.Calendar.Builder builder10 = builder5.setTimeZone(timeZone7);
        java.util.TimeZone.setDefault(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        org.joda.time.MutableDateTime mutableDateTime17 = property14.add(4012L);
        org.joda.time.MutableDateTime mutableDateTime19 = property14.add((long) 7);
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("23:41:00.100");
        int int22 = property14.getMaximumShortTextLength(locale21);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone7, locale21);
        java.util.Locale locale24 = locale21.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar23", (calendar9.compareTo(calendar23) == 0) == calendar9.equals(calendar23));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMinutes(0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plus(readableDuration8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime5.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.plusMinutes(912);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("years");
        boolean boolean15 = timeZone14.observesDaylightTime();
        java.util.Locale locale16 = java.util.Locale.UK;
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.lang.String str22 = locale17.getDisplayScript(locale20);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.lang.String str24 = locale17.getDisplayScript(locale23);
        java.lang.String str25 = locale16.getDisplayLanguage(locale23);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone14, locale16);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        boolean boolean28 = timeZone14.observesDaylightTime();
        boolean boolean29 = timeZone14.observesDaylightTime();
        java.util.Calendar.Builder builder30 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder35 = builder30.setTimeOfDay(26497732, (int) ' ', 0, 11);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("DateTimeField[secondOfDay]");
        java.util.Calendar.Builder builder38 = builder30.setTimeZone(timeZone37);
        int int40 = timeZone37.getOffset((long) 2000);
        boolean boolean41 = timeZone14.hasSameRules(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        boolean boolean43 = localDateTime5.equals((java.lang.Object) dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar26", (calendar0.compareTo(calendar26) == 0) == calendar0.equals(calendar26));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 802);
        org.joda.time.DateTime.Property property2 = dateTime1.year();
        java.lang.String str3 = property2.getAsText();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime8.secondOfMinute();
        int int13 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "halfdays", 0);
        java.util.Locale locale14 = java.util.Locale.getDefault();
        java.util.Calendar calendar15 = mutableDateTime8.toCalendar(locale14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int20 = dateTimeZone18.getStandardOffset(0L);
        long long22 = dateTimeZone18.nextTransition((long) '#');
        mutableDateTime8.setZoneRetainFields(dateTimeZone18);
        mutableDateTime8.setSecondOfDay(441);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.millisOfDay();
        java.lang.String str30 = mutableDateTime27.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int31 = mutableDateTime27.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        org.joda.time.MutableDateTime mutableDateTime35 = property32.add(20);
        boolean boolean36 = mutableDateTime8.isAfter((org.joda.time.ReadableInstant) mutableDateTime35);
        org.joda.time.Instant instant37 = mutableDateTime35.toInstant();
        int int38 = property2.getDifference((org.joda.time.ReadableInstant) instant37);
        java.util.Calendar calendar39 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.fromCalendarFields(calendar39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.monthOfYear();
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.yearOfEra();
        int int45 = localDateTime40.getWeekyear();
        int int46 = localDateTime40.getCenturyOfEra();
        org.joda.time.DateTime dateTime47 = localDateTime40.toDateTime();
        java.util.Calendar calendar48 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.fromCalendarFields(calendar48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField53 = property52.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = dateTimeField53.getType();
        int int55 = localDateTime40.get(dateTimeFieldType54);
        boolean boolean56 = instant37.isSupported(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar39", (calendar15.compareTo(calendar39) == 0) == calendar15.equals(calendar39));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.plusMillis((int) 'a');
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfDay(26551238);
        boolean boolean22 = dateTime19.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        long long27 = dateTimeZone24.convertLocalToUTC((long) 26572, true);
        org.joda.time.DateTime dateTime28 = dateTime19.toDateTime(dateTimeZone24);
        int int29 = dateTime28.getWeekyear();
        org.joda.time.DateTime dateTime31 = dateTime28.minusDays(1671325);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(100L);
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime28.toMutableDateTime(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime35.add(readableDuration36, 26830856);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime28", (dateTime19.compareTo(dateTime28) == 0) == dateTime19.equals(dateTime28));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-10-04T09:22:32.535Z");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = mutableDateTime3.getZone();
        long long6 = dateTimeZone4.previousTransition((-431366460000L));
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfDay();
        org.joda.time.DurationField durationField15 = chronology11.weeks();
        org.joda.time.DurationField durationField16 = chronology11.days();
        mutableDateTime7.setChronology(chronology11);
        mutableDateTime1.setChronology(chronology11);
        org.joda.time.DurationField durationField19 = chronology11.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField15, and durationField16", !(durationField19.compareTo(durationField15) == 0) || (Math.signum(durationField19.compareTo(durationField16)) == Math.signum(durationField15.compareTo(durationField16))));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMillisOfSecond(441);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1L);
        int int13 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime15.add(readablePeriod17, (int) (byte) 100);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        java.util.GregorianCalendar gregorianCalendar21 = mutableDateTime15.toGregorianCalendar();
        int int22 = mutableDateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        mutableDateTime24.setMinuteOfDay(100);
        boolean boolean27 = mutableDateTime24.isAfterNow();
        boolean boolean28 = mutableDateTime24.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(22, 1);
        mutableDateTime24.setZoneRetainFields(dateTimeZone31);
        mutableDateTime15.setZone(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone31);
        int int35 = dateTime10.compareTo((org.joda.time.ReadableInstant) mutableDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and gregorianCalendar21", (calendar0.compareTo(gregorianCalendar21) == 0) == calendar0.equals(gregorianCalendar21));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.dayOfYear();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = localDate22.toInterval(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate22.plusMonths(0);
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        int int28 = localDate26.size();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        org.joda.time.DateTime dateTime37 = localDate26.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = dateTime37.minus((long) 11);
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfYear();
        org.joda.time.DateTime.Property property42 = dateTime40.monthOfYear();
        org.joda.time.DateTime dateTime44 = dateTime40.plusHours((int) 'u');
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean47 = dateTime44.isAfter((long) 26545016);
        org.joda.time.DateTime dateTime49 = dateTime44.minus(1664868225530L);
        org.joda.time.DateTime dateTime51 = dateTime44.plusMonths(2000);
        org.joda.time.LocalDate localDate52 = dateTime44.toLocalDate();
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone54);
        org.joda.time.MutableDateTime.Property property56 = mutableDateTime55.millisOfDay();
        java.lang.String str58 = mutableDateTime55.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int59 = mutableDateTime55.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime55.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        java.lang.String str64 = dateTimeZone63.toString();
        int int66 = dateTimeZone63.getStandardOffset(0L);
        mutableDateTime55.setZone(dateTimeZone63);
        org.joda.time.DateTime dateTime68 = localDate52.toDateTimeAtCurrentTime(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime55", (mutableDateTime12.compareTo(mutableDateTime55) == 0) == mutableDateTime12.equals(mutableDateTime55));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.util.Calendar calendar4 = mutableDateTime1.toCalendar(locale3);
        calendar4.add((int) (short) 10, 12);
        calendar4.set(26549063, 0, 26553846, 26565652, 26522820, 0);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        boolean boolean19 = timeZone18.observesDaylightTime();
        boolean boolean20 = timeZone16.hasSameRules(timeZone18);
        java.util.Locale locale21 = java.util.Locale.UK;
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale22.getDisplayScript(locale25);
        java.util.Locale locale28 = java.util.Locale.UK;
        java.lang.String str29 = locale22.getDisplayScript(locale28);
        java.lang.String str30 = locale21.getDisplayLanguage(locale28);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone16, locale28);
        calendar4.setTimeZone(timeZone16);
        int int33 = calendar4.getMinimalDaysInFirstWeek();
        calendar4.set(26591503, 26609816, 0);
        calendar4.setMinimalDaysInFirstWeek(6027);
        calendar4.setTimeInMillis((long) 26620871);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.fromCalendarFields(calendar42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.minusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusMinutes(0);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.plus(readableDuration50);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray52 = localDateTime47.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.plusMinutes(912);
        boolean boolean55 = calendar4.before((java.lang.Object) localDateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar42", (calendar31.compareTo(calendar42) == 0) == calendar31.equals(calendar42));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset(6044);
        java.time.ZoneId zoneId19 = timeZone1.toZoneId();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone(zoneId19);
        java.lang.String str21 = timeZone20.getID();
        java.util.Locale.Category category22 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale23 = java.util.Locale.getDefault(category22);
        java.util.Locale locale24 = java.util.Locale.getDefault(category22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.Instant instant27 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology28 = instant27.getChronology();
        int int29 = dateTime25.compareTo((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime31 = dateTime25.minusMillis(20);
        org.joda.time.DateTime dateTime33 = dateTime31.minus((long) 48);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.fromCalendarFields(calendar34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        int int38 = localDateTime37.getDayOfYear();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.secondOfMinute();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale41 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withLocale(locale41);
        java.lang.String str43 = property39.getAsShortText(locale41);
        java.util.Locale locale44 = java.util.Locale.UK;
        java.util.Locale locale45 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet46 = locale45.getExtensionKeys();
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.lang.String str50 = locale45.getDisplayScript(locale48);
        java.util.Locale locale51 = java.util.Locale.UK;
        java.lang.String str52 = locale45.getDisplayScript(locale51);
        java.lang.String str53 = locale44.getDisplayLanguage(locale51);
        java.lang.String str54 = locale44.getDisplayCountry();
        java.lang.String str55 = locale44.getDisplayName();
        int int56 = property39.getMaximumShortTextLength(locale44);
        java.util.Calendar calendar57 = dateTime33.toCalendar(locale44);
        java.util.Locale.setDefault(category22, locale44);
        java.lang.String str59 = locale44.getISO3Country();
        java.lang.String str60 = timeZone20.getDisplayName(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar34", (calendar13.compareTo(calendar34) == 0) == calendar13.equals(calendar34));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        java.util.TimeZone timeZone9 = calendar8.getTimeZone();
        int int11 = timeZone9.getOffset(1645488000100L);
        int int12 = timeZone9.getRawOffset();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone9);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar13", (calendar8.compareTo(calendar13) == 0) == calendar8.equals(calendar13));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfDay();
        org.joda.time.DurationField durationField15 = chronology11.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField15, and durationField13", !(durationField13.compareTo(durationField15) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField15.compareTo(durationField13))));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Interval interval3 = localDate1.toInterval(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate1.plusMonths(0);
        org.joda.time.LocalDate.Property property6 = localDate5.year();
        int int7 = localDate5.size();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.minus(readableDuration18);
        org.joda.time.Chronology chronology20 = dateTime16.getChronology();
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology20);
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.monthOfYear();
        org.joda.time.DurationField durationField25 = chronology20.eras();
        org.joda.time.DurationField durationField26 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField26, and durationField25", !(durationField25.compareTo(durationField26) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField26.compareTo(durationField25))));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology3.years();
        org.joda.time.DurationField durationField11 = chronology3.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField10", (durationField7.compareTo(durationField10) == 0) == durationField7.equals(durationField10));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMillisOfSecond(441);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy(26566651);
        java.lang.String str12 = property8.getName();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        boolean boolean17 = mutableDateTime15.isAfter((long) 22);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(10L, dateTimeZone23);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfWeek();
        org.joda.time.DateTime dateTime32 = property30.addToCopy(0L);
        org.joda.time.DateTime dateTime34 = dateTime32.withCenturyOfEra(32770);
        int int35 = property19.compareTo((org.joda.time.ReadableInstant) dateTime34);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("years");
        boolean boolean38 = timeZone37.observesDaylightTime();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.lang.String str45 = locale40.getDisplayScript(locale43);
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale40.getDisplayScript(locale46);
        java.lang.String str48 = locale39.getDisplayLanguage(locale46);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone37, locale39);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTime dateTime51 = dateTime34.toDateTime(dateTimeZone50);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 26839743, dateTimeZone50);
        boolean boolean53 = property8.equals((java.lang.Object) 26839743);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar49", (calendar0.compareTo(calendar49) == 0) == calendar0.equals(calendar49));
    }
}

