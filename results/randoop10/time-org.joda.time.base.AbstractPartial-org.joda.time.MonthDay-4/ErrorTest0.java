import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateMidnight dateMidnight5 = localDate4.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant7 = instant5.plus((long) 100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        int[] intArray5 = localDate4.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        long long5 = dateMidnight4.getMillis();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) (-1));
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusYears(6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime11 = yearMonthDay10.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime12 = yearMonthDay10.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.LocalDate localDate14 = dateTime12.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 1970, dateTimeZone16);
        int int18 = localDate17.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean20 = localDate17.isSupported(dateTimeFieldType19);
        int int21 = dateTime12.get(dateTimeFieldType19);
        int int22 = dateMidnight7.get(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration23, (org.joda.time.ReadableInstant) dateMidnight26, periodType27);
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType30 = periodType29.withWeeksRemoved();
        java.lang.String str31 = periodType30.getName();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration21, (org.joda.time.ReadableInstant) dateMidnight26, periodType30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean35 = dateTimeZone34.isFixed();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusMillis(100);
        org.joda.time.Period period40 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(100L, dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime44 = dateTime43.toLocalDateTime();
        org.joda.time.DateTime dateTime46 = dateTime43.withMonthOfYear(11);
        org.joda.time.Duration duration47 = period40.toDurationFrom((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime36.minus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(1L, dateTimeZone51);
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.Period period54 = new org.joda.time.Period(readableDuration49, (org.joda.time.ReadableInstant) dateMidnight52, periodType53);
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType56 = periodType55.withWeeksRemoved();
        java.lang.String str57 = periodType56.getName();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration47, (org.joda.time.ReadableInstant) dateMidnight52, periodType56);
        boolean boolean59 = duration21.isLongerThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Instant instant61 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration21, (int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) instant5);
        org.joda.time.DateTime dateTime7 = instant5.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant6", (dateTime4.compareTo(instant6) == 0) == dateTime4.equals(instant6));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 22);
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean26 = dateTimeZone25.isFixed();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(100);
        org.joda.time.Period period31 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(100L, dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.joda.time.DateTime dateTime37 = dateTime34.withMonthOfYear(11);
        org.joda.time.Duration duration38 = period31.toDurationFrom((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime27.minus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43, periodType44);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType47 = periodType46.withWeeksRemoved();
        java.lang.String str48 = periodType47.getName();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration38, (org.joda.time.ReadableInstant) dateMidnight43, periodType47);
        org.joda.time.Instant instant50 = instant23.plus((org.joda.time.ReadableDuration) duration38);
        org.joda.time.DateTime dateTime51 = dateTime22.plus((org.joda.time.ReadableDuration) duration38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime51 and instant23", (dateTime51.compareTo(instant23) == 0) == dateTime51.equals(instant23));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant7 = instant3.withMillis((long) 13);
        org.joda.time.Instant instant9 = instant7.withMillis(1L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime14 = yearMonthDay12.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime11.toMutableDateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant15", (dateTime14.compareTo(instant15) == 0) == dateTime14.equals(instant15));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration6, (org.joda.time.ReadableInstant) dateMidnight9, periodType10);
        int int12 = dateMidnight9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight14.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime15.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str19 = dateTimeFieldType18.getName();
        mutableDateTime17.set(dateTimeFieldType18, 5);
        int int22 = dateTime5.get(dateTimeFieldType18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant3", (dateTime5.compareTo(instant3) == 0) == dateTime5.equals(instant3));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime2.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime5", (instant3.compareTo(mutableDateTime5) == 0) == instant3.equals(mutableDateTime5));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonthDay0.getFieldTypes();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime5.toMutableDateTime(dateTimeZone7);
        org.joda.time.Interval interval9 = yearMonthDay0.toInterval(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean9 = timeZone6.hasSameRules(timeZone8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight12 = localDate2.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1970, dateTimeZone14);
        int int16 = localDate15.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean18 = localDate15.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDate localDate20 = localDate15.plusYears(1970);
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfEra();
        java.lang.String str22 = property21.getAsShortText();
        org.joda.time.LocalDate localDate23 = property21.roundFloorCopy();
        org.joda.time.LocalDate localDate24 = property21.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate25 = localDate2.withFields((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.Chronology chronology26 = localDate2.getChronology();
        org.joda.time.DateTime dateTime27 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property28 = localDate2.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateTime27", (dateMidnight12.compareTo(dateTime27) == 0) == dateMidnight12.equals(dateTime27));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.millis();
        boolean boolean19 = localTime15.isSupported(durationFieldType18);
        mutableDateTime9.add(durationFieldType18, (-1));
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        mutableDateTime9.setZoneRetainFields(dateTimeZone23);
        org.joda.time.Period period33 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period35 = period33.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plusDays((int) 'a');
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period33, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology42);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight46 = org.joda.time.DateMidnight.now(chronology42);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(1L, dateTimeZone49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period(readableDuration47, (org.joda.time.ReadableInstant) dateMidnight50, periodType51);
        int int53 = dateMidnight50.getYear();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight50.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight55, readableDuration56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight46.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod57, 2);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(100L, dateTimeZone61);
        org.joda.time.DateTime dateTime64 = dateTime62.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime66 = dateTime64.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property67 = dateTime64.minuteOfDay();
        org.joda.time.DateTime dateTime68 = property67.roundCeilingCopy();
        org.joda.time.DateTime dateTime70 = dateTime68.minusDays(35);
        org.joda.time.Duration duration71 = mutablePeriod57.toDurationTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.Duration duration72 = duration71.toDuration();
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration72);
        org.joda.time.MutableDateTime.Property property74 = mutableDateTime9.year();
        org.joda.time.MutableDateTime mutableDateTime75 = property74.roundHalfEven();
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(100L, dateTimeZone77);
        boolean boolean79 = dateTimeZone77.isFixed();
        org.joda.time.MutableDateTime mutableDateTime80 = new org.joda.time.MutableDateTime(dateTimeZone77);
        int int81 = mutableDateTime80.getDayOfMonth();
        int int82 = mutableDateTime75.compareTo((org.joda.time.ReadableInstant) mutableDateTime80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight3 and mutableDateTime75", (dateMidnight3.compareTo(mutableDateTime75) == 0) == dateMidnight3.equals(mutableDateTime75));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(100);
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean7 = dateTimeZone6.isFixed();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(100);
        org.joda.time.Period period12 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear(11);
        org.joda.time.Duration duration19 = period12.toDurationFrom((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime8.minus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24, periodType25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        java.lang.String str29 = periodType28.getName();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, (org.joda.time.ReadableInstant) dateMidnight24, periodType28);
        org.joda.time.Instant instant31 = instant4.plus((org.joda.time.ReadableDuration) duration19);
        org.joda.time.DateTime dateTime32 = dateTime3.plus((org.joda.time.ReadableDuration) duration19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant4", (dateTime1.compareTo(instant4) == 0) == dateTime1.equals(instant4));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period(readableDuration6, (org.joda.time.ReadableInstant) dateMidnight9, periodType10);
        int int12 = dateMidnight9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        mutablePeriod16.addSeconds(5);
        mutablePeriod16.setPeriod((long) 70);
        mutablePeriod16.addSeconds(0);
        int int23 = mutablePeriod16.getDays();
        org.joda.time.DateTime dateTime24 = dateTime4.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.DateTime dateTime26 = dateTime24.plusMinutes(292278994);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant5", (dateTime4.compareTo(instant5) == 0) == dateTime4.equals(instant5));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate2.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        boolean boolean12 = localDate5.equals((java.lang.Object) dateMidnight8);
        org.joda.time.LocalDate localDate14 = localDate5.minusYears((int) (byte) 1);
        org.joda.time.Interval interval15 = localDate5.toInterval();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime17 = yearMonthDay16.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate18 = dateTime17.toLocalDate();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime21 = dateTime17.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, dateTimeZone23);
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) 3);
        long long30 = dateTimeZone23.convertLocalToUTC((long) (short) 0, true, 8380800000L);
        org.joda.time.Interval interval31 = localDate5.toInterval(dateTimeZone23);
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime33 = yearMonthDay32.toDateTimeAtMidnight();
        java.util.Date date34 = dateTime33.toDate();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = dateTime33.withZone(dateTimeZone35);
        boolean boolean37 = interval31.isBefore((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime21", (dateTime17.compareTo(dateTime21) == 0) == dateTime17.equals(dateTime21));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        calendar4.setMinimalDaysInFirstWeek(1970);
        org.joda.time.MonthDay monthDay7 = org.joda.time.MonthDay.fromCalendarFields(calendar4);
        org.joda.time.LocalDate localDate9 = monthDay7.toLocalDate(8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1970, dateTimeZone11);
        int int13 = localDate12.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean19 = timeZone16.hasSameRules(timeZone18);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateMidnight dateMidnight22 = localDate12.toDateMidnight(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight23 = localDate9.toDateMidnight(dateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar4 and calendar20", (calendar4.compareTo(calendar20) == 0) == calendar4.equals(calendar20));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str23 = nameProvider17.getName(locale18, "deu", "PT0.070S");
        java.lang.String str24 = locale18.getVariant();
        java.util.Calendar calendar25 = dateTime8.toCalendar(locale18);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime29 = localTime27.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property30 = localTime29.millisOfSecond();
        org.joda.time.LocalTime localTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property30.roundCeilingCopy();
        java.lang.String str33 = property30.getAsString();
        org.joda.time.LocalTime localTime34 = property30.getLocalTime();
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.lang.String str37 = locale36.getDisplayLanguage();
        org.joda.time.LocalTime localTime38 = property30.setCopy("32", locale36);
        java.lang.String str39 = locale18.getDisplayCountry(locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minus((long) (short) 0);
        java.lang.Character[] charArray14 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet15 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet15, charArray14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, dateTimeZone18);
        boolean boolean20 = dateTimeZone18.isFixed();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        boolean boolean22 = charSet15.contains((java.lang.Object) dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plus((long) 19);
        org.joda.time.Period period27 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(100L, dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = dateTime30.toLocalDateTime();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear(11);
        org.joda.time.Duration duration34 = period27.toDurationFrom((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight23.withDurationAdded((org.joda.time.ReadableDuration) duration34, 59);
        org.joda.time.Duration duration37 = duration34.toDuration();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableDuration) duration34);
        org.joda.time.Duration duration39 = duration34.toDuration();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(100L, dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property47 = dateTime44.minuteOfDay();
        org.joda.time.DateTime dateTime48 = property47.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime48, readableDuration49);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long55 = dateTimeZone53.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime56 = dateTime48.toDateTime(dateTimeZone53);
        org.joda.time.Interval interval57 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration39, (org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.Instant instant58 = instant5.minus((org.joda.time.ReadableDuration) duration39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and dateTime56", (dateTime48.compareTo(dateTime56) == 0) == dateTime48.equals(dateTime56));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        org.joda.time.tz.NameProvider nameProvider17 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.lang.String str20 = locale18.getDisplayName(locale19);
        java.lang.String str23 = nameProvider17.getName(locale18, "deu", "PT0.070S");
        java.lang.String str24 = locale18.getVariant();
        java.util.Calendar calendar25 = dateTime8.toCalendar(locale18);
        int int26 = calendar25.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        int int12 = mutableDateTime9.getSecondOfMinute();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration14, (org.joda.time.ReadableInstant) dateMidnight17, periodType18);
        int int20 = dateMidnight17.getYear();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight17.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod29.setMinutes(11);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight22, (org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.DateTime dateTime33 = interval32.getStart();
        org.joda.time.Period period42 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period44 = period42.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight47.plusDays((int) 'a');
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period42, (org.joda.time.ReadableInstant) dateMidnight49);
        org.joda.time.Interval interval51 = interval32.withPeriodAfterStart((org.joda.time.ReadablePeriod) period42);
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime53 = yearMonthDay52.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime54 = yearMonthDay52.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant55 = dateTime54.toInstant();
        int int56 = dateTime54.getMillisOfSecond();
        org.joda.time.DateTime dateTime57 = dateTime54.withTimeAtStartOfDay();
        boolean boolean58 = interval32.contains((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime60 = dateTime54.minusMonths(971);
        boolean boolean61 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) dateTime54);
        java.lang.Object obj62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(obj62);
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime65 = yearMonthDay64.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) 1970, dateTimeZone67);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = null;
        boolean boolean70 = localDate68.isSupported(dateTimeFieldType69);
        org.joda.time.LocalDate localDate72 = localDate68.withWeekyear((-1));
        boolean boolean74 = localDate72.equals((java.lang.Object) 8);
        int int75 = localDate72.getYear();
        boolean boolean76 = yearMonthDay64.equals((java.lang.Object) localDate72);
        int int77 = localDate72.size();
        org.joda.time.PeriodType periodType79 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType80 = periodType79.withWeeksRemoved();
        org.joda.time.Chronology chronology81 = null;
        org.joda.time.Period period82 = new org.joda.time.Period((long) '#', periodType80, chronology81);
        org.joda.time.Period period83 = new org.joda.time.Period((org.joda.time.ReadablePartial) yearMonthDay63, (org.joda.time.ReadablePartial) localDate72, periodType80);
        org.joda.time.YearMonthDay yearMonthDay85 = yearMonthDay63.minusYears((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone87 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime88 = org.joda.time.MutableDateTime.now(dateTimeZone87);
        org.joda.time.Interval interval89 = yearMonthDay85.toInterval(dateTimeZone87);
        long long91 = dateTimeZone87.convertUTCToLocal((long) (-19036));
        mutableDateTime9.setZone(dateTimeZone87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and mutableDateTime88", (dateTime54.compareTo(mutableDateTime88) == 0) == dateTime54.equals(mutableDateTime88));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(chronology17);
        org.joda.time.DurationField durationField25 = chronology17.weekyears();
        org.joda.time.DurationField durationField26 = chronology17.seconds();
        org.joda.time.DurationField durationField27 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField25, and durationField26", !(durationField27.compareTo(durationField25) == 0) || (Math.signum(durationField27.compareTo(durationField26)) == Math.signum(durationField25.compareTo(durationField26))));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        org.joda.time.DateTime.Property property17 = dateTime8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMonthOfYear(11);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(985);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths(366);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, readableDuration19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long25 = dateTimeZone23.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime(dateTimeZone23);
        int int27 = dateTime26.getYearOfEra();
        long long28 = dateTime26.getMillis();
        boolean boolean29 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime7.plusDays(292278993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime26", (dateTime18.compareTo(dateTime26) == 0) == dateTime18.equals(dateTime26));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.lang.String str5 = locale3.getDisplayName(locale4);
        java.util.Set<java.lang.Character> charSet6 = locale3.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        boolean boolean10 = charSet6.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap11);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((java.lang.Object) strMap11);
        boolean boolean14 = calendar1.after((java.lang.Object) mutableDateTime13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean18 = timeZone15.hasSameRules(timeZone17);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone17);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        timeZone20.setRawOffset(1);
        int int23 = timeZone20.getRawOffset();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.time.ZoneId zoneId26 = timeZone24.toZoneId();
        java.time.ZoneId zoneId27 = timeZone24.toZoneId();
        boolean boolean28 = timeZone20.hasSameRules(timeZone24);
        calendar19.setTimeZone(timeZone20);
        calendar1.setTimeZone(timeZone20);
        int int31 = timeZone20.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar19", (calendar1.compareTo(calendar19) == 0) == calendar1.equals(calendar19));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("janvier");
        java.lang.String str5 = nameProvider0.getName(locale2, "", "years");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime15, readableDuration16);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long22 = dateTimeZone20.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(dateTimeZone20);
        org.joda.time.tz.NameProvider nameProvider24 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.lang.String str30 = nameProvider24.getName(locale25, "deu", "PT0.070S");
        java.lang.String str31 = locale25.getVariant();
        java.util.Calendar calendar32 = dateTime15.toCalendar(locale25);
        java.lang.String str35 = nameProvider0.getShortName(locale25, "Tue Feb 22 07:08:17 GMT 2022", "1965-09-01T00:00:00.100");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime23", (dateTime15.compareTo(dateTime23) == 0) == dateTime15.equals(dateTime23));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7, periodType8);
        int int10 = dateMidnight6.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight6.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone11);
        org.joda.time.Interval interval14 = localDate2.toInterval(dateTimeZone11);
        org.joda.time.Interval interval16 = interval14.withEndMillis(4518499391L);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime18 = yearMonthDay17.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate19 = dateTime18.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime21 = yearMonthDay20.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate22 = dateTime21.toLocalDate();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTime dateTime25 = dateTime21.toDateTime(dateTimeZone24);
        org.joda.time.Interval interval26 = localDate19.toInterval(dateTimeZone24);
        boolean boolean27 = interval14.overlaps((org.joda.time.ReadableInterval) interval26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateTime25", (dateMidnight12.compareTo(dateTime25) == 0) == dateMidnight12.equals(dateTime25));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7, periodType8);
        int int10 = dateMidnight6.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight6.getZone();
        org.joda.time.DateMidnight dateMidnight12 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone11);
        org.joda.time.Interval interval14 = localDate2.toInterval(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(5);
        org.joda.time.Instant instant20 = dateTime19.toInstant();
        boolean boolean21 = interval14.isAfter((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant23 = instant20.minus((long) 35);
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime25 = yearMonthDay24.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate26 = dateTime25.toLocalDate();
        java.util.TimeZone timeZone27 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, dateTimeZone31);
        long long34 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) 3);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((java.lang.Object) instant20, dateTimeZone31);
        long long38 = dateTimeZone31.adjustOffset((-60480000001L), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight12 and dateTime29", (dateMidnight12.compareTo(dateTime29) == 0) == dateMidnight12.equals(dateTime29));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
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
        int int19 = dateMidnight3.getMinuteOfHour();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight3.withDurationAdded(readableDuration20, (int) '#');
        int int23 = dateMidnight22.getYear();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration24, (org.joda.time.ReadableInstant) dateMidnight27, periodType28);
        int int30 = dateMidnight27.getYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight27.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight32.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime33.copy();
        mutableDateTime33.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period(readableDuration39, (org.joda.time.ReadableInstant) dateMidnight42, periodType43);
        int int45 = dateMidnight42.getYear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight42.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight47.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime48.copy();
        mutableDateTime48.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime48.dayOfMonth();
        mutableDateTime33.setDate((org.joda.time.ReadableInstant) mutableDateTime48);
        int int55 = dateMidnight22.compareTo((org.joda.time.ReadableInstant) mutableDateTime33);
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
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime73 = localTime71.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.millis();
        boolean boolean75 = localTime71.isSupported(durationFieldType74);
        mutableDateTime65.add(durationFieldType74, (-1));
        java.util.TimeZone timeZone78 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone78);
        mutableDateTime65.setZoneRetainFields(dateTimeZone79);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(dateTimeZone79);
        mutableDateTime33.setZoneRetainFields(dateTimeZone79);
        long long85 = dateTimeZone79.convertLocalToUTC((-1640995200000L), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime33 and mutableDateTime48", (mutableDateTime33.compareTo(mutableDateTime48) == 0) == mutableDateTime33.equals(mutableDateTime48));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonthDay0.getFieldTypes();
        int int3 = yearMonthDay0.getMonthOfYear();
        java.lang.String str4 = yearMonthDay0.toString();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusDays((int) '4');
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay0.plusMonths(985);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay0.minusMonths(625);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay10.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property19 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime20, readableDuration21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long27 = dateTimeZone25.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime(dateTimeZone25);
        org.joda.time.Interval interval29 = yearMonthDay10.toInterval(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime28", (dateTime20.compareTo(dateTime28) == 0) == dateTime20.equals(dateTime28));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime2 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime5 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone8);
        org.joda.time.Interval interval10 = localDate3.toInterval(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime0.withZoneRetainFields(dateTimeZone8);
        org.joda.time.Period period13 = org.joda.time.Period.seconds(14);
        org.joda.time.DateTime dateTime14 = dateTime0.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfCentury(53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime11", (dateTime0.compareTo(dateTime11) == 0) == dateTime0.equals(dateTime11));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime2 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime5 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTime dateTime9 = dateTime5.toDateTime(dateTimeZone8);
        org.joda.time.Interval interval10 = localDate3.toInterval(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime0.withZoneRetainFields(dateTimeZone8);
        org.joda.time.Period period13 = org.joda.time.Period.seconds(14);
        org.joda.time.DateTime dateTime14 = dateTime0.plus((org.joda.time.ReadablePeriod) period13);
        java.util.TimeZone timeZone15 = java.util.TimeZone.getDefault();
        timeZone15.setRawOffset(1);
        int int18 = timeZone15.getRawOffset();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.time.ZoneId zoneId21 = timeZone19.toZoneId();
        java.time.ZoneId zoneId22 = timeZone19.toZoneId();
        boolean boolean23 = timeZone15.hasSameRules(timeZone19);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone.setDefault(timeZone24);
        boolean boolean27 = timeZone19.hasSameRules(timeZone24);
        boolean boolean28 = period13.equals((java.lang.Object) timeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime11", (dateTime0.compareTo(dateTime11) == 0) == dateTime0.equals(dateTime11));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) 3);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone7);
        long long13 = dateTimeZone7.convertUTCToLocal(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime5", (dateTime1.compareTo(dateTime5) == 0) == dateTime1.equals(dateTime5));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder2.setWeekDate(292278994, (int) (byte) 1, (-292275054));
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean10 = timeZone7.hasSameRules(timeZone9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.Calendar.Builder builder14 = builder2.setTimeZone(timeZone9);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(1970, 6, 100);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.time.ZoneId zoneId21 = timeZone19.toZoneId();
        java.util.Calendar.Builder builder22 = builder18.setTimeZone(timeZone19);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        java.time.ZoneId zoneId25 = timeZone23.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        boolean boolean27 = timeZone19.hasSameRules(timeZone23);
        org.joda.time.MonthDay monthDay28 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property29 = monthDay28.dayOfMonth();
        java.lang.String str30 = property29.getName();
        int int31 = property29.getMaximumValueOverall();
        org.joda.time.MonthDay monthDay32 = property29.getMonthDay();
        java.util.Locale locale34 = java.util.Locale.US;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        java.lang.String str36 = monthDay32.toString("23:59:50.000", locale34);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone23, locale34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar35", (calendar11.compareTo(calendar35) == 0) == calendar11.equals(calendar35));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        org.joda.time.DurationField durationField28 = chronology18.days();
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(625L, chronology18);
        org.joda.time.DateTimeField dateTimeField30 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology18.weekOfWeekyear();
        org.joda.time.DurationField durationField32 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField26, and durationField27", !(durationField32.compareTo(durationField26) == 0) || (Math.signum(durationField32.compareTo(durationField27)) == Math.signum(durationField26.compareTo(durationField27))));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMillisRemoved();
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
        org.joda.time.DateTimeField dateTimeField37 = chronology32.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.hourOfDay();
        org.joda.time.Period period39 = new org.joda.time.Period(292278993L, 1L, periodType4, chronology32);
        org.joda.time.DurationField durationField40 = chronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField35, and durationField36", !(durationField40.compareTo(durationField35) == 0) || (Math.signum(durationField40.compareTo(durationField36)) == Math.signum(durationField35.compareTo(durationField36))));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withField(dateTimeFieldType6, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.property(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minus((long) (short) 0);
        java.lang.Character[] charArray20 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet21 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet21, charArray20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, dateTimeZone24);
        boolean boolean26 = dateTimeZone24.isFixed();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone24);
        boolean boolean28 = charSet21.contains((java.lang.Object) dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.plus((long) 19);
        org.joda.time.Period period33 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(100L, dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = dateTime36.toLocalDateTime();
        org.joda.time.DateTime dateTime39 = dateTime36.withMonthOfYear(11);
        org.joda.time.Duration duration40 = period33.toDurationFrom((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight29.withDurationAdded((org.joda.time.ReadableDuration) duration40, 59);
        org.joda.time.Duration duration43 = duration40.toDuration();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration45 = duration40.toDuration();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(100L, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime52 = dateTime50.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property53 = dateTime50.minuteOfDay();
        org.joda.time.DateTime dateTime54 = property53.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime54, readableDuration55);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long61 = dateTimeZone59.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime62 = dateTime54.toDateTime(dateTimeZone59);
        org.joda.time.Interval interval63 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration45, (org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime9.plus((org.joda.time.ReadableDuration) duration45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime62", (dateTime54.compareTo(dateTime62) == 0) == dateTime54.equals(dateTime62));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minus((long) (short) 0);
        java.lang.Character[] charArray7 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet8 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet8, charArray7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        boolean boolean15 = charSet8.contains((java.lang.Object) dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plus((long) 19);
        org.joda.time.Period period20 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(100L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear(11);
        org.joda.time.Duration duration27 = period20.toDurationFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight16.withDurationAdded((org.joda.time.ReadableDuration) duration27, 59);
        org.joda.time.Duration duration30 = duration27.toDuration();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration32 = duration27.toDuration();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(100L, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property40 = dateTime37.minuteOfDay();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime41, readableDuration42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long48 = dateTimeZone46.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime49 = dateTime41.toDateTime(dateTimeZone46);
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(1L, dateTimeZone52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minus((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight55.withWeekyear((-292275054));
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight55.plusYears(0);
        org.joda.time.MutableDateTime mutableDateTime60 = dateMidnight59.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(100L, dateTimeZone62);
        boolean boolean64 = dateTimeZone62.isFixed();
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime(dateTimeZone62);
        mutableDateTime60.setZoneRetainFields(dateTimeZone62);
        org.joda.time.MutableDateTime.Property property67 = mutableDateTime60.secondOfMinute();
        int int68 = mutableDateTime60.getEra();
        mutableDateTime60.setMillis((-1104537599990L));
        org.joda.time.Interval interval71 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) mutableDateTime60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime49", (dateTime41.compareTo(dateTime49) == 0) == dateTime41.equals(dateTime49));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        java.lang.Object obj0 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period11 = period9.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plusDays((int) 'a');
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period9, (org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(chronology18);
        long long23 = chronology18.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DurationField durationField24 = chronology18.years();
        org.joda.time.DurationField durationField25 = chronology18.minutes();
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(obj0, chronology18);
        org.joda.time.DurationField durationField27 = chronology18.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField27, durationField24, and durationField25", !(durationField27.compareTo(durationField24) == 0) || (Math.signum(durationField27.compareTo(durationField25)) == Math.signum(durationField24.compareTo(durationField25))));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder2.setWeekDate(292278994, (int) (byte) 1, (-292275054));
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean10 = timeZone7.hasSameRules(timeZone9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        boolean boolean13 = timeZone9.observesDaylightTime();
        java.util.Calendar.Builder builder14 = builder2.setTimeZone(timeZone9);
        java.util.Calendar.Builder builder18 = builder14.setTimeOfDay(1970, 6, 100);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.time.ZoneId zoneId21 = timeZone19.toZoneId();
        java.util.Calendar.Builder builder22 = builder18.setTimeZone(timeZone19);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone19);
        timeZone19.setRawOffset((-101));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar23", (calendar11.compareTo(calendar23) == 0) == calendar11.equals(calendar23));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime3 = dateTime2.toLocalDateTime();
        org.joda.time.DateTime dateTime5 = dateTime2.withMonthOfYear(11);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(985);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths(366);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property17 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime18, readableDuration19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long25 = dateTimeZone23.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime(dateTimeZone23);
        int int27 = dateTime26.getYearOfEra();
        long long28 = dateTime26.getMillis();
        boolean boolean29 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.Instant instant30 = dateTime7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime26", (dateTime18.compareTo(dateTime26) == 0) == dateTime18.equals(dateTime26));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.Period period10 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period12 = period10.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.plusDays((int) 'a');
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period10, (org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology19);
        long long24 = chronology19.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now(chronology19);
        org.joda.time.DurationField durationField27 = chronology19.minutes();
        org.joda.time.DurationField durationField28 = chronology19.millis();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 26, chronology19);
        org.joda.time.DateTimeField dateTimeField30 = chronology19.secondOfMinute();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(32769L, chronology19);
        org.joda.time.DurationField durationField32 = chronology19.hours();
        org.joda.time.DurationField durationField33 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField27, and durationField28", !(durationField33.compareTo(durationField27) == 0) || (Math.signum(durationField33.compareTo(durationField28)) == Math.signum(durationField27.compareTo(durationField28))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period11 = period9.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plusDays((int) 'a');
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period9, (org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(chronology18);
        long long23 = chronology18.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.dayOfWeek();
        org.joda.time.DurationField durationField25 = chronology18.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology18.millisOfDay();
        boolean boolean27 = durationFieldType0.isSupported(chronology18);
        org.joda.time.DurationField durationField28 = chronology18.weekyears();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField28", (durationField25.compareTo(durationField28) == 0) == durationField25.equals(durationField28));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.clockhourOfHalfday();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime28 = dateTime26.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property29 = dateTime26.minuteOfDay();
        org.joda.time.DateTime dateTime30 = property29.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime30, readableDuration31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long37 = dateTimeZone35.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime38 = dateTime30.toDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = localDateTime21.toDateTime(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime38", (dateTime30.compareTo(dateTime38) == 0) == dateTime30.equals(dateTime38));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        int int3 = timeZone0.getRawOffset();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("hi!");
        timeZone5.setID("3940");
        boolean boolean8 = timeZone0.hasSameRules(timeZone5);
        int int9 = timeZone5.getRawOffset();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration13, (org.joda.time.ReadableInstant) dateMidnight16, periodType17);
        int int19 = dateMidnight16.getYear();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateMidnight25, periodType26);
        int int28 = dateMidnight25.getYear();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withDayOfMonth((int) (byte) 10);
        boolean boolean31 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight30.monthOfYear();
        java.util.Locale locale33 = java.util.Locale.JAPAN;
        int int34 = property32.getMaximumShortTextLength(locale33);
        java.lang.String str35 = locale11.getDisplayLanguage(locale33);
        boolean boolean36 = locale33.hasExtensions();
        java.util.Locale locale37 = locale33.stripExtensions();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime39 = yearMonthDay38.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay38.year();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = property41.getAsText(locale42);
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str46 = property41.getAsText(locale45);
        java.lang.String str47 = locale37.getDisplayName(locale45);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone5, locale37);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone5);
        java.util.Calendar.Builder builder50 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder54 = builder50.setDate(12, (int) 'u', (int) (short) -1);
        java.util.TimeZone timeZone55 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        int int57 = timeZone55.getRawOffset();
        java.util.Calendar.Builder builder58 = builder50.setTimeZone(timeZone55);
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone55, locale59);
        calendar49.setTimeZone(timeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar60", (calendar48.compareTo(calendar60) == 0) == calendar48.equals(calendar60));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minus((long) (short) 0);
        java.lang.Character[] charArray7 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet8 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet8, charArray7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        boolean boolean15 = charSet8.contains((java.lang.Object) dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plus((long) 19);
        org.joda.time.Period period20 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(100L, dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear(11);
        org.joda.time.Duration duration27 = period20.toDurationFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight16.withDurationAdded((org.joda.time.ReadableDuration) duration27, 59);
        org.joda.time.Duration duration30 = duration27.toDuration();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration32 = duration27.toDuration();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(100L, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime39 = dateTime37.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property40 = dateTime37.minuteOfDay();
        org.joda.time.DateTime dateTime41 = property40.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime41, readableDuration42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long48 = dateTimeZone46.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime49 = dateTime41.toDateTime(dateTimeZone46);
        org.joda.time.Interval interval50 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration32, (org.joda.time.ReadableInstant) dateTime49);
        java.lang.String str51 = duration32.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime49", (dateTime41.compareTo(dateTime49) == 0) == dateTime41.equals(dateTime49));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.DateTime dateTime9 = property7.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = property7.setCopy(180);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMonths(4);
        int int14 = dateTime11.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18, periodType19);
        int int21 = dateMidnight18.getYear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration24, (org.joda.time.ReadableInstant) dateMidnight27, periodType28);
        int int30 = dateMidnight27.getYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight27.withDayOfMonth((int) (byte) 10);
        boolean boolean33 = dateMidnight18.isBefore((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.DateMidnight.Property property34 = dateMidnight32.monthOfYear();
        java.util.Locale locale35 = java.util.Locale.JAPAN;
        int int36 = property34.getMaximumShortTextLength(locale35);
        org.joda.time.DurationField durationField37 = property34.getDurationField();
        org.joda.time.DateMidnight dateMidnight38 = property34.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight39 = property34.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusYears(9);
        int int42 = dateMidnight41.getYearOfCentury();
        org.joda.time.DateMidnight.Property property43 = dateMidnight41.yearOfEra();
        org.joda.time.DateMidnight.Property property44 = dateMidnight41.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight41.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay((-1123408535000L));
        org.joda.time.LocalDate localDate48 = yearMonthDay47.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long53 = dateTimeZone51.nextTransition(2022L);
        org.joda.time.DateMidnight dateMidnight54 = localDate48.toDateMidnight(dateTimeZone51);
        mutableDateTime45.setZoneRetainFields(dateTimeZone51);
        org.joda.time.DateTime dateTime56 = dateTime11.withZone(dateTimeZone51);
        int int57 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime59 = dateTime11.withYearOfEra(25946);
        org.joda.time.DateTime.Property property60 = dateTime59.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime56", (dateTime11.compareTo(dateTime56) == 0) == dateTime11.equals(dateTime56));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
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
        org.joda.time.DateTime.Property property17 = dateTime8.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minus((long) (short) 0);
        java.lang.Character[] charArray26 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet27 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet27, charArray26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(100L, dateTimeZone30);
        boolean boolean32 = dateTimeZone30.isFixed();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(dateTimeZone30);
        boolean boolean34 = charSet27.contains((java.lang.Object) dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plus((long) 19);
        org.joda.time.Period period39 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(100L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime43 = dateTime42.toLocalDateTime();
        org.joda.time.DateTime dateTime45 = dateTime42.withMonthOfYear(11);
        org.joda.time.Duration duration46 = period39.toDurationFrom((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight35.withDurationAdded((org.joda.time.ReadableDuration) duration46, 59);
        org.joda.time.Duration duration49 = duration46.toDuration();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight21, (org.joda.time.ReadableDuration) duration46);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime16", (dateTime8.compareTo(dateTime16) == 0) == dateTime8.equals(dateTime16));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) ' ', locale10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, dateTimeZone13);
        boolean boolean15 = dateTimeZone13.isFixed();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone13);
        java.util.Locale locale17 = java.util.Locale.US;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        java.lang.String str19 = dateTimeField8.getAsText((org.joda.time.ReadablePartial) localDate16, locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1970, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27, periodType28);
        int int30 = dateMidnight26.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight26.getZone();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone31);
        org.joda.time.Interval interval34 = localDate22.toInterval(dateTimeZone31);
        org.joda.time.LocalDate.Property property35 = localDate22.yearOfCentury();
        org.joda.time.LocalDate localDate36 = property35.roundFloorCopy();
        int int37 = localDate16.compareTo((org.joda.time.ReadablePartial) localDate36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1970, dateTimeZone39);
        int int41 = localDate40.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean43 = localDate40.isSupported(dateTimeFieldType42);
        org.joda.time.LocalDate.Property property44 = localDate36.property(dateTimeFieldType42);
        org.joda.time.LocalDate localDate46 = localDate36.minusYears(796389);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(100L, dateTimeZone48);
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.now(dateTimeZone48);
        java.util.TimeZone timeZone51 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone53 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean54 = timeZone51.hasSameRules(timeZone53);
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(timeZone53);
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.fromCalendarFields(calendar55);
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate50, (org.joda.time.ReadablePartial) localDate56);
        org.joda.time.DateTime dateTime58 = localDate56.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate60 = localDate56.plusYears(200);
        org.joda.time.DateTime dateTime61 = localDate56.toDateTimeAtStartOfDay();
        org.joda.time.Period period62 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar55", (calendar18.compareTo(calendar55) == 0) == calendar18.equals(calendar55));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate2.minusWeeks((int) (short) 10);
        int int6 = localDate2.getYearOfEra();
        org.joda.time.LocalDate.Property property7 = localDate2.centuryOfEra();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(15);
        org.joda.time.DateTime dateTime11 = localDate2.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate2.withYear(1471);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime11", (dateTime8.compareTo(dateTime11) == 0) == dateTime8.equals(dateTime11));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate2.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1970, dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDate localDate12 = localDate8.withWeekyear((-1));
        org.joda.time.LocalDate.Property property13 = localDate8.dayOfWeek();
        org.joda.time.LocalDate localDate15 = property13.addToCopy(3);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime17 = yearMonthDay16.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime18 = yearMonthDay16.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay16.year();
        java.util.Locale locale20 = java.util.Locale.GERMANY;
        java.lang.String str21 = property19.getAsText(locale20);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str24 = property19.getAsText(locale23);
        java.lang.String str25 = property13.getAsText(locale23);
        org.joda.time.LocalDate localDate27 = property13.addWrapFieldToCopy(30);
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime29 = yearMonthDay28.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime30 = yearMonthDay28.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTimeISO();
        org.joda.time.Instant instant33 = instant31.toInstant();
        org.joda.time.DateTime dateTime34 = instant31.toDateTimeISO();
        org.joda.time.Instant instant37 = instant31.withDurationAdded((long) 4, 292271115);
        int int38 = property13.compareTo((org.joda.time.ReadableInstant) instant37);
        org.joda.time.LocalDate localDate39 = property13.withMaximumValue();
        int int40 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate localDate42 = localDate2.plusYears(58);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(100L, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.DateTime dateTime52 = dateTime49.withZone(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = localDate42.toDateTimeAtStartOfDay(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime52", (dateTime47.compareTo(dateTime52) == 0) == dateTime47.equals(dateTime52));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withYear(180);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.Interval interval8 = yearMonthDay0.toInterval(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property16 = dateTime13.minuteOfDay();
        java.lang.String str17 = property16.getAsString();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = property16.setCopy(180);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths(4);
        int int23 = dateTime20.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration24, (org.joda.time.ReadableInstant) dateMidnight27, periodType28);
        int int30 = dateMidnight27.getYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight27.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period(readableDuration33, (org.joda.time.ReadableInstant) dateMidnight36, periodType37);
        int int39 = dateMidnight36.getYear();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight36.withDayOfMonth((int) (byte) 10);
        boolean boolean42 = dateMidnight27.isBefore((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.DateMidnight.Property property43 = dateMidnight41.monthOfYear();
        java.util.Locale locale44 = java.util.Locale.JAPAN;
        int int45 = property43.getMaximumShortTextLength(locale44);
        org.joda.time.DurationField durationField46 = property43.getDurationField();
        org.joda.time.DateMidnight dateMidnight47 = property43.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight48 = property43.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusYears(9);
        int int51 = dateMidnight50.getYearOfCentury();
        org.joda.time.DateMidnight.Property property52 = dateMidnight50.yearOfEra();
        org.joda.time.DateMidnight.Property property53 = dateMidnight50.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime54 = dateMidnight50.toMutableDateTime();
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay((-1123408535000L));
        org.joda.time.LocalDate localDate57 = yearMonthDay56.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long62 = dateTimeZone60.nextTransition(2022L);
        org.joda.time.DateMidnight dateMidnight63 = localDate57.toDateMidnight(dateTimeZone60);
        mutableDateTime54.setZoneRetainFields(dateTimeZone60);
        org.joda.time.DateTime dateTime65 = dateTime20.withZone(dateTimeZone60);
        org.joda.time.DateTime dateTime66 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime65", (dateTime20.compareTo(dateTime65) == 0) == dateTime20.equals(dateTime65));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        int int3 = timeZone0.getRawOffset();
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("hi!");
        timeZone5.setID("3940");
        boolean boolean8 = timeZone0.hasSameRules(timeZone5);
        int int9 = timeZone5.getRawOffset();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale10.getDisplayName(locale11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period(readableDuration13, (org.joda.time.ReadableInstant) dateMidnight16, periodType17);
        int int19 = dateMidnight16.getYear();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period(readableDuration22, (org.joda.time.ReadableInstant) dateMidnight25, periodType26);
        int int28 = dateMidnight25.getYear();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withDayOfMonth((int) (byte) 10);
        boolean boolean31 = dateMidnight16.isBefore((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight30.monthOfYear();
        java.util.Locale locale33 = java.util.Locale.JAPAN;
        int int34 = property32.getMaximumShortTextLength(locale33);
        java.lang.String str35 = locale11.getDisplayLanguage(locale33);
        boolean boolean36 = locale33.hasExtensions();
        java.util.Locale locale37 = locale33.stripExtensions();
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime39 = yearMonthDay38.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime40 = yearMonthDay38.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay38.year();
        java.util.Locale locale42 = java.util.Locale.GERMANY;
        java.lang.String str43 = property41.getAsText(locale42);
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str46 = property41.getAsText(locale45);
        java.lang.String str47 = locale37.getDisplayName(locale45);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone5, locale37);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone5);
        boolean boolean50 = timeZone5.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar49", (calendar48.compareTo(calendar49) == 0) == calendar48.equals(calendar49));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Thursday");
        java.lang.String str2 = languageRange1.getRange();
        double double3 = languageRange1.getWeight();
        double double4 = languageRange1.getWeight();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime13, readableDuration14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long20 = dateTimeZone18.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(dateTimeZone18);
        org.joda.time.DateTime.Property property22 = dateTime13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight25, readableDuration26, periodType27);
        int int29 = dateMidnight25.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = dateMidnight25.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight25.withField(dateTimeFieldType31, (int) (short) 1);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.plus((long) (short) 10);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight33.withMillis((long) 1);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight33.withWeekyear(570);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withPeriodAdded(readablePeriod40, 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        org.joda.time.Hours hours50 = period49.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period53 = period49.withFieldAdded(durationFieldType51, 100);
        org.joda.time.Period period62 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period64 = period62.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(1L, dateTimeZone66);
        org.joda.time.DateMidnight dateMidnight69 = dateMidnight67.plusDays((int) 'a');
        org.joda.time.Interval interval70 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period62, (org.joda.time.ReadableInstant) dateMidnight69);
        org.joda.time.Chronology chronology71 = interval70.getChronology();
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now(chronology71);
        org.joda.time.DateTime dateTime73 = org.joda.time.DateTime.now(chronology71);
        org.joda.time.DurationField durationField74 = durationFieldType51.getField(chronology71);
        org.joda.time.DurationField durationField75 = chronology71.centuries();
        org.joda.time.Period period76 = new org.joda.time.Period(551L, chronology71);
        org.joda.time.DateTime dateTime77 = dateMidnight42.toDateTime(chronology71);
        org.joda.time.DateTimeField dateTimeField78 = chronology71.weekOfWeekyear();
        org.joda.time.DateTime dateTime79 = dateTime13.withChronology(chronology71);
        boolean boolean80 = languageRange1.equals((java.lang.Object) chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime21", (dateTime13.compareTo(dateTime21) == 0) == dateTime13.equals(dateTime21));
    }
}

