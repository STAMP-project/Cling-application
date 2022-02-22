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
        mutableDateTime10.addMonths(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 12);
        org.joda.time.LocalDate.Property property2 = localDate1.yearOfEra();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        java.lang.String str5 = mutableDateTime4.toString();
        mutableDateTime4.setMonthOfYear(1);
        mutableDateTime4.addWeekyears(4);
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime4.toMutableDateTime(dateTimeZone11);
        org.joda.time.Instant instant14 = mutableDateTime13.toInstant();
        boolean boolean15 = localDate1.equals((java.lang.Object) mutableDateTime13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant14", (mutableDateTime4.compareTo(instant14) == 0) == mutableDateTime4.equals(instant14));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime7, periodType12);
        int int14 = dateMidnight4.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', chronology16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod21.set(durationFieldType22, (int) 'a');
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.setDays(0);
        mutablePeriod21.clear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        mutableDateTime34.add((long) 1);
        org.joda.time.DateTime dateTime37 = mutableDateTime34.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.years();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime34, readableDuration38, periodType39);
        java.lang.String str41 = mutableDateTime34.toString();
        mutableDateTime34.addMinutes((int) ' ');
        int int44 = mutableDateTime34.getCenturyOfEra();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight4.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        int int48 = dateMidnight46.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        mutablePeriod8.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight22.toMutableDateTime();
        mutableDateTime23.add((long) 1);
        org.joda.time.DateTime dateTime26 = mutableDateTime23.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.years();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime23, readableDuration27, periodType28);
        org.joda.time.Chronology chronology30 = mutableDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfEra();
        mutablePeriod8.add(35417L, chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.year();
        org.joda.time.DurationField durationField34 = chronology30.eras();
        org.joda.time.DurationField durationField35 = chronology30.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField34, durationField35, and durationField34", !(durationField34.compareTo(durationField35) == 0) || (Math.signum(durationField34.compareTo(durationField34)) == Math.signum(durationField35.compareTo(durationField34))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra(2);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        int int10 = localTime9.size();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        boolean boolean12 = localTime9.equals((java.lang.Object) locale11);
        org.joda.time.LocalTime localTime14 = localTime9.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology15 = localTime9.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(chronology15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Interval interval19 = interval17.withEndMillis(22000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra(2);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        int int10 = localTime9.size();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        boolean boolean12 = localTime9.equals((java.lang.Object) locale11);
        org.joda.time.LocalTime localTime14 = localTime9.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology15 = localTime9.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(chronology15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime18 = interval17.getStart();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        boolean boolean20 = durationField19.isSupported();
        boolean boolean21 = durationField19.isSupported();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        long long30 = durationField27.getMillis((long) 26180820, 0L);
        int int31 = durationField19.compareTo(durationField27);
        org.joda.time.DurationFieldType durationFieldType32 = durationField27.getType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField27, and durationField19", !(durationField19.compareTo(durationField27) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField27.compareTo(durationField19))));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53");
        boolean boolean2 = timeZone1.observesDaylightTime();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime6.plusSeconds(10);
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime16 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay11.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean22 = timeOfDay18.isSupported(dateTimeFieldType21);
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
        mutablePeriod31.addDays((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay44 = timeOfDay18.plus((org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.TimeOfDay.Property property45 = timeOfDay44.millisOfSecond();
        org.joda.time.DurationField durationField46 = property45.getDurationField();
        org.joda.time.TimeOfDay timeOfDay47 = property45.getTimeOfDay();
        int int48 = property45.getMaximumValueOverall();
        java.util.Locale locale50 = java.util.Locale.CHINA;
        java.util.Locale locale51 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(locale51);
        java.lang.String str53 = locale50.getDisplayVariant(locale51);
        org.joda.time.TimeOfDay timeOfDay54 = property45.setCopy("1", locale50);
        java.lang.String str55 = property10.getAsShortText(locale50);
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone1, locale50);
        int int57 = timeZone1.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar52 and calendar56", (calendar52.compareTo(calendar56) == 0) == calendar52.equals(calendar56));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Calendar calendar12 = dateMidnight6.toCalendar(locale9);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale9.getDisplayCountry(locale13);
        java.lang.String str15 = locale5.getDisplayLanguage(locale13);
        java.lang.String str16 = locale3.getDisplayLanguage(locale5);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale5);
        calendar17.setFirstDayOfWeek(10);
        int int20 = calendar17.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("53");
        boolean boolean23 = timeZone22.observesDaylightTime();
        calendar17.setTimeZone(timeZone22);
        java.lang.String str25 = timeZone22.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar17", (calendar10.compareTo(calendar17) == 0) == calendar10.equals(calendar17));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(2);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now();
        int int9 = localTime8.size();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        boolean boolean11 = localTime8.equals((java.lang.Object) locale10);
        org.joda.time.LocalTime localTime13 = localTime8.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology14 = localTime8.getChronology();
        org.joda.time.DateTime dateTime15 = dateTime5.toDateTime(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime15", (dateTime5.compareTo(dateTime15) == 0) == dateTime5.equals(dateTime15));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime7, periodType12);
        int int14 = dateMidnight4.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', chronology16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod21.set(durationFieldType22, (int) 'a');
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.setDays(0);
        mutablePeriod21.clear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        mutableDateTime34.add((long) 1);
        org.joda.time.DateTime dateTime37 = mutableDateTime34.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.years();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime34, readableDuration38, periodType39);
        java.lang.String str41 = mutableDateTime34.toString();
        mutableDateTime34.addMinutes((int) ' ');
        int int44 = mutableDateTime34.getCenturyOfEra();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight4.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        int int48 = dateMidnight46.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.weekOfWeekyear();
        int int5 = property4.getMinimumValueOverall();
        org.joda.time.DateTime dateTime7 = property4.addToCopy((long) 25);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay16.minusMonths((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime20 = dateMidnight19.toMutableDateTime();
        mutableDateTime20.add((long) 1);
        org.joda.time.DateTime dateTime23 = mutableDateTime20.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime20, readableDuration24, periodType25);
        org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay18.minus((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Chronology chronology28 = yearMonthDay18.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfMinute();
        org.joda.time.DateTime dateTime30 = dateTime7.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime30", (dateTime7.compareTo(dateTime30) == 0) == dateTime7.equals(dateTime30));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
        long long2 = duration1.getMillis();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = localDate3.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.Hours hours7 = duration1.toStandardHours();
        org.joda.time.Hours hours8 = duration1.toStandardHours();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        boolean boolean24 = mutableDateTime19.isSupported(dateTimeFieldType23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        long long36 = dateTimeField34.roundHalfFloor((long) 1);
        mutableDateTime19.setRounding(dateTimeField34, (int) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        mutablePeriod42.set(durationFieldType43, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100, chronology54);
        boolean boolean56 = durationFieldType43.isSupported(chronology54);
        mutableDateTime19.add(durationFieldType43, (int) ' ');
        int int59 = mutableDateTime19.getSecondOfMinute();
        boolean boolean60 = dateTime17.equals((java.lang.Object) int59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime63 = dateTime17.toDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withSecondOfMinute(0);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = dateTime63.toDateTime(dateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime65", (dateTime12.compareTo(dateTime65) == 0) == dateTime12.equals(dateTime65));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        boolean boolean20 = durationField19.isSupported();
        boolean boolean21 = durationField19.isSupported();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        long long30 = durationField27.getMillis((long) 26180820, 0L);
        int int31 = durationField19.compareTo(durationField27);
        long long34 = durationField27.getDifferenceAsLong(1645514165226L, (long) 26182924);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField27, and durationField19", !(durationField19.compareTo(durationField27) == 0) || (Math.signum(durationField19.compareTo(durationField19)) == Math.signum(durationField27.compareTo(durationField19))));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
        long long2 = duration1.getMillis();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = localDate3.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.Hours hours7 = duration1.toStandardHours();
        org.joda.time.Hours hours8 = duration1.toStandardHours();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        boolean boolean24 = mutableDateTime19.isSupported(dateTimeFieldType23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        long long36 = dateTimeField34.roundHalfFloor((long) 1);
        mutableDateTime19.setRounding(dateTimeField34, (int) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        mutablePeriod42.set(durationFieldType43, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100, chronology54);
        boolean boolean56 = durationFieldType43.isSupported(chronology54);
        mutableDateTime19.add(durationFieldType43, (int) ' ');
        int int59 = mutableDateTime19.getSecondOfMinute();
        boolean boolean60 = dateTime17.equals((java.lang.Object) int59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime63 = dateTime17.toDateTime(dateTimeZone62);
        org.joda.time.YearMonthDay yearMonthDay64 = dateTime17.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime63", (dateTime17.compareTo(dateTime63) == 0) == dateTime17.equals(dateTime63));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime7, periodType12);
        int int14 = dateMidnight4.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', chronology16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod21.set(durationFieldType22, (int) 'a');
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.setDays(0);
        mutablePeriod21.clear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        mutableDateTime34.add((long) 1);
        org.joda.time.DateTime dateTime37 = mutableDateTime34.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.years();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime34, readableDuration38, periodType39);
        java.lang.String str41 = mutableDateTime34.toString();
        mutableDateTime34.addMinutes((int) ' ');
        int int44 = mutableDateTime34.getCenturyOfEra();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight4.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Instant instant47 = dateMidnight46.toInstant();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight46.minus((long) 1969);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight46 and instant47", (dateMidnight46.compareTo(instant47) == 0) == dateMidnight46.equals(instant47));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        boolean boolean20 = durationField19.isSupported();
        boolean boolean21 = durationField19.isSupported();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        long long30 = durationField27.getMillis((long) 26180820, 0L);
        int int31 = durationField19.compareTo(durationField27);
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property33 = localDate32.dayOfYear();
        org.joda.time.DurationField durationField34 = property33.getRangeDurationField();
        boolean boolean35 = durationField34.isPrecise();
        long long38 = durationField34.add(0L, 26164327);
        org.joda.time.DurationFieldType durationFieldType39 = durationField34.getType();
        int int40 = durationField19.compareTo(durationField34);
        long long43 = durationField34.subtract((long) 26294011, 76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField34", Math.signum(durationField19.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField19)));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Calendar calendar12 = dateMidnight6.toCalendar(locale9);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale9.getDisplayCountry(locale13);
        java.lang.String str15 = locale5.getDisplayLanguage(locale13);
        java.lang.String str16 = locale3.getDisplayLanguage(locale5);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale5);
        calendar17.setFirstDayOfWeek(10);
        int int20 = calendar17.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("53");
        boolean boolean23 = timeZone22.observesDaylightTime();
        calendar17.setTimeZone(timeZone22);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("53");
        boolean boolean27 = timeZone26.observesDaylightTime();
        int int29 = timeZone26.getOffset(826186880073600000L);
        boolean boolean30 = timeZone22.hasSameRules(timeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar17", (calendar10.compareTo(calendar17) == 0) == calendar10.equals(calendar17));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        mutableDateTime6.add((long) 1);
        org.joda.time.DateTime dateTime9 = mutableDateTime6.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        boolean boolean11 = mutableDateTime6.isSupported(dateTimeFieldType10);
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime6.hourOfDay();
        java.lang.String str13 = property12.toString();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.add(0);
        org.joda.time.MutableDateTime mutableDateTime17 = property12.set(23);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.parse("2022-02-22T00:00:00.001Z");
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardMinutes((long) 9);
        org.joda.time.DateTime dateTime22 = dateTime19.plus((org.joda.time.ReadableDuration) duration21);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType26 = periodType25.withHoursRemoved();
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
        org.joda.time.Period period46 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType25, chronology34);
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutablePeriod48.add(readableDuration49);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType54);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.months();
        mutablePeriod55.set(durationFieldType56, (int) 'a');
        org.joda.time.ReadableInstant readableInstant60 = null;
        org.joda.time.PeriodType periodType63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType63);
        int int65 = mutablePeriod64.getMonths();
        org.joda.time.Interval interval66 = new org.joda.time.Interval(readableInstant60, (org.joda.time.ReadablePeriod) mutablePeriod64);
        org.joda.time.Chronology chronology67 = interval66.getChronology();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 100, chronology67);
        boolean boolean69 = durationFieldType56.isSupported(chronology67);
        mutablePeriod48.setPeriod((long) '4', chronology67);
        int[] intArray71 = mutablePeriod48.getValues();
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType74);
        org.joda.time.DurationFieldType durationFieldType76 = org.joda.time.DurationFieldType.months();
        mutablePeriod75.set(durationFieldType76, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType79 = org.joda.time.DurationFieldType.months();
        boolean boolean80 = mutablePeriod75.isSupported(durationFieldType79);
        int int81 = mutablePeriod48.indexOf(durationFieldType79);
        int int82 = periodType25.indexOf(durationFieldType79);
        java.lang.String str83 = periodType25.getName();
        org.joda.time.PeriodType periodType86 = org.joda.time.PeriodType.years();
        java.lang.String str87 = periodType86.toString();
        org.joda.time.ReadableInstant readableInstant88 = null;
        org.joda.time.PeriodType periodType91 = null;
        org.joda.time.MutablePeriod mutablePeriod92 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType91);
        int int93 = mutablePeriod92.getMonths();
        org.joda.time.Interval interval94 = new org.joda.time.Interval(readableInstant88, (org.joda.time.ReadablePeriod) mutablePeriod92);
        org.joda.time.Chronology chronology95 = interval94.getChronology();
        org.joda.time.Period period96 = new org.joda.time.Period(1645514159731L, (long) 2022, periodType86, chronology95);
        org.joda.time.Period period97 = duration21.toPeriod(periodType25, chronology95);
        org.joda.time.MutablePeriod mutablePeriod98 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) mutableDateTime17, periodType25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        boolean boolean20 = durationField19.isSupported();
        boolean boolean21 = durationField19.isSupported();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        long long30 = durationField27.getMillis((long) 26180820, 0L);
        int int31 = durationField19.compareTo(durationField27);
        java.lang.String str32 = durationField19.toString();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutablePeriod35.add(readableDuration36);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        mutablePeriod42.set(durationFieldType43, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100, chronology54);
        boolean boolean56 = durationFieldType43.isSupported(chronology54);
        mutablePeriod35.setPeriod((long) '4', chronology54);
        java.lang.String str58 = chronology54.toString();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) 999, chronology54);
        org.joda.time.DurationField durationField60 = chronology54.centuries();
        int int61 = durationField19.compareTo(durationField60);
        long long63 = durationField60.getMillis((long) 29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField27", Math.signum(durationField19.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField19)));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
        long long2 = duration1.getMillis();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = localDate3.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.Hours hours7 = duration1.toStandardHours();
        org.joda.time.Hours hours8 = duration1.toStandardHours();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        boolean boolean24 = mutableDateTime19.isSupported(dateTimeFieldType23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        long long36 = dateTimeField34.roundHalfFloor((long) 1);
        mutableDateTime19.setRounding(dateTimeField34, (int) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        mutablePeriod42.set(durationFieldType43, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100, chronology54);
        boolean boolean56 = durationFieldType43.isSupported(chronology54);
        mutableDateTime19.add(durationFieldType43, (int) ' ');
        int int59 = mutableDateTime19.getSecondOfMinute();
        boolean boolean60 = dateTime17.equals((java.lang.Object) int59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime63 = dateTime17.toDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withSecondOfMinute(0);
        int int66 = dateTime63.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime65", (dateTime12.compareTo(dateTime65) == 0) == dateTime12.equals(dateTime65));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        mutablePeriod15.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod19);
        java.lang.String str21 = mutablePeriod15.toString();
        java.lang.String str22 = mutablePeriod15.toString();
        mutableDateTime10.add((org.joda.time.ReadablePeriod) mutablePeriod15, 86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant11", (mutableDateTime1.compareTo(instant11) == 0) == mutableDateTime1.equals(instant11));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        mutableDateTime1.setMonthOfYear(1);
        mutableDateTime1.addWeekyears(4);
        org.joda.time.Duration duration8 = new org.joda.time.Duration((long) (byte) 0);
        long long9 = duration8.getMillis();
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) (byte) 0);
        long long12 = duration11.getMillis();
        int int13 = duration8.compareTo((org.joda.time.ReadableDuration) duration11);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration8, 26162430);
        long long16 = duration8.getMillis();
        long long17 = duration8.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, readableDuration23, periodType24);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(chronology33);
        org.joda.time.DurationField durationField35 = chronology33.weeks();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology33);
        mutableDateTime19.setChronology(chronology33);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime19.secondOfDay();
        org.joda.time.Period period39 = duration8.toPeriodTo((org.joda.time.ReadableInstant) mutableDateTime19);
        int int40 = mutableDateTime19.getCenturyOfEra();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime44 = dateTime42.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property45 = dateTime44.dayOfMonth();
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType48);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType52);
        mutablePeriod49.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod53);
        java.lang.String str55 = mutablePeriod49.toString();
        org.joda.time.Interval interval56 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime44, (org.joda.time.ReadablePeriod) mutablePeriod49);
        mutablePeriod49.setValue(0, 2022);
        mutablePeriod49.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime64 = dateMidnight63.toMutableDateTime();
        mutableDateTime64.add((long) 1);
        org.joda.time.DateTime dateTime67 = mutableDateTime64.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.years();
        org.joda.time.Period period70 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime64, readableDuration68, periodType69);
        org.joda.time.Chronology chronology71 = mutableDateTime64.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.yearOfEra();
        mutablePeriod49.add(35417L, chronology71);
        org.joda.time.DateTimeField dateTimeField74 = chronology71.year();
        org.joda.time.DurationField durationField75 = chronology71.eras();
        mutableDateTime19.setChronology(chronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField35 and durationField75", Math.signum(durationField35.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField35)));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.Instant instant5 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property6.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant5", (dateTime3.compareTo(instant5) == 0) == dateTime3.equals(instant5));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
        long long2 = duration1.getMillis();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = localDate3.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.Hours hours7 = duration1.toStandardHours();
        org.joda.time.Hours hours8 = duration1.toStandardHours();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.era();
        boolean boolean24 = mutableDateTime19.isSupported(dateTimeFieldType23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime19.hourOfDay();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.weekyearOfCentury();
        long long36 = dateTimeField34.roundHalfFloor((long) 1);
        mutableDateTime19.setRounding(dateTimeField34, (int) (byte) 0);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.months();
        mutablePeriod42.set(durationFieldType43, (int) 'a');
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        int int52 = mutablePeriod51.getMonths();
        org.joda.time.Interval interval53 = new org.joda.time.Interval(readableInstant47, (org.joda.time.ReadablePeriod) mutablePeriod51);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100, chronology54);
        boolean boolean56 = durationFieldType43.isSupported(chronology54);
        mutableDateTime19.add(durationFieldType43, (int) ' ');
        int int59 = mutableDateTime19.getSecondOfMinute();
        boolean boolean60 = dateTime17.equals((java.lang.Object) int59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime63 = dateTime17.toDateTime(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property66 = dateTime65.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime63", (dateTime15.compareTo(dateTime63) == 0) == dateTime15.equals(dateTime63));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.plusDays(26162616);
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) (byte) 0);
        long long6 = duration5.getMillis();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property8 = localDate7.dayOfYear();
        org.joda.time.DateMidnight dateMidnight9 = localDate7.toDateMidnight();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.Hours hours11 = duration5.toStandardHours();
        org.joda.time.Hours hours12 = duration5.toStandardHours();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime19 = dateTime16.plusSeconds(10);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, (org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight22.toMutableDateTime();
        mutableDateTime23.add((long) 1);
        org.joda.time.DateTime dateTime26 = mutableDateTime23.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.era();
        boolean boolean28 = mutableDateTime23.isSupported(dateTimeFieldType27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.hourOfDay();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        int int35 = mutablePeriod34.getMonths();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableInstant30, (org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyearOfCentury();
        long long40 = dateTimeField38.roundHalfFloor((long) 1);
        mutableDateTime23.setRounding(dateTimeField38, (int) (byte) 0);
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.months();
        mutablePeriod46.set(durationFieldType47, (int) 'a');
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType54);
        int int56 = mutablePeriod55.getMonths();
        org.joda.time.Interval interval57 = new org.joda.time.Interval(readableInstant51, (org.joda.time.ReadablePeriod) mutablePeriod55);
        org.joda.time.Chronology chronology58 = interval57.getChronology();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 100, chronology58);
        boolean boolean60 = durationFieldType47.isSupported(chronology58);
        mutableDateTime23.add(durationFieldType47, (int) ' ');
        int int63 = mutableDateTime23.getSecondOfMinute();
        boolean boolean64 = dateTime21.equals((java.lang.Object) int63);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTime dateTime67 = dateTime21.toDateTime(dateTimeZone66);
        org.joda.time.DateTime dateTime69 = dateTime67.withSecondOfMinute(0);
        int int70 = dateMidnight0.compareTo((org.joda.time.ReadableInstant) dateTime69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime67", (dateTime19.compareTo(dateTime67) == 0) == dateTime19.equals(dateTime67));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period3 = period1.minusYears(8);
        org.joda.time.Period period5 = period1.withSeconds(11);
        int int6 = period5.getMinutes();
        org.joda.time.Period period7 = period5.toPeriod();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DurationField durationField13 = property11.getDurationField();
        boolean boolean14 = durationField13.isPrecise();
        boolean boolean15 = period5.equals((java.lang.Object) boolean14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime17 = dateMidnight16.toMutableDateTime();
        mutableDateTime17.add((long) 1);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.months();
        mutableDateTime17.add(durationFieldType20, (int) (byte) 1);
        org.joda.time.Period period24 = period5.withFieldAdded(durationFieldType20, 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutablePeriod29.add(readableDuration30);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.months();
        mutablePeriod36.set(durationFieldType37, (int) 'a');
        org.joda.time.ReadableInstant readableInstant41 = null;
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType44);
        int int46 = mutablePeriod45.getMonths();
        org.joda.time.Interval interval47 = new org.joda.time.Interval(readableInstant41, (org.joda.time.ReadablePeriod) mutablePeriod45);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 100, chronology48);
        boolean boolean50 = durationFieldType37.isSupported(chronology48);
        mutablePeriod29.setPeriod((long) '4', chronology48);
        java.lang.String str52 = chronology48.toString();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 999, chronology48);
        org.joda.time.DurationField durationField54 = chronology48.centuries();
        org.joda.time.DurationField durationField55 = durationFieldType26.getField(chronology48);
        boolean boolean56 = period24.isSupported(durationFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField55", (durationField13.compareTo(durationField55) == 0) == durationField13.equals(durationField55));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusYears((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withYear((int) (byte) 0);
        org.joda.time.DateMidnight.Property property15 = dateMidnight12.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight17 = property15.addToCopy(12);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.monthOfYear();
        org.joda.time.Instant instant19 = dateMidnight17.toInstant();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateMidnight17);
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusMillis((int) ' ');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfYear((int) (byte) 1);
        int int32 = dateTime31.getDayOfMonth();
        org.joda.time.Duration duration34 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime35 = dateTime31.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime27.withDurationAdded((org.joda.time.ReadableDuration) duration34, 3);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime27.minusDays(2922789);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime27.plusDays(26200509);
        org.joda.time.LocalDateTime.Property property42 = localDateTime27.minuteOfHour();
        boolean boolean43 = duration6.equals((java.lang.Object) property42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 10, (long) ' ');
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100, 4, (int) (byte) 10, (int) (short) 1, (int) (short) 1, (int) '4');
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        boolean boolean11 = interval2.contains((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property13 = localDate12.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = localDate12.toDateMidnight();
        org.joda.time.Chronology chronology15 = localDate12.getChronology();
        org.joda.time.DateMidnight dateMidnight16 = org.joda.time.DateMidnight.now(chronology15);
        org.joda.time.Chronology chronology17 = dateMidnight16.getChronology();
        org.joda.time.Interval interval18 = interval2.withChronology(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight14 and dateMidnight16", (dateMidnight14.compareTo(dateMidnight16) == 0) == dateMidnight14.equals(dateMidnight16));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        int int6 = mutablePeriod5.getMonths();
        org.joda.time.Interval interval7 = new org.joda.time.Interval(readableInstant1, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 100, chronology8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = localDate10.toDateMidnight();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) dateMidnight12);
        java.lang.Object obj14 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType18 = periodType17.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        int int24 = mutablePeriod23.getMonths();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableInstant19, (org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(chronology26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType31);
        int int33 = mutablePeriod32.getMonths();
        org.joda.time.Interval interval34 = new org.joda.time.Interval(readableInstant28, (org.joda.time.ReadablePeriod) mutablePeriod32);
        int[] intArray37 = chronology26.get((org.joda.time.ReadablePeriod) mutablePeriod32, 1L, (long) 4);
        org.joda.time.Period period38 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType17, chronology26);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(obj14, chronology26);
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone42);
        org.joda.time.DateTime dateTime44 = localDate39.toDateTimeAtMidnight(dateTimeZone42);
        int int45 = localDate39.getWeekyear();
        org.joda.time.LocalDate localDate47 = localDate39.withDayOfYear((int) (short) 1);
        java.util.Date date48 = localDate47.toDate();
        org.joda.time.DateMidnight dateMidnight49 = dateMidnight12.withFields((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight12.withCenturyOfEra(830);
        org.joda.time.Instant instant52 = dateMidnight12.toInstant();
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight12.withDurationAdded((long) 101, 26162616);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant52", (dateTime44.compareTo(instant52) == 0) == dateTime44.equals(instant52));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone5);
        long long8 = dateTimeZone5.previousTransition((long) (short) -1);
        org.joda.time.DateTime dateTime9 = localDateTime2.toDateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int12 = dateTime11.getMinuteOfHour();
        int int13 = dateTime11.getHourOfDay();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        calendar15.add(4, 0);
        java.time.Instant instant19 = calendar15.toInstant();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight21.toMutableDateTime();
        mutableDateTime22.add((long) 1);
        mutableDateTime22.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime22.getZone();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(0L, dateTimeZone28);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((java.lang.Object) calendar15, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime11.toDateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime30", (dateTime9.compareTo(mutableDateTime30) == 0) == dateTime9.equals(mutableDateTime30));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property3 = localDate2.dayOfYear();
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(chronology5);
        org.joda.time.Period period7 = new org.joda.time.Period(1641109352421L, (long) 441, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and dateMidnight6", (dateMidnight4.compareTo(dateMidnight6) == 0) == dateMidnight4.equals(dateMidnight6));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra(2);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        int int10 = localTime9.size();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        boolean boolean12 = localTime9.equals((java.lang.Object) locale11);
        org.joda.time.LocalTime localTime14 = localTime9.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology15 = localTime9.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(chronology15);
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = interval17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.hourOfDay();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        long long18 = dateTimeField16.roundHalfFloor((long) 1);
        mutableDateTime1.setRounding(dateTimeField16, (int) (byte) 0);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.months();
        mutablePeriod24.set(durationFieldType25, (int) 'a');
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType32);
        int int34 = mutablePeriod33.getMonths();
        org.joda.time.Interval interval35 = new org.joda.time.Interval(readableInstant29, (org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.Chronology chronology36 = interval35.getChronology();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 100, chronology36);
        boolean boolean38 = durationFieldType25.isSupported(chronology36);
        mutableDateTime1.add(durationFieldType25, (int) ' ');
        int int41 = mutableDateTime1.getSecondOfMinute();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.LocalDate localDate44 = org.joda.time.LocalDate.now(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight46 = org.joda.time.DateMidnight.now();
        int int47 = dateTimeZone43.getOffset((org.joda.time.ReadableInstant) dateMidnight46);
        mutableDateTime1.setZoneRetainFields(dateTimeZone43);
        org.joda.time.Instant instant49 = mutableDateTime1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone50.previousTransition((long) 20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant49", (mutableDateTime1.compareTo(instant49) == 0) == mutableDateTime1.equals(instant49));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.Instant instant5 = dateTime3.toInstant();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = property6.addToCopy(26299664);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant5", (dateTime3.compareTo(instant5) == 0) == dateTime3.equals(instant5));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((org.joda.time.ReadableDuration) duration6);
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.plusYears((int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withYear((int) (byte) 0);
        org.joda.time.DateMidnight.Property property15 = dateMidnight12.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight17 = property15.addToCopy(12);
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.monthOfYear();
        org.joda.time.Instant instant19 = dateMidnight17.toInstant();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration6, (org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Duration duration22 = duration6.minus(789L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight17 and instant19", (dateMidnight17.compareTo(instant19) == 0) == dateMidnight17.equals(instant19));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra(2);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now();
        int int9 = localTime8.size();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        boolean boolean11 = localTime8.equals((java.lang.Object) locale10);
        org.joda.time.LocalTime localTime13 = localTime8.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology14 = localTime8.getChronology();
        org.joda.time.DateTime dateTime15 = dateTime5.toDateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTime dateTime18 = property16.addToCopy((long) 2000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime15", (dateTime5.compareTo(dateTime15) == 0) == dateTime5.equals(dateTime15));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType5 = periodType4.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType9);
        int int11 = mutablePeriod10.getMonths();
        org.joda.time.Interval interval12 = new org.joda.time.Interval(readableInstant6, (org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(chronology13);
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        int int20 = mutablePeriod19.getMonths();
        org.joda.time.Interval interval21 = new org.joda.time.Interval(readableInstant15, (org.joda.time.ReadablePeriod) mutablePeriod19);
        int[] intArray24 = chronology13.get((org.joda.time.ReadablePeriod) mutablePeriod19, 1L, (long) 4);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType4, chronology13);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutablePeriod27.add(readableDuration28);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.months();
        mutablePeriod34.set(durationFieldType35, (int) 'a');
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType42);
        int int44 = mutablePeriod43.getMonths();
        org.joda.time.Interval interval45 = new org.joda.time.Interval(readableInstant39, (org.joda.time.ReadablePeriod) mutablePeriod43);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 100, chronology46);
        boolean boolean48 = durationFieldType35.isSupported(chronology46);
        mutablePeriod27.setPeriod((long) '4', chronology46);
        int[] intArray50 = mutablePeriod27.getValues();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType53);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.months();
        mutablePeriod54.set(durationFieldType55, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.months();
        boolean boolean59 = mutablePeriod54.isSupported(durationFieldType58);
        int int60 = mutablePeriod27.indexOf(durationFieldType58);
        int int61 = periodType4.indexOf(durationFieldType58);
        java.lang.String str62 = periodType4.getName();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime66 = dateTime64.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property67 = dateTime66.dayOfMonth();
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.MutablePeriod mutablePeriod71 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType70);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.MutablePeriod mutablePeriod75 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType74);
        mutablePeriod71.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod75);
        java.lang.String str77 = mutablePeriod71.toString();
        org.joda.time.Interval interval78 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime66, (org.joda.time.ReadablePeriod) mutablePeriod71);
        mutablePeriod71.setValue(0, 2022);
        mutablePeriod71.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight85 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime86 = dateMidnight85.toMutableDateTime();
        mutableDateTime86.add((long) 1);
        org.joda.time.DateTime dateTime89 = mutableDateTime86.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration90 = null;
        org.joda.time.PeriodType periodType91 = org.joda.time.PeriodType.years();
        org.joda.time.Period period92 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime86, readableDuration90, periodType91);
        org.joda.time.Chronology chronology93 = mutableDateTime86.getChronology();
        org.joda.time.DateTimeField dateTimeField94 = chronology93.yearOfEra();
        mutablePeriod71.add(35417L, chronology93);
        org.joda.time.DateTimeField dateTimeField96 = chronology93.year();
        org.joda.time.DurationField durationField97 = chronology93.eras();
        org.joda.time.Period period98 = new org.joda.time.Period(5258747819652L, 825915242387812574L, periodType4, chronology93);
        org.joda.time.DurationField durationField99 = chronology93.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField97, durationField99, and durationField97", !(durationField97.compareTo(durationField99) == 0) || (Math.signum(durationField97.compareTo(durationField97)) == Math.signum(durationField99.compareTo(durationField97))));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateMidnight dateMidnight2 = localDate0.toDateMidnight();
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DateMidnight dateMidnight4 = org.joda.time.DateMidnight.now(chronology3);
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight4", (dateMidnight2.compareTo(dateMidnight4) == 0) == dateMidnight2.equals(dateMidnight4));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundHalfFloor();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
        long long12 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime11);
        org.joda.time.DateTime dateTime13 = mutableDateTime11.toDateTime();
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.parse("2022-02-22T00:00:00.001Z");
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardMinutes((long) 9);
        org.joda.time.DateTime dateTime18 = dateTime15.plus((org.joda.time.ReadableDuration) duration17);
        org.joda.time.DateMidnight dateMidnight19 = dateTime15.toDateMidnight();
        mutableDateTime11.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight0 and dateMidnight19", (dateMidnight0.compareTo(dateMidnight19) == 0) == dateMidnight0.equals(dateMidnight19));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.PeriodType periodType4 = periodType2.withMillisRemoved();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        int int10 = mutablePeriod9.getMonths();
        org.joda.time.Interval interval11 = new org.joda.time.Interval(readableInstant5, (org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(chronology12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        int[] intArray23 = chronology12.get((org.joda.time.ReadablePeriod) mutablePeriod18, 1L, (long) 4);
        org.joda.time.DurationField durationField24 = chronology12.eras();
        org.joda.time.DateTimeField dateTimeField25 = chronology12.centuryOfEra();
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(chronology33);
        org.joda.time.YearMonthDay yearMonthDay36 = yearMonthDay34.minusMonths((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight37 = yearMonthDay36.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime39 = dateMidnight38.toMutableDateTime();
        mutableDateTime39.add((long) 1);
        mutableDateTime39.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime39.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime39.getZone();
        org.joda.time.DateTime dateTime46 = yearMonthDay36.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.Chronology chronology47 = chronology12.withZone(dateTimeZone45);
        org.joda.time.Period period48 = new org.joda.time.Period(1645514297007L, 0L, periodType2, chronology47);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = null;
        boolean boolean51 = localDate49.isSupported(dateTimeFieldType50);
        org.joda.time.LocalDate localDate53 = localDate49.withWeekyear((int) (short) 100);
        int int54 = localDate49.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property55 = localDate49.monthOfYear();
        org.joda.time.DurationField durationField56 = property55.getLeapDurationField();
        org.joda.time.DurationFieldType durationFieldType57 = durationField56.getType();
        boolean boolean58 = periodType2.isSupported(durationFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField56", Math.signum(durationField24.compareTo(durationField56)) == -Math.signum(durationField56.compareTo(durationField24)));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateMidnight dateMidnight2 = localDate0.toDateMidnight();
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DateMidnight dateMidnight4 = org.joda.time.DateMidnight.now(chronology3);
        org.joda.time.Chronology chronology5 = dateMidnight4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight2 and dateMidnight4", (dateMidnight2.compareTo(dateMidnight4) == 0) == dateMidnight2.equals(dateMidnight4));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.util.Calendar calendar6 = dateMidnight0.toCalendar(locale3);
        calendar6.setLenient(false);
        java.lang.String str9 = calendar6.getCalendarType();
        java.util.Locale locale10 = java.util.Locale.PRC;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.add(4, 0);
        java.util.Date date21 = new java.util.Date(4, (int) (byte) 100, (int) (short) 0, (int) (short) 0, (int) '4', 2);
        date21.setHours((int) (short) 100);
        date21.setHours(10);
        date21.setDate(1969);
        org.joda.time.YearMonthDay yearMonthDay28 = org.joda.time.YearMonthDay.fromDateFields(date21);
        calendar11.setTime(date21);
        int int30 = date21.getTimezoneOffset();
        calendar6.setTime(date21);
        org.joda.time.Period period33 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period35 = period33.minusYears(8);
        org.joda.time.Period period37 = period33.withSeconds(11);
        int int38 = period37.getMinutes();
        org.joda.time.Period period39 = period37.toPeriod();
        org.joda.time.LocalDate localDate40 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = localDate40.isSupported(dateTimeFieldType41);
        org.joda.time.LocalDate.Property property43 = localDate40.yearOfEra();
        org.joda.time.DateTimeField dateTimeField44 = property43.getField();
        org.joda.time.DurationField durationField45 = property43.getDurationField();
        boolean boolean46 = durationField45.isPrecise();
        boolean boolean47 = period37.equals((java.lang.Object) boolean46);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight48.toMutableDateTime();
        mutableDateTime49.add((long) 1);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.months();
        mutableDateTime49.add(durationFieldType52, (int) (byte) 1);
        org.joda.time.Period period56 = period37.withFieldAdded(durationFieldType52, 70);
        org.joda.time.MutablePeriod mutablePeriod57 = period37.toMutablePeriod();
        org.joda.time.Period period59 = period37.plusDays((int) (byte) -1);
        org.joda.time.Period period61 = period59.minusHours((int) 'a');
        boolean boolean62 = date21.equals((java.lang.Object) period59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar11", (calendar6.compareTo(calendar11) == 0) == calendar6.equals(calendar11));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime3.minusDays(26160118);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object) "PT0.034S");
        int int13 = mutablePeriod12.size();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight14.toMutableDateTime();
        mutableDateTime15.add((long) 1);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime15.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        int int20 = property18.getMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime22 = property18.addWrapField(12);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withEra(1);
        org.joda.time.DateTime dateTime29 = dateTime24.plusMillis(0);
        org.joda.time.DateTime.Property property30 = dateTime24.hourOfDay();
        org.joda.time.DateTime dateTime31 = property30.roundHalfEvenCopy();
        mutablePeriod12.setPeriod((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime33 = dateTime31.toDateTime();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property35 = localDate34.dayOfYear();
        org.joda.time.DateMidnight dateMidnight36 = localDate34.toDateMidnight();
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.yearOfEra();
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime10.toDateTime(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime39", (dateTime31.compareTo(dateTime39) == 0) == dateTime31.equals(dateTime39));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        mutablePeriod4.set(durationFieldType5, (int) 'a');
        mutablePeriod4.addHours((int) (byte) -1);
        mutablePeriod4.setYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableDuration12, (org.joda.time.ReadableInstant) dateTime14);
        boolean boolean17 = interval15.equals((java.lang.Object) 1L);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.withMillis((long) (short) 0);
        boolean boolean21 = interval15.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) (byte) 0);
        long long24 = duration23.getStandardDays();
        org.joda.time.Interval interval25 = interval15.withDurationAfterStart((org.joda.time.ReadableDuration) duration23);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType37);
        mutablePeriod34.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        java.lang.String str40 = mutablePeriod34.toString();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadablePeriod) mutablePeriod34);
        mutablePeriod34.setValue(0, 2022);
        mutablePeriod34.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight48.toMutableDateTime();
        mutableDateTime49.add((long) 1);
        org.joda.time.DateTime dateTime52 = mutableDateTime49.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.PeriodType periodType54 = org.joda.time.PeriodType.years();
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime49, readableDuration53, periodType54);
        org.joda.time.Chronology chronology56 = mutableDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.yearOfEra();
        mutablePeriod34.add(35417L, chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.year();
        org.joda.time.DurationField durationField60 = chronology56.eras();
        mutablePeriod4.setPeriod((org.joda.time.ReadableDuration) duration23, chronology56);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(295620000L, chronology56);
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight64.toMutableDateTime();
        mutableDateTime65.add((long) 1);
        org.joda.time.DateTime dateTime68 = mutableDateTime65.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.years();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime65, readableDuration69, periodType70);
        java.lang.String str72 = mutableDateTime65.toString();
        org.joda.time.Chronology chronology73 = mutableDateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = chronology73.weekOfWeekyear();
        org.joda.time.DurationField durationField75 = chronology73.millis();
        org.joda.time.Period period76 = new org.joda.time.Period((long) 26173917, chronology73);
        org.joda.time.Period period78 = period76.minusMillis(6);
        org.joda.time.LocalDateTime localDateTime79 = localDateTime62.plus((org.joda.time.ReadablePeriod) period76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField60 and durationField75", Math.signum(durationField60.compareTo(durationField75)) == -Math.signum(durationField75.compareTo(durationField60)));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.years();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.LocalDate localDate13 = property9.setCopy(2022);
        org.joda.time.LocalDate localDate14 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate16 = property9.addToCopy(365);
        int[] intArray18 = chronology4.get((org.joda.time.ReadablePartial) localDate16, (long) 26298354);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField5 and durationField11", (durationField5.compareTo(durationField11) == 0) == durationField5.equals(durationField11));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withHourOfDay(2);
        int int3 = timeOfDay2.getSecondOfMinute();
        java.util.Locale locale5 = null;
        java.lang.String str6 = timeOfDay2.toString("1969", locale5);
        org.joda.time.LocalTime localTime7 = timeOfDay2.toLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds(17);
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay10.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = timeOfDay17.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfMonth();
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        mutablePeriod30.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod34);
        java.lang.String str36 = mutablePeriod30.toString();
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime25, (org.joda.time.ReadablePeriod) mutablePeriod30);
        mutablePeriod30.setValue(0, 2022);
        mutablePeriod30.addDays((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay17.plus((org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.millisOfSecond();
        org.joda.time.DurationField durationField45 = property44.getDurationField();
        org.joda.time.TimeOfDay timeOfDay46 = property44.getTimeOfDay();
        int int47 = timeOfDay46.getMinuteOfHour();
        int int48 = timeOfDay46.getHourOfDay();
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod((java.lang.Object) "PT0.034S");
        mutablePeriod50.setPeriod(2013, 270, 100, (int) 'x', 2000, 0, 14, (int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay46.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod50, 8);
        org.joda.time.LocalTime localTime62 = localTime7.minus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.Period period64 = org.joda.time.Period.hours(244);
        org.joda.time.LocalTime localTime65 = localTime7.plus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property68 = dateTime67.secondOfDay();
        org.joda.time.DateTime dateTime70 = dateTime67.withEra(1);
        org.joda.time.DateTime dateTime72 = dateTime67.plusMillis(0);
        org.joda.time.Instant instant73 = dateTime72.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int75 = instant73.get(dateTimeFieldType74);
        boolean boolean76 = localTime65.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant73", (dateTime12.compareTo(instant73) == 0) == dateTime12.equals(instant73));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, (org.joda.time.ReadableInstant) dateTime7, periodType12);
        int int14 = dateMidnight4.getDayOfYear();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) ' ', chronology16);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod21.set(durationFieldType22, (int) 'a');
        mutablePeriod17.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod21);
        mutablePeriod21.setDays(0);
        mutablePeriod21.clear();
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        mutableDateTime30.add((long) 1);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight33.toMutableDateTime();
        mutableDateTime34.add((long) 1);
        org.joda.time.DateTime dateTime37 = mutableDateTime34.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.PeriodType periodType39 = org.joda.time.PeriodType.years();
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime34, readableDuration38, periodType39);
        java.lang.String str41 = mutableDateTime34.toString();
        mutableDateTime34.addMinutes((int) ' ');
        int int44 = mutableDateTime34.getCenturyOfEra();
        mutablePeriod21.setPeriod((org.joda.time.ReadableInstant) mutableDateTime30, (org.joda.time.ReadableInstant) mutableDateTime34);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight4.plus((org.joda.time.ReadablePeriod) mutablePeriod21);
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
        org.joda.time.Duration duration67 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean68 = duration63.isShorterThan((org.joda.time.ReadableDuration) duration67);
        org.joda.time.Duration duration70 = new org.joda.time.Duration((long) (byte) 0);
        long long71 = duration70.getStandardDays();
        org.joda.time.Duration duration72 = duration63.plus((org.joda.time.ReadableDuration) duration70);
        org.joda.time.Duration duration74 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.Duration duration75 = duration70.minus((org.joda.time.ReadableDuration) duration74);
        long long76 = duration75.getStandardSeconds();
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.years();
        java.lang.String str78 = periodType77.toString();
        org.joda.time.PeriodType periodType79 = periodType77.withMinutesRemoved();
        org.joda.time.Period period80 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight46, (org.joda.time.ReadableDuration) duration75, periodType79);
        int int81 = dateMidnight46.getMillisOfDay();
        org.joda.time.DateTime dateTime83 = org.joda.time.DateTime.parse("2022-02-22T00:00:00.001Z");
        org.joda.time.Duration duration85 = org.joda.time.Duration.standardMinutes((long) 9);
        org.joda.time.DateTime dateTime86 = dateTime83.plus((org.joda.time.ReadableDuration) duration85);
        org.joda.time.DateMidnight dateMidnight87 = dateMidnight46.minus((org.joda.time.ReadableDuration) duration85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime30 and dateTime83", (mutableDateTime30.compareTo(dateTime83) == 0) == mutableDateTime30.equals(dateTime83));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-22T00:00:00.001Z");
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(100);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTime3.getZone();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        mutableDateTime6.add((long) 1);
        org.joda.time.DateTime dateTime9 = mutableDateTime6.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime6, readableDuration10, periodType11);
        org.joda.time.Weeks weeks13 = period12.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter14 = null;
        java.lang.String str15 = period12.toString(periodFormatter14);
        org.joda.time.Period period16 = new org.joda.time.Period((java.lang.Object) periodFormatter14);
        org.joda.time.DateTime dateTime17 = dateTime3.minus((org.joda.time.ReadablePeriod) period16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime6", (dateTime1.compareTo(mutableDateTime6) == 0) == dateTime1.equals(mutableDateTime6));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        mutablePeriod8.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight22.toMutableDateTime();
        mutableDateTime23.add((long) 1);
        org.joda.time.DateTime dateTime26 = mutableDateTime23.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.years();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime23, readableDuration27, periodType28);
        org.joda.time.Chronology chronology30 = mutableDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfEra();
        mutablePeriod8.add(35417L, chronology30);
        mutablePeriod8.addDays((int) (byte) -1);
        java.lang.String str35 = mutablePeriod8.toString();
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.yearOfCentury();
        int int38 = dateMidnight36.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.plusDays((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight40.withDurationAdded((long) (byte) 0, (int) (short) 10);
        org.joda.time.DateMidnight.Property property44 = dateMidnight43.dayOfYear();
        org.joda.time.Duration duration45 = mutablePeriod8.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight43);
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = dateMidnight49.minusWeeks(0);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime55 = dateTime53.withDayOfYear((int) (byte) 1);
        int int56 = dateTime55.getDayOfMonth();
        org.joda.time.Duration duration58 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime59 = dateTime55.minus((org.joda.time.ReadableDuration) duration58);
        org.joda.time.DateMidnight dateMidnight60 = dateMidnight51.minus((org.joda.time.ReadableDuration) duration58);
        org.joda.time.LocalDate localDate61 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property62 = localDate61.dayOfYear();
        org.joda.time.DateMidnight dateMidnight63 = localDate61.toDateMidnight();
        org.joda.time.Chronology chronology64 = localDate61.getChronology();
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight51.withFields((org.joda.time.ReadablePartial) localDate61);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight51.minus((org.joda.time.ReadableDuration) duration67);
        org.joda.time.DateMidnight.Property property69 = dateMidnight68.year();
        org.joda.time.DateMidnight dateMidnight71 = property69.addToCopy(26242316);
        org.joda.time.DateMidnight dateMidnight72 = property69.withMaximumValue();
        org.joda.time.Instant instant73 = dateMidnight72.toInstant();
        org.joda.time.Interval interval74 = duration45.toIntervalTo((org.joda.time.ReadableInstant) instant73);
        org.joda.time.Interval interval75 = interval74.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight72 and instant73", (dateMidnight72.compareTo(instant73) == 0) == dateMidnight72.equals(instant73));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        int int2 = dateMidnight0.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.plusDays((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        mutableDateTime6.add((long) 1);
        mutableDateTime6.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.weekOfWeekyear();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight13.toMutableDateTime();
        mutableDateTime14.add((long) 1);
        org.joda.time.DateTime dateTime17 = mutableDateTime14.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.years();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime14, readableDuration18, periodType19);
        org.joda.time.Chronology chronology21 = mutableDateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now(chronology21);
        mutableDateTime6.setMillis((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime22.secondOfDay();
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) (byte) 0);
        long long27 = duration26.getMillis();
        long long28 = duration26.getMillis();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime22.millisOfDay();
        org.joda.time.Instant instant31 = mutableDateTime22.toInstant();
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight32.toMutableDateTime();
        mutableDateTime33.add((long) 1);
        org.joda.time.DateTime dateTime36 = mutableDateTime33.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.years();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime33, readableDuration37, periodType38);
        java.lang.String str40 = mutableDateTime33.toString();
        mutableDateTime33.addMinutes((int) ' ');
        int int43 = mutableDateTime33.getCenturyOfEra();
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone46);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(dateTimeZone46);
        mutableDateTime33.setZoneRetainFields(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        mutableDateTime33.setZone(dateTimeZone51);
        mutableDateTime22.setZoneRetainFields(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant31", (mutableDateTime6.compareTo(instant31) == 0) == mutableDateTime6.equals(instant31));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusYears(2022);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusYears(32770);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime14 = dateTime12.withYear(26254453);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(21);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(dateTimeZone16);
        long long23 = dateTimeZone16.adjustOffset(68896006764562000L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime20", (dateTime12.compareTo(dateTime20) == 0) == dateTime12.equals(dateTime20));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusYears(2022);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay6.plusYears(32770);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay6.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime14 = dateTime12.withYear(26254453);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(21);
        boolean boolean18 = dateTimeZone16.isStandardOffset((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(dateTimeZone16);
        int int22 = dateTimeZone16.getOffsetFromLocal(1645514378415L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime20", (dateTime12.compareTo(dateTime20) == 0) == dateTime12.equals(dateTime20));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        java.time.Instant instant5 = calendar1.toInstant();
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTime();
        mutableDateTime8.add((long) 1);
        mutableDateTime8.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime8.getZone();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) calendar1, dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime16.copy();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.months();
        mutablePeriod24.set(durationFieldType25, (int) 'a');
        mutablePeriod24.addHours((int) (byte) -1);
        mutablePeriod24.addYears(2022);
        mutableDateTime19.add((org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        mutableDateTime36.add((long) 1);
        org.joda.time.DateTime dateTime39 = mutableDateTime36.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.years();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime36, readableDuration40, periodType41);
        java.lang.String str43 = mutableDateTime36.toString();
        org.joda.time.Chronology chronology44 = mutableDateTime36.getChronology();
        mutablePeriod24.setPeriod(1645514159651L, (long) (short) -1, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime17, chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime16 and mutableDateTime47", (mutableDateTime16.compareTo(mutableDateTime47) == 0) == mutableDateTime16.equals(mutableDateTime47));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Calendar calendar12 = dateMidnight6.toCalendar(locale9);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale9.getDisplayCountry(locale13);
        java.lang.String str15 = locale5.getDisplayLanguage(locale13);
        java.lang.String str16 = locale3.getDisplayLanguage(locale5);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale5);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        int int20 = mutableDateTime19.getYearOfEra();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now();
        int int22 = localTime21.size();
        org.joda.time.LocalTime.Property property23 = localTime21.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = localTime21.toDateTimeToday(dateTimeZone24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime19, dateTimeZone24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime30 = dateTime28.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfMonth();
        int int32 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime30);
        int int34 = dateTimeZone24.getStandardOffset(1645514263699L);
        boolean boolean35 = calendar17.after((java.lang.Object) 1645514263699L);
        java.util.TimeZone timeZone36 = calendar17.getTimeZone();
        int int37 = timeZone36.getRawOffset();
        int int38 = timeZone36.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar17", (calendar10.compareTo(calendar17) == 0) == calendar10.equals(calendar17));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.DateMidnight.Property property5 = dateMidnight0.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        org.joda.time.Interval interval10 = localDate6.toInterval();
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(20);
        boolean boolean14 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays(10);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = dateTime16.plusSeconds(26162430);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMillis((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        mutableDateTime22.setMillis((long) 21);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 399, dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getName((long) (byte) 1);
        mutableDateTime22.setZone(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime19.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime33", (dateTime19.compareTo(dateTime33) == 0) == dateTime19.equals(dateTime33));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = timeOfDay0.getFieldTypes();
        org.joda.time.Chronology chronology2 = timeOfDay0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.weekOfWeekyear();
        long long5 = dateTimeField3.roundHalfFloor(10L);
        org.joda.time.DurationField durationField6 = dateTimeField3.getRangeDurationField();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Locale.Builder builder10 = builder8.setLocale(locale9);
        java.lang.String str11 = dateTimeField3.getAsText(2122, locale9);
        int int13 = dateTimeField3.getLeapAmount((long) 2022);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime17 = dateTime16.toLocalTime();
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfDay((int) '#');
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("53");
        boolean boolean24 = timeZone23.observesDaylightTime();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfMonth();
        org.joda.time.DateTime dateTime31 = dateTime28.plusSeconds(10);
        org.joda.time.DateTime.Property property32 = dateTime31.year();
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime37 = dateTime35.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime38 = timeOfDay33.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay33.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean44 = timeOfDay40.isSupported(dateTimeFieldType43);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime48 = dateTime46.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property49 = dateTime48.dayOfMonth();
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType56);
        mutablePeriod53.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod57);
        java.lang.String str59 = mutablePeriod53.toString();
        org.joda.time.Interval interval60 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime48, (org.joda.time.ReadablePeriod) mutablePeriod53);
        mutablePeriod53.setValue(0, 2022);
        mutablePeriod53.addDays((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay40.plus((org.joda.time.ReadablePeriod) mutablePeriod53);
        org.joda.time.TimeOfDay.Property property67 = timeOfDay66.millisOfSecond();
        org.joda.time.DurationField durationField68 = property67.getDurationField();
        org.joda.time.TimeOfDay timeOfDay69 = property67.getTimeOfDay();
        int int70 = property67.getMaximumValueOverall();
        java.util.Locale locale72 = java.util.Locale.CHINA;
        java.util.Locale locale73 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar74 = java.util.Calendar.getInstance(locale73);
        java.lang.String str75 = locale72.getDisplayVariant(locale73);
        org.joda.time.TimeOfDay timeOfDay76 = property67.setCopy("1", locale72);
        java.lang.String str77 = property32.getAsShortText(locale72);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(timeZone23, locale72);
        java.lang.String str79 = property20.getAsShortText(locale72);
        java.lang.String str80 = dateTimeField3.getAsText((long) 26166853, locale72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar74 and calendar78", (calendar74.compareTo(calendar78) == 0) == calendar74.equals(calendar78));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("53");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str4 = locale3.getCountry();
        java.util.Locale locale5 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale8.getDisplayVariant(locale9);
        java.util.Calendar calendar12 = dateMidnight6.toCalendar(locale9);
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        java.lang.String str14 = locale9.getDisplayCountry(locale13);
        java.lang.String str15 = locale5.getDisplayLanguage(locale13);
        java.lang.String str16 = locale3.getDisplayLanguage(locale5);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale5);
        calendar17.setFirstDayOfWeek(10);
        int int20 = calendar17.getMinimalDaysInFirstWeek();
        int int21 = calendar17.getFirstDayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay22 = org.joda.time.YearMonthDay.fromCalendarFields(calendar17);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.withYear(69);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime26 = dateMidnight25.toMutableDateTime();
        mutableDateTime26.add((long) 1);
        org.joda.time.DateTime dateTime29 = mutableDateTime26.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.years();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime26, readableDuration30, periodType31);
        java.lang.String str33 = mutableDateTime26.toString();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime26.millisOfSecond();
        int int35 = mutableDateTime26.getYearOfCentury();
        long long36 = mutableDateTime26.getMillis();
        org.joda.time.DateTime dateTime37 = yearMonthDay22.toDateTime((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar10 and calendar17", (calendar10.compareTo(calendar17) == 0) == calendar10.equals(calendar17));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        mutablePeriod3.set(durationFieldType4, (int) 'a');
        mutablePeriod3.addHours((int) (byte) -1);
        mutablePeriod3.setYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = interval14.equals((java.lang.Object) 1L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.withMillis((long) (short) 0);
        boolean boolean20 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) 0);
        long long23 = duration22.getStandardDays();
        org.joda.time.Interval interval24 = interval14.withDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfMonth();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        mutablePeriod33.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        java.lang.String str39 = mutablePeriod33.toString();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadablePeriod) mutablePeriod33);
        mutablePeriod33.setValue(0, 2022);
        mutablePeriod33.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight47.toMutableDateTime();
        mutableDateTime48.add((long) 1);
        org.joda.time.DateTime dateTime51 = mutableDateTime48.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.years();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime48, readableDuration52, periodType53);
        org.joda.time.Chronology chronology55 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfEra();
        mutablePeriod33.add(35417L, chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.year();
        org.joda.time.DurationField durationField59 = chronology55.eras();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration22, chronology55);
        org.joda.time.DurationField durationField61 = chronology55.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField61, and durationField59", !(durationField59.compareTo(durationField61) == 0) || (Math.signum(durationField59.compareTo(durationField59)) == Math.signum(durationField61.compareTo(durationField59))));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        mutablePeriod3.set(durationFieldType4, (int) 'a');
        mutablePeriod3.addHours((int) (byte) -1);
        mutablePeriod3.setYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateTime13);
        boolean boolean16 = interval14.equals((java.lang.Object) 1L);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.withMillis((long) (short) 0);
        boolean boolean20 = interval14.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Duration duration22 = new org.joda.time.Duration((long) (byte) 0);
        long long23 = duration22.getStandardDays();
        org.joda.time.Interval interval24 = interval14.withDurationAfterStart((org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfMonth();
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType36);
        mutablePeriod33.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod37);
        java.lang.String str39 = mutablePeriod33.toString();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime28, (org.joda.time.ReadablePeriod) mutablePeriod33);
        mutablePeriod33.setValue(0, 2022);
        mutablePeriod33.addDays((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight47.toMutableDateTime();
        mutableDateTime48.add((long) 1);
        org.joda.time.DateTime dateTime51 = mutableDateTime48.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.PeriodType periodType53 = org.joda.time.PeriodType.years();
        org.joda.time.Period period54 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime48, readableDuration52, periodType53);
        org.joda.time.Chronology chronology55 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfEra();
        mutablePeriod33.add(35417L, chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.year();
        org.joda.time.DurationField durationField59 = chronology55.eras();
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration22, chronology55);
        mutablePeriod3.addDays(26411869);
        org.joda.time.LocalTime localTime65 = org.joda.time.LocalTime.now();
        int int66 = localTime65.size();
        java.util.Locale locale67 = java.util.Locale.ITALY;
        boolean boolean68 = localTime65.equals((java.lang.Object) locale67);
        org.joda.time.LocalTime localTime70 = localTime65.minusSeconds((int) 'a');
        org.joda.time.Chronology chronology71 = localTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField72 = chronology71.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField73 = chronology71.dayOfYear();
        org.joda.time.DateTimeField dateTimeField74 = chronology71.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField75 = chronology71.weekOfWeekyear();
        mutablePeriod3.setPeriod(1641116552312L, 1645514220760L, chronology71);
        org.joda.time.DateTimeField dateTimeField77 = chronology71.secondOfDay();
        org.joda.time.DurationField durationField78 = chronology71.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField59, durationField78, and durationField59", !(durationField59.compareTo(durationField78) == 0) || (Math.signum(durationField59.compareTo(durationField59)) == Math.signum(durationField78.compareTo(durationField59))));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withDayOfYear((int) (short) 10);
        org.joda.time.DateMidnight.Property property5 = dateMidnight0.weekOfWeekyear();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        org.joda.time.Interval interval10 = localDate6.toInterval();
        org.joda.time.DateTime dateTime11 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(20);
        boolean boolean14 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime16 = dateTime13.minusDays(10);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime19 = dateTime16.plusSeconds(26162430);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMillis((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime();
        mutableDateTime22.setMillis((long) 21);
        int int25 = mutableDateTime22.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours(1);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 399, dateTimeZone28);
        java.lang.String str31 = dateTimeZone28.getName((long) (byte) 1);
        mutableDateTime22.setZone(dateTimeZone28);
        org.joda.time.DateTime dateTime33 = dateTime19.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime33", (dateTime19.compareTo(dateTime33) == 0) == dateTime19.equals(dateTime33));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.toString();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        java.lang.Object obj5 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType9 = periodType8.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType13);
        int int15 = mutablePeriod14.getMonths();
        org.joda.time.Interval interval16 = new org.joda.time.Interval(readableInstant10, (org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        int int24 = mutablePeriod23.getMonths();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableInstant19, (org.joda.time.ReadablePeriod) mutablePeriod23);
        int[] intArray28 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod23, 1L, (long) 4);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType8, chronology17);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(obj5, chronology17);
        org.joda.time.Period period31 = new org.joda.time.Period(1645514171723L, (long) 26242316, periodType2, chronology17);
        org.joda.time.DurationField durationField32 = chronology17.minutes();
        org.joda.time.DurationField durationField33 = chronology17.eras();
        org.joda.time.DurationField durationField34 = chronology17.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField32 and durationField33", Math.signum(durationField32.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField32)));
    }
}

