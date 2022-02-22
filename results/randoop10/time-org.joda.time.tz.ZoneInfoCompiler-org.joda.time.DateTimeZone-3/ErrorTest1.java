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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(360000000);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime14.plus((long) 'a');
        org.joda.time.DateTime dateTime20 = dateTime14.plusWeeks(11);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillis((long) 8);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property26 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime28 = localTime25.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime22.toDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.clockhourOfDay();
        long long35 = chronology29.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DurationField durationField36 = chronology29.months();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime6.toMutableDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField38 = chronology29.secondOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology29.centuryOfEra();
        org.joda.time.DurationField durationField40 = chronology29.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime37", (dateTime5.compareTo(mutableDateTime37) == 0) == dateTime5.equals(mutableDateTime37));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        calendar4.setLenient(true);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        java.util.TimeZone timeZone14 = calendar4.getTimeZone();
        boolean boolean15 = calendar4.isWeekDateSupported();
        calendar4.set(38, (int) (byte) -1, 54122803, 1970, 0);
        int int22 = calendar4.getWeekYear();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, chronology24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(100L, chronology27);
        boolean boolean29 = dateTime25.isAfter((org.joda.time.ReadableInstant) dateTime28);
        int int30 = dateTime25.getDayOfYear();
        org.joda.time.DateTime dateTime33 = dateTime25.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.plus(readableDuration36);
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withDurationAdded(readableDuration38, (int) (byte) 1);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTime(chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        boolean boolean45 = dateTimeZone43.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime47 = mutableDateTime42.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime48 = dateTime25.toDateTime(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime25.toMutableDateTimeISO();
        java.util.GregorianCalendar gregorianCalendar50 = dateTime25.toGregorianCalendar();
        java.lang.String str51 = gregorianCalendar50.getCalendarType();
        int int52 = calendar4.compareTo((java.util.Calendar) gregorianCalendar50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime48", (dateTime2.compareTo(dateTime48) == 0) == dateTime2.equals(dateTime48));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (byte) -1, (int) (byte) 1, (int) ' ');
        java.util.Calendar.Builder builder8 = builder4.setTimeOfDay(32769, 100, 50);
        java.util.Calendar.Builder builder13 = builder8.setTimeOfDay(54122803, 1645455723, (-1), 488);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        int int15 = timeZone14.getRawOffset();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        boolean boolean20 = localDateTime18.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.era();
        long long22 = property21.remainder();
        org.joda.time.LocalDateTime localDateTime23 = property21.withMinimumValue();
        java.lang.String str24 = property21.getAsText();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale25.getISO3Country();
        java.lang.String str27 = property21.getAsShortText(locale25);
        java.util.Locale locale30 = new java.util.Locale(":", "2057-02-19");
        java.lang.String str31 = locale25.getDisplayCountry(locale30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone14, locale25);
        boolean boolean33 = timeZone14.observesDaylightTime();
        java.util.Calendar.Builder builder34 = builder8.setTimeZone(timeZone14);
        java.util.Calendar.Builder builder36 = builder8.setLenient(false);
        java.util.Calendar.Builder builder40 = builder8.setTimeOfDay(30, 0, (int) ':');
        java.util.TimeZone timeZone42 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone42);
        java.util.Calendar.Builder builder44 = builder8.setTimeZone(timeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar32 and calendar43", (calendar32.compareTo(calendar43) == 0) == calendar32.equals(calendar43));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        boolean boolean4 = timeZone2.observesDaylightTime();
        int int5 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder6 = builder0.setTimeZone(timeZone2);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("+100:00");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone7, locale9);
        timeZone7.setID("\u7fa9\u5927\u5229\u6587");
        timeZone7.setID("2022-02-21T15:05:02.263Z");
        int int16 = timeZone7.getOffset(111600000L);
        java.lang.String str17 = timeZone7.getID();
        java.util.Calendar.Builder builder18 = builder6.setTimeZone(timeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar10", (calendar3.compareTo(calendar10) == 0) == calendar3.equals(calendar10));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        calendar4.setFirstDayOfWeek(16);
        int int15 = calendar4.getFirstDayOfWeek();
        java.util.Date date16 = new java.util.Date();
        int int17 = date16.getMonth();
        calendar4.setTime(date16);
        java.lang.String str19 = calendar4.getCalendarType();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        int int21 = localDate20.getCenturyOfEra();
        org.joda.time.LocalDate localDate23 = localDate20.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate25 = localDate23.minusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone26);
        long long31 = dateTimeZone26.adjustOffset((long) 22, false);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) calendar4, dateTimeZone26);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDate20 and localDate32", (localDate20.compareTo(localDate32) == 0) == localDate20.equals(localDate32));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.Locale locale2 = new java.util.Locale("fr", "\u4e2d\u6587");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime9.plus((long) 'a');
        org.joda.time.DateTime dateTime15 = dateTime9.plusWeeks(11);
        org.joda.time.DateTime dateTime17 = dateTime15.withMillis((long) 8);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property21 = localTime20.hourOfDay();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime17.toDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.clockhourOfDay();
        int int27 = dateTime4.get(dateTimeField26);
        long long29 = dateTimeField26.roundHalfEven((long) 2);
        long long32 = dateTimeField26.add((long) (byte) 1, (-1L));
        org.joda.time.ReadablePartial readablePartial33 = null;
        int int34 = dateTimeField26.getMaximumValue(readablePartial33);
        long long36 = dateTimeField26.roundHalfCeiling((long) (short) -1);
        java.util.Locale locale41 = new java.util.Locale("21 Oct 2111 15:01:55 GMT", "1", "UTC");
        java.lang.String str42 = dateTimeField26.getAsShortText(2000, locale41);
        java.util.Locale locale47 = new java.util.Locale("dayOfWeek", "1970-01-01", "1970");
        java.lang.String str48 = locale47.getCountry();
        java.lang.String str49 = dateTimeField26.getAsText(0L, locale47);
        java.lang.String str50 = locale2.getDisplayScript(locale47);
        java.lang.String str51 = locale47.getDisplayCountry();
        boolean boolean52 = locale47.hasExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime25", (dateTime17.compareTo(dateTime25) == 0) == dateTime17.equals(dateTime25));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.lang.String str1 = dateTime0.toString();
        org.joda.time.DateTime.Property property2 = dateTime0.weekyear();
        org.joda.time.DateTime.Property property3 = dateTime0.millisOfSecond();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        boolean boolean10 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime6.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime6.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime16 = dateTime6.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property20 = localTime19.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        int int26 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime16.toMutableDateTime(dateTimeZone22);
        org.joda.time.Instant instant28 = dateTime16.toInstant();
        int int29 = property3.compareTo((org.joda.time.ReadableInstant) instant28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime0 and dateTime25", (dateTime0.compareTo(dateTime25) == 0) == dateTime0.equals(dateTime25));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime13 = property10.addToCopy(3);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        boolean boolean22 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime18.getDayOfYear();
        org.joda.time.DateTime dateTime26 = dateTime18.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readableDuration29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.withDurationAdded(readableDuration31, (int) (byte) 1);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime33.toMutableDateTime(chronology34);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        boolean boolean38 = dateTimeZone36.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = mutableDateTime35.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime41 = dateTime18.toDateTime(dateTimeZone36);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfDay();
        boolean boolean43 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime41.plus(readableDuration44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.minus(readablePeriod46);
        org.joda.time.DateTime dateTime48 = dateTime45.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.hourOfDay();
        int int50 = dateTime48.get(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime48", (dateTime2.compareTo(dateTime48) == 0) == dateTime2.equals(dateTime48));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.plus(readableDuration37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.withDurationAdded(readableDuration39, (int) (byte) 1);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime41.toMutableDateTime(chronology42);
        boolean boolean44 = dateTime34.equals((java.lang.Object) dateTime41);
        org.joda.time.Chronology chronology45 = dateTime34.getChronology();
        org.joda.time.DateTime dateTime47 = dateTime34.withCenturyOfEra(70);
        boolean boolean49 = dateTime34.isBefore((long) 291971093);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime33", (dateTime25.compareTo(dateTime33) == 0) == dateTime25.equals(dateTime33));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        long long27 = chronology21.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField29 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone31 = chronology21.getZone();
        org.joda.time.DurationField durationField32 = chronology21.seconds();
        org.joda.time.DurationField durationField33 = chronology21.months();
        org.joda.time.DateTimeField dateTimeField34 = chronology21.dayOfWeek();
        org.joda.time.DurationField durationField35 = chronology21.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime7 = localDate3.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology9.getZone();
        org.joda.time.DurationField durationField11 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.year();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        int int15 = localDate14.getCenturyOfEra();
        org.joda.time.LocalDate localDate17 = localDate14.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate19 = localDate17.withWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = localDate19.toString(dateTimeFormatter20);
        org.joda.time.LocalDate localDate23 = localDate19.withWeekyear(2019);
        java.lang.String str25 = localDate19.toString("1970-01-01");
        org.joda.time.LocalDate localDate27 = localDate19.withYearOfEra(13);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        int int29 = localDate28.getCenturyOfEra();
        org.joda.time.LocalDate localDate31 = localDate28.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate33 = localDate31.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate34 = localDate27.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate36 = localDate34.withDayOfYear(2);
        org.joda.time.LocalDate localDate38 = localDate36.withYearOfEra(19);
        int int39 = localDate38.getYear();
        org.joda.time.LocalDate localDate41 = localDate38.plusYears(3988);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        int int43 = localDate42.getCenturyOfEra();
        org.joda.time.LocalDate localDate45 = localDate42.withCenturyOfEra(4);
        org.joda.time.Interval interval46 = localDate42.toInterval();
        org.joda.time.LocalDate.Property property47 = localDate42.year();
        org.joda.time.LocalDate localDate48 = property47.roundFloorCopy();
        org.joda.time.LocalDate localDate49 = property47.roundFloorCopy();
        org.joda.time.LocalDate localDate50 = property47.roundHalfFloorCopy();
        org.joda.time.LocalDate.Property property51 = localDate50.dayOfYear();
        org.joda.time.LocalDate localDate52 = property51.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate53 = localDate38.withFields((org.joda.time.ReadablePartial) localDate52);
        org.joda.time.Instant instant54 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime55 = instant54.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime56 = instant54.toMutableDateTime();
        org.joda.time.Chronology chronology57 = instant54.getChronology();
        org.joda.time.LocalDate localDate58 = org.joda.time.LocalDate.now();
        int int59 = localDate58.getCenturyOfEra();
        org.joda.time.LocalDate localDate61 = localDate58.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property62 = localDate61.monthOfYear();
        org.joda.time.LocalDate localDate63 = property62.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDate localDate65 = localDate63.plus(readablePeriod64);
        org.joda.time.LocalDate.Property property66 = localDate63.monthOfYear();
        org.joda.time.LocalDate localDate67 = property66.withMinimumValue();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(100L, chronology69);
        org.joda.time.DateTime dateTime72 = dateTime70.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology73 = dateTime70.getChronology();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone75);
        org.joda.time.LocalDate localDate78 = localDate76.plusDays(3);
        int int79 = localDate78.getYear();
        org.joda.time.LocalDate localDate81 = localDate78.withWeekOfWeekyear((int) ' ');
        int[] intArray83 = chronology73.get((org.joda.time.ReadablePartial) localDate78, (long) 52);
        chronology57.validate((org.joda.time.ReadablePartial) localDate67, intArray83);
        chronology9.validate((org.joda.time.ReadablePartial) localDate52, intArray83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant54 and mutableDateTime55", (instant54.compareTo(mutableDateTime55) == 0) == instant54.equals(mutableDateTime55));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        strSet3.clear();
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "/experiment/hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.String[] strArray15 = new java.lang.String[] { "1970-01-01", "", "", "/experiment/hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = strSet9.addAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet3.removeAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.stream.Stream<java.lang.String> strStream20 = strSet3.parallelStream();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(100L, chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, chronology25);
        boolean boolean27 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime23.getDayOfYear();
        org.joda.time.DateTime dateTime31 = dateTime23.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime33 = dateTime23.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime40 = localTime36.toDateTimeToday(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now(dateTimeZone41);
        int int43 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime33.toMutableDateTime(dateTimeZone39);
        org.joda.time.Instant instant45 = dateTime33.toInstant();
        org.joda.time.Instant instant47 = instant45.minus(45056L);
        org.joda.time.Chronology chronology48 = instant45.getChronology();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.Instant instant51 = instant45.withDurationAdded(readableDuration49, (int) (short) 1);
        org.joda.time.Instant instant52 = instant45.toInstant();
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.joda.time.Instant instant54 = instant52.toInstant();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.Instant instant56 = instant54.minus(readableDuration55);
        boolean boolean57 = strSet3.equals((java.lang.Object) instant56);
        org.joda.time.DateTime dateTime58 = instant56.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.minus(readableDuration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime33 and mutableDateTime44", (dateTime33.compareTo(mutableDateTime44) == 0) == dateTime33.equals(mutableDateTime44));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime6 = dateTime3.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds(27);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.withPeriodAdded(readablePeriod9, 69);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime14 = dateTime8.withPeriodAdded(readablePeriod12, 311);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, chronology19);
        boolean boolean21 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime17.getDayOfYear();
        org.joda.time.DateTime dateTime25 = dateTime17.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime27 = dateTime17.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property31 = localTime30.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime34 = localTime30.toDateTimeToday(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        int int37 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime27.toMutableDateTime(dateTimeZone33);
        org.joda.time.Instant instant39 = dateTime27.toInstant();
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTimeISO();
        org.joda.time.Instant instant43 = instant39.withDurationAdded(100L, (int) (short) 100);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant46 = instant43.withDurationAdded(readableDuration44, 70);
        int int47 = dateTime14.compareTo((org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTime dateTime48 = instant43.toDateTimeISO();
        org.joda.time.DateTime dateTime50 = dateTime48.plusMinutes(177);
        int int51 = dateTime50.getMonthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime38", (dateTime27.compareTo(mutableDateTime38) == 0) == dateTime27.equals(mutableDateTime38));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(100L, chronology2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        boolean boolean7 = dateTime3.isAfter((org.joda.time.ReadableInstant) dateTime6);
        int int8 = dateTime3.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime3.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime13 = dateTime3.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property17 = localTime16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        int int23 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime13.toMutableDateTime(dateTimeZone19);
        org.joda.time.Instant instant25 = dateTime13.toInstant();
        org.joda.time.Instant instant28 = instant25.withDurationAdded((long) (byte) 100, 1970);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant25.plus(readableDuration29);
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        org.joda.time.Instant instant33 = instant30.minus((long) 53);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Chronology chronology36 = instant33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.hours();
        org.joda.time.DurationField durationField38 = chronology36.weekyears();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay(280489185280L, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime24", (dateTime13.compareTo(mutableDateTime24) == 0) == dateTime13.equals(mutableDateTime24));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(360000000);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear((int) (byte) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology17.add(readablePeriod19, (long) 13, (int) ' ');
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime9, chronology17);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusYears(69);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readableDuration27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime18", (dateTime8.compareTo(dateTime18) == 0) == dateTime8.equals(dateTime18));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime7.plus((long) 'a');
        org.joda.time.DateTime dateTime13 = dateTime7.plusWeeks(11);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 8);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime15.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.clockhourOfDay();
        long long28 = chronology22.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime29 = dateTime2.withChronology(chronology22);
        org.joda.time.DateTimeField dateTimeField30 = chronology22.year();
        org.joda.time.DateTimeField dateTimeField31 = chronology22.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology22.getZone();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay(1649602997412L, chronology22);
        org.joda.time.DateTimeField dateTimeField35 = chronology22.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime5", (dateTime2.compareTo(dateTime5) == 0) == dateTime2.equals(dateTime5));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 197);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks(52);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(100L, chronology21);
        int int23 = dateTime22.getMillisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.plusHours(360000000);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime26.withZoneRetainFields(dateTimeZone27);
        int int30 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean32 = dateTime29.isAfter(63686358167502L);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime29.minus(readablePeriod33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime14", (dateTime9.compareTo(dateTime14) == 0) == dateTime9.equals(dateTime14));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 83, chronology1);
        int int3 = dateTime2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        boolean boolean10 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime9);
        int int11 = dateTime6.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime6.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime16 = dateTime14.plusSeconds(1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime21.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime21.plus((long) 'a');
        org.joda.time.DateTime dateTime27 = dateTime21.plusWeeks(11);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis((long) 8);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property33 = localTime32.hourOfDay();
        org.joda.time.LocalTime localTime35 = localTime32.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime29.toDateTime(chronology36);
        org.joda.time.DateTime dateTime38 = dateTime16.withChronology(chronology36);
        org.joda.time.DurationField durationField39 = chronology36.weekyears();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        long long43 = chronology36.add(readablePeriod40, 0L, 148);
        org.joda.time.DateTime dateTime44 = dateTime2.toDateTime(chronology36);
        org.joda.time.DateTime.Property property45 = dateTime2.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime38", (dateTime16.compareTo(dateTime38) == 0) == dateTime16.equals(dateTime38));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime12.toMutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant24 = dateTime12.toInstant();
        org.joda.time.Instant instant27 = instant24.withDurationAdded((long) (byte) 100, 1970);
        org.joda.time.DateTime dateTime28 = instant27.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant27.minus(readableDuration29);
        org.joda.time.Instant instant31 = instant30.toInstant();
        org.joda.time.Instant instant33 = instant31.minus(280492339200L);
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology34.getZone();
        long long40 = dateTimeZone36.convertLocalToUTC(299087052800L, false, (long) 770);
        java.lang.String str41 = dateTimeZone36.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime23", (dateTime12.compareTo(mutableDateTime23) == 0) == dateTime12.equals(mutableDateTime23));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = dateTime2.toString(dateTimeFormatter5);
        org.joda.time.DateTime.Property property7 = dateTime2.centuryOfEra();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property11 = localTime10.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        int int17 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean19 = dateTimeZone13.isStandardOffset(0L);
        java.util.TimeZone timeZone20 = dateTimeZone13.toTimeZone();
        org.joda.time.tz.NameProvider nameProvider22 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale25 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        java.lang.String str29 = nameProvider22.getName(locale25, "hi!", "1970-01-01");
        java.lang.String str30 = dateTimeZone13.getShortName(10L, locale25);
        java.lang.String str31 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) dateTime2, dateTimeZone13);
        org.joda.time.DateTime dateTime34 = dateTime32.withYearOfCentury(52);
        boolean boolean35 = dateTime32.isEqualNow();
        org.joda.time.DateTime dateTime37 = dateTime32.withMillisOfDay(38);
        int int38 = dateTime37.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime32", (dateTime2.compareTo(dateTime32) == 0) == dateTime2.equals(dateTime32));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        int int13 = dateTime2.getWeekOfWeekyear();
        int int14 = dateTime2.getMinuteOfHour();
        boolean boolean15 = dateTime2.isAfterNow();
        org.joda.time.DateTime dateTime16 = dateTime2.toDateTimeISO();
        org.joda.time.Instant instant17 = dateTime16.toInstant();
        org.joda.time.Instant instant18 = dateTime16.toInstant();
        int int19 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime21 = dateTime16.plusMinutes((-959));
        org.joda.time.DateTime.Property property22 = dateTime16.minuteOfHour();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime27.plus((long) 'a');
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.toDateTime(chronology33);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime32.withZone(dateTimeZone35);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.withPeriodAdded(readablePeriod38, 197);
        org.joda.time.DateTime dateTime42 = dateTime40.minusWeeks(52);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.monthOfYear();
        org.joda.time.DateTime dateTime47 = dateTime16.toDateTime(chronology43);
        org.joda.time.DateTime dateTime48 = dateTime47.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant17", (dateTime2.compareTo(instant17) == 0) == dateTime2.equals(instant17));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(100L, chronology2);
        java.util.Locale locale4 = null;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekOfWeekyear(2);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear(10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property13 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withMillisOfSecond((int) (byte) 10);
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond(16);
        org.joda.time.Chronology chronology18 = localTime15.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology18.add(readablePeriod20, (long) 1645456076, 172);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(299086536704L, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime19", (dateTime9.compareTo(dateTime19) == 0) == dateTime9.equals(dateTime19));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.Instant instant4 = instant0.minus(197L);
        org.joda.time.Instant instant6 = instant4.minus(63686358126495L);
        org.joda.time.DateTime dateTime7 = instant6.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        java.util.Date date5 = new java.util.Date((-1), 102, 9, 54227714, 1645455737);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate localDate8 = localDate6.plusDays(54289346);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        boolean boolean15 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) (byte) 10);
        int int22 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        boolean boolean25 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime11.toMutableDateTime(dateTimeZone23);
        long long29 = dateTimeZone23.convertUTCToLocal((long) (byte) 1);
        org.joda.time.DateMidnight dateMidnight30 = localDate8.toDateMidnight(dateTimeZone23);
        org.joda.time.DateTime dateTime31 = localDate8.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property32 = dateTime31.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime27", (dateTime11.compareTo(mutableDateTime27) == 0) == dateTime11.equals(mutableDateTime27));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        int int10 = property5.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime11 = property5.roundHalfEvenCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime11.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.plusMonths((int) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime15.minusDays((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(422);
        java.lang.String str20 = dateTimeZone19.toString();
        org.joda.time.DateTime dateTime21 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime21", (dateTime15.compareTo(dateTime21) == 0) == dateTime15.equals(dateTime21));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getMinimalDaysInFirstWeek();
        long long14 = calendar4.getTimeInMillis();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) '#', dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone19);
        int int23 = dateTimeZone19.getOffset((long) 20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(63686358113845L, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(360000001L, dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, chronology31);
        boolean boolean33 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime29.getDayOfYear();
        org.joda.time.DateTime dateTime36 = dateTime29.plusYears((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime29.minusWeeks(4);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfWeek(1);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.minus(readableDuration41);
        int int43 = dateTime38.getHourOfDay();
        org.joda.time.DateTime dateTime45 = dateTime38.withMillisOfDay(2022);
        org.joda.time.DateTime.Property property46 = dateTime45.dayOfMonth();
        int int47 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) dateTime45);
        java.util.Date date49 = new java.util.Date((long) 'a');
        int int50 = date49.getMonth();
        int int51 = date49.getDay();
        int int52 = date49.getHours();
        boolean boolean53 = dateTimeZone19.equals((java.lang.Object) date49);
        calendar4.setTime(date49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        int int10 = property5.getMaximumTextLength(locale8);
        org.joda.time.DateTime dateTime11 = property5.getDateTime();
        org.joda.time.DateTime dateTime12 = property5.getDateTime();
        int int13 = dateTime12.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime18 = localTime16.minusMillis((int) 'a');
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        boolean boolean25 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime24);
        int int26 = dateTime21.getDayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime21.plusYears((int) (short) 0);
        long long29 = dateTime21.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int31 = dateTime21.get(dateTimeFieldType30);
        org.joda.time.LocalTime.Property property32 = localTime16.property(dateTimeFieldType30);
        org.joda.time.DurationField durationField33 = property32.getLeapDurationField();
        org.joda.time.LocalTime localTime34 = property32.roundHalfFloorCopy();
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime12.toDateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        int int41 = dateTimeZone39.getStandardOffset((long) 32769);
        long long45 = dateTimeZone39.convertLocalToUTC((long) 2022, true, 299090817024L);
        java.util.Locale locale49 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet50 = locale49.getUnicodeLocaleKeys();
        java.lang.String str51 = locale49.getVariant();
        java.lang.String str52 = locale49.getDisplayScript();
        java.util.Locale locale53 = locale49.stripExtensions();
        java.util.Set<java.lang.String> strSet54 = locale53.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale53);
        java.lang.String str56 = dateTimeZone39.getShortName((long) 38, locale53);
        org.joda.time.Chronology chronology57 = chronology35.withZone(dateTimeZone39);
        org.joda.time.DurationField durationField58 = chronology35.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime36", (dateTime2.compareTo(dateTime36) == 0) == dateTime2.equals(dateTime36));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.length();
        boolean boolean6 = file3.setReadable(false);
        long long7 = file3.getTotalSpace();
        boolean boolean8 = file3.canRead();
        java.io.File file9 = file3.getCanonicalFile();
        boolean boolean10 = file9.mkdir();
        boolean boolean12 = file9.setWritable(true);
        boolean boolean13 = file9.canExecute();
        boolean boolean15 = file9.setWritable(false);
        boolean boolean16 = file9.createNewFile();
        java.io.File[] fileArray17 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = zoneInfoCompiler0.compile(file9, fileArray17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        boolean boolean25 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(dateTimeZone28);
        int int34 = dateTimeZone28.getStandardOffset((long) 1);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        org.joda.time.LocalDate localDate39 = property37.setCopy("100");
        int[] intArray40 = localDate39.getValues();
        org.joda.time.LocalDate localDate42 = localDate39.withDayOfMonth(10);
        org.joda.time.LocalDate.Property property43 = localDate42.era();
        boolean boolean44 = strMap18.remove((java.lang.Object) dateTime35, (java.lang.Object) property43);
        boolean boolean45 = strMap18.isEmpty();
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = strMap18.get((java.lang.Object) dateTime47);
        int int49 = strMap18.size();
        java.util.Collection<org.joda.time.DateTimeZone> dateTimeZoneCollection50 = strMap18.values();
        java.util.Set<java.lang.String> strSet51 = strMap18.keySet();
        int int52 = strSet51.size();
        int int53 = strSet51.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime32", (dateTime21.compareTo(dateTime32) == 0) == dateTime21.equals(dateTime32));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        int int2 = localDateTime0.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMonths(1645455737);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plusDays(82980000);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime();
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.plusDays(102);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        calendar15.clear(9);
        calendar15.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(100L, chronology26);
        boolean boolean28 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime27);
        int int29 = dateTime24.getDayOfYear();
        org.joda.time.DateTime dateTime32 = dateTime24.withDurationAdded((long) (short) 0, 100);
        int int33 = dateTime32.getWeekOfWeekyear();
        boolean boolean34 = calendar15.before((java.lang.Object) dateTime32);
        java.lang.String str35 = dateTime32.toString();
        org.joda.time.DateTime dateTime37 = dateTime32.plusMinutes(53);
        org.joda.time.DateTime.Property property38 = dateTime37.millisOfDay();
        org.joda.time.Chronology chronology39 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekyearOfCentury();
        org.joda.time.DateTime dateTime41 = dateTime7.toDateTime(chronology39);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.DateTime dateTime43 = dateTime7.plus(readableDuration42);
        org.joda.time.DateTime.Property property44 = dateTime7.centuryOfEra();
        org.joda.time.DateTime dateTime46 = dateTime7.plusSeconds((-959));
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHours(366);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime7.withZone(dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDateTime0.toDateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime50", (dateTime7.compareTo(dateTime50) == 0) == dateTime7.equals(dateTime50));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(100L, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, chronology39);
        boolean boolean41 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime37.getDayOfYear();
        org.joda.time.DateTime dateTime45 = dateTime37.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime47 = dateTime37.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property51 = localTime50.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime54 = localTime50.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        int int57 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime47.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateTime34.toDateTime(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime62 = dateTime59.toDateTime(dateTimeZone61);
        org.joda.time.DateTime.Property property63 = dateTime59.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField64 = property63.getField();
        long long66 = dateTimeField64.roundCeiling((long) 334);
        long long68 = dateTimeField64.roundHalfFloor(44L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime34", (dateTime12.compareTo(dateTime34) == 0) == dateTime12.equals(dateTime34));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getDisplayCountry();
        java.lang.String str5 = locale2.getDisplayCountry();
        java.util.Set<java.lang.String> strSet6 = locale2.getUnicodeLocaleKeys();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime13 = property10.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime14 = property10.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime15 = property10.roundHalfEvenCopy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        boolean boolean22 = dateTime18.isAfter((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime18.getDayOfYear();
        org.joda.time.DateTime dateTime26 = dateTime18.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime28 = dateTime26.plusSeconds(1);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(100L, chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.withZoneRetainFields(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime33.plus((long) 'a');
        org.joda.time.DateTime dateTime39 = dateTime33.plusWeeks(11);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) 8);
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property45 = localTime44.hourOfDay();
        org.joda.time.LocalTime localTime47 = localTime44.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology48 = localTime47.getChronology();
        org.joda.time.DateTime dateTime49 = dateTime41.toDateTime(chronology48);
        org.joda.time.DateTime dateTime50 = dateTime28.withChronology(chronology48);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(100L, chronology52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(100L, chronology55);
        boolean boolean57 = dateTime53.isAfter((org.joda.time.ReadableInstant) dateTime56);
        int int58 = dateTime53.getDayOfYear();
        org.joda.time.DateTime dateTime61 = dateTime53.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime63 = dateTime53.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property67 = localTime66.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime70 = localTime66.toDateTimeToday(dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime72 = org.joda.time.DateTime.now(dateTimeZone71);
        int int73 = dateTimeZone69.getOffset((org.joda.time.ReadableInstant) dateTime72);
        org.joda.time.MutableDateTime mutableDateTime74 = dateTime63.toMutableDateTime(dateTimeZone69);
        org.joda.time.DateTime dateTime75 = dateTime50.toDateTime(dateTimeZone69);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(100L, chronology77);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime(100L, chronology80);
        boolean boolean82 = dateTime78.isAfter((org.joda.time.ReadableInstant) dateTime81);
        int int83 = dateTime78.getDayOfYear();
        org.joda.time.DateTime dateTime85 = dateTime78.plusYears((int) (short) 0);
        long long86 = dateTime78.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType87 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int88 = dateTime78.get(dateTimeFieldType87);
        int int89 = dateTime50.get(dateTimeFieldType87);
        org.joda.time.Chronology chronology90 = dateTime50.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.weeks();
        org.joda.time.DurationField durationField92 = chronology90.centuries();
        boolean boolean93 = property10.equals((java.lang.Object) chronology90);
        org.joda.time.LocalTime localTime94 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime96 = property10.addCopy(2019);
        boolean boolean97 = strSet6.contains((java.lang.Object) property10);
        org.joda.time.LocalTime localTime99 = property10.addWrapFieldToCopy(1645455949);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime50", (dateTime28.compareTo(dateTime50) == 0) == dateTime28.equals(dateTime50));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate7 = localDate4.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property8 = localDate7.monthOfYear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate9.monthOfYear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology19 = dateTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.plusDays(3);
        int int25 = localDate24.getYear();
        org.joda.time.LocalDate localDate27 = localDate24.withWeekOfWeekyear((int) ' ');
        int[] intArray29 = chronology19.get((org.joda.time.ReadablePartial) localDate24, (long) 52);
        chronology3.validate((org.joda.time.ReadablePartial) localDate13, intArray29);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) localDate13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 197);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 23);
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds(850);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMillis(4);
        org.joda.time.TimeOfDay timeOfDay24 = dateTime23.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime14", (dateTime9.compareTo(dateTime14) == 0) == dateTime9.equals(dateTime14));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(100L, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime5.plus((long) 'a');
        org.joda.time.DateTime dateTime11 = dateTime5.plusWeeks(11);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillis((long) 8);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property17 = localTime16.hourOfDay();
        org.joda.time.LocalTime localTime19 = localTime16.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.clockhourOfDay();
        long long26 = chronology20.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.weekOfWeekyear();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 54138253, chronology20);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime21", (dateTime13.compareTo(dateTime21) == 0) == dateTime13.equals(dateTime21));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        boolean boolean4 = timeZone2.observesDaylightTime();
        int int5 = timeZone2.getRawOffset();
        java.util.Calendar.Builder builder6 = builder0.setTimeZone(timeZone2);
        timeZone2.setRawOffset(54122803);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean13 = timeZone11.observesDaylightTime();
        int int14 = timeZone11.getRawOffset();
        java.util.Calendar.Builder builder15 = builder9.setTimeZone(timeZone11);
        boolean boolean16 = timeZone2.hasSameRules(timeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar12", (calendar3.compareTo(calendar12) == 0) == calendar3.equals(calendar12));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(dateTimeZone9);
        int int15 = dateTimeZone9.getOffset(280485761024L);
        java.lang.String str17 = dateTimeZone9.getShortName(63686358353302L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.era();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.withMinimumValue();
        java.lang.String str10 = property7.getAsText();
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = locale11.getISO3Country();
        java.lang.String str13 = property7.getAsShortText(locale11);
        java.util.Locale locale16 = new java.util.Locale(":", "2057-02-19");
        java.lang.String str17 = locale11.getDisplayCountry(locale16);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone0, locale11);
        boolean boolean19 = timeZone0.observesDaylightTime();
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder20.clear();
        java.util.Locale.Builder builder23 = builder20.setRegion("100");
        java.util.Locale locale24 = builder20.build();
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleAttributes();
        java.lang.String str26 = locale24.getDisplayLanguage();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(timeZone0, locale24);
        int int28 = timeZone0.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar27", (calendar18.compareTo(calendar27) == 0) == calendar18.equals(calendar27));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(100L, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.withZoneRetainFields(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime5.plus((long) 'a');
        org.joda.time.DateTime dateTime11 = dateTime5.plusWeeks(11);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillis((long) 8);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property17 = localTime16.hourOfDay();
        org.joda.time.LocalTime localTime19 = localTime16.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology20 = localTime19.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime13.toDateTime(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.clockhourOfDay();
        java.lang.String str23 = chronology20.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = chronology20.getZone();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj0, dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime21", (dateTime13.compareTo(dateTime21) == 0) == dateTime13.equals(dateTime21));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '#', dateTimeZone2);
        int int5 = dateTimeZone2.getOffset((long) (short) 10);
        java.util.Locale locale9 = new java.util.Locale("", "hi!");
        java.util.Locale locale12 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale9.getDisplayScript(locale12);
        java.lang.String str16 = dateTimeZone2.getShortName((long) 20, locale12);
        java.lang.String str18 = dateTimeZone2.getShortName(22L);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        int int22 = dateTime19.get(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readableDuration25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, (int) (byte) 1);
        boolean boolean30 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime26.toMutableDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime26", (dateTime19.compareTo(dateTime26) == 0) == dateTime19.equals(dateTime26));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDate localDate15 = dateTime14.toLocalDate();
        org.joda.time.DateTime dateTime17 = dateTime14.minusHours(82980000);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.plus(readablePeriod18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#', dateTimeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone22.toTimeZone();
        long long26 = dateTimeZone22.convertUTCToLocal((long) 122);
        org.joda.time.DateTime dateTime27 = dateTime17.withZoneRetainFields(dateTimeZone22);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(513);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.DurationField durationField6 = dateTimeField5.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime13.plus((long) 'a');
        org.joda.time.DateTime dateTime19 = dateTime13.plusWeeks(11);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 8);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property25 = localTime24.hourOfDay();
        org.joda.time.LocalTime localTime27 = localTime24.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime21.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.clockhourOfDay();
        int int31 = dateTime8.get(dateTimeField30);
        long long33 = dateTimeField30.roundHalfEven((long) 2);
        int int35 = dateTimeField30.getLeapAmount(45056L);
        java.lang.String str37 = dateTimeField30.getAsShortText((long) 3);
        java.util.Locale locale40 = new java.util.Locale("", "hi!");
        int int41 = dateTimeField30.getMaximumShortTextLength(locale40);
        long long44 = dateTimeField30.add(90L, 16);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime47 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime49 = dateTime47.plusMonths(0);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTime dateTime52 = dateTime49.withSecondOfMinute((int) (short) 0);
        org.joda.time.DateTime dateTime54 = dateTime49.minusSeconds(27);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.withPeriodAdded(readablePeriod55, 69);
        java.util.Locale locale58 = java.util.Locale.FRANCE;
        java.lang.String str59 = locale58.getCountry();
        java.lang.String str60 = locale58.getDisplayVariant();
        java.util.Calendar calendar61 = dateTime54.toCalendar(locale58);
        java.lang.String str62 = dateTimeField30.getAsShortText(148221, locale58);
        int int63 = dateTimeField5.getMaximumShortTextLength(locale58);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(locale58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime29", (dateTime21.compareTo(dateTime29) == 0) == dateTime21.equals(dateTime29));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime12.toMutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant24 = dateTime12.toInstant();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant24.plus(readableDuration25);
        org.joda.time.Instant instant29 = instant26.withDurationAdded((long) 1100, 0);
        org.joda.time.Instant instant32 = instant29.withDurationAdded((long) 'a', 976);
        org.joda.time.Instant instant33 = instant29.toInstant();
        long long34 = instant29.getMillis();
        long long35 = instant29.getMillis();
        org.joda.time.Instant instant37 = instant29.minus(13L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime23", (dateTime12.compareTo(mutableDateTime23) == 0) == dateTime12.equals(mutableDateTime23));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        long long27 = chronology21.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField29 = chronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology21.secondOfDay();
        long long33 = dateTimeField30.getDifferenceAsLong((long) 1645830637, 115L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        int int5 = localTime4.getMillisOfDay();
        org.joda.time.LocalTime localTime7 = localTime4.withMinuteOfHour(23);
        org.joda.time.LocalTime.Property property8 = localTime4.millisOfSecond();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        boolean boolean15 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds(1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime26.plus((long) 'a');
        org.joda.time.DateTime dateTime32 = dateTime26.plusWeeks(11);
        org.joda.time.DateTime dateTime34 = dateTime32.withMillis((long) 8);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property38 = localTime37.hourOfDay();
        org.joda.time.LocalTime localTime40 = localTime37.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTime(chronology41);
        org.joda.time.DateTime dateTime43 = dateTime21.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        org.joda.time.DateTimeField dateTimeField45 = chronology41.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.centuryOfEra();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(chronology41);
        java.util.Locale locale50 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet51 = locale50.getUnicodeLocaleKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(100L, chronology54);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(100L, chronology57);
        boolean boolean59 = dateTime55.isAfter((org.joda.time.ReadableInstant) dateTime58);
        int int60 = dateTime55.getDayOfYear();
        org.joda.time.DateTime dateTime63 = dateTime55.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime65 = dateTime63.plusSeconds(1);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(100L, chronology67);
        org.joda.time.DateTime dateTime70 = dateTime68.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = dateTime70.withZoneRetainFields(dateTimeZone71);
        org.joda.time.DateTime dateTime74 = dateTime70.plus((long) 'a');
        org.joda.time.DateTime dateTime76 = dateTime70.plusWeeks(11);
        org.joda.time.DateTime dateTime78 = dateTime76.withMillis((long) 8);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property82 = localTime81.hourOfDay();
        org.joda.time.LocalTime localTime84 = localTime81.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology85 = localTime84.getChronology();
        org.joda.time.DateTime dateTime86 = dateTime78.toDateTime(chronology85);
        org.joda.time.DateTime dateTime87 = dateTime65.withChronology(chronology85);
        org.joda.time.DateTimeField dateTimeField88 = chronology85.monthOfYear();
        org.joda.time.DateTimeField dateTimeField89 = chronology85.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField90 = chronology85.centuryOfEra();
        org.joda.time.LocalTime localTime91 = new org.joda.time.LocalTime(chronology85);
        org.joda.time.DateTimeField dateTimeField92 = dateTimeFieldType52.getField(chronology85);
        boolean boolean93 = strSet51.contains((java.lang.Object) dateTimeFieldType52);
        org.joda.time.DurationFieldType durationFieldType94 = dateTimeFieldType52.getRangeDurationType();
        int int95 = localTime47.get(dateTimeFieldType52);
        org.joda.time.LocalTime.Property property96 = localTime4.property(dateTimeFieldType52);
        org.joda.time.LocalTime localTime98 = property96.addCopy(299087626240L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime43", (dateTime21.compareTo(dateTime43) == 0) == dateTime21.equals(dateTime43));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime10 = localTime2.plusMillis(12);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property13 = localTime10.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.setCopy(2);
        org.joda.time.LocalTime localTime17 = property13.setCopy(27);
        org.joda.time.LocalTime localTime19 = property13.addCopy((long) 54158083);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property23.withMinimumValue();
        org.joda.time.LocalTime localTime26 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime27 = property23.withMaximumValue();
        org.joda.time.LocalTime localTime29 = property23.addWrapFieldToCopy(976);
        org.joda.time.LocalTime localTime31 = localTime29.withMillisOfSecond(10);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readableDuration34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(readableDuration36, (int) (byte) 1);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfYear((int) (short) 100);
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTime dateTime43 = dateTime40.withFieldAdded(durationFieldType41, 10);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(100L, chronology45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(100L, chronology48);
        boolean boolean50 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime49);
        int int51 = dateTime46.getDayOfYear();
        org.joda.time.DateTime dateTime54 = dateTime46.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime56 = dateTime54.plusSeconds(1);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(100L, chronology58);
        org.joda.time.DateTime dateTime61 = dateTime59.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.withZoneRetainFields(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime61.plus((long) 'a');
        org.joda.time.DateTime dateTime67 = dateTime61.plusWeeks(11);
        org.joda.time.DateTime dateTime69 = dateTime67.withMillis((long) 8);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property73 = localTime72.hourOfDay();
        org.joda.time.LocalTime localTime75 = localTime72.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology76 = localTime75.getChronology();
        org.joda.time.DateTime dateTime77 = dateTime69.toDateTime(chronology76);
        org.joda.time.DateTime dateTime78 = dateTime56.withChronology(chronology76);
        org.joda.time.DateTimeField dateTimeField79 = chronology76.monthOfYear();
        org.joda.time.DateTimeField dateTimeField80 = chronology76.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField81 = chronology76.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField82 = chronology76.millisOfSecond();
        boolean boolean83 = durationFieldType41.isSupported(chronology76);
        boolean boolean84 = localTime31.isSupported(durationFieldType41);
        boolean boolean85 = localTime19.isSupported(durationFieldType41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and dateTime78", (dateTime56.compareTo(dateTime78) == 0) == dateTime56.equals(dateTime78));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withMinuteOfHour(2);
        org.joda.time.DateTime dateTime10 = dateTime8.minus(21L);
        org.joda.time.DateTime.Property property11 = dateTime8.era();
        org.joda.time.DateTime dateTime13 = dateTime8.withDayOfMonth(14);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, chronology18);
        boolean boolean20 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime16.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime16.year();
        org.joda.time.DateTime dateTime25 = property24.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime27 = dateTime25.minusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, chronology31);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.withZoneRetainFields(dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime34.plus((long) 'a');
        org.joda.time.DateTime dateTime40 = dateTime34.plusWeeks(11);
        org.joda.time.DateTime dateTime42 = dateTime40.withMillis((long) 8);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property46 = localTime45.hourOfDay();
        org.joda.time.LocalTime localTime48 = localTime45.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.DateTime dateTime50 = dateTime42.toDateTime(chronology49);
        org.joda.time.DateTimeField dateTimeField51 = chronology49.clockhourOfDay();
        long long55 = chronology49.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime56 = dateTime29.withChronology(chronology49);
        org.joda.time.DateTimeField dateTimeField57 = chronology49.year();
        org.joda.time.DateTime dateTime58 = dateTime27.toDateTime(chronology49);
        org.joda.time.DateTimeField dateTimeField59 = chronology49.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField60 = chronology49.centuryOfEra();
        org.joda.time.DateTime dateTime61 = dateTime13.toDateTime(chronology49);
        org.joda.time.DateTimeField dateTimeField62 = chronology49.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear(24);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, chronology19);
        boolean boolean21 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime17.getDayOfYear();
        org.joda.time.DateTime dateTime25 = dateTime17.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime27 = dateTime17.minus((long) (byte) 10);
        int int28 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime17.toMutableDateTime(dateTimeZone29);
        long long35 = dateTimeZone29.convertUTCToLocal((long) (byte) 1);
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.lang.String str38 = dateTimeZone29.getShortName(63686358113273L, locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.util.Calendar calendar40 = dateTime14.toCalendar(locale37);
        java.util.TimeZone timeZone41 = calendar40.getTimeZone();
        int int43 = calendar40.getLeastMaximum(0);
        long long44 = calendar40.getTimeInMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime33", (dateTime2.compareTo(mutableDateTime33) == 0) == dateTime2.equals(mutableDateTime33));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '#', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 20);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears(3);
        boolean boolean17 = dateTimeZone9.isLocalDateTimeGap(localDateTime16);
        org.joda.time.DateTime dateTime18 = dateTime6.toDateTime(dateTimeZone9);
        long long20 = dateTimeZone9.previousTransition(63686358556463L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime18", (dateTime6.compareTo(dateTime18) == 0) == dateTime6.equals(dateTime18));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property3.addCopy(10);
        java.util.Locale locale11 = new java.util.Locale("/", "100", "0422-02-21");
        java.lang.String str12 = property3.getAsText(locale11);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = property3.getAsShortText(locale13);
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        java.lang.Integer int19 = dateTimeFormatter18.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeZone23.getShortName((long) (-1), locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter18.withZone(dateTimeZone23);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(63685998126436L, dateTimeZone23);
        java.lang.String str30 = dateTimeZone23.getShortName((long) 334);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(100L, chronology33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime36.plus((long) 'a');
        org.joda.time.DateTime dateTime42 = dateTime36.plusWeeks(11);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((long) 8);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property48 = localTime47.hourOfDay();
        org.joda.time.LocalTime localTime50 = localTime47.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology51 = localTime50.getChronology();
        org.joda.time.DateTime dateTime52 = dateTime44.toDateTime(chronology51);
        org.joda.time.DateTimeField dateTimeField53 = chronology51.clockhourOfDay();
        long long57 = chronology51.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DurationField durationField58 = chronology51.weeks();
        org.joda.time.DateTimeField dateTimeField59 = chronology51.hourOfDay();
        org.joda.time.DateTimeField dateTimeField60 = chronology51.dayOfWeek();
        java.util.Locale locale61 = java.util.Locale.JAPAN;
        int int62 = dateTimeField60.getMaximumTextLength(locale61);
        java.lang.String str63 = dateTimeZone23.getShortName(63686358271430L, locale61);
        java.lang.String str64 = locale13.getDisplayCountry(locale61);
        java.util.Locale locale65 = java.util.Locale.KOREA;
        boolean boolean66 = locale65.hasExtensions();
        java.lang.String str67 = locale61.getDisplayName(locale65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime52", (dateTime44.compareTo(dateTime52) == 0) == dateTime44.equals(dateTime52));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTime();
        org.joda.time.Instant instant4 = instant0.minus(197L);
        org.joda.time.DateTime dateTime5 = instant4.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime1", (instant0.compareTo(mutableDateTime1) == 0) == instant0.equals(mutableDateTime1));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '#', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 20);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears(3);
        boolean boolean17 = dateTimeZone9.isLocalDateTimeGap(localDateTime16);
        org.joda.time.DateTime dateTime18 = dateTime6.toDateTime(dateTimeZone9);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime18", (dateTime6.compareTo(dateTime18) == 0) == dateTime6.equals(dateTime18));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone12);
        java.lang.String str16 = dateTime9.toString("\u661f\u671f\u4e00");
        org.joda.time.DateTime dateTime18 = dateTime9.minus(299087820000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime14", (dateTime9.compareTo(dateTime14) == 0) == dateTime9.equals(dateTime14));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.length();
        boolean boolean6 = file3.setReadable(false);
        long long7 = file3.getTotalSpace();
        boolean boolean8 = file3.canRead();
        java.io.File file9 = file3.getCanonicalFile();
        boolean boolean10 = file9.mkdir();
        boolean boolean12 = file9.setWritable(true);
        boolean boolean13 = file9.canExecute();
        boolean boolean15 = file9.setWritable(false);
        boolean boolean16 = file9.createNewFile();
        java.io.File[] fileArray17 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap18 = zoneInfoCompiler0.compile(file9, fileArray17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        boolean boolean25 = dateTime21.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        boolean boolean30 = dateTimeZone28.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(dateTimeZone28);
        int int34 = dateTimeZone28.getStandardOffset((long) 1);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.LocalDate localDate36 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        org.joda.time.LocalDate localDate39 = property37.setCopy("100");
        int[] intArray40 = localDate39.getValues();
        org.joda.time.LocalDate localDate42 = localDate39.withDayOfMonth(10);
        org.joda.time.LocalDate.Property property43 = localDate42.era();
        boolean boolean44 = strMap18.remove((java.lang.Object) dateTime35, (java.lang.Object) property43);
        boolean boolean45 = strMap18.isEmpty();
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime47 = instant46.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone48 = strMap18.get((java.lang.Object) dateTime47);
        int int49 = strMap18.size();
        java.util.Set<java.util.Map.Entry<java.lang.String, org.joda.time.DateTimeZone>> strEntrySet50 = strMap18.entrySet();
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler51 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file52 = null;
        java.io.File file54 = new java.io.File(file52, "hi!");
        long long55 = file54.length();
        boolean boolean57 = file54.setReadable(false);
        long long58 = file54.getTotalSpace();
        boolean boolean59 = file54.canRead();
        java.io.File file60 = file54.getCanonicalFile();
        boolean boolean61 = file60.mkdir();
        boolean boolean63 = file60.setWritable(true);
        boolean boolean64 = file60.canExecute();
        boolean boolean66 = file60.setWritable(false);
        boolean boolean67 = file60.createNewFile();
        java.io.File[] fileArray68 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap69 = zoneInfoCompiler51.compile(file60, fileArray68);
        java.util.Set<java.util.Map.Entry<java.lang.String, org.joda.time.DateTimeZone>> strEntrySet70 = strMap69.entrySet();
        org.joda.time.LocalDate localDate71 = org.joda.time.LocalDate.now();
        int int72 = localDate71.getCenturyOfEra();
        org.joda.time.LocalDate localDate74 = localDate71.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate75 = org.joda.time.LocalDate.now();
        int int76 = localDate75.getCenturyOfEra();
        org.joda.time.LocalDate localDate77 = localDate71.withFields((org.joda.time.ReadablePartial) localDate75);
        int int78 = localDate77.getDayOfWeek();
        org.joda.time.LocalDate.Property property79 = localDate77.weekyear();
        boolean boolean80 = strMap69.containsKey((java.lang.Object) localDate77);
        java.util.Set<java.lang.String> strSet81 = strMap69.keySet();
        strMap18.putAll(strMap69);
        strMap18.clear();
        java.util.Collection<org.joda.time.DateTimeZone> dateTimeZoneCollection84 = strMap18.values();
        java.util.Set<java.lang.String> strSet85 = strMap18.keySet();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime32", (dateTime21.compareTo(dateTime32) == 0) == dateTime21.equals(dateTime32));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.weekyear();
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField9, and durationField5", !(durationField5.compareTo(durationField9) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField9.compareTo(durationField5))));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        long long5 = dateTime4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime4.getZone();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.minus(readablePeriod7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        boolean boolean15 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property25 = localTime24.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime28 = localTime24.toDateTimeToday(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        int int31 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime21.toMutableDateTime(dateTimeZone27);
        org.joda.time.Instant instant33 = dateTime21.toInstant();
        org.joda.time.Instant instant35 = instant33.minus(45056L);
        org.joda.time.Chronology chronology36 = instant33.getChronology();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant39 = instant33.withDurationAdded(readableDuration37, (int) (short) 1);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Instant instant41 = instant39.plus(readableDuration40);
        org.joda.time.MutableDateTime mutableDateTime42 = instant41.toMutableDateTime();
        boolean boolean43 = dateTime4.isEqual((org.joda.time.ReadableInstant) instant41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime32", (dateTime21.compareTo(mutableDateTime32) == 0) == dateTime21.equals(mutableDateTime32));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        int int17 = property15.get();
        org.joda.time.DateTime dateTime18 = property15.getDateTime();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(100L, chronology22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZoneRetainFields(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime25.plus((long) 'a');
        org.joda.time.DateTime dateTime31 = dateTime25.plusWeeks(11);
        org.joda.time.DateTime dateTime33 = dateTime31.withMillis((long) 8);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime39 = localTime36.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology40 = localTime39.getChronology();
        org.joda.time.DateTime dateTime41 = dateTime33.toDateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfDay();
        long long46 = chronology40.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime47 = dateTime20.withChronology(chronology40);
        org.joda.time.DateTimeField dateTimeField48 = chronology40.year();
        org.joda.time.DateTime dateTime49 = dateTime18.toDateTime(chronology40);
        org.joda.time.DateTimeZone dateTimeZone50 = dateTime18.getZone();
        int int51 = dateTime18.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = dateTime18.toDateTime(dateTimeZone52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime20", (dateTime2.compareTo(dateTime20) == 0) == dateTime2.equals(dateTime20));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.clockhourOfDay();
        org.joda.time.Chronology chronology37 = chronology32.withUTC();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.dayOfWeek();
        org.joda.time.Chronology chronology39 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.era();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.hourOfDay();
        org.joda.time.DurationField durationField43 = dateTimeField42.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime34", (dateTime12.compareTo(dateTime34) == 0) == dateTime12.equals(dateTime34));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        boolean boolean11 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime7.plusYears((int) (short) 0);
        long long15 = dateTime7.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int17 = dateTime7.get(dateTimeFieldType16);
        org.joda.time.LocalTime.Property property18 = localTime2.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime23.plus((long) 'a');
        org.joda.time.DateTime dateTime29 = dateTime23.plusWeeks(11);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 8);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property35 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime37 = localTime34.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfDay();
        long long44 = chronology38.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DurationField durationField45 = chronology38.weeks();
        org.joda.time.DateTimeField dateTimeField46 = chronology38.hourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType16.getField(chronology38);
        int int50 = dateTimeField48.getLeapAmount((long) 24);
        java.util.Locale.Builder builder52 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder53 = builder52.clear();
        java.util.Locale.Builder builder54 = builder52.clear();
        java.util.Locale locale55 = builder54.build();
        java.lang.String str56 = dateTimeField48.getAsShortText((-253919150L), locale55);
        java.util.Set<java.lang.String> strSet57 = locale55.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime39", (dateTime31.compareTo(dateTime39) == 0) == dateTime31.equals(dateTime39));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.millisOfDay();
        int int8 = localDateTime4.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.addToCopy(27129);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime22.withZone(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withPeriodAdded(readablePeriod28, 197);
        org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks(52);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) '#', dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plus(readablePeriod39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime38.withYearOfEra(56);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(100L, chronology45);
        org.joda.time.DateTime dateTime48 = dateTime46.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology49 = dateTime46.getChronology();
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((long) (byte) 0, chronology49);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime();
        int int53 = localDateTime52.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime52.plus(readablePeriod55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.LocalDateTime.Property property58 = localDateTime56.property(dateTimeFieldType57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime51.property(dateTimeFieldType57);
        boolean boolean60 = localDateTime42.isSupported(dateTimeFieldType57);
        boolean boolean61 = dateTime32.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime63 = localDateTime12.withField(dateTimeFieldType57, 32607240);
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.LocalDateTime localDateTime65 = localDateTime12.minus(readableDuration64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime27", (dateTime22.compareTo(dateTime27) == 0) == dateTime22.equals(dateTime27));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.hourOfHalfday();
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(100L, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, chronology39);
        boolean boolean41 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime37.getDayOfYear();
        org.joda.time.DateTime dateTime45 = dateTime37.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime47 = dateTime37.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property51 = localTime50.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime54 = localTime50.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        int int57 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime47.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateTime34.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(100L, chronology61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(100L, chronology64);
        boolean boolean66 = dateTime62.isAfter((org.joda.time.ReadableInstant) dateTime65);
        int int67 = dateTime62.getDayOfYear();
        org.joda.time.DateTime dateTime69 = dateTime62.plusYears((int) (short) 0);
        long long70 = dateTime62.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int72 = dateTime62.get(dateTimeFieldType71);
        int int73 = dateTime34.get(dateTimeFieldType71);
        org.joda.time.Chronology chronology74 = dateTime34.getChronology();
        org.joda.time.DurationField durationField75 = chronology74.weeks();
        org.joda.time.DateTimeField dateTimeField76 = chronology74.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField77 = chronology74.minuteOfHour();
        long long80 = dateTimeField77.getDifferenceAsLong((long) 54565, 1439L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime34", (dateTime12.compareTo(dateTime34) == 0) == dateTime12.equals(dateTime34));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("0422-02-21");
        java.lang.String str3 = locale2.getDisplayScript();
        java.lang.String str6 = nameProvider0.getName(locale2, "21 Feb 2022 15:02:10 GMT", "21 Feb 2022 15:01:57 GMT");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        boolean boolean15 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime21 = dateTime11.minus((long) (byte) 10);
        int int22 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone23);
        boolean boolean25 = dateTimeZone23.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime11.toMutableDateTime(dateTimeZone23);
        long long29 = dateTimeZone23.convertUTCToLocal((long) (byte) 1);
        java.util.Locale locale31 = java.util.Locale.ROOT;
        java.lang.String str32 = dateTimeZone23.getShortName(63686358113273L, locale31);
        java.util.Locale.Category category34 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale37 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getVariant();
        java.lang.String str40 = locale37.getISO3Language();
        java.util.Locale.setDefault(category34, locale37);
        java.util.Locale locale42 = java.util.Locale.getDefault(category34);
        java.util.Locale locale43 = java.util.Locale.getDefault(category34);
        java.util.Locale locale44 = java.util.Locale.getDefault(category34);
        java.lang.String str45 = dateTimeZone23.getName(299087863808L, locale44);
        java.lang.String str48 = nameProvider0.getShortName(locale44, "21 Oct 2111 15:05:25 GMT", "2013-10-25T15:04:34.445");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime27", (dateTime11.compareTo(mutableDateTime27) == 0) == dateTime11.equals(mutableDateTime27));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime20.plus((long) 'a');
        org.joda.time.DateTime dateTime26 = dateTime20.plusWeeks(11);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 8);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property32 = localTime31.hourOfDay();
        org.joda.time.LocalTime localTime34 = localTime31.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime28.toDateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfDay();
        long long41 = chronology35.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime42 = dateTime15.withChronology(chronology35);
        org.joda.time.DateTimeField dateTimeField43 = chronology35.year();
        org.joda.time.DateTime dateTime44 = dateTime13.toDateTime(chronology35);
        org.joda.time.DateTimeField dateTimeField45 = chronology35.weekyearOfCentury();
        boolean boolean47 = dateTimeField45.isLeap((long) 1645455753);
        org.joda.time.DurationField durationField48 = dateTimeField45.getDurationField();
        boolean boolean50 = dateTimeField45.isLeap((-18574L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTime dateTime5 = dateTime2.plusHours(360000000);
        org.joda.time.DateTime dateTime6 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear((int) (byte) 100);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology17 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology17.add(readablePeriod19, (long) 13, (int) ' ');
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime9, chronology17);
        int int25 = localDateTime24.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property26 = localDateTime24.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime18", (dateTime8.compareTo(dateTime18) == 0) == dateTime8.equals(dateTime18));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DurationField durationField23 = chronology21.halfdays();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology21.add(readablePeriod24, (long) (-18574), (int) (short) 1);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((-12959996399978L), chronology21);
        org.joda.time.DurationField durationField29 = chronology21.weeks();
        org.joda.time.DurationField durationField30 = durationFieldType0.getField(chronology21);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.now(chronology21);
        org.joda.time.DurationField durationField32 = chronology21.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime22", (dateTime14.compareTo(dateTime22) == 0) == dateTime14.equals(dateTime22));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        int int24 = dateTime1.get(dateTimeField23);
        long long26 = dateTimeField23.roundHalfEven((long) 2);
        int int28 = dateTimeField23.getLeapAmount(45056L);
        java.lang.String str30 = dateTimeField23.getAsShortText((long) 3);
        java.util.Locale locale33 = new java.util.Locale("", "hi!");
        int int34 = dateTimeField23.getMaximumShortTextLength(locale33);
        int int36 = dateTimeField23.getMinimumValue(82800004L);
        long long39 = dateTimeField23.set((long) 54, 11);
        boolean boolean40 = dateTimeField23.isLenient();
        java.lang.String str42 = dateTimeField23.getAsShortText(63686422926495L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime22", (dateTime14.compareTo(dateTime22) == 0) == dateTime14.equals(dateTime22));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        int int17 = property15.get();
        java.lang.String str18 = property15.getName();
        int int19 = property15.getMaximumValueOverall();
        org.joda.time.DateTime dateTime20 = property15.getDateTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(100L, chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, chronology25);
        boolean boolean27 = dateTime23.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime29 = dateTime26.minusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusYears(3);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime30.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean36 = localDateTime34.isSupported(dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType35.getField(chronology37);
        int int39 = dateTime26.get(dateTimeFieldType35);
        boolean boolean40 = dateTime20.isSupported(dateTimeFieldType35);
        org.joda.time.Instant instant41 = dateTime20.toInstant();
        org.joda.time.Instant instant43 = instant41.minus((long) 5);
        org.joda.time.MutableDateTime mutableDateTime44 = instant43.toMutableDateTimeISO();
        org.joda.time.Instant instant46 = instant43.withMillis((long) (-3600000));
        org.joda.time.MutableDateTime mutableDateTime47 = instant46.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant41", (dateTime12.compareTo(instant41) == 0) == dateTime12.equals(instant41));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime1.plus(readablePeriod5);
        int int7 = localTime6.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        boolean boolean15 = dateTime11.isAfter((org.joda.time.ReadableInstant) dateTime14);
        int int16 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime11.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime21 = dateTime19.plusSeconds(1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(100L, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime24.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime26.plus((long) 'a');
        org.joda.time.DateTime dateTime32 = dateTime26.plusWeeks(11);
        org.joda.time.DateTime dateTime34 = dateTime32.withMillis((long) 8);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property38 = localTime37.hourOfDay();
        org.joda.time.LocalTime localTime40 = localTime37.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology41 = localTime40.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime34.toDateTime(chronology41);
        org.joda.time.DateTime dateTime43 = dateTime21.withChronology(chronology41);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.monthOfYear();
        boolean boolean45 = durationFieldType8.isSupported(chronology41);
        boolean boolean46 = localTime6.isSupported(durationFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean48 = localTime6.isSupported(dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.yearOfCentury();
        java.lang.String str51 = dateTimeField50.getName();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime43", (dateTime21.compareTo(dateTime43) == 0) == dateTime21.equals(dateTime43));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime12.toMutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant24 = dateTime12.toInstant();
        org.joda.time.Instant instant27 = instant24.withDurationAdded((long) (byte) 100, 1970);
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(100L, chronology30);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int35 = dateTime33.get(dateTimeFieldType34);
        boolean boolean36 = dateTime28.isSupported(dateTimeFieldType34);
        java.lang.String str37 = dateTimeFieldType34.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime23", (dateTime12.compareTo(mutableDateTime23) == 0) == dateTime12.equals(mutableDateTime23));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 8);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime15.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.halfdays();
        org.joda.time.DurationField durationField22 = chronology19.years();
        org.joda.time.DurationField durationField23 = chronology19.millis();
        org.joda.time.DurationField durationField24 = chronology19.centuries();
        org.joda.time.DurationField durationField25 = chronology19.minutes();
        org.joda.time.Chronology chronology26 = chronology19.withUTC();
        org.joda.time.DurationField durationField27 = chronology19.years();
        org.joda.time.DateTimeField dateTimeField28 = chronology19.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime20", (dateTime12.compareTo(dateTime20) == 0) == dateTime12.equals(dateTime20));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime25 = dateTime21.withWeekyear(11);
        java.lang.Object obj26 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, chronology28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(100L, chronology31);
        boolean boolean33 = dateTime29.isAfter((org.joda.time.ReadableInstant) dateTime32);
        int int34 = dateTime29.getDayOfYear();
        org.joda.time.DateTime dateTime36 = dateTime29.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property37 = dateTime29.year();
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.DateTime dateTime40 = property37.addToCopy(3);
        org.joda.time.DateTime dateTime42 = dateTime40.withYear(12);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = dateTime40.withZoneRetainFields(dateTimeZone43);
        java.lang.String str45 = dateTimeZone43.getID();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(obj26, dateTimeZone43);
        java.lang.String str47 = dateTimeZone43.toString();
        org.joda.time.DateTime dateTime48 = dateTime21.withZone(dateTimeZone43);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.now(dateTimeZone43);
        java.lang.String str51 = dateTimeZone43.getNameKey((long) 126000000);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone43);
        boolean boolean53 = dateTime52.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime48", (dateTime2.compareTo(dateTime48) == 0) == dateTime2.equals(dateTime48));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.weekyear();
        long long40 = dateTimeField38.roundCeiling((long) 32400000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime34", (dateTime12.compareTo(dateTime34) == 0) == dateTime12.equals(dateTime34));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        java.util.Locale locale3 = java.util.Locale.FRANCE;
        java.lang.String str4 = dateTime1.toString("4", locale3);
        int int5 = dateTime1.getYearOfCentury();
        org.joda.time.Instant instant6 = dateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime8 = instant6.toDateTime();
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime dateTime11 = dateTime8.withMillisOfDay(16852);
        int int12 = dateTime11.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime7", (dateTime1.compareTo(mutableDateTime7) == 0) == dateTime1.equals(mutableDateTime7));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale.Builder builder7 = builder5.setVariant("Chinese");
        java.util.Locale locale8 = builder5.build();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.withZoneRetainFields(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime15.plus((long) 'a');
        org.joda.time.DateTime dateTime21 = dateTime15.plusWeeks(11);
        org.joda.time.DateTime dateTime23 = dateTime21.withMillis((long) 8);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property27 = localTime26.hourOfDay();
        org.joda.time.LocalTime localTime29 = localTime26.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime23.toDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        int int33 = dateTime10.get(dateTimeField32);
        long long35 = dateTimeField32.roundHalfEven((long) 2);
        int int37 = dateTimeField32.getLeapAmount(45056L);
        java.lang.String str39 = dateTimeField32.getAsShortText((long) 3);
        java.util.Locale locale42 = new java.util.Locale("", "hi!");
        int int43 = dateTimeField32.getMaximumShortTextLength(locale42);
        java.lang.String str44 = locale42.getDisplayName();
        java.lang.String str45 = locale42.getVariant();
        java.util.Locale locale46 = locale42.stripExtensions();
        java.lang.String str47 = locale8.getDisplayName(locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime31", (dateTime23.compareTo(dateTime31) == 0) == dateTime23.equals(dateTime31));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        java.util.Locale locale15 = null;
        java.util.Calendar calendar16 = dateTime14.toCalendar(locale15);
        calendar16.clear(9);
        int int20 = calendar16.getGreatestMinimum((int) (short) 0);
        calendar16.setLenient(false);
        calendar16.set(10, 8, 5, 20, 100);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("hi!");
        calendar16.setTimeZone(timeZone30);
        java.util.Locale locale32 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet33 = locale32.getUnicodeLocaleKeys();
        java.util.Locale locale34 = java.util.Locale.PRC;
        java.lang.String str35 = locale32.getDisplayCountry(locale34);
        java.lang.String str36 = locale32.getDisplayName();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone30, locale32);
        boolean boolean38 = calendar4.after((java.lang.Object) timeZone30);
        java.util.Locale.Category category39 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale42 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleKeys();
        java.lang.String str44 = locale42.getVariant();
        java.lang.String str45 = locale42.getISO3Language();
        java.util.Locale.setDefault(category39, locale42);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(100L, chronology48);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(100L, chronology51);
        boolean boolean53 = dateTime49.isAfter((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime55 = dateTime52.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime57 = org.joda.time.DateTime.now(dateTimeZone56);
        boolean boolean58 = dateTimeZone56.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        org.joda.time.DateTime dateTime60 = dateTime52.toDateTime(dateTimeZone56);
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.lang.String str63 = locale62.getISO3Country();
        java.lang.String str64 = dateTimeZone56.getShortName((long) 15, locale62);
        java.util.Locale.setDefault(category39, locale62);
        java.lang.String str67 = locale62.getExtension('u');
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(timeZone30, locale62);
        boolean boolean69 = locale62.hasExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar68", (calendar37.compareTo(calendar68) == 0) == calendar37.equals(calendar68));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        java.util.Locale locale6 = new java.util.Locale("dayOfWeek", "1970-01-01", "1970");
        java.util.Locale.Builder builder7 = new java.util.Locale.Builder();
        java.util.Locale locale8 = builder7.build();
        java.lang.String str9 = locale6.getDisplayCountry(locale8);
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone1, locale6);
        java.util.Locale locale11 = locale6.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar2 and calendar10", (calendar2.compareTo(calendar10) == 0) == calendar2.equals(calendar10));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfHour();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.era();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = chronology5.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        boolean boolean18 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        boolean boolean23 = dateTimeZone21.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime25 = dateTime17.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = dateTime11.toDateTime(dateTimeZone21);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfWeek();
        org.joda.time.DateTime.Property property28 = dateTime26.secondOfMinute();
        int int29 = dateTime26.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime25", (dateTime2.compareTo(dateTime25) == 0) == dateTime2.equals(dateTime25));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear(24);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, chronology19);
        boolean boolean21 = dateTime17.isAfter((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime17.getDayOfYear();
        org.joda.time.DateTime dateTime25 = dateTime17.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime27 = dateTime17.minus((long) (byte) 10);
        int int28 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        boolean boolean31 = dateTimeZone29.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime17.toMutableDateTime(dateTimeZone29);
        long long35 = dateTimeZone29.convertUTCToLocal((long) (byte) 1);
        java.util.Locale locale37 = java.util.Locale.ROOT;
        java.lang.String str38 = dateTimeZone29.getShortName(63686358113273L, locale37);
        java.util.Set<java.lang.String> strSet39 = locale37.getUnicodeLocaleKeys();
        java.util.Calendar calendar40 = dateTime14.toCalendar(locale37);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(100L, chronology42);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(100L, chronology45);
        boolean boolean47 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime46);
        int int48 = dateTime43.getDayOfYear();
        org.joda.time.DateTime dateTime51 = dateTime43.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime53 = dateTime51.plusSeconds(1);
        java.util.GregorianCalendar gregorianCalendar54 = dateTime53.toGregorianCalendar();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar54);
        boolean boolean56 = dateTime14.equals((java.lang.Object) gregorianCalendar54);
        int int57 = dateTime14.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime33", (dateTime2.compareTo(mutableDateTime33) == 0) == dateTime2.equals(mutableDateTime33));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone20);
        int int22 = dateTimeZone18.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime12.toMutableDateTime(dateTimeZone18);
        org.joda.time.Instant instant24 = dateTime12.toInstant();
        org.joda.time.Instant instant27 = instant24.withDurationAdded((long) (byte) 100, 1970);
        org.joda.time.DateTime dateTime28 = instant27.toDateTime();
        org.joda.time.DateTime dateTime29 = instant27.toDateTime();
        org.joda.time.Instant instant31 = instant27.minus((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime32 = instant27.toMutableDateTimeISO();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(100L, chronology34);
        int int36 = dateTime35.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.toDateTime(dateTimeZone37);
        java.util.Locale locale41 = new java.util.Locale("", "hi!");
        java.util.Locale locale44 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.lang.String str46 = locale44.getVariant();
        java.lang.String str47 = locale41.getDisplayScript(locale44);
        java.util.Calendar calendar48 = dateTime38.toCalendar(locale41);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(100L, chronology50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.withZoneRetainFields(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime53.plus((long) 'a');
        org.joda.time.DateTime dateTime59 = dateTime53.plusWeeks(11);
        org.joda.time.DateTime dateTime61 = dateTime59.withMillis((long) 8);
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property65 = localTime64.hourOfDay();
        org.joda.time.LocalTime localTime67 = localTime64.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology68 = localTime67.getChronology();
        org.joda.time.DateTime dateTime69 = dateTime61.toDateTime(chronology68);
        org.joda.time.DurationField durationField70 = chronology68.eras();
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property74 = localTime73.hourOfDay();
        org.joda.time.LocalTime localTime75 = property74.withMinimumValue();
        int int76 = localTime75.getHourOfDay();
        long long78 = chronology68.set((org.joda.time.ReadablePartial) localTime75, 364740218880L);
        org.joda.time.DateTimeField dateTimeField79 = chronology68.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField80 = chronology68.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField81 = chronology68.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField82 = chronology68.year();
        org.joda.time.DateTime dateTime83 = dateTime38.withChronology(chronology68);
        org.joda.time.DateTime dateTime84 = new org.joda.time.DateTime((java.lang.Object) instant27, chronology68);
        org.joda.time.DateTimeField dateTimeField85 = chronology68.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField86 = chronology68.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime83", (dateTime2.compareTo(dateTime83) == 0) == dateTime2.equals(dateTime83));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, chronology11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        boolean boolean16 = dateTime12.isAfter((org.joda.time.ReadableInstant) dateTime15);
        int int17 = dateTime12.getDayOfYear();
        org.joda.time.DateTime dateTime20 = dateTime12.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime22 = dateTime20.plusSeconds(1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(100L, chronology24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime27.plus((long) 'a');
        org.joda.time.DateTime dateTime33 = dateTime27.plusWeeks(11);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillis((long) 8);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property39 = localTime38.hourOfDay();
        org.joda.time.LocalTime localTime41 = localTime38.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime(chronology42);
        org.joda.time.DateTime dateTime44 = dateTime22.withChronology(chronology42);
        boolean boolean45 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = dateTime8.withEra(0);
        org.joda.time.DateTime dateTime49 = dateTime47.withWeekyear(725613);
        org.joda.time.DateTime dateTime51 = dateTime47.minusDays((int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime44", (dateTime22.compareTo(dateTime44) == 0) == dateTime22.equals(dateTime44));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 100, 2, 11, 4, (int) (short) 0, (int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime6.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusMinutes(15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusWeeks((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime8.withFields((org.joda.time.ReadablePartial) localDateTime17);
        int int19 = dateTime8.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime21 = dateTime8.minusMillis(1645455734);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime21.withField(dateTimeFieldType22, 17);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(100L, chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology30 = dateTime27.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(100L, chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime35.plus((long) 'a');
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = dateTime40.toDateTime(chronology41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime44 = org.joda.time.DateTime.now(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime40.withZone(dateTimeZone43);
        boolean boolean46 = dateTime27.isEqual((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean47 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime49 = dateTime45.plusMillis(13);
        org.joda.time.DateTime.Property property50 = dateTime49.millisOfDay();
        org.joda.time.DateTime dateTime52 = property50.addToCopy(1645455817L);
        org.joda.time.DateTime dateTime54 = property50.addToCopy(2170);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and dateTime45", (dateTime40.compareTo(dateTime45) == 0) == dateTime40.equals(dateTime45));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusMonths(0);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1645455718, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField11, and durationField8", !(durationField8.compareTo(durationField11) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField11.compareTo(durationField8))));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology32.hourOfHalfday();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField40 = chronology32.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime34", (dateTime12.compareTo(dateTime34) == 0) == dateTime12.equals(dateTime34));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        boolean boolean18 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime14.getDayOfYear();
        int int20 = dateTime14.getSecondOfMinute();
        java.util.GregorianCalendar gregorianCalendar21 = dateTime14.toGregorianCalendar();
        org.joda.time.Chronology chronology22 = dateTime14.getChronology();
        boolean boolean23 = calendar4.after((java.lang.Object) chronology22);
        java.lang.String str24 = calendar4.getCalendarType();
        calendar4.set((-1), 32770, 360000000, (int) (byte) 10, (int) (short) 100, 844);
        java.util.Date date32 = calendar4.getTime();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfDay(10);
        java.util.Date date36 = localDateTime33.toDate();
        int int37 = date36.getDay();
        boolean boolean38 = date32.after(date36);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(100L, chronology40);
        java.util.Locale locale42 = null;
        java.util.Calendar calendar43 = dateTime41.toCalendar(locale42);
        calendar43.clear(9);
        int int47 = calendar43.getGreatestMinimum((int) (short) 0);
        calendar43.setLenient(false);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        int int51 = timeZone50.getRawOffset();
        java.util.TimeZone timeZone52 = java.util.TimeZone.getDefault();
        int int53 = timeZone52.getRawOffset();
        boolean boolean54 = timeZone50.hasSameRules(timeZone52);
        calendar43.setTimeZone(timeZone50);
        java.util.Date date56 = calendar43.getTime();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withMillisOfDay(10);
        java.util.Date date60 = localDateTime57.toDate();
        int int61 = date60.getDay();
        java.time.Instant instant62 = date60.toInstant();
        boolean boolean63 = date56.after(date60);
        boolean boolean64 = date36.after(date60);
        int int65 = date60.getMonth();
        int int66 = date60.getMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar21 and calendar43", (gregorianCalendar21.compareTo(calendar43) == 0) == gregorianCalendar21.equals(calendar43));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone9);
        java.lang.String str16 = dateTimeZone9.getName((long) 173);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }
}

