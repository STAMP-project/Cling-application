import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        int int22 = fixedDateTimeZone19.getOffset((long) 228);
        int int24 = fixedDateTimeZone19.getStandardOffset((long) 548);
        java.lang.String str26 = fixedDateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        org.joda.time.Instant instant29 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant31 = instant29.minus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime32 = instant29.toMutableDateTime();
        boolean boolean33 = dateTime27.isEqual((org.joda.time.ReadableInstant) instant29);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZone(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int43 = dateTime37.get(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime37.minuteOfDay();
        org.joda.time.DateTime dateTime45 = property44.roundCeilingCopy();
        int int46 = dateTime45.getEra();
        int int47 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime32", (instant29.compareTo(mutableDateTime32) == 0) == instant29.equals(mutableDateTime32));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        long long13 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime17.minuteOfHour();
        boolean boolean26 = dateTime17.isBefore((long) 1870);
        org.joda.time.Instant instant27 = dateTime17.toInstant();
        long long28 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DateTime dateTime29 = instant27.toDateTime();
        org.joda.time.Instant instant32 = instant27.withDurationAdded(52L, 856);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Instant instant34 = instant27.minus(readableDuration33);
        org.joda.time.Chronology chronology35 = instant27.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant27", (dateTime3.compareTo(instant27) == 0) == dateTime3.equals(instant27));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        java.util.Date date18 = dateTime16.toDate();
        java.time.Instant instant19 = date18.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime16", (instant12.compareTo(dateTime16) == 0) == instant12.equals(dateTime16));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy(0);
        int int23 = dateTime22.getHourOfDay();
        int int24 = property8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime22.withMillis((long) 761);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfMinute();
        org.joda.time.DurationField durationField32 = chronology30.years();
        java.lang.String str33 = chronology30.toString();
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime34", (dateTime26.compareTo(dateTime34) == 0) == dateTime26.equals(dateTime34));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime14 = instant12.toDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime14.plusDays(25716933);
        org.joda.time.DateTime.Property property17 = dateTime14.year();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime14", (instant12.compareTo(dateTime14) == 0) == instant12.equals(dateTime14));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.DurationField durationField7 = chronology2.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        boolean boolean26 = fixedDateTimeZone22.isFixed();
        java.lang.String str28 = fixedDateTimeZone22.getNameKey((long) 348);
        org.joda.time.DateTime dateTime29 = localDate15.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        java.util.TimeZone timeZone30 = fixedDateTimeZone22.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(0L, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(0L, dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.LocalDate localDate42 = localDate38.plus(readablePeriod41);
        org.joda.time.LocalDate localDate43 = localDate35.withFields((org.joda.time.ReadablePartial) localDate38);
        org.joda.time.LocalDate.Property property44 = localDate43.year();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(0L, dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate47.plus(readablePeriod50);
        int int52 = localDate43.compareTo((org.joda.time.ReadablePartial) localDate51);
        int int53 = localDate43.getYear();
        org.joda.time.LocalDate.Property property54 = localDate43.yearOfEra();
        org.joda.time.LocalDate localDate55 = property54.roundHalfEvenCopy();
        boolean boolean56 = fixedDateTimeZone22.equals((java.lang.Object) localDate55);
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 575, (org.joda.time.DateTimeZone) fixedDateTimeZone22);
        int int59 = fixedDateTimeZone22.getStandardOffset((long) 26);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        org.joda.time.DateTime.Property property61 = dateTime60.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.withPeriodAdded(readablePeriod5, 1970);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withPeriodAdded(readablePeriod10, 995);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        int int14 = dateTime13.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readablePeriod15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime13.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(0);
        org.joda.time.DateTime.Property property24 = dateTime21.weekyear();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime21.withDurationAdded(readableDuration25, (int) (short) 10);
        org.joda.time.DateTime dateTime29 = dateTime21.plusMonths(34);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds(0);
        int int32 = dateTime31.getSecondOfMinute();
        long long33 = dateTime31.getMillis();
        org.joda.time.DateTime.Property property34 = dateTime31.era();
        org.joda.time.DateTime dateTime36 = dateTime31.minusMinutes(25831234);
        boolean boolean37 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime39 = dateTime31.withMillis(1645513731750L);
        int int40 = dateTime39.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime44.plus(readablePeriod48);
        org.joda.time.DateTime dateTime50 = dateTime44.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property51 = dateTime44.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.Chronology chronology54 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.secondOfMinute();
        org.joda.time.DurationField durationField56 = chronology54.years();
        org.joda.time.DateTime dateTime57 = dateTime44.toDateTime(chronology54);
        int int58 = dateTime57.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.minus(readablePeriod59);
        int int61 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime57", (dateTime21.compareTo(dateTime57) == 0) == dateTime21.equals(dateTime57));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Calendar.Builder builder2 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder6 = builder2.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        boolean boolean8 = timeZone7.observesDaylightTime();
        timeZone7.setID("");
        java.util.Calendar.Builder builder11 = builder2.setTimeZone(timeZone7);
        boolean boolean12 = timeZone0.hasSameRules(timeZone7);
        int int13 = timeZone0.getRawOffset();
        timeZone0.setRawOffset(313);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getDefault();
        boolean boolean17 = timeZone16.observesDaylightTime();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone16);
        java.util.Locale.Category category19 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        long long24 = dateTimeField22.remainder((long) (byte) 100);
        java.lang.String str25 = dateTimeField22.getName();
        java.util.Locale locale27 = java.util.Locale.UK;
        java.lang.String str28 = locale27.getDisplayCountry();
        boolean boolean29 = locale27.hasExtensions();
        java.lang.String str30 = dateTimeField22.getAsShortText(2, locale27);
        java.lang.String str31 = locale27.getDisplayCountry();
        java.util.Locale.setDefault(category19, locale27);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone16, locale27);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale35 = java.util.Locale.getDefault(category34);
        java.lang.String str36 = locale27.getDisplayVariant(locale35);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone0, locale27);
        java.lang.Object obj38 = timeZone0.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar33", (calendar18.compareTo(calendar33) == 0) == calendar18.equals(calendar33));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.LocalDate.Property property7 = localDate2.monthOfYear();
        org.joda.time.DateTime dateTime8 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfCentury(8);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillis(0L);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(0L, dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(0L, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.minusYears((int) (short) 100);
        org.joda.time.LocalDate localDate26 = localDate22.plusMonths((-1));
        int int27 = localDate17.compareTo((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone33 = fixedDateTimeZone32.toTimeZone();
        org.joda.time.DateMidnight dateMidnight34 = localDate22.toDateMidnight((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        long long37 = fixedDateTimeZone32.convertLocalToUTC(0L, true);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(0L, (org.joda.time.DateTimeZone) fixedDateTimeZone32);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.minus(readablePeriod39);
        boolean boolean41 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime40", (dateTime13.compareTo(dateTime40) == 0) == dateTime13.equals(dateTime40));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0, chronology17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        int int23 = dateTime21.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant22", (dateTime21.compareTo(instant22) == 0) == dateTime21.equals(instant22));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.Chronology chronology4 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.secondOfMinute();
        org.joda.time.DurationField durationField6 = chronology4.years();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.year();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(0L, chronology4);
        boolean boolean10 = dateTime8.equals((java.lang.Object) (-61468390289452L));
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        int int13 = localDateTime11.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int17 = localDateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = durationFieldType20.isSupported(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withFieldAdded(durationFieldType20, (int) 'x');
        java.lang.String str25 = durationFieldType20.getName();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime11.withFieldAdded(durationFieldType20, 25757031);
        org.joda.time.DateTime dateTime29 = dateTime8.withFieldAdded(durationFieldType20, 593);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime33.withZone(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int39 = dateTime33.get(dateTimeFieldType38);
        org.joda.time.DateTime.Property property40 = dateTime33.minuteOfDay();
        org.joda.time.Chronology chronology41 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.secondOfMinute();
        org.joda.time.DurationField durationField43 = chronology41.hours();
        org.joda.time.DateTime dateTime44 = dateTime29.toDateTime(chronology41);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.fromMillisOfDay(433L, chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime44", (dateTime29.compareTo(dateTime44) == 0) == dateTime29.equals(dateTime44));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withTime((int) (short) 0, (int) ' ', 12, 374);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusHours(0);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.plus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property22 = dateTime15.minuteOfDay();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readableDuration25);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime24.getZone();
        long long30 = dateTimeZone27.adjustOffset((long) 70, false);
        org.joda.time.DateTime dateTime31 = localDateTime11.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTimeISO();
        org.joda.time.DateTime.Property property33 = dateTime32.dayOfWeek();
        org.joda.time.DateTime dateTime35 = dateTime32.withMillis((long) 718);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.DateTime dateTime39 = dateTime37.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime41 = dateTime39.plusHours(0);
        org.joda.time.DateTime.Property property42 = dateTime39.monthOfYear();
        int int43 = property42.getMaximumValue();
        org.joda.time.DateTime dateTime44 = property42.roundHalfCeilingCopy();
        int int45 = dateTime44.getDayOfYear();
        int int46 = dateTime44.getEra();
        org.joda.time.DateTime.Property property47 = dateTime44.yearOfEra();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusMinutes(10);
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.plus(readablePeriod55);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.withPeriodAdded(readablePeriod57, 59);
        boolean boolean60 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTime.Property property61 = dateTime44.weekyear();
        org.joda.time.DateTime.Property property62 = dateTime44.weekyear();
        org.joda.time.DateTime dateTime63 = dateTime44.toDateTimeISO();
        org.joda.time.Instant instant64 = dateTime44.toInstant();
        org.joda.time.DateTimeZone dateTimeZone65 = instant64.getZone();
        org.joda.time.MutableDateTime mutableDateTime66 = instant64.toMutableDateTime();
        int int67 = dateTime35.compareTo((org.joda.time.ReadableInstant) mutableDateTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant64", (dateTime44.compareTo(instant64) == 0) == dateTime44.equals(instant64));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime3.plus(readablePeriod10);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.yearOfCentury();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone19 = fixedDateTimeZone18.toTimeZone();
        java.util.TimeZone timeZone20 = fixedDateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime21 = dateTime11.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone18);
        org.joda.time.DateTime.Property property22 = dateTime21.year();
        org.joda.time.DateTime dateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime25 = property22.addWrapFieldToCopy(983);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime21", (dateTime3.compareTo(dateTime21) == 0) == dateTime3.equals(dateTime21));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        long long17 = fixedDateTimeZone4.previousTransition((long) '#');
        long long19 = fixedDateTimeZone4.nextTransition(1645513711304L);
        long long21 = fixedDateTimeZone4.previousTransition((long) 4);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes(10);
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime25.plusYears(22);
        org.joda.time.DateTime dateTime31 = dateTime25.withTimeAtStartOfDay();
        int int32 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant33 = dateTime31.toInstant();
        long long34 = instant33.getMillis();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant33.plus(readableDuration35);
        org.joda.time.MutableDateTime mutableDateTime37 = instant36.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant36", (dateTime31.compareTo(instant36) == 0) == dateTime31.equals(instant36));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter4.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter4.getLocale();
        boolean boolean10 = dateTimeFormatter4.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withLocale(locale11);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter13.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter16.withPivotYear(339);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(0L, dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(0L, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDate localDate30 = localDate26.plus(readablePeriod29);
        org.joda.time.LocalDate localDate31 = localDate23.withFields((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate33 = localDate23.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime34 = localDate33.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology35 = localDate33.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone41 = fixedDateTimeZone40.toTimeZone();
        int int43 = fixedDateTimeZone40.getOffset((long) 228);
        boolean boolean44 = fixedDateTimeZone40.isFixed();
        java.lang.String str46 = fixedDateTimeZone40.getNameKey((long) 348);
        org.joda.time.DateTime dateTime47 = localDate33.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        boolean boolean49 = fixedDateTimeZone40.isStandardOffset(70L);
        java.util.Locale locale52 = new java.util.Locale("2022-03-18T12:18:43.346");
        java.lang.String str53 = fixedDateTimeZone40.getShortName(0L, locale52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter16.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime47", (dateTime34.compareTo(dateTime47) == 0) == dateTime34.equals(dateTime47));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        org.joda.time.DateTime.Property property9 = dateTime7.millisOfDay();
        int int10 = dateTime7.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property11 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks(753);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(0);
        org.joda.time.DateTime.Property property20 = dateTime17.monthOfYear();
        int int21 = property20.getMaximumValue();
        org.joda.time.DateTime dateTime22 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime24 = dateTime22.plus((long) 3);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getName((long) (byte) -1);
        java.lang.String str30 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime31 = dateTime24.toDateTime(dateTimeZone26);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) dateTime13, dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime31", (dateTime24.compareTo(dateTime31) == 0) == dateTime24.equals(dateTime31));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 6);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        org.joda.time.DurationField durationField17 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(chronology15);
        org.joda.time.DateTime dateTime21 = dateTime12.minusDays(497);
        org.joda.time.DateTime.Property property22 = dateTime21.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime19", (dateTime12.compareTo(dateTime19) == 0) == dateTime12.equals(dateTime19));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        int int19 = localDateTime18.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = durationFieldType20.isSupported(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withFieldAdded(durationFieldType20, 59);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(0);
        org.joda.time.DateTime dateTime31 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime18.minus(readablePeriod32);
        long long35 = chronology14.set((org.joda.time.ReadablePartial) localDateTime18, (long) 38);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime dateTime38 = dateTime36.plusYears(236);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(4);
        org.joda.time.DateTime dateTime45 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.plusMinutes(32770);
        int int48 = localDateTime47.getWeekyear();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        int int51 = dateTime38.get(dateTimeFieldType50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime36", (dateTime7.compareTo(dateTime36) == 0) == dateTime7.equals(dateTime36));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(140);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime16.plusYears(22);
        org.joda.time.DateTime.Property property22 = dateTime16.era();
        org.joda.time.DateTime.Property property23 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.Instant instant27 = instant25.minus((-3152796670724L));
        org.joda.time.Instant instant29 = instant25.minus((-604799880L));
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant29.plus(readableDuration30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded(13305600000L, (-292275054));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant1.withDurationAdded(readableDuration7, 910);
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime2", (instant9.compareTo(dateTime2) == 0) == instant9.equals(dateTime2));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 6);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        org.joda.time.DurationField durationField17 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.year();
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(chronology15);
        boolean boolean21 = dateTime19.equals((java.lang.Object) "25783339");
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        org.joda.time.DateTime dateTime25 = dateTime19.withFieldAdded(durationFieldType23, 83);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime25.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime19", (dateTime12.compareTo(dateTime19) == 0) == dateTime12.equals(dateTime19));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        boolean boolean12 = dateTime3.isBefore((long) 1870);
        org.joda.time.Instant instant13 = dateTime3.toInstant();
        long long14 = instant13.getMillis();
        org.joda.time.Instant instant16 = instant13.minus(1645513820399L);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime3.minusYears(573);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        java.util.Locale locale20 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        boolean boolean25 = dateTime16.equals((java.lang.Object) locale20);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.withChronology(chronology28);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        long long35 = chronology28.add(readablePeriod32, 0L, 4918458);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime31", (dateTime5.compareTo(dateTime31) == 0) == dateTime5.equals(dateTime31));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        int int7 = property6.getMaximumValue();
        org.joda.time.DateTime dateTime8 = property6.roundHalfCeilingCopy();
        int int9 = dateTime8.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        int int16 = dateTime13.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime18 = dateTime13.minusSeconds(0);
        boolean boolean19 = dateTime8.equals((java.lang.Object) dateTime18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(4);
        org.joda.time.DateMidnight dateMidnight24 = dateTime23.toDateMidnight();
        org.joda.time.DateTime.Property property25 = dateTime23.centuryOfEra();
        boolean boolean26 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime23);
        java.lang.Object obj27 = null;
        boolean boolean28 = dateTime18.equals(obj27);
        org.joda.time.DateTime dateTime29 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.Instant instant30 = dateTime29.toInstant();
        org.joda.time.Instant instant32 = instant30.withMillis(1645528500929L);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property35.addToCopy((long) '#');
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime45 = dateTime43.plusHours(0);
        org.joda.time.DateTime.Property property46 = dateTime43.weekyear();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime49 = dateTime43.withPeriodAdded(readablePeriod47, (int) '4');
        int int50 = property39.getDifference((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime43.plus(readableDuration51);
        int int53 = dateTime52.getSecondOfMinute();
        org.joda.time.DateTime dateTime55 = dateTime52.minusWeeks((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.dayOfMonth();
        int int58 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime63 = localDateTime62.toDateTime();
        org.joda.time.Chronology chronology64 = localDateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType61.getField(chronology64);
        boolean boolean67 = localDateTime56.isSupported(dateTimeFieldType61);
        org.joda.time.DateTime.Property property68 = dateTime55.property(dateTimeFieldType61);
        org.joda.time.LocalDateTime.Property property69 = localDateTime37.property(dateTimeFieldType61);
        int int70 = instant32.get(dateTimeFieldType61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight24 and instant30", (dateMidnight24.compareTo(instant30) == 0) == dateMidnight24.equals(instant30));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant3.plus(readableDuration4);
        org.joda.time.Instant instant7 = instant5.plus(4471839967L);
        long long8 = instant5.getMillis();
        org.joda.time.DateTime dateTime9 = instant5.toDateTimeISO();
        int int10 = dateTime9.getDayOfWeek();
        org.joda.time.Instant instant12 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant16 = instant12.withDurationAdded(readableDuration14, 4771502);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 150);
        boolean boolean20 = dateTime9.isAfter((org.joda.time.ReadableInstant) instant19);
        org.joda.time.Instant instant22 = instant19.withMillis(1645513909960L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime9", (instant1.compareTo(dateTime9) == 0) == instant1.equals(dateTime9));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime3.withMillisOfSecond((int) 'a');
        java.lang.String str10 = dateTime9.toString();
        org.joda.time.Instant instant11 = dateTime9.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 2144673);
        boolean boolean16 = instant14.isAfter((long) 184);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant14", (dateTime9.compareTo(instant14) == 0) == dateTime9.equals(instant14));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(22);
        org.joda.time.DateTime.Property property9 = dateTime3.era();
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(0);
        org.joda.time.DateTime.Property property20 = dateTime17.weekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime17.withPeriodAdded(readablePeriod21, (int) '4');
        int int24 = property13.getDifference((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime17.plus(readableDuration25);
        int int27 = dateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime29 = dateTime26.minusWeeks((int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone34 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone35 = fixedDateTimeZone34.toTimeZone();
        int int37 = fixedDateTimeZone34.getOffset((long) 228);
        int int39 = fixedDateTimeZone34.getStandardOffset((long) 548);
        org.joda.time.DateTime dateTime40 = dateTime29.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone34);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime48 = dateTime46.plusHours(0);
        org.joda.time.DateTime.Property property49 = dateTime46.weekyear();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime52 = dateTime46.withPeriodAdded(readablePeriod50, (int) '4');
        int int53 = property42.getDifference((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime46.plus(readableDuration54);
        org.joda.time.DateTime dateTime57 = dateTime55.minusWeeks(2);
        org.joda.time.DateTime dateTime58 = dateTime55.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.withDayOfYear(39);
        boolean boolean61 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetMillis(1970);
        int int65 = dateTimeZone63.getStandardOffset(1645513714231L);
        org.joda.time.DateTime dateTime66 = dateTime58.toDateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime67 = dateTime3.withZoneRetainFields(dateTimeZone63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime66", (dateTime17.compareTo(dateTime66) == 0) == dateTime17.equals(dateTime66));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(1735689600000L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getName((long) (byte) -1);
        java.lang.String str9 = dateTimeZone5.getID();
        java.lang.String str10 = dateTimeZone5.getID();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 674, dateTimeZone5);
        boolean boolean13 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime2.minusMonths(0);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime20 = dateTime17.withFieldAdded(durationFieldType18, (int) 'a');
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime24 = property21.addToCopy(59);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillis((long) 2);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusHours(0);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        int int34 = property33.getMaximumValue();
        org.joda.time.DateTime dateTime35 = property33.roundHalfCeilingCopy();
        int int36 = dateTime35.getDayOfYear();
        int int37 = dateTime35.getEra();
        org.joda.time.DateTime.Property property38 = dateTime35.yearOfEra();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes(10);
        org.joda.time.DateTime.Property property45 = dateTime42.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime42.plus(readablePeriod46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.withPeriodAdded(readablePeriod48, 59);
        boolean boolean51 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime47);
        int int52 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime.Property property53 = dateTime47.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        boolean boolean55 = dateTime2.isSupported(dateTimeFieldType54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(140);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime16.plusYears(22);
        org.joda.time.DateTime.Property property22 = dateTime16.era();
        org.joda.time.DateTime.Property property23 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int31 = localDateTime25.get(dateTimeFieldType30);
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType30.getDurationType();
        org.joda.time.LocalDateTime.Property property33 = localDateTime8.property(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.Chronology chronology36 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.DurationField durationField38 = chronology36.years();
        java.lang.String str39 = chronology36.toString();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.DateTime dateTime43 = dateTime41.plusHours(4);
        int int44 = dateTime41.getEra();
        java.util.Locale locale45 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet46 = locale45.getExtensionKeys();
        java.util.Calendar calendar47 = dateTime41.toCalendar(locale45);
        java.lang.Object obj48 = null;
        boolean boolean49 = dateTime41.equals(obj48);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime41.getZone();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(dateTimeZone50);
        org.joda.time.Chronology chronology52 = chronology36.withZone(dateTimeZone50);
        org.joda.time.DurationField durationField53 = chronology52.hours();
        long long57 = chronology52.add((long) 'x', (long) 816, 385);
        org.joda.time.DateTimeField dateTimeField58 = chronology52.weekyearOfCentury();
        boolean boolean59 = dateTimeFieldType30.isSupported(chronology52);
        org.joda.time.DurationField durationField60 = chronology52.weekyears();
        org.joda.time.DateTimeField dateTimeField61 = chronology52.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField38 and durationField60", (durationField38.compareTo(durationField60) == 0) == durationField38.equals(durationField60));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        long long8 = dateTimeField6.remainder((long) (byte) 100);
        java.lang.String str9 = dateTimeField6.getName();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        boolean boolean13 = locale11.hasExtensions();
        java.lang.String str14 = dateTimeField6.getAsShortText(2, locale11);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.util.Locale.setDefault(category3, locale11);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone0, locale11);
        int int19 = timeZone0.getOffset((long) 488);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar17", (calendar2.compareTo(calendar17) == 0) == calendar2.equals(calendar17));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = fixedDateTimeZone4.getName(1009868913348L, locale6);
        java.util.TimeZone timeZone8 = fixedDateTimeZone4.toTimeZone();
        timeZone8.setID("");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone16 = fixedDateTimeZone15.toTimeZone();
        int int17 = timeZone16.getRawOffset();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet21 = locale19.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.UK;
        java.lang.String str23 = locale22.getDisplayCountry();
        java.lang.String str24 = locale19.getDisplayLanguage(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone16, locale19);
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone8, locale19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar25", (calendar18.compareTo(calendar25) == 0) == calendar18.equals(calendar25));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 386);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        long long4 = instant1.getMillis();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone10 = fixedDateTimeZone9.toTimeZone();
        int int12 = fixedDateTimeZone9.getOffset((long) 228);
        org.joda.time.MutableDateTime mutableDateTime13 = instant1.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(11, 0, (int) (short) 10, (int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime4.plus(readablePeriod7);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds(3);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond(12);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localTime13.isSupported(durationFieldType16);
        boolean boolean18 = localTime12.isSupported(durationFieldType16);
        int int19 = localTime12.getMinuteOfHour();
        int int20 = localTime12.getMillisOfDay();
        org.joda.time.DateTime dateTime21 = localTime12.toDateTimeToday();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("Japan", "DateTimeField[millisOfDay]", 2026, 500);
        int int28 = fixedDateTimeZone26.getStandardOffset((long) 348);
        java.lang.String str30 = fixedDateTimeZone26.getShortName(1645513772727L);
        java.util.TimeZone timeZone31 = fixedDateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime32 = dateTime21.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.withDurationAdded(readableDuration33, 999);
        org.joda.time.DateTime.Property property36 = dateTime32.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime32", (dateTime21.compareTo(dateTime32) == 0) == dateTime21.equals(dateTime32));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setTimeOfDay(8, 0, 10);
        java.util.Calendar.Builder builder9 = builder4.setTimeOfDay(259, 60, 7, 0);
        java.util.Calendar.Builder builder13 = builder9.setWeekDate(25711821, 228, 0);
        java.util.Calendar.Builder builder17 = builder13.setDate(0, 674, 382);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        boolean boolean19 = timeZone18.observesDaylightTime();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone18);
        java.util.TimeZone.setDefault(timeZone18);
        boolean boolean22 = timeZone18.observesDaylightTime();
        timeZone18.setID("2022-02-22T07:10:33.250+00:00:00.059");
        java.util.Calendar.Builder builder25 = builder13.setTimeZone(timeZone18);
        java.util.Locale locale27 = new java.util.Locale("2022-02-22T07:09:04.613+00:00:00.059");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone18, locale27);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(0);
        org.joda.time.DateTime.Property property36 = dateTime33.monthOfYear();
        int int37 = property36.getMaximumValue();
        org.joda.time.DateTime dateTime38 = property36.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 199, dateTimeZone41);
        java.util.TimeZone timeZone43 = dateTimeZone41.toTimeZone();
        boolean boolean44 = timeZone18.hasSameRules(timeZone43);
        int int46 = timeZone18.getOffset((long) 11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar20 and calendar28", (calendar20.compareTo(calendar28) == 0) == calendar20.equals(calendar28));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime7.plus(1645513715772L);
        org.joda.time.DateTime dateTime12 = dateTime7.withYearOfEra(143);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readablePeriod14);
        java.util.Locale locale16 = java.util.Locale.UK;
        java.lang.String str17 = locale16.getDisplayCountry();
        boolean boolean18 = locale16.hasExtensions();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale16);
        calendar19.set(2, 0, (int) (short) 0, 2022, 2);
        java.time.Instant instant26 = calendar19.toInstant();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.fromCalendarFields(calendar19);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.fromCalendarFields(calendar19);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property34 = dateTime31.weekOfWeekyear();
        org.joda.time.DateTime dateTime35 = property34.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property37 = dateTime35.property(dateTimeFieldType36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime28.property(dateTimeFieldType36);
        int int39 = dateTime12.get(dateTimeFieldType36);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.Chronology chronology44 = localDateTime42.getChronology();
        boolean boolean45 = dateTimeFieldType41.isSupported(chronology44);
        long long49 = chronology44.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField50 = chronology44.dayOfWeek();
        org.joda.time.DurationField durationField51 = chronology44.days();
        org.joda.time.DateTimeField dateTimeField52 = chronology44.secondOfDay();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(1645513743819L, chronology44);
        org.joda.time.DurationField durationField54 = chronology44.months();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = chronology44.add(readablePeriod55, 0L, 909);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime12.toMutableDateTime(chronology44);
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime59", (dateTime12.compareTo(mutableDateTime59) == 0) == dateTime12.equals(mutableDateTime59));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        java.util.Locale locale20 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        boolean boolean25 = dateTime16.equals((java.lang.Object) locale20);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime31", (dateTime5.compareTo(dateTime31) == 0) == dateTime5.equals(dateTime31));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        int int15 = dateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = dateTime14.minusWeeks((int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        int int27 = fixedDateTimeZone22.getStandardOffset((long) 548);
        org.joda.time.DateTime dateTime28 = dateTime17.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTime.Property property37 = dateTime34.weekyear();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime34.withPeriodAdded(readablePeriod38, (int) '4');
        int int41 = property30.getDifference((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime34.plus(readableDuration42);
        org.joda.time.DateTime dateTime45 = dateTime43.minusWeeks(2);
        org.joda.time.DateTime dateTime46 = dateTime43.toDateTime();
        org.joda.time.DateTime dateTime48 = dateTime46.withDayOfYear(39);
        boolean boolean49 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(1970);
        int int53 = dateTimeZone51.getStandardOffset(1645513714231L);
        org.joda.time.DateTime dateTime54 = dateTime46.toDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfMonth();
        int int57 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int61 = localDateTime55.get(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime63 = localDateTime62.toDateTime();
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology65 = null;
        boolean boolean66 = durationFieldType64.isSupported(chronology65);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.withFieldAdded(durationFieldType64, (int) 'x');
        java.lang.String str69 = durationFieldType64.getName();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime55.withFieldAdded(durationFieldType64, 25757031);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withMillisOfSecond(806);
        boolean boolean74 = dateTimeZone51.isLocalDateTimeGap(localDateTime71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime54", (dateTime5.compareTo(dateTime54) == 0) == dateTime5.equals(dateTime54));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        int int17 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        long long19 = fixedDateTimeZone4.previousTransition((long) 8);
        java.util.Date date21 = new java.util.Date((long) (byte) 1);
        int int22 = date21.getSeconds();
        java.time.Instant instant23 = date21.toInstant();
        boolean boolean24 = fixedDateTimeZone4.equals((java.lang.Object) instant23);
        java.lang.String str26 = fixedDateTimeZone4.getNameKey((long) 259);
        int int28 = fixedDateTimeZone4.getStandardOffset(2022L);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        long long32 = fixedDateTimeZone4.convertLocalToUTC((long) 'a', false);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.Chronology chronology37 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.halfdayOfDay();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 2022, chronology37);
        org.joda.time.DateTime.Property property40 = dateTime39.centuryOfEra();
        boolean boolean41 = fixedDateTimeZone4.equals((java.lang.Object) dateTime39);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime33", (dateTime7.compareTo(dateTime33) == 0) == dateTime7.equals(dateTime33));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 386);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        long long4 = instant1.getMillis();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone9 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone10 = fixedDateTimeZone9.toTimeZone();
        int int12 = fixedDateTimeZone9.getOffset((long) 228);
        org.joda.time.MutableDateTime mutableDateTime13 = instant1.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone9);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone18 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone19 = fixedDateTimeZone18.toTimeZone();
        int int21 = fixedDateTimeZone18.getOffset((long) 228);
        java.lang.String str23 = fixedDateTimeZone18.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minus(readableDuration26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withFieldAdded(durationFieldType30, 6);
        boolean boolean33 = fixedDateTimeZone18.isLocalDateTimeGap(localDateTime32);
        java.lang.String str35 = fixedDateTimeZone18.getNameKey((long) 184);
        long long37 = fixedDateTimeZone18.previousTransition(0L);
        org.joda.time.DateTime dateTime38 = instant1.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone18);
        long long42 = fixedDateTimeZone18.convertLocalToUTC((long) 65458977, true, (long) 775);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime13", (instant1.compareTo(mutableDateTime13) == 0) == instant1.equals(mutableDateTime13));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder1.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        boolean boolean7 = timeZone6.observesDaylightTime();
        timeZone6.setID("");
        java.util.Calendar.Builder builder10 = builder1.setTimeZone(timeZone6);
        boolean boolean11 = timeZone0.hasSameRules(timeZone6);
        org.joda.time.tz.NameProvider nameProvider12 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(0);
        org.joda.time.DateTime.Property property20 = dateTime17.weekyear();
        long long21 = property20.remainder();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTime.Property property28 = dateTime25.monthOfYear();
        int int29 = property28.getMaximumValue();
        org.joda.time.DateTime dateTime30 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime32 = dateTime30.plus((long) 3);
        int int33 = property20.getDifference((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone39 = fixedDateTimeZone38.toTimeZone();
        int int41 = fixedDateTimeZone38.getOffset((long) 228);
        boolean boolean42 = fixedDateTimeZone38.isFixed();
        org.joda.time.DateTime dateTime43 = dateTime32.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        java.util.Locale locale45 = java.util.Locale.ITALIAN;
        java.lang.String str46 = fixedDateTimeZone38.getName((long) 671, locale45);
        java.lang.String str49 = nameProvider12.getName(locale45, "DateTimeField[era]", "1969-12-31T23:59:59.999Z");
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone0, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime43", (dateTime32.compareTo(dateTime43) == 0) == dateTime32.equals(dateTime43));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.months();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = chronology9.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        int int22 = fixedDateTimeZone19.getOffset((long) 228);
        int int24 = fixedDateTimeZone19.getStandardOffset((long) 548);
        java.lang.String str26 = fixedDateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        org.joda.time.DateTime.Property property28 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime29 = property28.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime27", (dateTime3.compareTo(dateTime27) == 0) == dateTime3.equals(dateTime27));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = localDate14.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone22 = fixedDateTimeZone21.toTimeZone();
        int int24 = fixedDateTimeZone21.getOffset((long) 228);
        boolean boolean25 = fixedDateTimeZone21.isFixed();
        java.lang.String str27 = fixedDateTimeZone21.getNameKey((long) 348);
        org.joda.time.DateTime dateTime28 = localDate14.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        boolean boolean30 = fixedDateTimeZone21.isStandardOffset(70L);
        java.lang.String str32 = fixedDateTimeZone21.getNameKey(1645513822998L);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime28", (dateTime15.compareTo(dateTime28) == 0) == dateTime15.equals(dateTime28));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant12.toDateTime();
        org.joda.time.DateTime dateTime17 = instant12.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant12.minus(readableDuration18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime16", (instant19.compareTo(dateTime16) == 0) == instant19.equals(dateTime16));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant3 = instant1.minus((long) 32769);
        org.joda.time.Instant instant5 = instant1.plus(1645513753377L);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant8 = instant1.withMillis(90605889804000L);
        org.joda.time.Instant instant10 = instant1.withMillis((long) 129);
        long long11 = instant10.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime6", (instant1.compareTo(dateTime6) == 0) == instant1.equals(dateTime6));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-22T07:10:37.696+00:00:00.059");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 203);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant1.withDurationAdded(readableDuration6, 866);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime5", (instant8.compareTo(mutableDateTime5) == 0) == instant8.equals(mutableDateTime5));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.minus((long) 576);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime3.plus(readablePeriod10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime dateTime13 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        boolean boolean18 = dateTimeFieldType14.isSupported(chronology17);
        long long22 = chronology17.add((long) 184, 0L, 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology17.add(readablePeriod23, (long) 2022, 1870);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.hourOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology17.halfdayOfDay();
        org.joda.time.DateTime dateTime29 = dateTime11.toDateTime(chronology17);
        org.joda.time.DateTime dateTime31 = dateTime29.minusYears(25856184);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes(378);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime29", (dateTime3.compareTo(dateTime29) == 0) == dateTime3.equals(dateTime29));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.joda.time.Instant instant4 = instant1.toInstant();
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.centuries();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField5", Math.signum(durationField4.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField4)));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.plus(readablePeriod5);
        org.joda.time.DateTime dateTime8 = dateTime1.plusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(497);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours(0);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime16.withPeriodAdded(readablePeriod20, (int) '4');
        int int23 = property12.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime16.plus(readableDuration24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusHours(4);
        org.joda.time.DateTime dateTime29 = dateTime25.withYearOfEra((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime29.withField(dateTimeFieldType30, 69);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.plusHours(4);
        org.joda.time.DateTime dateTime41 = localDateTime36.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        int int42 = dateTime38.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime38.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime45 = dateTime38.minusHours(60);
        org.joda.time.Instant instant47 = new org.joda.time.Instant((long) (-1));
        boolean boolean48 = dateTime38.isAfter((org.joda.time.ReadableInstant) instant47);
        org.joda.time.DateTime dateTime49 = instant47.toDateTimeISO();
        org.joda.time.DateTime dateTime51 = dateTime49.plusDays(25716933);
        org.joda.time.DateTime dateTime53 = dateTime49.plusSeconds(2922789);
        org.joda.time.DateTime dateTime55 = dateTime49.withMillisOfDay(3);
        boolean boolean56 = dateTime34.isAfter((org.joda.time.ReadableInstant) dateTime49);
        int int57 = dateTime10.compareTo((org.joda.time.ReadableInstant) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant47 and dateTime49", (instant47.compareTo(dateTime49) == 0) == instant47.equals(dateTime49));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        java.util.Locale locale20 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        boolean boolean25 = dateTime16.equals((java.lang.Object) locale20);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.withChronology(chronology28);
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime31", (dateTime5.compareTo(dateTime31) == 0) == dateTime5.equals(dateTime31));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        java.lang.String str5 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology2.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime3.plusMonths(34);
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds(0);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(0);
        org.joda.time.DateTime.Property property23 = dateTime20.weekyear();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime20.withPeriodAdded(readablePeriod24, (int) '4');
        int int27 = property16.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime20.plus(readableDuration28);
        int int30 = dateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime32 = dateTime29.minusWeeks((int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone38 = fixedDateTimeZone37.toTimeZone();
        int int40 = fixedDateTimeZone37.getOffset((long) 228);
        int int42 = fixedDateTimeZone37.getStandardOffset((long) 548);
        org.joda.time.DateTime dateTime43 = dateTime32.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone37);
        long long44 = property14.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime46 = dateTime32.plusWeeks(65339964);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.plus(readableDuration47);
        org.joda.time.DateTime.Property property49 = dateTime46.weekyear();
        org.joda.time.DateTime dateTime51 = dateTime46.plusSeconds(304);
        org.joda.time.DateTime.Property property52 = dateTime46.millisOfDay();
        boolean boolean53 = dateTime46.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        boolean boolean58 = dateTimeFieldType54.isSupported(chronology57);
        long long62 = chronology57.add((long) 184, 0L, 0);
        org.joda.time.ReadablePeriod readablePeriod63 = null;
        long long66 = chronology57.add(readablePeriod63, (long) 2022, 1870);
        org.joda.time.DurationField durationField67 = chronology57.weekyears();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime dateTime69 = dateTime46.toDateTime(chronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime68", (dateTime1.compareTo(dateTime68) == 0) == dateTime1.equals(dateTime68));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        long long3 = instant1.getMillis();
        org.joda.time.DateTime dateTime4 = instant1.toDateTime();
        org.joda.time.Instant instant6 = instant1.minus((long) 849);
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(4);
        int int16 = dateTime13.getEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        java.lang.String str21 = dateTimeZone18.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime22 = dateTime13.toDateTime(dateTimeZone18);
        int int23 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(10);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.plus(readablePeriod31);
        org.joda.time.DateTime dateTime33 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property34 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime36 = property34.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readableDuration37);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime36.getZone();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime22.toMutableDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusMinutes(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        org.joda.time.DateTime dateTime48 = property47.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property49 = dateTime48.weekyear();
        org.joda.time.DateTime dateTime50 = property49.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime52 = localDateTime51.toDateTime();
        org.joda.time.DateTime dateTime54 = dateTime52.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime56 = dateTime54.plusMinutes(10);
        org.joda.time.DateTime.Property property57 = dateTime54.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.DateTime dateTime59 = dateTime54.plus(readablePeriod58);
        org.joda.time.DateTime dateTime60 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property61 = dateTime54.minuteOfDay();
        org.joda.time.DateTime dateTime63 = property61.addWrapFieldToCopy(0);
        int int64 = dateTime63.getHourOfDay();
        int int65 = property49.compareTo((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime67 = dateTime63.withMillis((long) 761);
        org.joda.time.DateTime.Property property68 = dateTime67.year();
        org.joda.time.LocalDateTime localDateTime69 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime70 = localDateTime69.toDateTime();
        org.joda.time.DateTime dateTime72 = dateTime70.plusHours(4);
        org.joda.time.DateTime dateTime74 = dateTime72.minusMinutes((-1));
        int int75 = dateTime74.getMillisOfSecond();
        boolean boolean76 = dateTime74.isBeforeNow();
        org.joda.time.DateTime dateTime77 = dateTime74.withEarlierOffsetAtOverlap();
        boolean boolean78 = dateTime67.isBefore((org.joda.time.ReadableInstant) dateTime74);
        org.joda.time.LocalDateTime localDateTime79 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime80 = localDateTime79.toDateTime();
        org.joda.time.DurationFieldType durationFieldType81 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology82 = null;
        boolean boolean83 = durationFieldType81.isSupported(chronology82);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime79.withFieldAdded(durationFieldType81, (int) 'x');
        org.joda.time.DateTime dateTime87 = dateTime67.withFieldAdded(durationFieldType81, 192);
        int int88 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime22", (dateTime1.compareTo(dateTime22) == 0) == dateTime1.equals(dateTime22));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear(3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        org.joda.time.Chronology chronology6 = dateTimeFormatter4.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 187);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.Chronology chronology11 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.property(dateTimeFieldType16);
        int int20 = localDateTime15.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        long long25 = dateTimeField23.remainder((long) (byte) 100);
        java.lang.String str26 = dateTimeField23.getName();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        int int28 = dateTimeField23.getMaximumShortTextLength(locale27);
        java.lang.String str29 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localDateTime15, locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter4.withLocale(locale27);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(4471839967L);
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTime();
        org.joda.time.Chronology chronology34 = instant32.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter30.withChronology(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and mutableDateTime33", (instant32.compareTo(mutableDateTime33) == 0) == instant32.equals(mutableDateTime33));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        org.joda.time.Chronology chronology9 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfHour();
        boolean boolean22 = dateTime13.isBefore((long) 1870);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.halfdayOfDay();
        org.joda.time.DurationField durationField27 = chronology25.seconds();
        org.joda.time.DurationField durationField28 = chronology25.millis();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.yearOfCentury();
        java.util.Locale locale34 = new java.util.Locale("2022", "2022-02-22T07:09:13.697");
        java.lang.String str35 = dateTimeField30.getAsText((long) 248, locale34);
        boolean boolean36 = dateTime13.equals((java.lang.Object) locale34);
        int int37 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        int int39 = localDateTime38.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology41 = null;
        boolean boolean42 = durationFieldType40.isSupported(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.withFieldAdded(durationFieldType40, 59);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withMillisOfDay((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.minusWeeks(2);
        int int50 = localDateTime46.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime46.plusDays(254);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime46.plusHours(625);
        org.joda.time.DateTime dateTime55 = dateTime13.withFields((org.joda.time.ReadablePartial) localDateTime54);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime57 = localDateTime56.toDateTime();
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime60 = dateTime57.withFieldAdded(durationFieldType58, (int) 'a');
        org.joda.time.DateTime dateTime62 = dateTime57.minusMinutes((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime64 = localDateTime63.toDateTime();
        org.joda.time.DateTime dateTime66 = dateTime64.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime68 = dateTime66.plusHours(0);
        org.joda.time.DateTime.Property property69 = dateTime66.weekyear();
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.DateTime dateTime72 = dateTime66.withPeriodAdded(readablePeriod70, (int) '4');
        java.lang.String str73 = dateTime66.toString();
        org.joda.time.Chronology chronology74 = dateTime66.getChronology();
        org.joda.time.Chronology chronology75 = chronology74.withUTC();
        org.joda.time.DateTime dateTime76 = dateTime62.withChronology(chronology74);
        org.joda.time.Chronology chronology77 = chronology74.withUTC();
        org.joda.time.MutableDateTime mutableDateTime78 = dateTime55.toMutableDateTime(chronology77);
        org.joda.time.DurationField durationField79 = chronology77.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime55 and mutableDateTime78", (dateTime55.compareTo(mutableDateTime78) == 0) == dateTime55.equals(mutableDateTime78));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime9 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy(0);
        int int23 = dateTime22.getHourOfDay();
        int int24 = property8.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime26 = dateTime22.withMillis((long) 761);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfMinute();
        org.joda.time.DurationField durationField32 = chronology30.years();
        java.lang.String str33 = chronology30.toString();
        org.joda.time.DateTime dateTime34 = dateTime26.toDateTime(chronology30);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime34", (dateTime26.compareTo(dateTime34) == 0) == dateTime26.equals(dateTime34));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.year();
        org.joda.time.DurationField durationField6 = chronology2.eras();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField6", Math.signum(durationField4.compareTo(durationField6)) == -Math.signum(durationField6.compareTo(durationField4)));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withFieldAdded(durationFieldType2, 59);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay((int) (byte) 100);
        org.joda.time.Instant instant10 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.Instant instant12 = instant10.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.joda.time.DateTime dateTime15 = instant12.toDateTime();
        org.joda.time.DateTime dateTime16 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime15", (instant10.compareTo(dateTime15) == 0) == instant10.equals(dateTime15));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(22);
        org.joda.time.DateTime.Property property9 = dateTime3.era();
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime15 = dateTime3.withWeekOfWeekyear(11);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(0);
        org.joda.time.DateTime.Property property22 = dateTime19.weekyear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded(readableDuration23, (int) (short) 10);
        org.joda.time.DateTime dateTime27 = dateTime19.plusMonths(34);
        boolean boolean28 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Instant instant29 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant29.plus(readableDuration30);
        org.joda.time.MutableDateTime mutableDateTime32 = instant31.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant31", (dateTime3.compareTo(instant31) == 0) == dateTime3.equals(instant31));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.plus(readablePeriod12);
        org.joda.time.DateTime dateTime14 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DateTime.Property property16 = dateTime8.minuteOfDay();
        boolean boolean17 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        java.lang.String str27 = fixedDateTimeZone22.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFieldAdded(durationFieldType34, 6);
        boolean boolean37 = fixedDateTimeZone22.isLocalDateTimeGap(localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withWeekyear(13);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readablePeriod40);
        org.joda.time.DateTime dateTime42 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTime.Property property43 = dateTime8.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime8.toGregorianCalendar();
        org.joda.time.DateTime dateTime46 = dateTime8.plusMinutes(8);
        org.joda.time.DateTime dateTime47 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.Instant instant48 = dateTime8.toInstant();
        org.joda.time.Instant instant49 = instant48.toInstant();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime51 = localDateTime50.toDateTime();
        org.joda.time.DateTime dateTime53 = dateTime51.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime55 = dateTime53.plusMinutes(10);
        int int56 = dateTime53.getWeekOfWeekyear();
        org.joda.time.Chronology chronology57 = dateTime53.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.halfdays();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.hourOfDay();
        org.joda.time.DateTimeField dateTimeField61 = chronology57.centuryOfEra();
        org.joda.time.Chronology chronology62 = chronology57.withUTC();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.dayOfMonth();
        int int65 = localDateTime63.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime63.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property68 = localDateTime63.monthOfYear();
        org.joda.time.LocalDateTime localDateTime70 = property68.addToCopy((long) '4');
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now(dateTimeZone72);
        java.lang.String str75 = dateTimeZone72.getName((long) (byte) -1);
        java.lang.String str76 = dateTimeZone72.getID();
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime70, dateTimeZone72);
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime70.minus(readableDuration78);
        int[] intArray81 = chronology57.get((org.joda.time.ReadablePartial) localDateTime79, (long) (short) -1);
        org.joda.time.DateTimeField dateTimeField82 = chronology57.weekyearOfCentury();
        org.joda.time.DateTime dateTime83 = org.joda.time.DateTime.now(chronology57);
        org.joda.time.DateTime.Property property84 = dateTime83.weekyear();
        org.joda.time.DateTimeZone dateTimeZone85 = dateTime83.getZone();
        org.joda.time.DateTime dateTime86 = org.joda.time.DateTime.now(dateTimeZone85);
        boolean boolean87 = instant48.isAfter((org.joda.time.ReadableInstant) dateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant48", (dateTime8.compareTo(instant48) == 0) == dateTime8.equals(instant48));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(22);
        org.joda.time.DateTime.Property property9 = dateTime3.era();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((java.lang.Object) dateTime3);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime13 = dateTime3.withPeriodAdded(readablePeriod11, 0);
        org.joda.time.DateTime dateTime15 = dateTime13.plusSeconds(471);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant10", (dateTime13.compareTo(instant10) == 0) == dateTime13.equals(instant10));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        boolean boolean9 = dateTime7.isEqual((long) 26);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField16 = chronology12.eras();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology12.getZone();
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(chronology12);
        org.joda.time.DateTime.Property property19 = dateTime7.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 6);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.year();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 9, chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.year();
        org.joda.time.DateTime dateTime22 = dateTime12.toDateTime(chronology16);
        java.util.Date date23 = dateTime12.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime22", (dateTime1.compareTo(dateTime22) == 0) == dateTime1.equals(dateTime22));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(22);
        org.joda.time.DateTime.Property property9 = dateTime3.era();
        org.joda.time.DateTime.Property property10 = dateTime3.secondOfMinute();
        org.joda.time.DateTime.Property property11 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime15 = dateTime3.withWeekOfWeekyear(11);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(0);
        org.joda.time.DateTime.Property property22 = dateTime19.weekyear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.withDurationAdded(readableDuration23, (int) (short) 10);
        org.joda.time.DateTime dateTime27 = dateTime19.plusMonths(34);
        boolean boolean28 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Instant instant29 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant29.plus(readableDuration30);
        org.joda.time.Instant instant33 = org.joda.time.Instant.parse("2022-02-22T07:10:08.966+00:00:00.059");
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant33.withDurationAdded(readableDuration34, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(0);
        org.joda.time.DateTime.Property property45 = dateTime42.weekyear();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime48 = dateTime42.withPeriodAdded(readablePeriod46, (int) '4');
        int int49 = property38.getDifference((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime42.plus(readableDuration50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime42.minus(readablePeriod52);
        org.joda.time.DateTime.Property property54 = dateTime53.secondOfMinute();
        java.util.Locale locale57 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.lang.String str59 = locale58.getDisplayName();
        java.lang.String str60 = locale57.getDisplayVariant(locale58);
        java.util.Set<java.lang.String> strSet61 = locale57.getUnicodeLocaleKeys();
        boolean boolean62 = dateTime53.equals((java.lang.Object) locale57);
        boolean boolean63 = instant33.isAfter((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime65 = dateTime53.plus(readableDuration64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str67 = dateTimeFieldType66.toString();
        int int68 = dateTime65.get(dateTimeFieldType66);
        int int69 = instant31.get(dateTimeFieldType66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant31", (dateTime3.compareTo(instant31) == 0) == dateTime3.equals(instant31));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        long long9 = dateTime3.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withTime((int) (short) 0, (int) ' ', 12, 374);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime1.minusYears((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime1.plusHours(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusWeeks(40);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusHours(69);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        int int18 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.Chronology chronology24 = localDateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType21.getField(chronology24);
        boolean boolean27 = localDateTime16.isSupported(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType21.getField(chronology30);
        org.joda.time.DurationField durationField33 = chronology30.weekyears();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        int int35 = localDateTime34.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology37 = null;
        boolean boolean38 = durationFieldType36.isSupported(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime34.withFieldAdded(durationFieldType36, 59);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusHours(0);
        org.joda.time.DateTime dateTime47 = localDateTime34.toDateTime((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime34.minus(readablePeriod48);
        long long51 = chronology30.set((org.joda.time.ReadablePartial) localDateTime34, (long) 38);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DateTime dateTime54 = dateTime52.plusYears(236);
        boolean boolean55 = localDateTime11.equals((java.lang.Object) 236);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime52", (dateTime23.compareTo(dateTime52) == 0) == dateTime23.equals(dateTime52));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((-1));
        int int6 = dateTime5.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.halfdayOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 2022, chronology10);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(chronology10);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        int int15 = dateTime13.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(4);
        org.joda.time.DateTime dateTime8 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        int int9 = dateTime5.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime5.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime5.minusHours(60);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((long) (-1));
        boolean boolean15 = dateTime5.isAfter((org.joda.time.ReadableInstant) instant14);
        org.joda.time.DateTime dateTime16 = instant14.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays(25716933);
        org.joda.time.DateTime dateTime20 = dateTime16.plusSeconds(2922789);
        int int21 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime16", (instant14.compareTo(dateTime16) == 0) == instant14.equals(dateTime16));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.minus(readablePeriod15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.withPeriodAdded(readablePeriod17, 12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime16.withZoneRetainFields(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours(4);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((-1));
        int int28 = dateTime27.getMonthOfYear();
        long long29 = dateTime27.getMillis();
        boolean boolean30 = dateTime21.isEqual((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean31 = dateTime21.isEqualNow();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes(10);
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.plus(readablePeriod39);
        org.joda.time.DateTime dateTime41 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime44 = property42.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.minus(readableDuration45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        org.joda.time.Chronology chronology50 = localDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType47.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField53 = chronology50.weekyear();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration45, chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.clockhourOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime21.toMutableDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime62 = dateTime60.plusHours(0);
        org.joda.time.DateTime.Property property63 = dateTime60.monthOfYear();
        int int64 = property63.getMaximumValue();
        org.joda.time.DateTime dateTime65 = property63.roundHalfCeilingCopy();
        int int66 = dateTime65.getDayOfYear();
        int int67 = dateTime65.getEra();
        int int68 = mutableDateTime56.compareTo((org.joda.time.ReadableInstant) dateTime65);
        org.joda.time.DateTime.Property property69 = dateTime65.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime56", (dateTime5.compareTo(mutableDateTime56) == 0) == dateTime5.equals(mutableDateTime56));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        boolean boolean12 = dateTime3.isBefore((long) 1870);
        org.joda.time.Instant instant13 = dateTime3.toInstant();
        java.util.Date date14 = instant13.toDate();
        boolean boolean15 = instant13.isBeforeNow();
        org.joda.time.Chronology chronology16 = instant13.getChronology();
        org.joda.time.Instant instant19 = instant13.withDurationAdded((long) 2026, 224);
        org.joda.time.Instant instant21 = instant13.minus(1645513904474L);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant23 = instant21.plus(readableDuration22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.withPeriodAdded(readablePeriod5, 1970);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        boolean boolean14 = dateTimeFieldType10.isSupported(chronology13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime7.toMutableDateTime(chronology13);
        org.joda.time.DurationField durationField16 = chronology13.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime15", (dateTime1.compareTo(mutableDateTime15) == 0) == dateTime1.equals(mutableDateTime15));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime3.minusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.plus(readablePeriod22);
        org.joda.time.DateTime dateTime24 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property25 = dateTime18.weekyear();
        org.joda.time.DateTime.Property property26 = dateTime18.dayOfMonth();
        boolean boolean27 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.year();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 9, chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.year();
        org.joda.time.DurationField durationField37 = chronology31.months();
        org.joda.time.DurationField durationField38 = chronology31.hours();
        org.joda.time.DurationField durationField39 = chronology31.halfdays();
        org.joda.time.DateTime dateTime40 = dateTime14.withChronology(chronology31);
        org.joda.time.DateTimeField dateTimeField41 = chronology31.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime40", (dateTime13.compareTo(dateTime40) == 0) == dateTime13.equals(dateTime40));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Calendar.Builder builder1 = new java.util.Calendar.Builder();
        java.util.Locale locale2 = java.util.Locale.UK;
        java.lang.String str3 = locale2.getDisplayCountry();
        java.util.Calendar.Builder builder4 = builder1.setLocale(locale2);
        java.util.Locale locale5 = java.util.Locale.ROOT;
        java.util.Calendar.Builder builder6 = builder4.setLocale(locale5);
        java.lang.String str9 = nameProvider0.getShortName(locale5, "Thu Jan 01 00:00:00 GMT+00:00 2128", "ja_JP");
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        java.lang.String str13 = nameProvider0.getName(locale10, "8", "00:00:00.910");
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder15 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder19 = builder15.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        boolean boolean21 = timeZone20.observesDaylightTime();
        timeZone20.setID("");
        java.util.Calendar.Builder builder24 = builder15.setTimeZone(timeZone20);
        boolean boolean25 = timeZone14.hasSameRules(timeZone20);
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet28 = locale26.getExtensionKeys();
        java.lang.String str29 = locale26.getScript();
        java.lang.String str30 = locale26.getDisplayCountry();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone20, locale26);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale26);
        java.util.Locale locale33 = locale26.stripExtensions();
        java.lang.String str36 = nameProvider0.getShortName(locale26, "2022-02-22T16:23:17.642", "ja_jp");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar32", (calendar31.compareTo(calendar32) == 0) == calendar31.equals(calendar32));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(100L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate9.plus(readablePeriod12);
        org.joda.time.LocalDate localDate14 = localDate6.withFields((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate16 = localDate6.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime17 = localDate16.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.millis();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology18);
        int int21 = dateTime1.getSecondOfMinute();
        org.joda.time.Instant instant23 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant24 = instant23.toInstant();
        org.joda.time.Instant instant25 = instant23.toInstant();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant25.plus(readableDuration26);
        org.joda.time.Instant instant29 = instant27.plus(4471839967L);
        org.joda.time.Instant instant31 = instant29.minus((long) (byte) -1);
        org.joda.time.Instant instant34 = instant31.withDurationAdded(1645513753377L, 842);
        org.joda.time.MutableDateTime mutableDateTime35 = instant31.toMutableDateTime();
        boolean boolean36 = dateTime1.isAfter((org.joda.time.ReadableInstant) instant31);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant38 = instant31.minus(readableDuration37);
        long long39 = instant31.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and instant31", (mutableDateTime35.compareTo(instant31) == 0) == mutableDateTime35.equals(instant31));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.plus(readablePeriod12);
        org.joda.time.DateTime dateTime14 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DateTime.Property property16 = dateTime8.minuteOfDay();
        boolean boolean17 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        java.lang.String str27 = fixedDateTimeZone22.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFieldAdded(durationFieldType34, 6);
        boolean boolean37 = fixedDateTimeZone22.isLocalDateTimeGap(localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withWeekyear(13);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readablePeriod40);
        org.joda.time.DateTime dateTime42 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTime.Property property43 = dateTime8.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime8.toGregorianCalendar();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:09:03.986", "GB", 739, 173);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        int int51 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime52 = dateTime8.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime50", (dateTime1.compareTo(dateTime50) == 0) == dateTime1.equals(dateTime50));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours(0);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime16.withPeriodAdded(readablePeriod20, (int) '4');
        int int23 = property12.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime16.plus(readableDuration24);
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.minusWeeks((int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone34 = fixedDateTimeZone33.toTimeZone();
        int int36 = fixedDateTimeZone33.getOffset((long) 228);
        int int38 = fixedDateTimeZone33.getStandardOffset((long) 548);
        org.joda.time.DateTime dateTime39 = dateTime28.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        java.util.TimeZone timeZone40 = fixedDateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime41 = dateTime10.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        org.joda.time.DateTime.Property property42 = dateTime41.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property11 = dateTime1.minuteOfHour();
        int int12 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean14 = dateTime1.isSupported(dateTimeFieldType13);
        java.lang.String str15 = dateTimeFieldType13.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime.Property property9 = dateTime7.year();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone15 = fixedDateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime7, (org.joda.time.DateTimeZone) fixedDateTimeZone14);
        org.joda.time.DateTime dateTime18 = dateTime7.plusHours(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(0L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = localDate6.toDateMidnight(dateTimeZone7);
        int[] intArray15 = new int[] { (-1), (short) 1, 2, 54, (byte) 0 };
        int[] intArray17 = dateTimeField2.add((org.joda.time.ReadablePartial) localDate6, 0, intArray15, 0);
        org.joda.time.LocalDate localDate19 = localDate6.withWeekOfWeekyear(2);
        org.joda.time.LocalDate localDate21 = localDate19.plusMonths(70);
        org.joda.time.LocalDate.Property property22 = localDate21.weekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(0L, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(0L, dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate31.plus(readablePeriod34);
        org.joda.time.LocalDate localDate36 = localDate28.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate38 = localDate28.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime39 = localDate38.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology40 = localDate38.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone45 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone46 = fixedDateTimeZone45.toTimeZone();
        int int48 = fixedDateTimeZone45.getOffset((long) 228);
        boolean boolean49 = fixedDateTimeZone45.isFixed();
        java.lang.String str51 = fixedDateTimeZone45.getNameKey((long) 348);
        org.joda.time.DateTime dateTime52 = localDate38.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone45);
        java.util.TimeZone timeZone53 = fixedDateTimeZone45.toTimeZone();
        boolean boolean55 = fixedDateTimeZone45.isStandardOffset((long) 761);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 304, (org.joda.time.DateTimeZone) fixedDateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalDate localDate59 = new org.joda.time.LocalDate(0L, dateTimeZone58);
        org.joda.time.LocalDate localDate61 = localDate59.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDate localDate64 = new org.joda.time.LocalDate(0L, dateTimeZone63);
        org.joda.time.LocalDate localDate66 = localDate64.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDate localDate68 = localDate64.plus(readablePeriod67);
        org.joda.time.LocalDate localDate69 = localDate61.withFields((org.joda.time.ReadablePartial) localDate64);
        org.joda.time.LocalDate localDate71 = localDate61.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime72 = localDate71.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology73 = localDate71.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone78 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone79 = fixedDateTimeZone78.toTimeZone();
        int int81 = fixedDateTimeZone78.getOffset((long) 228);
        boolean boolean82 = fixedDateTimeZone78.isFixed();
        java.lang.String str84 = fixedDateTimeZone78.getNameKey((long) 348);
        org.joda.time.DateTime dateTime85 = localDate71.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone78);
        java.util.TimeZone timeZone86 = fixedDateTimeZone78.toTimeZone();
        int int88 = fixedDateTimeZone78.getStandardOffset(1645513731802L);
        int int90 = fixedDateTimeZone78.getOffsetFromLocal((long) 976);
        java.util.TimeZone timeZone91 = fixedDateTimeZone78.toTimeZone();
        org.joda.time.DateTime dateTime92 = localDate56.toDateTimeAtStartOfDay((org.joda.time.DateTimeZone) fixedDateTimeZone78);
        org.joda.time.DateTime dateTime93 = localDate21.toDateTimeAtStartOfDay((org.joda.time.DateTimeZone) fixedDateTimeZone78);
        boolean boolean95 = fixedDateTimeZone78.isStandardOffset((long) 991);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime52", (dateTime39.compareTo(dateTime52) == 0) == dateTime39.equals(dateTime52));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime3.plusMonths(34);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant15.withDurationAdded(readableDuration16, 2024);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant18", (dateTime11.compareTo(instant18) == 0) == dateTime11.equals(instant18));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        int int22 = fixedDateTimeZone19.getOffset((long) 228);
        int int24 = fixedDateTimeZone19.getStandardOffset((long) 548);
        java.lang.String str26 = fixedDateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        boolean boolean28 = fixedDateTimeZone19.isFixed();
        long long31 = fixedDateTimeZone19.adjustOffset((long) 612, false);
        java.util.Locale locale36 = new java.util.Locale("2022-02-22T07:09:15.209", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=1970-01-01T00:00:00.000Z,offset=59,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=2022,MINUTE=2,SECOND=4,MILLISECOND=636,ZONE_OFFSET=59,DST_OFFSET=0]", "2022-02-22T07:10:45.837+00:00:00.059");
        java.util.Locale.setDefault(locale36);
        java.lang.String str38 = fixedDateTimeZone19.getShortName(1645513840692L, locale36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime27", (dateTime3.compareTo(dateTime27) == 0) == dateTime3.equals(dateTime27));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        java.util.Date date18 = dateTime16.toDate();
        java.util.Date date20 = new java.util.Date((long) (byte) 0);
        int int21 = date20.getHours();
        date20.setMonth(6);
        java.util.Date date25 = new java.util.Date((long) (byte) 1);
        date25.setYear(228);
        int int28 = date25.getDay();
        int int29 = date25.getMinutes();
        date25.setYear(348);
        date25.setTime(35L);
        int int34 = date25.getTimezoneOffset();
        java.lang.String str35 = date25.toGMTString();
        boolean boolean36 = date20.before(date25);
        long long37 = date25.getTime();
        int int38 = date25.getMonth();
        date25.setYear(714);
        boolean boolean41 = date18.before(date25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime16", (instant12.compareTo(dateTime16) == 0) == instant12.equals(dateTime16));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(59);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis((long) 2);
        int int11 = dateTime8.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(4);
        org.joda.time.DateTime dateTime18 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        java.lang.String str19 = localDateTime13.toString();
        org.joda.time.Instant instant21 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime dateTime23 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime.Property property24 = dateTime22.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTime();
        boolean boolean26 = dateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime22", (instant21.compareTo(dateTime22) == 0) == instant21.equals(dateTime22));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant12.minus(readableDuration14);
        org.joda.time.Instant instant18 = instant15.withDurationAdded((long) 259, 60);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant15.minus(readableDuration19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant15.minus(readableDuration21);
        org.joda.time.MutableDateTime mutableDateTime23 = instant15.toMutableDateTime();
        org.joda.time.Chronology chronology24 = instant15.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime23", (instant15.compareTo(mutableDateTime23) == 0) == instant15.equals(mutableDateTime23));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(4);
        org.joda.time.DateTime dateTime13 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.plusMinutes(32770);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis(10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withFieldAdded(durationFieldType26, 6);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = durationFieldType26.getField(chronology31);
        org.joda.time.DurationField durationField35 = chronology31.days();
        boolean boolean36 = localDateTime18.equals((java.lang.Object) chronology31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime3.toMutableDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField38 = chronology31.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime37", (dateTime3.compareTo(mutableDateTime37) == 0) == dateTime3.equals(mutableDateTime37));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        boolean boolean26 = fixedDateTimeZone22.isFixed();
        java.lang.String str28 = fixedDateTimeZone22.getNameKey((long) 348);
        org.joda.time.DateTime dateTime29 = localDate15.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        java.util.TimeZone timeZone30 = fixedDateTimeZone22.toTimeZone();
        long long32 = fixedDateTimeZone22.previousTransition(345600000L);
        int int34 = fixedDateTimeZone22.getStandardOffset(0L);
        int int36 = fixedDateTimeZone22.getStandardOffset((long) 44);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 25859005, (org.joda.time.DateTimeZone) fixedDateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = property13.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.plus(readablePeriod23);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property26 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property26.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readableDuration29);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone36 = fixedDateTimeZone35.toTimeZone();
        int int38 = fixedDateTimeZone35.getOffset((long) 228);
        int int40 = fixedDateTimeZone35.getStandardOffset((long) 548);
        java.lang.String str42 = fixedDateTimeZone35.getNameKey(0L);
        org.joda.time.DateTime dateTime43 = dateTime30.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekyear(40);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime51 = dateTime49.plusMinutes(10);
        org.joda.time.DateTime.Property property52 = dateTime49.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime49.plus(readablePeriod53);
        org.joda.time.DateTime.Property property55 = dateTime49.hourOfDay();
        org.joda.time.DateTime dateTime57 = dateTime49.plusDays(22);
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime59 = dateTime57.toDateTime(dateTimeZone58);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType61 = dateTimeFieldType60.getRangeDurationType();
        org.joda.time.DateTime.Property property62 = dateTime57.property(dateTimeFieldType60);
        int int63 = dateTime43.get(dateTimeFieldType60);
        boolean boolean64 = localDateTime15.isSupported(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime66 = localDateTime65.toDateTime();
        org.joda.time.Chronology chronology67 = localDateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.halfdayOfDay();
        org.joda.time.DurationField durationField69 = chronology67.seconds();
        org.joda.time.DurationField durationField70 = chronology67.millis();
        org.joda.time.DateTimeField dateTimeField71 = chronology67.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField72 = chronology67.centuryOfEra();
        org.joda.time.DurationField durationField73 = chronology67.minutes();
        org.joda.time.ReadablePeriod readablePeriod74 = null;
        long long77 = chronology67.add(readablePeriod74, 74476825834L, 13);
        boolean boolean78 = dateTimeFieldType60.isSupported(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime43", (dateTime3.compareTo(dateTime43) == 0) == dateTime3.equals(dateTime43));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = chronology2.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone10 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone11 = fixedDateTimeZone10.toTimeZone();
        int int13 = fixedDateTimeZone10.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone10);
        int int15 = localDateTime14.getDayOfYear();
        int[] intArray17 = chronology2.get((org.joda.time.ReadablePartial) localDateTime14, (long) 30);
        org.joda.time.DateTimeField dateTimeField18 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes(10);
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.plus(readablePeriod27);
        org.joda.time.DateTime dateTime29 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property30 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime32 = property30.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readableDuration33);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime32.getZone();
        java.lang.String str37 = dateTimeZone35.getName((long) 292269054);
        org.joda.time.Chronology chronology38 = chronology2.withZone(dateTimeZone35);
        org.joda.time.DurationField durationField39 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField4 and durationField39", (durationField4.compareTo(durationField39) == 0) == durationField4.equals(durationField39));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        boolean boolean12 = dateTime3.isBefore((long) 1870);
        org.joda.time.Instant instant13 = dateTime3.toInstant();
        java.util.Date date14 = instant13.toDate();
        boolean boolean15 = instant13.isBeforeNow();
        org.joda.time.Chronology chronology16 = instant13.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        long long4 = instant1.getMillis();
        org.joda.time.Instant instant6 = instant1.plus(1645513788734L);
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.DateTime dateTime8 = instant1.toDateTimeISO();
        long long9 = instant1.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime8", (instant1.compareTo(dateTime8) == 0) == instant1.equals(dateTime8));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone12 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone13 = fixedDateTimeZone12.toTimeZone();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfSecond();
        int int23 = fixedDateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime21);
        int int25 = fixedDateTimeZone12.getOffset((long) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone12);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone31 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone32 = fixedDateTimeZone31.toTimeZone();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime34 = localDateTime33.toDateTime();
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime38 = dateTime36.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = dateTime36.withZone(dateTimeZone39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfSecond();
        int int42 = fixedDateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime40);
        int int44 = fixedDateTimeZone31.getOffset((long) (byte) 1);
        long long46 = fixedDateTimeZone31.previousTransition((long) 8);
        java.util.Date date48 = new java.util.Date((long) (byte) 1);
        int int49 = date48.getSeconds();
        java.time.Instant instant50 = date48.toInstant();
        boolean boolean51 = fixedDateTimeZone31.equals((java.lang.Object) instant50);
        java.lang.String str53 = fixedDateTimeZone31.getNameKey((long) 259);
        int int55 = fixedDateTimeZone31.getStandardOffset(2022L);
        org.joda.time.DateTime dateTime56 = dateTime26.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone31);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone61 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone62 = fixedDateTimeZone61.toTimeZone();
        int int64 = fixedDateTimeZone61.getOffset((long) 228);
        java.lang.String str66 = fixedDateTimeZone61.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime67.minus(readableDuration69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType73 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime72.withFieldAdded(durationFieldType73, 6);
        boolean boolean76 = fixedDateTimeZone61.isLocalDateTimeGap(localDateTime75);
        long long78 = fixedDateTimeZone61.previousTransition((long) 500);
        long long80 = fixedDateTimeZone31.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone61, (long) 25839534);
        int int82 = fixedDateTimeZone61.getStandardOffset((long) 25815);
        int int84 = fixedDateTimeZone61.getOffsetFromLocal(1645513910631L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.withPeriodAdded(readablePeriod5, 1970);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(10);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime13.plusYears(22);
        org.joda.time.DateTime.Property property19 = dateTime13.era();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone25 = fixedDateTimeZone24.toTimeZone();
        int int27 = fixedDateTimeZone24.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime28 = dateTime13.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        boolean boolean29 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime31 = dateTime28.plusWeeks(0);
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime31", (dateTime13.compareTo(dateTime31) == 0) == dateTime13.equals(dateTime31));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int7 = fixedDateTimeZone4.getOffset((long) 228);
        java.lang.String str9 = fixedDateTimeZone4.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withFieldAdded(durationFieldType16, 6);
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours(4);
        int int25 = dateTime22.getEra();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.plus(readablePeriod26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis((-62104060800000L));
        long long30 = dateTime29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTime.Property property37 = dateTime34.monthOfYear();
        boolean boolean38 = dateTime29.isBefore((org.joda.time.ReadableInstant) dateTime34);
        int int39 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.Chronology chronology43 = localDateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime((-61472908799900L), chronology43);
        org.joda.time.DurationField durationField48 = chronology43.minutes();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField50 = chronology43.dayOfMonth();
        org.joda.time.DateTime dateTime51 = dateTime34.withChronology(chronology43);
        org.joda.time.DateTimeField dateTimeField52 = chronology43.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and dateTime51", (dateTime34.compareTo(dateTime51) == 0) == dateTime34.equals(dateTime51));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minusWeeks(25871300);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime19.plus(readablePeriod23);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property26 = dateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.Chronology chronology29 = localDateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.secondOfMinute();
        org.joda.time.DurationField durationField31 = chronology29.years();
        org.joda.time.DateTime dateTime32 = dateTime19.toDateTime(chronology29);
        int int33 = dateTime32.getMillisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.plusMonths(420);
        boolean boolean36 = localDateTime10.equals((java.lang.Object) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime32", (dateTime3.compareTo(dateTime32) == 0) == dateTime3.equals(dateTime32));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime8.plus(readablePeriod12);
        org.joda.time.DateTime dateTime14 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property15 = dateTime8.minuteOfDay();
        org.joda.time.DateTime.Property property16 = dateTime8.minuteOfDay();
        boolean boolean17 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone23 = fixedDateTimeZone22.toTimeZone();
        int int25 = fixedDateTimeZone22.getOffset((long) 228);
        java.lang.String str27 = fixedDateTimeZone22.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withFieldAdded(durationFieldType34, 6);
        boolean boolean37 = fixedDateTimeZone22.isLocalDateTimeGap(localDateTime36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withWeekyear(13);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plus(readablePeriod40);
        org.joda.time.DateTime dateTime42 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.DateTime.Property property43 = dateTime8.secondOfDay();
        java.util.GregorianCalendar gregorianCalendar44 = dateTime8.toGregorianCalendar();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:09:03.986", "GB", 739, 173);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        int int51 = dateTime8.compareTo((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.DateTime dateTime53 = dateTime8.withWeekyear(753);
        org.joda.time.DateTime.Property property54 = dateTime8.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime50", (dateTime1.compareTo(dateTime50) == 0) == dateTime1.equals(dateTime50));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DurationField durationField5 = chronology2.millis();
        org.joda.time.DurationField durationField6 = chronology2.centuries();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        java.util.Calendar.Builder builder8 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder12 = builder8.setTimeOfDay(8, 0, 10);
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale13.getDisplayCountry();
        boolean boolean15 = locale13.hasExtensions();
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale13);
        calendar16.setLenient(false);
        long long19 = calendar16.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone25 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone26 = fixedDateTimeZone25.toTimeZone();
        int int27 = timeZone26.getRawOffset();
        calendar16.setTimeZone(timeZone26);
        boolean boolean29 = timeZone26.observesDaylightTime();
        java.util.Calendar.Builder builder30 = builder12.setTimeZone(timeZone26);
        gregorianCalendar7.setTimeZone(timeZone26);
        java.util.TimeZone timeZone32 = gregorianCalendar7.getTimeZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone38 = fixedDateTimeZone37.toTimeZone();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = dateTime42.withZone(dateTimeZone45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfSecond();
        int int48 = fixedDateTimeZone37.getOffset((org.joda.time.ReadableInstant) dateTime46);
        int int50 = fixedDateTimeZone37.getOffset((long) (byte) 1);
        long long52 = fixedDateTimeZone37.previousTransition((long) 8);
        boolean boolean53 = fixedDateTimeZone37.isFixed();
        java.util.TimeZone timeZone54 = fixedDateTimeZone37.toTimeZone();
        java.util.TimeZone.setDefault(timeZone54);
        boolean boolean56 = timeZone32.hasSameRules(timeZone54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar7 and calendar16", (gregorianCalendar7.compareTo(calendar16) == 0) == gregorianCalendar7.equals(calendar16));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        boolean boolean6 = dateTime1.equals((java.lang.Object) durationFieldType5);
        int int7 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime1.withYearOfEra(70);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.halfdayOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology14);
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours(4);
        org.joda.time.DateTime dateTime27 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime22.plusMinutes(32770);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.minusMillis(10);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusMonths(535);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean37 = localDateTime35.isSupported(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfMonth();
        int int40 = localDateTime38.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int44 = localDateTime38.get(dateTimeFieldType43);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType43.getDurationType();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.Chronology chronology48 = localDateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.secondOfMinute();
        org.joda.time.DurationField durationField50 = chronology48.years();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone56 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone57 = fixedDateTimeZone56.toTimeZone();
        int int59 = fixedDateTimeZone56.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone56);
        int int61 = localDateTime60.getDayOfYear();
        int[] intArray63 = chronology48.get((org.joda.time.ReadablePartial) localDateTime60, (long) 30);
        org.joda.time.DateTimeField dateTimeField64 = chronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField65 = chronology48.yearOfEra();
        boolean boolean66 = durationFieldType45.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType36.getField(chronology48);
        boolean boolean68 = dateTime20.isSupported(dateTimeFieldType36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime18", (dateTime1.compareTo(dateTime18) == 0) == dateTime1.equals(dateTime18));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.withPeriodAdded(readablePeriod5, 1970);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra(10);
        int int10 = dateTime9.getMillisOfDay();
        org.joda.time.DateTime.Property property11 = dateTime9.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withZone(dateTimeZone27);
        org.joda.time.DateTime.Property property29 = dateTime28.millisOfSecond();
        int int30 = fixedDateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime28);
        long long32 = fixedDateTimeZone19.previousTransition((long) '#');
        long long34 = fixedDateTimeZone19.nextTransition(1645513711304L);
        long long36 = fixedDateTimeZone19.previousTransition((long) 4);
        int int38 = fixedDateTimeZone19.getOffsetFromLocal((long) 733);
        org.joda.time.DateTime dateTime39 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        long long41 = fixedDateTimeZone19.nextTransition((long) 721);
        java.util.TimeZone timeZone42 = fixedDateTimeZone19.toTimeZone();
        int int44 = timeZone42.getOffset(1645513721480L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime39", (dateTime9.compareTo(dateTime39) == 0) == dateTime9.equals(dateTime39));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology3.years();
        java.lang.String str6 = chronology3.toString();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField9 = chronology3.weeks();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology3);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(817L, chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime11", (dateTime2.compareTo(dateTime11) == 0) == dateTime2.equals(dateTime11));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks(2);
        int int17 = dateTime16.getHourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.minusMillis(283);
        int int20 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime.Property property21 = dateTime19.secondOfDay();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes(10);
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime25.plusYears(22);
        org.joda.time.DateTime.Property property31 = dateTime25.era();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone36 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone37 = fixedDateTimeZone36.toTimeZone();
        int int39 = fixedDateTimeZone36.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime40 = dateTime25.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone36);
        org.joda.time.Instant instant41 = dateTime40.toInstant();
        boolean boolean42 = dateTime19.isEqual((org.joda.time.ReadableInstant) instant41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant41.minus(readableDuration43);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.Instant instant46 = instant41.minus(readableDuration45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant46", (dateTime5.compareTo(instant46) == 0) == dateTime5.equals(instant46));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 6);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.year();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 9, chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.year();
        org.joda.time.DateTime dateTime22 = dateTime12.toDateTime(chronology16);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = dateTime27.withZone(dateTimeZone30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int33 = dateTime27.get(dateTimeFieldType32);
        org.joda.time.DateTime.Property property34 = dateTime27.minuteOfDay();
        org.joda.time.Chronology chronology35 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = dateTimeField36.getType();
        int int38 = dateTime22.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant23", (dateTime12.compareTo(instant23) == 0) == dateTime12.equals(instant23));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(99);
        org.joda.time.DateTime dateTime9 = property5.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime14 = dateTime11.withFieldAdded(durationFieldType12, (int) 'a');
        org.joda.time.DateTime dateTime16 = dateTime11.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime16.withYearOfCentury(0);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.Chronology chronology21 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.secondOfMinute();
        boolean boolean25 = dateTime18.equals((java.lang.Object) dateTimeField24);
        boolean boolean26 = dateTime9.equals((java.lang.Object) boolean25);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusMinutes(10);
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime35 = dateTime30.plus(readablePeriod34);
        org.joda.time.DateTime dateTime36 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property37 = dateTime30.minuteOfDay();
        org.joda.time.DateTime dateTime39 = property37.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime41 = localDateTime40.toDateTime();
        org.joda.time.Chronology chronology42 = localDateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.secondOfMinute();
        int int44 = dateTime39.get(dateTimeField43);
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet47 = locale46.getExtensionKeys();
        java.lang.String str48 = dateTimeField43.getAsShortText(1169187558838880L, locale46);
        java.util.Locale.setDefault(locale46);
        java.util.Locale locale53 = new java.util.Locale("java.util.GregorianCalendar[time=1645513710548,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=8,SECOND=30,MILLISECOND=548,ZONE_OFFSET=0,DST_OFFSET=0]", "2", "2022-02-22T07:08:27.149");
        java.lang.String str54 = locale46.getDisplayVariant(locale53);
        java.util.Locale locale55 = locale46.stripExtensions();
        boolean boolean56 = dateTime9.equals((java.lang.Object) locale46);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone61 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone62 = fixedDateTimeZone61.toTimeZone();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime64 = localDateTime63.toDateTime();
        org.joda.time.DateTime dateTime66 = dateTime64.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime68 = dateTime66.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = dateTime66.withZone(dateTimeZone69);
        org.joda.time.DateTime.Property property71 = dateTime70.millisOfSecond();
        int int72 = fixedDateTimeZone61.getOffset((org.joda.time.ReadableInstant) dateTime70);
        long long74 = fixedDateTimeZone61.previousTransition((long) '#');
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime76 = localDateTime75.toDateTime();
        org.joda.time.DateTime dateTime78 = dateTime76.plusHours(4);
        org.joda.time.DateTime dateTime80 = dateTime78.minusMinutes((-1));
        org.joda.time.DateTimeZone dateTimeZone81 = dateTime78.getZone();
        long long83 = fixedDateTimeZone61.getMillisKeepLocal(dateTimeZone81, 0L);
        long long85 = fixedDateTimeZone61.convertUTCToLocal((long) 78);
        org.joda.time.LocalDateTime localDateTime86 = org.joda.time.LocalDateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone61);
        org.joda.time.Chronology chronology87 = localDateTime86.getChronology();
        org.joda.time.DateTime dateTime88 = dateTime9.withChronology(chronology87);
        org.joda.time.DateTimeField dateTimeField89 = chronology87.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime88", (dateTime6.compareTo(dateTime88) == 0) == dateTime6.equals(dateTime88));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTimeZone6.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(818248804769399618L);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate4.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDate localDate8 = localDate4.plus(readablePeriod7);
        org.joda.time.LocalDate.Property property9 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundCeilingCopy();
        org.joda.time.LocalDate localDate11 = property9.withMaximumValue();
        org.joda.time.LocalDate localDate13 = localDate11.minusDays(25842980);
        int int14 = localDate13.getYearOfEra();
        org.joda.time.Chronology chronology15 = localDate13.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime1.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime16", (dateTime1.compareTo(dateTime16) == 0) == dateTime1.equals(dateTime16));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        int int17 = dateTime12.get(dateTimeField16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = dateTimeField16.getAsShortText(1169187558838880L, locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale19);
        calendar22.clear();
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone24);
        java.util.Calendar.Builder builder26 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder30 = builder26.setTimeOfDay(8, 0, 10);
        java.util.TimeZone timeZone31 = java.util.TimeZone.getDefault();
        boolean boolean32 = timeZone31.observesDaylightTime();
        timeZone31.setID("");
        java.util.Calendar.Builder builder35 = builder26.setTimeZone(timeZone31);
        boolean boolean36 = timeZone24.hasSameRules(timeZone31);
        int int37 = timeZone24.getRawOffset();
        timeZone24.setRawOffset(313);
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        boolean boolean41 = timeZone40.observesDaylightTime();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone40);
        java.util.Locale.Category category43 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTimeField dateTimeField46 = dateTimeFieldType44.getField(chronology45);
        long long48 = dateTimeField46.remainder((long) (byte) 100);
        java.lang.String str49 = dateTimeField46.getName();
        java.util.Locale locale51 = java.util.Locale.UK;
        java.lang.String str52 = locale51.getDisplayCountry();
        boolean boolean53 = locale51.hasExtensions();
        java.lang.String str54 = dateTimeField46.getAsShortText(2, locale51);
        java.lang.String str55 = locale51.getDisplayCountry();
        java.util.Locale.setDefault(category43, locale51);
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone40, locale51);
        java.util.Locale.Category category58 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale59 = java.util.Locale.getDefault(category58);
        java.lang.String str60 = locale51.getDisplayVariant(locale59);
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone24, locale51);
        calendar22.setTimeZone(timeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar57", (calendar42.compareTo(calendar57) == 0) == calendar42.equals(calendar57));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property20 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readableDuration23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime22.getZone();
        long long28 = dateTimeZone25.adjustOffset((long) 70, false);
        java.lang.String str30 = dateTimeZone25.getNameKey(1009868913348L);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = dateTime3.toDateTime(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.minus(readablePeriod33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTime();
        org.joda.time.DateTime dateTime37 = dateTime32.withMillisOfDay(78);
        org.joda.time.DateTime dateTime39 = dateTime32.minusMinutes(361);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone44 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:09:03.986", "GB", 739, 173);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone44);
        int int47 = fixedDateTimeZone44.getStandardOffset((long) 'u');
        java.lang.Object obj48 = null;
        boolean boolean49 = fixedDateTimeZone44.equals(obj48);
        org.joda.time.DateTime dateTime50 = dateTime39.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime45", (dateTime1.compareTo(dateTime45) == 0) == dateTime1.equals(dateTime45));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        long long13 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime17.minuteOfHour();
        boolean boolean26 = dateTime17.isBefore((long) 1870);
        org.joda.time.Instant instant27 = dateTime17.toInstant();
        long long28 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) instant27);
        int int29 = property10.getMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant27", (dateTime3.compareTo(instant27) == 0) == dateTime3.equals(instant27));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int7 = fixedDateTimeZone4.getOffset((long) 228);
        java.lang.String str9 = fixedDateTimeZone4.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minus(readableDuration12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withFieldAdded(durationFieldType16, 6);
        boolean boolean19 = fixedDateTimeZone4.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = fixedDateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours(4);
        int int25 = dateTime22.getEra();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime22.plus(readablePeriod26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis((-62104060800000L));
        long long30 = dateTime29.getMillis();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTime.Property property37 = dateTime34.monthOfYear();
        boolean boolean38 = dateTime29.isBefore((org.joda.time.ReadableInstant) dateTime34);
        int int39 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str42 = fixedDateTimeZone4.getName(1645513851124L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime40", (dateTime22.compareTo(dateTime40) == 0) == dateTime22.equals(dateTime40));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(140);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime16.plusYears(22);
        org.joda.time.DateTime.Property property22 = dateTime16.era();
        org.joda.time.DateTime.Property property23 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.Instant instant27 = instant25.minus((-3152796670724L));
        org.joda.time.Instant instant29 = instant25.minus((-604799880L));
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant25.plus(readableDuration30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes(10);
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime35.plus(readablePeriod39);
        org.joda.time.DateTime dateTime41 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property42 = dateTime35.minuteOfHour();
        org.joda.time.DateTime dateTime43 = property42.roundFloorCopy();
        long long44 = dateTime43.getMillis();
        org.joda.time.DateTime dateTime46 = dateTime43.minusMinutes(236);
        boolean boolean47 = instant25.isBefore((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        long long13 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime17.minuteOfHour();
        boolean boolean26 = dateTime17.isBefore((long) 1870);
        org.joda.time.Instant instant27 = dateTime17.toInstant();
        long long28 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) instant27);
        org.joda.time.DurationField durationField29 = property10.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant27", (dateTime3.compareTo(instant27) == 0) == dateTime3.equals(instant27));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime3.plusMonths(34);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType17.isSupported(chronology20);
        boolean boolean22 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime13.withChronology(chronology20);
        org.joda.time.DateTime.Property property25 = dateTime24.millisOfSecond();
        org.joda.time.DateTime dateTime27 = property25.addToCopy(548);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime24", (dateTime9.compareTo(dateTime24) == 0) == dateTime9.equals(dateTime24));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.Date date12 = calendar3.getTime();
        int int13 = calendar3.getWeekYear();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone14.observesDaylightTime();
        timeZone14.setID("");
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone14);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone14);
        calendar3.setTimeZone(timeZone14);
        calendar3.setFirstDayOfWeek(809);
        int int23 = calendar3.getWeekYear();
        calendar3.setFirstDayOfWeek(14);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar18", (calendar3.compareTo(calendar18) == 0) == calendar3.equals(calendar18));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray6 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        boolean boolean11 = charSet1.containsAll((java.util.Collection<java.lang.String>) strList7);
        int[] intArray18 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[] intArray25 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[] intArray32 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[] intArray39 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[] intArray46 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[] intArray53 = new int[] { 744, 10, 25711821, 12, 664, 17 };
        int[][] intArray54 = new int[][] { intArray18, intArray25, intArray32, intArray39, intArray46, intArray53 };
        int[][] intArray55 = charSet1.toArray(intArray54);
        org.joda.time.Instant[] instantArray56 = new org.joda.time.Instant[] {};
        org.joda.time.Instant[] instantArray57 = charSet1.toArray(instantArray56);
        int int58 = charSet1.size();
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(100L);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate(0L, dateTimeZone62);
        org.joda.time.LocalDate localDate65 = localDate63.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate(0L, dateTimeZone67);
        org.joda.time.LocalDate localDate70 = localDate68.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDate localDate72 = localDate68.plus(readablePeriod71);
        org.joda.time.LocalDate localDate73 = localDate65.withFields((org.joda.time.ReadablePartial) localDate68);
        org.joda.time.LocalDate localDate75 = localDate65.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime76 = localDate75.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology77 = dateTime76.getChronology();
        org.joda.time.DurationField durationField78 = chronology77.millis();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((java.lang.Object) dateTime60, chronology77);
        int int80 = dateTime60.getSecondOfMinute();
        org.joda.time.Instant instant82 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant83 = instant82.toInstant();
        org.joda.time.Instant instant84 = instant82.toInstant();
        org.joda.time.ReadableDuration readableDuration85 = null;
        org.joda.time.Instant instant86 = instant84.plus(readableDuration85);
        org.joda.time.Instant instant88 = instant86.plus(4471839967L);
        org.joda.time.Instant instant90 = instant88.minus((long) (byte) -1);
        org.joda.time.Instant instant93 = instant90.withDurationAdded(1645513753377L, 842);
        org.joda.time.MutableDateTime mutableDateTime94 = instant90.toMutableDateTime();
        boolean boolean95 = dateTime60.isAfter((org.joda.time.ReadableInstant) instant90);
        org.joda.time.ReadableDuration readableDuration96 = null;
        org.joda.time.Instant instant97 = instant90.minus(readableDuration96);
        boolean boolean98 = charSet1.remove((java.lang.Object) readableDuration96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant90 and mutableDateTime94", (instant90.compareTo(mutableDateTime94) == 0) == instant90.equals(mutableDateTime94));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withDurationAdded(readableDuration7, (int) (short) 10);
        org.joda.time.DateTime dateTime11 = dateTime3.plusMonths(34);
        org.joda.time.DateTime.Property property12 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime14 = property12.addToCopy(351);
        org.joda.time.Instant instant16 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime17 = instant16.toDateTime();
        org.joda.time.DateTime dateTime18 = instant16.toDateTime();
        boolean boolean19 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime17", (instant16.compareTo(dateTime17) == 0) == instant16.equals(dateTime17));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        int int4 = dateTime1.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now(dateTimeZone6);
        java.lang.String str9 = dateTimeZone6.getName((long) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours(0);
        org.joda.time.DateTime.Property property19 = dateTime16.weekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime22 = dateTime16.withPeriodAdded(readablePeriod20, (int) '4');
        int int23 = property12.getDifference((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime16.plus(readableDuration24);
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.minusWeeks((int) (byte) 1);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone34 = fixedDateTimeZone33.toTimeZone();
        int int36 = fixedDateTimeZone33.getOffset((long) 228);
        int int38 = fixedDateTimeZone33.getStandardOffset((long) 548);
        org.joda.time.DateTime dateTime39 = dateTime28.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        java.util.TimeZone timeZone40 = fixedDateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime41 = dateTime10.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime14 = dateTime5.plusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears(770);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:10:36.633+00:00:00.059", "25714150-01-01T00:00:00.000+00:00:00.495", 722, 811);
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getName((long) (byte) -1);
        java.lang.String str28 = dateTimeZone24.getID();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis(51574L);
        org.joda.time.DateTime dateTime32 = dateTime31.withEarlierOffsetAtOverlap();
        boolean boolean34 = dateTime32.isAfter((long) (short) -1);
        org.joda.time.DateTime dateTime36 = dateTime32.withMillisOfSecond(203);
        int int37 = fixedDateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime29", (dateTime3.compareTo(dateTime29) == 0) == dateTime3.equals(dateTime29));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate12.plus(readablePeriod15);
        org.joda.time.LocalDate localDate17 = localDate9.withFields((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate19 = localDate9.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime20 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology21 = localDate19.getChronology();
        int int22 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.Chronology chronology23 = localDate2.getChronology();
        int int24 = localDate2.getYearOfEra();
        org.joda.time.LocalDate localDate26 = localDate2.minusMonths(199);
        org.joda.time.DateTime dateTime27 = localDate26.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((java.lang.Object) dateTime27);
        org.joda.time.Instant instant30 = instant28.plus(1645513845990L);
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant28", (dateTime27.compareTo(instant28) == 0) == dateTime27.equals(instant28));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        int int6 = dateTime3.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.halfdayOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType8.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.secondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime7.withChronology(chronology12);
        org.joda.time.LocalTime localTime19 = dateTime7.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime18", (dateTime7.compareTo(dateTime18) == 0) == dateTime7.equals(dateTime18));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.yearOfEra();
        org.joda.time.DurationField durationField8 = chronology3.weekyears();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.DurationField durationField10 = chronology3.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime9", (dateTime2.compareTo(dateTime9) == 0) == dateTime2.equals(dateTime9));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(140);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime16.plusYears(22);
        org.joda.time.DateTime.Property property22 = dateTime16.era();
        org.joda.time.DateTime.Property property23 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone30 = new org.joda.time.tz.FixedDateTimeZone("Japan", "DateTimeField[millisOfDay]", 2026, 500);
        int int32 = fixedDateTimeZone30.getStandardOffset((long) 348);
        java.lang.String str34 = fixedDateTimeZone30.getShortName(1645513772727L);
        java.util.TimeZone timeZone35 = fixedDateTimeZone30.toTimeZone();
        org.joda.time.DateTime dateTime36 = dateTime24.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone30);
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now((org.joda.time.DateTimeZone) fixedDateTimeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and instant25", (dateTime24.compareTo(instant25) == 0) == dateTime24.equals(instant25));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.Object[] objArray3 = charSet2.toArray();
        java.lang.Object[] objArray4 = charSet2.toArray();
        java.util.Iterator<java.lang.Character> charItor5 = charSet2.iterator();
        charSet2.clear();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(10);
        int int13 = dateTime10.getWeekOfWeekyear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = dateTimeField17.getType();
        boolean boolean19 = charSet2.remove((java.lang.Object) dateTimeField17);
        java.util.TimeZone timeZone21 = java.util.TimeZone.getTimeZone("\u4e2d\u56fd\u8a9e\u53f0\u6e7e)");
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = dateTimeField24.getAsText((long) (byte) -1, locale26);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("United Kingdom");
        java.lang.String str30 = locale26.getDisplayCountry(locale29);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone21, locale29);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean33 = charSet2.contains((java.lang.Object) timeZone21);
        java.util.Locale locale34 = java.util.Locale.UK;
        java.lang.String str35 = locale34.getDisplayCountry();
        boolean boolean36 = locale34.hasExtensions();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale34);
        calendar37.setLenient(false);
        calendar37.setLenient(true);
        int int43 = calendar37.getLeastMaximum(1);
        calendar37.setMinimalDaysInFirstWeek(0);
        java.util.Date date46 = calendar37.getTime();
        int int47 = calendar37.getWeekYear();
        java.util.TimeZone timeZone48 = java.util.TimeZone.getDefault();
        boolean boolean49 = timeZone48.observesDaylightTime();
        timeZone48.setID("");
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(timeZone48);
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone48);
        calendar37.setTimeZone(timeZone48);
        calendar37.setFirstDayOfWeek(809);
        int int57 = calendar37.getWeekYear();
        boolean boolean58 = charSet2.contains((java.lang.Object) int57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar31 and calendar37", (calendar31.compareTo(calendar37) == 0) == calendar31.equals(calendar37));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withPeriodAdded(readablePeriod7, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime3);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(54);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        int[] intArray15 = localDateTime14.getValues();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plus(readablePeriod16);
        org.joda.time.DurationFieldType durationFieldType18 = null;
        boolean boolean19 = localDateTime17.isSupported(durationFieldType18);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone25 = fixedDateTimeZone24.toTimeZone();
        int int27 = fixedDateTimeZone24.getOffset((long) 228);
        int int29 = fixedDateTimeZone24.getOffset((long) 780);
        org.joda.time.DateTime dateTime30 = localDateTime17.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond(384);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime34 = localDateTime33.toDateTime();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime37 = dateTime34.withFieldAdded(durationFieldType35, (int) 'a');
        org.joda.time.DateTime.Property property38 = dateTime37.secondOfMinute();
        org.joda.time.DateTime dateTime39 = property38.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime41 = property38.addToCopy(59);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes((int) 'x');
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime45 = localDateTime44.toDateTime();
        org.joda.time.Chronology chronology46 = localDateTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.era();
        org.joda.time.DateTime dateTime49 = dateTime43.toDateTime(chronology46);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.withDurationAdded(readableDuration50, 930);
        boolean boolean53 = dateTime32.equals((java.lang.Object) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime52", (dateTime43.compareTo(dateTime52) == 0) == dateTime43.equals(dateTime52));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        java.lang.Object obj0 = null;
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone5 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone6 = fixedDateTimeZone5.toTimeZone();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZone(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfSecond();
        int int16 = fixedDateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime14);
        long long18 = fixedDateTimeZone5.previousTransition((long) '#');
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(4);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((-1));
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime22.getZone();
        long long27 = fixedDateTimeZone5.getMillisKeepLocal(dateTimeZone25, 0L);
        long long29 = fixedDateTimeZone5.convertUTCToLocal((long) 78);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone5);
        org.joda.time.Chronology chronology31 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj0, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.year();
        org.joda.time.DateTime dateTime34 = property33.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime32", (dateTime8.compareTo(dateTime32) == 0) == dateTime8.equals(dateTime32));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long4 = dateTimeField2.remainder((long) (byte) 100);
        java.lang.String str5 = dateTimeField2.getName();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale7.getDisplayCountry();
        boolean boolean9 = locale7.hasExtensions();
        java.lang.String str10 = dateTimeField2.getAsShortText(2, locale7);
        java.lang.String str11 = locale7.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet12 = locale7.getExtensionKeys();
        java.util.Set<java.lang.String> strSet13 = java.util.Calendar.getAvailableCalendarTypes();
        boolean boolean14 = charSet12.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet16 = locale15.getExtensionKeys();
        org.joda.time.tz.Provider provider17 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet18 = provider17.getAvailableIDs();
        boolean boolean19 = charSet16.retainAll((java.util.Collection<java.lang.String>) strSet18);
        boolean boolean20 = charSet12.retainAll((java.util.Collection<java.lang.String>) strSet18);
        java.lang.String[] strArray22 = java.util.TimeZone.getAvailableIDs(2119);
        boolean boolean23 = charSet12.remove((java.lang.Object) strArray22);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(10);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime27.plus(readablePeriod31);
        org.joda.time.DateTime dateTime33 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property34 = dateTime27.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.Chronology chronology37 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.secondOfMinute();
        org.joda.time.DurationField durationField39 = chronology37.years();
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology37);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours(315);
        org.joda.time.DateTime dateTime43 = dateTime40.toDateTime(dateTimeZone42);
        boolean boolean44 = charSet12.equals((java.lang.Object) dateTime40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime43", (dateTime27.compareTo(dateTime43) == 0) == dateTime27.equals(dateTime43));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:09:03.986", "GB", 739, 173);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        boolean boolean11 = dateTimeFieldType7.isSupported(chronology10);
        long long15 = chronology10.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField17 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.era();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        boolean boolean27 = dateTime22.equals((java.lang.Object) durationFieldType26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.property(dateTimeFieldType35);
        int int39 = localDateTime34.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        long long44 = dateTimeField42.remainder((long) (byte) 100);
        java.lang.String str45 = dateTimeField42.getName();
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        int int47 = dateTimeField42.getMaximumShortTextLength(locale46);
        java.lang.String str48 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale46);
        org.joda.time.Chronology chronology49 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField50 = durationFieldType26.getField(chronology49);
        boolean boolean51 = localDateTime19.equals((java.lang.Object) chronology49);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology49.add(readablePeriod52, (long) 441, 45);
        org.joda.time.DateTimeField dateTimeField56 = chronology49.clockhourOfHalfday();
        org.joda.time.DateTime dateTime57 = dateTime5.toDateTime(chronology49);
        org.joda.time.DateTime dateTime59 = dateTime5.minusMinutes(909);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime57", (dateTime9.compareTo(dateTime57) == 0) == dateTime9.equals(dateTime57));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((-1));
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime3.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(4);
        org.joda.time.DateTime dateTime13 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.plusMinutes(32770);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis(10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withFieldAdded(durationFieldType26, 6);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = durationFieldType26.getField(chronology31);
        org.joda.time.DurationField durationField35 = chronology31.days();
        boolean boolean36 = localDateTime18.equals((java.lang.Object) chronology31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime3.toMutableDateTime(chronology31);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime37", (dateTime3.compareTo(mutableDateTime37) == 0) == dateTime3.equals(mutableDateTime37));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int6 = timeZone5.getRawOffset();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone5);
        java.util.Locale locale8 = java.util.Locale.UK;
        java.lang.String str9 = locale8.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet10 = locale8.getExtensionKeys();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        java.lang.String str13 = locale8.getDisplayLanguage(locale11);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone5, locale8);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("50");
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone16);
        calendar14.setTimeZone(timeZone16);
        int int19 = timeZone16.getRawOffset();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar14", (calendar7.compareTo(calendar14) == 0) == calendar7.equals(calendar14));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.Chronology chronology4 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.yearOfEra();
        org.joda.time.DurationField durationField9 = chronology4.halfdays();
        org.joda.time.DurationField durationField10 = chronology4.weeks();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(4471854845L, chronology4);
        org.joda.time.DateTimeField dateTimeField12 = chronology4.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plus(readableDuration15);
        java.util.Locale locale17 = java.util.Locale.UK;
        java.lang.String str18 = locale17.getDisplayCountry();
        boolean boolean19 = locale17.hasExtensions();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale17);
        calendar20.setLenient(false);
        long long23 = calendar20.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.fromCalendarFields(calendar20);
        int int25 = localDateTime24.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withCenturyOfEra(913);
        int int28 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours(0);
        org.joda.time.DateTime.Property property35 = dateTime32.weekyear();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.DateTime dateTime38 = dateTime32.withPeriodAdded(readablePeriod36, (int) '4');
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime32);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks(54);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime24.withFields((org.joda.time.ReadablePartial) localDateTime41);
        org.joda.time.LocalDateTime.Property property43 = localDateTime24.era();
        int int44 = localDateTime24.getYear();
        int int45 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime24);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone50 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone51 = fixedDateTimeZone50.toTimeZone();
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.DateTime dateTime55 = dateTime53.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime57 = dateTime55.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = dateTime55.withZone(dateTimeZone58);
        org.joda.time.DateTime.Property property60 = dateTime59.millisOfSecond();
        int int61 = fixedDateTimeZone50.getOffset((org.joda.time.ReadableInstant) dateTime59);
        int int63 = fixedDateTimeZone50.getOffset((long) (byte) 1);
        long long65 = fixedDateTimeZone50.previousTransition((long) 8);
        java.util.Date date67 = new java.util.Date((long) (byte) 1);
        int int68 = date67.getSeconds();
        java.time.Instant instant69 = date67.toInstant();
        boolean boolean70 = fixedDateTimeZone50.equals((java.lang.Object) instant69);
        java.lang.String str72 = fixedDateTimeZone50.getNameKey((long) 259);
        int int74 = fixedDateTimeZone50.getStandardOffset(2022L);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone50);
        org.joda.time.DateTime dateTime76 = localDateTime24.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone50);
        org.joda.time.Chronology chronology77 = chronology4.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone50);
        org.joda.time.DurationField durationField78 = chronology77.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField78, durationField9, and durationField10", !(durationField78.compareTo(durationField9) == 0) || (Math.signum(durationField78.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property10.addToCopy((long) 6);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.secondOfMinute();
        org.joda.time.DurationField durationField18 = chronology16.years();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.year();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 9, chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.year();
        org.joda.time.DateTime dateTime22 = dateTime12.toDateTime(chronology16);
        org.joda.time.DateTime.Property property23 = dateTime22.weekOfWeekyear();
        java.util.Locale locale24 = java.util.Locale.UK;
        java.lang.String str25 = locale24.getDisplayCountry();
        boolean boolean26 = locale24.hasExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale24);
        calendar27.setLenient(false);
        long long30 = calendar27.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.fromCalendarFields(calendar27);
        int int32 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withCenturyOfEra(913);
        org.joda.time.DateTimeField dateTimeField36 = localDateTime31.getField((int) (byte) 0);
        int int37 = dateTime22.get(dateTimeField36);
        int int39 = dateTimeField36.get((long) 1097);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime22", (dateTime12.compareTo(dateTime22) == 0) == dateTime12.equals(dateTime22));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        java.lang.String str7 = localDateTime1.toString();
        org.joda.time.Instant instant9 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.DateTime dateTime11 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withPeriodAdded(readablePeriod12, 39599999);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime10.withDurationAdded(readableDuration15, 25924107);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime17", (instant9.compareTo(dateTime17) == 0) == instant9.equals(dateTime17));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        int int9 = dateTime7.getHourOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.plusMinutes(0);
        org.joda.time.DateTime dateTime13 = dateTime7.plusYears(816);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.plus(readablePeriod22);
        org.joda.time.DateTime dateTime24 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property25 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readableDuration28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.Chronology chronology33 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType30.getField(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.weekyear();
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) readableDuration28, chronology33);
        org.joda.time.DateTimeZone dateTimeZone38 = chronology33.getZone();
        org.joda.time.DateTimeField dateTimeField39 = chronology33.yearOfEra();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 991, chronology33);
        org.joda.time.DateTimeField dateTimeField41 = chronology33.secondOfDay();
        org.joda.time.DurationField durationField42 = chronology33.hours();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology33.getZone();
        org.joda.time.DateTime dateTime44 = dateTime7.toDateTime(dateTimeZone43);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone49 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone50 = fixedDateTimeZone49.toTimeZone();
        int int52 = fixedDateTimeZone49.getStandardOffset((long) 10);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone58 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone59 = fixedDateTimeZone58.toTimeZone();
        int int61 = fixedDateTimeZone58.getOffset((long) 228);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime((long) 'a', (org.joda.time.DateTimeZone) fixedDateTimeZone58);
        java.util.TimeZone timeZone63 = fixedDateTimeZone58.toTimeZone();
        long long65 = fixedDateTimeZone49.getMillisKeepLocal((org.joda.time.DateTimeZone) fixedDateTimeZone58, (long) 558);
        boolean boolean67 = fixedDateTimeZone49.isStandardOffset((long) 233);
        org.joda.time.DateTime dateTime68 = dateTime7.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime44", (dateTime7.compareTo(dateTime44) == 0) == dateTime7.equals(dateTime44));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        long long13 = property10.remainder();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.plus(readablePeriod21);
        org.joda.time.DateTime dateTime23 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property24 = dateTime17.minuteOfHour();
        boolean boolean26 = dateTime17.isBefore((long) 1870);
        org.joda.time.Instant instant27 = dateTime17.toInstant();
        long long28 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) instant27);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.plusHours(4);
        org.joda.time.DateTime dateTime34 = dateTime32.minusHours(1970);
        org.joda.time.Instant instant35 = dateTime32.toInstant();
        boolean boolean36 = instant27.isBefore((org.joda.time.ReadableInstant) instant35);
        org.joda.time.Instant instant38 = instant27.minus((long) 2010);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and instant35", (dateTime32.compareTo(instant35) == 0) == dateTime32.equals(instant35));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.plusMinutes(32770);
        org.joda.time.Chronology chronology9 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.months();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        int int22 = fixedDateTimeZone19.getOffset((long) 228);
        int int24 = fixedDateTimeZone19.getStandardOffset((long) 548);
        java.lang.String str26 = fixedDateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        org.joda.time.DateTime.Property property28 = dateTime14.dayOfWeek();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime30 = property28.withMaximumValue();
        org.joda.time.DateTime dateTime32 = dateTime30.minusMillis(117);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime27", (dateTime3.compareTo(dateTime27) == 0) == dateTime3.equals(dateTime27));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate14 = localDate4.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = localDate14.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone22 = fixedDateTimeZone21.toTimeZone();
        int int24 = fixedDateTimeZone21.getOffset((long) 228);
        boolean boolean25 = fixedDateTimeZone21.isFixed();
        java.lang.String str27 = fixedDateTimeZone21.getNameKey((long) 348);
        org.joda.time.DateTime dateTime28 = localDate14.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        int int30 = fixedDateTimeZone21.getStandardOffset((long) 961);
        int int32 = fixedDateTimeZone21.getOffset((-124235185760092L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime28", (dateTime15.compareTo(dateTime28) == 0) == dateTime15.equals(dateTime28));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        long long4 = instant1.getMillis();
        org.joda.time.Instant instant6 = instant1.plus(1645513788734L);
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.DateTime dateTime8 = instant1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.String str11 = dateTimeFieldType10.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(0L, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(0L, dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate19.plus(readablePeriod22);
        org.joda.time.LocalDate localDate24 = localDate16.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = localDate24.getFieldTypes();
        java.lang.String str26 = localDate24.toString();
        org.joda.time.Chronology chronology27 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.weekyearOfCentury();
        boolean boolean29 = dateTimeFieldType10.isSupported(chronology27);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 674, chronology27);
        boolean boolean31 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime.Property property32 = dateTime8.secondOfMinute();
        org.joda.time.DateTime dateTime33 = property32.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime33", (instant1.compareTo(dateTime33) == 0) == instant1.equals(dateTime33));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0);
        java.util.Locale.Category category3 = java.util.Locale.Category.DISPLAY;
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        long long8 = dateTimeField6.remainder((long) (byte) 100);
        java.lang.String str9 = dateTimeField6.getName();
        java.util.Locale locale11 = java.util.Locale.UK;
        java.lang.String str12 = locale11.getDisplayCountry();
        boolean boolean13 = locale11.hasExtensions();
        java.lang.String str14 = dateTimeField6.getAsShortText(2, locale11);
        java.lang.String str15 = locale11.getDisplayCountry();
        java.util.Locale.setDefault(category3, locale11);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone0, locale11);
        java.util.TimeZone.setDefault(timeZone0);
        int int20 = timeZone0.getOffset((long) 26243853);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar17", (calendar2.compareTo(calendar17) == 0) == calendar2.equals(calendar17));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology3 = null;
        boolean boolean4 = durationFieldType2.isSupported(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withFieldAdded(durationFieldType2, 59);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay((int) (byte) 100);
        org.joda.time.Instant instant10 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant11 = instant10.toInstant();
        org.joda.time.Instant instant12 = instant10.toInstant();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.joda.time.DateTime dateTime15 = instant12.toDateTime();
        org.joda.time.DateTime dateTime16 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.minusMinutes(498);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime15", (instant10.compareTo(dateTime15) == 0) == instant10.equals(dateTime15));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy(59);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMinutes((int) 'x');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.era();
        org.joda.time.DateTime dateTime16 = dateTime10.toDateTime(chronology13);
        org.joda.time.DateTime dateTime18 = dateTime10.plusDays(0);
        org.joda.time.DateTime dateTime20 = dateTime18.plus((long) 672);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime16", (dateTime18.compareTo(dateTime16) == 0) == dateTime18.equals(dateTime16));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime3 = instant1.toDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded(13305600000L, (-292275054));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        long long17 = fixedDateTimeZone4.previousTransition((long) '#');
        long long19 = fixedDateTimeZone4.nextTransition(1645513711304L);
        long long21 = fixedDateTimeZone4.previousTransition((long) 4);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes(10);
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime30 = dateTime25.plusYears(22);
        org.joda.time.DateTime dateTime31 = dateTime25.withTimeAtStartOfDay();
        int int32 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Instant instant33 = dateTime31.toInstant();
        long long34 = instant33.getMillis();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant33.plus(readableDuration35);
        org.joda.time.Instant instant37 = instant36.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant37", (dateTime31.compareTo(instant37) == 0) == dateTime31.equals(instant37));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType5.getField(chronology8);
        boolean boolean11 = localDateTime0.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType5.getField(chronology14);
        org.joda.time.DurationField durationField17 = chronology14.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        int int19 = localDateTime18.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology21 = null;
        boolean boolean22 = durationFieldType20.isSupported(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withFieldAdded(durationFieldType20, 59);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(0);
        org.joda.time.DateTime dateTime31 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime18.minus(readablePeriod32);
        long long35 = chronology14.set((org.joda.time.ReadablePartial) localDateTime18, (long) 38);
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField37 = chronology14.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime36", (dateTime7.compareTo(dateTime36) == 0) == dateTime7.equals(dateTime36));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.property(dateTimeFieldType7);
        int int11 = localDateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        long long16 = dateTimeField14.remainder((long) (byte) 100);
        java.lang.String str17 = dateTimeField14.getName();
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        int int19 = dateTimeField14.getMaximumShortTextLength(locale18);
        java.lang.String str20 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDateTime6, locale18);
        org.joda.time.Chronology chronology21 = localDateTime6.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.Chronology chronology23 = chronology21.withUTC();
        org.joda.time.DurationField durationField24 = chronology21.halfdays();
        long long28 = chronology21.add((long) 440, (long) 828, 100);
        org.joda.time.DurationField durationField29 = chronology21.eras();
        org.joda.time.DurationField durationField30 = chronology21.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField24 and durationField29", Math.signum(durationField24.compareTo(durationField29)) == -Math.signum(durationField29.compareTo(durationField24)));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0L, dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDate localDate12 = localDate8.plus(readablePeriod11);
        org.joda.time.LocalDate localDate13 = localDate5.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate15 = localDate5.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime16 = localDate15.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 0, chronology17);
        org.joda.time.DurationField durationField19 = chronology17.weekyears();
        org.joda.time.DurationField durationField20 = chronology17.weeks();
        org.joda.time.DurationField durationField21 = chronology17.seconds();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.clockhourOfHalfday();
        long long26 = chronology17.add((long) 943, 1645513711304L, 363);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.year();
        org.joda.time.DurationField durationField28 = chronology17.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField19, and durationField20", !(durationField28.compareTo(durationField19) == 0) || (Math.signum(durationField28.compareTo(durationField20)) == Math.signum(durationField19.compareTo(durationField20))));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(4);
        org.joda.time.DateTime dateTime6 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        int int7 = dateTime3.getWeekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime3.minusHours(60);
        org.joda.time.Instant instant12 = new org.joda.time.Instant((long) (-1));
        boolean boolean13 = dateTime3.isAfter((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime14 = instant12.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant12.minus(readableDuration16);
        org.joda.time.MutableDateTime mutableDateTime18 = instant12.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant12", (dateTime14.compareTo(instant12) == 0) == dateTime14.equals(instant12));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime.Property property8 = dateTime5.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.withPeriodAdded(readablePeriod9, (int) '4');
        int int12 = property1.getDifference((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime5.plus(readableDuration13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime5.minus(readablePeriod15);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfMinute();
        java.util.Locale locale20 = new java.util.Locale("2022-02-22T07:10:26.657Z", "0");
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale21.getDisplayName();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        java.util.Set<java.lang.String> strSet24 = locale20.getUnicodeLocaleKeys();
        boolean boolean25 = dateTime16.equals((java.lang.Object) locale20);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.dayOfWeek();
        org.joda.time.DateTime dateTime31 = dateTime16.withChronology(chronology28);
        org.joda.time.DateTimeField dateTimeField32 = chronology28.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime31", (dateTime5.compareTo(dateTime31) == 0) == dateTime5.equals(dateTime31));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 386);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.Instant instant6 = instant1.withDurationAdded((long) 534, 25844657);
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime3.plusYears(22);
        org.joda.time.DateTime.Property property9 = dateTime3.era();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone14 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone15 = fixedDateTimeZone14.toTimeZone();
        int int17 = fixedDateTimeZone14.getStandardOffset((long) 10);
        org.joda.time.DateTime dateTime18 = dateTime3.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone14);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone25 = fixedDateTimeZone24.toTimeZone();
        int int27 = fixedDateTimeZone24.getOffset((long) 228);
        java.lang.String str29 = fixedDateTimeZone24.getShortName((long) 2);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withFieldAdded(durationFieldType36, 6);
        boolean boolean39 = fixedDateTimeZone24.isLocalDateTimeGap(localDateTime38);
        long long41 = fixedDateTimeZone24.previousTransition((long) 500);
        int int43 = fixedDateTimeZone24.getOffset(83L);
        long long46 = fixedDateTimeZone24.adjustOffset((long) 115, false);
        java.util.TimeZone timeZone47 = fixedDateTimeZone24.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime18.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant19", (dateTime3.compareTo(instant19) == 0) == dateTime3.equals(instant19));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(3);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeFormatter9.getZone();
        org.joda.time.Chronology chronology11 = dateTimeFormatter9.getChronolgy();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTime.Property property18 = dateTime15.weekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withPeriodAdded(readablePeriod19, (int) '4');
        java.lang.String str22 = dateTime15.toString();
        org.joda.time.Chronology chronology23 = dateTime15.getChronology();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter9.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = dateTimeFormatter26.getPrinter();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone33 = fixedDateTimeZone32.toTimeZone();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZone(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfSecond();
        int int43 = fixedDateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime41);
        long long45 = fixedDateTimeZone32.previousTransition((long) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter26.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 567, (org.joda.time.DateTimeZone) fixedDateTimeZone32);
        org.joda.time.DateTime dateTime48 = dateTime1.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("UTC");
        java.util.Calendar calendar51 = dateTime1.toCalendar(locale50);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(locale50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime48", (dateTime1.compareTo(dateTime48) == 0) == dateTime1.equals(dateTime48));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        int int7 = fixedDateTimeZone4.getStandardOffset((long) 10);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(0);
        org.joda.time.DateTime.Property property15 = dateTime12.weekyear();
        long long16 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(0);
        org.joda.time.DateTime.Property property23 = dateTime20.monthOfYear();
        int int24 = property23.getMaximumValue();
        org.joda.time.DateTime dateTime25 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime27 = dateTime25.plus((long) 3);
        int int28 = property15.getDifference((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone33 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone34 = fixedDateTimeZone33.toTimeZone();
        int int36 = fixedDateTimeZone33.getOffset((long) 228);
        boolean boolean37 = fixedDateTimeZone33.isFixed();
        org.joda.time.DateTime dateTime38 = dateTime27.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone33);
        java.util.Locale locale40 = java.util.Locale.ITALIAN;
        java.lang.String str41 = fixedDateTimeZone33.getName((long) 671, locale40);
        java.lang.String str42 = fixedDateTimeZone4.getShortName(1645513749955L, locale40);
        java.util.TimeZone timeZone43 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime38", (dateTime27.compareTo(dateTime38) == 0) == dateTime27.equals(dateTime38));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("2022-02-22T07:09:03.986", "GB", 739, 173);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        boolean boolean6 = dateTime5.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        boolean boolean11 = dateTimeFieldType7.isSupported(chronology10);
        long long15 = chronology10.add((long) 184, 0L, 0);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfWeek();
        org.joda.time.DurationField durationField17 = chronology10.days();
        org.joda.time.DateTimeField dateTimeField18 = chronology10.era();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.seconds();
        boolean boolean27 = dateTime22.equals((java.lang.Object) durationFieldType26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType35.getField(chronology36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime34.property(dateTimeFieldType35);
        int int39 = localDateTime34.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType40.getField(chronology41);
        long long44 = dateTimeField42.remainder((long) (byte) 100);
        java.lang.String str45 = dateTimeField42.getName();
        java.util.Locale locale46 = java.util.Locale.TRADITIONAL_CHINESE;
        int int47 = dateTimeField42.getMaximumShortTextLength(locale46);
        java.lang.String str48 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale46);
        org.joda.time.Chronology chronology49 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField50 = durationFieldType26.getField(chronology49);
        boolean boolean51 = localDateTime19.equals((java.lang.Object) chronology49);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology49.add(readablePeriod52, (long) 441, 45);
        org.joda.time.DateTimeField dateTimeField56 = chronology49.clockhourOfHalfday();
        org.joda.time.DateTime dateTime57 = dateTime5.toDateTime(chronology49);
        java.lang.String str58 = dateTime5.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime57", (dateTime9.compareTo(dateTime57) == 0) == dateTime9.equals(dateTime57));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-22T07:09:43.213+00:00:00.059");
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTime();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMinutes(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.plus(readablePeriod10);
        org.joda.time.DateTime dateTime12 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime6.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property13.addWrapFieldToCopy(0);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.DateTime.Property property17 = dateTime15.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.secondOfMinute();
        org.joda.time.DurationField durationField22 = chronology20.years();
        java.lang.String str23 = chronology20.toString();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.weekOfWeekyear();
        org.joda.time.DateTime dateTime26 = dateTime15.toDateTime(chronology20);
        boolean boolean27 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) '#');
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        java.lang.String str32 = dateTimeZone29.getName((long) (byte) -1);
        java.lang.String str33 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis(51574L);
        org.joda.time.DateTime dateTime37 = dateTime36.withEarlierOffsetAtOverlap();
        boolean boolean38 = dateTime26.isAfter((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime34", (dateTime4.compareTo(dateTime34) == 0) == dateTime4.equals(dateTime34));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTime.Property property7 = dateTime4.monthOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.DateTime dateTime9 = property7.roundHalfCeilingCopy();
        int int10 = dateTime9.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(10);
        int int17 = dateTime14.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime19 = dateTime14.minusSeconds(0);
        boolean boolean20 = dateTime9.equals((java.lang.Object) dateTime19);
        org.joda.time.DateTime dateTime21 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str29 = fixedDateTimeZone26.getName(1009868913348L, locale28);
        java.util.TimeZone timeZone30 = fixedDateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        long long33 = fixedDateTimeZone26.nextTransition((long) 125);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 190, (org.joda.time.DateTimeZone) fixedDateTimeZone26);
        java.util.TimeZone timeZone35 = fixedDateTimeZone26.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime31", (dateTime14.compareTo(dateTime31) == 0) == dateTime14.equals(dateTime31));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withTime((int) (short) 0, (int) ' ', 12, 374);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.year();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.plusMillis(683);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(992);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMonths(2024);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.withMaximumValue();
        org.joda.time.Instant instant18 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.joda.time.Instant instant20 = instant18.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = instant24.toDateTimeISO();
        org.joda.time.DateTime dateTime27 = dateTime25.minusMillis(860);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.minus(readablePeriod28);
        org.joda.time.DateTime dateTime30 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime25", (instant18.compareTo(dateTime25) == 0) == instant18.equals(dateTime25));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        java.util.Set<java.lang.Character> charSet2 = locale0.getExtensionKeys();
        java.lang.Object[] objArray3 = charSet2.toArray();
        java.lang.Object[] objArray4 = charSet2.toArray();
        java.util.Iterator<java.lang.Character> charItor5 = charSet2.iterator();
        charSet2.clear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(0L, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(0L, dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate14.plus(readablePeriod17);
        org.joda.time.LocalDate localDate19 = localDate11.withFields((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate21 = localDate11.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime22 = localDate21.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology23 = localDate21.getChronology();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone28 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone29 = fixedDateTimeZone28.toTimeZone();
        int int31 = fixedDateTimeZone28.getOffset((long) 228);
        boolean boolean32 = fixedDateTimeZone28.isFixed();
        java.lang.String str34 = fixedDateTimeZone28.getNameKey((long) 348);
        org.joda.time.DateTime dateTime35 = localDate21.toDateTimeAtCurrentTime((org.joda.time.DateTimeZone) fixedDateTimeZone28);
        int int37 = fixedDateTimeZone28.getStandardOffset((long) 31);
        int int39 = fixedDateTimeZone28.getOffsetFromLocal(1L);
        boolean boolean40 = charSet2.remove((java.lang.Object) fixedDateTimeZone28);
        java.util.TimeZone timeZone41 = fixedDateTimeZone28.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime35", (dateTime22.compareTo(dateTime35) == 0) == dateTime22.equals(dateTime35));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime6 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(26010);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime14 = dateTime12.plusMinutes(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        int int19 = dateTime16.getYear();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.minus(readableDuration22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusMinutes(548);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withFieldAdded(durationFieldType26, 6);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.centuryOfEra();
        org.joda.time.DurationField durationField34 = durationFieldType26.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = chronology31.minuteOfHour();
        org.joda.time.DateTime dateTime36 = dateTime16.toDateTime(chronology31);
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime8.toMutableDateTime(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime36", (dateTime16.compareTo(dateTime36) == 0) == dateTime16.equals(dateTime36));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfSecond();
        int int15 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) dateTime13);
        int int17 = fixedDateTimeZone4.getOffset((long) (byte) 1);
        java.lang.String str19 = fixedDateTimeZone4.getNameKey((-61472908799900L));
        org.joda.time.DateTimeZone.setDefault((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.lang.String str22 = fixedDateTimeZone4.getShortName((long) 870);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int25 = fixedDateTimeZone4.getOffsetFromLocal(35L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime23", (dateTime7.compareTo(dateTime23) == 0) == dateTime7.equals(dateTime23));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.halfdayOfDay();
        org.joda.time.DurationField durationField4 = chronology2.seconds();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime5", (dateTime1.compareTo(dateTime5) == 0) == dateTime1.equals(dateTime5));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.lang.String str1 = locale0.getDisplayCountry();
        boolean boolean2 = locale0.hasExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        calendar3.setLenient(false);
        calendar3.setLenient(true);
        int int9 = calendar3.getLeastMaximum(1);
        calendar3.setMinimalDaysInFirstWeek(0);
        java.util.Date date12 = calendar3.getTime();
        int int13 = calendar3.getWeekYear();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        boolean boolean15 = timeZone14.observesDaylightTime();
        timeZone14.setID("");
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone14);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(timeZone14);
        calendar3.setTimeZone(timeZone14);
        calendar3.setFirstDayOfWeek(809);
        int int23 = calendar3.getWeekYear();
        calendar3.setFirstDayOfWeek(14);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        int int27 = localDate26.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar18", (calendar3.compareTo(calendar18) == 0) == calendar3.equals(calendar18));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        int int2 = dateTime1.getYearOfEra();
        java.lang.String str3 = dateTime1.toString();
        java.util.GregorianCalendar gregorianCalendar4 = dateTime1.toGregorianCalendar();
        org.joda.time.DateTime dateTime6 = dateTime1.plusYears(735);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusMinutes(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime14 = property13.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.property(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        boolean boolean25 = localDateTime18.equals((java.lang.Object) property24);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime31 = dateTime29.plusHours(0);
        org.joda.time.DateTime.Property property32 = dateTime29.monthOfYear();
        int int33 = property32.getMaximumValue();
        org.joda.time.DateTimeField dateTimeField34 = property32.getField();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str36 = property32.getAsShortText(locale35);
        int int37 = property24.getMaximumTextLength(locale35);
        java.util.Calendar calendar38 = dateTime14.toCalendar(locale35);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes(10);
        org.joda.time.DateTime.Property property45 = dateTime42.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime42.plus(readablePeriod46);
        org.joda.time.DateTime dateTime48 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property49 = dateTime42.minuteOfHour();
        org.joda.time.DateTime dateTime51 = dateTime42.plusMonths(25711821);
        boolean boolean52 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime51);
        java.util.Locale locale53 = java.util.Locale.UK;
        java.lang.String str54 = locale53.getDisplayCountry();
        boolean boolean55 = locale53.hasExtensions();
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(locale53);
        calendar56.setLenient(false);
        long long59 = calendar56.getTimeInMillis();
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.fromCalendarFields(calendar56);
        int int61 = localDateTime60.getMillisOfSecond();
        int int62 = localDateTime60.size();
        int int63 = localDateTime60.getDayOfWeek();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone68 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone69 = fixedDateTimeZone68.toTimeZone();
        org.joda.time.LocalDateTime localDateTime70 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime71 = localDateTime70.toDateTime();
        org.joda.time.DateTime dateTime73 = dateTime71.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime75 = dateTime73.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.DateTime dateTime77 = dateTime73.withZone(dateTimeZone76);
        org.joda.time.DateTime.Property property78 = dateTime77.millisOfSecond();
        int int79 = fixedDateTimeZone68.getOffset((org.joda.time.ReadableInstant) dateTime77);
        int int81 = fixedDateTimeZone68.getOffset((long) (byte) 1);
        long long83 = fixedDateTimeZone68.previousTransition((long) 8);
        boolean boolean84 = fixedDateTimeZone68.isFixed();
        org.joda.time.DateTime dateTime85 = localDateTime60.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        long long88 = fixedDateTimeZone68.adjustOffset(1645513806892L, true);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        org.joda.time.DateTime dateTime90 = dateTime51.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        int int92 = fixedDateTimeZone68.getOffset((long) 655);
        org.joda.time.DateTime dateTime93 = dateTime1.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar4 and calendar56", (gregorianCalendar4.compareTo(calendar56) == 0) == gregorianCalendar4.equals(calendar56));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.seconds();
        boolean boolean6 = dateTime1.equals((java.lang.Object) durationFieldType5);
        int int7 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime1.withYearOfEra(70);
        org.joda.time.DateTime.Property property10 = dateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.halfdayOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) dateTime1, chronology14);
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType20.getField(chronology21);
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = dateTimeField22.getAsText(659, locale24);
        java.lang.String str26 = property19.getAsText(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime18", (dateTime1.compareTo(dateTime18) == 0) == dateTime1.equals(dateTime18));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readableDuration13);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone19 = new org.joda.time.tz.FixedDateTimeZone("1970-01-01T00:00:00.000Z", "1970-01-01T00:00:00.000Z", 59, (int) (short) 1);
        java.util.TimeZone timeZone20 = fixedDateTimeZone19.toTimeZone();
        int int22 = fixedDateTimeZone19.getOffset((long) 228);
        int int24 = fixedDateTimeZone19.getStandardOffset((long) 548);
        java.lang.String str26 = fixedDateTimeZone19.getNameKey(0L);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone19);
        org.joda.time.Instant instant29 = org.joda.time.Instant.parse("2");
        org.joda.time.Instant instant31 = instant29.minus((long) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime32 = instant29.toMutableDateTime();
        boolean boolean33 = dateTime27.isEqual((org.joda.time.ReadableInstant) instant29);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime39 = dateTime37.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = dateTime37.withZone(dateTimeZone40);
        org.joda.time.DateTime.Property property42 = dateTime41.millisOfSecond();
        org.joda.time.DateTime.Property property43 = dateTime41.millisOfDay();
        int int44 = dateTime41.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property45 = dateTime41.yearOfCentury();
        org.joda.time.DateTime dateTime47 = dateTime41.plusWeeks(753);
        boolean boolean48 = instant29.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime.Property property49 = dateTime41.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and mutableDateTime32", (instant29.compareTo(mutableDateTime32) == 0) == instant29.equals(mutableDateTime32));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfHour();
        boolean boolean12 = dateTime3.isBefore((long) 1870);
        org.joda.time.Instant instant13 = dateTime3.toInstant();
        long long14 = instant13.getMillis();
        org.joda.time.Instant instant16 = instant13.minus(1645513820399L);
        org.joda.time.DateTime dateTime17 = instant13.toDateTimeISO();
        org.joda.time.Chronology chronology18 = instant13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, (int) 'a');
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        int int6 = property5.getMinimumValue();
        org.joda.time.DateTime dateTime7 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = property5.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        int int10 = localDateTime9.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withFieldAdded(durationFieldType11, 59);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours(0);
        org.joda.time.DateTime.Property property25 = dateTime22.weekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime22.withPeriodAdded(readablePeriod26, (int) '4');
        int int29 = property18.getDifference((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime22.plus(readableDuration30);
        int int32 = dateTime31.getSecondOfMinute();
        long long33 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalDateTime localDateTime34 = dateTime31.toLocalDateTime();
        org.joda.time.Chronology chronology35 = localDateTime34.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime8.withChronology(chronology35);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        org.joda.time.Chronology chronology40 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.secondOfMinute();
        org.joda.time.DurationField durationField42 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.year();
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long) 9, chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.year();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.millisOfDay();
        org.joda.time.DurationField durationField47 = chronology40.seconds();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime36, chronology40);
        org.joda.time.DateTimeField dateTimeField49 = chronology40.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime36", (dateTime8.compareTo(dateTime36) == 0) == dateTime8.equals(dateTime36));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMinutes(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime3.plus(readablePeriod7);
        org.joda.time.DateTime dateTime9 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.minuteOfDay();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime3.minusMonths((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMinutes(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime18.plus(readablePeriod22);
        org.joda.time.DateTime dateTime24 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property25 = dateTime18.weekyear();
        org.joda.time.DateTime.Property property26 = dateTime18.dayOfMonth();
        boolean boolean27 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.Chronology chronology31 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = chronology31.years();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.year();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 9, chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.year();
        org.joda.time.DurationField durationField37 = chronology31.months();
        org.joda.time.DurationField durationField38 = chronology31.hours();
        org.joda.time.DurationField durationField39 = chronology31.halfdays();
        org.joda.time.DateTime dateTime40 = dateTime14.withChronology(chronology31);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime45 = dateTime42.withFieldAdded(durationFieldType43, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.seconds();
        boolean boolean47 = dateTime42.equals((java.lang.Object) durationFieldType46);
        int int48 = dateTime42.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone49 = dateTime42.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType52.getField(chronology53);
        org.joda.time.LocalDateTime.Property property55 = localDateTime51.property(dateTimeFieldType52);
        org.joda.time.LocalDateTime.Property property56 = localDateTime51.year();
        boolean boolean57 = dateTime42.equals((java.lang.Object) localDateTime51);
        org.joda.time.Chronology chronology58 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime59 = dateTime14.toDateTime(chronology58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and dateTime40", (dateTime59.compareTo(dateTime40) == 0) == dateTime59.equals(dateTime40));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) '4');
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(140);
        int int12 = localDateTime8.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime21 = dateTime16.plusYears(22);
        org.joda.time.DateTime.Property property22 = dateTime16.era();
        org.joda.time.DateTime.Property property23 = dateTime16.secondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour(16);
        int int27 = dateTime26.getYear();
        org.joda.time.DateTime dateTime29 = dateTime26.withCenturyOfEra(140);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes(10);
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfMonth();
        org.joda.time.DateTime dateTime38 = dateTime33.plusYears(22);
        org.joda.time.DateTime.Property property39 = dateTime33.era();
        org.joda.time.DateTime.Property property40 = dateTime33.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int42 = dateTime33.get(dateTimeFieldType41);
        boolean boolean43 = dateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.Chronology chronology48 = localDateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType45.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.weekyear();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.yearOfEra();
        org.joda.time.DurationField durationField53 = chronology48.weekyears();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.DurationField durationField55 = durationFieldType44.getField(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime54", (dateTime14.compareTo(dateTime54) == 0) == dateTime14.equals(dateTime54));
    }
}

