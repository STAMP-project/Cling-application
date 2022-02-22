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
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        org.joda.time.DateTime dateTime9 = dateTime1.withCenturyOfEra(895);
        int int10 = dateTime1.getSecondOfDay();
        org.joda.time.Instant instant11 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime13 = dateTime1.minus(322L);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks(322);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType11, 128);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(596);
        org.joda.time.DateTime.Property property18 = dateTime17.year();
        org.joda.time.Instant instant19 = dateTime17.toInstant();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(165);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.DateTime dateTime32 = dateTime29.plusDays(719);
        org.joda.time.DateTime dateTime34 = dateTime32.minusDays(336);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int42 = dateTime36.get(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.Chronology chronology45 = localDateTime43.getChronology();
        boolean boolean46 = dateTimeFieldType41.isSupported(chronology45);
        org.joda.time.DateTime.Property property47 = dateTime32.property(dateTimeFieldType41);
        boolean boolean48 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.YearMonthDay yearMonthDay49 = dateTime32.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant19", (dateTime17.compareTo(instant19) == 0) == dateTime17.equals(instant19));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        java.util.TimeZone timeZone5 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        boolean boolean9 = dateTimeFormatter8.isParser();
        java.util.Locale locale10 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter8.withLocale(locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        int int13 = dateTimeFormatter12.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        int int21 = localDateTime19.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        boolean boolean25 = dateTimeZone18.isLocalDateTimeGap(localDateTime23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 2022, dateTimeZone18);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter16.withZone(dateTimeZone18);
        long long30 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone18, 1645488000000L);
        java.util.TimeZone timeZone31 = fixedDateTimeZone4.toTimeZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        java.util.TimeZone timeZone33 = fixedDateTimeZone4.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime32", (dateTime27.compareTo(dateTime32) == 0) == dateTime27.equals(dateTime32));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.withDurationAdded(readableDuration9, 53255809);
        org.joda.time.DateTime dateTime13 = dateTime1.minusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        int int19 = dateTime15.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int21 = dateTime15.get(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.Chronology chronology24 = localDateTime22.getChronology();
        boolean boolean25 = dateTimeFieldType20.isSupported(chronology24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears(0);
        int int29 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant2.plus(readableDuration3);
        boolean boolean5 = dateTimeZone0.equals((java.lang.Object) readableDuration3);
        int int7 = dateTimeZone0.getOffset((long) 775);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.property(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusYears(386);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusMonths(282);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minusWeeks(719);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime16.minusSeconds(161);
        boolean boolean24 = dateTimeZone0.isLocalDateTimeGap(localDateTime23);
        int int26 = dateTimeZone0.getOffset(1645454846352L);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfMonth();
        int int29 = localDateTime27.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.minusWeeks(100);
        boolean boolean33 = localDateTime31.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime31.withField(dateTimeFieldType34, 12);
        int int37 = localDateTime31.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str39 = dateTimeFieldType38.toString();
        java.lang.String str40 = dateTimeFieldType38.toString();
        org.joda.time.LocalDateTime.Property property41 = localDateTime31.property(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime31.minusMinutes(985);
        int int44 = localDateTime43.getMonthOfYear();
        boolean boolean45 = dateTimeZone0.isLocalDateTimeGap(localDateTime43);
        org.joda.time.DateTime dateTime46 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfMonth();
        int int49 = localDateTime47.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        java.util.Date date53 = localDateTime51.toDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str55 = dateTimeFieldType54.toString();
        boolean boolean56 = localDateTime51.equals((java.lang.Object) dateTimeFieldType54);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = localDateTime51.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime60 = localDateTime59.toDateTime();
        org.joda.time.Chronology chronology61 = localDateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.hourOfHalfday();
        org.joda.time.DurationField durationField64 = chronology61.halfdays();
        org.joda.time.DurationField durationField65 = chronology61.years();
        boolean boolean66 = dateTimeFieldType58.isSupported(chronology61);
        int int67 = dateTime46.get(dateTimeFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime60", (instant2.compareTo(dateTime60) == 0) == instant2.equals(dateTime60));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        int int8 = timeZone6.getOffset((long) 747);
        calendar1.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder14 = builder0.setDate(2021, 353, 827);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.yearOfCentury();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale28.getScript();
        java.util.Locale.setDefault(locale28);
        java.lang.String str31 = property27.getAsText(locale28);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone16, locale28);
        timeZone16.setRawOffset(708);
        int int35 = timeZone16.getRawOffset();
        java.time.ZoneId zoneId36 = timeZone16.toZoneId();
        java.util.Calendar.Builder builder37 = builder14.setTimeZone(timeZone16);
        java.util.Calendar calendar38 = builder37.build();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar32", (calendar1.compareTo(calendar32) == 0) == calendar1.equals(calendar32));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        boolean boolean8 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronology();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant10.withDurationAdded(readableDuration13, 22);
        long long16 = instant15.getMillis();
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology23 = chronology17.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withChronology(chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology23);
        org.joda.time.Chronology chronology26 = chronology23.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime25", (instant10.compareTo(dateTime25) == 0) == instant10.equals(dateTime25));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getDayOfMonth();
        boolean boolean17 = dateTime15.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds(53221444);
        int int21 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = instant5.toDateTimeISO();
        org.joda.time.Instant instant24 = instant5.withMillis((long) 128);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime30 = dateTime28.plusHours(0);
        int int31 = dateTime28.getSecondOfMinute();
        boolean boolean32 = instant5.isEqual((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime.Property property33 = dateTime28.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant10.withDurationAdded(readableDuration13, 22);
        long long16 = instant15.getMillis();
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 137, chronology17);
        org.joda.time.DurationField durationField20 = chronology17.days();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.dayOfWeek();
        org.joda.time.DateTime dateTime22 = instant5.toDateTime(chronology17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime8", (instant5.compareTo(dateTime8) == 0) == instant5.equals(dateTime8));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        boolean boolean19 = dateTimeZone12.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 2022, dateTimeZone12);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter10.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology23 = dateTimeFormatter10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeFormatter10.getZone();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        long long27 = dateTimeZone24.previousTransition((long) 85679677);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime25", (dateTime21.compareTo(dateTime25) == 0) == dateTime21.equals(dateTime25));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear(967);
        org.joda.time.DateTime dateTime12 = dateTime7.withDurationAdded((long) 269, 525);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        boolean boolean16 = dateTimeFormatter15.isParser();
        java.util.Locale locale17 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withLocale(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter18.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.Chronology chronology34 = dateTime29.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.weekyears();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology34.getZone();
        org.joda.time.Chronology chronology37 = chronology26.withZone(dateTimeZone36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter19.withChronology(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.year();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.yearOfEra();
        org.joda.time.DurationField durationField43 = chronology37.hours();
        org.joda.time.DateTime dateTime44 = dateTime7.toDateTime(chronology37);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime1.minus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime1.dayOfYear();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale locale15 = locale12.stripExtensions();
        org.joda.time.DateTime dateTime16 = property10.setCopy("20", locale12);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime18.get(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        boolean boolean28 = dateTimeFieldType23.isSupported(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime16.toDateTime(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getDayOfMonth();
        boolean boolean17 = dateTime15.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds(53221444);
        int int21 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        long long22 = instant5.getMillis();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant5.minus(readableDuration23);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant24", (dateTime1.compareTo(instant24) == 0) == dateTime1.equals(instant24));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        org.joda.time.LocalDateTime.Property property26 = localDateTime8.dayOfMonth();
        java.util.Date date27 = localDateTime8.toDate();
        int int28 = localDateTime8.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        int int34 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.weekyears();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.DateTime dateTime40 = dateTime38.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property41 = dateTime38.dayOfMonth();
        int int42 = dateTime38.getMonthOfYear();
        org.joda.time.Chronology chronology43 = dateTime38.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.weekyears();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology43.getZone();
        org.joda.time.Chronology chronology46 = chronology35.withZone(dateTimeZone45);
        org.joda.time.DateTimeField dateTimeField47 = chronology46.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.centuryOfEra();
        java.lang.String str50 = dateTimeField48.getAsText((-1862278315000L));
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfMonth();
        int int53 = localDateTime51.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.minusMinutes(53221444);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime51.minusMillis(202);
        int int58 = dateTimeField48.getMaximumValue((org.joda.time.ReadablePartial) localDateTime51);
        org.joda.time.ReadablePartial readablePartial59 = null;
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime61 = localDateTime60.toDateTime();
        int[] intArray62 = localDateTime60.getValues();
        int int63 = dateTimeField48.getMinimumValue(readablePartial59, intArray62);
        org.joda.time.LocalDateTime localDateTime64 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime66 = property65.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType67.getField(chronology68);
        org.joda.time.LocalDateTime.Property property70 = localDateTime66.property(dateTimeFieldType67);
        org.joda.time.LocalDateTime localDateTime71 = property70.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime72 = property70.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime73 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.dayOfMonth();
        int int75 = localDateTime73.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime77 = localDateTime73.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.dayOfYear();
        org.joda.time.LocalDateTime localDateTime79 = property78.roundHalfEvenCopy();
        org.joda.time.Chronology chronology80 = localDateTime79.getChronology();
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime72, chronology80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime72.withMillisOfDay(986);
        int int84 = dateTimeField48.getMinimumValue((org.joda.time.ReadablePartial) localDateTime72);
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean86 = localDateTime72.isSupported(dateTimeFieldType85);
        org.joda.time.LocalDateTime.Property property87 = localDateTime8.property(dateTimeFieldType85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField36", Math.signum(durationField3.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField3)));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        int int5 = dateMidnight4.getYear();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        org.joda.time.Instant instant7 = instant6.toInstant();
        org.joda.time.Instant instant9 = instant6.minus((long) 425);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = durationFieldType0.isSupported(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfMonth();
        int int9 = dateTime5.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int11 = dateTime5.get(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        boolean boolean15 = dateTimeFieldType10.isSupported(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DurationField durationField17 = durationFieldType3.getField(chronology14);
        org.joda.time.DurationField durationField18 = durationFieldType0.getField(chronology14);
        org.joda.time.DurationField durationField19 = chronology14.months();
        org.joda.time.DurationField durationField20 = chronology14.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.minuteOfHour();
        org.joda.time.tz.NameProvider nameProvider23 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider23);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider23);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str29 = nameProvider23.getShortName(locale26, "2022-02-21T14:47:57.502Z", "66");
        java.util.Locale locale30 = java.util.Locale.getDefault();
        java.lang.String str33 = nameProvider23.getShortName(locale30, "", "2021-12-20T23:48:08.995");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider23);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        int int48 = dateTime44.getMonthOfYear();
        org.joda.time.Chronology chronology49 = dateTime44.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.weekyears();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.Chronology chronology52 = chronology41.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.hourOfDay();
        int int55 = dateTimeField53.getMaximumValue((long) 624);
        java.util.Locale locale58 = new java.util.Locale("minuteOfDay");
        java.lang.String str59 = dateTimeField53.getAsShortText((long) 544, locale58);
        java.util.Locale locale60 = locale58.stripExtensions();
        java.util.Set<java.lang.Character> charSet61 = locale58.getExtensionKeys();
        java.lang.String str64 = nameProvider23.getShortName(locale58, "\u53f0\u7063", "200");
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime66 = localDateTime65.toDateTime();
        org.joda.time.Chronology chronology67 = localDateTime65.getChronology();
        org.joda.time.DurationField durationField68 = chronology67.days();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.hourOfDay();
        org.joda.time.DateTimeField dateTimeField70 = chronology67.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.dayOfMonth();
        int int73 = localDateTime71.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime75 = localDateTime71.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property76 = localDateTime75.dayOfYear();
        java.util.Locale locale77 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str78 = property76.getAsShortText(locale77);
        java.util.Calendar calendar79 = java.util.Calendar.getInstance(locale77);
        calendar79.setLenient(false);
        org.joda.time.LocalDateTime localDateTime82 = org.joda.time.LocalDateTime.fromCalendarFields(calendar79);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.LocalDateTime localDateTime85 = localDateTime82.withPeriodAdded(readablePeriod83, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime87 = localDateTime82.withCenturyOfEra(1970);
        java.util.Locale locale89 = new java.util.Locale("23:47:44.118");
        java.lang.String str90 = dateTimeField70.getAsShortText((org.joda.time.ReadablePartial) localDateTime87, locale89);
        java.lang.String str93 = nameProvider23.getName(locale89, "DateTimeField[halfdayOfDay]", "2022-03-07T23:10:06.294+345:00");
        java.lang.String str94 = dateTimeField21.getAsShortText((long) 51043220, locale89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField42", (durationField18.compareTo(durationField42) == 0) == durationField18.equals(durationField42));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        java.lang.String str2 = localTime1.toString();
        org.joda.time.Chronology chronology3 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(50578097L, chronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        boolean boolean12 = dateTimeZone7.equals((java.lang.Object) readableDuration10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.Chronology chronology14 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField15 = chronology3.eras();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField15", Math.signum(durationField5.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField5)));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(0);
        org.joda.time.DateTime.Property property10 = dateTime7.minuteOfHour();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        org.joda.time.DateTime dateTime12 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.halfdayOfDay();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology15);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime21.withHourOfDay(8);
        boolean boolean24 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime19", (dateTime1.compareTo(dateTime19) == 0) == dateTime1.equals(dateTime19));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime9.property(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.plusYears(386);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfMonth();
        int int20 = localDateTime18.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfYear();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str25 = property23.getAsShortText(locale24);
        java.lang.String str26 = dateTimeField6.getAsShortText((org.joda.time.ReadablePartial) localDateTime9, locale24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime9.dayOfMonth();
        boolean boolean29 = localDateTime9.equals((java.lang.Object) 584);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime9.minus(readablePeriod30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime9.withYearOfEra(16);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean39 = fixedDateTimeZone38.isFixed();
        org.joda.time.DateTime dateTime40 = localDateTime9.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime0.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        org.joda.time.DateTime dateTime44 = dateTime0.withDurationAdded((long) (byte) -1, 50560292);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime41", (dateTime2.compareTo(dateTime41) == 0) == dateTime2.equals(dateTime41));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        int int7 = dateTime6.getMonthOfYear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTimeISO();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone13 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        long long15 = fixedDateTimeZone13.nextTransition((long) 596);
        int int17 = fixedDateTimeZone13.getOffset((long) 480);
        int int19 = fixedDateTimeZone13.getOffsetFromLocal((long) 874);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DateTime.Property property27 = dateTime21.era();
        org.joda.time.DateTime.Property property28 = dateTime21.era();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusWeeks(11);
        boolean boolean33 = property28.equals((java.lang.Object) localDateTime32);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        int int36 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        int int40 = localDateTime38.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.withField(dateTimeFieldType41, 11);
        java.util.Date date44 = localDateTime43.toDate();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime32.withFields((org.joda.time.ReadablePartial) localDateTime43);
        boolean boolean48 = fixedDateTimeZone13.isLocalDateTimeGap(localDateTime32);
        int int50 = fixedDateTimeZone13.getOffsetFromLocal((long) 60922);
        long long52 = fixedDateTimeZone13.nextTransition((long) 585);
        boolean boolean54 = fixedDateTimeZone13.equals((java.lang.Object) 1645454961133L);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.DateTime dateTime58 = dateTime56.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime60 = dateTime56.minusMillis(0);
        org.joda.time.DateTime dateTime63 = dateTime56.withDurationAdded((long) 268, 174);
        org.joda.time.Chronology chronology64 = dateTime56.getChronology();
        int int65 = dateTime56.getDayOfWeek();
        boolean boolean66 = fixedDateTimeZone13.equals((java.lang.Object) dateTime56);
        org.joda.time.DateTime dateTime67 = dateTime8.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone13);
        int int69 = fixedDateTimeZone13.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime67", (dateTime5.compareTo(dateTime67) == 0) == dateTime5.equals(dateTime67));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        charSet4.clear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.dayOfWeek();
        boolean boolean13 = charSet4.contains((java.lang.Object) chronology10);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now(chronology10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField16, and durationField11", !(durationField11.compareTo(durationField16) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField16.compareTo(durationField11))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        boolean boolean5 = dateTime4.isAfterNow();
        int int6 = dateTime4.getYearOfEra();
        org.joda.time.DateTime dateTime8 = dateTime4.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = dateTime10.get(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        boolean boolean20 = dateTimeFieldType15.isSupported(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.millis();
        org.joda.time.Chronology chronology22 = chronology19.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = chronology22.add(readablePeriod24, (long) 310, 33);
        org.joda.time.DateTime dateTime28 = dateTime8.withChronology(chronology22);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(1645455146832L, chronology22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 769, dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis(570);
        int int6 = dateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.Chronology chronology9 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime5.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime13 = dateTime5.minusYears(79);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withPeriodAdded(readablePeriod14, 85694704);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime11", (dateTime5.compareTo(mutableDateTime11) == 0) == dateTime5.equals(mutableDateTime11));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology14);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getScript();
        java.util.Calendar calendar22 = dateTime19.toCalendar(locale20);
        java.util.Date date23 = calendar22.getTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.plus(readablePeriod42);
        org.joda.time.DateTime dateTime45 = dateTime43.withDayOfYear(126);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime43", (dateTime27.compareTo(dateTime43) == 0) == dateTime27.equals(dateTime43));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 365);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 85706);
        org.joda.time.DateTime dateTime15 = instant11.toDateTime();
        org.joda.time.DateTime dateTime16 = instant11.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and dateTime15", (instant11.compareTo(dateTime15) == 0) == instant11.equals(dateTime15));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        java.lang.String str2 = localTime1.toString();
        org.joda.time.Chronology chronology3 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.monthOfYear();
        org.joda.time.DurationField durationField5 = chronology3.centuries();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(50578097L, chronology3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        boolean boolean12 = dateTimeZone7.equals((java.lang.Object) readableDuration10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.Chronology chronology14 = chronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField15 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology3.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField15", Math.signum(durationField5.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField5)));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayLanguage(locale19);
        java.lang.String str22 = locale14.getDisplayName(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        int int32 = dateTime27.get(dateTimeFieldType29);
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType29.getDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.clockhourOfDay();
        org.joda.time.DurationField durationField8 = dateTimeField7.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField8, and durationField3", !(durationField3.compareTo(durationField8) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField8.compareTo(durationField3))));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayLanguage(locale19);
        java.lang.String str22 = locale14.getDisplayName(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.era();
        org.joda.time.DateTime dateTime29 = property28.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTime.Property property14 = dateTime11.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = null;
        org.joda.time.format.DateTimeParser dateTimeParser16 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter15, dateTimeParser16);
        boolean boolean18 = dateTimeFormatter17.isParser();
        java.util.Locale locale19 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withOffsetParsed();
        java.util.Locale locale22 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str26 = locale23.getDisplayLanguage(locale24);
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str28 = locale27.getDisplayCountry();
        java.lang.String str29 = locale24.getDisplayLanguage(locale27);
        java.lang.String str30 = locale22.getDisplayName(locale27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter20.withLocale(locale22);
        java.lang.String str32 = property14.getAsText(locale22);
        java.lang.String str33 = dateTimeField6.getAsText((long) 823, locale22);
        long long35 = dateTimeField6.roundHalfFloor((long) 773);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone38 = calendar37.getTimeZone();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = locale39.getDisplayVariant();
        java.util.Locale locale42 = locale39.stripExtensions();
        java.util.Set<java.lang.String> strSet43 = locale42.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet44 = locale42.getUnicodeLocaleAttributes();
        java.lang.String str45 = locale42.getDisplayName();
        java.util.Calendar calendar46 = java.util.Calendar.getInstance(timeZone38, locale42);
        java.lang.String str47 = dateTimeField6.getAsText(0, locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar37 and calendar46", (calendar37.compareTo(calendar46) == 0) == calendar37.equals(calendar46));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        int int7 = dateTime5.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readableDuration8);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readablePeriod11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant10", (dateTime12.compareTo(instant10) == 0) == dateTime12.equals(instant10));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTime.Property property7 = dateTime4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTime dateTime11 = property7.addWrapFieldToCopy((int) 'a');
        int int12 = dateTime11.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withCenturyOfEra(1969);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minusWeeks(740);
        org.joda.time.DateTime dateTime18 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType33.getField(chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.property(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusYears(386);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        int int43 = localDateTime41.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfYear();
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = property46.getAsShortText(locale47);
        java.lang.String str49 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, locale47);
        java.lang.String str50 = dateTimeZone19.getShortName((long) 381, locale47);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone19);
        long long53 = dateTimeZone19.convertUTCToLocal((long) 304);
        org.joda.time.DateTime dateTime54 = dateTime14.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfWeek();
        org.joda.time.Instant instant56 = dateTime54.toInstant();
        org.joda.time.Instant instant59 = instant56.withDurationAdded((long) 119, 843);
        long long60 = instant59.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant56", (dateTime14.compareTo(instant56) == 0) == dateTime14.equals(instant56));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(96);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime9.withWeekyear(663);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean21 = fixedDateTimeZone20.isFixed();
        java.lang.String str23 = fixedDateTimeZone20.getNameKey(1645454848886L);
        long long25 = fixedDateTimeZone20.nextTransition(0L);
        org.joda.time.DateTime dateTime26 = dateTime14.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.Chronology chronology33 = dateTime32.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType27.getField(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField37 = chronology33.weekyearOfCentury();
        org.joda.time.DurationField durationField38 = chronology33.months();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime26.toMutableDateTime(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and instant15", (dateTime26.compareTo(instant15) == 0) == dateTime26.equals(instant15));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime10.getZone();
        org.joda.time.DateTime.Property property13 = dateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        boolean boolean20 = localDateTime18.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withField(dateTimeFieldType21, 12);
        int int24 = localDateTime18.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str26 = dateTimeFieldType25.toString();
        java.lang.String str27 = dateTimeFieldType25.toString();
        org.joda.time.LocalDateTime.Property property28 = localDateTime18.property(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        int int31 = dateTimeZone29.getStandardOffset((long) 99);
        boolean boolean32 = localDateTime18.equals((java.lang.Object) dateTimeZone29);
        java.lang.String str34 = dateTimeZone29.getShortName((long) 760);
        org.joda.time.DateTime dateTime35 = dateTime10.toDateTime(dateTimeZone29);
        long long37 = dateTimeZone29.convertUTCToLocal((long) 706);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime35", (dateTime10.compareTo(dateTime35) == 0) == dateTime10.equals(dateTime35));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 15, chronology15);
        boolean boolean18 = dateTimeFieldType6.isSupported(chronology15);
        int int19 = dateTime3.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime20 = dateTime3.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes(165);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withDurationAdded(readableDuration33, 246);
        org.joda.time.DateTime dateTime37 = dateTime31.plusDays(32772);
        org.joda.time.DateTime dateTime38 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(0);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds(454);
        org.joda.time.DateTime dateTime48 = dateTime44.plusSeconds((int) 'u');
        org.joda.time.DateTime.Property property49 = dateTime44.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType53.getField(chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime.Property property57 = dateTime44.property(dateTimeFieldType53);
        boolean boolean58 = dateTime38.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime60 = dateTime38.minusMillis(2042);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone65 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        org.joda.time.DateTime dateTime66 = dateTime38.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        long long69 = fixedDateTimeZone65.convertLocalToUTC(13562985600000L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime66", (dateTime3.compareTo(dateTime66) == 0) == dateTime3.equals(dateTime66));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = instant13.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant13.withDurationAdded(readableDuration16, 1129);
        org.joda.time.Instant instant19 = instant18.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant19 and dateTime14", (instant19.compareTo(dateTime14) == 0) == instant19.equals(dateTime14));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded(readableDuration8, 858);
        boolean boolean12 = dateTime10.isAfter((long) 211);
        org.joda.time.DateTime dateTime14 = dateTime10.minusWeeks(526);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DurationField durationField21 = property19.getLeapDurationField();
        org.joda.time.DateTime dateTime23 = property19.addToCopy((long) 64);
        org.joda.time.DateTime dateTime24 = property19.roundHalfFloorCopy();
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime14.toMutableDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property33 = dateTime30.dayOfMonth();
        int int34 = dateTime30.getMonthOfYear();
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.DateTime.Property property36 = dateTime30.era();
        int int37 = dateTime30.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.DateTime dateTime40 = dateTime30.withDurationAdded(readableDuration38, 53255809);
        java.util.GregorianCalendar gregorianCalendar41 = dateTime30.toGregorianCalendar();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone46 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str48 = fixedDateTimeZone46.getNameKey(1645454823644L);
        int int50 = fixedDateTimeZone46.getStandardOffset((long) 1015);
        boolean boolean52 = fixedDateTimeZone46.isStandardOffset(0L);
        org.joda.time.DateTime dateTime53 = dateTime30.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone46);
        org.joda.time.DateTime dateTime54 = dateTime14.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime53", (dateTime1.compareTo(dateTime53) == 0) == dateTime1.equals(dateTime53));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 15, chronology15);
        boolean boolean18 = dateTimeFieldType6.isSupported(chronology15);
        int int19 = dateTime3.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime21 = dateTime3.plusHours(11);
        org.joda.time.DateTime.Property property22 = dateTime3.dayOfYear();
        org.joda.time.DateTime dateTime24 = dateTime3.minusHours(53351);
        java.util.GregorianCalendar gregorianCalendar25 = dateTime24.toGregorianCalendar();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone27 = calendar26.getTimeZone();
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.lang.String str30 = locale28.getDisplayVariant();
        java.util.Locale locale31 = locale28.stripExtensions();
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet33 = locale31.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale31.getDisplayName();
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone27, locale31);
        gregorianCalendar25.setTimeZone(timeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar26 and calendar35", (calendar26.compareTo(calendar35) == 0) == calendar26.equals(calendar35));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int15 = dateTime9.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.DateTime dateTime21 = dateTime6.toDateTime(chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant7", (dateTime1.compareTo(instant7) == 0) == dateTime1.equals(instant7));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        long long5 = instant4.getMillis();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withDurationAdded(readableDuration17, 246);
        org.joda.time.DateTime dateTime21 = dateTime15.plusDays(32772);
        int int22 = dateTime21.getYearOfCentury();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getMinuteOfDay();
        int int25 = instant4.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.util.GregorianCalendar gregorianCalendar26 = dateTime21.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        boolean boolean19 = dateTimeZone12.isLocalDateTimeGap(localDateTime17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 2022, dateTimeZone12);
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter10.withZone(dateTimeZone12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        org.joda.time.DateTime dateTime29 = property28.roundFloorCopy();
        org.joda.time.DateTime dateTime30 = property28.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter31 = null;
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter31, dateTimeParser32);
        boolean boolean34 = dateTimeFormatter33.isParser();
        java.util.Locale locale35 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter33.withLocale(locale35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter36.withOffsetParsed();
        java.util.Locale locale38 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str42 = locale39.getDisplayLanguage(locale40);
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str44 = locale43.getDisplayCountry();
        java.lang.String str45 = locale40.getDisplayLanguage(locale43);
        java.lang.String str46 = locale38.getDisplayName(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter36.withLocale(locale38);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter47.withZone(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime30.toDateTime(dateTimeZone49);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter10.withZone(dateTimeZone49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and dateTime51", (dateTime21.compareTo(dateTime51) == 0) == dateTime21.equals(dateTime51));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        int int13 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime20 = property19.roundCeilingCopy();
        java.util.Locale locale22 = new java.util.Locale("ETC/UTC");
        int int23 = property19.getMaximumTextLength(locale22);
        java.lang.String str24 = locale22.getISO3Country();
        java.util.Calendar calendar25 = dateTime9.toCalendar(locale22);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime9.plus(readablePeriod26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar12 and calendar25", (gregorianCalendar12.compareTo(calendar25) == 0) == gregorianCalendar12.equals(calendar25));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        int int2 = charSet1.size();
        java.util.Spliterator<java.lang.Character> charSpliterator3 = charSet1.spliterator();
        int int4 = charSet1.size();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.Chronology chronology7 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfWeek();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime15.property(dateTimeFieldType16);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isParser();
        java.util.Locale locale24 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology41.getZone();
        org.joda.time.Chronology chronology44 = chronology33.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter26.withChronology(chronology44);
        boolean boolean46 = dateTimeFieldType16.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.year();
        org.joda.time.DurationField durationField48 = chronology44.eras();
        org.joda.time.DurationField[] durationFieldArray49 = new org.joda.time.DurationField[] { durationField12, durationField48 };
        org.joda.time.DurationField[] durationFieldArray50 = charSet1.toArray(durationFieldArray49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField48", Math.signum(durationField12.compareTo(durationField48)) == -Math.signum(durationField48.compareTo(durationField12)));
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
        org.joda.time.LocalDate localDate11 = localDate7.plusMonths((-1));
        int int12 = localDate2.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(0L, dateTimeZone19);
        org.joda.time.LocalDate localDate22 = localDate20.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate20.plus(readablePeriod23);
        org.joda.time.LocalDate localDate25 = localDate17.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate20.minus(readablePeriod26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology29 = null;
        boolean boolean30 = durationFieldType28.isSupported(chronology29);
        boolean boolean31 = localDate20.isSupported(durationFieldType28);
        org.joda.time.LocalDate localDate32 = localDate2.withFields((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate34 = localDate32.plusYears((int) (byte) 10);
        int int35 = localDate34.getYearOfCentury();
        org.joda.time.LocalDate localDate37 = localDate34.plusWeeks(53233700);
        org.joda.time.LocalDate localDate39 = localDate34.minusMonths(700);
        org.joda.time.LocalDate.Property property40 = localDate39.era();
        org.joda.time.LocalDate.Property property41 = localDate39.yearOfCentury();
        org.joda.time.LocalDate localDate42 = property41.withMaximumValue();
        org.joda.time.Instant instant43 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.plus(readableDuration44);
        org.joda.time.Instant instant47 = instant43.minus((long) (byte) 0);
        org.joda.time.Instant instant50 = instant47.withDurationAdded((long) 0, 24);
        org.joda.time.MutableDateTime mutableDateTime51 = instant47.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int53 = instant47.get(dateTimeFieldType52);
        boolean boolean54 = localDate42.isSupported(dateTimeFieldType52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant43 and mutableDateTime51", (instant43.compareTo(mutableDateTime51) == 0) == instant43.equals(mutableDateTime51));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1645454841117L);
        int int2 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        boolean boolean5 = localTime1.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        org.joda.time.DateTime.Property property16 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime17 = dateTime13.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours(345);
        long long22 = dateTimeZone19.adjustOffset(1645454826490L, false);
        long long24 = dateTimeZone19.nextTransition((long) 64);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime26 = localTime1.toDateTimeToday(dateTimeZone19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime25", (dateTime9.compareTo(dateTime25) == 0) == dateTime9.equals(dateTime25));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds(53221444);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours(0);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime23 = dateTime20.toLocalDateTime();
        java.lang.String str24 = localDateTime23.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withMillisOfSecond(0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusHours(2922789);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusMillis(777);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZone(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes(165);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear((int) 'a');
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfWeek();
        org.joda.time.DateTime dateTime44 = property43.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType48.getField(chronology49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.property(dateTimeFieldType48);
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property53 = localDateTime30.property(dateTimeFieldType48);
        int int54 = dateTime14.get(dateTimeFieldType48);
        org.joda.time.format.DateTimePrinter dateTimePrinter55 = null;
        org.joda.time.format.DateTimeParser dateTimeParser56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter55, dateTimeParser56);
        boolean boolean58 = dateTimeFormatter57.isParser();
        java.util.Locale locale59 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter57.withLocale(locale59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter60.withOffsetParsed();
        java.lang.Integer int62 = dateTimeFormatter61.getPivotYear();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime64 = localDateTime63.toDateTime();
        org.joda.time.Chronology chronology65 = localDateTime63.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter61.withChronology(chronology65);
        org.joda.time.DurationField durationField69 = chronology65.halfdays();
        org.joda.time.DateTime dateTime70 = dateTime14.withChronology(chronology65);
        org.joda.time.LocalDateTime localDateTime71 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime72 = localDateTime71.toDateTime();
        org.joda.time.DateTime dateTime74 = dateTime72.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime76 = dateTime74.plusHours(0);
        org.joda.time.DateTime dateTime78 = dateTime76.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime79 = dateTime76.toLocalDateTime();
        java.lang.String str80 = localDateTime79.toString();
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.withDurationAdded(readableDuration81, 0);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.minusYears(499);
        org.joda.time.Chronology chronology86 = localDateTime85.getChronology();
        org.joda.time.DateTime dateTime87 = dateTime14.toDateTime(chronology86);
        java.lang.String str88 = chronology86.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime70", (dateTime14.compareTo(dateTime70) == 0) == dateTime14.equals(dateTime70));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        boolean boolean6 = localDateTime4.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withField(dateTimeFieldType7, 12);
        int int10 = localDateTime4.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withZone(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        boolean boolean26 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTime dateTime27 = dateTime14.toDateTime(dateTimeZone19);
        java.lang.String str28 = dateTimeZone19.toString();
        boolean boolean29 = localDateTime4.equals((java.lang.Object) dateTimeZone19);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("anglais (Royaume-Uni)", "23:47:56.996", 1970, 465);
        org.joda.time.DateTime dateTime36 = dateTime30.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        java.lang.String str37 = fixedDateTimeZone35.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime36", (dateTime12.compareTo(dateTime36) == 0) == dateTime12.equals(dateTime36));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(96);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime9.withWeekyear(663);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean21 = fixedDateTimeZone20.isFixed();
        java.lang.String str23 = fixedDateTimeZone20.getNameKey(1645454848886L);
        long long25 = fixedDateTimeZone20.nextTransition(0L);
        org.joda.time.DateTime dateTime26 = dateTime14.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant15", (dateTime28.compareTo(instant15) == 0) == dateTime28.equals(instant15));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 246);
        org.joda.time.DateTime dateTime15 = dateTime9.plusDays(32772);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        int int17 = property16.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        org.joda.time.DateTime dateTime20 = property16.addToCopy(468);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        java.lang.String str22 = instant21.toString();
        org.joda.time.Instant instant23 = instant21.toInstant();
        long long24 = instant21.getMillis();
        boolean boolean25 = dateTime20.isAfter((org.joda.time.ReadableInstant) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant21", (dateTime1.compareTo(instant21) == 0) == dateTime1.equals(instant21));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology14);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getScript();
        java.util.Calendar calendar22 = dateTime19.toCalendar(locale20);
        int int23 = calendar22.getWeeksInWeekYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        long long5 = instant4.getMillis();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withDurationAdded(readableDuration17, 246);
        org.joda.time.DateTime dateTime21 = dateTime15.plusDays(32772);
        int int22 = dateTime21.getYearOfCentury();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getMinuteOfDay();
        int int25 = instant4.compareTo((org.joda.time.ReadableInstant) dateTime21);
        long long26 = instant4.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime7", (instant4.compareTo(dateTime7) == 0) == instant4.equals(dateTime7));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        int int6 = dateTime5.getMonthOfYear();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone16);
        java.lang.String str25 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime26 = dateTime5.withZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.centuryOfEra();
        boolean boolean32 = dateTime5.equals((java.lang.Object) property31);
        org.joda.time.DateTime dateTime33 = property31.getDateTime();
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime36 = dateTime33.plusHours(364);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant34", (dateTime1.compareTo(instant34) == 0) == dateTime1.equals(instant34));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone8);
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime16.toMutableDateTime(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant18", (dateTime1.compareTo(instant18) == 0) == dateTime1.equals(instant18));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime7.minusDays(452);
        org.joda.time.DateTime dateTime45 = dateTime43.plusYears(61874602);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = chronology24.add(readablePeriod27, (long) ' ', 626);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.weekyearOfCentury();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfMonth();
        int int34 = localDateTime32.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfYear();
        java.util.Date date38 = localDateTime36.toDate();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.plusHours(659);
        java.util.Locale.Builder builder42 = new java.util.Locale.Builder();
        java.util.Locale locale43 = builder42.build();
        java.util.Locale locale44 = builder42.build();
        java.lang.String str45 = dateTimeField31.getAsText((org.joda.time.ReadablePartial) localDateTime40, 53361773, locale44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime40.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str49 = dateTimeZone47.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone50 = dateTimeZone47.toTimeZone();
        int int52 = timeZone50.getOffset(4L);
        java.lang.String str53 = timeZone50.getID();
        java.lang.String str54 = timeZone50.getID();
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        org.joda.time.DurationField durationField58 = chronology57.eras();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField60 = chronology57.hourOfDay();
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime63 = property62.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType64.getField(chronology65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime63.property(dateTimeFieldType64);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime63.plusYears(386);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime63.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime72 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.dayOfMonth();
        int int74 = localDateTime72.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime72.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.dayOfYear();
        java.util.Locale locale78 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str79 = property77.getAsShortText(locale78);
        java.lang.String str80 = dateTimeField60.getAsShortText((org.joda.time.ReadablePartial) localDateTime63, locale78);
        java.util.Calendar calendar81 = java.util.Calendar.getInstance(timeZone50, locale78);
        java.lang.String str82 = locale78.getDisplayLanguage();
        boolean boolean83 = locale78.hasExtensions();
        int int84 = property46.getMaximumTextLength(locale78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField58", Math.signum(durationField14.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField14)));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime13 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(chronology15);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant17.withDurationAdded(readableDuration20, 22);
        long long23 = instant22.getMillis();
        org.joda.time.Chronology chronology24 = instant22.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.hours();
        org.joda.time.DurationField durationField26 = chronology24.hours();
        org.joda.time.DateTime dateTime27 = dateTime16.toDateTime(chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        int int6 = dateTime1.getMinuteOfHour();
        org.joda.time.DateTime.Property property7 = dateTime1.year();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        long long8 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfYear();
        java.lang.String str10 = dateTime5.toString();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        int int17 = dateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int19 = dateTime13.get(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        boolean boolean23 = dateTimeFieldType18.isSupported(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.DurationField durationField25 = durationFieldType11.getField(chronology22);
        org.joda.time.DateTime dateTime26 = dateTime5.toDateTime(chronology22);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 83405);
        org.joda.time.DateTime dateTime30 = dateTime28.minusHours(42922);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime26", (dateTime3.compareTo(dateTime26) == 0) == dateTime3.equals(dateTime26));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime3.withMillis(14L);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime3);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant8.minus(readableDuration11);
        java.util.Date date13 = instant8.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        long long7 = instant6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate15.plus(readablePeriod18);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        boolean boolean22 = instant6.equals((java.lang.Object) localDate20);
        org.joda.time.DateTime dateTime23 = instant6.toDateTime();
        int int24 = dateTime23.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        org.joda.time.Instant instant8 = instant6.plus((long) 267);
        org.joda.time.Instant instant9 = instant6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime10 = instant6.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Chronology chronology4 = instant1.getChronology();
        org.joda.time.Chronology chronology5 = instant1.getChronology();
        long long6 = instant1.getMillis();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant13 = instant8.withDurationAdded(readableDuration11, 22);
        long long14 = instant13.getMillis();
        org.joda.time.Chronology chronology15 = instant13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str19 = dateTimeZone17.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone20 = dateTimeZone17.toTimeZone();
        org.joda.time.Chronology chronology21 = chronology15.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField22 = durationFieldType7.getField(chronology15);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(629);
        org.joda.time.Chronology chronology25 = chronology15.withZone(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime26 = instant1.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(1645455179103L, chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime26", (instant1.compareTo(mutableDateTime26) == 0) == instant1.equals(mutableDateTime26));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.DateTime dateTime43 = dateTime40.plus(readablePeriod42);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime40.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.DateTime.Property property14 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfSecond();
        int int16 = dateTime12.getSecondOfMinute();
        org.joda.time.Instant instant17 = dateTime12.toInstant();
        org.joda.time.Instant instant20 = instant17.withDurationAdded(670L, 887);
        org.joda.time.Instant instant21 = instant20.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant17", (dateTime12.compareTo(instant17) == 0) == dateTime12.equals(instant17));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        java.util.Date date3 = new java.util.Date(912, 353, 57);
        date3.setDate(234);
        long long6 = date3.getTime();
        int int7 = date3.getHours();
        java.lang.Object obj8 = date3.clone();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DateTime dateTime11 = instant9.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = instant9.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj8, dateTimeZone12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = instant4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant4.plus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime12", (instant14.compareTo(dateTime12) == 0) == instant14.equals(dateTime12));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant0.minus(readableDuration5);
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        int int9 = dateMidnight8.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime7", (instant0.compareTo(dateTime7) == 0) == instant0.equals(dateTime7));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = instant4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant4.minus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and dateTime12", (instant14.compareTo(dateTime12) == 0) == instant14.equals(dateTime12));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 615);
        org.joda.time.Instant instant9 = instant7.minus(1645455185525L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType11, 128);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(596);
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = dateTime15.isAfter(readableInstant18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.joda.time.Chronology chronology23 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology23);
        int int26 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = dateTime30.toDateTimeISO();
        int int36 = dateTime30.getMillisOfSecond();
        int int37 = dateTime30.getMinuteOfDay();
        org.joda.time.DateTime dateTime38 = dateTime30.toDateTimeISO();
        boolean boolean39 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        java.util.TimeZone timeZone12 = calendar8.getTimeZone();
        java.lang.String str13 = calendar8.getCalendarType();
        int int15 = calendar8.getLeastMaximum(0);
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) 790);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        boolean boolean21 = instant17.isBefore(677L);
        org.joda.time.MutableDateTime mutableDateTime22 = instant17.toMutableDateTime();
        boolean boolean23 = calendar8.after((java.lang.Object) instant17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime22", (instant17.compareTo(mutableDateTime22) == 0) == instant17.equals(mutableDateTime22));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusHours(165);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds(202);
        int int15 = localDateTime14.getDayOfWeek();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField18", Math.signum(durationField17.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField17)));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.Chronology chronology23 = chronology20.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTime dateTime27 = instant0.toDateTime(chronology23);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone32 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        long long34 = fixedDateTimeZone32.nextTransition((long) 596);
        int int36 = fixedDateTimeZone32.getOffset((long) 480);
        int int38 = fixedDateTimeZone32.getOffsetFromLocal((long) 874);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfMonth();
        int int44 = dateTime40.getMonthOfYear();
        org.joda.time.Chronology chronology45 = dateTime40.getChronology();
        org.joda.time.DateTime.Property property46 = dateTime40.era();
        org.joda.time.DateTime.Property property47 = dateTime40.era();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.minusWeeks(11);
        boolean boolean52 = property47.equals((java.lang.Object) localDateTime51);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfMonth();
        int int55 = localDateTime53.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfYear();
        int int59 = localDateTime57.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime62 = localDateTime57.withField(dateTimeFieldType60, 11);
        java.util.Date date63 = localDateTime62.toDate();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime51.withFields((org.joda.time.ReadablePartial) localDateTime62);
        boolean boolean67 = fixedDateTimeZone32.isLocalDateTimeGap(localDateTime51);
        java.util.TimeZone timeZone68 = fixedDateTimeZone32.toTimeZone();
        boolean boolean69 = fixedDateTimeZone32.isFixed();
        org.joda.time.Chronology chronology70 = chronology23.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant7 = instant0.withDurationAdded((long) (-1), 620);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant7.withDurationAdded(readableDuration9, 60942);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime8", (instant13.compareTo(mutableDateTime8) == 0) == instant13.equals(mutableDateTime8));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.Instant instant10 = dateTime8.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.minus(readableDuration11);
        org.joda.time.Instant instant13 = instant12.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant13", (dateTime3.compareTo(instant13) == 0) == dateTime3.equals(instant13));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        org.joda.time.DateTime dateTime9 = dateTime1.withCenturyOfEra(895);
        int int10 = dateTime1.getSecondOfDay();
        org.joda.time.Instant instant11 = dateTime1.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.plus(readableDuration13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes(165);
        int int25 = dateTime24.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime24.withDurationAdded(readableDuration26, 246);
        org.joda.time.DateTime dateTime30 = dateTime24.plusDays(32772);
        org.joda.time.DateTime dateTime32 = dateTime30.withYearOfEra(57);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime30.getZone();
        org.joda.time.MutableDateTime mutableDateTime34 = instant11.toMutableDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology14);
        java.util.Locale locale20 = java.util.Locale.ENGLISH;
        java.lang.String str21 = locale20.getScript();
        java.util.Calendar calendar22 = dateTime19.toCalendar(locale20);
        java.lang.String str23 = locale20.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTime dateTime13 = dateTime5.withChronology(chronology8);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str21 = property19.getAsShortText(locale20);
        org.joda.time.LocalDateTime localDateTime23 = property19.addWrapFieldToCopy(404);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks(967);
        int[] intArray27 = chronology8.get((org.joda.time.ReadablePartial) localDateTime23, 21083786860558000L);
        org.joda.time.LocalTime localTime28 = localDateTime23.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.getDateTime();
        org.joda.time.DurationField durationField6 = property4.getLeapDurationField();
        org.joda.time.DateTime dateTime8 = property4.addToCopy((long) 64);
        org.joda.time.DateTime dateTime9 = property4.roundHalfFloorCopy();
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime13 = dateTime12.toLocalDateTime();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.plus(readableDuration15);
        org.joda.time.Instant instant18 = instant14.minus((long) (byte) 0);
        org.joda.time.Instant instant21 = instant18.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant23 = instant18.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean25 = instant18.isSupported(dateTimeFieldType24);
        java.lang.String str26 = dateTimeFieldType24.getName();
        int int27 = localDateTime13.get(dateTimeFieldType24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant14", (dateTime1.compareTo(instant14) == 0) == dateTime1.equals(instant14));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime1.minus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime1.dayOfYear();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale locale15 = locale12.stripExtensions();
        org.joda.time.DateTime dateTime16 = property10.setCopy("20", locale12);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime18.get(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        boolean boolean28 = dateTimeFieldType23.isSupported(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime16.toDateTime(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.days();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        int int12 = localDateTime10.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        boolean boolean16 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 2022, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType33.getField(chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.property(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusYears(386);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        int int43 = localDateTime41.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfYear();
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = property46.getAsShortText(locale47);
        java.lang.String str49 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, locale47);
        java.lang.String str50 = dateTimeZone19.getShortName((long) 381, locale47);
        java.lang.String str52 = dateTimeZone19.getShortName(1645454827791L);
        long long54 = dateTimeZone9.getMillisKeepLocal(dateTimeZone19, (long) (short) -1);
        boolean boolean56 = dateTimeZone9.isStandardOffset((long) 259);
        org.joda.time.Chronology chronology57 = chronology3.withZone(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime25", (instant0.compareTo(dateTime25) == 0) == instant0.equals(dateTime25));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) instant7, chronology8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant7.minus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 701);
        org.joda.time.MutableDateTime mutableDateTime15 = instant11.toMutableDateTime();
        java.lang.String str16 = instant11.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime15", (instant11.compareTo(mutableDateTime15) == 0) == instant11.equals(mutableDateTime15));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 15, chronology15);
        boolean boolean18 = dateTimeFieldType6.isSupported(chronology15);
        int int19 = dateTime3.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime20 = dateTime3.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes(165);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withDurationAdded(readableDuration33, 246);
        org.joda.time.DateTime dateTime37 = dateTime31.plusDays(32772);
        org.joda.time.DateTime dateTime38 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(0);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds(454);
        org.joda.time.DateTime dateTime48 = dateTime44.plusSeconds((int) 'u');
        org.joda.time.DateTime.Property property49 = dateTime44.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType53.getField(chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime.Property property57 = dateTime44.property(dateTimeFieldType53);
        boolean boolean58 = dateTime38.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime60 = dateTime38.minusMillis(2042);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone65 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        org.joda.time.DateTime dateTime66 = dateTime38.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        int int67 = dateTime38.getCenturyOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime66", (dateTime3.compareTo(dateTime66) == 0) == dateTime3.equals(dateTime66));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        java.lang.String str6 = timeZone3.getID();
        java.lang.String str7 = timeZone3.getID();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.property(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.plusYears(386);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfMonth();
        int int27 = localDateTime25.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime25.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfYear();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = property30.getAsShortText(locale31);
        java.lang.String str33 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDateTime16, locale31);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(timeZone3, locale31);
        calendar34.set(63, 53254703, 85684911);
        calendar34.clear(0);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime42 = localDateTime41.toDateTime();
        org.joda.time.DateTime dateTime44 = dateTime42.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime46 = dateTime44.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withZone(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.plusMinutes(165);
        int int51 = dateTime50.getDayOfMonth();
        org.joda.time.DateTime dateTime53 = dateTime50.plus(2841875L);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime55 = localDateTime54.toDateTime();
        org.joda.time.Chronology chronology56 = localDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.Chronology chronology59 = localDateTime58.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.weeks();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.secondOfDay();
        org.joda.time.DateTime dateTime62 = dateTime53.withChronology(chronology59);
        boolean boolean63 = calendar34.after((java.lang.Object) chronology59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField11 and durationField60", Math.signum(durationField11.compareTo(durationField60)) == -Math.signum(durationField60.compareTo(durationField11)));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.withDurationAdded(readableDuration9, 53255809);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime1.toGregorianCalendar();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone17 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str19 = fixedDateTimeZone17.getNameKey(1645454823644L);
        int int21 = fixedDateTimeZone17.getStandardOffset((long) 1015);
        boolean boolean23 = fixedDateTimeZone17.isStandardOffset(0L);
        org.joda.time.DateTime dateTime24 = dateTime1.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone17);
        int int25 = dateTime1.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime24", (dateTime1.compareTo(dateTime24) == 0) == dateTime1.equals(dateTime24));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) '4');
        org.joda.time.LocalTime.Property property5 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes(549);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.joda.time.Instant instant13 = instant9.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime14 = localTime6.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime15 = instant9.toDateTimeISO();
        org.joda.time.Instant instant17 = instant9.withMillis(1680522039451945000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime15", (instant9.compareTo(dateTime15) == 0) == instant9.equals(dateTime15));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 329);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes(468);
        org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks(202);
        org.joda.time.Chronology chronology12 = dateTime9.getChronology();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        int int18 = dateTime14.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int20 = dateTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime14.minus(readablePeriod21);
        org.joda.time.DateTime.Property property23 = dateTime14.dayOfYear();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = locale25.getDisplayVariant();
        java.util.Locale locale28 = locale25.stripExtensions();
        org.joda.time.DateTime dateTime29 = property23.setCopy("20", locale25);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfMonth();
        int int35 = dateTime31.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int37 = dateTime31.get(dateTimeFieldType36);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        org.joda.time.Chronology chronology40 = localDateTime38.getChronology();
        boolean boolean41 = dateTimeFieldType36.isSupported(chronology40);
        org.joda.time.DateTime dateTime42 = dateTime29.toDateTime(chronology40);
        boolean boolean43 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime45 = dateTime9.minusDays(452);
        boolean boolean46 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and dateTime42", (dateTime29.compareTo(dateTime42) == 0) == dateTime29.equals(dateTime42));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        org.joda.time.Chronology chronology6 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        int int10 = localDateTime8.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        int int14 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withField(dateTimeFieldType15, 11);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withMillisOfSecond(404);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        int int24 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.DateTimeField dateTimeField29 = property27.getField();
        org.joda.time.ReadablePartial readablePartial30 = null;
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfYear();
        int int37 = localDateTime35.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withField(dateTimeFieldType38, 11);
        java.util.Date date41 = localDateTime40.toDate();
        int[] intArray42 = localDateTime40.getValues();
        int int43 = dateTimeField29.getMinimumValue(readablePartial30, intArray42);
        chronology6.validate((org.joda.time.ReadablePartial) localDateTime17, intArray42);
        org.joda.time.DateTimeField dateTimeField45 = chronology6.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime48 = localDateTime47.toDateTime();
        org.joda.time.DateTime dateTime50 = dateTime48.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property51 = dateTime48.dayOfMonth();
        int int52 = dateTime48.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int54 = dateTime48.get(dateTimeFieldType53);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime56 = localDateTime55.toDateTime();
        org.joda.time.Chronology chronology57 = localDateTime55.getChronology();
        boolean boolean58 = dateTimeFieldType53.isSupported(chronology57);
        boolean boolean59 = dateTimeFieldType46.isSupported(chronology57);
        org.joda.time.DateTimeField dateTimeField60 = chronology57.secondOfDay();
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = locale61.getDisplayCountry();
        java.util.Locale locale63 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet64 = locale63.getExtensionKeys();
        java.lang.String str65 = locale63.getDisplayVariant();
        java.util.Locale locale66 = locale63.stripExtensions();
        java.lang.String str67 = locale61.getDisplayLanguage(locale63);
        int int68 = dateTimeField60.getMaximumTextLength(locale61);
        int int69 = dateTimeField45.getMaximumTextLength(locale61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime48", (instant0.compareTo(dateTime48) == 0) == instant0.equals(dateTime48));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology6);
        org.joda.time.DurationField durationField12 = chronology6.years();
        java.lang.String str13 = chronology6.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField12", (durationField7.compareTo(durationField12) == 0) == durationField7.equals(durationField12));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2022);
        org.joda.time.DateTime dateTime3 = dateTime1.plusDays((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfMonth();
        int int9 = dateTime5.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int11 = dateTime5.get(dateTimeFieldType10);
        int int12 = dateTime1.get(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        org.joda.time.DateTime dateTime18 = property17.roundFloorCopy();
        org.joda.time.DateTime dateTime19 = property17.roundFloorCopy();
        boolean boolean20 = dateTime19.isAfterNow();
        boolean boolean22 = dateTime19.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour(10);
        boolean boolean27 = dateTime26.isAfterNow();
        org.joda.time.DateTime.Property property28 = dateTime26.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str30 = dateTimeFieldType29.toString();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property36 = dateTime33.dayOfMonth();
        int int37 = dateTime33.getMonthOfYear();
        org.joda.time.Chronology chronology38 = dateTime33.getChronology();
        org.joda.time.DurationField durationField39 = chronology38.weekyears();
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 15, chronology38);
        boolean boolean41 = dateTimeFieldType29.isSupported(chronology38);
        int int42 = dateTime26.get(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime43 = dateTime26.toLocalDateTime();
        org.joda.time.DateTime dateTime44 = dateTime19.withFields((org.joda.time.ReadablePartial) localDateTime43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withMillisOfSecond(423);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType50 = dateTimeFieldType49.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime48.withFieldAdded(durationFieldType50, 142);
        boolean boolean53 = localDateTime46.isSupported(durationFieldType50);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime55 = localDateTime54.toDateTime();
        org.joda.time.Chronology chronology56 = localDateTime54.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.days();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.minuteOfDay();
        java.lang.String str60 = chronology56.toString();
        org.joda.time.DateTimeField dateTimeField61 = chronology56.millisOfDay();
        org.joda.time.DurationField durationField62 = durationFieldType50.getField(chronology56);
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType10.getField(chronology56);
        org.joda.time.DurationField durationField64 = chronology56.years();
        org.joda.time.DurationField durationField65 = chronology56.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField64", (durationField39.compareTo(durationField64) == 0) == durationField39.equals(durationField64));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime8 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime8.plusSeconds(294);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime8", (dateTime1.compareTo(dateTime8) == 0) == dateTime1.equals(dateTime8));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(85706504);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.withDurationAdded(readableDuration33, 440);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime30", (dateTime9.compareTo(dateTime30) == 0) == dateTime9.equals(dateTime30));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.Instant instant15 = instant10.minus((long) 6);
        org.joda.time.DateTime dateTime16 = instant15.toDateTime();
        org.joda.time.Instant instant18 = instant15.minus(363L);
        org.joda.time.DateTime dateTime19 = instant15.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfSecond(402);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime16", (instant15.compareTo(dateTime16) == 0) == instant15.equals(dateTime16));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        int int5 = dateTime3.getYearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime3.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int15 = dateTime9.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.Chronology chronology21 = chronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.era();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology21.add(readablePeriod23, (long) 310, 33);
        org.joda.time.DateTime dateTime27 = dateTime7.withChronology(chronology21);
        int int28 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime30 = dateTime27.plusSeconds(918);
        java.util.Date date31 = dateTime27.toDate();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfMonth();
        int int34 = localDateTime32.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfYear();
        int int38 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withField(dateTimeFieldType39, 11);
        java.util.Date date42 = localDateTime41.toDate();
        date42.setTime((long) 3);
        java.lang.String str45 = date42.toGMTString();
        java.lang.String str46 = date42.toLocaleString();
        java.util.Date date48 = new java.util.Date((long) (byte) 1);
        date48.setTime((long) 404);
        int int51 = date48.getHours();
        boolean boolean52 = date42.after(date48);
        boolean boolean53 = date31.before(date42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime27", (dateTime7.compareTo(dateTime27) == 0) == dateTime7.equals(dateTime27));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(1645454946205L);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime7 = dateTime5.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withZone(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(165);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.plusDays(719);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(336);
        int int17 = dateTime14.getDayOfMonth();
        org.joda.time.Instant instant18 = dateTime14.toInstant();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.plus(readableDuration19);
        org.joda.time.DateTime dateTime21 = localTime1.toDateTime((org.joda.time.ReadableInstant) instant20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant20", (dateTime14.compareTo(instant20) == 0) == dateTime14.equals(instant20));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.Instant instant14 = instant11.withDurationAdded((long) 2000, 874);
        org.joda.time.MutableDateTime mutableDateTime15 = instant11.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime16 = instant11.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant11 and mutableDateTime15", (instant11.compareTo(mutableDateTime15) == 0) == instant11.equals(mutableDateTime15));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.DateTime.Property property14 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfSecond();
        int int16 = dateTime12.getSecondOfMinute();
        org.joda.time.Instant instant17 = dateTime12.toInstant();
        org.joda.time.Instant instant20 = instant17.withDurationAdded(670L, 887);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        org.joda.time.Instant instant24 = instant22.minus((long) 763);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant22", (dateTime12.compareTo(instant22) == 0) == dateTime12.equals(instant22));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTime dateTime13 = dateTime5.withChronology(chronology8);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withDurationAdded(readableDuration16, 53474);
        org.joda.time.Instant instant19 = dateTime13.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(47);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 416);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.plus(readableDuration19);
        org.joda.time.Chronology chronology21 = instant18.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter17.withChronology(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant18", (dateTime10.compareTo(instant18) == 0) == dateTime10.equals(instant18));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusMinutes(53221444);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusMillis(202);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withDurationAdded(readableDuration7, 60922);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withWeekyear(749);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfWeek();
        org.joda.time.DateTime.Property property19 = dateTime15.era();
        org.joda.time.DateTime dateTime21 = dateTime15.minusDays(392);
        org.joda.time.DateTime dateTime23 = dateTime21.withYear(922);
        org.joda.time.DateTime dateTime24 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        long long25 = dateTime24.getMillis();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfMonth();
        int int28 = localDateTime26.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        int int32 = localDateTime30.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withField(dateTimeFieldType33, 11);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfMonth();
        org.joda.time.LocalDateTime.Property property37 = localDateTime35.monthOfYear();
        org.joda.time.LocalDateTime localDateTime39 = property37.addToCopy((long) 138);
        org.joda.time.LocalDateTime localDateTime40 = property37.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.minusWeeks(261);
        java.util.Locale locale44 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet45 = locale44.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray46 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList47 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList47, languageRangeArray46);
        java.lang.String[] strArray50 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList54 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList47, (java.util.Collection<java.lang.String>) strList51, filteringMode53);
        boolean boolean55 = charSet45.containsAll((java.util.Collection<java.lang.String>) strList51);
        org.joda.time.Instant instant56 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Instant instant58 = instant56.plus(readableDuration57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Instant instant61 = instant56.withDurationAdded(readableDuration59, 22);
        long long62 = instant61.getMillis();
        org.joda.time.Chronology chronology63 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.dayOfWeek();
        boolean boolean65 = charSet45.equals((java.lang.Object) chronology63);
        org.joda.time.DateTimeField dateTimeField66 = chronology63.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField67 = chronology63.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.weekyearOfCentury();
        org.joda.time.DurationField durationField69 = chronology63.hours();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 218, chronology63);
        boolean boolean71 = localDateTime40.equals((java.lang.Object) chronology63);
        org.joda.time.DurationField durationField72 = chronology63.weekyears();
        org.joda.time.MutableDateTime mutableDateTime73 = dateTime24.toMutableDateTime(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant56", (dateTime13.compareTo(instant56) == 0) == dateTime13.equals(instant56));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        org.joda.time.LocalDateTime localDateTime9 = property5.addWrapFieldToCopy(404);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(967);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(345);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withWeekOfWeekyear(7);
        int int16 = localDateTime13.getMillisOfSecond();
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        boolean boolean26 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 2022, dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.Chronology chronology36 = localDateTime34.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.eras();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.hourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime42 = property41.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime42.property(dateTimeFieldType43);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.plusYears(386);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime42.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfMonth();
        int int53 = localDateTime51.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime51.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfYear();
        java.util.Locale locale57 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str58 = property56.getAsShortText(locale57);
        java.lang.String str59 = dateTimeField39.getAsShortText((org.joda.time.ReadablePartial) localDateTime42, locale57);
        java.lang.String str60 = dateTimeZone29.getShortName((long) 381, locale57);
        java.lang.String str62 = dateTimeZone29.getShortName(1645454827791L);
        long long64 = dateTimeZone19.getMillisKeepLocal(dateTimeZone29, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime(dateTimeZone19);
        boolean boolean67 = dateTimeZone19.isStandardOffset((long) 690);
        org.joda.time.Chronology chronology68 = chronology17.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology69 = chronology68.withUTC();
        org.joda.time.DurationField durationField70 = chronology69.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField70, and durationField37", !(durationField37.compareTo(durationField70) == 0) || (Math.signum(durationField37.compareTo(durationField37)) == Math.signum(durationField70.compareTo(durationField37))));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfDay();
        int int7 = dateTimeField6.getMaximumValue();
        long long9 = dateTimeField6.remainder((long) 670);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        java.lang.String str13 = locale11.getScript();
        java.lang.String str14 = locale11.getDisplayName();
        java.lang.String str15 = dateTimeField6.getAsShortText((long) 711, locale11);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant22 = instant17.withDurationAdded(readableDuration20, 22);
        org.joda.time.Chronology chronology23 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 796, chronology23);
        int int26 = localDateTime25.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime.Property property36 = dateTime35.minuteOfDay();
        org.joda.time.DateTime.Property property37 = dateTime35.weekOfWeekyear();
        org.joda.time.tz.NameProvider nameProvider38 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet40 = locale39.getExtensionKeys();
        java.lang.String str41 = locale39.getDisplayVariant();
        java.util.Locale locale42 = locale39.stripExtensions();
        java.lang.String str45 = nameProvider38.getShortName(locale42, "2022-02-21T14:10:08.924", "2020-03-23T14:47:02.858");
        java.lang.String str46 = locale42.getScript();
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleKeys();
        int int48 = property37.getMaximumShortTextLength(locale42);
        java.lang.String str49 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDateTime25, 227, locale42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant17", (dateTime1.compareTo(instant17) == 0) == dateTime1.equals(instant17));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.era();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeField dateTimeField6 = chronology3.secondOfDay();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology3);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds(454);
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) 'u');
        int int18 = dateTime17.getYearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks(733);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone26 = dateTimeZone23.toTimeZone();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.property(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusYears(386);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime36.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfMonth();
        int int47 = localDateTime45.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str52 = property50.getAsShortText(locale51);
        java.lang.String str53 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, locale51);
        java.lang.String str54 = dateTimeZone23.getShortName((long) 381, locale51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime57 = localDateTime56.toDateTime();
        org.joda.time.DateTime dateTime59 = dateTime57.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime61 = dateTime59.plusHours(0);
        org.joda.time.DateTime dateTime63 = dateTime61.minusSeconds(454);
        org.joda.time.DateTime.Property property64 = dateTime63.weekOfWeekyear();
        int int65 = dateTime63.getWeekOfWeekyear();
        int int66 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTime dateTime67 = dateTime22.toDateTime(dateTimeZone23);
        boolean boolean68 = dateTime7.equals((java.lang.Object) dateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime9", (instant0.compareTo(dateTime9) == 0) == instant0.equals(dateTime9));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = durationFieldType10.isSupported(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withFieldAdded(durationFieldType10, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int22 = dateTime16.get(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        boolean boolean26 = dateTimeFieldType21.isSupported(chronology25);
        boolean boolean27 = durationFieldType10.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField29 = chronology25.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField30 = chronology25.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime28", (dateTime24.compareTo(dateTime28) == 0) == dateTime24.equals(dateTime28));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        charSet4.clear();
        boolean boolean9 = charSet4.equals((java.lang.Object) 874);
        boolean boolean10 = charSet4.isEmpty();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(0L, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = localDate13.toDateMidnight(dateTimeZone14);
        java.lang.String str16 = dateMidnight15.toString();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.Instant instant21 = instant17.minus((long) (byte) 0);
        boolean boolean22 = dateMidnight15.isEqual((org.joda.time.ReadableInstant) instant21);
        org.joda.time.Instant instant24 = instant21.plus((long) 939);
        org.joda.time.DateTime dateTime25 = instant24.toDateTime();
        int int26 = dateTime25.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withDurationAdded(readableDuration27, 83534);
        boolean boolean30 = charSet4.equals((java.lang.Object) 83534);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant24 and dateTime25", (instant24.compareTo(dateTime25) == 0) == instant24.equals(dateTime25));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTime dateTime13 = dateTime5.withChronology(chronology8);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(4);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMillis(202);
        org.joda.time.DateTime dateTime21 = dateTime19.plusDays(255);
        boolean boolean22 = dateTime5.equals((java.lang.Object) 255);
        org.joda.time.DateTime.Property property23 = dateTime5.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("TWN");
        boolean boolean15 = dateTime6.equals((java.lang.Object) builder14);
        org.joda.time.DateTime.Property property16 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime18 = dateTime6.withWeekyear(323);
        org.joda.time.DateTime dateTime19 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 2022);
        org.joda.time.DateTime dateTime23 = dateTime21.plusDays((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property28 = dateTime25.dayOfMonth();
        int int29 = dateTime25.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int31 = dateTime25.get(dateTimeFieldType30);
        int int32 = dateTime21.get(dateTimeFieldType30);
        java.lang.String str33 = dateTimeFieldType30.getName();
        int int34 = dateTime19.get(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime1.minus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime1.dayOfYear();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale locale15 = locale12.stripExtensions();
        org.joda.time.DateTime dateTime16 = property10.setCopy("20", locale12);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime18.get(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        boolean boolean28 = dateTimeFieldType23.isSupported(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime16.toDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfMonth();
        int int35 = dateTime31.getMonthOfYear();
        org.joda.time.Chronology chronology36 = dateTime31.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        org.joda.time.DateTime dateTime41 = dateTime39.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property42 = dateTime39.dayOfMonth();
        int int43 = dateTime39.getMonthOfYear();
        org.joda.time.Chronology chronology44 = dateTime39.getChronology();
        org.joda.time.DurationField durationField45 = chronology44.weekyears();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology44.getZone();
        org.joda.time.Chronology chronology47 = chronology36.withZone(dateTimeZone46);
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        int int52 = localDateTime50.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.minusWeeks(100);
        int[] intArray56 = chronology47.get((org.joda.time.ReadablePartial) localDateTime50, (long) 404);
        org.joda.time.DurationField durationField57 = chronology47.weeks();
        org.joda.time.DurationField durationField58 = chronology47.years();
        org.joda.time.DateTime dateTime59 = dateTime29.toDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField37 and durationField58", (durationField37.compareTo(durationField58) == 0) == durationField37.equals(durationField58));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 365);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 311);
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTime();
        org.joda.time.Instant instant18 = instant14.withDurationAdded((long) 912, 811);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime15", (instant14.compareTo(mutableDateTime15) == 0) == instant14.equals(mutableDateTime15));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.plusYears(386);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusHours(165);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds(202);
        int int15 = localDateTime14.getDayOfWeek();
        org.joda.time.Chronology chronology16 = localDateTime14.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.seconds();
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField17 and durationField18", Math.signum(durationField17.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField17)));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        int int8 = dateTime7.getYearOfEra();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime7.toGregorianCalendar();
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.plus(1645455203698L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant10", (dateTime3.compareTo(instant10) == 0) == dateTime3.equals(instant10));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withYear(708);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = dateTime12.toDateTimeISO();
        int int16 = dateTime12.getDayOfYear();
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.Instant instant21 = instant17.minus((long) (byte) 0);
        boolean boolean22 = dateTime12.isEqual((org.joda.time.ReadableInstant) instant21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant21", (dateTime1.compareTo(instant21) == 0) == dateTime1.equals(instant21));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2022);
        int int2 = dateTime1.getYearOfCentury();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property4 = dateTime3.centuryOfEra();
        org.joda.time.DateTime.Property property5 = dateTime3.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(0L, dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(0L, dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate13.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate13.plus(readablePeriod16);
        org.joda.time.LocalDate localDate18 = localDate10.withFields((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        org.joda.time.LocalDate localDate21 = localDate18.plusWeeks(14);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = localDate23.indexOf(dateTimeFieldType24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localDate23.getFieldTypes();
        org.joda.time.LocalDate.Property property27 = localDate23.yearOfEra();
        org.joda.time.LocalDate localDate28 = property27.roundFloorCopy();
        boolean boolean29 = localDate21.isBefore((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean31 = localDate21.isSupported(dateTimeFieldType30);
        org.joda.time.LocalDate localDate33 = localDate21.plusMonths(0);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone38 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 5, dateTimeZone40);
        int int43 = localDate42.getYearOfEra();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate42.plus(readablePeriod44);
        org.joda.time.LocalDate.Property property46 = localDate42.centuryOfEra();
        boolean boolean47 = fixedDateTimeZone38.equals((java.lang.Object) localDate42);
        org.joda.time.DateTime dateTime48 = localDate21.toDateTimeAtStartOfDay((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        int int50 = fixedDateTimeZone38.getStandardOffset((long) 159);
        org.joda.time.DateTime dateTime51 = dateTime3.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime51", (dateTime3.compareTo(dateTime51) == 0) == dateTime3.equals(dateTime51));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology16);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime25 = dateTime23.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.plusMinutes(165);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekyear((int) 'a');
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfWeek();
        org.joda.time.DateTime dateTime33 = property32.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.property(dateTimeFieldType37);
        boolean boolean41 = dateTime33.isSupported(dateTimeFieldType37);
        int int42 = dateTime18.get(dateTimeFieldType37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime21", (dateTime19.compareTo(dateTime21) == 0) == dateTime19.equals(dateTime21));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 386);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillis(1645454838993L);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) 1645454838993L);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        org.joda.time.Chronology chronology22 = instant19.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        int int11 = dateTime10.getYearOfEra();
        int int12 = dateTime10.getYearOfCentury();
        int int13 = dateTime10.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime19 = property18.getDateTime();
        org.joda.time.DurationField durationField20 = property18.getLeapDurationField();
        org.joda.time.DateTime dateTime21 = property18.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        int int27 = dateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int29 = dateTime23.get(dateTimeFieldType28);
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.Chronology chronology32 = localDateTime30.getChronology();
        boolean boolean33 = dateTimeFieldType28.isSupported(chronology32);
        java.lang.String str34 = dateTimeFieldType28.toString();
        boolean boolean35 = dateTime21.isSupported(dateTimeFieldType28);
        org.joda.time.DateTime.Property property36 = dateTime10.property(dateTimeFieldType28);
        org.joda.time.Instant instant37 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration38 = null;
        org.joda.time.Instant instant39 = instant37.plus(readableDuration38);
        org.joda.time.Chronology chronology40 = instant37.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.era();
        java.util.Locale locale43 = java.util.Locale.ROOT;
        java.lang.String str44 = dateTimeField41.getAsText((long) 1015, locale43);
        java.lang.String str45 = locale43.toLanguageTag();
        java.util.Calendar calendar46 = dateTime10.toCalendar(locale43);
        calendar46.set(53461124, (int) '4', 244, 95, 808);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant37", (dateTime1.compareTo(instant37) == 0) == dateTime1.equals(instant37));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear(708);
        org.joda.time.DateTime dateTime10 = dateTime5.minusMonths(201);
        int int11 = dateTime5.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekyearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.minutes();
        java.lang.String str20 = chronology17.toString();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Chronology chronology24 = chronology17.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime5.toMutableDateTime(chronology24);
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime26", (dateTime3.compareTo(mutableDateTime26) == 0) == dateTime3.equals(mutableDateTime26));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant6 = instant1.withDurationAdded(readableDuration4, 22);
        long long7 = instant6.getMillis();
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str12 = dateTimeZone10.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        org.joda.time.Chronology chronology14 = chronology8.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.era();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 783, chronology8);
        org.joda.time.DurationField durationField17 = chronology8.hours();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology8);
        org.joda.time.DurationField durationField19 = chronology8.centuries();
        org.joda.time.DurationField durationField20 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField17, and durationField19", !(durationField20.compareTo(durationField17) == 0) || (Math.signum(durationField20.compareTo(durationField19)) == Math.signum(durationField17.compareTo(durationField19))));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        boolean boolean7 = dateTime6.isAfterNow();
        boolean boolean9 = dateTime6.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.DateTime.Property property15 = dateTime13.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        int int24 = dateTime20.getMonthOfYear();
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 15, chronology25);
        boolean boolean28 = dateTimeFieldType16.isSupported(chronology25);
        int int29 = dateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime30 = dateTime13.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        org.joda.time.DateTime dateTime34 = dateTime6.toDateTime(dateTimeZone33);
        boolean boolean36 = dateTimeZone33.isStandardOffset((long) 338);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime34", (dateTime5.compareTo(dateTime34) == 0) == dateTime5.equals(dateTime34));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int13 = dateTime10.get(dateTimeFieldType12);
        org.joda.time.DateTime.Property property14 = dateTime10.hourOfDay();
        org.joda.time.DateTime.Property property15 = dateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        int int18 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.era();
        org.joda.time.LocalDateTime localDateTime22 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime23 = property21.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusDays((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology27 = null;
        boolean boolean28 = durationFieldType26.isSupported(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withFieldAdded(durationFieldType26, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfMonth();
        int int36 = dateTime32.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int38 = dateTime32.get(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.Chronology chronology41 = localDateTime39.getChronology();
        boolean boolean42 = dateTimeFieldType37.isSupported(chronology41);
        boolean boolean43 = durationFieldType26.isSupported(chronology41);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DateTime dateTime45 = dateTime10.withChronology(chronology41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime44", (dateTime1.compareTo(dateTime44) == 0) == dateTime1.equals(dateTime44));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayLanguage(locale19);
        java.lang.String str22 = locale14.getDisplayName(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone25);
        java.lang.String str29 = dateTimeZone25.getName(1645462512858L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        int int3 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusWeeks(100);
        boolean boolean7 = localDateTime5.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withField(dateTimeFieldType8, 12);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        boolean boolean15 = dateTimeFieldType8.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.dayOfMonth();
        boolean boolean18 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField19 = chronology13.minutes();
        org.joda.time.DurationField durationField20 = chronology13.weekyears();
        org.joda.time.DurationField durationField21 = chronology13.months();
        org.joda.time.DateTimeField dateTimeField22 = chronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = chronology13.millisOfSecond();
        int int24 = dateTimeField23.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.weekOfWeekyear();
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet32 = locale31.getExtensionKeys();
        java.lang.String str33 = dateTimeField29.getAsShortText((int) (byte) 100, locale31);
        java.lang.String str34 = locale31.getLanguage();
        int int35 = dateTimeField23.getMaximumShortTextLength(locale31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField28", Math.signum(durationField14.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField14)));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant4.withDurationAdded(readableDuration12, 125);
        org.joda.time.Instant instant16 = instant14.minus((long) 85688180);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 241);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusMinutes(53221444);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property25.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime28 = property25.roundHalfEvenCopy();
        int int29 = localDateTime28.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str31 = dateTimeFieldType30.toString();
        java.lang.String str32 = dateTimeFieldType30.toString();
        int int33 = localDateTime28.get(dateTimeFieldType30);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.Chronology chronology36 = localDateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology36);
        org.joda.time.Chronology chronology39 = localDateTime38.getChronology();
        long long43 = chronology39.add(1645454827122L, (-1862278315000L), 386);
        org.joda.time.DateTimeField dateTimeField44 = chronology39.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType30.getField(chronology39);
        int int46 = instant16.get(dateTimeFieldType30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime35", (instant0.compareTo(dateTime35) == 0) == instant0.equals(dateTime35));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.weekyearOfCentury();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DurationField durationField10 = chronology5.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime9", (dateTime1.compareTo(dateTime9) == 0) == dateTime1.equals(dateTime9));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(85706504);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        org.joda.time.DateTime.Property property34 = dateTime30.secondOfDay();
        org.joda.time.DateTime dateTime35 = dateTime30.withLaterOffsetAtOverlap();
        boolean boolean36 = dateTime35.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime35", (dateTime9.compareTo(dateTime35) == 0) == dateTime9.equals(dateTime35));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime30", (dateTime9.compareTo(dateTime30) == 0) == dateTime9.equals(dateTime30));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.plus((long) 420);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 1972);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(165);
        int int17 = dateTime16.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withDurationAdded(readableDuration18, 246);
        org.joda.time.DateTime dateTime22 = dateTime16.plusDays(32772);
        org.joda.time.DateTime.Property property23 = dateTime22.secondOfMinute();
        int int24 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime26 = dateTime22.minusYears(404);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int34 = dateTime28.get(dateTimeFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime28.minus(readablePeriod35);
        org.joda.time.DateTime dateTime38 = dateTime28.minusMillis(55);
        org.joda.time.DateTime dateTime40 = dateTime28.minusMinutes(764);
        boolean boolean41 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType45.getField(chronology46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.property(dateTimeFieldType45);
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime50 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime52 = property48.setCopy(1);
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.era();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime62 = dateTime60.plusHours(0);
        org.joda.time.DateTime dateTime64 = dateTime62.minusSeconds(454);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded(readableDuration65, 858);
        org.joda.time.DateMidnight dateMidnight68 = dateTime64.toDateMidnight();
        int int69 = dateMidnight68.getMinuteOfHour();
        org.joda.time.DateTime dateTime70 = localDateTime56.toDateTime((org.joda.time.ReadableInstant) dateMidnight68);
        org.joda.time.DateTime.Property property71 = dateTime70.era();
        org.joda.time.DurationField durationField72 = property71.getLeapDurationField();
        org.joda.time.DateTime dateTime73 = property71.roundFloorCopy();
        boolean boolean74 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean75 = instant6.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime73.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 246);
        org.joda.time.DateTime dateTime15 = dateTime9.plusDays(32772);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        int int17 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime15.minusYears(404);
        org.joda.time.Instant instant20 = dateTime15.toInstant();
        org.joda.time.Instant instant22 = instant20.minus((long) 85745944);
        org.joda.time.Instant instant24 = instant22.plus((long) 130);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant20", (dateTime15.compareTo(instant20) == 0) == dateTime15.equals(instant20));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale6 = dateTimeFormatter2.getLocale();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime8.get(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        boolean boolean18 = dateTimeFieldType13.isSupported(chronology17);
        org.joda.time.DurationField durationField19 = chronology17.millis();
        org.joda.time.Chronology chronology20 = chronology17.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withChronology(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 354, chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.era();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.plusMillis(155);
        org.joda.time.LocalDateTime.Property property43 = localDateTime40.year();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.minusMonths(544);
        long long47 = chronology25.set((org.joda.time.ReadablePartial) localDateTime40, (long) 588);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter21.withChronology(chronology25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField26", Math.signum(durationField19.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField19)));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(0);
        org.joda.time.DateTime.Property property10 = dateTime7.millisOfDay();
        org.joda.time.DateTime.Property property11 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime7.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property17 = dateTime14.dayOfMonth();
        int int18 = dateTime14.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int20 = dateTime14.get(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.Chronology chronology23 = localDateTime21.getChronology();
        boolean boolean24 = dateTimeFieldType19.isSupported(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime7.property(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.Chronology chronology28 = localDateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.clockhourOfHalfday();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMinutes(1);
        int int36 = property25.getDifference((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime33", (dateTime1.compareTo(dateTime33) == 0) == dateTime1.equals(dateTime33));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType11, 128);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, 897);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        boolean boolean23 = dateTime22.isAfterNow();
        int int24 = dateTime22.getYearOfEra();
        org.joda.time.DateTime dateTime26 = dateTime22.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int34 = dateTime28.get(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.Chronology chronology37 = localDateTime35.getChronology();
        boolean boolean38 = dateTimeFieldType33.isSupported(chronology37);
        org.joda.time.DurationField durationField39 = chronology37.millis();
        org.joda.time.Chronology chronology40 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.era();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        long long45 = chronology40.add(readablePeriod42, (long) 310, 33);
        org.joda.time.DateTime dateTime46 = dateTime26.withChronology(chronology40);
        boolean boolean47 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime49 = dateTime15.plusMonths(874);
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime51 = localDateTime50.toDateTime();
        org.joda.time.Chronology chronology52 = localDateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.Chronology chronology55 = localDateTime54.getChronology();
        long long59 = chronology55.add(1645454827122L, (-1862278315000L), 386);
        org.joda.time.DateTimeField dateTimeField60 = chronology55.hourOfDay();
        int int61 = dateTimeField60.getMinimumValue();
        long long64 = dateTimeField60.add((long) 715, 368);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = dateTimeField60.getType();
        int int66 = dateTime49.get(dateTimeFieldType65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and dateTime46", (dateTime26.compareTo(dateTime46) == 0) == dateTime26.equals(dateTime46));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(85706504);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        org.joda.time.DateTime.Property property34 = dateTime30.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime30.toMutableDateTimeISO();
        org.joda.time.Instant instant36 = dateTime30.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime35", (dateTime9.compareTo(mutableDateTime35) == 0) == dateTime9.equals(mutableDateTime35));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(96);
        int int12 = dateTime9.getMinuteOfDay();
        org.joda.time.DateTime dateTime14 = dateTime9.withWeekyear(663);
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone20 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean21 = fixedDateTimeZone20.isFixed();
        java.lang.String str23 = fixedDateTimeZone20.getNameKey(1645454848886L);
        long long25 = fixedDateTimeZone20.nextTransition(0L);
        org.joda.time.DateTime dateTime26 = dateTime14.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone20);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime32 = dateTime30.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime30.withZone(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.plusMinutes(165);
        int int37 = dateTime36.getDayOfMonth();
        boolean boolean38 = dateTime36.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar39 = dateTime36.toGregorianCalendar();
        org.joda.time.DateTime dateTime40 = dateTime36.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime36.plusMonths(199);
        org.joda.time.DateTime dateTime44 = dateTime42.plusSeconds(0);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillisOfSecond(243);
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfMonth();
        int int49 = localDateTime47.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.minusWeeks(100);
        boolean boolean53 = localDateTime51.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime56 = localDateTime51.withField(dateTimeFieldType54, 12);
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.Chronology chronology59 = localDateTime57.getChronology();
        org.joda.time.DurationField durationField60 = chronology59.days();
        boolean boolean61 = dateTimeFieldType54.isSupported(chronology59);
        org.joda.time.DateTimeField dateTimeField62 = chronology59.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField63 = chronology59.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField64 = chronology59.yearOfCentury();
        long long68 = chronology59.add(1645454860693L, 13562970003000L, 717);
        org.joda.time.DurationField durationField69 = chronology59.weeks();
        org.joda.time.DateTimeField dateTimeField70 = chronology59.centuryOfEra();
        org.joda.time.DateTime dateTime71 = dateTime46.toDateTime(chronology59);
        org.joda.time.DateTime.Property property72 = dateTime46.dayOfYear();
        int int73 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime14", (instant15.compareTo(dateTime14) == 0) == instant15.equals(dateTime14));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        int int21 = dateTimeField18.getLeapAmount((long) 53504576);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) instant7, chronology8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant7.minus(readableDuration10);
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant11.minus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant14 and mutableDateTime12", (instant14.compareTo(mutableDateTime12) == 0) == instant14.equals(mutableDateTime12));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.Chronology chronology23 = chronology20.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTime dateTime27 = instant0.toDateTime(chronology23);
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = chronology17.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.centuryOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        int int23 = localDateTime21.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusWeeks(100);
        boolean boolean27 = localDateTime25.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withField(dateTimeFieldType28, 12);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.Chronology chronology33 = localDateTime31.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.days();
        boolean boolean35 = dateTimeFieldType28.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.dayOfMonth();
        boolean boolean38 = dateTimeFieldType20.isSupported(chronology33);
        org.joda.time.DurationField durationField39 = chronology33.minutes();
        org.joda.time.DurationField durationField40 = chronology33.weekyears();
        org.joda.time.DurationField durationField41 = chronology33.months();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(chronology33);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfMonth();
        int int45 = localDateTime43.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime43.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfYear();
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfEvenCopy();
        java.lang.String str50 = property48.getAsShortText();
        org.joda.time.DateTimeField dateTimeField51 = property48.getField();
        java.lang.String str52 = dateTimeField51.toString();
        long long54 = dateTimeField51.roundHalfCeiling((-1943960879873L));
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property56 = localDateTime55.dayOfMonth();
        int int57 = localDateTime55.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime59 = localDateTime55.minusWeeks(100);
        boolean boolean61 = localDateTime59.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime59.withField(dateTimeFieldType62, 12);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.minusHours(53421477);
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.DateTime dateTime70 = dateTime68.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property71 = dateTime68.dayOfMonth();
        int int72 = dateTime68.getMonthOfYear();
        org.joda.time.Chronology chronology73 = dateTime68.getChronology();
        org.joda.time.DurationField durationField74 = chronology73.weekyears();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime76 = localDateTime75.toDateTime();
        org.joda.time.DateTime dateTime78 = dateTime76.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property79 = dateTime76.dayOfMonth();
        int int80 = dateTime76.getMonthOfYear();
        org.joda.time.Chronology chronology81 = dateTime76.getChronology();
        org.joda.time.DurationField durationField82 = chronology81.weekyears();
        org.joda.time.DateTimeZone dateTimeZone83 = chronology81.getZone();
        org.joda.time.Chronology chronology84 = chronology73.withZone(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = chronology84.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime87 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property88 = localDateTime87.dayOfMonth();
        int int89 = localDateTime87.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime91 = localDateTime87.minusWeeks(100);
        int[] intArray93 = chronology84.get((org.joda.time.ReadablePartial) localDateTime87, (long) 404);
        int int94 = dateTimeField51.getMinimumValue((org.joda.time.ReadablePartial) localDateTime64, intArray93);
        int int95 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) localDateTime42, intArray93);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField40", (durationField7.compareTo(durationField40) == 0) == durationField7.equals(durationField40));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        long long8 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfYear();
        java.lang.String str10 = dateTime5.toString();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        int int17 = dateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int19 = dateTime13.get(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        boolean boolean23 = dateTimeFieldType18.isSupported(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.DurationField durationField25 = durationFieldType11.getField(chronology22);
        org.joda.time.DateTime dateTime26 = dateTime5.toDateTime(chronology22);
        org.joda.time.DateTime.Property property27 = dateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfHalfday();
        org.joda.time.DurationField durationField33 = chronology30.halfdays();
        org.joda.time.DurationField durationField34 = chronology30.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.weekyearOfCentury();
        java.util.Locale locale37 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = locale37.stripExtensions();
        java.util.Locale locale39 = java.util.Locale.UK;
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet41 = locale40.getExtensionKeys();
        java.lang.String str42 = locale39.getDisplayLanguage(locale40);
        java.lang.String str43 = locale38.getDisplayVariant(locale39);
        java.lang.String str44 = dateTimeField35.getAsShortText(85676438, locale38);
        org.joda.time.ReadablePartial readablePartial45 = null;
        org.joda.time.Instant instant47 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant47.plus(readableDuration48);
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.Instant instant52 = instant47.withDurationAdded(readableDuration50, 22);
        org.joda.time.Chronology chronology53 = instant47.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.millisOfDay();
        boolean boolean55 = dateTimeField54.isSupported();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.dayOfMonth();
        int int58 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.dayOfYear();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withMillisOfDay(20);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.plus(readableDuration65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime62.weekyear();
        java.util.Locale locale68 = java.util.Locale.KOREA;
        java.util.Set<java.lang.Character> charSet69 = locale68.getExtensionKeys();
        java.lang.String str70 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) localDateTime62, locale68);
        java.lang.String str71 = dateTimeField35.getAsShortText(readablePartial45, 472, locale68);
        java.util.Calendar calendar72 = dateTime5.toCalendar(locale68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant47", (dateTime1.compareTo(instant47) == 0) == dateTime1.equals(instant47));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone6);
        int int9 = dateTime8.getMillisOfDay();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((java.lang.Object) dateTime8);
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.Instant instant13 = instant10.minus(1645455134677L);
        org.joda.time.DateTime dateTime14 = instant13.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant10", (dateTime8.compareTo(instant10) == 0) == dateTime8.equals(instant10));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(936);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        long long12 = chronology8.add((long) (short) 1, (long) (byte) 0, 2);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime5.toMutableDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime13", (dateTime5.compareTo(mutableDateTime13) == 0) == dateTime5.equals(mutableDateTime13));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.Chronology chronology4 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType11.getField(chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime10.property(dateTimeFieldType11);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.plusYears(386);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        int int21 = localDateTime19.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        java.util.Locale locale25 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str26 = property24.getAsShortText(locale25);
        java.lang.String str27 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime10, locale25);
        java.lang.String str30 = nameProvider0.getName(locale25, "14:47:11.830", "zh");
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusWeeks(100);
        boolean boolean37 = localDateTime35.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withField(dateTimeFieldType38, 12);
        int int41 = localDateTime35.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str43 = dateTimeFieldType42.toString();
        java.lang.String str44 = dateTimeFieldType42.toString();
        org.joda.time.LocalDateTime.Property property45 = localDateTime35.property(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime47 = property45.addToCopy((long) 624);
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        int int49 = property45.getMaximumShortTextLength(locale48);
        java.lang.String str52 = nameProvider0.getShortName(locale48, "366", "Jan");
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime54 = localDateTime53.toDateTime();
        org.joda.time.Chronology chronology55 = localDateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.hourOfHalfday();
        org.joda.time.DurationField durationField58 = chronology55.halfdays();
        org.joda.time.DurationField durationField59 = chronology55.years();
        org.joda.time.DateTimeField dateTimeField60 = chronology55.weekyearOfCentury();
        java.util.Locale locale62 = java.util.Locale.FRANCE;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.UK;
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet66 = locale65.getExtensionKeys();
        java.lang.String str67 = locale64.getDisplayLanguage(locale65);
        java.lang.String str68 = locale63.getDisplayVariant(locale64);
        java.lang.String str69 = dateTimeField60.getAsShortText(85676438, locale63);
        java.lang.String str72 = nameProvider0.getName(locale63, "23:48:35.172", "ap. J.-C.");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField58", Math.signum(durationField5.compareTo(durationField58)) == -Math.signum(durationField58.compareTo(durationField5)));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.toString();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale19.getDisplayLanguage(locale20);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayLanguage(locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = dateTimeZone8.getShortName((long) 851, locale23);
        java.util.TimeZone timeZone28 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str37 = fixedDateTimeZone35.getNameKey(1645454823644L);
        int int39 = fixedDateTimeZone35.getOffsetFromLocal(1645454902505L);
        java.lang.String str41 = fixedDateTimeZone35.getShortName(1645424560251L);
        org.joda.time.DateTime dateTime42 = dateTime29.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime42", (dateTime1.compareTo(dateTime42) == 0) == dateTime1.equals(dateTime42));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int8 = dateTime2.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime2.minus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime2.dayOfYear();
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.lang.String str15 = locale13.getDisplayVariant();
        java.util.Locale locale16 = locale13.stripExtensions();
        org.joda.time.DateTime dateTime17 = property11.setCopy("20", locale13);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillis((long) 404);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        int int23 = localDateTime21.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusWeeks(100);
        boolean boolean27 = localDateTime25.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withField(dateTimeFieldType28, 12);
        int int31 = localDateTime25.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str33 = dateTimeFieldType32.toString();
        java.lang.String str34 = dateTimeFieldType32.toString();
        org.joda.time.LocalDateTime.Property property35 = localDateTime25.property(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        int int38 = dateTimeZone36.getStandardOffset((long) 99);
        boolean boolean39 = localDateTime25.equals((java.lang.Object) dateTimeZone36);
        int int41 = dateTimeZone36.getStandardOffset((long) 817);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) 1645454855241L, dateTimeZone36);
        org.joda.time.DateTime dateTime43 = dateTime17.toDateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(1645454933475L, dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime43", (dateTime17.compareTo(dateTime43) == 0) == dateTime17.equals(dateTime43));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeField dateTimeField12 = chronology2.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        int int13 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime20 = property19.roundCeilingCopy();
        java.util.Locale locale22 = new java.util.Locale("ETC/UTC");
        int int23 = property19.getMaximumTextLength(locale22);
        java.lang.String str24 = locale22.getISO3Country();
        java.util.Calendar calendar25 = dateTime9.toCalendar(locale22);
        org.joda.time.DateTime dateTime27 = dateTime9.withMillisOfDay(60956);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar12 and calendar25", (gregorianCalendar12.compareTo(calendar25) == 0) == gregorianCalendar12.equals(calendar25));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        long long7 = instant6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate15.plus(readablePeriod18);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        boolean boolean22 = instant6.equals((java.lang.Object) localDate20);
        org.joda.time.LocalDate.Property property23 = localDate20.dayOfWeek();
        int int24 = localDate20.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        boolean boolean12 = charSet2.containsAll((java.util.Collection<java.lang.String>) strList8);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant13.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant13.withDurationAdded(readableDuration16, 22);
        long long19 = instant18.getMillis();
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfWeek();
        boolean boolean22 = charSet2.equals((java.lang.Object) chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = chronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = chronology20.halfdayOfDay();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 2042, chronology20);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withZone(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.plusMinutes(165);
        int int38 = dateTime37.getDayOfMonth();
        org.joda.time.DateTime dateTime40 = dateTime37.plusDays(719);
        org.joda.time.DateTime dateTime42 = dateTime40.minusDays(336);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        int int48 = dateTime44.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int50 = dateTime44.get(dateTimeFieldType49);
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime52 = localDateTime51.toDateTime();
        org.joda.time.Chronology chronology53 = localDateTime51.getChronology();
        boolean boolean54 = dateTimeFieldType49.isSupported(chronology53);
        org.joda.time.DateTime.Property property55 = dateTime40.property(dateTimeFieldType49);
        int int56 = localTime27.indexOf(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime29", (instant13.compareTo(dateTime29) == 0) == instant13.equals(dateTime29));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMonths(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale13.getScript();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = property12.getAsText(locale13);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale13);
        int int18 = timeZone1.getRawOffset();
        int int20 = timeZone1.getOffset(1645454827122L);
        java.util.Locale locale21 = java.util.Locale.GERMANY;
        java.lang.String str22 = locale21.getScript();
        java.lang.String str23 = locale21.getCountry();
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str26 = locale24.getDisplayVariant();
        java.util.Locale locale27 = locale24.stripExtensions();
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getISO3Country();
        java.util.Locale locale30 = locale27.stripExtensions();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale30);
        java.lang.String str32 = locale21.getDisplayVariant(locale30);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone1, locale30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar31", (calendar17.compareTo(calendar31) == 0) == calendar17.equals(calendar31));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant0.plus(readableDuration5);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTimeISO();
        long long8 = instant6.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime7", (instant6.compareTo(mutableDateTime7) == 0) == instant6.equals(mutableDateTime7));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.Chronology chronology8 = localDateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField11 = chronology8.halfdays();
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.joda.time.DateTime dateTime13 = dateTime5.withChronology(chronology8);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.joda.time.DateTime.Property property15 = dateTime13.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology17 = null;
        boolean boolean18 = durationFieldType16.isSupported(chronology17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int27 = dateTime21.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        boolean boolean31 = dateTimeFieldType26.isSupported(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.millis();
        org.joda.time.DurationField durationField33 = durationFieldType19.getField(chronology30);
        org.joda.time.DurationField durationField34 = durationFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.weekyear();
        org.joda.time.DurationField durationField36 = chronology30.days();
        org.joda.time.DurationField durationField37 = chronology30.millis();
        org.joda.time.DateTime dateTime38 = dateTime13.withChronology(chronology30);
        org.joda.time.DateTimeField dateTimeField39 = chronology30.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime13", (dateTime5.compareTo(dateTime13) == 0) == dateTime5.equals(dateTime13));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime7.minusDays(452);
        boolean boolean45 = dateTime43.isBefore((long) 53469938);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (byte) -1);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology11 = null;
        boolean boolean12 = durationFieldType10.isSupported(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withFieldAdded(durationFieldType10, (int) (short) 10);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int22 = dateTime16.get(dateTimeFieldType21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = localDateTime23.getChronology();
        boolean boolean26 = dateTimeFieldType21.isSupported(chronology25);
        boolean boolean27 = durationFieldType10.isSupported(chronology25);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField29 = chronology25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        int int33 = localDateTime31.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime31.minusWeeks(100);
        boolean boolean37 = localDateTime35.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime35.withField(dateTimeFieldType38, 12);
        int int41 = localDateTime35.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str43 = dateTimeFieldType42.toString();
        java.lang.String str44 = dateTimeFieldType42.toString();
        org.joda.time.LocalDateTime.Property property45 = localDateTime35.property(dateTimeFieldType42);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        int int48 = dateTimeZone46.getStandardOffset((long) 99);
        boolean boolean49 = localDateTime35.equals((java.lang.Object) dateTimeZone46);
        int int51 = dateTimeZone46.getStandardOffset((long) 817);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) 1645454855241L, dateTimeZone46);
        java.util.Locale.Category category53 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale54 = java.util.Locale.getDefault(category53);
        java.util.Locale locale55 = java.util.Locale.getDefault(category53);
        java.util.Locale locale56 = java.util.Locale.getDefault(category53);
        java.util.Locale locale57 = java.util.Locale.getDefault(category53);
        java.lang.String str58 = dateTimeField29.getAsText((org.joda.time.ReadablePartial) localDateTime52, locale57);
        java.util.Locale locale59 = locale57.stripExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime28", (dateTime16.compareTo(dateTime28) == 0) == dateTime16.equals(dateTime28));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) '4');
        org.joda.time.LocalTime.Property property5 = localTime4.hourOfDay();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes(549);
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.joda.time.Instant instant13 = instant9.minus((long) (byte) 0);
        org.joda.time.DateTime dateTime14 = localTime6.toDateTime((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTime dateTime15 = instant9.toDateTimeISO();
        org.joda.time.Instant instant17 = instant9.plus(58291L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime15", (instant9.compareTo(dateTime15) == 0) == instant9.equals(dateTime15));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.Instant instant10 = dateTime8.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.minus(readableDuration11);
        org.joda.time.DateTime dateTime13 = instant10.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant10", (dateTime3.compareTo(instant10) == 0) == dateTime3.equals(instant10));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        java.lang.String str6 = timeZone3.getID();
        java.lang.String str7 = timeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        int int13 = timeZone11.getOffset(4L);
        java.lang.String str14 = timeZone11.getID();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone11);
        timeZone11.setID("2022-02-21T14:10:15.309");
        boolean boolean18 = timeZone3.hasSameRules(timeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int27 = dateTime21.get(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        boolean boolean31 = dateTimeFieldType26.isSupported(chronology30);
        boolean boolean32 = dateTimeFieldType19.isSupported(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = chronology30.secondOfDay();
        java.util.Locale locale34 = java.util.Locale.UK;
        java.lang.String str35 = locale34.getDisplayCountry();
        java.util.Locale locale36 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet37 = locale36.getExtensionKeys();
        java.lang.String str38 = locale36.getDisplayVariant();
        java.util.Locale locale39 = locale36.stripExtensions();
        java.lang.String str40 = locale34.getDisplayLanguage(locale36);
        int int41 = dateTimeField33.getMaximumTextLength(locale34);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone3, locale34);
        java.util.TimeZone.setDefault(timeZone3);
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.lang.String str45 = locale44.getDisplayCountry();
        java.lang.String str46 = timeZone3.getDisplayName(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar42", (calendar15.compareTo(calendar42) == 0) == calendar15.equals(calendar42));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.toString();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale19.getDisplayLanguage(locale20);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayLanguage(locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = dateTimeZone8.getShortName((long) 851, locale23);
        java.util.TimeZone timeZone28 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.DateTime.Property property30 = dateTime29.dayOfMonth();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone35 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str37 = fixedDateTimeZone35.getNameKey(1645454823644L);
        int int39 = fixedDateTimeZone35.getOffsetFromLocal(1645454902505L);
        java.lang.String str41 = fixedDateTimeZone35.getShortName(1645424560251L);
        org.joda.time.DateTime dateTime42 = dateTime29.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone35);
        long long44 = fixedDateTimeZone35.previousTransition(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime42", (dateTime1.compareTo(dateTime42) == 0) == dateTime1.equals(dateTime42));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = dateMidnight4.toDateTime(dateTimeZone6);
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime();
        int int11 = dateTimeZone6.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime12 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfYear();
        org.joda.time.DateTime.Property property14 = dateTime12.weekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime12.millisOfSecond();
        int int16 = dateTime12.getSecondOfMinute();
        org.joda.time.Instant instant17 = dateTime12.toInstant();
        org.joda.time.Instant instant20 = instant17.withDurationAdded(670L, 887);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        long long23 = instant17.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant17", (dateTime12.compareTo(instant17) == 0) == dateTime12.equals(instant17));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 14);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.plus(readablePeriod7);
        int int9 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.Instant instant14 = instant10.minus((long) (byte) 0);
        org.joda.time.Instant instant17 = instant14.withDurationAdded((long) 0, 24);
        org.joda.time.MutableDateTime mutableDateTime18 = instant14.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int20 = instant14.get(dateTimeFieldType19);
        boolean boolean21 = localTime1.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime18", (instant10.compareTo(mutableDateTime18) == 0) == instant10.equals(mutableDateTime18));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.property(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, chronology20);
        org.joda.time.DateTime dateTime22 = dateTime3.toDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime3.toMutableDateTime();
        int int24 = dateTime3.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and mutableDateTime23", (dateTime22.compareTo(mutableDateTime23) == 0) == dateTime22.equals(mutableDateTime23));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayLanguage(locale19);
        java.lang.String str22 = locale14.getDisplayName(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        int int32 = dateTime27.get(dateTimeFieldType29);
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType29.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate7.minus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = localDate14.toDateTimeAtStartOfDay();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTimeISO();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone22 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str24 = fixedDateTimeZone22.getNameKey(1645454823644L);
        int int26 = fixedDateTimeZone22.getStandardOffset((long) 1015);
        boolean boolean28 = fixedDateTimeZone22.isStandardOffset(0L);
        boolean boolean30 = fixedDateTimeZone22.isStandardOffset((long) 411);
        org.joda.time.DateTime dateTime31 = dateTime15.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone22);
        boolean boolean33 = dateTime15.isBefore((long) 341);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime17 and dateTime31", (mutableDateTime17.compareTo(dateTime31) == 0) == mutableDateTime17.equals(dateTime31));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property6 = dateTime3.dayOfMonth();
        int int7 = dateTime3.getMonthOfYear();
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 15, chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.era();
        org.joda.time.DurationField durationField12 = durationFieldType0.getField(chronology8);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.era();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.minusMinutes((int) (short) 0);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DurationField durationField24 = chronology21.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = chronology21.centuryOfEra();
        boolean boolean26 = durationFieldType0.isSupported(chronology21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime16 = property14.roundFloorCopy();
        boolean boolean17 = dateTime16.isAfterNow();
        boolean boolean19 = dateTime16.isEqual((long) 258);
        org.joda.time.DateTime.Property property20 = dateTime16.centuryOfEra();
        boolean boolean21 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.Instant instant23 = instant9.plus((long) 53604423);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime11", (instant9.compareTo(dateTime11) == 0) == instant9.equals(dateTime11));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.DateTime.Property property8 = dateTime7.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.minus(readablePeriod9);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str17 = fixedDateTimeZone15.getNameKey(1645454823644L);
        int int19 = fixedDateTimeZone15.getStandardOffset((long) 1015);
        boolean boolean21 = fixedDateTimeZone15.isStandardOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime7.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        long long24 = fixedDateTimeZone15.previousTransition(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime22", (dateTime7.compareTo(mutableDateTime22) == 0) == dateTime7.equals(mutableDateTime22));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime7.minusDays(452);
        org.joda.time.DateTime dateTime45 = dateTime7.plus((-1241999526L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        boolean boolean11 = dateTimeFieldType6.isSupported(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology13 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DurationField durationField16 = chronology10.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField15", Math.signum(durationField12.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField12)));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 615);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.plus((long) 420);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 1972);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(165);
        int int17 = dateTime16.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withDurationAdded(readableDuration18, 246);
        org.joda.time.DateTime dateTime22 = dateTime16.plusDays(32772);
        org.joda.time.DateTime.Property property23 = dateTime22.secondOfMinute();
        int int24 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime26 = dateTime22.minusYears(404);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int34 = dateTime28.get(dateTimeFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime28.minus(readablePeriod35);
        org.joda.time.DateTime dateTime38 = dateTime28.minusMillis(55);
        org.joda.time.DateTime dateTime40 = dateTime28.minusMinutes(764);
        boolean boolean41 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType45.getField(chronology46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.property(dateTimeFieldType45);
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime50 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime52 = property48.setCopy(1);
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.era();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime62 = dateTime60.plusHours(0);
        org.joda.time.DateTime dateTime64 = dateTime62.minusSeconds(454);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded(readableDuration65, 858);
        org.joda.time.DateMidnight dateMidnight68 = dateTime64.toDateMidnight();
        int int69 = dateMidnight68.getMinuteOfHour();
        org.joda.time.DateTime dateTime70 = localDateTime56.toDateTime((org.joda.time.ReadableInstant) dateMidnight68);
        org.joda.time.DateTime.Property property71 = dateTime70.era();
        org.joda.time.DurationField durationField72 = property71.getLeapDurationField();
        org.joda.time.DateTime dateTime73 = property71.roundFloorCopy();
        boolean boolean74 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean75 = instant6.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.Instant instant76 = instant6.toInstant();
        org.joda.time.DateTime dateTime77 = instant6.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        int int6 = dateTime5.getMonthOfYear();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone16);
        java.lang.String str25 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime26 = dateTime5.withZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.centuryOfEra();
        boolean boolean32 = dateTime5.equals((java.lang.Object) property31);
        org.joda.time.DateTime dateTime33 = property31.getDateTime();
        org.joda.time.Instant instant34 = dateTime33.toInstant();
        org.joda.time.DateTime dateTime36 = dateTime33.plusYears((int) 'x');
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant34", (dateTime1.compareTo(instant34) == 0) == dateTime1.equals(instant34));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) 'u');
        org.joda.time.DateTime.Property property10 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra(923);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.Chronology chronology17 = localDateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.clockhourOfHalfday();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime24 = dateTime22.withYear(967);
        org.joda.time.DateTime dateTime27 = dateTime22.withDurationAdded((long) 269, 525);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        boolean boolean31 = dateTimeFormatter30.isParser();
        java.util.Locale locale32 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter30.withLocale(locale32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter33.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        int int48 = dateTime44.getMonthOfYear();
        org.joda.time.Chronology chronology49 = dateTime44.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.weekyears();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.Chronology chronology52 = chronology41.withZone(dateTimeZone51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter34.withChronology(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.year();
        org.joda.time.DateTimeField dateTimeField56 = chronology52.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField57 = chronology52.yearOfEra();
        org.joda.time.DurationField durationField58 = chronology52.hours();
        org.joda.time.DateTime dateTime59 = dateTime22.toDateTime(chronology52);
        int int60 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime22", (dateTime1.compareTo(dateTime22) == 0) == dateTime1.equals(dateTime22));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime5.secondOfMinute();
        org.joda.time.DateTime dateTime8 = dateTime5.withWeekyear(708);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        boolean boolean12 = dateTimeFormatter11.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = dateTimeFormatter11.getPrinter();
        boolean boolean14 = dateTimeFormatter11.isOffsetParsed();
        java.util.Locale locale15 = dateTimeFormatter11.getLocale();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        int int21 = dateTime17.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime17.get(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        boolean boolean27 = dateTimeFieldType22.isSupported(chronology26);
        org.joda.time.DurationField durationField28 = chronology26.millis();
        org.joda.time.Chronology chronology29 = chronology26.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter11.withChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField31 = chronology29.year();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.year();
        org.joda.time.DateTimeField dateTimeField33 = chronology29.millisOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology29.halfdayOfDay();
        org.joda.time.DateTime dateTime35 = dateTime5.toDateTime(chronology29);
        org.joda.time.DateTime dateTime38 = dateTime35.withDurationAdded(1645454980134L, 2387);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        int int11 = dateTime10.getYearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime10.withCenturyOfEra(1969);
        java.util.Date date14 = dateTime10.toDate();
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime10.withPeriodAdded(readablePeriod16, 121);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 2022);
        int int21 = dateTime20.getYearOfCentury();
        org.joda.time.DateTime dateTime22 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property23 = dateTime22.centuryOfEra();
        boolean boolean25 = dateTime22.isAfter((long) 121);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant28.plus(readableDuration29);
        boolean boolean31 = dateTimeZone26.equals((java.lang.Object) readableDuration29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        long long36 = dateTimeZone26.convertLocalToUTC((long) 675, true, (long) 32400869);
        org.joda.time.DateTime dateTime37 = dateTime22.withZoneRetainFields(dateTimeZone26);
        java.lang.String str39 = dateTimeZone26.getShortName((long) 894);
        org.joda.time.DateTime dateTime40 = dateTime18.withZoneRetainFields(dateTimeZone26);
        java.lang.String str42 = dateTimeZone26.getName(53536000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant28", (dateTime1.compareTo(instant28) == 0) == dateTime1.equals(instant28));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 246);
        int int14 = dateTime9.getCenturyOfEra();
        org.joda.time.DateTime dateTime16 = dateTime9.minusMonths(626);
        int int17 = dateTime9.getWeekyear();
        long long18 = dateTime9.getMillis();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        boolean boolean22 = dateTimeFormatter21.isParser();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.UK;
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.lang.String str28 = locale25.getDisplayLanguage(locale26);
        java.lang.String str29 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter21.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter21.withDefaultYear(501);
        java.util.Locale locale34 = new java.util.Locale("23:47:44.118");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter21.withLocale(locale34);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        long long42 = fixedDateTimeZone40.nextTransition((long) 596);
        int int44 = fixedDateTimeZone40.getOffset((long) 526);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter35.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(85746737);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter35.withZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime9.toMutableDateTime(dateTimeZone47);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime49", (dateTime9.compareTo(mutableDateTime49) == 0) == dateTime9.equals(mutableDateTime49));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) calendar0);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime2.toMutableDateTime(chronology8);
        org.joda.time.DateTime dateTime12 = dateTime2.plusDays(652);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime10", (dateTime4.compareTo(mutableDateTime10) == 0) == dateTime4.equals(mutableDateTime10));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        int int6 = dateTime1.getMinuteOfHour();
        org.joda.time.DateTime.Property property7 = dateTime1.year();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.property(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears(386);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.minusWeeks(404);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isParser();
        java.util.Locale locale24 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withLocale(locale24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter25.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.weekyears();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology41.getZone();
        org.joda.time.Chronology chronology44 = chronology33.withZone(dateTimeZone43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter26.withChronology(chronology44);
        boolean boolean46 = dateTimeFormatter45.isOffsetParsed();
        org.joda.time.Chronology chronology47 = dateTimeFormatter45.getChronolgy();
        boolean boolean48 = localDateTime19.equals((java.lang.Object) chronology47);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 91, chronology47);
        org.joda.time.DateTime dateTime50 = dateTime1.toDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime28", (instant5.compareTo(dateTime28) == 0) == instant5.equals(dateTime28));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 769, dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMillis(570);
        int int6 = dateTime5.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.Chronology chronology9 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime5.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime13 = dateTime5.minusYears(79);
        boolean boolean15 = dateTime5.isEqual(3849984000300L);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime5.plus(readablePeriod16);
        boolean boolean19 = dateTime5.isBefore((long) 528);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime5", (mutableDateTime11.compareTo(dateTime5) == 0) == mutableDateTime11.equals(dateTime5));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        java.lang.String str20 = dateTimeField18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField19", (durationField7.compareTo(durationField19) == 0) == durationField7.equals(durationField19));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField7 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.secondOfDay();
        org.joda.time.DurationField durationField9 = chronology2.centuries();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.clockhourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTimeZone dateTimeZone12 = chronology2.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        int int5 = dateTime3.getYearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime3.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int15 = dateTime9.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.Chronology chronology21 = chronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.era();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology21.add(readablePeriod23, (long) 310, 33);
        org.joda.time.DateTime dateTime27 = dateTime7.withChronology(chronology21);
        int int28 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime30 = dateTime27.plusSeconds(918);
        java.util.Date date31 = dateTime27.toDate();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime27.plus(readableDuration32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.minus(readableDuration34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime35", (dateTime7.compareTo(dateTime35) == 0) == dateTime7.equals(dateTime35));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone3 = dateTimeZone0.toTimeZone();
        int int5 = timeZone3.getOffset(4L);
        java.lang.String str6 = timeZone3.getID();
        java.lang.String str7 = timeZone3.getID();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str10 = dateTimeZone8.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone11 = dateTimeZone8.toTimeZone();
        int int13 = timeZone11.getOffset(4L);
        java.lang.String str14 = timeZone11.getID();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone11);
        timeZone11.setID("2022-02-21T14:10:15.309");
        boolean boolean18 = timeZone3.hasSameRules(timeZone11);
        timeZone3.setRawOffset(140);
        java.util.TimeZone.setDefault(timeZone3);
        org.joda.time.format.DateTimePrinter dateTimePrinter22 = null;
        org.joda.time.format.DateTimeParser dateTimeParser23 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter22, dateTimeParser23);
        boolean boolean25 = dateTimeFormatter24.isParser();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.UK;
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet30 = locale29.getExtensionKeys();
        java.lang.String str31 = locale28.getDisplayLanguage(locale29);
        java.lang.String str32 = locale27.getDisplayVariant(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter24.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter24.withDefaultYear(501);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter24.withPivotYear(909);
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeFormatter24.getZone();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter24.withZone(dateTimeZone39);
        java.util.Locale locale44 = new java.util.Locale("2022", "100", "1970-01-01T00:00:00.000Z");
        java.util.Locale.setDefault(locale44);
        java.lang.String str46 = locale44.getDisplayVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter24.withLocale(locale44);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(timeZone3, locale44);
        int int49 = timeZone3.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar15 and calendar48", (calendar15.compareTo(calendar48) == 0) == calendar15.equals(calendar48));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getDayOfMonth();
        boolean boolean17 = dateTime15.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds(53221444);
        int int21 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = instant5.toDateTimeISO();
        org.joda.time.Instant instant24 = instant5.withMillis((long) 128);
        long long25 = instant5.getMillis();
        org.joda.time.Instant instant27 = instant5.withMillis((long) 828);
        org.joda.time.Instant instant29 = instant27.plus((long) 911);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DurationField durationField6 = chronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21T14:47:24.584Z");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        boolean boolean5 = dateTimeFormatter4.isParser();
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet10 = locale9.getExtensionKeys();
        java.lang.String str11 = locale8.getDisplayLanguage(locale9);
        java.lang.String str12 = locale7.getDisplayVariant(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter4.withLocale(locale8);
        java.lang.String str14 = locale8.getISO3Country();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone1, locale8);
        java.lang.String str16 = calendar15.getCalendarType();
        int int17 = calendar15.getMinimalDaysInFirstWeek();
        int int18 = calendar15.getMinimalDaysInFirstWeek();
        java.util.Date date25 = new java.util.Date(178, 916, 550, 117, 633, 456);
        calendar15.setTime(date25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        org.joda.time.DurationField durationField30 = dateTimeField29.getDurationField();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        int[] intArray38 = new int[] { (byte) -1, (short) 100, (byte) -1, (byte) 100, (short) 0 };
        int[] intArray40 = dateTimeField29.add((org.joda.time.ReadablePartial) localDateTime31, 0, intArray38, 0);
        org.joda.time.DateTime dateTime41 = localDateTime31.toDateTime();
        org.joda.time.LocalDateTime localDateTime42 = dateTime41.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime46 = property45.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType47.getField(chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.property(dateTimeFieldType47);
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime52 = property50.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfMonth();
        int int55 = localDateTime53.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime53.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfYear();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundHalfEvenCopy();
        org.joda.time.Chronology chronology60 = localDateTime59.getChronology();
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime52, chronology60);
        org.joda.time.DateTime dateTime62 = org.joda.time.DateTime.now(chronology60);
        org.joda.time.DurationField durationField63 = chronology60.halfdays();
        org.joda.time.DurationField durationField64 = chronology60.days();
        org.joda.time.LocalDateTime localDateTime65 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime42, chronology60);
        boolean boolean66 = calendar15.equals((java.lang.Object) localDateTime65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime41 and dateTime62", (dateTime41.compareTo(dateTime62) == 0) == dateTime41.equals(dateTime62));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime9 = dateTime0.withFields((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes(316);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((long) 785);
        org.joda.time.Instant instant14 = instant13.toInstant();
        int int15 = dateTime11.compareTo((org.joda.time.ReadableInstant) instant13);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.property(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.plusYears(386);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.monthOfYear();
        int int26 = localDateTime24.getDayOfMonth();
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(566);
        boolean boolean30 = instant13.isEqual((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant13.withDurationAdded(readableDuration31, 53395298);
        org.joda.time.MutableDateTime mutableDateTime34 = instant13.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime40 = dateTime38.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = dateTime38.withZone(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes(165);
        int int45 = dateTime44.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime48 = dateTime44.withDurationAdded(readableDuration46, 246);
        org.joda.time.DateTime dateTime50 = dateTime44.plusDays(32772);
        org.joda.time.DateTime.Property property51 = dateTime50.secondOfMinute();
        int int52 = dateTime50.getMillisOfSecond();
        org.joda.time.DateTime dateTime54 = dateTime50.minusYears(404);
        org.joda.time.DateTimeZone dateTimeZone55 = dateTime54.getZone();
        boolean boolean56 = instant13.isBefore((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime34", (instant13.compareTo(mutableDateTime34) == 0) == instant13.equals(mutableDateTime34));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.getDateTime();
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        java.lang.String str9 = property8.getName();
        org.joda.time.DateTime dateTime10 = property8.getDateTime();
        org.joda.time.DateTime dateTime11 = property8.withMaximumValue();
        org.joda.time.DateTime dateTime12 = property8.roundCeilingCopy();
        org.joda.time.DurationField durationField13 = property8.getDurationField();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = property15.withMinimumValue();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.era();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMonths(0);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfCentury();
        java.util.Locale locale31 = java.util.Locale.FRENCH;
        java.lang.String str32 = locale31.getScript();
        java.util.Locale.setDefault(locale31);
        java.lang.String str34 = property30.getAsText(locale31);
        java.util.Calendar calendar35 = java.util.Calendar.getInstance(timeZone19, locale31);
        int int36 = property15.getMaximumTextLength(locale31);
        int int37 = property8.getMaximumShortTextLength(locale31);
        org.joda.time.Instant instant38 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant38.plus(readableDuration39);
        org.joda.time.Chronology chronology41 = instant38.getChronology();
        org.joda.time.Instant instant42 = instant38.toInstant();
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.Instant instant45 = instant42.withDurationAdded(readableDuration43, 61866337);
        long long46 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) instant45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant45", (dateTime1.compareTo(instant45) == 0) == dateTime1.equals(instant45));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology1 = null;
        boolean boolean2 = durationFieldType0.isSupported(chronology1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime5.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property8 = dateTime5.dayOfMonth();
        int int9 = dateTime5.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int11 = dateTime5.get(dateTimeFieldType10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        boolean boolean15 = dateTimeFieldType10.isSupported(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.millis();
        org.joda.time.DurationField durationField17 = durationFieldType3.getField(chronology14);
        org.joda.time.DurationField durationField18 = durationFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.monthOfYear();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField23 = chronology14.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime22", (dateTime5.compareTo(dateTime22) == 0) == dateTime5.equals(dateTime22));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(501);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear(909);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeFormatter2.getZone();
        int int17 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.eras();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType27.getField(chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime26.property(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime26.plusYears(386);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime26.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfMonth();
        int int37 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfYear();
        java.util.Locale locale41 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str42 = property40.getAsShortText(locale41);
        java.lang.String str43 = dateTimeField23.getAsShortText((org.joda.time.ReadablePartial) localDateTime26, locale41);
        long long45 = dateTimeField23.roundCeiling((long) (byte) 100);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.Chronology chronology48 = localDateTime46.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.eras();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.weekOfWeekyear();
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet53 = locale52.getExtensionKeys();
        java.lang.String str54 = dateTimeField50.getAsShortText((int) (byte) 100, locale52);
        int int55 = dateTimeField23.getMaximumShortTextLength(locale52);
        java.util.Locale.Builder builder56 = new java.util.Locale.Builder();
        java.util.Locale locale57 = builder56.build();
        java.util.Locale locale58 = builder56.build();
        java.lang.String str59 = locale52.getDisplayCountry(locale58);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter2.withLocale(locale52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter60.withPivotYear((java.lang.Integer) 607);
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property64 = localDateTime63.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime65 = property64.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTimeField dateTimeField68 = dateTimeFieldType66.getField(chronology67);
        org.joda.time.LocalDateTime.Property property69 = localDateTime65.property(dateTimeFieldType66);
        org.joda.time.LocalDateTime localDateTime70 = property69.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime71 = property69.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime73 = property69.setCopy(1);
        org.joda.time.DateTime dateTime74 = localDateTime73.toDateTime();
        org.joda.time.LocalDateTime localDateTime75 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime76 = localDateTime75.toDateTime();
        org.joda.time.Chronology chronology77 = localDateTime75.getChronology();
        org.joda.time.DateTimeField dateTimeField78 = chronology77.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField79 = chronology77.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField80 = chronology77.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField81 = chronology77.minuteOfDay();
        org.joda.time.DateTime dateTime82 = dateTime74.toDateTime(chronology77);
        java.util.Locale locale83 = java.util.Locale.ENGLISH;
        java.lang.String str84 = locale83.getScript();
        java.util.Calendar calendar85 = dateTime82.toCalendar(locale83);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter86 = dateTimeFormatter62.withLocale(locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime74 and dateTime82", (dateTime74.compareTo(dateTime82) == 0) == dateTime74.equals(dateTime82));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType9.getField(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime8.property(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusYears(386);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = property22.getAsShortText(locale23);
        java.lang.String str25 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDateTime8, locale23);
        org.joda.time.LocalDateTime.Property property26 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime27 = property26.getLocalDateTime();
        java.util.Locale locale31 = new java.util.Locale("\u4e2d\u6587", "Etc/UTC", "minuteOfHour");
        int int32 = property26.getMaximumShortTextLength(locale31);
        java.util.Locale locale33 = locale31.stripExtensions();
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.plus(readableDuration35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant39 = instant34.withDurationAdded(readableDuration37, 22);
        long long40 = instant39.getMillis();
        org.joda.time.Chronology chronology41 = instant39.getChronology();
        boolean boolean42 = locale33.equals((java.lang.Object) instant39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant39", (dateTime1.compareTo(instant39) == 0) == dateTime1.equals(instant39));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTimeISO();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime localTime11 = localTime7.minusHours((int) '4');
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime11.minus(readablePeriod12);
        org.joda.time.LocalTime.Property property14 = localTime11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime16 = localTime11.plus(readablePeriod15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str18 = dateTimeFieldType17.toString();
        int int19 = localTime11.indexOf(dateTimeFieldType17);
        int int20 = instant5.get(dateTimeFieldType17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime6", (instant5.compareTo(mutableDateTime6) == 0) == instant5.equals(mutableDateTime6));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        long long8 = dateTime5.getMillis();
        org.joda.time.DateTime.Property property9 = dateTime5.dayOfYear();
        java.lang.String str10 = dateTime5.toString();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        int int17 = dateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int19 = dateTime13.get(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        boolean boolean23 = dateTimeFieldType18.isSupported(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.millis();
        org.joda.time.DurationField durationField25 = durationFieldType11.getField(chronology22);
        org.joda.time.DateTime dateTime26 = dateTime5.toDateTime(chronology22);
        org.joda.time.DateTime.Property property27 = dateTime5.millisOfSecond();
        org.joda.time.DateTime dateTime28 = property27.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime26", (dateTime28.compareTo(dateTime26) == 0) == dateTime28.equals(dateTime26));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
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
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant12.plus(readableDuration13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant12.withDurationAdded(readableDuration15, 22);
        long long18 = instant17.getMillis();
        org.joda.time.Chronology chronology19 = instant17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfWeek();
        boolean boolean21 = charSet1.equals((java.lang.Object) chronology19);
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology19);
        org.joda.time.DurationField durationField24 = chronology19.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField24, and durationField22", !(durationField22.compareTo(durationField24) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField24.compareTo(durationField22))));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime1.minus(readablePeriod8);
        org.joda.time.DateTime.Property property10 = dateTime1.dayOfYear();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.lang.String str14 = locale12.getDisplayVariant();
        java.util.Locale locale15 = locale12.stripExtensions();
        org.joda.time.DateTime dateTime16 = property10.setCopy("20", locale12);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime18.get(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        boolean boolean28 = dateTimeFieldType23.isSupported(chronology27);
        org.joda.time.DateTime dateTime29 = dateTime16.toDateTime(chronology27);
        org.joda.time.DurationField durationField30 = chronology27.days();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        long long34 = chronology27.add(readablePeriod31, 2386939829345L, 438);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime29", (dateTime16.compareTo(dateTime29) == 0) == dateTime16.equals(dateTime29));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology3.eras();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 85706504, chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField4 and durationField9", Math.signum(durationField4.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField4)));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.centuryOfEra();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 354, chronology3);
        org.joda.time.DateTimeField dateTimeField8 = chronology3.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMonths(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusMillis(155);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.year();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusMonths(544);
        long long25 = chronology3.set((org.joda.time.ReadablePartial) localDateTime18, (long) 588);
        org.joda.time.DurationField durationField26 = chronology3.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField26, and durationField4", !(durationField4.compareTo(durationField26) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField26.compareTo(durationField4))));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(85706504);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        org.joda.time.DateTime.Property property34 = dateTime30.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime30.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property36 = dateTime30.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime35", (dateTime9.compareTo(mutableDateTime35) == 0) == dateTime9.equals(mutableDateTime35));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        boolean boolean10 = instant6.isBefore(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks(202);
        org.joda.time.Chronology chronology10 = dateTime7.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        int int16 = dateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int18 = dateTime12.get(dateTimeFieldType17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime12.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime12.dayOfYear();
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.util.Locale locale26 = locale23.stripExtensions();
        org.joda.time.DateTime dateTime27 = property21.setCopy("20", locale23);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfMonth();
        int int33 = dateTime29.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int35 = dateTime29.get(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        boolean boolean39 = dateTimeFieldType34.isSupported(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime27.toDateTime(chronology38);
        boolean boolean41 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime.Property property42 = dateTime7.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime40", (dateTime27.compareTo(dateTime40) == 0) == dateTime27.equals(dateTime40));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        int int13 = dateTime9.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.plus(readableDuration17);
        boolean boolean19 = dateTimeZone14.equals((java.lang.Object) readableDuration17);
        int int21 = dateTimeZone14.getOffset((long) 775);
        java.util.TimeZone timeZone22 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime23 = dateTime9.toDateTime(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant16", (dateTime1.compareTo(instant16) == 0) == dateTime1.equals(instant16));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant3.plus(readableDuration4);
        boolean boolean6 = dateTimeZone1.equals((java.lang.Object) readableDuration4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) 86399999, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusSeconds(53237339);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusSeconds(272);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime8.plusMillis(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime18.property(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime24 = property22.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime26 = property22.setCopy(1);
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.minuteOfDay();
        org.joda.time.DateTime dateTime35 = dateTime27.toDateTime(chronology30);
        org.joda.time.DateTime.Property property36 = dateTime27.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime39 = dateTime27.withPeriodAdded(readablePeriod37, 605);
        boolean boolean40 = localDateTime8.equals((java.lang.Object) dateTime39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime29", (instant3.compareTo(dateTime29) == 0) == instant3.equals(dateTime29));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = dateTimeFormatter6.getPrinter();
        org.joda.time.Chronology chronology27 = dateTimeFormatter6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter6.withPivotYear(615);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter6.withPivotYear(0);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str35 = dateTimeZone33.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone36 = dateTimeZone33.toTimeZone();
        int int38 = dateTimeZone33.getOffsetFromLocal((long) 122);
        long long42 = dateTimeZone33.convertLocalToUTC(1645454854927L, false, (long) 281);
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter6.withZone(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime47 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.dayOfMonth();
        int int49 = localDateTime47.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.dayOfYear();
        boolean boolean53 = dateTimeZone46.isLocalDateTimeGap(localDateTime51);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 2022, dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now(dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str58 = dateTimeZone56.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone59 = dateTimeZone56.toTimeZone();
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime62 = localDateTime61.toDateTime();
        org.joda.time.Chronology chronology63 = localDateTime61.getChronology();
        org.joda.time.DurationField durationField64 = chronology63.eras();
        org.joda.time.DateTimeField dateTimeField65 = chronology63.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField66 = chronology63.hourOfDay();
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property68 = localDateTime67.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime69 = property68.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateTimeField dateTimeField72 = dateTimeFieldType70.getField(chronology71);
        org.joda.time.LocalDateTime.Property property73 = localDateTime69.property(dateTimeFieldType70);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime69.plusYears(386);
        org.joda.time.LocalDateTime localDateTime77 = localDateTime69.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime78 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.dayOfMonth();
        int int80 = localDateTime78.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime82 = localDateTime78.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property83 = localDateTime82.dayOfYear();
        java.util.Locale locale84 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str85 = property83.getAsShortText(locale84);
        java.lang.String str86 = dateTimeField66.getAsShortText((org.joda.time.ReadablePartial) localDateTime69, locale84);
        java.lang.String str87 = dateTimeZone56.getShortName((long) 381, locale84);
        java.lang.String str89 = dateTimeZone56.getShortName(1645454827791L);
        long long91 = dateTimeZone46.getMillisKeepLocal(dateTimeZone56, (long) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter92 = dateTimeFormatter6.withZone(dateTimeZone56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField14 and durationField64", Math.signum(durationField14.compareTo(durationField64)) == -Math.signum(durationField64.compareTo(durationField14)));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        int int8 = timeZone6.getOffset((long) 747);
        calendar1.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder14 = builder0.setDate(2021, 353, 827);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusMonths(0);
        org.joda.time.LocalDateTime.Property property27 = localDateTime24.yearOfCentury();
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.lang.String str29 = locale28.getScript();
        java.util.Locale.setDefault(locale28);
        java.lang.String str31 = property27.getAsText(locale28);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone16, locale28);
        timeZone16.setRawOffset(708);
        int int35 = timeZone16.getRawOffset();
        java.time.ZoneId zoneId36 = timeZone16.toZoneId();
        java.util.Calendar.Builder builder37 = builder14.setTimeZone(timeZone16);
        java.util.Calendar.Builder builder41 = builder14.setDate(310, 53221444, 475);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar32", (calendar1.compareTo(calendar32) == 0) == calendar1.equals(calendar32));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime4 = localDateTime3.toDateTime();
        org.joda.time.Chronology chronology5 = localDateTime3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.property(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears(386);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime11.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str27 = property25.getAsShortText(locale26);
        java.lang.String str28 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDateTime11, locale26);
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str31 = locale26.getDisplayScript(locale29);
        java.lang.String str32 = locale0.getDisplayVariant(locale26);
        boolean boolean33 = locale26.hasExtensions();
        java.lang.String str34 = locale26.getDisplayName();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property39 = dateTime36.dayOfMonth();
        int int40 = dateTime36.getMonthOfYear();
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DurationField durationField42 = chronology41.weekyears();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property47 = dateTime44.dayOfMonth();
        int int48 = dateTime44.getMonthOfYear();
        org.joda.time.Chronology chronology49 = dateTime44.getChronology();
        org.joda.time.DurationField durationField50 = chronology49.weekyears();
        org.joda.time.DateTimeZone dateTimeZone51 = chronology49.getZone();
        org.joda.time.Chronology chronology52 = chronology41.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField53 = chronology52.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField54 = chronology52.centuryOfEra();
        java.util.Locale locale56 = java.util.Locale.TAIWAN;
        org.joda.time.format.DateTimePrinter dateTimePrinter57 = null;
        org.joda.time.format.DateTimeParser dateTimeParser58 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter57, dateTimeParser58);
        boolean boolean60 = dateTimeFormatter59.isParser();
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Locale locale62 = locale61.stripExtensions();
        java.util.Locale locale63 = java.util.Locale.UK;
        java.util.Locale locale64 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet65 = locale64.getExtensionKeys();
        java.lang.String str66 = locale63.getDisplayLanguage(locale64);
        java.lang.String str67 = locale62.getDisplayVariant(locale63);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter59.withLocale(locale63);
        java.lang.String str69 = locale56.getDisplayLanguage(locale63);
        java.lang.String str70 = locale63.toLanguageTag();
        java.lang.String str71 = dateTimeField54.getAsShortText((long) 994, locale63);
        java.util.Set<java.lang.Character> charSet72 = locale63.getExtensionKeys();
        java.util.Set<java.lang.String> strSet73 = locale63.getUnicodeLocaleKeys();
        java.lang.String str74 = locale26.getDisplayCountry(locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField42", Math.signum(durationField6.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField6)));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.property(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = property10.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        int int15 = localDateTime13.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = localDateTime19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime12, chronology20);
        org.joda.time.DateTime dateTime22 = dateTime3.toDateTime(chronology20);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime3.toMutableDateTime();
        int int24 = dateTime3.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and mutableDateTime23", (dateTime22.compareTo(mutableDateTime23) == 0) == dateTime22.equals(mutableDateTime23));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.lang.String str9 = locale6.getDisplayLanguage(locale7);
        java.lang.String str10 = locale5.getDisplayVariant(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter2.withLocale(locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter2.withDefaultYear(501);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter2.withPivotYear(909);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("yearOfCentury");
        org.joda.time.tz.NameProvider nameProvider18 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider18);
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.Chronology chronology22 = localDateTime20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.eras();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.hourOfDay();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        org.joda.time.LocalDateTime.Property property32 = localDateTime28.property(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.plusYears(386);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime28.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfMonth();
        int int39 = localDateTime37.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime37.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfYear();
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str44 = property42.getAsShortText(locale43);
        java.lang.String str45 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDateTime28, locale43);
        java.lang.String str48 = nameProvider18.getName(locale43, "14:47:11.830", "zh");
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(timeZone17, locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter15.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 51038);
        org.joda.time.Instant instant53 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.Instant instant55 = instant53.plus(readableDuration54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Instant instant58 = instant53.withDurationAdded(readableDuration56, 22);
        long long59 = instant58.getMillis();
        org.joda.time.Instant instant60 = instant58.toInstant();
        long long61 = instant60.getMillis();
        org.joda.time.Instant instant62 = instant60.toInstant();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.Instant instant64 = instant62.minus(readableDuration63);
        org.joda.time.Instant instant67 = instant64.withDurationAdded((long) 2000, 874);
        org.joda.time.Chronology chronology68 = instant67.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter15.withChronology(chronology68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant53", (dateTime21.compareTo(instant53) == 0) == dateTime21.equals(instant53));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.Chronology chronology3 = localDateTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.hourOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(945442800000L, chronology3);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.Chronology chronology16 = dateTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.weekyears();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField28 = chronology27.hours();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.centuryOfEra();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) 945442800000L, chronology27);
        org.joda.time.DateTime dateTime32 = dateTime30.minusHours(85706504);
        org.joda.time.DateTime.Property property33 = dateTime30.monthOfYear();
        org.joda.time.DateTime.Property property34 = dateTime30.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime30.toMutableDateTimeISO();
        long long36 = mutableDateTime35.getMillis();
        org.joda.time.Chronology chronology37 = mutableDateTime35.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime30", (dateTime9.compareTo(dateTime30) == 0) == dateTime9.equals(dateTime30));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        java.util.Locale.FilteringMode filteringMode10 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList11 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.lang.String>) strList8, filteringMode10);
        boolean boolean12 = charSet2.containsAll((java.util.Collection<java.lang.String>) strList8);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant13.plus(readableDuration14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant13.withDurationAdded(readableDuration16, 22);
        long long19 = instant18.getMillis();
        org.joda.time.Chronology chronology20 = instant18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.dayOfWeek();
        boolean boolean22 = charSet2.equals((java.lang.Object) chronology20);
        org.joda.time.DurationField durationField23 = chronology20.eras();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType0.getField(chronology20);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(0L, dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate28.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(0L, dateTimeZone32);
        org.joda.time.LocalDate localDate35 = localDate33.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate33.plus(readablePeriod36);
        org.joda.time.LocalDate localDate38 = localDate30.withFields((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate.Property property39 = localDate38.year();
        org.joda.time.LocalDate localDate41 = localDate38.plusWeeks(14);
        org.joda.time.LocalDate localDate43 = localDate41.plusWeeks(32772);
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfEra();
        org.joda.time.LocalDate.Property property45 = localDate43.era();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str48 = dateTimeZone46.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone49 = dateTimeZone46.toTimeZone();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime52 = localDateTime51.toDateTime();
        org.joda.time.Chronology chronology53 = localDateTime51.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.eras();
        org.joda.time.DateTimeField dateTimeField55 = chronology53.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.hourOfDay();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTimeField dateTimeField62 = dateTimeFieldType60.getField(chronology61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime59.property(dateTimeFieldType60);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime59.plusYears(386);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime59.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.dayOfMonth();
        int int70 = localDateTime68.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime72 = localDateTime68.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property73 = localDateTime72.dayOfYear();
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str75 = property73.getAsShortText(locale74);
        java.lang.String str76 = dateTimeField56.getAsShortText((org.joda.time.ReadablePartial) localDateTime59, locale74);
        java.lang.String str77 = dateTimeZone46.getShortName((long) 381, locale74);
        java.lang.String str78 = locale74.getDisplayCountry();
        java.lang.String str79 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) localDate43, locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime52", (instant13.compareTo(dateTime52) == 0) == instant13.equals(dateTime52));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = instant4.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = instant4.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime12", (instant4.compareTo(dateTime12) == 0) == instant4.equals(dateTime12));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("TWN");
        boolean boolean15 = dateTime6.equals((java.lang.Object) builder14);
        org.joda.time.DateTime.Property property16 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime18 = dateTime6.withWeekyear(323);
        org.joda.time.DateTime dateTime19 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime6.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime19", (dateTime1.compareTo(dateTime19) == 0) == dateTime1.equals(dateTime19));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField5", Math.signum(durationField3.compareTo(durationField5)) == -Math.signum(durationField5.compareTo(durationField3)));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        long long7 = instant6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate15.plus(readablePeriod18);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        boolean boolean22 = instant6.equals((java.lang.Object) localDate20);
        org.joda.time.LocalDate.Property property23 = localDate20.dayOfWeek();
        org.joda.time.LocalDate localDate24 = property23.getLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfMonth();
        int int3 = localDateTime1.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        int int7 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withField(dateTimeFieldType8, 11);
        java.util.Date date11 = localDateTime10.toDate();
        java.time.Instant instant12 = date11.toInstant();
        java.util.Calendar.Builder builder13 = builder0.setInstant(date11);
        java.util.Date date15 = new java.util.Date((long) (byte) 1);
        date15.setTime((long) 404);
        long long18 = date15.getTime();
        java.util.Calendar.Builder builder19 = builder0.setInstant(date15);
        java.util.Calendar.Builder builder23 = builder0.setWeekDate(942, 573, 565);
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        boolean boolean27 = dateTimeFormatter26.isParser();
        java.util.Locale locale28 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfMonth();
        int int36 = dateTime32.getMonthOfYear();
        org.joda.time.Chronology chronology37 = dateTime32.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfMonth();
        int int44 = dateTime40.getMonthOfYear();
        org.joda.time.Chronology chronology45 = dateTime40.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology45.getZone();
        org.joda.time.Chronology chronology48 = chronology37.withZone(dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter30.withChronology(chronology48);
        boolean boolean50 = dateTimeFormatter49.isParser();
        java.util.Locale locale51 = dateTimeFormatter49.getLocale();
        java.util.Calendar.Builder builder52 = builder0.setLocale(locale51);
        java.lang.String str53 = locale51.toLanguageTag();
        java.util.Locale locale54 = java.util.Locale.FRENCH;
        java.lang.String str55 = locale54.getScript();
        java.util.Locale.setDefault(locale54);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str59 = dateTimeZone57.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone60 = dateTimeZone57.toTimeZone();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime63 = localDateTime62.toDateTime();
        org.joda.time.Chronology chronology64 = localDateTime62.getChronology();
        org.joda.time.DurationField durationField65 = chronology64.eras();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.hourOfDay();
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property69 = localDateTime68.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime70 = property69.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateTimeField dateTimeField73 = dateTimeFieldType71.getField(chronology72);
        org.joda.time.LocalDateTime.Property property74 = localDateTime70.property(dateTimeFieldType71);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime70.plusYears(386);
        org.joda.time.LocalDateTime localDateTime78 = localDateTime70.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime79 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.dayOfMonth();
        int int81 = localDateTime79.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime79.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property84 = localDateTime83.dayOfYear();
        java.util.Locale locale85 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str86 = property84.getAsShortText(locale85);
        java.lang.String str87 = dateTimeField67.getAsShortText((org.joda.time.ReadablePartial) localDateTime70, locale85);
        java.lang.String str88 = dateTimeZone57.getShortName((long) 381, locale85);
        org.joda.time.LocalDateTime localDateTime89 = new org.joda.time.LocalDateTime(dateTimeZone57);
        java.util.Locale locale91 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet92 = locale91.getExtensionKeys();
        java.lang.String str93 = locale91.getDisplayVariant();
        java.util.Locale locale94 = locale91.stripExtensions();
        java.lang.String str95 = dateTimeZone57.getName((long) 913, locale91);
        java.lang.String str96 = locale54.getDisplayLanguage(locale91);
        java.lang.String str97 = locale51.getDisplayVariant(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField38 and durationField65", Math.signum(durationField38.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField38)));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime3.withMillis(14L);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime3);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant8.plus(readableDuration9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime16 = dateTime14.plusHours(0);
        org.joda.time.DateTime.Property property17 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime18 = property17.getDateTime();
        int int19 = dateTime18.getMonthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight21 = dateTime18.toDateMidnight();
        boolean boolean22 = instant8.isBefore((org.joda.time.ReadableInstant) dateMidnight21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.lang.String str4 = calendar3.getCalendarType();
        java.util.TimeZone timeZone5 = calendar3.getTimeZone();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone5);
        calendar0.setTimeZone(timeZone5);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.withMinimumValue();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        int int16 = localDateTime14.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusMonths(0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfCentury();
        java.util.Locale locale25 = java.util.Locale.FRENCH;
        java.lang.String str26 = locale25.getScript();
        java.util.Locale.setDefault(locale25);
        java.lang.String str28 = property24.getAsText(locale25);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone13, locale25);
        int int30 = property9.getMaximumTextLength(locale25);
        java.lang.String str31 = locale25.getScript();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.Chronology chronology34 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.eras();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType41.getField(chronology42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.property(dateTimeFieldType41);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.plusYears(386);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime40.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfMonth();
        int int51 = localDateTime49.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfYear();
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str56 = property54.getAsShortText(locale55);
        java.lang.String str57 = dateTimeField37.getAsShortText((org.joda.time.ReadablePartial) localDateTime40, locale55);
        java.lang.String str58 = locale55.getISO3Language();
        java.lang.String str59 = locale55.toLanguageTag();
        java.lang.String str60 = locale55.getDisplayVariant();
        java.util.Locale.setDefault(locale55);
        java.lang.String str62 = locale25.getDisplayVariant(locale55);
        java.util.Locale locale63 = locale25.stripExtensions();
        java.lang.String str64 = timeZone5.getDisplayName(locale63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar29", (calendar0.compareTo(calendar29) == 0) == calendar0.equals(calendar29));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeZone dateTimeZone4 = chronology2.getZone();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.minuteOfDay();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology14);
        org.joda.time.DateTime.Property property20 = dateTime11.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.withPeriodAdded(readablePeriod21, 605);
        org.joda.time.Instant instant24 = dateTime11.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime11", (dateTime19.compareTo(dateTime11) == 0) == dateTime19.equals(dateTime11));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        org.joda.time.DateTime dateTime10 = property6.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateTime dateTime11 = property6.getDateTime();
        boolean boolean13 = dateTime11.isBefore((long) 437);
        org.joda.time.Instant instant14 = dateTime11.toInstant();
        org.joda.time.DateTime.Property property15 = dateTime11.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant14", (dateTime11.compareTo(instant14) == 0) == dateTime11.equals(instant14));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime.Property property6 = dateTime3.monthOfYear();
        org.joda.time.DateTime dateTime7 = property6.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTime dateTime10 = dateTime7.withFieldAdded(durationFieldType8, 781);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        long long18 = chronology14.add((long) (short) 1, (long) (byte) 0, 2);
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime10.toMutableDateTime(chronology14);
        org.joda.time.DateTime dateTime21 = dateTime10.minusMinutes(738);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property26 = dateTime23.dayOfMonth();
        int int27 = dateTime23.getMonthOfYear();
        org.joda.time.Chronology chronology28 = dateTime23.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.weekyears();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime33 = dateTime31.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property34 = dateTime31.dayOfMonth();
        int int35 = dateTime31.getMonthOfYear();
        org.joda.time.Chronology chronology36 = dateTime31.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology36.getZone();
        org.joda.time.Chronology chronology39 = chronology28.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField40 = chronology39.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        int int44 = localDateTime42.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minusWeeks(100);
        int[] intArray48 = chronology39.get((org.joda.time.ReadablePartial) localDateTime42, (long) 404);
        org.joda.time.DurationField durationField49 = chronology39.weeks();
        org.joda.time.DateTimeField dateTimeField50 = chronology39.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology39.era();
        org.joda.time.DateTime dateTime52 = dateTime21.withChronology(chronology39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime19", (dateTime10.compareTo(mutableDateTime19) == 0) == dateTime10.equals(mutableDateTime19));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property6.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime10 = property6.setCopy(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.Chronology chronology14 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(chronology14);
        org.joda.time.DateTime.Property property20 = dateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime19", (dateTime11.compareTo(dateTime19) == 0) == dateTime11.equals(dateTime19));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        int int11 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfYear();
        boolean boolean15 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        org.joda.time.DateTime dateTime16 = dateTime3.toDateTime(dateTimeZone8);
        java.lang.String str17 = dateTimeZone8.toString();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.lang.String str22 = locale19.getDisplayLanguage(locale20);
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str24 = locale23.getDisplayCountry();
        java.lang.String str25 = locale20.getDisplayLanguage(locale23);
        java.util.Set<java.lang.String> strSet26 = locale23.getUnicodeLocaleAttributes();
        java.lang.String str27 = dateTimeZone8.getShortName((long) 851, locale23);
        java.util.TimeZone timeZone28 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        int int34 = timeZone32.getOffset(4L);
        java.lang.String str35 = timeZone32.getID();
        java.lang.String str36 = timeZone32.getID();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.Chronology chronology39 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType46.getField(chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.property(dateTimeFieldType46);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plusYears(386);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfMonth();
        int int56 = localDateTime54.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str61 = property59.getAsShortText(locale60);
        java.lang.String str62 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDateTime45, locale60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone32, locale60);
        java.lang.String str64 = calendar63.getCalendarType();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfMonth();
        int int67 = localDateTime65.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime65.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property70 = localDateTime69.dayOfYear();
        java.util.Locale locale71 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str72 = property70.getAsShortText(locale71);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(locale71);
        calendar73.setLenient(false);
        org.joda.time.LocalDateTime localDateTime76 = org.joda.time.LocalDateTime.fromCalendarFields(calendar73);
        java.util.TimeZone timeZone77 = calendar73.getTimeZone();
        calendar63.setTimeZone(timeZone77);
        boolean boolean79 = timeZone28.hasSameRules(timeZone77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar63 and calendar73", (calendar63.compareTo(calendar73) == 0) == calendar63.equals(calendar73));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.withDurationAdded(readableDuration9, 53255809);
        org.joda.time.DateTime dateTime12 = dateTime11.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.dayOfWeek();
        org.joda.time.DateTime dateTime20 = dateTime12.withChronology(chronology15);
        org.joda.time.DateTime.Property property21 = dateTime12.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime20", (dateTime12.compareTo(dateTime20) == 0) == dateTime12.equals(dateTime20));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime1.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DateTime dateTime22 = dateTime1.withChronology(chronology20);
        int int23 = dateTime1.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime22", (dateTime1.compareTo(dateTime22) == 0) == dateTime1.equals(dateTime22));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str5 = dateTimeZone3.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone6 = dateTimeZone3.toTimeZone();
        int int8 = timeZone6.getOffset((long) 747);
        calendar1.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder10 = builder0.setTimeZone(timeZone6);
        java.util.Calendar.Builder builder12 = builder10.setInstant((long) 380);
        java.util.Locale locale16 = new java.util.Locale("2022-03-07T00:00:00.000+345:00", "23:48:01.107", "529");
        java.util.Calendar.Builder builder17 = builder12.setLocale(locale16);
        java.lang.String str18 = locale16.getDisplayScript();
        java.util.Set<java.lang.Character> charSet19 = locale16.getExtensionKeys();
        java.util.Locale locale20 = java.util.Locale.UK;
        java.lang.String str21 = locale20.getDisplayName();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale20);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale locale24 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str26 = locale23.getDisplayLanguage(locale24);
        java.lang.String str27 = locale20.getDisplayName(locale23);
        java.lang.String str28 = locale16.getDisplayCountry(locale20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar22", (calendar1.compareTo(calendar22) == 0) == calendar1.equals(calendar22));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int11 = dateTime8.get(dateTimeFieldType10);
        int int12 = dateTime8.getDayOfWeek();
        org.joda.time.DateTime dateTime14 = dateTime8.plusHours(5);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTime dateTime20 = property19.roundFloorCopy();
        org.joda.time.DateTime dateTime21 = property19.roundFloorCopy();
        boolean boolean22 = dateTime21.isAfterNow();
        boolean boolean24 = dateTime21.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour(10);
        boolean boolean29 = dateTime28.isAfterNow();
        org.joda.time.DateTime.Property property30 = dateTime28.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str32 = dateTimeFieldType31.toString();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime35 = localDateTime34.toDateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfMonth();
        int int39 = dateTime35.getMonthOfYear();
        org.joda.time.Chronology chronology40 = dateTime35.getChronology();
        org.joda.time.DurationField durationField41 = chronology40.weekyears();
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long) 15, chronology40);
        boolean boolean43 = dateTimeFieldType31.isSupported(chronology40);
        int int44 = dateTime28.get(dateTimeFieldType31);
        org.joda.time.LocalDateTime localDateTime45 = dateTime28.toLocalDateTime();
        org.joda.time.DateTime dateTime46 = dateTime21.withFields((org.joda.time.ReadablePartial) localDateTime45);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        org.joda.time.DateTime dateTime49 = dateTime21.toDateTime(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime14.toDateTime(dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime49", (dateTime20.compareTo(dateTime49) == 0) == dateTime20.equals(dateTime49));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(47);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZone(dateTimeZone13);
        int int17 = dateTimeZone13.getOffsetFromLocal((long) 189);
        boolean boolean19 = dateTimeZone13.isStandardOffset(9529886924946L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) (byte) -1);
        org.joda.time.LocalTime.Property property23 = localTime20.millisOfDay();
        org.joda.time.LocalTime localTime25 = property23.addNoWrapToCopy(468);
        org.joda.time.LocalTime localTime27 = property23.addWrapFieldToCopy(22);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.hourOfDay();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(chronology28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(chronology28);
        int int32 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime30", (dateTime10.compareTo(dateTime30) == 0) == dateTime10.equals(dateTime30));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology2.getZone();
        org.joda.time.Chronology chronology7 = chronology2.withUTC();
        org.joda.time.Chronology chronology8 = chronology7.withUTC();
        org.joda.time.DurationField durationField9 = chronology7.centuries();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.year();
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.DateTime dateTime9 = dateTime5.plusSeconds((int) 'u');
        org.joda.time.DateTime.Property property10 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime5.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.Chronology chronology15 = localDateTime13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.days();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime12.toMutableDateTime(chronology15);
        int int19 = dateTime12.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime18", (dateTime12.compareTo(mutableDateTime18) == 0) == dateTime12.equals(mutableDateTime18));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 246);
        int int14 = dateTime9.getCenturyOfEra();
        org.joda.time.DateTime dateTime16 = dateTime9.minusMonths(626);
        int int17 = dateTime9.getWeekyear();
        long long18 = dateTime9.getMillis();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        boolean boolean22 = dateTimeFormatter21.isParser();
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = locale23.stripExtensions();
        java.util.Locale locale25 = java.util.Locale.UK;
        java.util.Locale locale26 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.lang.String str28 = locale25.getDisplayLanguage(locale26);
        java.lang.String str29 = locale24.getDisplayVariant(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter21.withLocale(locale25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter21.withDefaultYear(501);
        java.util.Locale locale34 = new java.util.Locale("23:47:44.118");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter21.withLocale(locale34);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone40 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        long long42 = fixedDateTimeZone40.nextTransition((long) 596);
        int int44 = fixedDateTimeZone40.getOffset((long) 526);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter35.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(85746737);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter35.withZone(dateTimeZone47);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime9.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime.Property property50 = dateTime9.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime49", (dateTime9.compareTo(mutableDateTime49) == 0) == dateTime9.equals(mutableDateTime49));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone16);
        long long27 = dateTimeZone16.convertLocalToUTC((long) 677, true);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        boolean boolean30 = dateTimeZone16.equals((java.lang.Object) 12);
        long long34 = dateTimeZone16.convertLocalToUTC((long) 733, true, 10L);
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime7.toMutableDateTime(dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime38 = dateTime7.withDurationAdded(readableDuration36, 62);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.Instant instant40 = dateTime38.toInstant();
        int int41 = dateTime38.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime38 and instant40", (dateTime38.compareTo(instant40) == 0) == dateTime38.equals(instant40));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfMonth();
        int int22 = localDateTime20.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusWeeks(100);
        int[] intArray26 = chronology17.get((org.joda.time.ReadablePartial) localDateTime20, (long) 404);
        org.joda.time.DurationField durationField27 = chronology17.weeks();
        org.joda.time.DurationField durationField28 = chronology17.years();
        org.joda.time.DateTimeField dateTimeField29 = chronology17.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField28", (durationField7.compareTo(durationField28) == 0) == durationField7.equals(durationField28));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str28 = dateTimeZone26.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone29 = dateTimeZone26.toTimeZone();
        java.lang.String str31 = dateTimeZone26.getName((long) (short) -1);
        java.util.Locale locale33 = java.util.Locale.US;
        java.lang.String str34 = dateTimeZone26.getName((long) 53241875, locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter25.withLocale(locale33);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfMonth();
        int int38 = localDateTime36.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime36.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.era();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.secondOfMinute();
        org.joda.time.Chronology chronology45 = localDateTime43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = chronology45.getZone();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(dateTimeZone46);
        int int49 = dateTimeZone46.getOffsetFromLocal((long) 820);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter25.withZone(dateTimeZone46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime47", (dateTime8.compareTo(dateTime47) == 0) == dateTime8.equals(dateTime47));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        int int7 = dateTime5.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readableDuration8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears(1127);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, 351);
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime15.withPeriodAdded(readablePeriod17, 841);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone24 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        java.lang.String str26 = fixedDateTimeZone24.getNameKey(1645454823644L);
        int int28 = fixedDateTimeZone24.getStandardOffset((long) 196);
        java.lang.String str30 = fixedDateTimeZone24.getNameKey((long) 85743698);
        org.joda.time.DateTime dateTime31 = dateTime19.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone24);
        long long34 = fixedDateTimeZone24.adjustOffset((long) 681, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime31", (dateTime10.compareTo(dateTime31) == 0) == dateTime10.equals(dateTime31));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        boolean boolean7 = dateTime6.isAfterNow();
        boolean boolean9 = dateTime6.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.DateTime.Property property15 = dateTime13.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        int int24 = dateTime20.getMonthOfYear();
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 15, chronology25);
        boolean boolean28 = dateTimeFieldType16.isSupported(chronology25);
        int int29 = dateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime30 = dateTime13.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        org.joda.time.DateTime dateTime34 = dateTime6.toDateTime(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime6.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime34", (dateTime5.compareTo(dateTime34) == 0) == dateTime5.equals(dateTime34));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        int int7 = dateTime5.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readableDuration8);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime9.plus((long) 91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant10", (dateTime9.compareTo(instant10) == 0) == dateTime9.equals(instant10));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        int int7 = fixedDateTimeZone4.getStandardOffset((long) 152);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((long) 53249, true, (long) 27);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears(386);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        int int36 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = property39.getAsShortText(locale40);
        java.lang.String str42 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale40);
        java.lang.String str43 = dateTimeZone12.getShortName((long) 381, locale40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone12);
        long long46 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 468L);
        int int48 = fixedDateTimeZone4.getStandardOffset((long) 115);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime50 = localDateTime49.toDateTime();
        org.joda.time.DateTime dateTime52 = dateTime50.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime54 = dateTime52.plusHours(0);
        org.joda.time.DateTime dateTime56 = dateTime54.minusSeconds(454);
        org.joda.time.Instant instant57 = dateTime56.toInstant();
        int int58 = fixedDateTimeZone4.getOffset((org.joda.time.ReadableInstant) instant57);
        long long62 = fixedDateTimeZone4.convertLocalToUTC(9223372036854775752L, false, (long) 53439199);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime56 and instant57", (dateTime56.compareTo(instant57) == 0) == dateTime56.equals(instant57));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant0.minus(readableDuration5);
        org.joda.time.DateTime dateTime7 = instant6.toDateTimeISO();
        org.joda.time.Instant instant9 = instant6.plus((long) 276);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and dateTime7", (instant6.compareTo(dateTime7) == 0) == instant6.equals(dateTime7));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.seconds();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime8", (dateTime1.compareTo(dateTime8) == 0) == dateTime1.equals(dateTime8));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(20);
        int int9 = localDateTime8.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime();
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfEra();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("2022-03-07T00:00:00.000+345:00", "days", 666, 164);
        java.lang.String str18 = fixedDateTimeZone16.getNameKey((long) 661);
        org.joda.time.DateTime dateTime19 = dateTime10.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        int int21 = fixedDateTimeZone16.getStandardOffset((-54557485941636L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime19", (dateTime10.compareTo(dateTime19) == 0) == dateTime10.equals(dateTime19));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter6.withZoneUTC();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime12 = localDateTime11.toDateTime();
        org.joda.time.Chronology chronology13 = localDateTime11.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.days();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology13.getZone();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.minuteOfDay();
        java.lang.String str17 = chronology13.toString();
        org.joda.time.DurationField durationField18 = chronology13.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withChronology(chronology13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear((java.lang.Integer) 239);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeFormatter21.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser23 = dateTimeFormatter21.getParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter24 = null;
        org.joda.time.format.DateTimeParser dateTimeParser25 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter24, dateTimeParser25);
        boolean boolean27 = dateTimeFormatter26.isParser();
        java.util.Locale locale28 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter29.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property35 = dateTime32.dayOfMonth();
        int int36 = dateTime32.getMonthOfYear();
        org.joda.time.Chronology chronology37 = dateTime32.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.weekyears();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfMonth();
        int int44 = dateTime40.getMonthOfYear();
        org.joda.time.Chronology chronology45 = dateTime40.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.weekyears();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology45.getZone();
        org.joda.time.Chronology chronology48 = chronology37.withZone(dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter30.withChronology(chronology48);
        boolean boolean50 = dateTimeFormatter49.isOffsetParsed();
        org.joda.time.Chronology chronology51 = dateTimeFormatter49.getChronolgy();
        org.joda.time.Chronology chronology52 = dateTimeFormatter49.getChronolgy();
        org.joda.time.DurationField durationField53 = chronology52.seconds();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter54 = dateTimeFormatter21.withChronology(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField18 and durationField53", (durationField18.compareTo(durationField53) == 0) == durationField18.equals(durationField53));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Instant instant9 = instant8.toInstant();
        boolean boolean11 = instant9.isAfter((long) 610);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant9", (dateTime7.compareTo(instant9) == 0) == dateTime7.equals(instant9));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant8 = instant4.toInstant();
        org.joda.time.Instant instant10 = instant8.minus((long) 988);
        org.joda.time.Instant instant12 = instant10.plus((long) 830);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.Instant instant15 = instant12.minus(694041875L);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("26 Mar 1970 06:00:00 GMT", "28 Mar 3032 22:14:17 GMT", 85706890, 51040046);
        java.lang.String str23 = fixedDateTimeZone21.getNameKey((long) 430);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 1129, (org.joda.time.DateTimeZone) fixedDateTimeZone21);
        boolean boolean25 = instant15.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime13", (instant12.compareTo(dateTime13) == 0) == instant12.equals(dateTime13));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        java.lang.String str8 = dateTime6.toString();
        long long9 = dateTime6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime6.getZone();
        boolean boolean12 = dateTimeZone10.isStandardOffset((-1241999526L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant5.plus(readableDuration8);
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.plusMillis(711);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.Instant instant15 = instant10.plus((long) 59);
        org.joda.time.DateTime dateTime16 = instant15.toDateTimeISO();
        org.joda.time.Instant instant19 = instant15.withDurationAdded((long) 640, 45);
        org.joda.time.Instant instant21 = instant15.minus(1645454822500L);
        java.util.Date date22 = instant21.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and dateTime16", (instant15.compareTo(dateTime16) == 0) == instant15.equals(dateTime16));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTime dateTime14 = dateTime9.minusSeconds(53221444);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime20 = dateTime18.plusHours(0);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes(468);
        org.joda.time.LocalDateTime localDateTime23 = dateTime20.toLocalDateTime();
        java.lang.String str24 = localDateTime23.toString();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withMillisOfSecond(0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusHours(2922789);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusMillis(777);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime32 = localDateTime31.toDateTime();
        org.joda.time.DateTime dateTime34 = dateTime32.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime36 = dateTime34.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = dateTime34.withZone(dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMinutes(165);
        org.joda.time.DateTime dateTime42 = dateTime40.withWeekyear((int) 'a');
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfWeek();
        org.joda.time.DateTime dateTime44 = property43.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTimeField dateTimeField50 = dateTimeFieldType48.getField(chronology49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime47.property(dateTimeFieldType48);
        boolean boolean52 = dateTime44.isSupported(dateTimeFieldType48);
        org.joda.time.LocalDateTime.Property property53 = localDateTime30.property(dateTimeFieldType48);
        int int54 = dateTime14.get(dateTimeFieldType48);
        org.joda.time.format.DateTimePrinter dateTimePrinter55 = null;
        org.joda.time.format.DateTimeParser dateTimeParser56 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter55, dateTimeParser56);
        boolean boolean58 = dateTimeFormatter57.isParser();
        java.util.Locale locale59 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter57.withLocale(locale59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter60.withOffsetParsed();
        java.lang.Integer int62 = dateTimeFormatter61.getPivotYear();
        org.joda.time.LocalDateTime localDateTime63 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime64 = localDateTime63.toDateTime();
        org.joda.time.Chronology chronology65 = localDateTime63.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(chronology65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter61.withChronology(chronology65);
        org.joda.time.DurationField durationField69 = chronology65.halfdays();
        org.joda.time.DateTime dateTime70 = dateTime14.withChronology(chronology65);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime70", (dateTime14.compareTo(dateTime70) == 0) == dateTime14.equals(dateTime70));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime14", (instant13.compareTo(dateTime14) == 0) == instant13.equals(dateTime14));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        java.lang.String str1 = instant0.toString();
        org.joda.time.Instant instant2 = instant0.toInstant();
        long long3 = instant0.getMillis();
        org.joda.time.Instant instant5 = instant0.minus(1645454826490L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant5.minus(readableDuration7);
        org.joda.time.Chronology chronology9 = instant5.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and instant5", (mutableDateTime6.compareTo(instant5) == 0) == mutableDateTime6.equals(instant5));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant4.withDurationAdded(readableDuration12, 125);
        org.joda.time.Instant instant16 = instant14.minus((long) 85688180);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 241);
        org.joda.time.DateTime dateTime20 = instant16.toDateTime();
        org.joda.time.DateTime dateTime21 = instant16.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime20", (instant16.compareTo(dateTime20) == 0) == instant16.equals(dateTime20));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = property5.getAsShortText(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.setLenient(false);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) calendar8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(749);
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(0);
        org.joda.time.DateTime.Property property22 = dateTime19.monthOfYear();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        org.joda.time.DateTime dateTime26 = property22.addWrapFieldToCopy((int) 'a');
        int int27 = dateTime26.getYearOfEra();
        org.joda.time.DateTime dateTime29 = dateTime26.withCenturyOfEra(1969);
        int int30 = dateTime29.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = dateTime29.minusWeeks(740);
        boolean boolean34 = dateTime32.isBefore((long) 311);
        org.joda.time.DateTime.Property property35 = dateTime32.year();
        boolean boolean36 = dateTime15.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on localDateTime11 and localDateTime12", (localDateTime11.compareTo(localDateTime12) == 0) == localDateTime11.equals(localDateTime12));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str13 = dateTimeZone11.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone14 = dateTimeZone11.toTimeZone();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.eras();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.hourOfDay();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType25.getField(chronology26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime24.property(dateTimeFieldType25);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.plusYears(386);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime24.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfMonth();
        int int35 = localDateTime33.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        java.util.Locale locale39 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str40 = property38.getAsShortText(locale39);
        java.lang.String str41 = dateTimeField21.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, locale39);
        java.lang.String str42 = dateTimeZone11.getShortName((long) 381, locale39);
        java.lang.String str44 = dateTimeZone11.getShortName(1645454827791L);
        long long46 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, (long) (short) -1);
        org.joda.time.LocalDateTime localDateTime48 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime49 = localDateTime48.toDateTime();
        org.joda.time.DateTime dateTime51 = dateTime49.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime53 = dateTime51.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = dateTime51.withZone(dateTimeZone54);
        org.joda.time.DateTime dateTime56 = dateTime51.toDateTimeISO();
        org.joda.time.DateTime.Property property57 = dateTime56.secondOfDay();
        org.joda.time.DateTime dateTime59 = property57.addToCopy(85679);
        org.joda.time.DateTime dateTime61 = property57.addToCopy(918);
        org.joda.time.DateTime dateTime62 = property57.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType63.getDurationType();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime66 = localDateTime65.toDateTime();
        org.joda.time.DateTime dateTime68 = dateTime66.withMinuteOfHour(10);
        org.joda.time.Chronology chronology69 = dateTime68.getChronology();
        org.joda.time.DurationField durationField70 = chronology69.halfdays();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType63.getField(chronology69);
        org.joda.time.DurationField durationField72 = chronology69.days();
        org.joda.time.DateTime dateTime73 = dateTime62.toDateTime(chronology69);
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(0L, chronology69);
        boolean boolean75 = dateTimeZone11.isLocalDateTimeGap(localDateTime74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField70", Math.signum(durationField19.compareTo(durationField70)) == -Math.signum(durationField70.compareTo(durationField19)));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        int int15 = dateTime14.getYearOfEra();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime14.withDurationAdded(readableDuration16, 83534);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime18", (instant13.compareTo(dateTime18) == 0) == instant13.equals(dateTime18));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        int int8 = dateTime7.getYearOfEra();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime7.toGregorianCalendar();
        org.joda.time.Instant instant10 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime11 = instant10.toDateTimeISO();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra(42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant10", (dateTime3.compareTo(instant10) == 0) == dateTime3.equals(instant10));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        org.joda.time.DateTime dateTime9 = dateTime1.withCenturyOfEra(895);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology12.getZone();
        org.joda.time.DateTime dateTime17 = dateTime1.withZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(0);
        org.joda.time.DateTime.Property property24 = dateTime21.monthOfYear();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DateTimeField dateTimeField26 = property24.getField();
        org.joda.time.DateTime dateTime28 = property24.addWrapFieldToCopy((int) 'a');
        int int29 = dateTime28.getYearOfEra();
        org.joda.time.DateTime dateTime31 = dateTime28.minusMonths(967);
        int int32 = dateTime31.getSecondOfMinute();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone37 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean38 = fixedDateTimeZone37.isFixed();
        int int40 = fixedDateTimeZone37.getStandardOffset((long) 152);
        java.lang.String str42 = fixedDateTimeZone37.getNameKey((long) 53272402);
        org.joda.time.DateTime dateTime43 = dateTime31.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone37);
        org.joda.time.DateTime dateTime44 = dateTime17.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime43", (dateTime31.compareTo(dateTime43) == 0) == dateTime31.equals(dateTime43));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.toString();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 15, chronology15);
        boolean boolean18 = dateTimeFieldType6.isSupported(chronology15);
        int int19 = dateTime3.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime20 = dateTime3.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime23 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime27 = dateTime25.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.plusMinutes(165);
        int int32 = dateTime31.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime35 = dateTime31.withDurationAdded(readableDuration33, 246);
        org.joda.time.DateTime dateTime37 = dateTime31.plusDays(32772);
        org.joda.time.DateTime dateTime38 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime44 = dateTime42.plusHours(0);
        org.joda.time.DateTime dateTime46 = dateTime44.minusSeconds(454);
        org.joda.time.DateTime dateTime48 = dateTime44.plusSeconds((int) 'u');
        org.joda.time.DateTime.Property property49 = dateTime44.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType53.getField(chronology54);
        org.joda.time.LocalDateTime.Property property56 = localDateTime52.property(dateTimeFieldType53);
        org.joda.time.DateTime.Property property57 = dateTime44.property(dateTimeFieldType53);
        boolean boolean58 = dateTime38.isSupported(dateTimeFieldType53);
        org.joda.time.DateTime dateTime60 = dateTime38.minusMillis(2042);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone65 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        org.joda.time.DateTime dateTime66 = dateTime38.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone65);
        long long69 = fixedDateTimeZone65.convertLocalToUTC((long) 6913, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime66", (dateTime3.compareTo(dateTime66) == 0) == dateTime3.equals(dateTime66));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTime.Property property7 = dateTime4.monthOfYear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.DateTime dateTime11 = property7.addWrapFieldToCopy((int) 'a');
        int int12 = dateTime11.getYearOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.withCenturyOfEra(1969);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minusWeeks(740);
        org.joda.time.DateTime dateTime18 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.Chronology chronology26 = localDateTime24.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.eras();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.hourOfDay();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType33.getField(chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime32.property(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime32.plusYears(386);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime32.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.dayOfMonth();
        int int43 = localDateTime41.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = localDateTime41.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfYear();
        java.util.Locale locale47 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str48 = property46.getAsShortText(locale47);
        java.lang.String str49 = dateTimeField29.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, locale47);
        java.lang.String str50 = dateTimeZone19.getShortName((long) 381, locale47);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone19);
        long long53 = dateTimeZone19.convertUTCToLocal((long) 304);
        org.joda.time.DateTime dateTime54 = dateTime14.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime.Property property55 = dateTime54.dayOfWeek();
        org.joda.time.Instant instant56 = dateTime54.toInstant();
        long long57 = dateTime54.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and instant56", (dateTime54.compareTo(instant56) == 0) == dateTime54.equals(instant56));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime11 = dateTime9.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes(165);
        int int16 = dateTime15.getDayOfMonth();
        boolean boolean17 = dateTime15.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTime dateTime20 = dateTime15.minusSeconds(53221444);
        int int21 = instant5.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = instant5.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime24 = localDateTime23.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property27 = dateTime24.dayOfMonth();
        int int28 = dateTime24.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int30 = dateTime24.get(dateTimeFieldType29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.DateTime dateTime32 = dateTime24.minus(readablePeriod31);
        org.joda.time.DateTime.Property property33 = dateTime24.dayOfYear();
        java.util.Locale locale35 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet36 = locale35.getExtensionKeys();
        java.lang.String str37 = locale35.getDisplayVariant();
        java.util.Locale locale38 = locale35.stripExtensions();
        org.joda.time.DateTime dateTime39 = property33.setCopy("20", locale35);
        org.joda.time.DateTime dateTime41 = dateTime39.withMillis((long) 404);
        org.joda.time.DateTime dateTime43 = dateTime41.plusMinutes(597);
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfMonth();
        int int46 = localDateTime44.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime44.minusWeeks(100);
        boolean boolean50 = localDateTime48.equals((java.lang.Object) "0");
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withField(dateTimeFieldType51, 12);
        int int54 = localDateTime48.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str56 = dateTimeFieldType55.toString();
        java.lang.String str57 = dateTimeFieldType55.toString();
        org.joda.time.LocalDateTime.Property property58 = localDateTime48.property(dateTimeFieldType55);
        boolean boolean59 = dateTime43.isSupported(dateTimeFieldType55);
        int int60 = dateTime22.get(dateTimeFieldType55);
        boolean boolean61 = dateTime22.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime9.withDurationAdded(readableDuration11, 246);
        org.joda.time.DateTime dateTime15 = dateTime9.plusDays(32772);
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        int int17 = dateTime15.getMillisOfSecond();
        org.joda.time.DateTime dateTime19 = dateTime15.minusYears(404);
        org.joda.time.Instant instant20 = dateTime15.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime15.toMutableDateTimeISO();
        boolean boolean22 = dateTime15.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and mutableDateTime21", (instant20.compareTo(mutableDateTime21) == 0) == instant20.equals(mutableDateTime21));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        boolean boolean8 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronology();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant10.withDurationAdded(readableDuration13, 22);
        long long16 = instant15.getMillis();
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology23 = chronology17.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withChronology(chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology23);
        int int26 = dateTime25.getDayOfMonth();
        org.joda.time.DateTime dateTime28 = dateTime25.minusMillis((int) (byte) -1);
        int int29 = dateTime28.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime25", (instant10.compareTo(dateTime25) == 0) == instant10.equals(dateTime25));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.DateTime dateTime4 = instant1.toDateTime();
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 7900384, chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime4", (instant1.compareTo(dateTime4) == 0) == instant1.equals(dateTime4));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        boolean boolean7 = dateTime6.isAfterNow();
        boolean boolean9 = dateTime6.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.DateTime.Property property15 = dateTime13.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        int int24 = dateTime20.getMonthOfYear();
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 15, chronology25);
        boolean boolean28 = dateTimeFieldType16.isSupported(chronology25);
        int int29 = dateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime30 = dateTime13.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.Chronology chronology34 = localDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        long long41 = chronology37.add(1645454827122L, (-1862278315000L), 386);
        org.joda.time.DateTime dateTime42 = dateTime6.toDateTime(chronology37);
        org.joda.time.DateTime.Property property43 = dateTime6.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime42", (dateTime5.compareTo(dateTime42) == 0) == dateTime5.equals(dateTime42));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        long long5 = instant0.getMillis();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant7.plus(readableDuration8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant7.withDurationAdded(readableDuration10, 22);
        long long13 = instant12.getMillis();
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str18 = dateTimeZone16.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone19 = dateTimeZone16.toTimeZone();
        org.joda.time.Chronology chronology20 = chronology14.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField21 = durationFieldType6.getField(chronology14);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(629);
        org.joda.time.Chronology chronology24 = chronology14.withZone(dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = instant0.toMutableDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime25", (instant0.compareTo(mutableDateTime25) == 0) == instant0.equals(mutableDateTime25));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime7.withMillis((long) 122);
        org.joda.time.DateTime dateTime12 = dateTime7.toDateTime();
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTime12);
        long long15 = dateTime14.getMillis();
        org.joda.time.Instant instant16 = dateTime14.toInstant();
        org.joda.time.DateTime dateTime18 = dateTime14.withWeekyear(56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant16", (dateTime3.compareTo(instant16) == 0) == dateTime3.equals(instant16));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.getDateTime();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        boolean boolean10 = dateTimeFormatter9.isParser();
        java.util.Locale locale11 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale15 = java.util.Locale.UK;
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet17 = locale16.getExtensionKeys();
        java.lang.String str18 = locale15.getDisplayLanguage(locale16);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str20 = locale19.getDisplayCountry();
        java.lang.String str21 = locale16.getDisplayLanguage(locale19);
        java.lang.String str22 = locale14.getDisplayName(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter12.withLocale(locale14);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours(46);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withZone(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = dateTime6.toDateTime(dateTimeZone25);
        org.joda.time.DateTime.Property property28 = dateTime27.weekOfWeekyear();
        org.joda.time.DateTime dateTime30 = property28.addWrapFieldToCopy(85664184);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime27", (dateTime1.compareTo(dateTime27) == 0) == dateTime1.equals(dateTime27));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        org.joda.time.Instant instant7 = instant0.withDurationAdded((long) (-1), 620);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.Chronology chronology23 = dateTime18.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology23.getZone();
        org.joda.time.Chronology chronology26 = chronology15.withZone(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = chronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology15.secondOfDay();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now(chronology15);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) instant7, chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        int int9 = dateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone15 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean16 = fixedDateTimeZone15.isFixed();
        int int18 = fixedDateTimeZone15.getStandardOffset((long) 152);
        long long22 = fixedDateTimeZone15.convertLocalToUTC((long) 53249, true, (long) 27);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str25 = dateTimeZone23.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone26 = dateTimeZone23.toTimeZone();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.Chronology chronology30 = localDateTime28.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.eras();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.hourOfDay();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime36.property(dateTimeFieldType37);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime36.plusYears(386);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime36.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.dayOfMonth();
        int int47 = localDateTime45.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfYear();
        java.util.Locale locale51 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str52 = property50.getAsShortText(locale51);
        java.lang.String str53 = dateTimeField33.getAsShortText((org.joda.time.ReadablePartial) localDateTime36, locale51);
        java.lang.String str54 = dateTimeZone23.getShortName((long) 381, locale51);
        org.joda.time.LocalDateTime localDateTime55 = new org.joda.time.LocalDateTime(dateTimeZone23);
        long long57 = fixedDateTimeZone15.getMillisKeepLocal(dateTimeZone23, 468L);
        int int59 = fixedDateTimeZone15.getStandardOffset((long) 115);
        org.joda.time.LocalDateTime localDateTime60 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.dayOfMonth();
        int int62 = localDateTime60.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime60.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property65 = localDateTime64.dayOfYear();
        int int66 = localDateTime64.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime69 = localDateTime64.withField(dateTimeFieldType67, 11);
        java.util.Date date70 = localDateTime69.toDate();
        int[] intArray71 = localDateTime69.getValues();
        boolean boolean72 = fixedDateTimeZone15.equals((java.lang.Object) localDateTime69);
        int int74 = fixedDateTimeZone15.getOffset(626L);
        long long77 = fixedDateTimeZone15.adjustOffset((long) 316, true);
        java.util.TimeZone timeZone78 = fixedDateTimeZone15.toTimeZone();
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        org.joda.time.DateTime dateTime80 = dateTime7.withZoneRetainFields((org.joda.time.DateTimeZone) fixedDateTimeZone15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime79", (dateTime1.compareTo(dateTime79) == 0) == dateTime1.equals(dateTime79));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.Chronology chronology6 = chronology2.withUTC();
        org.joda.time.DurationField durationField7 = chronology2.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField7, and durationField3", !(durationField3.compareTo(durationField7) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField7.compareTo(durationField3))));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int8 = dateTime2.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.Chronology chronology11 = localDateTime9.getChronology();
        boolean boolean12 = dateTimeFieldType7.isSupported(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.Chronology chronology14 = chronology11.withUTC();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj0, chronology11);
        org.joda.time.DurationField durationField16 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology11.yearOfEra();
        long long20 = dateTimeField17.addWrapField((long) 302, 910);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfWeek();
        org.joda.time.DateTime dateTime9 = property8.roundCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime7", (dateTime1.compareTo(dateTime7) == 0) == dateTime1.equals(dateTime7));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant8 = instant4.toInstant();
        org.joda.time.Instant instant10 = instant8.minus((long) 988);
        org.joda.time.Instant instant12 = instant10.plus((long) 830);
        org.joda.time.DateTime dateTime13 = instant12.toDateTime();
        org.joda.time.Chronology chronology14 = instant12.getChronology();
        org.joda.time.Instant instant15 = instant12.toInstant();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = dateTime19.withZone(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.plusMinutes(165);
        int int26 = dateTime25.getMinuteOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(708);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime31 = dateTime28.toDateTimeISO();
        int int32 = instant15.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime17", (instant0.compareTo(dateTime17) == 0) == instant0.equals(dateTime17));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        int int6 = dateTime5.getMonthOfYear();
        int int7 = dateTime5.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime13 = dateTime11.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.withZone(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfMonth();
        int int19 = localDateTime17.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
        boolean boolean23 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.DateTime dateTime24 = dateTime11.toDateTime(dateTimeZone16);
        java.lang.String str25 = dateTimeZone16.toString();
        org.joda.time.DateTime dateTime26 = dateTime5.withZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.centuryOfEra();
        boolean boolean32 = dateTime5.equals((java.lang.Object) property31);
        org.joda.time.DateTime.Property property33 = dateTime5.minuteOfHour();
        int int34 = dateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime36 = localDateTime35.toDateTime();
        org.joda.time.Chronology chronology37 = localDateTime35.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.hourOfDay();
        org.joda.time.DateTime dateTime41 = dateTime5.toDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime43 = localDateTime42.toDateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property46 = dateTime43.dayOfMonth();
        int int47 = dateTime43.getMonthOfYear();
        org.joda.time.Chronology chronology48 = dateTime43.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.weekyears();
        org.joda.time.LocalDateTime localDateTime50 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime51 = localDateTime50.toDateTime();
        org.joda.time.DateTime dateTime53 = dateTime51.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property54 = dateTime51.dayOfMonth();
        int int55 = dateTime51.getMonthOfYear();
        org.joda.time.Chronology chronology56 = dateTime51.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.weekyears();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology56.getZone();
        org.joda.time.Chronology chronology59 = chronology48.withZone(dateTimeZone58);
        org.joda.time.DateTimeField dateTimeField60 = chronology59.yearOfCentury();
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime(chronology59);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone66 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        java.util.TimeZone timeZone67 = fixedDateTimeZone66.toTimeZone();
        org.joda.time.Chronology chronology68 = chronology59.withZone((org.joda.time.DateTimeZone) fixedDateTimeZone66);
        long long70 = fixedDateTimeZone66.nextTransition(1645454887620L);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime5.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime41", (dateTime5.compareTo(dateTime41) == 0) == dateTime5.equals(dateTime41));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType11, 128);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, 897);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant19.withDurationAdded(readableDuration22, 22);
        long long25 = instant24.getMillis();
        org.joda.time.Instant instant26 = instant24.toInstant();
        int int27 = dateTime15.compareTo((org.joda.time.ReadableInstant) instant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant24", (dateTime1.compareTo(instant24) == 0) == dateTime1.equals(instant24));
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        org.joda.time.DateTime dateTime9 = dateTime1.withCenturyOfEra(895);
        int int10 = dateTime1.getSecondOfDay();
        org.joda.time.Instant instant11 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTime.Property property18 = dateTime15.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        boolean boolean22 = dateTimeFormatter21.isParser();
        java.util.Locale locale23 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withLocale(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.lang.String str30 = locale27.getDisplayLanguage(locale28);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayLanguage(locale31);
        java.lang.String str34 = locale26.getDisplayName(locale31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter24.withLocale(locale26);
        java.lang.String str36 = property18.getAsText(locale26);
        org.joda.time.DateTime dateTime38 = property18.setCopy("2022");
        boolean boolean39 = instant11.isAfter((org.joda.time.ReadableInstant) dateTime38);
        int int40 = dateTime38.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant11", (dateTime1.compareTo(instant11) == 0) == dateTime1.equals(instant11));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray13 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        java.util.Locale.FilteringMode filteringMode16 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList17 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList14, filteringMode16);
        boolean boolean18 = charSet8.containsAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean19 = charSet4.containsAll((java.util.Collection<java.lang.String>) strList14);
        boolean boolean21 = charSet4.add((java.lang.Character) 'a');
        boolean boolean23 = charSet4.add((java.lang.Character) '4');
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime29 = dateTime27.plusHours(0);
        org.joda.time.DateTime.Property property30 = dateTime27.monthOfYear();
        org.joda.time.DateTimeField dateTimeField31 = property30.getField();
        org.joda.time.DateTimeField dateTimeField32 = property30.getField();
        org.joda.time.DateTime dateTime34 = property30.addWrapFieldToCopy((int) 'a');
        int int35 = dateTime34.getYearOfEra();
        int int36 = dateTime34.getYearOfCentury();
        int int37 = dateTime34.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime39 = localDateTime38.toDateTime();
        org.joda.time.DateTime dateTime41 = dateTime39.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property42 = dateTime39.dayOfMonth();
        org.joda.time.DateTime dateTime43 = property42.getDateTime();
        org.joda.time.DurationField durationField44 = property42.getLeapDurationField();
        org.joda.time.DateTime dateTime45 = property42.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property50 = dateTime47.dayOfMonth();
        int int51 = dateTime47.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int53 = dateTime47.get(dateTimeFieldType52);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime55 = localDateTime54.toDateTime();
        org.joda.time.Chronology chronology56 = localDateTime54.getChronology();
        boolean boolean57 = dateTimeFieldType52.isSupported(chronology56);
        java.lang.String str58 = dateTimeFieldType52.toString();
        boolean boolean59 = dateTime45.isSupported(dateTimeFieldType52);
        org.joda.time.DateTime.Property property60 = dateTime34.property(dateTimeFieldType52);
        org.joda.time.Instant instant61 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration62 = null;
        org.joda.time.Instant instant63 = instant61.plus(readableDuration62);
        org.joda.time.Chronology chronology64 = instant61.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.era();
        java.util.Locale locale67 = java.util.Locale.ROOT;
        java.lang.String str68 = dateTimeField65.getAsText((long) 1015, locale67);
        java.lang.String str69 = locale67.toLanguageTag();
        java.util.Calendar calendar70 = dateTime34.toCalendar(locale67);
        boolean boolean71 = charSet4.equals((java.lang.Object) dateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant61", (dateTime39.compareTo(instant61) == 0) == dateTime39.equals(instant61));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.weekyears();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.weekyears();
        org.joda.time.DateTimeZone dateTimeZone16 = chronology14.getZone();
        org.joda.time.Chronology chronology17 = chronology6.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology17.eras();
        long long23 = chronology17.add((long) 910, (long) 2021, 797);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField19", Math.signum(durationField7.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField7)));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.Chronology chronology7 = dateTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.weekyears();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property13 = dateTime10.dayOfMonth();
        int int14 = dateTime10.getMonthOfYear();
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.weekyears();
        org.joda.time.DateTimeZone dateTimeZone17 = chronology15.getZone();
        org.joda.time.Chronology chronology18 = chronology7.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.centuryOfEra();
        java.lang.String str22 = dateTimeField20.getAsText((-1862278315000L));
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        int int25 = localDateTime23.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.minusMinutes(53221444);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.minusMillis(202);
        int int30 = dateTimeField20.getMaximumValue((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime34 = property32.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusYears(744);
        java.util.Locale locale39 = new java.util.Locale("zh_TW");
        java.lang.String str40 = dateTimeField20.getAsText((org.joda.time.ReadablePartial) localDateTime36, 711, locale39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = dateTimeField20.getType();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime44 = localDateTime43.toDateTime();
        org.joda.time.Chronology chronology45 = localDateTime43.getChronology();
        org.joda.time.DurationField durationField46 = chronology45.days();
        org.joda.time.DateTimeField dateTimeField47 = chronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology45.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField49 = chronology45.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField50 = chronology45.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField51 = chronology45.era();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType41.getField(chronology45);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology45);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime((long) 53361773, chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime53", (dateTime10.compareTo(dateTime53) == 0) == dateTime10.equals(dateTime53));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("00:00:00.000");
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withMillisOfDay((int) '4');
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusMonths(0);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfCentury();
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        java.lang.String str14 = locale13.getScript();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = property12.getAsText(locale13);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone1, locale13);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.dayOfMonth();
        int int23 = dateTime19.getMonthOfYear();
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.weekyears();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime27 = localDateTime26.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime27.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property30 = dateTime27.dayOfMonth();
        int int31 = dateTime27.getMonthOfYear();
        org.joda.time.Chronology chronology32 = dateTime27.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.weekyears();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        org.joda.time.Chronology chronology35 = chronology24.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField36 = chronology35.hourOfDay();
        int int38 = dateTimeField36.getMaximumValue((long) 624);
        java.util.Locale locale41 = new java.util.Locale("minuteOfDay");
        java.lang.String str42 = dateTimeField36.getAsShortText((long) 544, locale41);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone1, locale41);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType44.getDurationType();
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime47 = localDateTime46.toDateTime();
        org.joda.time.DateTime dateTime49 = dateTime47.withMinuteOfHour(10);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField52 = dateTimeFieldType44.getField(chronology50);
        int int54 = dateTimeField52.getLeapAmount(612L);
        int int55 = dateTimeField52.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime56 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.dayOfMonth();
        int int58 = localDateTime56.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime60 = localDateTime56.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.dayOfYear();
        org.joda.time.LocalDateTime localDateTime62 = property61.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime64 = localDateTime62.withMillisOfDay(20);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.LocalDateTime localDateTime66 = localDateTime62.plus(readableDuration65);
        org.joda.time.LocalDateTime.Property property67 = localDateTime62.hourOfDay();
        java.util.Locale locale68 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet69 = locale68.getUnicodeLocaleAttributes();
        java.lang.String str70 = locale68.getDisplayScript();
        int int71 = property67.getMaximumTextLength(locale68);
        int int72 = dateTimeField52.getMaximumShortTextLength(locale68);
        java.util.Calendar calendar73 = java.util.Calendar.getInstance(timeZone1, locale68);
        java.lang.String str74 = calendar73.getCalendarType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar43", (calendar17.compareTo(calendar43) == 0) == calendar17.equals(calendar43));
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        int int12 = dateTime8.getMonthOfYear();
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.weekyears();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        int int20 = dateTime16.getMonthOfYear();
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.weekyears();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology21.getZone();
        org.joda.time.Chronology chronology24 = chronology13.withZone(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter6.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter6.withPivotYear(1969);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter6.getParser();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant31.plus(readableDuration32);
        boolean boolean34 = dateTimeZone29.equals((java.lang.Object) readableDuration32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter6.withZone(dateTimeZone29);
        java.lang.Integer int37 = dateTimeFormatter36.getPivotYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant31", (dateTime8.compareTo(instant31) == 0) == dateTime8.equals(instant31));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.Chronology chronology23 = chronology20.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTime dateTime27 = instant0.toDateTime(chronology23);
        org.joda.time.DurationField durationField28 = chronology23.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        org.joda.time.Instant instant8 = instant6.plus((long) 267);
        org.joda.time.DateTime dateTime9 = instant6.toDateTime();
        boolean boolean11 = dateTime9.isBefore((long) 60946705);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = chronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField5, and durationField3", !(durationField3.compareTo(durationField5) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField5.compareTo(durationField3))));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant9 = instant7.toInstant();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime15 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime16 = property14.roundFloorCopy();
        boolean boolean17 = dateTime16.isAfterNow();
        boolean boolean19 = dateTime16.isEqual((long) 258);
        org.joda.time.DateTime.Property property20 = dateTime16.centuryOfEra();
        boolean boolean21 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateMidnight dateMidnight22 = dateTime16.toDateMidnight();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.util.Date date5 = dateMidnight4.toDate();
        org.joda.time.Instant instant6 = dateMidnight4.toInstant();
        long long7 = instant6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(0L, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(0L, dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate15.plus(readablePeriod18);
        org.joda.time.LocalDate localDate20 = localDate12.withFields((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.Interval interval21 = localDate20.toInterval();
        boolean boolean22 = instant6.equals((java.lang.Object) localDate20);
        org.joda.time.LocalDate.Property property23 = localDate20.dayOfWeek();
        org.joda.time.LocalDate.Property property24 = localDate20.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight4 and instant6", (dateMidnight4.compareTo(instant6) == 0) == dateMidnight4.equals(instant6));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Chronology chronology1 = instant0.getChronology();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant0.plus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("GMT");
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 366, dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime9 = instant4.toMutableDateTime(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime2", (instant4.compareTo(mutableDateTime2) == 0) == instant4.equals(mutableDateTime2));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.Instant instant5 = dateTime1.toInstant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) 615);
        org.joda.time.Instant instant9 = instant5.minus((long) 62);
        org.joda.time.Instant instant11 = instant5.minus((long) 53555888);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant11.withDurationAdded(readableDuration12, 35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant5", (dateTime1.compareTo(instant5) == 0) == dateTime1.equals(instant5));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 386);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusSeconds(13);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime18.getZone();
        boolean boolean21 = dateTime18.isAfterNow();
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone26 = new org.joda.time.tz.FixedDateTimeZone("529", "ISOChronology[Etc/UTC]", 0, 64);
        java.lang.String str28 = fixedDateTimeZone26.getNameKey((long) 208);
        java.util.TimeZone timeZone29 = fixedDateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime30 = dateTime18.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone26);
        long long32 = fixedDateTimeZone26.nextTransition((long) 2431);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime30", (dateTime18.compareTo(dateTime30) == 0) == dateTime18.equals(dateTime30));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime5 = instant0.toMutableDateTimeISO();
        long long6 = instant0.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime5", (instant0.compareTo(mutableDateTime5) == 0) == instant0.equals(mutableDateTime5));
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.LocalDateTime localDateTime7 = dateTime6.toLocalDateTime();
        java.util.Locale.Builder builder8 = new java.util.Locale.Builder();
        java.util.Locale locale9 = builder8.build();
        java.util.Locale locale10 = builder8.build();
        java.util.Locale.Builder builder12 = builder8.setRegion("");
        java.util.Locale.Builder builder14 = builder12.addUnicodeLocaleAttribute("TWN");
        boolean boolean15 = dateTime6.equals((java.lang.Object) builder14);
        org.joda.time.DateTime.Property property16 = dateTime6.centuryOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds(454);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime11 = dateTime7.withDurationAdded(1645454837983L, (int) ' ');
        org.joda.time.DateTime.Property property12 = dateTime11.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfHour();
        long long8 = dateTimeField6.roundFloor(66009600009L);
        java.util.Locale locale11 = new java.util.Locale("23:47:56.996");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = dateTimeField6.getAsShortText(12, locale11);
        org.joda.time.DurationField durationField14 = dateTimeField6.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField14, and durationField3", !(durationField3.compareTo(durationField14) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField14.compareTo(durationField3))));
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = localDate2.toDateMidnight(dateTimeZone3);
        java.lang.String str5 = dateMidnight4.toString();
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.plus(readableDuration7);
        org.joda.time.Instant instant10 = instant6.minus((long) (byte) 0);
        boolean boolean11 = dateMidnight4.isEqual((org.joda.time.ReadableInstant) instant10);
        org.joda.time.Instant instant13 = instant10.plus((long) 939);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime15 = instant13.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant13.withDurationAdded(readableDuration16, 1129);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime14", (instant18.compareTo(dateTime14) == 0) == instant18.equals(dateTime14));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.plus((long) 420);
        org.joda.time.Instant instant6 = instant0.withMillis((long) 1972);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime10.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.plusMinutes(165);
        int int17 = dateTime16.getMinuteOfDay();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.withDurationAdded(readableDuration18, 246);
        org.joda.time.DateTime dateTime22 = dateTime16.plusDays(32772);
        org.joda.time.DateTime.Property property23 = dateTime22.secondOfMinute();
        int int24 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime26 = dateTime22.minusYears(404);
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        org.joda.time.DateTime dateTime30 = dateTime28.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property31 = dateTime28.dayOfMonth();
        int int32 = dateTime28.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int34 = dateTime28.get(dateTimeFieldType33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime28.minus(readablePeriod35);
        org.joda.time.DateTime dateTime38 = dateTime28.minusMillis(55);
        org.joda.time.DateTime dateTime40 = dateTime28.minusMinutes(764);
        boolean boolean41 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime44 = property43.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType45.getField(chronology46);
        org.joda.time.LocalDateTime.Property property48 = localDateTime44.property(dateTimeFieldType45);
        org.joda.time.LocalDateTime localDateTime49 = property48.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime50 = property48.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime52 = property48.setCopy(1);
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.era();
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.millisOfDay();
        org.joda.time.LocalDateTime localDateTime56 = property55.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime57 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime58 = localDateTime57.toDateTime();
        org.joda.time.DateTime dateTime60 = dateTime58.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime62 = dateTime60.plusHours(0);
        org.joda.time.DateTime dateTime64 = dateTime62.minusSeconds(454);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime67 = dateTime64.withDurationAdded(readableDuration65, 858);
        org.joda.time.DateMidnight dateMidnight68 = dateTime64.toDateMidnight();
        int int69 = dateMidnight68.getMinuteOfHour();
        org.joda.time.DateTime dateTime70 = localDateTime56.toDateTime((org.joda.time.ReadableInstant) dateMidnight68);
        org.joda.time.DateTime.Property property71 = dateTime70.era();
        org.joda.time.DurationField durationField72 = property71.getLeapDurationField();
        org.joda.time.DateTime dateTime73 = property71.roundFloorCopy();
        boolean boolean74 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime73);
        boolean boolean75 = instant6.isEqual((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.ReadableDuration readableDuration76 = null;
        org.joda.time.Instant instant77 = instant6.plus(readableDuration76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Instant instant4 = instant0.minus((long) (byte) 0);
        org.joda.time.Instant instant7 = instant4.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant9 = instant4.plus((long) 858);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = instant4.isSupported(dateTimeFieldType10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant14 = instant4.withDurationAdded(readableDuration12, 125);
        org.joda.time.Instant instant17 = instant4.withDurationAdded(1645454831410L, 387);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.DateTime dateTime20 = instant17.toDateTime();
        org.joda.time.Instant instant22 = instant17.plus(1299650185738L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and dateTime20", (instant17.compareTo(dateTime20) == 0) == instant17.equals(dateTime20));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime.Property property7 = dateTime1.era();
        org.joda.time.DateTime dateTime9 = dateTime1.withCenturyOfEra(895);
        int int10 = dateTime1.getSecondOfDay();
        org.joda.time.Instant instant11 = dateTime1.toInstant();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTime.Property property18 = dateTime15.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        boolean boolean22 = dateTimeFormatter21.isParser();
        java.util.Locale locale23 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter21.withLocale(locale23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter24.withOffsetParsed();
        java.util.Locale locale26 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Locale locale28 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet29 = locale28.getExtensionKeys();
        java.lang.String str30 = locale27.getDisplayLanguage(locale28);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = locale31.getDisplayCountry();
        java.lang.String str33 = locale28.getDisplayLanguage(locale31);
        java.lang.String str34 = locale26.getDisplayName(locale31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter24.withLocale(locale26);
        java.lang.String str36 = property18.getAsText(locale26);
        org.joda.time.DateTime dateTime38 = property18.setCopy("2022");
        boolean boolean39 = instant11.isAfter((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.Instant instant40 = instant11.toInstant();
        org.joda.time.Instant instant41 = instant11.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant41", (dateTime1.compareTo(instant41) == 0) == dateTime1.equals(instant41));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        charSet4.clear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.dayOfWeek();
        boolean boolean13 = charSet4.contains((java.lang.Object) chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology10.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField11, durationField15, and durationField11", !(durationField11.compareTo(durationField15) == 0) || (Math.signum(durationField11.compareTo(durationField11)) == Math.signum(durationField15.compareTo(durationField11))));
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.weekyearOfCentury();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(331);
        org.joda.time.Chronology chronology7 = dateTime6.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime4", (dateTime1.compareTo(dateTime4) == 0) == dateTime1.equals(dateTime4));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        java.lang.Character[] charArray3 = new java.lang.Character[] { 'a', '#', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet4 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet4, charArray3);
        java.util.Iterator<java.lang.Character> charItor6 = charSet4.iterator();
        charSet4.clear();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.dayOfWeek();
        boolean boolean13 = charSet4.contains((java.lang.Object) chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField16 = chronology10.halfdayOfDay();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone18 = calendar17.getTimeZone();
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getDisplayVariant();
        java.util.Locale locale22 = locale19.stripExtensions();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str25 = locale22.getDisplayName();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance(timeZone18, locale22);
        int int27 = dateTimeField16.getMaximumTextLength(locale22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar17 and calendar26", (calendar17.compareTo(calendar26) == 0) == calendar17.equals(calendar26));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 790);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant1.minus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime4", (instant6.compareTo(mutableDateTime4) == 0) == instant6.equals(mutableDateTime4));
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.plusDays(719);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(336);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.plus(readablePeriod15);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone21 = new org.joda.time.tz.FixedDateTimeZone("\u82f1\u6587", "2022-02-21T14:47:24.584Z", 55, 859);
        long long23 = fixedDateTimeZone21.nextTransition((long) 596);
        int int25 = fixedDateTimeZone21.getOffset((long) 480);
        java.util.TimeZone timeZone26 = fixedDateTimeZone21.toTimeZone();
        boolean boolean27 = fixedDateTimeZone21.isFixed();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime16.toMutableDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone21);
        int int30 = fixedDateTimeZone21.getOffsetFromLocal((long) 1131);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime28", (dateTime12.compareTo(mutableDateTime28) == 0) == dateTime12.equals(mutableDateTime28));
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(47);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter11.withZone(dateTimeZone13);
        int int17 = dateTimeZone13.getOffsetFromLocal((long) 189);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property22 = dateTime19.centuryOfEra();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.Instant instant25 = instant23.withMillis((long) 615);
        org.joda.time.Instant instant27 = instant23.minus((long) 62);
        int int28 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant30 = instant23.plus((long) 236);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant30.withDurationAdded(readableDuration31, 44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and instant23", (dateTime10.compareTo(instant23) == 0) == dateTime10.equals(instant23));
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 790);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        boolean boolean5 = instant1.isBefore(677L);
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTime();
        int int7 = mutableDateTime6.getDayOfYear();
        int int8 = mutableDateTime6.getYear();
        java.lang.Object obj9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(943);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        boolean boolean14 = mutableDateTime6.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime16 = dateTime12.withHourOfDay(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        int int7 = dateTimeFormatter6.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 679);
        java.util.Locale locale10 = dateTimeFormatter6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(924);
        java.lang.String str13 = dateTimeZone12.getID();
        long long16 = dateTimeZone12.adjustOffset(1645454856842L, false);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone12);
        java.util.Locale locale19 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.lang.String str21 = locale19.getDisplayVariant();
        java.util.Locale locale22 = locale19.stripExtensions();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet25 = locale22.getExtensionKeys();
        java.lang.String str26 = dateTimeZone12.getName((long) 85696, locale22);
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale22);
        java.lang.String str28 = locale10.getDisplayLanguage(locale22);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str31 = dateTimeZone29.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone32 = dateTimeZone29.toTimeZone();
        int int34 = timeZone32.getOffset(4L);
        java.lang.String str35 = timeZone32.getID();
        java.lang.String str36 = timeZone32.getID();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime38 = localDateTime37.toDateTime();
        org.joda.time.Chronology chronology39 = localDateTime37.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField42 = chronology39.hourOfDay();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTimeField dateTimeField48 = dateTimeFieldType46.getField(chronology47);
        org.joda.time.LocalDateTime.Property property49 = localDateTime45.property(dateTimeFieldType46);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime45.plusYears(386);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime45.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfMonth();
        int int56 = localDateTime54.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime54.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.dayOfYear();
        java.util.Locale locale60 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str61 = property59.getAsShortText(locale60);
        java.lang.String str62 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDateTime45, locale60);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone32, locale60);
        java.util.Locale.setDefault(locale60);
        java.util.Locale locale68 = new java.util.Locale("Property[monthOfYear]", "mardi", "");
        java.util.Locale locale69 = locale68.stripExtensions();
        java.lang.String str70 = locale60.getDisplayCountry(locale69);
        java.lang.String str71 = locale10.getDisplayScript(locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar27 and calendar63", (calendar27.compareTo(calendar63) == 0) == calendar27.equals(calendar63));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType8.getField(chronology14);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays(978);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusYears(669);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.minusMillis(985);
        long long26 = chronology14.set((org.joda.time.ReadablePartial) localDateTime24, 1645454865815L);
        org.joda.time.tz.NameProvider nameProvider27 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider27);
        java.util.Locale locale29 = java.util.Locale.UK;
        java.util.Locale locale30 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet31 = locale30.getExtensionKeys();
        java.lang.String str32 = locale29.getDisplayLanguage(locale30);
        java.util.Locale locale33 = java.util.Locale.FRENCH;
        java.lang.String str34 = locale33.getScript();
        java.lang.String str35 = locale30.getDisplayCountry(locale33);
        java.lang.String str36 = locale33.getISO3Country();
        java.lang.String str37 = locale33.getDisplayScript();
        java.lang.String str40 = nameProvider27.getName(locale33, "2022-02-21T14:47:09.931Z", "2022-03-08T00:00:00.000+345:00");
        java.lang.String str41 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDateTime24, locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField15", Math.signum(durationField3.compareTo(durationField15)) == -Math.signum(durationField15.compareTo(durationField3)));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isParser();
        java.util.Locale locale4 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(265);
        boolean boolean8 = dateTimeFormatter2.isParser();
        org.joda.time.Chronology chronology9 = dateTimeFormatter2.getChronology();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant10.withDurationAdded(readableDuration13, 22);
        long long16 = instant15.getMillis();
        org.joda.time.Chronology chronology17 = instant15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone22 = dateTimeZone19.toTimeZone();
        org.joda.time.Chronology chronology23 = chronology17.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter2.withChronology(chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime25", (instant10.compareTo(dateTime25) == 0) == instant10.equals(dateTime25));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Chronology chronology7 = instant5.getChronology();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant5.plus(readableDuration8);
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime10.plusMillis(711);
        long long13 = dateTime12.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime10", (instant0.compareTo(dateTime10) == 0) == instant0.equals(dateTime10));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 22);
        long long6 = instant5.getMillis();
        org.joda.time.Instant instant7 = instant5.toInstant();
        org.joda.time.DateTime dateTime8 = instant5.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        org.joda.time.DateTime dateTime11 = property9.addToCopy(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime11", (instant0.compareTo(dateTime11) == 0) == instant0.equals(dateTime11));
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        boolean boolean7 = dateTime6.isAfterNow();
        boolean boolean9 = dateTime6.isEqual((long) 258);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.DateTime.Property property15 = dateTime13.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.toString();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        int int24 = dateTime20.getMonthOfYear();
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.weekyears();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 15, chronology25);
        boolean boolean28 = dateTimeFieldType16.isSupported(chronology25);
        int int29 = dateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime30 = dateTime13.toLocalDateTime();
        org.joda.time.DateTime dateTime31 = dateTime6.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.DateTime dateTime33 = dateTime6.plusHours(42);
        org.joda.time.DateTime dateTime35 = dateTime33.minusYears(391);
        org.joda.time.LocalDateTime localDateTime36 = dateTime35.toLocalDateTime();
        long long37 = dateTime35.getMillis();
        boolean boolean38 = dateTime35.isAfterNow();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime40 = localDateTime39.toDateTime();
        org.joda.time.DateTime dateTime42 = dateTime40.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property43 = dateTime40.dayOfMonth();
        org.joda.time.DateTime dateTime44 = property43.getDateTime();
        org.joda.time.DurationField durationField45 = property43.getLeapDurationField();
        org.joda.time.DateTime dateTime47 = property43.addToCopy((long) 64);
        org.joda.time.DateTime dateTime48 = property43.roundHalfFloorCopy();
        org.joda.time.Chronology chronology49 = dateTime48.getChronology();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.minus(readablePeriod50);
        org.joda.time.DateTime dateTime53 = dateTime51.plusHours(497);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType55 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology56 = null;
        boolean boolean57 = durationFieldType55.isSupported(chronology56);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime60 = localDateTime59.toDateTime();
        org.joda.time.DateTime dateTime62 = dateTime60.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property63 = dateTime60.dayOfMonth();
        int int64 = dateTime60.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int66 = dateTime60.get(dateTimeFieldType65);
        org.joda.time.LocalDateTime localDateTime67 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime68 = localDateTime67.toDateTime();
        org.joda.time.Chronology chronology69 = localDateTime67.getChronology();
        boolean boolean70 = dateTimeFieldType65.isSupported(chronology69);
        org.joda.time.DurationField durationField71 = chronology69.millis();
        org.joda.time.DurationField durationField72 = durationFieldType58.getField(chronology69);
        org.joda.time.DurationField durationField73 = durationFieldType55.getField(chronology69);
        boolean boolean74 = dateTimeFieldType54.isSupported(chronology69);
        int int75 = dateTime53.get(dateTimeFieldType54);
        boolean boolean76 = dateTime35.isEqual((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField26 and durationField73", (durationField26.compareTo(durationField73) == 0) == durationField26.equals(durationField73));
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.centuryOfEra();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property10 = dateTime7.dayOfMonth();
        int int11 = dateTime7.getMonthOfYear();
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.weekyears();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        int int19 = dateTime15.getMonthOfYear();
        org.joda.time.Chronology chronology20 = dateTime15.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.Chronology chronology23 = chronology12.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.hourOfDay();
        int int26 = dateTimeField24.getMaximumValue((long) 624);
        java.util.Locale locale29 = new java.util.Locale("minuteOfDay");
        java.lang.String str30 = dateTimeField24.getAsShortText((long) 544, locale29);
        java.util.Locale locale31 = locale29.stripExtensions();
        java.lang.String str32 = property4.getAsText(locale29);
        org.joda.time.DateTime dateTime33 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime35 = dateTime33.minusMillis(284);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.Chronology chronology38 = localDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology38.getZone();
        org.joda.time.Chronology chronology43 = chronology38.withUTC();
        org.joda.time.DateTime dateTime44 = dateTime35.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime44", (dateTime35.compareTo(dateTime44) == 0) == dateTime35.equals(dateTime44));
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.plusHours(4);
        org.joda.time.DateTime dateTime5 = dateTime3.plusMillis(202);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        int int7 = dateTime5.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.minus(readableDuration8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears(1127);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.withPeriodAdded(readablePeriod13, 351);
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        gregorianCalendar16.setLenient(false);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        int int24 = dateTime20.getMonthOfYear();
        int int25 = dateTime20.getMonthOfYear();
        org.joda.time.DateTime dateTime27 = dateTime20.plusMonths(282);
        java.util.GregorianCalendar gregorianCalendar28 = dateTime27.toGregorianCalendar();
        java.util.TimeZone timeZone29 = gregorianCalendar28.getTimeZone();
        java.util.Calendar.Builder builder30 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str33 = dateTimeZone31.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone34 = dateTimeZone31.toTimeZone();
        int int36 = timeZone34.getOffset((long) 747);
        timeZone34.setID("\u4e2d\u56fd\u8a9e");
        timeZone34.setRawOffset(83);
        java.util.Calendar.Builder builder41 = builder30.setTimeZone(timeZone34);
        org.joda.time.format.DateTimePrinter dateTimePrinter42 = null;
        org.joda.time.format.DateTimeParser dateTimeParser43 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter42, dateTimeParser43);
        boolean boolean45 = dateTimeFormatter44.isParser();
        java.util.Locale locale46 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter44.withLocale(locale46);
        java.util.Calendar.Builder builder48 = builder30.setLocale(locale46);
        java.util.Locale locale50 = new java.util.Locale("ETC/UTC");
        java.util.Calendar.Builder builder51 = builder30.setLocale(locale50);
        org.joda.time.LocalDateTime localDateTime52 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime53 = localDateTime52.toDateTime();
        org.joda.time.DateTime dateTime55 = dateTime53.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property56 = dateTime53.dayOfMonth();
        int int57 = dateTime53.getMonthOfYear();
        int int58 = dateTime53.getMonthOfYear();
        org.joda.time.DateTime dateTime60 = dateTime53.plusMonths(282);
        java.util.GregorianCalendar gregorianCalendar61 = dateTime60.toGregorianCalendar();
        java.util.TimeZone timeZone62 = gregorianCalendar61.getTimeZone();
        java.util.Calendar.Builder builder63 = builder30.setTimeZone(timeZone62);
        boolean boolean64 = timeZone29.hasSameRules(timeZone62);
        boolean boolean65 = timeZone29.observesDaylightTime();
        gregorianCalendar16.setTimeZone(timeZone29);
        java.util.Calendar calendar67 = java.util.Calendar.getInstance(timeZone29);
        org.joda.time.LocalDateTime localDateTime68 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime69 = localDateTime68.toDateTime();
        org.joda.time.Chronology chronology70 = localDateTime68.getChronology();
        org.joda.time.DurationField durationField71 = chronology70.eras();
        org.joda.time.DateTimeField dateTimeField72 = chronology70.dayOfWeek();
        java.util.Locale locale74 = new java.util.Locale("2022-02-21T14:10:08.924");
        int int75 = dateTimeField72.getMaximumTextLength(locale74);
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(timeZone29, locale74);
        java.lang.String str77 = locale74.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar67 and calendar76", (calendar67.compareTo(calendar76) == 0) == calendar67.equals(calendar76));
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int3 = localDate1.indexOf(dateTimeFieldType2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDate1.getFieldTypes();
        org.joda.time.LocalDate.Property property5 = localDate1.yearOfEra();
        org.joda.time.LocalDate localDate6 = property5.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property8 = localDate6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(0L, dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate16.plus(readablePeriod19);
        org.joda.time.LocalDate localDate21 = localDate13.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTime dateTime22 = localDate16.toDateTimeAtCurrentTime();
        int int23 = dateTime22.getHourOfDay();
        org.joda.time.LocalDate localDate24 = dateTime22.toLocalDate();
        int[] intArray25 = localDate24.getValues();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        boolean boolean29 = dateTimeFormatter28.isParser();
        java.util.Locale locale30 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withLocale(locale30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter32.withDefaultYear(47);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter32.withZone(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(356);
        java.lang.String str40 = dateTimeZone39.getID();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withZone(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDate24.toDateTimeAtCurrentTime(dateTimeZone39);
        org.joda.time.Interval interval43 = localDate6.toInterval(dateTimeZone39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime42", (dateTime22.compareTo(dateTime42) == 0) == dateTime22.equals(dateTime42));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.Chronology chronology6 = dateTime1.getChronology();
        org.joda.time.DateTime dateTime9 = dateTime1.withDurationAdded((long) 7, 128);
        org.joda.time.DateTime dateTime11 = dateTime9.minusYears(483);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        int int14 = localDateTime12.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.property(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.plusYears(386);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime21.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minusHours(165);
        int int32 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int34 = localDateTime18.get(dateTimeFieldType33);
        int int35 = dateTime11.get(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType39.getField(chronology40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime38.property(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime38.plusYears(386);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime38.minusWeeks(404);
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = null;
        org.joda.time.format.DateTimeParser dateTimeParser48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter47, dateTimeParser48);
        boolean boolean50 = dateTimeFormatter49.isParser();
        java.util.Locale locale51 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withLocale(locale51);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter52.withOffsetParsed();
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime55 = localDateTime54.toDateTime();
        org.joda.time.DateTime dateTime57 = dateTime55.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property58 = dateTime55.dayOfMonth();
        int int59 = dateTime55.getMonthOfYear();
        org.joda.time.Chronology chronology60 = dateTime55.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.weekyears();
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime63 = localDateTime62.toDateTime();
        org.joda.time.DateTime dateTime65 = dateTime63.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property66 = dateTime63.dayOfMonth();
        int int67 = dateTime63.getMonthOfYear();
        org.joda.time.Chronology chronology68 = dateTime63.getChronology();
        org.joda.time.DurationField durationField69 = chronology68.weekyears();
        org.joda.time.DateTimeZone dateTimeZone70 = chronology68.getZone();
        org.joda.time.Chronology chronology71 = chronology60.withZone(dateTimeZone70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter53.withChronology(chronology71);
        boolean boolean73 = dateTimeFormatter72.isOffsetParsed();
        org.joda.time.Chronology chronology74 = dateTimeFormatter72.getChronolgy();
        boolean boolean75 = localDateTime46.equals((java.lang.Object) chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime77 = dateTime11.toMutableDateTime(chronology74);
        org.joda.time.Instant instant78 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.Instant instant80 = instant78.plus(readableDuration79);
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.Instant instant83 = instant78.withDurationAdded(readableDuration81, 22);
        org.joda.time.Chronology chronology84 = instant78.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology84.getZone();
        org.joda.time.DateTime dateTime87 = mutableDateTime77.toDateTime(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant78", (dateTime1.compareTo(instant78) == 0) == dateTime1.equals(instant78));
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean5 = fixedDateTimeZone4.isFixed();
        int int7 = fixedDateTimeZone4.getStandardOffset((long) 152);
        long long11 = fixedDateTimeZone4.convertLocalToUTC((long) 53249, true, (long) 27);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str14 = dateTimeZone12.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone15 = dateTimeZone12.toTimeZone();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.Chronology chronology19 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType26.getField(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.property(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.plusYears(386);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime25.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        int int36 = localDateTime34.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime34.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        java.util.Locale locale40 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str41 = property39.getAsShortText(locale40);
        java.lang.String str42 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) localDateTime25, locale40);
        java.lang.String str43 = dateTimeZone12.getShortName((long) 381, locale40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(dateTimeZone12);
        long long46 = fixedDateTimeZone4.getMillisKeepLocal(dateTimeZone12, 468L);
        int int48 = fixedDateTimeZone4.getStandardOffset((long) 115);
        org.joda.time.LocalDateTime localDateTime49 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.dayOfMonth();
        int int51 = localDateTime49.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.dayOfYear();
        int int55 = localDateTime53.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime58 = localDateTime53.withField(dateTimeFieldType56, 11);
        java.util.Date date59 = localDateTime58.toDate();
        int[] intArray60 = localDateTime58.getValues();
        boolean boolean61 = fixedDateTimeZone4.equals((java.lang.Object) localDateTime58);
        org.joda.time.LocalDateTime localDateTime62 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime64 = property63.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType65.getField(chronology66);
        org.joda.time.LocalDateTime.Property property68 = localDateTime64.property(dateTimeFieldType65);
        org.joda.time.LocalDateTime localDateTime70 = localDateTime64.plusYears(386);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime64.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime74 = localDateTime72.minusHours(165);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.minusSeconds(602);
        org.joda.time.LocalDateTime.Property property77 = localDateTime74.secondOfMinute();
        boolean boolean78 = fixedDateTimeZone4.equals((java.lang.Object) localDateTime74);
        boolean boolean79 = fixedDateTimeZone4.isFixed();
        int int81 = fixedDateTimeZone4.getOffsetFromLocal(1645454887003L);
        java.util.Locale locale83 = java.util.Locale.GERMANY;
        java.lang.String str84 = locale83.getScript();
        java.lang.String str85 = fixedDateTimeZone4.getShortName((long) 254, locale83);
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone4);
        int int88 = fixedDateTimeZone4.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime86", (dateTime18.compareTo(dateTime86) == 0) == dateTime18.equals(dateTime86));
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getSecondOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.years();
        org.joda.time.Chronology chronology12 = null;
        boolean boolean13 = durationFieldType11.isSupported(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType11, 128);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours(596);
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = dateTime15.isAfter(readableInstant18);
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.plus(readableDuration21);
        org.joda.time.Chronology chronology23 = instant20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.era();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology23);
        int int26 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean27 = dateTime15.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant20", (dateTime1.compareTo(instant20) == 0) == dateTime1.equals(instant20));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.withZone(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMinutes(165);
        int int10 = dateTime9.getDayOfMonth();
        boolean boolean11 = dateTime9.isAfterNow();
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        int int13 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime20 = property19.roundCeilingCopy();
        java.util.Locale locale22 = new java.util.Locale("ETC/UTC");
        int int23 = property19.getMaximumTextLength(locale22);
        java.lang.String str24 = locale22.getISO3Country();
        java.util.Calendar calendar25 = dateTime9.toCalendar(locale22);
        boolean boolean26 = locale22.hasExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar12 and calendar25", (gregorianCalendar12.compareTo(calendar25) == 0) == gregorianCalendar12.equals(calendar25));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.halfdays();
        long long9 = chronology2.add(1645454887565L, (long) 693, 201);
        org.joda.time.DurationField durationField10 = chronology2.eras();
        org.joda.time.DurationField durationField11 = chronology2.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField10", Math.signum(durationField5.compareTo(durationField10)) == -Math.signum(durationField10.compareTo(durationField5)));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str6 = nameProvider0.getShortName(locale3, "2022-02-21T14:47:57.502Z", "66");
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.lang.String str10 = nameProvider0.getShortName(locale7, "", "2021-12-20T23:48:08.995");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfMonth();
        int int17 = dateTime13.getMonthOfYear();
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        int int25 = dateTime21.getMonthOfYear();
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology26.getZone();
        org.joda.time.Chronology chronology29 = chronology18.withZone(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = chronology29.hourOfDay();
        int int32 = dateTimeField30.getMaximumValue((long) 624);
        java.util.Locale locale35 = new java.util.Locale("minuteOfDay");
        java.lang.String str36 = dateTimeField30.getAsShortText((long) 544, locale35);
        java.util.Locale locale37 = locale35.stripExtensions();
        java.util.Set<java.lang.Character> charSet38 = locale35.getExtensionKeys();
        java.lang.String str41 = nameProvider0.getShortName(locale35, "\u53f0\u7063", "200");
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType42.getField(chronology43);
        long long46 = dateTimeField44.remainder((long) (short) 100);
        java.lang.String str48 = dateTimeField44.getAsShortText(0L);
        long long50 = dateTimeField44.roundHalfCeiling(1645454828936L);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str53 = dateTimeZone51.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone54 = dateTimeZone51.toTimeZone();
        int int56 = timeZone54.getOffset(4L);
        java.lang.String str57 = timeZone54.getID();
        java.lang.String str58 = timeZone54.getID();
        org.joda.time.LocalDateTime localDateTime59 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime60 = localDateTime59.toDateTime();
        org.joda.time.Chronology chronology61 = localDateTime59.getChronology();
        org.joda.time.DurationField durationField62 = chronology61.eras();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField64 = chronology61.hourOfDay();
        org.joda.time.LocalDateTime localDateTime65 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property66 = localDateTime65.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime67 = property66.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime67.property(dateTimeFieldType68);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.plusYears(386);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime67.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime76 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property77 = localDateTime76.dayOfMonth();
        int int78 = localDateTime76.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime80 = localDateTime76.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property81 = localDateTime80.dayOfYear();
        java.util.Locale locale82 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str83 = property81.getAsShortText(locale82);
        java.lang.String str84 = dateTimeField64.getAsShortText((org.joda.time.ReadablePartial) localDateTime67, locale82);
        java.util.Calendar calendar85 = java.util.Calendar.getInstance(timeZone54, locale82);
        java.lang.String str86 = locale82.getDisplayLanguage();
        int int87 = dateTimeField44.getMaximumShortTextLength(locale82);
        java.lang.String str88 = locale82.toLanguageTag();
        java.lang.String str91 = nameProvider0.getShortName(locale82, "2022-03-07t23:10:09.322", "+00:00:00.055");
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField62", Math.signum(durationField19.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField19)));
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) 781);
        int int9 = dateTime6.getMinuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime6.plusYears(870);
        org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone16 = new org.joda.time.tz.FixedDateTimeZone("+00:00:00.924", "Temps universel coordonn\351", 529, (int) (short) 100);
        boolean boolean17 = fixedDateTimeZone16.isFixed();
        int int19 = fixedDateTimeZone16.getStandardOffset((long) 152);
        long long23 = fixedDateTimeZone16.convertLocalToUTC((long) 53249, true, (long) 27);
        int int25 = fixedDateTimeZone16.getStandardOffset((long) 675);
        int int27 = fixedDateTimeZone16.getStandardOffset((long) 851);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime((org.joda.time.DateTimeZone) fixedDateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime29", (dateTime1.compareTo(dateTime29) == 0) == dateTime1.equals(dateTime29));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.joda.time.Chronology chronology4 = instant0.getChronology();
        long long5 = instant0.getMillis();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) instant0, chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfMonth();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        boolean boolean12 = dateTimeFormatter11.isParser();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter11.withLocale(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter14.withOffsetParsed();
        int int16 = dateTimeFormatter15.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 679);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfMonth();
        int int24 = localDateTime22.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        boolean boolean28 = dateTimeZone21.isLocalDateTimeGap(localDateTime26);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 2022, dateTimeZone21);
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter19.withZone(dateTimeZone21);
        java.util.Locale locale32 = dateTimeFormatter19.getLocale();
        java.lang.String str33 = locale32.getCountry();
        int int34 = property8.getMaximumTextLength(locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime30", (instant0.compareTo(dateTime30) == 0) == instant0.equals(dateTime30));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property4 = dateTime1.dayOfMonth();
        int int5 = dateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int7 = dateTime1.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.Chronology chronology10 = localDateTime8.getChronology();
        boolean boolean11 = dateTimeFieldType6.isSupported(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.millis();
        org.joda.time.Chronology chronology13 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.hourOfDay();
        java.util.Locale locale17 = java.util.Locale.FRENCH;
        java.lang.String str18 = locale17.getScript();
        java.util.Locale.setDefault(locale17);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str22 = dateTimeZone20.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone23 = dateTimeZone20.toTimeZone();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.hourOfDay();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime33.property(dateTimeFieldType34);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.plusYears(386);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime33.minusWeeks(404);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property43 = localDateTime42.dayOfMonth();
        int int44 = localDateTime42.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime42.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.dayOfYear();
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str49 = property47.getAsShortText(locale48);
        java.lang.String str50 = dateTimeField30.getAsShortText((org.joda.time.ReadablePartial) localDateTime33, locale48);
        java.lang.String str51 = dateTimeZone20.getShortName((long) 381, locale48);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone20);
        java.util.Locale locale54 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet55 = locale54.getExtensionKeys();
        java.lang.String str56 = locale54.getDisplayVariant();
        java.util.Locale locale57 = locale54.stripExtensions();
        java.lang.String str58 = dateTimeZone20.getName((long) 913, locale54);
        java.lang.String str59 = locale17.getDisplayLanguage(locale54);
        java.util.Locale.setDefault(locale54);
        java.lang.String str61 = dateTimeField15.getAsText(1645455128201L, locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField28", Math.signum(durationField12.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField12)));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.halfdayOfDay();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfEra();
        java.lang.String str8 = dateTime6.toString();
        long long9 = dateTime6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime6.getZone();
        java.lang.String str11 = dateTimeZone10.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime6", (dateTime1.compareTo(dateTime6) == 0) == dateTime1.equals(dateTime6));
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.Chronology chronology2 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfHour();
        long long8 = dateTimeField6.roundFloor(66009600009L);
        java.util.Locale locale11 = new java.util.Locale("23:47:56.996");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = dateTimeField6.getAsShortText(12, locale11);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfMonth();
        int int19 = dateTime15.getMonthOfYear();
        org.joda.time.Chronology chronology20 = dateTime15.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.weekyears();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.halfdayOfDay();
        long long27 = dateTimeField24.add((long) 53233784, (long) 2000);
        java.lang.String str28 = dateTimeField24.toString();
        boolean boolean29 = locale11.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField21", Math.signum(durationField3.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField3)));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0L, dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate7.plus(readablePeriod10);
        org.joda.time.LocalDate localDate12 = localDate4.withFields((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withMillis((long) 386);
        org.joda.time.DateTime.Property property16 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withMillis(1645454838993L);
        org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) 1645454838993L);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant19.plus(readableDuration20);
        boolean boolean23 = instant19.equals((java.lang.Object) 53571029);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and instant19", (dateTime18.compareTo(instant19) == 0) == dateTime18.equals(instant19));
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime2 = localDateTime1.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property5 = dateTime2.dayOfMonth();
        int int6 = dateTime2.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int8 = dateTime2.get(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.Chronology chronology11 = localDateTime9.getChronology();
        boolean boolean12 = dateTimeFieldType7.isSupported(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.millis();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 53240462, chronology11);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusWeeks(576);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property21 = dateTime18.dayOfMonth();
        int int22 = dateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int24 = dateTime18.get(dateTimeFieldType23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime26 = localDateTime25.toDateTime();
        org.joda.time.Chronology chronology27 = localDateTime25.getChronology();
        boolean boolean28 = dateTimeFieldType23.isSupported(chronology27);
        org.joda.time.DurationField durationField29 = chronology27.millis();
        org.joda.time.Chronology chronology30 = chronology27.withUTC();
        org.joda.time.DateTimeField dateTimeField31 = chronology27.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = dateTimeField31.getType();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getDurationType();
        java.lang.String str34 = durationFieldType33.toString();
        boolean boolean35 = localDateTime16.isSupported(durationFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime37 = localDateTime36.toDateTime();
        org.joda.time.DateTime dateTime39 = dateTime37.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property40 = dateTime37.dayOfMonth();
        int int41 = dateTime37.getMonthOfYear();
        org.joda.time.Chronology chronology42 = dateTime37.getChronology();
        org.joda.time.LocalDateTime localDateTime44 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime45 = localDateTime44.toDateTime();
        org.joda.time.DateTime dateTime47 = dateTime45.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfMonth();
        int int49 = dateTime45.getMonthOfYear();
        org.joda.time.Chronology chronology50 = dateTime45.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.weekyears();
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 15, chronology50);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withPeriodAdded(readablePeriod53, 991);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.plusMonths(949);
        int int58 = localDateTime52.getMonthOfYear();
        long long60 = chronology42.set((org.joda.time.ReadablePartial) localDateTime52, 454764L);
        org.joda.time.DateTimeField dateTimeField61 = chronology42.dayOfMonth();
        org.joda.time.DurationField durationField62 = chronology42.eras();
        org.joda.time.DurationField durationField63 = durationFieldType33.getField(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField62", Math.signum(durationField13.compareTo(durationField62)) == -Math.signum(durationField62.compareTo(durationField13)));
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfMonth();
        int int4 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfYear();
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 2022, dateTimeZone1);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(96);
        java.lang.String str12 = dateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(573);
        java.util.Locale locale16 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale17 = java.util.Locale.UK;
        java.util.Locale locale18 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = locale17.getDisplayLanguage(locale18);
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = locale21.getDisplayCountry();
        java.lang.String str23 = locale18.getDisplayLanguage(locale21);
        java.lang.String str24 = locale16.getDisplayName(locale21);
        java.lang.String str25 = locale16.getISO3Language();
        java.lang.String str26 = dateTimeZone14.getShortName((long) 83413546, locale16);
        org.joda.time.DateTime dateTime27 = dateTime9.withZone(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime28 = dateTime27.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime30 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime30.withMinuteOfHour(10);
        org.joda.time.DateTime dateTime34 = dateTime32.plusHours(0);
        org.joda.time.DateTime.Property property35 = dateTime32.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = property35.getField();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        org.joda.time.DateTime dateTime39 = property35.addWrapFieldToCopy((int) 'a');
        int int40 = dateTime39.getYearOfEra();
        org.joda.time.DateTime dateTime42 = dateTime39.withCenturyOfEra(1969);
        java.util.Date date43 = dateTime39.toDate();
        org.joda.time.DateTime dateTime44 = dateTime39.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime47 = dateTime39.withPeriodAdded(readablePeriod45, 121);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 2022);
        int int50 = dateTime49.getYearOfCentury();
        org.joda.time.DateTime dateTime51 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property52 = dateTime51.centuryOfEra();
        boolean boolean54 = dateTime51.isAfter((long) 121);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.Instant instant57 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.Instant instant59 = instant57.plus(readableDuration58);
        boolean boolean60 = dateTimeZone55.equals((java.lang.Object) readableDuration58);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        long long65 = dateTimeZone55.convertLocalToUTC((long) 675, true, (long) 32400869);
        org.joda.time.DateTime dateTime66 = dateTime51.withZoneRetainFields(dateTimeZone55);
        java.lang.String str68 = dateTimeZone55.getShortName((long) 894);
        org.joda.time.DateTime dateTime69 = dateTime47.withZoneRetainFields(dateTimeZone55);
        org.joda.time.DateTime dateTime70 = localDateTime28.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime27", (dateTime9.compareTo(dateTime27) == 0) == dateTime9.equals(dateTime27));
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        java.util.Locale locale3 = new java.util.Locale("\u4e2d\u6587", "Etc/UTC", "minuteOfHour");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        java.util.Set<java.lang.Character> charSet5 = locale3.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet7 = locale6.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.lang.String[] strArray12 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.Locale.FilteringMode filteringMode15 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList16 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.lang.String>) strList13, filteringMode15);
        boolean boolean17 = charSet7.containsAll((java.util.Collection<java.lang.String>) strList13);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.lang.String[] strArray25 = new java.lang.String[] { "United Kingdom" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.Locale.FilteringMode filteringMode28 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList29 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.lang.String>) strList26, filteringMode28);
        java.util.List<java.lang.String> strList30 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strList29);
        boolean boolean31 = charSet7.removeAll((java.util.Collection<java.lang.String>) strList29);
        boolean boolean32 = charSet5.removeAll((java.util.Collection<java.lang.String>) strList29);
        java.util.Locale locale33 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.lang.String str35 = locale33.getDisplayVariant();
        java.util.Locale locale36 = locale33.stripExtensions();
        java.util.Set<java.lang.String> strSet37 = locale36.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet38 = locale36.getUnicodeLocaleAttributes();
        boolean boolean39 = charSet5.retainAll((java.util.Collection<java.lang.String>) strSet38);
        org.joda.time.Instant instant40 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant42 = instant40.plus(readableDuration41);
        org.joda.time.Instant instant44 = instant40.minus((long) (byte) 0);
        org.joda.time.Instant instant47 = instant44.withDurationAdded((long) 0, 24);
        org.joda.time.Instant instant48 = instant44.toInstant();
        org.joda.time.Instant instant50 = instant48.minus((long) 988);
        org.joda.time.Instant instant52 = instant50.plus((long) 830);
        org.joda.time.DateTime dateTime53 = instant52.toDateTime();
        org.joda.time.Instant instant55 = instant52.minus(694041875L);
        boolean boolean56 = charSet5.equals((java.lang.Object) instant55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant52 and dateTime53", (instant52.compareTo(dateTime53) == 0) == instant52.equals(dateTime53));
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        boolean boolean6 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        java.util.Locale locale9 = dateTimeFormatter5.getLocale();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        int int15 = dateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime11.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime19 = localDateTime18.toDateTime();
        org.joda.time.Chronology chronology20 = localDateTime18.getChronology();
        boolean boolean21 = dateTimeFieldType16.isSupported(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.millis();
        org.joda.time.Chronology chronology23 = chronology20.withUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter5.withChronology(chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.year();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTime dateTime27 = instant0.toDateTime(chronology23);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.Instant instant29 = instant0.plus(readableDuration28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant29 and dateTime11", (instant29.compareTo(dateTime11) == 0) == instant29.equals(dateTime11));
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.dayOfMonth();
        int int2 = localDateTime0.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minusWeeks(100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime7 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = org.joda.time.Instant.parse("2408-02-22T00:00:00.000");
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) instant11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime14.withMinuteOfHour(10);
        boolean boolean17 = dateTime16.isAfterNow();
        int int18 = dateTime16.getYearOfEra();
        org.joda.time.DateTime dateTime20 = dateTime16.plusMinutes(52);
        org.joda.time.DateTime dateTime22 = dateTime16.minusDays(293);
        int int23 = dateTime16.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str27 = dateTimeZone25.getNameKey((long) (short) -1);
        java.util.TimeZone timeZone28 = dateTimeZone25.toTimeZone();
        int int30 = dateTimeZone25.getOffsetFromLocal((long) 122);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 53240462, dateTimeZone25);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) dateTime16, dateTimeZone25);
        org.joda.time.DateTime dateTime33 = dateTime12.toDateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime35 = dateTime33.plusMonths(737);
        org.joda.time.DateTime.Property property36 = dateTime35.secondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime33", (dateTime12.compareTo(dateTime33) == 0) == dateTime12.equals(dateTime33));
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour(10);
        boolean boolean4 = dateTime3.isAfterNow();
        int int5 = dateTime3.getYearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime3.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime9 = localDateTime8.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.withMinuteOfHour(10);
        org.joda.time.DateTime.Property property12 = dateTime9.dayOfMonth();
        int int13 = dateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int15 = dateTime9.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.Chronology chronology18 = localDateTime16.getChronology();
        boolean boolean19 = dateTimeFieldType14.isSupported(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.millis();
        org.joda.time.Chronology chronology21 = chronology18.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.era();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology21.add(readablePeriod23, (long) 310, 33);
        org.joda.time.DateTime dateTime27 = dateTime7.withChronology(chronology21);
        int int28 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTime dateTime31 = dateTime27.withFieldAdded(durationFieldType29, 51053206);
        java.lang.String str32 = durationFieldType29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime27", (dateTime7.compareTo(dateTime27) == 0) == dateTime7.equals(dateTime27));
    }
}

