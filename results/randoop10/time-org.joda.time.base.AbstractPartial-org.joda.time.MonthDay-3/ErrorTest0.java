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
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        boolean boolean8 = dateTimeZone6.isFixed();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone6);
        mutableDateTime4.setZoneRetainFields(dateTimeZone6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateMidnight dateMidnight5 = localDate4.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) (byte) 0, (int) (byte) 100);
        int int8 = property3.compareTo((org.joda.time.ReadableInstant) instant4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant7 = instant5.plus((long) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        int[] intArray5 = localDate4.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (byte) 0, chronology7);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period19 = period17.minusMillis(0);
        mutablePeriod8.setPeriod((org.joda.time.ReadablePeriod) period19);
        org.joda.time.LocalDate localDate22 = localDate4.withPeriodAdded((org.joda.time.ReadablePeriod) period19, 70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant3", (dateTime5.compareTo(instant3) == 0) == dateTime5.equals(instant3));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) instant5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(100);
        org.joda.time.Period period14 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = dateTime17.toLocalDateTime();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear(11);
        org.joda.time.Duration duration21 = period14.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.minus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Period period23 = duration21.toPeriod();
        org.joda.time.Instant instant24 = instant6.minus((org.joda.time.ReadableDuration) duration21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration15 = null;
        mutableDateTime9.add(readableDuration15);
        mutableDateTime9.setMillis((long) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.LocalDate localDate23 = dateTime21.toLocalDate();
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTimeISO();
        boolean boolean25 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and dateTime21", (instant22.compareTo(dateTime21) == 0) == instant22.equals(dateTime21));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) instant5);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean20 = dateTimeZone19.isFixed();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMillis(100);
        org.joda.time.Period period25 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(100L, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = dateTime28.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime28.withMonthOfYear(11);
        org.joda.time.Duration duration32 = period25.toDurationFrom((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime21.minus((org.joda.time.ReadableDuration) duration32);
        mutablePeriod17.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Instant instant36 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration32, 52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime2.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime2", (instant3.compareTo(dateTime2) == 0) == instant3.equals(dateTime2));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        int int7 = dateTime6.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime2.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime2.withTimeAtStartOfDay();
        int int6 = dateTime5.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 1970);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime4.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime4.withMillis((long) 600100);
        org.joda.time.DateTime dateTime21 = dateTime19.plusYears(120);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime17", (dateTime4.compareTo(dateTime17) == 0) == dateTime4.equals(dateTime17));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.LocalDate.Property property5 = localDate4.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Interval interval9 = localDate2.toInterval(dateTimeZone7);
        org.joda.time.LocalDate.Property property10 = localDate2.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime8", (dateTime1.compareTo(dateTime8) == 0) == dateTime1.equals(dateTime8));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime2.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        mutableDateTime24.addMillis(15);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        int int30 = dateTimeZone28.getStandardOffset((long) 5);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone33 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean34 = timeZone31.hasSameRules(timeZone33);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        long long39 = dateTimeZone28.getMillisKeepLocal(dateTimeZone36, (long) 100);
        mutableDateTime24.setZoneRetainFields(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar35", (calendar21.compareTo(calendar35) == 0) == calendar21.equals(calendar35));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DurationField durationField25 = chronology17.minutes();
        org.joda.time.DurationField durationField26 = chronology17.millis();
        org.joda.time.DurationField durationField27 = chronology17.months();
        org.joda.time.DurationField durationField28 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField25, and durationField26", !(durationField28.compareTo(durationField25) == 0) || (Math.signum(durationField28.compareTo(durationField26)) == Math.signum(durationField25.compareTo(durationField26))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long15 = dateTimeZone13.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(dateTimeZone13);
        long long18 = dateTimeZone13.nextTransition(1645454850102L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long15 = dateTimeZone13.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.getMutableDateTime();
        mutableDateTime17.setDate((long) 6);
        int int20 = mutableDateTime17.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long25 = dateTimeZone23.nextTransition(379987200000L);
        mutableDateTime17.setZone(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime17", (dateMidnight3.compareTo(mutableDateTime17) == 0) == dateMidnight3.equals(mutableDateTime17));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        org.joda.time.LocalDate.Property property7 = localDate2.dayOfWeek();
        org.joda.time.LocalDate localDate9 = property7.addToCopy(3);
        org.joda.time.LocalDate localDate11 = property7.addWrapFieldToCopy(200);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.centuryOfEra();
        int int13 = localDate11.get(dateTimeFieldType12);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property21 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime22, readableDuration23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long29 = dateTimeZone27.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = localDate11.toDateTimeAtStartOfDay(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime30", (dateTime22.compareTo(dateTime30) == 0) == dateTime22.equals(dateTime30));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.time.ZoneId zoneId4 = timeZone1.toZoneId();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone(zoneId4);
        java.util.Locale locale6 = java.util.Locale.US;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone5, locale6);
        java.lang.String str9 = locale0.getDisplayScript(locale6);
        java.lang.String str10 = locale6.getVariant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar8", (calendar7.compareTo(calendar8) == 0) == calendar7.equals(calendar8));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        java.lang.String str25 = locale20.getScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        int int2 = property1.get();
        org.joda.time.MonthDay monthDay3 = property1.getMonthDay();
        java.lang.String str4 = property1.getName();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.time.ZoneId zoneId7 = timeZone5.toZoneId();
        java.time.ZoneId zoneId8 = timeZone5.toZoneId();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone(zoneId8);
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9, locale10);
        java.lang.String str13 = property1.getAsShortText(locale10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar12", (calendar11.compareTo(calendar12) == 0) == calendar11.equals(calendar12));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("janvier");
        java.lang.String str5 = nameProvider0.getName(locale2, "", "years");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = locale6.getDisplayName(locale7);
        java.util.Set<java.lang.Character> charSet9 = locale6.getExtensionKeys();
        java.lang.String str12 = nameProvider0.getShortName(locale6, "years", "centuryOfEra");
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone14);
        int int17 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.yearOfEra();
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.millisOfDay();
        int int20 = property19.getMinimumValue();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.time.ZoneId zoneId25 = timeZone23.toZoneId();
        java.time.ZoneId zoneId26 = timeZone23.toZoneId();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone(zoneId26);
        java.util.Locale locale28 = java.util.Locale.US;
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(locale28);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone27, locale28);
        java.lang.String str31 = locale22.getDisplayScript(locale28);
        org.joda.time.LocalDateTime localDateTime32 = property19.setCopy("1970", locale22);
        java.lang.String str35 = nameProvider0.getShortName(locale22, "1969-12-31T23:28:00.120", "");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar29 and calendar30", (calendar29.compareTo(calendar30) == 0) == calendar29.equals(calendar30));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        org.joda.time.MutableDateTime mutableDateTime25 = property12.roundCeiling();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone4, locale5);
        int int8 = timeZone4.getRawOffset();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay9.year();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = property12.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime17 = yearMonthDay16.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay16.year();
        java.util.Locale locale20 = java.util.Locale.US;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str22 = property12.getAsText(locale20);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone4, locale20);
        boolean boolean24 = timeZone4.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar7", (calendar6.compareTo(calendar7) == 0) == calendar6.equals(calendar7));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        java.util.Calendar calendar24 = mutableDateTime9.toCalendar(locale14);
        int int25 = calendar24.getWeeksInWeekYear();
        calendar24.set(6, (int) (short) 0);
        calendar24.set(1969, 47, 33198, 32, (-15993));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("janvier");
        java.lang.String str5 = nameProvider0.getName(locale2, "", "years");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean9 = dateTimeZone8.isFixed();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone8);
        int int11 = localDateTime10.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.yearOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfDay();
        int int14 = property13.getMinimumValue();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.time.ZoneId zoneId19 = timeZone17.toZoneId();
        java.time.ZoneId zoneId20 = timeZone17.toZoneId();
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone(zoneId20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale22);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone21, locale22);
        java.lang.String str25 = locale16.getDisplayScript(locale22);
        org.joda.time.LocalDateTime localDateTime26 = property13.setCopy("1970", locale16);
        java.lang.String str29 = nameProvider0.getName(locale16, "java.io.IOException: 2022", "DateTimeField[year]");
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean32 = dateTimeZone31.isFixed();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone31);
        int int34 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.yearOfEra();
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.millisOfDay();
        int int37 = property36.getMinimumValue();
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.time.ZoneId zoneId42 = timeZone40.toZoneId();
        java.time.ZoneId zoneId43 = timeZone40.toZoneId();
        java.util.TimeZone timeZone44 = java.util.TimeZone.getTimeZone(zoneId43);
        java.util.Locale locale45 = java.util.Locale.US;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone44, locale45);
        java.lang.String str48 = locale39.getDisplayScript(locale45);
        org.joda.time.LocalDateTime localDateTime49 = property36.setCopy("1970", locale39);
        java.lang.String str52 = nameProvider0.getName(locale39, "21:28:47.880", "janvier");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar24", (calendar23.compareTo(calendar24) == 0) == calendar23.equals(calendar24));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long15 = dateTimeZone13.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(dateTimeZone13);
        long long18 = dateTimeZone13.nextTransition(11517811201977L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.minutes();
        org.joda.time.Period period4 = new org.joda.time.Period(0L, periodType3);
        org.joda.time.Period period14 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period16 = period14.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.plusDays((int) 'a');
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period14, (org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        long long28 = chronology23.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DateMidnight dateMidnight30 = org.joda.time.DateMidnight.now(chronology23);
        org.joda.time.DurationField durationField31 = chronology23.minutes();
        org.joda.time.DurationField durationField32 = chronology23.millis();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0L, chronology23);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 70, (long) 47, periodType3, chronology23);
        org.joda.time.DurationField durationField35 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField31, and durationField32", !(durationField35.compareTo(durationField31) == 0) || (Math.signum(durationField35.compareTo(durationField32)) == Math.signum(durationField31.compareTo(durationField32))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.util.Date date6 = new java.util.Date((int) ' ', 12, (int) (short) 1, (int) (short) 10, 52, (int) (byte) 0);
        int int7 = date6.getSeconds();
        org.joda.time.Period period16 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period18 = period16.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusDays((int) 'a');
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period16, (org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.Chronology chronology25 = interval24.getChronology();
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology25);
        long long30 = chronology25.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight31 = org.joda.time.DateMidnight.now(chronology25);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology25);
        org.joda.time.DurationField durationField33 = chronology25.minutes();
        org.joda.time.DurationField durationField34 = chronology25.millis();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((java.lang.Object) date6, chronology25);
        org.joda.time.DurationField durationField36 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField36, durationField33, and durationField34", !(durationField36.compareTo(durationField33) == 0) || (Math.signum(durationField36.compareTo(durationField34)) == Math.signum(durationField33.compareTo(durationField34))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean10 = timeZone2.hasSameRules(timeZone5);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean14 = timeZone11.hasSameRules(timeZone13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13);
        java.time.Instant instant16 = calendar15.toInstant();
        org.joda.time.YearMonthDay yearMonthDay17 = org.joda.time.YearMonthDay.fromCalendarFields(calendar15);
        org.joda.time.Period period26 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period28 = period26.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusDays((int) 'a');
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period26, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfDay();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((java.lang.Object) calendar15, chronology35);
        java.util.TimeZone timeZone39 = calendar15.getTimeZone();
        boolean boolean40 = timeZone2.hasSameRules(timeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar9 and calendar15", (calendar9.compareTo(calendar15) == 0) == calendar9.equals(calendar15));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration1, (org.joda.time.ReadableInstant) dateMidnight4, periodType5);
        int int7 = dateMidnight4.getYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime10.copy();
        mutableDateTime10.setMillis((long) (byte) 10);
        int int15 = mutableDateTime10.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, dateTimeZone17);
        boolean boolean19 = dateTimeZone17.isFixed();
        mutableDateTime10.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime10.dayOfYear();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime10.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(8379600000L, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = mutableDateTime10.toDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(11L, dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime28", (mutableDateTime10.compareTo(dateTime28) == 0) == mutableDateTime10.equals(dateTime28));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant9 = instant5.withDurationAdded((long) (-292275054), (int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 1970);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusSeconds((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str23 = dateTimeFieldType22.getName();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withField(dateTimeFieldType22, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withMillisOfSecond(569);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean30 = dateTimeZone29.isFixed();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMillis(100);
        org.joda.time.Period period35 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(100L, dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = dateTime38.toLocalDateTime();
        org.joda.time.DateTime dateTime41 = dateTime38.withMonthOfYear(11);
        org.joda.time.Duration duration42 = period35.toDurationFrom((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime31.minus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime19.withDurationAdded((org.joda.time.ReadableDuration) duration42, 710);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime11.plus((org.joda.time.ReadableDuration) duration42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(100L, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property54 = dateTime51.minuteOfDay();
        org.joda.time.DateTime dateTime55 = property54.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime55, readableDuration56);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean60 = dateTimeZone59.isFixed();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusMillis(100);
        org.joda.time.Period period65 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(100L, dateTimeZone67);
        org.joda.time.LocalDateTime localDateTime69 = dateTime68.toLocalDateTime();
        org.joda.time.DateTime dateTime71 = dateTime68.withMonthOfYear(11);
        org.joda.time.Duration duration72 = period65.toDurationFrom((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime61.minus((org.joda.time.ReadableDuration) duration72);
        mutablePeriod57.setPeriod((org.joda.time.ReadableDuration) duration72);
        java.util.TimeZone timeZone75 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        java.time.ZoneId zoneId77 = timeZone75.toZoneId();
        java.time.ZoneId zoneId78 = timeZone75.toZoneId();
        boolean boolean79 = duration72.equals((java.lang.Object) timeZone75);
        boolean boolean80 = duration42.isShorterThan((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Instant instant81 = instant9.minus((org.joda.time.ReadableDuration) duration42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.Instant instant21 = instant17.withDurationAdded(624L, 192);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant17", (dateTime2.compareTo(instant17) == 0) == dateTime2.equals(instant17));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.Instant instant20 = instant17.withMillis(978307200887L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant17", (dateTime2.compareTo(instant17) == 0) == dateTime2.equals(instant17));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology13);
        long long15 = interval14.getEndMillis();
        java.lang.String str16 = interval14.toString();
        org.joda.time.MutableInterval mutableInterval17 = interval14.toMutableInterval();
        org.joda.time.Period period18 = interval14.toPeriod();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Period period21 = interval14.toPeriod(periodType19);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1970, dateTimeZone24);
        int int26 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate25.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval29 = localDate25.toInterval();
        boolean boolean30 = interval29.isBeforeNow();
        org.joda.time.Duration duration31 = interval29.toDuration();
        boolean boolean32 = duration22.isEqual((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant34 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration31, 32);
        org.joda.time.Instant instant36 = instant34.plus((-1200000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.joda.time.Chronology chronology6 = chronology5.withUTC();
        org.joda.time.DurationField durationField7 = chronology5.hours();
        java.lang.String str8 = durationField7.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        mutableDateTime4.addMonths(625);
        org.joda.time.DateTimeField dateTimeField7 = mutableDateTime4.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((int) 'a');
        long long14 = dateMidnight13.getMillis();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withCenturyOfEra(4);
        org.joda.time.Period period25 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period27 = period25.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plusDays((int) 'a');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight47, readableDuration48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight38.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 2);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property59 = dateTime56.minuteOfDay();
        org.joda.time.DateTime dateTime60 = property59.roundCeilingCopy();
        org.joda.time.DateTime dateTime62 = dateTime60.minusDays(35);
        org.joda.time.Duration duration63 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType66 = periodType65.withWeeksRemoved();
        java.lang.String str67 = periodType66.getName();
        org.joda.time.PeriodType periodType68 = periodType66.withDaysRemoved();
        int int69 = periodType66.size();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration63, periodType66);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant72 = instant71.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        mutablePeriod5.add(100L);
        int int11 = mutablePeriod5.getYears();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        mutablePeriod5.add(durationFieldType12, 6);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 49, (long) 'x');
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, dateTimeZone20);
        org.joda.time.LocalDate localDate22 = dateTime21.toLocalDate();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1970, dateTimeZone31);
        int int33 = localDate32.getDayOfWeek();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate27, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        int int50 = dateMidnight47.getYear();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withDayOfMonth((int) (byte) 10);
        boolean boolean53 = dateMidnight38.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.monthOfYear();
        org.joda.time.DateMidnight dateMidnight55 = property54.roundFloorCopy();
        boolean boolean56 = localDate32.equals((java.lang.Object) dateMidnight55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight55.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withDayOfYear(32);
        org.joda.time.DateTime dateTime61 = dateMidnight58.toDateTime();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime24, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableInstant) dateTime61, readableInstant63);
        org.joda.time.Period period73 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period75 = period73.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone77 = null;
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight(1L, dateTimeZone77);
        org.joda.time.DateMidnight dateMidnight80 = dateMidnight78.plusDays((int) 'a');
        org.joda.time.Interval interval81 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period73, (org.joda.time.ReadableInstant) dateMidnight80);
        org.joda.time.Chronology chronology82 = interval81.getChronology();
        org.joda.time.LocalDateTime localDateTime83 = org.joda.time.LocalDateTime.now(chronology82);
        org.joda.time.Chronology chronology84 = chronology82.withUTC();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((java.lang.Object) readableInstant63, chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant23", (dateTime21.compareTo(instant23) == 0) == dateTime21.equals(instant23));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("P0D");
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime3 = yearMonthDay2.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime4 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.LocalDate localDate6 = dateTime4.toLocalDate();
        org.joda.time.DateTime dateTime7 = dateTime4.toDateTimeISO();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withDaysRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant9, periodType10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology15);
        long long17 = interval16.getEndMillis();
        java.lang.String str18 = interval16.toString();
        org.joda.time.MutableInterval mutableInterval19 = interval16.toMutableInterval();
        org.joda.time.Period period20 = interval16.toPeriod();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType22 = periodType21.withWeeksRemoved();
        org.joda.time.Period period23 = interval16.toPeriod(periodType21);
        org.joda.time.Duration duration24 = period23.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        int int28 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate30 = localDate27.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval31 = localDate27.toInterval();
        boolean boolean32 = interval31.isBeforeNow();
        org.joda.time.Duration duration33 = interval31.toDuration();
        boolean boolean34 = duration24.isEqual((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Instant instant36 = instant9.withDurationAdded((org.joda.time.ReadableDuration) duration33, 32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(100L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property44 = dateTime41.minuteOfDay();
        org.joda.time.Interval interval45 = property44.toInterval();
        org.joda.time.Period period46 = org.joda.time.Period.ZERO;
        org.joda.time.Period period48 = period46.minusSeconds((int) (byte) 0);
        org.joda.time.Period period50 = period48.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod51 = period48.toMutablePeriod();
        org.joda.time.Interval interval52 = interval45.withPeriodAfterStart((org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology53 = interval45.getChronology();
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration33, chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone10);
        int int13 = localDateTime12.getMillisOfSecond();
        int int14 = localDateTime12.getMonthOfYear();
        java.util.Date date15 = localDateTime12.toDate();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28, periodType29);
        int int31 = dateMidnight28.getYear();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight28.withDayOfMonth((int) (byte) 10);
        boolean boolean34 = dateMidnight19.isBefore((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTime dateTime35 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration37, (org.joda.time.ReadableInstant) dateMidnight40, periodType41);
        int int43 = dateMidnight40.getYear();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight40.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight45.toMutableDateTime();
        mutableDateTime46.setMillis((long) (byte) 0);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMillis(100);
        org.joda.time.Period period57 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(100L, dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime61 = dateTime60.toLocalDateTime();
        org.joda.time.DateTime dateTime63 = dateTime60.withMonthOfYear(11);
        org.joda.time.Duration duration64 = period57.toDurationFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime53.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Period period66 = duration64.toPeriod();
        mutableDateTime46.add((org.joda.time.ReadableDuration) duration64, 32769);
        java.lang.String str69 = duration64.toString();
        org.joda.time.DateTime dateTime70 = dateTime35.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime((java.lang.Object) instant71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfMonth();
        mutableDateTime9.setYear((-292275054));
        org.joda.time.DateTimeField dateTimeField15 = mutableDateTime9.getRoundingField();
        mutableDateTime9.setHourOfDay(2);
        int int18 = mutableDateTime9.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1970, dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1970, dateTimeZone25);
        int int27 = localDate26.getDayOfWeek();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate21, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableDuration29, (org.joda.time.ReadableInstant) dateMidnight32, periodType33);
        int int35 = dateMidnight32.getYear();
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight32.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration38, (org.joda.time.ReadableInstant) dateMidnight41, periodType42);
        int int44 = dateMidnight41.getYear();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight41.withDayOfMonth((int) (byte) 10);
        boolean boolean47 = dateMidnight32.isBefore((org.joda.time.ReadableInstant) dateMidnight46);
        org.joda.time.DateMidnight.Property property48 = dateMidnight46.monthOfYear();
        org.joda.time.DateMidnight dateMidnight49 = property48.roundFloorCopy();
        boolean boolean50 = localDate26.equals((java.lang.Object) dateMidnight49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight49.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight49.plusYears(200);
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight49.plusYears((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight49.withWeekyear(475);
        org.joda.time.Instant instant59 = dateMidnight49.toInstant();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(100L, dateTimeZone61);
        boolean boolean63 = dateTimeZone61.isFixed();
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(dateTimeZone61);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(1L, dateTimeZone67);
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight68, readableDuration69, periodType70);
        int int72 = dateMidnight68.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone73 = dateMidnight68.getZone();
        org.joda.time.DateMidnight dateMidnight74 = org.joda.time.DateMidnight.now(dateTimeZone73);
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone73);
        mutableDateTime64.setZone(dateTimeZone73);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology79);
        mutableDateTime64.add((org.joda.time.ReadablePeriod) mutablePeriod80);
        mutablePeriod80.clear();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight(1L, dateTimeZone84);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight85.plusDays((int) 'a');
        long long88 = dateMidnight87.getMillis();
        org.joda.time.DateMidnight dateMidnight90 = dateMidnight87.plus((long) (-1));
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight90.minusYears(6);
        org.joda.time.DateMidnight dateMidnight94 = dateMidnight90.plusYears(19);
        org.joda.time.Duration duration95 = mutablePeriod80.toDurationTo((org.joda.time.ReadableInstant) dateMidnight90);
        org.joda.time.Instant instant96 = instant59.minus((org.joda.time.ReadableDuration) duration95);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant59", (dateMidnight3.compareTo(instant59) == 0) == dateMidnight3.equals(instant59));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) (byte) 0, (int) (byte) 100);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1970, dateTimeZone11);
        int int13 = localDate12.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.LocalDate localDate17 = localDate12.plusYears(1970);
        org.joda.time.LocalDate.Property property18 = localDate17.yearOfEra();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.LocalDate localDate20 = property18.roundFloorCopy();
        int int21 = property18.getMinimumValue();
        org.joda.time.LocalDate localDate22 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime26 = dateTime9.withField(dateTimeFieldType23, 243565);
        boolean boolean27 = instant3.isSupported(dateTimeFieldType23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        mutablePeriod5.add(100L);
        int int11 = mutablePeriod5.getYears();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        mutablePeriod5.add(durationFieldType12, 6);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 49, (long) 'x');
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, dateTimeZone20);
        org.joda.time.LocalDate localDate22 = dateTime21.toLocalDate();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1970, dateTimeZone31);
        int int33 = localDate32.getDayOfWeek();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate27, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        int int50 = dateMidnight47.getYear();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withDayOfMonth((int) (byte) 10);
        boolean boolean53 = dateMidnight38.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.monthOfYear();
        org.joda.time.DateMidnight dateMidnight55 = property54.roundFloorCopy();
        boolean boolean56 = localDate32.equals((java.lang.Object) dateMidnight55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight55.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withDayOfYear(32);
        org.joda.time.DateTime dateTime61 = dateMidnight58.toDateTime();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime24, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableInstant) dateTime61, readableInstant63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(1L, dateTimeZone67);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableDuration65, (org.joda.time.ReadableInstant) dateMidnight68, periodType69);
        int int71 = dateMidnight68.getYear();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight68.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateMidnight dateMidnight77 = new org.joda.time.DateMidnight(1L, dateTimeZone76);
        org.joda.time.PeriodType periodType78 = null;
        org.joda.time.Period period79 = new org.joda.time.Period(readableDuration74, (org.joda.time.ReadableInstant) dateMidnight77, periodType78);
        int int80 = dateMidnight77.getYear();
        org.joda.time.DateMidnight dateMidnight82 = dateMidnight77.withDayOfMonth((int) (byte) 10);
        boolean boolean83 = dateMidnight68.isBefore((org.joda.time.ReadableInstant) dateMidnight82);
        org.joda.time.DateMidnight.Property property84 = dateMidnight82.monthOfYear();
        java.util.Locale locale85 = java.util.Locale.JAPAN;
        int int86 = property84.getMaximumShortTextLength(locale85);
        org.joda.time.DurationField durationField87 = property84.getDurationField();
        org.joda.time.DateMidnight dateMidnight88 = property84.withMinimumValue();
        int int89 = dateMidnight88.getMillisOfSecond();
        org.joda.time.MutablePeriod mutablePeriod90 = new org.joda.time.MutablePeriod(readableInstant63, (org.joda.time.ReadableInstant) dateMidnight88);
        org.joda.time.YearMonthDay yearMonthDay91 = dateMidnight88.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant23", (dateTime21.compareTo(instant23) == 0) == dateTime21.equals(instant23));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        boolean boolean6 = dateTime2.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime2", (instant3.compareTo(dateTime2) == 0) == instant3.equals(dateTime2));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minus((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withWeekyear((-292275054));
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.plusYears(0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) dateTime12);
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1970, dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDate18.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 1970, dateTimeZone22);
        int int24 = localDate23.getDayOfWeek();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate23);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29, periodType30);
        int int32 = dateMidnight29.getYear();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight29.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        boolean boolean44 = dateMidnight29.isBefore((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.monthOfYear();
        org.joda.time.DateMidnight dateMidnight46 = property45.roundFloorCopy();
        boolean boolean47 = localDate23.equals((java.lang.Object) dateMidnight46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight46.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.withDayOfYear(32);
        org.joda.time.DateTime dateTime52 = dateMidnight49.toDateTime();
        org.joda.time.Period period53 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime15, (org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight8.plus((org.joda.time.ReadablePeriod) period53);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet56 = locale55.getExtensionKeys();
        org.joda.time.Period period66 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period68 = period66.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(1L, dateTimeZone70);
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.plusDays((int) 'a');
        org.joda.time.Interval interval74 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period66, (org.joda.time.ReadableInstant) dateMidnight73);
        org.joda.time.Chronology chronology75 = interval74.getChronology();
        org.joda.time.DateMidnight dateMidnight76 = org.joda.time.DateMidnight.now(chronology75);
        long long80 = chronology75.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight81 = org.joda.time.DateMidnight.now(chronology75);
        org.joda.time.DateMidnight dateMidnight82 = org.joda.time.DateMidnight.now(chronology75);
        org.joda.time.DurationField durationField83 = chronology75.minutes();
        org.joda.time.DurationField durationField84 = chronology75.millis();
        org.joda.time.DateTime dateTime85 = new org.joda.time.DateTime((long) 49, chronology75);
        org.joda.time.DateTime dateTime87 = dateTime85.minusMinutes(2022);
        boolean boolean88 = charSet56.contains((java.lang.Object) dateTime85);
        org.joda.time.DateTime dateTime90 = dateTime85.withYearOfCentury(35);
        boolean boolean91 = dateMidnight54.isBefore((org.joda.time.ReadableInstant) dateTime90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone4, locale5);
        int int8 = timeZone4.getRawOffset();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime11 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay9.year();
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        java.lang.String str14 = property12.getAsText(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime17 = yearMonthDay16.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay16.year();
        java.util.Locale locale20 = java.util.Locale.US;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str22 = property12.getAsText(locale20);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone4, locale20);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean27 = timeZone24.hasSameRules(timeZone26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone26);
        calendar28.clear();
        java.util.Date date30 = calendar28.getTime();
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromDateFields(date30);
        boolean boolean32 = timeZone4.inDaylightTime(date30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar7", (calendar6.compareTo(calendar7) == 0) == calendar6.equals(calendar7));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.DateTime dateTime19 = instant17.toDateTime();
        org.joda.time.DateTime dateTime20 = instant17.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant17", (dateTime2.compareTo(instant17) == 0) == dateTime2.equals(instant17));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.Period period7 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear(11);
        org.joda.time.Duration duration14 = period7.toDurationFrom((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withYearOfCentury((int) '4');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withWeekOfWeekyear(13);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime(readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(53);
        org.joda.time.DateTime dateTime25 = dateTime22.toDateTime(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime25", (dateTime22.compareTo(dateTime25) == 0) == dateTime22.equals(dateTime25));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfYear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = localDate6.isSupported(dateTimeFieldType10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.LocalDate localDate13 = localDate6.withFields(readablePartial12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minus((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withWeekyear((-292275054));
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight18.plusYears(0);
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight22.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, dateTimeZone25);
        boolean boolean27 = dateTimeZone25.isFixed();
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(dateTimeZone25);
        mutableDateTime23.setZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime30 = localDate6.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.Interval interval31 = localDate6.toInterval();
        org.joda.time.LocalDate.Property property32 = localDate6.centuryOfEra();
        org.joda.time.LocalDate.Property property33 = localDate6.dayOfYear();
        java.util.Locale locale36 = new java.util.Locale("year", "Fri Dec 21 00:00:00 UTC 1900");
        int int37 = property33.getMaximumTextLength(locale36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration38, (org.joda.time.ReadableInstant) dateMidnight41, periodType42);
        int int44 = dateMidnight41.getYear();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight41.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime47 = dateMidnight46.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime47.copy();
        int int50 = mutableDateTime47.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime47.weekyear();
        java.util.Locale locale52 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone53 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone53);
        java.time.ZoneId zoneId55 = timeZone53.toZoneId();
        java.time.ZoneId zoneId56 = timeZone53.toZoneId();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getTimeZone(zoneId56);
        java.util.Locale locale58 = java.util.Locale.US;
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(locale58);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone57, locale58);
        java.lang.String str61 = locale52.getDisplayScript(locale58);
        java.util.Calendar calendar62 = mutableDateTime47.toCalendar(locale52);
        java.lang.String str63 = locale36.getDisplayScript(locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar59 and calendar60", (calendar59.compareTo(calendar60) == 0) == calendar59.equals(calendar60));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology13);
        long long15 = interval14.getEndMillis();
        java.lang.String str16 = interval14.toString();
        org.joda.time.MutableInterval mutableInterval17 = interval14.toMutableInterval();
        org.joda.time.Period period18 = interval14.toPeriod();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Period period21 = interval14.toPeriod(periodType19);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1970, dateTimeZone24);
        int int26 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate25.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval29 = localDate25.toInterval();
        boolean boolean30 = interval29.isBeforeNow();
        org.joda.time.Duration duration31 = interval29.toDuration();
        boolean boolean32 = duration22.isEqual((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant34 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration31, 32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight43.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime44.copy();
        mutableDateTime44.setMillis((long) (byte) 10);
        int int49 = mutableDateTime44.getYearOfEra();
        mutableDateTime44.setWeekyear(11);
        mutableDateTime44.addYears(5);
        mutableDateTime44.add((long) 10);
        mutableDateTime44.addYears(100);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(100L, dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime64 = dateTime62.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property65 = dateTime62.minuteOfDay();
        org.joda.time.DateTime dateTime66 = property65.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime66, readableDuration67);
        org.joda.time.DateTime.Property property69 = dateTime66.dayOfMonth();
        mutableDateTime44.setDate((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean71 = instant34.isBefore((org.joda.time.ReadableInstant) mutableDateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.joda.time.Instant instant7 = instant3.minus((long) 37895);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1970, dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1970, dateTimeZone14);
        int int16 = localDate15.getDayOfWeek();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((java.lang.Object) localDate15);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtMidnight();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        int int23 = mutablePeriod22.size();
        org.joda.time.LocalDate localDate25 = localDate15.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod22, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1970, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight32, readableDuration33, periodType34);
        int int36 = dateMidnight32.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight32.getZone();
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone37);
        org.joda.time.Interval interval40 = localDate28.toInterval(dateTimeZone37);
        boolean boolean42 = interval40.contains((long) 10);
        long long43 = interval40.getEndMillis();
        mutablePeriod22.add((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Duration duration45 = interval40.toDuration();
        org.joda.time.Instant instant47 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration45, 600100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean11 = dateTimeZone10.isFixed();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone10);
        int int13 = localDateTime12.getMillisOfSecond();
        int int14 = localDateTime12.getMonthOfYear();
        java.util.Date date15 = localDateTime12.toDate();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28, periodType29);
        int int31 = dateMidnight28.getYear();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight28.withDayOfMonth((int) (byte) 10);
        boolean boolean34 = dateMidnight19.isBefore((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTime dateTime35 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration37, (org.joda.time.ReadableInstant) dateMidnight40, periodType41);
        int int43 = dateMidnight40.getYear();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight40.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight45.toMutableDateTime();
        mutableDateTime46.setMillis((long) (byte) 0);
        int int49 = mutableDateTime46.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean52 = dateTimeZone51.isFixed();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.plusMillis(100);
        org.joda.time.Period period57 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(100L, dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime61 = dateTime60.toLocalDateTime();
        org.joda.time.DateTime dateTime63 = dateTime60.withMonthOfYear(11);
        org.joda.time.Duration duration64 = period57.toDurationFrom((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime53.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Period period66 = duration64.toPeriod();
        mutableDateTime46.add((org.joda.time.ReadableDuration) duration64, 32769);
        java.lang.String str69 = duration64.toString();
        org.joda.time.DateTime dateTime70 = dateTime35.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant73 = instant71.plus(28860999L);
        org.joda.time.Instant instant74 = instant71.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7, periodType8);
        int int10 = dateMidnight6.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight6.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 8, dateTimeZone11);
        long long15 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.adjustOffset(15250281647L, true);
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime(dateTimeZone11);
        java.util.TimeZone timeZone20 = dateTimeZone11.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        long long4 = instant3.getMillis();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.Instant instant8 = instant5.withDurationAdded(1645454902663L, 1951);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant5", (dateTime2.compareTo(instant5) == 0) == dateTime2.equals(instant5));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant7 = instant3.withMillis(0L);
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.DateTime dateTime9 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod15.setMinutes(11);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1970, dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.withWeekyear((-1));
        org.joda.time.LocalDate.Property property26 = localDate21.dayOfWeek();
        java.lang.Character[] charArray29 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet30 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet30, charArray29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(100L, dateTimeZone33);
        boolean boolean35 = dateTimeZone33.isFixed();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        boolean boolean37 = charSet30.contains((java.lang.Object) dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight39 = localDate21.toDateMidnight(dateTimeZone33);
        boolean boolean40 = interval18.isAfter((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1970, dateTimeZone42);
        int int44 = localDate43.getDayOfWeek();
        org.joda.time.LocalDate localDate46 = localDate43.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval47 = localDate43.toInterval();
        boolean boolean48 = interval18.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime50 = yearMonthDay49.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        org.joda.time.MutableDateTime mutableDateTime53 = instant52.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1970, dateTimeZone55);
        int int57 = localDate56.getDayOfWeek();
        org.joda.time.LocalDate localDate59 = localDate56.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval60 = localDate56.toInterval();
        boolean boolean61 = interval60.isBeforeNow();
        org.joda.time.Duration duration62 = interval60.toDuration();
        org.joda.time.Instant instant64 = instant52.withDurationAdded((org.joda.time.ReadableDuration) duration62, 2022);
        org.joda.time.MutableDateTime mutableDateTime65 = instant64.toMutableDateTime();
        boolean boolean66 = interval47.contains((org.joda.time.ReadableInstant) mutableDateTime65);
        mutableDateTime65.setDayOfYear(32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant52", (mutableDateTime36.compareTo(instant52) == 0) == mutableDateTime36.equals(instant52));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfCentury(0);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime16 = yearMonthDay15.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime17 = yearMonthDay15.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.LocalDate localDate19 = dateTime17.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1970, dateTimeZone21);
        int int23 = localDate22.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean25 = localDate22.isSupported(dateTimeFieldType24);
        int int26 = dateTime17.get(dateTimeFieldType24);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType24.getRangeDurationType();
        int int28 = dateTime12.get(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant18", (dateTime17.compareTo(instant18) == 0) == dateTime17.equals(instant18));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 23, false);
        java.lang.String str10 = dateTimeZone4.getName(910765191715200117L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval6 = interval3.toMutableInterval();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime16.copy();
        mutableDateTime16.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.dayOfMonth();
        mutableDateTime16.addSeconds(710);
        mutableDateTime16.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime16.yearOfEra();
        boolean boolean28 = mutableInterval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.add(1645454823680L);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.plusDays((int) 'a');
        boolean boolean37 = dateMidnight33.isEqual((-5270399978L));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis(100);
        boolean boolean42 = dateMidnight33.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.Period period45 = period43.minusSeconds((int) (byte) 0);
        org.joda.time.Period period47 = period45.minusSeconds((int) '#');
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight33.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(100L, dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateTime51.toLocalDate();
        org.joda.time.Instant instant53 = new org.joda.time.Instant((java.lang.Object) dateTime51);
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime56 = yearMonthDay55.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime57 = yearMonthDay55.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property58 = dateTime57.minuteOfDay();
        org.joda.time.Period period59 = org.joda.time.Period.ZERO;
        org.joda.time.Period period61 = period59.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.millis();
        int int63 = period61.get(durationFieldType62);
        org.joda.time.Duration duration64 = period61.toStandardDuration();
        org.joda.time.DateTime dateTime65 = dateTime57.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant66 = instant53.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight48.withDurationAdded((org.joda.time.ReadableDuration) duration64, 0);
        boolean boolean69 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) dateMidnight68);
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime16.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant53", (dateTime51.compareTo(instant53) == 0) == dateTime51.equals(instant53));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.weeks();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableDuration5, (org.joda.time.ReadableInstant) dateMidnight8, periodType9);
        org.joda.time.Hours hours11 = period10.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period14 = period10.withFieldAdded(durationFieldType12, 100);
        org.joda.time.Period period23 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period25 = period23.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plusDays((int) 'a');
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period23, (org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DurationField durationField35 = durationFieldType12.getField(chronology32);
        org.joda.time.DurationField durationField36 = chronology32.centuries();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((-1L), 379987200000L, periodType4, chronology32);
        org.joda.time.Period period47 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period49 = period47.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(1L, dateTimeZone51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.plusDays((int) 'a');
        org.joda.time.Interval interval55 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period47, (org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateMidnight dateMidnight57 = org.joda.time.DateMidnight.now(chronology56);
        long long61 = chronology56.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight62 = org.joda.time.DateMidnight.now(chronology56);
        org.joda.time.DateMidnight dateMidnight63 = org.joda.time.DateMidnight.now(chronology56);
        org.joda.time.DurationField durationField64 = chronology56.minutes();
        org.joda.time.DurationField durationField65 = chronology56.millis();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) 49, chronology56);
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 2765, (long) 15, periodType4, chronology56);
        org.joda.time.DateTimeField dateTimeField68 = chronology56.minuteOfHour();
        org.joda.time.DurationField durationField69 = chronology56.weeks();
        org.joda.time.DateTimeField dateTimeField70 = chronology56.yearOfCentury();
        org.joda.time.DurationField durationField71 = chronology56.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField71, durationField35, and durationField36", !(durationField71.compareTo(durationField35) == 0) || (Math.signum(durationField71.compareTo(durationField36)) == Math.signum(durationField35.compareTo(durationField36))));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.DateTime dateTime18 = instant17.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight3.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.LocalDate localDate16 = dateTime14.toLocalDate();
        org.joda.time.DateTime dateTime17 = dateTime14.toDateTimeISO();
        org.joda.time.Instant instant19 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withDaysRemoved();
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableInstant) instant19, periodType20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology25);
        long long27 = interval26.getEndMillis();
        java.lang.String str28 = interval26.toString();
        org.joda.time.MutableInterval mutableInterval29 = interval26.toMutableInterval();
        org.joda.time.Period period30 = interval26.toPeriod();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType32 = periodType31.withWeeksRemoved();
        org.joda.time.Period period33 = interval26.toPeriod(periodType31);
        org.joda.time.Duration duration34 = period33.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 1970, dateTimeZone36);
        int int38 = localDate37.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate37.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval41 = localDate37.toInterval();
        boolean boolean42 = interval41.isBeforeNow();
        org.joda.time.Duration duration43 = interval41.toDuration();
        boolean boolean44 = duration34.isEqual((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Instant instant46 = instant19.withDurationAdded((org.joda.time.ReadableDuration) duration43, 32);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight3.plus((org.joda.time.ReadableDuration) duration43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate.Property property11 = localDate7.year();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateMidnight15, periodType16);
        int int18 = dateMidnight15.getYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight20.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime21.copy();
        mutableDateTime21.addMonths((int) (byte) 100);
        mutableDateTime21.setWeekyear(1);
        boolean boolean29 = mutableDateTime21.isEqual((long) 3);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime21.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime32 = yearMonthDay31.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime33 = yearMonthDay31.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.LocalDate localDate35 = dateTime33.toLocalDate();
        org.joda.time.DateTime dateTime36 = dateTime33.toDateTimeISO();
        org.joda.time.Instant instant38 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType40 = periodType39.withDaysRemoved();
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) instant38, periodType39);
        int int42 = property30.compareTo((org.joda.time.ReadableInstant) instant38);
        boolean boolean43 = property11.equals((java.lang.Object) property30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and instant34", (dateTime33.compareTo(instant34) == 0) == dateTime33.equals(instant34));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMillis((int) (short) 0);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.Period period15 = period13.minusSeconds((int) (byte) 0);
        org.joda.time.Period period17 = period15.minusSeconds(100);
        org.joda.time.DateTime dateTime19 = dateTime10.withPeriodAdded((org.joda.time.ReadablePeriod) period15, 20);
        org.joda.time.DateTime dateTime21 = dateTime10.withMillisOfSecond((int) '4');
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateMidnight25, periodType26);
        int int28 = dateMidnight25.getYear();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight25, readableDuration31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (byte) 0, chronology35);
        int int37 = mutablePeriod36.getDays();
        org.joda.time.Period period38 = period32.withFields((org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.DateTime dateTime39 = dateTime10.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight43, readableDuration44, periodType45);
        int int47 = dateMidnight43.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = dateMidnight43.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight43.withField(dateTimeFieldType49, (int) (short) 1);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.plus((long) (short) 10);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight51.withMillis((long) 1);
        boolean boolean56 = dateTimeZone40.equals((java.lang.Object) dateMidnight51);
        org.joda.time.YearMonthDay yearMonthDay58 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime59 = yearMonthDay58.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime60 = yearMonthDay58.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property61 = yearMonthDay58.year();
        java.util.Locale locale62 = java.util.Locale.GERMANY;
        java.lang.String str63 = property61.getAsText(locale62);
        org.joda.time.DateTimeField dateTimeField64 = property61.getField();
        long long67 = dateTimeField64.add((long) (byte) 10, (long) '4');
        java.util.Locale locale68 = java.util.Locale.US;
        int int69 = dateTimeField64.getMaximumTextLength(locale68);
        java.util.Locale locale71 = java.util.Locale.forLanguageTag("DurationField[months]");
        java.lang.String str72 = locale68.getDisplayScript(locale71);
        java.lang.String str73 = dateTimeZone40.getName((-690897598082L), locale68);
        org.joda.time.DateTime dateTime74 = dateTime4.toDateTime(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime10", (instant5.compareTo(dateTime10) == 0) == instant5.equals(dateTime10));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        long long4 = instant3.getMillis();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = instant3.toDateTime();
        boolean boolean7 = instant3.isBeforeNow();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, readableDuration17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long23 = dateTimeZone21.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime24 = dateTime16.toDateTime(dateTimeZone21);
        int int25 = dateTime16.getYearOfCentury();
        boolean boolean26 = instant3.isEqual((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime27 = dateTime16.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        mutablePeriod5.add(100L);
        int int11 = mutablePeriod5.getYears();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateMidnight15, periodType16);
        int int18 = dateMidnight15.getYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight20.withDayOfWeek(4);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30, periodType31);
        int int33 = dateMidnight30.getYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime36.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        mutableDateTime38.set(dateTimeFieldType39, 5);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) mutableDateTime38);
        org.joda.time.DateMidnight.Property property44 = dateMidnight20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(100L, dateTimeZone46);
        boolean boolean48 = dateTimeZone46.isFixed();
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((java.lang.Object) dateMidnight20, dateTimeZone46);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(1L, dateTimeZone52);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableDuration50, (org.joda.time.ReadableInstant) dateMidnight53, periodType54);
        int int56 = dateMidnight53.getYear();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight53.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight58, readableDuration59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight58, readableDuration61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight58.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property65 = dateMidnight64.dayOfYear();
        org.joda.time.DateMidnight dateMidnight67 = property65.addToCopy((int) 'u');
        org.joda.time.DateMidnight.Property property68 = dateMidnight67.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight67.withDayOfMonth(14);
        org.joda.time.YearMonthDay yearMonthDay71 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray72 = yearMonthDay71.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalDate localDate75 = new org.joda.time.LocalDate((long) 1970, dateTimeZone74);
        int int76 = localDate75.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean78 = localDate75.isSupported(dateTimeFieldType77);
        java.util.TimeZone timeZone79 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone81 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean82 = timeZone79.hasSameRules(timeZone81);
        java.util.Calendar calendar83 = java.util.Calendar.getInstance(timeZone81);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forTimeZone(timeZone81);
        org.joda.time.DateMidnight dateMidnight85 = localDate75.toDateMidnight(dateTimeZone84);
        org.joda.time.Interval interval86 = yearMonthDay71.toInterval(dateTimeZone84);
        org.joda.time.MutableDateTime mutableDateTime87 = new org.joda.time.MutableDateTime(dateTimeZone84);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight70.withZoneRetainFields(dateTimeZone84);
        mutableDateTime49.setZone(dateTimeZone84);
        org.joda.time.MonthDay monthDay90 = new org.joda.time.MonthDay(dateTimeZone84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight20 and mutableDateTime49", (dateMidnight20.compareTo(mutableDateTime49) == 0) == dateMidnight20.equals(mutableDateTime49));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.DateTime.Property property11 = dateTime2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime2", (instant3.compareTo(dateTime2) == 0) == instant3.equals(dateTime2));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        boolean boolean6 = dateMidnight2.isEqual((-5270399978L));
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis(100);
        boolean boolean11 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period12.minusSeconds((int) (byte) 0);
        org.joda.time.Period period16 = period14.minusSeconds((int) '#');
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime20.toLocalDate();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime20);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime25 = yearMonthDay24.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period30 = period28.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.millis();
        int int32 = period30.get(durationFieldType31);
        org.joda.time.Duration duration33 = period30.toStandardDuration();
        org.joda.time.DateTime dateTime34 = dateTime26.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Instant instant35 = instant22.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight17.withDurationAdded((org.joda.time.ReadableDuration) duration33, 0);
        org.joda.time.Period period46 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period48 = period46.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(1L, dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.plusDays((int) 'a');
        org.joda.time.Interval interval54 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period46, (org.joda.time.ReadableInstant) dateMidnight53);
        boolean boolean56 = dateMidnight53.isAfter((long) 243565);
        org.joda.time.DateMidnight.Property property57 = dateMidnight53.centuryOfEra();
        org.joda.time.DateMidnight.Property property58 = dateMidnight53.weekOfWeekyear();
        org.joda.time.PeriodType periodType59 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType62 = dateTimeFieldType61.getDurationType();
        org.joda.time.Period period71 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period73 = period71.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight(1L, dateTimeZone75);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight76.plusDays((int) 'a');
        org.joda.time.Interval interval79 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period71, (org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateMidnight dateMidnight81 = org.joda.time.DateMidnight.now(chronology80);
        long long85 = chronology80.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField86 = chronology80.dayOfWeek();
        boolean boolean87 = durationFieldType62.isSupported(chronology80);
        org.joda.time.DateTimeField dateTimeField88 = dateTimeFieldType60.getField(chronology80);
        org.joda.time.DurationFieldType durationFieldType89 = dateTimeFieldType60.getRangeDurationType();
        boolean boolean90 = periodType59.isSupported(durationFieldType89);
        org.joda.time.MutablePeriod mutablePeriod91 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration33, (org.joda.time.ReadableInstant) dateMidnight53, periodType59);
        java.lang.String str92 = duration33.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Period period10 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period12 = period10.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plusDays((int) 'a');
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period10, (org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology19);
        long long24 = chronology19.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField25 = chronology19.dayOfWeek();
        boolean boolean26 = durationFieldType1.isSupported(chronology19);
        java.lang.String str27 = durationFieldType1.toString();
        org.joda.time.Period period37 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period39 = period37.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.plusDays((int) 'a');
        org.joda.time.Interval interval45 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period37, (org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateMidnight dateMidnight47 = org.joda.time.DateMidnight.now(chronology46);
        long long51 = chronology46.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight52 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.DateMidnight dateMidnight53 = org.joda.time.DateMidnight.now(chronology46);
        org.joda.time.DurationField durationField54 = chronology46.minutes();
        org.joda.time.DurationField durationField55 = chronology46.millis();
        org.joda.time.DurationField durationField56 = chronology46.months();
        org.joda.time.DateTimeField dateTimeField57 = chronology46.hourOfHalfday();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(0L, chronology46);
        java.lang.Object obj59 = mutablePeriod58.clone();
        org.joda.time.Period period69 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period71 = period69.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(1L, dateTimeZone73);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.plusDays((int) 'a');
        org.joda.time.Interval interval77 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period69, (org.joda.time.ReadableInstant) dateMidnight76);
        org.joda.time.Chronology chronology78 = interval77.getChronology();
        org.joda.time.DateMidnight dateMidnight79 = org.joda.time.DateMidnight.now(chronology78);
        long long83 = chronology78.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight84 = org.joda.time.DateMidnight.now(chronology78);
        org.joda.time.DateMidnight dateMidnight85 = org.joda.time.DateMidnight.now(chronology78);
        org.joda.time.Period period87 = org.joda.time.Period.days(1970);
        org.joda.time.Period period89 = period87.minusYears(23);
        int int90 = period87.getMillis();
        int[] intArray92 = chronology78.get((org.joda.time.ReadablePeriod) period87, 331257600000L);
        mutablePeriod58.setPeriod(1645454926008L, chronology78);
        boolean boolean94 = durationFieldType1.isSupported(chronology78);
        org.joda.time.DurationField durationField95 = chronology78.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField95, durationField54, and durationField55", !(durationField95.compareTo(durationField54) == 0) || (Math.signum(durationField95.compareTo(durationField55)) == Math.signum(durationField54.compareTo(durationField55))));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        java.util.Date date6 = mutableDateTime5.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        boolean boolean7 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        boolean boolean8 = charSet3.isEmpty();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        mutablePeriod19.addSeconds(5);
        mutablePeriod19.setPeriod((long) 70);
        mutablePeriod19.addSeconds(0);
        org.joda.time.base.BasePeriod[] basePeriodArray26 = new org.joda.time.base.BasePeriod[] { mutablePeriod19 };
        org.joda.time.base.BasePeriod[] basePeriodArray27 = charSet3.toArray(basePeriodArray26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "fran\347ais (France)" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean36 = charSet3.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        java.lang.Object[] objArray37 = charSet3.toArray();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, dateTimeZone39);
        org.joda.time.LocalDate localDate41 = dateTime40.toLocalDate();
        org.joda.time.Instant instant42 = new org.joda.time.Instant((java.lang.Object) dateTime40);
        org.joda.time.Chronology chronology43 = instant42.getChronology();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime45 = yearMonthDay44.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime46 = yearMonthDay44.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property47 = dateTime46.minuteOfDay();
        org.joda.time.Period period48 = org.joda.time.Period.ZERO;
        org.joda.time.Period period50 = period48.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.millis();
        int int52 = period50.get(durationFieldType51);
        org.joda.time.Duration duration53 = period50.toStandardDuration();
        org.joda.time.DateTime dateTime54 = dateTime46.minus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.Instant instant55 = instant42.plus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateTime dateTime56 = instant55.toDateTimeISO();
        org.joda.time.DateTime dateTime57 = instant55.toDateTime();
        boolean boolean58 = charSet3.contains((java.lang.Object) dateTime57);
        java.util.Locale locale59 = java.util.Locale.FRANCE;
        java.util.Locale locale60 = java.util.Locale.FRANCE;
        java.lang.String str61 = locale59.getDisplayName(locale60);
        java.util.Set<java.lang.Character> charSet62 = locale59.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray63 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList64 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64, languageRangeArray63);
        boolean boolean66 = charSet62.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap67 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList68 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList64, strMap67);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream69 = languageRangeList64.parallelStream();
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream70 = languageRangeList64.stream();
        boolean boolean71 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and instant42", (dateTime40.compareTo(instant42) == 0) == dateTime40.equals(instant42));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withCenturyOfEra(5);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime12 = instant11.toDateTimeISO();
        org.joda.time.Instant instant14 = instant11.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean17 = dateTimeZone16.isFixed();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone16);
        int int19 = localDateTime18.getMillisOfSecond();
        int int20 = localDateTime18.getMonthOfYear();
        java.util.Date date21 = localDateTime18.toDate();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateMidnight25, periodType26);
        int int28 = dateMidnight25.getYear();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(1L, dateTimeZone33);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = new org.joda.time.Period(readableDuration31, (org.joda.time.ReadableInstant) dateMidnight34, periodType35);
        int int37 = dateMidnight34.getYear();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight34.withDayOfMonth((int) (byte) 10);
        boolean boolean40 = dateMidnight25.isBefore((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateTime dateTime41 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateTime.Property property42 = dateTime41.weekyear();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration43, (org.joda.time.ReadableInstant) dateMidnight46, periodType47);
        int int49 = dateMidnight46.getYear();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight46.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime52 = dateMidnight51.toMutableDateTime();
        mutableDateTime52.setMillis((long) (byte) 0);
        int int55 = mutableDateTime52.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.plusMillis(100);
        org.joda.time.Period period63 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(100L, dateTimeZone65);
        org.joda.time.LocalDateTime localDateTime67 = dateTime66.toLocalDateTime();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear(11);
        org.joda.time.Duration duration70 = period63.toDurationFrom((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime59.minus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Period period72 = duration70.toPeriod();
        mutableDateTime52.add((org.joda.time.ReadableDuration) duration70, 32769);
        java.lang.String str75 = duration70.toString();
        org.joda.time.DateTime dateTime76 = dateTime41.minus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Instant instant77 = instant14.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Instant instant79 = instant77.minus((-690897598082L));
        org.joda.time.DateTime dateTime80 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) instant79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant11", (dateTime10.compareTo(instant11) == 0) == dateTime10.equals(instant11));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.Instant instant10 = instant8.plus(1645454823736L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.MutableDateTime mutableDateTime18 = instant4.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period9 = period5.withFieldAdded(durationFieldType7, 100);
        org.joda.time.Period period18 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period20 = period18.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plusDays((int) 'a');
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period18, (org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DurationField durationField30 = durationFieldType7.getField(chronology27);
        org.joda.time.DurationField durationField31 = chronology27.centuries();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableDuration32, (org.joda.time.ReadableInstant) dateMidnight35, periodType36);
        int int38 = dateMidnight35.getYear();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight35.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime41 = dateMidnight40.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime41.copy();
        int int44 = mutableDateTime41.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime41.weekyear();
        org.joda.time.MutableDateTime mutableDateTime47 = property45.add((long) 12);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(1L, dateTimeZone49);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight50, readableDuration51, periodType52);
        org.joda.time.Chronology chronology55 = null;
        mutablePeriod53.setPeriod(1L, chronology55);
        mutableDateTime47.add((org.joda.time.ReadablePeriod) mutablePeriod53);
        int[] intArray60 = chronology27.get((org.joda.time.ReadablePeriod) mutablePeriod53, (long) (byte) 10, (-13219199999L));
        org.joda.time.DateTimeField dateTimeField61 = chronology27.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = chronology27.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField62, durationField30, and durationField31", !(durationField62.compareTo(durationField30) == 0) || (Math.signum(durationField62.compareTo(durationField31)) == Math.signum(durationField30.compareTo(durationField31))));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        mutablePeriod10.addSeconds(5);
        mutablePeriod10.setPeriod((long) 70);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod10.toString(periodFormatter15);
        org.joda.time.Period period27 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period29 = period27.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plusDays((int) 'a');
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period27, (org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(chronology36);
        long long41 = chronology36.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DurationField durationField44 = chronology36.minutes();
        org.joda.time.DurationField durationField45 = chronology36.millis();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 49, chronology36);
        mutablePeriod10.setPeriod((long) (short) 10, chronology36);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime49 = yearMonthDay48.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        org.joda.time.LocalDate localDate52 = dateTime50.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 1970, dateTimeZone54);
        int int56 = localDate55.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean58 = localDate55.isSupported(dateTimeFieldType57);
        int int59 = dateTime50.get(dateTimeFieldType57);
        org.joda.time.DateTime dateTime61 = dateTime50.minus((long) '#');
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(1L, dateTimeZone64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableDuration62, (org.joda.time.ReadableInstant) dateMidnight65, periodType66);
        int int68 = dateMidnight65.getYear();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight65.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime71 = dateMidnight70.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime71.copy();
        mutableDateTime71.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime71.dayOfMonth();
        mutableDateTime71.addSeconds(710);
        mutableDateTime71.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime71.year();
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime83 = yearMonthDay82.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray84 = yearMonthDay82.getFieldTypes();
        int int85 = yearMonthDay82.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay82.minusMonths((int) (byte) 0);
        int int88 = property81.compareTo((org.joda.time.ReadablePartial) yearMonthDay82);
        org.joda.time.MutableDateTime mutableDateTime89 = property81.roundFloor();
        mutablePeriod10.setPeriod((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) mutableDateTime89);
        mutablePeriod10.setPeriod(3, 3, 36, 50, 1463, 39, 107, 96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant51", (dateTime50.compareTo(instant51) == 0) == dateTime50.equals(instant51));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7, periodType8);
        int int10 = dateMidnight6.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight6.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 8, dateTimeZone11);
        long long15 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.adjustOffset(15250281647L, true);
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime(dateTimeZone11);
        int int20 = mutableDateTime19.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTime dateTime6 = instant4.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours(52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 'x', periodType7);
        mutablePeriod8.setDays(21);
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-292275054));
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays(999);
        int int15 = dateTime12.getYearOfEra();
        org.joda.time.DateTime dateTime17 = dateTime12.withMillisOfSecond(19);
        org.joda.time.DateTime dateTime19 = dateTime17.plusWeeks(3665);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime5", (dateTime1.compareTo(dateTime5) == 0) == dateTime1.equals(dateTime5));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        long long4 = instant3.getMillis();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = instant3.toDateTime();
        org.joda.time.DateTime dateTime7 = instant3.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime9 = yearMonthDay8.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime10 = yearMonthDay8.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay8.year();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = property11.getAsText(locale12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str16 = property11.getAsText(locale15);
        java.lang.String str17 = property11.getAsShortText();
        java.lang.String str18 = property11.toString();
        org.joda.time.YearMonthDay yearMonthDay20 = property11.setCopy((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay22 = property11.addToCopy(883);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration23, (org.joda.time.ReadableInstant) dateMidnight26, periodType27);
        int int29 = dateMidnight26.getYear();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight26.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight31, readableDuration32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight31, readableDuration34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight31.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone40 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime41 = dateMidnight37.toDateTime(dateTimeZone39);
        long long45 = dateTimeZone39.convertLocalToUTC(1645454801986L, false, 10L);
        org.joda.time.DateTime dateTime46 = yearMonthDay22.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.DateTime dateTime47 = dateTime7.toDateTime(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfSecond();
        boolean boolean6 = property5.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Instant instant18 = instant3.withDurationAdded((long) 8, 120);
        org.joda.time.Instant instant19 = instant3.toInstant();
        org.joda.time.Instant instant21 = instant3.withMillis(6238809388800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant7 = instant3.withMillis(0L);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.joda.time.Instant instant7 = instant3.minus((long) 37895);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(11);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay19.year();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime29 = dateTime27.plus((long) (-1));
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime27.withDurationAdded(readableDuration31, 1970);
        int int34 = property22.compareTo((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean35 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Chronology chronology36 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime37 = instant7.toDateTime(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        boolean boolean6 = instant3.isBefore((long) 365);
        org.joda.time.Instant instant8 = instant3.withMillis(768616901452833198L);
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfMonth(6);
        int int3 = localDate0.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) dateTime7);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(chronology10);
        int int12 = dateTime4.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) (-1));
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded(readableDuration12, 1970);
        int int15 = property3.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime16 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime16.weekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime16.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime16.minusDays(53303);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfYear();
        org.joda.time.Period period32 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period34 = period32.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((int) 'a');
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology41);
        long long46 = chronology41.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfWeek();
        org.joda.time.DateTime dateTime48 = dateTime22.withChronology(chronology41);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime50 = yearMonthDay49.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate51 = dateTime50.toLocalDate();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateTime dateTime54 = dateTime50.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Interval interval60 = interval58.withDurationBeforeEnd(readableDuration59);
        org.joda.time.Period period61 = interval58.toPeriod();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(1L, dateTimeZone64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableDuration62, (org.joda.time.ReadableInstant) dateMidnight65, periodType66);
        org.joda.time.Hours hours68 = period67.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period71 = period67.withFieldAdded(durationFieldType69, 100);
        org.joda.time.Period period73 = period61.withFieldAdded(durationFieldType69, (int) (byte) 10);
        org.joda.time.DateTime dateTime74 = dateTime50.minus((org.joda.time.ReadablePeriod) period73);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean76 = dateTimeZone75.isFixed();
        org.joda.time.DateTime dateTime77 = dateTime50.toDateTime(dateTimeZone75);
        org.joda.time.DateTime dateTime78 = dateTime48.toDateTime(dateTimeZone75);
        java.lang.String str80 = dateTimeZone75.getShortName((long) '#');
        org.joda.time.DateTime dateTime81 = dateTime16.withZoneRetainFields(dateTimeZone75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime54", (dateTime1.compareTo(dateTime54) == 0) == dateTime1.equals(dateTime54));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Interval interval11 = interval9.withDurationBeforeEnd(readableDuration10);
        org.joda.time.Period period12 = interval9.toPeriod();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration13, (org.joda.time.ReadableInstant) dateMidnight16, periodType17);
        org.joda.time.Hours hours19 = period18.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period22 = period18.withFieldAdded(durationFieldType20, 100);
        org.joda.time.Period period24 = period12.withFieldAdded(durationFieldType20, (int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime1.minus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.Period period27 = period24.plusYears(292278993);
        org.joda.time.Period period29 = period27.minusHours((int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime5", (dateTime1.compareTo(dateTime5) == 0) == dateTime1.equals(dateTime5));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        boolean boolean28 = dateMidnight13.isBefore((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        org.joda.time.DateMidnight dateMidnight30 = property29.roundFloorCopy();
        boolean boolean31 = localDate7.equals((java.lang.Object) dateMidnight30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.plusYears(200);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight30.plusYears((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight30.withWeekyear(475);
        org.joda.time.Instant instant40 = dateMidnight30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(100L, dateTimeZone42);
        boolean boolean44 = dateTimeZone42.isFixed();
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(1L, dateTimeZone48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight49, readableDuration50, periodType51);
        int int53 = dateMidnight49.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone54 = dateMidnight49.getZone();
        org.joda.time.DateMidnight dateMidnight55 = org.joda.time.DateMidnight.now(dateTimeZone54);
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone54);
        mutableDateTime45.setZone(dateTimeZone54);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology60);
        mutableDateTime45.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        mutablePeriod61.clear();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(1L, dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight66.plusDays((int) 'a');
        long long69 = dateMidnight68.getMillis();
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight68.plus((long) (-1));
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.minusYears(6);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight71.plusYears(19);
        org.joda.time.Duration duration76 = mutablePeriod61.toDurationTo((org.joda.time.ReadableInstant) dateMidnight71);
        org.joda.time.Instant instant77 = instant40.minus((org.joda.time.ReadableDuration) duration76);
        org.joda.time.Chronology chronology78 = instant40.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight13 and instant40", (dateMidnight13.compareTo(instant40) == 0) == dateMidnight13.equals(instant40));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.Period period13 = period11.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.millis();
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period17 = period13.minusWeeks(9);
        org.joda.time.LocalDate localDate19 = localDate3.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 7);
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear(21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1970, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1970, dateTimeZone28);
        int int30 = localDate29.getDayOfWeek();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate24, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay((java.lang.Object) localDate29);
        org.joda.time.LocalDate localDate34 = localDate29.minusYears((int) '4');
        org.joda.time.LocalDate localDate36 = localDate29.withYear(52);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime38 = yearMonthDay37.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate39 = dateTime38.toLocalDate();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Interval interval48 = interval46.withDurationBeforeEnd(readableDuration47);
        org.joda.time.Period period49 = interval46.toPeriod();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(1L, dateTimeZone52);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableDuration50, (org.joda.time.ReadableInstant) dateMidnight53, periodType54);
        org.joda.time.Hours hours56 = period55.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period59 = period55.withFieldAdded(durationFieldType57, 100);
        org.joda.time.Period period61 = period49.withFieldAdded(durationFieldType57, (int) (byte) 10);
        org.joda.time.DateTime dateTime62 = dateTime38.minus((org.joda.time.ReadablePeriod) period61);
        org.joda.time.LocalDate localDate63 = localDate29.plus((org.joda.time.ReadablePeriod) period61);
        int int64 = localDate19.compareTo((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(1L, dateTimeZone67);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableDuration65, (org.joda.time.ReadableInstant) dateMidnight68, periodType69);
        int int71 = dateMidnight68.getYear();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight68.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight73.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime74.copy();
        mutableDateTime76.addWeekyears(1);
        mutableDateTime76.addWeeks(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int82 = mutableDateTime76.get(dateTimeFieldType81);
        mutableDateTime76.addMonths((int) 'u');
        org.joda.time.Chronology chronology87 = null;
        org.joda.time.Interval interval88 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology87);
        org.joda.time.ReadableDuration readableDuration89 = null;
        org.joda.time.Interval interval90 = interval88.withDurationBeforeEnd(readableDuration89);
        org.joda.time.Duration duration91 = interval88.toDuration();
        mutableDateTime76.add((org.joda.time.ReadableDuration) duration91, 2170);
        boolean boolean94 = localDate29.equals((java.lang.Object) 2170);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime42", (dateTime38.compareTo(dateTime42) == 0) == dateTime38.equals(dateTime42));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((int) 'a');
        long long14 = dateMidnight13.getMillis();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withCenturyOfEra(4);
        org.joda.time.Period period25 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period27 = period25.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plusDays((int) 'a');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight47, readableDuration48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight38.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 2);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property59 = dateTime56.minuteOfDay();
        org.joda.time.DateTime dateTime60 = property59.roundCeilingCopy();
        org.joda.time.DateTime dateTime62 = dateTime60.minusDays(35);
        org.joda.time.Duration duration63 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType66 = periodType65.withWeeksRemoved();
        java.lang.String str67 = periodType66.getName();
        org.joda.time.PeriodType periodType68 = periodType66.withDaysRemoved();
        int int69 = periodType66.size();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration63, periodType66);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration63);
        long long72 = instant8.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        int int7 = yearMonthDay6.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay6.minusYears(35);
        org.joda.time.Interval interval10 = yearMonthDay6.toInterval();
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.Interval interval12 = yearMonthDay6.toInterval();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration13, (org.joda.time.ReadableInstant) dateMidnight16, periodType17);
        int int19 = dateMidnight16.getYear();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight21.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime22.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime22.copy();
        int int25 = mutableDateTime22.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime22.weekyear();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.dayOfYear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology30);
        int int32 = mutablePeriod31.getDays();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay6.plus((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay6.withMonthOfYear(12);
        org.joda.time.YearMonthDay.Property property37 = yearMonthDay36.year();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period(readableDuration38, (org.joda.time.ReadableInstant) dateMidnight41, periodType42);
        int int44 = dateMidnight41.getYear();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight41.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime47 = dateMidnight46.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.dayOfYear();
        mutableDateTime47.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(100L, dateTimeZone52);
        boolean boolean54 = dateTimeZone52.isFixed();
        mutableDateTime47.setZone(dateTimeZone52);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(1L, dateTimeZone58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration56, (org.joda.time.ReadableInstant) dateMidnight59, periodType60);
        int int62 = dateMidnight59.getYear();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight59.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight64.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime67 = mutableDateTime65.copy();
        mutableDateTime65.setMillis((long) (byte) 10);
        mutableDateTime65.add((long) 1970);
        mutableDateTime47.setDate((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.Instant instant73 = mutableDateTime65.toInstant();
        org.joda.time.Instant instant74 = instant73.toInstant();
        int int75 = property37.compareTo((org.joda.time.ReadableInstant) instant74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime65 and instant74", (mutableDateTime65.compareTo(instant74) == 0) == mutableDateTime65.equals(instant74));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval6 = interval3.toMutableInterval();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime16.copy();
        mutableDateTime16.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.dayOfMonth();
        mutableDateTime16.addSeconds(710);
        mutableDateTime16.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime16.yearOfEra();
        boolean boolean28 = mutableInterval6.isAfter((org.joda.time.ReadableInstant) mutableDateTime16);
        mutableDateTime16.add(1645454823680L);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.plusDays((int) 'a');
        boolean boolean37 = dateMidnight33.isEqual((-5270399978L));
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis(100);
        boolean boolean42 = dateMidnight33.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Period period43 = org.joda.time.Period.ZERO;
        org.joda.time.Period period45 = period43.minusSeconds((int) (byte) 0);
        org.joda.time.Period period47 = period45.minusSeconds((int) '#');
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight33.minus((org.joda.time.ReadablePeriod) period47);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(100L, dateTimeZone50);
        org.joda.time.LocalDate localDate52 = dateTime51.toLocalDate();
        org.joda.time.Instant instant53 = new org.joda.time.Instant((java.lang.Object) dateTime51);
        org.joda.time.Chronology chronology54 = instant53.getChronology();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime56 = yearMonthDay55.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime57 = yearMonthDay55.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property58 = dateTime57.minuteOfDay();
        org.joda.time.Period period59 = org.joda.time.Period.ZERO;
        org.joda.time.Period period61 = period59.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.millis();
        int int63 = period61.get(durationFieldType62);
        org.joda.time.Duration duration64 = period61.toStandardDuration();
        org.joda.time.DateTime dateTime65 = dateTime57.minus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.Instant instant66 = instant53.plus((org.joda.time.ReadableDuration) duration64);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight48.withDurationAdded((org.joda.time.ReadableDuration) duration64, 0);
        boolean boolean69 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) dateMidnight68);
        mutableDateTime16.setMillis((-44194204799900L));
        mutableDateTime16.addMonths((int) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant53", (dateTime51.compareTo(instant53) == 0) == dateTime51.equals(instant53));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(100L, dateTimeZone2);
        boolean boolean4 = dateTimeZone2.isFixed();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone2);
        boolean boolean6 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime13 = dateTime11.plus((long) (-1));
        org.joda.time.DateTime dateTime14 = dateTime11.withTimeAtStartOfDay();
        java.util.Date date15 = dateTime11.toDate();
        org.joda.time.YearMonthDay yearMonthDay16 = org.joda.time.YearMonthDay.fromDateFields(date15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate21 = dateTime20.toLocalDate();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTime dateTime24 = dateTime20.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Interval interval30 = interval28.withDurationBeforeEnd(readableDuration29);
        org.joda.time.Period period31 = interval28.toPeriod();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableDuration32, (org.joda.time.ReadableInstant) dateMidnight35, periodType36);
        org.joda.time.Hours hours38 = period37.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period41 = period37.withFieldAdded(durationFieldType39, 100);
        org.joda.time.Period period43 = period31.withFieldAdded(durationFieldType39, (int) (byte) 10);
        org.joda.time.DateTime dateTime44 = dateTime20.minus((org.joda.time.ReadablePeriod) period43);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.DateTime dateTime47 = dateTime20.toDateTime(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight49 = yearMonthDay16.toDateMidnight(dateTimeZone45);
        long long51 = dateTimeZone2.getMillisKeepLocal(dateTimeZone45, (long) 1918);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((long) 48, dateTimeZone2);
        org.joda.time.LocalDate localDate54 = localDate52.withDayOfYear(59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime24", (dateTime20.compareTo(dateTime24) == 0) == dateTime20.equals(dateTime24));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        mutableDateTime4.setDate((long) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTime dateTime6 = instant4.toDateTime();
        int int7 = dateTime6.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod15.setMinutes(11);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1970, dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.withWeekyear((-1));
        org.joda.time.LocalDate.Property property26 = localDate21.dayOfWeek();
        java.lang.Character[] charArray29 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet30 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet30, charArray29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(100L, dateTimeZone33);
        boolean boolean35 = dateTimeZone33.isFixed();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        boolean boolean37 = charSet30.contains((java.lang.Object) dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight39 = localDate21.toDateMidnight(dateTimeZone33);
        boolean boolean40 = interval18.isAfter((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1970, dateTimeZone42);
        int int44 = localDate43.getDayOfWeek();
        org.joda.time.LocalDate localDate46 = localDate43.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval47 = localDate43.toInterval();
        boolean boolean48 = interval18.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime50 = yearMonthDay49.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        org.joda.time.MutableDateTime mutableDateTime53 = instant52.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1970, dateTimeZone55);
        int int57 = localDate56.getDayOfWeek();
        org.joda.time.LocalDate localDate59 = localDate56.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval60 = localDate56.toInterval();
        boolean boolean61 = interval60.isBeforeNow();
        org.joda.time.Duration duration62 = interval60.toDuration();
        org.joda.time.Instant instant64 = instant52.withDurationAdded((org.joda.time.ReadableDuration) duration62, 2022);
        org.joda.time.MutableDateTime mutableDateTime65 = instant64.toMutableDateTime();
        boolean boolean66 = interval47.contains((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime65.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant52", (mutableDateTime36.compareTo(instant52) == 0) == mutableDateTime36.equals(instant52));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.withDayOfWeek(4);
        org.joda.time.YearMonthDay yearMonthDay15 = dateMidnight14.toYearMonthDay();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.weekyear();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime19 = yearMonthDay18.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime20 = yearMonthDay18.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay18.year();
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = property21.getAsText(locale22);
        java.lang.String str24 = property21.getAsString();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime26 = yearMonthDay25.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate27 = dateTime26.toLocalDate();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTime dateTime30 = dateTime26.toDateTime(dateTimeZone29);
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        int int50 = dateMidnight47.getYear();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withDayOfMonth((int) (byte) 10);
        boolean boolean53 = dateMidnight38.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.monthOfYear();
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        int int56 = property54.getMaximumShortTextLength(locale55);
        java.lang.String str57 = locale33.getDisplayLanguage(locale55);
        java.util.Locale.setDefault(locale33);
        java.lang.String str59 = dateTimeZone29.getName((-5270399989L), locale33);
        int int60 = property21.getMaximumTextLength(locale33);
        org.joda.time.DateMidnight dateMidnight61 = property16.setCopy("2024", locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime30", (dateTime19.compareTo(dateTime30) == 0) == dateTime19.equals(dateTime30));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.millisOfSecond();
        org.joda.time.Period period6 = org.joda.time.Period.ZERO;
        org.joda.time.Period period8 = period6.minusSeconds((int) (byte) 0);
        org.joda.time.Period period10 = period8.minusSeconds(100);
        org.joda.time.Days days11 = period10.toStandardDays();
        mutableDateTime4.add((org.joda.time.ReadablePeriod) days11, 1970);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        int int14 = mutableDateTime9.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, dateTimeZone16);
        boolean boolean18 = dateTimeZone16.isFixed();
        mutableDateTime9.setZoneRetainFields(dateTimeZone16);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime9.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(8379600000L, dateTimeZone25);
        org.joda.time.DateTime dateTime27 = mutableDateTime9.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime30 = dateTime27.plusHours(3351);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMonths(292278993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime27", (mutableDateTime9.compareTo(dateTime27) == 0) == mutableDateTime9.equals(dateTime27));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Chronology chronology5 = instant3.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        long long4 = instant3.getMillis();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.Instant instant8 = instant3.withDurationAdded(1645454852035L, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Instant instant18 = instant3.withDurationAdded((long) 8, 120);
        org.joda.time.Instant instant19 = instant3.toInstant();
        org.joda.time.DateTime dateTime20 = instant3.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Period period16 = duration13.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight22 = property19.addToCopy((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str29 = dateTimeFieldType28.getName();
        org.joda.time.DateTime dateTime31 = dateTime25.withField(dateTimeFieldType28, (int) 'u');
        java.lang.String str32 = dateTimeFieldType28.toString();
        org.joda.time.Period period41 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period43 = period41.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.plusDays((int) 'a');
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period41, (org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(chronology50);
        boolean boolean52 = dateTimeFieldType28.isSupported(chronology50);
        org.joda.time.DateTime dateTime53 = dateMidnight22.toDateTime(chronology50);
        org.joda.time.DateTime.Property property54 = dateTime53.dayOfYear();
        org.joda.time.DateTime dateTime56 = dateTime53.withCenturyOfEra(53279);
        org.joda.time.Period period65 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period67 = period65.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateMidnight dateMidnight70 = new org.joda.time.DateMidnight(1L, dateTimeZone69);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight70.plusDays((int) 'a');
        org.joda.time.Interval interval73 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period65, (org.joda.time.ReadableInstant) dateMidnight72);
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.DateMidnight dateMidnight75 = org.joda.time.DateMidnight.now(chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.secondOfDay();
        org.joda.time.MonthDay monthDay77 = new org.joda.time.MonthDay(chronology74);
        org.joda.time.DateTime dateTime78 = dateTime56.withChronology(chronology74);
        org.joda.time.Instant instant79 = dateTime78.toInstant();
        java.util.Locale locale81 = null;
        java.lang.String str82 = dateTime78.toString("32", locale81);
        int int83 = dateTime78.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime78 and instant79", (dateTime78.compareTo(instant79) == 0) == dateTime78.equals(instant79));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Interval interval9 = localDate2.toInterval(dateTimeZone7);
        org.joda.time.LocalDate.Property property10 = localDate2.monthOfYear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Interval interval16 = interval14.withDurationBeforeEnd(readableDuration15);
        org.joda.time.Period period18 = org.joda.time.Period.millis((int) (byte) 100);
        org.joda.time.Interval interval19 = interval16.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Minutes minutes20 = period18.toStandardMinutes();
        org.joda.time.Period period22 = period18.withDays(8);
        org.joda.time.LocalDate localDate23 = localDate2.minus((org.joda.time.ReadablePeriod) period18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime8", (dateTime1.compareTo(dateTime8) == 0) == dateTime1.equals(dateTime8));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Instant instant16 = instant3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant16", (dateTime2.compareTo(instant16) == 0) == dateTime2.equals(instant16));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfMonth(6);
        int int3 = localDate0.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) dateTime7);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(chronology10);
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded((long) 8, 78);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18, periodType19);
        int int21 = dateMidnight18.getYear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight23.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        mutableDateTime24.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(100L, dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        mutableDateTime24.setZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        mutableDateTime24.setZoneRetainFields(dateTimeZone33);
        mutableDateTime24.addSeconds(475);
        mutableDateTime24.add((-5711731199978L));
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) mutableDateTime24);
        java.util.GregorianCalendar gregorianCalendar40 = dateTime11.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant9 = instant5.withDurationAdded((long) (-292275054), (int) 'a');
        org.joda.time.Instant instant11 = instant9.withMillis((-1199999L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        int int5 = mutableDateTime4.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        boolean boolean7 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str10 = locale8.getDisplayName(locale9);
        java.util.Set<java.lang.Character> charSet11 = locale8.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray12 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList13 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13, languageRangeArray12);
        boolean boolean15 = charSet11.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        boolean boolean16 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList13);
        java.util.Spliterator<java.lang.Character> charSpliterator17 = charSet3.spliterator();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean21 = timeZone18.hasSameRules(timeZone20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone20);
        calendar22.clear();
        java.time.Instant instant24 = calendar22.toInstant();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime26 = yearMonthDay25.toDateTimeAtMidnight();
        java.util.Date date27 = dateTime26.toDate();
        date27.setMonth((int) '#');
        int int30 = date27.getMinutes();
        date27.setYear((int) (byte) 0);
        int int33 = date27.getTimezoneOffset();
        java.time.Instant instant34 = date27.toInstant();
        java.util.Date date35 = java.util.Date.from(instant34);
        calendar22.setTime(date35);
        java.util.Date date38 = new java.util.Date(0L);
        boolean boolean39 = date35.before(date38);
        boolean boolean40 = charSet3.contains((java.lang.Object) boolean39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(1L, dateTimeZone43);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableDuration41, (org.joda.time.ReadableInstant) dateMidnight44, periodType45);
        int int47 = dateMidnight44.getYear();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight44.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime50 = dateMidnight49.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime50.copy();
        int int53 = mutableDateTime50.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime50.weekyear();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        java.time.ZoneId zoneId58 = timeZone56.toZoneId();
        java.time.ZoneId zoneId59 = timeZone56.toZoneId();
        java.util.TimeZone timeZone60 = java.util.TimeZone.getTimeZone(zoneId59);
        java.util.Locale locale61 = java.util.Locale.US;
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone60, locale61);
        java.lang.String str64 = locale55.getDisplayScript(locale61);
        java.util.Calendar calendar65 = mutableDateTime50.toCalendar(locale55);
        int int66 = calendar65.getWeeksInWeekYear();
        boolean boolean67 = charSet3.equals((java.lang.Object) calendar65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar62 and calendar63", (calendar62.compareTo(calendar63) == 0) == calendar62.equals(calendar63));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.roundHalfCeiling();
        mutableDateTime17.setDate((long) 24);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1970, dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        int int28 = localDate27.getDayOfWeek();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate27);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration30, (org.joda.time.ReadableInstant) dateMidnight33, periodType34);
        int int36 = dateMidnight33.getYear();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight33.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        boolean boolean48 = dateMidnight33.isBefore((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.DateMidnight.Property property49 = dateMidnight47.monthOfYear();
        org.joda.time.DateMidnight dateMidnight50 = property49.roundFloorCopy();
        boolean boolean51 = localDate27.equals((java.lang.Object) dateMidnight50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight50.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight50.plusYears(200);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight50.plusYears((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight50.withWeekyear(475);
        org.joda.time.Instant instant60 = dateMidnight50.toInstant();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(100L, dateTimeZone62);
        boolean boolean64 = dateTimeZone62.isFixed();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(1L, dateTimeZone68);
        org.joda.time.ReadableDuration readableDuration70 = null;
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight69, readableDuration70, periodType71);
        int int73 = dateMidnight69.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone74 = dateMidnight69.getZone();
        org.joda.time.DateMidnight dateMidnight75 = org.joda.time.DateMidnight.now(dateTimeZone74);
        org.joda.time.DateMidnight dateMidnight76 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone74);
        mutableDateTime65.setZone(dateTimeZone74);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology80);
        mutableDateTime65.add((org.joda.time.ReadablePeriod) mutablePeriod81);
        mutablePeriod81.clear();
        org.joda.time.DateTimeZone dateTimeZone85 = null;
        org.joda.time.DateMidnight dateMidnight86 = new org.joda.time.DateMidnight(1L, dateTimeZone85);
        org.joda.time.DateMidnight dateMidnight88 = dateMidnight86.plusDays((int) 'a');
        long long89 = dateMidnight88.getMillis();
        org.joda.time.DateMidnight dateMidnight91 = dateMidnight88.plus((long) (-1));
        org.joda.time.DateMidnight dateMidnight93 = dateMidnight91.minusYears(6);
        org.joda.time.DateMidnight dateMidnight95 = dateMidnight91.plusYears(19);
        org.joda.time.Duration duration96 = mutablePeriod81.toDurationTo((org.joda.time.ReadableInstant) dateMidnight91);
        org.joda.time.Instant instant97 = instant60.minus((org.joda.time.ReadableDuration) duration96);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration96, 1917);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and instant60", (dateMidnight3.compareTo(instant60) == 0) == dateMidnight3.equals(instant60));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, dateTimeZone14);
        boolean boolean16 = dateTimeZone14.isFixed();
        mutableDateTime9.setZone(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration18, (org.joda.time.ReadableInstant) dateMidnight21, periodType22);
        int int24 = dateMidnight21.getYear();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime27.copy();
        mutableDateTime27.setMillis((long) (byte) 10);
        mutableDateTime27.add((long) 1970);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Instant instant35 = mutableDateTime27.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        org.joda.time.MutableDateTime mutableDateTime37 = instant35.toMutableDateTimeISO();
        org.joda.time.Instant instant38 = instant35.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and instant38", (mutableDateTime27.compareTo(instant38) == 0) == mutableDateTime27.equals(instant38));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        mutablePeriod10.addSeconds(5);
        mutablePeriod10.setPeriod((long) 70);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod10.toString(periodFormatter15);
        org.joda.time.Period period27 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period29 = period27.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plusDays((int) 'a');
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period27, (org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(chronology36);
        long long41 = chronology36.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DurationField durationField44 = chronology36.minutes();
        org.joda.time.DurationField durationField45 = chronology36.millis();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 49, chronology36);
        mutablePeriod10.setPeriod((long) (short) 10, chronology36);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime49 = yearMonthDay48.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        org.joda.time.LocalDate localDate52 = dateTime50.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 1970, dateTimeZone54);
        int int56 = localDate55.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean58 = localDate55.isSupported(dateTimeFieldType57);
        int int59 = dateTime50.get(dateTimeFieldType57);
        org.joda.time.DateTime dateTime61 = dateTime50.minus((long) '#');
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(1L, dateTimeZone64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableDuration62, (org.joda.time.ReadableInstant) dateMidnight65, periodType66);
        int int68 = dateMidnight65.getYear();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight65.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime71 = dateMidnight70.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime71.copy();
        mutableDateTime71.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime71.dayOfMonth();
        mutableDateTime71.addSeconds(710);
        mutableDateTime71.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime71.year();
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime83 = yearMonthDay82.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray84 = yearMonthDay82.getFieldTypes();
        int int85 = yearMonthDay82.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay82.minusMonths((int) (byte) 0);
        int int88 = property81.compareTo((org.joda.time.ReadablePartial) yearMonthDay82);
        org.joda.time.MutableDateTime mutableDateTime89 = property81.roundFloor();
        mutablePeriod10.setPeriod((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) mutableDateTime89);
        org.joda.time.Chronology chronology91 = mutableDateTime89.getChronology();
        org.joda.time.LocalDateTime localDateTime92 = org.joda.time.LocalDateTime.now(chronology91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant51", (dateTime50.compareTo(instant51) == 0) == dateTime50.equals(instant51));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7, periodType8);
        int int10 = dateMidnight6.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight6.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 8, dateTimeZone11);
        long long15 = dateTimeZone11.previousTransition((-1L));
        long long18 = dateTimeZone11.adjustOffset(15250281647L, true);
        org.joda.time.MutableDateTime mutableDateTime19 = instant1.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, readableDuration17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean21 = dateTimeZone20.isFixed();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis(100);
        org.joda.time.Period period26 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = dateTime29.toLocalDateTime();
        org.joda.time.DateTime dateTime32 = dateTime29.withMonthOfYear(11);
        org.joda.time.Duration duration33 = period26.toDurationFrom((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime22.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime36 = dateTime16.withDurationAdded((org.joda.time.ReadableDuration) duration33, 6);
        org.joda.time.Instant instant38 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration33, 457070);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight47.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        mutableDateTime48.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        boolean boolean55 = dateTimeZone53.isFixed();
        mutableDateTime48.setZone(dateTimeZone53);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(1L, dateTimeZone59);
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period(readableDuration57, (org.joda.time.ReadableInstant) dateMidnight60, periodType61);
        int int63 = dateMidnight60.getYear();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight60.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime66 = dateMidnight65.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime66.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime66.copy();
        mutableDateTime66.setMillis((long) (byte) 10);
        mutableDateTime66.add((long) 1970);
        mutableDateTime48.setDate((org.joda.time.ReadableInstant) mutableDateTime66);
        mutableDateTime66.setMillisOfDay(48);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean78 = dateTimeZone77.isFixed();
        org.joda.time.LocalDateTime localDateTime79 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone77);
        org.joda.time.LocalDateTime localDateTime81 = localDateTime79.plusMillis(100);
        org.joda.time.Period period83 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(100L, dateTimeZone85);
        org.joda.time.LocalDateTime localDateTime87 = dateTime86.toLocalDateTime();
        org.joda.time.DateTime dateTime89 = dateTime86.withMonthOfYear(11);
        org.joda.time.Duration duration90 = period83.toDurationFrom((org.joda.time.ReadableInstant) dateTime89);
        org.joda.time.LocalDateTime localDateTime91 = localDateTime79.minus((org.joda.time.ReadableDuration) duration90);
        org.joda.time.Period period92 = duration90.toPeriod();
        mutableDateTime66.add((org.joda.time.ReadableDuration) duration90);
        org.joda.time.Instant instant95 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration90, 520);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant95", (dateTime4.compareTo(instant95) == 0) == dateTime4.equals(instant95));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.millis();
        boolean boolean5 = localTime1.isSupported(durationFieldType4);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0);
        int int8 = localTime7.getMinuteOfHour();
        boolean boolean9 = localTime1.equals((java.lang.Object) localTime7);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean11 = localTime1.isSupported(dateTimeFieldType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateMidnight15, periodType16);
        int int18 = dateMidnight15.getYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight20.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone29 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTime dateTime30 = dateMidnight26.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localTime1.toDateTimeToday(dateTimeZone28);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        int int35 = dateTimeZone33.getStandardOffset((long) 5);
        java.lang.String str37 = dateTimeZone33.getShortName(100L);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str41 = dateTimeZone33.getName((long) (short) 0, locale40);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((java.lang.Object) dateTime31, dateTimeZone33);
        org.joda.time.DateTime dateTime43 = dateMidnight42.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withDurationAdded(readableDuration44, 2170);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateMidnight42", (dateTime31.compareTo(dateMidnight42) == 0) == dateTime31.equals(dateMidnight42));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime17 = property14.roundHalfCeiling();
        mutableDateTime17.setYear(1918);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime17.era();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24, periodType25);
        int int27 = dateMidnight24.getYear();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight24.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        mutableDateTime30.add((long) '4');
        boolean boolean34 = mutableDateTime30.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime36 = yearMonthDay35.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant38 = dateTime37.toInstant();
        org.joda.time.LocalDate localDate39 = dateTime37.toLocalDate();
        org.joda.time.DateTime dateTime40 = dateTime37.toDateTimeISO();
        org.joda.time.Instant instant42 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType44 = periodType43.withDaysRemoved();
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableInstant) instant42, periodType43);
        mutableDateTime30.setMillis((org.joda.time.ReadableInstant) dateTime37);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and instant38", (mutableDateTime17.compareTo(instant38) == 0) == mutableDateTime17.equals(instant38));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.Period period12 = period10.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        int int14 = period12.get(durationFieldType13);
        org.joda.time.Duration duration15 = period12.toStandardDuration();
        org.joda.time.DateTime dateTime16 = dateTime8.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant17 = instant4.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration18, (org.joda.time.ReadableInstant) dateMidnight21, periodType22);
        int int24 = dateMidnight21.getYear();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        mutableDateTime27.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(100L, dateTimeZone32);
        boolean boolean34 = dateTimeZone32.isFixed();
        mutableDateTime27.setZone(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39, periodType40);
        int int42 = dateMidnight39.getYear();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight39.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight44.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime45.copy();
        mutableDateTime45.setMillis((long) (byte) 10);
        mutableDateTime45.add((long) 1970);
        mutableDateTime27.setDate((org.joda.time.ReadableInstant) mutableDateTime45);
        mutableDateTime45.setMillisOfDay(48);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean57 = dateTimeZone56.isFixed();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.plusMillis(100);
        org.joda.time.Period period62 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(100L, dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime66 = dateTime65.toLocalDateTime();
        org.joda.time.DateTime dateTime68 = dateTime65.withMonthOfYear(11);
        org.joda.time.Duration duration69 = period62.toDurationFrom((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime58.minus((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period71 = duration69.toPeriod();
        mutableDateTime45.add((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Instant instant73 = instant4.minus((org.joda.time.ReadableDuration) duration69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant73", (dateTime2.compareTo(instant73) == 0) == dateTime2.equals(instant73));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        mutableDateTime24.addMillis(15);
        mutableDateTime24.addDays(2765);
        org.joda.time.DateTimeField dateTimeField29 = mutableDateTime24.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone(zoneId3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone4, locale5);
        int int8 = timeZone4.getRawOffset();
        int int9 = timeZone4.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar7", (calendar6.compareTo(calendar7) == 0) == calendar6.equals(calendar7));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight23 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DurationField durationField25 = chronology17.minutes();
        org.joda.time.DurationField durationField26 = chronology17.millis();
        org.joda.time.DurationField durationField27 = chronology17.months();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField25, and durationField26", !(durationField30.compareTo(durationField25) == 0) || (Math.signum(durationField30.compareTo(durationField26)) == Math.signum(durationField25.compareTo(durationField26))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period11 = period9.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plusDays((int) 'a');
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period9, (org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(chronology18);
        long long23 = chronology18.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.DurationField durationField26 = chronology18.minutes();
        org.joda.time.DurationField durationField27 = chronology18.millis();
        org.joda.time.DurationField durationField28 = chronology18.months();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 600100, chronology18);
        org.joda.time.DurationField durationField30 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField26, and durationField27", !(durationField30.compareTo(durationField26) == 0) || (Math.signum(durationField30.compareTo(durationField27)) == Math.signum(durationField26.compareTo(durationField27))));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((int) (short) 1);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.year();
        mutableDateTime16.setMillisOfSecond((int) (short) 100);
        int int20 = mutableDateTime16.getYear();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.yearOfEra();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.plusHours((int) (short) 0);
        int int26 = timeOfDay25.getHourOfDay();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay25.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.TimeOfDay timeOfDay30 = property27.addToCopy(53255);
        org.joda.time.TimeOfDay timeOfDay31 = property27.withMaximumValue();
        org.joda.time.DurationField durationField32 = property27.getRangeDurationField();
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.lang.String str35 = locale33.getDisplayName(locale34);
        java.util.Set<java.lang.Character> charSet36 = locale33.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray37 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList38 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38, languageRangeArray37);
        boolean boolean40 = charSet36.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList38);
        int int41 = charSet36.size();
        boolean boolean42 = property27.equals((java.lang.Object) charSet36);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(100L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime49 = dateTime47.plus((long) (-1));
        org.joda.time.DateTime dateTime50 = dateTime47.withTimeAtStartOfDay();
        java.util.Date date51 = dateTime47.toDate();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(1L, dateTimeZone54);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period(readableDuration52, (org.joda.time.ReadableInstant) dateMidnight55, periodType56);
        int int58 = dateMidnight55.getYear();
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight55.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight60.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime63 = mutableDateTime61.copy();
        mutableDateTime61.setMillis((long) (byte) 10);
        int int66 = mutableDateTime61.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(100L, dateTimeZone68);
        boolean boolean70 = dateTimeZone68.isFixed();
        mutableDateTime61.setZoneRetainFields(dateTimeZone68);
        org.joda.time.DateTime dateTime72 = dateTime47.toDateTime(dateTimeZone68);
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime(dateTimeZone68);
        java.util.TimeZone timeZone74 = dateTimeZone68.toTimeZone();
        java.util.TimeZone timeZone75 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        java.time.ZoneId zoneId77 = timeZone75.toZoneId();
        java.time.ZoneId zoneId78 = timeZone75.toZoneId();
        java.lang.String str79 = timeZone75.getID();
        boolean boolean80 = timeZone74.hasSameRules(timeZone75);
        java.util.TimeZone timeZone81 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone83 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean84 = timeZone81.hasSameRules(timeZone83);
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forTimeZone(timeZone83);
        java.util.TimeZone timeZone86 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone88 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean89 = timeZone86.hasSameRules(timeZone88);
        java.util.Calendar calendar90 = java.util.Calendar.getInstance(timeZone86);
        boolean boolean91 = timeZone83.hasSameRules(timeZone86);
        boolean boolean92 = timeZone75.hasSameRules(timeZone83);
        java.util.Locale locale95 = new java.util.Locale("14:47:03.627", "yearOfCentury");
        java.util.Calendar calendar96 = java.util.Calendar.getInstance(timeZone75, locale95);
        int int97 = property27.getMaximumTextLength(locale95);
        java.lang.String str98 = property21.getAsShortText(locale95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar90 and calendar96", (calendar90.compareTo(calendar96) == 0) == calendar90.equals(calendar96));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        mutableDateTime24.addMillis(15);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime28 = yearMonthDay27.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate29 = dateTime28.toLocalDate();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTime dateTime32 = dateTime28.toDateTime(dateTimeZone31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Interval interval38 = interval36.withDurationBeforeEnd(readableDuration37);
        org.joda.time.Period period39 = interval36.toPeriod();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43, periodType44);
        org.joda.time.Hours hours46 = period45.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period49 = period45.withFieldAdded(durationFieldType47, 100);
        org.joda.time.Period period51 = period39.withFieldAdded(durationFieldType47, (int) (byte) 10);
        org.joda.time.DateTime dateTime52 = dateTime28.minus((org.joda.time.ReadablePeriod) period51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.Period period54 = period51.minus(readablePeriod53);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.millis();
        java.lang.String str57 = durationFieldType56.getName();
        mutableDateTime55.add(durationFieldType56, (int) (short) 100);
        int int60 = period51.get(durationFieldType56);
        mutableDateTime24.add(durationFieldType56, 244);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11, periodType12);
        mutablePeriod13.addMillis((int) '4');
        int int16 = mutablePeriod13.size();
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        boolean boolean19 = mutablePeriod13.equals((java.lang.Object) calendar18);
        java.util.TimeZone timeZone20 = calendar18.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight27, readableDuration28, periodType29);
        int int31 = dateMidnight27.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = dateMidnight27.getZone();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(dateTimeZone32);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone32);
        long long37 = dateTimeZone32.convertLocalToUTC((long) 9, false);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1970, dateTimeZone39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = localDate40.isSupported(dateTimeFieldType41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 1970, dateTimeZone44);
        int int46 = localDate45.getDayOfWeek();
        org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate40, (org.joda.time.ReadablePartial) localDate45);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay((java.lang.Object) localDate45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        org.joda.time.DateMidnight dateMidnight51 = yearMonthDay48.toDateMidnight(dateTimeZone49);
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        int int55 = dateTimeZone53.getStandardOffset((long) 5);
        java.util.TimeZone timeZone56 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone58 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean59 = timeZone56.hasSameRules(timeZone58);
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone58);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        java.util.TimeZone timeZone62 = dateTimeZone61.toTimeZone();
        long long64 = dateTimeZone53.getMillisKeepLocal(dateTimeZone61, (long) 100);
        org.joda.time.Interval interval65 = yearMonthDay48.toInterval(dateTimeZone53);
        long long67 = dateTimeZone32.getMillisKeepLocal(dateTimeZone53, (-44179689599900L));
        long long69 = dateTimeZone21.getMillisKeepLocal(dateTimeZone32, 1704067200000L);
        org.joda.time.MutableDateTime mutableDateTime70 = new org.joda.time.MutableDateTime((java.lang.Object) calendar18, dateTimeZone21);
        org.joda.time.MutableDateTime.Property property71 = mutableDateTime70.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar60", (calendar18.compareTo(calendar60) == 0) == calendar18.equals(calendar60));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long15 = dateTimeZone13.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay17 = dateTime8.toTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusSeconds((-22));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.Period period7 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear(11);
        org.joda.time.Duration duration14 = period7.toDurationFrom((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minus((org.joda.time.ReadableDuration) duration14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.withYearOfCentury((int) '4');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withWeekOfWeekyear(13);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDateTime17.toDateTime(readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(53);
        org.joda.time.DateTime dateTime25 = dateTime22.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime22.minusHours(243571);
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime25", (dateTime22.compareTo(dateTime25) == 0) == dateTime22.equals(dateTime25));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.add((long) '4');
        boolean boolean13 = mutableDateTime9.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime15 = yearMonthDay14.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime16 = yearMonthDay14.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.LocalDate localDate18 = dateTime16.toLocalDate();
        org.joda.time.DateTime dateTime19 = dateTime16.toDateTimeISO();
        org.joda.time.Instant instant21 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withDaysRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) instant21, periodType22);
        mutableDateTime9.setMillis((org.joda.time.ReadableInstant) dateTime16);
        int int26 = dateTime16.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and instant17", (mutableDateTime9.compareTo(instant17) == 0) == mutableDateTime9.equals(instant17));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((int) 'a');
        long long14 = dateMidnight13.getMillis();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withCenturyOfEra(4);
        org.joda.time.Period period25 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period27 = period25.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plusDays((int) 'a');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight47, readableDuration48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight38.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 2);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property59 = dateTime56.minuteOfDay();
        org.joda.time.DateTime dateTime60 = property59.roundCeilingCopy();
        org.joda.time.DateTime dateTime62 = dateTime60.minusDays(35);
        org.joda.time.Duration duration63 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType66 = periodType65.withWeeksRemoved();
        java.lang.String str67 = periodType66.getName();
        org.joda.time.PeriodType periodType68 = periodType66.withDaysRemoved();
        int int69 = periodType66.size();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration63, periodType66);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Instant instant73 = instant71.withMillis((long) 86398082);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        java.lang.String str6 = property3.getAsString();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        int int23 = dateMidnight20.getYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29, periodType30);
        int int32 = dateMidnight29.getYear();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight29.withDayOfMonth((int) (byte) 10);
        boolean boolean35 = dateMidnight20.isBefore((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight34.monthOfYear();
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        int int38 = property36.getMaximumShortTextLength(locale37);
        java.lang.String str39 = locale15.getDisplayLanguage(locale37);
        java.util.Locale.setDefault(locale15);
        java.lang.String str41 = dateTimeZone11.getName((-5270399989L), locale15);
        int int42 = property3.getMaximumTextLength(locale15);
        org.joda.time.YearMonthDay yearMonthDay43 = property3.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(44179776000117L);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 1970, dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = localDate48.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDate localDate52 = localDate48.withWeekyear((-1));
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(1L, dateTimeZone55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = new org.joda.time.Period(readableDuration53, (org.joda.time.ReadableInstant) dateMidnight56, periodType57);
        int int59 = dateMidnight56.getYear();
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight56.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.MutablePeriod mutablePeriod63 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight61, readableDuration62);
        boolean boolean64 = localDate52.equals((java.lang.Object) readableDuration62);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(1L, dateTimeZone66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.plusDays((int) 'a');
        int int70 = dateMidnight67.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime71 = localDate52.toDateTime((org.joda.time.ReadableInstant) dateMidnight67);
        org.joda.time.YearMonthDay yearMonthDay72 = dateMidnight67.toYearMonthDay();
        int int73 = yearMonthDay72.getYear();
        org.joda.time.YearMonthDay yearMonthDay75 = yearMonthDay72.minusDays(366);
        org.joda.time.YearMonthDay yearMonthDay77 = yearMonthDay72.plusMonths(37895);
        org.joda.time.DateTime dateTime78 = yearMonthDay72.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = yearMonthDay72.getFieldType(0);
        org.joda.time.YearMonthDay.Property property81 = yearMonthDay45.property(dateTimeFieldType80);
        boolean boolean82 = yearMonthDay43.isSupported(dateTimeFieldType80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Interval interval9 = localDate2.toInterval(dateTimeZone7);
        org.joda.time.LocalDate localDate11 = localDate2.plusDays((-292275054));
        int int12 = localDate11.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime8", (dateTime1.compareTo(dateTime8) == 0) == dateTime1.equals(dateTime8));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 1970, dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localDate3.isSupported(dateTimeFieldType4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1970, dateTimeZone7);
        int int9 = localDate8.getDayOfWeek();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate8);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay((java.lang.Object) localDate8);
        org.joda.time.LocalDate localDate13 = localDate8.minusYears((int) '4');
        org.joda.time.LocalDate localDate15 = localDate8.withYear(52);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime17 = yearMonthDay16.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Interval interval27 = interval25.withDurationBeforeEnd(readableDuration26);
        org.joda.time.Period period28 = interval25.toPeriod();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period(readableDuration29, (org.joda.time.ReadableInstant) dateMidnight32, periodType33);
        org.joda.time.Hours hours35 = period34.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period38 = period34.withFieldAdded(durationFieldType36, 100);
        org.joda.time.Period period40 = period28.withFieldAdded(durationFieldType36, (int) (byte) 10);
        org.joda.time.DateTime dateTime41 = dateTime17.minus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.LocalDate localDate42 = localDate8.plus((org.joda.time.ReadablePeriod) period40);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 1970, dateTimeZone44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        boolean boolean47 = localDate45.isSupported(dateTimeFieldType46);
        org.joda.time.LocalDate localDate49 = localDate45.withWeekyear((-1));
        int int50 = localDate49.getWeekyear();
        org.joda.time.LocalDate localDate52 = localDate49.withDayOfYear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean54 = localDate49.isSupported(dateTimeFieldType53);
        int int55 = localDate42.get(dateTimeFieldType53);
        org.joda.time.LocalDate localDate57 = localDate42.withDayOfYear(12);
        org.joda.time.Chronology chronology58 = localDate57.getChronology();
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (-60), chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime21", (dateTime17.compareTo(dateTime21) == 0) == dateTime17.equals(dateTime21));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        long long9 = dateTimeField6.add((long) (byte) 10, (long) '4');
        java.util.Locale locale10 = java.util.Locale.US;
        int int11 = dateTimeField6.getMaximumTextLength(locale10);
        int int14 = dateTimeField6.getDifference(8380800000L, 0L);
        long long16 = dateTimeField6.roundHalfEven(10L);
        int int18 = dateTimeField6.getMinimumValue(0L);
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) 0L);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime21 = yearMonthDay20.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1970, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDate localDate28 = localDate24.withWeekyear((-1));
        boolean boolean30 = localDate28.equals((java.lang.Object) 8);
        int int31 = localDate28.getYear();
        boolean boolean32 = yearMonthDay20.equals((java.lang.Object) localDate28);
        org.joda.time.LocalDate.Property property33 = localDate28.yearOfEra();
        org.joda.time.LocalDate localDate35 = property33.addToCopy(8);
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfWeek(3);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval41 = new org.joda.time.Interval(10L, 10L, dateTimeZone40);
        org.joda.time.DateTime dateTime42 = localDate37.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean44 = dateTime42.isSupported(dateTimeFieldType43);
        mutableDateTime19.setMillis((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.YearMonthDay yearMonthDay46 = dateTime42.toYearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay48 = yearMonthDay46.minusMonths(1620100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and dateTime42", (mutableDateTime19.compareTo(dateTime42) == 0) == mutableDateTime19.equals(dateTime42));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        mutablePeriod10.addSeconds(5);
        mutablePeriod10.setPeriod((long) 70);
        org.joda.time.format.PeriodFormatter periodFormatter15 = null;
        java.lang.String str16 = mutablePeriod10.toString(periodFormatter15);
        org.joda.time.Period period27 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period29 = period27.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.plusDays((int) 'a');
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period27, (org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(chronology36);
        long long41 = chronology36.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology36);
        org.joda.time.DurationField durationField44 = chronology36.minutes();
        org.joda.time.DurationField durationField45 = chronology36.millis();
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 49, chronology36);
        mutablePeriod10.setPeriod((long) (short) 10, chronology36);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime49 = yearMonthDay48.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime50 = yearMonthDay48.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant51 = dateTime50.toInstant();
        org.joda.time.LocalDate localDate52 = dateTime50.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 1970, dateTimeZone54);
        int int56 = localDate55.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean58 = localDate55.isSupported(dateTimeFieldType57);
        int int59 = dateTime50.get(dateTimeFieldType57);
        org.joda.time.DateTime dateTime61 = dateTime50.minus((long) '#');
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(1L, dateTimeZone64);
        org.joda.time.PeriodType periodType66 = null;
        org.joda.time.Period period67 = new org.joda.time.Period(readableDuration62, (org.joda.time.ReadableInstant) dateMidnight65, periodType66);
        int int68 = dateMidnight65.getYear();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight65.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime71 = dateMidnight70.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property72 = mutableDateTime71.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime73 = mutableDateTime71.copy();
        mutableDateTime71.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property76 = mutableDateTime71.dayOfMonth();
        mutableDateTime71.addSeconds(710);
        mutableDateTime71.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property81 = mutableDateTime71.year();
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime83 = yearMonthDay82.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray84 = yearMonthDay82.getFieldTypes();
        int int85 = yearMonthDay82.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay87 = yearMonthDay82.minusMonths((int) (byte) 0);
        int int88 = property81.compareTo((org.joda.time.ReadablePartial) yearMonthDay82);
        org.joda.time.MutableDateTime mutableDateTime89 = property81.roundFloor();
        mutablePeriod10.setPeriod((org.joda.time.ReadableInstant) dateTime50, (org.joda.time.ReadableInstant) mutableDateTime89);
        org.joda.time.MutableDateTime.Property property91 = mutableDateTime89.year();
        mutableDateTime89.setWeekOfWeekyear((int) (byte) 1);
        int int94 = mutableDateTime89.getWeekyear();
        java.lang.String str95 = mutableDateTime89.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and instant51", (dateTime50.compareTo(instant51) == 0) == dateTime50.equals(instant51));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(11);
        int int11 = dateTime10.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra(5);
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.DateTime dateTime19 = dateTime16.plusMinutes(8);
        org.joda.time.Period period21 = org.joda.time.Period.days((int) 'u');
        org.joda.time.Period period23 = period21.minusDays(0);
        int int24 = period23.getWeeks();
        org.joda.time.Period period26 = period23.minusWeeks(26);
        org.joda.time.Duration duration27 = period23.toStandardDuration();
        org.joda.time.DateTime dateTime28 = dateTime19.minus((org.joda.time.ReadableDuration) duration27);
        int int29 = dateTime28.getWeekyear();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType33 = periodType32.withWeeksRemoved();
        java.lang.String str34 = periodType33.getName();
        int int35 = periodType33.size();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(10L, (long) (byte) 100, periodType33, chronology36);
        int int38 = mutablePeriod37.getMinutes();
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod37.copy();
        org.joda.time.PeriodType periodType40 = mutablePeriod37.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime28, periodType40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant17", (dateTime4.compareTo(instant17) == 0) == dateTime4.equals(instant17));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        mutablePeriod5.add(100L);
        int int11 = mutablePeriod5.getYears();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        mutablePeriod5.add(durationFieldType12, 6);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 49, (long) 'x');
        mutablePeriod5.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, dateTimeZone20);
        org.joda.time.LocalDate localDate22 = dateTime21.toLocalDate();
        org.joda.time.Instant instant23 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime24 = instant23.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = localDate27.isSupported(dateTimeFieldType28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 1970, dateTimeZone31);
        int int33 = localDate32.getDayOfWeek();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate27, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        int int50 = dateMidnight47.getYear();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withDayOfMonth((int) (byte) 10);
        boolean boolean53 = dateMidnight38.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.monthOfYear();
        org.joda.time.DateMidnight dateMidnight55 = property54.roundFloorCopy();
        boolean boolean56 = localDate32.equals((java.lang.Object) dateMidnight55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight55.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight58.withDayOfYear(32);
        org.joda.time.DateTime dateTime61 = dateMidnight58.toDateTime();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime24, (org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.ReadableInstant readableInstant63 = null;
        mutablePeriod17.setPeriod((org.joda.time.ReadableInstant) dateTime61, readableInstant63);
        int int65 = mutablePeriod17.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant23", (dateTime21.compareTo(instant23) == 0) == dateTime21.equals(instant23));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.copy();
        mutableDateTime18.setMillis((long) (byte) 10);
        int int23 = mutableDateTime18.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, dateTimeZone25);
        boolean boolean27 = dateTimeZone25.isFixed();
        mutableDateTime18.setZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime4.toDateTime(dateTimeZone25);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone25);
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.time.ZoneId zoneId34 = timeZone32.toZoneId();
        java.time.ZoneId zoneId35 = timeZone32.toZoneId();
        java.lang.String str36 = timeZone32.getID();
        boolean boolean37 = timeZone31.hasSameRules(timeZone32);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean41 = timeZone38.hasSameRules(timeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean46 = timeZone43.hasSameRules(timeZone45);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone43);
        boolean boolean48 = timeZone40.hasSameRules(timeZone43);
        boolean boolean49 = timeZone32.hasSameRules(timeZone40);
        java.util.Locale locale52 = new java.util.Locale("14:47:03.627", "yearOfCentury");
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone32, locale52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone55 = dateTimeZone54.toTimeZone();
        java.util.TimeZone.setDefault(timeZone55);
        timeZone55.setID("1971-01-01T00:00:00.000");
        timeZone55.setID("Property[dayOfYear]");
        timeZone55.setRawOffset(53);
        boolean boolean63 = timeZone32.hasSameRules(timeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar53", (calendar47.compareTo(calendar53) == 0) == calendar47.equals(calendar53));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.millisOfSecond();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.time.ZoneId zoneId17 = timeZone15.toZoneId();
        java.time.ZoneId zoneId18 = timeZone15.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone(zoneId18);
        java.util.Locale locale20 = java.util.Locale.US;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone19, locale20);
        java.lang.String str23 = locale14.getDisplayScript(locale20);
        org.joda.time.MutableDateTime mutableDateTime24 = property12.set("0", locale20);
        java.lang.String str25 = locale20.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar21 and calendar22", (calendar21.compareTo(calendar22) == 0) == calendar21.equals(calendar22));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.plusWeeks(0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime25 = dateTime23.plus((long) (-1));
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        java.util.Date date27 = dateTime23.toDate();
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromDateFields(date27);
        org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay28.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime32 = yearMonthDay31.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate33 = dateTime32.toLocalDate();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTime dateTime36 = dateTime32.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Interval interval42 = interval40.withDurationBeforeEnd(readableDuration41);
        org.joda.time.Period period43 = interval40.toPeriod();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        org.joda.time.Hours hours50 = period49.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period53 = period49.withFieldAdded(durationFieldType51, 100);
        org.joda.time.Period period55 = period43.withFieldAdded(durationFieldType51, (int) (byte) 10);
        org.joda.time.DateTime dateTime56 = dateTime32.minus((org.joda.time.ReadablePeriod) period55);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean58 = dateTimeZone57.isFixed();
        org.joda.time.DateTime dateTime59 = dateTime32.toDateTime(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight61 = yearMonthDay28.toDateMidnight(dateTimeZone57);
        org.joda.time.LocalDate localDate62 = org.joda.time.LocalDate.now(dateTimeZone57);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight18.withFields((org.joda.time.ReadablePartial) localDate62);
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(1L, dateTimeZone65);
        org.joda.time.ReadableDuration readableDuration67 = null;
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight66, readableDuration67, periodType68);
        int int70 = dateMidnight66.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = dateMidnight66.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight66.withField(dateTimeFieldType72, (int) (short) 1);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.plus((long) (short) 10);
        org.joda.time.DateMidnight dateMidnight78 = dateMidnight74.withMillis((long) 1);
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight63, (org.joda.time.ReadableInstant) dateMidnight78);
        org.joda.time.Period period81 = period79.plusDays(79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime36", (dateTime32.compareTo(dateTime36) == 0) == dateTime32.equals(dateTime36));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 1970);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime4.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime4.withMillis((long) 600100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks((int) (byte) 100);
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime16", (dateTime12.compareTo(dateTime16) == 0) == dateTime12.equals(dateTime16));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.setTimeInMillis((long) 4);
        java.util.Date date7 = new java.util.Date();
        calendar4.setTime(date7);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        int int14 = dateTimeZone12.getStandardOffset((long) 5);
        java.lang.String str16 = dateTimeZone12.getShortName(100L);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str20 = dateTimeZone12.getName((long) (short) 0, locale19);
        java.lang.String str21 = calendar4.getDisplayName(15, 3, locale19);
        java.util.TimeZone timeZone22 = calendar4.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone22, locale23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar25", (calendar4.compareTo(calendar25) == 0) == calendar4.equals(calendar25));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 492);
        org.joda.time.Instant instant9 = instant5.withMillis((-60620313599999L));
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.copy();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime19.dayOfMonth();
        mutableDateTime19.setYear((-292275054));
        org.joda.time.DateTimeField dateTimeField25 = mutableDateTime19.getRoundingField();
        mutableDateTime19.addMinutes(53230351);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology30);
        long long32 = interval31.getEndMillis();
        java.lang.String str33 = interval31.toString();
        org.joda.time.MutableInterval mutableInterval34 = interval31.toMutableInterval();
        org.joda.time.Period period35 = interval31.toPeriod();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType37 = periodType36.withWeeksRemoved();
        org.joda.time.Period period38 = interval31.toPeriod(periodType36);
        org.joda.time.Duration duration39 = interval31.toDuration();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime19, (org.joda.time.ReadableDuration) duration39);
        org.joda.time.Instant instant42 = instant5.withDurationAdded((org.joda.time.ReadableDuration) duration39, 107);
        java.lang.String str43 = duration39.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime20 = mutableDateTime18.copy();
        mutableDateTime18.setMillis((long) (byte) 10);
        int int23 = mutableDateTime18.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, dateTimeZone25);
        boolean boolean27 = dateTimeZone25.isFixed();
        mutableDateTime18.setZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = dateTime4.toDateTime(dateTimeZone25);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone25);
        java.util.TimeZone timeZone31 = dateTimeZone25.toTimeZone();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.time.ZoneId zoneId34 = timeZone32.toZoneId();
        java.time.ZoneId zoneId35 = timeZone32.toZoneId();
        java.lang.String str36 = timeZone32.getID();
        boolean boolean37 = timeZone31.hasSameRules(timeZone32);
        java.util.TimeZone timeZone38 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean41 = timeZone38.hasSameRules(timeZone40);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.TimeZone timeZone43 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean46 = timeZone43.hasSameRules(timeZone45);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone43);
        boolean boolean48 = timeZone40.hasSameRules(timeZone43);
        boolean boolean49 = timeZone32.hasSameRules(timeZone40);
        java.util.Locale locale52 = new java.util.Locale("14:47:03.627", "yearOfCentury");
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone32, locale52);
        boolean boolean54 = timeZone32.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar53", (calendar47.compareTo(calendar53) == 0) == calendar47.equals(calendar53));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        boolean boolean19 = dateMidnight18.isBeforeNow();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((int) (short) -1, (int) (byte) 100, (int) '#', 0, 0, 1970, (int) '#', (int) (byte) 100, periodType28);
        org.joda.time.Period period31 = period29.withMillis(8);
        org.joda.time.Period period33 = period31.minusWeeks((int) 'x');
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight18.minus((org.joda.time.ReadablePeriod) period31);
        org.joda.time.Interval interval35 = dateMidnight18.toInterval();
        int int36 = dateMidnight18.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(100L, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str43 = dateTimeFieldType42.getName();
        org.joda.time.DateTime dateTime45 = dateTime39.withField(dateTimeFieldType42, (int) 'u');
        java.lang.String str46 = dateTimeFieldType42.toString();
        org.joda.time.DateMidnight.Property property47 = dateMidnight18.property(dateTimeFieldType42);
        org.joda.time.DateTimeField dateTimeField48 = property47.getField();
        org.joda.time.DateMidnight dateMidnight50 = property47.addToCopy((-2051222400100L));
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(100L, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime57 = dateTime55.plus((long) (-1));
        org.joda.time.DateTime dateTime58 = dateTime55.withTimeAtStartOfDay();
        java.util.Date date59 = dateTime55.toDate();
        org.joda.time.YearMonthDay yearMonthDay60 = org.joda.time.YearMonthDay.fromDateFields(date59);
        org.joda.time.YearMonthDay yearMonthDay62 = yearMonthDay60.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime64 = yearMonthDay63.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate65 = dateTime64.toLocalDate();
        java.util.TimeZone timeZone66 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        org.joda.time.DateTime dateTime68 = dateTime64.toDateTime(dateTimeZone67);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.Interval interval72 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology71);
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.Interval interval74 = interval72.withDurationBeforeEnd(readableDuration73);
        org.joda.time.Period period75 = interval72.toPeriod();
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.DateMidnight dateMidnight79 = new org.joda.time.DateMidnight(1L, dateTimeZone78);
        org.joda.time.PeriodType periodType80 = null;
        org.joda.time.Period period81 = new org.joda.time.Period(readableDuration76, (org.joda.time.ReadableInstant) dateMidnight79, periodType80);
        org.joda.time.Hours hours82 = period81.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period85 = period81.withFieldAdded(durationFieldType83, 100);
        org.joda.time.Period period87 = period75.withFieldAdded(durationFieldType83, (int) (byte) 10);
        org.joda.time.DateTime dateTime88 = dateTime64.minus((org.joda.time.ReadablePeriod) period87);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean90 = dateTimeZone89.isFixed();
        org.joda.time.DateTime dateTime91 = dateTime64.toDateTime(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight92 = new org.joda.time.DateMidnight(dateTimeZone89);
        org.joda.time.DateMidnight dateMidnight93 = yearMonthDay60.toDateMidnight(dateTimeZone89);
        org.joda.time.DateTime dateTime94 = org.joda.time.DateTime.now(dateTimeZone89);
        org.joda.time.Interval interval95 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight50, (org.joda.time.ReadableInstant) dateTime94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight18 and dateTime68", (dateMidnight18.compareTo(dateTime68) == 0) == dateMidnight18.equals(dateTime68));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        java.time.Instant instant5 = calendar4.toInstant();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        org.joda.time.Period period15 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period17 = period15.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusDays((int) 'a');
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) calendar4, chronology24);
        calendar4.clear();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        java.util.Date date30 = calendar4.getTime();
        java.util.TimeZone timeZone31 = calendar4.getTimeZone();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.format.DateTimePrinter dateTimePrinter34 = null;
        org.joda.time.format.DateTimeParser dateTimeParser35 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter34, dateTimeParser35);
        org.joda.time.Chronology chronology37 = dateTimeFormatter36.getChronology();
        org.joda.time.Chronology chronology38 = dateTimeFormatter36.getChronology();
        boolean boolean39 = dateTimeFormatter36.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter36.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeFormatter36.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter36.withDefaultYear(7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter43.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime48 = yearMonthDay47.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime49 = yearMonthDay47.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property50 = yearMonthDay47.year();
        java.util.Locale locale51 = java.util.Locale.GERMANY;
        java.lang.String str52 = property50.getAsText(locale51);
        org.joda.time.DateTimeField dateTimeField53 = property50.getField();
        org.joda.time.YearMonthDay yearMonthDay54 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime55 = yearMonthDay54.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime56 = yearMonthDay54.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property57 = yearMonthDay54.year();
        java.util.Locale locale58 = java.util.Locale.US;
        int int59 = property57.getMaximumShortTextLength(locale58);
        java.lang.String str60 = property50.getAsText(locale58);
        java.lang.String str61 = locale58.getLanguage();
        java.util.Locale locale62 = java.util.Locale.US;
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(locale62);
        java.lang.String str64 = locale58.getDisplayLanguage(locale62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter46.withLocale(locale58);
        java.util.Calendar calendar66 = java.util.Calendar.getInstance(timeZone31, locale58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar63", (calendar32.compareTo(calendar63) == 0) == calendar32.equals(calendar63));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant9 = instant5.withDurationAdded((long) (-292275054), (int) 'a');
        org.joda.time.Instant instant11 = instant5.plus(1645454886615L);
        org.joda.time.Instant instant14 = instant11.withDurationAdded(1645455280866L, 53272);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime7 = dateTime2.plusDays(0);
        org.joda.time.DateTime dateTime9 = dateTime2.plusMinutes(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime9", (instant3.compareTo(dateTime9) == 0) == instant3.equals(dateTime9));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1970, dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1970, dateTimeZone12);
        int int14 = localDate13.getDayOfWeek();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28, periodType29);
        int int31 = dateMidnight28.getYear();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight28.withDayOfMonth((int) (byte) 10);
        boolean boolean34 = dateMidnight19.isBefore((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight.Property property35 = dateMidnight33.monthOfYear();
        org.joda.time.DateMidnight dateMidnight36 = property35.roundFloorCopy();
        boolean boolean37 = localDate13.equals((java.lang.Object) dateMidnight36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight36.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.withDayOfYear(32);
        org.joda.time.DateTime dateTime42 = dateMidnight39.toDateTime();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime45 = dateTime42.withMillisOfDay(6);
        org.joda.time.DateTime dateTime47 = dateTime45.minusHours(385);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) (byte) 0, (int) (byte) 100);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusWeeks((int) (short) 10);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        java.lang.String str12 = periodType11.getName();
        int int13 = periodType11.size();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(10L, (long) (byte) 100, periodType11, chronology14);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 19, periodType11);
        org.joda.time.DateTime dateTime17 = dateTime6.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime6.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) instant5);
        org.joda.time.Instant instant9 = instant6.withDurationAdded((-1L), 24);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        timeZone0.setRawOffset(19);
        int int7 = timeZone0.getRawOffset();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.util.TimeZone.setDefault(timeZone9);
        int int12 = timeZone9.getOffset(35L);
        timeZone9.setRawOffset(52);
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.Chronology chronology18 = dateTimeFormatter17.getChronology();
        org.joda.time.Chronology chronology19 = dateTimeFormatter17.getChronology();
        boolean boolean20 = dateTimeFormatter17.isOffsetParsed();
        boolean boolean21 = dateTimeFormatter17.isPrinter();
        java.lang.Integer int22 = dateTimeFormatter17.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter17.withZoneUTC();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime27 = localTime25.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfSecond();
        org.joda.time.LocalTime localTime29 = property28.roundCeilingCopy();
        org.joda.time.LocalTime localTime30 = property28.roundCeilingCopy();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod33.setMinutes(11);
        org.joda.time.Period period36 = mutablePeriod33.toPeriod();
        org.joda.time.LocalTime localTime37 = localTime30.minus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.LocalTime.Property property38 = localTime37.minuteOfHour();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(1L, dateTimeZone50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration48, (org.joda.time.ReadableInstant) dateMidnight51, periodType52);
        int int54 = dateMidnight51.getYear();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight51.withDayOfMonth((int) (byte) 10);
        boolean boolean57 = dateMidnight42.isBefore((org.joda.time.ReadableInstant) dateMidnight56);
        org.joda.time.DateMidnight.Property property58 = dateMidnight56.monthOfYear();
        java.util.Locale locale59 = java.util.Locale.JAPAN;
        int int60 = property58.getMaximumShortTextLength(locale59);
        boolean boolean61 = locale59.hasExtensions();
        java.lang.String str62 = locale59.getDisplayName();
        int int63 = property38.getMaximumTextLength(locale59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter23.withLocale(locale59);
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone9, locale59);
        boolean boolean66 = timeZone0.hasSameRules(timeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar65", (calendar4.compareTo(calendar65) == 0) == calendar4.equals(calendar65));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(2000);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.Period period21 = period19.minusSeconds((int) (byte) 0);
        org.joda.time.Period period23 = period21.minusSeconds(100);
        mutableDateTime18.add((org.joda.time.ReadablePeriod) period21, 243565);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime27 = yearMonthDay26.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime28 = yearMonthDay26.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant29 = dateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 1970, dateTimeZone32);
        int int34 = localDate33.getDayOfWeek();
        org.joda.time.LocalDate localDate36 = localDate33.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval37 = localDate33.toInterval();
        boolean boolean38 = interval37.isBeforeNow();
        org.joda.time.Duration duration39 = interval37.toDuration();
        org.joda.time.Instant instant41 = instant29.withDurationAdded((org.joda.time.ReadableDuration) duration39, 2022);
        mutableDateTime18.setTime((org.joda.time.ReadableInstant) instant29);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(253);
        mutableDateTime18.setZone(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11, periodType12);
        mutablePeriod13.addMillis((int) '4');
        int int16 = mutablePeriod13.getYears();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withCenturyOfEra(5);
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.Instant instant24 = instant22.withMillis((long) 492);
        org.joda.time.Instant instant26 = instant22.withMillis((-60620313599999L));
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30, periodType31);
        int int33 = dateMidnight30.getYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime36.copy();
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime36.dayOfMonth();
        mutableDateTime36.setYear((-292275054));
        org.joda.time.DateTimeField dateTimeField42 = mutableDateTime36.getRoundingField();
        mutableDateTime36.addMinutes(53230351);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology47);
        long long49 = interval48.getEndMillis();
        java.lang.String str50 = interval48.toString();
        org.joda.time.MutableInterval mutableInterval51 = interval48.toMutableInterval();
        org.joda.time.Period period52 = interval48.toPeriod();
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType54 = periodType53.withWeeksRemoved();
        org.joda.time.Period period55 = interval48.toPeriod(periodType53);
        org.joda.time.Duration duration56 = interval48.toDuration();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime36, (org.joda.time.ReadableDuration) duration56);
        org.joda.time.Instant instant59 = instant22.withDurationAdded((org.joda.time.ReadableDuration) duration56, 107);
        mutablePeriod13.add((org.joda.time.ReadableDuration) duration56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, dateTimeZone14);
        boolean boolean16 = dateTimeZone14.isFixed();
        mutableDateTime9.setZone(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration18, (org.joda.time.ReadableInstant) dateMidnight21, periodType22);
        int int24 = dateMidnight21.getYear();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime27.copy();
        mutableDateTime27.setMillis((long) (byte) 10);
        mutableDateTime27.add((long) 1970);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Instant instant35 = mutableDateTime27.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        org.joda.time.MutableDateTime mutableDateTime37 = instant35.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.plusDays((int) 'a');
        boolean boolean44 = dateMidnight40.isEqual((-5270399978L));
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis(100);
        boolean boolean49 = dateMidnight40.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateMidnight.Property property50 = dateMidnight40.yearOfEra();
        org.joda.time.DateMidnight dateMidnight52 = property50.addWrapFieldToCopy(19044);
        org.joda.time.DateMidnight dateMidnight53 = property50.roundHalfEvenCopy();
        org.joda.time.DateMidnight dateMidnight54 = property50.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(100L, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = dateTime57.withCenturyOfEra(5);
        org.joda.time.LocalTime localTime60 = dateTime57.toLocalTime();
        org.joda.time.DateTime dateTime61 = dateTime57.toDateTime();
        org.joda.time.Period period62 = org.joda.time.Period.ZERO;
        org.joda.time.Period period64 = period62.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.millis();
        int int66 = period64.get(durationFieldType65);
        org.joda.time.Duration duration67 = period64.toStandardDuration();
        org.joda.time.PeriodType periodType68 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType69 = periodType68.withMillisRemoved();
        java.lang.String str70 = periodType68.toString();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime57, (org.joda.time.ReadableDuration) duration67, periodType68);
        long long72 = duration67.getMillis();
        org.joda.time.Period period74 = org.joda.time.Period.seconds(100);
        org.joda.time.PeriodType periodType75 = period74.getPeriodType();
        org.joda.time.PeriodType periodType76 = periodType75.withDaysRemoved();
        org.joda.time.PeriodType periodType77 = periodType75.withMillisRemoved();
        java.lang.String str78 = periodType77.getName();
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight54, (org.joda.time.ReadableDuration) duration67, periodType77);
        org.joda.time.Instant instant81 = instant35.withDurationAdded((org.joda.time.ReadableDuration) duration67, 2922789);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and instant81", (mutableDateTime27.compareTo(instant81) == 0) == mutableDateTime27.equals(instant81));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 'x', periodType7);
        mutablePeriod8.setDays(21);
        org.joda.time.DateTime dateTime12 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-292275054));
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays(999);
        org.joda.time.DateTime.Property property15 = dateTime14.centuryOfEra();
        org.joda.time.DateTime dateTime17 = property15.setCopy(768);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime5", (dateTime1.compareTo(dateTime5) == 0) == dateTime1.equals(dateTime5));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(1645454882469L);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime6 = localTime4.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalTime localTime9 = property7.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13, periodType14);
        int int16 = dateMidnight12.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight12.getZone();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(dateTimeZone17);
        long long20 = dateTimeZone17.convertUTCToLocal((long) (short) 100);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTimeToday(dateTimeZone17);
        long long24 = dateTimeZone17.convertLocalToUTC(1645454886615L, true);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(0L, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((java.lang.Object) 1645454882469L, dateTimeZone17);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant30 = instant27.withDurationAdded((long) (byte) 0, (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime31 = instant27.toMutableDateTime();
        org.joda.time.DateTime dateTime32 = instant27.toDateTimeISO();
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.hours();
        java.lang.String str37 = periodType36.toString();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(0L, periodType36, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 32769, 0L, periodType36, chronology40);
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.plusHours((int) (short) 0);
        int int46 = timeOfDay45.getSecondOfMinute();
        boolean boolean47 = periodType36.equals((java.lang.Object) int46);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(periodType36);
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight26, (org.joda.time.ReadableInstant) dateTime32, periodType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant27 and mutableDateTime31", (instant27.compareTo(mutableDateTime31) == 0) == instant27.equals(mutableDateTime31));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.minusYears((int) '4');
        org.joda.time.LocalDate localDate14 = localDate7.withYear(52);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime16 = yearMonthDay15.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate17 = dateTime16.toLocalDate();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTime dateTime20 = dateTime16.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Interval interval26 = interval24.withDurationBeforeEnd(readableDuration25);
        org.joda.time.Period period27 = interval24.toPeriod();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration28, (org.joda.time.ReadableInstant) dateMidnight31, periodType32);
        org.joda.time.Hours hours34 = period33.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period37 = period33.withFieldAdded(durationFieldType35, 100);
        org.joda.time.Period period39 = period27.withFieldAdded(durationFieldType35, (int) (byte) 10);
        org.joda.time.DateTime dateTime40 = dateTime16.minus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.LocalDate localDate41 = localDate7.plus((org.joda.time.ReadablePeriod) period39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 1970, dateTimeZone43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = localDate44.isSupported(dateTimeFieldType45);
        org.joda.time.LocalDate localDate48 = localDate44.withWeekyear((-1));
        int int49 = localDate48.getWeekyear();
        org.joda.time.LocalDate localDate51 = localDate48.withDayOfYear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean53 = localDate48.isSupported(dateTimeFieldType52);
        int int54 = localDate41.get(dateTimeFieldType52);
        org.joda.time.LocalDate localDate56 = localDate41.withDayOfYear(12);
        org.joda.time.LocalDate.Property property57 = localDate56.era();
        org.joda.time.DateMidnight dateMidnight58 = localDate56.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime20", (dateTime16.compareTo(dateTime20) == 0) == dateTime16.equals(dateTime20));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        boolean boolean6 = dateMidnight2.isEqual((-5270399978L));
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis(100);
        boolean boolean11 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period12.minusSeconds((int) (byte) 0);
        org.joda.time.Period period16 = period14.minusSeconds((int) '#');
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime20.toLocalDate();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime20);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime25 = yearMonthDay24.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period30 = period28.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.millis();
        int int32 = period30.get(durationFieldType31);
        org.joda.time.Duration duration33 = period30.toStandardDuration();
        org.joda.time.DateTime dateTime34 = dateTime26.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Instant instant35 = instant22.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight17.withDurationAdded((org.joda.time.ReadableDuration) duration33, 0);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight17.withMillis((long) 6);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minus((-11712354870000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfMonth(6);
        int int3 = localDate0.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        org.joda.time.LocalDate localDate8 = dateTime7.toLocalDate();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) dateTime7);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime4.toDateTime(chronology10);
        int int12 = dateTime11.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(100);
        org.joda.time.Period period8 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMonthOfYear(11);
        org.joda.time.Duration duration15 = period8.toDurationFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime4.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        java.lang.String str25 = periodType24.getName();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateMidnight20, periodType24);
        org.joda.time.Instant instant27 = instant0.plus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Instant instant30 = instant29.toInstant();
        org.joda.time.Instant instant32 = instant30.withMillis((long) (-20));
        org.joda.time.DateTime dateTime33 = instant30.toDateTimeISO();
        org.joda.time.Chronology chronology34 = instant30.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and dateTime33", (instant30.compareTo(dateTime33) == 0) == instant30.equals(dateTime33));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        java.lang.String str6 = property3.getAsString();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate9 = dateTime8.toLocalDate();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTime dateTime12 = dateTime8.toDateTime(dateTimeZone11);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = java.util.Locale.FRANCE;
        java.lang.String str16 = locale14.getDisplayName(locale15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        int int23 = dateMidnight20.getYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29, periodType30);
        int int32 = dateMidnight29.getYear();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight29.withDayOfMonth((int) (byte) 10);
        boolean boolean35 = dateMidnight20.isBefore((org.joda.time.ReadableInstant) dateMidnight34);
        org.joda.time.DateMidnight.Property property36 = dateMidnight34.monthOfYear();
        java.util.Locale locale37 = java.util.Locale.JAPAN;
        int int38 = property36.getMaximumShortTextLength(locale37);
        java.lang.String str39 = locale15.getDisplayLanguage(locale37);
        java.util.Locale.setDefault(locale15);
        java.lang.String str41 = dateTimeZone11.getName((-5270399989L), locale15);
        int int42 = property3.getMaximumTextLength(locale15);
        int int43 = property3.get();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime5 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        boolean boolean28 = dateMidnight13.isBefore((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("janvier");
        int int32 = property29.getMaximumTextLength(locale31);
        java.util.Calendar calendar33 = dateTime9.toCalendar(locale31);
        java.lang.String str34 = dateTimeZone2.getShortName(1645454856693L, locale31);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("en");
        java.lang.String str37 = locale31.getDisplayScript(locale36);
        java.lang.String str38 = locale0.getDisplayLanguage(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime9", (dateTime5.compareTo(dateTime9) == 0) == dateTime5.equals(dateTime9));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        boolean boolean18 = localDate6.equals((java.lang.Object) readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusDays((int) 'a');
        int int24 = dateMidnight21.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime25 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight21.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, dateTimeZone28);
        org.joda.time.LocalDate localDate30 = dateTime29.toLocalDate();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((java.lang.Object) dateTime29);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        int int33 = dateMidnight21.compareTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateTime dateTime34 = dateMidnight21.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant31", (dateTime29.compareTo(instant31) == 0) == dateTime29.equals(instant31));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate14 = property8.addToCopy(999);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18, periodType19);
        int int21 = dateMidnight18.getYear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight23.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        org.joda.time.DateTime dateTime33 = dateMidnight29.toDateTime(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = localDate14.toDateMidnight(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime40 = yearMonthDay39.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate41 = dateTime40.toLocalDate();
        java.util.TimeZone timeZone42 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTime dateTime44 = dateTime40.toDateTime(dateTimeZone43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(1L, dateTimeZone47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration45, (org.joda.time.ReadableInstant) dateMidnight48, periodType49);
        int int51 = dateMidnight48.getYear();
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight48.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(1L, dateTimeZone56);
        org.joda.time.PeriodType periodType58 = null;
        org.joda.time.Period period59 = new org.joda.time.Period(readableDuration54, (org.joda.time.ReadableInstant) dateMidnight57, periodType58);
        int int60 = dateMidnight57.getYear();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight57.withDayOfMonth((int) (byte) 10);
        boolean boolean63 = dateMidnight48.isBefore((org.joda.time.ReadableInstant) dateMidnight62);
        org.joda.time.DateMidnight.Property property64 = dateMidnight62.monthOfYear();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("janvier");
        int int67 = property64.getMaximumTextLength(locale66);
        java.util.Calendar calendar68 = dateTime44.toCalendar(locale66);
        java.lang.String str69 = dateTimeZone37.getShortName(1645454856693L, locale66);
        java.lang.String str70 = localDate14.toString("244", locale66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and dateTime44", (dateTime40.compareTo(dateTime44) == 0) == dateTime40.equals(dateTime44));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10, periodType11);
        int int13 = dateMidnight9.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight9.getZone();
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone14);
        long long18 = dateTimeZone3.getMillisKeepLocal(dateTimeZone14, (long) 2004);
        long long20 = dateTimeZone14.convertUTCToLocal((long) '4');
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(32769L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((-2051223600000L), dateTimeZone14);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks(10);
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = localDate25.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime29 = yearMonthDay28.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime30.toMutableDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate25.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime36 = yearMonthDay35.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime37 = yearMonthDay35.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property38 = yearMonthDay35.year();
        java.util.Locale locale39 = java.util.Locale.GERMANY;
        java.lang.String str40 = property38.getAsText(locale39);
        org.joda.time.YearMonthDay yearMonthDay42 = property38.setCopy(2);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay42.minusMonths(570);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(100L, dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property52 = dateTime49.minuteOfDay();
        org.joda.time.DateTime dateTime53 = property52.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime53, readableDuration54);
        org.joda.time.DateTime.Property property56 = dateTime53.dayOfMonth();
        org.joda.time.Period period57 = org.joda.time.Period.ZERO;
        org.joda.time.Period period59 = period57.minusSeconds((int) (byte) 0);
        org.joda.time.Period period61 = period59.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod62 = period59.toMutablePeriod();
        mutablePeriod62.setPeriod((long) 100);
        org.joda.time.DateTime dateTime66 = dateTime53.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod62, 8);
        org.joda.time.YearMonthDay yearMonthDay68 = yearMonthDay44.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod62, 47);
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime70 = yearMonthDay69.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime71 = yearMonthDay69.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property72 = yearMonthDay69.year();
        java.util.Locale locale73 = java.util.Locale.GERMANY;
        java.lang.String str74 = property72.getAsText(locale73);
        org.joda.time.DateTimeField dateTimeField75 = property72.getField();
        boolean boolean76 = dateTimeField75.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = dateTimeField75.getType();
        boolean boolean78 = yearMonthDay44.isSupported(dateTimeFieldType77);
        org.joda.time.DateTime.Property property79 = dateTime34.property(dateTimeFieldType77);
        org.joda.time.DateMidnight dateMidnight81 = dateMidnight22.withField(dateTimeFieldType77, 79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant31", (dateTime30.compareTo(instant31) == 0) == dateTime30.equals(instant31));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeField dateTimeField5 = null;
        mutableDateTime4.setRounding(dateTimeField5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        java.lang.String str7 = dateTimeZone4.getNameKey((long) 72);
        boolean boolean8 = dateTimeZone4.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 37895);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology8);
        long long10 = interval9.getEndMillis();
        java.lang.String str11 = interval9.toString();
        org.joda.time.MutableInterval mutableInterval12 = interval9.toMutableInterval();
        org.joda.time.Period period13 = interval9.toPeriod();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.Period period16 = interval9.toPeriod(periodType14);
        org.joda.time.Duration duration17 = period16.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 1970, dateTimeZone19);
        int int21 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval24 = localDate20.toInterval();
        boolean boolean25 = interval24.isBeforeNow();
        org.joda.time.Duration duration26 = interval24.toDuration();
        boolean boolean27 = duration17.isEqual((org.joda.time.ReadableDuration) duration26);
        org.joda.time.DateTime dateTime28 = dateTime2.plus((org.joda.time.ReadableDuration) duration26);
        long long29 = duration26.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        java.time.Instant instant5 = calendar4.toInstant();
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        org.joda.time.Period period15 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period17 = period15.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusDays((int) 'a');
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.secondOfDay();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((java.lang.Object) calendar4, chronology24);
        calendar4.clear();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(100L, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime37 = dateTime35.plus((long) (-1));
        org.joda.time.DateTime dateTime38 = dateTime35.withTimeAtStartOfDay();
        java.util.Date date39 = dateTime35.toDate();
        org.joda.time.YearMonthDay yearMonthDay40 = org.joda.time.YearMonthDay.fromDateFields(date39);
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay40.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime44 = yearMonthDay43.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate45 = dateTime44.toLocalDate();
        java.util.TimeZone timeZone46 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTime dateTime48 = dateTime44.toDateTime(dateTimeZone47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology51);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Interval interval54 = interval52.withDurationBeforeEnd(readableDuration53);
        org.joda.time.Period period55 = interval52.toPeriod();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(1L, dateTimeZone58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration56, (org.joda.time.ReadableInstant) dateMidnight59, periodType60);
        org.joda.time.Hours hours62 = period61.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType63 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period65 = period61.withFieldAdded(durationFieldType63, 100);
        org.joda.time.Period period67 = period55.withFieldAdded(durationFieldType63, (int) (byte) 10);
        org.joda.time.DateTime dateTime68 = dateTime44.minus((org.joda.time.ReadablePeriod) period67);
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean70 = dateTimeZone69.isFixed();
        org.joda.time.DateTime dateTime71 = dateTime44.toDateTime(dateTimeZone69);
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(dateTimeZone69);
        org.joda.time.DateMidnight dateMidnight73 = yearMonthDay40.toDateMidnight(dateTimeZone69);
        org.joda.time.LocalDate localDate74 = org.joda.time.LocalDate.now(dateTimeZone69);
        java.lang.String str76 = dateTimeZone69.getShortName(4L);
        org.joda.time.DateTime dateTime77 = localDate29.toDateTimeAtStartOfDay(dateTimeZone69);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.DateTimeZone dateTimeZone80 = null;
        org.joda.time.DateMidnight dateMidnight81 = new org.joda.time.DateMidnight(1L, dateTimeZone80);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = new org.joda.time.Period(readableDuration78, (org.joda.time.ReadableInstant) dateMidnight81, periodType82);
        int int84 = dateMidnight81.getYear();
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight81.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime87 = dateMidnight86.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property88 = mutableDateTime87.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime89 = mutableDateTime87.copy();
        mutableDateTime87.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property92 = mutableDateTime87.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration93 = null;
        mutableDateTime87.add(readableDuration93);
        boolean boolean95 = dateTimeZone69.equals((java.lang.Object) mutableDateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight25 and dateTime48", (dateMidnight25.compareTo(dateTime48) == 0) == dateMidnight25.equals(dateTime48));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.util.Date date3 = new java.util.Date(2024, 367, 12960);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromDateFields(date3);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(21);
        org.joda.time.format.DateTimeParser dateTimeParser10 = dateTimeFormatter7.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear(600100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 30);
        int int15 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter12.withChronology(chronology16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.DateTime dateTime28 = property25.addWrapFieldToCopy(11);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfCentury(0);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) 3, chronology34);
        java.util.TimeZone timeZone36 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.time.ZoneId zoneId38 = timeZone36.toZoneId();
        java.time.ZoneId zoneId39 = timeZone36.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTime dateTime41 = localTime35.toDateTimeToday(dateTimeZone40);
        org.joda.time.DateTime dateTime42 = dateTime32.withZone(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter17.withZone(dateTimeZone40);
        boolean boolean44 = date3.equals((java.lang.Object) dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime42", (dateTime32.compareTo(dateTime42) == 0) == dateTime32.equals(dateTime42));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTime dateTime10 = property7.addWrapFieldToCopy(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfCentury((int) '#');
        org.joda.time.DateTime dateTime14 = dateTime12.withMillisOfSecond(49);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Interval interval19 = new org.joda.time.Interval(10L, 10L, dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) 30, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime12.toDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra(5);
        org.joda.time.LocalTime localTime27 = dateTime24.toLocalTime();
        org.joda.time.DateTime dateTime28 = dateTime24.toDateTime();
        org.joda.time.Period period29 = org.joda.time.Period.ZERO;
        org.joda.time.Period period31 = period29.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.millis();
        int int33 = period31.get(durationFieldType32);
        org.joda.time.Duration duration34 = period31.toStandardDuration();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType36 = periodType35.withMillisRemoved();
        java.lang.String str37 = periodType35.toString();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime24, (org.joda.time.ReadableDuration) duration34, periodType35);
        org.joda.time.DateTime dateTime39 = dateTime21.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateTime.Property property40 = dateTime21.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime21", (dateTime12.compareTo(dateTime21) == 0) == dateTime12.equals(dateTime21));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTime dateTime6 = instant4.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 569);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) mutableDateTime8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate7.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval11 = localDate7.toInterval();
        boolean boolean12 = interval11.isBeforeNow();
        org.joda.time.Duration duration13 = interval11.toDuration();
        org.joda.time.Instant instant15 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration13, 2022);
        org.joda.time.Instant instant16 = instant3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = instant3.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Instant instant8 = instant5.plus((long) 200);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.plusDays((int) 'a');
        long long14 = dateMidnight13.getMillis();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withCenturyOfEra(4);
        org.joda.time.Period period25 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period27 = period25.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plusDays((int) 'a');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.DateTimeField dateTimeField37 = chronology34.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight47, readableDuration48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight38.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod49, 2);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime58 = dateTime56.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property59 = dateTime56.minuteOfDay();
        org.joda.time.DateTime dateTime60 = property59.roundCeilingCopy();
        org.joda.time.DateTime dateTime62 = dateTime60.minusDays(35);
        org.joda.time.Duration duration63 = mutablePeriod49.toDurationTo((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.Duration duration64 = duration63.toDuration();
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType66 = periodType65.withWeeksRemoved();
        java.lang.String str67 = periodType66.getName();
        org.joda.time.PeriodType periodType68 = periodType66.withDaysRemoved();
        int int69 = periodType66.size();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration63, periodType66);
        org.joda.time.Instant instant71 = instant8.plus((org.joda.time.ReadableDuration) duration63);
        org.joda.time.YearMonthDay yearMonthDay72 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime73 = yearMonthDay72.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime74 = yearMonthDay72.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property75 = yearMonthDay72.year();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(100L, dateTimeZone77);
        org.joda.time.DateTime dateTime80 = dateTime78.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime82 = dateTime80.plus((long) (-1));
        org.joda.time.DateTime dateTime83 = dateTime80.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration84 = null;
        org.joda.time.DateTime dateTime86 = dateTime80.withDurationAdded(readableDuration84, 1970);
        int int87 = property75.compareTo((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.DateTime dateTime88 = dateTime80.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property89 = dateTime88.weekOfWeekyear();
        org.joda.time.DateTime dateTime90 = dateTime88.toDateTime();
        org.joda.time.DateTime dateTime92 = dateTime88.minusWeeks(24);
        boolean boolean93 = duration63.equals((java.lang.Object) dateTime88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant8 = instant3.withDurationAdded((long) 39, 887);
        org.joda.time.Instant instant10 = instant8.withMillis(1555200999L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        boolean boolean18 = localDate6.equals((java.lang.Object) readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.plusDays((int) 'a');
        int int24 = dateMidnight21.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime25 = localDate6.toDateTime((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.YearMonthDay yearMonthDay26 = dateMidnight21.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, dateTimeZone28);
        org.joda.time.LocalDate localDate30 = dateTime29.toLocalDate();
        org.joda.time.Instant instant31 = new org.joda.time.Instant((java.lang.Object) dateTime29);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        int int33 = dateMidnight21.compareTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateMidnight.Property property34 = dateMidnight21.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant31", (dateTime29.compareTo(instant31) == 0) == dateTime29.equals(instant31));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology13);
        long long15 = interval14.getEndMillis();
        java.lang.String str16 = interval14.toString();
        org.joda.time.MutableInterval mutableInterval17 = interval14.toMutableInterval();
        org.joda.time.Period period18 = interval14.toPeriod();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Period period21 = interval14.toPeriod(periodType19);
        org.joda.time.Duration duration22 = period21.toStandardDuration();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 1970, dateTimeZone24);
        int int26 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate localDate28 = localDate25.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval29 = localDate25.toInterval();
        boolean boolean30 = interval29.isBeforeNow();
        org.joda.time.Duration duration31 = interval29.toDuration();
        boolean boolean32 = duration22.isEqual((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Instant instant34 = instant7.withDurationAdded((org.joda.time.ReadableDuration) duration31, 32);
        org.joda.time.Instant instant36 = instant7.withMillis(105L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        mutableDateTime9.add((long) '4');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, dateTimeZone14);
        boolean boolean16 = dateTimeZone14.isFixed();
        mutableDateTime9.setZone(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period(readableDuration18, (org.joda.time.ReadableInstant) dateMidnight21, periodType22);
        int int24 = dateMidnight21.getYear();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight21.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateMidnight26.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime27.copy();
        mutableDateTime27.setMillis((long) (byte) 10);
        mutableDateTime27.add((long) 1970);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) mutableDateTime27);
        org.joda.time.Instant instant35 = mutableDateTime27.toInstant();
        org.joda.time.Instant instant36 = instant35.toInstant();
        org.joda.time.Instant instant39 = instant35.withDurationAdded(35249904000000L, 492);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime27 and instant35", (mutableDateTime27.compareTo(instant35) == 0) == mutableDateTime27.equals(instant35));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod15.setMinutes(11);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 1970, dateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate25 = localDate21.withWeekyear((-1));
        org.joda.time.LocalDate.Property property26 = localDate21.dayOfWeek();
        java.lang.Character[] charArray29 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet30 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet30, charArray29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(100L, dateTimeZone33);
        boolean boolean35 = dateTimeZone33.isFixed();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone33);
        boolean boolean37 = charSet30.contains((java.lang.Object) dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight39 = localDate21.toDateMidnight(dateTimeZone33);
        boolean boolean40 = interval18.isAfter((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1970, dateTimeZone42);
        int int44 = localDate43.getDayOfWeek();
        org.joda.time.LocalDate localDate46 = localDate43.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval47 = localDate43.toInterval();
        boolean boolean48 = interval18.isBefore((org.joda.time.ReadableInterval) interval47);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime50 = yearMonthDay49.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime51 = yearMonthDay49.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant52 = dateTime51.toInstant();
        org.joda.time.MutableDateTime mutableDateTime53 = instant52.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1970, dateTimeZone55);
        int int57 = localDate56.getDayOfWeek();
        org.joda.time.LocalDate localDate59 = localDate56.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval60 = localDate56.toInterval();
        boolean boolean61 = interval60.isBeforeNow();
        org.joda.time.Duration duration62 = interval60.toDuration();
        org.joda.time.Instant instant64 = instant52.withDurationAdded((org.joda.time.ReadableDuration) duration62, 2022);
        org.joda.time.MutableDateTime mutableDateTime65 = instant64.toMutableDateTime();
        boolean boolean66 = interval47.contains((org.joda.time.ReadableInstant) mutableDateTime65);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime65.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant52", (mutableDateTime36.compareTo(instant52) == 0) == mutableDateTime36.equals(instant52));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate14 = dateTime13.toLocalDate();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Interval interval23 = interval21.withDurationBeforeEnd(readableDuration22);
        org.joda.time.Period period24 = interval21.toPeriod();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration25, (org.joda.time.ReadableInstant) dateMidnight28, periodType29);
        org.joda.time.Hours hours31 = period30.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period34 = period30.withFieldAdded(durationFieldType32, 100);
        org.joda.time.Period period36 = period24.withFieldAdded(durationFieldType32, (int) (byte) 10);
        org.joda.time.DateTime dateTime37 = dateTime13.minus((org.joda.time.ReadablePeriod) period36);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean39 = dateTimeZone38.isFixed();
        org.joda.time.DateTime dateTime40 = dateTime13.toDateTime(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight42 = yearMonthDay9.toDateMidnight(dateTimeZone38);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(dateTimeZone38);
        java.lang.String str45 = dateTimeZone38.getShortName(4L);
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.now(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime17", (dateTime13.compareTo(dateTime17) == 0) == dateTime13.equals(dateTime17));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval6 = interval3.toMutableInterval();
        org.joda.time.Period period7 = interval3.toPeriod();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        org.joda.time.Period period10 = interval3.toPeriod(periodType8);
        org.joda.time.Duration duration11 = interval3.toDuration();
        org.joda.time.Interval interval13 = interval3.withEndMillis(0L);
        org.joda.time.Interval interval15 = interval3.withEndMillis(0L);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.minusWeeks(10);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = localDate18.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime23 = yearMonthDay21.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant24 = dateTime23.toInstant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime23.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate18.toDateTimeAtStartOfDay(dateTimeZone25);
        boolean boolean28 = interval3.contains((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant24", (dateTime23.compareTo(instant24) == 0) == dateTime23.equals(instant24));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(100);
        org.joda.time.Period period8 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = dateTime11.toLocalDateTime();
        org.joda.time.DateTime dateTime14 = dateTime11.withMonthOfYear(11);
        org.joda.time.Duration duration15 = period8.toDurationFrom((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime4.minus((org.joda.time.ReadableDuration) duration15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        java.lang.String str25 = periodType24.getName();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration15, (org.joda.time.ReadableInstant) dateMidnight20, periodType24);
        org.joda.time.Instant instant27 = instant0.plus((org.joda.time.ReadableDuration) duration15);
        long long28 = instant27.getMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusDays((int) 'a');
        boolean boolean35 = dateMidnight31.isEqual((-5270399978L));
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMillis(100);
        boolean boolean40 = dateMidnight31.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateMidnight.Property property41 = dateMidnight31.yearOfEra();
        org.joda.time.DateMidnight dateMidnight43 = property41.addWrapFieldToCopy(19044);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean46 = dateTimeZone45.isFixed();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.plusMillis(100);
        org.joda.time.Period period51 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(100L, dateTimeZone53);
        org.joda.time.LocalDateTime localDateTime55 = dateTime54.toLocalDateTime();
        org.joda.time.DateTime dateTime57 = dateTime54.withMonthOfYear(11);
        org.joda.time.Duration duration58 = period51.toDurationFrom((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime47.minus((org.joda.time.ReadableDuration) duration58);
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(1L, dateTimeZone62);
        org.joda.time.PeriodType periodType64 = null;
        org.joda.time.Period period65 = new org.joda.time.Period(readableDuration60, (org.joda.time.ReadableInstant) dateMidnight63, periodType64);
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType67 = periodType66.withWeeksRemoved();
        java.lang.String str68 = periodType67.getName();
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration58, (org.joda.time.ReadableInstant) dateMidnight63, periodType67);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean72 = dateTimeZone71.isFixed();
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone71);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.plusMillis(100);
        org.joda.time.Period period77 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime80 = new org.joda.time.DateTime(100L, dateTimeZone79);
        org.joda.time.LocalDateTime localDateTime81 = dateTime80.toLocalDateTime();
        org.joda.time.DateTime dateTime83 = dateTime80.withMonthOfYear(11);
        org.joda.time.Duration duration84 = period77.toDurationFrom((org.joda.time.ReadableInstant) dateTime83);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime73.minus((org.joda.time.ReadableDuration) duration84);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime73.withYearOfCentury((int) '4');
        org.joda.time.LocalDateTime.Property property88 = localDateTime87.yearOfCentury();
        boolean boolean89 = duration58.equals((java.lang.Object) localDateTime87);
        long long90 = duration58.getMillis();
        org.joda.time.DateMidnight dateMidnight92 = dateMidnight43.withDurationAdded((org.joda.time.ReadableDuration) duration58, 202);
        org.joda.time.Interval interval93 = new org.joda.time.Interval((org.joda.time.ReadableInstant) instant27, (org.joda.time.ReadableDuration) duration58);
        boolean boolean95 = interval93.isBefore(59940014L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime37", (instant0.compareTo(dateTime37) == 0) == instant0.equals(dateTime37));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.setMillis((long) (byte) 0);
        boolean boolean12 = mutableDateTime9.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, dateTimeZone15);
        boolean boolean17 = dateTimeZone15.isFixed();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone15);
        boolean boolean19 = dateTimeZone15.isFixed();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(100L, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime26 = dateTime24.plus((long) (-1));
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        java.util.Date date28 = dateTime24.toDate();
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromDateFields(date28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime33 = yearMonthDay32.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate34 = dateTime33.toLocalDate();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime37 = dateTime33.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Interval interval43 = interval41.withDurationBeforeEnd(readableDuration42);
        org.joda.time.Period period44 = interval41.toPeriod();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(1L, dateTimeZone47);
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(readableDuration45, (org.joda.time.ReadableInstant) dateMidnight48, periodType49);
        org.joda.time.Hours hours51 = period50.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period54 = period50.withFieldAdded(durationFieldType52, 100);
        org.joda.time.Period period56 = period44.withFieldAdded(durationFieldType52, (int) (byte) 10);
        org.joda.time.DateTime dateTime57 = dateTime33.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean59 = dateTimeZone58.isFixed();
        org.joda.time.DateTime dateTime60 = dateTime33.toDateTime(dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(dateTimeZone58);
        org.joda.time.DateMidnight dateMidnight62 = yearMonthDay29.toDateMidnight(dateTimeZone58);
        long long64 = dateTimeZone15.getMillisKeepLocal(dateTimeZone58, (long) 1918);
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate((long) 48, dateTimeZone15);
        mutableDateTime9.setZone(dateTimeZone15);
        int int67 = mutableDateTime9.getWeekOfWeekyear();
        long long68 = mutableDateTime9.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and dateTime37", (dateTime33.compareTo(dateTime37) == 0) == dateTime33.equals(dateTime37));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.setTimeInMillis((long) 4);
        java.util.Date date7 = new java.util.Date();
        calendar4.setTime(date7);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        int int14 = dateTimeZone12.getStandardOffset((long) 5);
        java.lang.String str16 = dateTimeZone12.getShortName(100L);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str20 = dateTimeZone12.getName((long) (short) 0, locale19);
        java.lang.String str21 = calendar4.getDisplayName(15, 3, locale19);
        java.util.TimeZone timeZone22 = calendar4.getTimeZone();
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone22, locale23);
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.FRANCE;
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        java.lang.String str29 = locale27.getDisplayName(locale28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period(readableDuration30, (org.joda.time.ReadableInstant) dateMidnight33, periodType34);
        int int36 = dateMidnight33.getYear();
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight33.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        boolean boolean48 = dateMidnight33.isBefore((org.joda.time.ReadableInstant) dateMidnight47);
        org.joda.time.DateMidnight.Property property49 = dateMidnight47.monthOfYear();
        java.util.Locale locale50 = java.util.Locale.JAPAN;
        int int51 = property49.getMaximumShortTextLength(locale50);
        java.lang.String str52 = locale28.getDisplayLanguage(locale50);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder56 = builder53.setExtension('a', "3940");
        java.util.Locale locale57 = builder53.build();
        java.lang.String str58 = locale28.getDisplayCountry(locale57);
        java.lang.String str59 = locale26.getDisplayScript(locale28);
        java.util.Locale locale60 = locale26.stripExtensions();
        java.lang.String str61 = locale26.getLanguage();
        java.lang.String str62 = locale23.getDisplayScript(locale26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar25", (calendar4.compareTo(calendar25) == 0) == calendar4.equals(calendar25));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfCentury();
        mutableDateTime15.addWeeks(21);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime20 = property19.getMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1970, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1970, dateTimeZone28);
        int int30 = localDate29.getDayOfWeek();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate24, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(readableDuration32, (org.joda.time.ReadableInstant) dateMidnight35, periodType36);
        int int38 = dateMidnight35.getYear();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight35.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(1L, dateTimeZone43);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period(readableDuration41, (org.joda.time.ReadableInstant) dateMidnight44, periodType45);
        int int47 = dateMidnight44.getYear();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight44.withDayOfMonth((int) (byte) 10);
        boolean boolean50 = dateMidnight35.isBefore((org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.DateMidnight.Property property51 = dateMidnight49.monthOfYear();
        org.joda.time.DateMidnight dateMidnight52 = property51.roundFloorCopy();
        boolean boolean53 = localDate29.equals((java.lang.Object) dateMidnight52);
        mutableDateTime20.setMillis((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.Period period56 = org.joda.time.Period.hours((int) ' ');
        org.joda.time.Interval interval57 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadablePeriod) period56);
        org.joda.time.Interval interval59 = interval57.withStartMillis((long) 70);
        boolean boolean60 = interval59.isAfterNow();
        org.joda.time.YearMonthDay yearMonthDay61 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime62 = yearMonthDay61.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate63 = dateTime62.toLocalDate();
        java.util.TimeZone timeZone64 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.DateTime dateTime66 = dateTime62.toDateTime(dateTimeZone65);
        org.joda.time.PeriodType periodType68 = null;
        org.joda.time.MutablePeriod mutablePeriod69 = new org.joda.time.MutablePeriod((long) 'x', periodType68);
        mutablePeriod69.setDays(21);
        org.joda.time.DateTime dateTime73 = dateTime66.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod69, (-292275054));
        boolean boolean74 = interval59.contains((org.joda.time.ReadableInstant) dateTime73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and dateTime66", (dateTime62.compareTo(dateTime66) == 0) == dateTime62.equals(dateTime66));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.MonthDay monthDay3 = org.joda.time.MonthDay.now(dateTimeZone1);
        java.util.TimeZone timeZone4 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone4);
        java.util.Locale locale8 = new java.util.Locale("GMT+00:00", "de");
        java.lang.String str9 = locale8.getDisplayVariant();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone4, locale8);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14, periodType15);
        int int17 = dateMidnight14.getYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime20 = dateMidnight19.toMutableDateTime();
        mutableDateTime20.setMillis((long) (byte) 0);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime20.millisOfSecond();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.TimeZone timeZone26 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.time.ZoneId zoneId28 = timeZone26.toZoneId();
        java.time.ZoneId zoneId29 = timeZone26.toZoneId();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone(zoneId29);
        java.util.Locale locale31 = java.util.Locale.US;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone30, locale31);
        java.lang.String str34 = locale25.getDisplayScript(locale31);
        org.joda.time.MutableDateTime mutableDateTime35 = property23.set("0", locale31);
        java.util.Locale locale36 = locale31.stripExtensions();
        java.util.Locale locale37 = locale31.stripExtensions();
        java.lang.String str38 = timeZone4.getDisplayName(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar10", (calendar5.compareTo(calendar10) == 0) == calendar5.equals(calendar10));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds((-101));
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1970, dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1970, dateTimeZone13);
        int int15 = localDate14.getDayOfWeek();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((java.lang.Object) localDate14);
        org.joda.time.LocalDate localDate19 = localDate14.minusYears((int) '4');
        org.joda.time.LocalDate localDate21 = localDate14.plusYears((int) '#');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1970, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        boolean boolean26 = localDate24.isSupported(dateTimeFieldType25);
        org.joda.time.LocalDate localDate28 = localDate24.withWeekyear((-1));
        int int29 = localDate28.getWeekyear();
        org.joda.time.LocalDate localDate31 = localDate28.withDayOfYear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean33 = localDate28.isSupported(dateTimeFieldType32);
        org.joda.time.LocalDate localDate34 = localDate14.withFields((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight43.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime44.copy();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(1L, dateTimeZone49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration47, (org.joda.time.ReadableInstant) dateMidnight50, periodType51);
        int int53 = dateMidnight50.getYear();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight50.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight55.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        org.joda.time.DateTime dateTime59 = mutableDateTime56.toDateTime(dateTimeZone57);
        long long61 = dateTimeZone57.convertUTCToLocal((long) 14);
        mutableDateTime46.setZoneRetainFields(dateTimeZone57);
        org.joda.time.Interval interval63 = localDate34.toInterval(dateTimeZone57);
        long long65 = dateTimeZone57.convertUTCToLocal(2629746000L);
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) 1918, dateTimeZone57);
        org.joda.time.DateTime dateTime67 = dateTime5.withZoneRetainFields(dateTimeZone57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration1, (org.joda.time.ReadableInstant) dateMidnight4, periodType5);
        int int7 = dateMidnight4.getYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        boolean boolean19 = dateMidnight4.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.monthOfYear();
        org.joda.time.DateMidnight dateMidnight21 = property20.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight23 = property20.setCopy((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight24 = property20.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property20.getFieldType();
        org.joda.time.DateMidnight dateMidnight27 = property20.addToCopy(2765);
        int int28 = dateMidnight27.getYear();
        int int29 = dateMidnight27.getEra();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime36 = dateTime34.plus((long) (-1));
        org.joda.time.DateTime dateTime37 = dateTime34.withTimeAtStartOfDay();
        java.util.Date date38 = dateTime34.toDate();
        org.joda.time.YearMonthDay yearMonthDay39 = org.joda.time.YearMonthDay.fromDateFields(date38);
        org.joda.time.YearMonthDay yearMonthDay41 = yearMonthDay39.withDayOfMonth(5);
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime43 = yearMonthDay42.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate44 = dateTime43.toLocalDate();
        java.util.TimeZone timeZone45 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateTime dateTime47 = dateTime43.toDateTime(dateTimeZone46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Interval interval51 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology50);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Interval interval53 = interval51.withDurationBeforeEnd(readableDuration52);
        org.joda.time.Period period54 = interval51.toPeriod();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableDuration55, (org.joda.time.ReadableInstant) dateMidnight58, periodType59);
        org.joda.time.Hours hours61 = period60.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period64 = period60.withFieldAdded(durationFieldType62, 100);
        org.joda.time.Period period66 = period54.withFieldAdded(durationFieldType62, (int) (byte) 10);
        org.joda.time.DateTime dateTime67 = dateTime43.minus((org.joda.time.ReadablePeriod) period66);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean69 = dateTimeZone68.isFixed();
        org.joda.time.DateTime dateTime70 = dateTime43.toDateTime(dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight(dateTimeZone68);
        org.joda.time.DateMidnight dateMidnight72 = yearMonthDay39.toDateMidnight(dateTimeZone68);
        org.joda.time.LocalDate localDate73 = org.joda.time.LocalDate.now(dateTimeZone68);
        java.lang.String str75 = dateTimeZone68.getShortName(4L);
        org.joda.time.MutableDateTime mutableDateTime76 = dateMidnight27.toMutableDateTime(dateTimeZone68);
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) 1059594, dateTimeZone68);
        org.joda.time.MutableDateTime mutableDateTime78 = new org.joda.time.MutableDateTime(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime47", (dateTime43.compareTo(dateTime47) == 0) == dateTime43.equals(dateTime47));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        boolean boolean7 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        boolean boolean8 = charSet3.isEmpty();
        java.util.Spliterator<java.lang.Character> charSpliterator9 = charSet3.spliterator();
        charSet3.clear();
        java.util.Iterator<java.lang.Character> charItor11 = charSet3.iterator();
        org.joda.time.Period period20 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period22 = period20.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.plusDays((int) 'a');
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period20, (org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateMidnight dateMidnight30 = org.joda.time.DateMidnight.now(chronology29);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(8, (int) (short) 1, (int) (byte) 1);
        long long36 = chronology29.set((org.joda.time.ReadablePartial) localTime34, 10L);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(chronology29);
        org.joda.time.DateTime dateTime38 = localTime37.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay40.getFieldTypes();
        int int42 = timeOfDay40.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration43, (org.joda.time.ReadableInstant) dateMidnight46, periodType47);
        int int49 = dateMidnight46.getYear();
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight46.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime52 = dateMidnight51.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime52.copy();
        mutableDateTime52.setMillis((long) (byte) 10);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime60 = localTime58.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.millis();
        boolean boolean62 = localTime58.isSupported(durationFieldType61);
        mutableDateTime52.add(durationFieldType61, (-1));
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        mutableDateTime52.setZoneRetainFields(dateTimeZone66);
        long long69 = dateTimeZone66.nextTransition((long) 1970);
        org.joda.time.DateTime dateTime70 = timeOfDay40.toDateTimeToday(dateTimeZone66);
        org.joda.time.DateTime dateTime71 = dateTime38.withZone(dateTimeZone66);
        int int72 = dateTime71.getMillisOfSecond();
        org.joda.time.DateTime.Property property73 = dateTime71.yearOfEra();
        boolean boolean74 = charSet3.remove((java.lang.Object) property73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and dateTime71", (dateTime38.compareTo(dateTime71) == 0) == dateTime38.equals(dateTime71));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withDaysRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14, periodType15);
        int int17 = dateMidnight14.getYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period(readableDuration20, (org.joda.time.ReadableInstant) dateMidnight23, periodType24);
        int int26 = dateMidnight23.getYear();
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight23.withDayOfMonth((int) (byte) 10);
        boolean boolean29 = dateMidnight14.isBefore((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateMidnight.Property property30 = dateMidnight28.monthOfYear();
        java.util.Locale locale31 = java.util.Locale.JAPAN;
        int int32 = property30.getMaximumShortTextLength(locale31);
        org.joda.time.DurationField durationField33 = property30.getDurationField();
        long long35 = durationField33.getValueAsLong((long) ' ');
        long long38 = durationField33.subtract((long) (short) 1, 5);
        int int41 = durationField33.getValue((long) 10, (long) 100);
        org.joda.time.DurationFieldType durationFieldType42 = durationField33.getType();
        java.lang.String str43 = durationFieldType42.toString();
        int int44 = period10.get(durationFieldType42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime18 = property16.addWrapField(2000);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.Period period21 = period19.minusSeconds((int) (byte) 0);
        org.joda.time.Period period23 = period21.minusSeconds(100);
        mutableDateTime18.add((org.joda.time.ReadablePeriod) period21, 243565);
        mutableDateTime18.setMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1970, dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 1970, dateTimeZone34);
        int int36 = localDate35.getDayOfWeek();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate30, (org.joda.time.ReadablePartial) localDate35);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay((java.lang.Object) localDate35);
        int int39 = localDate35.getEra();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(100L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMillis((int) (short) 0);
        org.joda.time.Period period47 = org.joda.time.Period.ZERO;
        org.joda.time.Period period49 = period47.minusSeconds((int) (byte) 0);
        org.joda.time.Period period51 = period49.minusSeconds(100);
        org.joda.time.DateTime dateTime53 = dateTime44.withPeriodAdded((org.joda.time.ReadablePeriod) period49, 20);
        org.joda.time.DateTime dateTime55 = dateTime44.withMillisOfSecond((int) '4');
        int int56 = dateTime55.getYear();
        org.joda.time.DateTime dateTime58 = dateTime55.withYearOfEra(883);
        org.joda.time.DateTime dateTime59 = dateTime55.withLaterOffsetAtOverlap();
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime61 = yearMonthDay60.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime62 = yearMonthDay60.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant63 = dateTime62.toInstant();
        org.joda.time.LocalDate localDate64 = dateTime62.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDate localDate67 = new org.joda.time.LocalDate((long) 1970, dateTimeZone66);
        int int68 = localDate67.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean70 = localDate67.isSupported(dateTimeFieldType69);
        int int71 = dateTime62.get(dateTimeFieldType69);
        int int72 = dateTime59.get(dateTimeFieldType69);
        org.joda.time.DurationFieldType durationFieldType73 = dateTimeFieldType69.getDurationType();
        org.joda.time.LocalDate localDate75 = localDate35.withFieldAdded(durationFieldType73, 2170);
        mutableDateTime18.add(durationFieldType73, 570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime62 and instant63", (dateTime62.compareTo(instant63) == 0) == dateTime62.equals(instant63));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.lang.Character[] charArray2 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet3 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet3, charArray2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        boolean boolean8 = dateTimeZone6.isFixed();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        boolean boolean10 = charSet3.contains((java.lang.Object) dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, dateTimeZone12);
        org.joda.time.LocalDate localDate14 = dateTime13.toLocalDate();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((java.lang.Object) dateTime13);
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 1970, dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDate19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1970, dateTimeZone23);
        int int25 = localDate24.getDayOfWeek();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate24);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30, periodType31);
        int int33 = dateMidnight30.getYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39, periodType40);
        int int42 = dateMidnight39.getYear();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight39.withDayOfMonth((int) (byte) 10);
        boolean boolean45 = dateMidnight30.isBefore((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight44.monthOfYear();
        org.joda.time.DateMidnight dateMidnight47 = property46.roundFloorCopy();
        boolean boolean48 = localDate24.equals((java.lang.Object) dateMidnight47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight47.withCenturyOfEra((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.withDayOfYear(32);
        org.joda.time.DateTime dateTime53 = dateMidnight50.toDateTime();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime16, (org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime55 = dateTime53.toDateTime();
        boolean boolean56 = charSet3.remove((java.lang.Object) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant15", (dateTime7.compareTo(instant15) == 0) == dateTime7.equals(instant15));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        boolean boolean6 = dateMidnight2.isEqual((-5270399978L));
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis(100);
        boolean boolean11 = dateMidnight2.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period12.minusSeconds((int) (byte) 0);
        org.joda.time.Period period16 = period14.minusSeconds((int) '#');
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight2.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, dateTimeZone19);
        org.joda.time.LocalDate localDate21 = dateTime20.toLocalDate();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime20);
        org.joda.time.Chronology chronology23 = instant22.getChronology();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime25 = yearMonthDay24.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime26 = yearMonthDay24.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfDay();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.Period period30 = period28.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.millis();
        int int32 = period30.get(durationFieldType31);
        org.joda.time.Duration duration33 = period30.toStandardDuration();
        org.joda.time.DateTime dateTime34 = dateTime26.minus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Instant instant35 = instant22.plus((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight17.withDurationAdded((org.joda.time.ReadableDuration) duration33, 0);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight17.withMillis((long) 6);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 600100, 777600341L);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight17.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod42, 342);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant22", (dateTime20.compareTo(instant22) == 0) == dateTime20.equals(instant22));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        java.lang.String str19 = dateMidnight17.toString();
        org.joda.time.Instant instant20 = dateMidnight17.toInstant();
        org.joda.time.Interval interval21 = dateMidnight17.toInterval();
        org.joda.time.Chronology chronology22 = dateMidnight17.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant20", (dateMidnight8.compareTo(instant20) == 0) == dateMidnight8.equals(instant20));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        mutableDateTime9.setWeekyear(1);
        boolean boolean17 = mutableDateTime9.isEqual((long) 3);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime9.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime20 = yearMonthDay19.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime21 = yearMonthDay19.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        org.joda.time.LocalDate localDate23 = dateTime21.toLocalDate();
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTimeISO();
        org.joda.time.Instant instant26 = new org.joda.time.Instant(43201918L);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType28 = periodType27.withDaysRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime21, (org.joda.time.ReadableInstant) instant26, periodType27);
        int int30 = property18.compareTo((org.joda.time.ReadableInstant) instant26);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration34, (org.joda.time.ReadableInstant) dateMidnight37, periodType38);
        int int40 = dateMidnight37.getYear();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight37.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight42, readableDuration43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight42, readableDuration45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight42.withDayOfWeek(4);
        org.joda.time.YearMonthDay yearMonthDay49 = dateMidnight48.toYearMonthDay();
        int int50 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateMidnight48);
        int int51 = dateMidnight48.getSecondOfDay();
        boolean boolean52 = instant26.isBefore((org.joda.time.ReadableInstant) dateMidnight48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime7.minusWeeks(6);
        java.util.Date date13 = dateTime12.toDate();
        org.joda.time.DateTime.Property property14 = dateTime12.weekOfWeekyear();
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property16 = monthDay15.dayOfMonth();
        java.lang.String str17 = property16.getName();
        org.joda.time.MonthDay monthDay19 = property16.addWrapFieldToCopy(49);
        org.joda.time.DateTime dateTime20 = dateTime12.withFields((org.joda.time.ReadablePartial) monthDay19);
        org.joda.time.Instant instant21 = new org.joda.time.Instant((java.lang.Object) dateTime12);
        org.joda.time.DateTime.Property property22 = dateTime12.millisOfDay();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 600100, (long) 33198, periodType27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(43201918L, (long) 36, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period(readableInstant2, (org.joda.time.ReadableInstant) dateTime12, periodType27);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight33, readableDuration34, periodType35);
        int int37 = dateMidnight33.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = dateMidnight33.getZone();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight33.withEra(0);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(100L, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime48 = dateTime46.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property49 = dateTime46.minuteOfDay();
        java.lang.String str50 = property49.getAsString();
        org.joda.time.DateTime dateTime51 = property49.roundFloorCopy();
        org.joda.time.DateTime dateTime53 = property49.setCopy(710);
        org.joda.time.DateTime dateTime55 = property49.addWrapFieldToCopy(2022);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(1L, dateTimeZone58);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.Period period61 = new org.joda.time.Period(readableDuration56, (org.joda.time.ReadableInstant) dateMidnight59, periodType60);
        int int62 = dateMidnight59.getYear();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight59.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight64, readableDuration65);
        mutablePeriod66.addSeconds(5);
        mutablePeriod66.setPeriod((long) 70);
        org.joda.time.DateTime dateTime72 = dateTime55.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod66, 21);
        java.util.Date date73 = dateTime72.toDate();
        org.joda.time.Chronology chronology74 = dateTime72.getChronology();
        org.joda.time.TimeOfDay timeOfDay75 = new org.joda.time.TimeOfDay((long) (-1), chronology74);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight40.withChronology(chronology74);
        org.joda.time.DateMidnight dateMidnight77 = org.joda.time.DateMidnight.now(chronology74);
        org.joda.time.DateTimeField dateTimeField78 = chronology74.halfdayOfDay();
        org.joda.time.DurationField durationField79 = chronology74.halfdays();
        org.joda.time.Period period80 = new org.joda.time.Period(36000492L, (long) 54932515, periodType27, chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant21", (dateTime12.compareTo(instant21) == 0) == dateTime12.equals(instant21));
    }
}

