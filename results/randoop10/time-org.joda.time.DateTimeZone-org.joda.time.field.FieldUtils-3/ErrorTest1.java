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
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        long long3 = dateTime2.getMillis();
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone7 = provider5.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(0L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone7);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(15);
        org.joda.time.DateTime dateTime10 = dateTime6.minusHours(21);
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        org.joda.time.Instant instant13 = instant11.plus(8640000000L);
        org.joda.time.Instant instant16 = instant11.withDurationAdded(0L, 53705);
        java.lang.String str17 = instant16.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant16", (dateTime6.compareTo(instant16) == 0) == dateTime6.equals(instant16));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.DateTime dateTime5 = dateTime1.minusMillis(53626975);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) dateTime5);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra(12);
        org.joda.time.LocalTime localTime12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTime(localTime12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        java.lang.String str18 = dateTimeZone15.getShortName((long) 5);
        boolean boolean19 = localDate11.equals((java.lang.Object) str18);
        org.joda.time.LocalDate.Property property20 = localDate11.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate11.withCenturyOfEra((int) 'a');
        org.joda.time.tz.Provider provider23 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone25 = provider23.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDate11.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.LocalDate.Property property28 = localDate11.year();
        boolean boolean29 = localDate6.isAfter((org.joda.time.ReadablePartial) localDate11);
        int int30 = localDate6.getDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone7 = provider5.getZone("Etc/UTC");
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime1.toMutableDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMillis((int) (byte) 10);
        boolean boolean14 = dateTimeZone7.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime8", (dateTime1.compareTo(mutableDateTime8) == 0) == dateTime1.equals(mutableDateTime8));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.minus(readableDuration8);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant9", (dateTime1.compareTo(instant9) == 0) == dateTime1.equals(instant9));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        org.joda.time.DateTime dateTime13 = dateTime7.minusMinutes((-1));
        long long14 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime17 = dateTime13.withDurationAdded((long) 53627827, 21);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra(2);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology23.add(readablePeriod24, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.minuteOfHour();
        org.joda.time.DurationField durationField29 = durationFieldType18.getField(chronology23);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.Chronology chronology32 = chronology23.withZone(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime13.toDateTime(chronology32);
        int int34 = dateTime33.getWeekOfWeekyear();
        org.joda.time.Instant instant35 = dateTime33.toInstant();
        org.joda.time.Instant instant37 = instant35.minus((long) 54005080);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime33", (dateTime13.compareTo(dateTime33) == 0) == dateTime13.equals(dateTime33));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        boolean boolean15 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean16 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime6);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = dateTime6.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime21.withCenturyOfEra((int) ' ');
        boolean boolean26 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime21);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        int int32 = dateTimeZone29.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 0, dateTimeZone29);
        int int34 = localTime33.size();
        org.joda.time.Chronology chronology35 = localTime33.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        int int39 = dateTime38.getEra();
        org.joda.time.DateTime.Property property40 = dateTime38.secondOfMinute();
        java.lang.String str41 = property40.getAsString();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        long long44 = dateTimeField42.remainder((long) 53650);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getEra();
        org.joda.time.DateTime dateTime52 = localTime48.toDateTime((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.LocalTime localTime54 = localTime48.plusMillis((-1));
        org.joda.time.LocalTime.Property property55 = localTime54.millisOfSecond();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("Fri Feb 08 23:01:00 GMT+00:00 1901");
        int int58 = property55.getMaximumShortTextLength(locale57);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("46");
        java.lang.String str61 = locale57.getDisplayName(locale60);
        java.lang.String str62 = dateTimeField42.getAsShortText((-2174086740000L), locale57);
        int int63 = dateTime36.get(dateTimeField42);
        org.joda.time.DurationField durationField64 = dateTimeField42.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:52.912Z");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale3.getDisplayName();
        java.util.Locale locale6 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str7 = locale3.getDisplayLanguage(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone1, locale3);
        timeZone1.setRawOffset(985);
        java.util.Locale.Builder builder11 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder12 = builder11.clear();
        java.util.Locale.Builder builder13 = builder12.clear();
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder15 = builder12.setLocale(locale14);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        timeZone18.setID("+00:00");
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18, locale21);
        java.util.Locale.Builder builder23 = builder12.setLocale(locale21);
        java.util.Locale.Builder builder24 = builder23.clearExtensions();
        java.util.Locale locale25 = builder24.build();
        java.lang.String str26 = timeZone1.getDisplayName(locale25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar8 and calendar22", (calendar8.compareTo(calendar22) == 0) == calendar8.equals(calendar22));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(15);
        org.joda.time.DateTime dateTime10 = dateTime6.minusHours(21);
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        org.joda.time.Instant instant13 = instant11.plus(8640000000L);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant11.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.plus(readableDuration16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant17", (dateTime6.compareTo(instant17) == 0) == dateTime6.equals(instant17));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(15);
        org.joda.time.DateTime dateTime10 = dateTime6.minusHours(21);
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = instant11.getZone();
        long long16 = dateTimeZone13.convertLocalToUTC((long) 53895, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant11", (dateTime6.compareTo(instant11) == 0) == dateTime6.equals(instant11));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        timeZone10.setID("+00:00");
        timeZone10.setRawOffset(2);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        timeZone17.setID("+00:00");
        boolean boolean20 = timeZone10.hasSameRules(timeZone17);
        java.util.Locale locale21 = java.util.Locale.CHINESE;
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale21);
        java.lang.String str23 = locale21.getLanguage();
        java.lang.String str24 = locale21.getDisplayLanguage();
        java.lang.String str25 = locale21.getCountry();
        java.util.Calendar calendar26 = dateTime7.toCalendar(locale21);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime7.withDurationAdded(readableDuration27, 53689699);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate32 = localDate30.withDayOfYear((int) (byte) 100);
        int int33 = localDate30.getDayOfWeek();
        org.joda.time.LocalDate localDate35 = localDate30.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate37 = localDate30.minusWeeks(12);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDate localDate39 = localDate30.minus(readablePeriod38);
        org.joda.time.LocalDate localDate41 = localDate39.plusMonths(101);
        org.joda.time.DateTime dateTime42 = localDate39.toDateTimeAtMidnight();
        java.lang.String str43 = dateTime42.toString();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.plus(readableDuration44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfEra();
        int int47 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        int int50 = dateTime49.getEra();
        org.joda.time.DateTime.Property property51 = dateTime49.secondOfMinute();
        long long52 = property51.remainder();
        org.joda.time.DateTime dateTime54 = property51.setCopy("47");
        org.joda.time.DateTime dateTime55 = property51.getDateTime();
        org.joda.time.DateTime.Property property56 = dateTime55.hourOfDay();
        org.joda.time.DateTime dateTime58 = dateTime55.minusMillis(605139);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime60 = dateTime58.plus(readablePeriod59);
        org.joda.time.Chronology chronology61 = dateTime58.getChronology();
        org.joda.time.DateTime dateTime62 = dateTime7.toDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime62.minus(1645455582000L);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology65);
        int int67 = dateTime66.getEra();
        int int68 = dateTime66.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.DateTime dateTime70 = dateTime66.plus(readableDuration69);
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.DateTime dateTime73 = dateTime70.withDurationAdded(readableDuration71, 53626975);
        org.joda.time.DateTime dateTime76 = dateTime70.withDurationAdded((long) 2922789, (int) (short) 100);
        org.joda.time.DateTime dateTime78 = dateTime76.minusYears(70);
        org.joda.time.DateTime dateTime80 = dateTime78.minusDays(53851);
        boolean boolean81 = dateTime62.isBefore((org.joda.time.ReadableInstant) dateTime80);
        org.joda.time.LocalDateTime localDateTime83 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.millisOfDay();
        org.joda.time.LocalDateTime.Property property85 = localDateTime83.weekOfWeekyear();
        java.lang.Object obj86 = null;
        boolean boolean87 = localDateTime83.equals(obj86);
        int int88 = localDateTime83.getMillisOfSecond();
        java.util.Calendar calendar89 = java.util.Calendar.getInstance();
        boolean boolean90 = calendar89.isWeekDateSupported();
        int int92 = calendar89.getActualMinimum(15);
        calendar89.setLenient(true);
        boolean boolean95 = localDateTime83.equals((java.lang.Object) calendar89);
        org.joda.time.DateTimeFieldType dateTimeFieldType96 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int97 = localDateTime83.get(dateTimeFieldType96);
        org.joda.time.DurationFieldType durationFieldType98 = dateTimeFieldType96.getRangeDurationType();
        boolean boolean99 = dateTime80.isSupported(dateTimeFieldType96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar22 and calendar89", (calendar22.compareTo(calendar89) == 0) == calendar22.equals(calendar89));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(2);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology5.add(readablePeriod6, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj0, chronology5);
        org.joda.time.DurationField durationField13 = chronology5.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField13, and durationField11", !(durationField11.compareTo(durationField13) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField13.compareTo(durationField11))));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(53625);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(56L);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 53914);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getEra();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfMinute();
        org.joda.time.DateTime dateTime7 = property5.addWrapFieldToCopy(53629404);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        boolean boolean15 = durationFieldType8.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withPeriodAdded(readablePeriod21, 53625);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.year();
        org.joda.time.LocalDateTime localDateTime26 = property24.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime27 = property24.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withMillisOfSecond(11);
        int[] intArray31 = chronology13.get((org.joda.time.ReadablePartial) localDateTime29, (long) 53642476);
        org.joda.time.DurationField durationField32 = chronology13.weeks();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology13);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        java.lang.String str36 = dateTimeZone35.toString();
        java.lang.String str38 = dateTimeZone35.getShortName((long) 32772);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime40 = dateTime33.toDateTime(dateTimeZone35);
        int int41 = dateTime33.getYearOfCentury();
        boolean boolean42 = dateTime7.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime dateTime44 = dateTime33.minusMinutes(654);
        org.joda.time.DateTime dateTime45 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime33", (dateTime3.compareTo(dateTime33) == 0) == dateTime3.equals(dateTime33));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfWeek();
        long long17 = dateTimeField14.add(0L, (long) 147210);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime19.toMutableDateTimeISO();
        org.joda.time.tz.Provider provider23 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone25 = provider23.getZone("Etc/UTC");
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime19.toMutableDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.plusMillis((int) (byte) 10);
        boolean boolean32 = dateTimeZone25.isLocalDateTimeGap(localDateTime31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withMinuteOfHour(52);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusMillis((int) (byte) -1);
        int int37 = localDateTime36.getEra();
        java.util.Locale locale39 = java.util.Locale.forLanguageTag("29.11.1909 00:00:00");
        java.lang.String str40 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, locale39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.LocalDate.Property property3 = localDate2.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDate localDate5 = localDate2.minus(readablePeriod4);
        int int6 = localDate2.getCenturyOfEra();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime8.toMutableDateTimeISO();
        int int12 = dateTime8.getMillisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.minusYears(12);
        boolean boolean19 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate22 = localDate20.withDayOfYear((int) (byte) 100);
        int int23 = localDate20.getDayOfWeek();
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.lang.String str26 = dateTimeZone25.toString();
        int int28 = dateTimeZone25.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime29 = localDate20.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.DateTime dateTime30 = dateTime8.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime32 = dateTime8.minusDays(0);
        org.joda.time.Instant instant33 = new org.joda.time.Instant((java.lang.Object) dateTime8);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getEra();
        org.joda.time.DateTime.Property property37 = dateTime35.secondOfMinute();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate40 = localDate38.withDayOfYear((int) (byte) 100);
        int int41 = localDate38.getDayOfWeek();
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.lang.String str44 = dateTimeZone43.toString();
        int int46 = dateTimeZone43.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime47 = localDate38.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime35.toMutableDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime49 = instant33.toDateTime(dateTimeZone43);
        org.joda.time.DateMidnight dateMidnight50 = localDate2.toDateMidnight(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant33", (dateTime8.compareTo(instant33) == 0) == dateTime8.equals(instant33));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = instant3.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = dateTime18.toLocalTime();
        int int22 = dateTime18.getWeekyear();
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.Instant instant25 = instant23.minus((long) 53691674);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant25.plus(readableDuration26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone2 = provider0.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getYearOfEra();
        java.lang.Object obj5 = null;
        org.joda.time.tz.Provider provider6 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone8 = provider6.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj5, dateTimeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime3.withZoneRetainFields(dateTimeZone8);
        org.joda.time.DateTime dateTime12 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property13 = dateTime3.dayOfWeek();
        int int14 = dateTime3.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withYear((int) '#');
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        int int24 = localDateTime23.getDayOfYear();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime3.withChronology(chronology25);
        org.joda.time.Chronology chronology27 = chronology25.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(5097600032L);
        org.joda.time.DateTime dateTime3 = dateTime1.withSecondOfMinute(30);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis(53754);
        org.joda.time.DateTime dateTime7 = dateTime3.plusSeconds(53722089);
        org.joda.time.DateTime.Property property8 = dateTime3.millisOfSecond();
        org.joda.time.Chronology chronology9 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        boolean boolean13 = calendar12.isWeekDateSupported();
        int int15 = calendar12.getActualMinimum(15);
        calendar12.clear();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withPeriodAdded(readablePeriod22, 53625);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.lang.String str27 = dateTimeZone26.toString();
        java.lang.String str29 = dateTimeZone26.getShortName((long) 32772);
        long long32 = dateTimeZone26.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod22, dateTimeZone26);
        boolean boolean34 = localDateTime17.isAfter((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.dayOfYear();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withMillisOfDay(53698730);
        int[] intArray40 = chronology9.get((org.joda.time.ReadablePartial) localDateTime38, 220L);
        org.joda.time.DurationField durationField41 = chronology9.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField41, and durationField11", !(durationField11.compareTo(durationField41) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField41.compareTo(durationField11))));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        long long18 = chronology13.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology13);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int27 = dateTime25.get(dateTimeFieldType26);
        boolean boolean28 = localDateTime22.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime22.plusYears((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean32 = localDateTime22.isSupported(dateTimeFieldType31);
        int int33 = dateTime7.get(dateTimeFieldType31);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType31.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime20", (dateTime7.compareTo(dateTime20) == 0) == dateTime7.equals(dateTime20));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        boolean boolean28 = instant26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = instant26.toDateTimeISO();
        org.joda.time.Instant instant31 = instant26.withMillis(3600000L);
        org.joda.time.Instant instant34 = instant26.withDurationAdded(0L, 576);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant26.plus(readableDuration35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant36", (dateTime1.compareTo(instant36) == 0) == dateTime1.equals(instant36));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.Instant instant11 = instant0.minus((long) 21);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime2", (instant13.compareTo(dateTime2) == 0) == instant13.equals(dateTime2));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(53633931);
        org.joda.time.DateTime.Property property8 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfSecond(13);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(53633931);
        org.joda.time.TimeOfDay timeOfDay21 = dateTime20.toTimeOfDay();
        org.joda.time.Instant instant22 = dateTime20.toInstant();
        long long23 = instant22.getMillis();
        boolean boolean24 = dateTime12.isBefore((org.joda.time.ReadableInstant) instant22);
        org.joda.time.Instant instant26 = instant22.plus(1645455653469L);
        org.joda.time.DateTime dateTime27 = instant26.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant22", (dateTime7.compareTo(instant22) == 0) == dateTime7.equals(instant22));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTimeAtStartOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime4", (instant7.compareTo(dateTime4) == 0) == instant7.equals(dateTime4));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DurationField durationField24 = chronology5.weeks();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology5);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName((long) 32772);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology33 = dateTime25.getChronology();
        long long37 = chronology33.add((long) 2169, (long) 54119, 814);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime31", (dateTime25.compareTo(dateTime31) == 0) == dateTime25.equals(dateTime31));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:52.912Z");
        java.lang.String str2 = timeZone1.getID();
        timeZone1.setRawOffset(0);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        boolean boolean24 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean25 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime15);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = dateTime15.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.tz.NameProvider nameProvider31 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        timeZone35.setID("+00:00");
        timeZone35.setRawOffset(2);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        timeZone42.setID("+00:00");
        boolean boolean45 = timeZone35.hasSameRules(timeZone42);
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone35, locale46);
        java.lang.String str48 = locale46.getLanguage();
        java.lang.String str51 = nameProvider31.getName(locale46, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.lang.String str54 = locale53.getISO3Country();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.lang.String str56 = locale53.getScript();
        java.lang.String str58 = locale53.getUnicodeLocaleType("57");
        java.lang.String str61 = nameProvider31.getShortName(locale53, "49", "GMT");
        java.lang.String str62 = dateTimeZone27.getShortName((long) 32770, locale53);
        java.lang.String str63 = locale5.getDisplayCountry(locale53);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone1, locale5);
        java.util.TimeZone.setDefault(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar64", (calendar47.compareTo(calendar64) == 0) == calendar47.equals(calendar64));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        int int7 = localDate5.getWeekOfWeekyear();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) 53762);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant14.withDurationAdded(readableDuration15, 53868);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.Instant instant9 = instant7.minus((long) 53629878);
        org.joda.time.Instant instant11 = instant7.withMillis(5L);
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property4 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant7.withDurationAdded(readableDuration8, 1970);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        int int12 = property4.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTimeISO();
        int int18 = dateTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        int int22 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.minusYears(12);
        boolean boolean25 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = dateTime24.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property28 = dateTime27.minuteOfHour();
        org.joda.time.DateTime dateTime29 = property28.roundCeilingCopy();
        org.joda.time.DateTime dateTime30 = property28.withMaximumValue();
        org.joda.time.DateTime dateTime31 = property28.getDateTime();
        int int32 = property4.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime11", (instant7.compareTo(dateTime11) == 0) == instant7.equals(dateTime11));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        int int7 = localDate5.getWeekOfWeekyear();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) 53762);
        org.joda.time.Instant instant16 = instant12.plus((long) 53675);
        org.joda.time.Instant instant19 = instant12.withDurationAdded(1645455367000L, 53749);
        org.joda.time.MutableDateTime mutableDateTime20 = instant19.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.Instant instant27 = instant26.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant30 = instant26.withDurationAdded(readableDuration28, (-946258560));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant30", (dateTime1.compareTo(instant30) == 0) == dateTime1.equals(instant30));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Chronology chronology8 = instant0.getChronology();
        org.joda.time.Instant instant10 = instant0.plus((long) 53652018);
        org.joda.time.MutableDateTime mutableDateTime11 = instant0.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.plus(readableDuration12);
        org.joda.time.Instant instant16 = instant13.withDurationAdded((long) 53958055, 53962065);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime2", (instant13.compareTo(dateTime2) == 0) == instant13.equals(dateTime2));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.Instant instant11 = instant0.minus((long) 21);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime dateTime18 = localTime14.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 53629878);
        org.joda.time.DateTime dateTime22 = instant19.toDateTime();
        int int23 = instant0.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.DateTime dateTime24 = instant0.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant19", (dateTime2.compareTo(instant19) == 0) == dateTime2.equals(instant19));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        int int7 = localDate4.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime8.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant9", (dateTime6.compareTo(instant9) == 0) == dateTime6.equals(instant9));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(53634);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone13);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) 54, locale20);
        org.joda.time.DateTime dateTime22 = dateTime7.withZoneRetainFields(dateTimeZone13);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        java.util.TimeZone timeZone26 = dateTimeZone25.toTimeZone();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-61779834366119L), dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        boolean boolean30 = dateTimeZone28.isStandardOffset((long) 53642);
        org.joda.time.DateMidnight dateMidnight31 = localDate27.toDateMidnight(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime34 = dateTime32.minus((long) 53630);
        int int35 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime32", (dateTime1.compareTo(dateTime32) == 0) == dateTime1.equals(dateTime32));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property5 = dateTime3.property(dateTimeFieldType4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.minus(readablePeriod6);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        org.joda.time.TimeOfDay timeOfDay9 = dateTime3.toTimeOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfHour();
        org.joda.time.DateTime dateTime16 = property15.roundCeilingCopy();
        org.joda.time.DateTime dateTime17 = property15.withMaximumValue();
        org.joda.time.DateTime dateTime19 = property15.addWrapFieldToCopy(53627827);
        org.joda.time.DateTime dateTime20 = property15.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        long long25 = dateTimeZone21.convertLocalToUTC((long) 53689, true, (long) (byte) 1);
        java.util.TimeZone timeZone26 = dateTimeZone21.toTimeZone();
        org.joda.time.tz.NameProvider nameProvider27 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        timeZone31.setID("+00:00");
        timeZone31.setRawOffset(2);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        java.util.TimeZone timeZone38 = dateTimeZone37.toTimeZone();
        timeZone38.setID("+00:00");
        boolean boolean41 = timeZone31.hasSameRules(timeZone38);
        java.util.Locale locale42 = java.util.Locale.CHINESE;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone31, locale42);
        java.lang.String str44 = locale42.getLanguage();
        java.lang.String str47 = nameProvider27.getName(locale42, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale49 = new java.util.Locale("hi!");
        java.lang.String str50 = locale49.getISO3Country();
        java.util.Locale locale51 = locale49.stripExtensions();
        java.lang.String str52 = locale49.getScript();
        java.lang.String str54 = locale49.getUnicodeLocaleType("57");
        java.lang.String str57 = nameProvider27.getShortName(locale49, "49", "GMT");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.withCenturyOfEra(2);
        org.joda.time.Chronology chronology63 = dateTime62.getChronology();
        org.joda.time.DateTime.Property property64 = dateTime62.dayOfYear();
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.lang.String str66 = locale65.getDisplayName();
        java.lang.String str67 = locale65.getISO3Country();
        java.util.Locale locale68 = locale65.stripExtensions();
        java.util.Locale locale69 = java.util.Locale.CHINESE;
        java.lang.String str70 = locale68.getDisplayVariant(locale69);
        java.lang.String str71 = locale68.getISO3Language();
        java.util.Locale locale72 = java.util.Locale.KOREA;
        java.lang.String str73 = locale72.getDisplayName();
        java.lang.String str74 = locale72.getISO3Country();
        java.util.Locale locale75 = locale72.stripExtensions();
        java.lang.String str76 = locale68.getDisplayLanguage(locale72);
        java.util.Calendar calendar77 = dateTime62.toCalendar(locale68);
        java.lang.String str80 = nameProvider27.getShortName(locale68, "Property[millisOfSecond]", "Property[dayOfWeek]");
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone26, locale68);
        int int82 = timeZone26.getRawOffset();
        java.util.TimeZone.setDefault(timeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar43 and calendar81", (calendar43.compareTo(calendar81) == 0) == calendar43.equals(calendar81));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        timeZone4.setID("+00:00");
        timeZone4.setRawOffset(2);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        timeZone11.setID("+00:00");
        boolean boolean14 = timeZone4.hasSameRules(timeZone11);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone4, locale15);
        java.lang.String str17 = locale15.getLanguage();
        java.lang.String str20 = nameProvider0.getName(locale15, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        timeZone23.setID("+00:00");
        timeZone23.setRawOffset(2);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        timeZone30.setID("+00:00");
        boolean boolean33 = timeZone23.hasSameRules(timeZone30);
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone23, locale34);
        java.lang.String str36 = locale34.getLanguage();
        java.lang.String str37 = locale34.getDisplayLanguage();
        java.lang.String str40 = nameProvider0.getShortName(locale34, "DateTimeField[clockhourOfHalfday]", "57");
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str45 = nameProvider0.getName(locale41, "DateTimeField[secondOfMinute]", "Korean");
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        timeZone48.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone48);
        int int53 = timeZone48.getOffset((long) 53626);
        java.util.Locale locale55 = new java.util.Locale("hi!");
        java.util.Calendar calendar56 = java.util.Calendar.getInstance(timeZone48, locale55);
        java.lang.String str57 = locale55.getDisplayName();
        java.lang.String str60 = nameProvider0.getShortName(locale55, "2022-02-21T15:00:19.000Z", "2022-02-21T14:59:14.771Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar56", (calendar16.compareTo(calendar56) == 0) == calendar16.equals(calendar56));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addToCopy(0);
        org.joda.time.DateTime dateTime6 = property3.roundHalfCeilingCopy();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        java.lang.String str10 = dateTimeFieldType8.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDurationAdded(readableDuration14, 7);
        org.joda.time.Chronology chronology17 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology17.millis();
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DurationField durationField22 = chronology17.months();
        long long26 = chronology17.add((long) 53655035, 956L, (-292275054));
        org.joda.time.DateTimeField dateTimeField27 = chronology17.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime6.toDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone2);
        int int7 = timeZone2.getOffset((long) 53626);
        java.util.Locale locale9 = new java.util.Locale("hi!");
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone2, locale9);
        int int11 = calendar10.getWeeksInWeekYear();
        java.util.Date date15 = new java.util.Date(10, (int) (byte) -1, (-1));
        int int16 = date15.getTimezoneOffset();
        java.util.Date date22 = new java.util.Date(0, 0, 0, 9, (int) '#');
        boolean boolean23 = date15.before(date22);
        java.time.Instant instant24 = date22.toInstant();
        date22.setSeconds((int) (short) 0);
        int int27 = date22.getMinutes();
        calendar10.setTime(date22);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.fromDateFields(date22);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.plusMillis(53772896);
        int int32 = localDateTime31.getYear();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        int int35 = dateTime34.getEra();
        org.joda.time.DateTime.Property property36 = dateTime34.secondOfMinute();
        org.joda.time.DateTime dateTime38 = dateTime34.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime34.minus(readableDuration39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.era();
        int int42 = dateTime40.get(dateTimeFieldType41);
        int int43 = localDateTime31.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withYear((int) '#');
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime50.withPeriodAdded(readablePeriod51, 1970);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withDurationAdded(readableDuration54, 53675);
        org.joda.time.DateTime dateTime57 = localDateTime56.toDateTime();
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = localDateTime59.getFieldTypes();
        org.joda.time.Chronology chronology62 = localDateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = chronology62.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now(chronology62);
        org.joda.time.DurationField durationField65 = chronology62.weekyears();
        org.joda.time.MutableDateTime mutableDateTime66 = dateTime57.toMutableDateTime(chronology62);
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType41.getField(chronology62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime57 and mutableDateTime66", (dateTime57.compareTo(mutableDateTime66) == 0) == dateTime57.equals(mutableDateTime66));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfMinute();
        org.joda.time.DateTime dateTime15 = dateTime11.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime11.minus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime21 = dateTime17.withYearOfEra(53634);
        boolean boolean22 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.MutableDateTime mutableDateTime23 = instant9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Chronology chronology8 = instant0.getChronology();
        org.joda.time.DateTime dateTime9 = instant0.toDateTimeISO();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.withPeriodAdded(readablePeriod10, 54050);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        long long3 = dateTime2.getMillis();
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone7 = provider5.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(0L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.minus(readableDuration11);
        int int13 = dateTime2.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime2", (dateTime8.compareTo(dateTime2) == 0) == dateTime8.equals(dateTime2));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.plusWeeks(15);
        org.joda.time.DateTime dateTime10 = dateTime6.minusHours(21);
        org.joda.time.Instant instant11 = dateTime6.toInstant();
        org.joda.time.Chronology chronology12 = instant11.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant11", (dateTime6.compareTo(instant11) == 0) == dateTime6.equals(instant11));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, 1);
        int int18 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime17.plusYears(53627);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMinutes((-53637188));
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getRangeDurationType();
        org.joda.time.DateTime dateTime26 = dateTime20.withFieldAdded(durationFieldType24, 53656028);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        java.lang.String str32 = dateTimeFieldType30.toString();
        int int33 = localDateTime28.indexOf(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.withYear(53641141);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime20.toDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMonths(53693);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = localDateTime41.getFieldTypes();
        org.joda.time.Chronology chronology44 = localDateTime41.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.months();
        long long49 = chronology44.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTime dateTime50 = org.joda.time.DateTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime50.toMutableDateTime();
        boolean boolean53 = mutableDateTime51.isBefore(2880468115L);
        boolean boolean54 = dateTime37.isEqual((org.joda.time.ReadableInstant) mutableDateTime51);
        int int55 = dateTime37.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime50", (dateTime7.compareTo(dateTime50) == 0) == dateTime7.equals(dateTime50));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 53634900);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((long) 32772);
        long long9 = dateTimeZone3.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.DateTime dateTime11 = localDate1.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(605139);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        int int21 = instant14.get(dateTimeField20);
        org.joda.time.Instant instant23 = instant14.minus((long) 53633152);
        org.joda.time.Instant instant25 = instant14.minus((long) 21);
        long long26 = instant14.getMillis();
        int int27 = dateTime13.compareTo((org.joda.time.ReadableInstant) instant14);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        int int30 = dateTime29.getEra();
        org.joda.time.DateTime.Property property31 = dateTime29.secondOfMinute();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.DateTime dateTime34 = property31.addWrapFieldToCopy(53630);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType35.getDurationType();
        org.joda.time.DateTime dateTime38 = dateTime34.withFieldAdded(durationFieldType36, 53633152);
        boolean boolean39 = dateTime38.isBeforeNow();
        org.joda.time.DateTime dateTime41 = dateTime38.plusMinutes(53724);
        org.joda.time.Instant instant42 = dateTime38.toInstant();
        int int43 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime16", (instant14.compareTo(dateTime16) == 0) == instant14.equals(dateTime16));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 50);
        org.joda.time.Instant instant11 = instant6.withMillis((long) 53648);
        org.joda.time.Instant instant13 = instant6.plus((long) 53688289);
        org.joda.time.DateTime dateTime14 = instant6.toDateTime();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 53625);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime25 = property22.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int29 = localDateTime25.get(dateTimeFieldType28);
        int int30 = instant6.get(dateTimeFieldType28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime14", (instant6.compareTo(dateTime14) == 0) == instant6.equals(dateTime14));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime8.withPeriodAdded(readablePeriod11, (int) '4');
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTime dateTime20 = property18.roundCeilingCopy();
        int int21 = property14.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withEra((int) (byte) 0);
        org.joda.time.DateTime.Property property24 = dateTime20.secondOfDay();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTime dateTime26 = property24.withMinimumValue();
        org.joda.time.Instant instant27 = dateTime26.toInstant();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant27.minus(readableDuration28);
        org.joda.time.DateTime dateTime30 = instant27.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant27", (dateTime26.compareTo(instant27) == 0) == dateTime26.equals(instant27));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withMillisOfDay(2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYear((int) '#');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 1970);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.weekyear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.minusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.hourOfDay();
        java.lang.String str17 = property16.getName();
        java.util.Locale locale19 = new java.util.Locale("hi!");
        java.lang.String str20 = locale19.getISO3Country();
        java.util.Locale locale21 = locale19.stripExtensions();
        java.lang.String str22 = locale19.getScript();
        java.lang.String str24 = locale19.getUnicodeLocaleType("57");
        java.lang.String str25 = locale19.getDisplayScript();
        java.lang.String str26 = property16.getAsShortText(locale19);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy((long) 3);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.yearOfEra();
        org.joda.time.LocalDateTime localDateTime34 = property32.addToCopy((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime35 = property32.roundHalfEvenCopy();
        java.util.Locale.Builder builder37 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder38 = builder37.clear();
        java.util.Locale.Builder builder39 = builder38.clear();
        java.util.Locale locale40 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder41 = builder38.setLocale(locale40);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        timeZone44.setID("+00:00");
        java.util.Locale locale47 = java.util.Locale.GERMAN;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone44, locale47);
        java.util.Locale.Builder builder49 = builder38.setLocale(locale47);
        org.joda.time.LocalDateTime localDateTime50 = property32.setCopy("46", locale47);
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale47);
        java.lang.String str52 = locale19.getDisplayScript(locale47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar48 and calendar51", (calendar48.compareTo(calendar51) == 0) == calendar48.equals(calendar51));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis(605139);
        org.joda.time.DateTime dateTime11 = dateTime10.toDateTime();
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone13);
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone13);
        java.lang.String str19 = dateTimeZone13.toString();
        org.joda.time.DateTime dateTime20 = dateTime11.withZoneRetainFields(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime16", (dateTime1.compareTo(dateTime16) == 0) == dateTime1.equals(dateTime16));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        int int9 = dateTime7.getMinuteOfDay();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        org.joda.time.DateTime.Property property14 = dateTime12.secondOfMinute();
        java.lang.String str15 = property14.getAsString();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        int int17 = instant10.get(dateTimeField16);
        org.joda.time.Chronology chronology18 = instant10.getChronology();
        org.joda.time.DateTime dateTime19 = instant10.toDateTimeISO();
        int int20 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime22 = dateTime7.plusSeconds(53854103);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 50);
        org.joda.time.Instant instant11 = instant6.withMillis((long) 53648);
        org.joda.time.Instant instant13 = instant6.plus((long) 53688289);
        org.joda.time.DateTime dateTime14 = instant6.toDateTime();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((java.lang.Object) dateTime14);
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long9 = chronology4.add((-45001L), 53641L, 53652018);
        org.joda.time.DurationField durationField10 = chronology4.millis();
        org.joda.time.DurationField durationField11 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField5, and durationField10", !(durationField11.compareTo(durationField5) == 0) || (Math.signum(durationField11.compareTo(durationField10)) == Math.signum(durationField5.compareTo(durationField10))));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime dateTime13 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.lang.String str15 = dateTime13.toString("+00:00");
        org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
        org.joda.time.DateTime.Property property17 = dateTime13.dayOfYear();
        int int18 = property17.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        org.joda.time.DurationField durationField20 = property17.getLeapDurationField();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTimeISO();
        int int26 = dateTime22.getMillisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        int int30 = dateTime28.getSecondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime28.minusYears(12);
        boolean boolean33 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime32.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(readableDuration36, 1);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime41 = dateTime38.plusYears(53627);
        int int42 = property17.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime45 = property17.addToCopy((int) (short) -1);
        org.joda.time.DateTime dateTime46 = property17.withMinimumValue();
        org.joda.time.LocalTime localTime47 = dateTime46.toLocalTime();
        boolean boolean48 = instant6.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        int int54 = dateTime53.getEra();
        org.joda.time.DateTime dateTime55 = localTime51.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalTime localTime57 = localTime51.plusMillis((-1));
        org.joda.time.LocalTime localTime59 = localTime57.plusSeconds(5);
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalTime localTime62 = localTime57.withPeriodAdded(readablePeriod60, (int) '4');
        org.joda.time.LocalTime.Property property63 = localTime62.millisOfSecond();
        org.joda.time.LocalTime localTime64 = property63.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime66 = property63.addNoWrapToCopy((int) (short) 100);
        org.joda.time.LocalTime localTime67 = property63.withMaximumValue();
        org.joda.time.LocalTime localTime69 = property63.addNoWrapToCopy(53669);
        org.joda.time.ReadablePeriod readablePeriod70 = null;
        org.joda.time.LocalTime localTime71 = localTime69.plus(readablePeriod70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalTime localTime74 = localTime69.withPeriodAdded(readablePeriod72, 53944);
        org.joda.time.DateTime dateTime75 = localTime74.toDateTimeToday();
        int int76 = instant6.compareTo((org.joda.time.ReadableInstant) dateTime75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime11", (instant6.compareTo(dateTime11) == 0) == instant6.equals(dateTime11));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(53663);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(104L, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone2);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.lang.String str9 = dateTimeZone6.getShortName((long) 5);
        java.lang.String str10 = dateTimeZone6.getID();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        int int17 = dateTime13.getMillisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusYears(12);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        int int28 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime29 = dateTime26.withLaterOffsetAtOverlap();
        int int30 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = dateTime29.plus(1645455661589L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime11", (dateTime4.compareTo(dateTime11) == 0) == dateTime4.equals(dateTime11));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra(4);
        org.joda.time.DateTime.Property property23 = dateTime18.yearOfCentury();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.minus(readablePeriod26);
        org.joda.time.DateTime dateTime28 = dateTime27.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime28.getZone();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minus(readablePeriod36);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusSeconds((int) (short) -1);
        org.joda.time.Chronology chronology40 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.yearOfCentury();
        org.joda.time.DateTime dateTime42 = dateTime28.withChronology(chronology40);
        long long43 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime42", (dateTime1.compareTo(dateTime42) == 0) == dateTime1.equals(dateTime42));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = dateTime18.toLocalTime();
        int int22 = dateTime18.getWeekyear();
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.Instant instant25 = instant23.minus((long) 53691674);
        org.joda.time.Instant instant26 = instant23.toInstant();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant26.withDurationAdded(readableDuration27, 54087759);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant29", (dateTime1.compareTo(instant29) == 0) == dateTime1.equals(instant29));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        long long7 = dateTime6.getMillis();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant9.minus(readableDuration11);
        org.joda.time.MutableDateTime mutableDateTime13 = instant12.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant12", (dateTime6.compareTo(instant12) == 0) == dateTime6.equals(instant12));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((java.lang.Object) mutableDateTime24);
        boolean boolean26 = instant25.isAfterNow();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant25.minus(readableDuration27);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = localDateTime33.getFieldTypes();
        org.joda.time.Chronology chronology36 = localDateTime33.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.months();
        boolean boolean38 = durationFieldType31.isSupported(chronology36);
        org.joda.time.DateTimeField dateTimeField39 = chronology36.millisOfDay();
        org.joda.time.DurationField durationField40 = durationFieldType30.getField(chronology36);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 53670067, chronology36);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int45 = dateTime43.get(dateTimeFieldType44);
        org.joda.time.DateTime dateTime47 = dateTime43.withMillisOfDay(8);
        org.joda.time.DateTime dateTime48 = dateTime43.toDateTimeISO();
        org.joda.time.DateTime dateTime50 = dateTime43.plusWeeks(53693876);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime53 = dateTime43.withFieldAdded(durationFieldType51, 99);
        org.joda.time.DateTime dateTime55 = dateTime43.plusMinutes(53733945);
        org.joda.time.DateTime dateTime57 = dateTime55.plusMinutes(53707128);
        org.joda.time.DateTime.Property property58 = dateTime57.year();
        org.joda.time.DateTime.Property property59 = dateTime57.monthOfYear();
        int int60 = dateTime57.getMillisOfSecond();
        org.joda.time.DateTime dateTime62 = dateTime57.plusSeconds(53820467);
        boolean boolean63 = dateTime41.isAfter((org.joda.time.ReadableInstant) dateTime62);
        boolean boolean64 = instant28.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant28", (dateTime1.compareTo(instant28) == 0) == dateTime1.equals(instant28));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(53634);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone13);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) 54, locale20);
        org.joda.time.DateTime dateTime22 = dateTime7.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime22.withDurationAdded((long) 53637, 53710);
        org.joda.time.DateTime dateTime28 = dateTime26.plusDays(2922789);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, 53683);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        boolean boolean33 = calendar32.isWeekDateSupported();
        int int35 = calendar32.getActualMinimum(15);
        calendar32.clear();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromCalendarFields(calendar32);
        org.joda.time.LocalDate.Property property38 = localDate37.dayOfWeek();
        org.joda.time.Chronology chronology39 = localDate37.getChronology();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        org.joda.time.DateTime dateTime41 = dateTime28.toDateTime(chronology40);
        org.joda.time.DateTime.Property property42 = dateTime28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime41", (dateTime28.compareTo(dateTime41) == 0) == dateTime28.equals(dateTime41));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.DateTime dateTime7 = dateTime1.minusMinutes((-1));
        java.lang.String str8 = dateTime7.toString();
        org.joda.time.DateTime dateTime10 = dateTime7.minusYears(53628);
        org.joda.time.DateTime.Property property11 = dateTime10.centuryOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.plusSeconds(53629404);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localDateTime17.getFieldTypes();
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.months();
        boolean boolean22 = durationFieldType15.isSupported(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.millisOfDay();
        org.joda.time.DurationField durationField24 = durationFieldType14.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.hourOfDay();
        org.joda.time.DurationField durationField26 = chronology20.centuries();
        org.joda.time.DateTime dateTime27 = dateTime10.withChronology(chronology20);
        org.joda.time.Instant instant28 = dateTime27.toInstant();
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        java.util.TimeZone timeZone32 = dateTimeZone31.toTimeZone();
        int int34 = dateTimeZone31.getOffsetFromLocal((long) 12);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withPeriodAdded(readablePeriod40, 53625);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withPeriodAdded(readablePeriod43, (int) (byte) 0);
        boolean boolean46 = dateTimeZone31.equals((java.lang.Object) readablePeriod43);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(438L, dateTimeZone31);
        boolean boolean49 = dateTimeZone31.isStandardOffset((long) 53815838);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) dateTime27, dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant28", (dateTime10.compareTo(instant28) == 0) == dateTime10.equals(instant28));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 53629, 53647);
        long long4 = instant0.getMillis();
        org.joda.time.Chronology chronology5 = instant0.getChronology();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Instant instant8 = instant0.withDurationAdded(readableDuration6, 86399);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        long long18 = chronology13.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology13.getZone();
        org.joda.time.DateTimeField dateTimeField21 = chronology13.secondOfDay();
        org.joda.time.DurationField durationField22 = chronology13.minutes();
        org.joda.time.DateTime dateTime23 = instant0.toDateTime(chronology13);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime dateTime30 = localTime26.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        int int33 = dateTime32.getEra();
        int int34 = dateTime32.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime32.plus(readableDuration35);
        boolean boolean37 = dateTime28.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime39 = dateTime28.minusMonths(53628014);
        org.joda.time.DateTime.Property property40 = dateTime28.yearOfCentury();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        int int43 = dateTime42.getEra();
        int int44 = dateTime42.getSecondOfDay();
        org.joda.time.DateTime dateTime46 = dateTime42.minusYears(12);
        org.joda.time.DateTime dateTime48 = dateTime42.withWeekyear(22);
        int int49 = property40.compareTo((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime51 = property40.addWrapFieldToCopy(53649);
        org.joda.time.DateTime dateTime53 = property40.addWrapFieldToCopy(558);
        org.joda.time.DateTime dateTime54 = property40.getDateTime();
        org.joda.time.DateTime dateTime56 = dateTime54.plusMillis(53747);
        boolean boolean57 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime54", (instant0.compareTo(dateTime54) == 0) == instant0.equals(dateTime54));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.Instant instant9 = instant7.minus((long) 53629878);
        org.joda.time.DateTime dateTime10 = instant7.toDateTime();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant7.withDurationAdded(readableDuration11, 53759);
        org.joda.time.DateTime dateTime14 = instant7.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime4.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds((int) (short) -1);
        org.joda.time.Chronology chronology16 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime4.withChronology(chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime18", (dateTime1.compareTo(dateTime18) == 0) == dateTime1.equals(dateTime18));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DurationField durationField15 = chronology9.eras();
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField15", Math.signum(durationField12.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField12)));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(53633152);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy(53630);
        org.joda.time.DateTime dateTime19 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime21 = property15.addToCopy((long) 53647);
        org.joda.time.DateTime dateTime22 = property15.roundHalfFloorCopy();
        org.joda.time.Interval interval23 = property15.toInterval();
        org.joda.time.DateTime dateTime24 = property15.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime25 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.Instant instant26 = dateTime25.toInstant();
        org.joda.time.DateTime dateTime29 = dateTime25.withDurationAdded(424L, 53721681);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localDateTime32.getFieldTypes();
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.months();
        boolean boolean37 = durationFieldType30.isSupported(chronology35);
        org.joda.time.DateTimeField dateTimeField38 = chronology35.clockhourOfHalfday();
        long long41 = dateTimeField38.add(53633152L, 53650822);
        int int42 = dateTime29.get(dateTimeField38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and instant26", (dateTime25.compareTo(instant26) == 0) == dateTime25.equals(instant26));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.centuryOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDate2.getFieldTypes();
        org.joda.time.LocalDate localDate5 = localDate2.plusYears(14);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        org.joda.time.DateTime.Property property10 = dateTime8.secondOfMinute();
        java.lang.String str11 = property10.getAsString();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        int int13 = instant6.get(dateTimeField12);
        org.joda.time.Chronology chronology14 = instant6.getChronology();
        org.joda.time.DateTime dateTime15 = localDate5.toDateTime((org.joda.time.ReadableInstant) instant6);
        java.lang.String str17 = localDate5.toString("53834-02-21");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime8", (instant6.compareTo(dateTime8) == 0) == instant6.equals(dateTime8));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime6 = property3.setCopy("46", locale5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(53663528);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(53753);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTimeISO();
        int int18 = dateTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        int int22 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.minusYears(12);
        boolean boolean25 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = dateTime24.withDurationAdded(0L, (int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        int int30 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str31 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime32 = dateTime10.withZone(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withCenturyOfEra(2);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter35.withChronology(chronology40);
        org.joda.time.Chronology chronology42 = dateTimeFormatter35.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter35.withPivotYear((java.lang.Integer) 0);
        boolean boolean45 = dateTimeFormatter44.isParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getDurationType();
        java.lang.String str48 = dateTimeFieldType46.toString();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withDurationAdded(readableDuration52, 7);
        org.joda.time.Chronology chronology55 = localDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType46.getField(chronology55);
        org.joda.time.DurationField durationField57 = chronology55.seconds();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter44.withChronology(chronology55);
        org.joda.time.DurationField durationField60 = chronology55.halfdays();
        org.joda.time.DateTime dateTime61 = dateTime32.withChronology(chronology55);
        org.joda.time.DateTimeField dateTimeField62 = chronology55.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime32", (dateTime10.compareTo(dateTime32) == 0) == dateTime10.equals(dateTime32));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.toString();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtMidnight(dateTimeZone5);
        java.lang.String str11 = dateTimeZone5.getShortName(422L);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.millisOfDay();
        org.joda.time.DurationField durationField17 = chronology14.eras();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.DurationField durationField19 = chronology14.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField19, and durationField17", !(durationField17.compareTo(durationField19) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField19.compareTo(durationField17))));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTime.Property property8 = dateTime1.secondOfMinute();
        int int9 = property8.getLeapAmount();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime dateTime16 = localTime12.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekyear(32772);
        org.joda.time.DateTime dateTime19 = dateTime16.toDateTime();
        java.util.Date date20 = dateTime19.toDate();
        org.joda.time.DateTime.Property property21 = dateTime19.dayOfMonth();
        long long22 = dateTime19.getMillis();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getEra();
        org.joda.time.DateTime dateTime29 = localTime25.toDateTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekyear(32772);
        org.joda.time.DateTime dateTime32 = dateTime29.toDateTime();
        boolean boolean33 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime32);
        int int34 = property8.getDifference((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant35.withDurationAdded(readableDuration36, 1970);
        org.joda.time.DateTime dateTime39 = instant38.toDateTimeISO();
        boolean boolean40 = dateTime19.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant35", (dateTime1.compareTo(instant35) == 0) == dateTime1.equals(instant35));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 5);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.DateTime.Property property8 = dateTime6.weekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        boolean boolean24 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean25 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime15);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = dateTime15.withZone(dateTimeZone27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        int int31 = dateTime30.getEra();
        org.joda.time.DateTime.Property property32 = dateTime30.secondOfMinute();
        org.joda.time.DateTime dateTime34 = dateTime30.withCenturyOfEra((int) ' ');
        boolean boolean35 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime30);
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.TimeZone timeZone39 = dateTimeZone38.toTimeZone();
        int int41 = dateTimeZone38.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) 0, dateTimeZone38);
        int int43 = localTime42.size();
        org.joda.time.Chronology chronology44 = localTime42.getChronology();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) dateTime15, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.centuryOfEra();
        boolean boolean47 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime49 = dateTime6.plusDays(54062);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime45", (mutableDateTime7.compareTo(dateTime45) == 0) == mutableDateTime7.equals(dateTime45));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime1.yearOfCentury();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getEra();
        org.joda.time.DateTime.Property property11 = dateTime9.secondOfMinute();
        java.lang.String str12 = property11.getAsString();
        org.joda.time.DateTimeField dateTimeField13 = property11.getField();
        int int14 = instant7.get(dateTimeField13);
        org.joda.time.Instant instant16 = instant7.minus((long) 53633152);
        org.joda.time.Instant instant18 = instant7.minus((long) 21);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        int int24 = dateTime23.getEra();
        org.joda.time.DateTime dateTime25 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant26 = dateTime23.toInstant();
        org.joda.time.Instant instant28 = instant26.minus((long) 53629878);
        org.joda.time.DateTime dateTime29 = instant26.toDateTime();
        int int30 = instant7.compareTo((org.joda.time.ReadableInstant) instant26);
        int int31 = dateTime1.compareTo((org.joda.time.ReadableInstant) instant26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant7", (mutableDateTime4.compareTo(instant7) == 0) == mutableDateTime4.equals(instant7));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readableDuration4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.withDurationAdded(readableDuration6, 53626975);
        org.joda.time.DateTime dateTime11 = dateTime5.withDurationAdded((long) 2922789, (int) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours(53691674);
        org.joda.time.DateTime dateTime15 = dateTime13.minusHours((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withPeriodAdded(readablePeriod20, 53625);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.era();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.Instant instant30 = instant27.withDurationAdded((long) 53629, 53647);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType32 = dateTimeFieldType31.getRangeDurationType();
        int int33 = instant27.get(dateTimeFieldType31);
        boolean boolean34 = localDateTime26.isSupported(dateTimeFieldType31);
        boolean boolean35 = dateTime15.isSupported(dateTimeFieldType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology36);
        org.joda.time.LocalDate localDate39 = localDate37.plusYears((int) (byte) 10);
        org.joda.time.LocalDate.Property property40 = localDate37.weekOfWeekyear();
        org.joda.time.LocalDate localDate41 = property40.roundHalfEvenCopy();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate41.withPeriodAdded(readablePeriod42, 53884218);
        org.joda.time.Chronology chronology45 = localDate41.getChronology();
        boolean boolean46 = dateTimeFieldType31.isSupported(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar6 = builder5.build();
        java.util.Calendar calendar7 = builder5.build();
        java.util.Calendar.Builder builder11 = builder5.setDate(605139, 14, 20);
        java.util.Calendar.Builder builder13 = builder11.setLenient(true);
        java.util.Calendar.Builder builder17 = builder13.setTimeOfDay(53666, 53684637, 53812638);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        boolean boolean19 = calendar18.isWeekDateSupported();
        int int21 = calendar18.getActualMinimum(15);
        int int23 = calendar18.getGreatestMinimum(12);
        long long24 = calendar18.getTimeInMillis();
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone27 = provider25.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        boolean boolean29 = calendar18.after((java.lang.Object) dateTimeZone27);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        java.lang.String str31 = timeZone30.getID();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        int int34 = dateTime33.getEra();
        int int35 = dateTime33.getSecondOfDay();
        org.joda.time.DateTime dateTime37 = dateTime33.minusYears(12);
        org.joda.time.DateTime dateTime39 = dateTime33.minusMinutes((-1));
        java.lang.String str40 = dateTime39.toString();
        org.joda.time.DateTime.Property property41 = dateTime39.dayOfYear();
        int int42 = property41.getMaximumValueOverall();
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = property41.getAsShortText(locale43);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone30, locale43);
        calendar18.setTimeZone(timeZone30);
        java.util.Calendar.Builder builder47 = builder17.setTimeZone(timeZone30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar18 and calendar45", (calendar18.compareTo(calendar45) == 0) == calendar18.equals(calendar45));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime1.plusHours(53652018);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        boolean boolean10 = dateTime7.equals((java.lang.Object) 53665218);
        org.joda.time.Instant instant11 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property12 = dateTime7.era();
        org.joda.time.DateTime dateTime14 = dateTime7.withWeekyear(53627047);
        org.joda.time.DateTime.Property property15 = dateTime7.weekyear();
        org.joda.time.DateTime dateTime16 = property15.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant11", (dateTime7.compareTo(instant11) == 0) == dateTime7.equals(instant11));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate0.minusWeeks(12);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate0.minus(readablePeriod8);
        org.joda.time.LocalDate localDate11 = localDate9.plusMonths(101);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtMidnight();
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.Instant instant20 = instant18.plus((long) 2021);
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant18", (dateTime12.compareTo(instant18) == 0) == dateTime12.equals(instant18));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        java.lang.Object obj4 = null;
        boolean boolean5 = localDateTime1.equals(obj4);
        int int6 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property7 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        org.joda.time.DateTime.Property property12 = dateTime10.secondOfMinute();
        java.lang.String str13 = property12.getAsString();
        org.joda.time.DateTime dateTime15 = property12.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime16 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime18 = dateTime16.minusSeconds(2922789);
        org.joda.time.Instant instant19 = dateTime16.toInstant();
        org.joda.time.DateTime.Property property20 = dateTime16.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = dateTime16.withDurationAdded((long) 53674832, 53784566);
        long long24 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(53634);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone13);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) 54, locale20);
        org.joda.time.DateTime dateTime22 = dateTime7.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime22.withDurationAdded((long) 53637, 53710);
        org.joda.time.DateTime dateTime28 = dateTime26.plusDays(2922789);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, 53683);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        boolean boolean33 = calendar32.isWeekDateSupported();
        int int35 = calendar32.getActualMinimum(15);
        calendar32.clear();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromCalendarFields(calendar32);
        org.joda.time.LocalDate.Property property38 = localDate37.dayOfWeek();
        org.joda.time.Chronology chronology39 = localDate37.getChronology();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        org.joda.time.DateTime dateTime41 = dateTime28.toDateTime(chronology40);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime28.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime41", (dateTime28.compareTo(dateTime41) == 0) == dateTime28.equals(dateTime41));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        boolean boolean3 = property2.isLeap();
        org.joda.time.LocalDateTime localDateTime5 = property2.addToCopy(53637);
        int int6 = localDateTime5.getWeekyear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.plusWeeks(53662);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime10.toMutableDateTimeISO();
        int int14 = dateTime10.getMillisOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        int int18 = dateTime16.getSecondOfDay();
        org.joda.time.DateTime dateTime20 = dateTime16.minusYears(12);
        boolean boolean21 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property24 = dateTime23.minuteOfHour();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTime dateTime26 = property24.withMaximumValue();
        org.joda.time.DateTime dateTime28 = property24.addWrapFieldToCopy(53627827);
        org.joda.time.DateTime dateTime29 = property24.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        long long34 = dateTimeZone30.convertLocalToUTC((long) 53689, true, (long) (byte) 1);
        org.joda.time.DateTime dateTime35 = localDateTime8.toDateTime(dateTimeZone30);
        org.joda.time.DateTime.Property property36 = dateTime35.era();
        org.joda.time.Instant instant37 = dateTime35.toInstant();
        org.joda.time.Instant instant40 = instant37.withDurationAdded(1L, 53642476);
        org.joda.time.DateTime dateTime41 = instant40.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and instant37", (dateTime35.compareTo(instant37) == 0) == dateTime35.equals(instant37));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime6 = property3.setCopy("46", locale5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(53663528);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(53753);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTimeISO();
        int int18 = dateTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        int int22 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.minusYears(12);
        boolean boolean25 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = dateTime24.withDurationAdded(0L, (int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        int int30 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str31 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime32 = dateTime10.withZone(dateTimeZone12);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withCenturyOfEra(2);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter35.withChronology(chronology40);
        org.joda.time.Chronology chronology42 = dateTimeFormatter35.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter35.withPivotYear((java.lang.Integer) 0);
        boolean boolean45 = dateTimeFormatter44.isParser();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType46.getDurationType();
        java.lang.String str48 = dateTimeFieldType46.toString();
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.hourOfDay();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.withDurationAdded(readableDuration52, 7);
        org.joda.time.Chronology chronology55 = localDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType46.getField(chronology55);
        org.joda.time.DurationField durationField57 = chronology55.seconds();
        org.joda.time.DateTimeField dateTimeField58 = chronology55.weekyearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter44.withChronology(chronology55);
        org.joda.time.DurationField durationField60 = chronology55.halfdays();
        org.joda.time.DateTime dateTime61 = dateTime32.withChronology(chronology55);
        long long62 = dateTime61.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime32", (dateTime10.compareTo(dateTime32) == 0) == dateTime10.equals(dateTime32));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime1.minus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(53634);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        int int16 = dateTimeZone13.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(dateTimeZone13);
        boolean boolean18 = dateTimeZone13.isFixed();
        java.util.Locale locale20 = null;
        java.lang.String str21 = dateTimeZone13.getShortName((long) 54, locale20);
        org.joda.time.DateTime dateTime22 = dateTime7.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime22.withDurationAdded((long) 53637, 53710);
        org.joda.time.DateTime dateTime28 = dateTime26.plusDays(2922789);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withPeriodAdded(readablePeriod29, 53683);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance();
        boolean boolean33 = calendar32.isWeekDateSupported();
        int int35 = calendar32.getActualMinimum(15);
        calendar32.clear();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.fromCalendarFields(calendar32);
        org.joda.time.LocalDate.Property property38 = localDate37.dayOfWeek();
        org.joda.time.Chronology chronology39 = localDate37.getChronology();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        org.joda.time.DateTime dateTime41 = dateTime28.toDateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime41", (dateTime28.compareTo(dateTime41) == 0) == dateTime28.equals(dateTime41));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.LocalTime localTime8 = localTime2.plusMillis((-1));
        org.joda.time.LocalTime localTime10 = localTime2.minusSeconds(53626975);
        org.joda.time.LocalTime.Property property11 = localTime2.millisOfSecond();
        org.joda.time.LocalTime.Property property12 = localTime2.minuteOfHour();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        int int18 = dateTime17.getEra();
        org.joda.time.DateTime dateTime19 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Instant instant20 = dateTime17.toInstant();
        org.joda.time.Instant instant22 = instant20.minus((long) 53629878);
        org.joda.time.DateTime dateTime23 = instant20.toDateTime();
        long long24 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) instant20);
        org.joda.time.LocalTime localTime25 = property12.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant20", (dateTime4.compareTo(instant20) == 0) == dateTime4.equals(instant20));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DurationField durationField24 = chronology5.weeks();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology5);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName((long) 32772);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime25.toDateTime(dateTimeZone27);
        int int33 = dateTime25.getYearOfCentury();
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("14");
        boolean boolean36 = timeZone35.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTime dateTime39 = dateTime25.toDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis(53629878);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime31", (dateTime39.compareTo(dateTime31) == 0) == dateTime39.equals(dateTime31));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(53625);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(56L);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.Instant instant10 = instant8.minus((long) 53972100);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant8", (dateTime6.compareTo(instant8) == 0) == dateTime6.equals(instant8));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        int int12 = dateTime11.getEra();
        org.joda.time.DateTime dateTime13 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.lang.String str15 = dateTime13.toString("+00:00");
        org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
        org.joda.time.DateTime.Property property17 = dateTime13.dayOfYear();
        int int18 = property17.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        org.joda.time.DurationField durationField20 = property17.getLeapDurationField();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime22.toMutableDateTimeISO();
        int int26 = dateTime22.getMillisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        int int30 = dateTime28.getSecondOfDay();
        org.joda.time.DateTime dateTime32 = dateTime28.minusYears(12);
        boolean boolean33 = dateTime22.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime dateTime35 = dateTime32.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(readableDuration36, 1);
        int int39 = dateTime38.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime41 = dateTime38.plusYears(53627);
        int int42 = property17.compareTo((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTime dateTime43 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime45 = property17.addToCopy((int) (short) -1);
        org.joda.time.DateTime dateTime46 = property17.withMinimumValue();
        org.joda.time.LocalTime localTime47 = dateTime46.toLocalTime();
        boolean boolean48 = instant6.isAfter((org.joda.time.ReadableInstant) dateTime46);
        int int49 = dateTime46.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 53627827);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.DateTime.Property property7 = dateTime6.millisOfDay();
        org.joda.time.DateTime dateTime9 = property7.addToCopy(924);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime6", (instant1.compareTo(dateTime6) == 0) == instant1.equals(dateTime6));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone4 = dateTimeZone3.toTimeZone();
        timeZone4.setID("+00:00");
        timeZone4.setRawOffset(2);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        timeZone11.setID("+00:00");
        boolean boolean14 = timeZone4.hasSameRules(timeZone11);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone4, locale15);
        java.lang.String str17 = locale15.getLanguage();
        java.lang.String str20 = nameProvider0.getName(locale15, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale22 = new java.util.Locale("hi!");
        java.lang.String str23 = locale22.getISO3Country();
        java.util.Locale locale24 = locale22.stripExtensions();
        java.lang.String str25 = locale22.getScript();
        java.lang.String str27 = locale22.getUnicodeLocaleType("57");
        java.lang.String str30 = nameProvider0.getShortName(locale22, "49", "GMT");
        java.util.Locale locale32 = new java.util.Locale("50");
        java.lang.String str35 = nameProvider0.getShortName(locale32, "clockhourofhalfday", "0");
        java.util.Locale locale37 = java.util.Locale.forLanguageTag("Fri Feb 08 23:01:00 GMT+00:00 1901");
        java.lang.String str38 = locale37.getCountry();
        java.util.Locale locale39 = locale37.stripExtensions();
        org.joda.time.format.DateTimePrinter dateTimePrinter40 = null;
        org.joda.time.format.DateTimeParser dateTimeParser41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter40, dateTimeParser41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime44.withCenturyOfEra(2);
        org.joda.time.Chronology chronology47 = dateTime46.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter42.withChronology(chronology47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter42.withPivotYear((java.lang.Integer) 53642);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        java.util.TimeZone timeZone53 = dateTimeZone52.toTimeZone();
        int int55 = dateTimeZone52.getOffsetFromLocal((long) 12);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone52);
        java.lang.String str58 = dateTimeZone52.getNameKey((long) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter42.withZone(dateTimeZone52);
        java.util.Locale locale60 = java.util.Locale.ENGLISH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter42.withLocale(locale60);
        java.lang.String str62 = locale39.getDisplayCountry(locale60);
        java.lang.String str65 = nameProvider0.getName(locale60, "14:55:51.156", "2022-02-21T14:54:42.000Z");
        java.util.Locale.Category category66 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale67 = java.util.Locale.getDefault(category66);
        java.util.Locale.Builder builder68 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder69 = builder68.clear();
        java.util.Locale.Builder builder70 = builder69.clear();
        java.util.Locale locale71 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder72 = builder69.setLocale(locale71);
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        java.util.TimeZone timeZone75 = dateTimeZone74.toTimeZone();
        timeZone75.setID("+00:00");
        java.util.Locale locale78 = java.util.Locale.GERMAN;
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(timeZone75, locale78);
        java.util.Locale.Builder builder80 = builder69.setLocale(locale78);
        java.lang.String str81 = locale67.getDisplayName(locale78);
        java.util.Calendar calendar82 = java.util.Calendar.getInstance(locale78);
        java.lang.String str85 = nameProvider0.getShortName(locale78, "0000-02-20T14:59:13.327Z", "2022-02-21T14:58:39.000Z");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar79", (calendar16.compareTo(calendar79) == 0) == calendar16.equals(calendar79));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        boolean boolean28 = instant26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = instant26.toDateTimeISO();
        org.joda.time.Instant instant31 = instant26.withMillis(3600000L);
        org.joda.time.Instant instant33 = instant26.plus((long) 53864693);
        org.joda.time.Instant instant35 = instant33.plus((long) 53907);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 53629, 53647);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getRangeDurationType();
        int int6 = instant0.get(dateTimeFieldType4);
        org.joda.time.DateTime dateTime7 = instant0.toDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTime dateTime9 = property8.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra(4);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DurationField durationField11 = chronology9.seconds();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        int int13 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minus(readablePeriod21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds((int) (short) -1);
        int int25 = localDateTime22.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.minus(readablePeriod26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime22.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getRangeDurationType();
        java.lang.String str31 = dateTimeFieldType29.toString();
        int int32 = localDateTime22.indexOf(dateTimeFieldType29);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime37.withCenturyOfEra(2);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter35.withChronology(chronology40);
        org.joda.time.DurationField durationField42 = chronology40.years();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType29.getField(chronology40);
        int int44 = dateTime14.get(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime37", (dateTime12.compareTo(dateTime37) == 0) == dateTime12.equals(dateTime37));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("+00:00");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale2.getDisplayName();
        java.util.Locale locale5 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str6 = locale2.getDisplayLanguage(locale5);
        java.lang.String str7 = locale5.getDisplayName();
        java.lang.String str8 = locale5.getVariant();
        java.lang.String str9 = locale1.getDisplayName(locale5);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = null;
        org.joda.time.format.DateTimeParser dateTimeParser11 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter10, dateTimeParser11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        int int17 = dateTimeZone14.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now(dateTimeZone14);
        int int19 = localDate18.size();
        int int20 = localDate18.getWeekOfWeekyear();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.lang.String str23 = dateTimeZone22.toString();
        org.joda.time.DateTime dateTime24 = localDate18.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter12.withZone(dateTimeZone22);
        org.joda.time.tz.NameProvider nameProvider26 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider26);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        timeZone30.setID("+00:00");
        timeZone30.setRawOffset(2);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.util.TimeZone timeZone37 = dateTimeZone36.toTimeZone();
        timeZone37.setID("+00:00");
        boolean boolean40 = timeZone30.hasSameRules(timeZone37);
        java.util.Locale locale41 = java.util.Locale.CHINESE;
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone30, locale41);
        java.lang.String str43 = locale41.getLanguage();
        java.lang.String str46 = nameProvider26.getName(locale41, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale48 = new java.util.Locale("hi!");
        java.lang.String str49 = locale48.getISO3Country();
        java.util.Locale locale50 = locale48.stripExtensions();
        java.lang.String str51 = locale48.getScript();
        java.lang.String str53 = locale48.getUnicodeLocaleType("57");
        java.lang.String str56 = nameProvider26.getShortName(locale48, "49", "GMT");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter25.withLocale(locale48);
        java.lang.String str58 = locale48.getVariant();
        java.lang.String str59 = locale5.getDisplayLanguage(locale48);
        java.util.TimeZone timeZone60 = java.util.TimeZone.getDefault();
        java.lang.String str61 = timeZone60.getID();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(chronology62);
        int int64 = dateTime63.getEra();
        int int65 = dateTime63.getSecondOfDay();
        org.joda.time.DateTime dateTime67 = dateTime63.minusYears(12);
        org.joda.time.DateTime dateTime69 = dateTime63.minusMinutes((-1));
        java.lang.String str70 = dateTime69.toString();
        org.joda.time.DateTime.Property property71 = dateTime69.dayOfYear();
        int int72 = property71.getMaximumValueOverall();
        java.util.Locale locale73 = java.util.Locale.UK;
        java.lang.String str74 = property71.getAsShortText(locale73);
        java.util.Calendar calendar75 = java.util.Calendar.getInstance(timeZone60, locale73);
        java.lang.String str76 = locale5.getDisplayLanguage(locale73);
        java.lang.String str77 = locale5.getDisplayLanguage();
        java.util.Locale.setDefault(locale5);
        java.util.Set<java.lang.String> strSet79 = locale5.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar42 and calendar75", (calendar42.compareTo(calendar75) == 0) == calendar42.equals(calendar75));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("4");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.withMillis((long) 536752);
        org.joda.time.Instant instant6 = instant1.plus((long) 53908606);
        org.joda.time.Instant instant8 = instant1.plus(16662207684933L);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str4 = dateTimeZone1.getShortName((long) 5);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.withDurationAdded(readableDuration7, 32772);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(575);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        long long16 = property15.remainder();
        org.joda.time.DateTime dateTime18 = property15.setCopy("34");
        int int19 = dateTime18.getYearOfCentury();
        boolean boolean20 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = localDateTime22.getFieldTypes();
        org.joda.time.Chronology chronology25 = localDateTime22.getChronology();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology25.getZone();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime18.toMutableDateTime(dateTimeZone26);
        long long29 = dateTimeZone26.convertUTCToLocal((long) 5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime27", (dateTime18.compareTo(mutableDateTime27) == 0) == dateTime18.equals(mutableDateTime27));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime6.plusYears(2);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime.Property property16 = dateTime14.secondOfMinute();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime19 = property16.setCopy("46", locale18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.addToCopy(53663528);
        int int24 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getEra();
        org.joda.time.DateTime.Property property29 = dateTime27.secondOfMinute();
        java.lang.String str30 = property29.getAsString();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        int int32 = instant25.get(dateTimeField31);
        org.joda.time.Instant instant34 = instant25.minus((long) 53633152);
        org.joda.time.Instant instant36 = instant25.minus((long) 21);
        long long37 = instant25.getMillis();
        int int38 = dateTime23.compareTo((org.joda.time.ReadableInstant) instant25);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant25.plus(readableDuration39);
        org.joda.time.MutableDateTime mutableDateTime41 = instant40.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant40", (dateTime4.compareTo(instant40) == 0) == dateTime4.equals(instant40));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        int int6 = dateTime5.getEra();
        org.joda.time.DateTime dateTime7 = localTime3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekyear(32772);
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property11 = dateTime7.secondOfDay();
        org.joda.time.DateTime dateTime13 = dateTime7.plusYears(2);
        int int14 = dateTime7.getYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(53858117);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime7.toMutableDateTime(dateTimeZone16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((-1307166458280L), dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime17", (dateTime7.compareTo(mutableDateTime17) == 0) == dateTime7.equals(mutableDateTime17));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime5 = property3.roundCeilingCopy();
        long long6 = dateTime5.getMillis();
        java.lang.String str7 = dateTime5.toString();
        org.joda.time.DateTime dateTime9 = dateTime5.minusHours(575);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime5.minus(readableDuration10);
        org.joda.time.DateTime.Property property12 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime14 = property12.setCopy("863");
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        java.lang.String str17 = dateTimeFieldType15.toString();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDurationAdded(readableDuration21, 7);
        org.joda.time.Chronology chronology24 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.clockhourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology24.years();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTime dateTime30 = dateTime28.minusSeconds(53681);
        org.joda.time.DateTime dateTime32 = dateTime28.plusSeconds(54013448);
        int int33 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime28", (dateTime1.compareTo(dateTime28) == 0) == dateTime1.equals(dateTime28));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.centuries();
        org.joda.time.DurationFieldType durationFieldType10 = durationField9.getType();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        java.lang.String str13 = durationFieldType10.toString();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localDateTime15.getFieldTypes();
        org.joda.time.Chronology chronology18 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.dayOfYear();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.hourOfDay();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology18);
        boolean boolean24 = durationFieldType10.isSupported(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        boolean boolean13 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime4.minusMonths(53628014);
        org.joda.time.DateTime.Property property16 = dateTime4.yearOfCentury();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime(dateTimeZone18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(1645455243000L);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.withChronology(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        long long7 = dateTime6.getMillis();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        long long10 = instant9.getMillis();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((long) 1320, 558);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant9.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = instant15.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant15", (dateTime6.compareTo(instant15) == 0) == dateTime6.equals(instant15));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        int int9 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant10 = instant8.toInstant();
        org.joda.time.Instant instant12 = instant10.minus((long) 53910974);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant10", (dateTime1.compareTo(instant10) == 0) == dateTime1.equals(instant10));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addWrapFieldToCopy(53630);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMonths((int) '4');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        int int14 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(53633931);
        org.joda.time.TimeOfDay timeOfDay19 = dateTime18.toTimeOfDay();
        org.joda.time.Instant instant20 = dateTime18.toInstant();
        int int21 = dateTime10.compareTo((org.joda.time.ReadableInstant) instant20);
        org.joda.time.Instant instant22 = instant20.toInstant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant22", (dateTime18.compareTo(instant22) == 0) == dateTime18.equals(instant22));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        boolean boolean15 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean16 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime1.minus(0L);
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears(894);
        org.joda.time.DateTime dateTime24 = dateTime22.withYear(53746807);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.Instant instant28 = instant25.withDurationAdded((long) 53629, 53647);
        long long29 = instant25.getMillis();
        org.joda.time.Chronology chronology30 = instant25.getChronology();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant25.withDurationAdded(readableDuration31, 86399);
        org.joda.time.Instant instant36 = instant33.withDurationAdded((long) 53892790, 53771587);
        org.joda.time.Instant instant38 = instant33.plus((long) 53917878);
        org.joda.time.Chronology chronology39 = instant38.getChronology();
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) dateTime22, chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant25", (dateTime1.compareTo(instant25) == 0) == dateTime1.equals(instant25));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localDateTime13.getFieldTypes();
        org.joda.time.Chronology chronology16 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology16.days();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField21 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology16.hourOfDay();
        org.joda.time.DateTime dateTime24 = dateTime11.withChronology(chronology16);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime27.withCenturyOfEra(2);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfDay();
        java.lang.String str32 = chronology30.toString();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.weekyear();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(1645455299000L, chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.dayOfWeek();
        org.joda.time.DateTime dateTime36 = dateTime11.toDateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime24", (dateTime36.compareTo(dateTime24) == 0) == dateTime36.equals(dateTime24));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withPeriodAdded(readablePeriod9, 53625);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.year();
        org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withPeriodAdded(readablePeriod17, 53713435);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfDay(53926221);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime27 = dateTime23.withMillisOfDay(8);
        org.joda.time.DateTime dateTime28 = dateTime23.toDateTimeISO();
        org.joda.time.DateTime dateTime30 = dateTime23.plusWeeks(53693876);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime33 = dateTime23.withFieldAdded(durationFieldType31, 99);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = localDateTime35.getFieldTypes();
        org.joda.time.Chronology chronology38 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.weekOfWeekyear();
        org.joda.time.DurationField durationField41 = chronology38.seconds();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.halfdayOfDay();
        org.joda.time.DurationField durationField43 = durationFieldType31.getField(chronology38);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime19.withFieldAdded(durationFieldType31, 53736);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime48.withCenturyOfEra(2);
        org.joda.time.Chronology chronology51 = dateTime50.getChronology();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        long long55 = chronology51.add(readablePeriod52, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField56 = chronology51.minuteOfHour();
        org.joda.time.DurationField durationField57 = durationFieldType46.getField(chronology51);
        java.lang.String str58 = durationFieldType46.toString();
        boolean boolean59 = localDateTime19.isSupported(durationFieldType46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField57", (durationField41.compareTo(durationField57) == 0) == durationField41.equals(durationField57));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.Instant instant11 = instant0.minus((long) 21);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        long long14 = instant13.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime2", (instant13.compareTo(dateTime2) == 0) == instant13.equals(dateTime2));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        int int5 = dateTimeZone2.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 0, dateTimeZone2);
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(53630);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        boolean boolean12 = localTime8.equals((java.lang.Object) localTime10);
        org.joda.time.DateTime dateTime13 = localTime10.toDateTimeToday();
        org.joda.time.Chronology chronology14 = localTime10.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.days();
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology14);
        org.joda.time.DateTime.Property property18 = dateTime17.era();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addToCopy(0);
        org.joda.time.DateTime dateTime6 = property3.roundHalfCeilingCopy();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        java.lang.String str10 = dateTimeFieldType8.toString();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.hourOfDay();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDurationAdded(readableDuration14, 7);
        org.joda.time.Chronology chronology17 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DurationField durationField20 = chronology17.millis();
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DurationField durationField22 = chronology17.months();
        long long26 = chronology17.add((long) 53655035, 956L, (-292275054));
        org.joda.time.DateTimeField dateTimeField27 = chronology17.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime6.toDateTime(chronology17);
        org.joda.time.DateTimeZone dateTimeZone29 = chronology17.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra(4);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.Instant instant27 = instant23.minus(readableDuration26);
        long long28 = instant27.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant27", (dateTime1.compareTo(instant27) == 0) == dateTime1.equals(instant27));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        int int7 = localDate4.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant9.withDurationAdded(readableDuration10, 53695160);
        org.joda.time.Instant instant14 = instant12.withMillis((long) 553);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant12", (dateTime8.compareTo(instant12) == 0) == dateTime8.equals(instant12));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        int int9 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant10 = instant8.toInstant();
        org.joda.time.MutableDateTime mutableDateTime11 = instant8.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.DateTime dateTime10 = instant0.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.minus((long) 53827);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        int int9 = mutableDateTime8.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDateTime4.getFieldTypes();
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.millisOfSecond();
        org.joda.time.DateTime dateTime12 = dateTime1.toDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property15.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withPeriodAdded(readablePeriod22, 53625);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.year();
        org.joda.time.LocalDateTime localDateTime27 = property25.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime17.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology29 = localDateTime28.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfEra(53686663);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.plusYears(53697958);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusDays(53689);
        org.joda.time.LocalDateTime.Property property38 = localDateTime35.monthOfYear();
        int[] intArray40 = chronology7.get((org.joda.time.ReadablePartial) localDateTime35, 1645455542000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        java.lang.String str6 = chronology4.toString();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.year();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology4.weekyear();
        org.joda.time.DurationField durationField11 = chronology4.eras();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        int int17 = dateTime13.getMillisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.DateTime dateTime23 = dateTime19.minusYears(12);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime28 = property27.roundCeilingCopy();
        org.joda.time.DateTime dateTime29 = property27.withMaximumValue();
        org.joda.time.DateTime dateTime31 = property27.addWrapFieldToCopy(53627827);
        org.joda.time.DateTimeField dateTimeField32 = property27.getField();
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minus(readablePeriod39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusSeconds((int) (short) -1);
        int int43 = localDateTime40.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.minus(readablePeriod44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.weekyear();
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray50 = localDateTime48.getFieldTypes();
        org.joda.time.Chronology chronology51 = localDateTime48.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.weekyear();
        org.joda.time.DateTimeField dateTimeField53 = chronology51.yearOfEra();
        int int56 = dateTimeField53.getDifference((long) (-53637188), 343L);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = dateTimeField53.getType();
        java.lang.String str59 = dateTimeField53.getAsShortText((long) 53646261);
        long long62 = dateTimeField53.getDifferenceAsLong((long) (byte) 10, (long) 53650);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.millisOfDay();
        org.joda.time.LocalDateTime.Property property66 = localDateTime64.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withPeriodAdded(readablePeriod67, 53625);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.year();
        org.joda.time.LocalDateTime localDateTime72 = property70.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime73 = property70.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime74 = property70.roundHalfFloorCopy();
        java.lang.String str76 = localDateTime74.toString("53635");
        int[] intArray78 = new int[] { 'x' };
        int int79 = dateTimeField53.getMaximumValue((org.joda.time.ReadablePartial) localDateTime74, intArray78);
        int int80 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDateTime40, intArray78);
        org.joda.time.DurationField durationField81 = dateTimeField32.getDurationField();
        long long84 = durationField81.add((long) 54011490, 53919);
        int int85 = durationField11.compareTo(durationField81);
        long long88 = durationField81.getDifferenceAsLong((long) 597, (long) 945);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField81, and durationField11", !(durationField11.compareTo(durationField81) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField81.compareTo(durationField11))));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(53681);
        org.joda.time.DateTime dateTime16 = dateTime15.withLaterOffsetAtOverlap();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.util.TimeZone timeZone19 = dateTimeZone18.toTimeZone();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) 12);
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone18);
        java.lang.String str24 = dateTimeZone18.getNameKey((long) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        java.lang.String str27 = dateTimeZone18.getName((long) 53784566);
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime16.toMutableDateTime(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime22", (dateTime13.compareTo(dateTime22) == 0) == dateTime13.equals(dateTime22));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTimeISO();
        int int11 = dateTime7.getMillisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        int int15 = dateTime13.getSecondOfDay();
        org.joda.time.DateTime dateTime17 = dateTime13.minusYears(12);
        boolean boolean18 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.withWeekyear((int) (short) 0);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime20.getZone();
        int int24 = dateTimeZone22.getStandardOffset((long) 53672807);
        org.joda.time.DateTime dateTime25 = localDate5.toDateTimeAtMidnight(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime7", (dateTime3.compareTo(dateTime7) == 0) == dateTime3.equals(dateTime7));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone7 = provider5.getZone("Etc/UTC");
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime1.toMutableDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusMillis((int) (byte) 10);
        boolean boolean14 = dateTimeZone7.isLocalDateTimeGap(localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMinuteOfHour(52);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(53654002);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDateTime13.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withHourOfDay(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime19", (dateTime1.compareTo(dateTime19) == 0) == dateTime1.equals(dateTime19));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.withCenturyOfEra(4);
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        org.joda.time.Chronology chronology25 = instant23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate0.minusWeeks(12);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfMonth();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime.Property property15 = dateTime13.secondOfMinute();
        java.lang.String str16 = property15.getAsString();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        int int19 = dateTimeField17.get((long) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = dateTimeField17.getType();
        int int21 = dateTimeField17.getMaximumValue();
        long long23 = dateTimeField17.roundHalfFloor((long) (-53637188));
        long long25 = dateTimeField17.roundHalfFloor((long) (short) 0);
        java.util.Locale locale28 = new java.util.Locale("50");
        java.lang.String str29 = dateTimeField17.getAsShortText((long) 53687, locale28);
        java.lang.String str30 = dateTimeField10.getAsShortText((long) (-53710249), locale28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime13", (dateTime9.compareTo(dateTime13) == 0) == dateTime9.equals(dateTime13));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        timeZone2.setID("+00:00");
        java.util.Locale locale5 = java.util.Locale.GERMAN;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone2, locale5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        timeZone9.setID("+00:00");
        int int13 = timeZone9.getOffset((long) 365);
        java.lang.String str14 = timeZone9.getID();
        int int16 = timeZone9.getOffset((long) '#');
        boolean boolean17 = timeZone2.hasSameRules(timeZone9);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone2);
        java.lang.Object obj19 = timeZone2.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar6 and calendar18", (calendar6.compareTo(calendar18) == 0) == calendar6.equals(calendar18));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DurationField durationField24 = chronology5.weeks();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology5);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName((long) 32772);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime25.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology33 = dateTime25.getChronology();
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime31", (dateTime25.compareTo(dateTime31) == 0) == dateTime25.equals(dateTime31));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime6.secondOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime12.toMutableDateTimeISO();
        int int16 = dateTime12.getMillisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getEra();
        int int20 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusYears(12);
        boolean boolean23 = dateTime12.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime22.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readablePeriod28);
        boolean boolean30 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime6.withChronology(chronology31);
        org.joda.time.Instant instant33 = dateTime6.toInstant();
        org.joda.time.DateTime.Property property34 = dateTime6.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant33", (dateTime6.compareTo(instant33) == 0) == dateTime6.equals(instant33));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekyear(32772);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property10 = dateTime6.secondOfDay();
        org.joda.time.DateTime dateTime12 = dateTime6.plusYears(2);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime.Property property16 = dateTime14.secondOfMinute();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime19 = property16.setCopy("46", locale18);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        org.joda.time.DateTime.Property property21 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime23 = property21.addToCopy(53663528);
        int int24 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        int int28 = dateTime27.getEra();
        org.joda.time.DateTime.Property property29 = dateTime27.secondOfMinute();
        java.lang.String str30 = property29.getAsString();
        org.joda.time.DateTimeField dateTimeField31 = property29.getField();
        int int32 = instant25.get(dateTimeField31);
        org.joda.time.Instant instant34 = instant25.minus((long) 53633152);
        org.joda.time.Instant instant36 = instant25.minus((long) 21);
        long long37 = instant25.getMillis();
        int int38 = dateTime23.compareTo((org.joda.time.ReadableInstant) instant25);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant25.plus(readableDuration39);
        org.joda.time.Instant instant42 = instant25.plus(1692412209208486000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant25", (dateTime4.compareTo(instant25) == 0) == dateTime4.equals(instant25));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 50);
        org.joda.time.Instant instant11 = instant6.withMillis((long) 53648);
        org.joda.time.Instant instant13 = instant6.plus((long) 53688289);
        org.joda.time.DateTime dateTime14 = instant6.toDateTime();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((java.lang.Object) dateTime14);
        org.joda.time.Instant instant17 = instant15.withMillis((long) 434);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime14", (instant0.compareTo(dateTime14) == 0) == instant0.equals(dateTime14));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy(53629404);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime8.getFieldTypes();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.months();
        boolean boolean13 = durationFieldType6.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 53625);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime25 = property22.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond(11);
        int[] intArray29 = chronology11.get((org.joda.time.ReadablePartial) localDateTime27, (long) 53642476);
        org.joda.time.DurationField durationField30 = chronology11.weeks();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology11);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.toString();
        java.lang.String str36 = dateTimeZone33.getShortName((long) 32772);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime31.toDateTime(dateTimeZone33);
        int int39 = dateTime31.getYearOfCentury();
        boolean boolean40 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getDurationType();
        java.lang.String str43 = dateTimeFieldType41.toString();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withDurationAdded(readableDuration47, 7);
        org.joda.time.Chronology chronology50 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType41.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = chronology50.years();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = chronology50.add(readablePeriod56, 1645455275000L, 53666699);
        org.joda.time.DateTimeZone dateTimeZone60 = chronology50.getZone();
        int int62 = dateTimeZone60.getOffset((long) 53671);
        long long66 = dateTimeZone60.convertLocalToUTC(0L, false, 1694358359856054610L);
        org.joda.time.DateTime dateTime67 = dateTime5.withZone(dateTimeZone60);
        int int69 = dateTimeZone60.getStandardOffset(20953900800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime31", (dateTime1.compareTo(dateTime31) == 0) == dateTime1.equals(dateTime31));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime10.getFieldTypes();
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.months();
        long long18 = chronology13.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.minuteOfHour();
        org.joda.time.DateTime dateTime20 = dateTime7.withChronology(chronology13);
        org.joda.time.DateTime dateTime22 = dateTime7.withMinuteOfHour(4);
        org.joda.time.DateTime dateTime23 = dateTime7.toDateTimeISO();
        java.lang.String str24 = dateTime23.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime20", (dateTime23.compareTo(dateTime20) == 0) == dateTime23.equals(dateTime20));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime4.getZone();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds((int) (short) -1);
        org.joda.time.Chronology chronology16 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime4.withChronology(chronology16);
        java.util.Date date19 = dateTime18.toDate();
        date19.setYear((-1027768));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime18", (dateTime1.compareTo(dateTime18) == 0) == dateTime1.equals(dateTime18));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.DateTime dateTime5 = dateTime1.withMillisOfDay(8);
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTimeISO();
        org.joda.time.DateTime dateTime8 = dateTime1.plusWeeks(53693876);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime11 = dateTime1.withFieldAdded(durationFieldType9, 99);
        org.joda.time.DateTime dateTime13 = dateTime1.plusMinutes(53733945);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(53707128);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime13.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withPeriodAdded(readablePeriod21, 53625);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale25.getDisplayName();
        java.lang.String str27 = locale25.getISO3Country();
        java.lang.String str28 = locale25.getDisplayLanguage();
        java.lang.String str29 = localDateTime23.toString("53635", locale25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(dateTimeZone31);
        java.lang.String str34 = dateTimeZone31.getShortName((long) 2021);
        org.joda.time.DateTime dateTime35 = localDateTime23.toDateTime(dateTimeZone31);
        java.lang.String str36 = dateTimeZone31.getID();
        long long38 = dateTimeZone31.convertUTCToLocal(82L);
        org.joda.time.DateTime dateTime39 = mutableDateTime16.toDateTime(dateTimeZone31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime32", (dateTime1.compareTo(dateTime32) == 0) == dateTime1.equals(dateTime32));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        int int14 = localDate11.getDayOfWeek();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.LocalDate localDate22 = localDate11.plusDays((int) '4');
        org.joda.time.Chronology chronology23 = localDate11.getChronology();
        org.joda.time.DateTime dateTime24 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology25 = localDate11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime10.toMutableDateTime(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime10.withDurationAdded(readableDuration27, 54006899);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and mutableDateTime26", (dateTime29.compareTo(mutableDateTime26) == 0) == dateTime29.equals(mutableDateTime26));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(2);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTime.Property property5 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime7 = property5.setCopy("59");
        org.joda.time.DateTime dateTime8 = property5.roundCeilingCopy();
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        boolean boolean10 = dateTime8.isAfterNow();
        org.joda.time.Chronology chronology11 = dateTime8.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        org.joda.time.DurationField durationField13 = chronology11.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField13, and durationField12", !(durationField12.compareTo(durationField13) == 0) || (Math.signum(durationField12.compareTo(durationField12)) == Math.signum(durationField13.compareTo(durationField12))));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addWrapFieldToCopy(53630);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.minus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusMonths((int) '4');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        int int13 = dateTime12.getEra();
        int int14 = dateTime12.getSecondOfDay();
        org.joda.time.DateTime dateTime16 = dateTime12.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(53633931);
        org.joda.time.TimeOfDay timeOfDay19 = dateTime18.toTimeOfDay();
        org.joda.time.Instant instant20 = dateTime18.toInstant();
        int int21 = dateTime10.compareTo((org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime.Property property22 = dateTime10.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant20", (dateTime18.compareTo(instant20) == 0) == dateTime18.equals(instant20));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.Chronology chronology4 = dateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(chronology4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusWeeks(53850290);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(53864);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDurationAdded(readableDuration17, 7);
        org.joda.time.Chronology chronology20 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType11.getField(chronology20);
        java.lang.String str22 = dateTimeFieldType11.getName();
        org.joda.time.field.FieldUtils.verifyValueBounds(dateTimeFieldType11, 2000, 51, 53738);
        boolean boolean27 = localDateTime10.isSupported(dateTimeFieldType11);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getDurationType();
        java.lang.String str30 = dateTimeFieldType28.toString();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.hourOfDay();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withDurationAdded(readableDuration34, 7);
        org.joda.time.Chronology chronology37 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType28.getField(chronology37);
        org.joda.time.DurationField durationField39 = chronology37.seconds();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology37);
        boolean boolean41 = dateTimeFieldType11.isSupported(chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime40", (dateTime1.compareTo(dateTime40) == 0) == dateTime1.equals(dateTime40));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 53634900);
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.lang.String str4 = dateTimeZone3.toString();
        java.lang.String str6 = dateTimeZone3.getShortName((long) 32772);
        long long9 = dateTimeZone3.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.DateTime dateTime11 = localDate1.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTime dateTime13 = dateTime11.plusWeeks(605139);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getEra();
        org.joda.time.DateTime.Property property18 = dateTime16.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        int int21 = instant14.get(dateTimeField20);
        org.joda.time.Instant instant23 = instant14.minus((long) 53633152);
        org.joda.time.Instant instant25 = instant14.minus((long) 21);
        long long26 = instant14.getMillis();
        int int27 = dateTime13.compareTo((org.joda.time.ReadableInstant) instant14);
        org.joda.time.MutableDateTime mutableDateTime28 = instant14.toMutableDateTime();
        org.joda.time.DateTime dateTime29 = instant14.toDateTimeISO();
        org.joda.time.DateTime.Property property30 = dateTime29.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime16", (instant14.compareTo(dateTime16) == 0) == instant14.equals(dateTime16));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant0.withDurationAdded(readableDuration4, (-53622326));
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        org.joda.time.MutableDateTime mutableDateTime8 = instant6.toMutableDateTime();
        long long9 = instant6.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime8", (instant6.compareTo(mutableDateTime8) == 0) == instant6.equals(mutableDateTime8));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = dateTime4.get(dateTimeFieldType8);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime12 = dateTime4.plus((-1691006403586552L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and mutableDateTime10", (instant7.compareTo(mutableDateTime10) == 0) == instant7.equals(mutableDateTime10));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(2);
        org.joda.time.Chronology chronology6 = dateTime5.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology6.add(readablePeriod7, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField11 = chronology6.minuteOfHour();
        org.joda.time.DurationField durationField12 = durationFieldType1.getField(chronology6);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.Chronology chronology15 = chronology6.withZone(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(196L, chronology6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks(53726374);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(53753);
        java.util.TimeZone timeZone21 = dateTimeZone20.toTimeZone();
        org.joda.time.DateTime dateTime22 = dateTime16.toDateTime(dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.plus(readableDuration23);
        org.joda.time.LocalDate localDate25 = dateTime24.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime24", (dateTime16.compareTo(dateTime24) == 0) == dateTime16.equals(dateTime24));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis(605139);
        java.lang.Object obj11 = null;
        org.joda.time.tz.Provider provider12 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone14 = provider12.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj11, dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset(1266764034698L);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime10, dateTimeZone14);
        org.joda.time.Instant instant19 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime20 = instant19.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        java.lang.String str23 = dateTimeFieldType21.toString();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.hourOfDay();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.withDurationAdded(readableDuration27, 7);
        org.joda.time.Chronology chronology30 = localDateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType21.getField(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.seconds();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField34 = chronology30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withPeriodAdded(readablePeriod39, 53625);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.year();
        org.joda.time.LocalDateTime localDateTime44 = property42.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime45 = property42.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime46 = property42.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        boolean boolean49 = dateTimeZone47.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = localDateTime52.getFieldTypes();
        org.joda.time.Chronology chronology55 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.weekOfWeekyear();
        org.joda.time.DurationField durationField58 = chronology55.days();
        org.joda.time.DateTimeField dateTimeField59 = chronology55.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField60 = chronology55.dayOfWeek();
        org.joda.time.DurationField durationField61 = chronology55.minutes();
        org.joda.time.DateTime dateTime62 = dateTime50.toDateTime(chronology55);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.hourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.plusMillis((int) (byte) 10);
        int[] intArray69 = chronology55.get((org.joda.time.ReadablePartial) localDateTime64, (long) 54);
        chronology30.validate((org.joda.time.ReadablePartial) localDateTime46, intArray69);
        org.joda.time.DateTimeField dateTimeField71 = chronology30.yearOfEra();
        org.joda.time.DateTimeField dateTimeField72 = chronology30.minuteOfHour();
        org.joda.time.LocalTime localTime73 = new org.joda.time.LocalTime((java.lang.Object) dateTime20, chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        long long9 = chronology4.add(1692412209208486000L, (long) 53634698, 53628014);
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology4);
        org.joda.time.DurationField durationField11 = chronology4.eras();
        org.joda.time.DurationField durationField12 = chronology4.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField11", Math.signum(durationField5.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField5)));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        int int29 = dateTime28.getEra();
        org.joda.time.DateTime.Property property30 = dateTime28.secondOfMinute();
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfYear((int) (byte) 100);
        int int34 = localDate31.getDayOfWeek();
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        java.lang.String str37 = dateTimeZone36.toString();
        int int39 = dateTimeZone36.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime40 = localDate31.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime28.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime42 = instant26.toDateTime(dateTimeZone36);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant44 = instant26.minus(readableDuration43);
        org.joda.time.Instant instant47 = instant26.withDurationAdded(0L, 53901550);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTime dateTime6 = property3.setCopy("47");
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) (byte) 100);
        int int14 = localDate11.getDayOfWeek();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtMidnight(dateTimeZone16);
        org.joda.time.LocalDate localDate22 = localDate11.plusDays((int) '4');
        org.joda.time.Chronology chronology23 = localDate11.getChronology();
        org.joda.time.DateTime dateTime24 = localDate11.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology25 = localDate11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime10.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime10.minus((-1705518191664000000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime26", (dateTime10.compareTo(mutableDateTime26) == 0) == dateTime10.equals(mutableDateTime26));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(2922789);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = property11.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology9.years();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime18.getFieldTypes();
        org.joda.time.Chronology chronology21 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.months();
        long long26 = chronology21.add((-45001L), 53641L, 53652018);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology28);
        int int30 = dateTime29.getEra();
        org.joda.time.DateTime.Property property31 = dateTime29.secondOfMinute();
        java.lang.String str32 = property31.getAsString();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        int int35 = dateTimeField33.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.plusSeconds(6);
        int int42 = localDateTime37.getYear();
        int[] intArray49 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int50 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDateTime37, intArray49);
        java.lang.String str51 = dateTimeField33.getName();
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.hourOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property54.addToCopy((long) 3);
        int[] intArray58 = new int[] { '#' };
        int int59 = dateTimeField33.getMaximumValue((org.joda.time.ReadablePartial) localDateTime56, intArray58);
        int int60 = localDateTime56.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime56.plusMonths(99);
        org.joda.time.DateTime dateTime63 = localDateTime56.toDateTime();
        java.lang.Object obj64 = null;
        boolean boolean65 = localDateTime56.equals(obj64);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime56.minusMillis(53634);
        org.joda.time.LocalDateTime.Property property68 = localDateTime56.minuteOfHour();
        int[] intArray70 = chronology21.get((org.joda.time.ReadablePartial) localDateTime56, 53827818L);
        int int71 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localTime16, intArray70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime29", (dateTime13.compareTo(dateTime29) == 0) == dateTime13.equals(dateTime29));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(53625);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfEra(53634);
        int int8 = localDateTime5.getDayOfWeek();
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime1.withChronology(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime12", (dateTime1.compareTo(dateTime12) == 0) == dateTime1.equals(dateTime12));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Instant instant9 = instant0.minus((long) 53633152);
        org.joda.time.Instant instant11 = instant0.minus((long) 21);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.Instant instant15 = instant13.minus((long) 54081513);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime2", (instant13.compareTo(dateTime2) == 0) == instant13.equals(dateTime2));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.lang.String str9 = locale8.getDisplayName();
        java.lang.String str10 = locale8.getISO3Country();
        java.lang.String str11 = locale8.getDisplayLanguage();
        java.lang.String str12 = localDateTime6.toString("53635", locale8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        java.lang.String str17 = dateTimeZone14.getShortName((long) 2021);
        org.joda.time.DateTime dateTime18 = localDateTime6.toDateTime(dateTimeZone14);
        java.lang.String str19 = dateTimeZone14.getID();
        long long21 = dateTimeZone14.convertUTCToLocal(82L);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.weekOfWeekyear();
        java.lang.Object obj26 = null;
        boolean boolean27 = localDateTime23.equals(obj26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.minusMonths(53643);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime32.toMutableDateTimeISO();
        org.joda.time.tz.Provider provider36 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone38 = provider36.getZone("Etc/UTC");
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime32.toMutableDateTime(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.hourOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.plusMillis((int) (byte) 10);
        boolean boolean45 = dateTimeZone38.isLocalDateTimeGap(localDateTime44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        int int48 = dateTime47.getEra();
        org.joda.time.DateTime.Property property49 = dateTime47.secondOfMinute();
        org.joda.time.DateTime dateTime51 = dateTime47.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.DateTime dateTime53 = dateTime47.minus(readableDuration52);
        int int54 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime23.minusHours(5);
        boolean boolean59 = dateTimeZone14.isLocalDateTimeGap(localDateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime32", (dateTime15.compareTo(dateTime32) == 0) == dateTime15.equals(dateTime32));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths(53628);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property10 = localDate9.centuryOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundHalfCeilingCopy();
        java.lang.Object obj12 = null;
        org.joda.time.tz.Provider provider13 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone15 = provider13.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj12, dateTimeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDate11.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight19 = localDate5.toDateMidnight(dateTimeZone15);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone15);
        java.util.TimeZone timeZone21 = dateTimeZone15.toTimeZone();
        int int23 = timeZone21.getOffset((long) 53820142);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone21);
        java.util.Calendar.Builder builder25 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder30 = builder25.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar31 = builder30.build();
        java.util.Calendar calendar32 = builder30.build();
        java.util.Calendar.Builder builder36 = builder30.setDate(605139, 14, 20);
        java.util.Calendar.Builder builder38 = builder36.setLenient(true);
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        java.util.TimeZone timeZone41 = dateTimeZone40.toTimeZone();
        timeZone41.setID("+00:00");
        timeZone41.setRawOffset(2);
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        java.util.TimeZone timeZone48 = dateTimeZone47.toTimeZone();
        timeZone48.setID("+00:00");
        boolean boolean51 = timeZone41.hasSameRules(timeZone48);
        java.util.Locale locale52 = java.util.Locale.CHINESE;
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(timeZone41, locale52);
        java.util.TimeZone.setDefault(timeZone41);
        java.util.Calendar.Builder builder55 = builder36.setTimeZone(timeZone41);
        java.util.TimeZone.setDefault(timeZone41);
        boolean boolean57 = timeZone21.hasSameRules(timeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar24 and calendar53", (calendar24.compareTo(calendar53) == 0) == calendar24.equals(calendar53));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(2);
        org.joda.time.Chronology chronology12 = dateTime11.getChronology();
        org.joda.time.Chronology chronology13 = dateTime11.getChronology();
        org.joda.time.MutableDateTime mutableDateTime14 = instant0.toMutableDateTime(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        org.joda.time.DateTime dateTime21 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalTime localTime23 = localTime17.plusMillis((-1));
        org.joda.time.LocalTime localTime25 = localTime17.minusSeconds(53626975);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime28 = localTime17.withPeriodAdded(readablePeriod26, 20);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        java.lang.String str33 = dateTimeZone30.getShortName((long) 5);
        java.lang.String str34 = dateTimeZone30.getID();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(readableDuration36, 32772);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        int int44 = dateTimeZone41.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) 0, dateTimeZone41);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime localTime48 = localTime46.minusSeconds((int) (byte) 1);
        int int49 = localTime48.getMillisOfDay();
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        java.lang.String str52 = dateTimeZone51.toString();
        int int54 = dateTimeZone51.getOffsetFromLocal((long) 53626948);
        long long56 = dateTimeZone51.nextTransition((long) 5);
        org.joda.time.DateTime dateTime57 = localTime48.toDateTimeToday(dateTimeZone51);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) readableDuration36, dateTimeZone51);
        org.joda.time.DateTime dateTime59 = localTime28.toDateTimeToday(dateTimeZone51);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.MutableDateTime mutableDateTime61 = mutableDateTime14.toMutableDateTime(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime5.getFieldTypes();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(chronology8);
        org.joda.time.DurationField durationField16 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfHalfday();
        int int18 = dateTimeField17.getMaximumValue();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        int int27 = dateTimeField24.getDifference(606L, (long) 1970);
        long long29 = dateTimeField24.remainder((long) (short) 1);
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeField24.getAsShortText(53635, locale31);
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale34.getDisplayName();
        java.util.Locale locale37 = new java.util.Locale("clockhourOfHalfday");
        java.lang.String str38 = locale34.getDisplayLanguage(locale37);
        java.lang.String str39 = dateTimeField24.getAsShortText((int) (byte) -1, locale37);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = locale37.getDisplayVariant(locale40);
        int int42 = dateTimeField17.getMaximumShortTextLength(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime20", (dateTime3.compareTo(dateTime20) == 0) == dateTime3.equals(dateTime20));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property4 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = localDate5.plusDays((int) '#');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        int int12 = dateTimeZone9.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone9);
        boolean boolean14 = dateTimeZone9.isFixed();
        int int16 = dateTimeZone9.getOffsetFromLocal(0L);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = dateTimeZone9.getName((long) 53648784, locale18);
        org.joda.time.DateTime dateTime20 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Instant instant23 = instant21.minus((long) 53905564);
        boolean boolean25 = instant23.isAfter((long) 53983558);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant21", (dateTime20.compareTo(instant21) == 0) == dateTime20.equals(instant21));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withCenturyOfEra(2);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withChronology(chronology7);
        boolean boolean9 = dateTimeFormatter2.isParser();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        java.lang.String str12 = dateTimeZone11.toString();
        int int14 = dateTimeZone11.getOffsetFromLocal((long) (short) -1);
        int int16 = dateTimeZone11.getStandardOffset((long) 13);
        long long19 = dateTimeZone11.convertLocalToUTC((long) 53641, true);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withZone(dateTimeZone11);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property22 = localDate21.centuryOfEra();
        org.joda.time.LocalDate localDate23 = property22.roundHalfCeilingCopy();
        java.lang.Object obj24 = null;
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone27 = provider25.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj24, dateTimeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate23.toDateTimeAtMidnight(dateTimeZone27);
        boolean boolean31 = dateTimeZone11.equals((java.lang.Object) localDate23);
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int39 = dateTime37.get(dateTimeFieldType38);
        int int40 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 0, dateTimeZone35);
        org.joda.time.LocalDate.Property property42 = localDate41.dayOfMonth();
        org.joda.time.LocalDate localDate43 = property42.withMinimumValue();
        boolean boolean44 = property42.isLeap();
        java.util.Locale locale46 = new java.util.Locale("hi!");
        java.lang.String str47 = locale46.getISO3Country();
        java.lang.String str48 = property42.getAsText(locale46);
        java.lang.String str49 = dateTimeZone11.getShortName((long) 53927152, locale46);
        long long51 = dateTimeZone11.convertUTCToLocal(53751L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime28", (dateTime4.compareTo(dateTime28) == 0) == dateTime4.equals(dateTime28));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        int int18 = localDate4.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate4.plus(readablePeriod19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate4.withPeriodAdded(readablePeriod21, 53700729);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        int int26 = dateTime25.getEra();
        int int27 = dateTime25.getSecondOfDay();
        org.joda.time.DateTime dateTime29 = dateTime25.minusYears(12);
        org.joda.time.DateTime dateTime31 = dateTime25.minusMinutes((-1));
        java.lang.String str32 = dateTime31.toString();
        org.joda.time.DateTime dateTime34 = dateTime31.minusYears(53628);
        org.joda.time.DateTime.Property property35 = dateTime34.centuryOfEra();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getEra();
        org.joda.time.DateTime.Property property39 = dateTime37.secondOfMinute();
        java.lang.String str40 = property39.getAsString();
        org.joda.time.DateTime dateTime42 = property39.addToCopy((int) (byte) 100);
        long long43 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Instant instant44 = dateTime42.toInstant();
        boolean boolean45 = localDate23.equals((java.lang.Object) dateTime42);
        int int46 = localDate23.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and instant44", (dateTime42.compareTo(instant44) == 0) == dateTime42.equals(instant44));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, 1970);
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) (byte) 100);
        int int8 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate10 = localDate5.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths(53628);
        org.joda.time.DateTime dateTime13 = localDate10.toDateTimeAtCurrentTime();
        int int14 = dateTime13.getWeekyear();
        boolean boolean15 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime17 = dateTime13.withMillis(4635773942400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime4", (instant0.compareTo(dateTime4) == 0) == instant0.equals(dateTime4));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.lang.String str6 = dateTimeZone5.toString();
        int int8 = dateTimeZone5.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtMidnight(dateTimeZone5);
        org.joda.time.LocalDate localDate11 = localDate0.plusDays((int) '4');
        org.joda.time.Chronology chronology12 = localDate0.getChronology();
        org.joda.time.DateTime dateTime13 = localDate0.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology14 = localDate0.getChronology();
        org.joda.time.LocalDate localDate16 = localDate0.plusMonths(4325914);
        java.util.Date date17 = localDate0.toDate();
        org.joda.time.DateTime dateTime18 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant20 = org.joda.time.Instant.parse("-51606-02-21T14:55:03.940Z");
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime22 = instant20.toDateTime();
        boolean boolean23 = dateTime18.equals((java.lang.Object) dateTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime21", (instant20.compareTo(mutableDateTime21) == 0) == instant20.equals(mutableDateTime21));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 53702);
        org.joda.time.DateTime dateTime3 = instant2.toDateTimeISO();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(2);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology9.add(readablePeriod10, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DurationField durationField15 = durationFieldType4.getField(chronology9);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours(10);
        org.joda.time.Chronology chronology18 = chronology9.withZone(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DateTimeField dateTimeField20 = chronology9.secondOfDay();
        org.joda.time.DateTime dateTime21 = dateTime3.withChronology(chronology9);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 53712, chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime3", (instant2.compareTo(dateTime3) == 0) == instant2.equals(dateTime3));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        int int3 = dateTime2.getEra();
        org.joda.time.DateTime.Property property4 = dateTime2.secondOfMinute();
        java.lang.String str5 = property4.getAsString();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        int int7 = instant0.get(dateTimeField6);
        org.joda.time.Chronology chronology8 = instant0.getChronology();
        org.joda.time.Instant instant10 = instant0.plus((long) 53652018);
        org.joda.time.MutableDateTime mutableDateTime11 = instant0.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant0.withDurationAdded(readableDuration12, 147210);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.minus(readableDuration15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime2", (instant16.compareTo(dateTime2) == 0) == instant16.equals(dateTime2));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant7", (dateTime8.compareTo(instant7) == 0) == dateTime8.equals(instant7));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(2922789);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime7.withMillis(2318587200000L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        org.joda.time.DateTime.Property property16 = dateTime14.secondOfMinute();
        org.joda.time.DateTime dateTime18 = dateTime14.withCenturyOfEra((int) ' ');
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime14.minus(readableDuration19);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        int int26 = dateTimeZone23.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 0, dateTimeZone23);
        java.util.Locale locale29 = java.util.Locale.CHINESE;
        java.lang.String str30 = dateTimeZone23.getName(0L, locale29);
        org.joda.time.DateTime dateTime31 = dateTime14.withZone(dateTimeZone23);
        boolean boolean33 = dateTimeZone23.isStandardOffset((long) 53811);
        org.joda.time.DateTime dateTime34 = dateTime12.toDateTime(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.hourOfDay();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField10", Math.signum(durationField6.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField6)));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate0.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate7 = localDate0.minusWeeks(12);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate0.minus(readablePeriod8);
        org.joda.time.LocalDate localDate11 = localDate9.plusMonths(101);
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtMidnight();
        java.lang.String str13 = dateTime12.toString();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        java.lang.String str16 = dateTime15.toString();
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.Instant instant18 = dateTime17.toInstant();
        org.joda.time.Instant instant20 = instant18.plus((long) 2021);
        org.joda.time.Instant instant22 = instant20.minus((long) 53917611);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant18", (dateTime12.compareTo(instant18) == 0) == dateTime12.equals(instant18));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = localDateTime1.getFieldTypes();
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology4.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology4.minuteOfHour();
        java.lang.String str11 = dateTimeField9.getAsText(53688289L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getEra();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTime dateTime18 = dateTime14.minusMonths((int) (byte) 10);
        int int19 = dateTime18.getWeekyear();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        timeZone24.setID("+00:00");
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone24, locale27);
        java.util.Calendar calendar29 = dateTime18.toCalendar(locale27);
        java.lang.String str30 = dateTimeField9.getAsText((long) 53785565, locale27);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = dateTimeField9.getType();
        int int33 = dateTimeField9.getMaximumValue(2324376000000L);
        java.util.Calendar.Builder builder35 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder40 = builder35.setTimeOfDay(14, (int) (short) 10, 22, 99);
        java.util.Calendar calendar41 = builder40.build();
        java.util.Calendar calendar42 = builder40.build();
        java.util.Calendar.Builder builder46 = builder40.setDate(605139, 14, 20);
        java.util.Calendar.Builder builder48 = builder46.setLenient(true);
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        java.util.TimeZone timeZone51 = dateTimeZone50.toTimeZone();
        timeZone51.setID("+00:00");
        timeZone51.setRawOffset(2);
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        timeZone58.setID("+00:00");
        boolean boolean61 = timeZone51.hasSameRules(timeZone58);
        java.util.Locale locale62 = java.util.Locale.CHINESE;
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone51, locale62);
        java.util.TimeZone.setDefault(timeZone51);
        java.util.Calendar.Builder builder65 = builder46.setTimeZone(timeZone51);
        java.util.Calendar.Builder builder69 = builder65.setWeekDate(53893302, 53863725, 53735601);
        java.util.Calendar.Builder builder73 = builder65.setTimeOfDay(53683575, 53917012, 180);
        org.joda.time.LocalDateTime localDateTime75 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray77 = localDateTime75.getFieldTypes();
        org.joda.time.Chronology chronology78 = localDateTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.weekyear();
        org.joda.time.DateTimeField dateTimeField80 = chronology78.yearOfEra();
        int int83 = dateTimeField80.getDifference((long) (-53637188), 343L);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = dateTimeField80.getType();
        java.util.Locale locale87 = new java.util.Locale("clockhourOfHalfday");
        boolean boolean88 = locale87.hasExtensions();
        java.util.Locale.setDefault(locale87);
        java.lang.String str90 = dateTimeField80.getAsShortText(9L, locale87);
        java.lang.String str91 = locale87.getISO3Country();
        java.util.Calendar.Builder builder92 = builder73.setLocale(locale87);
        java.lang.String str93 = dateTimeField9.getAsShortText(53811, locale87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar28 and calendar63", (calendar28.compareTo(calendar63) == 0) == calendar28.equals(calendar63));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 53629, 53647);
        long long4 = instant0.getMillis();
        org.joda.time.Chronology chronology5 = instant0.getChronology();
        org.joda.time.DateTime dateTime6 = instant0.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime6", (instant0.compareTo(dateTime6) == 0) == instant0.equals(dateTime6));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 53627827);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime6", (instant5.compareTo(dateTime6) == 0) == instant5.equals(dateTime6));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(53633931);
        java.lang.String str9 = dateTime7.toString("53635");
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime7.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        java.lang.String str13 = dateTimeFieldType11.toString();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.hourOfDay();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDurationAdded(readableDuration17, 7);
        org.joda.time.Chronology chronology20 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType11.getField(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.seconds();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property24 = dateTime23.year();
        org.joda.time.DateTime dateTime26 = dateTime23.minusYears(53803);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime dateTime29 = dateTime23.withField(dateTimeFieldType27, 53845524);
        int int30 = mutableDateTime10.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime23", (dateTime1.compareTo(dateTime23) == 0) == dateTime1.equals(dateTime23));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy(53629404);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime8.getFieldTypes();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.months();
        boolean boolean13 = durationFieldType6.isSupported(chronology11);
        org.joda.time.DateTimeField dateTimeField14 = chronology11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 53625);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime25 = property22.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfSecond(11);
        int[] intArray29 = chronology11.get((org.joda.time.ReadablePartial) localDateTime27, (long) 53642476);
        org.joda.time.DurationField durationField30 = chronology11.weeks();
        org.joda.time.DateTime dateTime31 = org.joda.time.DateTime.now(chronology11);
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        java.lang.String str34 = dateTimeZone33.toString();
        java.lang.String str36 = dateTimeZone33.getShortName((long) 32772);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime38 = dateTime31.toDateTime(dateTimeZone33);
        int int39 = dateTime31.getYearOfCentury();
        boolean boolean40 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getDurationType();
        java.lang.String str43 = dateTimeFieldType41.toString();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.hourOfDay();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withDurationAdded(readableDuration47, 7);
        org.joda.time.Chronology chronology50 = localDateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType41.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.clockhourOfHalfday();
        org.joda.time.DurationField durationField53 = chronology50.years();
        org.joda.time.DateTime dateTime54 = org.joda.time.DateTime.now(chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        long long59 = chronology50.add(readablePeriod56, 1645455275000L, 53666699);
        org.joda.time.DateTimeZone dateTimeZone60 = chronology50.getZone();
        int int62 = dateTimeZone60.getOffset((long) 53671);
        long long66 = dateTimeZone60.convertLocalToUTC(0L, false, 1694358359856054610L);
        org.joda.time.DateTime dateTime67 = dateTime5.withZone(dateTimeZone60);
        long long70 = dateTimeZone60.adjustOffset((long) 54088753, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime31", (dateTime1.compareTo(dateTime31) == 0) == dateTime1.equals(dateTime31));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.minus(readableDuration27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant26.withDurationAdded(readableDuration29, 53700525);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant31", (dateTime1.compareTo(instant31) == 0) == dateTime1.equals(instant31));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        org.joda.time.Instant instant29 = instant26.minus(922L);
        org.joda.time.DateTime dateTime30 = instant26.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray34 = localDateTime32.getFieldTypes();
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.weekOfWeekyear();
        org.joda.time.DurationField durationField38 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology35.getZone();
        org.joda.time.DateTime dateTime43 = dateTime30.toDateTime(dateTimeZone42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withDurationAdded(readableDuration6, 7);
        org.joda.time.Chronology chronology9 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfWeek();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology9);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        java.lang.String str17 = dateTimeZone16.toString();
        int int19 = dateTimeZone16.getOffsetFromLocal((long) (short) -1);
        int int21 = dateTimeZone16.getStandardOffset((long) 13);
        long long24 = dateTimeZone16.convertLocalToUTC((long) 53641, true);
        long long28 = dateTimeZone16.convertLocalToUTC((long) 894, true, 1645455270000L);
        org.joda.time.DateTime dateTime29 = dateTime14.withZoneRetainFields(dateTimeZone16);
        java.lang.String str31 = dateTimeZone16.getShortName((long) 53779);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime29", (dateTime14.compareTo(dateTime29) == 0) == dateTime14.equals(dateTime29));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant9 = instant7.plus((long) 53925523);
        org.joda.time.Instant instant12 = instant9.withDurationAdded(0L, 53647287);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant7", (dateTime1.compareTo(instant7) == 0) == dateTime1.equals(instant7));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Instant instant7 = dateTime4.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = dateTime4.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = dateTime4.plusMonths(8);
        java.lang.String str12 = dateTime11.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant7", (dateTime4.compareTo(instant7) == 0) == dateTime4.equals(instant7));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime1.toDateTime();
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant9 = instant7.plus((long) 53925523);
        org.joda.time.Chronology chronology10 = instant7.getChronology();
        org.joda.time.Instant instant12 = instant7.plus((long) 54041187);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.minus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant7", (dateTime1.compareTo(instant7) == 0) == dateTime1.equals(instant7));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        int int3 = dateTime1.getSecondOfDay();
        org.joda.time.DateTime dateTime5 = dateTime1.minusYears(12);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 1970);
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) instant8);
        org.joda.time.Instant instant14 = instant8.withMillis(0L);
        org.joda.time.Instant instant16 = instant14.withMillis((long) 53963246);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant8", (dateTime1.compareTo(instant8) == 0) == dateTime1.equals(instant8));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale locale3 = java.util.Locale.CHINESE;
        java.util.Locale.Builder builder4 = builder1.setLocale(locale3);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        timeZone7.setID("+00:00");
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7, locale10);
        java.util.Locale.Builder builder12 = builder1.setLocale(locale10);
        java.util.Locale.Builder builder13 = builder12.clearExtensions();
        java.util.Locale.Builder builder14 = builder12.clearExtensions();
        java.util.Locale locale15 = builder12.build();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(2);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology20.add(readablePeriod21, (long) 53633152, 99);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField27 = chronology20.hourOfDay();
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        java.util.TimeZone timeZone31 = dateTimeZone30.toTimeZone();
        int int33 = dateTimeZone30.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 0, dateTimeZone30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        int int37 = dateTime36.getEra();
        org.joda.time.DateTime.Property property38 = dateTime36.secondOfMinute();
        java.lang.String str39 = property38.getAsString();
        org.joda.time.DateTime dateTime41 = property38.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime42 = property38.roundHalfCeilingCopy();
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        java.util.TimeZone timeZone45 = dateTimeZone44.toTimeZone();
        timeZone45.setID("+00:00");
        timeZone45.setRawOffset(2);
        java.util.TimeZone timeZone50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        java.util.TimeZone timeZone52 = dateTimeZone51.toTimeZone();
        timeZone52.setID("+00:00");
        boolean boolean55 = timeZone45.hasSameRules(timeZone52);
        java.util.Locale locale56 = java.util.Locale.CHINESE;
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(timeZone45, locale56);
        java.lang.String str58 = locale56.getLanguage();
        java.lang.String str59 = locale56.getDisplayLanguage();
        java.lang.String str60 = locale56.getCountry();
        java.util.Calendar calendar61 = dateTime42.toCalendar(locale56);
        java.lang.String str62 = dateTimeField27.getAsText((org.joda.time.ReadablePartial) localTime34, locale56);
        java.util.Locale locale64 = new java.util.Locale("2022-02-21T14:54:47.855Z");
        java.lang.String str65 = locale64.toLanguageTag();
        int int66 = dateTimeField27.getMaximumShortTextLength(locale64);
        java.lang.String str67 = locale15.getDisplayName(locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar11 and calendar57", (calendar11.compareTo(calendar57) == 0) == calendar11.equals(calendar57));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 10);
        org.joda.time.ReadableInstant readableInstant2 = null;
        boolean boolean3 = instant1.isAfter(readableInstant2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withDurationAdded((long) 53698730, 53684);
        boolean boolean8 = instant1.isAfterNow();
        org.joda.time.DateTime dateTime9 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusWeeks(53789816);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withDurationAdded(readableDuration15, 1);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime14.toYearMonthDay();
        org.joda.time.DateTime dateTime20 = dateTime14.withDayOfYear((int) 'x');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property22 = localDate21.centuryOfEra();
        org.joda.time.LocalDate localDate23 = property22.roundHalfCeilingCopy();
        java.lang.Object obj24 = null;
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone27 = provider25.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj24, dateTimeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDate23.toDateTimeAtMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = dateTime20.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime20.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime20.getZone();
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getDisplayScript();
        java.util.Locale.setDefault(locale35);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale38.getDisplayName();
        java.lang.String str40 = locale38.getISO3Country();
        java.util.Locale locale41 = locale38.stripExtensions();
        java.lang.String str42 = locale35.getDisplayName(locale38);
        java.lang.String str43 = dateTime20.toString("40", locale38);
        java.lang.String str44 = locale38.getISO3Country();
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale38);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int49 = dateTime47.get(dateTimeFieldType48);
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime47.toMutableDateTimeISO();
        int int51 = dateTime47.getMillisOfSecond();
        org.joda.time.DateTime dateTime52 = dateTime47.toDateTime();
        org.joda.time.Instant instant53 = dateTime52.toInstant();
        boolean boolean54 = calendar45.before((java.lang.Object) instant53);
        int int55 = calendar45.getFirstDayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant53", (dateTime28.compareTo(instant53) == 0) == dateTime28.equals(instant53));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("4");
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.withMillis((long) 536752);
        org.joda.time.Instant instant6 = instant1.plus((long) 53908606);
        org.joda.time.Instant instant8 = instant1.plus(16662207684933L);
        long long9 = instant8.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:54:52.912Z");
        java.lang.String str2 = timeZone1.getID();
        timeZone1.setRawOffset(0);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale5.getDisplayName();
        java.lang.String str7 = locale5.getISO3Country();
        java.util.Set<java.lang.String> strSet8 = locale5.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        int int16 = dateTime15.getEra();
        org.joda.time.DateTime dateTime17 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getEra();
        int int21 = dateTime19.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.plus(readableDuration22);
        boolean boolean24 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean25 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime15);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTime dateTime28 = dateTime15.withZone(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.tz.NameProvider nameProvider31 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider31);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        java.util.TimeZone timeZone35 = dateTimeZone34.toTimeZone();
        timeZone35.setID("+00:00");
        timeZone35.setRawOffset(2);
        java.util.TimeZone timeZone40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        java.util.TimeZone timeZone42 = dateTimeZone41.toTimeZone();
        timeZone42.setID("+00:00");
        boolean boolean45 = timeZone35.hasSameRules(timeZone42);
        java.util.Locale locale46 = java.util.Locale.CHINESE;
        java.util.Calendar calendar47 = java.util.Calendar.getInstance(timeZone35, locale46);
        java.lang.String str48 = locale46.getLanguage();
        java.lang.String str51 = nameProvider31.getName(locale46, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale locale53 = new java.util.Locale("hi!");
        java.lang.String str54 = locale53.getISO3Country();
        java.util.Locale locale55 = locale53.stripExtensions();
        java.lang.String str56 = locale53.getScript();
        java.lang.String str58 = locale53.getUnicodeLocaleType("57");
        java.lang.String str61 = nameProvider31.getShortName(locale53, "49", "GMT");
        java.lang.String str62 = dateTimeZone27.getShortName((long) 32770, locale53);
        java.lang.String str63 = locale5.getDisplayCountry(locale53);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone1, locale5);
        java.util.TimeZone timeZone65 = calendar64.getTimeZone();
        int int66 = timeZone65.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar47 and calendar64", (calendar47.compareTo(calendar64) == 0) == calendar47.equals(calendar64));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime dateTime8 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getEra();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.plus(readableDuration13);
        boolean boolean15 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime10);
        boolean boolean16 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime6);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = dateTime6.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getEra();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfMinute();
        org.joda.time.DateTime dateTime25 = dateTime21.withCenturyOfEra((int) ' ');
        boolean boolean26 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime21);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        int int32 = dateTimeZone29.getOffsetFromLocal((long) 12);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 0, dateTimeZone29);
        int int34 = localTime33.size();
        org.joda.time.Chronology chronology35 = localTime33.getChronology();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) dateTime6, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        int int39 = dateTime38.getEra();
        org.joda.time.DateTime.Property property40 = dateTime38.secondOfMinute();
        java.lang.String str41 = property40.getAsString();
        org.joda.time.DateTimeField dateTimeField42 = property40.getField();
        long long44 = dateTimeField42.remainder((long) 53650);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(chronology49);
        int int51 = dateTime50.getEra();
        org.joda.time.DateTime dateTime52 = localTime48.toDateTime((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.LocalTime localTime54 = localTime48.plusMillis((-1));
        org.joda.time.LocalTime.Property property55 = localTime54.millisOfSecond();
        java.util.Locale locale57 = java.util.Locale.forLanguageTag("Fri Feb 08 23:01:00 GMT+00:00 1901");
        int int58 = property55.getMaximumShortTextLength(locale57);
        java.util.Locale locale60 = java.util.Locale.forLanguageTag("46");
        java.lang.String str61 = locale57.getDisplayName(locale60);
        java.lang.String str62 = dateTimeField42.getAsShortText((-2174086740000L), locale57);
        int int63 = dateTime36.get(dateTimeField42);
        org.joda.time.DateTime dateTime65 = dateTime36.plusSeconds(899);
        org.joda.time.DateTime dateTime66 = dateTime65.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime36", (dateTime1.compareTo(dateTime36) == 0) == dateTime1.equals(dateTime36));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        long long7 = dateTime6.getMillis();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        long long10 = instant9.getMillis();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((long) 1320, 558);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant9.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime17 = instant15.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant15", (dateTime6.compareTo(instant15) == 0) == dateTime6.equals(instant15));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.withWeekyear((int) (short) 0);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readablePeriod17);
        boolean boolean19 = dateTime11.isEqual((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime.Property property20 = dateTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = dateTime18.toLocalTime();
        int int22 = dateTime18.getWeekyear();
        org.joda.time.Instant instant23 = dateTime18.toInstant();
        org.joda.time.DateTime dateTime25 = dateTime18.plusHours(53631);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant23", (dateTime1.compareTo(instant23) == 0) == dateTime1.equals(instant23));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 5);
        boolean boolean12 = localDate4.equals((java.lang.Object) str11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        boolean boolean17 = localDate4.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property18 = localDate4.dayOfWeek();
        org.joda.time.DateTime dateTime19 = localDate4.toDateTimeAtMidnight();
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone22 = dateTimeZone21.toTimeZone();
        int int24 = dateTimeZone21.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone21);
        int int26 = localDate25.size();
        int int27 = localDate25.getWeekOfWeekyear();
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.lang.String str30 = dateTimeZone29.toString();
        org.joda.time.DateTime dateTime31 = localDate25.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime19.toMutableDateTime(dateTimeZone29);
        org.joda.time.Instant instant33 = dateTime19.toInstant();
        org.joda.time.DateTimeZone dateTimeZone34 = instant33.getZone();
        boolean boolean35 = dateTimeZone34.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and instant33", (dateTime19.compareTo(instant33) == 0) == dateTime19.equals(instant33));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        int int3 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate.Property property4 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = localDate5.plusDays((int) '#');
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        int int12 = dateTimeZone9.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone9);
        boolean boolean14 = dateTimeZone9.isFixed();
        int int16 = dateTimeZone9.getOffsetFromLocal(0L);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = dateTimeZone9.getName((long) 53648784, locale18);
        org.joda.time.DateTime dateTime20 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.Instant instant21 = dateTime20.toInstant();
        org.joda.time.Instant instant23 = instant21.minus((long) 53905564);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant21.minus(readableDuration24);
        org.joda.time.Instant instant27 = instant25.withMillis(1645455477000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant25", (dateTime20.compareTo(instant25) == 0) == dateTime20.equals(instant25));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.getDateTime();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        int int9 = dateTime7.compareTo((org.joda.time.ReadableInstant) instant8);
        long long10 = instant8.getMillis();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant8.withDurationAdded(readableDuration11, 0);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant14", (dateTime1.compareTo(instant14) == 0) == dateTime1.equals(instant14));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        org.joda.time.DateTime dateTime6 = property3.setCopy("46", locale5);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property8 = dateTime6.weekyear();
        org.joda.time.DateTime dateTime10 = property8.addToCopy(53663528);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(53753);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime14.toMutableDateTimeISO();
        int int18 = dateTime14.getMillisOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        int int22 = dateTime20.getSecondOfDay();
        org.joda.time.DateTime dateTime24 = dateTime20.minusYears(12);
        boolean boolean25 = dateTime14.isBefore((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime28 = dateTime24.withDurationAdded(0L, (int) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime24.withEarlierOffsetAtOverlap();
        int int30 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime29);
        java.lang.String str31 = dateTimeZone12.getID();
        org.joda.time.DateTime dateTime32 = dateTime10.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths(43);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(12);
        org.joda.time.LocalTime localTime40 = null;
        org.joda.time.DateTime dateTime41 = localDate39.toDateTime(localTime40);
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        java.util.TimeZone timeZone44 = dateTimeZone43.toTimeZone();
        java.lang.String str46 = dateTimeZone43.getShortName((long) 5);
        boolean boolean47 = localDate39.equals((java.lang.Object) str46);
        org.joda.time.LocalDate.Property property48 = localDate39.yearOfEra();
        org.joda.time.LocalDate localDate49 = property48.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate52 = localDate49.withPeriodAdded(readablePeriod50, 53);
        org.joda.time.LocalDate.Property property53 = localDate52.weekyear();
        org.joda.time.LocalDate localDate54 = property53.withMaximumValue();
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        java.util.TimeZone timeZone57 = dateTimeZone56.toTimeZone();
        int int59 = dateTimeZone56.getOffsetFromLocal((long) 12);
        org.joda.time.DateTime dateTime60 = org.joda.time.DateTime.now(dateTimeZone56);
        java.lang.String str62 = dateTimeZone56.getNameKey((long) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        org.joda.time.DateTime dateTime64 = localDate54.toDateTimeAtMidnight(dateTimeZone56);
        long long66 = dateTimeZone56.convertUTCToLocal((long) 53858312);
        boolean boolean68 = dateTimeZone56.isStandardOffset((long) 53728661);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((java.lang.Object) dateTime32, dateTimeZone56);
        org.joda.time.DateTime dateTime70 = dateTime69.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime32", (dateTime10.compareTo(dateTime32) == 0) == dateTime10.equals(dateTime32));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        int int4 = dateTimeZone1.getOffsetFromLocal((long) 12);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone1);
        int int6 = localDate5.size();
        int int7 = localDate5.getWeekOfWeekyear();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.Instant instant12 = dateTime11.toInstant();
        org.joda.time.Instant instant14 = instant12.withMillis((long) 53762);
        org.joda.time.Instant instant16 = instant12.plus((long) 53675);
        org.joda.time.Instant instant18 = instant16.plus((long) 54199138);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant12", (dateTime11.compareTo(instant12) == 0) == dateTime11.equals(instant12));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant0.withDurationAdded((long) 53629, 53647);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.DateTime dateTime6 = instant3.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and instant3", (mutableDateTime4.compareTo(instant3) == 0) == mutableDateTime4.equals(instant3));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DurationField durationField24 = chronology5.weeks();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology5);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName((long) 32772);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime25.toDateTime(dateTimeZone27);
        int int33 = dateTime25.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime36 = dateTime25.withPeriodAdded(readablePeriod34, 53829076);
        int int37 = dateTime25.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime25", (dateTime31.compareTo(dateTime25) == 0) == dateTime31.equals(dateTime25));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        org.joda.time.Instant instant29 = instant26.minus(922L);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) instant29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        long long7 = dateTime6.getMillis();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        long long10 = instant9.getMillis();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((long) 1320, 558);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant9.minus(readableDuration14);
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant15", (dateTime6.compareTo(instant15) == 0) == dateTime6.equals(instant15));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMillis(53625);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfEra(53634);
        int int8 = localDateTime5.getDayOfWeek();
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.DateTime dateTime11 = dateTime1.withChronology(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(753L);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime17 = dateTime14.withMillis((long) 53805706);
        int int18 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.Instant instant27 = instant26.toInstant();
        org.joda.time.Instant instant30 = instant26.withDurationAdded((long) 54146, 58295168);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        int int4 = localDateTime2.getYear();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        int int10 = localDateTime8.getYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes(53655);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        java.lang.String str17 = dateTimeFieldType15.toString();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.hourOfDay();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDurationAdded(readableDuration21, 7);
        org.joda.time.Chronology chronology24 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.DurationField durationField26 = chronology24.seconds();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField28 = chronology24.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withPeriodAdded(readablePeriod33, 53625);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.year();
        org.joda.time.LocalDateTime localDateTime38 = property36.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime39 = property36.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = property36.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        boolean boolean43 = dateTimeZone41.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray48 = localDateTime46.getFieldTypes();
        org.joda.time.Chronology chronology49 = localDateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.weekOfWeekyear();
        org.joda.time.DurationField durationField52 = chronology49.days();
        org.joda.time.DateTimeField dateTimeField53 = chronology49.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField54 = chronology49.dayOfWeek();
        org.joda.time.DurationField durationField55 = chronology49.minutes();
        org.joda.time.DateTime dateTime56 = dateTime44.toDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.hourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.plusMillis((int) (byte) 10);
        int[] intArray63 = chronology49.get((org.joda.time.ReadablePartial) localDateTime58, (long) 54);
        chronology24.validate((org.joda.time.ReadablePartial) localDateTime40, intArray63);
        chronology5.validate((org.joda.time.ReadablePartial) localDateTime14, intArray63);
        org.joda.time.DateTimeField dateTimeField66 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField67 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType0.getField(chronology5);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        int int71 = dateTime70.getEra();
        org.joda.time.DateTime.Property property72 = dateTime70.secondOfMinute();
        java.lang.String str73 = property72.getAsString();
        org.joda.time.DateTimeField dateTimeField74 = property72.getField();
        int int76 = dateTimeField74.get((long) ' ');
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.millisOfDay();
        org.joda.time.LocalDateTime.Property property80 = localDateTime78.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime78.plusSeconds(6);
        int int83 = localDateTime78.getYear();
        int[] intArray90 = new int[] { (short) 10, 6, 53629404, 3, '4', (short) 0 };
        int int91 = dateTimeField74.getMaximumValue((org.joda.time.ReadablePartial) localDateTime78, intArray90);
        int int92 = localDateTime78.size();
        int int93 = localDateTime78.getHourOfDay();
        org.joda.time.LocalDateTime.Property property94 = localDateTime78.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property95 = localDateTime78.yearOfEra();
        org.joda.time.LocalDateTime.Property property96 = localDateTime78.millisOfDay();
        org.joda.time.LocalDateTime localDateTime98 = property96.addToCopy((long) 53983825);
        int int99 = dateTimeField68.getMinimumValue((org.joda.time.ReadablePartial) localDateTime98);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime70", (dateTime27.compareTo(dateTime70) == 0) == dateTime27.equals(dateTime70));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime2.getFieldTypes();
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        boolean boolean7 = durationFieldType0.isSupported(chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withPeriodAdded(readablePeriod13, 53625);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.year();
        org.joda.time.LocalDateTime localDateTime18 = property16.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime19 = property16.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfSecond(11);
        int[] intArray23 = chronology5.get((org.joda.time.ReadablePartial) localDateTime21, (long) 53642476);
        org.joda.time.DurationField durationField24 = chronology5.weeks();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology5);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str28 = dateTimeZone27.toString();
        java.lang.String str30 = dateTimeZone27.getShortName((long) 32772);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime25.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long) (short) -1);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property35.addToCopy((long) 3);
        org.joda.time.LocalDateTime localDateTime38 = property35.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime39 = property35.getLocalDateTime();
        int int40 = localDateTime39.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime39.withMillisOfDay(536878);
        boolean boolean43 = dateTimeZone27.isLocalDateTimeGap(localDateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime31", (dateTime25.compareTo(dateTime31) == 0) == dateTime25.equals(dateTime31));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.now(dateTimeZone1);
        long long3 = dateTime2.getMillis();
        org.joda.time.tz.Provider provider5 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone7 = provider5.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(0L, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTime(dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime2.minus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime12.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime8", (dateTime12.compareTo(dateTime8) == 0) == dateTime12.equals(dateTime8));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(53654002);
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int6 = dateTime4.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime4.toMutableDateTimeISO();
        int int8 = dateTime4.getMillisOfDay();
        boolean boolean10 = dateTime4.isEqual(100L);
        org.joda.time.DateTime dateTime11 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property14 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate15 = property14.roundHalfCeilingCopy();
        java.lang.Object obj16 = null;
        org.joda.time.tz.Provider provider17 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone19 = provider17.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj16, dateTimeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        long long24 = dateTimeZone19.nextTransition((long) 53662);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 53659798, dateTimeZone19);
        org.joda.time.DateTime dateTime26 = dateTime11.toDateTime(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime2.toMutableDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfDay();
        org.joda.time.LocalDateTime.Property property31 = localDateTime29.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime29.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.plusMinutes(53);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.minusWeeks((int) '4');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime29.withWeekyear(20);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(chronology40);
        int int42 = dateTime41.getEra();
        org.joda.time.DateTime.Property property43 = dateTime41.secondOfMinute();
        java.lang.String str44 = property43.getAsString();
        org.joda.time.DateTime dateTime46 = property43.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime47 = property43.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime49 = dateTime47.minusSeconds(2922789);
        org.joda.time.DateTime dateTime50 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime29.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property51.getFieldType();
        org.joda.time.Interval interval53 = property51.toInterval();
        org.joda.time.LocalDateTime localDateTime55 = property51.addToCopy((long) 53832670);
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        java.util.TimeZone timeZone58 = dateTimeZone57.toTimeZone();
        java.lang.String str60 = dateTimeZone57.getShortName((long) 5);
        java.lang.String str61 = dateTimeZone57.getID();
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(dateTimeZone57);
        org.joda.time.DateTime dateTime64 = dateTime62.withYear(53650);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property67 = localDateTime66.millisOfDay();
        org.joda.time.LocalDateTime.Property property68 = localDateTime66.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime66.plusSeconds(6);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.minus(readablePeriod71);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.plusSeconds((int) (short) -1);
        int int75 = localDateTime72.getMillisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDateTime localDateTime77 = localDateTime72.minus(readablePeriod76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime72.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DurationFieldType durationFieldType80 = dateTimeFieldType79.getRangeDurationType();
        java.lang.String str81 = dateTimeFieldType79.toString();
        int int82 = localDateTime72.indexOf(dateTimeFieldType79);
        org.joda.time.format.DateTimePrinter dateTimePrinter83 = null;
        org.joda.time.format.DateTimeParser dateTimeParser84 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter85 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter83, dateTimeParser84);
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(chronology86);
        org.joda.time.DateTime dateTime89 = dateTime87.withCenturyOfEra(2);
        org.joda.time.Chronology chronology90 = dateTime89.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter85.withChronology(chronology90);
        org.joda.time.DurationField durationField92 = chronology90.years();
        org.joda.time.DateTimeField dateTimeField93 = dateTimeFieldType79.getField(chronology90);
        boolean boolean94 = dateTime62.isSupported(dateTimeFieldType79);
        org.joda.time.LocalDateTime.Property property95 = localDateTime55.property(dateTimeFieldType79);
        int int96 = mutableDateTime27.get(dateTimeFieldType79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime4", (dateTime2.compareTo(dateTime4) == 0) == dateTime2.equals(dateTime4));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime1.toMutableDateTimeISO();
        int int5 = dateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getEra();
        int int9 = dateTime7.getSecondOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.minusYears(12);
        boolean boolean12 = dateTime1.isBefore((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfYear((int) (byte) 100);
        int int16 = localDate13.getDayOfWeek();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str19 = dateTimeZone18.toString();
        int int21 = dateTimeZone18.getOffsetFromLocal((long) (short) -1);
        org.joda.time.DateTime dateTime22 = localDate13.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime25 = dateTime1.minusDays(0);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((java.lang.Object) dateTime1);
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTimeISO();
        boolean boolean28 = instant26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = instant26.toDateTimeISO();
        org.joda.time.Instant instant31 = instant26.withMillis(3600000L);
        org.joda.time.Instant instant33 = instant26.plus((long) 53864693);
        org.joda.time.MutableDateTime mutableDateTime34 = instant33.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant26", (dateTime1.compareTo(instant26) == 0) == dateTime1.equals(instant26));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(12);
        org.joda.time.LocalTime localTime5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTime(localTime5);
        long long7 = dateTime6.getMillis();
        int int8 = dateTime6.getYearOfEra();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        long long10 = instant9.getMillis();
        org.joda.time.Instant instant13 = instant9.withDurationAdded((long) 1320, 558);
        java.lang.Object obj14 = null;
        org.joda.time.tz.Provider provider15 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone17 = provider15.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj14, dateTimeZone17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getEra();
        org.joda.time.DateTime.Property property22 = dateTime20.secondOfMinute();
        java.lang.String str23 = property22.getAsString();
        org.joda.time.DateTime dateTime25 = property22.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime26 = property22.getDateTime();
        int int27 = dateTime18.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime26.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 0);
        org.joda.time.DateTime dateTime32 = dateTime26.withZone(dateTimeZone31);
        boolean boolean33 = instant9.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.DateTime.Property property34 = dateTime32.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant9", (dateTime6.compareTo(instant9) == 0) == dateTime6.equals(instant9));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.DateTime dateTime6 = property3.addToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusSeconds(2922789);
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime7.weekOfWeekyear();
        org.joda.time.DateTime dateTime12 = property11.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant10", (dateTime7.compareTo(instant10) == 0) == dateTime7.equals(instant10));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getEra();
        org.joda.time.DateTime dateTime6 = localTime2.toDateTime((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getEra();
        int int10 = dateTime8.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime8.plus(readableDuration11);
        boolean boolean13 = dateTime4.isBefore((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTime dateTime15 = dateTime4.minusMonths(53628014);
        org.joda.time.DateTime.Property property16 = dateTime4.yearOfCentury();
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime19 = dateTime4.toDateTime(dateTimeZone18);
        org.joda.time.Instant instant21 = new org.joda.time.Instant(1645455243000L);
        org.joda.time.Chronology chronology22 = instant21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.withChronology(chronology22);
        java.lang.String str24 = chronology22.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getEra();
        org.joda.time.DateTime.Property property5 = dateTime3.secondOfMinute();
        java.lang.String str6 = property5.getAsString();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        int int8 = instant1.get(dateTimeField7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(2);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.Chronology chronology14 = dateTime12.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = instant1.toMutableDateTime(chronology14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(138829455299998L, chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime3", (instant1.compareTo(dateTime3) == 0) == instant1.equals(dateTime3));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.isStandardOffset((long) 53642);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime5.getFieldTypes();
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField11 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField14 = chronology8.minutes();
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(chronology8);
        org.joda.time.DurationField durationField16 = chronology8.years();
        org.joda.time.DurationField durationField17 = chronology8.minutes();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.dayOfWeek();
        org.joda.time.DurationField durationField19 = chronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = chronology8.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField16 and durationField19", (durationField16.compareTo(durationField19) == 0) == durationField16.equals(durationField19));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfMinute();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getDisplayName();
        java.lang.String str12 = locale10.getISO3Country();
        long long13 = dateTimeField7.set((long) 53635206, "55", locale10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField7.getType();
        org.joda.time.DateTime dateTime16 = dateTime1.withField(dateTimeFieldType14, 894);
        int int17 = dateTime1.getMonthOfYear();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra(12);
        org.joda.time.LocalTime localTime23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTime(localTime23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        java.lang.String str29 = dateTimeZone26.getShortName((long) 5);
        boolean boolean30 = localDate22.equals((java.lang.Object) str29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int34 = dateTime32.get(dateTimeFieldType33);
        boolean boolean35 = localDate22.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDate.Property property36 = localDate22.dayOfWeek();
        org.joda.time.DateTime dateTime37 = localDate22.toDateTimeAtMidnight();
        org.joda.time.tz.Provider provider39 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone41 = provider39.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(15778476000L, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = localDate22.toDateMidnight(dateTimeZone41);
        long long47 = dateTimeZone41.convertLocalToUTC((long) 53635206, true);
        org.joda.time.DateTime dateTime48 = dateTime1.toDateTime(dateTimeZone41);
        boolean boolean50 = dateTimeZone41.isStandardOffset((-62135596800000L));
        java.lang.String str51 = dateTimeZone41.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime42", (dateTime1.compareTo(dateTime42) == 0) == dateTime1.equals(dateTime42));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("0012-04-10");
        org.joda.time.Instant instant3 = instant1.plus((long) 53793);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear((int) (byte) 100);
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfEra(12);
        org.joda.time.LocalTime localTime9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTime(localTime9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        java.lang.String str15 = dateTimeZone12.getShortName((long) 5);
        boolean boolean16 = localDate8.equals((java.lang.Object) str15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        int int20 = dateTime18.get(dateTimeFieldType19);
        boolean boolean21 = localDate8.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate.Property property22 = localDate8.dayOfWeek();
        org.joda.time.DateTime dateTime23 = localDate8.toDateTimeAtMidnight();
        org.joda.time.tz.Provider provider25 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone dateTimeZone27 = provider25.getZone("Etc/UTC");
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(15778476000L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = localDate8.toDateMidnight(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = instant1.toDateTime(dateTimeZone27);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime23", (instant1.compareTo(dateTime23) == 0) == instant1.equals(dateTime23));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded(readablePeriod4, 53625);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        java.lang.String str9 = dateTimeZone8.toString();
        java.lang.String str11 = dateTimeZone8.getShortName((long) 32772);
        long long14 = dateTimeZone8.adjustOffset((long) (byte) 10, true);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) readablePeriod4, dateTimeZone8);
        boolean boolean17 = dateTimeZone8.isStandardOffset(0L);
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        java.util.TimeZone timeZone23 = dateTimeZone22.toTimeZone();
        timeZone23.setID("+00:00");
        timeZone23.setRawOffset(2);
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        java.util.TimeZone timeZone30 = dateTimeZone29.toTimeZone();
        timeZone30.setID("+00:00");
        boolean boolean33 = timeZone23.hasSameRules(timeZone30);
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone23, locale34);
        java.lang.String str36 = locale34.getLanguage();
        java.lang.String str39 = nameProvider19.getName(locale34, "2022-02-21T14:54:52.912Z", "clockhourofhalfday");
        java.util.Locale.Category category40 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale41 = java.util.Locale.KOREA;
        java.lang.String str42 = locale41.getDisplayName();
        java.lang.String str43 = locale41.getISO3Country();
        java.util.Locale.setDefault(category40, locale41);
        java.util.Locale locale45 = java.util.Locale.getDefault(category40);
        java.lang.String str46 = locale34.getDisplayLanguage(locale45);
        java.lang.String str47 = dateTimeZone8.getName((long) 53774974, locale34);
        int int49 = dateTimeZone8.getOffset((long) 53890387);
        java.util.Locale locale51 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        java.util.TimeZone timeZone54 = dateTimeZone53.toTimeZone();
        timeZone54.setID("+00:00");
        java.util.TimeZone.setDefault(timeZone54);
        java.util.Locale locale59 = new java.util.Locale("2022-02-21T14:54:47.855Z");
        java.util.Calendar calendar60 = java.util.Calendar.getInstance(timeZone54, locale59);
        java.lang.String str61 = locale51.getDisplayLanguage(locale59);
        java.lang.String str62 = dateTimeZone8.getShortName((long) 53911772, locale59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar35 and calendar60", (calendar35.compareTo(calendar60) == 0) == calendar35.equals(calendar60));
    }
}

