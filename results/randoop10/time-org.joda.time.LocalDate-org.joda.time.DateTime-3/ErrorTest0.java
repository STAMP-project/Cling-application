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
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        java.lang.String str8 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        int int16 = mutablePeriod15.getMonths();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableInstant11, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        int int25 = mutablePeriod24.getMonths();
        org.joda.time.Interval interval26 = new org.joda.time.Interval(readableInstant20, (org.joda.time.ReadablePeriod) mutablePeriod24);
        int[] intArray29 = chronology18.get((org.joda.time.ReadablePeriod) mutablePeriod24, 1L, (long) 4);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime1, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant10", (dateTime4.compareTo(instant10) == 0) == dateTime4.equals(instant10));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        int int10 = mutablePeriod9.getMonths();
        org.joda.time.Interval interval11 = new org.joda.time.Interval(readableInstant5, (org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 100, chronology12);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 10, (int) (byte) 1, 3, (int) (short) 1, chronology12);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight15.toMutableDateTime();
        java.lang.String str17 = mutableDateTime16.toString();
        mutableDateTime16.setMonthOfYear(1);
        mutableDateTime16.addWeekyears(4);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime16.toMutableDateTime(dateTimeZone23);
        org.joda.time.Instant instant26 = mutableDateTime25.toInstant();
        org.joda.time.DateTime dateTime27 = localTime14.toDateTime((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and instant26", (mutableDateTime16.compareTo(instant26) == 0) == mutableDateTime16.equals(instant26));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        boolean boolean16 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType28);
        int int30 = mutablePeriod29.getMonths();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant25, (org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        boolean boolean33 = interval23.contains((org.joda.time.ReadableInterval) interval31);
        boolean boolean34 = interval6.overlaps((org.joda.time.ReadableInterval) interval23);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        java.lang.String str37 = mutableDateTime36.toString();
        mutableDateTime36.setMonthOfYear(1);
        mutableDateTime36.addWeekyears(4);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime36.toMutableDateTime(dateTimeZone43);
        org.joda.time.Instant instant46 = mutableDateTime45.toInstant();
        boolean boolean47 = interval6.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and instant46", (mutableDateTime36.compareTo(instant46) == 0) == mutableDateTime36.equals(instant46));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime3.plusMinutes(7);
        org.joda.time.DateTime dateTime18 = dateTime3.plus((-2316956400000000L));
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology20 = dateMidnight19.getChronology();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.withDayOfMonth(8);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfMonth();
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType30);
        org.joda.time.PeriodType periodType34 = null;
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType34);
        mutablePeriod31.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod35);
        java.lang.String str37 = mutablePeriod31.toString();
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadablePeriod) mutablePeriod31);
        mutablePeriod31.setValue(0, 2022);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod31.setPeriod((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration46 = new org.joda.time.Duration((long) (byte) 0);
        long long47 = duration46.getMillis();
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) (byte) 0);
        long long50 = duration49.getMillis();
        int int51 = duration46.compareTo((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Duration duration53 = duration43.withDurationAdded((org.joda.time.ReadableDuration) duration49, 2);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight22.minus((org.joda.time.ReadableDuration) duration53);
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime56 = dateMidnight55.toMutableDateTime();
        mutableDateTime56.add((long) 1);
        org.joda.time.DateTime dateTime59 = mutableDateTime56.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration60 = null;
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.years();
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime56, readableDuration60, periodType61);
        org.joda.time.Chronology chronology63 = mutableDateTime56.getChronology();
        org.joda.time.MutableDateTime mutableDateTime64 = org.joda.time.MutableDateTime.now(chronology63);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime68 = dateTime66.withDayOfYear((int) (byte) 1);
        int int69 = dateTime68.getDayOfMonth();
        org.joda.time.Duration duration71 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime72 = dateTime68.minus((org.joda.time.ReadableDuration) duration71);
        mutableDateTime64.add((org.joda.time.ReadableDuration) duration71);
        org.joda.time.Duration duration74 = duration53.plus((org.joda.time.ReadableDuration) duration71);
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime26", (dateTime14.compareTo(dateTime26) == 0) == dateTime14.equals(dateTime26));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone10, locale14);
        int int18 = calendar17.getWeeksInWeekYear();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.fromCalendarFields(calendar20);
        calendar20.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone29 = calendar20.getTimeZone();
        boolean boolean30 = timeZone29.observesDaylightTime();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone29, locale31);
        calendar17.setTimeZone(timeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar32", (calendar15.compareTo(calendar32) == 0) == calendar15.equals(calendar32));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) instant12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = instant12.toMutableDateTime(dateTimeZone15);
        int int17 = mutableDateTime16.getMillisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        timeZone1.setID("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) instant12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = instant12.toMutableDateTime(dateTimeZone15);
        java.lang.String str17 = mutableDateTime16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        timeZone1.setRawOffset(21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        mutableDateTime1.setMonthOfYear(1);
        mutableDateTime1.addWeekyears(4);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone8);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now();
        int int13 = localTime12.size();
        org.joda.time.LocalTime.Property property14 = localTime12.minuteOfHour();
        org.joda.time.LocalTime localTime16 = property14.addCopy((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean18 = localTime16.isSupported(dateTimeFieldType17);
        mutableDateTime10.set(dateTimeFieldType17, 321);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromCalendarFields(calendar30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        java.lang.String str20 = durationField19.getName();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property24 = localDate21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        long long29 = durationField26.add((long) 2, (int) (byte) 0);
        long long32 = durationField26.subtract((long) 12, (int) (byte) 100);
        int int33 = durationField19.compareTo(durationField26);
        org.joda.time.DurationFieldType durationFieldType34 = durationField26.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField26, and durationField19", !(durationField19.compareTo(durationField26) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField26.compareTo(durationField19))));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime3.plusMinutes(7);
        org.joda.time.DateTime dateTime18 = dateTime3.plus((-2316956400000000L));
        java.util.GregorianCalendar gregorianCalendar19 = dateTime18.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.lang.String str9 = locale4.getISO3Country();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds(208);
        int int13 = instant6.compareTo((org.joda.time.ReadableInstant) dateTime8);
        boolean boolean15 = dateTime8.isEqual((long) 594);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTimeField dateTimeField14 = property5.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.weekOfWeekyear();
        mutableDateTime3.addMonths(301);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property8 = localDate7.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean10 = localDate7.isSupported(dateTimeFieldType9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.property(dateTimeFieldType9);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight13.toMutableDateTime();
        int int15 = mutableDateTime14.getYearOfEra();
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.months();
        mutablePeriod19.set(durationFieldType20, (int) 'a');
        mutablePeriod19.addHours((int) (byte) -1);
        mutablePeriod19.addYears(2022);
        mutableDateTime14.add((org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight30.toMutableDateTime();
        mutableDateTime31.add((long) 1);
        org.joda.time.DateTime dateTime34 = mutableDateTime31.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.years();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime31, readableDuration35, periodType36);
        java.lang.String str38 = mutableDateTime31.toString();
        org.joda.time.Chronology chronology39 = mutableDateTime31.getChronology();
        mutablePeriod19.setPeriod(32L, (long) (short) -1, chronology39);
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight((long) 476, chronology39);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType9.getField(chronology39);
        org.joda.time.DurationField durationField43 = chronology39.eras();
        org.joda.time.DurationField durationField44 = chronology39.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField44, and durationField43", !(durationField43.compareTo(durationField44) == 0) || (Math.signum(durationField43.compareTo(durationField43)) == Math.signum(durationField44.compareTo(durationField43))));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.Interval interval4 = localDate0.toInterval(dateTimeZone3);
        long long7 = dateTimeZone3.adjustOffset((long) 2, true);
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone3);
        org.joda.time.Instant instant9 = dateMidnight8.toInstant();
        org.joda.time.DateMidnight.Property property10 = dateMidnight8.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight11 = property10.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and instant9", (dateMidnight8.compareTo(instant9) == 0) == dateMidnight8.equals(instant9));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getWeekyear();
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) 0);
        java.lang.String str5 = duration4.toString();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration9 = duration4.withDurationAdded((long) (-1), 0);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Interval interval23 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType27);
        int int29 = mutablePeriod28.getMonths();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(readableInstant24, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime34 = dateTime32.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property35 = dateTime34.dayOfMonth();
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType38);
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType42);
        mutablePeriod39.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod43);
        java.lang.String str45 = mutablePeriod39.toString();
        org.joda.time.Interval interval46 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime34, (org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Interval interval48 = interval46.withDurationAfterStart(readableDuration47);
        boolean boolean49 = interval30.isBefore((org.joda.time.ReadableInterval) interval46);
        org.joda.time.Chronology chronology50 = interval46.getChronology();
        org.joda.time.ReadableInterval readableInterval51 = null;
        org.joda.time.Interval interval52 = interval46.gap(readableInterval51);
        org.joda.time.Interval interval53 = interval23.gap(readableInterval51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        java.lang.String str8 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        org.joda.time.Instant instant10 = mutableDateTime1.toInstant();
        mutableDateTime1.setYear(410);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant10", (dateTime4.compareTo(instant10) == 0) == dateTime4.equals(instant10));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        timeZone1.setRawOffset(1439);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime3.plusMinutes(7);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 53715795);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone11);
        mutableDateTime12.add((long) 21);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getRangeDurationType();
        mutableDateTime12.set(dateTimeFieldType15, 53);
        boolean boolean19 = locale4.equals((java.lang.Object) dateTimeFieldType15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology7);
        org.joda.time.YearMonthDay yearMonthDay21 = dateTime20.toYearMonthDay();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime26 = dateMidnight25.toMutableDateTime();
        mutableDateTime26.add((long) 1);
        org.joda.time.DateTime dateTime29 = mutableDateTime26.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.era();
        boolean boolean31 = mutableDateTime26.isSupported(dateTimeFieldType30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime26.hourOfDay();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        int int38 = mutablePeriod37.getMonths();
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableInstant33, (org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.Chronology chronology40 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.weekyearOfCentury();
        long long43 = dateTimeField41.roundHalfFloor((long) 1);
        mutableDateTime26.setRounding(dateTimeField41, (int) (byte) 0);
        int int46 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) mutableDateTime26);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        java.lang.String str52 = dateTimeZone48.getShortName((long) 53700000);
        java.lang.String str53 = dateTimeZone48.getID();
        mutableDateTime26.setZone(dateTimeZone48);
        org.joda.time.DateTime dateTime55 = yearMonthDay21.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime58 = dateTime56.withCenturyOfEra(476);
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime60 = dateMidnight59.toMutableDateTime();
        mutableDateTime60.add((long) 1);
        org.joda.time.DateTime dateTime63 = mutableDateTime60.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.years();
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime60, readableDuration64, periodType65);
        org.joda.time.ReadableInstant readableInstant67 = null;
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType70);
        int int72 = mutablePeriod71.getMonths();
        org.joda.time.Interval interval73 = new org.joda.time.Interval(readableInstant67, (org.joda.time.ReadablePeriod) mutablePeriod71);
        org.joda.time.Chronology chronology74 = interval73.getChronology();
        org.joda.time.YearMonthDay yearMonthDay75 = new org.joda.time.YearMonthDay(chronology74);
        org.joda.time.DurationField durationField76 = chronology74.weeks();
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(chronology74);
        mutableDateTime60.setChronology(chronology74);
        org.joda.time.DurationField durationField79 = chronology74.hours();
        org.joda.time.DateTimeField dateTimeField80 = chronology74.secondOfMinute();
        org.joda.time.DateTime dateTime81 = dateTime56.toDateTime(chronology74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField76", Math.signum(durationField19.compareTo(durationField76)) == -Math.signum(durationField76.compareTo(durationField19)));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime3.plusMinutes(7);
        org.joda.time.DateTime dateTime18 = dateTime3.plus((-2316956400000000L));
        int int19 = dateTime3.getYear();
        org.joda.time.DateTime dateTime21 = dateTime3.plus((long) 301);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime27 = property26.roundCeilingCopy();
        org.joda.time.DateTime dateTime28 = property26.roundHalfFloorCopy();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        org.joda.time.DateTime dateTime33 = mutableDateTime30.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.years();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime30, readableDuration34, periodType35);
        org.joda.time.Chronology chronology37 = mutableDateTime30.getChronology();
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(chronology37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime42 = dateTime40.withDayOfYear((int) (byte) 1);
        int int43 = dateTime42.getDayOfMonth();
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime46 = dateTime42.minus((org.joda.time.ReadableDuration) duration45);
        mutableDateTime38.add((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration49 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean50 = duration45.isShorterThan((org.joda.time.ReadableDuration) duration49);
        org.joda.time.Days days51 = duration49.toStandardDays();
        org.joda.time.Period period53 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period55 = period53.minusYears(8);
        org.joda.time.Period period57 = period53.withSeconds(11);
        org.joda.time.PeriodType periodType58 = period53.getPeriodType();
        org.joda.time.PeriodType periodType59 = periodType58.withHoursRemoved();
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadableDuration) duration49, periodType58);
        org.joda.time.Period period62 = period60.withSeconds((int) (byte) 0);
        org.joda.time.DateTime dateTime64 = dateTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period60, 53774237);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.Chronology chronology7 = localTime5.getChronology();
        java.util.Locale locale8 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar9);
        org.joda.time.LocalTime localTime12 = localTime10.minusMillis(517);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        mutablePeriod21.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        java.lang.String str27 = mutablePeriod21.toString();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int int29 = mutablePeriod21.getMonths();
        int[] intArray30 = mutablePeriod21.getValues();
        chronology7.validate((org.joda.time.ReadablePartial) localTime12, intArray30);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology7);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime37 = dateTime36.toLocalTime();
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.now();
        int int39 = localTime37.compareTo((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime41 = dateMidnight40.toMutableDateTime();
        int int42 = mutableDateTime41.getYearOfEra();
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.months();
        mutablePeriod46.set(durationFieldType47, (int) 'a');
        mutablePeriod46.addHours((int) (byte) -1);
        mutablePeriod46.addYears(2022);
        mutableDateTime41.add((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.LocalTime localTime55 = localTime38.plus((org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.LocalTime localTime57 = localTime55.plusSeconds(100);
        org.joda.time.LocalTime.Property property58 = localTime57.hourOfDay();
        org.joda.time.Chronology chronology59 = localTime57.getChronology();
        mutableDateTime34.setChronology(chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight32 and dateMidnight40", (dateMidnight32.compareTo(dateMidnight40) == 0) == dateMidnight32.equals(dateMidnight40));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusWeeks((int) (byte) -1);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight9.toMutableDateTime();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.DateTime dateTime12 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime15 = dateTime7.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime1.toDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime15", (dateTime7.compareTo(dateTime15) == 0) == dateTime7.equals(dateTime15));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        int int6 = mutablePeriod5.getMonths();
        org.joda.time.Interval interval7 = new org.joda.time.Interval(readableInstant1, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) '4', chronology8);
        java.util.Date date10 = localDate9.toDate();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfCentury();
        boolean boolean17 = dateMidnight14.isBefore((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DateMidnight.Property property19 = dateMidnight14.property(dateTimeFieldType18);
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight20.toMutableDateTime();
        java.lang.String str22 = mutableDateTime21.toString();
        mutableDateTime21.setMonthOfYear(1);
        mutableDateTime21.addWeekyears(4);
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now(dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = mutableDateTime21.toMutableDateTime(dateTimeZone28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = localDate13.toDateTimeAtStartOfDay(dateTimeZone28);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType39 = periodType38.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType43);
        int int45 = mutablePeriod44.getMonths();
        org.joda.time.Interval interval46 = new org.joda.time.Interval(readableInstant40, (org.joda.time.ReadablePeriod) mutablePeriod44);
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(chronology47);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType52);
        int int54 = mutablePeriod53.getMonths();
        org.joda.time.Interval interval55 = new org.joda.time.Interval(readableInstant49, (org.joda.time.ReadablePeriod) mutablePeriod53);
        int[] intArray58 = chronology47.get((org.joda.time.ReadablePeriod) mutablePeriod53, 1L, (long) 4);
        org.joda.time.Period period59 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType38, chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter35.withChronology(chronology47);
        boolean boolean61 = dateTimeFormatter35.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter35.withZoneUTC();
        boolean boolean63 = dateTimeFormatter62.isParser();
        org.joda.time.Chronology chronology64 = dateTimeFormatter62.getChronolgy();
        org.joda.time.DateTimeZone dateTimeZone65 = dateTimeFormatter62.getZone();
        org.joda.time.DateTime dateTime66 = dateTime32.withZoneRetainFields(dateTimeZone65);
        org.joda.time.DateMidnight dateMidnight67 = localDate9.toDateMidnight(dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateTime66", (dateMidnight14.compareTo(dateTime66) == 0) == dateMidnight14.equals(dateTime66));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        java.lang.String str20 = durationField19.getName();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property24 = localDate21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        long long29 = durationField26.add((long) 2, (int) (byte) 0);
        long long32 = durationField26.subtract((long) 12, (int) (byte) 100);
        int int33 = durationField19.compareTo(durationField26);
        long long36 = durationField26.getDifferenceAsLong((long) 292278993, (long) 53728944);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField26, and durationField19", !(durationField19.compareTo(durationField26) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField26.compareTo(durationField19))));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.util.TimeZone.setDefault(timeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Period period7 = new org.joda.time.Period();
        org.joda.time.Interval interval8 = interval6.withPeriodAfterStart((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology10 = dateMidnight9.getChronology();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withDayOfMonth(8);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        mutablePeriod21.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod25);
        java.lang.String str27 = mutablePeriod21.toString();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.setValue(0, 2022);
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod21.setPeriod((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) (byte) 0);
        long long37 = duration36.getMillis();
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) (byte) 0);
        long long40 = duration39.getMillis();
        int int41 = duration36.compareTo((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration43 = duration33.withDurationAdded((org.joda.time.ReadableDuration) duration39, 2);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight12.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight45.toMutableDateTime();
        mutableDateTime46.add((long) 1);
        org.joda.time.DateTime dateTime49 = mutableDateTime46.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.years();
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime46, readableDuration50, periodType51);
        org.joda.time.Chronology chronology53 = mutableDateTime46.getChronology();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology53);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime58 = dateTime56.withDayOfYear((int) (byte) 1);
        int int59 = dateTime58.getDayOfMonth();
        org.joda.time.Duration duration61 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime62 = dateTime58.minus((org.joda.time.ReadableDuration) duration61);
        mutableDateTime54.add((org.joda.time.ReadableDuration) duration61);
        org.joda.time.Duration duration64 = duration43.plus((org.joda.time.ReadableDuration) duration61);
        java.lang.String str65 = duration43.toString();
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime67 = dateMidnight66.toMutableDateTime();
        mutableDateTime67.add((long) 1);
        org.joda.time.DateTime dateTime70 = mutableDateTime67.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.years();
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime67, readableDuration71, periodType72);
        java.lang.String str74 = mutableDateTime67.toString();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime67.millisOfSecond();
        org.joda.time.Instant instant76 = mutableDateTime67.toInstant();
        org.joda.time.Interval interval77 = duration43.toIntervalFrom((org.joda.time.ReadableInstant) instant76);
        boolean boolean78 = interval6.isBefore((org.joda.time.ReadableInterval) interval77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime46 and instant76", (mutableDateTime46.compareTo(instant76) == 0) == mutableDateTime46.equals(instant76));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        calendar9.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        int int19 = timeZone18.getRawOffset();
        int int20 = timeZone18.getRawOffset();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18, locale21);
        java.util.Calendar.Builder builder23 = builder7.setTimeZone(timeZone18);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone18);
        java.lang.Object obj25 = timeZone18.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar24", (calendar22.compareTo(calendar24) == 0) == calendar22.equals(calendar24));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology4 = dateMidnight3.getChronology();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfMonth(8);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        mutablePeriod15.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        java.lang.String str21 = mutablePeriod15.toString();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadablePeriod) mutablePeriod15);
        mutablePeriod15.setValue(0, 2022);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod15.setPeriod((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) 0);
        long long31 = duration30.getMillis();
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) (byte) 0);
        long long34 = duration33.getMillis();
        int int35 = duration30.compareTo((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration37 = duration27.withDurationAdded((org.joda.time.ReadableDuration) duration33, 2);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight6.minus((org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime40 = dateMidnight39.toMutableDateTime();
        mutableDateTime40.add((long) 1);
        org.joda.time.DateTime dateTime43 = mutableDateTime40.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.PeriodType periodType45 = org.joda.time.PeriodType.years();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime40, readableDuration44, periodType45);
        org.joda.time.Chronology chronology47 = mutableDateTime40.getChronology();
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(chronology47);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime52 = dateTime50.withDayOfYear((int) (byte) 1);
        int int53 = dateTime52.getDayOfMonth();
        org.joda.time.Duration duration55 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime56 = dateTime52.minus((org.joda.time.ReadableDuration) duration55);
        mutableDateTime48.add((org.joda.time.ReadableDuration) duration55);
        org.joda.time.Duration duration58 = duration37.plus((org.joda.time.ReadableDuration) duration55);
        java.lang.String str59 = duration37.toString();
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime61 = dateMidnight60.toMutableDateTime();
        mutableDateTime61.add((long) 1);
        org.joda.time.DateTime dateTime64 = mutableDateTime61.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.years();
        org.joda.time.Period period67 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime61, readableDuration65, periodType66);
        java.lang.String str68 = mutableDateTime61.toString();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime61.millisOfSecond();
        org.joda.time.Instant instant70 = mutableDateTime61.toInstant();
        org.joda.time.Interval interval71 = duration37.toIntervalFrom((org.joda.time.ReadableInstant) instant70);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime40 and instant70", (mutableDateTime40.compareTo(instant70) == 0) == mutableDateTime40.equals(instant70));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getWeekyear();
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) 0);
        java.lang.String str5 = duration4.toString();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration9 = duration4.withDurationAdded((long) (-1), 0);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Interval interval23 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.now();
        int int3 = localTime2.size();
        org.joda.time.LocalTime.Property property4 = localTime2.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property4.addCopy((int) (short) 100);
        boolean boolean7 = mutableDateTime1.equals((java.lang.Object) (short) 100);
        boolean boolean9 = mutableDateTime1.isEqual((long) (byte) 0);
        int int10 = mutableDateTime1.getMillisOfDay();
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology12 = dateMidnight11.getChronology();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withDayOfMonth(8);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        mutablePeriod23.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod27);
        java.lang.String str29 = mutablePeriod23.toString();
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime18, (org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.setValue(0, 2022);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod23.setPeriod((org.joda.time.ReadableDuration) duration35);
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) (byte) 0);
        long long39 = duration38.getMillis();
        org.joda.time.Duration duration41 = new org.joda.time.Duration((long) (byte) 0);
        long long42 = duration41.getMillis();
        int int43 = duration38.compareTo((org.joda.time.ReadableDuration) duration41);
        org.joda.time.Duration duration45 = duration35.withDurationAdded((org.joda.time.ReadableDuration) duration41, 2);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight14.minus((org.joda.time.ReadableDuration) duration45);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight47.toMutableDateTime();
        mutableDateTime48.add((long) 1);
        org.joda.time.DateTime dateTime51 = mutableDateTime48.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.years();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime48, readableDuration52, periodType53);
        org.joda.time.Chronology chronology55 = mutableDateTime48.getChronology();
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(chronology55);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime60 = dateTime58.withDayOfYear((int) (byte) 1);
        int int61 = dateTime60.getDayOfMonth();
        org.joda.time.Duration duration63 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime64 = dateTime60.minus((org.joda.time.ReadableDuration) duration63);
        mutableDateTime56.add((org.joda.time.ReadableDuration) duration63);
        org.joda.time.Duration duration66 = duration45.plus((org.joda.time.ReadableDuration) duration63);
        java.lang.String str67 = duration45.toString();
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime69 = dateMidnight68.toMutableDateTime();
        mutableDateTime69.add((long) 1);
        org.joda.time.DateTime dateTime72 = mutableDateTime69.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.PeriodType periodType74 = org.joda.time.PeriodType.years();
        org.joda.time.Period period75 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime69, readableDuration73, periodType74);
        java.lang.String str76 = mutableDateTime69.toString();
        org.joda.time.MutableDateTime.Property property77 = mutableDateTime69.millisOfSecond();
        org.joda.time.Instant instant78 = mutableDateTime69.toInstant();
        org.joda.time.Interval interval79 = duration45.toIntervalFrom((org.joda.time.ReadableInstant) instant78);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime48 and instant78", (mutableDateTime48.compareTo(instant78) == 0) == mutableDateTime48.equals(instant78));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone10, locale14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        int int20 = timeZone10.getOffset((long) 314);
        timeZone10.setRawOffset(53704400);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar17", (calendar15.compareTo(calendar17) == 0) == calendar15.equals(calendar17));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) (byte) 1);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((org.joda.time.ReadableDuration) duration16);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = duration16.toPeriod();
        org.joda.time.Period period23 = duration16.toPeriod();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours((int) (byte) 100);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.Period period32 = duration16.toPeriodTo((org.joda.time.ReadableInstant) dateTime27, periodType31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime27.toMutableDateTime();
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.fromCalendarFields(calendar35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusHours((int) (short) 0);
        int int39 = localDateTime38.getCenturyOfEra();
        java.util.Locale locale40 = java.util.Locale.PRC;
        java.util.Calendar calendar41 = java.util.Calendar.getInstance(locale40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.fromCalendarFields(calendar41);
        calendar41.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone50 = calendar41.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTime dateTime52 = localDateTime38.toDateTime(dateTimeZone51);
        int int53 = dateTime52.getMonthOfYear();
        org.joda.time.DateTime dateTime55 = dateTime52.withSecondOfMinute(56);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) dateTime55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime52", (mutableDateTime9.compareTo(dateTime52) == 0) == mutableDateTime9.equals(dateTime52));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology4 = dateMidnight3.getChronology();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfMonth(8);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime10.plusSeconds(10);
        org.joda.time.DateTime dateTime15 = dateTime10.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        int int18 = dateMidnight3.get(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.property(dateTimeFieldType16);
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType21 = periodType20.withSecondsRemoved();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.hours();
        int int23 = periodType21.indexOf(durationFieldType22);
        mutableDateTime1.add(durationFieldType22, (int) ' ');
        mutableDateTime1.addWeeks(1969);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfYear((int) (byte) 1);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime31, (org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateTime dateTime37 = dateTime31.plusYears((-1));
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfYear();
        org.joda.time.DateMidnight dateMidnight40 = localDate38.toDateMidnight();
        org.joda.time.Chronology chronology41 = localDate38.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime31.withChronology(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime31.plusMinutes(7);
        org.joda.time.DateTime dateTime46 = dateTime31.plus((-2316956400000000L));
        int int47 = dateTime31.getYear();
        org.joda.time.DateTime dateTime49 = dateTime31.plus((long) 301);
        boolean boolean51 = dateTime31.isEqual((long) 53713732);
        int int52 = dateTime31.getSecondOfMinute();
        boolean boolean53 = mutableDateTime1.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime42", (dateTime10.compareTo(dateTime42) == 0) == dateTime10.equals(dateTime42));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.lang.String str9 = locale4.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.DateTime dateTime14 = dateTime3.withChronology(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime3.plusMinutes(7);
        org.joda.time.DateTime dateTime18 = dateTime3.plus((-2316956400000000L));
        int int19 = dateTime3.getYear();
        org.joda.time.DateTime dateTime21 = dateTime3.plus((long) 301);
        boolean boolean23 = dateTime3.isEqual((long) 53713732);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime25 = dateMidnight24.toMutableDateTime();
        mutableDateTime25.add((long) 1);
        org.joda.time.DateTime dateTime28 = mutableDateTime25.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.years();
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime25, readableDuration29, periodType30);
        org.joda.time.Chronology chronology32 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime33 = org.joda.time.MutableDateTime.now(chronology32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfYear((int) (byte) 1);
        int int38 = dateTime37.getDayOfMonth();
        org.joda.time.Duration duration40 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime41 = dateTime37.minus((org.joda.time.ReadableDuration) duration40);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration40);
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean45 = duration40.isShorterThan((org.joda.time.ReadableDuration) duration44);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType48 = periodType47.withYearsRemoved();
        org.joda.time.Period period49 = new org.joda.time.Period((-1725048060000L), periodType48);
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration40, periodType48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime37", (dateTime14.compareTo(dateTime37) == 0) == dateTime14.equals(dateTime37));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getYearOfEra();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        mutablePeriod6.set(durationFieldType7, (int) 'a');
        mutablePeriod6.addHours((int) (byte) -1);
        mutablePeriod6.addYears(2022);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6);
        mutableDateTime1.addMinutes((int) (byte) 100);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        mutableDateTime18.add((long) 1);
        org.joda.time.DateTime dateTime21 = mutableDateTime18.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.years();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime18, readableDuration22, periodType23);
        org.joda.time.Chronology chronology25 = mutableDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now(chronology25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime30 = dateTime28.withDayOfYear((int) (byte) 1);
        int int31 = dateTime30.getDayOfMonth();
        org.joda.time.Duration duration33 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime34 = dateTime30.minus((org.joda.time.ReadableDuration) duration33);
        mutableDateTime26.add((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Duration duration37 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean38 = duration33.isShorterThan((org.joda.time.ReadableDuration) duration37);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableDuration) duration37);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime43 = dateTime41.withDayOfYear((int) (byte) 1);
        int int44 = dateTime43.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime46 = dateMidnight45.toMutableDateTime();
        org.joda.time.Interval interval47 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime43, (org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.DateTime dateTime49 = dateTime43.plusYears((-1));
        org.joda.time.LocalDate localDate50 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property51 = localDate50.dayOfYear();
        org.joda.time.DateMidnight dateMidnight52 = localDate50.toDateMidnight();
        org.joda.time.Chronology chronology53 = localDate50.getChronology();
        org.joda.time.DateTime dateTime54 = dateTime43.withChronology(chronology53);
        boolean boolean55 = duration37.equals((java.lang.Object) dateTime43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime54", (dateTime30.compareTo(dateTime54) == 0) == dateTime30.equals(dateTime54));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        calendar9.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        int int19 = timeZone18.getRawOffset();
        int int20 = timeZone18.getRawOffset();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18, locale21);
        java.util.Calendar.Builder builder23 = builder7.setTimeZone(timeZone18);
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromCalendarFields(calendar25);
        calendar25.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone34 = calendar25.getTimeZone();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime38 = dateTime36.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property39 = dateTime38.dayOfMonth();
        org.joda.time.DateTime dateTime41 = dateTime38.plusSeconds(10);
        org.joda.time.DateTime.Property property42 = dateTime41.year();
        org.joda.time.DateTime dateTime43 = property42.roundHalfCeilingCopy();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.util.Locale locale45 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        java.lang.String str47 = locale44.getDisplayVariant(locale45);
        int int48 = property42.getMaximumTextLength(locale45);
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone34, locale45);
        java.util.Calendar.Builder builder50 = builder23.setTimeZone(timeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar46", (calendar22.compareTo(calendar46) == 0) == calendar22.equals(calendar46));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        java.lang.String str20 = durationField19.getName();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property24 = localDate21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        long long29 = durationField26.add((long) 2, (int) (byte) 0);
        long long32 = durationField26.subtract((long) 12, (int) (byte) 100);
        int int33 = durationField19.compareTo(durationField26);
        long long35 = durationField26.getMillis(53820000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField26, and durationField19", !(durationField19.compareTo(durationField26) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField26.compareTo(durationField19))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.Period period2 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period4 = period2.minusYears(8);
        org.joda.time.Period period6 = period2.withSeconds(11);
        org.joda.time.PeriodType periodType7 = period2.getPeriodType();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.PeriodType periodType9 = periodType7.withSecondsRemoved();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime11, readableDuration15, periodType16);
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType7, chronology18);
        org.joda.time.Period period22 = org.joda.time.Period.seconds(15);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusMinutes((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.centuries();
        boolean boolean31 = localDateTime27.isSupported(durationFieldType30);
        org.joda.time.Period period33 = period22.withField(durationFieldType30, (int) (byte) 0);
        boolean boolean34 = mutablePeriod20.isSupported(durationFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime19 and dateTime26", (mutableDateTime19.compareTo(dateTime26) == 0) == mutableDateTime19.equals(dateTime26));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        int int3 = mutableDateTime1.getWeekyear();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.minusMonths((int) (short) -1);
        int int15 = yearMonthDay12.size();
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.year();
        java.util.Locale locale17 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale17);
        int int20 = property16.getMaximumShortTextLength(locale17);
        org.joda.time.YearMonthDay yearMonthDay21 = property16.withMaximumValue();
        int int22 = property16.get();
        org.joda.time.YearMonthDay yearMonthDay24 = property16.addToCopy(134);
        org.joda.time.YearMonthDay.Property property25 = yearMonthDay24.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay27 = property25.addWrapFieldToCopy(476);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        mutableDateTime1.setChronology(chronology28);
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and mutableDateTime1", (dateMidnight0.compareTo(mutableDateTime1) == 0) == dateMidnight0.equals(mutableDateTime1));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withDayOfMonth(8);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        mutablePeriod12.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        java.lang.String str18 = mutablePeriod12.toString();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.setValue(0, 2022);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) 0);
        long long28 = duration27.getMillis();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) 0);
        long long31 = duration30.getMillis();
        int int32 = duration27.compareTo((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration34 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration30, 2);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight3.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight36.toMutableDateTime();
        mutableDateTime37.add((long) 1);
        org.joda.time.DateTime dateTime40 = mutableDateTime37.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.years();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime37, readableDuration41, periodType42);
        org.joda.time.Chronology chronology44 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime49 = dateTime47.withDayOfYear((int) (byte) 1);
        int int50 = dateTime49.getDayOfMonth();
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime53 = dateTime49.minus((org.joda.time.ReadableDuration) duration52);
        mutableDateTime45.add((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration55 = duration34.plus((org.joda.time.ReadableDuration) duration52);
        java.lang.String str56 = duration34.toString();
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime58 = dateMidnight57.toMutableDateTime();
        mutableDateTime58.add((long) 1);
        org.joda.time.DateTime dateTime61 = mutableDateTime58.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.PeriodType periodType63 = org.joda.time.PeriodType.years();
        org.joda.time.Period period64 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime58, readableDuration62, periodType63);
        java.lang.String str65 = mutableDateTime58.toString();
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime58.millisOfSecond();
        org.joda.time.Instant instant67 = mutableDateTime58.toInstant();
        org.joda.time.Interval interval68 = duration34.toIntervalFrom((org.joda.time.ReadableInstant) instant67);
        long long69 = interval68.getEndMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and instant67", (mutableDateTime37.compareTo(instant67) == 0) == mutableDateTime37.equals(instant67));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTime.Property property24 = dateTime22.property(dateTimeFieldType23);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime26 = dateMidnight25.toMutableDateTime();
        mutableDateTime26.add((long) 1);
        mutableDateTime26.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime26.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration32 = null;
        mutableDateTime26.add(readableDuration32, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        mutableDateTime36.add((long) 1);
        org.joda.time.DateTime dateTime39 = mutableDateTime36.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.years();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime36, readableDuration40, periodType41);
        org.joda.time.Chronology chronology43 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfHalfday();
        org.joda.time.DurationField durationField45 = chronology43.halfdays();
        mutableDateTime26.setChronology(chronology43);
        org.joda.time.DateTimeField dateTimeField47 = chronology43.secondOfDay();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType23.getField(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField45", Math.signum(durationField19.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField19)));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        int int5 = dateTime4.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime7 = dateMidnight6.toMutableDateTime();
        org.joda.time.Interval interval8 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) mutableDateTime7);
        org.joda.time.DateTime dateTime9 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime12 = dateTime4.withZoneRetainFields(dateTimeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(1645455274939L, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime12", (dateTime4.compareTo(dateTime12) == 0) == dateTime4.equals(dateTime12));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = property3.addToCopy((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight6 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getShortName((long) 6);
        java.lang.String str17 = dateTimeZone11.getNameKey((long) 448);
        org.joda.time.DateTime dateTime18 = dateMidnight8.toDateTime(dateTimeZone11);
        java.util.TimeZone timeZone19 = dateTimeZone11.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime18", (dateMidnight2.compareTo(dateTime18) == 0) == dateMidnight2.equals(dateTime18));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withEra(1);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(32772);
        org.joda.time.DateTime.Property property7 = dateTime1.hourOfDay();
        int int8 = property7.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTime dateTime10 = property7.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale16);
        java.lang.String str18 = locale15.getDisplayVariant(locale16);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone14, locale15);
        int int20 = property7.getMaximumShortTextLength(locale15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar19", (calendar17.compareTo(calendar19) == 0) == calendar17.equals(calendar19));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(1L, dateTimeZone3);
        boolean boolean5 = calendar1.before((java.lang.Object) localDate4);
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
        timeZone6.setRawOffset(893);
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withCenturyOfEra(365);
        int int15 = localDateTime14.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int17 = localDateTime14.get(dateTimeFieldType16);
        java.util.Date date18 = localDateTime14.toDate();
        java.lang.String str19 = date18.toLocaleString();
        boolean boolean20 = timeZone6.inDaylightTime(date18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar10", (calendar1.compareTo(calendar10) == 0) == calendar1.equals(calendar10));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getWeekyear();
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) 0);
        java.lang.String str5 = duration4.toString();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration9 = duration4.withDurationAdded((long) (-1), 0);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Interval interval23 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Hours hours24 = duration9.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getWeekyear();
        org.joda.time.Duration duration4 = new org.joda.time.Duration((long) (byte) 0);
        java.lang.String str5 = duration4.toString();
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration4);
        org.joda.time.Duration duration9 = duration4.withDurationAdded((long) (-1), 0);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        int int16 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime22 = dateTime18.toDateTime(dateTimeZone21);
        org.joda.time.Interval interval23 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.plusYears((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        mutableDateTime30.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.dayOfWeek();
        int int36 = dateMidnight24.compareTo((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.years();
        java.lang.String str38 = periodType37.toString();
        org.joda.time.PeriodType periodType39 = periodType37.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType46);
        org.joda.time.DurationFieldType durationFieldType48 = org.joda.time.DurationFieldType.months();
        mutablePeriod47.set(durationFieldType48, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.months();
        boolean boolean52 = mutablePeriod47.isSupported(durationFieldType51);
        int int53 = mutablePeriod43.indexOf(durationFieldType51);
        java.lang.String str54 = durationFieldType51.getName();
        int int55 = mutablePeriod41.get(durationFieldType51);
        boolean boolean56 = periodType39.isSupported(durationFieldType51);
        org.joda.time.Period period57 = duration9.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime30, periodType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime22", (dateTime17.compareTo(dateTime22) == 0) == dateTime17.equals(dateTime22));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.plusSeconds(10);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.DateTime dateTime19 = property18.roundHalfCeilingCopy();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        int int24 = property18.getMaximumTextLength(locale21);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone10, locale21);
        java.util.Locale locale26 = locale21.stripExtensions();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone28);
        java.util.TimeZone.setDefault(timeZone28);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        calendar32.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone41 = calendar32.getTimeZone();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime45 = dateTime43.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime45.plusSeconds(10);
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        org.joda.time.DateTime dateTime50 = property49.roundHalfCeilingCopy();
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale52);
        java.lang.String str54 = locale51.getDisplayVariant(locale52);
        int int55 = property49.getMaximumTextLength(locale52);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone41, locale52);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone28, locale52);
        java.lang.String str58 = locale21.getDisplayScript(locale52);
        java.lang.String str59 = locale21.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar32", (calendar1.compareTo(calendar32) == 0) == calendar1.equals(calendar32));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime1.add(readableDuration7, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime11, readableDuration15, periodType16);
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        mutableDateTime1.setChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.secondOfDay();
        org.joda.time.DurationField durationField23 = chronology18.years();
        int int26 = durationField23.getDifference((long) 53760000, (long) (-14));
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType30);
        int int32 = mutablePeriod31.getMonths();
        org.joda.time.Interval interval33 = new org.joda.time.Interval(readableInstant27, (org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(chronology34);
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType39);
        int int41 = mutablePeriod40.getMonths();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableInstant36, (org.joda.time.ReadablePeriod) mutablePeriod40);
        int[] intArray45 = chronology34.get((org.joda.time.ReadablePeriod) mutablePeriod40, 1L, (long) 4);
        org.joda.time.DurationField durationField46 = chronology34.eras();
        java.lang.String str47 = durationField46.getName();
        org.joda.time.LocalDate localDate48 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        boolean boolean50 = localDate48.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDate.Property property51 = localDate48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField52 = property51.getField();
        org.joda.time.DurationField durationField53 = property51.getDurationField();
        long long56 = durationField53.add((long) 2, (int) (byte) 0);
        long long59 = durationField53.subtract((long) 12, (int) (byte) 100);
        int int60 = durationField46.compareTo(durationField53);
        int int61 = durationField23.compareTo(durationField46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField46, durationField20, and durationField23", !(durationField46.compareTo(durationField20) == 0) || (Math.signum(durationField46.compareTo(durationField23)) == Math.signum(durationField20.compareTo(durationField23))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone10, locale14);
        int int19 = timeZone10.getOffset((long) 53758767);
        timeZone10.setID("weekyear");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar17", (calendar15.compareTo(calendar17) == 0) == calendar15.equals(calendar17));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.plusSeconds(10);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.DateTime dateTime19 = property18.roundHalfCeilingCopy();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        int int24 = property18.getMaximumTextLength(locale21);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone10, locale21);
        timeZone10.setRawOffset(597);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar25", (calendar22.compareTo(calendar25) == 0) == calendar22.equals(calendar25));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int12 = timeZone10.getOffset(22L);
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        java.util.Locale locale17 = locale14.stripExtensions();
        java.lang.String str18 = locale14.getDisplayScript();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone10, locale14);
        timeZone10.setRawOffset(609);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar19", (calendar15.compareTo(calendar19) == 0) == calendar15.equals(calendar19));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) (byte) 1);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((org.joda.time.ReadableDuration) duration16);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        int int28 = mutablePeriod27.getMonths();
        org.joda.time.Interval interval29 = new org.joda.time.Interval(readableInstant23, (org.joda.time.ReadablePeriod) mutablePeriod27);
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 10, chronology30);
        org.joda.time.Period period33 = duration16.toPeriod(chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.era();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.centuryOfEra();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((-31449600001L));
        int int38 = dateTimeField35.getMinimumValue((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.Interval interval42 = localDate37.toInterval(dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime41", (mutableDateTime9.compareTo(dateTime41) == 0) == mutableDateTime9.equals(dateTime41));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfWeek(7);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight0.withCenturyOfEra(21);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusDays((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight9.toMutableDateTime();
        mutableDateTime10.add((long) 1);
        org.joda.time.DateTime dateTime13 = mutableDateTime10.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime10, readableDuration14, periodType15);
        org.joda.time.Chronology chronology17 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfYear((int) (byte) 1);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((org.joda.time.ReadableDuration) duration25);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        int int37 = mutablePeriod36.getMonths();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableInstant32, (org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 10, chronology39);
        org.joda.time.Period period42 = duration25.toPeriod(chronology39);
        org.joda.time.Duration duration43 = duration25.toDuration();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime45 = dateMidnight8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(517);
        long long50 = dateTimeZone47.adjustOffset(19691596800000L, false);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime45.toMutableDateTime(dateTimeZone47);
        java.lang.String str52 = dateTimeZone47.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and mutableDateTime51", (dateMidnight8.compareTo(mutableDateTime51) == 0) == dateMidnight8.equals(mutableDateTime51));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = property3.addToCopy((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight6 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getShortName((long) 6);
        java.lang.String str17 = dateTimeZone11.getNameKey((long) 448);
        org.joda.time.DateTime dateTime18 = dateMidnight8.toDateTime(dateTimeZone11);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType23 = periodType22.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType27);
        int int29 = mutablePeriod28.getMonths();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(readableInstant24, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.YearMonthDay yearMonthDay32 = new org.joda.time.YearMonthDay(chronology31);
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        int int38 = mutablePeriod37.getMonths();
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableInstant33, (org.joda.time.ReadablePeriod) mutablePeriod37);
        int[] intArray42 = chronology31.get((org.joda.time.ReadablePeriod) mutablePeriod37, 1L, (long) 4);
        org.joda.time.Period period43 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType22, chronology31);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology31);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime48 = org.joda.time.MutableDateTime.now(dateTimeZone46);
        java.lang.String str50 = dateTimeZone46.getShortName((long) 53700000);
        java.lang.String str51 = dateTimeZone46.getID();
        int int53 = dateTimeZone46.getOffsetFromLocal(2L);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime44, dateTimeZone46);
        int int55 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateMidnight54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime18", (dateMidnight2.compareTo(dateTime18) == 0) == dateMidnight2.equals(dateTime18));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        org.joda.time.DateMidnight dateMidnight20 = org.joda.time.DateMidnight.now(chronology7);
        org.joda.time.DurationField durationField21 = chronology7.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField21, and durationField19", !(durationField19.compareTo(durationField21) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField21.compareTo(durationField19))));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.monthOfYear();
        org.joda.time.DurationField durationField11 = chronology8.eras();
        org.joda.time.DurationField durationField12 = chronology8.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField12, and durationField11", !(durationField11.compareTo(durationField12) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField12.compareTo(durationField11))));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime17 = dateTime14.plusSeconds(10);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.DateTime dateTime19 = property18.roundHalfCeilingCopy();
        java.util.Locale locale20 = java.util.Locale.CHINA;
        java.util.Locale locale21 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        int int24 = property18.getMaximumTextLength(locale21);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone10, locale21);
        java.util.Locale locale26 = locale21.stripExtensions();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone28);
        java.util.TimeZone.setDefault(timeZone28);
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        calendar32.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone41 = calendar32.getTimeZone();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime45 = dateTime43.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfMonth();
        org.joda.time.DateTime dateTime48 = dateTime45.plusSeconds(10);
        org.joda.time.DateTime.Property property49 = dateTime48.year();
        org.joda.time.DateTime dateTime50 = property49.roundHalfCeilingCopy();
        java.util.Locale locale51 = java.util.Locale.CHINA;
        java.util.Locale locale52 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale52);
        java.lang.String str54 = locale51.getDisplayVariant(locale52);
        int int55 = property49.getMaximumTextLength(locale52);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone41, locale52);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone28, locale52);
        java.lang.String str58 = locale21.getDisplayScript(locale52);
        java.lang.String str59 = locale21.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar29", (calendar22.compareTo(calendar29) == 0) == calendar22.equals(calendar29));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfWeek(7);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight0.withCenturyOfEra(21);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.plusDays((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight9.toMutableDateTime();
        mutableDateTime10.add((long) 1);
        org.joda.time.DateTime dateTime13 = mutableDateTime10.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.years();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime10, readableDuration14, periodType15);
        org.joda.time.Chronology chronology17 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfYear((int) (byte) 1);
        int int23 = dateTime22.getDayOfMonth();
        org.joda.time.Duration duration25 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((org.joda.time.ReadableDuration) duration25);
        mutableDateTime18.add((org.joda.time.ReadableDuration) duration25);
        org.joda.time.Duration duration29 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean30 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration29);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        int int37 = mutablePeriod36.getMonths();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableInstant32, (org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 10, chronology39);
        org.joda.time.Period period42 = duration25.toPeriod(chronology39);
        org.joda.time.Duration duration43 = duration25.toDuration();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight8.plus((org.joda.time.ReadableDuration) duration25);
        org.joda.time.DateTime dateTime45 = dateMidnight8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(517);
        long long50 = dateTimeZone47.adjustOffset(19691596800000L, false);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime45.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime53 = dateTime45.withCenturyOfEra(1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and mutableDateTime51", (dateMidnight8.compareTo(mutableDateTime51) == 0) == dateMidnight8.equals(mutableDateTime51));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.monthOfYear();
        int int4 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property5 = localDate2.yearOfCentury();
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale6);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        int int10 = localTime9.size();
        org.joda.time.LocalTime.Property property11 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime13 = property11.addCopy((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean15 = localTime13.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime17 = localTime8.withField(dateTimeFieldType14, 12);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight18.withDayOfWeek(7);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight18.withCenturyOfEra(21);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.plusDays((int) (short) 10);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight27.toMutableDateTime();
        mutableDateTime28.add((long) 1);
        org.joda.time.DateTime dateTime31 = mutableDateTime28.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime28, readableDuration32, periodType33);
        org.joda.time.Chronology chronology35 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfYear((int) (byte) 1);
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime40.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime36.add((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType53);
        int int55 = mutablePeriod54.getMonths();
        org.joda.time.Interval interval56 = new org.joda.time.Interval(readableInstant50, (org.joda.time.ReadablePeriod) mutablePeriod54);
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime59 = new org.joda.time.MutableDateTime((long) 10, chronology57);
        org.joda.time.Period period60 = duration43.toPeriod(chronology57);
        org.joda.time.Duration duration61 = duration43.toDuration();
        org.joda.time.DateMidnight dateMidnight62 = dateMidnight26.plus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.DateTime dateTime63 = dateMidnight26.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetMillis(517);
        long long68 = dateTimeZone65.adjustOffset(19691596800000L, false);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime63.toMutableDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime70 = localDate2.toDateTime(localTime17, dateTimeZone65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight26 and mutableDateTime69", (dateMidnight26.compareTo(mutableDateTime69) == 0) == dateMidnight26.equals(mutableDateTime69));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.lang.String str9 = locale4.getCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = property3.addToCopy((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight6 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getShortName((long) 6);
        java.lang.String str17 = dateTimeZone11.getNameKey((long) 448);
        org.joda.time.DateTime dateTime18 = dateMidnight8.toDateTime(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight19.withDayOfYear((int) (short) 10);
        org.joda.time.DateMidnight.Property property24 = dateMidnight19.year();
        org.joda.time.DateMidnight dateMidnight25 = property24.roundCeilingCopy();
        java.lang.String str26 = property24.toString();
        org.joda.time.DateMidnight dateMidnight28 = property24.setCopy(301);
        int int29 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateMidnight28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateTime18", (dateMidnight2.compareTo(dateTime18) == 0) == dateMidnight2.equals(dateTime18));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) (byte) 1);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((org.joda.time.ReadableDuration) duration16);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = duration16.toPeriod();
        org.joda.time.Period period23 = duration16.toPeriod();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours((int) (byte) 100);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType31 = periodType30.withSecondsRemoved();
        org.joda.time.Period period32 = duration16.toPeriodTo((org.joda.time.ReadableInstant) dateTime27, periodType31);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime27.toMutableDateTime();
        mutableDateTime33.setDayOfYear(99);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfYear((int) (byte) 1);
        int int40 = dateTime39.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime42 = dateMidnight41.toMutableDateTime();
        org.joda.time.Interval interval43 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime39, (org.joda.time.ReadableInstant) mutableDateTime42);
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime42.dayOfMonth();
        mutableDateTime42.addYears(365);
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay(chronology54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay55.minusMonths((int) (short) -1);
        int int58 = yearMonthDay55.size();
        org.joda.time.YearMonthDay.Property property59 = yearMonthDay55.year();
        int int60 = property59.getMinimumValueOverall();
        java.lang.String str61 = property59.getAsString();
        org.joda.time.YearMonthDay yearMonthDay63 = property59.addWrapFieldToCopy(53637206);
        org.joda.time.YearMonthDay yearMonthDay65 = yearMonthDay63.plusYears(202);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        org.joda.time.DateMidnight dateMidnight69 = yearMonthDay63.toDateMidnight(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone68);
        mutableDateTime42.setZoneRetainFields(dateTimeZone68);
        org.joda.time.DateTime dateTime72 = mutableDateTime33.toDateTime(dateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime70", (mutableDateTime9.compareTo(dateTime70) == 0) == mutableDateTime9.equals(dateTime70));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.dayOfMonth();
        mutableDateTime6.addYears(365);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        int int16 = mutablePeriod15.getMonths();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableInstant11, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusMonths((int) (short) -1);
        int int22 = yearMonthDay19.size();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay19.year();
        int int24 = property23.getMinimumValueOverall();
        java.lang.String str25 = property23.getAsString();
        org.joda.time.YearMonthDay yearMonthDay27 = property23.addWrapFieldToCopy(53637206);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay27.plusYears(202);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        org.joda.time.DateMidnight dateMidnight33 = yearMonthDay27.toDateMidnight(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        mutableDateTime6.setZoneRetainFields(dateTimeZone32);
        int int36 = mutableDateTime6.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        mutableDateTime6.add(readablePeriod37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime42 = dateTime40.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfMonth();
        org.joda.time.DateTime dateTime45 = dateTime42.plusSeconds(10);
        org.joda.time.DateTime.Property property46 = dateTime42.yearOfEra();
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = org.joda.time.MutableDateTime.now(dateTimeZone48);
        long long52 = dateTimeZone48.nextTransition(1L);
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight((java.lang.Object) dateTime42, dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusYears(301);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight53.withYear(7200000);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime61 = dateTime59.withDayOfYear((int) (byte) 1);
        int int62 = dateTime61.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime64 = dateMidnight63.toMutableDateTime();
        org.joda.time.Interval interval65 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime61, (org.joda.time.ReadableInstant) mutableDateTime64);
        org.joda.time.DateTime dateTime67 = dateTime61.plusYears((-1));
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfMonth();
        boolean boolean70 = dateTime67.isBefore((long) 70);
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight71.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight71.plusYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight71, readableDuration76);
        org.joda.time.DateTime dateTime78 = dateTime67.minus((org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.PeriodType periodType79 = mutablePeriod77.getPeriodType();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) dateMidnight57, periodType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime50", (dateTime34.compareTo(mutableDateTime50) == 0) == dateTime34.equals(mutableDateTime50));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime12 = dateTime8.plusSeconds(208);
        int int13 = instant6.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.setValue(0, 2022);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod8.setPeriod((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) (byte) 0);
        long long24 = duration23.getMillis();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) (byte) 0);
        long long27 = duration26.getMillis();
        int int28 = duration23.compareTo((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration30 = duration20.withDurationAdded((org.joda.time.ReadableDuration) duration26, 2);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime32 = dateMidnight31.toMutableDateTime();
        int int33 = mutableDateTime32.getYearOfEra();
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.months();
        mutablePeriod37.set(durationFieldType38, (int) 'a');
        mutablePeriod37.addHours((int) (byte) -1);
        mutablePeriod37.addYears(2022);
        mutableDateTime32.add((org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime32.year();
        mutableDateTime32.setMillis((long) 10);
        org.joda.time.DateTime dateTime49 = mutableDateTime32.toDateTime();
        org.joda.time.Interval interval50 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.now();
        int int52 = localTime51.size();
        org.joda.time.LocalTime.Property property53 = localTime51.minuteOfHour();
        org.joda.time.LocalTime localTime55 = property53.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime56 = property53.roundCeilingCopy();
        int int57 = localTime56.getMillisOfDay();
        org.joda.time.Chronology chronology58 = localTime56.getChronology();
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(locale59);
        org.joda.time.LocalTime localTime61 = org.joda.time.LocalTime.fromCalendarFields(calendar60);
        org.joda.time.LocalTime localTime63 = localTime61.minusMillis(517);
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime67 = dateTime65.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property68 = dateTime67.dayOfMonth();
        org.joda.time.PeriodType periodType71 = null;
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType71);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType75);
        mutablePeriod72.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod76);
        java.lang.String str78 = mutablePeriod72.toString();
        org.joda.time.Interval interval79 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime67, (org.joda.time.ReadablePeriod) mutablePeriod72);
        int int80 = mutablePeriod72.getMonths();
        int[] intArray81 = mutablePeriod72.getValues();
        chronology58.validate((org.joda.time.ReadablePartial) localTime63, intArray81);
        org.joda.time.DateMidnight dateMidnight83 = org.joda.time.DateMidnight.now(chronology58);
        org.joda.time.DurationField durationField84 = chronology58.years();
        org.joda.time.DateTime dateTime85 = dateTime49.toDateTime(chronology58);
        org.joda.time.DateTimeField dateTimeField86 = chronology58.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay88 = new org.joda.time.TimeOfDay((long) 0);
        org.joda.time.TimeOfDay timeOfDay90 = timeOfDay88.withMillisOfSecond(557);
        long long92 = chronology58.set((org.joda.time.ReadablePartial) timeOfDay90, (-61472908800057L));
        org.joda.time.TimeOfDay timeOfDay94 = timeOfDay90.plusHours(53669316);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime32 and dateTime85", (mutableDateTime32.compareTo(dateTime85) == 0) == mutableDateTime32.equals(dateTime85));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Period period1 = org.joda.time.Period.hours(50473355);
        org.joda.time.Period period2 = period1.toPeriod();
        org.joda.time.Period period4 = period1.withWeeks(0);
        org.joda.time.Period period6 = period1.minusMillis(53670257);
        org.joda.time.Period period7 = period6.normalizedStandard();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.minusMonths((int) (short) -1);
        int int19 = yearMonthDay16.size();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay16.year();
        int int21 = property20.getMinimumValueOverall();
        java.lang.String str22 = property20.getAsString();
        org.joda.time.YearMonthDay yearMonthDay24 = property20.addWrapFieldToCopy(53637206);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.secondOfMinute();
        java.lang.String str38 = dateTimeField36.getAsText(100L);
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property41 = localDate40.yearOfEra();
        java.util.Locale locale42 = java.util.Locale.CHINA;
        java.util.Locale locale43 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        java.lang.String str45 = locale42.getDisplayVariant(locale43);
        int int46 = property41.getMaximumTextLength(locale42);
        java.util.Locale locale47 = java.util.Locale.CHINA;
        java.util.Locale locale48 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale48);
        java.lang.String str50 = locale47.getDisplayVariant(locale48);
        java.lang.String str51 = locale42.getDisplayCountry(locale48);
        java.lang.String str52 = dateTimeField36.getAsText((int) ' ', locale48);
        org.joda.time.YearMonthDay yearMonthDay53 = property20.setCopy("1", locale48);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(1L, dateTimeZone55);
        org.joda.time.DateTime dateTime57 = yearMonthDay53.toDateTimeAtCurrentTime(dateTimeZone55);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime57.toMutableDateTimeISO();
        int int59 = dateTime57.getMillisOfDay();
        org.joda.time.LocalDate localDate60 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property61 = localDate60.dayOfYear();
        java.util.TimeZone timeZone62 = null;
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forTimeZone(timeZone62);
        org.joda.time.Interval interval64 = localDate60.toInterval(dateTimeZone63);
        boolean boolean65 = dateTimeZone63.isFixed();
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime(dateTimeZone63);
        java.lang.String str67 = dateTimeZone63.getID();
        org.joda.time.DateTime dateTime68 = dateTime57.withZoneRetainFields(dateTimeZone63);
        org.joda.time.Duration duration69 = period6.toDurationTo((org.joda.time.ReadableInstant) dateTime68);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime73 = dateTime71.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property74 = dateTime73.dayOfMonth();
        org.joda.time.PeriodType periodType77 = null;
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType77);
        org.joda.time.PeriodType periodType81 = null;
        org.joda.time.MutablePeriod mutablePeriod82 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType81);
        mutablePeriod78.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod82);
        java.lang.String str84 = mutablePeriod78.toString();
        org.joda.time.Interval interval85 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime73, (org.joda.time.ReadablePeriod) mutablePeriod78);
        mutablePeriod78.setValue(0, 2022);
        org.joda.time.Duration duration90 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod78.setPeriod((org.joda.time.ReadableDuration) duration90);
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime94 = new org.joda.time.DateTime(dateTimeZone93);
        org.joda.time.Interval interval95 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration90, (org.joda.time.ReadableInstant) dateTime94);
        int int96 = duration69.compareTo((org.joda.time.ReadableDuration) duration90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime66 and dateTime94", (mutableDateTime66.compareTo(dateTime94) == 0) == mutableDateTime66.equals(dateTime94));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime12 = property7.add(0L);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime12.toMutableDateTime();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear((int) (byte) 1);
        int int18 = dateTime17.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime20 = dateMidnight19.toMutableDateTime();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime17, (org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTime dateTime22 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime25 = dateTime17.withZoneRetainFields(dateTimeZone24);
        mutableDateTime12.setZone(dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(dateTimeZone24);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime4", (mutableDateTime1.compareTo(dateTime4) == 0) == mutableDateTime1.equals(dateTime4));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        calendar9.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        int int19 = timeZone18.getRawOffset();
        int int20 = timeZone18.getRawOffset();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18, locale21);
        java.util.Calendar.Builder builder23 = builder7.setTimeZone(timeZone18);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone18);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType28);
        int int30 = mutablePeriod29.getMonths();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant25, (org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekOfWeekyear();
        boolean boolean35 = dateTimeField34.isLenient();
        boolean boolean36 = dateTimeField34.isLenient();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime41 = dateTime39.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfMonth();
        org.joda.time.DateTime dateTime44 = dateTime41.plusSeconds(10);
        org.joda.time.DateTime.Property property45 = dateTime44.year();
        org.joda.time.DateTime dateTime46 = property45.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField47 = property45.getField();
        long long50 = dateTimeField47.getDifferenceAsLong((long) (byte) 10, 315532800000L);
        java.util.Locale locale54 = new java.util.Locale("1970", "PT0.034S", "weekyearOfCentury");
        java.lang.String str55 = locale54.getVariant();
        int int56 = dateTimeField47.getMaximumTextLength(locale54);
        java.util.Locale locale57 = locale54.stripExtensions();
        java.lang.String str58 = dateTimeField34.getAsShortText((long) 105, locale54);
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(timeZone18, locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar24", (calendar22.compareTo(calendar24) == 0) == calendar22.equals(calendar24));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Calendar calendar8 = builder0.build();
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        calendar10.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone19 = calendar10.getTimeZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property24 = dateTime23.dayOfMonth();
        org.joda.time.DateTime dateTime26 = dateTime23.plusSeconds(10);
        org.joda.time.DateTime.Property property27 = dateTime26.year();
        org.joda.time.DateTime dateTime28 = property27.roundHalfCeilingCopy();
        java.util.Locale locale29 = java.util.Locale.CHINA;
        java.util.Locale locale30 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale30);
        java.lang.String str32 = locale29.getDisplayVariant(locale30);
        int int33 = property27.getMaximumTextLength(locale30);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone19, locale30);
        java.util.Calendar.Builder builder35 = builder0.setTimeZone(timeZone19);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone19);
        timeZone19.setID("2022-02-21T14:55:43.544");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar34", (calendar31.compareTo(calendar34) == 0) == calendar31.equals(calendar34));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTime dateTime1 = localDate0.toDateTimeAtCurrentTime();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str5 = dateTimeZone3.getName((long) 100);
        org.joda.time.Interval interval6 = localDate0.toInterval(dateTimeZone3);
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime9", (dateTime1.compareTo(mutableDateTime9) == 0) == dateTime1.equals(mutableDateTime9));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName((long) 100);
        org.joda.time.DateTime dateTime13 = dateTime8.withZoneRetainFields(dateTimeZone10);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = dateTimeZone10.getShortName((-192508671817343L), locale15);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1, locale15);
        java.lang.String str19 = timeZone1.getID();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        int int26 = mutablePeriod25.getMonths();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableInstant21, (org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(chronology28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.minusMonths((int) (short) -1);
        int int32 = yearMonthDay29.size();
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay29.year();
        int int34 = property33.getMinimumValueOverall();
        java.lang.String str35 = property33.getAsString();
        org.joda.time.YearMonthDay yearMonthDay37 = property33.addWrapFieldToCopy(53637206);
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType42);
        int int44 = mutablePeriod43.getMonths();
        org.joda.time.Interval interval45 = new org.joda.time.Interval(readableInstant39, (org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.secondOfMinute();
        java.lang.String str51 = dateTimeField49.getAsText(100L);
        org.joda.time.LocalDate localDate53 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfEra();
        java.util.Locale locale55 = java.util.Locale.CHINA;
        java.util.Locale locale56 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale56);
        java.lang.String str58 = locale55.getDisplayVariant(locale56);
        int int59 = property54.getMaximumTextLength(locale55);
        java.util.Locale locale60 = java.util.Locale.CHINA;
        java.util.Locale locale61 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(locale61);
        java.lang.String str63 = locale60.getDisplayVariant(locale61);
        java.lang.String str64 = locale55.getDisplayCountry(locale61);
        java.lang.String str65 = dateTimeField49.getAsText((int) ' ', locale61);
        org.joda.time.YearMonthDay yearMonthDay66 = property33.setCopy("1", locale61);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone1, locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar57", (calendar2.compareTo(calendar57) == 0) == calendar2.equals(calendar57));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateMidnight dateMidnight2 = localDate0.toDateMidnight();
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        org.joda.time.Period period5 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period7 = period5.minusYears(8);
        org.joda.time.Period period9 = period5.withSeconds(11);
        org.joda.time.Period period11 = period9.withMillis(53742);
        org.joda.time.LocalDate localDate12 = localDate0.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.weeks();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str27 = dateTimeZone25.getName((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.DateTime dateTime29 = mutableDateTime23.toDateTime(dateTimeZone25);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = localDate30.isSupported(dateTimeFieldType31);
        org.joda.time.LocalDate.Property property33 = localDate30.yearOfEra();
        org.joda.time.Interval interval34 = localDate30.toInterval();
        org.joda.time.DateTime dateTime35 = localDate30.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property36 = dateTime35.dayOfWeek();
        int int37 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime38 = localDate0.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone43 = dateTimeZone42.toTimeZone();
        java.util.Locale locale44 = java.util.Locale.CHINA;
        java.util.Locale locale45 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(locale45);
        java.lang.String str47 = locale44.getDisplayVariant(locale45);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone43, locale44);
        java.lang.String str49 = locale44.getISO3Language();
        java.lang.String str50 = dateTimeZone25.getName(0L, locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar46 and calendar48", (calendar46.compareTo(calendar48) == 0) == calendar46.equals(calendar48));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.lang.String str12 = dateTimeZone10.getName((long) 100);
        org.joda.time.DateTime dateTime13 = dateTime8.withZoneRetainFields(dateTimeZone10);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleKeys();
        java.lang.String str17 = dateTimeZone10.getShortName((-192508671817343L), locale15);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone1, locale15);
        int int19 = calendar18.getFirstDayOfWeek();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromCalendarFields(calendar18);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        int int26 = mutablePeriod25.getMonths();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableInstant21, (org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.Chronology chronology28 = interval27.getChronology();
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(chronology28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.minusMonths((int) (short) -1);
        int int32 = yearMonthDay29.size();
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay29.year();
        java.util.Locale locale34 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(locale34);
        int int37 = property33.getMaximumShortTextLength(locale34);
        org.joda.time.YearMonthDay yearMonthDay39 = property33.setCopy(6);
        org.joda.time.YearMonthDay yearMonthDay41 = property33.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay42 = property33.withMinimumValue();
        org.joda.time.Period period44 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.YearMonthDay yearMonthDay46 = yearMonthDay42.withPeriodAdded((org.joda.time.ReadablePeriod) period44, (int) (byte) -1);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime50 = dateTime48.minusWeeks((int) '#');
        org.joda.time.YearMonthDay yearMonthDay51 = dateTime50.toYearMonthDay();
        int int52 = yearMonthDay51.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay54 = yearMonthDay51.minusDays(53700000);
        int int55 = yearMonthDay42.compareTo((org.joda.time.ReadablePartial) yearMonthDay54);
        org.joda.time.YearMonthDay yearMonthDay57 = yearMonthDay42.minusMonths(900);
        boolean boolean58 = calendar18.before((java.lang.Object) yearMonthDay57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar35", (calendar2.compareTo(calendar35) == 0) == calendar2.equals(calendar35));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(chronology16);
        org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay17.minusMonths((int) (short) -1);
        int int20 = yearMonthDay17.size();
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.year();
        java.util.Locale locale22 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(locale22);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale22);
        int int25 = property21.getMaximumShortTextLength(locale22);
        org.joda.time.YearMonthDay yearMonthDay27 = property21.setCopy(6);
        java.util.Locale locale31 = new java.util.Locale("2022-02-21T00:00:00.000Z", "2022-02-21T00:00:00.000Z", "PT0.034S");
        java.lang.String str32 = property21.getAsShortText(locale31);
        boolean boolean33 = locale31.hasExtensions();
        java.lang.String str34 = locale4.getDisplayScript(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        mutableDateTime9.add((long) 1);
        org.joda.time.DateTime dateTime12 = mutableDateTime9.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.years();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime9, readableDuration13, periodType14);
        org.joda.time.Chronology chronology16 = mutableDateTime9.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfYear((int) (byte) 1);
        int int22 = dateTime21.getDayOfMonth();
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime25 = dateTime21.minus((org.joda.time.ReadableDuration) duration24);
        mutableDateTime17.add((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration28 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean29 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Period period30 = duration24.toPeriod();
        org.joda.time.Period period31 = duration24.toPeriod();
        org.joda.time.Hours hours32 = period31.toStandardHours();
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.lang.String str34 = locale33.getDisplayVariant();
        boolean boolean35 = period31.equals((java.lang.Object) str34);
        org.joda.time.Period period37 = period31.plusMinutes(517);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfYear();
        org.joda.time.DurationField durationField40 = property39.getRangeDurationField();
        boolean boolean41 = durationField40.isPrecise();
        boolean boolean42 = period31.equals((java.lang.Object) durationField40);
        org.joda.time.Period period44 = period31.withYears(557);
        org.joda.time.PeriodType periodType45 = period31.getPeriodType();
        org.joda.time.Period period46 = new org.joda.time.Period(53825645, 965, 690, 505, 711, 53851516, 366, 757, periodType45);
        org.joda.time.Period period47 = period46.toPeriod();
        org.joda.time.Period period49 = org.joda.time.Period.seconds(15);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusMinutes((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.centuries();
        boolean boolean58 = localDateTime54.isSupported(durationFieldType57);
        org.joda.time.Period period60 = period49.withField(durationFieldType57, (int) (byte) 0);
        int int61 = period46.get(durationFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime53", (mutableDateTime17.compareTo(dateTime53) == 0) == mutableDateTime17.equals(dateTime53));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        mutablePeriod3.set(durationFieldType4, (int) 'a');
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutablePeriod3.add(readableDuration7);
        mutablePeriod3.setPeriod(62135596799930L, 52L);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutablePeriod15.add(readableDuration16);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.months();
        mutablePeriod22.set(durationFieldType23, (int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType30);
        int int32 = mutablePeriod31.getMonths();
        org.joda.time.Interval interval33 = new org.joda.time.Interval(readableInstant27, (org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 100, chronology34);
        boolean boolean36 = durationFieldType23.isSupported(chronology34);
        mutablePeriod15.setPeriod((long) '4', chronology34);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property39 = localDate38.dayOfYear();
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.Interval interval42 = localDate38.toInterval(dateTimeZone41);
        boolean boolean43 = dateTimeZone41.isFixed();
        org.joda.time.Chronology chronology44 = chronology34.withZone(dateTimeZone41);
        org.joda.time.DurationField durationField45 = chronology44.weekyears();
        mutablePeriod3.setPeriod((long) 138, (long) 594, chronology44);
        org.joda.time.LocalDate localDate47 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = null;
        boolean boolean49 = localDate47.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDate.Property property50 = localDate47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        org.joda.time.DurationField durationField52 = property50.getDurationField();
        org.joda.time.LocalDate localDate54 = property50.setCopy(2022);
        org.joda.time.LocalDate localDate55 = property50.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight56 = localDate55.toDateMidnight();
        int int57 = dateMidnight56.getDayOfYear();
        org.joda.time.Duration duration58 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField45 and durationField52", (durationField45.compareTo(durationField52) == 0) == durationField45.equals(durationField52));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getYearOfEra();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        mutablePeriod6.set(durationFieldType7, (int) 'a');
        mutablePeriod6.addHours((int) (byte) -1);
        mutablePeriod6.addYears(2022);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.year();
        org.joda.time.Instant instant16 = mutableDateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime17.setSecondOfMinute(34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant16", (mutableDateTime1.compareTo(instant16) == 0) == mutableDateTime1.equals(instant16));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.DurationField durationField10 = chronology7.hours();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.era();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.monthOfYear();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial26 = null;
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("Property[year]");
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = dateTimeField25.getAsText(readablePartial26, 1, locale29);
        java.util.Locale locale33 = java.util.Locale.CHINA;
        java.util.Locale locale34 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(locale34);
        java.lang.String str36 = locale33.getDisplayVariant(locale34);
        java.lang.String str38 = locale33.getExtension('u');
        java.lang.String str39 = dateTimeField25.getAsText((long) 'x', locale33);
        java.lang.String str40 = dateTimeZone14.getShortName(32L, locale33);
        int int41 = dateTimeField12.getMaximumShortTextLength(locale33);
        org.joda.time.ReadableInstant readableInstant42 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType45);
        int int47 = mutablePeriod46.getMonths();
        org.joda.time.Interval interval48 = new org.joda.time.Interval(readableInstant42, (org.joda.time.ReadablePeriod) mutablePeriod46);
        org.joda.time.Chronology chronology49 = interval48.getChronology();
        org.joda.time.YearMonthDay yearMonthDay50 = new org.joda.time.YearMonthDay(chronology49);
        org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay50.minusMonths((int) (short) -1);
        int int53 = yearMonthDay50.size();
        org.joda.time.YearMonthDay.Property property54 = yearMonthDay50.year();
        java.util.Locale locale55 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(locale55);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale55);
        int int58 = property54.getMaximumShortTextLength(locale55);
        org.joda.time.YearMonthDay yearMonthDay60 = property54.setCopy(6);
        org.joda.time.YearMonthDay yearMonthDay62 = property54.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.YearMonthDay yearMonthDay63 = property54.withMinimumValue();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        java.util.Locale locale65 = locale64.stripExtensions();
        java.util.Set<java.lang.String> strSet66 = locale64.getUnicodeLocaleKeys();
        java.lang.String str67 = property54.getAsText(locale64);
        java.util.Locale locale68 = java.util.Locale.ITALY;
        java.lang.String str69 = locale68.getCountry();
        int int70 = property54.getMaximumTextLength(locale68);
        java.lang.String str71 = locale33.getDisplayName(locale68);
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        java.util.Locale locale76 = java.util.Locale.CHINA;
        java.util.Locale locale77 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(locale77);
        java.lang.String str79 = locale76.getDisplayVariant(locale77);
        java.util.Calendar calendar80 = java.util.Calendar.getInstance(timeZone75, locale76);
        java.lang.String str81 = locale68.getDisplayScript(locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and calendar80", (calendar35.compareTo(calendar80) == 0) == calendar35.equals(calendar80));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.weeks();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology7);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        long long15 = chronology7.set((org.joda.time.ReadablePartial) localDate11, (long) 96);
        org.joda.time.DurationField durationField16 = chronology7.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology7.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology7.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField9, and durationField16", !(durationField18.compareTo(durationField9) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField9.compareTo(durationField16))));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        boolean boolean8 = localDateTime4.isSupported(durationFieldType7);
        java.util.Locale locale9 = java.util.Locale.PRC;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar10);
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withCenturyOfEra(365);
        int int15 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withMillisOfSecond(21);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withMillisOfDay(944);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(944);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.plusMonths((int) (short) -1);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime4, (org.joda.time.ReadablePartial) localDateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime12", (dateTime3.compareTo(dateTime12) == 0) == dateTime3.equals(dateTime12));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        java.util.Date date31 = calendar30.getTime();
        java.util.Date date32 = calendar30.getTime();
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        int int38 = mutablePeriod37.getMonths();
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableInstant33, (org.joda.time.ReadablePeriod) mutablePeriod37);
        org.joda.time.Interval interval40 = interval39.toInterval();
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType44);
        int int46 = mutablePeriod45.getMonths();
        org.joda.time.Interval interval47 = new org.joda.time.Interval(readableInstant41, (org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType52);
        int int54 = mutablePeriod53.getMonths();
        org.joda.time.Interval interval55 = new org.joda.time.Interval(readableInstant49, (org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        boolean boolean57 = interval47.contains((org.joda.time.ReadableInterval) interval55);
        org.joda.time.ReadableInstant readableInstant58 = null;
        org.joda.time.PeriodType periodType61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType61);
        int int63 = mutablePeriod62.getMonths();
        org.joda.time.Interval interval64 = new org.joda.time.Interval(readableInstant58, (org.joda.time.ReadablePeriod) mutablePeriod62);
        org.joda.time.Chronology chronology65 = interval64.getChronology();
        org.joda.time.ReadableInstant readableInstant66 = null;
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType69);
        int int71 = mutablePeriod70.getMonths();
        org.joda.time.Interval interval72 = new org.joda.time.Interval(readableInstant66, (org.joda.time.ReadablePeriod) mutablePeriod70);
        org.joda.time.Chronology chronology73 = interval72.getChronology();
        boolean boolean74 = interval64.contains((org.joda.time.ReadableInterval) interval72);
        boolean boolean75 = interval47.overlaps((org.joda.time.ReadableInterval) interval64);
        org.joda.time.Interval interval76 = interval40.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTime dateTime77 = interval76.getEnd();
        boolean boolean78 = calendar30.equals((java.lang.Object) interval76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        java.lang.String str7 = locale4.getDisplayVariant(locale5);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone3, locale4);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar8", (calendar6.compareTo(calendar8) == 0) == calendar6.equals(calendar8));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekOfWeekyear();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.era();
        org.joda.time.DateMidnight dateMidnight14 = property13.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight17 = property15.addToCopy((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight18 = property15.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone23);
        java.lang.String str27 = dateTimeZone23.getShortName((long) 6);
        java.lang.String str29 = dateTimeZone23.getNameKey((long) 448);
        org.joda.time.DateTime dateTime30 = dateMidnight20.toDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime31 = localDateTime11.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateTime30", (dateMidnight14.compareTo(dateTime30) == 0) == dateMidnight14.equals(dateTime30));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Locale locale2 = java.util.Locale.getDefault(category0);
        java.util.Locale locale3 = java.util.Locale.getDefault(category0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(14, 0);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone7, locale8);
        java.lang.String str13 = locale8.getISO3Language();
        java.util.Locale.setDefault(category0, locale8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar12", (calendar10.compareTo(calendar12) == 0) == calendar10.equals(calendar12));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.plus(readableDuration12);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight10.withDurationAdded(1645455313345L, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateMidnight.Property property18 = dateMidnight10.property(dateTimeFieldType17);
        boolean boolean19 = localDate9.isSupported(dateTimeFieldType17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        boolean boolean24 = dateTimeZone21.equals((java.lang.Object) 1645488000000L);
        org.joda.time.DateTime dateTime25 = localDate9.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight27.toMutableDateTime();
        int int29 = mutableDateTime28.getYearOfEra();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.months();
        mutablePeriod33.set(durationFieldType34, (int) 'a');
        mutablePeriod33.addHours((int) (byte) -1);
        mutablePeriod33.addYears(2022);
        mutableDateTime28.add((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime28.year();
        java.lang.Object obj43 = null;
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType47 = periodType46.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType51);
        int int53 = mutablePeriod52.getMonths();
        org.joda.time.Interval interval54 = new org.joda.time.Interval(readableInstant48, (org.joda.time.ReadablePeriod) mutablePeriod52);
        org.joda.time.Chronology chronology55 = interval54.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = new org.joda.time.YearMonthDay(chronology55);
        org.joda.time.ReadableInstant readableInstant57 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType60);
        int int62 = mutablePeriod61.getMonths();
        org.joda.time.Interval interval63 = new org.joda.time.Interval(readableInstant57, (org.joda.time.ReadablePeriod) mutablePeriod61);
        int[] intArray66 = chronology55.get((org.joda.time.ReadablePeriod) mutablePeriod61, 1L, (long) 4);
        org.joda.time.Period period67 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType46, chronology55);
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(obj43, chronology55);
        java.util.TimeZone timeZone70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forTimeZone(timeZone70);
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone71);
        org.joda.time.DateTime dateTime73 = localDate68.toDateTimeAtMidnight(dateTimeZone71);
        long long76 = dateTimeZone71.convertLocalToUTC((long) 31, true);
        org.joda.time.MutableDateTime mutableDateTime77 = org.joda.time.MutableDateTime.now(dateTimeZone71);
        mutableDateTime28.setZone(dateTimeZone71);
        org.joda.time.MutableDateTime mutableDateTime79 = new org.joda.time.MutableDateTime((long) 53734070, dateTimeZone71);
        org.joda.time.DateTime dateTime80 = localDate9.toDateTimeAtCurrentTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime77", (dateTime25.compareTo(mutableDateTime77) == 0) == dateTime25.equals(mutableDateTime77));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        calendar9.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone18 = calendar9.getTimeZone();
        int int19 = timeZone18.getRawOffset();
        int int20 = timeZone18.getRawOffset();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18, locale21);
        java.util.Calendar.Builder builder23 = builder7.setTimeZone(timeZone18);
        java.util.Calendar calendar24 = builder23.build();
        java.util.Date date31 = new java.util.Date((int) (byte) 0, (int) (short) 10, (int) ' ', (int) 'u', 53633250, 53633250);
        int int32 = date31.getTimezoneOffset();
        date31.setMinutes(0);
        java.util.Date date41 = new java.util.Date((int) (short) 1, (int) (short) 0, 53637206, 11, 2022, (int) (short) 10);
        boolean boolean42 = date31.before(date41);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime44 = dateMidnight43.toMutableDateTime();
        mutableDateTime44.add((long) 1);
        org.joda.time.DateTime dateTime47 = mutableDateTime44.toDateTimeISO();
        java.util.Date date48 = mutableDateTime44.toDate();
        date48.setDate(1969);
        boolean boolean51 = date41.after(date48);
        java.util.Calendar.Builder builder52 = builder23.setInstant(date41);
        java.util.Calendar.Builder builder53 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime55 = dateMidnight54.toMutableDateTime();
        mutableDateTime55.add((long) 1);
        org.joda.time.DateTime dateTime58 = mutableDateTime55.toDateTimeISO();
        java.util.Date date59 = mutableDateTime55.toDate();
        java.util.Calendar.Builder builder60 = builder53.setInstant(date59);
        java.util.Calendar calendar61 = builder53.build();
        java.util.Locale locale62 = java.util.Locale.PRC;
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(locale62);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.fromCalendarFields(calendar63);
        calendar63.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone72 = calendar63.getTimeZone();
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime76 = dateTime74.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property77 = dateTime76.dayOfMonth();
        org.joda.time.DateTime dateTime79 = dateTime76.plusSeconds(10);
        org.joda.time.DateTime.Property property80 = dateTime79.year();
        org.joda.time.DateTime dateTime81 = property80.roundHalfCeilingCopy();
        java.util.Locale locale82 = java.util.Locale.CHINA;
        java.util.Locale locale83 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar84 = java.util.Calendar.getInstance(locale83);
        java.lang.String str85 = locale82.getDisplayVariant(locale83);
        int int86 = property80.getMaximumTextLength(locale83);
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone72, locale83);
        java.util.Calendar.Builder builder88 = builder53.setTimeZone(timeZone72);
        java.util.Calendar.Builder builder89 = builder23.setTimeZone(timeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar84", (calendar22.compareTo(calendar84) == 0) == calendar22.equals(calendar84));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds((long) (short) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight2.plusYears((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTime();
        mutableDateTime8.add((long) 1);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, readableDuration12, periodType13);
        java.lang.String str15 = mutableDateTime8.toString();
        org.joda.time.Chronology chronology16 = mutableDateTime8.getChronology();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        mutableDateTime18.add((long) 1);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime18.secondOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(readableDuration22, (org.joda.time.ReadableInstant) dateTime24, periodType27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, (org.joda.time.ReadableInstant) mutableDateTime18, periodType27);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight2, periodType27);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime35 = dateTime33.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = timeOfDay31.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        int int37 = dateTime36.getDayOfYear();
        org.joda.time.DateTime dateTime38 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime39 = dateTime38.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property40 = dateTime39.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime43 = dateTime39.toDateTime(dateTimeZone42);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.hours();
        org.joda.time.PeriodType periodType45 = periodType44.withMonthsRemoved();
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime39, periodType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime43", (dateTime39.compareTo(dateTime43) == 0) == dateTime39.equals(dateTime43));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime1.add(readableDuration7, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime11, readableDuration15, periodType16);
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        mutableDateTime1.setChronology(chronology18);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType25);
        int int27 = mutablePeriod26.getMonths();
        org.joda.time.Interval interval28 = new org.joda.time.Interval(readableInstant22, (org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.weekOfWeekyear();
        mutableDateTime1.setRounding(dateTimeField31);
        java.lang.String str34 = dateTimeField31.getAsShortText(0L);
        org.joda.time.DurationField durationField35 = dateTimeField31.getRangeDurationField();
        org.joda.time.ReadableInstant readableInstant36 = null;
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType39);
        int int41 = mutablePeriod40.getMonths();
        org.joda.time.Interval interval42 = new org.joda.time.Interval(readableInstant36, (org.joda.time.ReadablePeriod) mutablePeriod40);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(chronology43);
        org.joda.time.ReadableInstant readableInstant45 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType48);
        int int50 = mutablePeriod49.getMonths();
        org.joda.time.Interval interval51 = new org.joda.time.Interval(readableInstant45, (org.joda.time.ReadablePeriod) mutablePeriod49);
        int[] intArray54 = chronology43.get((org.joda.time.ReadablePeriod) mutablePeriod49, 1L, (long) 4);
        org.joda.time.DurationField durationField55 = chronology43.eras();
        java.lang.String str56 = durationField55.getName();
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = null;
        boolean boolean59 = localDate57.isSupported(dateTimeFieldType58);
        org.joda.time.LocalDate.Property property60 = localDate57.yearOfEra();
        org.joda.time.DateTimeField dateTimeField61 = property60.getField();
        org.joda.time.DurationField durationField62 = property60.getDurationField();
        long long65 = durationField62.add((long) 2, (int) (byte) 0);
        long long68 = durationField62.subtract((long) 12, (int) (byte) 100);
        int int69 = durationField55.compareTo(durationField62);
        int int70 = durationField35.compareTo(durationField55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField55, durationField20, and durationField62", !(durationField55.compareTo(durationField20) == 0) || (Math.signum(durationField55.compareTo(durationField62)) == Math.signum(durationField20.compareTo(durationField62))));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Calendar calendar8 = builder7.build();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType14 = periodType13.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        int int20 = mutablePeriod19.getMonths();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableInstant15, (org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(chronology22);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType27);
        int int29 = mutablePeriod28.getMonths();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(readableInstant24, (org.joda.time.ReadablePeriod) mutablePeriod28);
        int[] intArray33 = chronology22.get((org.joda.time.ReadablePeriod) mutablePeriod28, 1L, (long) 4);
        org.joda.time.Period period34 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType13, chronology22);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology22);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        java.lang.String str41 = dateTimeZone37.getShortName((long) 53700000);
        java.lang.String str42 = dateTimeZone37.getID();
        int int44 = dateTimeZone37.getOffsetFromLocal(2L);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((java.lang.Object) mutableDateTime35, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight((long) 271, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(dateTimeZone37);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((java.lang.Object) calendar8, dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay49 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.DateTime dateTime50 = timeOfDay49.toDateTimeToday();
        int int51 = dateTimeZone37.getOffset((org.joda.time.ReadableInstant) dateTime50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on yearMonthDay23 and localDate48", (yearMonthDay23.compareTo(localDate48) == 0) == yearMonthDay23.equals(localDate48));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(53633250L, 1645455245049L);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        mutableDateTime6.add((long) 1);
        org.joda.time.DateTime dateTime9 = mutableDateTime6.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration10, periodType11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.weeks();
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology20);
        mutableDateTime6.setChronology(chronology20);
        org.joda.time.DurationField durationField25 = chronology20.hours();
        org.joda.time.DateTimeField dateTimeField26 = chronology20.secondOfMinute();
        org.joda.time.DurationField durationField27 = chronology20.years();
        org.joda.time.DateTimeField dateTimeField28 = chronology20.dayOfMonth();
        mutablePeriod2.setPeriod((long) 53635369, 1645455278458L, chronology20);
        org.joda.time.DateTimeField dateTimeField30 = chronology20.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime31 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        int int37 = mutablePeriod36.getMonths();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableInstant32, (org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(chronology39);
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType44);
        int int46 = mutablePeriod45.getMonths();
        org.joda.time.Interval interval47 = new org.joda.time.Interval(readableInstant41, (org.joda.time.ReadablePeriod) mutablePeriod45);
        int[] intArray50 = chronology39.get((org.joda.time.ReadablePeriod) mutablePeriod45, 1L, (long) 4);
        org.joda.time.DurationField durationField51 = chronology39.eras();
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime dateTime54 = dateTime52.minusHours(53912309);
        org.joda.time.DateTime dateTime56 = dateTime52.plusSeconds(514);
        org.joda.time.DateTime.Property property57 = dateTime52.era();
        org.joda.time.PeriodType periodType58 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType59 = periodType58.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(periodType58);
        org.joda.time.PeriodType periodType61 = periodType58.withMillisRemoved();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime31, (org.joda.time.ReadableInstant) dateTime52, periodType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField51", Math.signum(durationField22.compareTo(durationField51)) == -Math.signum(durationField51.compareTo(durationField22)));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutablePeriod1.add(readableDuration2);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.months();
        mutablePeriod8.set(durationFieldType9, (int) 'a');
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100, chronology20);
        boolean boolean22 = durationFieldType9.isSupported(chronology20);
        mutablePeriod1.setPeriod((long) '4', chronology20);
        org.joda.time.DurationField durationField24 = chronology20.halfdays();
        org.joda.time.DurationField durationField25 = chronology20.weekyears();
        org.joda.time.DurationField durationField26 = chronology20.years();
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight27.toMutableDateTime();
        mutableDateTime28.add((long) 1);
        mutableDateTime28.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime28.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration34 = null;
        mutableDateTime28.add(readableDuration34, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime38 = dateMidnight37.toMutableDateTime();
        mutableDateTime38.add((long) 1);
        org.joda.time.DateTime dateTime41 = mutableDateTime38.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.years();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime38, readableDuration42, periodType43);
        org.joda.time.Chronology chronology45 = mutableDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.clockhourOfHalfday();
        org.joda.time.DurationField durationField47 = chronology45.halfdays();
        mutableDateTime28.setChronology(chronology45);
        org.joda.time.ReadableInstant readableInstant49 = null;
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType52);
        int int54 = mutablePeriod53.getMonths();
        org.joda.time.Interval interval55 = new org.joda.time.Interval(readableInstant49, (org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.weekOfWeekyear();
        mutableDateTime28.setRounding(dateTimeField58);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate(1L, dateTimeZone61);
        org.joda.time.LocalDate.Property property63 = localDate62.monthOfYear();
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight64.toMutableDateTime();
        mutableDateTime65.add((long) 1);
        org.joda.time.DateTime dateTime68 = mutableDateTime65.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.years();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime65, readableDuration69, periodType70);
        int[] intArray72 = period71.getValues();
        int int73 = dateTimeField58.getMaximumValue((org.joda.time.ReadablePartial) localDate62, intArray72);
        org.joda.time.LocalDate localDate74 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = null;
        boolean boolean76 = localDate74.isSupported(dateTimeFieldType75);
        org.joda.time.LocalDate.Property property77 = localDate74.yearOfEra();
        org.joda.time.DateTimeField dateTimeField78 = property77.getField();
        org.joda.time.DurationField durationField79 = property77.getDurationField();
        org.joda.time.LocalDate localDate81 = property77.setCopy(2022);
        org.joda.time.LocalDate localDate82 = property77.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate84 = property77.addToCopy(517);
        java.util.Locale locale85 = null;
        java.lang.String str86 = dateTimeField58.getAsText((org.joda.time.ReadablePartial) localDate84, locale85);
        long long88 = chronology20.set((org.joda.time.ReadablePartial) localDate84, (long) 140);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField25 and durationField26", (durationField25.compareTo(durationField26) == 0) == durationField25.equals(durationField26));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = property3.addToCopy((long) (-292275054));
        org.joda.time.DateMidnight dateMidnight6 = property3.roundHalfEvenCopy();
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 43200000L, dateTimeZone11);
        java.lang.String str15 = dateTimeZone11.getShortName((long) 6);
        java.lang.String str17 = dateTimeZone11.getNameKey((long) 448);
        org.joda.time.DateTime dateTime18 = dateMidnight8.toDateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property20 = localDate19.dayOfYear();
        org.joda.time.DateMidnight dateMidnight21 = localDate19.toDateMidnight();
        org.joda.time.Chronology chronology22 = localDate19.getChronology();
        org.joda.time.LocalDate.Property property23 = localDate19.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(1L, dateTimeZone25);
        org.joda.time.Interval interval27 = localDate19.toInterval(dateTimeZone25);
        org.joda.time.LocalDate.Property property28 = localDate19.dayOfYear();
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property30 = localDate29.dayOfYear();
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.Interval interval33 = localDate29.toInterval(dateTimeZone32);
        long long35 = dateTimeZone32.nextTransition(292278993L);
        org.joda.time.DateTime dateTime36 = localDate19.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight8 and dateTime18", (dateMidnight8.compareTo(dateTime18) == 0) == dateMidnight8.equals(dateTime18));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) 711);
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutablePeriod3.add(readableDuration4);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.months();
        mutablePeriod10.set(durationFieldType11, (int) 'a');
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        int int20 = mutablePeriod19.getMonths();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableInstant15, (org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100, chronology22);
        boolean boolean24 = durationFieldType11.isSupported(chronology22);
        mutablePeriod3.setPeriod((long) '4', chronology22);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property27 = localDate26.dayOfYear();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.Interval interval30 = localDate26.toInterval(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        org.joda.time.Chronology chronology32 = chronology22.withZone(dateTimeZone29);
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        org.joda.time.Period period34 = duration1.toPeriod(chronology32);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType38);
        int int40 = mutablePeriod39.getMonths();
        org.joda.time.Interval interval41 = new org.joda.time.Interval(readableInstant35, (org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        long long43 = interval41.toDurationMillis();
        org.joda.time.ReadableInstant readableInstant44 = null;
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType47);
        int int49 = mutablePeriod48.getMonths();
        org.joda.time.Interval interval50 = new org.joda.time.Interval(readableInstant44, (org.joda.time.ReadablePeriod) mutablePeriod48);
        org.joda.time.Chronology chronology51 = interval50.getChronology();
        org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay(chronology51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType56);
        int int58 = mutablePeriod57.getMonths();
        org.joda.time.Interval interval59 = new org.joda.time.Interval(readableInstant53, (org.joda.time.ReadablePeriod) mutablePeriod57);
        int[] intArray62 = chronology51.get((org.joda.time.ReadablePeriod) mutablePeriod57, 1L, (long) 4);
        org.joda.time.DurationField durationField63 = chronology51.eras();
        org.joda.time.Interval interval64 = interval41.withChronology(chronology51);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.Interval interval66 = interval41.withPeriodBeforeEnd(readablePeriod65);
        org.joda.time.MutableInterval mutableInterval67 = interval66.toMutableInterval();
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight70 = dateMidnight68.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight72 = dateMidnight68.withDayOfWeek(7);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight68.withCenturyOfEra(21);
        org.joda.time.DateMidnight dateMidnight76 = dateMidnight74.plusDays((int) (short) 10);
        boolean boolean77 = interval66.isAfter((org.joda.time.ReadableInstant) dateMidnight74);
        org.joda.time.DateMidnight dateMidnight79 = dateMidnight74.withYearOfEra(912);
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField33 and durationField63", Math.signum(durationField33.compareTo(durationField63)) == -Math.signum(durationField63.compareTo(durationField33)));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("months");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar5);
        calendar5.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone14 = calendar5.getTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime18.plusSeconds(10);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.util.Locale locale25 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(locale25);
        java.lang.String str27 = locale24.getDisplayVariant(locale25);
        int int28 = property22.getMaximumTextLength(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone14, locale25);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone1, locale25);
        java.util.Date date31 = calendar30.getTime();
        int int32 = calendar30.getMinimalDaysInFirstWeek();
        java.lang.Object obj33 = calendar30.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar26", (calendar2.compareTo(calendar26) == 0) == calendar2.equals(calendar26));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int12 = timeZone10.getRawOffset();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10, locale13);
        int int15 = timeZone10.getRawOffset();
        boolean boolean16 = timeZone10.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'x');
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        java.lang.String str21 = dateTimeZone18.getName(0L, locale20);
        java.lang.String str22 = locale20.getDisplayVariant();
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone10, locale20);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar23", (calendar14.compareTo(calendar23) == 0) == calendar14.equals(calendar23));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        int int6 = mutablePeriod5.getMonths();
        org.joda.time.Interval interval7 = new org.joda.time.Interval(readableInstant1, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(chronology8);
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType13);
        int int15 = mutablePeriod14.getMonths();
        org.joda.time.Interval interval16 = new org.joda.time.Interval(readableInstant10, (org.joda.time.ReadablePeriod) mutablePeriod14);
        int[] intArray19 = chronology8.get((org.joda.time.ReadablePeriod) mutablePeriod14, 1L, (long) 4);
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = chronology8.dayOfMonth();
        org.joda.time.Period period23 = new org.joda.time.Period(1104537600000L, chronology8);
        org.joda.time.DurationField durationField24 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField24, and durationField20", !(durationField20.compareTo(durationField24) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField24.compareTo(durationField20))));
    }
}

