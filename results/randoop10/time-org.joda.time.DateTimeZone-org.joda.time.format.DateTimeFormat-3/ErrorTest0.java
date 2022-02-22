import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0001");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = property2.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0002");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime4 = property2.addToCopy((long) 2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0003");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = property2.addToCopy(10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0008");
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
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0009");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime3 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0016");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.withYear((int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0019");
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
        int int22 = dateTimeZone16.getOffset((long) 52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0021");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime3.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0022");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime1.withMillis((long) 54089980);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0023");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0024");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0025");
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
        boolean boolean15 = mutableDateTime13.isAfter((long) 21);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        org.joda.time.DateTime dateTime22 = localTime5.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime1.withZoneRetainFields(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime13", (instant0.compareTo(mutableDateTime13) == 0) == instant0.equals(mutableDateTime13));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0026");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        boolean boolean13 = mutableDateTime11.isAfter((long) 21);
        boolean boolean15 = mutableDateTime11.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        mutableDateTime11.setZone(dateTimeZone18);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale21.getDisplayScript();
        java.lang.String str25 = dateTimeZone18.getShortName((long) 13, locale21);
        org.joda.time.Chronology chronology26 = chronology7.withZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0027");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0029");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0031");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0032");
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
        boolean boolean22 = dateTimeZone16.isStandardOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0033");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime6.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0034");
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
        java.lang.String str11 = property10.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0035");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0036");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        java.lang.String str15 = dateTimeField13.getAsShortText(10L);
        org.joda.time.DurationField durationField16 = dateTimeField13.getDurationField();
        int int17 = dateTime7.get(dateTimeField13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0037");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = chronology3.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField8", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0038");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = property2.setCopy(16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0039");
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
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0041");
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
        org.joda.time.Chronology chronology21 = dateTime1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0042");
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
        long long13 = chronology7.add(readablePeriod10, (long) 54092654, 52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime6", (instant2.compareTo(mutableDateTime6) == 0) == instant2.equals(mutableDateTime6));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant13.withDurationAdded(readableDuration14, (int) (short) 0);
        boolean boolean18 = instant13.isBefore((long) 5);
        java.util.Date date19 = instant13.toDate();
        boolean boolean20 = timeZone10.inDaylightTime(date19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0046");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime11 = instant1.toMutableDateTime(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0047");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0048");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        int int7 = property6.getMinimumValueOverall();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0049");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.DateTime.Property property14 = dateTime13.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime13.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime18 = dateTime13.withWeekyear(2122);
        org.joda.time.DateTime dateTime20 = dateTime13.plusHours(54100989);
        boolean boolean21 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0051");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DurationField durationField4 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0052");
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
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0053");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0054");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
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
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant26", (dateTime18.compareTo(instant26) == 0) == dateTime18.equals(instant26));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0055");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime25.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfFloor();
        mutableDateTime28.setMillisOfDay((int) (byte) 10);
        boolean boolean31 = dateTime19.isAfter((org.joda.time.ReadableInstant) mutableDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant23", (dateTime19.compareTo(instant23) == 0) == dateTime19.equals(instant23));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0056");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = property6.addToCopy((long) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0057");
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        int int22 = localDateTime21.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.era();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        mutableDateTime24.add(durationFieldType26, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.withFieldAdded(durationFieldType26, (int) 'a');
        java.util.Date date31 = localDateTime21.toDate();
        boolean boolean32 = timeZone1.inDaylightTime(date31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar16", (calendar13.compareTo(calendar16) == 0) == calendar13.equals(calendar16));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0058");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DurationField durationField6 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0059");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.Chronology chronology5 = localDate3.getChronology();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime7.getZone();
        org.joda.time.DateTime dateTime10 = localDate3.toDateTimeAtMidnight(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0060");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, 5);
        org.joda.time.Instant instant7 = instant3.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = instant7.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0061");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0062");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        int int6 = dateTime1.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0063");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.Instant instant29 = instant27.plus((long) 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant27", (dateTime21.compareTo(instant27) == 0) == dateTime21.equals(instant27));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        int int11 = dateTimeZone8.getOffsetFromLocal((long) (byte) -1);
        long long13 = dateTimeZone8.previousTransition((long) 1);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime1, dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime7", (instant2.compareTo(mutableDateTime7) == 0) == instant2.equals(mutableDateTime7));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0065");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(1);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withDurationAdded(readableDuration9, 13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0066");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.MutableDateTime mutableDateTime28 = instant27.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant27", (dateTime21.compareTo(instant27) == 0) == dateTime21.equals(instant27));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0067");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        java.lang.String str18 = dateTimeZone15.toString();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone15);
        java.lang.String str20 = dateTimeZone15.toString();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(1645455700681L, dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime7, dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime11", (instant8.compareTo(mutableDateTime11) == 0) == instant8.equals(mutableDateTime11));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0068");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        java.lang.Class<?> wildcardClass10 = dateTime9.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfHour();
        org.joda.time.DateTime dateTime7 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime5", (instant4.compareTo(dateTime5) == 0) == instant4.equals(dateTime5));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0070");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(1);
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0071");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateMidnight dateMidnight19 = dateTime16.toDateMidnight();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter20.getParser();
        java.util.Locale locale24 = dateTimeFormatter20.getLocale();
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology27 = instant26.getChronology();
        org.joda.time.MutableDateTime mutableDateTime28 = org.joda.time.MutableDateTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter20.withChronology(chronology27);
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight19.toMutableDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime28", (dateTime0.compareTo(mutableDateTime28) == 0) == dateTime0.equals(mutableDateTime28));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0072");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0073");
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
        org.joda.time.DateTime.Property property21 = dateTime1.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0074");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant27.withDurationAdded(readableDuration28, 5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant30", (dateTime21.compareTo(instant30) == 0) == dateTime21.equals(instant30));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0075");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfDay();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DateTime dateTime12 = dateTime4.toDateTime(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0076");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfEra(12);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L, dateTimeZone12);
        org.joda.time.DateTime dateTime19 = dateTime1.toDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0077");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime1.plusWeeks((int) ' ');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0078");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.Instant instant10 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime8.withChronology(chronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0079");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField15 = dateTimeField14.getDurationField();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localTime17.isSupported(durationFieldType18);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime23 = localTime17.withFieldAdded(durationFieldType21, 32772);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean27 = localTime25.equals((java.lang.Object) dateTimeFieldType26);
        org.joda.time.LocalTime.Property property28 = localTime17.property(dateTimeFieldType26);
        org.joda.time.LocalTime localTime29 = property28.withMaximumValue();
        int int30 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime34 = localTime29.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime8.toDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0080");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DurationField durationField3 = property2.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0081");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0082");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime6 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.withHourOfDay(13);
        org.joda.time.DateTime.Property property9 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime4.withYearOfEra(12);
        java.lang.String str12 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0083");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime6.plus((-431366459990L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0084");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfCentury();
        mutableDateTime5.setChronology(chronology8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField9", Math.signum(durationField3.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField3)));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0085");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        boolean boolean6 = dateTime1.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0086");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0087");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DurationField durationField9 = chronology3.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.clockhourOfDay();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.toLanguageTag();
        boolean boolean13 = locale11.hasExtensions();
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
        java.lang.String str28 = dateTimeZone16.getName((long) 54089980, locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.lang.String str30 = locale11.getDisplayVariant(locale26);
        int int31 = dateTimeField10.getMaximumTextLength(locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime15", (mutableDateTime8.compareTo(mutableDateTime15) == 0) == mutableDateTime8.equals(mutableDateTime15));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0088");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
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
        org.joda.time.DateTime.Property property27 = dateTime25.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant26", (dateTime18.compareTo(instant26) == 0) == dateTime18.equals(instant26));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0089");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.MutableDateTime mutableDateTime8 = instant2.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        java.lang.String str11 = dateTimeZone9.getNameKey((long) 111);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime8", (instant2.compareTo(mutableDateTime8) == 0) == instant2.equals(mutableDateTime8));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.joda.time.DateTimeField dateTimeField5 = mutableDateTime1.getRoundingField();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.weekOfWeekyear();
        org.joda.time.DateTime dateTime10 = dateTime7.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime7.minus((long) 54101869);
        boolean boolean13 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology10.years();
        mutableDateTime1.setChronology(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField13", (durationField11.compareTo(durationField13) == 0) == durationField11.equals(durationField13));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0092");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime.Property property6 = dateTime1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime9.plus(readableDuration22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0094");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.Instant instant6 = instant2.plus(1645455719673L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundCeiling();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayScript();
        java.util.Calendar calendar8 = mutableDateTime5.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        org.joda.time.Instant instant13 = mutableDateTime10.toInstant();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime10.yearOfCentury();
        mutableDateTime5.setMillis((org.joda.time.ReadableInstant) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and instant13", (mutableDateTime5.compareTo(instant13) == 0) == mutableDateTime5.equals(instant13));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0096");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime1.getZone();
        int int5 = dateTimeZone3.getOffset((long) 'u');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0097");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property4 = dateTime3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0098");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0099");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime1.getZone();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0100");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.DateTime dateTime8 = instant2.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime9 = instant2.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime8", (instant2.compareTo(dateTime8) == 0) == instant2.equals(dateTime8));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0101");
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
        org.joda.time.DateTime dateTime13 = dateTime1.plusMonths(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.getMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant4", (mutableDateTime6.compareTo(instant4) == 0) == mutableDateTime6.equals(instant4));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0103");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(0);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.minus((long) 13);
        org.joda.time.DateTime dateTime13 = instant10.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType14.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.millisOfSecond();
        java.lang.String str20 = chronology17.toString();
        org.joda.time.DateTime dateTime21 = dateTime13.withChronology(chronology17);
        org.joda.time.DateTime dateTime22 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
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
        java.lang.String str64 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localTime9, locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime13", (instant10.compareTo(dateTime13) == 0) == instant10.equals(dateTime13));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime22 = dateTime9.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0105");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks(54107140);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0106");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.year();
        org.joda.time.DurationField durationField7 = chronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0107");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0108");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.Instant instant9 = new org.joda.time.Instant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) (short) 100);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, 5);
        org.joda.time.Instant instant16 = instant12.toInstant();
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        boolean boolean18 = instant6.isEqual((org.joda.time.ReadableInstant) instant16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime17", (instant16.compareTo(dateTime17) == 0) == instant16.equals(dateTime17));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0109");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime1.withLaterOffsetAtOverlap();
        java.lang.String str7 = dateTime6.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime6", (instant0.compareTo(dateTime6) == 0) == instant0.equals(dateTime6));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0110");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        java.lang.String str14 = dateTimeZone8.toString();
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone8);
        int int16 = localDate4.getCenturyOfEra();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        boolean boolean19 = timeZone18.observesDaylightTime();
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
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone18, locale20);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        int int33 = dateTimeZone31.getOffset((long) 52);
        org.joda.time.DateTime dateTime34 = localDate4.toDateTimeAtStartOfDay(dateTimeZone31);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 54110417, dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime34", (dateTime15.compareTo(dateTime34) == 0) == dateTime15.equals(dateTime34));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0111");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.millisOfSecond();
        java.lang.String str10 = chronology7.toString();
        org.joda.time.DateTime dateTime11 = dateTime3.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone15.previousTransition((-431366460000L));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((-1L), dateTimeZone15);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime11.withZoneRetainFields(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0112");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime.Property property6 = dateTime5.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0113");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.millisOfSecond();
        java.lang.String str10 = chronology7.toString();
        org.joda.time.DateTime dateTime11 = dateTime3.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        boolean boolean15 = mutableDateTime13.isAfter((long) 21);
        boolean boolean17 = mutableDateTime13.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        mutableDateTime13.setZone(dateTimeZone20);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.lang.String str26 = locale23.getDisplayScript();
        java.lang.String str27 = dateTimeZone20.getShortName((long) 13, locale23);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.fromCalendarFields(calendar28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds(0);
        boolean boolean34 = dateTimeZone20.isLocalDateTimeGap(localDateTime31);
        org.joda.time.Chronology chronology35 = localDateTime31.getChronology();
        long long37 = chronology7.set((org.joda.time.ReadablePartial) localDateTime31, 194766091200000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.property(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime12 = property10.add((long) 1);
        org.joda.time.Instant instant13 = mutableDateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        mutableDateTime15.setMinuteOfDay(100);
        boolean boolean18 = mutableDateTime15.isAfterNow();
        mutableDateTime15.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str22 = dateTimeFieldType21.toString();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType21.getDurationType();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime15.property(dateTimeFieldType21);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(1L);
        int int27 = mutableDateTime26.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.era();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        mutableDateTime29.add(readablePeriod31, (int) (byte) 100);
        mutableDateTime26.setTime((org.joda.time.ReadableInstant) mutableDateTime29);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) mutableDateTime26);
        boolean boolean36 = mutableDateTime12.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant13", (mutableDateTime12.compareTo(instant13) == 0) == mutableDateTime12.equals(instant13));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0115");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now();
        mutableDateTime20.setWeekyear(20);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime20.copy();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime20.secondOfDay();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property26 = dateTime25.monthOfYear();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime28 = dateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes(7);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate33 = localDate31.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        long long42 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(10L, dateTimeZone37);
        long long45 = dateTimeZone37.nextTransition((long) 12);
        org.joda.time.DateTime dateTime46 = localDate31.toDateTimeAtMidnight(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.era();
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.now();
        int int51 = localDate50.getDayOfMonth();
        org.joda.time.LocalDate localDate53 = localDate50.plusYears((int) (byte) 100);
        org.joda.time.Interval interval54 = localDate53.toInterval();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(dateTimeZone55);
        org.joda.time.DateTimeZone dateTimeZone57 = mutableDateTime56.getZone();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        long long62 = dateTimeZone57.getMillisKeepLocal(dateTimeZone60, (long) 10);
        java.lang.String str63 = dateTimeZone57.toString();
        org.joda.time.DateTime dateTime64 = localDate53.toDateTimeAtMidnight(dateTimeZone57);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime48.toMutableDateTime(dateTimeZone57);
        mutableDateTime48.addDays(0);
        mutableDateTime48.addMillis(9);
        boolean boolean70 = dateTimeZone37.equals((java.lang.Object) 9);
        org.joda.time.DateTime dateTime71 = dateTime30.toDateTime(dateTimeZone37);
        java.lang.String str72 = dateTimeZone37.getID();
        java.util.TimeZone timeZone73 = dateTimeZone37.toTimeZone();
        mutableDateTime20.setZone(dateTimeZone37);
        org.joda.time.DateTime dateTime75 = dateTime19.toDateTime(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0116");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale8.getDisplayScript(locale9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale11.toLanguageTag();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale11.getDisplayCountry(locale13);
        java.lang.String str15 = locale9.getDisplayCountry(locale11);
        int int16 = dateTimeField7.getMaximumTextLength(locale9);
        java.lang.String str17 = locale9.getVariant();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = localTime19.isSupported(durationFieldType20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime25 = localTime19.withFieldAdded(durationFieldType23, 32772);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime27 = property26.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime27.minus(readablePeriod28);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.Instant instant32 = instant30.withMillis((long) (short) 100);
        org.joda.time.Instant instant33 = instant32.toInstant();
        boolean boolean34 = localTime29.equals((java.lang.Object) instant32);
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
        java.lang.String str50 = localTime29.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale39);
        java.lang.String str51 = locale9.getDisplayName(locale39);
        java.lang.String str52 = locale39.getISO3Country();
        java.util.Locale.Builder builder53 = builder2.setLocale(locale39);
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale54.toLanguageTag();
        boolean boolean56 = locale54.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(dateTimeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = mutableDateTime58.getZone();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone62 = mutableDateTime61.getZone();
        long long64 = dateTimeZone59.getMillisKeepLocal(dateTimeZone62, (long) 10);
        java.lang.String str65 = dateTimeZone59.toString();
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.lang.String str68 = locale67.toLanguageTag();
        java.util.Locale locale69 = java.util.Locale.KOREA;
        java.lang.String str70 = locale67.getDisplayCountry(locale69);
        java.lang.String str71 = dateTimeZone59.getName((long) 54089980, locale69);
        java.lang.String str72 = locale69.getDisplayLanguage();
        java.lang.String str73 = locale54.getDisplayVariant(locale69);
        java.util.Locale.Builder builder74 = builder53.setLocale(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime58", (instant30.compareTo(mutableDateTime58) == 0) == instant30.equals(mutableDateTime58));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0117");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property20 = dateTime19.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0118");
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
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime21", (instant0.compareTo(dateTime21) == 0) == instant0.equals(dateTime21));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0119");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds(0);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.Instant instant6 = instant4.minus((long) 13);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        java.lang.String str14 = chronology11.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalTime localTime18 = localTime3.plusMinutes(86399999);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0120");
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
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime();
        boolean boolean20 = localDate4.equals((java.lang.Object) dateTime19);
        org.joda.time.LocalDate.Property property21 = localDate4.weekyear();
        org.joda.time.LocalDate localDate22 = property21.withMinimumValue();
        int int23 = localDate22.getDayOfYear();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant26.withDurationAdded(readableDuration27, (int) (short) 0);
        boolean boolean31 = instant26.isBefore((long) 5);
        java.util.Date date32 = instant26.toDate();
        int int33 = date32.getYear();
        int int34 = date32.getTimezoneOffset();
        boolean boolean35 = localDate22.equals((java.lang.Object) int34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant24", (mutableDateTime8.compareTo(instant24) == 0) == mutableDateTime8.equals(instant24));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0121");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime6.withSecondOfMinute(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0122");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 54112806, 54121606);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime15 = localTime9.withFieldAdded(durationFieldType13, 32772);
        org.joda.time.LocalTime.Property property16 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime9.minusMinutes(19);
        org.joda.time.DateTime dateTime19 = localTime18.toDateTimeToday();
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime22 = property20.addToCopy(0L);
        boolean boolean23 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0123");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime7 = dateTime1.toDateTime();
        int int8 = dateTime7.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0124");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (short) 100);
        org.joda.time.Instant instant15 = instant14.toInstant();
        boolean boolean16 = localTime11.equals((java.lang.Object) instant14);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("years");
        boolean boolean20 = timeZone19.observesDaylightTime();
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
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone19, locale21);
        java.lang.String str32 = localTime11.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale21);
        org.joda.time.LocalTime localTime34 = localTime11.minusHours(54106168);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.years();
        java.lang.String str39 = durationFieldType38.toString();
        boolean boolean40 = localTime37.isSupported(durationFieldType38);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime43 = localTime37.withFieldAdded(durationFieldType41, 32772);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        boolean boolean47 = mutableDateTime45.isAfter((long) 21);
        boolean boolean49 = mutableDateTime45.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        mutableDateTime45.setZone(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = localTime37.toDateTimeToday(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(19L, dateTimeZone52);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology59 = localTime58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType56.getField(chronology59);
        mutableDateTime55.set(dateTimeFieldType56, (int) '#');
        org.joda.time.DateTime dateTime63 = localTime11.toDateTime((org.joda.time.ReadableInstant) mutableDateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime45", (instant12.compareTo(mutableDateTime45) == 0) == instant12.equals(mutableDateTime45));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0125");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.MutableDateTime mutableDateTime8 = instant2.toMutableDateTime();
        org.joda.time.Chronology chronology9 = instant2.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime8", (instant2.compareTo(mutableDateTime8) == 0) == instant2.equals(mutableDateTime8));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = dateTime9.withDurationAdded(readableDuration22, 54126);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0127");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime14 = dateTime6.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime6.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime16.minus((long) 985);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime16", (instant5.compareTo(dateTime16) == 0) == instant5.equals(dateTime16));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0128");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.LocalDate localDate7 = dateTime6.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        mutableDateTime1.addMillis(10);
        mutableDateTime1.addDays(100);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale24.toLanguageTag();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale24.getDisplayCountry(locale26);
        java.lang.String str28 = locale22.getDisplayCountry(locale24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        java.lang.String str37 = dateTimeZone31.toString();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale39.toLanguageTag();
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale39.getDisplayCountry(locale41);
        java.lang.String str43 = dateTimeZone31.getName((long) 54089980, locale41);
        java.lang.String str44 = locale41.getDisplayLanguage();
        java.lang.String str45 = locale24.getDisplayName(locale41);
        java.util.Calendar calendar46 = mutableDateTime1.toCalendar(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime19", (mutableDateTime7.compareTo(mutableDateTime19) == 0) == mutableDateTime7.equals(mutableDateTime19));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0130");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime6.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime14", (instant5.compareTo(mutableDateTime14) == 0) == instant5.equals(mutableDateTime14));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0131");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 54092654);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant26", (dateTime19.compareTo(instant26) == 0) == dateTime19.equals(instant26));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0132");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, 279);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0133");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime3.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0134");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) '4', 54092146, 54104989, 7);
        java.util.Calendar.Builder builder9 = builder5.setTimeOfDay(121, 15, (int) (short) 1);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        boolean boolean12 = calendar10.isWeekDateSupported();
        calendar10.setFirstDayOfWeek(5);
        calendar10.setMinimalDaysInFirstWeek((-1));
        java.util.Date date17 = calendar10.getTime();
        java.util.TimeZone timeZone18 = calendar10.getTimeZone();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone18);
        java.util.Calendar.Builder builder20 = builder9.setTimeZone(timeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar19", (calendar10.compareTo(calendar19) == 0) == calendar10.equals(calendar19));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0135");
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
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        long long25 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) 10);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.DateTime dateTime27 = dateTime16.withZone(dateTimeZone23);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
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
        int int44 = localDate32.getCenturyOfEra();
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
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        int int61 = dateTimeZone59.getOffset((long) 52);
        org.joda.time.DateTime dateTime62 = localDate32.toDateTimeAtStartOfDay(dateTimeZone59);
        org.joda.time.DateTime dateTime63 = dateTime27.withZoneRetainFields(dateTimeZone59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime62", (dateTime14.compareTo(dateTime62) == 0) == dateTime14.equals(dateTime62));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0136");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfEra(12);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.lang.String str11 = timeZone10.getID();
        boolean boolean12 = timeZone10.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType14.getField(chronology17);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale19.getDisplayScript(locale20);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.lang.String str26 = locale20.getDisplayCountry(locale22);
        int int27 = dateTimeField18.getMaximumTextLength(locale20);
        java.lang.String str28 = locale20.getVariant();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime.Property property37 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime38 = property37.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime38.minus(readablePeriod39);
        org.joda.time.Instant instant41 = new org.joda.time.Instant();
        org.joda.time.Instant instant43 = instant41.withMillis((long) (short) 100);
        org.joda.time.Instant instant44 = instant43.toInstant();
        boolean boolean45 = localTime40.equals((java.lang.Object) instant43);
        java.util.TimeZone timeZone48 = java.util.TimeZone.getTimeZone("years");
        boolean boolean49 = timeZone48.observesDaylightTime();
        java.util.Locale locale50 = java.util.Locale.UK;
        java.util.Locale locale51 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet52 = locale51.getExtensionKeys();
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.util.Locale locale54 = java.util.Locale.KOREA;
        java.lang.String str55 = locale53.getDisplayScript(locale54);
        java.lang.String str56 = locale51.getDisplayScript(locale54);
        java.util.Locale locale57 = java.util.Locale.UK;
        java.lang.String str58 = locale51.getDisplayScript(locale57);
        java.lang.String str59 = locale50.getDisplayLanguage(locale57);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone48, locale50);
        java.lang.String str61 = localTime40.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale50);
        java.lang.String str62 = locale20.getDisplayName(locale50);
        java.util.Set<java.lang.String> strSet63 = locale20.getUnicodeLocaleKeys();
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone10, locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant41", (mutableDateTime1.compareTo(instant41) == 0) == mutableDateTime1.equals(instant41));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0138");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.year();
        org.joda.time.DurationField durationField7 = chronology2.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0139");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.MutableDateTime mutableDateTime8 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = instant2.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime8", (instant2.compareTo(mutableDateTime8) == 0) == instant2.equals(mutableDateTime8));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0140");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date7 = calendar0.getTime();
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        int int14 = dateTimeZone12.getStandardOffset(0L);
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        boolean boolean16 = timeZone8.hasSameRules(timeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant2.minus(readableDuration6);
        org.joda.time.Instant instant9 = instant2.plus((long) 16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0142");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime14 = dateTime6.minusMillis((int) (short) -1);
        org.joda.time.DateTime.Property property15 = dateTime14.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0143");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime1.plusMinutes(1501);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0144");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 54112806, 54121606);
        int int8 = dateTime7.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0145");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField5", (durationField3.compareTo(durationField5) == 0) == durationField3.equals(durationField5));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0146");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean22 = localTime20.equals((java.lang.Object) dateTimeFieldType21);
        org.joda.time.LocalTime.Property property23 = localTime12.property(dateTimeFieldType21);
        int int24 = localTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime.Property property26 = localTime12.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0147");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.plusMonths(54098460);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.withDurationAdded(readableDuration11, (int) 'a');
        java.util.GregorianCalendar gregorianCalendar14 = dateTime13.toGregorianCalendar();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.withHourOfDay(13);
        boolean boolean21 = gregorianCalendar14.equals((java.lang.Object) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime16", (instant15.compareTo(dateTime16) == 0) == instant15.equals(dateTime16));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0148");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        long long3 = instant0.getMillis();
        org.joda.time.DateTime dateTime4 = instant0.toDateTimeISO();
        org.joda.time.Instant instant6 = instant0.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0149");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0150");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean9 = localDateTime7.equals((java.lang.Object) nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = nameProvider8.getName(locale11, "eng", "21 June 0130 15:01:51 ");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale16);
        java.lang.String str22 = nameProvider8.getShortName(locale16, "Coordinated Universal Time", "minuteOfDay");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar19", (calendar0.compareTo(calendar19) == 0) == calendar0.equals(calendar19));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0151");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date7 = calendar0.getTime();
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        int int10 = timeZone8.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0152");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        int int21 = dateTimeZone15.getStandardOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0153");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0154");
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
        org.joda.time.DateTime dateTime13 = dateTime1.plusMonths(54117498);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0155");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        java.lang.String str20 = dateTimeZone15.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths(0);
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateMidnight dateMidnight19 = localDate9.toDateMidnight(dateTimeZone13);
        mutableDateTime1.setZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime12", (instant4.compareTo(mutableDateTime12) == 0) == instant4.equals(mutableDateTime12));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0157");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime.Property property6 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0158");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = dateTimeFormatter28.getPrinter();
        boolean boolean30 = dateTimeFormatter28.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter28.withPivotYear((java.lang.Integer) 901);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter28.withDefaultYear(32772);
        java.lang.String str35 = instant27.toString(dateTimeFormatter34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant27", (dateTime21.compareTo(instant27) == 0) == dateTime21.equals(instant27));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.Locale.Builder builder6 = new java.util.Locale.Builder();
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder8 = builder6.setLocale(locale7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale17.getDisplayCountry(locale19);
        java.lang.String str21 = locale15.getDisplayCountry(locale17);
        int int22 = dateTimeField13.getMaximumTextLength(locale15);
        java.lang.String str23 = locale15.getVariant();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = localTime25.isSupported(durationFieldType26);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime31 = localTime25.withFieldAdded(durationFieldType29, 32772);
        org.joda.time.LocalTime.Property property32 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime33.minus(readablePeriod34);
        org.joda.time.Instant instant36 = new org.joda.time.Instant();
        org.joda.time.Instant instant38 = instant36.withMillis((long) (short) 100);
        org.joda.time.Instant instant39 = instant38.toInstant();
        boolean boolean40 = localTime35.equals((java.lang.Object) instant38);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getTimeZone("years");
        boolean boolean44 = timeZone43.observesDaylightTime();
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
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone43, locale45);
        java.lang.String str56 = localTime35.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale45);
        java.lang.String str57 = locale15.getDisplayName(locale45);
        java.lang.String str58 = locale45.getISO3Country();
        java.util.Locale.Builder builder59 = builder8.setLocale(locale45);
        java.lang.String str60 = dateTimeZone2.getShortName((long) 54142136, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant36", (mutableDateTime1.compareTo(instant36) == 0) == mutableDateTime1.equals(instant36));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0160");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.DateTime dateTime8 = instant2.toDateTimeISO();
        org.joda.time.DateTime dateTime9 = instant2.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime8", (instant2.compareTo(dateTime8) == 0) == instant2.equals(dateTime8));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0161");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime.Property property7 = dateTime1.yearOfEra();
        org.joda.time.DateTime dateTime9 = property7.addWrapFieldToCopy(985);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0162");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds(0);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.Instant instant6 = instant4.minus((long) 13);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        java.lang.String str14 = chronology11.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property17 = dateTime7.year();
        int int18 = property17.getLeapAmount();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0163");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant27.minus(readableDuration28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant29", (dateTime21.compareTo(instant29) == 0) == dateTime21.equals(instant29));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        mutableDateTime1.addMillis(10);
        mutableDateTime1.addDays(100);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology17);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime19", (mutableDateTime7.compareTo(mutableDateTime19) == 0) == mutableDateTime7.equals(mutableDateTime19));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0165");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        int int4 = dateTime0.compareTo((org.joda.time.ReadableInstant) instant2);
        org.joda.time.DateTime dateTime6 = dateTime0.minusMillis(20);
        org.joda.time.LocalTime localTime7 = dateTime6.toLocalTime();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean10 = instant8.isSupported(dateTimeFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getDurationType();
        int int12 = dateTime6.get(dateTimeFieldType9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant8", (dateTime0.compareTo(instant8) == 0) == dateTime0.equals(instant8));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.year();
        long long6 = mutableDateTime4.getMillis();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.Instant instant9 = instant7.minus((long) 13);
        org.joda.time.Instant instant11 = instant9.minus((long) 901);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.era();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.ReadableDuration readableDuration20 = null;
        mutableDateTime18.add(readableDuration20, 0);
        mutableDateTime16.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = localTime25.isSupported(durationFieldType26);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime31 = localTime25.withFieldAdded(durationFieldType29, 32772);
        org.joda.time.LocalTime.Property property32 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalTime localTime35 = property32.addCopy(19);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean39 = localTime37.equals((java.lang.Object) dateTimeFieldType38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType40.getField(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType38.getField(chronology43);
        boolean boolean48 = localTime35.isSupported(dateTimeFieldType38);
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType38.getDurationType();
        int int50 = mutableDateTime18.get(dateTimeFieldType38);
        int int51 = instant11.get(dateTimeFieldType38);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime4.property(dateTimeFieldType38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant7", (mutableDateTime1.compareTo(instant7) == 0) == mutableDateTime1.equals(instant7));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(21);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime11.getZone();
        mutableDateTime1.setZoneRetainFields(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant10", (mutableDateTime4.compareTo(instant10) == 0) == mutableDateTime4.equals(instant10));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0168");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 54112806, 54121606);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0169");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime22 = dateTime19.withDurationAdded((long) 54113472, 61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        int int4 = mutableDateTime1.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime6.millisOfDay();
        java.lang.String str9 = mutableDateTime6.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int10 = mutableDateTime6.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfMinute();
        org.joda.time.Chronology chronology12 = mutableDateTime6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime1.toMutableDateTime(chronology12);
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTime();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, (int) (short) 0);
        boolean boolean22 = instant17.isBefore((long) 5);
        java.util.Date date23 = instant17.toDate();
        org.joda.time.Instant instant24 = new org.joda.time.Instant((java.lang.Object) instant17);
        boolean boolean25 = mutableDateTime14.isEqual((org.joda.time.ReadableInstant) instant17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant15", (mutableDateTime1.compareTo(instant15) == 0) == mutableDateTime1.equals(instant15));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0171");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, 12);
        java.util.Date date24 = localDate23.toDate();
        java.util.Date date25 = new java.util.Date();
        date25.setMinutes(12);
        boolean boolean28 = date24.before(date25);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant34 = instant31.withDurationAdded(readableDuration32, (int) (short) 0);
        boolean boolean36 = instant31.isBefore((long) 5);
        java.util.Date date37 = instant31.toDate();
        java.lang.String str38 = date37.toLocaleString();
        java.lang.String str39 = date37.toLocaleString();
        boolean boolean40 = date25.after(date37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant29", (mutableDateTime8.compareTo(instant29) == 0) == mutableDateTime8.equals(instant29));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0172");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = property32.roundCeilingCopy();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(1L);
        int int37 = mutableDateTime36.getRoundingMode();
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime36.year();
        mutableDateTime36.addHours(40);
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.fromCalendarFields(calendar41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.plusSeconds(0);
        int int47 = localDateTime46.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType49 = dateTimeFieldType48.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withFieldAdded(durationFieldType49, (int) (byte) 1);
        org.joda.time.DateTime dateTime52 = localDateTime46.toDateTime();
        boolean boolean53 = mutableDateTime36.isBefore((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime36.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = mutableDateTime36.getZone();
        org.joda.time.DateTime dateTime56 = dateTime33.withZoneRetainFields(dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime23", (instant0.compareTo(mutableDateTime23) == 0) == instant0.equals(mutableDateTime23));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0173");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime1.plusMinutes(1501);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(54125287);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0174");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.Instant instant5 = instant0.withMillis((long) 32);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant7 = instant5.plus(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0175");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) (short) 100);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 5);
        org.joda.time.DateTime dateTime12 = instant11.toDateTime();
        int int13 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) instant11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime12", (instant11.compareTo(dateTime12) == 0) == instant11.equals(dateTime12));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0176");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withDurationAdded(readableDuration18, 14);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime14.withFields(readablePartial21);
        boolean boolean23 = calendar10.before((java.lang.Object) localDateTime22);
        java.lang.String str24 = localDateTime22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar11", (calendar10.compareTo(calendar11) == 0) == calendar10.equals(calendar11));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0178");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int5 = localTime4.size();
        org.joda.time.LocalTime localTime7 = localTime4.plusMinutes(6);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime13 = dateTime9.withHourOfDay(13);
        org.joda.time.DateTime.Property property14 = dateTime9.centuryOfEra();
        boolean boolean15 = localTime4.equals((java.lang.Object) dateTime9);
        org.joda.time.DateTime dateTime17 = dateTime9.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime9.minus(readableDuration18);
        boolean boolean20 = locale1.equals((java.lang.Object) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime19", (instant8.compareTo(dateTime19) == 0) == instant8.equals(dateTime19));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0179");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        long long10 = dateTimeZone5.getMillisKeepLocal(dateTimeZone8, (long) 10);
        java.lang.String str11 = dateTimeZone5.toString();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale13.getDisplayCountry(locale15);
        java.lang.String str17 = dateTimeZone5.getName((long) 54089980, locale15);
        java.lang.String str18 = locale15.getDisplayLanguage();
        java.lang.String str19 = locale0.getDisplayVariant(locale15);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale0);
        int int22 = calendar20.getMinimum(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType23.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField29 = chronology26.eras();
        org.joda.time.MutableDateTime mutableDateTime30 = org.joda.time.MutableDateTime.now(chronology26);
        boolean boolean31 = calendar20.before((java.lang.Object) chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime30", (mutableDateTime4.compareTo(mutableDateTime30) == 0) == mutableDateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0180");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0181");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime10 = dateTime8.minusYears(54101869);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0182");
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
        org.joda.time.DateTime dateTime19 = dateTime17.minusYears(54117389);
        org.joda.time.DateTime.Property property20 = dateTime17.year();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime22.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime27 = dateTime22.withLaterOffsetAtOverlap();
        boolean boolean28 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant21", (mutableDateTime8.compareTo(instant21) == 0) == mutableDateTime8.equals(instant21));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0183");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        boolean boolean22 = localTime8.equals((java.lang.Object) chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.DateTime dateTime26 = dateTime1.toDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0184");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField6", (durationField3.compareTo(durationField6) == 0) == durationField3.equals(durationField6));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0185");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        boolean boolean2 = calendar1.isWeekDateSupported();
        int int4 = calendar1.getLeastMaximum(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        boolean boolean7 = calendar5.isWeekDateSupported();
        calendar5.setFirstDayOfWeek(5);
        calendar5.setMinimalDaysInFirstWeek((-1));
        java.util.Date date12 = calendar5.getTime();
        java.util.TimeZone timeZone13 = calendar5.getTimeZone();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone13);
        calendar1.setTimeZone(timeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar14", (calendar5.compareTo(calendar14) == 0) == calendar5.equals(calendar14));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0186");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("2022-02-21T15:00:33.584");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        long long10 = dateTimeZone5.getMillisKeepLocal(dateTimeZone8, (long) 10);
        java.lang.String str11 = dateTimeZone8.toString();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone8);
        java.util.TimeZone timeZone13 = dateTimeZone8.toTimeZone();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone13);
        calendar2.setTimeZone(timeZone13);
        boolean boolean16 = timeZone13.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar14", (calendar2.compareTo(calendar14) == 0) == calendar2.equals(calendar14));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10, locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int18 = dateTimeZone16.getStandardOffset(0L);
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        int int20 = timeZone19.getRawOffset();
        boolean boolean21 = timeZone10.hasSameRules(timeZone19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str29 = dateTimeFieldType28.toString();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType28.getDurationType();
        boolean boolean31 = localDateTime25.isSupported(durationFieldType30);
        java.util.Date date32 = localDateTime25.toDate();
        boolean boolean33 = timeZone10.inDaylightTime(date32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar22", (calendar13.compareTo(calendar22) == 0) == calendar13.equals(calendar22));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0188");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0189");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
        org.joda.time.Instant instant15 = instant2.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime14", (instant15.compareTo(mutableDateTime14) == 0) == instant15.equals(mutableDateTime14));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0190");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime24 = dateTime19.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime19.minusYears(2030);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant32 = instant29.withDurationAdded(readableDuration30, (int) (short) 0);
        boolean boolean34 = instant29.isBefore((long) 5);
        java.util.Date date35 = instant29.toDate();
        int int36 = date35.getYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) date35, dateTimeZone39);
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone39);
        boolean boolean44 = dateTimeZone39.isStandardOffset((long) 5);
        org.joda.time.DateTime dateTime45 = dateTime19.toDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and instant27", (mutableDateTime12.compareTo(instant27) == 0) == mutableDateTime12.equals(instant27));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.Instant instant11 = instant2.plus((long) 13);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0192");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        int int3 = dateTime2.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0193");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        int int6 = dateTimeZone3.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(obj0, dateTimeZone3);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        java.lang.String str13 = durationFieldType12.toString();
        boolean boolean14 = localTime11.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime17 = localTime11.withFieldAdded(durationFieldType15, 32772);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        boolean boolean21 = mutableDateTime19.isAfter((long) 21);
        boolean boolean23 = mutableDateTime19.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        mutableDateTime19.setZone(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localTime11.toDateTimeToday(dateTimeZone26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(19L, dateTimeZone26);
        org.joda.time.Instant instant30 = mutableDateTime29.toInstant();
        org.joda.time.DateTime dateTime31 = localTime7.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTime.Property property32 = dateTime31.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant30", (mutableDateTime29.compareTo(instant30) == 0) == mutableDateTime29.equals(instant30));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0194");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime1.getZone();
        long long5 = dateTimeZone3.nextTransition((-87L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0195");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(6);
        org.joda.time.DateTime dateTime20 = dateTime16.plusMinutes((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight21 = dateTime16.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime16.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(874L);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean27 = instant25.isSupported(dateTimeFieldType26);
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType26.getDurationType();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.withField(dateTimeFieldType26, 18);
        int int31 = mutableDateTime22.get(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant25", (dateTime0.compareTo(instant25) == 0) == dateTime0.equals(instant25));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0196");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        java.lang.String str13 = durationFieldType12.toString();
        boolean boolean14 = localTime11.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime17 = localTime11.withFieldAdded(durationFieldType15, 32772);
        org.joda.time.LocalTime.Property property18 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime11.minusMinutes(2922789);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.lang.String str28 = locale23.getDisplayScript(locale26);
        java.util.Locale locale29 = java.util.Locale.UK;
        java.lang.String str30 = locale23.getDisplayScript(locale29);
        java.lang.String str31 = locale22.getDisplayLanguage(locale29);
        java.lang.String str32 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime20, (int) ' ', locale22);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale22);
        java.util.Locale.Builder builder34 = builder3.setLocale(locale22);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        long long42 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        java.lang.String str43 = dateTimeZone40.toString();
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone40);
        java.util.TimeZone timeZone45 = dateTimeZone40.toTimeZone();
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone45, locale47);
        java.lang.String str49 = locale47.getLanguage();
        java.lang.String str50 = locale47.getVariant();
        java.util.Locale.Builder builder51 = builder3.setLocale(locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar33 and calendar48", (calendar33.compareTo(calendar48) == 0) == calendar33.equals(calendar48));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0197");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        int int6 = localDateTime5.size();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("years");
        boolean boolean10 = timeZone9.observesDaylightTime();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.util.Locale locale18 = java.util.Locale.UK;
        java.lang.String str19 = locale12.getDisplayScript(locale18);
        java.lang.String str20 = locale11.getDisplayLanguage(locale18);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone9, locale11);
        java.lang.String str22 = locale11.getISO3Language();
        boolean boolean23 = localDateTime5.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar21", (calendar0.compareTo(calendar21) == 0) == calendar0.equals(calendar21));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0198");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now();
        boolean boolean10 = mutableDateTime9.isAfterNow();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime9.add(readableDuration11, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        boolean boolean22 = dateTimeZone19.isFixed();
        mutableDateTime9.setZoneRetainFields(dateTimeZone19);
        mutableDateTime6.setZoneRetainFields(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType26.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.DurationField durationField32 = dateTimeField31.getDurationField();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        java.lang.String str36 = durationFieldType35.toString();
        boolean boolean37 = localTime34.isSupported(durationFieldType35);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime40 = localTime34.withFieldAdded(durationFieldType38, 32772);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean44 = localTime42.equals((java.lang.Object) dateTimeFieldType43);
        org.joda.time.LocalTime.Property property45 = localTime34.property(dateTimeFieldType43);
        org.joda.time.LocalTime localTime46 = property45.withMaximumValue();
        int int47 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime51 = localTime46.toDateTimeToday(dateTimeZone50);
        mutableDateTime25.setZone(dateTimeZone50);
        mutableDateTime1.setZoneRetainFields(dateTimeZone50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime25", (mutableDateTime6.compareTo(mutableDateTime25) == 0) == mutableDateTime6.equals(mutableDateTime25));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0199");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.withField(dateTimeFieldType20, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime22.toMutableDateTime(dateTimeZone25);
        int int32 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0200");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.Chronology chronology7 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0201");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale1.getDisplayScript(locale7);
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale10.getDisplayScript(locale11);
        java.lang.String str14 = locale7.getDisplayCountry(locale10);
        java.util.Locale locale15 = locale7.stripExtensions();
        java.util.Set<java.lang.String> strSet16 = locale7.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        boolean boolean20 = mutableDateTime18.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime18.toMutableDateTime();
        mutableDateTime18.addDays(19);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime18.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime26 = property24.roundCeiling();
        boolean boolean27 = strSet16.contains((java.lang.Object) property24);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList34);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream37 = languageRangeList29.parallelStream();
        boolean boolean38 = strSet16.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.util.Iterator<java.lang.String> strItor39 = strSet16.iterator();
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.weekOfWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime41.withCenturyOfEra((int) '#');
        int int45 = dateTime41.getSecondOfDay();
        org.joda.time.DateTime.Property property46 = dateTime41.yearOfCentury();
        boolean boolean47 = strSet16.equals((java.lang.Object) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime21 and instant40", (mutableDateTime21.compareTo(instant40) == 0) == mutableDateTime21.equals(instant40));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0202");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = mutableDateTime4.toInstant();
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0203");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0204");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime10 = dateTime1.plusDays(2019);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0205");
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
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.toLanguageTag();
        boolean boolean16 = locale14.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 10);
        java.lang.String str25 = dateTimeZone19.toString();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale27.toLanguageTag();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale27.getDisplayCountry(locale29);
        java.lang.String str31 = dateTimeZone19.getName((long) 54089980, locale29);
        java.lang.String str32 = locale29.getDisplayLanguage();
        java.lang.String str33 = locale14.getDisplayVariant(locale29);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale14);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Language();
        java.lang.String str37 = locale35.getDisplayCountry();
        java.lang.String str38 = locale14.getDisplayScript(locale35);
        java.lang.String str39 = dateTimeZone3.getShortName(1645455770892L, locale14);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        java.lang.String str44 = durationFieldType43.toString();
        boolean boolean45 = localTime42.isSupported(durationFieldType43);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime48 = localTime42.withFieldAdded(durationFieldType46, 32772);
        org.joda.time.LocalTime.Property property49 = localTime42.hourOfDay();
        org.joda.time.LocalTime localTime51 = localTime42.minusMinutes(2922789);
        org.joda.time.Instant instant53 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.MutableDateTime mutableDateTime55 = org.joda.time.MutableDateTime.now(chronology54);
        boolean boolean56 = localTime42.equals((java.lang.Object) chronology54);
        org.joda.time.DateTimeField dateTimeField57 = chronology54.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField58 = chronology54.weekyearOfCentury();
        int int61 = dateTimeField58.getDifference(0L, 19L);
        java.util.Locale locale63 = java.util.Locale.UK;
        java.util.Locale locale64 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.lang.String str68 = locale66.getDisplayScript(locale67);
        java.lang.String str69 = locale64.getDisplayScript(locale67);
        java.util.Locale locale70 = java.util.Locale.UK;
        java.lang.String str71 = locale64.getDisplayScript(locale70);
        java.lang.String str72 = locale63.getDisplayLanguage(locale70);
        java.util.Locale.setDefault(locale63);
        java.lang.String str74 = dateTimeField58.getAsShortText((int) 'x', locale63);
        java.lang.String str75 = dateTimeZone3.getName(0L, locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime55", (mutableDateTime2.compareTo(mutableDateTime55) == 0) == mutableDateTime2.equals(mutableDateTime55));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0206");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(2922789);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now(chronology14);
        boolean boolean16 = localTime2.equals((java.lang.Object) chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.joda.time.DurationField durationField18 = durationFieldType0.getField(chronology14);
        org.joda.time.DurationField durationField19 = chronology14.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField19, and durationField18", !(durationField18.compareTo(durationField19) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField19.compareTo(durationField18))));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0207");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField8 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0208");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateMidnight dateMidnight19 = dateTime16.toDateMidnight();
        org.joda.time.DateTime.Property property20 = dateTime16.yearOfCentury();
        org.joda.time.Instant instant21 = new org.joda.time.Instant((java.lang.Object) dateTime16);
        org.joda.time.DateTime dateTime23 = dateTime16.plusYears(48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant21", (dateTime16.compareTo(instant21) == 0) == dateTime16.equals(instant21));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0209");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate9.toInterval(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths(0);
        org.joda.time.LocalDate.Property property14 = localDate13.year();
        int int15 = localDate13.size();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        org.joda.time.DateTime dateTime24 = localDate13.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime26 = property25.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = mutableDateTime32.getZone();
        long long35 = dateTimeZone30.getMillisKeepLocal(dateTimeZone33, (long) 10);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(10L, dateTimeZone30);
        long long38 = dateTimeZone30.nextTransition((long) 12);
        org.joda.time.DateTime dateTime39 = dateTime26.withZone(dateTimeZone30);
        int int40 = dateTime39.getMinuteOfDay();
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime39.toYearMonthDay();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime39.toMutableDateTime();
        boolean boolean43 = dateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime2.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now();
        boolean boolean6 = mutableDateTime5.isAfterNow();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        boolean boolean18 = dateTimeZone15.isFixed();
        mutableDateTime5.setZoneRetainFields(dateTimeZone15);
        mutableDateTime2.setZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.secondOfMinute();
        org.joda.time.DurationField durationField28 = dateTimeField27.getDurationField();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean40 = localTime38.equals((java.lang.Object) dateTimeFieldType39);
        org.joda.time.LocalTime.Property property41 = localTime30.property(dateTimeFieldType39);
        org.joda.time.LocalTime localTime42 = property41.withMaximumValue();
        int int43 = dateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime47 = localTime42.toDateTimeToday(dateTimeZone46);
        mutableDateTime21.setZone(dateTimeZone46);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 58622333, dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime21", (mutableDateTime2.compareTo(mutableDateTime21) == 0) == mutableDateTime2.equals(mutableDateTime21));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0211");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0212");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(40);
        int int7 = dateTime6.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfYear();
        mutableDateTime1.setChronology(chronology8);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        int int15 = localDate14.getDayOfMonth();
        org.joda.time.LocalDate localDate17 = localDate14.plusYears((int) (byte) 100);
        int int18 = localDate14.size();
        org.joda.time.LocalDate localDate20 = localDate14.minusWeeks((int) 'x');
        int int21 = localDate20.getYear();
        org.joda.time.LocalDate.Property property22 = localDate20.weekOfWeekyear();
        int[] intArray24 = chronology8.get((org.joda.time.ReadablePartial) localDate20, (long) 4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime4", (mutableDateTime1.compareTo(mutableDateTime4) == 0) == mutableDateTime1.equals(mutableDateTime4));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0214");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime1.toMutableDateTime();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime20.add(readablePeriod21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant4.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Interval interval7 = localDate5.toInterval(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate5.plusMonths(0);
        org.joda.time.LocalDate.Property property10 = localDate9.year();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateMidnight dateMidnight19 = localDate9.toDateMidnight(dateTimeZone13);
        int int20 = dateMidnight19.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight19.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.monthOfYear();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime12", (instant4.compareTo(mutableDateTime12) == 0) == instant4.equals(mutableDateTime12));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0217");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        int int6 = dateTime1.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0218");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        int int4 = dateTime3.getMinuteOfDay();
        org.joda.time.DateTime dateTime6 = dateTime3.withSecondOfMinute(53);
        org.joda.time.DateTime.Property property7 = dateTime6.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0219");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.millisOfSecond();
        java.lang.String str10 = chronology7.toString();
        org.joda.time.DateTime dateTime11 = dateTime3.withChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone15.previousTransition((-431366460000L));
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((-1L), dateTimeZone15);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0220");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.DurationField durationField8 = chronology2.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0221");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean16 = localTime14.equals((java.lang.Object) dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType17.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType15.getField(chronology20);
        org.joda.time.LocalTime localTime26 = localTime11.withField(dateTimeFieldType15, 9);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology29 = instant28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = chronology29.weeks();
        org.joda.time.DateTimeField dateTimeField33 = chronology29.clockhourOfHalfday();
        boolean boolean34 = dateTimeFieldType15.isSupported(chronology29);
        org.joda.time.DurationField durationField35 = chronology29.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField30, and durationField32", !(durationField35.compareTo(durationField30) == 0) || (Math.signum(durationField35.compareTo(durationField32)) == Math.signum(durationField30.compareTo(durationField32))));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0222");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.era();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutableDateTime11.add(readableDuration13, 0);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.years();
        java.lang.String str20 = durationFieldType19.toString();
        boolean boolean21 = localTime18.isSupported(durationFieldType19);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime24 = localTime18.withFieldAdded(durationFieldType22, 32772);
        org.joda.time.LocalTime.Property property25 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime26 = property25.roundCeilingCopy();
        org.joda.time.LocalTime localTime28 = property25.addCopy(19);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean32 = localTime30.equals((java.lang.Object) dateTimeFieldType31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType33.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType31.getField(chronology36);
        boolean boolean41 = localTime28.isSupported(dateTimeFieldType31);
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType31.getDurationType();
        int int43 = mutableDateTime11.get(dateTimeFieldType31);
        int int44 = instant4.get(dateTimeFieldType31);
        java.lang.String str45 = dateTimeFieldType31.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0223");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.era();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime7.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone12.previousTransition((-431366460000L));
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
        java.lang.String str30 = dateTimeZone18.getName((long) 54089980, locale28);
        java.lang.String str31 = locale28.getDisplayLanguage();
        java.lang.String str32 = locale28.getScript();
        java.lang.String str33 = dateTimeZone12.getName((long) 52, locale28);
        mutableDateTime7.setZone(dateTimeZone12);
        boolean boolean35 = instant4.isAfter((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime11", (instant0.compareTo(mutableDateTime11) == 0) == instant0.equals(mutableDateTime11));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0224");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        long long11 = dateTimeField9.roundHalfCeiling(19L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType13.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfDay();
        java.lang.String str19 = dateTimeField18.getName();
        java.lang.String str20 = dateTimeField18.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType21.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = dateTimeField26.getAsText(7, locale28);
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
        java.lang.String str40 = locale28.getDisplayVariant(locale37);
        java.util.Locale locale43 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.lang.String str44 = locale28.getDisplayLanguage(locale43);
        int int45 = dateTimeField18.getMaximumTextLength(locale28);
        java.lang.String str46 = dateTimeField9.getAsShortText(1645455700681L, locale28);
        long long49 = dateTimeField9.getDifferenceAsLong(1645455772759L, (long) 442);
        int int50 = dateTime1.get(dateTimeField9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0225");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.era();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.year();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        mutableDateTime5.setZoneRetainFields(dateTimeZone16);
        long long20 = dateTimeZone16.previousTransition(0L);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        java.lang.String str26 = durationFieldType25.toString();
        boolean boolean27 = localTime24.isSupported(durationFieldType25);
        org.joda.time.LocalTime localTime29 = localTime24.withMinuteOfHour((int) (short) 0);
        org.joda.time.LocalTime.Property property30 = localTime24.millisOfDay();
        org.joda.time.LocalTime localTime31 = property30.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        java.lang.String str36 = durationFieldType35.toString();
        boolean boolean37 = localTime34.isSupported(durationFieldType35);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime40 = localTime34.withFieldAdded(durationFieldType38, 32772);
        org.joda.time.LocalTime.Property property41 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime42 = property41.roundCeilingCopy();
        org.joda.time.LocalTime localTime44 = property41.addCopy(19);
        org.joda.time.LocalTime localTime46 = property41.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime47 = property41.getLocalTime();
        org.joda.time.LocalTime localTime49 = localTime47.plusMinutes(14);
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.lang.String str52 = locale50.getDisplayScript(locale51);
        java.util.Locale locale53 = java.util.Locale.KOREA;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.lang.String str56 = locale53.getDisplayCountry(locale55);
        java.lang.String str57 = locale51.getDisplayCountry(locale53);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = mutableDateTime59.getZone();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone63 = mutableDateTime62.getZone();
        long long65 = dateTimeZone60.getMillisKeepLocal(dateTimeZone63, (long) 10);
        java.lang.String str66 = dateTimeZone60.toString();
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.lang.String str69 = locale68.toLanguageTag();
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale68.getDisplayCountry(locale70);
        java.lang.String str72 = dateTimeZone60.getName((long) 54089980, locale70);
        java.lang.String str73 = locale70.getDisplayLanguage();
        java.lang.String str74 = locale53.getDisplayName(locale70);
        java.lang.String str75 = locale53.toLanguageTag();
        java.lang.String str76 = dateTimeField32.getAsShortText((org.joda.time.ReadablePartial) localTime49, locale53);
        org.joda.time.DateTimeFieldType dateTimeFieldType78 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology81 = localTime80.getChronology();
        org.joda.time.DateTimeField dateTimeField82 = dateTimeFieldType78.getField(chronology81);
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale83.getDisplayScript(locale84);
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.lang.String str87 = locale86.toLanguageTag();
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale86.getDisplayCountry(locale88);
        java.lang.String str90 = locale84.getDisplayCountry(locale86);
        int int91 = dateTimeField82.getMaximumTextLength(locale84);
        java.lang.String str92 = dateTimeField32.getAsText(1645459200000L, locale84);
        java.lang.String str93 = dateTimeZone16.getShortName((long) (short) 0, locale84);
        java.lang.String str95 = dateTimeZone16.getName(54113472L);
        org.joda.time.MutableDateTime mutableDateTime96 = new org.joda.time.MutableDateTime((java.lang.Object) calendar3, dateTimeZone16);
        long long97 = calendar3.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime96", (mutableDateTime5.compareTo(mutableDateTime96) == 0) == mutableDateTime5.equals(mutableDateTime96));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0226");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField8 = chronology3.eras();
        org.joda.time.DurationField durationField9 = chronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0227");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime10 = dateTime1.plusMillis(999);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMonths(5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0228");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
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
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime10.toMutableDateTime(dateTimeZone19);
        java.lang.String str28 = mutableDateTime27.toString();
        java.lang.String str29 = mutableDateTime27.toString();
        long long30 = mutableDateTime27.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime27.property(dateTimeFieldType31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale34 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter33.withLocale(locale34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        boolean boolean39 = mutableDateTime37.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime37.toMutableDateTime();
        mutableDateTime37.addDays(19);
        java.lang.String str43 = dateTimeFormatter33.print((org.joda.time.ReadableInstant) mutableDateTime37);
        boolean boolean44 = mutableDateTime27.isAfter((org.joda.time.ReadableInstant) mutableDateTime37);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(dateTimeZone45);
        mutableDateTime46.setMinuteOfDay(100);
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
        int int65 = mutableDateTime46.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalDate localDate66 = dateTime64.toLocalDate();
        org.joda.time.DateTime dateTime67 = dateTime64.toDateTime();
        org.joda.time.DateTime.Property property68 = dateTime64.millisOfSecond();
        boolean boolean69 = property68.isLeap();
        org.joda.time.DateTime dateTime70 = property68.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = property68.getFieldType();
        org.joda.time.DurationFieldType durationFieldType72 = dateTimeFieldType71.getDurationType();
        int int73 = mutableDateTime37.get(dateTimeFieldType71);
        mutableDateTime8.set(dateTimeFieldType71, 843);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime7", (mutableDateTime1.compareTo(mutableDateTime7) == 0) == mutableDateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0229");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        int int7 = dateTime6.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime15.add(readableDuration17, 0);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        java.lang.String str24 = durationFieldType23.toString();
        boolean boolean25 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime28 = localTime22.withFieldAdded(durationFieldType26, 32772);
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property29.addCopy(19);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean36 = localTime34.equals((java.lang.Object) dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType35.getField(chronology40);
        boolean boolean45 = localTime32.isSupported(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType35.getDurationType();
        int int47 = mutableDateTime15.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime15.yearOfEra();
        int int49 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone51);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        java.lang.String str56 = durationFieldType55.toString();
        boolean boolean57 = localTime54.isSupported(durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime60 = localTime54.withFieldAdded(durationFieldType58, 32772);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean64 = localTime62.equals((java.lang.Object) dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime54.property(dateTimeFieldType63);
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType63.getDurationType();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime52.property(dateTimeFieldType63);
        int int68 = mutableDateTime15.get(dateTimeFieldType63);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime15, chronology71);
        org.joda.time.DurationField durationField76 = chronology71.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime75", (mutableDateTime2.compareTo(dateTime75) == 0) == mutableDateTime2.equals(dateTime75));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0231");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.MutableDateTime mutableDateTime11 = instant9.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.era();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        int int16 = localDate15.getDayOfMonth();
        org.joda.time.LocalDate localDate18 = localDate15.plusYears((int) (byte) 100);
        org.joda.time.Interval interval19 = localDate18.toInterval();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        java.lang.String str28 = dateTimeZone22.toString();
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime13.toMutableDateTime(dateTimeZone22);
        java.lang.String str31 = mutableDateTime30.toString();
        java.lang.String str32 = mutableDateTime30.toString();
        long long33 = mutableDateTime30.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.property(dateTimeFieldType34);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale37 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withLocale(locale37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        boolean boolean42 = mutableDateTime40.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime40.toMutableDateTime();
        mutableDateTime40.addDays(19);
        java.lang.String str46 = dateTimeFormatter36.print((org.joda.time.ReadableInstant) mutableDateTime40);
        boolean boolean47 = mutableDateTime30.isAfter((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime30.setMillis((long) 54107938);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        long long54 = dateTimeZone52.previousTransition((-431366460000L));
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(dateTimeZone56);
        org.joda.time.DateTimeZone dateTimeZone58 = mutableDateTime57.getZone();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime(dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone61 = mutableDateTime60.getZone();
        long long63 = dateTimeZone58.getMillisKeepLocal(dateTimeZone61, (long) 10);
        java.lang.String str64 = dateTimeZone58.toString();
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.lang.String str67 = locale66.toLanguageTag();
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.lang.String str69 = locale66.getDisplayCountry(locale68);
        java.lang.String str70 = dateTimeZone58.getName((long) 54089980, locale68);
        java.lang.String str71 = locale68.getDisplayLanguage();
        java.lang.String str72 = locale68.getScript();
        java.lang.String str73 = dateTimeZone52.getName((long) 52, locale68);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone52);
        boolean boolean76 = dateTimeZone52.isStandardOffset((long) 20);
        long long78 = dateTimeZone52.convertUTCToLocal(1707456419852529298L);
        mutableDateTime30.setZoneRetainFields(dateTimeZone52);
        mutableDateTime11.setZone(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime13", (instant6.compareTo(mutableDateTime13) == 0) == instant6.equals(mutableDateTime13));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        int int5 = mutableDateTime1.getYearOfEra();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) (short) 100);
        org.joda.time.Instant instant9 = instant8.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant9.withDurationAdded(readableDuration10, 5);
        org.joda.time.Instant instant13 = instant9.toInstant();
        org.joda.time.Instant instant14 = instant13.toInstant();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) instant14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant6", (mutableDateTime4.compareTo(instant6) == 0) == mutableDateTime4.equals(instant6));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0233");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        int int3 = dateTime2.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0234");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMonths(6);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1L);
        boolean boolean22 = mutableDateTime20.isEqual((long) 16);
        int int23 = dateTime18.compareTo((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTime dateTime25 = dateTime18.withMillis((long) (-292275054));
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean29 = localTime27.equals((java.lang.Object) dateTimeFieldType28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType30.getField(chronology33);
        org.joda.time.DateTimeField dateTimeField35 = chronology33.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType28.getField(chronology33);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology33);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTimeISO();
        boolean boolean40 = dateTime25.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime39", (dateTime0.compareTo(dateTime39) == 0) == dateTime0.equals(dateTime39));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0235");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) '#', 16);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 54137);
        org.joda.time.DateTime dateTime11 = instant7.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime12", (instant7.compareTo(mutableDateTime12) == 0) == instant7.equals(mutableDateTime12));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0236");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localTime1.getFields();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (short) 100);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant18 = instant12.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean19 = instant12.isAfterNow();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime21 = instant12.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0238");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.Instant instant6 = instant2.minus((long) 54110417);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (short) 100);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant18 = instant12.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean19 = instant12.isAfterNow();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant23 = instant12.withDurationAdded((long) 54113472, 54134127);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0240");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, 54197970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0241");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant0.plus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant0.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant0", (dateTime3.compareTo(instant0) == 0) == dateTime3.equals(instant0));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0242");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        int int3 = calendar0.getMinimalDaysInFirstWeek();
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
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.joda.time.DateTime dateTime21 = property20.roundHalfFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        mutableDateTime22.add(durationFieldType24, 2023);
        int int27 = dateTime21.compareTo((org.joda.time.ReadableInstant) mutableDateTime22);
        boolean boolean28 = calendar0.before((java.lang.Object) mutableDateTime22);
        org.joda.time.Instant instant29 = mutableDateTime22.toInstant();
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(1L);
        int int32 = mutableDateTime31.getCenturyOfEra();
        mutableDateTime31.setMillisOfDay(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.secondOfDay();
        mutableDateTime31.set(dateTimeFieldType35, 111);
        boolean boolean38 = instant29.isAfter((org.joda.time.ReadableInstant) mutableDateTime31);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime31.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and instant29", (mutableDateTime22.compareTo(instant29) == 0) == mutableDateTime22.equals(instant29));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0243");
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
        org.joda.time.Chronology chronology21 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology21);
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.minuteOfHour();
        org.joda.time.DateTime dateTime26 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property28 = dateTime24.monthOfYear();
        org.joda.time.DateTime.Property property29 = dateTime24.dayOfYear();
        boolean boolean30 = mutableDateTime22.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant23", (mutableDateTime1.compareTo(instant23) == 0) == mutableDateTime1.equals(instant23));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0244");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField6 = chronology2.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0245");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.millisOfSecond();
        boolean boolean24 = property23.isLeap();
        org.joda.time.DateTime dateTime25 = property23.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime26 = property23.roundFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser31 = dateTimeFormatter28.getParser();
        java.util.Locale locale32 = dateTimeFormatter28.getLocale();
        org.joda.time.Instant instant34 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology35 = instant34.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter28.withChronology(chronology35);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(946684800000L, chronology35);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime26.toMutableDateTime(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime36", (mutableDateTime12.compareTo(mutableDateTime36) == 0) == mutableDateTime12.equals(mutableDateTime36));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.minuteOfHour();
        org.joda.time.Chronology chronology3 = mutableDateTime1.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int6 = localTime5.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        java.lang.String str11 = durationFieldType10.toString();
        boolean boolean12 = localTime9.isSupported(durationFieldType10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime15 = localTime9.withFieldAdded(durationFieldType13, 32772);
        org.joda.time.LocalTime.Property property16 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime9.minusMinutes(19);
        org.joda.time.Chronology chronology19 = localTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType7.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology19);
        boolean boolean24 = localTime5.equals((java.lang.Object) chronology19);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        java.lang.String str28 = durationFieldType27.toString();
        boolean boolean29 = localTime26.isSupported(durationFieldType27);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime32 = localTime26.withFieldAdded(durationFieldType30, 32772);
        org.joda.time.LocalTime.Property property33 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime34 = property33.roundCeilingCopy();
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.LocalTime localTime39 = localTime36.minusMinutes((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.era();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime41.year();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone44);
        boolean boolean47 = mutableDateTime45.isAfter((long) 21);
        boolean boolean49 = mutableDateTime45.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        mutableDateTime45.setZone(dateTimeZone52);
        mutableDateTime41.setZoneRetainFields(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = localTime39.toDateTimeToday(dateTimeZone52);
        int[] intArray56 = localTime39.getValues();
        chronology3.validate((org.joda.time.ReadablePartial) localTime5, intArray56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime20", (mutableDateTime1.compareTo(mutableDateTime20) == 0) == mutableDateTime1.equals(mutableDateTime20));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0247");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, 12);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.monthOfYear();
        org.joda.time.DateTime dateTime27 = property26.withMaximumValue();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        int int29 = localDate28.getDayOfMonth();
        org.joda.time.LocalDate localDate31 = localDate28.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property32 = localDate31.centuryOfEra();
        int int33 = property32.getMaximumValueOverall();
        org.joda.time.LocalDate localDate34 = property32.roundFloorCopy();
        org.joda.time.DateTime dateTime35 = localDate34.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime27.withChronology(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusYears(2);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.Instant instant42 = instant40.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant42.withDurationAdded(readableDuration43, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime46 = instant42.toMutableDateTime();
        boolean boolean47 = dateTime39.isBefore((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and instant40", (mutableDateTime8.compareTo(instant40) == 0) == mutableDateTime8.equals(instant40));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0248");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime14 = dateTime6.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime6.minus(readableDuration15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime18", (instant5.compareTo(dateTime18) == 0) == instant5.equals(dateTime18));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0249");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 54092654);
        org.joda.time.Instant instant28 = instant26.plus((long) 54152000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant26", (dateTime19.compareTo(instant26) == 0) == dateTime19.equals(instant26));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0250");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        boolean boolean1 = mutableDateTime0.isAfterNow();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        boolean boolean13 = dateTimeZone10.isFixed();
        mutableDateTime0.setZoneRetainFields(dateTimeZone10);
        int int15 = mutableDateTime0.getYearOfCentury();
        mutableDateTime0.addHours(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.Interval interval21 = localDate19.toInterval(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate19.plusMonths(0);
        org.joda.time.LocalDate.Property property24 = localDate23.weekOfWeekyear();
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        long long26 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Chronology chronology27 = instant25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType18.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.minuteOfDay();
        mutableDateTime0.setRounding(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant25", (mutableDateTime6.compareTo(instant25) == 0) == mutableDateTime6.equals(instant25));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0251");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeField8.getAsText(7, locale10);
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
        java.lang.String str22 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.lang.String str25 = locale19.getExtension('a');
        int int26 = property1.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime28 = property1.addWrapFieldToCopy(53);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes(54131539);
        org.joda.time.DateTime.Property property31 = dateTime30.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType32.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.hourOfDay();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology35);
        org.joda.time.DateTime dateTime41 = dateTime39.plusSeconds((int) (byte) -1);
        boolean boolean42 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime39", (dateTime0.compareTo(dateTime39) == 0) == dateTime0.equals(dateTime39));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0252");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.Instant instant5 = instant0.withMillis((long) 32);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0253");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) (short) 100);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 5);
        org.joda.time.DateTime dateTime8 = localTime0.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant7.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean11 = instant7.isSupported(dateTimeFieldType10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime9", (instant7.compareTo(mutableDateTime9) == 0) == instant7.equals(mutableDateTime9));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0254");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 54092654);
        org.joda.time.MutableDateTime mutableDateTime27 = instant23.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant23", (dateTime19.compareTo(instant23) == 0) == dateTime19.equals(instant23));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(21);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths(0);
        org.joda.time.LocalDate.Property property17 = localDate16.year();
        int int18 = localDate16.size();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.DateTime dateTime27 = localDate16.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property29 = dateTime27.property(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime33 = dateTime30.plusWeeks(431506);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(1L);
        int int36 = mutableDateTime35.getCenturyOfEra();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Calendar calendar38 = mutableDateTime35.toCalendar(locale37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean40 = mutableDateTime35.isSupported(dateTimeFieldType39);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        java.lang.String str44 = durationFieldType43.toString();
        boolean boolean45 = localTime42.isSupported(durationFieldType43);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime48 = localTime42.withFieldAdded(durationFieldType46, 32772);
        org.joda.time.LocalTime.Property property49 = localTime42.hourOfDay();
        org.joda.time.LocalTime localTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalTime localTime52 = localTime50.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean57 = localTime55.equals((java.lang.Object) dateTimeFieldType56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology61 = localTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType58.getField(chronology61);
        org.joda.time.DateTimeField dateTimeField63 = chronology61.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType56.getField(chronology61);
        org.joda.time.LocalTime localTime67 = localTime52.withField(dateTimeFieldType56, 9);
        org.joda.time.Instant instant69 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology70 = instant69.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.clockhourOfHalfday();
        org.joda.time.DurationField durationField73 = chronology70.weeks();
        org.joda.time.DateTimeField dateTimeField74 = chronology70.clockhourOfHalfday();
        boolean boolean75 = dateTimeFieldType56.isSupported(chronology70);
        org.joda.time.Chronology chronology76 = chronology70.withUTC();
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.now(chronology70);
        mutableDateTime35.setTime((org.joda.time.ReadableInstant) mutableDateTime77);
        boolean boolean79 = dateTime30.isEqual((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and mutableDateTime77", (mutableDateTime4.compareTo(mutableDateTime77) == 0) == mutableDateTime4.equals(mutableDateTime77));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0256");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.clear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.hourOfDay();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology6);
        boolean boolean12 = calendar1.before((java.lang.Object) chronology6);
        int int13 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        java.util.Locale locale18 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar19 = dateTime17.toCalendar(locale18);
        calendar19.setLenient(true);
        calendar19.clear();
        int int23 = calendar1.compareTo(calendar19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime14", (dateTime10.compareTo(dateTime14) == 0) == dateTime10.equals(dateTime14));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0257");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(2922789);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology20 = instant19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology20);
        boolean boolean22 = localTime8.equals((java.lang.Object) chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology20);
        org.joda.time.DateTime dateTime26 = dateTime1.toDateTime(chronology20);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds(50568445);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0258");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTime dateTime8 = dateTime1.plusMinutes(1501);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0259");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(10L, dateTimeZone11);
        int int19 = dateTimeZone11.getStandardOffset((long) 40);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology21 = chronology3.withZone(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime10", (dateTime7.compareTo(mutableDateTime10) == 0) == dateTime7.equals(mutableDateTime10));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant5", (mutableDateTime1.compareTo(instant5) == 0) == mutableDateTime1.equals(instant5));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0261");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime14 = dateTime6.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime6.minus(readableDuration15);
        int int17 = dateTime6.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        java.util.Date date25 = localDateTime24.toDate();
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant28.withDurationAdded(readableDuration29, (int) (short) 0);
        boolean boolean33 = instant28.isBefore((long) 5);
        java.util.Date date34 = instant28.toDate();
        int int35 = date25.compareTo(date34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant26", (mutableDateTime1.compareTo(instant26) == 0) == mutableDateTime1.equals(instant26));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0263");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime14 = property8.addWrapFieldToCopy(54100989);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds(292278994);
        org.joda.time.LocalTime localTime18 = localTime16.minusSeconds(3);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        mutableDateTime20.setMinuteOfDay(100);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.minuteOfDay();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = localTime25.isSupported(durationFieldType26);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime31 = localTime25.withFieldAdded(durationFieldType29, 32772);
        java.lang.String str32 = durationFieldType29.toString();
        java.lang.String str33 = durationFieldType29.toString();
        mutableDateTime20.add(durationFieldType29, (-1));
        boolean boolean36 = localTime16.isSupported(durationFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.hourOfDay();
        java.lang.String str44 = chronology40.toString();
        org.joda.time.Chronology chronology45 = chronology40.withUTC();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.hourOfDay();
        boolean boolean47 = durationFieldType29.isSupported(chronology40);
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime49 = instant48.toDateTime();
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfHour();
        org.joda.time.DateTime dateTime51 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology55 = localTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType52.getField(chronology55);
        org.joda.time.DateTime dateTime57 = dateTime49.toDateTime(chronology55);
        org.joda.time.DurationField durationField58 = durationFieldType29.getField(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant48 and dateTime49", (instant48.compareTo(dateTime49) == 0) == instant48.equals(dateTime49));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0264");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean22 = localTime20.equals((java.lang.Object) dateTimeFieldType21);
        org.joda.time.LocalTime.Property property23 = localTime12.property(dateTimeFieldType21);
        int int24 = localTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DateTime dateTime27 = dateTime1.minusWeeks(54129298);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 54189028);
        int int30 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0265");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        long long10 = dateTimeField7.add((long) 19, 14);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear(3);
        org.joda.time.LocalDate localDate15 = localDate13.withWeekyear(54107140);
        int int16 = localDate13.getDayOfMonth();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("years");
        boolean boolean20 = timeZone19.observesDaylightTime();
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
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone19, locale21);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        org.joda.time.DateTime dateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime35 = dateTime34.toDateTime();
        java.util.Locale locale36 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar37 = dateTime35.toCalendar(locale36);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone19, locale36);
        java.lang.String str39 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDate13, 54121606, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar31", (calendar0.compareTo(calendar31) == 0) == calendar0.equals(calendar31));
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0266");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeField8.getAsText(7, locale10);
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
        java.lang.String str22 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.lang.String str25 = locale19.getExtension('a');
        int int26 = property1.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime28 = property1.addWrapFieldToCopy(53);
        org.joda.time.DateTime dateTime30 = dateTime28.plusMinutes(54131539);
        org.joda.time.DateTime.Property property31 = dateTime30.weekOfWeekyear();
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.Instant instant34 = instant32.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant37 = instant34.withDurationAdded(readableDuration35, (int) (short) 0);
        boolean boolean39 = instant34.isBefore((long) 5);
        org.joda.time.MutableDateTime mutableDateTime40 = instant34.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        long long42 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant32", (dateTime0.compareTo(instant32) == 0) == dateTime0.equals(instant32));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0267");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds(0);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.Instant instant6 = instant4.minus((long) 13);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        java.lang.String str14 = chronology11.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property17 = dateTime7.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.secondOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField26 = chronology21.millis();
        org.joda.time.DateTime dateTime27 = dateTime7.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField28 = chronology21.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0268");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addHours(40);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withFieldAdded(durationFieldType14, (int) (byte) 1);
        org.joda.time.DateTime dateTime17 = localDateTime11.toDateTime();
        boolean boolean18 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime1.getZone();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone21, locale24);
        java.lang.String str27 = locale24.getDisplayVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar26", (calendar6.compareTo(calendar26) == 0) == calendar6.equals(calendar26));
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0269");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = property16.addToCopy(3);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readablePeriod25);
        int int27 = dateTime26.getDayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Interval interval31 = localDate29.toInterval(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate29.plusMonths(0);
        org.joda.time.LocalDate.Property property34 = localDate33.year();
        int int35 = localDate33.size();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        long long43 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 10);
        org.joda.time.DateTime dateTime44 = localDate33.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfEra();
        org.joda.time.DateTime dateTime46 = property45.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime48 = property45.addToCopy((int) 'u');
        org.joda.time.DateTime dateTime50 = property45.setCopy(19);
        org.joda.time.DateTime dateTime52 = dateTime50.plusMonths(2922789);
        org.joda.time.DateTime.Property property53 = dateTime50.dayOfMonth();
        org.joda.time.Instant instant54 = dateTime50.toInstant();
        boolean boolean55 = dateTime50.isEqualNow();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now();
        int int58 = localDate57.getDayOfMonth();
        org.joda.time.LocalDate localDate60 = localDate57.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        boolean boolean64 = mutableDateTime62.isAfter((long) 21);
        boolean boolean66 = mutableDateTime62.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(dateTimeZone67);
        org.joda.time.DateTimeZone dateTimeZone69 = mutableDateTime68.getZone();
        mutableDateTime62.setZone(dateTimeZone69);
        org.joda.time.DateTime dateTime71 = localDate57.toDateTimeAtStartOfDay(dateTimeZone69);
        org.joda.time.DateTime dateTime72 = dateTime56.withFields((org.joda.time.ReadablePartial) localDate57);
        org.joda.time.DateTime dateTime74 = dateTime72.plusMonths(6);
        org.joda.time.DateTime dateTime76 = dateTime72.plusMinutes((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight77 = dateTime72.toDateMidnight();
        int int78 = dateTime50.compareTo((org.joda.time.ReadableInstant) dateMidnight77);
        boolean boolean79 = mutableDateTime28.isBefore((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant54", (dateTime21.compareTo(instant54) == 0) == dateTime21.equals(instant54));
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.era();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime15.add(readableDuration17, 0);
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        java.lang.String str24 = durationFieldType23.toString();
        boolean boolean25 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime28 = localTime22.withFieldAdded(durationFieldType26, 32772);
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property29.addCopy(19);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean36 = localTime34.equals((java.lang.Object) dateTimeFieldType35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType35.getField(chronology40);
        boolean boolean45 = localTime32.isSupported(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType35.getDurationType();
        int int47 = mutableDateTime15.get(dateTimeFieldType35);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime15.yearOfEra();
        int int49 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) mutableDateTime15);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone51);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        java.lang.String str56 = durationFieldType55.toString();
        boolean boolean57 = localTime54.isSupported(durationFieldType55);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime60 = localTime54.withFieldAdded(durationFieldType58, 32772);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean64 = localTime62.equals((java.lang.Object) dateTimeFieldType63);
        org.joda.time.LocalTime.Property property65 = localTime54.property(dateTimeFieldType63);
        org.joda.time.DurationFieldType durationFieldType66 = dateTimeFieldType63.getDurationType();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime52.property(dateTimeFieldType63);
        int int68 = mutableDateTime15.get(dateTimeFieldType63);
        org.joda.time.Instant instant70 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology71 = instant70.getChronology();
        org.joda.time.DurationField durationField72 = chronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.yearOfEra();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.yearOfEra();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime15, chronology71);
        mutableDateTime15.addDays((-3600000));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime75", (mutableDateTime2.compareTo(dateTime75) == 0) == mutableDateTime2.equals(dateTime75));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0271");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean22 = localTime20.equals((java.lang.Object) dateTimeFieldType21);
        org.joda.time.LocalTime.Property property23 = localTime12.property(dateTimeFieldType21);
        int int24 = localTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType26.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.secondOfMinute();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        java.lang.String str35 = durationFieldType34.toString();
        boolean boolean36 = localTime33.isSupported(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime39 = localTime33.withFieldAdded(durationFieldType37, 32772);
        org.joda.time.LocalTime.Property property40 = localTime33.hourOfDay();
        org.joda.time.LocalTime localTime42 = localTime33.minusMinutes(2922789);
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
        java.lang.String str54 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localTime42, (int) ' ', locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology58 = localTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType55.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.secondOfDay();
        int int63 = dateTimeField60.getDifference(1645455690671L, (long) (short) 100);
        long long65 = dateTimeField60.remainder((long) (short) 0);
        java.util.Locale locale66 = java.util.Locale.ITALIAN;
        int int67 = dateTimeField60.getMaximumTextLength(locale66);
        int int68 = dateTimeField31.getMaximumTextLength(locale66);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = dateTimeField31.getType();
        int int70 = localTime12.get(dateTimeFieldType69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0272");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, 5);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime7", (instant9.compareTo(dateTime7) == 0) == instant9.equals(dateTime7));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0273");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        long long28 = dateTimeZone24.adjustOffset((long) 54117498, true);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        long long39 = dateTimeZone34.getMillisKeepLocal(dateTimeZone37, (long) 10);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(10L, dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(1647097300888L, dateTimeZone34);
        long long43 = dateTimeZone24.getMillisKeepLocal(dateTimeZone34, 1664809302019L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and mutableDateTime33", (mutableDateTime29.compareTo(mutableDateTime33) == 0) == mutableDateTime29.equals(mutableDateTime33));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0274");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek(54098460);
        java.util.TimeZone timeZone7 = calendar0.getTimeZone();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar13 = dateTime11.toCalendar(locale12);
        boolean boolean14 = calendar0.after((java.lang.Object) calendar13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusYears(54121);
        boolean boolean23 = calendar0.after((java.lang.Object) localDateTime16);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime16.getFields();
        org.joda.time.LocalDateTime.Property property25 = localDateTime16.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar15", (calendar0.compareTo(calendar15) == 0) == calendar0.equals(calendar15));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0275");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology2);
        org.joda.time.DurationField durationField6 = chronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0276");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = instant2.toMutableDateTime(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime14", (instant2.compareTo(mutableDateTime14) == 0) == instant2.equals(mutableDateTime14));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0277");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.LocalDateTime localDateTime6 = dateTime5.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0278");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.millisOfSecond();
        java.lang.String str6 = chronology3.toString();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DurationField durationField8 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0279");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, (int) (short) 0);
        boolean boolean8 = instant3.isBefore((long) 5);
        java.util.Date date9 = instant3.toDate();
        int int10 = date9.getYear();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date9, dateTimeZone13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone13);
        boolean boolean18 = dateTimeZone13.isStandardOffset((long) 5);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 10, dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime16", (instant1.compareTo(dateTime16) == 0) == instant1.equals(dateTime16));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0280");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        java.util.Locale locale11 = dateTimeFormatter6.getLocale();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0281");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.DurationField durationField8 = chronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0282");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone4 = calendar0.getTimeZone();
        java.util.Locale.Builder builder5 = new java.util.Locale.Builder();
        java.util.Locale locale6 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder7 = builder5.setLocale(locale6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale13.getDisplayScript(locale14);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.toLanguageTag();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale16.getDisplayCountry(locale18);
        java.lang.String str20 = locale14.getDisplayCountry(locale16);
        int int21 = dateTimeField12.getMaximumTextLength(locale14);
        java.lang.String str22 = locale14.getVariant();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        java.lang.String str26 = durationFieldType25.toString();
        boolean boolean27 = localTime24.isSupported(durationFieldType25);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime30 = localTime24.withFieldAdded(durationFieldType28, 32772);
        org.joda.time.LocalTime.Property property31 = localTime24.hourOfDay();
        org.joda.time.LocalTime localTime32 = property31.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime34 = localTime32.minus(readablePeriod33);
        org.joda.time.Instant instant35 = new org.joda.time.Instant();
        org.joda.time.Instant instant37 = instant35.withMillis((long) (short) 100);
        org.joda.time.Instant instant38 = instant37.toInstant();
        boolean boolean39 = localTime34.equals((java.lang.Object) instant37);
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("years");
        boolean boolean43 = timeZone42.observesDaylightTime();
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
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone42, locale44);
        java.lang.String str55 = localTime34.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale44);
        java.lang.String str56 = locale14.getDisplayName(locale44);
        java.lang.String str57 = locale44.getISO3Country();
        java.util.Locale.Builder builder58 = builder7.setLocale(locale44);
        java.util.Locale locale59 = builder58.build();
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone4, locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar54", (calendar0.compareTo(calendar54) == 0) == calendar0.equals(calendar54));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0283");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.millisOfSecond();
        java.lang.String str6 = chronology3.toString();
        org.joda.time.DurationField durationField7 = chronology3.weekyears();
        org.joda.time.DurationField durationField8 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField8", Math.signum(durationField7.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField7)));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0284");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) 'x', (int) 'u', 11);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        int int8 = calendar6.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone9 = calendar6.getTimeZone();
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone9);
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
        timeZone12.setRawOffset(0);
        java.time.ZoneId zoneId28 = timeZone12.toZoneId();
        java.util.Calendar.Builder builder29 = builder10.setTimeZone(timeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar24", (calendar6.compareTo(calendar24) == 0) == calendar6.equals(calendar24));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0285");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withPeriodAdded(readablePeriod14, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.DateTime dateTime27 = localDateTime16.toDateTime(dateTimeZone24);
        mutableDateTime8.setZoneRetainFields(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime7", (mutableDateTime1.compareTo(mutableDateTime7) == 0) == mutableDateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0286");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.era();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate7 = localDate4.plusYears((int) (byte) 100);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        java.lang.String str17 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime18 = localDate7.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime2.toMutableDateTime(dateTimeZone11);
        java.lang.String str20 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = localDate0.toDateTime((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.Instant instant23 = mutableDateTime19.toInstant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = dateTimeFormatter24.getPrinter();
        boolean boolean26 = dateTimeFormatter24.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withPivotYear((java.lang.Integer) 901);
        java.lang.String str29 = mutableDateTime19.toString(dateTimeFormatter28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant23", (mutableDateTime2.compareTo(instant23) == 0) == mutableDateTime2.equals(instant23));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0287");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes(7);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withYear(54134385);
        int int8 = localDateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L, dateTimeZone12);
        boolean boolean20 = dateTimeZone12.isStandardOffset((long) 2922789);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale23.toLanguageTag();
        boolean boolean25 = locale23.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        long long33 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) 10);
        java.lang.String str34 = dateTimeZone28.toString();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale36.toLanguageTag();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale36.getDisplayCountry(locale38);
        java.lang.String str40 = dateTimeZone28.getName((long) 54089980, locale38);
        java.lang.String str41 = locale38.getDisplayLanguage();
        java.lang.String str42 = locale23.getDisplayVariant(locale38);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale23);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = locale44.getISO3Language();
        java.lang.String str46 = locale44.getDisplayCountry();
        java.lang.String str47 = locale23.getDisplayScript(locale44);
        java.lang.String str48 = dateTimeZone12.getShortName(1645455770892L, locale23);
        org.joda.time.DateTime dateTime49 = localDateTime7.toDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar43", (calendar0.compareTo(calendar43) == 0) == calendar0.equals(calendar43));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        boolean boolean28 = dateTime25.isAfter(50400019L);
        int int29 = dateTime25.getYearOfEra();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.eras();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        org.joda.time.DateTime dateTime35 = dateTime25.withZoneRetainFields(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField33", Math.signum(durationField6.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField6)));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0289");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateMidnight dateMidnight19 = dateTime16.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType20.getField(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.halfdayOfDay();
        java.lang.String str27 = dateTimeField26.getName();
        long long30 = dateTimeField26.getDifferenceAsLong((long) (byte) 0, (long) 54096794);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = dateTimeField26.getType();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        java.lang.String str35 = durationFieldType34.toString();
        boolean boolean36 = localTime33.isSupported(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime39 = localTime33.withFieldAdded(durationFieldType37, 32772);
        java.lang.String str40 = durationFieldType37.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType41.getField(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.secondOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.hourOfDay();
        boolean boolean48 = durationFieldType37.isSupported(chronology44);
        org.joda.time.Instant instant51 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology52 = instant51.getChronology();
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.clockhourOfHalfday();
        boolean boolean55 = durationFieldType37.isSupported(chronology52);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(chronology52);
        org.joda.time.DateTimeField dateTimeField57 = dateTimeFieldType31.getField(chronology52);
        org.joda.time.DateTime.Property property58 = dateTime16.property(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime56", (dateTime16.compareTo(dateTime56) == 0) == dateTime16.equals(dateTime56));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0290");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0291");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillis((long) 54121897);
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0292");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(7);
        org.joda.time.DateTime dateTime7 = dateTime3.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = dateTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = localDate10.toInterval(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths(0);
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        int int16 = localDate14.size();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 10);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfEra();
        org.joda.time.DateTime dateTime27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        long long36 = dateTimeZone31.getMillisKeepLocal(dateTimeZone34, (long) 10);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(10L, dateTimeZone31);
        long long39 = dateTimeZone31.nextTransition((long) 12);
        org.joda.time.DateTime dateTime40 = dateTime27.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime41 = dateTime7.toDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.years();
        java.lang.String str46 = durationFieldType45.toString();
        boolean boolean47 = localTime44.isSupported(durationFieldType45);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime50 = localTime44.withFieldAdded(durationFieldType48, 32772);
        org.joda.time.LocalTime.Property property51 = localTime44.hourOfDay();
        org.joda.time.LocalTime localTime52 = property51.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime54 = localTime52.minus(readablePeriod53);
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.Instant instant57 = instant55.withMillis((long) (short) 100);
        org.joda.time.Instant instant58 = instant57.toInstant();
        boolean boolean59 = localTime54.equals((java.lang.Object) instant57);
        int int60 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) instant57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant55", (dateTime0.compareTo(instant55) == 0) == dateTime0.equals(instant55));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0293");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        int int9 = date8.getYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date8, dateTimeZone12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        boolean boolean17 = dateTimeZone12.isStandardOffset((long) 5);
        java.lang.String str19 = dateTimeZone12.getShortName(1645455775286L);
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0294");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfDay(694);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0295");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds(0);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.Instant instant6 = instant4.minus((long) 13);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfSecond();
        java.lang.String str14 = chronology11.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.withChronology(chronology11);
        org.joda.time.DateTime dateTime16 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime.Property property17 = dateTime7.year();
        org.joda.time.DateTime dateTime19 = dateTime7.plusHours(54155219);
        int int20 = dateTime19.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.Chronology chronology7 = mutableDateTime1.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter8.getParser();
        java.util.Locale locale12 = dateTimeFormatter8.getLocale();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter8.withChronology(chronology15);
        org.joda.time.DateTimeZone dateTimeZone19 = chronology15.getZone();
        org.joda.time.Chronology chronology20 = chronology7.withZone(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime16", (mutableDateTime1.compareTo(mutableDateTime16) == 0) == mutableDateTime1.equals(mutableDateTime16));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0297");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(0L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime5 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property7 = dateTime3.monthOfYear();
        org.joda.time.DateTime.Property property8 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime3.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime12 = dateTime3.plusMillis(999);
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0298");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean9 = localDateTime7.equals((java.lang.Object) nameProvider8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.millisOfDay();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = property12.getAsText(locale13);
        java.lang.String str15 = locale13.getISO3Language();
        java.lang.String str18 = nameProvider8.getShortName(locale13, "3:01 PM", "7");
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        java.lang.String str27 = dateTimeZone24.toString();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone24);
        java.util.TimeZone timeZone29 = dateTimeZone24.toTimeZone();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone29, locale31);
        java.util.Locale locale33 = locale31.stripExtensions();
        java.lang.String str36 = nameProvider8.getName(locale31, "54130113", "2022-02-21");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar32", (calendar0.compareTo(calendar32) == 0) == calendar0.equals(calendar32));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0299");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded(readableDuration11, 54118926);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0300");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.millisOfSecond();
        org.joda.time.Chronology chronology10 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology3.hourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology3.eras();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField12", Math.signum(durationField6.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField6)));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0301");
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
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone19);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.lang.String str25 = timeZone24.getID();
        boolean boolean26 = timeZone24.observesDaylightTime();
        timeZone24.setID("30-Dec-2124 05:14:00");
        java.util.TimeZone.setDefault(timeZone24);
        calendar13.setTimeZone(timeZone24);
        java.lang.String str31 = timeZone24.getID();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        long long39 = dateTimeZone34.getMillisKeepLocal(dateTimeZone37, (long) 10);
        java.lang.String str40 = dateTimeZone37.toString();
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(dateTimeZone37);
        java.util.TimeZone timeZone42 = dateTimeZone37.toTimeZone();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone42, locale44);
        timeZone42.setID("2022-02-21T15:01:48.350Z");
        boolean boolean48 = timeZone42.observesDaylightTime();
        boolean boolean49 = timeZone24.hasSameRules(timeZone42);
        java.lang.String str50 = timeZone42.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar45", (calendar13.compareTo(calendar45) == 0) == calendar13.equals(calendar45));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0302");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localTime10.isSupported(durationFieldType11);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime16 = localTime10.withFieldAdded(durationFieldType14, 32772);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        boolean boolean20 = mutableDateTime18.isAfter((long) 21);
        boolean boolean22 = mutableDateTime18.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        mutableDateTime18.setZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localTime10.toDateTimeToday(dateTimeZone25);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale29.toLanguageTag();
        boolean boolean31 = locale29.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        long long39 = dateTimeZone34.getMillisKeepLocal(dateTimeZone37, (long) 10);
        java.lang.String str40 = dateTimeZone34.toString();
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.lang.String str43 = locale42.toLanguageTag();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale42.getDisplayCountry(locale44);
        java.lang.String str46 = dateTimeZone34.getName((long) 54089980, locale44);
        java.lang.String str47 = locale44.getDisplayLanguage();
        java.lang.String str48 = locale29.getDisplayVariant(locale44);
        java.util.Set<java.lang.String> strSet49 = locale29.getUnicodeLocaleKeys();
        java.lang.String str50 = dateTimeZone25.getShortName((long) (short) 1, locale29);
        org.joda.time.DateTime dateTime51 = dateTime8.withZoneRetainFields(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime51", (instant0.compareTo(dateTime51) == 0) == instant0.equals(dateTime51));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0303");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean2 = instant0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.era();
        int int4 = instant0.get(dateTimeFieldType3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTimeISO();
        mutableDateTime5.addHours(54133);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.Interval interval15 = localDate13.toInterval(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate13.plusMonths(0);
        org.joda.time.LocalDate.Property property18 = localDate17.year();
        int int19 = localDate17.size();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property30 = dateTime28.property(dateTimeFieldType29);
        int int31 = localDate8.get(dateTimeFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean33 = localDate8.isSupported(dateTimeFieldType32);
        mutableDateTime5.set(dateTimeFieldType32, 2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime21", (instant0.compareTo(mutableDateTime21) == 0) == instant0.equals(mutableDateTime21));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0304");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0305");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0306");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addHours(40);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withFieldAdded(durationFieldType14, (int) (byte) 1);
        org.joda.time.DateTime dateTime17 = localDateTime11.toDateTime();
        boolean boolean18 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime1.getZone();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone21, locale24);
        java.util.Set<java.lang.String> strSet27 = locale24.getUnicodeLocaleKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar26", (calendar6.compareTo(calendar26) == 0) == calendar6.equals(calendar26));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        mutableDateTime1.addDays(50568445);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime1.add(readableDuration7, 54143583);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        java.lang.String str13 = durationFieldType12.toString();
        boolean boolean14 = localTime11.isSupported(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime17 = localTime11.withFieldAdded(durationFieldType15, 32772);
        org.joda.time.LocalTime.Property property18 = localTime11.hourOfDay();
        org.joda.time.LocalTime localTime19 = property18.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = localTime19.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime24 = localTime21.minusMinutes((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.era();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime26.year();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        boolean boolean32 = mutableDateTime30.isAfter((long) 21);
        boolean boolean34 = mutableDateTime30.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        mutableDateTime30.setZone(dateTimeZone37);
        mutableDateTime26.setZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localTime24.toDateTimeToday(dateTimeZone37);
        java.util.Locale locale42 = null;
        java.lang.String str43 = dateTimeZone37.getName(1645455775947L, locale42);
        mutableDateTime1.setZone(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime26", (instant4.compareTo(mutableDateTime26) == 0) == instant4.equals(mutableDateTime26));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0308");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(54098460);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(10L, dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.era();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime26.add(readableDuration28, 0);
        mutableDateTime24.setTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        java.lang.String str35 = durationFieldType34.toString();
        boolean boolean36 = localTime33.isSupported(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime39 = localTime33.withFieldAdded(durationFieldType37, 32772);
        org.joda.time.LocalTime.Property property40 = localTime33.hourOfDay();
        org.joda.time.LocalTime localTime41 = property40.roundCeilingCopy();
        org.joda.time.LocalTime localTime43 = property40.addCopy(19);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean47 = localTime45.equals((java.lang.Object) dateTimeFieldType46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType48.getField(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology51.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType46.getField(chronology51);
        boolean boolean56 = localTime43.isSupported(dateTimeFieldType46);
        org.joda.time.DurationFieldType durationFieldType57 = dateTimeFieldType46.getDurationType();
        int int58 = mutableDateTime26.get(dateTimeFieldType46);
        org.joda.time.MutableDateTime.Property property59 = mutableDateTime26.yearOfEra();
        int int60 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime((long) 0, dateTimeZone62);
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType66 = org.joda.time.DurationFieldType.years();
        java.lang.String str67 = durationFieldType66.toString();
        boolean boolean68 = localTime65.isSupported(durationFieldType66);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime71 = localTime65.withFieldAdded(durationFieldType69, 32772);
        org.joda.time.LocalTime localTime73 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean75 = localTime73.equals((java.lang.Object) dateTimeFieldType74);
        org.joda.time.LocalTime.Property property76 = localTime65.property(dateTimeFieldType74);
        org.joda.time.DurationFieldType durationFieldType77 = dateTimeFieldType74.getDurationType();
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime63.property(dateTimeFieldType74);
        int int79 = mutableDateTime26.get(dateTimeFieldType74);
        boolean boolean80 = localTime8.isSupported(dateTimeFieldType74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter81 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter81.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser84 = dateTimeFormatter81.getParser();
        java.util.Locale locale85 = dateTimeFormatter81.getLocale();
        org.joda.time.Instant instant87 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology88 = instant87.getChronology();
        org.joda.time.MutableDateTime mutableDateTime89 = org.joda.time.MutableDateTime.now(chronology88);
        org.joda.time.DateTimeField dateTimeField90 = chronology88.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter81.withChronology(chronology88);
        org.joda.time.DateTimeZone dateTimeZone92 = chronology88.getZone();
        org.joda.time.DurationField durationField93 = chronology88.hours();
        org.joda.time.DateTimeField dateTimeField94 = dateTimeFieldType74.getField(chronology88);
        org.joda.time.LocalDateTime localDateTime95 = new org.joda.time.LocalDateTime(3599999L, chronology88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime13 and mutableDateTime89", (mutableDateTime13.compareTo(mutableDateTime89) == 0) == mutableDateTime13.equals(mutableDateTime89));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.Instant instant11 = instant2.plus((long) 13);
        org.joda.time.Instant instant12 = instant11.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0310");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.Chronology chronology15 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and dateTime17", (mutableDateTime5.compareTo(dateTime17) == 0) == mutableDateTime5.equals(dateTime17));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0311");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime26 = property24.addToCopy((int) 'x');
        org.joda.time.DateTime dateTime27 = property24.roundFloorCopy();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Interval interval30 = localDate28.toInterval(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate28.plusMonths(0);
        org.joda.time.LocalDate.Property property33 = localDate32.year();
        int int34 = localDate32.size();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        long long42 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtMidnight(dateTimeZone40);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale44.toLanguageTag();
        boolean boolean46 = localDate32.equals((java.lang.Object) str45);
        org.joda.time.LocalDate localDate48 = localDate32.minusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate48.withPeriodAdded(readablePeriod49, 12);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localDate51.toDateTimeAtCurrentTime(dateTimeZone52);
        org.joda.time.Chronology chronology54 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.yearOfEra();
        org.joda.time.DateTime dateTime56 = dateTime27.toDateTime(chronology54);
        org.joda.time.DateTime.Property property57 = dateTime56.dayOfMonth();
        org.joda.time.DateTime dateTime58 = property57.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime56", (dateTime21.compareTo(dateTime56) == 0) == dateTime21.equals(dateTime56));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0312");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        org.joda.time.DateMidnight dateMidnight14 = localDate4.toDateMidnight(dateTimeZone8);
        int int15 = dateMidnight14.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.hourOfDay();
        int int18 = mutableDateTime16.getDayOfMonth();
        mutableDateTime16.setTime(1645455690671L);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime16.copy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.era();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime23.year();
        mutableDateTime23.setTime((long) 19);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.getMutableDateTime();
        mutableDateTime21.setMillis((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime29.add(readableDuration31);
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfWeek();
        org.joda.time.Instant instant35 = mutableDateTime33.toInstant();
        mutableDateTime33.setMinuteOfDay(52);
        java.util.Locale locale38 = null;
        java.util.Calendar calendar39 = mutableDateTime33.toCalendar(locale38);
        boolean boolean40 = mutableDateTime29.isEqual((org.joda.time.ReadableInstant) mutableDateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant35", (mutableDateTime7.compareTo(instant35) == 0) == mutableDateTime7.equals(instant35));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0313");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(50400000L);
        org.joda.time.LocalTime localTime4 = localTime2.minusSeconds(0);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.Instant instant7 = instant5.minus((long) 13);
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.millisOfSecond();
        java.lang.String str15 = chronology12.toString();
        org.joda.time.DateTime dateTime16 = dateTime8.withChronology(chronology12);
        org.joda.time.DateTime dateTime17 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property18 = dateTime8.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField27 = chronology22.millis();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(0L, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime8", (instant5.compareTo(dateTime8) == 0) == instant5.equals(dateTime8));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.property(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1L);
        int int13 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime15.add(readablePeriod17, (int) (byte) 100);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        int int23 = localDate22.getDayOfMonth();
        org.joda.time.LocalDate localDate25 = localDate22.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 21);
        boolean boolean31 = mutableDateTime27.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = mutableDateTime33.getZone();
        mutableDateTime27.setZone(dateTimeZone34);
        org.joda.time.DateTime dateTime36 = localDate22.toDateTimeAtStartOfDay(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime37 = null;
        boolean boolean38 = dateTimeZone34.isLocalDateTimeGap(localDateTime37);
        org.joda.time.MutableDateTime mutableDateTime39 = mutableDateTime12.toMutableDateTime(dateTimeZone34);
        mutableDateTime39.setDate(100L);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.Interval interval44 = localDate42.toInterval(dateTimeZone43);
        org.joda.time.LocalDate localDate46 = localDate42.plusMonths(0);
        org.joda.time.LocalDate.Property property47 = localDate46.weekOfWeekyear();
        org.joda.time.Instant instant48 = new org.joda.time.Instant();
        long long49 = property47.getDifferenceAsLong((org.joda.time.ReadableInstant) instant48);
        org.joda.time.Instant instant51 = instant48.minus((long) (byte) 1);
        long long52 = instant51.getMillis();
        org.joda.time.MutableDateTime mutableDateTime53 = instant51.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime54 = instant51.toMutableDateTimeISO();
        org.joda.time.Instant instant57 = instant51.withDurationAdded(4456961128L, 843);
        boolean boolean58 = mutableDateTime39.isBefore((org.joda.time.ReadableInstant) instant51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and instant48", (mutableDateTime15.compareTo(instant48) == 0) == mutableDateTime15.equals(instant48));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0315");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
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
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property32 = dateTime30.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = property32.roundCeilingCopy();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime36 = dateTime33.minusSeconds(1647354708);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime23", (instant0.compareTo(mutableDateTime23) == 0) == instant0.equals(mutableDateTime23));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0316");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.DateTime dateTime11 = instant9.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = instant9.toDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0317");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.year();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.copy();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.Interval interval11 = localDate9.toInterval(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate9.plusMonths(0);
        org.joda.time.LocalDate.Property property14 = localDate13.weekOfWeekyear();
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        long long16 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) instant15);
        org.joda.time.Instant instant18 = instant15.minus((long) (byte) 1);
        long long19 = instant18.getMillis();
        int int20 = property1.compareTo((org.joda.time.ReadableInstant) instant18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant15", (dateTime0.compareTo(instant15) == 0) == dateTime0.equals(instant15));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0318");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) (short) 100);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 5);
        org.joda.time.DateTime dateTime8 = localTime0.toDateTime((org.joda.time.ReadableInstant) instant7);
        java.lang.String str9 = dateTime8.toString();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        int int15 = dateTimeZone13.getStandardOffset(0L);
        java.util.TimeZone timeZone16 = dateTimeZone13.toTimeZone();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("years");
        boolean boolean19 = timeZone16.hasSameRules(timeZone18);
        boolean boolean20 = timeZone18.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) dateTime8, dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime12", (instant1.compareTo(mutableDateTime12) == 0) == instant1.equals(mutableDateTime12));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        long long8 = dateTimeZone3.getMillisKeepLocal(dateTimeZone6, (long) 10);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(10L, dateTimeZone3);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(970);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType13.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfDay();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = dateTimeField18.getAsText(7, locale20);
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.lang.String str28 = locale23.getDisplayScript(locale26);
        java.util.Locale locale29 = java.util.Locale.UK;
        java.lang.String str30 = locale23.getDisplayScript(locale29);
        java.lang.String str31 = locale22.getDisplayLanguage(locale29);
        java.lang.String str32 = locale20.getDisplayVariant(locale29);
        java.lang.String str33 = locale20.getDisplayScript();
        java.util.Locale.Builder builder34 = new java.util.Locale.Builder();
        java.util.Locale locale35 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder36 = builder34.setLocale(locale35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale42.getDisplayScript(locale43);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale45.toLanguageTag();
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.lang.String str48 = locale45.getDisplayCountry(locale47);
        java.lang.String str49 = locale43.getDisplayCountry(locale45);
        int int50 = dateTimeField41.getMaximumTextLength(locale43);
        java.lang.String str51 = locale43.getVariant();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.years();
        java.lang.String str55 = durationFieldType54.toString();
        boolean boolean56 = localTime53.isSupported(durationFieldType54);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime59 = localTime53.withFieldAdded(durationFieldType57, 32772);
        org.joda.time.LocalTime.Property property60 = localTime53.hourOfDay();
        org.joda.time.LocalTime localTime61 = property60.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.LocalTime localTime63 = localTime61.minus(readablePeriod62);
        org.joda.time.Instant instant64 = new org.joda.time.Instant();
        org.joda.time.Instant instant66 = instant64.withMillis((long) (short) 100);
        org.joda.time.Instant instant67 = instant66.toInstant();
        boolean boolean68 = localTime63.equals((java.lang.Object) instant66);
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("years");
        boolean boolean72 = timeZone71.observesDaylightTime();
        java.util.Locale locale73 = java.util.Locale.UK;
        java.util.Locale locale74 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        java.util.Locale locale76 = java.util.Locale.KOREA;
        java.util.Locale locale77 = java.util.Locale.KOREA;
        java.lang.String str78 = locale76.getDisplayScript(locale77);
        java.lang.String str79 = locale74.getDisplayScript(locale77);
        java.util.Locale locale80 = java.util.Locale.UK;
        java.lang.String str81 = locale74.getDisplayScript(locale80);
        java.lang.String str82 = locale73.getDisplayLanguage(locale80);
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(timeZone71, locale73);
        java.lang.String str84 = localTime63.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale73);
        java.lang.String str85 = locale43.getDisplayName(locale73);
        java.lang.String str86 = locale73.getISO3Country();
        java.util.Locale.Builder builder87 = builder36.setLocale(locale73);
        java.lang.String str88 = locale20.getDisplayVariant(locale73);
        java.lang.String str89 = locale20.getLanguage();
        java.lang.String str90 = locale20.getDisplayScript();
        int int91 = property12.getMaximumTextLength(locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant64", (mutableDateTime2.compareTo(instant64) == 0) == mutableDateTime2.equals(instant64));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0320");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant6 = instant4.withMillis((long) 54134127);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTimeISO();
        boolean boolean10 = mutableDateTime8.isBefore(1645440000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0321");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        org.joda.time.DurationField durationField6 = chronology2.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField6, and durationField3", !(durationField3.compareTo(durationField6) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField6.compareTo(durationField3))));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0322");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateMidnight dateMidnight6 = dateTime5.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0323");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, 5);
        org.joda.time.Instant instant7 = instant3.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.LocalTime localTime10 = dateTime8.toLocalTime();
        int int11 = localTime10.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime8", (instant2.compareTo(dateTime8) == 0) == instant2.equals(dateTime8));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0324");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        java.lang.String str14 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime19.setMinuteOfDay(100);
        boolean boolean22 = mutableDateTime19.isAfterNow();
        boolean boolean23 = mutableDateTime19.isEqualNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean25 = mutableDateTime19.isSupported(dateTimeFieldType24);
        int int26 = dateTime17.get(dateTimeFieldType24);
        int int27 = dateTime1.get(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime7", (instant0.compareTo(mutableDateTime7) == 0) == instant0.equals(mutableDateTime7));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0325");
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
        org.joda.time.DateTime.Property property11 = dateTime1.weekOfWeekyear();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withPeriodAdded(readablePeriod17, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime22 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYear(17);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        int int26 = property11.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0326");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime21.minus(readablePeriod26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withPeriodAdded(readablePeriod28, 50568445);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant25", (dateTime30.compareTo(instant25) == 0) == dateTime30.equals(instant25));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0327");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMonths(772);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0328");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = property5.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        java.lang.String str15 = dateTimeZone12.toString();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(chronology19);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology19.add(readablePeriod22, (long) 48, 2122);
        org.joda.time.DurationField durationField26 = chronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology19.weekyear();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime16.toMutableDateTime(chronology19);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean30 = mutableDateTime28.isSupported(dateTimeFieldType29);
        boolean boolean31 = localDate6.isSupported(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and mutableDateTime28", (mutableDateTime8.compareTo(mutableDateTime28) == 0) == mutableDateTime8.equals(mutableDateTime28));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0329");
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
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.Interval interval25 = localDate23.toInterval(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate23.plusMonths(0);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        long long30 = property28.getDifferenceAsLong((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant32 = instant29.minus((long) (byte) 1);
        long long33 = instant32.getMillis();
        org.joda.time.MutableDateTime mutableDateTime34 = instant32.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime35 = instant32.toMutableDateTimeISO();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) mutableDateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant29", (mutableDateTime9.compareTo(instant29) == 0) == mutableDateTime9.equals(instant29));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0330");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeFormatter6.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        mutableDateTime1.add(durationFieldType3, (int) (short) 1);
        org.joda.time.Chronology chronology6 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.DateTime dateTime17 = mutableDateTime9.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField19 = chronology18.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime17", (mutableDateTime9.compareTo(dateTime17) == 0) == mutableDateTime9.equals(dateTime17));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0333");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.LocalTime localTime9 = dateTime8.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = mutableDateTime2.getZone();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        long long8 = dateTimeZone3.convertLocalToUTC((long) 0, true, (long) 32772);
        int int10 = dateTimeZone3.getOffset((long) 10);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusMinutes((int) (byte) 1);
        int int17 = localDateTime16.getYear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.year();
        int int19 = localDateTime16.getEra();
        boolean boolean20 = dateTimeZone3.isLocalDateTimeGap(localDateTime16);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime21);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime21.minuteOfDay();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale24);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromCalendarFields(calendar27);
        int int29 = property23.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar27", (calendar11.compareTo(calendar27) == 0) == calendar11.equals(calendar27));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0335");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime1.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.era();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.year();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        boolean boolean16 = mutableDateTime14.isAfter((long) 21);
        boolean boolean18 = mutableDateTime14.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        mutableDateTime14.setZone(dateTimeZone21);
        mutableDateTime10.setZoneRetainFields(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone21);
        mutableDateTime8.setZoneRetainFields(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime7", (mutableDateTime1.compareTo(mutableDateTime7) == 0) == mutableDateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0336");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime10 = dateTime1.plusMonths((int) (short) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0337");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addHours(40);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withFieldAdded(durationFieldType14, (int) (byte) 1);
        org.joda.time.DateTime dateTime17 = localDateTime11.toDateTime();
        boolean boolean18 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime1.getZone();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone21, locale24);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromCalendarFields(calendar27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = property31.setCopy(19);
        java.util.Date date34 = localDateTime33.toDate();
        date34.setMinutes(54135326);
        int int37 = date34.getDate();
        boolean boolean38 = timeZone21.inDaylightTime(date34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar26", (calendar6.compareTo(calendar26) == 0) == calendar6.equals(calendar26));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0338");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        org.joda.time.MutableDateTime mutableDateTime8 = instant2.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        int int11 = dateTimeZone9.getStandardOffset((long) 54121606);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime8", (instant2.compareTo(mutableDateTime8) == 0) == instant2.equals(mutableDateTime8));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0339");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DurationField durationField2 = property1.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = dateTimeField8.getAsText(7, locale10);
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
        java.lang.String str22 = locale10.getDisplayVariant(locale19);
        java.util.Locale locale23 = locale19.stripExtensions();
        java.lang.String str25 = locale19.getExtension('a');
        int int26 = property1.getMaximumShortTextLength(locale19);
        org.joda.time.DateTime dateTime28 = property1.addWrapFieldToCopy(53);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology31 = instant30.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(chronology31);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        long long37 = property36.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime35", (dateTime28.compareTo(dateTime35) == 0) == dateTime28.equals(dateTime35));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0340");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.DateTime dateTime11 = instant9.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = instant9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.era();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        int int17 = localDate16.getDayOfMonth();
        org.joda.time.LocalDate localDate19 = localDate16.plusYears((int) (byte) 100);
        org.joda.time.Interval interval20 = localDate19.toInterval();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        java.lang.String str29 = dateTimeZone23.toString();
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime31 = mutableDateTime14.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime32 = dateTime12.withZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime14", (instant6.compareTo(mutableDateTime14) == 0) == instant6.equals(mutableDateTime14));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0341");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.DateTime.Property property9 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0342");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.LocalDate localDate14 = localDate11.plusYears((int) (byte) 100);
        org.joda.time.LocalDate localDate16 = localDate11.minusMonths(17);
        org.joda.time.DateTime dateTime17 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.TimeOfDay timeOfDay18 = dateTime17.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0343");
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
        org.joda.time.DateTime dateTime13 = dateTime1.plus(1645455738000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0344");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.dayOfWeek();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        mutableDateTime0.setMinuteOfDay(52);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime6.toMutableDateTime();
        int int10 = mutableDateTime6.getYearOfCentury();
        int int11 = mutableDateTime6.getSecondOfDay();
        boolean boolean12 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime9", (instant2.compareTo(mutableDateTime9) == 0) == instant2.equals(mutableDateTime9));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0345");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) 10);
        org.joda.time.DateTime dateTime18 = localDateTime7.toDateTime(dateTimeZone15);
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 7);
        boolean boolean22 = dateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime21);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean25 = instant23.isSupported(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.era();
        int int27 = instant23.get(dateTimeFieldType26);
        org.joda.time.Instant instant29 = instant23.plus((long) 54121606);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant23.minus(readableDuration30);
        mutableDateTime21.setDate((org.joda.time.ReadableInstant) instant23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant23", (mutableDateTime11.compareTo(instant23) == 0) == mutableDateTime11.equals(instant23));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0346");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfFloorCopy();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = property10.setCopy(19);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMonths(4);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plus(readableDuration15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(4);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readableDuration19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.era();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withPeriodAdded(readablePeriod22, 7);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime5.withFields((org.joda.time.ReadablePartial) localDateTime24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str37 = localDateTime35.toString(dateTimeFormatter36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusSeconds(12);
        org.joda.time.Instant instant40 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.joda.time.DateTime.Property property42 = dateTime41.weekOfWeekyear();
        org.joda.time.DateTime dateTime44 = dateTime41.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime46 = dateTime41.withYear(8);
        org.joda.time.DateTime dateTime48 = dateTime41.withWeekyear(1);
        java.util.Date date49 = dateTime41.toDate();
        org.joda.time.DateTime dateTime50 = localDateTime39.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        boolean boolean51 = localDateTime25.equals((java.lang.Object) localDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant40 and dateTime41", (instant40.compareTo(dateTime41) == 0) == instant40.equals(dateTime41));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0347");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) '#', 16);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 54137);
        org.joda.time.DateTime dateTime11 = instant7.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime11.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime12", (instant7.compareTo(mutableDateTime12) == 0) == instant7.equals(mutableDateTime12));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology12.add(readablePeriod22, (long) 1256, 903);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0349");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean16 = localTime14.equals((java.lang.Object) dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType17.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType15.getField(chronology20);
        org.joda.time.LocalTime localTime26 = localTime11.withField(dateTimeFieldType15, 9);
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology29 = instant28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField32 = chronology29.weeks();
        org.joda.time.DateTimeField dateTimeField33 = chronology29.clockhourOfHalfday();
        boolean boolean34 = dateTimeFieldType15.isSupported(chronology29);
        org.joda.time.Chronology chronology35 = chronology29.withUTC();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType38.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.secondOfDay();
        java.lang.String str44 = dateTimeField43.getName();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.years();
        java.lang.String str49 = durationFieldType48.toString();
        boolean boolean50 = localTime47.isSupported(durationFieldType48);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime53 = localTime47.withFieldAdded(durationFieldType51, 32772);
        org.joda.time.LocalTime.Property property54 = localTime47.hourOfDay();
        org.joda.time.LocalTime localTime55 = property54.roundCeilingCopy();
        org.joda.time.LocalTime localTime57 = localTime55.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime60 = localTime57.minusMinutes((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone61);
        org.joda.time.MutableDateTime.Property property63 = mutableDateTime62.era();
        org.joda.time.MutableDateTime.Property property64 = mutableDateTime62.year();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone65);
        boolean boolean68 = mutableDateTime66.isAfter((long) 21);
        boolean boolean70 = mutableDateTime66.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone73 = mutableDateTime72.getZone();
        mutableDateTime66.setZone(dateTimeZone73);
        mutableDateTime62.setZoneRetainFields(dateTimeZone73);
        org.joda.time.DateTime dateTime76 = localTime60.toDateTimeToday(dateTimeZone73);
        java.util.Locale locale80 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.lang.String str81 = dateTimeZone73.getShortName((-3599999L), locale80);
        java.lang.String str82 = dateTimeField43.getAsShortText((long) 31, locale80);
        java.lang.String str83 = dateTimeField43.getName();
        java.util.Locale locale84 = java.util.Locale.UK;
        java.util.Locale locale85 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet86 = locale85.getExtensionKeys();
        java.util.Locale locale87 = java.util.Locale.KOREA;
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale87.getDisplayScript(locale88);
        java.lang.String str90 = locale85.getDisplayScript(locale88);
        java.util.Locale locale91 = java.util.Locale.UK;
        java.lang.String str92 = locale85.getDisplayScript(locale91);
        java.lang.String str93 = locale84.getDisplayLanguage(locale91);
        int int94 = dateTimeField43.getMaximumShortTextLength(locale91);
        java.util.Calendar calendar95 = dateTime37.toCalendar(locale91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and mutableDateTime62", (mutableDateTime36.compareTo(mutableDateTime62) == 0) == mutableDateTime36.equals(mutableDateTime62));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0350");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean9 = dateTimeZone5.equals((java.lang.Object) dateTimeFieldType8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime7", (mutableDateTime1.compareTo(mutableDateTime7) == 0) == mutableDateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0351");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant3.withDurationAdded(readableDuration4, 5);
        org.joda.time.Instant instant7 = instant3.toInstant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean12 = localTime10.equals((java.lang.Object) dateTimeFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType13.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType11.getField(chronology16);
        org.joda.time.MutableDateTime mutableDateTime21 = instant7.toMutableDateTime(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (short) 100);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant18 = instant12.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean19 = instant12.isAfterNow();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant12);
        long long21 = instant12.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime11", (mutableDateTime1.compareTo(mutableDateTime11) == 0) == mutableDateTime1.equals(mutableDateTime11));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0353");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(40);
        boolean boolean7 = dateTime6.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        boolean boolean5 = mutableDateTime1.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime1.setZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) (short) 100);
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant18 = instant12.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean19 = instant12.isAfterNow();
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(1L);
        int int23 = mutableDateTime22.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.era();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        mutableDateTime25.add(readablePeriod27, (int) (byte) 100);
        mutableDateTime22.setTime((org.joda.time.ReadableInstant) mutableDateTime25);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.hourOfDay();
        org.joda.time.DurationField durationField38 = dateTimeField37.getLeapDurationField();
        int int39 = mutableDateTime25.get(dateTimeField37);
        mutableDateTime1.setRounding(dateTimeField37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and instant12", (mutableDateTime11.compareTo(instant12) == 0) == mutableDateTime11.equals(instant12));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        mutableDateTime1.addMonths(21);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths(0);
        org.joda.time.LocalDate.Property property17 = localDate16.year();
        int int18 = localDate16.size();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.DateTime dateTime27 = localDate16.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property29 = dateTime27.property(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = property29.roundCeilingCopy();
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) dateTime30);
        mutableDateTime1.setDayOfMonth((int) (short) 10);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant39 = instant36.withDurationAdded(readableDuration37, (int) (short) 0);
        boolean boolean41 = instant36.isBefore((long) 5);
        java.util.Date date42 = instant36.toDate();
        int int43 = date42.getYear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) date42, dateTimeZone46);
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone46);
        boolean boolean51 = dateTimeZone46.isStandardOffset((long) 5);
        java.lang.String str53 = dateTimeZone46.getShortName(1645455775286L);
        mutableDateTime1.setZoneRetainFields(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant34", (mutableDateTime4.compareTo(instant34) == 0) == mutableDateTime4.equals(instant34));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withOffsetParsed();
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
        org.joda.time.DateTimeField dateTimeField24 = chronology19.weekyearOfCentury();
        java.util.Locale locale28 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.lang.String str29 = dateTimeField24.getAsShortText((int) '4', locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter6.withLocale(locale28);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant35.withDurationAdded(readableDuration36, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime39 = instant35.toMutableDateTime();
        int int42 = dateTimeFormatter32.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime39, "English (United Kingdom)", 2019);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(dateTimeZone43);
        mutableDateTime44.setMinuteOfDay(100);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime44.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.DateTimeZone dateTimeZone50 = mutableDateTime49.getZone();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(dateTimeZone50);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType54 = dateTimeFieldType53.getDurationType();
        boolean boolean55 = localTime52.isSupported(durationFieldType54);
        mutableDateTime44.add(durationFieldType54, 54127861);
        boolean boolean58 = mutableDateTime39.isAfter((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and mutableDateTime49", (instant33.compareTo(mutableDateTime49) == 0) == instant33.equals(mutableDateTime49));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0357");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = property8.addCopy(19);
        org.joda.time.LocalTime localTime13 = localTime11.withHourOfDay(8);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis((long) (short) 100);
        org.joda.time.Instant instant17 = instant16.toInstant();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, 5);
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        int int22 = dateTime21.getSecondOfDay();
        boolean boolean23 = localTime11.equals((java.lang.Object) int22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime21", (instant16.compareTo(dateTime21) == 0) == instant16.equals(dateTime21));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0358");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime2 = instant0.toDateTimeISO();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0359");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.DateTime dateTime8 = dateTime1.plusHours(54100989);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekyear(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0360");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale locale9 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale9.getDisplayScript(locale12);
        java.util.Locale locale15 = java.util.Locale.UK;
        java.lang.String str16 = locale9.getDisplayScript(locale15);
        java.lang.String str17 = locale8.getDisplayLanguage(locale15);
        java.lang.String str18 = locale8.getDisplayCountry();
        java.lang.String str20 = locale8.getExtension('a');
        java.util.Calendar calendar21 = dateTime7.toCalendar(locale8);
        org.joda.time.DateTime.Property property22 = dateTime7.yearOfEra();
        org.joda.time.DateTime.Property property23 = dateTime7.minuteOfHour();
        org.joda.time.DateTime dateTime25 = dateTime7.plusMonths(54207100);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.weekOfWeekyear();
        org.joda.time.DateTime dateTime30 = dateTime27.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime32 = dateTime27.withYear(8);
        org.joda.time.DateTime dateTime34 = dateTime27.withWeekyear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property36 = dateTime27.property(dateTimeFieldType35);
        int int37 = dateTime25.get(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant26 and dateTime27", (instant26.compareTo(dateTime27) == 0) == instant26.equals(dateTime27));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0361");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        org.joda.time.DateMidnight dateMidnight14 = localDate4.toDateMidnight(dateTimeZone8);
        int int15 = dateMidnight14.getMinuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight14.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.hourOfDay();
        int int18 = mutableDateTime16.getDayOfMonth();
        mutableDateTime16.setTime(1645455690671L);
        mutableDateTime16.setYear(54160723);
        mutableDateTime16.addWeeks(2030);
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime26 = instant25.toDateTime();
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime29 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property30 = dateTime26.monthOfYear();
        org.joda.time.DateTime.Property property31 = dateTime26.dayOfYear();
        org.joda.time.DateTime dateTime33 = dateTime26.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime35 = dateTime26.plusMillis(999);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant25", (mutableDateTime7.compareTo(instant25) == 0) == mutableDateTime7.equals(instant25));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8);
        mutableDateTime7.setTime(100L);
        mutableDateTime7.setMillis((-431366460000L));
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        java.lang.String str17 = durationFieldType16.toString();
        boolean boolean18 = localTime15.isSupported(durationFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime21 = localTime15.withFieldAdded(durationFieldType19, 32772);
        org.joda.time.LocalTime.Property property22 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean30 = localTime28.equals((java.lang.Object) dateTimeFieldType29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType29.getField(chronology34);
        org.joda.time.LocalTime localTime40 = localTime25.withField(dateTimeFieldType29, 9);
        org.joda.time.Instant instant42 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology43 = instant42.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfHalfday();
        org.joda.time.DurationField durationField46 = chronology43.weeks();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfHalfday();
        boolean boolean48 = dateTimeFieldType29.isSupported(chronology43);
        org.joda.time.DateTimeField dateTimeField49 = chronology43.clockhourOfDay();
        boolean boolean50 = dateTimeField49.isLenient();
        int int51 = mutableDateTime7.get(dateTimeField49);
        mutableDateTime7.setMillisOfSecond((int) (short) 10);
        java.lang.Object obj54 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology58 = localTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType55.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.secondOfDay();
        org.joda.time.DurationField durationField61 = chronology58.seconds();
        org.joda.time.DurationField durationField62 = chronology58.years();
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(obj54, chronology58);
        boolean boolean64 = mutableDateTime7.isAfter((org.joda.time.ReadableInstant) mutableDateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField44 and durationField62", (durationField44.compareTo(durationField62) == 0) == durationField44.equals(durationField62));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0363");
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
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.minus(readablePeriod12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0364");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours(8);
        org.joda.time.LocalDate localDate22 = dateTime19.toLocalDate();
        org.joda.time.DateTime.Property property23 = dateTime19.era();
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant26.withDurationAdded(readableDuration27, (int) (short) 0);
        boolean boolean31 = instant26.isBefore((long) 5);
        java.util.Date date32 = instant26.toDate();
        int int33 = date32.getYear();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) date32, dateTimeZone36);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = dateTime19.withZone(dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant24", (dateTime0.compareTo(instant24) == 0) == dateTime0.equals(instant24));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0365");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek(54098460);
        java.util.TimeZone timeZone7 = calendar0.getTimeZone();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.monthOfYear();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar13 = dateTime11.toCalendar(locale12);
        boolean boolean14 = calendar0.after((java.lang.Object) calendar13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusYears(54121);
        boolean boolean23 = calendar0.after((java.lang.Object) localDateTime16);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localDateTime16.getFields();
        int int25 = localDateTime16.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar15", (calendar0.compareTo(calendar15) == 0) == calendar0.equals(calendar15));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0366");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(0);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear(49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.Instant instant11 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology12.add(readablePeriod15, (long) 48, 2122);
        org.joda.time.DurationField durationField19 = chronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.weekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology12);
        org.joda.time.DurationField durationField22 = chronology12.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime21", (mutableDateTime1.compareTo(mutableDateTime21) == 0) == mutableDateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0368");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime1.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(32770);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withPeriodAdded(readablePeriod12, 54118926);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra(20);
        int int17 = dateTimeZone3.getOffset((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0369");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime.Property property7 = dateTime1.hourOfDay();
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime1.getZone();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.MutableDateTime mutableDateTime10 = instant2.toMutableDateTime();
        mutableDateTime10.setTime(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0371");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.millisOfSecond();
        java.lang.String str10 = chronology7.toString();
        org.joda.time.DateTime dateTime11 = dateTime3.withChronology(chronology7);
        int int12 = dateTime11.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0372");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime7", (instant2.compareTo(dateTime7) == 0) == instant2.equals(dateTime7));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0373");
        java.lang.Object obj0 = null;
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekyear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj0, chronology4);
        org.joda.time.DurationField durationField8 = chronology4.eras();
        org.joda.time.DurationField durationField9 = chronology4.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField9, and durationField8", !(durationField8.compareTo(durationField9) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField9.compareTo(durationField8))));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0374");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        int int9 = date8.getYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date8, dateTimeZone12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone12);
        boolean boolean17 = dateTimeZone12.isStandardOffset((long) 5);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0375");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime6.minusYears(54138814);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0376");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime19.withMillisOfSecond(12);
        org.joda.time.DateTime dateTime27 = dateTime19.withYear((-16));
        int int28 = dateTime19.getYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(279);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone30);
        long long32 = dateTime19.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime31", (dateTime19.compareTo(dateTime31) == 0) == dateTime19.equals(dateTime31));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0377");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.MutableDateTime mutableDateTime11 = instant9.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime12 = instant9.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime13 = instant9.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.plus(54137L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime11", (instant9.compareTo(mutableDateTime11) == 0) == instant9.equals(mutableDateTime11));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0378");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.Chronology chronology5 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.centuryOfEra();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = dateTime8.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withMillisOfDay(50573406);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime8.toYearMonthDay();
        int[] intArray15 = null;
        int int16 = dateTimeField6.getMaximumValue((org.joda.time.ReadablePartial) yearMonthDay14, intArray15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime8", (instant7.compareTo(dateTime8) == 0) == instant7.equals(dateTime8));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        mutableDateTime1.addMillis(10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime1.minuteOfDay();
        boolean boolean14 = mutableDateTime1.equals((java.lang.Object) 13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.secondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime20.secondOfMinute();
        int int25 = dateTimeFormatter18.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime20, "halfdays", 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType26.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.millisOfSecond();
        mutableDateTime20.setChronology(chronology29);
        mutableDateTime1.setChronology(chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and mutableDateTime20", (mutableDateTime7.compareTo(mutableDateTime20) == 0) == mutableDateTime7.equals(mutableDateTime20));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0380");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.TimeOfDay timeOfDay24 = dateTime19.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant23", (dateTime19.compareTo(instant23) == 0) == dateTime19.equals(instant23));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0381");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours(859);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0382");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes(82800111);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0383");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusDays(54112697);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant10.withDurationAdded(readableDuration11, (int) (short) 0);
        boolean boolean15 = instant10.isBefore((long) 5);
        java.util.Date date16 = instant10.toDate();
        org.joda.time.Instant instant18 = instant10.withMillis(63840268800048L);
        org.joda.time.DateTime dateTime19 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) instant18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant18.minus(readableDuration20);
        org.joda.time.DateTime dateTime22 = instant18.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime23 = instant18.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime22", (instant18.compareTo(dateTime22) == 0) == instant18.equals(dateTime22));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0384");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.withHourOfDay(13);
        org.joda.time.DateTime.Property property6 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfEra(12);
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.Instant instant11 = instant2.plus((long) 13);
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0386");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime5.add(readableDuration6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant4", (mutableDateTime1.compareTo(instant4) == 0) == mutableDateTime1.equals(instant4));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0387");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(40);
        int int7 = dateTime6.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8);
        org.joda.time.DateTime dateTime10 = mutableDateTime7.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        java.lang.String str18 = chronology14.toString();
        org.joda.time.Chronology chronology19 = chronology14.withUTC();
        org.joda.time.DurationField durationField20 = chronology19.halfdays();
        mutableDateTime7.setChronology(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime10", (mutableDateTime7.compareTo(dateTime10) == 0) == mutableDateTime7.equals(dateTime10));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0389");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar.Builder builder13 = builder8.setTimeOfDay(8, 16, (int) ' ', 9);
        java.util.Calendar.Builder builder17 = builder13.setWeekDate(0, 0, (int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField(chronology21);
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale23.getDisplayScript(locale24);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.lang.String str30 = locale24.getDisplayCountry(locale26);
        int int31 = dateTimeField22.getMaximumTextLength(locale24);
        java.lang.String str32 = locale24.getVariant();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        java.lang.String str36 = durationFieldType35.toString();
        boolean boolean37 = localTime34.isSupported(durationFieldType35);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime40 = localTime34.withFieldAdded(durationFieldType38, 32772);
        org.joda.time.LocalTime.Property property41 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime42 = property41.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalTime localTime44 = localTime42.minus(readablePeriod43);
        org.joda.time.Instant instant45 = new org.joda.time.Instant();
        org.joda.time.Instant instant47 = instant45.withMillis((long) (short) 100);
        org.joda.time.Instant instant48 = instant47.toInstant();
        boolean boolean49 = localTime44.equals((java.lang.Object) instant47);
        java.util.TimeZone timeZone52 = java.util.TimeZone.getTimeZone("years");
        boolean boolean53 = timeZone52.observesDaylightTime();
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Locale locale55 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet56 = locale55.getExtensionKeys();
        java.util.Locale locale57 = java.util.Locale.KOREA;
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.lang.String str59 = locale57.getDisplayScript(locale58);
        java.lang.String str60 = locale55.getDisplayScript(locale58);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = locale55.getDisplayScript(locale61);
        java.lang.String str63 = locale54.getDisplayLanguage(locale61);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone52, locale54);
        java.lang.String str65 = localTime44.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale54);
        java.lang.String str66 = locale24.getDisplayName(locale54);
        java.util.Calendar.Builder builder67 = builder13.setLocale(locale24);
        java.util.Calendar.Builder builder71 = builder13.setDate(100, 54142136, 50578855);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime(dateTimeZone72);
        org.joda.time.DateTimeZone dateTimeZone74 = mutableDateTime73.getZone();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone77 = mutableDateTime76.getZone();
        long long79 = dateTimeZone74.getMillisKeepLocal(dateTimeZone77, (long) 10);
        java.lang.String str80 = dateTimeZone74.toString();
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.lang.String str83 = locale82.toLanguageTag();
        java.util.Locale locale84 = java.util.Locale.KOREA;
        java.lang.String str85 = locale82.getDisplayCountry(locale84);
        java.lang.String str86 = dateTimeZone74.getName((long) 54089980, locale84);
        java.lang.String str87 = locale84.getDisplayLanguage();
        java.util.Calendar.Builder builder88 = builder71.setLocale(locale84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant45 and mutableDateTime73", (instant45.compareTo(mutableDateTime73) == 0) == instant45.equals(mutableDateTime73));
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0390");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(0);
        int int19 = dateTime16.getMonthOfYear();
        org.joda.time.DateTime.Property property20 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime16.plus((long) (byte) 1);
        org.joda.time.Instant instant24 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.yearOfEra();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology25);
        org.joda.time.DateTime dateTime29 = dateTime22.withChronology(chronology25);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0391");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addHours(40);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
        int int12 = localDateTime11.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withFieldAdded(durationFieldType14, (int) (byte) 1);
        org.joda.time.DateTime dateTime17 = localDateTime11.toDateTime();
        boolean boolean18 = mutableDateTime1.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime1.getZone();
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone21, locale24);
        java.util.Date date27 = calendar26.getTime();
        java.lang.String str28 = date27.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar26", (calendar6.compareTo(calendar26) == 0) == calendar6.equals(calendar26));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0392");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        org.joda.time.DateMidnight dateMidnight14 = localDate4.toDateMidnight(dateTimeZone8);
        org.joda.time.LocalDate localDate16 = localDate4.withYear(11);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime18 = instant17.toDateTime();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime18.withCenturyOfEra((int) '#');
        int int22 = dateTime18.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter23.getPrinter();
        java.lang.String str27 = dateTime18.toString(dateTimeFormatter23);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        int int29 = localDate28.getDayOfMonth();
        org.joda.time.LocalDate localDate31 = localDate28.plusYears((int) (byte) 100);
        org.joda.time.LocalDate localDate33 = localDate28.minusMonths(17);
        org.joda.time.DateTime dateTime34 = dateTime18.withFields((org.joda.time.ReadablePartial) localDate33);
        boolean boolean35 = localDate4.isBefore((org.joda.time.ReadablePartial) localDate33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant17", (mutableDateTime7.compareTo(instant17) == 0) == mutableDateTime7.equals(instant17));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0393");
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
        org.joda.time.DateTime.Property property21 = dateTime1.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime12", (instant0.compareTo(mutableDateTime12) == 0) == instant0.equals(mutableDateTime12));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0394");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant4.withDurationAdded(readableDuration6, 54142969);
        org.joda.time.DateTime dateTime9 = instant4.toDateTimeISO();
        org.joda.time.Instant instant11 = instant4.plus(54129298L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime9", (instant4.compareTo(dateTime9) == 0) == instant4.equals(dateTime9));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0395");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getEra();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        boolean boolean10 = localTime7.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime13 = localTime7.withFieldAdded(durationFieldType11, 32772);
        org.joda.time.LocalTime.Property property14 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime16 = localTime7.minusMinutes(2922789);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(chronology19);
        boolean boolean21 = localTime7.equals((java.lang.Object) chronology19);
        org.joda.time.DateTimeField dateTimeField22 = chronology19.minuteOfHour();
        long long25 = dateTimeField22.add(7254121L, 1645455744611L);
        int int26 = dateTime1.get(dateTimeField22);
        int int28 = dateTimeField22.getMinimumValue(1645455836723L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0396");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillis((long) 54121897);
        org.joda.time.DateTime.Property property9 = dateTime8.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0397");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withChronology(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis(1707912922665602122L);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = mutableDateTime31.getZone();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime31.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now();
        boolean boolean35 = mutableDateTime34.isAfterNow();
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime34.add(readableDuration36, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime43.getZone();
        long long46 = dateTimeZone41.getMillisKeepLocal(dateTimeZone44, (long) 10);
        boolean boolean47 = dateTimeZone44.isFixed();
        mutableDateTime34.setZoneRetainFields(dateTimeZone44);
        mutableDateTime31.setZoneRetainFields(dateTimeZone44);
        int int50 = dateTime29.compareTo((org.joda.time.ReadableInstant) mutableDateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime27", (dateTime25.compareTo(dateTime27) == 0) == dateTime25.equals(dateTime27));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0398");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.Instant instant10 = instant2.minus((long) 54089980);
        org.joda.time.DateTime dateTime11 = instant2.toDateTimeISO();
        long long12 = instant2.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime11", (instant2.compareTo(dateTime11) == 0) == instant2.equals(dateTime11));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0399");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localTime2.toDateTimeToday(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(19L, dateTimeZone17);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant21.withDurationAdded(readableDuration22, 100);
        java.lang.Object obj25 = null;
        boolean boolean26 = instant21.equals(obj25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant21", (mutableDateTime20.compareTo(instant21) == 0) == mutableDateTime20.equals(instant21));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 0, true, (long) 32772);
        int int9 = dateTimeZone2.getOffset((long) 10);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusMinutes((int) (byte) 1);
        int int16 = localDateTime15.getYear();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.year();
        int int18 = localDateTime15.getEra();
        boolean boolean19 = dateTimeZone2.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        java.lang.String str28 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.Instant instant31 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(chronology32);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = chronology32.add(readablePeriod35, (long) 48, 2122);
        org.joda.time.DurationField durationField39 = chronology32.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.weekyear();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime29.toMutableDateTime(chronology32);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean43 = mutableDateTime41.isSupported(dateTimeFieldType42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime15.property(dateTimeFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime41", (mutableDateTime1.compareTo(mutableDateTime41) == 0) == mutableDateTime1.equals(mutableDateTime41));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0401");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) -1);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime3 = instant2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime3.getZone();
        boolean boolean6 = localTime1.equals((java.lang.Object) dateTime3);
        org.joda.time.DateTime dateTime7 = dateTime3.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.plusYears(694);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime7", (instant2.compareTo(dateTime7) == 0) == instant2.equals(dateTime7));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0402");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        long long3 = instant0.getMillis();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(10L, dateTimeZone35);
        long long43 = dateTimeZone35.nextTransition((long) 12);
        org.joda.time.DateTime dateTime44 = dateTime31.withZone(dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime11.toDateTime(dateTimeZone35);
        long long48 = dateTimeZone35.adjustOffset(194766091200000L, false);
        org.joda.time.DateTime dateTime49 = instant0.toDateTime(dateTimeZone35);
        org.joda.time.DateTime.Property property50 = dateTime49.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0403");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date7 = calendar0.getTime();
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        calendar9.setMinimalDaysInFirstWeek(54131539);
        java.util.Calendar.Builder builder12 = new java.util.Calendar.Builder();
        java.util.Calendar calendar13 = builder12.build();
        java.util.Calendar.Builder builder18 = builder12.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder22 = builder18.setDate(111, 901, (int) '4');
        java.util.Calendar.Builder builder26 = builder22.setDate((int) 'a', (int) 'u', 16);
        java.util.Calendar calendar27 = builder26.build();
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("years");
        int int31 = timeZone29.getOffset((long) 19);
        int int32 = timeZone29.getRawOffset();
        calendar27.setTimeZone(timeZone29);
        calendar9.setTimeZone(timeZone29);
        java.util.TimeZone.setDefault(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar9", (calendar0.compareTo(calendar9) == 0) == calendar0.equals(calendar9));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        mutableDateTime1.setMillis(12L);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime1.add(readablePeriod5, 3);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.dayOfWeek();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime1.add(readablePeriod10);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.yearOfEra();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime1.toMutableDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField21 = chronology14.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime20", (mutableDateTime1.compareTo(mutableDateTime20) == 0) == mutableDateTime1.equals(mutableDateTime20));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0405");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime7 = dateTime1.withLaterOffsetAtOverlap();
        boolean boolean8 = dateTime7.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0406");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        mutableDateTime1.addMonths(23);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime1.add(readablePeriod7);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int11 = localTime10.size();
        org.joda.time.LocalTime localTime13 = localTime10.plusMinutes(6);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime15.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime19 = dateTime15.withHourOfDay(13);
        org.joda.time.DateTime.Property property20 = dateTime15.centuryOfEra();
        boolean boolean21 = localTime10.equals((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime23 = dateTime15.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime15.minus(readableDuration24);
        boolean boolean26 = mutableDateTime1.equals((java.lang.Object) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime25", (instant14.compareTo(dateTime25) == 0) == instant14.equals(dateTime25));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0407");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale4 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.util.Locale.setDefault(category0, locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        java.lang.String str14 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
        java.util.TimeZone timeZone16 = dateTimeZone11.toTimeZone();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone16, locale18);
        java.util.Locale locale20 = locale18.stripExtensions();
        java.util.Locale.setDefault(category0, locale18);
        java.util.Locale locale22 = java.util.Locale.getDefault(category0);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        java.lang.String str25 = locale23.getLanguage();
        java.util.Locale.setDefault(category0, locale23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar19 and calendar24", (calendar19.compareTo(calendar24) == 0) == calendar19.equals(calendar24));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0408");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 54106168);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        boolean boolean6 = dateTimeZone4.isStandardOffset((long) 11);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime1.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property8 = dateTime1.millisOfDay();
        org.joda.time.DateTime dateTime10 = property8.setCopy("54124848");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime7", (dateTime1.compareTo(mutableDateTime7) == 0) == dateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0409");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 54112806, 54121606);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded((long) 54134385, 54000000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0410");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0411");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean22 = localTime20.equals((java.lang.Object) dateTimeFieldType21);
        org.joda.time.LocalTime.Property property23 = localTime12.property(dateTimeFieldType21);
        int int24 = localTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime1.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str27 = durationFieldType26.toString();
        boolean boolean28 = localTime12.isSupported(durationFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0412");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes(7);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        java.util.Locale locale7 = null;
        java.util.Calendar calendar8 = dateTime5.toCalendar(locale7);
        org.joda.time.DateTime dateTime10 = dateTime5.minusYears(54126);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Interval interval14 = localDate12.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate12.plusMonths(0);
        org.joda.time.LocalDate.Property property17 = localDate16.weekOfWeekyear();
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        long long19 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) instant18);
        org.joda.time.Instant instant21 = instant18.minus((long) (byte) 1);
        long long22 = instant21.getMillis();
        boolean boolean23 = dateTime10.isBefore((org.joda.time.ReadableInstant) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant18", (dateTime0.compareTo(instant18) == 0) == dateTime0.equals(instant18));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0413");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant10.withDurationAdded(readableDuration11, (int) (short) 0);
        boolean boolean15 = instant10.isBefore((long) 5);
        java.util.Date date16 = instant10.toDate();
        int int17 = date16.getYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) date16, dateTimeZone20);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone20);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone20);
        long long26 = dateTimeZone5.getMillisKeepLocal(dateTimeZone20, (long) 694);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime7", (mutableDateTime1.compareTo(mutableDateTime7) == 0) == mutableDateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0414");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(1L);
        int int9 = mutableDateTime8.getCenturyOfEra();
        int int10 = mutableDateTime8.getDayOfYear();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.minuteOfHour();
        mutableDateTime8.addMonths(23);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        mutableDateTime8.add(readablePeriod14);
        int int16 = dateTime6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withField(dateTimeFieldType25, 40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser32 = dateTimeFormatter29.getParser();
        java.util.Locale locale33 = dateTimeFormatter29.getLocale();
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter29.withChronology(chronology36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (-3600000), chronology36);
        org.joda.time.Chronology chronology41 = chronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField42 = chronology36.secondOfMinute();
        boolean boolean43 = dateTimeFieldType25.isSupported(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime37", (mutableDateTime1.compareTo(mutableDateTime37) == 0) == mutableDateTime1.equals(mutableDateTime37));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0416");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillis((long) 54121897);
        org.joda.time.DateTime dateTime10 = dateTime1.plusMillis(999);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime1.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusWeeks(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime12", (instant0.compareTo(dateTime12) == 0) == instant0.equals(dateTime12));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0417");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localTime2.toDateTimeToday(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(19L, dateTimeZone17);
        org.joda.time.Instant instant21 = mutableDateTime20.toInstant();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant21.withDurationAdded(readableDuration22, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType25.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.hourOfDay();
        java.lang.String str32 = chronology28.toString();
        org.joda.time.DateTimeZone dateTimeZone33 = chronology28.getZone();
        org.joda.time.DurationField durationField34 = chronology28.centuries();
        boolean boolean35 = instant24.equals((java.lang.Object) durationField34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and instant24", (mutableDateTime20.compareTo(instant24) == 0) == mutableDateTime20.equals(instant24));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
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
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone8);
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Locale locale26 = java.util.Locale.ROOT;
        boolean boolean27 = locale26.hasExtensions();
        java.lang.String str28 = locale25.getDisplayScript(locale26);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        java.lang.String str32 = durationFieldType31.toString();
        boolean boolean33 = localTime30.isSupported(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime36 = localTime30.withFieldAdded(durationFieldType34, 32772);
        org.joda.time.LocalTime.Property property37 = localTime30.hourOfDay();
        org.joda.time.LocalTime localTime39 = localTime30.minusMinutes(19);
        org.joda.time.DateTime dateTime40 = localTime39.toDateTimeToday();
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology45 = localTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType42.getField(chronology45);
        java.util.Locale locale47 = java.util.Locale.KOREA;
        java.util.Locale locale48 = java.util.Locale.KOREA;
        java.lang.String str49 = locale47.getDisplayScript(locale48);
        java.util.Locale locale50 = java.util.Locale.KOREA;
        java.lang.String str51 = locale50.toLanguageTag();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.lang.String str53 = locale50.getDisplayCountry(locale52);
        java.lang.String str54 = locale48.getDisplayCountry(locale50);
        int int55 = dateTimeField46.getMaximumTextLength(locale48);
        java.lang.String str56 = locale48.getVariant();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType59 = org.joda.time.DurationFieldType.years();
        java.lang.String str60 = durationFieldType59.toString();
        boolean boolean61 = localTime58.isSupported(durationFieldType59);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime64 = localTime58.withFieldAdded(durationFieldType62, 32772);
        org.joda.time.LocalTime.Property property65 = localTime58.hourOfDay();
        org.joda.time.LocalTime localTime66 = property65.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalTime localTime68 = localTime66.minus(readablePeriod67);
        org.joda.time.Instant instant69 = new org.joda.time.Instant();
        org.joda.time.Instant instant71 = instant69.withMillis((long) (short) 100);
        org.joda.time.Instant instant72 = instant71.toInstant();
        boolean boolean73 = localTime68.equals((java.lang.Object) instant71);
        java.util.TimeZone timeZone76 = java.util.TimeZone.getTimeZone("years");
        boolean boolean77 = timeZone76.observesDaylightTime();
        java.util.Locale locale78 = java.util.Locale.UK;
        java.util.Locale locale79 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet80 = locale79.getExtensionKeys();
        java.util.Locale locale81 = java.util.Locale.KOREA;
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.lang.String str83 = locale81.getDisplayScript(locale82);
        java.lang.String str84 = locale79.getDisplayScript(locale82);
        java.util.Locale locale85 = java.util.Locale.UK;
        java.lang.String str86 = locale79.getDisplayScript(locale85);
        java.lang.String str87 = locale78.getDisplayLanguage(locale85);
        java.util.Calendar calendar88 = java.util.Calendar.getInstance(timeZone76, locale78);
        java.lang.String str89 = localTime68.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale78);
        java.lang.String str90 = locale48.getDisplayName(locale78);
        java.util.Set<java.lang.String> strSet91 = locale48.getUnicodeLocaleKeys();
        int int92 = property41.getMaximumShortTextLength(locale48);
        java.lang.String str93 = locale26.getDisplayScript(locale48);
        java.lang.String str94 = dateTimeZone8.getShortName((long) 408, locale48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant69", (mutableDateTime1.compareTo(instant69) == 0) == mutableDateTime1.equals(instant69));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0419");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        long long3 = instant0.getMillis();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(10L, dateTimeZone35);
        long long43 = dateTimeZone35.nextTransition((long) 12);
        org.joda.time.DateTime dateTime44 = dateTime31.withZone(dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime11.toDateTime(dateTimeZone35);
        long long48 = dateTimeZone35.adjustOffset(194766091200000L, false);
        org.joda.time.DateTime dateTime49 = instant0.toDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime50 = dateTime49.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0420");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean3 = localTime1.equals((java.lang.Object) dateTimeFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology7);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone16.previousTransition((-431366460000L));
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
        java.lang.String str34 = dateTimeZone22.getName((long) 54089980, locale32);
        java.lang.String str35 = locale32.getDisplayLanguage();
        java.lang.String str36 = locale32.getScript();
        java.lang.String str37 = dateTimeZone16.getName((long) 52, locale32);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.DateTime dateTime40 = dateTime12.withZoneRetainFields(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime15", (dateTime13.compareTo(mutableDateTime15) == 0) == dateTime13.equals(mutableDateTime15));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0421");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.add(3, (int) ' ');
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        boolean boolean8 = calendar6.isWeekDateSupported();
        calendar6.setFirstDayOfWeek(5);
        calendar6.setMinimalDaysInFirstWeek(54098460);
        java.util.TimeZone timeZone13 = calendar6.getTimeZone();
        calendar0.setTimeZone(timeZone13);
        calendar0.add(447, (int) (short) 0);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime21 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.withHourOfDay(13);
        org.joda.time.DateTime.Property property24 = dateTime19.centuryOfEra();
        org.joda.time.DateTime dateTime26 = dateTime19.withWeekyear(0);
        org.joda.time.DateTime.Property property27 = dateTime19.minuteOfHour();
        boolean boolean28 = calendar0.equals((java.lang.Object) property27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime19", (instant18.compareTo(dateTime19) == 0) == instant18.equals(dateTime19));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.Instant instant10 = instant2.minus(1645407660000L);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0423");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) '#', 16);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 54137);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.Instant instant13 = instant10.minus(1664809332000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime11", (instant10.compareTo(mutableDateTime11) == 0) == instant10.equals(mutableDateTime11));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0424");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.millisOfDay();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.minutes();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField7, and durationField8", !(durationField9.compareTo(durationField7) == 0) || (Math.signum(durationField9.compareTo(durationField8)) == Math.signum(durationField7.compareTo(durationField8))));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        boolean boolean9 = instant2.isAfterNow();
        org.joda.time.Instant instant11 = instant2.plus((long) 13);
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.lang.String str22 = dateTimeZone10.getName((long) 54089980, locale20);
        boolean boolean24 = dateTimeZone10.isStandardOffset((long) 14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.Chronology chronology26 = chronology3.withZone(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and mutableDateTime27", (mutableDateTime9.compareTo(mutableDateTime27) == 0) == mutableDateTime9.equals(mutableDateTime27));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0427");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        long long3 = property2.remainder();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        long long7 = mutableDateTime1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime6", (instant2.compareTo(mutableDateTime6) == 0) == instant2.equals(mutableDateTime6));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.Instant instant8 = instant2.withDurationAdded((long) 'a', (int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, 21149);
        org.joda.time.DateTime dateTime12 = instant2.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0430");
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
        timeZone9.setID("DateTimeField[secondOfMinute]");
        timeZone9.setID("+00:00");
        java.time.ZoneId zoneId14 = timeZone9.toZoneId();
        java.util.Set<java.lang.String> strSet15 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.util.Locale.setDefault(category16, locale17);
        boolean boolean21 = strSet15.contains((java.lang.Object) category16);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder24 = builder22.setLocale(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale.setDefault(category16, locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        long long31 = dateTimeZone29.previousTransition((-431366460000L));
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        java.lang.String str41 = dateTimeZone35.toString();
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale43.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale43.getDisplayCountry(locale45);
        java.lang.String str47 = dateTimeZone35.getName((long) 54089980, locale45);
        java.lang.String str48 = locale45.getDisplayLanguage();
        java.lang.String str49 = locale45.getScript();
        java.lang.String str50 = dateTimeZone29.getName((long) 52, locale45);
        java.util.Locale.setDefault(category16, locale45);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone9, locale45);
        java.util.TimeZone.setDefault(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar52", (calendar8.compareTo(calendar52) == 0) == calendar8.equals(calendar52));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0431");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime19.withMillisOfSecond(12);
        org.joda.time.DateTime dateTime27 = dateTime19.withYear((-16));
        int int28 = dateTime19.getYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(279);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds(0);
        org.joda.time.DateTime dateTime34 = dateTime31.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime34", (dateTime19.compareTo(dateTime34) == 0) == dateTime19.equals(dateTime34));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0432");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology2.add(readablePeriod5, (long) 48, 2122);
        org.joda.time.DurationField durationField9 = chronology2.weekyears();
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10, locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        int int18 = dateTimeZone16.getStandardOffset(0L);
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        int int20 = timeZone19.getRawOffset();
        boolean boolean21 = timeZone10.hasSameRules(timeZone19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10);
        boolean boolean23 = timeZone10.observesDaylightTime();
        java.lang.String str24 = timeZone10.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar22", (calendar13.compareTo(calendar22) == 0) == calendar13.equals(calendar22));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0434");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        int int24 = dateTime19.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant23", (dateTime19.compareTo(instant23) == 0) == dateTime19.equals(instant23));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0435");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.year();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.copy();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        java.lang.String str12 = durationFieldType11.toString();
        boolean boolean13 = localTime10.isSupported(durationFieldType11);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime16 = localTime10.withFieldAdded(durationFieldType14, 32772);
        org.joda.time.LocalTime.Property property17 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime19 = localTime10.minusMinutes(2922789);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime23 = org.joda.time.MutableDateTime.now(chronology22);
        boolean boolean24 = localTime10.equals((java.lang.Object) chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.year();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.monthOfYear();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) mutableDateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and mutableDateTime23", (dateTime0.compareTo(mutableDateTime23) == 0) == dateTime0.equals(mutableDateTime23));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0436");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.yearOfEra();
        mutableDateTime0.setChronology(chronology3);
        java.lang.Object obj7 = null;
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate11.centuryOfEra();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.LocalDate localDate14 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj7, chronology16);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(chronology16);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(54129298);
        long long23 = chronology3.set((org.joda.time.ReadablePartial) localDate19, (long) 54092654);
        org.joda.time.Interval interval24 = localDate19.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime18", (mutableDateTime0.compareTo(dateTime18) == 0) == mutableDateTime0.equals(dateTime18));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0437");
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
        org.joda.time.DateTime.Property property18 = dateTime16.weekyear();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfDay(16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0438");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        int int18 = mutableDateTime4.get(dateTimeField16);
        mutableDateTime4.addHours(54092146);
        mutableDateTime4.setMillis((long) ' ');
        int int23 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime4.dayOfWeek();
        java.lang.Object obj25 = mutableDateTime4.clone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 21);
        boolean boolean30 = mutableDateTime27.isBeforeNow();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime4.addMillis(0);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology38.centuries();
        org.joda.time.DateTime dateTime44 = mutableDateTime4.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField45 = chronology38.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime44", (mutableDateTime4.compareTo(dateTime44) == 0) == mutableDateTime4.equals(dateTime44));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0439");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        int int18 = mutableDateTime4.get(dateTimeField16);
        mutableDateTime4.addHours(54092146);
        mutableDateTime4.setMillis((long) ' ');
        int int23 = mutableDateTime4.getMinuteOfDay();
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime4.dayOfWeek();
        java.lang.Object obj25 = mutableDateTime4.clone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        boolean boolean29 = mutableDateTime27.isAfter((long) 21);
        boolean boolean30 = mutableDateTime27.isBeforeNow();
        org.joda.time.Chronology chronology31 = mutableDateTime27.getChronology();
        int int32 = mutableDateTime4.compareTo((org.joda.time.ReadableInstant) mutableDateTime27);
        mutableDateTime4.addMillis(0);
        org.joda.time.Instant instant37 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology38 = instant37.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField43 = chronology38.centuries();
        org.joda.time.DateTime dateTime44 = mutableDateTime4.toDateTime(chronology38);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekyear(54138814);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 50564, chronology48);
        org.joda.time.DateTime dateTime51 = dateTime49.withMillis(1645455743322L);
        boolean boolean52 = dateTime46.equals((java.lang.Object) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime44", (mutableDateTime4.compareTo(dateTime44) == 0) == mutableDateTime4.equals(dateTime44));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0440");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        long long3 = instant0.getMillis();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(10L, dateTimeZone35);
        long long43 = dateTimeZone35.nextTransition((long) 12);
        org.joda.time.DateTime dateTime44 = dateTime31.withZone(dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime11.toDateTime(dateTimeZone35);
        long long48 = dateTimeZone35.adjustOffset(194766091200000L, false);
        org.joda.time.DateTime dateTime49 = instant0.toDateTime(dateTimeZone35);
        long long51 = dateTimeZone35.convertUTCToLocal((long) 54255505);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate10 = localDate4.minusMonths(10);
        java.lang.String str11 = localDate4.toString();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        int int13 = localDate12.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate12.plus(readablePeriod14);
        org.joda.time.LocalDate localDate17 = localDate12.withCenturyOfEra(21);
        org.joda.time.LocalDate localDate19 = localDate12.withYear(19);
        int[] intArray20 = localDate19.getValues();
        int int21 = dateTimeField3.getMaximumValue((org.joda.time.ReadablePartial) localDate4, intArray20);
        org.joda.time.DateTime dateTime22 = localDate4.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        boolean boolean28 = timeZone27.observesDaylightTime();
        boolean boolean29 = timeZone25.hasSameRules(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        long long33 = dateTimeZone30.convertLocalToUTC(194766091200000L, false);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) 36, dateTimeZone30);
        org.joda.time.DateTime dateTime36 = localDate4.toDateTimeAtCurrentTime(dateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime34", (mutableDateTime1.compareTo(dateTime34) == 0) == mutableDateTime1.equals(dateTime34));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = mutableDateTime1.toDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(35);
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime9", (mutableDateTime1.compareTo(dateTime9) == 0) == mutableDateTime1.equals(dateTime9));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0443");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(1967);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(dateTimeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime15", (dateTime10.compareTo(dateTime15) == 0) == dateTime10.equals(dateTime15));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.Instant instant4 = mutableDateTime1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        boolean boolean10 = localTime7.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime13 = localTime7.withFieldAdded(durationFieldType11, 32772);
        org.joda.time.LocalTime.Property property14 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime15 = property14.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property14.withMinimumValue();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime19 = localTime17.plusHours(11);
        org.joda.time.DateTime dateTime20 = localTime19.toDateTimeToday();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        java.lang.String str24 = durationFieldType23.toString();
        boolean boolean25 = localTime22.isSupported(durationFieldType23);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime28 = localTime22.withFieldAdded(durationFieldType26, 32772);
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property29.addCopy(19);
        org.joda.time.LocalTime localTime34 = property29.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime35 = property29.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime36 = property29.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType37.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.halfdayOfDay();
        java.lang.String str44 = dateTimeField43.getName();
        long long47 = dateTimeField43.getDifferenceAsLong((long) (byte) 0, (long) 54096794);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = dateTimeField43.getType();
        org.joda.time.LocalTime.Property property49 = localTime36.property(dateTimeFieldType48);
        org.joda.time.DateTime.Property property50 = dateTime20.property(dateTimeFieldType48);
        int int51 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant5", (mutableDateTime1.compareTo(instant5) == 0) == mutableDateTime1.equals(instant5));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0445");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone19);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone24);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("years");
        boolean boolean30 = timeZone29.observesDaylightTime();
        boolean boolean31 = timeZone27.hasSameRules(timeZone29);
        calendar25.setTimeZone(timeZone27);
        int int34 = calendar25.getMaximum(12);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromCalendarFields(calendar35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = property39.setCopy(19);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime44 = property42.setCopy(21);
        java.lang.String str45 = property42.getAsText();
        org.joda.time.LocalDateTime localDateTime46 = property42.roundHalfEvenCopy();
        boolean boolean47 = calendar25.before((java.lang.Object) localDateTime46);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime9.withFields((org.joda.time.ReadablePartial) localDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar25 and calendar35", (calendar25.compareTo(calendar35) == 0) == calendar25.equals(calendar35));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime5 = property2.addWrapField((-1));
        java.lang.String str6 = mutableDateTime5.toString();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime5.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = localDate10.toInterval(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths(0);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        long long17 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) instant16);
        org.joda.time.Chronology chronology18 = instant16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType9.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.hourOfDay();
        mutableDateTime5.setChronology(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime8", (mutableDateTime5.compareTo(mutableDateTime8) == 0) == mutableDateTime5.equals(mutableDateTime8));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0447");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.Chronology chronology7 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        mutableDateTime1.add((long) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str8 = dateTimeFieldType7.toString();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType7.getDurationType();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.property(dateTimeFieldType7);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(1L);
        int int13 = mutableDateTime12.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.era();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        mutableDateTime15.add(readablePeriod17, (int) (byte) 100);
        mutableDateTime12.setTime((org.joda.time.ReadableInstant) mutableDateTime15);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime12.add(readablePeriod22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DurationField durationField30 = chronology27.days();
        mutableDateTime12.setChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0449");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0450");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology9.seconds();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.DurationField durationField15 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField16 = chronology9.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter5.withChronology(chronology9);
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        int int23 = dateTimeZone21.getStandardOffset(0L);
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone21);
        boolean boolean26 = mutableDateTime18.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and mutableDateTime20", (mutableDateTime14.compareTo(mutableDateTime20) == 0) == mutableDateTime14.equals(mutableDateTime20));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0451");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant9.withDurationAdded(readableDuration11, 54089980);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        long long24 = dateTimeZone19.getMillisKeepLocal(dateTimeZone22, (long) 10);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(10L, dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(1647097300888L, dateTimeZone19);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) 50400019L, dateTimeZone19);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        boolean boolean29 = instant9.equals((java.lang.Object) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime18", (instant6.compareTo(mutableDateTime18) == 0) == instant6.equals(mutableDateTime18));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0452");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Set<java.lang.String> strSet3 = locale0.getUnicodeLocaleKeys();
        strSet3.clear();
        java.util.Iterator<java.lang.String> strItor5 = strSet3.iterator();
        int int6 = strSet3.size();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean23 = localTime21.equals((java.lang.Object) dateTimeFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType22.getField(chronology27);
        org.joda.time.LocalTime localTime33 = localTime18.withField(dateTimeFieldType22, 9);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = chronology36.weeks();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.clockhourOfHalfday();
        boolean boolean41 = dateTimeFieldType22.isSupported(chronology36);
        org.joda.time.Chronology chronology42 = chronology36.withUTC();
        org.joda.time.DurationField durationField43 = chronology36.weeks();
        org.joda.time.DurationField durationField44 = chronology36.weeks();
        boolean boolean45 = strSet3.contains((java.lang.Object) durationField44);
        strSet3.clear();
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        java.lang.String str55 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, (java.util.Collection<java.lang.String>) strList53);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap56 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList57 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap56);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap58 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList59 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap58);
        boolean boolean60 = strSet3.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList59);
        org.joda.time.Instant instant61 = org.joda.time.Instant.now();
        org.joda.time.Instant instant63 = instant61.minus((long) 13);
        org.joda.time.Instant instant65 = instant63.minus((long) 901);
        org.joda.time.Instant instant68 = instant65.withDurationAdded((long) '#', 16);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.Instant instant71 = instant68.withDurationAdded(readableDuration69, 54137);
        org.joda.time.DateTimeZone dateTimeZone72 = instant68.getZone();
        org.joda.time.Instant instant75 = instant68.withDurationAdded((long) 1439, 21156);
        org.joda.time.Instant instant76 = org.joda.time.Instant.now();
        org.joda.time.Instant instant78 = instant76.minus((long) 13);
        org.joda.time.Instant instant80 = instant78.minus((long) 901);
        org.joda.time.Instant instant82 = instant80.withMillis((long) 54134127);
        org.joda.time.DateTime dateTime83 = instant80.toDateTime();
        org.joda.time.Instant[] instantArray84 = new org.joda.time.Instant[] { instant68, instant80 };
        org.joda.time.Instant[] instantArray85 = strSet3.toArray(instantArray84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant65 and dateTime83", (instant65.compareTo(dateTime83) == 0) == instant65.equals(dateTime83));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime7 = property4.getMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType12.getField(chronology15);
        org.joda.time.DateTime dateTime17 = dateTime9.toDateTime(chronology15);
        org.joda.time.DateTime dateTime19 = dateTime9.plusWeeks(7);
        org.joda.time.DateTime.Property property20 = dateTime9.secondOfMinute();
        long long21 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) long21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime9", (instant8.compareTo(dateTime9) == 0) == instant8.equals(dateTime9));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0454");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Date date2 = calendar1.getTime();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.setLenient(false);
        java.time.Instant instant6 = calendar1.toInstant();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(874L);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean11 = instant9.isSupported(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getDurationType();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withField(dateTimeFieldType10, 18);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType10.getField(chronology15);
        boolean boolean17 = calendar1.after((java.lang.Object) dateTimeField16);
        java.util.Date date18 = calendar1.getTime();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        boolean boolean22 = mutableDateTime20.isAfter((long) 21);
        boolean boolean24 = mutableDateTime20.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        mutableDateTime20.setZone(dateTimeZone27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.lang.String str33 = locale30.getDisplayScript();
        java.lang.String str34 = dateTimeZone27.getShortName((long) 13, locale30);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromCalendarFields(calendar35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusSeconds(0);
        boolean boolean41 = dateTimeZone27.isLocalDateTimeGap(localDateTime38);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.plus(readablePeriod42);
        java.util.Date date44 = localDateTime43.toDate();
        java.lang.String str45 = date44.toGMTString();
        boolean boolean46 = date18.after(date44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime20", (instant9.compareTo(mutableDateTime20) == 0) == instant9.equals(mutableDateTime20));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0455");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology2.add(readablePeriod5, (long) 48, 2122);
        org.joda.time.DurationField durationField9 = chronology2.weekyears();
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.joda.time.DurationField durationField11 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField10", Math.signum(durationField3.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField3)));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0456");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfDay();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale7.getDisplayScript(locale8);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.lang.String str14 = locale8.getDisplayCountry(locale10);
        org.joda.time.DateTime dateTime15 = property5.setCopy("22", locale8);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        mutableDateTime17.setMinuteOfDay(100);
        boolean boolean20 = mutableDateTime17.isAfterNow();
        mutableDateTime17.add((long) 'a');
        boolean boolean23 = mutableDateTime17.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime17.setZoneRetainFields(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getName((long) 54110417);
        org.joda.time.Instant instant28 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant28.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant30.withDurationAdded(readableDuration31, (int) (short) 0);
        boolean boolean35 = instant30.isBefore((long) 5);
        java.util.Date date36 = instant30.toDate();
        int int37 = date36.getYear();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) date36, dateTimeZone40);
        boolean boolean42 = dateTimeZone24.equals((java.lang.Object) date36);
        java.util.Calendar.Builder builder43 = new java.util.Calendar.Builder();
        java.util.Calendar calendar44 = builder43.build();
        java.util.Calendar.Builder builder48 = builder43.setTimeOfDay((int) 'x', (int) 'u', 11);
        boolean boolean49 = dateTimeZone24.equals((java.lang.Object) 11);
        org.joda.time.DateTime dateTime50 = dateTime15.toDateTime(dateTimeZone24);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.DateTime dateTime53 = dateTime50.withPeriodAdded(readablePeriod51, 54211751);
        org.joda.time.DateTime dateTime55 = dateTime50.minusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime55", (dateTime15.compareTo(dateTime55) == 0) == dateTime15.equals(dateTime55));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.monthOfYear();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.Instant instant8 = instant6.minus((long) 13);
        long long9 = instant6.getMillis();
        org.joda.time.DateTime dateTime10 = instant6.toDateTimeISO();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime.Property property19 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = property19.withMinimumValue();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime23 = property19.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime25 = property19.addWrapFieldToCopy(54100989);
        org.joda.time.LocalTime localTime27 = localTime25.plusSeconds(292278994);
        org.joda.time.LocalTime localTime29 = localTime25.withHourOfDay(13);
        org.joda.time.LocalTime localTime31 = localTime25.minusMillis((-3600000));
        int int32 = localTime31.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType33.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.secondOfDay();
        java.lang.String str40 = dateTimeField38.getAsShortText(10L);
        org.joda.time.DurationField durationField41 = dateTimeField38.getDurationField();
        boolean boolean42 = dateTimeField38.isLenient();
        int int44 = dateTimeField38.get((long) 2922789);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = dateTimeField38.getType();
        org.joda.time.LocalTime.Property property46 = localTime31.property(dateTimeFieldType45);
        boolean boolean47 = dateTime10.isSupported(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime1.property(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant6", (mutableDateTime4.compareTo(instant6) == 0) == mutableDateTime4.equals(instant6));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0458");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withOffsetParsed();
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
        org.joda.time.DateTimeField dateTimeField24 = chronology19.weekyearOfCentury();
        java.util.Locale locale28 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.lang.String str29 = dateTimeField24.getAsShortText((int) '4', locale28);
        java.util.Locale locale30 = locale28.stripExtensions();
        java.util.Set<java.lang.String> strSet31 = locale28.getUnicodeLocaleKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter6.withLocale(locale28);
        org.joda.time.Instant instant33 = new org.joda.time.Instant();
        org.joda.time.Instant instant35 = instant33.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant35.withDurationAdded(readableDuration36, (int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime39 = instant35.toMutableDateTime();
        int int42 = dateTimeFormatter32.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime39, "English (United Kingdom)", 2019);
        org.joda.time.Chronology chronology43 = dateTimeFormatter32.getChronolgy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime39", (instant35.compareTo(mutableDateTime39) == 0) == instant35.equals(mutableDateTime39));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0459");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.yearOfEra();
        mutableDateTime0.setChronology(chronology3);
        java.lang.Object obj7 = null;
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate11.centuryOfEra();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.LocalDate localDate14 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj7, chronology16);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(chronology16);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(54129298);
        long long23 = chronology3.set((org.joda.time.ReadablePartial) localDate19, (long) 54092654);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        long long31 = dateTimeZone26.getMillisKeepLocal(dateTimeZone29, (long) 10);
        java.lang.String str32 = dateTimeZone26.toString();
        java.util.TimeZone timeZone33 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime34 = localDate19.toDateTimeAtMidnight(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime18", (mutableDateTime0.compareTo(dateTime18) == 0) == mutableDateTime0.equals(dateTime18));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0460");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        int int5 = dateTime1.getSecondOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter6.getPrinter();
        java.lang.String str10 = dateTime1.toString(dateTimeFormatter6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime1.withDurationAdded(readableDuration11, 54118926);
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(1L);
        int int16 = mutableDateTime15.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.era();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime18.add(readablePeriod20, (int) (byte) 100);
        mutableDateTime15.setTime((org.joda.time.ReadableInstant) mutableDateTime18);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.hourOfDay();
        org.joda.time.DurationField durationField31 = dateTimeField30.getLeapDurationField();
        int int32 = mutableDateTime18.get(dateTimeField30);
        long long35 = dateTimeField30.add((long) 14, 1645455690);
        long long38 = dateTimeField30.add(0L, 54101692);
        long long40 = dateTimeField30.roundCeiling(15L);
        int int41 = dateTime13.get(dateTimeField30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0461");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) calendar0);
        calendar0.setMinimalDaysInFirstWeek(54092146);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        boolean boolean8 = calendar7.isWeekDateSupported();
        java.util.Date date9 = calendar7.getTime();
        int int10 = calendar7.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone11 = calendar7.getTimeZone();
        calendar0.setTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = calendar0.getTimeZone();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        java.lang.String str17 = durationFieldType16.toString();
        boolean boolean18 = localTime15.isSupported(durationFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime21 = localTime15.withFieldAdded(durationFieldType19, 32772);
        org.joda.time.LocalTime.Property property22 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime23 = property22.roundCeilingCopy();
        org.joda.time.LocalTime localTime25 = property22.addCopy(19);
        org.joda.time.LocalTime localTime27 = property22.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime29 = property22.addCopy(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.hourOfDay();
        java.lang.String str38 = chronology34.toString();
        org.joda.time.Chronology chronology39 = chronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.millisOfSecond();
        long long43 = dateTimeField40.set(50400000L, 902);
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
        int int54 = dateTimeField40.getMaximumTextLength(locale51);
        java.lang.String str55 = localTime29.toString("840100", locale51);
        java.lang.String str57 = locale51.getExtension('a');
        java.util.Locale locale58 = java.util.Locale.UK;
        java.util.Locale locale59 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet60 = locale59.getExtensionKeys();
        java.util.Locale locale61 = java.util.Locale.KOREA;
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.lang.String str63 = locale61.getDisplayScript(locale62);
        java.lang.String str64 = locale59.getDisplayScript(locale62);
        java.util.Locale locale65 = java.util.Locale.UK;
        java.lang.String str66 = locale59.getDisplayScript(locale65);
        java.lang.String str67 = locale58.getDisplayLanguage(locale65);
        java.util.Locale locale68 = java.util.Locale.ENGLISH;
        java.util.Locale locale69 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet70 = locale69.getExtensionKeys();
        java.lang.String str71 = locale68.getDisplayScript(locale69);
        java.lang.String str72 = locale65.getDisplayCountry(locale68);
        java.util.Locale locale73 = locale65.stripExtensions();
        java.lang.String str74 = locale51.getDisplayCountry(locale65);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone13, locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar7", (calendar0.compareTo(calendar7) == 0) == calendar0.equals(calendar7));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0462");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean2 = instant0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.era();
        int int4 = instant0.get(dateTimeFieldType3);
        org.joda.time.Instant instant6 = instant0.plus((long) 54121606);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology9);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology9.add(readablePeriod12, (long) 48, 2122);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfWeek();
        org.joda.time.DateTime dateTime17 = instant0.toDateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.clockhourOfDay();
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
        java.lang.String str34 = dateTimeZone22.getName((long) 54089980, locale32);
        java.lang.String str35 = locale32.getDisplayLanguage();
        java.lang.String str36 = locale32.getScript();
        java.lang.String str37 = dateTimeField18.getAsText(54285537, locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime21", (instant0.compareTo(mutableDateTime21) == 0) == instant0.equals(mutableDateTime21));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0463");
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
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.DateTime.Property property23 = dateTime19.millisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime19.withMillisOfSecond(12);
        org.joda.time.DateTime dateTime27 = dateTime19.withYear((-16));
        int int28 = dateTime19.getYear();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(279);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.minusSeconds(0);
        int int34 = dateTime31.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime31", (dateTime19.compareTo(dateTime31) == 0) == dateTime19.equals(dateTime31));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0464");
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
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime21.minus(readablePeriod26);
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant25", (dateTime27.compareTo(instant25) == 0) == dateTime27.equals(instant25));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0465");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis((long) (short) 100);
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant4.withDurationAdded(readableDuration5, 5);
        org.joda.time.DateTime dateTime8 = localTime0.toDateTime((org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = instant7.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime9", (instant7.compareTo(dateTime9) == 0) == instant7.equals(dateTime9));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0466");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.secondOfMinute();
        int int10 = dateTimeFormatter3.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "halfdays", 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.millisOfSecond();
        mutableDateTime5.setChronology(chronology14);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(1645455826866L, chronology14);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property22.addWrapField(3);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate27 = localDate25.withWeekyear(3);
        org.joda.time.LocalDate.Property property28 = localDate27.monthOfYear();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Interval interval31 = localDate29.toInterval(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate29.plusMonths(0);
        org.joda.time.LocalDate.Property property34 = localDate33.year();
        int int35 = localDate33.size();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = mutableDateTime40.getZone();
        long long43 = dateTimeZone38.getMillisKeepLocal(dateTimeZone41, (long) 10);
        org.joda.time.DateTime dateTime44 = localDate33.toDateTimeAtMidnight(dateTimeZone41);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property46 = dateTime44.property(dateTimeFieldType45);
        int int47 = localDate27.get(dateTimeFieldType45);
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType45.getDurationType();
        mutableDateTime24.add(durationFieldType48, 86399999);
        boolean boolean51 = localTime19.isSupported(durationFieldType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime37", (mutableDateTime5.compareTo(mutableDateTime37) == 0) == mutableDateTime5.equals(mutableDateTime37));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0467");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean6 = mutableDateTime4.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.toMutableDateTime();
        mutableDateTime4.addDays(19);
        java.lang.String str10 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.addMillis(100);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime4.copy();
        mutableDateTime13.addHours(50563722);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.era();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime17.year();
        mutableDateTime17.setTime((long) 19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        mutableDateTime17.add(readablePeriod23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime17.minuteOfDay();
        mutableDateTime13.setTime((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime30 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology34 = localTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType31.getField(chronology34);
        org.joda.time.DateTime dateTime36 = dateTime28.toDateTime(chronology34);
        org.joda.time.DateTime.Property property37 = dateTime28.hourOfDay();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime39 = dateTime28.plus(readableDuration38);
        int int40 = mutableDateTime17.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and instant27", (mutableDateTime7.compareTo(instant27) == 0) == mutableDateTime7.equals(instant27));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0468");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date7 = calendar0.getTime();
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        timeZone9.setRawOffset(54135326);
        timeZone9.setID("Korean (South Korea)");
        java.util.Locale.Category category14 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale15 = java.util.Locale.getDefault(category14);
        java.util.Locale locale18 = new java.util.Locale("21 June 0130 15:01:38 ", "en_GB");
        java.util.Locale.setDefault(category14, locale18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = mutableDateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) 10);
        java.lang.String str28 = dateTimeZone25.toString();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone25);
        java.util.TimeZone timeZone30 = dateTimeZone25.toTimeZone();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone30, locale32);
        java.util.Locale locale34 = locale32.stripExtensions();
        java.util.Locale.setDefault(category14, locale32);
        java.util.Locale locale36 = java.util.Locale.getDefault(category14);
        java.lang.String str37 = timeZone9.getDisplayName(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar33", (calendar0.compareTo(calendar33) == 0) == calendar0.equals(calendar33));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0469");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.Instant instant3 = instant2.toInstant();
        org.joda.time.Instant instant5 = instant3.plus(19L);
        org.joda.time.Instant instant8 = instant3.withDurationAdded((long) (-292275054), 32769);
        org.joda.time.Instant instant9 = instant3.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant3.withDurationAdded(readableDuration10, 21221222);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.getMutableDateTime();
        boolean boolean19 = instant12.isEqual((org.joda.time.ReadableInstant) mutableDateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime18", (instant0.compareTo(mutableDateTime18) == 0) == instant0.equals(mutableDateTime18));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0470");
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
        org.joda.time.DateTimeField dateTimeField18 = chronology13.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology13);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime19.add(readablePeriod20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime19.add(readablePeriod22);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.Instant instant26 = instant24.minus((long) 13);
        org.joda.time.DateTime dateTime27 = instant24.toDateTime();
        org.joda.time.Chronology chronology28 = instant24.getChronology();
        org.joda.time.DateTime dateTime29 = mutableDateTime19.toDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime27", (instant24.compareTo(dateTime27) == 0) == instant24.equals(dateTime27));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0471");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean9 = localDateTime7.equals((java.lang.Object) nameProvider8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.millisOfDay();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = property12.getAsText(locale13);
        java.lang.String str15 = locale13.getISO3Language();
        java.lang.String str18 = nameProvider8.getShortName(locale13, "3:01 PM", "7");
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale19.getDisplayScript(locale25);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale19);
        java.lang.String str30 = nameProvider8.getName(locale19, "15:02", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar27", (calendar0.compareTo(calendar27) == 0) == calendar0.equals(calendar27));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, 0);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.era();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        int int15 = localDate14.getDayOfMonth();
        org.joda.time.LocalDate localDate17 = localDate14.plusYears((int) (byte) 100);
        org.joda.time.Interval interval18 = localDate17.toInterval();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        java.lang.String str27 = dateTimeZone21.toString();
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime12.toMutableDateTime(dateTimeZone21);
        mutableDateTime12.addDays(0);
        int int32 = mutableDateTime12.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        mutableDateTime12.add(readablePeriod33, 5);
        boolean boolean36 = mutableDateTime3.isEqual((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale38 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withLocale(locale38);
        org.joda.time.format.DateTimeParser dateTimeParser40 = dateTimeFormatter37.getParser();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.years();
        java.lang.String str45 = durationFieldType44.toString();
        boolean boolean46 = localTime43.isSupported(durationFieldType44);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime49 = localTime43.withFieldAdded(durationFieldType47, 32772);
        org.joda.time.LocalTime.Property property50 = localTime43.hourOfDay();
        org.joda.time.LocalTime localTime52 = localTime43.minusMinutes(2922789);
        org.joda.time.Instant instant54 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology55 = instant54.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        boolean boolean57 = localTime43.equals((java.lang.Object) chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.weekyearOfCentury();
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.fromMillisOfDay((long) 123, chronology55);
        java.lang.String str61 = dateTimeFormatter37.print((org.joda.time.ReadablePartial) localTime60);
        int int62 = dateTimeFormatter37.getDefaultYear();
        java.lang.String str63 = mutableDateTime3.toString(dateTimeFormatter37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime56", (mutableDateTime5.compareTo(mutableDateTime56) == 0) == mutableDateTime5.equals(mutableDateTime56));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0473");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField8 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField8", Math.signum(durationField6.compareTo(durationField8)) == -Math.signum(durationField8.compareTo(durationField6)));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0474");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        long long3 = instant0.getMillis();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.monthOfYear();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(7);
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(10L, dateTimeZone35);
        long long43 = dateTimeZone35.nextTransition((long) 12);
        org.joda.time.DateTime dateTime44 = dateTime31.withZone(dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime11.toDateTime(dateTimeZone35);
        long long48 = dateTimeZone35.adjustOffset(194766091200000L, false);
        org.joda.time.DateTime dateTime49 = instant0.toDateTime(dateTimeZone35);
        java.lang.String str51 = dateTime49.toString("\u4e0b\u53482:48");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0475");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DurationField durationField7 = chronology3.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField7, and durationField6", !(durationField6.compareTo(durationField7) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField7.compareTo(durationField6))));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0476");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) instant2);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant9.withDurationAdded(readableDuration10, 54285537);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType13.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.millisOfSecond();
        java.lang.String str19 = chronology16.toString();
        org.joda.time.DurationField durationField20 = chronology16.weekyears();
        org.joda.time.DurationField durationField21 = chronology16.eras();
        org.joda.time.DateTime dateTime22 = instant12.toDateTime(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField20 and durationField21", Math.signum(durationField20.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField20)));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10, locale12);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        timeZone10.setID("");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar13 and calendar14", (calendar13.compareTo(calendar14) == 0) == calendar13.equals(calendar14));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0478");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date7 = calendar0.getTime();
        java.util.TimeZone timeZone8 = calendar0.getTimeZone();
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        timeZone9.setRawOffset(54135326);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        boolean boolean14 = calendar12.isWeekDateSupported();
        calendar12.setFirstDayOfWeek(5);
        calendar12.setMinimalDaysInFirstWeek(54098460);
        int int20 = calendar12.getMinimum(0);
        java.util.Date date21 = calendar12.getTime();
        calendar12.setMinimalDaysInFirstWeek(54125287);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.fromCalendarFields(calendar24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusSeconds(0);
        int int30 = localDateTime29.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.era();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        mutableDateTime32.add(durationFieldType34, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime29.withFieldAdded(durationFieldType34, (int) 'a');
        java.util.Date date39 = localDateTime29.toDate();
        int int40 = date39.getHours();
        date39.setTime((long) 2022);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.fromDateFields(date39);
        boolean boolean44 = calendar12.after((java.lang.Object) date39);
        boolean boolean45 = timeZone9.inDaylightTime(date39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar12", (calendar0.compareTo(calendar12) == 0) == calendar0.equals(calendar12));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0479");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.clear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.hourOfDay();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology6);
        boolean boolean12 = calendar1.before((java.lang.Object) chronology6);
        int int13 = calendar1.getMinimalDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        java.lang.String str22 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone19);
        java.util.TimeZone timeZone24 = dateTimeZone19.toTimeZone();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone24);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone29 = java.util.TimeZone.getTimeZone("years");
        boolean boolean30 = timeZone29.observesDaylightTime();
        boolean boolean31 = timeZone27.hasSameRules(timeZone29);
        calendar25.setTimeZone(timeZone27);
        calendar1.setTimeZone(timeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0480");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekyear(2122);
        org.joda.time.Chronology chronology7 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0481");
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
        org.joda.time.DateTime.Property property18 = dateTime16.weekyear();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.Instant instant20 = instant19.toInstant();
        long long21 = instant20.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant20", (dateTime16.compareTo(instant20) == 0) == dateTime16.equals(instant20));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0482");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Instant instant9 = instant6.minus((long) (byte) 1);
        long long10 = instant9.getMillis();
        org.joda.time.DateTime dateTime11 = instant9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = instant9.getZone();
        long long14 = dateTimeZone12.nextTransition(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0483");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        int int27 = dateTime25.getMillisOfDay();
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.Instant instant29 = instant28.toInstant();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.plus(readableDuration30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant31", (dateTime25.compareTo(instant31) == 0) == dateTime25.equals(instant31));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0484");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 100);
        int int2 = localTime1.size();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes(6);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.minuteOfHour();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.withHourOfDay(13);
        org.joda.time.DateTime.Property property11 = dateTime6.centuryOfEra();
        boolean boolean12 = localTime1.equals((java.lang.Object) dateTime6);
        org.joda.time.DateTime dateTime14 = dateTime6.minusMillis((int) (short) -1);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime6.minus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime6.plusHours(307);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0485");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.toMutableDateTimeISO();
        java.lang.String str7 = mutableDateTime6.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0487");
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
        org.joda.time.DateTime.Property property18 = dateTime16.weekyear();
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.Instant instant20 = instant19.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant22", (dateTime16.compareTo(instant22) == 0) == dateTime16.equals(instant22));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0488");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime.Property property7 = dateTime1.hourOfDay();
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime1.getZone();
        long long12 = dateTimeZone9.convertLocalToUTC(14L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0489");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Instant instant6 = instant4.withMillis((long) 54134127);
        org.joda.time.DateTime dateTime7 = instant4.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = instant4.toMutableDateTimeISO();
        java.util.Date date9 = mutableDateTime8.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0490");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = dateTimeFormatter0.getPrinter();
        boolean boolean2 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 54148676);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property6 = dateTime5.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes(7);
        org.joda.time.DateTime dateTime12 = dateTime8.minusYears(32770);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = dateTime12.isSupported(dateTimeFieldType13);
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
        org.joda.time.DateTime dateTime32 = property31.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        long long41 = dateTimeZone36.getMillisKeepLocal(dateTimeZone39, (long) 10);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(10L, dateTimeZone36);
        long long44 = dateTimeZone36.nextTransition((long) 12);
        org.joda.time.DateTime dateTime45 = dateTime32.withZone(dateTimeZone36);
        org.joda.time.DateTime dateTime46 = dateTime12.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone36);
        long long49 = dateTimeZone36.convertUTCToLocal(4456982250L);
        long long51 = dateTimeZone36.nextTransition((long) 54137);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter0.withZone(dateTimeZone36);
        org.joda.time.Instant instant53 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime54 = instant53.toDateTime();
        org.joda.time.DateTime.Property property55 = dateTime54.weekOfWeekyear();
        org.joda.time.DateTime dateTime57 = dateTime54.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime59 = dateTime54.withYear(8);
        org.joda.time.DateTime.Property property60 = dateTime54.hourOfDay();
        int int61 = dateTime54.getSecondOfDay();
        org.joda.time.DateTime.Property property62 = dateTime54.yearOfEra();
        java.lang.String str63 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime26 and instant53", (mutableDateTime26.compareTo(instant53) == 0) == mutableDateTime26.equals(instant53));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0491");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime7 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime1.plusYears(21209466);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0492");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean2 = instant0.isSupported(dateTimeFieldType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.era();
        int int4 = instant0.get(dateTimeFieldType3);
        org.joda.time.Instant instant6 = instant0.plus((long) 54121606);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.weekyears();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(chronology9);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology9.add(readablePeriod12, (long) 48, 2122);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.dayOfWeek();
        org.joda.time.DateTime dateTime17 = instant0.toDateTime(chronology9);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant0.minus(readableDuration18);
        org.joda.time.MutableDateTime mutableDateTime20 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant21 = instant0.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime20", (dateTime17.compareTo(mutableDateTime20) == 0) == dateTime17.equals(mutableDateTime20));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0493");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withYear(8);
        org.joda.time.DateTime dateTime8 = dateTime1.withWeekyear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property10 = dateTime1.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime1.toDateTime(dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime13", (instant0.compareTo(dateTime13) == 0) == instant0.equals(dateTime13));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0494");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        int[] intArray8 = localDateTime7.getValues();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMaximumValue();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.Instant instant15 = instant13.minus((long) 13);
        long long16 = instant13.getMillis();
        org.joda.time.Instant instant18 = instant13.plus(0L);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant13.minus(readableDuration19);
        org.joda.time.MutableDateTime mutableDateTime21 = instant13.toMutableDateTimeISO();
        mutableDateTime21.addMonths((int) (short) 0);
        int int24 = property9.compareTo((org.joda.time.ReadableInstant) mutableDateTime21);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.lang.String str28 = locale25.getDisplayScript();
        java.lang.String str29 = property9.getAsText(locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime21", (instant13.compareTo(mutableDateTime21) == 0) == instant13.equals(mutableDateTime21));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0495");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, (int) (short) 0);
        boolean boolean7 = instant2.isBefore((long) 5);
        java.util.Date date8 = instant2.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant2.withDurationAdded(readableDuration9, (int) ' ');
        org.joda.time.Instant instant13 = instant2.withMillis(1646092800000L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant2.withDurationAdded(readableDuration15, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime14", (instant17.compareTo(mutableDateTime14) == 0) == instant17.equals(mutableDateTime14));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0496");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = property5.getLocalDate();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str9 = property5.getAsShortText(locale8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, (int) (short) 0);
        boolean boolean17 = instant12.isBefore((long) 5);
        java.util.Date date18 = instant12.toDate();
        int int19 = date18.getYear();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date18, dateTimeZone22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone22);
        boolean boolean27 = dateTimeZone22.isStandardOffset((long) 5);
        java.lang.String str29 = dateTimeZone22.getShortName(1645455775286L);
        boolean boolean30 = locale8.equals((java.lang.Object) dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime25", (instant10.compareTo(dateTime25) == 0) == instant10.equals(dateTime25));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0497");
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
        timeZone9.setID("DateTimeField[secondOfMinute]");
        timeZone9.setID("+00:00");
        java.time.ZoneId zoneId14 = timeZone9.toZoneId();
        java.util.Set<java.lang.String> strSet15 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale.Category category16 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.util.Locale.setDefault(category16, locale17);
        boolean boolean21 = strSet15.contains((java.lang.Object) category16);
        java.util.Locale.Builder builder22 = new java.util.Locale.Builder();
        java.util.Locale locale23 = java.util.Locale.TAIWAN;
        java.util.Locale.Builder builder24 = builder22.setLocale(locale23);
        java.util.Locale locale25 = locale23.stripExtensions();
        java.util.Locale.setDefault(category16, locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = mutableDateTime28.getZone();
        long long31 = dateTimeZone29.previousTransition((-431366460000L));
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = mutableDateTime34.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone38 = mutableDateTime37.getZone();
        long long40 = dateTimeZone35.getMillisKeepLocal(dateTimeZone38, (long) 10);
        java.lang.String str41 = dateTimeZone35.toString();
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.lang.String str44 = locale43.toLanguageTag();
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.lang.String str46 = locale43.getDisplayCountry(locale45);
        java.lang.String str47 = dateTimeZone35.getName((long) 54089980, locale45);
        java.lang.String str48 = locale45.getDisplayLanguage();
        java.lang.String str49 = locale45.getScript();
        java.lang.String str50 = dateTimeZone29.getName((long) 52, locale45);
        java.util.Locale.setDefault(category16, locale45);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone9, locale45);
        timeZone9.setID("18 f\351vr. 2022 05:54:05");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar52", (calendar8.compareTo(calendar52) == 0) == calendar8.equals(calendar52));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        boolean boolean9 = timeZone7.observesDaylightTime();
        java.time.ZoneId zoneId10 = timeZone7.toZoneId();
        int int12 = timeZone7.getOffset((long) 50573406);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone.setDefault(timeZone14);
        boolean boolean16 = timeZone7.hasSameRules(timeZone14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = property21.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfDay(54096794);
        org.joda.time.tz.NameProvider nameProvider25 = org.joda.time.DateTimeZone.getNameProvider();
        boolean boolean26 = localDateTime24.equals((java.lang.Object) nameProvider25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.millisOfDay();
        java.util.Locale locale30 = java.util.Locale.GERMANY;
        java.lang.String str31 = property29.getAsText(locale30);
        java.lang.String str32 = locale30.getISO3Language();
        java.lang.String str35 = nameProvider25.getShortName(locale30, "3:01 PM", "7");
        java.util.Locale locale36 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.lang.String str41 = locale36.getDisplayScript(locale39);
        java.util.Locale locale42 = java.util.Locale.UK;
        java.lang.String str43 = locale36.getDisplayScript(locale42);
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale36);
        java.lang.String str47 = nameProvider25.getName(locale36, "15:02", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone14, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar44", (calendar17.compareTo(calendar44) == 0) == calendar17.equals(calendar44));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0499");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.yearOfEra();
        mutableDateTime0.setChronology(chronology3);
        java.lang.Object obj7 = null;
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        int int9 = localDate8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = localDate8.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property12 = localDate11.centuryOfEra();
        int int13 = property12.getMaximumValueOverall();
        org.joda.time.LocalDate localDate14 = property12.roundFloorCopy();
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj7, chronology16);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(chronology16);
        org.joda.time.LocalDate localDate21 = localDate19.plusYears(54129298);
        long long23 = chronology3.set((org.joda.time.ReadablePartial) localDate19, (long) 54092654);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and dateTime18", (mutableDateTime0.compareTo(dateTime18) == 0) == mutableDateTime0.equals(dateTime18));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test0500");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology10.getZone();
        long long18 = dateTimeZone15.adjustOffset((long) (byte) 0, false);
        org.joda.time.DateTime dateTime19 = dateTime1.withZoneRetainFields(dateTimeZone15);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime1.plus(readablePeriod20);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime21", (instant0.compareTo(dateTime21) == 0) == instant0.equals(dateTime21));
    }
}

