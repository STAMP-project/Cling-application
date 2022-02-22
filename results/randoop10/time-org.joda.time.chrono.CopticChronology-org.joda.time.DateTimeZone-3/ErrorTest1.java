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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readablePeriod8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.plus(readablePeriod10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.minus(readableDuration12);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField21 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.yearOfCentury();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.Instant instant25 = instant23.withMillis((long) 1);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, 0L);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) instant23, dateTimeZone31);
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis(12);
        boolean boolean37 = copticChronology14.equals((java.lang.Object) localTime36);
        org.joda.time.DurationField durationField38 = copticChronology14.days();
        java.lang.String str39 = copticChronology14.toString();
        org.joda.time.DurationField durationField40 = copticChronology14.seconds();
        org.joda.time.DateTime dateTime41 = dateTime9.toDateTime((org.joda.time.Chronology) copticChronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology20.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology20.months();
        org.joda.time.DateTimeZone dateTimeZone23 = copticChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology20.hourOfHalfday();
        int int25 = copticChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.Chronology chronology27 = copticChronology20.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime18.toDateTime(chronology27);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology29.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology29.year();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology29.halfdayOfDay();
        org.joda.time.DurationField durationField34 = copticChronology29.eras();
        org.joda.time.Chronology chronology35 = copticChronology29.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology29.weekyear();
        int int37 = dateTime28.get(dateTimeField36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField34", Math.signum(durationField22.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField22)));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalDate localDate30 = localDate17.withCenturyOfEra(14);
        long long32 = copticChronology0.set((org.joda.time.ReadablePartial) localDate30, (long) 1080660000);
        org.joda.time.Interval interval33 = localDate30.toInterval();
        org.joda.time.LocalDate localDate35 = localDate30.minusYears(911);
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime37 = instant36.toDateTime();
        org.joda.time.Instant instant38 = instant36.toInstant();
        org.joda.time.DateTime dateTime39 = instant36.toDateTime();
        org.joda.time.Instant instant41 = instant36.plus((long) (-53640118));
        org.joda.time.DateTime dateTime42 = localDate30.toDateTime((org.joda.time.ReadableInstant) instant36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime37", (instant20.compareTo(dateTime37) == 0) == instant20.equals(dateTime37));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekOfWeekyear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.minus(readablePeriod7);
        java.util.Date date15 = new java.util.Date(6, 308, 53631987, 430, 2022, 28);
        boolean boolean16 = dateTime1.equals((java.lang.Object) 28);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.dayOfMonth();
        org.joda.time.DurationField durationField27 = copticChronology17.years();
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        int int31 = dateTimeZone29.getOffset(1645455558743L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime28", (dateTime1.compareTo(dateTime28) == 0) == dateTime1.equals(dateTime28));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromCalendarFields(calendar9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        int int13 = dateTime12.getMinuteOfDay();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime12.toMutableDateTime(dateTimeZone15);
        int int17 = dateTime12.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = dateTime12.isEqual(readableInstant18);
        java.util.Date date21 = new java.util.Date((long) (byte) 0);
        int int22 = date21.getMinutes();
        int int23 = date21.getDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) date21, chronology24);
        org.joda.time.LocalDate localDate27 = localDate25.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone29.nextTransition((long) 893);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone33 = instant32.getZone();
        long long35 = dateTimeZone29.getMillisKeepLocal(dateTimeZone33, 0L);
        org.joda.time.DateTime dateTime36 = localDate25.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime37 = dateTime12.withZoneRetainFields(dateTimeZone29);
        java.util.TimeZone timeZone38 = dateTimeZone29.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology39.secondOfMinute();
        org.joda.time.DurationField durationField41 = copticChronology39.months();
        org.joda.time.DateTimeZone dateTimeZone42 = copticChronology39.getZone();
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(dateTimeZone42);
        long long45 = dateTimeZone29.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.Interval interval46 = localDate10.toInterval(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant14", (dateTime1.compareTo(instant14) == 0) == dateTime1.equals(instant14));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.util.Calendar.Builder builder8 = builder2.setLocale(locale7);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.lang.String str10 = locale9.getDisplayScript();
        java.util.Locale locale12 = new java.util.Locale("1964-10-15");
        java.lang.String str13 = locale9.getDisplayScript(locale12);
        java.util.Calendar.Builder builder14 = builder2.setLocale(locale12);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        int int19 = dateTime18.getMinuteOfDay();
        int int20 = instant15.compareTo((org.joda.time.ReadableInstant) dateTime18);
        java.util.Locale locale21 = java.util.Locale.CANADA;
        java.util.Calendar calendar22 = dateTime18.toCalendar(locale21);
        int int23 = calendar22.getWeeksInWeekYear();
        java.time.Instant instant24 = calendar22.toInstant();
        java.util.Date date26 = new java.util.Date((long) (byte) 0);
        int int27 = date26.getMinutes();
        int int28 = date26.getDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) date26, chronology29);
        org.joda.time.LocalDate localDate32 = localDate30.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 893);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone34.getMillisKeepLocal(dateTimeZone38, 0L);
        org.joda.time.DateTime dateTime41 = localDate30.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.LocalDate localDate43 = localDate30.minusDays(20);
        org.joda.time.LocalDate localDate45 = localDate43.plusWeeks(53);
        org.joda.time.LocalDate localDate47 = localDate43.plusWeeks(20);
        org.joda.time.LocalDate localDate49 = localDate43.withYearOfCentury(6);
        org.joda.time.LocalDate localDate51 = localDate43.plusMonths(5);
        org.joda.time.LocalDate localDate53 = localDate51.minusWeeks(10);
        boolean boolean54 = calendar22.before((java.lang.Object) localDate51);
        org.joda.time.LocalDate localDate56 = localDate51.minusYears(31);
        java.util.Date date57 = localDate51.toDate();
        java.util.Calendar.Builder builder58 = builder2.setInstant(date57);
        int int59 = date57.getMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime18", (instant15.compareTo(dateTime18) == 0) == instant15.equals(dateTime18));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(616);
        org.joda.time.DateTime dateTime11 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime(readableInstant13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.plusSeconds((int) (short) 1);
        int int24 = localDateTime23.getHourOfDay();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minus(readablePeriod26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.withDurationAdded(readableDuration28, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property32 = localDateTime23.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = dateTime14.withFields((org.joda.time.ReadablePartial) localDateTime23);
        boolean boolean34 = dateTime11.equals((java.lang.Object) localDateTime23);
        org.joda.time.DateTime.Property property35 = dateTime11.yearOfEra();
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone37 = instant36.getZone();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(dateTimeZone37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfEra();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.minus(readableDuration40);
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance();
        long long48 = copticChronology42.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField49 = copticChronology42.halfdayOfDay();
        org.joda.time.DurationField durationField50 = copticChronology42.halfdays();
        long long54 = copticChronology42.add((long) 272, 40140000L, 538);
        org.joda.time.DateTime dateTime55 = dateTime38.toDateTime((org.joda.time.Chronology) copticChronology42);
        org.joda.time.DateTime.Property property56 = dateTime55.weekyear();
        long long57 = dateTime55.getMillis();
        int int58 = property35.getDifference((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime55.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant36", (dateTime1.compareTo(instant36) == 0) == dateTime1.equals(instant36));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.DateTime.Property property15 = dateTime13.millisOfSecond();
        org.joda.time.DateTime dateTime16 = property15.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant14", (dateTime16.compareTo(instant14) == 0) == dateTime16.equals(instant14));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.plus(1320000L);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField22 = copticChronology15.months();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType14.getField((org.joda.time.Chronology) copticChronology15);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology15.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology15.getZone();
        org.joda.time.DurationField durationField27 = copticChronology15.years();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology15.clockhourOfDay();
        long long32 = copticChronology15.add((long) 500, 10598050798191L, 691);
        org.joda.time.DurationField durationField33 = copticChronology15.weekyears();
        org.joda.time.DateTime dateTime34 = dateTime11.toDateTime((org.joda.time.Chronology) copticChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        org.joda.time.DateTime.Property property9 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime11 = dateTime1.plusMillis(957);
        int int12 = dateTime11.getYear();
        org.joda.time.LocalTime localTime13 = dateTime11.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime11.minusMillis(966);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        java.lang.String str18 = property7.getAsString();
        org.joda.time.DateTime dateTime20 = property7.addWrapFieldToCopy(53);
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        org.joda.time.DateTime dateTime23 = dateTime20.plusYears(53640129);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology24.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.halfdayOfDay();
        org.joda.time.DurationField durationField32 = copticChronology24.halfdays();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology24.hourOfDay();
        org.joda.time.DateTime dateTime34 = dateTime23.toDateTime((org.joda.time.Chronology) copticChronology24);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        long long41 = copticChronology35.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField42 = copticChronology35.months();
        java.lang.String str43 = copticChronology35.toString();
        int int44 = copticChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField45 = copticChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology35.dayOfYear();
        java.lang.String str47 = copticChronology35.toString();
        java.lang.String str48 = copticChronology35.toString();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology35.secondOfDay();
        java.util.Date date51 = new java.util.Date((long) (byte) 0);
        int int52 = date51.getMinutes();
        int int53 = date51.getDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) date51, chronology54);
        org.joda.time.LocalDate localDate57 = localDate55.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        long long61 = dateTimeZone59.nextTransition((long) 893);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        long long65 = dateTimeZone59.getMillisKeepLocal(dateTimeZone63, 0L);
        org.joda.time.DateTime dateTime66 = localDate55.toDateTimeAtMidnight(dateTimeZone59);
        org.joda.time.LocalDate localDate68 = localDate55.withCenturyOfEra(14);
        long long70 = copticChronology35.set((org.joda.time.ReadablePartial) localDate68, 19439481600100L);
        org.joda.time.DateTimeField dateTimeField71 = copticChronology35.yearOfEra();
        org.joda.time.LocalDate localDate72 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology35);
        org.joda.time.DateTime dateTime73 = dateTime23.withFields((org.joda.time.ReadablePartial) localDate72);
        int int74 = localDate72.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant58", (dateTime1.compareTo(instant58) == 0) == dateTime1.equals(instant58));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTime();
        java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime3.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.lang.Object obj0 = null;
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology9 = copticChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.clockhourOfDay();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology1);
        long long15 = copticChronology1.add(1645455234217L, 0L, 223);
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology1.getZone();
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj0, dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        int int21 = dateTime20.getMinuteOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.plusWeeks(10);
        org.joda.time.DateTime.Property property24 = dateTime20.minuteOfDay();
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime20.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone26);
        long long38 = dateTimeZone26.convertLocalToUTC((long) 53664488, false, (long) 3);
        org.joda.time.DateTime dateTime39 = dateTime18.toDateTime(dateTimeZone26);
        java.lang.String str41 = dateTimeZone26.getNameKey((long) 94);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant25", (dateTime18.compareTo(instant25) == 0) == dateTime18.equals(instant25));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        boolean boolean5 = strSet1.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime10 = dateTime7.withFieldAdded(durationFieldType8, 0);
        org.joda.time.DateTime.Property property11 = dateTime7.minuteOfDay();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfMinute();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime12.toCalendar(locale14);
        org.joda.time.DateTime dateTime17 = dateTime12.minusMinutes(56770311);
        org.joda.time.DateTime.Property property18 = dateTime12.centuryOfEra();
        org.joda.time.Instant instant19 = dateTime12.toInstant();
        boolean boolean20 = strSet1.remove((java.lang.Object) instant19);
        java.util.Iterator<java.lang.String> strItor21 = strSet1.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant19", (dateTime12.compareTo(instant19) == 0) == dateTime12.equals(instant19));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone7.nextTransition((long) 893);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone11, 0L);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime1.toMutableDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant6", (dateTime1.compareTo(instant6) == 0) == dateTime1.equals(instant6));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.yearOfCentury();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.year();
        int int14 = dateTimeField13.getMinimumValue();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.secondOfMinute();
        org.joda.time.DurationField durationField20 = copticChronology18.months();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology18.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter17.withZone(dateTimeZone21);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime localTime26 = localTime24.minusMillis(292272708);
        java.util.Locale locale31 = new java.util.Locale("Chine", "2022-02-21T14:54:39.219", "");
        java.lang.String str32 = dateTimeField13.getAsText((org.joda.time.ReadablePartial) localTime26, 53801809, locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localTime12 and localTime24", (localTime12.compareTo(localTime24) == 0) == localTime12.equals(localTime24));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekOfWeekyear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.minus(readablePeriod7);
        java.util.Date date15 = new java.util.Date(6, 308, 53631987, 430, 2022, 28);
        boolean boolean16 = dateTime1.equals((java.lang.Object) 28);
        java.lang.String str17 = dateTime1.toString();
        int int18 = dateTime1.getWeekyear();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone24, 0L);
        long long29 = dateTimeZone20.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withEra(1);
        int int35 = localDateTime34.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime34.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusSeconds((int) (short) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.hourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfCeilingCopy();
        java.util.Locale locale44 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime45 = property41.setCopy("0", locale44);
        java.lang.String str46 = dateTimeZone20.getName(31536900000L, locale44);
        boolean boolean48 = dateTimeZone20.isStandardOffset((long) 993);
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(dateTimeZone20);
        boolean boolean50 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalTime localTime51 = dateTime49.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant19", (dateTime1.compareTo(instant19) == 0) == dateTime1.equals(instant19));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.Instant instant15 = dateTime13.toInstant();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime13.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 2);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 289);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(dateTimeZone11);
        int int13 = dateTime10.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime9", (instant0.compareTo(mutableDateTime9) == 0) == instant0.equals(mutableDateTime9));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime8 = property5.addToCopy((int) '4');
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime10 = instant9.toDateTime();
        org.joda.time.Instant instant12 = instant9.withMillis(1645455224272L);
        boolean boolean13 = dateTime8.equals((java.lang.Object) instant9);
        int int14 = dateTime8.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology17.weekOfWeekyear();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.secondOfMinute();
        org.joda.time.DurationField durationField34 = copticChronology32.months();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology32.monthOfYear();
        long long38 = dateTimeField36.roundHalfCeiling((long) (short) 100);
        long long40 = dateTimeField36.remainder((long) 69);
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str43 = locale42.getISO3Language();
        int int44 = dateTimeField36.getMaximumShortTextLength(locale42);
        boolean boolean45 = dateTimeField36.isLenient();
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone48 = instant47.getZone();
        long long50 = dateTimeZone48.nextTransition((long) 893);
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = dateTimeZone48.getName((long) (short) 0, locale52);
        java.lang.String str54 = dateTimeField36.getAsText(1645455240177L, locale52);
        int int55 = dateTimeField31.getMaximumShortTextLength(locale52);
        boolean boolean57 = dateTimeField31.isLeap(1646006400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfEra();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property16.getAsText(locale17);
        org.joda.time.DateTime dateTime20 = property16.addWrapFieldToCopy(990);
        org.joda.time.DateTime dateTime22 = property16.addWrapFieldToCopy(619);
        org.joda.time.DateTimeField dateTimeField23 = property16.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property17 = dateTime3.era();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime3.plus(readablePeriod18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        java.util.Date date34 = dateTime29.toDate();
        int int35 = date34.getTimezoneOffset();
        java.lang.Object obj36 = date34.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime15.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime15.toGregorianCalendar();
        gregorianCalendar20.clear();
        java.util.Locale locale24 = new java.util.Locale("hi!", "");
        boolean boolean25 = locale24.hasExtensions();
        boolean boolean26 = gregorianCalendar20.after((java.lang.Object) locale24);
        java.util.Locale locale30 = new java.util.Locale("+00:00", "Property[monthOfYear]", "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = dateTimeZone12.getShortName(14L, locale24);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        int int36 = localDateTime35.getWeekyear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusHours((int) (byte) -1);
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        long long42 = dateTimeZone40.nextTransition((long) 893);
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = dateTimeZone40.getName((long) (short) 0, locale44);
        java.util.TimeZone timeZone46 = dateTimeZone40.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = null;
        org.joda.time.format.DateTimeParser dateTimeParser49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter48, dateTimeParser49);
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter50.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter50.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter50.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter55.withPivotYear((java.lang.Integer) 14);
        int int60 = dateTimeFormatter55.getDefaultYear();
        java.util.Locale locale61 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter55.withLocale(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale61.getDisplayScript(locale63);
        java.lang.String str65 = dateTimeZone40.getName((-61788528000000L), locale61);
        org.joda.time.DateTime dateTime66 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property67 = localDateTime35.weekyear();
        boolean boolean68 = dateTimeZone12.isLocalDateTimeGap(localDateTime35);
        int int70 = dateTimeZone12.getOffsetFromLocal(3235588320000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant39", (dateTime15.compareTo(instant39) == 0) == dateTime15.equals(instant39));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        int int16 = gregorianCalendar15.getFirstDayOfWeek();
        java.lang.String str17 = gregorianCalendar15.getCalendarType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        int int40 = localDate37.getEra();
        org.joda.time.LocalDate localDate42 = localDate37.minusWeeks(490);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime47 = dateTime44.withFieldAdded(durationFieldType45, 0);
        org.joda.time.DateTime.Property property48 = dateTime44.minuteOfDay();
        org.joda.time.DateTime dateTime49 = property48.withMinimumValue();
        org.joda.time.DateTime dateTime51 = property48.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime52 = property48.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property54 = dateTime52.property(dateTimeFieldType53);
        boolean boolean55 = localDate37.isSupported(dateTimeFieldType53);
        org.joda.time.chrono.CopticChronology copticChronology56 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField57 = copticChronology56.secondOfMinute();
        org.joda.time.DurationField durationField58 = copticChronology56.months();
        org.joda.time.DateTimeZone dateTimeZone59 = copticChronology56.getZone();
        org.joda.time.DateTimeField dateTimeField60 = copticChronology56.clockhourOfHalfday();
        org.joda.time.DurationField durationField61 = copticChronology56.weeks();
        org.joda.time.DurationField durationField62 = copticChronology56.weekyears();
        org.joda.time.DurationField durationField63 = copticChronology56.halfdays();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType53.getField((org.joda.time.Chronology) copticChronology56);
        org.joda.time.DurationField durationField65 = copticChronology56.centuries();
        int int68 = durationField65.getDifference((long) 54067292, 1645455477770L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime44", (instant8.compareTo(dateTime44) == 0) == instant8.equals(dateTime44));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withPeriodAdded(readablePeriod2, 5);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField12 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology5.yearOfCentury();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.Instant instant16 = instant14.withMillis((long) 1);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant14, dateTimeZone22);
        org.joda.time.LocalTime localTime27 = localTime25.minusMillis(12);
        boolean boolean28 = copticChronology5.equals((java.lang.Object) localTime27);
        org.joda.time.DurationField durationField29 = copticChronology5.days();
        org.joda.time.DateTime dateTime30 = dateTime4.toDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTime dateTime31 = dateTime30.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime36 = dateTime33.withFieldAdded(durationFieldType34, 0);
        org.joda.time.DateTime.Property property37 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime38 = property37.withMinimumValue();
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        org.joda.time.DateTime dateTime42 = dateTime38.withDurationAdded(0L, 52);
        org.joda.time.DateTime dateTime44 = dateTime38.minusWeeks(734);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(chronology45);
        int int47 = localTime46.getHourOfDay();
        org.joda.time.LocalTime.Property property48 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime49 = property48.roundCeilingCopy();
        org.joda.time.DurationField durationField50 = property48.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property48.getFieldType();
        int int52 = dateTime38.get(dateTimeFieldType51);
        int int53 = dateTime30.get(dateTimeFieldType51);
        org.joda.time.DateTime dateTime55 = dateTime30.plusMinutes(292272708);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(10598050642779L);
        boolean boolean58 = dateTime55.isEqual((org.joda.time.ReadableInstant) dateTime57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readableDuration22);
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        int int25 = dateTime23.getMillisOfSecond();
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        int int27 = dateTime23.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.DateTime dateTime11 = instant9.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.plusYears(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        timeZone7.setID("Property[secondOfMinute]");
        timeZone7.setRawOffset(650);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.DurationField durationField22 = dateTimeField21.getRangeDurationField();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        long long26 = dateTimeField21.set((long) 8, "53640", locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone7, locale25);
        java.time.Instant instant29 = calendar28.toInstant();
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = dateTimeZone31.getName((long) (short) 0, locale35);
        java.util.TimeZone timeZone37 = dateTimeZone31.toTimeZone();
        timeZone37.setID("Property[secondOfMinute]");
        timeZone37.setRawOffset(650);
        java.util.Date date43 = new java.util.Date((long) (byte) 0);
        int int44 = date43.getMinutes();
        int int45 = date43.getDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((java.lang.Object) date43, chronology46);
        org.joda.time.LocalDate localDate49 = localDate47.withYear((-1));
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfEra();
        org.joda.time.DateTimeField dateTimeField51 = property50.getField();
        org.joda.time.DurationField durationField52 = dateTimeField51.getRangeDurationField();
        java.util.Locale locale55 = java.util.Locale.KOREA;
        long long56 = dateTimeField51.set((long) 8, "53640", locale55);
        java.util.Set<java.lang.String> strSet57 = locale55.getUnicodeLocaleAttributes();
        java.util.Calendar calendar58 = java.util.Calendar.getInstance(timeZone37, locale55);
        java.util.Date date60 = new java.util.Date((long) (byte) 0);
        int int61 = date60.getMinutes();
        int int62 = date60.getDay();
        calendar58.setTime(date60);
        boolean boolean64 = calendar28.after((java.lang.Object) calendar58);
        long long65 = calendar58.getTimeInMillis();
        org.joda.time.LocalDate localDate66 = org.joda.time.LocalDate.fromCalendarFields(calendar58);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone67);
        int int69 = dateTime68.getMinuteOfDay();
        org.joda.time.DateTime dateTime71 = dateTime68.plusWeeks(10);
        org.joda.time.DateTime.Property property72 = dateTime68.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar73 = dateTime68.toGregorianCalendar();
        int int74 = gregorianCalendar73.getFirstDayOfWeek();
        gregorianCalendar73.setMinimalDaysInFirstWeek((int) (byte) 1);
        gregorianCalendar73.setFirstDayOfWeek((int) '#');
        gregorianCalendar73.setLenient(false);
        gregorianCalendar73.set(112, 53737, 1468, 295, 54);
        int int87 = gregorianCalendar73.getWeeksInWeekYear();
        java.util.Date date89 = new java.util.Date((long) 849);
        date89.setHours(123);
        gregorianCalendar73.setTime(date89);
        int int93 = calendar58.compareTo((java.util.Calendar) gregorianCalendar73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime68", (instant0.compareTo(dateTime68) == 0) == instant0.equals(dateTime68));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology28.secondOfMinute();
        org.joda.time.DurationField durationField30 = copticChronology28.months();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology28.getZone();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(dateTimeZone31);
        long long34 = dateTimeZone18.getMillisKeepLocal(dateTimeZone31, 0L);
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("CA");
        java.lang.String str38 = dateTimeZone18.getName((long) 437, locale37);
        long long40 = dateTimeZone18.previousTransition(0L);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime1.dayOfYear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        org.joda.time.DateTime dateTime17 = dateTime7.withField(dateTimeFieldType14, (int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime7.withTimeAtStartOfDay();
        int int19 = property6.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime21 = property6.addToCopy((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 53);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.minusHours(529);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime8 = instant7.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withPeriodAdded(readablePeriod9, 5);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        long long18 = copticChronology12.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField19 = copticChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.yearOfCentury();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant21.withMillis((long) 1);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone25.nextTransition((long) 893);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone29, 0L);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((java.lang.Object) instant21, dateTimeZone29);
        org.joda.time.LocalTime localTime34 = localTime32.minusMillis(12);
        boolean boolean35 = copticChronology12.equals((java.lang.Object) localTime34);
        org.joda.time.DurationField durationField36 = copticChronology12.days();
        org.joda.time.DateTime dateTime37 = dateTime11.toDateTime((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTime dateTime38 = dateTime37.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime43 = dateTime40.withFieldAdded(durationFieldType41, 0);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.DateTime.Property property46 = dateTime45.secondOfMinute();
        org.joda.time.DateTime dateTime49 = dateTime45.withDurationAdded(0L, 52);
        org.joda.time.DateTime dateTime51 = dateTime45.minusWeeks(734);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(chronology52);
        int int54 = localTime53.getHourOfDay();
        org.joda.time.LocalTime.Property property55 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.roundCeilingCopy();
        org.joda.time.DurationField durationField57 = property55.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = property55.getFieldType();
        int int59 = dateTime45.get(dateTimeFieldType58);
        int int60 = dateTime37.get(dateTimeFieldType58);
        org.joda.time.DateTime.Property property61 = dateTime6.property(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        calendar9.set(2, 0);
        calendar9.setTimeInMillis((long) '#');
        calendar9.setMinimalDaysInFirstWeek(935);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        calendar9.setTime(date18);
        calendar9.setLenient(false);
        calendar9.setMinimalDaysInFirstWeek(161);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone29.nextTransition((long) 893);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = dateTimeZone29.getName((long) (short) 0, locale33);
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        calendar9.setTimeZone(timeZone35);
        boolean boolean37 = calendar9.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant28", (dateTime1.compareTo(instant28) == 0) == dateTime1.equals(instant28));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology17.weekOfWeekyear();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 16, dateTimeZone34);
        long long39 = dateTimeZone34.convertLocalToUTC((-1806581999000L), false, (long) 21);
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstance();
        long long46 = copticChronology40.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField47 = copticChronology40.halfdayOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withEra(1);
        int int52 = localDateTime51.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = localDateTime51.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.plusSeconds((int) (byte) 10);
        int int57 = localDateTime56.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime56.plusYears(0);
        boolean boolean60 = copticChronology40.equals((java.lang.Object) localDateTime59);
        boolean boolean61 = dateTimeZone34.isLocalDateTimeGap(localDateTime59);
        org.joda.time.Chronology chronology62 = copticChronology17.withZone(dateTimeZone34);
        long long64 = dateTimeZone34.previousTransition((long) 673);
        java.util.TimeZone timeZone65 = dateTimeZone34.toTimeZone();
        org.joda.time.DateTime dateTime66 = org.joda.time.DateTime.now(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant33", (dateTime1.compareTo(instant33) == 0) == dateTime1.equals(instant33));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        int int8 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean10 = dateTime6.isSupported(dateTimeFieldType9);
        java.util.Date date12 = new java.util.Date((long) (byte) 0);
        int int13 = date12.getMinutes();
        int int14 = date12.getDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) date12, chronology15);
        org.joda.time.LocalDate localDate18 = localDate16.withYear((-1));
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = property19.getMaximumValueOverall();
        org.joda.time.LocalDate localDate22 = property19.roundCeilingCopy();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone24.nextTransition((long) 893);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = dateTimeZone24.getName((long) (short) 0, locale28);
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        org.joda.time.DateTime dateTime31 = localDate22.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTimeISO();
        org.joda.time.Instant instant33 = dateTime32.toInstant();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.withDurationAdded(readableDuration34, 16);
        boolean boolean37 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime39 = dateTime6.plusYears(626);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekyear(570);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        boolean boolean26 = localDateTime18.isSupported(dateTimeFieldType25);
        java.lang.String str27 = dateTimeFieldType25.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField36 = copticChronology29.months();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType28.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology29.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType25.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        long long47 = dateTimeZone45.previousTransition(37152000120L);
        org.joda.time.Chronology chronology48 = copticChronology29.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime14.withZone(dateTimeZone45);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant16", (dateTime6.compareTo(instant16) == 0) == dateTime6.equals(instant16));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar15 = dateTime14.toGregorianCalendar();
        java.lang.String str16 = gregorianCalendar15.getCalendarType();
        int int17 = gregorianCalendar15.getMinimalDaysInFirstWeek();
        gregorianCalendar15.setLenient(true);
        int int20 = gregorianCalendar15.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        int int3 = dateTime2.getMinuteOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusWeeks(10);
        int int6 = dateTime5.getMillisOfSecond();
        java.util.Date date7 = dateTime5.toDate();
        org.joda.time.DateTime dateTime8 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime5.minusHours((-2));
        org.joda.time.DateTime dateTime12 = dateTime10.minus(1645455284589L);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getMinutes();
        int int16 = date14.getDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date14, chronology17);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, 0L);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone22);
        java.util.Date date31 = new java.util.Date((long) (byte) 0);
        int int32 = date31.getMinutes();
        int int33 = date31.getDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) date31, chronology34);
        org.joda.time.LocalDate localDate37 = localDate35.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone39.nextTransition((long) 893);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone43 = instant42.getZone();
        long long45 = dateTimeZone39.getMillisKeepLocal(dateTimeZone43, 0L);
        org.joda.time.DateTime dateTime46 = localDate35.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.DateTime dateTime47 = localDate18.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate50 = localDate18.withPeriodAdded(readablePeriod48, 122);
        org.joda.time.LocalDate localDate52 = localDate50.withYearOfEra(21);
        org.joda.time.LocalDate.Property property53 = localDate50.monthOfYear();
        org.joda.time.Chronology chronology54 = localDate50.getChronology();
        org.joda.time.DateTime dateTime55 = dateTime12.toDateTime(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.yearOfEra();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(10598050537852L, chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant21", (dateTime2.compareTo(instant21) == 0) == dateTime2.equals(instant21));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime9 = dateTime6.plusDays((int) 'a');
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone12.nextTransition((long) 893);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone12.getMillisKeepLocal(dateTimeZone16, 0L);
        java.lang.String str20 = dateTimeZone16.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(0L, dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours(24);
        int int25 = dateTime24.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime30 = dateTime27.withFieldAdded(durationFieldType28, 0);
        org.joda.time.DateTime.Property property31 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime32 = property31.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property33 = dateTime32.secondOfMinute();
        java.util.Date date34 = dateTime32.toDate();
        org.joda.time.DateTime dateTime36 = dateTime32.plusYears((int) 'u');
        org.joda.time.DateTime.Property property37 = dateTime32.minuteOfDay();
        int int38 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime40 = dateTime32.plusSeconds(53874535);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DateTime dateTime2 = localDateTime0.toDateTime(readableInstant1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime6.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusSeconds((int) (short) 1);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minus(readablePeriod14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withDurationAdded(readableDuration16, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property20 = localDateTime11.property(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime2.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.DateTime dateTime23 = dateTime2.minusWeeks(32772);
        org.joda.time.Instant instant24 = dateTime2.toInstant();
        org.joda.time.DateTime dateTime26 = dateTime2.plusMonths(11);
        org.joda.time.DateTime dateTime28 = dateTime26.plus(32453352691200000L);
        org.joda.time.TimeOfDay timeOfDay29 = dateTime28.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant24", (dateTime2.compareTo(instant24) == 0) == dateTime2.equals(instant24));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 2);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 289);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime11 = instant8.toMutableDateTime();
        java.lang.String str13 = mutableDateTime11.toString("53824069");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime9", (instant0.compareTo(mutableDateTime9) == 0) == instant0.equals(mutableDateTime9));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        boolean boolean8 = timeZone7.observesDaylightTime();
        int int10 = timeZone7.getOffset((long) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        int int15 = localDateTime14.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = localDateTime14.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusSeconds((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(32769);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime21.getFields();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.secondOfMinute();
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime29 = dateTime26.withFieldAdded(durationFieldType27, 0);
        org.joda.time.DateTime.Property property30 = dateTime26.minuteOfDay();
        org.joda.time.DateTime dateTime31 = property30.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property32 = dateTime31.secondOfMinute();
        org.joda.time.DateTime.Property property33 = dateTime31.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime38 = dateTime35.withFieldAdded(durationFieldType36, 0);
        org.joda.time.DateTime.Property property39 = dateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property41 = dateTime40.secondOfMinute();
        java.lang.String str42 = property41.toString();
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str45 = property41.getAsShortText(locale44);
        java.lang.String str46 = property33.getAsShortText(locale44);
        int int47 = property24.getMaximumTextLength(locale44);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone7, locale44);
        boolean boolean49 = timeZone7.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime26", (instant0.compareTo(dateTime26) == 0) == instant0.equals(dateTime26));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime.Property property17 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime19 = dateTime6.minusMonths((-292275054));
        org.joda.time.DateTime dateTime21 = dateTime19.minusWeeks(53739266);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int26 = localDateTime24.get(dateTimeFieldType25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property27.addToCopy(893L);
        org.joda.time.LocalDateTime localDateTime30 = property27.roundHalfCeilingCopy();
        int int31 = localDateTime30.getWeekyear();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.dayOfWeek();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.DateTime dateTime37 = property36.withMaximumValue();
        org.joda.time.DateTime dateTime39 = dateTime37.minusSeconds(0);
        org.joda.time.DateTime dateTime40 = localDateTime30.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone42.getMillisKeepLocal(dateTimeZone46, 0L);
        boolean boolean50 = dateTimeZone46.isStandardOffset((long) 894);
        org.joda.time.DateTime dateTime51 = dateTime40.withZone(dateTimeZone46);
        boolean boolean52 = dateTime21.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime54 = dateTime21.minus((long) 54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant22", (dateTime1.compareTo(instant22) == 0) == dateTime1.equals(instant22));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        int int9 = dateTime8.getMinuteOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, 0);
        org.joda.time.DateTime.Property property16 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        java.lang.String str26 = dateTimeFieldType25.getName();
        int int27 = dateTime17.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime29 = dateTime17.plusMinutes(53631987);
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getDurationType();
        boolean boolean33 = dateTime30.isSupported(dateTimeFieldType31);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(dateTimeZone35);
        boolean boolean38 = dateTimeZone35.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 3);
        boolean boolean41 = dateTimeZone35.equals((java.lang.Object) 3);
        org.joda.time.DateTime dateTime42 = dateTime30.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime.Property property43 = dateTime42.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.minus(readablePeriod44);
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.secondOfMinute();
        org.joda.time.DurationField durationField48 = copticChronology46.months();
        org.joda.time.DateTimeZone dateTimeZone49 = copticChronology46.getZone();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology46.hourOfHalfday();
        int int51 = copticChronology46.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.Chronology chronology53 = copticChronology46.withZone(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = copticChronology46.getZone();
        org.joda.time.DateTime dateTime55 = dateTime42.withZoneRetainFields(dateTimeZone54);
        boolean boolean56 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime42);
        int int57 = dateTime42.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant34", (dateTime1.compareTo(instant34) == 0) == dateTime1.equals(instant34));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean10 = localDateTime5.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.withMillisOfDay(879);
        int[] intArray14 = localDateTime13.getValues();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.withPeriodAdded(readablePeriod17, 5);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime24 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property27 = dateTime26.secondOfMinute();
        org.joda.time.DateTime.Property property28 = dateTime26.secondOfDay();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withDurationAdded(readableDuration29, 6);
        int int32 = dateTime31.getMinuteOfHour();
        org.joda.time.DateTime.Property property33 = dateTime31.millisOfDay();
        int int34 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime35 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.LocalDateTime localDateTime36 = dateTime31.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime16", (instant15.compareTo(dateTime16) == 0) == instant15.equals(dateTime16));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.adjustOffset(25L, false);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = dateTimeZone1.getShortName((long) (byte) 100, locale13);
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        int int19 = dateTime18.getMinuteOfDay();
        org.joda.time.DateTime dateTime21 = dateTime18.plusWeeks(10);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar23 = dateTime18.toGregorianCalendar();
        org.joda.time.DateTime dateTime25 = dateTime18.plusHours(53637233);
        org.joda.time.DateTime dateTime26 = dateTime18.withEarlierOffsetAtOverlap();
        int int27 = dateTime26.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withDayOfWeek(2);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) dateTime29);
        boolean boolean33 = dateTime26.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime38 = dateTime35.withFieldAdded(durationFieldType36, 0);
        org.joda.time.DateTime.Property property39 = dateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property41 = dateTime40.secondOfMinute();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Calendar calendar43 = dateTime40.toCalendar(locale42);
        org.joda.time.DateTime dateTime45 = dateTime40.minusMinutes(56770311);
        org.joda.time.DateTime dateTime47 = dateTime40.withYear(35);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone48);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime52 = dateTime49.withFieldAdded(durationFieldType50, 0);
        org.joda.time.DateTime.Property property53 = dateTime49.minuteOfDay();
        org.joda.time.DateTime dateTime54 = property53.withMinimumValue();
        org.joda.time.DateTime dateTime56 = property53.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime58 = property53.addWrapFieldToCopy(616);
        org.joda.time.DateTime dateTime59 = property53.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime60 = property53.getDateTime();
        org.joda.time.DateTime.Property property61 = dateTime60.dayOfYear();
        org.joda.time.DateTime dateTime63 = dateTime60.plusWeeks(56770311);
        boolean boolean64 = dateTime60.isBeforeNow();
        org.joda.time.DateTime dateTime66 = dateTime60.plusSeconds(986);
        org.joda.time.DateTime dateTime68 = dateTime60.withYear(538);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTime60.getZone();
        boolean boolean71 = dateTime60.isAfter((long) 53920931);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(dateTimeZone72);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime76 = dateTime73.withFieldAdded(durationFieldType74, 0);
        org.joda.time.DateTime.Property property77 = dateTime73.minuteOfDay();
        org.joda.time.DateTime dateTime78 = property77.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property79 = dateTime78.secondOfMinute();
        java.util.Date date80 = dateTime78.toDate();
        org.joda.time.DateTime dateTime82 = dateTime78.plusYears((int) 'u');
        org.joda.time.DateTime dateTime85 = dateTime82.withDurationAdded((long) 53679726, 0);
        org.joda.time.DateTime[] dateTimeArray86 = new org.joda.time.DateTime[] { dateTime26, dateTime47, dateTime60, dateTime85 };
        org.joda.time.DateTime[] dateTimeArray87 = strSet16.toArray(dateTimeArray86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime18", (instant0.compareTo(dateTime18) == 0) == instant0.equals(dateTime18));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.plus(readablePeriod5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(6);
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTime(dateTimeZone9);
        long long13 = dateTimeZone9.adjustOffset(1645455564616L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        boolean boolean5 = strSet1.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList11 = new java.util.ArrayList<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList11, strArray10);
        java.lang.String str13 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList11);
        java.util.List<java.lang.String> strList14 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strList11);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        java.lang.String str33 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList31);
        boolean boolean34 = strSet24.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withDayOfWeek(2);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime36);
        int int40 = dateTime39.getYearOfCentury();
        boolean boolean41 = strSet24.remove((java.lang.Object) int40);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap43 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList44 = java.util.Locale.LanguageRange.parse("Canada", strMap43);
        org.joda.time.tz.Provider provider45 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet46 = provider45.getAvailableIDs();
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        boolean boolean50 = strSet46.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags(languageRangeList44, (java.util.Collection<java.lang.String>) strSet46, filteringMode51);
        java.util.List<java.lang.String> strList53 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet24, filteringMode51);
        boolean boolean55 = strSet24.add("gregory");
        boolean boolean57 = strSet24.add("1970");
        java.util.Date date59 = new java.util.Date((long) (byte) 0);
        int int60 = date59.getMinutes();
        int int61 = date59.getDay();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate((java.lang.Object) date59, chronology62);
        org.joda.time.LocalDate localDate65 = localDate63.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant66 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone67 = instant66.getZone();
        long long69 = dateTimeZone67.nextTransition((long) 893);
        org.joda.time.Instant instant70 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone71 = instant70.getZone();
        long long73 = dateTimeZone67.getMillisKeepLocal(dateTimeZone71, 0L);
        org.joda.time.DateTime dateTime74 = localDate63.toDateTimeAtMidnight(dateTimeZone67);
        org.joda.time.LocalDate localDate76 = localDate63.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime77 = localDate76.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate79 = localDate76.plusYears(740);
        org.joda.time.LocalTime localTime80 = null;
        org.joda.time.DateTime dateTime81 = localDate79.toDateTime(localTime80);
        org.joda.time.LocalDate.Property property82 = localDate79.yearOfEra();
        java.util.Date date83 = localDate79.toDate();
        boolean boolean84 = strSet24.contains((java.lang.Object) date83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and instant66", (dateTime36.compareTo(instant66) == 0) == dateTime36.equals(instant66));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(chronology7);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addCopy((long) 52);
        org.joda.time.LocalTime localTime14 = localTime12.plusMillis(852);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.getName();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.withMillisOfSecond(0);
        boolean boolean20 = dateTime6.equals((java.lang.Object) 0);
        org.joda.time.Instant instant21 = dateTime6.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, 0);
        boolean boolean9 = localTime1.isSupported(durationFieldType6);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 510);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.lang.String str17 = dateTimeZone13.getName((long) 100);
        org.joda.time.Interval interval18 = localDate11.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate20 = localDate11.plusWeeks(136);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance();
        long long28 = copticChronology22.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.halfdayOfDay();
        org.joda.time.DurationField durationField30 = copticChronology22.months();
        boolean boolean31 = durationFieldType21.isSupported((org.joda.time.Chronology) copticChronology22);
        boolean boolean32 = localDate20.isSupported(durationFieldType21);
        org.joda.time.LocalTime localTime34 = localTime1.withFieldAdded(durationFieldType21, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant12", (dateTime5.compareTo(instant12) == 0) == dateTime5.equals(instant12));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekyear();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        int int7 = dateTime6.getMinuteOfDay();
        int int8 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime9 = instant3.toDateTime();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.monthOfYear();
        long long16 = dateTimeField14.roundHalfCeiling((long) (short) 100);
        long long18 = dateTimeField14.remainder((long) 69);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str21 = locale20.getISO3Language();
        int int22 = dateTimeField14.getMaximumShortTextLength(locale20);
        int int23 = dateTime9.get(dateTimeField14);
        org.joda.time.DateTime dateTime25 = dateTime9.withMillis((long) (byte) 100);
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.DateTime.Property property27 = dateTime25.yearOfCentury();
        int int28 = dateTime25.getYear();
        int int29 = property2.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime.Property property14 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime15 = property14.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime16 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = property14.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, 453);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = dateTimeZone22.getName((long) (short) 0, locale26);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(dateTimeZone22);
        org.joda.time.LocalTime localTime30 = localTime28.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withDayOfWeek(2);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) dateTime32);
        int int36 = dateTime35.getEra();
        org.joda.time.TimeOfDay timeOfDay37 = dateTime35.toTimeOfDay();
        org.joda.time.DateTime dateTime39 = dateTime35.plusSeconds(21);
        org.joda.time.DateTime dateTime41 = dateTime35.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime42 = localTime30.toDateTime((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType43.getRangeDurationType();
        int int45 = dateTime42.get(dateTimeFieldType43);
        int int46 = dateTime42.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.DateTime dateTime49 = dateTime42.withPeriodAdded(readablePeriod47, 490);
        org.joda.time.DateTime dateTime51 = dateTime49.plus(124383264488L);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime51.minus(readablePeriod52);
        org.joda.time.DateTime dateTime54 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime32", (instant0.compareTo(dateTime32) == 0) == instant0.equals(dateTime32));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.Instant instant22 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.joda.time.YearMonthDay yearMonthDay26 = dateTime25.toYearMonthDay();
        org.joda.time.DateTime dateTime28 = dateTime25.minusYears(845);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant22", (dateTime19.compareTo(instant22) == 0) == dateTime19.equals(instant22));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime8 = dateTime7.toLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes((-1));
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.plus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime12.plusHours((int) 'u');
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.LocalDate localDate35 = localDate22.minusDays(20);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks(53);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property40 = localDate37.yearOfCentury();
        org.joda.time.DateTime dateTime41 = localDate37.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime42 = dateTime41.toDateTimeISO();
        org.joda.time.DateTime dateTime43 = dateTime42.withLaterOffsetAtOverlap();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance();
        long long50 = copticChronology44.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField51 = copticChronology44.halfdayOfDay();
        org.joda.time.DurationField durationField52 = copticChronology44.halfdays();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = dateTimeZone54.getName((long) 32769, locale56);
        org.joda.time.Chronology chronology58 = copticChronology44.withZone(dateTimeZone54);
        org.joda.time.DateTimeZone dateTimeZone59 = copticChronology44.getZone();
        org.joda.time.DateTime dateTime60 = dateTime43.withZone(dateTimeZone59);
        long long62 = dateTimeZone16.getMillisKeepLocal(dateTimeZone59, 0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant25", (dateTime1.compareTo(instant25) == 0) == dateTime1.equals(instant25));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime18 = dateTime15.withFieldAdded(durationFieldType16, 0);
        org.joda.time.DateTime.Property property19 = dateTime15.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        java.util.Date date22 = dateTime20.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property24 = dateTime20.property(dateTimeFieldType23);
        int int25 = localTime13.get(dateTimeFieldType23);
        org.joda.time.LocalTime localTime27 = localTime13.plusHours(289);
        org.joda.time.LocalTime.Property property28 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) localTime13);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime32 = localTime13.withPeriodAdded(readablePeriod30, 65);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 893);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone34.getMillisKeepLocal(dateTimeZone38, 0L);
        long long43 = dateTimeZone34.convertLocalToUTC((long) 11, false);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.ReadableInstant readableInstant45 = null;
        int int46 = dateTimeZone34.getOffset(readableInstant45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime51 = dateTime48.withFieldAdded(durationFieldType49, 0);
        org.joda.time.DateTime.Property property52 = dateTime48.minuteOfDay();
        org.joda.time.DateTime dateTime53 = property52.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property54 = dateTime53.secondOfMinute();
        java.util.Locale locale55 = java.util.Locale.CANADA;
        java.util.Calendar calendar56 = dateTime53.toCalendar(locale55);
        org.joda.time.DateTime dateTime58 = dateTime53.minusMinutes(56770311);
        org.joda.time.DateTime.Property property59 = dateTime53.centuryOfEra();
        int int60 = dateTimeZone34.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime61 = localTime32.toDateTimeToday(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.DateTime dateTime11 = instant9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime.Property property19 = dateTime18.era();
        org.joda.time.DateTime dateTime21 = dateTime18.plusDays((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime23 = dateTime11.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        java.util.Date date2 = new java.util.Date((long) (byte) 0);
        int int3 = date2.getMinutes();
        int int4 = date2.getDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) date2, chronology5);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 0L);
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        java.util.Date date19 = new java.util.Date((long) (byte) 0);
        int int20 = date19.getMinutes();
        int int21 = date19.getDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) date19, chronology22);
        org.joda.time.LocalDate localDate25 = localDate23.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, 0L);
        org.joda.time.DateTime dateTime34 = localDate23.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime35 = localDate6.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate38 = localDate6.withPeriodAdded(readablePeriod36, 122);
        org.joda.time.LocalDate localDate40 = localDate38.withYearOfEra(21);
        int int41 = localDate38.getEra();
        org.joda.time.LocalDate localDate43 = localDate38.minusWeeks(490);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime48 = dateTime45.withFieldAdded(durationFieldType46, 0);
        org.joda.time.DateTime.Property property49 = dateTime45.minuteOfDay();
        org.joda.time.DateTime dateTime50 = property49.withMinimumValue();
        org.joda.time.DateTime dateTime52 = property49.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime53 = property49.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property55 = dateTime53.property(dateTimeFieldType54);
        boolean boolean56 = localDate38.isSupported(dateTimeFieldType54);
        org.joda.time.chrono.CopticChronology copticChronology57 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField58 = copticChronology57.secondOfMinute();
        org.joda.time.DurationField durationField59 = copticChronology57.months();
        org.joda.time.DateTimeZone dateTimeZone60 = copticChronology57.getZone();
        org.joda.time.DateTimeField dateTimeField61 = copticChronology57.clockhourOfHalfday();
        org.joda.time.DurationField durationField62 = copticChronology57.weeks();
        org.joda.time.DurationField durationField63 = copticChronology57.weekyears();
        org.joda.time.DurationField durationField64 = copticChronology57.halfdays();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType54.getField((org.joda.time.Chronology) copticChronology57);
        org.joda.time.DateTimeField dateTimeField66 = copticChronology57.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology57.yearOfEra();
        org.joda.time.LocalTime localTime68 = org.joda.time.LocalTime.fromMillisOfDay((long) 332, (org.joda.time.Chronology) copticChronology57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime45", (instant9.compareTo(dateTime45) == 0) == instant9.equals(dateTime45));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate.Property property14 = localDate13.dayOfWeek();
        org.joda.time.LocalDate.Property property15 = localDate13.monthOfYear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfCeilingCopy();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        int int21 = dateTime20.getMinuteOfDay();
        int int22 = instant17.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = instant17.toDateTime();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone25.nextTransition((long) 893);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone29, 0L);
        long long33 = dateTimeZone29.nextTransition((long) (-1));
        org.joda.time.MutableDateTime mutableDateTime34 = instant17.toMutableDateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime35 = localDate16.toDateTimeAtMidnight(dateTimeZone29);
        org.joda.time.DateTime dateTime36 = localDate7.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.DateTime.Property property37 = dateTime36.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime20", (instant0.compareTo(dateTime20) == 0) == instant0.equals(dateTime20));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = property8.equals((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = property8.getDurationField();
        org.joda.time.DateTime dateTime17 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property8.addToCopy(0L);
        org.joda.time.DateTime dateTime20 = property8.getDateTime();
        org.joda.time.DateTime dateTime22 = property8.setCopy(11);
        java.util.Date date24 = new java.util.Date((long) (byte) 0);
        int int25 = date24.getMinutes();
        int int26 = date24.getDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((java.lang.Object) date24, chronology27);
        org.joda.time.LocalDate localDate30 = localDate28.withYear((-1));
        org.joda.time.LocalDate.Property property31 = localDate30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = property31.getField();
        int int33 = property31.getMaximumValueOverall();
        org.joda.time.LocalDate localDate34 = property31.roundCeilingCopy();
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        long long38 = dateTimeZone36.nextTransition((long) 893);
        java.util.Locale locale40 = java.util.Locale.CANADA;
        java.lang.String str41 = dateTimeZone36.getName((long) (short) 0, locale40);
        java.util.TimeZone timeZone42 = dateTimeZone36.toTimeZone();
        org.joda.time.DateTime dateTime43 = localDate34.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.DateTime dateTime44 = localDate34.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate46 = localDate34.withCenturyOfEra(900000);
        org.joda.time.LocalDate localDate48 = localDate46.withWeekyear(86399);
        org.joda.time.DateTime dateTime49 = dateTime22.withFields((org.joda.time.ReadablePartial) localDate48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant35", (dateTime1.compareTo(instant35) == 0) == dateTime1.equals(instant35));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(912);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusWeeks(53700);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.monthOfYear();
        long long19 = dateTimeField17.roundHalfCeiling((long) (short) 100);
        long long21 = dateTimeField17.remainder((long) 69);
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str24 = locale23.getISO3Language();
        int int25 = dateTimeField17.getMaximumShortTextLength(locale23);
        boolean boolean26 = dateTimeField17.isLenient();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone29.nextTransition((long) 893);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = dateTimeZone29.getName((long) (short) 0, locale33);
        java.lang.String str35 = dateTimeField17.getAsText(1645455240177L, locale33);
        java.lang.String str36 = locale33.getDisplayVariant();
        java.lang.String str37 = localDateTime11.toString("days", locale33);
        int int38 = localDateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime43 = dateTime40.withFieldAdded(durationFieldType41, 0);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.DateTime dateTime46 = dateTime40.plusDays(1970);
        org.joda.time.DateTime.Property property47 = dateTime40.yearOfEra();
        boolean boolean48 = localDateTime11.equals((java.lang.Object) property47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant28 and dateTime40", (instant28.compareTo(dateTime40) == 0) == instant28.equals(dateTime40));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        java.util.Date date15 = new java.util.Date((long) (byte) 0);
        int int16 = date15.getMinutes();
        int int17 = date15.getDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) date15, chronology18);
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone23.nextTransition((long) 893);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone23.getMillisKeepLocal(dateTimeZone27, 0L);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone23);
        java.util.Date date32 = new java.util.Date((long) (byte) 0);
        int int33 = date32.getMinutes();
        int int34 = date32.getDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) date32, chronology35);
        org.joda.time.LocalDate localDate38 = localDate36.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        long long42 = dateTimeZone40.nextTransition((long) 893);
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone44 = instant43.getZone();
        long long46 = dateTimeZone40.getMillisKeepLocal(dateTimeZone44, 0L);
        org.joda.time.DateTime dateTime47 = localDate36.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.DateTime dateTime48 = localDate19.toDateTimeAtStartOfDay(dateTimeZone40);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate51 = localDate19.withPeriodAdded(readablePeriod49, 122);
        org.joda.time.LocalDate localDate53 = localDate51.withYearOfEra(21);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime58 = dateTime55.withFieldAdded(durationFieldType56, 0);
        org.joda.time.DateTime.Property property59 = dateTime55.minuteOfDay();
        org.joda.time.DateTime dateTime60 = property59.withMinimumValue();
        org.joda.time.DateTime.Property property61 = dateTime60.secondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime60.withSecondOfMinute(7);
        int int64 = dateTime60.getEra();
        org.joda.time.DateTime dateTime65 = localDate51.toDateTime((org.joda.time.ReadableInstant) dateTime60);
        int int66 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime65);
        int int68 = dateTimeZone12.getStandardOffset(1645455454218L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant22", (dateTime13.compareTo(instant22) == 0) == dateTime13.equals(instant22));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime18 = dateTime15.withFieldAdded(durationFieldType16, 0);
        org.joda.time.DateTime.Property property19 = dateTime15.minuteOfDay();
        org.joda.time.DateTime dateTime20 = property19.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property21 = dateTime20.secondOfMinute();
        java.util.Date date22 = dateTime20.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property24 = dateTime20.property(dateTimeFieldType23);
        int int25 = localTime13.get(dateTimeFieldType23);
        org.joda.time.LocalTime localTime27 = localTime13.plusHours(289);
        org.joda.time.LocalTime.Property property28 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) localTime13);
        org.joda.time.LocalTime localTime31 = localTime13.withMillisOfDay(333);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusWeeks(10);
        org.joda.time.DateTime.Property property19 = dateTime15.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime15.toGregorianCalendar();
        gregorianCalendar20.clear();
        java.util.Locale locale24 = new java.util.Locale("hi!", "");
        boolean boolean25 = locale24.hasExtensions();
        boolean boolean26 = gregorianCalendar20.after((java.lang.Object) locale24);
        java.util.Locale locale30 = new java.util.Locale("+00:00", "Property[monthOfYear]", "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        java.lang.String str31 = locale30.getLanguage();
        java.lang.String str32 = locale24.getDisplayCountry(locale30);
        java.lang.String str33 = dateTimeZone12.getShortName(14L, locale24);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        int int36 = localDateTime35.getWeekyear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusHours((int) (byte) -1);
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        long long42 = dateTimeZone40.nextTransition((long) 893);
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = dateTimeZone40.getName((long) (short) 0, locale44);
        java.util.TimeZone timeZone46 = dateTimeZone40.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter48 = null;
        org.joda.time.format.DateTimeParser dateTimeParser49 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter48, dateTimeParser49);
        org.joda.time.format.DateTimeParser dateTimeParser51 = dateTimeFormatter50.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter50.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter50.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter55.withPivotYear((java.lang.Integer) 14);
        int int60 = dateTimeFormatter55.getDefaultYear();
        java.util.Locale locale61 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter55.withLocale(locale61);
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.lang.String str64 = locale61.getDisplayScript(locale63);
        java.lang.String str65 = dateTimeZone40.getName((-61788528000000L), locale61);
        org.joda.time.DateTime dateTime66 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property67 = localDateTime35.weekyear();
        boolean boolean68 = dateTimeZone12.isLocalDateTimeGap(localDateTime35);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime35.plusHours(952);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant39", (dateTime15.compareTo(instant39) == 0) == dateTime15.equals(instant39));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        long long8 = copticChronology2.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField9 = copticChronology2.months();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology2.dayOfMonth();
        org.joda.time.DurationField durationField12 = durationFieldType1.getField((org.joda.time.Chronology) copticChronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.Instant instant18 = instant16.withMillis((long) 1);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone24, 0L);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) instant16, dateTimeZone24);
        org.joda.time.LocalTime localTime29 = localTime27.minusMillis(12);
        org.joda.time.Chronology chronology30 = localTime27.getChronology();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology30);
        boolean boolean32 = durationFieldType14.isSupported(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = durationFieldType1.getField(chronology30);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(1645455654295L, chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField12 and durationField34", (durationField12.compareTo(durationField34) == 0) == durationField12.equals(durationField34));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.withYear((int) '4');
        java.util.Date date25 = localDate24.toDate();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.clockhourOfDay();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 25, (org.joda.time.Chronology) copticChronology27);
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology27.getZone();
        org.joda.time.DateMidnight dateMidnight33 = localDate24.toDateMidnight(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime38 = dateTime35.withFieldAdded(durationFieldType36, 0);
        org.joda.time.DateTime.Property property39 = dateTime35.minuteOfDay();
        org.joda.time.DateTime dateTime40 = property39.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property41 = dateTime40.secondOfMinute();
        int int42 = dateTime40.getDayOfMonth();
        org.joda.time.DateTime.Property property43 = dateTime40.era();
        org.joda.time.DateTime dateTime45 = dateTime40.withYearOfEra(808);
        java.util.Date date47 = new java.util.Date((long) (byte) 0);
        int int48 = date47.getMinutes();
        int int49 = date47.getDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((java.lang.Object) date47, chronology50);
        org.joda.time.LocalDate localDate53 = localDate51.withYear((-1));
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfEra();
        org.joda.time.DateTimeField dateTimeField55 = property54.getField();
        org.joda.time.LocalDate localDate57 = property54.addToCopy((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDate localDate60 = localDate57.withFieldAdded(durationFieldType58, (-2720));
        org.joda.time.DateTime dateTime62 = dateTime45.withFieldAdded(durationFieldType58, 996);
        boolean boolean63 = localDate24.isSupported(durationFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime35", (instant8.compareTo(dateTime35) == 0) == instant8.equals(dateTime35));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime6 = instant0.toDateTime();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone12, 0L);
        long long16 = dateTimeZone12.nextTransition((long) (-1));
        org.joda.time.MutableDateTime mutableDateTime17 = instant0.toMutableDateTime(dateTimeZone12);
        org.joda.time.Instant instant19 = instant0.minus(1645458372458L);
        org.joda.time.MutableDateTime mutableDateTime20 = instant0.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant7", (dateTime3.compareTo(instant7) == 0) == dateTime3.equals(instant7));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekyear(9);
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.plusMonths(241);
        org.joda.time.DateTime dateTime9 = dateTime5.withCenturyOfEra(669);
        org.joda.time.Instant instant10 = dateTime5.toInstant();
        boolean boolean11 = instant10.isEqualNow();
        org.joda.time.DateTime dateTime12 = instant10.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime17 = dateTime14.withFieldAdded(durationFieldType15, 0);
        org.joda.time.DateTime.Property property18 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = property18.withMinimumValue();
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        org.joda.time.DateTime dateTime22 = dateTime19.plusDays((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime12.withZone(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 790, dateTimeZone23);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant10", (dateTime2.compareTo(instant10) == 0) == dateTime2.equals(instant10));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime4.plus(1320000L);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(2);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMonths(283);
        org.joda.time.DateTime dateTime17 = dateTime11.withYear(4507125);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        org.joda.time.Instant instant17 = instant0.withDurationAdded((-1900800000L), 734);
        org.joda.time.Instant instant19 = instant17.withMillis((long) 887);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant17.plus(readableDuration20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime10.toMutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) localDate7, dateTimeZone13);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone13);
        long long19 = dateTimeZone13.previousTransition((long) 16);
        boolean boolean21 = dateTimeZone13.isStandardOffset((long) 577);
        long long24 = dateTimeZone13.convertLocalToUTC(1645455448172L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        timeZone7.setID("Property[secondOfMinute]");
        timeZone7.setRawOffset(650);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.DurationField durationField22 = dateTimeField21.getRangeDurationField();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        long long26 = dateTimeField21.set((long) 8, "53640", locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone7, locale25);
        java.time.Instant instant29 = calendar28.toInstant();
        java.util.TimeZone timeZone30 = null;
        calendar28.setTimeZone(timeZone30);
        java.util.Calendar.Builder builder32 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 893);
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = dateTimeZone34.getName((long) (short) 0, locale38);
        java.util.TimeZone timeZone40 = dateTimeZone34.toTimeZone();
        timeZone40.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder43 = builder32.setTimeZone(timeZone40);
        timeZone40.setRawOffset(0);
        int int47 = timeZone40.getOffset((long) 4);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone48);
        int int50 = dateTime49.getMinuteOfDay();
        org.joda.time.Instant instant51 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone52 = instant51.getZone();
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime49.toMutableDateTime(dateTimeZone52);
        int int54 = dateTime49.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant55 = null;
        boolean boolean56 = dateTime49.isEqual(readableInstant55);
        java.util.Date date58 = new java.util.Date((long) (byte) 0);
        int int59 = date58.getMinutes();
        int int60 = date58.getDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) date58, chronology61);
        org.joda.time.LocalDate localDate64 = localDate62.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant65 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone66 = instant65.getZone();
        long long68 = dateTimeZone66.nextTransition((long) 893);
        org.joda.time.Instant instant69 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone70 = instant69.getZone();
        long long72 = dateTimeZone66.getMillisKeepLocal(dateTimeZone70, 0L);
        org.joda.time.DateTime dateTime73 = localDate62.toDateTimeAtMidnight(dateTimeZone66);
        org.joda.time.DateTime dateTime74 = dateTime49.withZoneRetainFields(dateTimeZone66);
        java.lang.String str75 = dateTimeZone66.getID();
        java.util.TimeZone timeZone76 = dateTimeZone66.toTimeZone();
        boolean boolean77 = timeZone40.hasSameRules(timeZone76);
        calendar28.setTimeZone(timeZone40);
        boolean boolean79 = timeZone40.observesDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime49", (instant0.compareTo(dateTime49) == 0) == instant0.equals(dateTime49));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        int int3 = dateTime2.getMinuteOfDay();
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime(dateTimeZone5);
        int int7 = dateTime2.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant8 = null;
        boolean boolean9 = dateTime2.isEqual(readableInstant8);
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.DateTime dateTime27 = dateTime2.withZoneRetainFields(dateTimeZone19);
        java.util.TimeZone timeZone28 = dateTimeZone19.toTimeZone();
        java.lang.String str30 = dateTimeZone19.getNameKey(14L);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(708L, dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant4", (dateTime2.compareTo(instant4) == 0) == dateTime2.equals(instant4));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 53);
        org.joda.time.Instant instant3 = instant0.toInstant();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.DateTime dateTime5 = instant4.toDateTime();
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 25, (org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology12.getZone();
        org.joda.time.Chronology chronology18 = copticChronology7.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate6.toDateTimeAtStartOfDay(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime5", (instant0.compareTo(dateTime5) == 0) == instant0.equals(dateTime5));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        int int8 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime7.getZone();
        long long11 = dateTimeZone9.convertUTCToLocal((long) 993);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        int int15 = dateTime14.getMinuteOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.plusWeeks(10);
        org.joda.time.DateTime.Property property18 = dateTime14.minuteOfDay();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone24, 0L);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime14.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone20);
        long long32 = dateTimeZone20.convertLocalToUTC((long) 53664488, false, (long) 3);
        long long34 = dateTimeZone9.getMillisKeepLocal(dateTimeZone20, (long) 54081202);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant19", (dateTime1.compareTo(instant19) == 0) == dateTime1.equals(instant19));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 16, 22);
        org.joda.time.DateTime dateTime9 = dateTime7.withHourOfDay(16);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.plusWeeks(10);
        org.joda.time.DateTime.Property property15 = dateTime11.minuteOfDay();
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone17.nextTransition((long) 893);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone17.getMillisKeepLocal(dateTimeZone21, 0L);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime11.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime7.toMutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime7.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance();
        long long36 = copticChronology30.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField37 = copticChronology30.months();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType29.getField((org.joda.time.Chronology) copticChronology30);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology30.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone41 = copticChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology30.weekyear();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(35L, (org.joda.time.Chronology) copticChronology30);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology30.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology30.era();
        org.joda.time.DateTime dateTime46 = dateTime7.toDateTime((org.joda.time.Chronology) copticChronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime24", (dateTime1.compareTo(mutableDateTime24) == 0) == dateTime1.equals(mutableDateTime24));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        boolean boolean27 = dateTimeZone24.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 3);
        boolean boolean30 = dateTimeZone24.equals((java.lang.Object) 3);
        org.joda.time.DateTime dateTime31 = dateTime19.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant34.withDurationAdded(readableDuration36, 2);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        int int41 = dateTime40.getMinuteOfDay();
        org.joda.time.DateTime dateTime43 = dateTime40.plusWeeks(10);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone46.nextTransition((long) 893);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone50, 0L);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime40.toMutableDateTime(dateTimeZone46);
        boolean boolean54 = instant38.isEqual((org.joda.time.ReadableInstant) dateTime40);
        int int55 = property32.compareTo((org.joda.time.ReadableInstant) instant38);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Instant instant57 = instant38.plus(readableDuration56);
        org.joda.time.MutableDateTime mutableDateTime58 = instant57.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone27);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromCalendarFields(calendar28);
        calendar28.setTimeInMillis((long) 146852);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.LocalTime localTime15 = dateTime13.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant14", (dateTime13.compareTo(instant14) == 0) == dateTime13.equals(instant14));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        org.joda.time.DateTime.Property property9 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        java.lang.String str11 = property9.toString();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime15.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime15.getFields();
        org.joda.time.LocalDateTime.Property property20 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        java.util.Locale.Category category25 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category25, locale26);
        java.util.Calendar calendar28 = dateTime24.toCalendar(locale26);
        org.joda.time.DateTime dateTime30 = dateTime24.withMillis(27738633602000L);
        int int31 = dateTime24.getSecondOfMinute();
        java.lang.String str33 = dateTime24.toString("7");
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("minuteOfDay");
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone39);
        boolean boolean41 = timeZone35.hasSameRules(timeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime43 = dateTime24.toDateTime(dateTimeZone42);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone45 = instant44.getZone();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int48 = localDateTime46.get(dateTimeFieldType47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = property49.addToCopy(893L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withEra(1);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withEra(1);
        int int60 = localDateTime53.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        int int61 = localDateTime51.compareTo((org.joda.time.ReadablePartial) localDateTime57);
        org.joda.time.Chronology chronology62 = localDateTime51.getChronology();
        java.lang.String str63 = localDateTime51.toString();
        org.joda.time.DateTime dateTime64 = dateTime43.withFields((org.joda.time.ReadablePartial) localDateTime51);
        int int65 = property9.getDifference((org.joda.time.ReadableInstant) dateTime64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.days();
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology17.months();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = copticChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology17.dayOfYear();
        boolean boolean24 = durationFieldType16.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DurationField durationField25 = copticChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology17.millisOfSecond();
        java.util.Locale locale28 = null;
        int int29 = dateTimeField27.getMaximumShortTextLength(locale28);
        int int30 = dateTime14.get(dateTimeField27);
        long long33 = dateTimeField27.addWrapField(1645455479786L, 53833);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime24 = dateTime19.plus(900000L);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime19.plusSeconds(348);
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        long long39 = dateTimeZone35.nextTransition((long) (-1));
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        boolean boolean41 = instant40.isAfterNow();
        org.joda.time.Instant instant43 = instant40.plus((long) 53671795);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withDayOfWeek(2);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime45);
        int int49 = dateTime48.getEra();
        boolean boolean50 = instant40.isBefore((org.joda.time.ReadableInstant) dateTime48);
        int int51 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) instant40);
        long long54 = dateTimeZone35.convertLocalToUTC(1645455327957L, false);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) calendar29, dateTimeZone35);
        java.lang.String str56 = dateTime55.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant30", (dateTime1.compareTo(instant30) == 0) == dateTime1.equals(instant30));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.DateTime dateTime13 = dateTime6.minusHours(670);
        org.joda.time.Instant instant14 = dateTime6.toInstant();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = dateTimeZone16.getName((long) (short) 0, locale20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone16);
        org.joda.time.LocalTime localTime24 = localTime22.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfWeek(2);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) dateTime26);
        int int30 = dateTime29.getEra();
        org.joda.time.TimeOfDay timeOfDay31 = dateTime29.toTimeOfDay();
        org.joda.time.DateTime dateTime33 = dateTime29.plusSeconds(21);
        org.joda.time.DateTime dateTime35 = dateTime29.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime36 = localTime24.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readableDuration37);
        boolean boolean39 = instant14.isEqual((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime41 = dateTime38.minusYears(352);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant15", (dateTime1.compareTo(instant15) == 0) == dateTime1.equals(instant15));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime24 = dateTime19.plus(900000L);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime19.plusSeconds(348);
        org.joda.time.DateTime dateTime28 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology29.halfdayOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withEra(1);
        int int41 = localDateTime40.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime40.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusSeconds((int) (byte) 10);
        int int46 = localDateTime45.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plusYears(0);
        boolean boolean49 = copticChronology29.equals((java.lang.Object) localDateTime48);
        org.joda.time.DurationField durationField50 = copticChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology29.yearOfCentury();
        org.joda.time.DateTime dateTime53 = dateTime19.toDateTime((org.joda.time.Chronology) copticChronology29);
        java.lang.String str54 = dateTime19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime53", (dateTime19.compareTo(dateTime53) == 0) == dateTime19.equals(dateTime53));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfWeek(2);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime18);
        boolean boolean22 = dateTime6.isEqualNow();
        org.joda.time.DateTime.Property property23 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.Instant instant26 = instant24.plus((long) 53);
        org.joda.time.Instant instant27 = instant24.toInstant();
        org.joda.time.Instant instant30 = instant24.withDurationAdded(0L, (int) ' ');
        long long31 = instant24.getMillis();
        int int32 = dateTime6.compareTo((org.joda.time.ReadableInstant) instant24);
        long long33 = instant24.getMillis();
        org.joda.time.DateTime dateTime34 = instant24.toDateTimeISO();
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean38 = dateTime34.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.minusMonths(53674252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant24", (dateTime1.compareTo(instant24) == 0) == dateTime1.equals(instant24));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        org.joda.time.DateTime dateTime14 = instant0.toDateTimeISO();
        org.joda.time.Instant instant17 = instant0.withDurationAdded((-1900800000L), 734);
        org.joda.time.Instant instant19 = instant17.withMillis((long) 887);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        java.lang.Object obj22 = null;
        boolean boolean23 = instant21.equals(obj22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.LocalDate localDate22 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.Chronology chronology23 = localDate11.getChronology();
        org.joda.time.LocalDate localDate25 = localDate11.minusDays(53732568);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withYearOfEra(893);
        org.joda.time.Instant instant30 = dateTime27.toInstant();
        org.joda.time.DateTime.Property property31 = dateTime27.dayOfMonth();
        org.joda.time.DateTime dateTime32 = property31.withMinimumValue();
        java.util.Date date34 = new java.util.Date((long) (byte) 0);
        int int35 = date34.getMinutes();
        int int36 = date34.getDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((java.lang.Object) date34, chronology37);
        org.joda.time.LocalDate localDate40 = localDate38.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone42.getMillisKeepLocal(dateTimeZone46, 0L);
        org.joda.time.DateTime dateTime49 = localDate38.toDateTimeAtMidnight(dateTimeZone42);
        java.util.Date date51 = new java.util.Date((long) (byte) 0);
        int int52 = date51.getMinutes();
        int int53 = date51.getDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) date51, chronology54);
        org.joda.time.LocalDate localDate57 = localDate55.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        long long61 = dateTimeZone59.nextTransition((long) 893);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        long long65 = dateTimeZone59.getMillisKeepLocal(dateTimeZone63, 0L);
        org.joda.time.DateTime dateTime66 = localDate55.toDateTimeAtMidnight(dateTimeZone59);
        org.joda.time.DateTime dateTime67 = localDate38.toDateTimeAtStartOfDay(dateTimeZone59);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.LocalDate localDate70 = localDate38.withPeriodAdded(readablePeriod68, 122);
        org.joda.time.LocalDate localDate72 = localDate70.withYearOfEra(21);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        org.joda.time.DateTime dateTime76 = localDate70.toDateTimeAtMidnight(dateTimeZone75);
        org.joda.time.LocalDate.Property property77 = localDate70.yearOfCentury();
        org.joda.time.LocalDate localDate78 = property77.withMinimumValue();
        org.joda.time.LocalDate localDate79 = property77.roundCeilingCopy();
        org.joda.time.Instant instant82 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone83 = instant82.getZone();
        long long85 = dateTimeZone83.nextTransition((long) 893);
        java.lang.String str87 = dateTimeZone83.getName((long) 100);
        org.joda.time.LocalDate localDate88 = org.joda.time.LocalDate.now(dateTimeZone83);
        org.joda.time.LocalDate localDate89 = new org.joda.time.LocalDate((long) 7, dateTimeZone83);
        org.joda.time.LocalDate localDate90 = new org.joda.time.LocalDate(0L, dateTimeZone83);
        org.joda.time.Interval interval91 = localDate79.toInterval(dateTimeZone83);
        java.util.TimeZone timeZone92 = dateTimeZone83.toTimeZone();
        org.joda.time.LocalDate localDate93 = new org.joda.time.LocalDate((java.lang.Object) dateTime32, dateTimeZone83);
        org.joda.time.Interval interval94 = localDate11.toInterval(dateTimeZone83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime27", (instant12.compareTo(dateTime27) == 0) == instant12.equals(dateTime27));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 32772, dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long9 = copticChronology3.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField10 = copticChronology3.months();
        java.lang.String str11 = copticChronology3.toString();
        int int12 = copticChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfYear();
        java.lang.String str15 = copticChronology3.toString();
        java.lang.String str16 = copticChronology3.toString();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField18 = copticChronology3.millis();
        boolean boolean19 = localDate2.equals((java.lang.Object) durationField18);
        int int20 = localDate2.getDayOfMonth();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime dateTime23 = localDate2.toDateTime((org.joda.time.ReadableInstant) instant21);
        java.util.Date date25 = new java.util.Date((long) (byte) 0);
        int int26 = date25.getMinutes();
        int int27 = date25.getDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) date25, chronology28);
        int int30 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate localDate32 = localDate29.minusWeeks(272);
        org.joda.time.LocalDate.Property property33 = localDate32.dayOfYear();
        org.joda.time.LocalDate localDate34 = property33.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property35 = localDate34.era();
        java.util.Date date36 = localDate34.toDate();
        org.joda.time.LocalDate localDate38 = localDate34.plusYears(53728689);
        boolean boolean39 = localDate2.equals((java.lang.Object) localDate34);
        org.joda.time.LocalDate localDate41 = localDate2.minusMonths(54040);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime22", (instant21.compareTo(dateTime22) == 0) == instant21.equals(dateTime22));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(4);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate24.minus(readablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        long long34 = copticChronology28.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField35 = copticChronology28.months();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType27.getField((org.joda.time.Chronology) copticChronology28);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone39 = copticChronology28.getZone();
        org.joda.time.DurationField durationField40 = copticChronology28.years();
        org.joda.time.DurationField durationField41 = copticChronology28.seconds();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) readablePeriod25, (org.joda.time.Chronology) copticChronology28);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMillis((-90000002));
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime49 = dateTime46.withFieldAdded(durationFieldType47, 0);
        org.joda.time.DateTime.Property property50 = dateTime46.minuteOfDay();
        org.joda.time.DateTime dateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfMinute();
        org.joda.time.DateTime.Property property53 = dateTime51.secondOfDay();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime56 = dateTime51.withDurationAdded(readableDuration54, 6);
        org.joda.time.DateTime dateTime58 = dateTime51.minusHours(670);
        org.joda.time.Instant instant59 = dateTime51.toInstant();
        org.joda.time.Instant instant61 = instant59.plus(1645455464706L);
        org.joda.time.Instant instant63 = instant59.minus((long) 598);
        int int64 = dateTime42.compareTo((org.joda.time.ReadableInstant) instant63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Instant instant66 = instant63.plus(readableDuration65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime42", (instant8.compareTo(dateTime42) == 0) == instant8.equals(dateTime42));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime6.withDurationAdded((long) 11, 52);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        int int18 = dateTime17.getMinuteOfDay();
        int int19 = instant14.compareTo((org.joda.time.ReadableInstant) dateTime17);
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Calendar calendar21 = dateTime17.toCalendar(locale20);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        int int26 = dateTime25.getMinuteOfDay();
        int int27 = instant22.compareTo((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.util.Calendar calendar29 = dateTime25.toCalendar(locale28);
        boolean boolean30 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime25);
        int int31 = dateTime25.getYearOfEra();
        long long32 = dateTime25.getMillis();
        java.util.Locale locale33 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet34 = locale33.getUnicodeLocaleKeys();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime39 = dateTime36.withFieldAdded(durationFieldType37, 0);
        org.joda.time.DateTime.Property property40 = dateTime36.minuteOfDay();
        org.joda.time.DateTime dateTime41 = property40.withMinimumValue();
        org.joda.time.DateTime.Property property42 = dateTime41.secondOfMinute();
        org.joda.time.DateTime dateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime45 = dateTime43.plusMillis(1970);
        boolean boolean46 = strSet34.remove((java.lang.Object) dateTime43);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(0, 9, (int) (byte) 1, 0, 15);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone53);
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime57 = dateTime54.withFieldAdded(durationFieldType55, 0);
        org.joda.time.DateTime.Property property58 = dateTime54.minuteOfDay();
        org.joda.time.DateTime dateTime59 = property58.withMinimumValue();
        org.joda.time.DateTime.Property property60 = dateTime59.era();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology61);
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withEra(1);
        int int65 = localDateTime64.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = localDateTime64.getFieldType(2);
        java.lang.String str68 = dateTimeFieldType67.getName();
        int int69 = dateTime59.get(dateTimeFieldType67);
        org.joda.time.chrono.CopticChronology copticChronology70 = org.joda.time.chrono.CopticChronology.getInstance();
        long long76 = copticChronology70.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField77 = copticChronology70.months();
        java.lang.String str78 = copticChronology70.toString();
        int int79 = copticChronology70.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField80 = copticChronology70.weekyears();
        org.joda.time.DateTimeField dateTimeField81 = copticChronology70.dayOfYear();
        java.lang.String str82 = copticChronology70.toString();
        boolean boolean83 = dateTimeFieldType67.isSupported((org.joda.time.Chronology) copticChronology70);
        org.joda.time.DurationFieldType durationFieldType84 = dateTimeFieldType67.getDurationType();
        int int85 = localDateTime52.get(dateTimeFieldType67);
        int int86 = dateTime43.get(dateTimeFieldType67);
        java.lang.String str87 = dateTimeFieldType67.getName();
        boolean boolean88 = dateTime25.isSupported(dateTimeFieldType67);
        boolean boolean89 = dateTime6.isSupported(dateTimeFieldType67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant14", (dateTime1.compareTo(instant14) == 0) == dateTime1.equals(instant14));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.minusHours((-2));
        org.joda.time.DateTime dateTime11 = dateTime9.minus(1645455284589L);
        org.joda.time.DateTime dateTime13 = dateTime11.plusSeconds(53738918);
        int int14 = dateTime13.getWeekyear();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = dateTimeZone16.getName((long) (short) 0, locale20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone16);
        org.joda.time.LocalTime localTime24 = localTime22.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfWeek(2);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) dateTime26);
        int int30 = dateTime29.getEra();
        org.joda.time.TimeOfDay timeOfDay31 = dateTime29.toTimeOfDay();
        org.joda.time.DateTime dateTime33 = dateTime29.plusSeconds(21);
        org.joda.time.DateTime dateTime35 = dateTime29.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime36 = localTime24.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getRangeDurationType();
        int int39 = dateTime36.get(dateTimeFieldType37);
        int int40 = dateTime36.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime43 = dateTime36.withPeriodAdded(readablePeriod41, 490);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime48 = dateTime45.withDurationAdded((long) (byte) 10, (int) 'a');
        boolean boolean49 = dateTime43.isEqual((org.joda.time.ReadableInstant) dateTime48);
        int int50 = dateTime48.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime48.plus(readableDuration51);
        int int53 = dateTime48.getSecondOfDay();
        boolean boolean54 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant15", (dateTime1.compareTo(instant15) == 0) == dateTime1.equals(instant15));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        java.lang.String str8 = copticChronology0.toString();
        int int9 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology0.dayOfYear();
        java.lang.String str12 = copticChronology0.toString();
        java.lang.String str13 = copticChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology0.secondOfDay();
        java.util.Date date16 = new java.util.Date((long) (byte) 0);
        int int17 = date16.getMinutes();
        int int18 = date16.getDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) date16, chronology19);
        org.joda.time.LocalDate localDate22 = localDate20.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone24.nextTransition((long) 893);
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        long long30 = dateTimeZone24.getMillisKeepLocal(dateTimeZone28, 0L);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.LocalDate localDate33 = localDate20.withCenturyOfEra(14);
        long long35 = copticChronology0.set((org.joda.time.ReadablePartial) localDate33, 19439481600100L);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.yearOfEra();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.LocalDate localDate39 = localDate37.plusYears((-2));
        java.util.Date date41 = new java.util.Date((long) (byte) 0);
        int int42 = date41.getMinutes();
        int int43 = date41.getDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((java.lang.Object) date41, chronology44);
        org.joda.time.LocalDate localDate47 = localDate45.withYear((-1));
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfEra();
        org.joda.time.DateTimeField dateTimeField49 = property48.getField();
        org.joda.time.LocalDate localDate51 = property48.addToCopy((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDate localDate54 = localDate51.withFieldAdded(durationFieldType52, (-2720));
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean56 = localDate51.isSupported(dateTimeFieldType55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance();
        long long64 = copticChronology58.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField65 = copticChronology58.months();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType57.getField((org.joda.time.Chronology) copticChronology58);
        org.joda.time.DateTimeField dateTimeField67 = copticChronology58.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology58.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone69 = copticChronology58.getZone();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(dateTimeZone69);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime(dateTimeZone72);
        org.joda.time.DurationFieldType durationFieldType74 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime76 = dateTime73.withFieldAdded(durationFieldType74, 0);
        org.joda.time.DateTime.Property property77 = dateTime73.minuteOfDay();
        org.joda.time.DateTime dateTime78 = property77.withMinimumValue();
        org.joda.time.DateTime dateTime80 = property77.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime81 = property77.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property83 = dateTime81.property(dateTimeFieldType82);
        boolean boolean84 = dateTime70.isSupported(dateTimeFieldType82);
        boolean boolean85 = localDate51.isSupported(dateTimeFieldType82);
        boolean boolean86 = localDate37.isSupported(dateTimeFieldType82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant23 and dateTime70", (instant23.compareTo(dateTime70) == 0) == instant23.equals(dateTime70));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        java.lang.String str11 = dateTimeZone6.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 57635003L, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        int int14 = localDateTime12.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusSeconds(59);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime24 = dateTime21.withDurationAdded((long) 16, 22);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime21.getZone();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.secondOfMinute();
        org.joda.time.DurationField durationField29 = copticChronology27.months();
        org.joda.time.DateTimeZone dateTimeZone30 = copticChronology27.getZone();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology27.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology27.yearOfCentury();
        boolean boolean34 = durationFieldType26.isSupported((org.joda.time.Chronology) copticChronology27);
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        long long41 = copticChronology35.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField42 = copticChronology35.months();
        java.lang.String str43 = copticChronology35.toString();
        int int44 = copticChronology35.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField45 = copticChronology35.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = copticChronology35.dayOfYear();
        org.joda.time.DurationField durationField47 = copticChronology35.millis();
        org.joda.time.DurationField durationField48 = durationFieldType26.getField((org.joda.time.Chronology) copticChronology35);
        org.joda.time.DateTime dateTime50 = dateTime21.withFieldAdded(durationFieldType26, 53833);
        boolean boolean51 = localDateTime16.isSupported(durationFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        long long28 = dateTimeZone18.nextTransition(0L);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        java.lang.String str31 = dateTimeZone18.getShortName((long) 148);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime9.getFields();
        int int14 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property15 = localDateTime9.era();
        int int16 = localDateTime9.getDayOfWeek();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        long long27 = dateTimeZone18.convertLocalToUTC((long) 11, false);
        long long29 = dateTimeZone18.nextTransition((long) '#');
        org.joda.time.DateTime dateTime30 = localDateTime9.toDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone7.nextTransition((long) 893);
        java.util.Locale locale11 = java.util.Locale.CANADA;
        java.lang.String str12 = dateTimeZone7.getName((long) (short) 0, locale11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(dateTimeZone7);
        org.joda.time.LocalTime localTime15 = localTime13.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withDayOfWeek(2);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) dateTime17);
        int int21 = dateTime20.getEra();
        org.joda.time.TimeOfDay timeOfDay22 = dateTime20.toTimeOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime27 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getRangeDurationType();
        int int30 = dateTime27.get(dateTimeFieldType28);
        int int31 = dateTime27.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime34 = dateTime27.withPeriodAdded(readablePeriod32, 490);
        boolean boolean35 = instant0.isBefore((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.Instant instant36 = instant0.toInstant();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime42 = dateTime39.withFieldAdded(durationFieldType40, 0);
        boolean boolean43 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateTime42);
        int int44 = dateTime37.getMillisOfDay();
        org.joda.time.DateTime dateTime46 = dateTime37.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime49 = dateTime46.withDurationAdded(21859200000L, (int) '4');
        org.joda.time.DateTime dateTime51 = dateTime49.withSecondOfMinute(3);
        int int52 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant6", (dateTime3.compareTo(instant6) == 0) == dateTime3.equals(instant6));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime0.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime0.withDurationAdded((long) 22, 4);
        org.joda.time.DateTime dateTime13 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology14);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology24.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.dayOfYear();
        boolean boolean33 = copticChronology14.equals((java.lang.Object) copticChronology24);
        org.joda.time.DateTime dateTime34 = dateTime0.withChronology((org.joda.time.Chronology) copticChronology14);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readableDuration35);
        int int37 = dateTime34.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime34", (dateTime0.compareTo(dateTime34) == 0) == dateTime0.equals(dateTime34));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.DateTime dateTime8 = dateTime4.withCenturyOfEra(669);
        int int9 = dateTime4.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear(9);
        org.joda.time.DateTime dateTime14 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.plus(readablePeriod17);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMonths(3);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readablePeriod22);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology24.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField31 = copticChronology24.months();
        java.lang.String str32 = copticChronology24.toString();
        int int33 = copticChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField34 = copticChronology24.weekyears();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((org.joda.time.Chronology) copticChronology24);
        org.joda.time.DateTime dateTime36 = dateTime21.toDateTime((org.joda.time.Chronology) copticChronology24);
        org.joda.time.DateTime dateTime37 = dateTime4.toDateTime((org.joda.time.Chronology) copticChronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime36", (dateTime20.compareTo(dateTime36) == 0) == dateTime20.equals(dateTime36));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        boolean boolean26 = localDateTime18.isSupported(dateTimeFieldType25);
        java.lang.String str27 = dateTimeFieldType25.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField36 = copticChronology29.months();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType28.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology29.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType25.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        long long47 = dateTimeZone45.previousTransition(37152000120L);
        org.joda.time.Chronology chronology48 = copticChronology29.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime14.withZone(dateTimeZone45);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime51.plusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withDayOfYear(53);
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField58 = property57.getField();
        int int59 = dateTime49.get(dateTimeField58);
        java.util.Date date60 = dateTime49.toDate();
        java.util.Date date64 = new java.util.Date((int) (byte) 1, (int) (short) 1, 2);
        int int65 = date64.getDay();
        java.time.Instant instant66 = date64.toInstant();
        int int67 = date60.compareTo(date64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime49", (dateTime6.compareTo(dateTime49) == 0) == dateTime6.equals(dateTime49));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.Instant instant22 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology25.months();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.hourOfHalfday();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology25);
        org.joda.time.DurationField durationField31 = copticChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology25.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology25.era();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology25.era();
        org.joda.time.MutableDateTime mutableDateTime36 = instant24.toMutableDateTime((org.joda.time.Chronology) copticChronology25);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology25.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime36", (dateTime19.compareTo(mutableDateTime36) == 0) == dateTime19.equals(mutableDateTime36));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField11 = copticChronology0.days();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        org.joda.time.LocalDate localDate30 = localDate17.withCenturyOfEra(14);
        long long32 = copticChronology0.set((org.joda.time.ReadablePartial) localDate30, (long) 1080660000);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology34 = copticChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology0.hourOfDay();
        org.joda.time.DurationField durationField38 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField38", Math.signum(durationField11.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField11)));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long10 = copticChronology4.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology4.halfdayOfDay();
        org.joda.time.Chronology chronology12 = copticChronology4.withUTC();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime1.toMutableDateTime((org.joda.time.Chronology) copticChronology4);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology4.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime13", (dateTime1.compareTo(mutableDateTime13) == 0) == dateTime1.equals(mutableDateTime13));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.withMaximumValue();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str8 = locale7.getISO3Language();
        java.lang.String str9 = localTime4.toString("+00:00", locale7);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime4.withPeriodAdded(readablePeriod10, 881);
        org.joda.time.DateTime dateTime13 = localTime12.toDateTimeToday();
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.secondOfMinute();
        org.joda.time.DurationField durationField19 = copticChronology17.months();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology17.getZone();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter16.withZone(dateTimeZone20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withPivotYear(53716584);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withDefaultYear(500);
        org.joda.time.Chronology chronology27 = dateTimeFormatter22.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter22.withDefaultYear(1738);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance();
        long long37 = copticChronology31.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField38 = copticChronology31.months();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType30.getField((org.joda.time.Chronology) copticChronology31);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology31.weekOfWeekyear();
        org.joda.time.DurationField durationField42 = copticChronology31.months();
        org.joda.time.DurationField durationField43 = copticChronology31.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter22.withChronology((org.joda.time.Chronology) copticChronology31);
        org.joda.time.DateTime dateTime45 = dateTime13.withChronology((org.joda.time.Chronology) copticChronology31);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology31.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime45", (dateTime13.compareTo(dateTime45) == 0) == dateTime13.equals(dateTime45));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays(53953696);
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology4.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = copticChronology4.getZone();
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime((org.joda.time.Chronology) copticChronology4);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology4.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime8", (dateTime3.compareTo(dateTime8) == 0) == dateTime3.equals(dateTime8));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType(2);
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology13.secondOfMinute();
        org.joda.time.DurationField durationField15 = copticChronology13.months();
        org.joda.time.DateTimeZone dateTimeZone16 = copticChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology13.hourOfHalfday();
        boolean boolean18 = dateTimeFieldType12.isSupported((org.joda.time.Chronology) copticChronology13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 43, (org.joda.time.Chronology) copticChronology13);
        org.joda.time.Chronology chronology20 = copticChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime23 = instant2.toMutableDateTime((org.joda.time.Chronology) copticChronology13);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology13.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime23", (instant0.compareTo(mutableDateTime23) == 0) == instant0.equals(mutableDateTime23));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.clockhourOfDay();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField12 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology5.weekyearOfCentury();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        int int18 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime.Property property19 = localTime17.millisOfSecond();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalTime localTime23 = property19.addCopy(53663);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder27 = builder25.setInstant((long) 6);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        timeZone28.setID("hi!");
        java.util.Calendar.Builder builder31 = builder27.setTimeZone(timeZone28);
        java.util.Calendar calendar32 = builder27.build();
        java.util.Calendar.Builder builder36 = builder27.setWeekDate((int) (byte) 100, 44, (-292275054));
        java.util.Calendar.Builder builder41 = builder36.setTimeOfDay(0, 31, 5, 437);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(dateTimeZone42);
        int int44 = dateTime43.getMinuteOfDay();
        org.joda.time.DateTime dateTime46 = dateTime43.plusWeeks(10);
        int int47 = dateTime46.getMillisOfSecond();
        java.util.Date date48 = dateTime46.toDate();
        org.joda.time.DateTime dateTime49 = dateTime46.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime50 = dateTime49.toLocalTime();
        org.joda.time.LocalTime localTime52 = localTime50.minusMinutes((-1));
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime54 = localTime52.plus(readablePeriod53);
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = localTime52.toString("+00:00:00.650", locale56);
        java.util.Calendar.Builder builder58 = builder36.setLocale(locale56);
        java.lang.String str59 = localTime23.toString("de", locale56);
        org.joda.time.LocalTime localTime60 = localTime4.withFields((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.Instant instant61 = org.joda.time.Instant.now();
        org.joda.time.Instant instant63 = instant61.withMillis((long) 1);
        org.joda.time.Instant instant64 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone65 = instant64.getZone();
        long long67 = dateTimeZone65.nextTransition((long) 893);
        org.joda.time.Instant instant68 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone69 = instant68.getZone();
        long long71 = dateTimeZone65.getMillisKeepLocal(dateTimeZone69, 0L);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((java.lang.Object) instant61, dateTimeZone69);
        org.joda.time.LocalTime localTime74 = localTime72.minusMillis(12);
        org.joda.time.Chronology chronology75 = localTime72.getChronology();
        org.joda.time.LocalTime.Property property76 = localTime72.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType78 = dateTimeFieldType77.getRangeDurationType();
        boolean boolean79 = localTime72.isSupported(durationFieldType78);
        boolean boolean80 = localTime60.isSupported(durationFieldType78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localTime4 and localTime15", (localTime4.compareTo(localTime15) == 0) == localTime4.equals(localTime15));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.millisOfSecond();
        java.lang.String str9 = copticChronology6.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.withChronology((org.joda.time.Chronology) copticChronology6);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.secondOfMinute();
        org.joda.time.DurationField durationField14 = copticChronology12.months();
        org.joda.time.DateTimeZone dateTimeZone15 = copticChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology12.hourOfHalfday();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology12);
        org.joda.time.DurationField durationField18 = copticChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology12.secondOfDay();
        int int25 = dateTimeField23.getMaximumValue((long) 112);
        java.lang.String str26 = dateTimeField23.toString();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = locale28.getScript();
        java.lang.String str30 = dateTimeField23.getAsShortText(53859202, locale28);
        java.util.Calendar calendar31 = dateTime10.toCalendar(locale28);
        java.util.Locale.setDefault(locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate26 = localDate24.minusYears(900000);
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime32 = dateTime29.withFieldAdded(durationFieldType30, 0);
        org.joda.time.DateTime.Property property33 = dateTime29.minuteOfDay();
        org.joda.time.DateTime dateTime34 = property33.withMinimumValue();
        org.joda.time.DateTime.Property property35 = dateTime34.secondOfMinute();
        org.joda.time.DateTime dateTime37 = dateTime34.withSecondOfMinute(7);
        int int38 = dateTime34.getEra();
        org.joda.time.DateTime.Property property39 = dateTime34.millisOfSecond();
        long long40 = dateTime34.getMillis();
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime34.toYearMonthDay();
        org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology42.halfdayOfDay();
        long long47 = copticChronology42.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField48 = copticChronology42.minuteOfHour();
        org.joda.time.DurationField durationField49 = copticChronology42.months();
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime34.toMutableDateTime((org.joda.time.Chronology) copticChronology42);
        long long51 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str52 = property27.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and mutableDateTime50", (dateTime34.compareTo(mutableDateTime50) == 0) == dateTime34.equals(mutableDateTime50));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime.Property property3 = dateTime1.dayOfWeek();
        boolean boolean4 = dateTime1.isBeforeNow();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology5.months();
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology5.hourOfHalfday();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DurationField durationField11 = copticChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology5.weekyearOfCentury();
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getMinutes();
        int int16 = date14.getDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date14, chronology17);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, 0L);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate localDate31 = localDate18.minusDays(20);
        org.joda.time.LocalDate localDate33 = localDate31.plusWeeks(53);
        org.joda.time.LocalDate localDate35 = localDate31.plusWeeks(20);
        org.joda.time.LocalDate localDate37 = localDate31.withYearOfCentury(6);
        org.joda.time.LocalDate localDate39 = localDate31.plusMonths(5);
        org.joda.time.chrono.CopticChronology copticChronology40 = org.joda.time.chrono.CopticChronology.getInstance();
        long long46 = copticChronology40.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField47 = copticChronology40.months();
        java.util.Date date49 = new java.util.Date((long) (byte) 0);
        int int50 = date49.getMinutes();
        int int51 = date49.getDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) date49, chronology52);
        int int54 = localDate53.getDayOfWeek();
        org.joda.time.LocalDate localDate56 = localDate53.minusWeeks(272);
        int[] intArray58 = copticChronology40.get((org.joda.time.ReadablePartial) localDate56, (long) 21);
        copticChronology5.validate((org.joda.time.ReadablePartial) localDate31, intArray58);
        org.joda.time.DateTimeField dateTimeField60 = copticChronology5.hourOfDay();
        org.joda.time.DurationField durationField61 = copticChronology5.seconds();
        org.joda.time.DurationField durationField62 = copticChronology5.days();
        org.joda.time.DateTime dateTime63 = dateTime1.toDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTime dateTime65 = dateTime1.plusWeeks(484);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime63", (instant21.compareTo(dateTime63) == 0) == instant21.equals(dateTime63));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        int int8 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime7.era();
        int int11 = dateTime7.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime7.withPeriodAdded(readablePeriod12, 53919748);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField23 = copticChronology15.halfdays();
        long long27 = copticChronology15.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField28 = copticChronology15.days();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology15.minuteOfHour();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology15);
        org.joda.time.DateTime dateTime31 = dateTime7.withChronology((org.joda.time.Chronology) copticChronology15);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((org.joda.time.Chronology) copticChronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime31", (dateTime4.compareTo(dateTime31) == 0) == dateTime4.equals(dateTime31));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.yearOfCentury();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((org.joda.time.Chronology) copticChronology1);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        java.util.Date date16 = new java.util.Date((long) (byte) 0);
        int int17 = date16.getMinutes();
        int int18 = date16.getMinutes();
        boolean boolean19 = date14.before(date16);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromDateFields(date14);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        int int23 = localTime22.getHourOfDay();
        org.joda.time.LocalTime.Property property24 = localTime22.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime29 = dateTime26.withFieldAdded(durationFieldType27, 0);
        boolean boolean30 = localTime22.isSupported(durationFieldType27);
        org.joda.time.LocalTime localTime32 = localTime20.withFieldAdded(durationFieldType27, 8);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance();
        long long39 = copticChronology33.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology33.era();
        org.joda.time.DateTimeField dateTimeField43 = copticChronology33.dayOfWeek();
        boolean boolean44 = durationFieldType27.isSupported((org.joda.time.Chronology) copticChronology33);
        boolean boolean45 = localTime12.isSupported(durationFieldType27);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getDurationType();
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.Instant instant51 = instant49.withMillis((long) 1);
        org.joda.time.Instant instant52 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone53 = instant52.getZone();
        long long55 = dateTimeZone53.nextTransition((long) 893);
        org.joda.time.Instant instant56 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone57 = instant56.getZone();
        long long59 = dateTimeZone53.getMillisKeepLocal(dateTimeZone57, 0L);
        org.joda.time.LocalTime localTime60 = new org.joda.time.LocalTime((java.lang.Object) instant49, dateTimeZone57);
        org.joda.time.LocalTime localTime62 = localTime60.minusMillis(12);
        org.joda.time.Chronology chronology63 = localTime60.getChronology();
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology63);
        boolean boolean65 = durationFieldType47.isSupported(chronology63);
        org.joda.time.DateTimeField dateTimeField66 = chronology63.millisOfSecond();
        boolean boolean67 = durationFieldType27.isSupported(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localTime12 and localTime22", (localTime12.compareTo(localTime22) == 0) == localTime12.equals(localTime22));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long10 = copticChronology4.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology4.halfdayOfDay();
        org.joda.time.Chronology chronology12 = copticChronology4.withUTC();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime1.toMutableDateTime((org.joda.time.Chronology) copticChronology4);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now(dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int18 = localDateTime16.get(dateTimeFieldType17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = property19.addToCopy(893L);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withEra(1);
        int int30 = localDateTime23.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        int int31 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology32 = localDateTime21.getChronology();
        org.joda.time.DateTime dateTime33 = mutableDateTime13.toDateTime(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour(8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime13", (dateTime1.compareTo(mutableDateTime13) == 0) == dateTime1.equals(mutableDateTime13));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekOfWeekyear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.minus(readablePeriod7);
        java.util.Date date15 = new java.util.Date(6, 308, 53631987, 430, 2022, 28);
        boolean boolean16 = dateTime1.equals((java.lang.Object) 28);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology17.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology17.dayOfMonth();
        org.joda.time.DurationField durationField27 = copticChronology17.years();
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology((org.joda.time.Chronology) copticChronology17);
        org.joda.time.LocalDate localDate29 = dateTime1.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime28", (dateTime1.compareTo(dateTime28) == 0) == dateTime1.equals(dateTime28));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.plus((long) 53671795);
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.Instant instant6 = instant0.plus(1645455303685L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant0.minus(1645449540000L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant10.withDurationAdded(readableDuration11, 751);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField21 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.dayOfWeek();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 1645455234217L);
        org.joda.time.DateTime dateTime25 = localDate24.toDateTimeAtStartOfDay();
        java.util.Date date27 = new java.util.Date((long) (byte) 0);
        int int28 = date27.getMinutes();
        int int29 = date27.getDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) date27, chronology30);
        org.joda.time.LocalDate localDate33 = localDate31.withYear((-1));
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        int int36 = property34.getMaximumValueOverall();
        org.joda.time.LocalDate localDate37 = property34.roundCeilingCopy();
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone39.nextTransition((long) 893);
        java.util.Locale locale43 = java.util.Locale.CANADA;
        java.lang.String str44 = dateTimeZone39.getName((long) (short) 0, locale43);
        java.util.TimeZone timeZone45 = dateTimeZone39.toTimeZone();
        org.joda.time.DateTime dateTime46 = localDate37.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.LocalDate localDate48 = localDate37.minusWeeks((int) (short) 0);
        int int49 = localDate37.getDayOfWeek();
        int[] intArray50 = localDate37.getValues();
        copticChronology14.validate((org.joda.time.ReadablePartial) localDate24, intArray50);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology14.weekyearOfCentury();
        org.joda.time.DateTime dateTime53 = instant10.toDateTime((org.joda.time.Chronology) copticChronology14);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant56 = instant10.withDurationAdded(readableDuration54, 54115064);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant56 and dateTime53", (instant56.compareTo(dateTime53) == 0) == instant56.equals(dateTime53));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = dateTimeZone10.getName((long) 32769, locale12);
        org.joda.time.Chronology chronology14 = copticChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfWeek();
        org.joda.time.DurationField durationField16 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField8 and durationField16", (durationField8.compareTo(durationField16) == 0) == durationField8.equals(durationField16));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear(9);
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.plusMonths(241);
        boolean boolean27 = strSet9.equals((java.lang.Object) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withPeriodAdded(readablePeriod28, 0);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology32);
        int int34 = localTime33.getHourOfDay();
        org.joda.time.LocalTime.Property property35 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        boolean boolean39 = localTime36.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime localTime41 = localTime36.withMillisOfDay(53841727);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime41.plus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime48 = dateTime45.withFieldAdded(durationFieldType46, 0);
        org.joda.time.DateTime.Property property49 = dateTime45.minuteOfDay();
        org.joda.time.DateTime dateTime50 = property49.withMinimumValue();
        org.joda.time.DateTime dateTime52 = property49.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime53 = property49.roundCeilingCopy();
        org.joda.time.DateTime dateTime55 = dateTime53.plusDays(114);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime58 = dateTime53.withDurationAdded(readableDuration56, 934);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.Instant instant61 = instant59.withMillis((long) 1);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        long long65 = dateTimeZone63.nextTransition((long) 893);
        org.joda.time.Instant instant66 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone67 = instant66.getZone();
        long long69 = dateTimeZone63.getMillisKeepLocal(dateTimeZone67, 0L);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((java.lang.Object) instant59, dateTimeZone67);
        org.joda.time.LocalTime localTime72 = localTime70.minusMillis(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int74 = localTime72.get(dateTimeFieldType73);
        int int75 = dateTime53.get(dateTimeFieldType73);
        boolean boolean76 = localTime43.isSupported(dateTimeFieldType73);
        int int77 = dateTime30.get(dateTimeFieldType73);
        org.joda.time.chrono.CopticChronology copticChronology78 = org.joda.time.chrono.CopticChronology.getInstance();
        long long84 = copticChronology78.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField85 = copticChronology78.halfdayOfDay();
        org.joda.time.DurationField durationField86 = copticChronology78.hours();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology78.year();
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime30.toMutableDateTime((org.joda.time.Chronology) copticChronology78);
        java.lang.String str89 = copticChronology78.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime88", (dateTime26.compareTo(mutableDateTime88) == 0) == dateTime26.equals(mutableDateTime88));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readablePeriod7);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(3);
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTime dateTime13 = property11.setCopy("53664488");
        int int14 = dateTime13.getMillisOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.minusWeeks(53820572);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 3);
        org.joda.time.DateTime dateTime20 = dateTime18.plusMillis(54);
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology21.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology21.year();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology21.minuteOfDay();
        org.joda.time.DurationField durationField33 = copticChronology21.hours();
        org.joda.time.DateTime dateTime34 = dateTime20.withChronology((org.joda.time.Chronology) copticChronology21);
        org.joda.time.Instant instant35 = dateTime20.toInstant();
        boolean boolean36 = dateTime16.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime34 and instant35", (dateTime34.compareTo(instant35) == 0) == dateTime34.equals(instant35));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        java.lang.String str7 = copticChronology0.toString();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.year();
        long long12 = dateTimeField9.set((long) 577, "14");
        long long15 = dateTimeField9.getDifferenceAsLong((long) 555, (long) 9);
        java.util.Date date17 = new java.util.Date((long) (byte) 0);
        int int18 = date17.getMinutes();
        int int19 = date17.getDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone25.nextTransition((long) 893);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone29, 0L);
        org.joda.time.DateTime dateTime32 = localDate21.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.LocalDate localDate34 = localDate21.minusDays(20);
        org.joda.time.LocalDate localDate36 = localDate34.plusWeeks(53);
        org.joda.time.LocalDate localDate38 = localDate34.plusWeeks(20);
        org.joda.time.LocalDate localDate40 = localDate34.withYearOfCentury(6);
        org.joda.time.LocalDate localDate42 = localDate40.withEra(0);
        org.joda.time.LocalDate localDate44 = localDate42.plusDays(430);
        org.joda.time.DurationFieldType durationFieldType45 = null;
        boolean boolean46 = localDate42.isSupported(durationFieldType45);
        org.joda.time.LocalDate localDate48 = localDate42.withCenturyOfEra(308);
        int int49 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDate42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant24", (dateTime8.compareTo(instant24) == 0) == dateTime8.equals(instant24));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfMonth();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withEra(1);
        int int23 = localDateTime22.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType(2);
        boolean boolean26 = localDateTime18.isSupported(dateTimeFieldType25);
        java.lang.String str27 = dateTimeFieldType25.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField36 = copticChronology29.months();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType28.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology29.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone40 = copticChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology29.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType25.getField((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        long long47 = dateTimeZone45.previousTransition(37152000120L);
        org.joda.time.Chronology chronology48 = copticChronology29.withZone(dateTimeZone45);
        org.joda.time.DateTime dateTime49 = dateTime14.withZone(dateTimeZone45);
        boolean boolean51 = dateTime14.isAfter((long) 328);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime49", (dateTime14.compareTo(dateTime49) == 0) == dateTime14.equals(dateTime49));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(844);
        org.joda.time.DateTime dateTime34 = dateTime31.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean36 = dateTime34.isSupported(dateTimeFieldType35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime34", (dateTime1.compareTo(dateTime34) == 0) == dateTime1.equals(dateTime34));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology9.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField17 = copticChronology9.hours();
        org.joda.time.DurationField durationField18 = copticChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField21 = copticChronology9.millis();
        org.joda.time.DateTime dateTime22 = dateTime6.toDateTime((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DurationField durationField23 = copticChronology9.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DurationField durationField13 = copticChronology1.years();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.clockhourOfDay();
        long long18 = copticChronology1.add((long) 500, 10598050798191L, 691);
        org.joda.time.DurationField durationField19 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField13 and durationField19", (durationField13.compareTo(durationField19) == 0) == durationField13.equals(durationField19));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        int int7 = gregorianCalendar6.getFirstDayOfWeek();
        gregorianCalendar6.setMinimalDaysInFirstWeek((int) (byte) 1);
        gregorianCalendar6.setFirstDayOfWeek((int) '#');
        java.util.TimeZone timeZone12 = gregorianCalendar6.getTimeZone();
        org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance();
        long long19 = copticChronology13.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology13.halfdayOfDay();
        org.joda.time.Chronology chronology21 = copticChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology13.clockhourOfHalfday();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, 53664488, locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone12, locale26);
        int int29 = timeZone12.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar6 and calendar28", (gregorianCalendar6.compareTo(calendar28) == 0) == gregorianCalendar6.equals(calendar28));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra(53638);
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(8, (int) (short) 0);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        boolean boolean21 = instant19.equals((java.lang.Object) "1970-01-01T00:00:00.000Z");
        org.joda.time.Instant instant22 = instant19.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant22", (dateTime18.compareTo(instant22) == 0) == dateTime18.equals(instant22));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 499);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) 5);
        java.util.Calendar.Builder builder7 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        timeZone15.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder18 = builder7.setTimeZone(timeZone15);
        timeZone15.setRawOffset(0);
        java.util.Locale locale21 = java.util.Locale.KOREAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone15, locale21);
        boolean boolean23 = localTime6.equals((java.lang.Object) locale21);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale21);
        java.lang.String str25 = dateTimeZone1.getName((long) 782, locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar24", (calendar22.compareTo(calendar24) == 0) == calendar22.equals(calendar24));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime10 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays(999);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 5);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        long long24 = copticChronology18.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField25 = copticChronology18.months();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology18.yearOfCentury();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 1);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) instant27, dateTimeZone35);
        org.joda.time.LocalTime localTime40 = localTime38.minusMillis(12);
        boolean boolean41 = copticChronology18.equals((java.lang.Object) localTime40);
        org.joda.time.DurationField durationField42 = copticChronology18.days();
        org.joda.time.DateTime dateTime43 = dateTime17.toDateTime((org.joda.time.Chronology) copticChronology18);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime49 = dateTime46.withFieldAdded(durationFieldType47, 0);
        org.joda.time.DateTime.Property property50 = dateTime46.minuteOfDay();
        org.joda.time.DateTime dateTime51 = property50.withMinimumValue();
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfMinute();
        org.joda.time.DateTime dateTime55 = dateTime51.withDurationAdded(0L, 52);
        org.joda.time.DateTime dateTime57 = dateTime51.minusWeeks(734);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(chronology58);
        int int60 = localTime59.getHourOfDay();
        org.joda.time.LocalTime.Property property61 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime62 = property61.roundCeilingCopy();
        org.joda.time.DurationField durationField63 = property61.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property61.getFieldType();
        int int65 = dateTime51.get(dateTimeFieldType64);
        int int66 = dateTime43.get(dateTimeFieldType64);
        boolean boolean67 = dateTime12.isSupported(dateTimeFieldType64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime43", (dateTime1.compareTo(dateTime43) == 0) == dateTime1.equals(dateTime43));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra(53638);
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(8, (int) (short) 0);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime18.getZone();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property4.addNoWrapToCopy(53638);
        org.joda.time.LocalTime localTime8 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(0);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 1);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        long long17 = dateTimeZone15.nextTransition((long) 893);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, 0L);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) instant11, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant11.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = localTime8.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        long long33 = copticChronology27.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField34 = copticChronology27.months();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType26.getField((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology27.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone38 = copticChronology27.getZone();
        org.joda.time.DurationField durationField39 = copticChronology27.years();
        org.joda.time.DurationField durationField40 = copticChronology27.seconds();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) localTime8, (org.joda.time.Chronology) copticChronology27);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime44 = localTime8.withPeriodAdded(readablePeriod42, 462);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localTime44 and localTime41", (localTime44.compareTo(localTime41) == 0) == localTime44.equals(localTime41));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withDurationAdded(0L, 52);
        org.joda.time.DateTime dateTime12 = dateTime10.plusWeeks(53683090);
        java.lang.String str14 = dateTime10.toString("\ufffd\ufffd");
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology15.clockhourOfDay();
        org.joda.time.Chronology chronology25 = copticChronology15.withUTC();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime10.toMutableDateTime(chronology25);
        int int27 = dateTime10.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime26", (dateTime10.compareTo(mutableDateTime26) == 0) == dateTime10.equals(mutableDateTime26));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DurationField durationField4 = copticChronology0.eras();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 100);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(300, 11);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime.Property property16 = dateTime15.era();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(2);
        java.lang.String str24 = dateTimeFieldType23.getName();
        int int25 = dateTime15.get(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfWeek(2);
        boolean boolean30 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime27);
        boolean boolean31 = dateTime15.isEqualNow();
        int int32 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime2.toMutableDateTime(dateTimeZone8);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime33", (instant0.compareTo(mutableDateTime33) == 0) == instant0.equals(mutableDateTime33));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra(53638);
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(8, (int) (short) 0);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Instant instant21 = instant19.plus((long) 53702963);
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime();
        java.lang.String str23 = instant19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime22", (dateTime18.compareTo(mutableDateTime22) == 0) == dateTime18.equals(mutableDateTime22));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.plus((long) 53671795);
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.Instant instant6 = instant0.plus(1645455303685L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.Instant instant10 = instant0.minus(1645449540000L);
        org.joda.time.Instant instant13 = instant10.withDurationAdded((long) 93, 1910);
        org.joda.time.MutableDateTime mutableDateTime14 = instant10.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant10.withDurationAdded(readableDuration15, 685);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime22 = dateTime19.withFieldAdded(durationFieldType20, 0);
        org.joda.time.DateTime.Property property23 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfMinute();
        org.joda.time.DateTime.Property property26 = dateTime24.secondOfDay();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime24.withDurationAdded(readableDuration27, 6);
        org.joda.time.LocalDate localDate30 = dateTime29.toLocalDate();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime29);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        org.joda.time.DateTime dateTime35 = dateTime31.toDateTime(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.year();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfWeek(2);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((java.lang.Object) dateTime38);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime41.plus(readablePeriod42);
        org.joda.time.DateTime dateTime44 = dateTime43.toDateTimeISO();
        org.joda.time.DateTime.Property property45 = dateTime43.weekOfWeekyear();
        org.joda.time.DateTime dateTime46 = property45.roundFloorCopy();
        org.joda.time.DateTime.Property property47 = dateTime46.yearOfEra();
        org.joda.time.DateTime dateTime49 = property47.setCopy(881);
        boolean boolean50 = dateTime35.isBefore((org.joda.time.ReadableInstant) dateTime49);
        boolean boolean51 = instant10.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime35", (dateTime24.compareTo(dateTime35) == 0) == dateTime24.equals(dateTime35));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        int int4 = dateTime3.getMonthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime3.toMutableDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = copticChronology5.add(readablePeriod10, 1645455520590L, 73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime9", (dateTime3.compareTo(mutableDateTime9) == 0) == dateTime3.equals(mutableDateTime9));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime14.getZone();
        org.joda.time.DateTime dateTime17 = dateTime14.withYearOfEra(53700);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime17.minus(readablePeriod20);
        org.joda.time.DateTime.Property property22 = dateTime21.monthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology23.months();
        org.joda.time.DateTimeZone dateTimeZone26 = copticChronology23.getZone();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology23);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology23.year();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = copticChronology23.add(readablePeriod30, (long) 53681399, 577);
        org.joda.time.DateTime dateTime34 = dateTime21.toDateTime((org.joda.time.Chronology) copticChronology23);
        org.joda.time.DateTime dateTime36 = dateTime21.plusWeeks(887);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime34", (dateTime21.compareTo(dateTime34) == 0) == dateTime21.equals(dateTime34));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology17);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.lang.String str50 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strList48);
        boolean boolean51 = strSet41.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44);
        int int52 = strSet41.size();
        java.util.Date date54 = new java.util.Date((long) (byte) 0);
        int int55 = date54.getMinutes();
        int int56 = date54.getTimezoneOffset();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.fromDateFields(date54);
        boolean boolean58 = strSet41.contains((java.lang.Object) localDateTime57);
        org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance();
        long long65 = copticChronology59.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField66 = copticChronology59.halfdayOfDay();
        org.joda.time.DurationField durationField67 = copticChronology59.halfdays();
        long long71 = copticChronology59.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField72 = copticChronology59.days();
        org.joda.time.DurationField durationField73 = copticChronology59.centuries();
        org.joda.time.DateTimeField dateTimeField74 = copticChronology59.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone75 = copticChronology59.getZone();
        boolean boolean77 = dateTimeZone75.isStandardOffset((long) (-90000002));
        boolean boolean78 = strSet41.remove((java.lang.Object) dateTimeZone75);
        org.joda.time.DateTime dateTime79 = dateTime31.toDateTime(dateTimeZone75);
        boolean boolean81 = dateTime31.isBefore(10598050617778L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime31", (dateTime1.compareTo(dateTime31) == 0) == dateTime1.equals(dateTime31));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        long long10 = dateTimeZone1.adjustOffset(25L, false);
        int int12 = dateTimeZone1.getStandardOffset(1645455324838L);
        int int14 = dateTimeZone1.getOffset(0L);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.lang.String str21 = dateTimeZone16.getName((long) (short) 0, locale20);
        java.util.TimeZone timeZone22 = dateTimeZone16.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        org.joda.time.format.DateTimeParser dateTimeParser27 = dateTimeFormatter26.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter26.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter31.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter31.withPivotYear((java.lang.Integer) 14);
        int int36 = dateTimeFormatter31.getDefaultYear();
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter31.withLocale(locale37);
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.lang.String str40 = locale37.getDisplayScript(locale39);
        java.lang.String str41 = dateTimeZone16.getName((-61788528000000L), locale37);
        long long43 = dateTimeZone1.getMillisKeepLocal(dateTimeZone16, 9676800893L);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime48 = dateTime45.withFieldAdded(durationFieldType46, 0);
        org.joda.time.DateTime.Property property49 = dateTime45.minuteOfDay();
        org.joda.time.DateTime dateTime50 = property49.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property51 = dateTime50.secondOfMinute();
        org.joda.time.DateTime.Property property52 = dateTime50.secondOfDay();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.withDurationAdded(readableDuration53, 6);
        int int56 = dateTime55.getMinuteOfHour();
        org.joda.time.DateTime.Property property57 = dateTime55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone58);
        org.joda.time.DurationFieldType durationFieldType60 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime62 = dateTime59.withFieldAdded(durationFieldType60, 0);
        org.joda.time.DateTime.Property property63 = dateTime59.minuteOfDay();
        org.joda.time.DateTime dateTime64 = property63.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property65 = dateTime64.secondOfMinute();
        org.joda.time.DateTime.Property property66 = dateTime64.secondOfDay();
        java.util.Date date68 = new java.util.Date((long) (byte) 0);
        int int69 = date68.getMinutes();
        int int70 = date68.getDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((java.lang.Object) date68, chronology71);
        boolean boolean73 = property66.equals((java.lang.Object) chronology71);
        org.joda.time.DurationField durationField74 = property66.getDurationField();
        org.joda.time.DateTime dateTime75 = property66.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime77 = property66.addToCopy(0L);
        org.joda.time.DateTime dateTime78 = property66.getDateTime();
        boolean boolean79 = dateTime55.isEqual((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(2022);
        org.joda.time.DateTime dateTime82 = dateTime78.toDateTime(dateTimeZone81);
        long long84 = dateTimeZone1.getMillisKeepLocal(dateTimeZone81, 10598050876914L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and dateTime82", (dateTime50.compareTo(dateTime82) == 0) == dateTime50.equals(dateTime82));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.millisOfSecond();
        java.lang.String str9 = copticChronology6.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.withChronology((org.joda.time.Chronology) copticChronology6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(659);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime10.withZoneRetainFields(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        long long24 = copticChronology18.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField25 = copticChronology18.months();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType17.getField((org.joda.time.Chronology) copticChronology18);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology18.yearOfCentury();
        boolean boolean28 = dateTime12.equals((java.lang.Object) dateTimeField27);
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology29.secondOfMinute();
        org.joda.time.DurationField durationField31 = copticChronology29.months();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField34 = copticChronology29.weeks();
        org.joda.time.DateTime dateTime35 = dateTime12.toDateTime((org.joda.time.Chronology) copticChronology29);
        long long36 = dateTime35.getMillis();
        org.joda.time.DateTime dateTime38 = dateTime35.withMillis((long) 20);
        org.joda.time.YearMonthDay yearMonthDay39 = dateTime38.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime35", (dateTime12.compareTo(dateTime35) == 0) == dateTime12.equals(dateTime35));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateMidnight dateMidnight5 = dateTime1.toDateMidnight();
        org.joda.time.DateTime dateTime7 = dateTime1.minusMonths(740);
        java.util.Date date8 = dateTime7.toDate();
        org.joda.time.DateTime dateTime10 = dateTime7.withMillisOfSecond(893);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField16 = copticChronology11.weeks();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime10.toDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DateTime.Property property20 = dateTime19.secondOfDay();
        org.joda.time.DateTime dateTime22 = property20.addToCopy(626);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime19", (dateTime10.compareTo(dateTime19) == 0) == dateTime10.equals(dateTime19));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, 0);
        org.joda.time.DateTime.Property property9 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime12 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime13 = property9.roundCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTime dateTime19 = dateTime13.toDateTime((org.joda.time.Chronology) copticChronology14);
        boolean boolean20 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime3.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withPeriodAdded(readablePeriod2, 5);
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField12 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology5.yearOfCentury();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.Instant instant16 = instant14.withMillis((long) 1);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) instant14, dateTimeZone22);
        org.joda.time.LocalTime localTime27 = localTime25.minusMillis(12);
        boolean boolean28 = copticChronology5.equals((java.lang.Object) localTime27);
        org.joda.time.DurationField durationField29 = copticChronology5.days();
        org.joda.time.DateTime dateTime30 = dateTime4.toDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTime dateTime33 = dateTime4.withDurationAdded(1645455486544L, 726);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime30", (instant0.compareTo(dateTime30) == 0) == instant0.equals(dateTime30));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime0.minusYears((int) (short) 0);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.clockhourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime0.toDateTime((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeField dateTimeField17 = copticChronology10.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime16", (dateTime0.compareTo(dateTime16) == 0) == dateTime0.equals(dateTime16));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.year();
        org.joda.time.DurationField durationField22 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology0.minuteOfDay();
        org.joda.time.DurationField durationField24 = copticChronology0.eras();
        org.joda.time.DurationField durationField25 = copticChronology0.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField22 and durationField24", Math.signum(durationField22.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField22)));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        org.joda.time.DateTime.Property property6 = dateTime2.minuteOfDay();
        org.joda.time.DateTime dateTime7 = property6.withMinimumValue();
        org.joda.time.DateTime dateTime9 = property6.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime11 = property6.addWrapFieldToCopy(616);
        org.joda.time.DateTime dateTime12 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime(readableInstant14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusSeconds((int) (short) 1);
        int int25 = localDateTime24.getHourOfDay();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minus(readablePeriod27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime24.withDurationAdded(readableDuration29, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property33 = localDateTime24.property(dateTimeFieldType32);
        org.joda.time.DateTime dateTime34 = dateTime15.withFields((org.joda.time.ReadablePartial) localDateTime24);
        boolean boolean35 = dateTime12.equals((java.lang.Object) localDateTime24);
        org.joda.time.DateTime.Property property36 = dateTime12.yearOfEra();
        org.joda.time.DateTime dateTime37 = property36.getDateTime();
        org.joda.time.DateTime dateTime38 = property36.roundHalfFloorCopy();
        org.joda.time.chrono.CopticChronology copticChronology39 = org.joda.time.chrono.CopticChronology.getInstance();
        long long45 = copticChronology39.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology39.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology39.hourOfHalfday();
        org.joda.time.DurationField durationField50 = copticChronology39.days();
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime38.toMutableDateTime((org.joda.time.Chronology) copticChronology39);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay(10598050760343L, (org.joda.time.Chronology) copticChronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and mutableDateTime51", (dateTime38.compareTo(mutableDateTime51) == 0) == dateTime38.equals(mutableDateTime51));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        int int7 = localDateTime3.getWeekyear();
        int int8 = localDateTime3.getHourOfDay();
        int int9 = localDateTime3.getEra();
        int int10 = localDateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime15 = dateTime12.withFieldAdded(durationFieldType13, 0);
        org.joda.time.DateTime.Property property16 = dateTime12.minuteOfDay();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = property16.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime20 = property16.roundCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology21.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology21.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology21.halfdayOfDay();
        org.joda.time.DateTime dateTime26 = dateTime20.toDateTime((org.joda.time.Chronology) copticChronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance();
        long long34 = copticChronology28.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField35 = copticChronology28.months();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType27.getField((org.joda.time.Chronology) copticChronology28);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone39 = copticChronology28.getZone();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology28.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology28);
        org.joda.time.Chronology chronology43 = copticChronology28.withUTC();
        org.joda.time.DateTime dateTime44 = dateTime20.toDateTime((org.joda.time.Chronology) copticChronology28);
        boolean boolean45 = localDateTime3.equals((java.lang.Object) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime26", (dateTime20.compareTo(dateTime26) == 0) == dateTime20.equals(dateTime26));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField21 = copticChronology14.months();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.weekyearOfCentury();
        org.joda.time.DateTime dateTime23 = dateTime11.withChronology((org.joda.time.Chronology) copticChronology14);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        long long30 = copticChronology24.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField31 = copticChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology24.dayOfYear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology24.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology24.hourOfHalfday();
        org.joda.time.DurationField durationField35 = copticChronology24.days();
        java.util.Date date37 = new java.util.Date((long) (byte) 0);
        int int38 = date37.getMinutes();
        int int39 = date37.getDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) date37, chronology40);
        org.joda.time.LocalDate localDate43 = localDate41.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone45 = instant44.getZone();
        long long47 = dateTimeZone45.nextTransition((long) 893);
        org.joda.time.Instant instant48 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone49 = instant48.getZone();
        long long51 = dateTimeZone45.getMillisKeepLocal(dateTimeZone49, 0L);
        org.joda.time.DateTime dateTime52 = localDate41.toDateTimeAtMidnight(dateTimeZone45);
        org.joda.time.LocalDate localDate54 = localDate41.withCenturyOfEra(14);
        long long56 = copticChronology24.set((org.joda.time.ReadablePartial) localDate54, (long) 1080660000);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology24.hourOfHalfday();
        org.joda.time.Chronology chronology58 = copticChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology24.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime11, (org.joda.time.Chronology) copticChronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime23", (dateTime11.compareTo(dateTime23) == 0) == dateTime11.equals(dateTime23));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        boolean boolean17 = localDateTime10.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.minusWeeks(20);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime10.plusSeconds(17);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        long long24 = copticChronology0.set((org.joda.time.ReadablePartial) localDateTime21, (long) 53642140);
        org.joda.time.DurationField durationField25 = copticChronology0.halfdays();
        java.lang.String str26 = copticChronology0.toString();
        org.joda.time.Chronology chronology27 = copticChronology0.withUTC();
        org.joda.time.DurationField durationField28 = copticChronology0.hours();
        org.joda.time.DurationField durationField29 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField2, and durationField25", !(durationField29.compareTo(durationField2) == 0) || (Math.signum(durationField29.compareTo(durationField25)) == Math.signum(durationField2.compareTo(durationField25))));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.Instant instant4 = instant0.plus((-674704800L));
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology5.halfdayOfDay();
        org.joda.time.DurationField durationField13 = copticChronology5.halfdays();
        long long17 = copticChronology5.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField18 = copticChronology5.days();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology5.minuteOfHour();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField22 = copticChronology5.days();
        org.joda.time.DateTime dateTime23 = instant4.toDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTimeField dateTimeField24 = copticChronology5.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime23", (instant4.compareTo(dateTime23) == 0) == instant4.equals(dateTime23));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DurationField durationField1 = copticChronology0.weekyears();
        org.joda.time.DurationField durationField2 = copticChronology0.years();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withEra(1);
        int int7 = localDateTime6.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.centuryOfEra();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(912);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        int[] intArray16 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime14, (long) (-1971));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField2", (durationField1.compareTo(durationField2) == 0) == durationField1.equals(durationField2));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        int int7 = gregorianCalendar6.getFirstDayOfWeek();
        gregorianCalendar6.setMinimalDaysInFirstWeek((int) (byte) 1);
        int int10 = gregorianCalendar6.getWeeksInWeekYear();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar6);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate localDate21 = localDate19.plusWeeks(13);
        int int22 = localDate19.getWeekyear();
        java.lang.String[] strArray24 = java.util.TimeZone.getAvailableIDs((int) (short) -1);
        boolean boolean25 = localDate19.equals((java.lang.Object) strArray24);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant26.withDurationAdded(readableDuration28, 2);
        org.joda.time.DateTime dateTime31 = localDate19.toDateTime((org.joda.time.ReadableInstant) instant30);
        org.joda.time.Instant instant33 = instant30.withMillis((long) 53663);
        org.joda.time.Instant instant35 = instant33.plus(1645455265597L);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        boolean boolean37 = localTime11.equals((java.lang.Object) chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        org.joda.time.DateTime dateTime18 = dateTime12.withMillis(27738633602000L);
        int int19 = dateTime12.getSecondOfMinute();
        java.lang.String str21 = dateTime12.toString("7");
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("minuteOfDay");
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone27);
        boolean boolean29 = timeZone23.hasSameRules(timeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime12.withEarlierOffsetAtOverlap();
        boolean boolean34 = dateTime32.isAfter(10598050659487L);
        org.joda.time.DateTime dateTime36 = dateTime32.withWeekyear(423);
        org.joda.time.YearMonthDay yearMonthDay37 = dateTime36.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime31", (dateTime12.compareTo(dateTime31) == 0) == dateTime12.equals(dateTime31));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        org.joda.time.LocalDate localDate12 = localDate10.minusDays(53759567);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getMinutes();
        int int16 = date14.getDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date14, chronology17);
        org.joda.time.LocalDate localDate20 = localDate18.withYear((-1));
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        int int24 = dateTime23.getMinuteOfDay();
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime23.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) localDate20, dateTimeZone26);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone26);
        long long32 = dateTimeZone26.previousTransition((long) 16);
        boolean boolean34 = dateTimeZone26.isStandardOffset((long) 577);
        java.lang.String str36 = dateTimeZone26.getNameKey(1645455267912L);
        org.joda.time.DateTime dateTime37 = localDate10.toDateTimeAtCurrentTime(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant25", (dateTime23.compareTo(instant25) == 0) == dateTime23.equals(instant25));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        long long14 = dateTimeField9.set((long) 8, "53640", locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        strSet15.clear();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet15.spliterator();
        strSet15.clear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromCalendarFields(calendar22);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean25 = strSet15.equals((java.lang.Object) dateTime24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long32 = copticChronology26.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology26.dayOfWeek();
        org.joda.time.DurationField durationField35 = copticChronology26.months();
        org.joda.time.Chronology chronology36 = copticChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime24.toDateTime((org.joda.time.Chronology) copticChronology26);
        org.joda.time.DateTime dateTime40 = dateTime38.minusYears(0);
        org.joda.time.DateTime dateTime42 = dateTime38.withMillisOfDay((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime38", (dateTime20.compareTo(dateTime38) == 0) == dateTime20.equals(dateTime38));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        int int9 = localDate8.getDayOfYear();
        org.joda.time.LocalDate localDate11 = localDate8.withYearOfEra(53638);
        org.joda.time.LocalDate.Property property12 = localDate11.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate11.plus(readablePeriod13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(8, (int) (short) 0);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        boolean boolean21 = instant19.equals((java.lang.Object) "1970-01-01T00:00:00.000Z");
        org.joda.time.Instant instant22 = instant19.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.minus(readableDuration23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant24", (dateTime18.compareTo(instant24) == 0) == dateTime18.equals(instant24));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.DateTime dateTime23 = dateTime20.withMillis(1645455581665L);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant28 = instant24.withDurationAdded(readableDuration26, 2);
        org.joda.time.Instant instant30 = instant24.withMillis((long) 289);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant32 = instant24.minus(readableDuration31);
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime34 = instant32.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime(dateTimeZone35);
        boolean boolean37 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and mutableDateTime33", (instant12.compareTo(mutableDateTime33) == 0) == instant12.equals(mutableDateTime33));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean18 = dateTime3.isBefore(1645455600000L);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology9.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField17 = copticChronology9.hours();
        org.joda.time.DurationField durationField18 = copticChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology9.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology9.hourOfHalfday();
        org.joda.time.DurationField durationField21 = copticChronology9.millis();
        org.joda.time.DateTime dateTime22 = dateTime6.toDateTime((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DurationField durationField23 = copticChronology9.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime22", (dateTime6.compareTo(dateTime22) == 0) == dateTime6.equals(dateTime22));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusSeconds((int) (byte) 10);
        int int17 = localDateTime16.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusYears(0);
        boolean boolean20 = copticChronology0.equals((java.lang.Object) localDateTime19);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology0.minuteOfDay();
        org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance();
        long long28 = copticChronology22.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology22.halfdayOfDay();
        org.joda.time.Chronology chronology30 = copticChronology22.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.hourOfDay();
        boolean boolean32 = copticChronology0.equals((java.lang.Object) dateTimeField31);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology0.era();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        int int37 = dateTime36.getMinuteOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.plusWeeks(10);
        org.joda.time.DateTime.Property property40 = dateTime36.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar41 = dateTime36.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar41);
        int[] intArray44 = copticChronology0.get((org.joda.time.ReadablePartial) localDateTime42, (long) 56);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField46 = copticChronology0.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime45", (dateTime36.compareTo(dateTime45) == 0) == dateTime36.equals(dateTime45));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.dayOfMonth();
        org.joda.time.DurationField durationField11 = durationFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Instant instant17 = instant15.withMillis((long) 1);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) instant15, dateTimeZone23);
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis(12);
        org.joda.time.Chronology chronology29 = localTime26.getChronology();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology29);
        boolean boolean31 = durationFieldType13.isSupported(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.clockhourOfHalfday();
        org.joda.time.DurationField durationField33 = durationFieldType0.getField(chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance();
        long long41 = copticChronology35.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField42 = copticChronology35.months();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType34.getField((org.joda.time.Chronology) copticChronology35);
        org.joda.time.DateTimeField dateTimeField44 = copticChronology35.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology35.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone46 = copticChronology35.getZone();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology35.weekyear();
        org.joda.time.DateTimeField dateTimeField48 = copticChronology35.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology35);
        org.joda.time.Chronology chronology50 = copticChronology35.withUTC();
        boolean boolean51 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField33", (durationField11.compareTo(durationField33) == 0) == durationField11.equals(durationField33));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        long long8 = property7.remainder();
        int int9 = property7.get();
        org.joda.time.DateTime dateTime10 = property7.roundFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime13 = property11.addToCopy(767);
        org.joda.time.DateTime dateTime14 = dateTime13.toDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime13.plusDays(631);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        org.joda.time.DateTime.Property property25 = dateTime23.secondOfDay();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime23.withDurationAdded(readableDuration26, 6);
        org.joda.time.DateTime dateTime30 = dateTime23.minusHours(670);
        org.joda.time.DateTime.Property property31 = dateTime30.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance();
        long long38 = copticChronology32.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology32.halfdayOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withEra(1);
        int int44 = localDateTime43.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = localDateTime43.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime43.plusSeconds((int) (byte) 10);
        int int49 = localDateTime48.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime48.plusYears(0);
        boolean boolean52 = copticChronology32.equals((java.lang.Object) localDateTime51);
        boolean boolean53 = property31.equals((java.lang.Object) copticChronology32);
        org.joda.time.Instant instant54 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone55 = instant54.getZone();
        long long57 = dateTimeZone55.nextTransition((long) 893);
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.lang.String str60 = dateTimeZone55.getName((long) (short) 0, locale59);
        java.util.TimeZone timeZone61 = dateTimeZone55.toTimeZone();
        java.lang.String str63 = dateTimeZone55.getName((long) 12);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.year();
        org.joda.time.LocalDateTime localDateTime66 = property65.getLocalDateTime();
        long long68 = copticChronology32.set((org.joda.time.ReadablePartial) localDateTime66, (long) 526);
        org.joda.time.DurationField durationField69 = copticChronology32.hours();
        org.joda.time.DateTime dateTime70 = dateTime13.toDateTime((org.joda.time.Chronology) copticChronology32);
        java.lang.String str71 = copticChronology32.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime70", (dateTime13.compareTo(dateTime70) == 0) == dateTime13.equals(dateTime70));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime0.minusYears((int) (short) 0);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology10.clockhourOfHalfday();
        org.joda.time.DateTime dateTime16 = dateTime0.toDateTime((org.joda.time.Chronology) copticChronology10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str18 = dateTimeFieldType17.toString();
        org.joda.time.DateTime.Property property19 = dateTime16.property(dateTimeFieldType17);
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        long long26 = copticChronology20.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField27 = copticChronology20.halfdayOfDay();
        org.joda.time.DurationField durationField28 = copticChronology20.hours();
        org.joda.time.DurationField durationField29 = copticChronology20.minutes();
        org.joda.time.DurationField durationField30 = copticChronology20.hours();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology20.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType17.getField((org.joda.time.Chronology) copticChronology20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime16", (dateTime0.compareTo(dateTime16) == 0) == dateTime0.equals(dateTime16));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) '4');
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        long long12 = copticChronology6.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField13 = copticChronology6.months();
        java.lang.String str14 = copticChronology6.toString();
        int int15 = copticChronology6.getMinimumDaysInFirstWeek();
        org.joda.time.Chronology chronology16 = copticChronology6.withUTC();
        org.joda.time.DateTime dateTime17 = dateTime5.toDateTime((org.joda.time.Chronology) copticChronology6);
        long long21 = copticChronology6.add((long) 1900, (-1806581999000L), 770);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime((org.joda.time.Chronology) copticChronology10);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        long long22 = copticChronology16.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.dayOfMonth();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) dateTime9, (org.joda.time.Chronology) copticChronology16);
        int int25 = copticChronology16.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime15", (dateTime9.compareTo(dateTime15) == 0) == dateTime9.equals(dateTime15));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        timeZone7.setID("Property[secondOfMinute]");
        timeZone7.setRawOffset(650);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.DurationField durationField22 = dateTimeField21.getRangeDurationField();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        long long26 = dateTimeField21.set((long) 8, "53640", locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone7, locale25);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromCalendarFields(calendar28);
        java.lang.String str30 = calendar28.getCalendarType();
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        long long34 = dateTimeZone32.nextTransition((long) 893);
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = dateTimeZone32.getName((long) (short) 0, locale36);
        java.util.TimeZone timeZone38 = dateTimeZone32.toTimeZone();
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(timeZone38);
        java.time.ZoneId zoneId40 = timeZone38.toZoneId();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone(zoneId40);
        int int42 = timeZone41.getRawOffset();
        calendar28.setTimeZone(timeZone41);
        timeZone41.setID("DateTimeField[dayOfMonth]");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar39", (calendar28.compareTo(calendar39) == 0) == calendar28.equals(calendar39));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 2);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 289);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        long long17 = copticChronology11.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.halfdayOfDay();
        org.joda.time.DurationField durationField19 = copticChronology11.hours();
        org.joda.time.DurationField durationField20 = copticChronology11.minutes();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology11.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime22 = instant8.toMutableDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.MutableDateTime mutableDateTime23 = instant8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime22", (instant8.compareTo(mutableDateTime22) == 0) == instant8.equals(mutableDateTime22));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = timeZone7.getID();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.halfdayOfDay();
        boolean boolean13 = dateTimeField11.isLeap((long) (byte) 10);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str16 = locale15.getScript();
        java.lang.String str17 = locale15.getDisplayLanguage();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale15);
        java.lang.String str19 = dateTimeField11.getAsShortText((long) 1080660000, locale15);
        java.lang.String str20 = locale15.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone7, locale15);
        java.util.Date date23 = new java.util.Date((long) (byte) 0);
        java.util.Date date25 = new java.util.Date((long) (byte) 0);
        int int26 = date25.getMinutes();
        int int27 = date25.getMinutes();
        boolean boolean28 = date23.before(date25);
        java.util.Date date32 = new java.util.Date((int) (byte) 1, (int) (short) 1, 2);
        boolean boolean33 = date23.before(date32);
        date23.setDate(2022);
        int int36 = date23.getDay();
        date23.setHours(53663);
        date23.setDate(567);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withEra(1);
        int int45 = localDateTime44.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = localDateTime44.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime44.plusSeconds((int) (short) 1);
        java.util.Date date50 = localDateTime44.toDate();
        boolean boolean51 = date23.before(date50);
        boolean boolean52 = timeZone7.inDaylightTime(date23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar21", (calendar18.compareTo(calendar21) == 0) == calendar18.equals(calendar21));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfEra();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.minus(readableDuration4);
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        long long12 = copticChronology6.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology6.halfdayOfDay();
        org.joda.time.DurationField durationField14 = copticChronology6.halfdays();
        long long18 = copticChronology6.add((long) 272, 40140000L, 538);
        org.joda.time.DateTime dateTime19 = dateTime2.toDateTime((org.joda.time.Chronology) copticChronology6);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime6 = dateTime3.withFieldAdded(durationFieldType4, 0);
        boolean boolean7 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime1.getMillisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime1.minusYears((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime10.toMutableDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) 10598050799962L, dateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime17", (dateTime1.compareTo(mutableDateTime17) == 0) == dateTime1.equals(mutableDateTime17));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDateTime13.getFieldType(2);
        boolean boolean17 = localDateTime9.isSupported(dateTimeFieldType16);
        java.lang.String str18 = dateTimeFieldType16.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        long long26 = copticChronology20.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField27 = copticChronology20.months();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType19.getField((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTimeField dateTimeField29 = copticChronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology20.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = copticChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology20.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType16.getField((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTimeField dateTimeField35 = copticChronology20.minuteOfHour();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTimeField dateTimeField37 = copticChronology20.secondOfDay();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology20.halfdayOfDay();
        boolean boolean39 = dateTimeFieldType6.isSupported((org.joda.time.Chronology) copticChronology20);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        int int42 = dateTime41.getMinuteOfDay();
        org.joda.time.DateTime dateTime44 = dateTime41.plusWeeks(10);
        org.joda.time.DateTime.Property property45 = dateTime41.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar46 = dateTime41.toGregorianCalendar();
        int int47 = gregorianCalendar46.getFirstDayOfWeek();
        gregorianCalendar46.setMinimalDaysInFirstWeek((int) (byte) 1);
        gregorianCalendar46.setFirstDayOfWeek((int) '#');
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.monthOfYear();
        boolean boolean54 = property53.isLeap();
        boolean boolean55 = gregorianCalendar46.before((java.lang.Object) property53);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.fromCalendarFields((java.util.Calendar) gregorianCalendar46);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.minusMinutes(1975);
        int[] intArray60 = copticChronology20.get((org.joda.time.ReadablePartial) localDateTime56, 10598137104503L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime41", (dateTime36.compareTo(dateTime41) == 0) == dateTime36.equals(dateTime41));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis(616);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        long long21 = copticChronology16.add((long) '#', 10L, (-1));
        org.joda.time.DateTime dateTime22 = dateTime14.withChronology((org.joda.time.Chronology) copticChronology16);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime22", (dateTime14.compareTo(dateTime22) == 0) == dateTime14.equals(dateTime22));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        java.lang.String str6 = durationField5.getName();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology7.months();
        org.joda.time.DurationField durationField10 = copticChronology7.years();
        int int13 = durationField10.getValue((long) 309, 1645455382794L);
        int int14 = durationField5.compareTo(durationField10);
        long long17 = durationField10.getValueAsLong((long) 53995, 1320000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField9", Math.signum(durationField5.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField5)));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DurationField durationField10 = copticChronology0.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField10, and durationField9", !(durationField9.compareTo(durationField10) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField10.compareTo(durationField9))));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = dateTimeZone8.getName((long) (short) 0, locale12);
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        timeZone14.setID("Property[secondOfMinute]");
        timeZone14.setRawOffset(650);
        java.util.Calendar.Builder builder19 = builder6.setTimeZone(timeZone14);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) 5);
        java.util.Calendar.Builder builder22 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone24.nextTransition((long) 893);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = dateTimeZone24.getName((long) (short) 0, locale28);
        java.util.TimeZone timeZone30 = dateTimeZone24.toTimeZone();
        timeZone30.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder33 = builder22.setTimeZone(timeZone30);
        timeZone30.setRawOffset(0);
        java.util.Locale locale36 = java.util.Locale.KOREAN;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone30, locale36);
        boolean boolean38 = localTime21.equals((java.lang.Object) locale36);
        java.lang.String str39 = locale36.getDisplayVariant();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(timeZone14, locale36);
        java.util.Set<java.lang.String> strSet41 = locale36.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar40", (calendar37.compareTo(calendar40) == 0) == calendar37.equals(calendar40));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology10.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology10.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology10.halfdayOfDay();
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime((org.joda.time.Chronology) copticChronology10);
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        long long22 = copticChronology16.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField23 = copticChronology16.dayOfMonth();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) dateTime9, (org.joda.time.Chronology) copticChronology16);
        org.joda.time.DateTime dateTime26 = dateTime9.minusDays(900000);
        boolean boolean28 = dateTime26.isBefore(3599715L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime15", (dateTime9.compareTo(dateTime15) == 0) == dateTime9.equals(dateTime15));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis(616);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        long long21 = copticChronology16.add((long) '#', 10L, (-1));
        org.joda.time.DateTime dateTime22 = dateTime14.withChronology((org.joda.time.Chronology) copticChronology16);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) 1645455234217L);
        org.joda.time.DateTime dateTime25 = localDate24.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property26 = localDate24.dayOfYear();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) 10);
        org.joda.time.DateTime dateTime29 = localDate24.toDateTime((org.joda.time.ReadableInstant) instant28);
        boolean boolean30 = copticChronology16.equals((java.lang.Object) localDate24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime22", (dateTime14.compareTo(dateTime22) == 0) == dateTime14.equals(dateTime22));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime24 = dateTime19.plus(900000L);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime19.plusSeconds(348);
        org.joda.time.DateTime dateTime28 = dateTime19.withLaterOffsetAtOverlap();
        org.joda.time.chrono.CopticChronology copticChronology29 = org.joda.time.chrono.CopticChronology.getInstance();
        long long35 = copticChronology29.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField36 = copticChronology29.halfdayOfDay();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withEra(1);
        int int41 = localDateTime40.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = localDateTime40.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.plusSeconds((int) (byte) 10);
        int int46 = localDateTime45.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.plusYears(0);
        boolean boolean49 = copticChronology29.equals((java.lang.Object) localDateTime48);
        org.joda.time.DurationField durationField50 = copticChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology29.yearOfCentury();
        org.joda.time.DateTime dateTime53 = dateTime19.toDateTime((org.joda.time.Chronology) copticChronology29);
        org.joda.time.DateTimeField dateTimeField54 = copticChronology29.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime53", (dateTime18.compareTo(dateTime53) == 0) == dateTime18.equals(dateTime53));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 3);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMillis(54);
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long10 = copticChronology4.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField11 = copticChronology4.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology4.year();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology4.minuteOfDay();
        org.joda.time.DurationField durationField16 = copticChronology4.hours();
        org.joda.time.DateTime dateTime17 = dateTime3.withChronology((org.joda.time.Chronology) copticChronology4);
        org.joda.time.DurationField durationField18 = copticChronology4.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime17", (dateTime3.compareTo(dateTime17) == 0) == dateTime3.equals(dateTime17));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.minus(readableDuration5);
        java.util.Date date8 = new java.util.Date((long) (byte) 0);
        int int9 = date8.getMinutes();
        int int10 = date8.getDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) date8, chronology11);
        org.joda.time.LocalDate localDate14 = localDate12.withYear((-1));
        org.joda.time.LocalDate.Property property15 = localDate14.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDate localDate18 = property15.addToCopy((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDate localDate21 = localDate18.withFieldAdded(durationFieldType19, (-2720));
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean23 = localDate18.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        long long31 = copticChronology25.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField32 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType24.getField((org.joda.time.Chronology) copticChronology25);
        org.joda.time.DateTimeField dateTimeField34 = copticChronology25.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology25.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone36 = copticChronology25.getZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime43 = dateTime40.withFieldAdded(durationFieldType41, 0);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.DateTime dateTime47 = property44.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime48 = property44.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DateTime.Property property50 = dateTime48.property(dateTimeFieldType49);
        boolean boolean51 = dateTime37.isSupported(dateTimeFieldType49);
        boolean boolean52 = localDate18.isSupported(dateTimeFieldType49);
        boolean boolean53 = dateTime4.isSupported(dateTimeFieldType49);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology56 = org.joda.time.chrono.CopticChronology.getInstance();
        long long62 = copticChronology56.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField63 = copticChronology56.months();
        org.joda.time.DateTimeField dateTimeField64 = dateTimeFieldType55.getField((org.joda.time.Chronology) copticChronology56);
        org.joda.time.DateTimeField dateTimeField65 = copticChronology56.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField66 = copticChronology56.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone67 = copticChronology56.getZone();
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone67);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((java.lang.Object) (-1806581999000L), dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime4.toDateTime(dateTimeZone67);
        org.joda.time.chrono.CopticChronology copticChronology71 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology71.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology71.secondOfMinute();
        org.joda.time.DurationField durationField74 = copticChronology71.seconds();
        org.joda.time.DateTime dateTime75 = dateTime70.withChronology((org.joda.time.Chronology) copticChronology71);
        java.util.Date date76 = dateTime70.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime75", (dateTime1.compareTo(dateTime75) == 0) == dateTime1.equals(dateTime75));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        long long14 = dateTimeField9.set((long) 8, "53640", locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        strSet15.clear();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet15.spliterator();
        strSet15.clear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromCalendarFields(calendar22);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean25 = strSet15.equals((java.lang.Object) dateTime24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long32 = copticChronology26.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology26.dayOfWeek();
        org.joda.time.DurationField durationField35 = copticChronology26.months();
        org.joda.time.Chronology chronology36 = copticChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime24.toDateTime((org.joda.time.Chronology) copticChronology26);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology26.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime38", (dateTime20.compareTo(dateTime38) == 0) == dateTime20.equals(dateTime38));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DateTimeField dateTimeField13 = copticChronology0.dayOfMonth();
        java.util.Date date15 = new java.util.Date((long) (byte) 0);
        int int16 = date15.getMinutes();
        int int17 = date15.getDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) date15, chronology18);
        org.joda.time.LocalDate localDate21 = localDate19.withYear((-1));
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        int int24 = property22.getMaximumValueOverall();
        org.joda.time.LocalDate localDate25 = property22.roundCeilingCopy();
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeZone27.getName((long) (short) 0, locale31);
        java.util.TimeZone timeZone33 = dateTimeZone27.toTimeZone();
        org.joda.time.DateTime dateTime34 = localDate25.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.LocalDate localDate36 = localDate25.minusWeeks((int) (short) 0);
        int int37 = localDate25.getYear();
        org.joda.time.chrono.CopticChronology copticChronology38 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology38.hourOfDay();
        long long42 = dateTimeField40.roundHalfFloor((long) 129);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = dateTimeField40.getType();
        boolean boolean44 = localDate25.isSupported(dateTimeFieldType43);
        org.joda.time.LocalDate localDate46 = localDate25.plusWeeks(53684837);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate48 = localDate25.minus(readablePeriod47);
        org.joda.time.LocalDate.Property property49 = localDate48.dayOfYear();
        int int50 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDate48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant26", (dateTime12.compareTo(instant26) == 0) == dateTime12.equals(instant26));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 5);
        java.util.Calendar.Builder builder2 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = dateTimeZone4.getName((long) (short) 0, locale8);
        java.util.TimeZone timeZone10 = dateTimeZone4.toTimeZone();
        timeZone10.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder13 = builder2.setTimeZone(timeZone10);
        timeZone10.setRawOffset(0);
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone10, locale16);
        boolean boolean18 = localTime1.equals((java.lang.Object) locale16);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale16);
        java.lang.String str20 = locale16.getCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar19", (calendar17.compareTo(calendar19) == 0) == calendar17.equals(calendar19));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        int int8 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime7.era();
        int int11 = dateTime7.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime7.withPeriodAdded(readablePeriod12, 53919748);
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.halfdayOfDay();
        org.joda.time.DurationField durationField23 = copticChronology15.halfdays();
        long long27 = copticChronology15.add((long) 272, 40140000L, 538);
        org.joda.time.DurationField durationField28 = copticChronology15.days();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology15.minuteOfHour();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology15);
        org.joda.time.DateTime dateTime31 = dateTime7.withChronology((org.joda.time.Chronology) copticChronology15);
        org.joda.time.DateTimeField dateTimeField32 = copticChronology15.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime31", (dateTime4.compareTo(dateTime31) == 0) == dateTime4.equals(dateTime31));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        long long14 = dateTimeField9.set((long) 8, "53640", locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        strSet15.clear();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet15.spliterator();
        strSet15.clear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromCalendarFields(calendar22);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean25 = strSet15.equals((java.lang.Object) dateTime24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long32 = copticChronology26.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology26.dayOfWeek();
        org.joda.time.DurationField durationField35 = copticChronology26.months();
        org.joda.time.Chronology chronology36 = copticChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime24.toDateTime((org.joda.time.Chronology) copticChronology26);
        org.joda.time.DateTimeField dateTimeField39 = copticChronology26.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime38", (dateTime20.compareTo(dateTime38) == 0) == dateTime20.equals(dateTime38));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        java.lang.String str11 = dateTimeZone6.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 57635003L, dateTimeZone6);
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = dateTimeZone6.getShortName(21595320272L, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withEra(1);
        int int27 = localDateTime26.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime26.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime26.getFields();
        int int31 = property22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        boolean boolean32 = dateTimeZone6.equals((java.lang.Object) int31);
        long long35 = dateTimeZone6.adjustOffset((long) 785, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDateTime localDateTime17 = dateTime3.toLocalDateTime();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime3.minus(readableDuration18);
        int int20 = dateTime3.getMinuteOfDay();
        org.joda.time.DateTime dateTime22 = dateTime3.withYearOfEra(53903205);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute(7);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillis((long) 32770);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.LocalDate localDate22 = property20.setCopy((int) (byte) 10);
        org.joda.time.DateTime dateTime23 = dateTime9.withFields((org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime9.getZone();
        java.util.Date date26 = new java.util.Date((long) (byte) 0);
        int int27 = date26.getMinutes();
        int int28 = date26.getDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) date26, chronology29);
        org.joda.time.LocalDate localDate32 = localDate30.withYear((-1));
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfEra();
        java.util.TimeZone timeZone34 = java.util.TimeZone.getDefault();
        timeZone34.setID("hi!");
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone34);
        long long38 = calendar37.getTimeInMillis();
        calendar37.set(32772, 669, 935);
        java.util.TimeZone timeZone44 = java.util.TimeZone.getTimeZone("\u4e2d\u6587\u4e2d\u56fd)");
        calendar37.setTimeZone(timeZone44);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        boolean boolean47 = localDate32.equals((java.lang.Object) dateTimeZone46);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone50.nextTransition((long) 893);
        java.util.Locale locale54 = java.util.Locale.CANADA;
        java.lang.String str55 = dateTimeZone50.getName((long) (short) 0, locale54);
        java.lang.String str56 = dateTimeZone46.getShortName(300000L, locale54);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(dateTimeZone46);
        long long59 = dateTimeZone24.getMillisKeepLocal(dateTimeZone46, 10598050907250L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant49", (dateTime1.compareTo(instant49) == 0) == dateTime1.equals(instant49));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = dateTime21.get(dateTimeFieldType22);
        int int25 = dateTime21.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 490);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        int int30 = property29.getMinimumValue();
        org.joda.time.DateTime dateTime31 = property29.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime32 = property29.getDateTime();
        org.joda.time.DateTime dateTime33 = property29.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfWeek(2);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateTime21);
        int int25 = dateTime24.getYearOfCentury();
        boolean boolean26 = strSet9.remove((java.lang.Object) int25);
        strSet9.clear();
        boolean boolean29 = strSet9.add("14:54:42.379");
        java.util.Iterator<java.lang.String> strItor30 = strSet9.iterator();
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology31.secondOfMinute();
        org.joda.time.DurationField durationField33 = copticChronology31.months();
        org.joda.time.DateTimeZone dateTimeZone34 = copticChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology31.hourOfHalfday();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology31);
        org.joda.time.DurationField durationField37 = copticChronology31.weekyears();
        java.lang.String str38 = copticChronology31.toString();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology31);
        org.joda.time.DateTimeField dateTimeField40 = copticChronology31.year();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology31.millisOfDay();
        boolean boolean43 = strSet9.remove((java.lang.Object) copticChronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime39", (dateTime21.compareTo(dateTime39) == 0) == dateTime21.equals(dateTime39));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays(53953696);
        org.joda.time.LocalTime localTime4 = dateTime3.toLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis(708);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withPeriodAdded(readablePeriod2, 5);
        org.joda.time.LocalDateTime localDateTime5 = dateTime1.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.withPeriodAdded(readablePeriod6, 53912004);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.plus(readablePeriod9);
        boolean boolean12 = dateTime10.isBefore(53962567L);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime18 = dateTime15.withFieldAdded(durationFieldType16, 0);
        boolean boolean19 = dateTime13.isEqual((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime13.getMillisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime13.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime25 = dateTime13.withDurationAdded((long) 22, 4);
        org.joda.time.DateTime dateTime26 = dateTime13.withTimeAtStartOfDay();
        boolean boolean27 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime29 = dateTime10.withYear(834);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-21T14:54:43.055");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology3);
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.hourOfDay();
        org.joda.time.LocalTime.Property property7 = localTime4.millisOfSecond();
        org.joda.time.LocalTime localTime8 = property7.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(53);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.days();
        boolean boolean12 = localTime8.isSupported(durationFieldType11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.joda.time.LocalTime.Property property14 = localTime8.millisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        org.joda.time.format.DateTimeParser dateTimeParser18 = dateTimeFormatter17.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter17.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter22.withPivotYear((java.lang.Integer) 14);
        int int27 = dateTimeFormatter22.getDefaultYear();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter22.withLocale(locale28);
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str31 = locale28.getDisplayScript(locale30);
        int int32 = property14.getMaximumTextLength(locale30);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str34 = dateTime1.toString("2", locale30);
        org.joda.time.Instant instant35 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        org.joda.time.DateTime.Property property37 = dateTime1.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime36", (instant35.compareTo(dateTime36) == 0) == instant35.equals(dateTime36));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        java.util.GregorianCalendar gregorianCalendar34 = dateTime29.toGregorianCalendar();
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long9 = dateTimeZone5.nextTransition((long) (-1));
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        boolean boolean11 = instant10.isAfterNow();
        org.joda.time.Instant instant13 = instant10.plus((long) 53671795);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfWeek(2);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) dateTime15);
        int int19 = dateTime18.getEra();
        boolean boolean20 = instant10.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int21 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) instant10);
        long long24 = dateTimeZone5.convertLocalToUTC(1645455327957L, false);
        boolean boolean25 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone5);
        java.util.Date date28 = new java.util.Date((long) (byte) 0);
        int int29 = date28.getMinutes();
        int int30 = date28.getDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) date28, chronology31);
        int int33 = localDate32.getDayOfWeek();
        org.joda.time.LocalDate localDate35 = localDate32.minusWeeks(272);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = dateTimeZone38.getName((long) (short) 0, locale42);
        java.lang.String str44 = localDate32.toString("+00:00", locale42);
        org.joda.time.LocalDate localDate46 = localDate32.withWeekOfWeekyear(5);
        int[] intArray47 = localDate32.getValues();
        org.joda.time.LocalDate localDate49 = localDate32.minusWeeks(32770);
        org.joda.time.LocalDate localDate50 = localDate26.withFields((org.joda.time.ReadablePartial) localDate49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime15", (instant0.compareTo(dateTime15) == 0) == instant0.equals(dateTime15));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField10 = copticChronology0.seconds();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone12.nextTransition((long) 893);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone12.getMillisKeepLocal(dateTimeZone16, 0L);
        long long20 = dateTimeZone16.nextTransition((long) (-1));
        long long22 = dateTimeZone16.convertUTCToLocal(0L);
        org.joda.time.Chronology chronology23 = copticChronology0.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField24 = chronology23.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField2, and durationField6", !(durationField24.compareTo(durationField2) == 0) || (Math.signum(durationField24.compareTo(durationField6)) == Math.signum(durationField2.compareTo(durationField6))));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property5.setCopy(913);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withDurationAdded(readableDuration9, 63);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusYears(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime8.hourOfDay();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Instant instant17 = instant15.withMillis((long) 1);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) instant15, dateTimeZone23);
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis(12);
        org.joda.time.Chronology chronology29 = localTime26.getChronology();
        org.joda.time.LocalTime.Property property30 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime36 = dateTime33.withFieldAdded(durationFieldType34, 0);
        org.joda.time.DateTime.Property property37 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime38 = property37.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        java.util.Date date40 = dateTime38.toDate();
        org.joda.time.DateTime dateTime42 = dateTime38.plusYears((int) 'u');
        boolean boolean43 = dateTime38.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int45 = dateTime38.get(dateTimeFieldType44);
        int int46 = localTime31.get(dateTimeFieldType44);
        int int47 = localDateTime8.get(dateTimeFieldType44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) dateTime4, (org.joda.time.Chronology) copticChronology7);
        org.joda.time.DurationField durationField9 = copticChronology7.hours();
        java.util.Calendar.Builder builder10 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder12 = builder10.setInstant((long) 6);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        java.util.Date date16 = new java.util.Date((long) (byte) 0);
        int int17 = date16.getMinutes();
        int int18 = date16.getMinutes();
        boolean boolean19 = date14.before(date16);
        java.util.Calendar.Builder builder20 = builder10.setInstant(date16);
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder23 = builder21.setInstant((long) 6);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getDefault();
        timeZone24.setID("hi!");
        java.util.Calendar.Builder builder27 = builder23.setTimeZone(timeZone24);
        timeZone24.setRawOffset(20);
        int int31 = timeZone24.getOffset(25L);
        java.util.Calendar.Builder builder32 = builder10.setTimeZone(timeZone24);
        org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance();
        long long39 = copticChronology33.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField40 = copticChronology33.months();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology33.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = copticChronology33.clockhourOfHalfday();
        org.joda.time.chrono.CopticChronology copticChronology44 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField45 = copticChronology44.secondOfMinute();
        org.joda.time.DurationField durationField46 = copticChronology44.months();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology44.yearOfCentury();
        java.util.Locale locale49 = java.util.Locale.CANADA;
        java.lang.String str50 = dateTimeField47.getAsShortText(100, locale49);
        java.lang.String str51 = dateTimeField42.getAsText((long) 31, locale49);
        java.util.Calendar.Builder builder52 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant53 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone54 = instant53.getZone();
        long long56 = dateTimeZone54.nextTransition((long) 893);
        java.util.Locale locale58 = java.util.Locale.CANADA;
        java.lang.String str59 = dateTimeZone54.getName((long) (short) 0, locale58);
        java.util.TimeZone timeZone60 = dateTimeZone54.toTimeZone();
        timeZone60.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder63 = builder52.setTimeZone(timeZone60);
        timeZone60.setRawOffset(0);
        java.util.Locale locale66 = java.util.Locale.KOREAN;
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone60, locale66);
        java.lang.String str68 = locale49.getDisplayName(locale66);
        org.joda.time.chrono.CopticChronology copticChronology69 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField70 = copticChronology69.secondOfMinute();
        org.joda.time.DurationField durationField71 = copticChronology69.months();
        org.joda.time.DateTimeZone dateTimeZone72 = copticChronology69.getZone();
        org.joda.time.DateTimeField dateTimeField73 = copticChronology69.monthOfYear();
        long long75 = dateTimeField73.roundHalfCeiling((long) (short) 100);
        long long77 = dateTimeField73.remainder((long) 69);
        java.util.Locale locale80 = new java.util.Locale("893", "15 Feb 2022 14:54:08 GMT");
        int int81 = dateTimeField73.getMaximumTextLength(locale80);
        java.util.Locale locale82 = locale80.stripExtensions();
        java.lang.String str83 = locale49.getDisplayVariant(locale80);
        java.lang.String str84 = locale80.getDisplayCountry();
        java.util.Calendar.Builder builder85 = builder32.setLocale(locale80);
        boolean boolean86 = copticChronology7.equals((java.lang.Object) locale80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant53", (dateTime1.compareTo(instant53) == 0) == dateTime1.equals(instant53));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.LocalTime.Property property15 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        java.util.Date date25 = dateTime23.toDate();
        org.joda.time.DateTime dateTime27 = dateTime23.plusYears((int) 'u');
        boolean boolean28 = dateTime23.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int30 = dateTime23.get(dateTimeFieldType29);
        int int31 = localTime16.get(dateTimeFieldType29);
        int int32 = localTime16.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime18", (instant0.compareTo(dateTime18) == 0) == instant0.equals(dateTime18));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readableDuration22);
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        int int25 = dateTime23.getMillisOfSecond();
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        org.joda.time.DateTime.Property property27 = dateTime23.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale3 = new java.util.Locale("hi!", "");
        java.lang.String str4 = locale3.getDisplayCountry();
        java.lang.String str7 = nameProvider0.getShortName(locale3, "2022-02-21T14:54:13.248", "");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology9.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField16 = copticChronology9.months();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology9.yearOfCentury();
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeField17.getAsText(31536000000L, locale19);
        java.lang.String str23 = nameProvider0.getShortName(locale19, "\ud55c\uad6d\uc5b4", "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        int int28 = dateTime27.getMinuteOfDay();
        int int29 = instant24.compareTo((org.joda.time.ReadableInstant) dateTime27);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.util.Calendar calendar31 = dateTime27.toCalendar(locale30);
        java.lang.String str32 = locale30.getScript();
        java.lang.String str35 = nameProvider0.getShortName(locale30, "32772", "2022-02-21T14:55:36.614Z");
        java.util.Locale.Builder builder36 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder37 = builder36.clearExtensions();
        java.util.Locale.Builder builder38 = builder37.clearExtensions();
        java.util.Locale.Builder builder39 = builder37.clearExtensions();
        java.util.Locale locale40 = builder37.build();
        java.util.Locale locale41 = builder37.build();
        java.lang.String str44 = nameProvider0.getShortName(locale41, "2022-5-2 14:59:20", "0894-11-04T10:58:21.874Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime27", (instant24.compareTo(dateTime27) == 0) == instant24.equals(dateTime27));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 16, dateTimeZone2);
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long10 = copticChronology4.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField11 = copticChronology4.months();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology4.dayOfWeek();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) 1645455234217L);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtStartOfDay();
        java.util.Date date17 = new java.util.Date((long) (byte) 0);
        int int18 = date17.getMinutes();
        int int19 = date17.getDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.withYear((-1));
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        int int26 = property24.getMaximumValueOverall();
        org.joda.time.LocalDate localDate27 = property24.roundCeilingCopy();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone29.nextTransition((long) 893);
        java.util.Locale locale33 = java.util.Locale.CANADA;
        java.lang.String str34 = dateTimeZone29.getName((long) (short) 0, locale33);
        java.util.TimeZone timeZone35 = dateTimeZone29.toTimeZone();
        org.joda.time.DateTime dateTime36 = localDate27.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.LocalDate localDate38 = localDate27.minusWeeks((int) (short) 0);
        int int39 = localDate27.getDayOfWeek();
        int[] intArray40 = localDate27.getValues();
        copticChronology4.validate((org.joda.time.ReadablePartial) localDate14, intArray40);
        org.joda.time.DateTimeField dateTimeField42 = copticChronology4.weekyearOfCentury();
        org.joda.time.DateTime dateTime43 = dateTime3.withChronology((org.joda.time.Chronology) copticChronology4);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime49 = dateTime46.withFieldAdded(durationFieldType47, 0);
        org.joda.time.DateTime.Property property50 = dateTime46.minuteOfDay();
        org.joda.time.DateTime dateTime51 = property50.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property52 = dateTime51.secondOfMinute();
        java.lang.String str53 = property52.toString();
        java.util.Locale locale55 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str56 = property52.getAsShortText(locale55);
        java.util.Locale locale57 = java.util.Locale.JAPANESE;
        java.util.Locale locale61 = new java.util.Locale("java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]", "millisOfSecond", "11");
        java.lang.String str62 = locale57.getDisplayLanguage(locale61);
        java.lang.String str63 = locale55.getDisplayLanguage(locale57);
        java.lang.String str64 = dateTime43.toString("15:02:27.271", locale55);
        int int65 = dateTime43.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime46", (instant1.compareTo(dateTime46) == 0) == instant1.equals(dateTime46));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.era();
        org.joda.time.DurationField durationField8 = copticChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(9);
        org.joda.time.DateTime dateTime13 = dateTime10.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.plusMonths(241);
        org.joda.time.DateTime dateTime17 = dateTime13.withCenturyOfEra(669);
        int int18 = dateTime13.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime19 = dateTime13.toLocalDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        int int24 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withEra(1);
        int int33 = localDateTime32.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDateTime32.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray36 = localDateTime32.getFields();
        org.joda.time.LocalDateTime.Property property37 = localDateTime32.year();
        boolean boolean39 = localDateTime32.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.plus(readableDuration40);
        int int42 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime41);
        java.util.Date date43 = localDateTime28.toDate();
        org.joda.time.LocalDateTime.Property property44 = localDateTime28.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime28.minusWeeks((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime28.minusSeconds(53672844);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withEra(1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.minus(readablePeriod55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime52.plusMonths(44);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.hourOfDay();
        org.joda.time.Instant instant61 = new org.joda.time.Instant((long) 2000);
        org.joda.time.MutableDateTime mutableDateTime62 = instant61.toMutableDateTimeISO();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withEra(1);
        org.joda.time.LocalDateTime localDateTime68 = localDateTime66.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.minus(readablePeriod69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime66.plusMonths(44);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType74 = dateTimeFieldType73.getRangeDurationType();
        org.joda.time.LocalDateTime.Property property75 = localDateTime72.property(dateTimeFieldType73);
        int int76 = instant61.get(dateTimeFieldType73);
        java.lang.String str77 = dateTimeFieldType73.toString();
        int int78 = localDateTime58.get(dateTimeFieldType73);
        org.joda.time.LocalDateTime.Property property79 = localDateTime48.property(dateTimeFieldType73);
        org.joda.time.LocalDateTime.Property property80 = localDateTime19.property(dateTimeFieldType73);
        boolean boolean81 = copticChronology0.equals((java.lang.Object) property80);
        org.joda.time.DateTimeField dateTimeField82 = copticChronology0.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant61 and mutableDateTime62", (instant61.compareTo(mutableDateTime62) == 0) == instant61.equals(mutableDateTime62));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.plus((long) 53671795);
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.Instant instant6 = instant0.plus(1645455303685L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant0.minus(readableDuration7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.DateTime dateTime10 = instant8.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        boolean boolean17 = dateTime14.isEqual((long) 54148361);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property4.addNoWrapToCopy(53638);
        org.joda.time.LocalTime localTime8 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(0);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 1);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        long long17 = dateTimeZone15.nextTransition((long) 893);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, 0L);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) instant11, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant11.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = localTime8.toDateTime((org.joda.time.ReadableInstant) instant24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant24.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime27 = instant24.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and mutableDateTime26", (instant24.compareTo(mutableDateTime26) == 0) == instant24.equals(mutableDateTime26));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime9 = dateTime6.plusDays((int) 'a');
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone12.nextTransition((long) 893);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone12.getMillisKeepLocal(dateTimeZone16, 0L);
        java.lang.String str20 = dateTimeZone16.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(0L, dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime9.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.Instant instant23 = dateTime22.toInstant();
        org.joda.time.DateTime.Property property24 = dateTime22.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(616);
        boolean boolean11 = property5.isLeap();
        int int12 = property5.getMaximumValue();
        org.joda.time.DateTime dateTime14 = property5.setCopy(30);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Instant instant17 = instant15.withMillis((long) 1);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) instant15, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant15.minus(readableDuration27);
        org.joda.time.DateTime dateTime29 = instant15.toDateTimeISO();
        org.joda.time.DateTime dateTime31 = dateTime29.plusSeconds(867);
        org.joda.time.DateTime dateTime33 = dateTime29.minusYears(53811828);
        java.lang.String str34 = dateTime29.toString();
        long long35 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant15", (dateTime1.compareTo(instant15) == 0) == dateTime1.equals(instant15));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime26 = dateTime23.withFieldAdded(durationFieldType24, 0);
        org.joda.time.DateTime.Property property27 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property29 = dateTime28.secondOfMinute();
        java.lang.String str30 = property29.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime35 = dateTime32.withFieldAdded(durationFieldType33, 0);
        org.joda.time.DateTime.Property property36 = dateTime32.minuteOfDay();
        org.joda.time.DateTime dateTime37 = property36.roundHalfEvenCopy();
        int int38 = dateTime37.getYearOfCentury();
        long long39 = property29.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withDayOfWeek(2);
        long long44 = dateTime41.getMillis();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime41.withPeriodAdded(readablePeriod45, 9);
        int int48 = dateTime37.compareTo((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime50 = dateTime37.minusHours(10);
        boolean boolean51 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime20.plus(readableDuration52);
        int int54 = dateTime53.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime23", (instant12.compareTo(dateTime23) == 0) == instant12.equals(dateTime23));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.Interval interval6 = property4.toInterval();
        org.joda.time.DateTimeField dateTimeField7 = property4.getField();
        org.joda.time.LocalTime localTime8 = property4.roundHalfCeilingCopy();
        org.joda.time.Instant instant10 = new org.joda.time.Instant(1644278400000L);
        org.joda.time.DateTime dateTime11 = instant10.toDateTime();
        boolean boolean12 = localTime8.equals((java.lang.Object) instant10);
        org.joda.time.Instant instant14 = instant10.minus((long) 53831646);
        org.joda.time.DateTime dateTime15 = instant14.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime16 = instant14.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime11", (instant10.compareTo(dateTime11) == 0) == instant10.equals(dateTime11));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale4 = new java.util.Locale("clockhourOfHalfday", "English (Canada)", "");
        java.util.Locale locale5 = locale4.stripExtensions();
        java.lang.String str8 = nameProvider0.getName(locale4, "2022-02-21T14:54:51.332", "\u52a0\u62ff\u5927");
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.lang.String str12 = nameProvider0.getShortName(locale9, "894", "87");
        java.util.Locale locale13 = null;
        java.lang.String str16 = nameProvider0.getName(locale13, "dayOfYear", "secondOfMinute");
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime24 = property22.roundHalfEvenCopy();
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology25.yearOfCentury();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = dateTimeField28.getAsShortText(100, locale30);
        java.util.Date date33 = new java.util.Date((long) (byte) 0);
        int int34 = date33.getMinutes();
        int int35 = date33.getDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((java.lang.Object) date33, chronology36);
        int int38 = localDate37.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate37.minusWeeks(272);
        org.joda.time.Instant instant42 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone43 = instant42.getZone();
        long long45 = dateTimeZone43.nextTransition((long) 893);
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = dateTimeZone43.getName((long) (short) 0, locale47);
        java.lang.String str49 = localDate37.toString("+00:00", locale47);
        int int50 = dateTimeField28.getMaximumShortTextLength(locale47);
        java.util.Locale locale51 = java.util.Locale.CANADA;
        java.lang.String str52 = locale47.getDisplayName(locale51);
        int int53 = property22.getMaximumShortTextLength(locale51);
        java.lang.String str56 = nameProvider0.getName(locale51, "zh", "1970-1-1 0:00:00");
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder58 = builder57.clearExtensions();
        java.util.Locale.Builder builder59 = builder58.clearExtensions();
        java.util.Locale.Builder builder60 = builder58.clearExtensions();
        java.util.Locale locale61 = builder58.build();
        java.util.Locale.Builder builder63 = builder58.addUnicodeLocaleAttribute("years");
        java.util.Locale.Builder builder65 = builder58.setLanguage("");
        java.util.Locale locale66 = builder58.build();
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(locale66);
        java.lang.String str70 = nameProvider0.getName(locale66, "2022-02-21T15:00:00.000Z", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Property[secondOfMinute],offset=650,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=272,MONTH=20,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=10,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=35,MINUTE=53667706,SECOND=53659,MILLISECOND=144,ZONE_OFFSET=650,DST_OFFSET=0]");
        java.util.Set<java.lang.Character> charSet71 = locale66.getExtensionKeys();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant42", (dateTime18.compareTo(instant42) == 0) == dateTime18.equals(instant42));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime dateTime9 = dateTime0.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime12 = dateTime0.withDurationAdded((long) 22, 4);
        org.joda.time.DateTime dateTime13 = dateTime0.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property14 = dateTime0.yearOfCentury();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, 0L);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withEra(1);
        int int31 = localDateTime30.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDateTime30.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.plusSeconds((int) (short) 1);
        int int36 = localDateTime35.getHourOfDay();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundHalfCeilingCopy();
        java.util.Locale locale40 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime41 = property37.setCopy("0", locale40);
        java.lang.String str42 = dateTimeZone16.getName(31536900000L, locale40);
        boolean boolean44 = dateTimeZone16.isStandardOffset((long) 993);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime46 = dateTime0.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property47 = dateTime46.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant15", (dateTime0.compareTo(instant15) == 0) == dateTime0.equals(instant15));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        java.util.Date date39 = new java.util.Date((long) (byte) 0);
        int int40 = date39.getMinutes();
        int int41 = date39.getDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) date39, chronology42);
        org.joda.time.LocalDate localDate45 = localDate43.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant46 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone47 = instant46.getZone();
        long long49 = dateTimeZone47.nextTransition((long) 893);
        org.joda.time.Instant instant50 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone51 = instant50.getZone();
        long long53 = dateTimeZone47.getMillisKeepLocal(dateTimeZone51, 0L);
        org.joda.time.DateTime dateTime54 = localDate43.toDateTimeAtMidnight(dateTimeZone47);
        org.joda.time.LocalDate localDate56 = localDate43.minusDays(20);
        org.joda.time.LocalDate localDate58 = localDate56.plusWeeks(53);
        org.joda.time.LocalDate localDate60 = localDate58.withYearOfCentury(10);
        int int61 = localDate37.compareTo((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate63 = localDate37.withYear(7);
        org.joda.time.LocalDate.Property property64 = localDate37.weekOfWeekyear();
        org.joda.time.LocalDate.Property property65 = localDate37.weekyear();
        org.joda.time.LocalDate.Property property66 = localDate37.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone67);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime71 = dateTime68.withFieldAdded(durationFieldType69, 0);
        org.joda.time.DateTime.Property property72 = dateTime68.minuteOfDay();
        org.joda.time.DateTime dateTime73 = property72.withMinimumValue();
        org.joda.time.DateTime.Property property74 = dateTime73.secondOfMinute();
        org.joda.time.DateTime dateTime76 = dateTime73.withSecondOfMinute(7);
        org.joda.time.DateTime dateTime78 = dateTime76.withMillis((long) 32770);
        org.joda.time.DateTime dateTime80 = dateTime76.plusYears(53753);
        int int81 = property66.compareTo((org.joda.time.ReadableInstant) dateTime76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime68", (instant8.compareTo(dateTime68) == 0) == instant8.equals(dateTime68));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean21 = localDateTime16.isSupported(dateTimeFieldType20);
        boolean boolean22 = localDateTime3.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.plusMillis(2);
        int int25 = localDateTime24.getYear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime30 = dateTime27.withFieldAdded(durationFieldType28, 0);
        org.joda.time.DateTime.Property property31 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime32 = property31.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property33 = dateTime32.secondOfMinute();
        java.util.Date date34 = dateTime32.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime.Property property36 = dateTime32.property(dateTimeFieldType35);
        java.lang.String str37 = dateTimeFieldType35.getName();
        org.joda.time.LocalDateTime.Property property38 = localDateTime24.property(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType35.getDurationType();
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.lang.String str47 = dateTimeZone42.getName((long) (short) 0, locale46);
        java.util.TimeZone timeZone48 = dateTimeZone42.toTimeZone();
        java.lang.String str50 = dateTimeZone42.getName((long) 12);
        java.lang.String str51 = dateTimeZone42.toString();
        org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
        boolean boolean53 = durationFieldType40.isSupported((org.joda.time.Chronology) copticChronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(chronology54);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.withEra(1);
        int int58 = localDateTime57.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime57.withDurationAdded(readableDuration59, (int) (short) 0);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType63.getDurationType();
        int int65 = localDateTime61.indexOf(dateTimeFieldType63);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime61.minusMonths(0);
        long long69 = copticChronology52.set((org.joda.time.ReadablePartial) localDateTime61, 215L);
        boolean boolean70 = dateTimeFieldType35.isSupported((org.joda.time.Chronology) copticChronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and instant41", (dateTime27.compareTo(instant41) == 0) == dateTime27.equals(instant41));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime13.minus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = localTime15.toDateTimeToday();
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours(499);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.Instant instant21 = instant19.withMillis((long) 1);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone23.nextTransition((long) 893);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone23.getMillisKeepLocal(dateTimeZone27, 0L);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) instant19, dateTimeZone27);
        org.joda.time.Instant instant32 = instant19.withMillis((long) 6);
        org.joda.time.DateTime dateTime33 = instant19.toDateTimeISO();
        org.joda.time.Instant instant36 = instant19.withDurationAdded((-1900800000L), 734);
        org.joda.time.Instant instant38 = instant36.withMillis((long) 887);
        int int39 = dateTime18.compareTo((org.joda.time.ReadableInstant) instant36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime33", (instant0.compareTo(dateTime33) == 0) == instant0.equals(dateTime33));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        java.util.TimeZone timeZone27 = dateTimeZone18.toTimeZone();
        java.util.Locale locale29 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        java.util.Date date32 = new java.util.Date((long) (byte) 0);
        int int33 = date32.getMinutes();
        int int34 = date32.getDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) date32, chronology35);
        int int37 = localDate36.getDayOfWeek();
        org.joda.time.LocalDate localDate39 = localDate36.minusWeeks(272);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.lang.String str47 = dateTimeZone42.getName((long) (short) 0, locale46);
        java.lang.String str48 = localDate36.toString("+00:00", locale46);
        java.lang.String str49 = locale46.getISO3Country();
        java.lang.String str50 = locale29.getDisplayCountry(locale46);
        java.util.Date date52 = new java.util.Date((long) (byte) 0);
        int int53 = date52.getMinutes();
        int int54 = date52.getDay();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((java.lang.Object) date52, chronology55);
        org.joda.time.LocalDate localDate58 = localDate56.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        long long62 = dateTimeZone60.nextTransition((long) 893);
        org.joda.time.Instant instant63 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone64 = instant63.getZone();
        long long66 = dateTimeZone60.getMillisKeepLocal(dateTimeZone64, 0L);
        org.joda.time.DateTime dateTime67 = localDate56.toDateTimeAtMidnight(dateTimeZone60);
        org.joda.time.LocalDate localDate69 = localDate56.withCenturyOfEra(14);
        java.util.Locale locale73 = new java.util.Locale("hi!", "");
        boolean boolean74 = locale73.hasExtensions();
        java.lang.String str75 = locale73.getISO3Language();
        java.lang.String str76 = localDate56.toString("14:54:04.005", locale73);
        java.lang.String str77 = locale46.getDisplayCountry(locale73);
        java.util.Calendar calendar78 = java.util.Calendar.getInstance(locale46);
        java.lang.String str79 = dateTimeZone18.getShortName((long) 54032124, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 32772, dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long9 = copticChronology3.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField10 = copticChronology3.months();
        java.lang.String str11 = copticChronology3.toString();
        int int12 = copticChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfYear();
        java.lang.String str15 = copticChronology3.toString();
        java.lang.String str16 = copticChronology3.toString();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField18 = copticChronology3.millis();
        boolean boolean19 = localDate2.equals((java.lang.Object) durationField18);
        int int20 = localDate2.getDayOfMonth();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime dateTime23 = localDate2.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant21.plus(readableDuration24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long32 = copticChronology26.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField33 = copticChronology26.months();
        java.lang.String str34 = copticChronology26.toString();
        int int35 = copticChronology26.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField36 = copticChronology26.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology26.getZone();
        long long41 = dateTimeZone37.convertLocalToUTC(852L, true, (long) 616);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) instant21, dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant21", (dateTime22.compareTo(instant21) == 0) == dateTime22.equals(instant21));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime18 = dateTime3.minusDays((-292275054));
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfHour();
        int int20 = dateTime18.getMillisOfSecond();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears(740);
        org.joda.time.DateTime dateTime24 = dateTime18.minus(3600000L);
        org.joda.time.DateTime dateTime26 = dateTime18.withYear(53940);
        org.joda.time.DateTime dateTime28 = dateTime18.withWeekyear(53788542);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime.Property property7 = dateTime1.monthOfYear();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime10 = dateTime8.withMillis((long) 673);
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.Instant instant12 = instant11.toInstant();
        java.lang.String str13 = instant12.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = instant12.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant12", (dateTime10.compareTo(instant12) == 0) == dateTime10.equals(instant12));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.LocalTime localTime32 = dateTime29.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        java.lang.String str3 = property2.toString();
        boolean boolean4 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withDayOfWeek(2);
        int int9 = dateTime8.getMonthOfYear();
        int int10 = property2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime.Property property11 = dateTime8.minuteOfDay();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.Instant instant14 = instant12.toInstant();
        boolean boolean15 = dateTime8.isEqual((org.joda.time.ReadableInstant) instant12);
        org.joda.time.DateTime dateTime17 = dateTime8.minusDays(53845610);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 3);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillis((-1806581999000L));
        java.util.Date date5 = new java.util.Date((long) (byte) 0);
        int int6 = date5.getMinutes();
        int int7 = date5.getDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) date5, chronology8);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.DateTime dateTime20 = localDate9.toDateTimeAtMidnight(dateTimeZone13);
        org.joda.time.LocalDate localDate22 = localDate9.minusDays(20);
        org.joda.time.LocalDate localDate24 = localDate22.plusWeeks(53);
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property27 = localDate24.yearOfCentury();
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTimeISO();
        org.joda.time.DateTime dateTime30 = dateTime29.withLaterOffsetAtOverlap();
        java.lang.String str32 = dateTime29.toString("113");
        org.joda.time.LocalDate localDate33 = dateTime29.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime38 = dateTime35.withFieldAdded(durationFieldType36, 0);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekOfWeekyear((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime42 = dateTime35.minus(readablePeriod41);
        org.joda.time.format.DateTimePrinter dateTimePrinter43 = null;
        org.joda.time.format.DateTimeParser dateTimeParser44 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter43, dateTimeParser44);
        org.joda.time.format.DateTimeParser dateTimeParser46 = dateTimeFormatter45.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter45.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter45.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter45.withDefaultYear(867);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale56 = java.util.Locale.getDefault();
        java.lang.String str57 = dateTimeZone54.getName((long) 32769, locale56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter52.withZone(dateTimeZone54);
        org.joda.time.DateTime dateTime59 = dateTime35.withZoneRetainFields(dateTimeZone54);
        boolean boolean60 = dateTime29.isBefore((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime62 = dateTime29.plusDays(959);
        int int63 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime35", (instant12.compareTo(dateTime35) == 0) == instant12.equals(dateTime35));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = copticChronology0.eras();
        java.lang.String str6 = durationField5.getName();
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.secondOfMinute();
        org.joda.time.DurationField durationField9 = copticChronology7.months();
        org.joda.time.DurationField durationField10 = copticChronology7.years();
        int int13 = durationField10.getValue((long) 309, 1645455382794L);
        int int14 = durationField5.compareTo(durationField10);
        long long15 = durationField5.getUnitMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField10", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillisOfSecond(53);
        int int9 = dateTime8.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.withPeriodAdded(readablePeriod10, 53970396);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) '4');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(chronology6);
        int int8 = localTime7.getHourOfDay();
        org.joda.time.LocalTime.Property property9 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = property9.withMaximumValue();
        int int12 = localTime11.getMillisOfSecond();
        org.joda.time.LocalTime.Property property13 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime15 = localTime14.toDateTimeToday();
        boolean boolean16 = dateTime5.isAfter((org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime5.getDayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        long long24 = copticChronology18.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField25 = copticChronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology18.clockhourOfDay();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.Instant instant29 = instant27.withMillis((long) 1);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) instant27, dateTimeZone35);
        org.joda.time.LocalTime localTime40 = localTime38.minusMillis(12);
        org.joda.time.LocalTime localTime42 = localTime38.plusMillis((int) (short) 10);
        int[] intArray44 = copticChronology18.get((org.joda.time.ReadablePartial) localTime42, (long) 17);
        org.joda.time.DateTimeField dateTimeField45 = copticChronology18.halfdayOfDay();
        org.joda.time.DateTime dateTime46 = dateTime5.withChronology((org.joda.time.Chronology) copticChronology18);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(1645455475289L);
        int int2 = localDate1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekyear(9);
        int int7 = dateTime4.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = localDate1.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance();
        long long15 = copticChronology9.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField17 = copticChronology9.hours();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology9.year();
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DurationField durationField20 = copticChronology9.weeks();
        org.joda.time.DateTime dateTime21 = dateTime4.toDateTime((org.joda.time.Chronology) copticChronology9);
        org.joda.time.DateTime.Property property22 = dateTime4.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime21", (dateTime8.compareTo(dateTime21) == 0) == dateTime8.equals(dateTime21));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        org.joda.time.DateTime dateTime17 = property15.getDateTime();
        org.joda.time.DateTime dateTime18 = property15.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = property15.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.minus(readablePeriod20);
        org.joda.time.Instant instant22 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology25.secondOfMinute();
        org.joda.time.DurationField durationField27 = copticChronology25.months();
        org.joda.time.DateTimeZone dateTimeZone28 = copticChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology25.hourOfHalfday();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology25);
        org.joda.time.DurationField durationField31 = copticChronology25.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = copticChronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology25.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology25.era();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology25.era();
        org.joda.time.MutableDateTime mutableDateTime36 = instant24.toMutableDateTime((org.joda.time.Chronology) copticChronology25);
        org.joda.time.DurationField durationField37 = copticChronology25.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant22", (dateTime19.compareTo(instant22) == 0) == dateTime19.equals(instant22));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = dateTime21.get(dateTimeFieldType22);
        int int25 = dateTime21.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 490);
        org.joda.time.DateTime.Property property29 = dateTime28.dayOfYear();
        org.joda.time.DateTime dateTime31 = dateTime28.withWeekyear((-52));
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.joda.time.DateTime dateTime34 = dateTime31.plusDays(959);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(616);
        org.joda.time.DateTime dateTime11 = property5.getDateTime();
        org.joda.time.DateTime dateTime13 = property5.addToCopy(935);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime13);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, 0L);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 11, false);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone16.getOffset(readableInstant27);
        org.joda.time.DateTime dateTime29 = dateTime14.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime31 = dateTime14.plusMonths(609);
        org.joda.time.DateTime.Property property32 = dateTime14.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant15", (dateTime1.compareTo(instant15) == 0) == dateTime1.equals(instant15));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.Chronology chronology11 = copticChronology0.withUTC();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology0);
        int int13 = dateTime12.getDayOfYear();
        boolean boolean14 = dateTime12.isAfterNow();
        org.joda.time.DateTime dateTime16 = dateTime12.plusMinutes(0);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.LocalDate localDate35 = localDate22.minusDays(20);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks(53);
        org.joda.time.LocalDate localDate39 = localDate35.plusWeeks(20);
        org.joda.time.LocalDate localDate41 = localDate35.withYearOfCentury(6);
        org.joda.time.DateTime dateTime42 = localDate35.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate44 = localDate35.withYear(53642140);
        org.joda.time.DateMidnight dateMidnight45 = localDate44.toDateMidnight();
        int int46 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateMidnight45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant25", (dateTime12.compareTo(instant25) == 0) == dateTime12.equals(instant25));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfEvenCopy();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(dateTimeZone9);
        org.joda.time.LocalTime localTime17 = localTime15.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(2);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) dateTime19);
        int int23 = dateTime22.getEra();
        org.joda.time.TimeOfDay timeOfDay24 = dateTime22.toTimeOfDay();
        org.joda.time.DateTime dateTime26 = dateTime22.plusSeconds(21);
        org.joda.time.DateTime dateTime28 = dateTime22.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime29 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getRangeDurationType();
        int int32 = dateTime29.get(dateTimeFieldType30);
        int int33 = dateTime29.getMinuteOfDay();
        org.joda.time.DateTime.Property property34 = dateTime29.era();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        int int36 = dateTimeField35.getMinimumValue();
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.secondOfMinute();
        org.joda.time.DurationField durationField39 = copticChronology37.months();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology37.yearOfCentury();
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = dateTimeField40.getAsShortText(100, locale42);
        java.lang.String str44 = locale42.getISO3Country();
        int int45 = dateTimeField35.getMaximumTextLength(locale42);
        java.lang.String str46 = property4.getAsText(locale42);
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(locale42);
        long long48 = calendar47.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime19", (instant8.compareTo(dateTime19) == 0) == instant8.equals(dateTime19));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.minusDays(53724081);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone22.nextTransition((long) 893);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone22.getMillisKeepLocal(dateTimeZone26, 0L);
        long long30 = dateTimeZone26.nextTransition((long) (-1));
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        boolean boolean32 = instant31.isAfterNow();
        org.joda.time.Instant instant34 = instant31.plus((long) 53671795);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withDayOfWeek(2);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime36);
        int int40 = dateTime39.getEra();
        boolean boolean41 = instant31.isBefore((org.joda.time.ReadableInstant) dateTime39);
        int int42 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) instant31);
        long long45 = dateTimeZone26.convertLocalToUTC(1645455327957L, false);
        org.joda.time.DateTime dateTime46 = localDate20.toDateTimeAtMidnight(dateTimeZone26);
        boolean boolean47 = dateTime46.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime36", (instant8.compareTo(dateTime36) == 0) == instant8.equals(dateTime36));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime.Property property14 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DurationField durationField16 = property14.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        java.lang.String str25 = property24.toString();
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str28 = property24.getAsShortText(locale27);
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        java.util.Locale locale33 = new java.util.Locale("java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]", "millisOfSecond", "11");
        java.lang.String str34 = locale29.getDisplayLanguage(locale33);
        java.lang.String str35 = locale27.getDisplayLanguage(locale29);
        java.lang.String str37 = locale27.getExtension('x');
        java.lang.String str38 = property14.getAsShortText(locale27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime18", (instant0.compareTo(dateTime18) == 0) == instant0.equals(dateTime18));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.addCopy((long) 52);
        org.joda.time.LocalTime localTime6 = property3.getLocalTime();
        org.joda.time.LocalTime localTime7 = property3.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(9);
        org.joda.time.DateTime dateTime12 = dateTime9.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.plusMonths(241);
        org.joda.time.DateTime dateTime16 = dateTime12.withCenturyOfEra(669);
        org.joda.time.Instant instant17 = dateTime12.toInstant();
        boolean boolean18 = instant17.isEqualNow();
        org.joda.time.DateTime dateTime19 = instant17.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime24 = dateTime21.withFieldAdded(durationFieldType22, 0);
        org.joda.time.DateTime.Property property25 = dateTime21.minuteOfDay();
        org.joda.time.DateTime dateTime26 = property25.withMinimumValue();
        org.joda.time.DateTime.Property property27 = dateTime26.era();
        org.joda.time.DateTime dateTime29 = dateTime26.plusDays((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime31 = dateTime19.withZone(dateTimeZone30);
        int int32 = property3.getDifference((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalTime localTime33 = property3.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant17", (dateTime9.compareTo(instant17) == 0) == dateTime9.equals(instant17));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.Chronology chronology7 = copticChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = copticChronology0.getZone();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 0L);
        java.lang.String str18 = dateTimeZone14.getName((long) 5);
        java.lang.String str19 = dateTimeZone14.toString();
        long long21 = dateTimeZone8.getMillisKeepLocal(dateTimeZone14, 1645455242295L);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime27 = dateTime24.withFieldAdded(durationFieldType25, 0);
        org.joda.time.DateTime.Property property28 = dateTime24.minuteOfDay();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property30 = dateTime29.secondOfMinute();
        org.joda.time.DateTime.Property property31 = dateTime29.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime36 = dateTime33.withFieldAdded(durationFieldType34, 0);
        org.joda.time.DateTime.Property property37 = dateTime33.minuteOfDay();
        org.joda.time.DateTime dateTime38 = property37.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfMinute();
        java.lang.String str40 = property39.toString();
        java.util.Locale locale42 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str43 = property39.getAsShortText(locale42);
        java.lang.String str44 = property31.getAsShortText(locale42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property31.getFieldType();
        org.joda.time.chrono.CopticChronology copticChronology46 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField47 = copticChronology46.secondOfMinute();
        org.joda.time.DurationField durationField48 = copticChronology46.months();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology46.millisOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology46.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        long long54 = copticChronology46.add(readablePeriod51, (long) 816, (int) '#');
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType45.getField((org.joda.time.Chronology) copticChronology46);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = dateTimeField55.getType();
        int int57 = localDateTime22.get(dateTimeFieldType56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime22.plusSeconds(53764720);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(dateTimeZone60);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime64 = dateTime61.withFieldAdded(durationFieldType62, 0);
        org.joda.time.DateTime.Property property65 = dateTime61.minuteOfDay();
        org.joda.time.DateTime dateTime66 = property65.withMinimumValue();
        org.joda.time.DateTime.Property property67 = dateTime66.era();
        org.joda.time.DateTime dateTime69 = dateTime66.plusDays((int) 'a');
        org.joda.time.Instant instant71 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone72 = instant71.getZone();
        long long74 = dateTimeZone72.nextTransition((long) 893);
        org.joda.time.Instant instant75 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone76 = instant75.getZone();
        long long78 = dateTimeZone72.getMillisKeepLocal(dateTimeZone76, 0L);
        java.lang.String str80 = dateTimeZone76.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(0L, dateTimeZone76);
        org.joda.time.DateTime dateTime82 = dateTime69.withFields((org.joda.time.ReadablePartial) localDateTime81);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime(dateTimeZone83);
        org.joda.time.DurationFieldType durationFieldType85 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime87 = dateTime84.withFieldAdded(durationFieldType85, 0);
        org.joda.time.DateTime.Property property88 = dateTime84.minuteOfDay();
        org.joda.time.DateTime dateTime89 = property88.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property90 = dateTime89.secondOfMinute();
        java.util.Locale locale91 = java.util.Locale.CANADA;
        java.util.Calendar calendar92 = dateTime89.toCalendar(locale91);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.DateTime.Property property94 = dateTime89.property(dateTimeFieldType93);
        int int95 = localDateTime81.get(dateTimeFieldType93);
        int int96 = localDateTime59.get(dateTimeFieldType93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime24", (instant9.compareTo(dateTime24) == 0) == instant9.equals(dateTime24));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = dateTime21.get(dateTimeFieldType22);
        int int25 = dateTime21.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 490);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded((long) (byte) 10, (int) 'a');
        boolean boolean34 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime28.millisOfDay();
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone37 = instant36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone38);
        int int40 = dateTime39.getMinuteOfDay();
        int int41 = instant36.compareTo((org.joda.time.ReadableInstant) dateTime39);
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Calendar calendar43 = dateTime39.toCalendar(locale42);
        int int44 = property35.getMaximumShortTextLength(locale42);
        java.lang.String str45 = locale42.getDisplayName();
        java.lang.String str46 = locale42.getDisplayCountry();
        java.util.Date date48 = new java.util.Date((long) (byte) 0);
        int int49 = date48.getMinutes();
        int int50 = date48.getDay();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate((java.lang.Object) date48, chronology51);
        org.joda.time.LocalDate localDate54 = localDate52.withYear((-1));
        org.joda.time.LocalDate.Property property55 = localDate54.yearOfEra();
        org.joda.time.DateTimeField dateTimeField56 = property55.getField();
        org.joda.time.DurationField durationField57 = dateTimeField56.getRangeDurationField();
        java.util.Locale locale60 = java.util.Locale.KOREA;
        long long61 = dateTimeField56.set((long) 8, "53640", locale60);
        java.util.Locale locale62 = locale60.stripExtensions();
        java.util.Locale.setDefault(locale60);
        java.lang.String str64 = locale42.getDisplayCountry(locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        java.lang.String str11 = dateTimeZone6.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 57635003L, dateTimeZone6);
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayName();
        java.lang.String str16 = dateTimeZone6.getShortName(21595320272L, locale14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime21 = dateTime18.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateTime.Property property22 = dateTime18.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withEra(1);
        int int27 = localDateTime26.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime26.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray30 = localDateTime26.getFields();
        int int31 = property22.compareTo((org.joda.time.ReadablePartial) localDateTime26);
        boolean boolean32 = dateTimeZone6.equals((java.lang.Object) int31);
        java.util.Date date34 = new java.util.Date((long) (byte) 0);
        int int35 = date34.getMinutes();
        int int36 = date34.getTimezoneOffset();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.fromDateFields(date34);
        boolean boolean38 = dateTimeZone6.equals((java.lang.Object) date34);
        int int40 = dateTimeZone6.getStandardOffset((-61773865191965L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime18", (instant1.compareTo(dateTime18) == 0) == instant1.equals(dateTime18));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) '#');
        long long23 = dateTimeZone18.convertUTCToLocal(1645455273619L);
        java.lang.String str25 = dateTimeZone18.getNameKey(53672844087L);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) dateTime11, (org.joda.time.Chronology) copticChronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime0.getMillisOfDay();
        org.joda.time.DateTime.Property property8 = dateTime0.secondOfDay();
        org.joda.time.DateTime dateTime10 = dateTime0.minusYears(52);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        boolean boolean13 = dateTimeZone11.isStandardOffset(221413222375000L);
        org.joda.time.DateTime dateTime14 = dateTime0.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime14", (dateTime0.compareTo(dateTime14) == 0) == dateTime0.equals(dateTime14));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withDurationAdded(0L, 52);
        java.util.Date date12 = new java.util.Date((long) (byte) 0);
        int int13 = date12.getMinutes();
        int int14 = date12.getDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) date12, chronology15);
        org.joda.time.LocalDate localDate18 = localDate16.withYear((-1));
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.DurationField durationField21 = dateTimeField20.getRangeDurationField();
        org.joda.time.DurationField durationField22 = dateTimeField20.getDurationField();
        long long25 = dateTimeField20.getDifferenceAsLong(0L, 10598050640800L);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = dateTimeField20.getType();
        org.joda.time.DateTime dateTime28 = dateTime6.withField(dateTimeFieldType26, 563);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear(9);
        org.joda.time.DateTime dateTime33 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMonths(241);
        org.joda.time.DateTime dateTime37 = dateTime33.withCenturyOfEra(669);
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime40 = dateTime33.minus(10598050640800L);
        boolean boolean41 = dateTime6.equals((java.lang.Object) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant38", (dateTime1.compareTo(instant38) == 0) == dateTime1.equals(instant38));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.YearMonthDay yearMonthDay22 = dateTime21.toYearMonthDay();
        org.joda.time.DateTime dateTime24 = dateTime21.plusSeconds(20);
        org.joda.time.DateTime.Property property25 = dateTime24.dayOfWeek();
        org.joda.time.DateTime dateTime26 = property25.roundHalfEvenCopy();
        java.util.Date date28 = new java.util.Date((long) (byte) 0);
        int int29 = date28.getMinutes();
        int int30 = date28.getDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) date28, chronology31);
        org.joda.time.LocalDate localDate34 = localDate32.withYear((-1));
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfEra();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        int int37 = property35.getMaximumValueOverall();
        org.joda.time.LocalDate localDate38 = property35.roundCeilingCopy();
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        long long42 = dateTimeZone40.nextTransition((long) 893);
        java.util.Locale locale44 = java.util.Locale.CANADA;
        java.lang.String str45 = dateTimeZone40.getName((long) (short) 0, locale44);
        java.util.TimeZone timeZone46 = dateTimeZone40.toTimeZone();
        org.joda.time.DateTime dateTime47 = localDate38.toDateTimeAtCurrentTime(dateTimeZone40);
        org.joda.time.DateTime dateTime48 = dateTime47.toDateTimeISO();
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = instant49.toMutableDateTime();
        int int51 = property25.compareTo((org.joda.time.ReadableInstant) instant49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime50", (dateTime20.compareTo(mutableDateTime50) == 0) == dateTime20.equals(mutableDateTime50));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.DateTime dateTime13 = dateTime6.minusMinutes((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime15.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone18);
        boolean boolean21 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime13.plusMillis(658);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.hours();
        org.joda.time.DurationField durationField10 = copticChronology1.minutes();
        org.joda.time.DurationField durationField11 = copticChronology1.hours();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.millisOfSecond();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 211, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology1.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology19.months();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology19.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter18.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter24.withPivotYear(53716584);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter24.withDefaultYear(500);
        org.joda.time.Chronology chronology29 = dateTimeFormatter24.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter24.withDefaultYear(1738);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone33 = instant32.getZone();
        long long35 = dateTimeZone33.nextTransition((long) 893);
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = dateTimeZone33.getName((long) (short) 0, locale37);
        java.util.TimeZone timeZone39 = dateTimeZone33.toTimeZone();
        java.lang.String str41 = dateTimeZone33.getName((long) 12);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(dateTimeZone33);
        long long47 = dateTimeZone33.convertLocalToUTC(1601683200000L, true, (long) 63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter31.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology49 = copticChronology1.withZone(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and instant32", (dateTime23.compareTo(instant32) == 0) == dateTime23.equals(instant32));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long10 = dateTimeZone1.convertLocalToUTC((long) 11, false);
        long long12 = dateTimeZone1.nextTransition((long) '#');
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
        java.lang.String str15 = dateTimeZone1.toString();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        int int20 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTime dateTime22 = dateTime19.plusWeeks(10);
        org.joda.time.DateTime.Property property23 = dateTime19.minuteOfDay();
        int int24 = dateTime19.getMinuteOfDay();
        org.joda.time.Chronology chronology25 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime17.withChronology(chronology25);
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology27.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = copticChronology27.weekyearOfCentury();
        boolean boolean31 = dateTime17.equals((java.lang.Object) copticChronology27);
        java.util.GregorianCalendar gregorianCalendar32 = dateTime17.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime19", (instant0.compareTo(dateTime19) == 0) == instant0.equals(dateTime19));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime29.getZone();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.ReadableInstant readableInstant34 = null;
        int int35 = dateTimeZone32.getOffset(readableInstant34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, 0);
        org.joda.time.DateTime.Property property26 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.DateTime dateTime29 = property26.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime30 = property26.roundCeilingCopy();
        org.joda.time.DateTime dateTime31 = property26.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime33 = dateTime31.withHourOfDay(1);
        org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField35 = copticChronology34.secondOfMinute();
        org.joda.time.DurationField durationField36 = copticChronology34.months();
        org.joda.time.DateTimeZone dateTimeZone37 = copticChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology34.hourOfHalfday();
        org.joda.time.DurationField durationField39 = dateTimeField38.getLeapDurationField();
        long long41 = dateTimeField38.roundCeiling(0L);
        int int42 = dateTime31.get(dateTimeField38);
        org.joda.time.DateTime dateTime43 = localDate20.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime22", (instant8.compareTo(dateTime22) == 0) == instant8.equals(dateTime22));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        int int3 = dateTimeField2.getMaximumValue();
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone6.nextTransition((long) 893);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone10, 0L);
        java.lang.String str14 = dateTimeZone10.getName((long) 5);
        java.lang.String str15 = dateTimeZone10.toString();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((java.lang.Object) 57635003L, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.yearOfEra();
        java.util.Locale locale20 = new java.util.Locale("hi!", "");
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale20.getDisplayName();
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale20.getDisplayName(locale23);
        java.util.Set<java.lang.Character> charSet25 = locale20.getExtensionKeys();
        java.lang.String str26 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDateTime16, locale20);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(chronology27);
        int int29 = localTime28.getHourOfDay();
        org.joda.time.LocalTime.Property property30 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property30.withMaximumValue();
        int int33 = localTime32.getMillisOfSecond();
        org.joda.time.LocalTime.Property property34 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = localTime35.withMillisOfDay(492);
        org.joda.time.LocalTime localTime39 = localTime35.minusMillis(790);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime42 = localTime35.withPeriodAdded(readablePeriod40, (-625));
        org.joda.time.Chronology chronology43 = localTime35.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        int int46 = dateTime45.getMinuteOfDay();
        org.joda.time.DateTime dateTime48 = dateTime45.plusWeeks(10);
        org.joda.time.DateTime.Property property49 = dateTime45.minuteOfDay();
        org.joda.time.DurationField durationField50 = property49.getDurationField();
        org.joda.time.DurationFieldType durationFieldType51 = durationField50.getType();
        boolean boolean52 = localTime35.isSupported(durationFieldType51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime16.withFieldAdded(durationFieldType51, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime45", (instant9.compareTo(dateTime45) == 0) == instant9.equals(dateTime45));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTime.Property property13 = dateTime11.millisOfDay();
        int int14 = dateTime11.getSecondOfMinute();
        org.joda.time.tz.NameProvider nameProvider15 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale18 = new java.util.Locale("hi!", "");
        java.lang.String str19 = locale18.getDisplayCountry();
        java.lang.String str22 = nameProvider15.getShortName(locale18, "2022-02-21T14:54:13.248", "");
        java.util.Locale locale25 = new java.util.Locale("hi!", "");
        java.lang.String str28 = nameProvider15.getName(locale25, "\uc911\uad6d", "\u52a0\u62ff\u5927");
        java.util.Calendar calendar29 = dateTime11.toCalendar(locale25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime31.toMutableDateTime(dateTimeZone34);
        int int36 = dateTime31.getCenturyOfEra();
        org.joda.time.DateTime dateTime38 = dateTime31.withMillisOfSecond(53);
        org.joda.time.DateTime.Property property39 = dateTime31.millisOfDay();
        java.lang.String str40 = dateTime31.toString();
        int int41 = dateTime31.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime31.getZone();
        org.joda.time.DateTime dateTime43 = dateTime11.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.minus(readableDuration22);
        int int24 = dateTime23.getMinuteOfDay();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMonths(53638);
        org.joda.time.DateTime dateTime28 = dateTime23.withYear(940);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(659);
        org.joda.time.DateTime dateTime31 = dateTime23.withZoneRetainFields(dateTimeZone30);
        int int32 = dateTime23.getMillisOfDay();
        boolean boolean34 = dateTime23.isBefore(3398832L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime4 = dateTime1.withPeriodAdded(readablePeriod2, 5);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, 0);
        org.joda.time.DateTime.Property property10 = dateTime6.minuteOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfMinute();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime11.withDurationAdded(readableDuration14, 6);
        int int17 = dateTime16.getMinuteOfHour();
        org.joda.time.DateTime.Property property18 = dateTime16.millisOfDay();
        int int19 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime16.toMutableDateTimeISO();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField28 = copticChronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology21.clockhourOfDay();
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.Instant instant32 = instant30.withMillis((long) 1);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        long long36 = dateTimeZone34.nextTransition((long) 893);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone34.getMillisKeepLocal(dateTimeZone38, 0L);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) instant30, dateTimeZone38);
        org.joda.time.LocalTime localTime43 = localTime41.minusMillis(12);
        org.joda.time.LocalTime localTime45 = localTime41.plusMillis((int) (short) 10);
        int[] intArray47 = copticChronology21.get((org.joda.time.ReadablePartial) localTime45, (long) 17);
        org.joda.time.DateTimeField dateTimeField48 = copticChronology21.dayOfWeek();
        org.joda.time.DurationField durationField49 = copticChronology21.weekyears();
        org.joda.time.DurationField durationField50 = copticChronology21.months();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology21);
        org.joda.time.DateTime dateTime52 = dateTime51.withTimeAtStartOfDay();
        boolean boolean53 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime6 = dateTime3.withFieldAdded(durationFieldType4, 0);
        boolean boolean7 = dateTime1.isEqual((org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime1.getMillisOfDay();
        org.joda.time.DateTime dateTime10 = dateTime1.minusYears((int) (short) 0);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DateTime dateTime17 = dateTime1.toDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTime17.getZone();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 215, dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime17", (dateTime1.compareTo(dateTime17) == 0) == dateTime1.equals(dateTime17));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = dateTimeZone8.getName((long) (short) 0, locale12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(dateTimeZone8);
        org.joda.time.LocalTime localTime16 = localTime14.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfWeek(2);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) dateTime18);
        int int22 = dateTime21.getEra();
        org.joda.time.TimeOfDay timeOfDay23 = dateTime21.toTimeOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.plusSeconds(21);
        org.joda.time.DateTime dateTime27 = dateTime21.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime28 = localTime16.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getRangeDurationType();
        int int31 = dateTime28.get(dateTimeFieldType29);
        boolean boolean32 = dateTime5.isSupported(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant7", (dateTime0.compareTo(instant7) == 0) == dateTime0.equals(instant7));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekOfWeekyear(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDate.Property property22 = localDate20.property(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime27 = dateTime24.withFieldAdded(durationFieldType25, 0);
        org.joda.time.DateTime.Property property28 = dateTime24.minuteOfDay();
        org.joda.time.DateTime dateTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property30 = dateTime29.secondOfMinute();
        int int31 = dateTime29.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean33 = dateTime29.isSupported(dateTimeFieldType32);
        boolean boolean34 = localDate20.isSupported(dateTimeFieldType32);
        org.joda.time.LocalDate.Property property35 = localDate20.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime24", (instant8.compareTo(dateTime24) == 0) == instant8.equals(dateTime24));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.Instant instant3 = instant0.plus(1645455324838L);
        org.joda.time.Instant instant5 = instant0.plus((-1806581999000L));
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant5.withDurationAdded(readableDuration6, 13);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        boolean boolean11 = instant8.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and mutableDateTime9", (instant8.compareTo(mutableDateTime9) == 0) == instant8.equals(mutableDateTime9));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        java.util.Date date6 = new java.util.Date((long) (byte) 0);
        int int7 = date6.getMinutes();
        int int8 = date6.getDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) date6, chronology9);
        org.joda.time.LocalDate localDate12 = localDate10.withYear((-1));
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        int int15 = property13.getMaximumValueOverall();
        org.joda.time.LocalDate localDate16 = property13.roundCeilingCopy();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = dateTimeZone18.getName((long) (short) 0, locale22);
        java.util.TimeZone timeZone24 = dateTimeZone18.toTimeZone();
        org.joda.time.DateTime dateTime25 = localDate16.toDateTimeAtCurrentTime(dateTimeZone18);
        long long27 = dateTimeZone3.getMillisKeepLocal(dateTimeZone18, 1645455248677L);
        java.lang.String str29 = dateTimeZone18.getNameKey((long) 54099330);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant17", (dateTime4.compareTo(instant17) == 0) == dateTime4.equals(instant17));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate20 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, 0);
        org.joda.time.DateTime dateTime27 = dateTime22.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime.Property property28 = dateTime22.monthOfYear();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTime dateTime30 = property28.roundHalfCeilingCopy();
        int int31 = property19.getDifference((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalDate localDate33 = property19.addWrapFieldToCopy(4);
        org.joda.time.LocalDate localDate34 = property19.getLocalDate();
        org.joda.time.LocalDate.Property property35 = localDate34.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime22", (instant8.compareTo(dateTime22) == 0) == instant8.equals(dateTime22));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.minusMinutes((-1));
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfSecond();
        org.joda.time.DateTime.Property property9 = dateTime7.dayOfYear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy((-6048027));
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfEra(893);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        org.joda.time.Instant instant18 = instant16.withMillis((long) 53871859);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime23 = dateTime20.withFieldAdded(durationFieldType21, 0);
        org.joda.time.DateTime.Property property24 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property26 = dateTime25.secondOfMinute();
        java.lang.String str27 = property26.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime32 = dateTime29.withFieldAdded(durationFieldType30, 0);
        org.joda.time.DateTime.Property property33 = dateTime29.minuteOfDay();
        org.joda.time.DateTime dateTime34 = property33.roundHalfEvenCopy();
        int int35 = dateTime34.getYearOfCentury();
        long long36 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfWeek(2);
        long long41 = dateTime38.getMillis();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime44 = dateTime38.withPeriodAdded(readablePeriod42, 9);
        int int45 = dateTime34.compareTo((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime.Property property46 = dateTime44.weekyear();
        org.joda.time.DateTime.Property property47 = dateTime44.weekyear();
        java.util.Date date49 = new java.util.Date((long) (byte) 0);
        int int50 = date49.getMinutes();
        int int51 = date49.getDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) date49, chronology52);
        int int54 = localDate53.getDayOfWeek();
        org.joda.time.LocalDate localDate56 = localDate53.minusWeeks(272);
        org.joda.time.LocalDate.Property property57 = localDate56.dayOfYear();
        org.joda.time.LocalDate localDate58 = property57.roundHalfCeilingCopy();
        int int59 = property57.getMaximumValueOverall();
        org.joda.time.LocalDate localDate60 = property57.withMinimumValue();
        int int61 = property47.compareTo((org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTime dateTime62 = property47.roundCeilingCopy();
        org.joda.time.DateTime dateTime63 = property47.roundHalfCeilingCopy();
        boolean boolean64 = instant16.isEqual((org.joda.time.ReadableInstant) dateTime63);
        boolean boolean65 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant16", (dateTime15.compareTo(instant16) == 0) == dateTime15.equals(instant16));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime5 = dateTime2.withFieldAdded(durationFieldType3, 0);
        boolean boolean6 = dateTime0.isEqual((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        java.lang.String str17 = dateTimeZone13.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(0L, dateTimeZone13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property20 = dateTime19.era();
        java.util.Date date21 = dateTime19.toDate();
        boolean boolean22 = dateTime5.isBefore((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime dateTime24 = dateTime5.plusYears(210);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant8", (dateTime0.compareTo(instant8) == 0) == dateTime0.equals(instant8));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.Instant instant22 = dateTime21.toInstant();
        int int23 = dateTime21.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime31 = dateTime28.withDurationAdded((long) 16, 22);
        org.joda.time.DateTime dateTime33 = dateTime31.withHourOfDay(16);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone34);
        int int36 = dateTime35.getMinuteOfDay();
        org.joda.time.DateTime dateTime38 = dateTime35.plusWeeks(10);
        org.joda.time.DateTime.Property property39 = dateTime35.minuteOfDay();
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone41 = instant40.getZone();
        long long43 = dateTimeZone41.nextTransition((long) 893);
        org.joda.time.Instant instant44 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone45 = instant44.getZone();
        long long47 = dateTimeZone41.getMillisKeepLocal(dateTimeZone45, 0L);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime35.toMutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime31.toMutableDateTime(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime31.getZone();
        org.joda.time.LocalDate localDate52 = org.joda.time.LocalDate.now(dateTimeZone51);
        org.joda.time.DateTime dateTime53 = dateTime21.toDateTime(dateTimeZone51);
        int int54 = dateTime53.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime25", (instant12.compareTo(dateTime25) == 0) == instant12.equals(dateTime25));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        org.joda.time.DateTime dateTime17 = property15.getDateTime();
        org.joda.time.DateTime dateTime18 = property15.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property15.getFieldType();
        org.joda.time.DateTime dateTime20 = property15.roundHalfCeilingCopy();
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.Instant instant23 = instant21.withMillis((long) 1);
        long long24 = instant23.getMillis();
        org.joda.time.DateTime dateTime25 = instant23.toDateTime();
        boolean boolean26 = dateTime20.isBefore((org.joda.time.ReadableInstant) instant23);
        org.joda.time.DateTime dateTime27 = instant23.toDateTimeISO();
        long long28 = instant23.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        int int4 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withCenturyOfEra(35);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = dateTimeZone8.getName((long) (short) 0, locale12);
        java.util.TimeZone timeZone14 = dateTimeZone8.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.format.DateTimeParser dateTimeParser19 = dateTimeFormatter18.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter18.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter23.withPivotYear((java.lang.Integer) 14);
        int int28 = dateTimeFormatter23.getDefaultYear();
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter23.withLocale(locale29);
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.lang.String str32 = locale29.getDisplayScript(locale31);
        java.lang.String str33 = dateTimeZone8.getName((-61788528000000L), locale29);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime6.toMutableDateTime(dateTimeZone8);
        org.joda.time.chrono.CopticChronology copticChronology36 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant7", (dateTime1.compareTo(instant7) == 0) == dateTime1.equals(instant7));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        boolean boolean27 = dateTimeZone24.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 3);
        boolean boolean30 = dateTimeZone24.equals((java.lang.Object) 3);
        org.joda.time.DateTime dateTime31 = dateTime19.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant34.withDurationAdded(readableDuration36, 2);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        int int41 = dateTime40.getMinuteOfDay();
        org.joda.time.DateTime dateTime43 = dateTime40.plusWeeks(10);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone46.nextTransition((long) 893);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone50, 0L);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime40.toMutableDateTime(dateTimeZone46);
        boolean boolean54 = instant38.isEqual((org.joda.time.ReadableInstant) dateTime40);
        int int55 = property32.compareTo((org.joda.time.ReadableInstant) instant38);
        org.joda.time.DateTime dateTime56 = instant38.toDateTimeISO();
        org.joda.time.Instant instant58 = instant38.withMillis(10598641080467L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        boolean boolean27 = dateTimeZone24.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 3);
        boolean boolean30 = dateTimeZone24.equals((java.lang.Object) 3);
        org.joda.time.DateTime dateTime31 = dateTime19.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime33 = dateTime31.plusDays(62);
        org.joda.time.DateTime.Property property34 = dateTime33.secondOfMinute();
        org.joda.time.DateTime.Property property35 = dateTime33.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withDayOfWeek(2);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((java.lang.Object) dateTime21);
        int int25 = dateTime24.getYearOfCentury();
        boolean boolean26 = strSet9.remove((java.lang.Object) int25);
        strSet9.clear();
        java.util.Iterator<java.lang.String> strItor28 = strSet9.iterator();
        java.util.Locale.Category category29 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale30 = java.util.Locale.getDefault(category29);
        java.util.Locale.Category[] categoryArray31 = new java.util.Locale.Category[] { category29 };
        java.util.Locale.Category[] categoryArray32 = strSet9.toArray(categoryArray31);
        java.util.Set[] setArray34 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray35 = (java.util.Set<java.lang.String>[]) setArray34;
        java.util.Set[] setArray37 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray38 = (java.util.Set<java.lang.String>[]) setArray37;
        java.util.Set[] setArray40 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray41 = (java.util.Set<java.lang.String>[]) setArray40;
        java.util.Set[] setArray43 = new java.util.Set[0];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[] strSetArray44 = (java.util.Set<java.lang.String>[]) setArray43;
        java.util.Set[][] setArray46 = new java.util.Set[4][];
        @SuppressWarnings("unchecked")
        java.util.Set<java.lang.String>[][] strSetArray47 = (java.util.Set<java.lang.String>[][]) setArray46;
        strSetArray47[0] = strSetArray35;
        strSetArray47[1] = strSetArray38;
        strSetArray47[2] = setArray40;
        strSetArray47[3] = setArray43;
        java.util.Set<java.lang.String>[][] strSetArray56 = strSet9.toArray(strSetArray47);
        org.joda.time.Instant instant58 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone59 = instant58.getZone();
        long long61 = dateTimeZone59.nextTransition((long) 893);
        java.util.Locale locale63 = java.util.Locale.CANADA;
        java.lang.String str64 = dateTimeZone59.getName((long) (short) 0, locale63);
        java.util.TimeZone timeZone65 = dateTimeZone59.toTimeZone();
        long long68 = dateTimeZone59.adjustOffset(25L, false);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 512, dateTimeZone59);
        boolean boolean70 = strSet9.remove((java.lang.Object) dateTime69);
        org.joda.time.Instant instant71 = dateTime69.toInstant();
        org.joda.time.DateTime dateTime72 = instant71.toDateTimeISO();
        long long73 = instant71.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant58", (dateTime21.compareTo(instant58) == 0) == dateTime21.equals(instant58));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        int int18 = dateTime17.getMinuteOfDay();
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime17.toMutableDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime15.toMutableDateTime(dateTimeZone20);
        org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology24.secondOfMinute();
        org.joda.time.DurationField durationField26 = copticChronology24.months();
        org.joda.time.DateTimeZone dateTimeZone27 = copticChronology24.getZone();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology24.hourOfHalfday();
        int int29 = copticChronology24.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.Chronology chronology31 = copticChronology24.withZone(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology24.getZone();
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now(dateTimeZone34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int37 = localDateTime35.get(dateTimeFieldType36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime40 = property38.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusHours(252);
        boolean boolean43 = dateTimeZone32.isLocalDateTimeGap(localDateTime40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((-52802988L), dateTimeZone32);
        org.joda.time.chrono.CopticChronology copticChronology45 = org.joda.time.chrono.CopticChronology.getInstance();
        long long51 = copticChronology45.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField52 = copticChronology45.halfdayOfDay();
        org.joda.time.DurationField durationField53 = copticChronology45.halfdays();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.lang.String str58 = dateTimeZone55.getName((long) 32769, locale57);
        org.joda.time.Chronology chronology59 = copticChronology45.withZone(dateTimeZone55);
        long long61 = dateTimeZone32.getMillisKeepLocal(dateTimeZone55, 53737076L);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now(dateTimeZone55);
        long long64 = dateTimeZone20.getMillisKeepLocal(dateTimeZone55, (long) 178);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime17", (dateTime15.compareTo(dateTime17) == 0) == dateTime15.equals(dateTime17));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.plus((long) 53);
        org.joda.time.MutableDateTime mutableDateTime3 = instant2.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.minus(readableDuration5);
        org.joda.time.Instant instant7 = instant2.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant2.minus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and instant9", (mutableDateTime3.compareTo(instant9) == 0) == mutableDateTime3.equals(instant9));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime6.withYearOfEra(740);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property12.setCopy(952);
        org.joda.time.DateTime dateTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays(70);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond(558);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTime.Property property27 = dateTime25.yearOfCentury();
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        long long30 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str31 = dateTime29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant28", (dateTime25.compareTo(instant28) == 0) == dateTime25.equals(instant28));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.withCenturyOfEra(14);
        org.joda.time.DateTime dateTime19 = localDate18.toDateTimeAtMidnight();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        long long26 = copticChronology20.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField27 = copticChronology20.months();
        java.lang.String str28 = copticChronology20.toString();
        int int29 = copticChronology20.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField30 = copticChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology20.dayOfYear();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((org.joda.time.Chronology) copticChronology20);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.Instant instant35 = instant33.toInstant();
        org.joda.time.DateTimeZone dateTimeZone36 = instant33.getZone();
        org.joda.time.DateTime dateTime37 = dateTime32.toDateTime(dateTimeZone36);
        boolean boolean38 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime32", (instant8.compareTo(dateTime32) == 0) == instant8.equals(dateTime32));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime1.withDayOfYear(52);
        org.joda.time.DateTime dateTime9 = dateTime1.plusWeeks(256);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        long long13 = dateTimeZone11.nextTransition((long) 893);
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = dateTimeZone11.getName((long) (short) 0, locale15);
        java.util.TimeZone timeZone17 = dateTimeZone11.toTimeZone();
        long long20 = dateTimeZone11.adjustOffset(25L, false);
        int int22 = dateTimeZone11.getStandardOffset(1645455324838L);
        int int24 = dateTimeZone11.getOffset(0L);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone11);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("2022-02-21T14:55:53.529");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale27);
        boolean boolean29 = dateTimeZone11.equals((java.lang.Object) calendar28);
        org.joda.time.DateTime dateTime30 = dateTime9.withZoneRetainFields(dateTimeZone11);
        java.lang.String str32 = dateTimeZone11.getName((long) 146937);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(616);
        org.joda.time.DateTime dateTime11 = property5.getDateTime();
        org.joda.time.DateTime dateTime13 = property5.addToCopy(935);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime13);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, 0L);
        long long25 = dateTimeZone16.convertLocalToUTC((long) 11, false);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.ReadableInstant readableInstant27 = null;
        int int28 = dateTimeZone16.getOffset(readableInstant27);
        org.joda.time.DateTime dateTime29 = dateTime14.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime31 = dateTime14.plusMonths(609);
        org.joda.time.DateTime dateTime33 = dateTime14.withMillis(900064028869466L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant15", (dateTime1.compareTo(instant15) == 0) == dateTime1.equals(instant15));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillisOfSecond(53);
        int int9 = dateTime8.getYearOfEra();
        org.joda.time.DateMidnight dateMidnight10 = dateTime8.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Date date8 = dateTime6.toDate();
        org.joda.time.DateTime dateTime10 = dateTime6.plusYears((int) 'u');
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        org.joda.time.Instant instant13 = instant11.plus((long) 19);
        org.joda.time.Instant instant15 = instant13.withMillis((long) 1969);
        boolean boolean16 = instant13.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant11", (dateTime6.compareTo(instant11) == 0) == dateTime6.equals(instant11));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        int int7 = dateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = dateTime4.toLocalDateTime();
        org.joda.time.Instant instant9 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) instant9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant9.minus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime11", (dateTime4.compareTo(dateTime11) == 0) == dateTime4.equals(dateTime11));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMonths(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate26 = localDate24.minusYears(900000);
        org.joda.time.LocalDate.Property property27 = localDate24.dayOfMonth();
        org.joda.time.LocalDate localDate28 = property27.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded((long) 16, 22);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime33.getZone();
        org.joda.time.ReadableInstant readableInstant38 = null;
        boolean boolean39 = dateTime33.isAfter(readableInstant38);
        org.joda.time.YearMonthDay yearMonthDay40 = dateTime33.toYearMonthDay();
        org.joda.time.DateTime dateTime41 = localDate28.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime30", (instant8.compareTo(dateTime30) == 0) == instant8.equals(dateTime30));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        java.util.Date date1 = new java.util.Date((long) 940);
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        long long5 = dateTimeZone3.nextTransition((long) 893);
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = dateTimeZone3.getName((long) (short) 0, locale7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(dateTimeZone3);
        org.joda.time.LocalTime localTime11 = localTime9.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfWeek(2);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) dateTime13);
        int int17 = dateTime16.getEra();
        org.joda.time.TimeOfDay timeOfDay18 = dateTime16.toTimeOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.plusSeconds(21);
        org.joda.time.DateTime dateTime22 = dateTime16.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime23 = localTime11.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType24.getRangeDurationType();
        int int26 = dateTime23.get(dateTimeFieldType24);
        int int27 = dateTime23.getMinuteOfDay();
        org.joda.time.DateTime.Property property28 = dateTime23.era();
        org.joda.time.format.DateTimePrinter dateTimePrinter29 = null;
        org.joda.time.format.DateTimeParser dateTimeParser30 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter29, dateTimeParser30);
        org.joda.time.chrono.CopticChronology copticChronology32 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology32.secondOfMinute();
        org.joda.time.DurationField durationField34 = copticChronology32.months();
        org.joda.time.DateTimeZone dateTimeZone35 = copticChronology32.getZone();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter31.withZone(dateTimeZone35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime23, dateTimeZone35);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(chronology40);
        int int42 = localTime41.getHourOfDay();
        org.joda.time.LocalTime.Property property43 = localTime41.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getDurationType();
        boolean boolean47 = localTime44.isSupported(dateTimeFieldType45);
        int int48 = dateTime23.get(dateTimeFieldType45);
        org.joda.time.DateTime.Property property49 = dateTime23.minuteOfDay();
        org.joda.time.DateTime dateTime51 = dateTime23.plusMillis(53681399);
        java.util.Date date52 = dateTime23.toDate();
        boolean boolean53 = date1.before(date52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime13", (instant2.compareTo(dateTime13) == 0) == instant2.equals(dateTime13));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.plusDays(490);
        org.joda.time.DateTime dateTime6 = dateTime2.withWeekyear(104);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        java.util.Locale.Category category20 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category20, locale21);
        java.util.Calendar calendar23 = dateTime19.toCalendar(locale21);
        org.joda.time.DateTime dateTime25 = dateTime19.withMillis(27738633602000L);
        org.joda.time.DateTime.Property property26 = dateTime25.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime31 = dateTime28.withFieldAdded(durationFieldType29, 0);
        org.joda.time.DateTime.Property property32 = dateTime28.minuteOfDay();
        org.joda.time.DateTime dateTime33 = property32.withMinimumValue();
        org.joda.time.DateTime dateTime35 = property32.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime36 = property32.roundCeilingCopy();
        org.joda.time.DateTime dateTime37 = property32.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime38 = property32.roundCeilingCopy();
        org.joda.time.DateTime dateTime40 = property32.setCopy(0);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property41.getFieldType();
        int int43 = dateTime25.get(dateTimeFieldType42);
        int int44 = dateTime2.get(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime2.getZone();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(dateTimeZone45);
        java.lang.String str47 = dateTimeZone45.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime6.withYearOfEra(740);
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property12.setCopy(952);
        org.joda.time.DateTime dateTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays(70);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withMillisOfSecond(558);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTime.Property property27 = dateTime25.yearOfCentury();
        org.joda.time.Instant instant28 = dateTime25.toInstant();
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        long long30 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime31 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime32 = property12.withMaximumValue();
        org.joda.time.DateTime dateTime33 = property12.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant28", (dateTime25.compareTo(instant28) == 0) == dateTime25.equals(instant28));
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime31 = dateTime29.withYearOfEra(881);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        boolean boolean33 = instant32.isAfterNow();
        org.joda.time.Instant instant35 = instant32.plus((long) 53671795);
        org.joda.time.Instant instant38 = instant35.withDurationAdded(35L, 54053000);
        int int39 = dateTime31.compareTo((org.joda.time.ReadableInstant) instant38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromCalendarFields(calendar9);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        timeZone11.setID("hi!");
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = calendar9.after((java.lang.Object) calendar14);
        boolean boolean16 = calendar14.isWeekDateSupported();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        int int21 = dateTime20.getMinuteOfDay();
        int int22 = instant17.compareTo((org.joda.time.ReadableInstant) dateTime20);
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.util.Calendar calendar24 = dateTime20.toCalendar(locale23);
        java.util.Date date26 = new java.util.Date((long) (byte) 0);
        int int27 = date26.getMinutes();
        int int28 = date26.getDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) date26, chronology29);
        org.joda.time.LocalDate localDate32 = localDate30.withYear((-1));
        org.joda.time.LocalDate.Property property33 = localDate32.yearOfEra();
        org.joda.time.DateTimeField dateTimeField34 = property33.getField();
        int int35 = property33.getMaximumValueOverall();
        org.joda.time.LocalDate localDate36 = property33.roundCeilingCopy();
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = dateTimeZone38.getName((long) (short) 0, locale42);
        java.util.TimeZone timeZone44 = dateTimeZone38.toTimeZone();
        org.joda.time.DateTime dateTime45 = localDate36.toDateTimeAtCurrentTime(dateTimeZone38);
        org.joda.time.DateTime dateTime46 = dateTime20.withZone(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int48 = dateTime46.get(dateTimeFieldType47);
        java.lang.String str49 = dateTime46.toString();
        boolean boolean50 = calendar14.before((java.lang.Object) str49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime10 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime11 = property5.roundCeilingCopy();
        boolean boolean13 = dateTime11.isEqual((long) 70);
        int int14 = dateTime11.getYearOfCentury();
        org.joda.time.DateTime dateTime16 = dateTime11.minusWeeks(308);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(790);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        long long25 = copticChronology19.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField26 = copticChronology19.months();
        java.util.Date date28 = new java.util.Date((long) (byte) 0);
        int int29 = date28.getMinutes();
        int int30 = date28.getDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) date28, chronology31);
        int int33 = localDate32.getDayOfWeek();
        org.joda.time.LocalDate localDate35 = localDate32.minusWeeks(272);
        int[] intArray37 = copticChronology19.get((org.joda.time.ReadablePartial) localDate35, (long) 21);
        java.util.Date date39 = new java.util.Date((long) (byte) 0);
        int int40 = date39.getMinutes();
        int int41 = date39.getDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((java.lang.Object) date39, chronology42);
        org.joda.time.LocalDate localDate45 = localDate43.withYear((-1));
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfEra();
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        org.joda.time.DurationField durationField48 = dateTimeField47.getRangeDurationField();
        org.joda.time.DurationField durationField49 = dateTimeField47.getRangeDurationField();
        java.util.Date date51 = new java.util.Date((long) (byte) 0);
        int int52 = date51.getMinutes();
        int int53 = date51.getDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((java.lang.Object) date51, chronology54);
        org.joda.time.LocalDate localDate57 = localDate55.withYear((-1));
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfEra();
        org.joda.time.DateTimeField dateTimeField59 = property58.getField();
        int int60 = property58.getMaximumValueOverall();
        org.joda.time.LocalDate localDate61 = property58.roundCeilingCopy();
        int int62 = dateTimeField47.getMinimumValue((org.joda.time.ReadablePartial) localDate61);
        org.joda.time.LocalDate localDate64 = localDate61.plusDays(53637233);
        org.joda.time.ReadablePeriod readablePeriod65 = null;
        org.joda.time.LocalDate localDate66 = localDate64.minus(readablePeriod65);
        java.util.Locale locale68 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str69 = locale68.getScript();
        java.util.Locale locale70 = java.util.Locale.KOREA;
        java.lang.String str71 = locale68.getDisplayCountry(locale70);
        java.lang.String str72 = localDate64.toString("0", locale70);
        org.joda.time.LocalDate localDate74 = localDate64.plusDays(669);
        org.joda.time.Instant instant76 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone77 = instant76.getZone();
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 16, dateTimeZone77);
        org.joda.time.Interval interval79 = localDate64.toInterval(dateTimeZone77);
        org.joda.time.Chronology chronology80 = copticChronology19.withZone(dateTimeZone77);
        org.joda.time.DateTimeField dateTimeField81 = copticChronology19.year();
        org.joda.time.DateTime dateTime82 = dateTime16.withChronology((org.joda.time.Chronology) copticChronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant76", (dateTime1.compareTo(instant76) == 0) == dateTime1.equals(instant76));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.DateTime dateTime3 = instant0.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, 0);
        org.joda.time.DateTime.Property property9 = dateTime5.minuteOfDay();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime12 = property9.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime13 = property9.roundCeilingCopy();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.halfdayOfDay();
        org.joda.time.DateTime dateTime19 = dateTime13.toDateTime((org.joda.time.Chronology) copticChronology14);
        boolean boolean20 = dateTime3.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTime.Property property21 = dateTime19.millisOfDay();
        org.joda.time.DateTime.Property property22 = dateTime19.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime1", (instant0.compareTo(dateTime1) == 0) == instant0.equals(dateTime1));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(dateTimeZone24);
        boolean boolean27 = dateTimeZone24.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 3);
        boolean boolean30 = dateTimeZone24.equals((java.lang.Object) 3);
        org.joda.time.DateTime dateTime31 = dateTime19.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime.Property property32 = dateTime31.monthOfYear();
        java.lang.String str33 = property32.getAsShortText();
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant34.withDurationAdded(readableDuration36, 2);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone39);
        int int41 = dateTime40.getMinuteOfDay();
        org.joda.time.DateTime dateTime43 = dateTime40.plusWeeks(10);
        org.joda.time.DateTime.Property property44 = dateTime40.minuteOfDay();
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone46.nextTransition((long) 893);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone46.getMillisKeepLocal(dateTimeZone50, 0L);
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime40.toMutableDateTime(dateTimeZone46);
        boolean boolean54 = instant38.isEqual((org.joda.time.ReadableInstant) dateTime40);
        int int55 = property32.compareTo((org.joda.time.ReadableInstant) instant38);
        org.joda.time.Instant instant56 = org.joda.time.Instant.now();
        org.joda.time.Instant instant58 = instant56.withMillis((long) 1);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        long long62 = dateTimeZone60.nextTransition((long) 893);
        org.joda.time.Instant instant63 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone64 = instant63.getZone();
        long long66 = dateTimeZone60.getMillisKeepLocal(dateTimeZone64, 0L);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((java.lang.Object) instant56, dateTimeZone64);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Instant instant69 = instant56.minus(readableDuration68);
        org.joda.time.DateTime dateTime70 = instant69.toDateTime();
        org.joda.time.DateTime dateTime71 = dateTime70.toDateTime();
        org.joda.time.DateTime dateTime72 = dateTime71.toDateTimeISO();
        org.joda.time.DateTime dateTime74 = dateTime72.minusSeconds(923);
        boolean boolean75 = instant38.isBefore((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology6.millisOfSecond();
        java.lang.String str9 = copticChronology6.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.withChronology((org.joda.time.Chronology) copticChronology6);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.property(dateTimeFieldType12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property14.addToCopy(31);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plus(readableDuration17);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone20.nextTransition((long) 893);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone20.getMillisKeepLocal(dateTimeZone24, 0L);
        long long29 = dateTimeZone20.convertLocalToUTC((long) 11, false);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withEra(1);
        int int35 = localDateTime34.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localDateTime34.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.plusSeconds((int) (short) 1);
        int int40 = localDateTime39.getHourOfDay();
        org.joda.time.LocalDateTime.Property property41 = localDateTime39.hourOfDay();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundHalfCeilingCopy();
        java.util.Locale locale44 = java.util.Locale.UK;
        org.joda.time.LocalDateTime localDateTime45 = property41.setCopy("0", locale44);
        java.lang.String str46 = dateTimeZone20.getName(31536900000L, locale44);
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str50 = locale49.getISO3Language();
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale52 = java.util.Locale.getDefault(category51);
        java.lang.String str53 = locale49.getDisplayLanguage(locale52);
        java.lang.String str54 = dateTimeZone20.getShortName((long) 935, locale49);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime18, dateTimeZone20);
        long long58 = dateTimeZone20.adjustOffset(0L, true);
        java.lang.String str60 = dateTimeZone20.getNameKey(1645455702418L);
        org.joda.time.Chronology chronology61 = copticChronology6.withZone(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime6 = dateTime3.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfMinute();
        int int10 = dateTime8.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean12 = dateTime8.isSupported(dateTimeFieldType11);
        java.util.Date date14 = new java.util.Date((long) (byte) 0);
        int int15 = date14.getMinutes();
        int int16 = date14.getDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) date14, chronology17);
        org.joda.time.LocalDate localDate20 = localDate18.withYear((-1));
        org.joda.time.LocalDate.Property property21 = localDate20.yearOfEra();
        org.joda.time.DateTimeField dateTimeField22 = property21.getField();
        int int23 = property21.getMaximumValueOverall();
        org.joda.time.LocalDate localDate24 = property21.roundCeilingCopy();
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = dateTimeZone26.getName((long) (short) 0, locale30);
        java.util.TimeZone timeZone32 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime33 = localDate24.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = dateTime33.toDateTimeISO();
        org.joda.time.Instant instant35 = dateTime34.toInstant();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withDurationAdded(readableDuration36, 16);
        boolean boolean39 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean40 = calendar1.after((java.lang.Object) dateTime34);
        org.joda.time.DateTime dateTime42 = dateTime34.plusHours(53940);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant25", (dateTime3.compareTo(instant25) == 0) == dateTime3.equals(instant25));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        int int16 = dateTime15.getYearOfCentury();
        long long17 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str20 = locale19.getISO3Language();
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale22 = java.util.Locale.getDefault(category21);
        java.lang.String str23 = locale19.getDisplayLanguage(locale22);
        int int24 = property7.getMaximumTextLength(locale22);
        org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance();
        long long31 = copticChronology25.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField32 = copticChronology25.months();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology25.dayOfWeek();
        int int35 = dateTimeField33.getLeapAmount((long) 21);
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.util.Date date40 = new java.util.Date((long) (byte) 0);
        int int41 = date40.getMinutes();
        int int42 = date40.getDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((java.lang.Object) date40, chronology43);
        int int45 = localDate44.getDayOfWeek();
        org.joda.time.LocalDate localDate47 = localDate44.minusWeeks(272);
        org.joda.time.Instant instant49 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone50 = instant49.getZone();
        long long52 = dateTimeZone50.nextTransition((long) 893);
        java.util.Locale locale54 = java.util.Locale.CANADA;
        java.lang.String str55 = dateTimeZone50.getName((long) (short) 0, locale54);
        java.lang.String str56 = localDate44.toString("+00:00", locale54);
        java.lang.String str57 = locale54.getISO3Country();
        java.lang.String str58 = locale37.getDisplayCountry(locale54);
        java.lang.String str59 = dateTimeField33.getAsText((-6826118399900L), locale54);
        java.lang.String str60 = locale22.getDisplayCountry(locale54);
        java.lang.String str61 = locale22.getDisplayName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant49", (dateTime1.compareTo(instant49) == 0) == dateTime1.equals(instant49));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.minusHours((-2));
        org.joda.time.DateTime dateTime11 = dateTime9.minus(1645455284589L);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        java.util.Date date30 = new java.util.Date((long) (byte) 0);
        int int31 = date30.getMinutes();
        int int32 = date30.getDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) date30, chronology33);
        org.joda.time.LocalDate localDate36 = localDate34.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone38.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.DateTime dateTime45 = localDate34.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTime dateTime46 = localDate17.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate49 = localDate17.withPeriodAdded(readablePeriod47, 122);
        org.joda.time.LocalDate localDate51 = localDate49.withYearOfEra(21);
        org.joda.time.LocalDate.Property property52 = localDate49.monthOfYear();
        org.joda.time.Chronology chronology53 = localDate49.getChronology();
        org.joda.time.DateTime dateTime54 = dateTime11.toDateTime(chronology53);
        org.joda.time.Instant instant55 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology56 = instant55.getChronology();
        org.joda.time.Instant instant58 = instant55.plus(1645455324838L);
        org.joda.time.Instant instant61 = instant55.withDurationAdded((long) 476, 1964);
        boolean boolean62 = dateTime11.isBefore((org.joda.time.ReadableInstant) instant61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        boolean boolean1 = instant0.isAfterNow();
        org.joda.time.Instant instant3 = instant0.plus((long) 53671795);
        org.joda.time.Instant instant4 = instant0.toInstant();
        org.joda.time.Instant instant6 = instant0.plus(1645455303685L);
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology7.clockhourOfDay();
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology12.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology12.clockhourOfDay();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 25, (org.joda.time.Chronology) copticChronology12);
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology12.getZone();
        org.joda.time.Chronology chronology18 = copticChronology7.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = copticChronology7.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = copticChronology7.getZone();
        org.joda.time.DateTime dateTime21 = instant6.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfEra();
        org.joda.time.DateTime dateTime24 = property22.setCopy(53931487);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime21", (instant6.compareTo(dateTime21) == 0) == instant6.equals(dateTime21));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.minusHours((-2));
        org.joda.time.DateTime dateTime11 = dateTime9.minus(1645455284589L);
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone21.getMillisKeepLocal(dateTimeZone25, 0L);
        org.joda.time.DateTime dateTime28 = localDate17.toDateTimeAtMidnight(dateTimeZone21);
        java.util.Date date30 = new java.util.Date((long) (byte) 0);
        int int31 = date30.getMinutes();
        int int32 = date30.getDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) date30, chronology33);
        org.joda.time.LocalDate localDate36 = localDate34.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone38.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.DateTime dateTime45 = localDate34.toDateTimeAtMidnight(dateTimeZone38);
        org.joda.time.DateTime dateTime46 = localDate17.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalDate localDate49 = localDate17.withPeriodAdded(readablePeriod47, 122);
        org.joda.time.LocalDate localDate51 = localDate49.withYearOfEra(21);
        org.joda.time.LocalDate.Property property52 = localDate49.monthOfYear();
        org.joda.time.Chronology chronology53 = localDate49.getChronology();
        org.joda.time.DateTime dateTime54 = dateTime11.toDateTime(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.yearOfEra();
        java.util.Locale locale57 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str58 = locale57.getLanguage();
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str61 = locale60.getISO3Language();
        java.util.Locale.Category category62 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale63 = java.util.Locale.getDefault(category62);
        java.lang.String str64 = locale60.getDisplayLanguage(locale63);
        java.lang.String str65 = locale57.getDisplayCountry(locale63);
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(dateTimeZone66);
        org.joda.time.DurationFieldType durationFieldType68 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime70 = dateTime67.withFieldAdded(durationFieldType68, 0);
        org.joda.time.DateTime.Property property71 = dateTime67.minuteOfDay();
        org.joda.time.DateTime dateTime72 = property71.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property73 = dateTime72.secondOfMinute();
        org.joda.time.DateTime.Property property74 = dateTime72.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime(dateTimeZone75);
        org.joda.time.DurationFieldType durationFieldType77 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime79 = dateTime76.withFieldAdded(durationFieldType77, 0);
        org.joda.time.DateTime.Property property80 = dateTime76.minuteOfDay();
        org.joda.time.DateTime dateTime81 = property80.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property82 = dateTime81.secondOfMinute();
        java.lang.String str83 = property82.toString();
        java.util.Locale locale85 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str86 = property82.getAsShortText(locale85);
        java.lang.String str87 = property74.getAsShortText(locale85);
        java.util.Locale locale88 = java.util.Locale.GERMANY;
        java.lang.String str89 = property74.getAsText(locale88);
        java.lang.String str90 = locale57.getDisplayCountry(locale88);
        java.lang.String str91 = dateTimeField55.getAsText((-55596602), locale88);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime2.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded((long) 16, 22);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTime5.getZone();
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        int int13 = dateTime12.getMinuteOfDay();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime12.toMutableDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = chronology10.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField18 = chronology10.seconds();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 571, chronology10);
        org.joda.time.DurationField durationField20 = chronology10.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        int int5 = localDateTime4.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime4.getFieldType(2);
        java.lang.String str8 = dateTimeFieldType7.getName();
        org.joda.time.DateTime dateTime10 = dateTime0.withField(dateTimeFieldType7, (int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(dateTimeZone13);
        org.joda.time.LocalTime localTime21 = localTime19.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withDayOfWeek(2);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) dateTime23);
        int int27 = dateTime26.getEra();
        org.joda.time.TimeOfDay timeOfDay28 = dateTime26.toTimeOfDay();
        org.joda.time.DateTime dateTime30 = dateTime26.plusSeconds(21);
        org.joda.time.DateTime dateTime32 = dateTime26.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime33 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.minus(readableDuration34);
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfMinute();
        int int37 = property11.getDifference((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and instant12", (dateTime0.compareTo(instant12) == 0) == dateTime0.equals(instant12));
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.minus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime6.withYearOfEra(740);
        org.joda.time.DateTime dateTime13 = dateTime11.withYear(999);
        org.joda.time.DateTime.Property property14 = dateTime11.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        int int17 = dateTime16.getMinuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.plusWeeks(10);
        int int20 = dateTime19.getMillisOfSecond();
        org.joda.time.DateTime dateTime22 = dateTime19.minusMinutes((-1));
        int int23 = property14.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime22.withYearOfEra(677);
        java.util.Date date27 = new java.util.Date((long) (byte) 0);
        int int28 = date27.getMinutes();
        int int29 = date27.getDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) date27, chronology30);
        org.joda.time.LocalDate localDate33 = localDate31.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone35.nextTransition((long) 893);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone39 = instant38.getZone();
        long long41 = dateTimeZone35.getMillisKeepLocal(dateTimeZone39, 0L);
        org.joda.time.DateTime dateTime42 = localDate31.toDateTimeAtMidnight(dateTimeZone35);
        org.joda.time.LocalDate localDate44 = localDate31.minusDays(20);
        org.joda.time.LocalDate localDate46 = localDate44.plusWeeks(53);
        org.joda.time.LocalDate localDate48 = localDate46.withYearOfCentury(10);
        org.joda.time.LocalDate localDate50 = localDate48.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate52 = localDate50.minusYears(900000);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean54 = localDate50.isSupported(dateTimeFieldType53);
        int int55 = dateTime25.get(dateTimeFieldType53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant34", (dateTime1.compareTo(instant34) == 0) == dateTime1.equals(instant34));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.plus((long) 53);
        org.joda.time.Instant instant12 = instant9.toInstant();
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime13.toMutableDateTimeISO();
        long long15 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime14);
        java.lang.String str16 = property8.getAsString();
        org.joda.time.LocalDate localDate18 = property8.addToCopy(53911593);
        org.joda.time.Interval interval19 = localDate18.toInterval();
        org.joda.time.LocalDate.Property property20 = localDate18.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime13", (instant9.compareTo(mutableDateTime13) == 0) == instant9.equals(mutableDateTime13));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(844);
        org.joda.time.DateTime dateTime34 = dateTime31.toDateTime();
        org.joda.time.LocalDateTime localDateTime35 = dateTime34.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime34", (dateTime1.compareTo(dateTime34) == 0) == dateTime1.equals(dateTime34));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime6 = instant0.toDateTime();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone8.nextTransition((long) 893);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        long long14 = dateTimeZone8.getMillisKeepLocal(dateTimeZone12, 0L);
        long long16 = dateTimeZone12.nextTransition((long) (-1));
        org.joda.time.MutableDateTime mutableDateTime17 = instant0.toMutableDateTime(dateTimeZone12);
        java.lang.String str19 = dateTimeZone12.getShortName((long) 1910);
        java.util.TimeZone timeZone20 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis(30446);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant1.withMillis((long) 1);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone5.nextTransition((long) 893);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone5.getMillisKeepLocal(dateTimeZone9, 0L);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) instant1, dateTimeZone9);
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(12);
        org.joda.time.Chronology chronology15 = localTime12.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.millisOfSecond();
        java.util.Date date19 = new java.util.Date((long) (byte) 0);
        java.util.Date date21 = new java.util.Date((long) (byte) 0);
        int int22 = date21.getMinutes();
        int int23 = date21.getMinutes();
        boolean boolean24 = date19.before(date21);
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromDateFields(date19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(chronology26);
        int int28 = localTime27.getHourOfDay();
        org.joda.time.LocalTime.Property property29 = localTime27.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime34 = dateTime31.withFieldAdded(durationFieldType32, 0);
        boolean boolean35 = localTime27.isSupported(durationFieldType32);
        org.joda.time.LocalTime localTime37 = localTime25.withFieldAdded(durationFieldType32, 8);
        org.joda.time.DateTimeField[] dateTimeFieldArray38 = localTime37.getFields();
        java.util.Locale locale40 = null;
        java.lang.String str41 = dateTimeField17.getAsText((org.joda.time.ReadablePartial) localTime37, 32770, locale40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime31", (instant1.compareTo(dateTime31) == 0) == instant1.equals(dateTime31));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 32772, dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long9 = copticChronology3.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField10 = copticChronology3.months();
        java.lang.String str11 = copticChronology3.toString();
        int int12 = copticChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfYear();
        java.lang.String str15 = copticChronology3.toString();
        java.lang.String str16 = copticChronology3.toString();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField18 = copticChronology3.millis();
        boolean boolean19 = localDate2.equals((java.lang.Object) durationField18);
        int int20 = localDate2.getDayOfMonth();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime dateTime23 = localDate2.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(53782602);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
        long long31 = copticChronology27.add(3020112000000L, (long) 696, 851);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant21 and dateTime22", (instant21.compareTo(dateTime22) == 0) == instant21.equals(dateTime22));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 32772, dateTimeZone1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long9 = copticChronology3.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField10 = copticChronology3.months();
        java.lang.String str11 = copticChronology3.toString();
        int int12 = copticChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = copticChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology3.dayOfYear();
        java.lang.String str15 = copticChronology3.toString();
        java.lang.String str16 = copticChronology3.toString();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now((org.joda.time.Chronology) copticChronology3);
        org.joda.time.DurationField durationField18 = copticChronology3.millis();
        boolean boolean19 = localDate2.equals((java.lang.Object) durationField18);
        int int20 = localDate2.getDayOfMonth();
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime22 = instant21.toDateTime();
        org.joda.time.DateTime dateTime23 = localDate2.toDateTime((org.joda.time.ReadableInstant) instant21);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant21.plus(readableDuration24);
        long long26 = instant21.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and instant21", (dateTime22.compareTo(instant21) == 0) == dateTime22.equals(instant21));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant7 = null;
        boolean boolean8 = dateTime1.isEqual(readableInstant7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime26 = dateTime1.withZoneRetainFields(dateTimeZone18);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, 53637233);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        java.util.Locale locale35 = java.util.Locale.CANADA;
        java.lang.String str36 = dateTimeZone31.getName((long) (short) 0, locale35);
        long long38 = dateTimeZone31.nextTransition(0L);
        java.lang.String str40 = dateTimeZone31.getName(40140000L);
        java.lang.String str42 = dateTimeZone31.getShortName((long) 119);
        int int44 = dateTimeZone31.getStandardOffset((long) 53801809);
        java.lang.String str46 = dateTimeZone31.getNameKey(475536576595782L);
        org.joda.time.DateTime dateTime47 = dateTime26.withZone(dateTimeZone31);
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField49 = copticChronology48.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField50 = copticChronology48.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField51 = copticChronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField52 = copticChronology48.yearOfEra();
        org.joda.time.DateTime dateTime53 = dateTime26.withChronology((org.joda.time.Chronology) copticChronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant3", (dateTime1.compareTo(instant3) == 0) == dateTime1.equals(instant3));
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        int int17 = dateTime11.getYearOfEra();
        long long18 = dateTime11.getMillis();
        org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance();
        long long26 = copticChronology20.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField27 = copticChronology20.months();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology20.era();
        org.joda.time.DateTimeField dateTimeField29 = copticChronology20.clockhourOfDay();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 15, (org.joda.time.Chronology) copticChronology20);
        org.joda.time.Chronology chronology31 = copticChronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfHalfday();
        org.joda.time.DateTime dateTime34 = dateTime11.withChronology(chronology31);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant8 and dateTime34", (instant8.compareTo(dateTime34) == 0) == instant8.equals(dateTime34));
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        long long5 = copticChronology0.add((long) '#', 10L, (-1));
        org.joda.time.DateTimeField dateTimeField6 = copticChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfWeek();
        int int9 = dateTimeField7.getLeapAmount((-292269337L));
        java.util.Calendar.Builder builder11 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder13 = builder11.setInstant((long) 6);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        timeZone14.setID("hi!");
        java.util.Calendar.Builder builder17 = builder13.setTimeZone(timeZone14);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = dateTimeZone19.getName((long) (short) 0, locale23);
        java.util.TimeZone timeZone25 = dateTimeZone19.toTimeZone();
        timeZone25.setID("Property[secondOfMinute]");
        timeZone25.setRawOffset(650);
        java.util.Calendar.Builder builder30 = builder17.setTimeZone(timeZone25);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) 5);
        java.util.Calendar.Builder builder33 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone35.nextTransition((long) 893);
        java.util.Locale locale39 = java.util.Locale.CANADA;
        java.lang.String str40 = dateTimeZone35.getName((long) (short) 0, locale39);
        java.util.TimeZone timeZone41 = dateTimeZone35.toTimeZone();
        timeZone41.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder44 = builder33.setTimeZone(timeZone41);
        timeZone41.setRawOffset(0);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone41, locale47);
        boolean boolean49 = localTime32.equals((java.lang.Object) locale47);
        java.lang.String str50 = locale47.getDisplayVariant();
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(timeZone25, locale47);
        java.lang.String str52 = dateTimeField7.getAsText(187, locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar51", (calendar48.compareTo(calendar51) == 0) == calendar48.equals(calendar51));
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        long long14 = dateTimeField9.set((long) 8, "53640", locale13);
        java.util.Set<java.lang.String> strSet15 = locale13.getUnicodeLocaleAttributes();
        strSet15.clear();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet15.spliterator();
        strSet15.clear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone19);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.util.Calendar calendar22 = dateTime20.toCalendar(locale21);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.fromCalendarFields(calendar22);
        org.joda.time.DateTime dateTime24 = localDate23.toDateTimeAtCurrentTime();
        boolean boolean25 = strSet15.equals((java.lang.Object) dateTime24);
        org.joda.time.chrono.CopticChronology copticChronology26 = org.joda.time.chrono.CopticChronology.getInstance();
        long long32 = copticChronology26.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField33 = copticChronology26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = copticChronology26.dayOfWeek();
        org.joda.time.DurationField durationField35 = copticChronology26.months();
        org.joda.time.Chronology chronology36 = copticChronology26.withUTC();
        org.joda.time.DateTimeField dateTimeField37 = copticChronology26.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = dateTime24.toDateTime((org.joda.time.Chronology) copticChronology26);
        int int39 = dateTime24.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime38", (dateTime20.compareTo(dateTime38) == 0) == dateTime20.equals(dateTime38));
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.centuryOfEra();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property5.setCopy(241);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.Locale.LanguageRange[] languageRangeArray20 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList21 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21, languageRangeArray20);
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        java.lang.String str27 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList21, (java.util.Collection<java.lang.String>) strList25);
        boolean boolean28 = strSet18.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList21);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear(9);
        org.joda.time.DateTime dateTime33 = dateTime30.toDateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.plusMonths(241);
        boolean boolean36 = strSet18.equals((java.lang.Object) dateTime35);
        org.joda.time.chrono.CopticChronology copticChronology37 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField38 = copticChronology37.secondOfMinute();
        org.joda.time.DateTime dateTime39 = dateTime35.toDateTime((org.joda.time.Chronology) copticChronology37);
        boolean boolean40 = property5.equals((java.lang.Object) dateTime35);
        org.joda.time.Instant instant41 = dateTime35.toInstant();
        boolean boolean43 = dateTime35.isBefore((long) 53994);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant41", (dateTime39.compareTo(instant41) == 0) == dateTime39.equals(instant41));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Calendar calendar3 = dateTime1.toCalendar(locale2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.LocalDate localDate6 = localDate4.withYear(1970);
        java.util.Date date8 = new java.util.Date((long) (byte) 0);
        int int9 = date8.getMinutes();
        int int10 = date8.getDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) date8, chronology11);
        org.joda.time.LocalDate localDate14 = localDate12.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, 0L);
        org.joda.time.DateTime dateTime23 = localDate12.toDateTimeAtMidnight(dateTimeZone16);
        java.util.Date date25 = new java.util.Date((long) (byte) 0);
        int int26 = date25.getMinutes();
        int int27 = date25.getDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) date25, chronology28);
        org.joda.time.LocalDate localDate31 = localDate29.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant32 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone33 = instant32.getZone();
        long long35 = dateTimeZone33.nextTransition((long) 893);
        org.joda.time.Instant instant36 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone37 = instant36.getZone();
        long long39 = dateTimeZone33.getMillisKeepLocal(dateTimeZone37, 0L);
        org.joda.time.DateTime dateTime40 = localDate29.toDateTimeAtMidnight(dateTimeZone33);
        org.joda.time.DateTime dateTime41 = localDate12.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate12.withPeriodAdded(readablePeriod42, 122);
        int int45 = localDate44.getYear();
        org.joda.time.LocalDate localDate47 = localDate44.plusYears(510);
        java.util.Date date49 = new java.util.Date((long) (byte) 0);
        int int50 = date49.getMinutes();
        int int51 = date49.getDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((java.lang.Object) date49, chronology52);
        org.joda.time.LocalDate localDate55 = localDate53.withYear((-1));
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfEra();
        org.joda.time.LocalDate localDate57 = property56.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getDurationType();
        org.joda.time.LocalDate localDate61 = localDate57.withFieldAdded(durationFieldType59, 16);
        boolean boolean62 = localDate47.isSupported(durationFieldType59);
        boolean boolean63 = localDate4.isSupported(durationFieldType59);
        org.joda.time.chrono.CopticChronology copticChronology64 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField65 = copticChronology64.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField66 = copticChronology64.dayOfYear();
        org.joda.time.DateTimeField dateTimeField67 = copticChronology64.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField68 = copticChronology64.halfdayOfDay();
        org.joda.time.DurationField durationField69 = copticChronology64.years();
        boolean boolean70 = durationFieldType59.isSupported((org.joda.time.Chronology) copticChronology64);
        org.joda.time.chrono.CopticChronology copticChronology71 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField72 = copticChronology71.secondOfMinute();
        org.joda.time.DurationField durationField73 = copticChronology71.months();
        org.joda.time.DateTimeZone dateTimeZone74 = copticChronology71.getZone();
        org.joda.time.DateTimeField dateTimeField75 = copticChronology71.hourOfHalfday();
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology71);
        org.joda.time.DurationField durationField77 = copticChronology71.weekyears();
        org.joda.time.DateTimeField dateTimeField78 = copticChronology71.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField79 = copticChronology71.dayOfMonth();
        org.joda.time.DurationField durationField80 = copticChronology71.minutes();
        org.joda.time.DateTimeField dateTimeField81 = copticChronology71.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = copticChronology71.millisOfSecond();
        org.joda.time.DurationField durationField83 = durationFieldType59.getField((org.joda.time.Chronology) copticChronology71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField69 and durationField83", (durationField69.compareTo(durationField83) == 0) == durationField69.equals(durationField83));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = property8.equals((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = property8.getDurationField();
        org.joda.time.DateTime dateTime17 = property8.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        long long25 = copticChronology19.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField26 = copticChronology19.months();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType18.getField((org.joda.time.Chronology) copticChronology19);
        org.joda.time.DateTime dateTime28 = dateTime17.toDateTime((org.joda.time.Chronology) copticChronology19);
        org.joda.time.DurationField durationField29 = copticChronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime28", (dateTime6.compareTo(dateTime28) == 0) == dateTime6.equals(dateTime28));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.millisOfDay();
        org.joda.time.DurationField durationField15 = copticChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = copticChronology1.add(readablePeriod16, (long) 42001, 0);
        org.joda.time.DateTimeField dateTimeField20 = copticChronology1.era();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 1645455234217L);
        org.joda.time.DateTime dateTime23 = localDate22.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property24 = localDate22.dayOfYear();
        org.joda.time.LocalDate localDate26 = localDate22.minusWeeks(940);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        org.joda.time.LocalDate localDate30 = localDate26.minusYears(53637233);
        int int31 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DurationField durationField32 = dateTimeField20.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField8, and durationField15", !(durationField32.compareTo(durationField8) == 0) || (Math.signum(durationField32.compareTo(durationField15)) == Math.signum(durationField8.compareTo(durationField15))));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        java.util.GregorianCalendar gregorianCalendar34 = dateTime29.toGregorianCalendar();
        int int35 = gregorianCalendar34.getWeekYear();
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder38 = builder36.setInstant((long) 6);
        java.util.TimeZone timeZone39 = java.util.TimeZone.getDefault();
        timeZone39.setID("hi!");
        java.util.Calendar.Builder builder42 = builder38.setTimeZone(timeZone39);
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone44 = instant43.getZone();
        long long46 = dateTimeZone44.nextTransition((long) 893);
        java.util.Locale locale48 = java.util.Locale.CANADA;
        java.lang.String str49 = dateTimeZone44.getName((long) (short) 0, locale48);
        java.util.TimeZone timeZone50 = dateTimeZone44.toTimeZone();
        timeZone50.setID("Property[secondOfMinute]");
        timeZone50.setRawOffset(650);
        java.util.Calendar.Builder builder55 = builder42.setTimeZone(timeZone50);
        gregorianCalendar34.setTimeZone(timeZone50);
        timeZone50.setID("14:48:30.472");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and gregorianCalendar34", (calendar7.compareTo(gregorianCalendar34) == 0) == calendar7.equals(gregorianCalendar34));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1645455383949L);
        org.joda.time.DateTime dateTime2 = dateTime1.toDateTimeISO();
        int int3 = dateTime2.getMinuteOfHour();
        org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance();
        long long10 = copticChronology4.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField11 = copticChronology4.months();
        java.lang.String str12 = copticChronology4.toString();
        int int13 = copticChronology4.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField14 = copticChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology4.dayOfYear();
        java.lang.String str16 = copticChronology4.toString();
        java.lang.String str17 = copticChronology4.toString();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology4.monthOfYear();
        org.joda.time.DurationField durationField19 = copticChronology4.weekyears();
        org.joda.time.DateTime dateTime20 = dateTime2.toDateTime((org.joda.time.Chronology) copticChronology4);
        org.joda.time.DateTime dateTime22 = dateTime2.withWeekyear(436);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime20", (dateTime2.compareTo(dateTime20) == 0) == dateTime2.equals(dateTime20));
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis(616);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfWeek();
        org.joda.time.chrono.CopticChronology copticChronology16 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology16.halfdayOfDay();
        long long21 = copticChronology16.add((long) '#', 10L, (-1));
        org.joda.time.DateTime dateTime22 = dateTime14.withChronology((org.joda.time.Chronology) copticChronology16);
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        org.joda.time.DateTime dateTime24 = property23.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime22", (dateTime14.compareTo(dateTime22) == 0) == dateTime14.equals(dateTime22));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField21 = copticChronology14.months();
        java.lang.String str22 = copticChronology14.toString();
        int int23 = copticChronology14.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField24 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = copticChronology14.dayOfYear();
        java.lang.String str26 = copticChronology14.toString();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology14.centuryOfEra();
        org.joda.time.Chronology chronology29 = copticChronology14.withUTC();
        org.joda.time.DateTime dateTime30 = dateTime12.withChronology((org.joda.time.Chronology) copticChronology14);
        org.joda.time.chrono.CopticChronology copticChronology31 = org.joda.time.chrono.CopticChronology.getInstance();
        long long37 = copticChronology31.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField38 = copticChronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField39 = copticChronology31.dayOfYear();
        org.joda.time.DateTimeField dateTimeField40 = copticChronology31.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = copticChronology31.year();
        org.joda.time.Chronology chronology42 = copticChronology31.withUTC();
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime12.toMutableDateTime(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime30", (dateTime12.compareTo(dateTime30) == 0) == dateTime12.equals(dateTime30));
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 52);
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTime(dateTimeZone16);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime17.toGregorianCalendar();
        gregorianCalendar20.clear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        int int3 = dateTime2.getMinuteOfDay();
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime2.toMutableDateTime(dateTimeZone5);
        int int7 = dateTime2.getCenturyOfEra();
        org.joda.time.DateTime dateTime9 = dateTime2.withMillisOfSecond(53);
        org.joda.time.DateTime.Property property10 = dateTime2.millisOfDay();
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology11.months();
        org.joda.time.DateTimeZone dateTimeZone14 = copticChronology11.getZone();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology11);
        org.joda.time.DateTimeField dateTimeField16 = copticChronology11.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = copticChronology11.yearOfCentury();
        org.joda.time.DurationField durationField18 = copticChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology11.clockhourOfDay();
        org.joda.time.DateTime dateTime20 = dateTime2.toDateTime((org.joda.time.Chronology) copticChronology11);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) 54115, (org.joda.time.Chronology) copticChronology11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime20", (dateTime2.compareTo(dateTime20) == 0) == dateTime2.equals(dateTime20));
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DurationField durationField7 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = copticChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology1.millisOfSecond();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 242, (org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.dayOfWeek();
        org.joda.time.DurationField durationField15 = copticChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField3, and durationField7", !(durationField15.compareTo(durationField3) == 0) || (Math.signum(durationField15.compareTo(durationField7)) == Math.signum(durationField3.compareTo(durationField7))));
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        org.joda.time.DurationField durationField10 = copticChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField10", Math.signum(durationField7.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField7)));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withDurationAdded(0L, 52);
        org.joda.time.DateTime dateTime12 = dateTime10.plusWeeks(53683090);
        java.lang.String str14 = dateTime10.toString("\ufffd\ufffd");
        org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance();
        long long21 = copticChronology15.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField22 = copticChronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = copticChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology15.clockhourOfDay();
        org.joda.time.Chronology chronology25 = copticChronology15.withUTC();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime10.toMutableDateTime(chronology25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withDayOfWeek(2);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) dateTime28);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.plus(readablePeriod32);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.Instant instant36 = instant34.withMillis((long) 1);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone38 = instant37.getZone();
        long long40 = dateTimeZone38.nextTransition((long) 893);
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone38.getMillisKeepLocal(dateTimeZone42, 0L);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) instant34, dateTimeZone42);
        long long47 = dateTimeZone42.convertUTCToLocal((long) 3);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime33, dateTimeZone42);
        org.joda.time.DateTime dateTime49 = dateTime10.withZone(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and mutableDateTime26", (dateTime49.compareTo(mutableDateTime26) == 0) == dateTime49.equals(mutableDateTime26));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.secondOfMinute();
        java.util.Date date16 = new java.util.Date((long) (byte) 0);
        int int17 = date16.getMinutes();
        int int18 = date16.getDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) date16, chronology19);
        int int21 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks(272);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = dateTimeZone26.getName((long) (short) 0, locale30);
        java.lang.String str32 = localDate20.toString("+00:00", locale30);
        java.lang.String str34 = locale30.getExtension('x');
        int int35 = dateTimeField14.getMaximumShortTextLength(locale30);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(600100L);
        java.util.Locale locale39 = java.util.Locale.GERMAN;
        java.lang.String str40 = dateTimeField14.getAsText((org.joda.time.ReadablePartial) localDate37, 616, locale39);
        int int41 = localDate37.getMonthOfYear();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime47 = dateTime44.withFieldAdded(durationFieldType45, 0);
        boolean boolean48 = dateTime42.isEqual((org.joda.time.ReadableInstant) dateTime47);
        int int49 = dateTime42.getMillisOfDay();
        org.joda.time.DateTime dateTime51 = dateTime42.minusYears((int) (short) 0);
        org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField53 = copticChronology52.secondOfMinute();
        org.joda.time.DurationField durationField54 = copticChronology52.months();
        org.joda.time.DateTimeZone dateTimeZone55 = copticChronology52.getZone();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology52);
        org.joda.time.DateTimeField dateTimeField57 = copticChronology52.clockhourOfHalfday();
        org.joda.time.DateTime dateTime58 = dateTime42.toDateTime((org.joda.time.Chronology) copticChronology52);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.yearOfEra();
        java.lang.String str60 = dateTimeFieldType59.toString();
        org.joda.time.DateTime.Property property61 = dateTime58.property(dateTimeFieldType59);
        boolean boolean62 = localDate37.isSupported(dateTimeFieldType59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant25 and dateTime58", (instant25.compareTo(dateTime58) == 0) == instant25.equals(dateTime58));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime6.plusMinutes(53631987);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        boolean boolean22 = dateTime19.isSupported(dateTimeFieldType20);
        org.joda.time.DateTime dateTime24 = dateTime19.plus(900000L);
        org.joda.time.DateTime dateTime25 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime27 = dateTime19.plusSeconds(348);
        java.util.Locale locale28 = null;
        java.util.Calendar calendar29 = dateTime27.toCalendar(locale28);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        long long39 = dateTimeZone35.nextTransition((long) (-1));
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        boolean boolean41 = instant40.isAfterNow();
        org.joda.time.Instant instant43 = instant40.plus((long) 53671795);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withDayOfWeek(2);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((java.lang.Object) dateTime45);
        int int49 = dateTime48.getEra();
        boolean boolean50 = instant40.isBefore((org.joda.time.ReadableInstant) dateTime48);
        int int51 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) instant40);
        long long54 = dateTimeZone35.convertLocalToUTC(1645455327957L, false);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((java.lang.Object) calendar29, dateTimeZone35);
        int int56 = calendar29.getWeeksInWeekYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant30", (dateTime1.compareTo(instant30) == 0) == dateTime1.equals(instant30));
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        java.time.ZoneId zoneId9 = timeZone7.toZoneId();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone(zoneId9);
        int int11 = timeZone10.getRawOffset();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale.setDefault(locale13);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone10, locale13);
        java.lang.String str17 = locale13.getScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar16", (calendar8.compareTo(calendar16) == 0) == calendar8.equals(calendar16));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology3.secondOfMinute();
        org.joda.time.DurationField durationField5 = copticChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone6 = copticChronology3.getZone();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear(53716584);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withDefaultYear(500);
        java.lang.Integer int13 = dateTimeFormatter12.getPivotYear();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 16, dateTimeZone16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        int int22 = localDateTime21.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime21.getFieldType(2);
        int int25 = localDateTime21.getWeekyear();
        int int26 = localDateTime21.getHourOfDay();
        boolean boolean27 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        long long31 = dateTimeZone16.convertLocalToUTC((long) 740, true, 1644936849486L);
        org.joda.time.Instant instant33 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        int int37 = dateTime36.getMinuteOfDay();
        int int38 = instant33.compareTo((org.joda.time.ReadableInstant) dateTime36);
        java.util.Locale locale39 = java.util.Locale.CANADA;
        java.util.Calendar calendar40 = dateTime36.toCalendar(locale39);
        java.lang.String str41 = locale39.getScript();
        java.lang.String str42 = dateTimeZone16.getName((-1102887980000L), locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter12.withLocale(locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter43.withDefaultYear(2124);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter43.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter43.withZoneUTC();
        org.joda.time.chrono.CopticChronology copticChronology48 = org.joda.time.chrono.CopticChronology.getInstance();
        long long54 = copticChronology48.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField55 = copticChronology48.months();
        java.lang.String str56 = copticChronology48.toString();
        int int57 = copticChronology48.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField58 = copticChronology48.weekyears();
        org.joda.time.DateTimeField dateTimeField59 = copticChronology48.dayOfYear();
        java.lang.String str60 = copticChronology48.toString();
        org.joda.time.DurationField durationField61 = copticChronology48.halfdays();
        long long65 = copticChronology48.add(1645455466170L, 0L, 92);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter66 = dateTimeFormatter47.withChronology((org.joda.time.Chronology) copticChronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant15", (dateTime7.compareTo(instant15) == 0) == dateTime7.equals(instant15));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime29.getZone();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        java.lang.String str35 = dateTimeZone32.getNameKey(772L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate.Property property16 = localDate15.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        int int18 = property16.getMaximumValueOverall();
        org.joda.time.LocalDate localDate19 = property16.roundCeilingCopy();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone21 = instant20.getZone();
        long long23 = dateTimeZone21.nextTransition((long) 893);
        java.util.Locale locale25 = java.util.Locale.CANADA;
        java.lang.String str26 = dateTimeZone21.getName((long) (short) 0, locale25);
        java.util.TimeZone timeZone27 = dateTimeZone21.toTimeZone();
        org.joda.time.DateTime dateTime28 = localDate19.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime3.withZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        java.util.GregorianCalendar gregorianCalendar34 = dateTime29.toGregorianCalendar();
        org.joda.time.DateTime.Property property35 = dateTime29.minuteOfDay();
        org.joda.time.DateTime.Property property36 = dateTime29.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime29.plusDays(864);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime3", (instant0.compareTo(dateTime3) == 0) == instant0.equals(dateTime3));
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.Instant instant5 = instant3.withMillis((long) 1);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone7.nextTransition((long) 893);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        long long13 = dateTimeZone7.getMillisKeepLocal(dateTimeZone11, 0L);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) instant3, dateTimeZone11);
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis(12);
        org.joda.time.Chronology chronology17 = localTime14.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology17);
        boolean boolean19 = durationFieldType1.isSupported(chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance();
        long long27 = copticChronology21.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField28 = copticChronology21.months();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType20.getField((org.joda.time.Chronology) copticChronology21);
        org.joda.time.DateTimeField dateTimeField30 = copticChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField31 = copticChronology21.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = copticChronology21.getZone();
        org.joda.time.DateTimeField dateTimeField33 = copticChronology21.clockhourOfDay();
        org.joda.time.DurationField durationField34 = copticChronology21.hours();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(dateTimeZone35);
        int int37 = dateTime36.getMinuteOfDay();
        org.joda.time.DateTime dateTime39 = dateTime36.plusWeeks(10);
        org.joda.time.DateTime.Property property40 = dateTime36.minuteOfDay();
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        org.joda.time.Instant instant45 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone46 = instant45.getZone();
        long long48 = dateTimeZone42.getMillisKeepLocal(dateTimeZone46, 0L);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime36.toMutableDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology50 = copticChronology21.withZone(dateTimeZone42);
        boolean boolean51 = durationFieldType1.isSupported(chronology50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime36", (instant3.compareTo(dateTime36) == 0) == instant3.equals(dateTime36));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "DateTimeField[yearOfCentury]", "100", "gregory", "2022-02-21T14:53:54.648", "53640", "DateTimeField[yearOfCentury]", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet9.removeAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekyear(9);
        org.joda.time.DateTime dateTime24 = dateTime21.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.plusMonths(241);
        boolean boolean27 = strSet9.equals((java.lang.Object) dateTime26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.withPeriodAdded(readablePeriod28, 0);
        java.lang.String str31 = dateTime30.toString();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(chronology32);
        int int34 = localTime33.getHourOfDay();
        org.joda.time.LocalTime.Property property35 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        boolean boolean39 = localTime36.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime localTime41 = localTime36.withMillisOfDay(53841727);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime41.plus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime48 = dateTime45.withFieldAdded(durationFieldType46, 0);
        org.joda.time.DateTime.Property property49 = dateTime45.minuteOfDay();
        org.joda.time.DateTime dateTime50 = property49.withMinimumValue();
        org.joda.time.DateTime dateTime52 = property49.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime53 = property49.roundCeilingCopy();
        org.joda.time.DateTime dateTime55 = dateTime53.plusDays(114);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime58 = dateTime53.withDurationAdded(readableDuration56, 934);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.Instant instant61 = instant59.withMillis((long) 1);
        org.joda.time.Instant instant62 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone63 = instant62.getZone();
        long long65 = dateTimeZone63.nextTransition((long) 893);
        org.joda.time.Instant instant66 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone67 = instant66.getZone();
        long long69 = dateTimeZone63.getMillisKeepLocal(dateTimeZone67, 0L);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((java.lang.Object) instant59, dateTimeZone67);
        org.joda.time.LocalTime localTime72 = localTime70.minusMillis(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int74 = localTime72.get(dateTimeFieldType73);
        int int75 = dateTime53.get(dateTimeFieldType73);
        boolean boolean76 = localTime43.isSupported(dateTimeFieldType73);
        int int77 = dateTime30.get(dateTimeFieldType73);
        org.joda.time.chrono.CopticChronology copticChronology78 = org.joda.time.chrono.CopticChronology.getInstance();
        long long84 = copticChronology78.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField85 = copticChronology78.halfdayOfDay();
        org.joda.time.DurationField durationField86 = copticChronology78.hours();
        org.joda.time.DateTimeField dateTimeField87 = copticChronology78.year();
        org.joda.time.MutableDateTime mutableDateTime88 = dateTime30.toMutableDateTime((org.joda.time.Chronology) copticChronology78);
        int int89 = dateTime30.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant59", (dateTime21.compareTo(instant59) == 0) == dateTime21.equals(instant59));
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Date date8 = dateTime6.toDate();
        org.joda.time.DateTime dateTime10 = dateTime6.plusYears((int) 'u');
        org.joda.time.TimeOfDay timeOfDay11 = dateTime6.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime20 = property17.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime21 = property17.roundCeilingCopy();
        org.joda.time.Instant instant22 = new org.joda.time.Instant((java.lang.Object) dateTime21);
        int int23 = dateTime21.getSecondOfDay();
        boolean boolean24 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime21);
        int int25 = dateTime6.getYear();
        int int26 = dateTime6.getMillisOfSecond();
        org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance();
        long long33 = copticChronology27.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField34 = copticChronology27.months();
        java.lang.String str35 = copticChronology27.toString();
        int int36 = copticChronology27.getMinimumDaysInFirstWeek();
        org.joda.time.DateTime dateTime37 = dateTime6.toDateTime((org.joda.time.Chronology) copticChronology27);
        org.joda.time.DateTime dateTime38 = dateTime37.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant22", (dateTime6.compareTo(instant22) == 0) == dateTime6.equals(instant22));
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        java.util.Calendar.Builder builder11 = builder2.setWeekDate((int) (byte) 100, 44, (-292275054));
        java.util.Calendar.Builder builder16 = builder11.setTimeOfDay(0, 31, 5, 437);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        int int19 = dateTime18.getMinuteOfDay();
        org.joda.time.DateTime dateTime21 = dateTime18.plusWeeks(10);
        int int22 = dateTime21.getMillisOfSecond();
        java.util.Date date23 = dateTime21.toDate();
        org.joda.time.DateTime dateTime24 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime25 = dateTime24.toLocalTime();
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes((-1));
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalTime localTime29 = localTime27.plus(readablePeriod28);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = localTime27.toString("+00:00:00.650", locale31);
        java.util.Calendar.Builder builder33 = builder11.setLocale(locale31);
        java.util.Calendar.Builder builder37 = builder11.setDate(41, 53737, 918);
        java.util.Calendar.Builder builder39 = builder37.setLenient(true);
        java.util.Calendar.Builder builder43 = builder39.setTimeOfDay(674, 837, 1468);
        org.joda.time.format.DateTimePrinter dateTimePrinter44 = null;
        org.joda.time.format.DateTimeParser dateTimeParser45 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter44, dateTimeParser45);
        org.joda.time.format.DateTimeParser dateTimeParser47 = dateTimeFormatter46.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter46.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter46.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter51.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter53.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter54.withOffsetParsed();
        java.util.Locale locale56 = dateTimeFormatter54.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter54.withPivotYear((java.lang.Integer) 902);
        org.joda.time.Instant instant59 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone60 = instant59.getZone();
        long long62 = dateTimeZone60.nextTransition((long) 893);
        java.util.Locale locale64 = java.util.Locale.CANADA;
        java.lang.String str65 = dateTimeZone60.getName((long) (short) 0, locale64);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.now(dateTimeZone60);
        int int68 = dateTimeZone60.getStandardOffset(1645455234217L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter58.withZone(dateTimeZone60);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter70 = dateTimeFormatter69.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter70.withOffsetParsed();
        java.util.Locale locale73 = java.util.Locale.forLanguageTag("10");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter70.withLocale(locale73);
        java.util.Calendar.Builder builder75 = builder43.setLocale(locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant59", (dateTime18.compareTo(instant59) == 0) == dateTime18.equals(instant59));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(14);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(2);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime11);
        int int15 = dateTime14.getEra();
        org.joda.time.TimeOfDay timeOfDay16 = dateTime14.toTimeOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds(21);
        org.joda.time.DateTime dateTime20 = dateTime14.minusMinutes((int) (byte) 0);
        org.joda.time.DateTime dateTime21 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        int int24 = dateTime21.get(dateTimeFieldType22);
        int int25 = dateTime21.getMinuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime21.withPeriodAdded(readablePeriod26, 490);
        org.joda.time.DateTime dateTime30 = dateTime28.plus(124383264488L);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime30.minus(readablePeriod31);
        org.joda.time.Instant instant33 = dateTime32.toInstant();
        org.joda.time.Instant instant35 = instant33.plus(11019L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }
}

