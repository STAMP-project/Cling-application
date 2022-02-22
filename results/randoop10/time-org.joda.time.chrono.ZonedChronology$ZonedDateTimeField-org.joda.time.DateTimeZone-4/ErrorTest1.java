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
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str6 = timeZone1.getID();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        long long14 = chronology8.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField16 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.hourOfHalfday();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.lang.String str21 = dateTimeField17.getAsShortText((int) (byte) 10, locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone1, locale19);
        java.util.TimeZone.setDefault(timeZone1);
        boolean boolean24 = timeZone1.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar22", (calendar5.compareTo(calendar22) == 0) == calendar5.equals(calendar22));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        java.lang.Integer int6 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 66667662);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyear();
        org.joda.time.DurationField durationField13 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology10.minuteOfDay();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        int int22 = property20.get();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = property20.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate27 = localDate23.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.DateTime dateTime30 = localDate27.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone31 = dateTime30.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone31);
        org.joda.time.Chronology chronology34 = chronology10.withZone(dateTimeZone31);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = null;
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        java.util.Locale locale39 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter38.withLocale(locale39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter40.withZoneUTC();
        java.util.Locale locale45 = new java.util.Locale("DateTimeField[monthOfYear]", "GMT", "7");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter40.withLocale(locale45);
        java.lang.String str47 = dateTimeZone31.getShortName(1645514361729L, locale45);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter8.withLocale(locale45);
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.minuteOfDay();
        boolean boolean54 = durationFieldType50.isSupported(chronology52);
        org.joda.time.DurationField durationField55 = chronology52.weeks();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(694252944000L, chronology52);
        org.joda.time.DateTimeField dateTimeField57 = chronology52.minuteOfHour();
        org.joda.time.Chronology chronology58 = chronology52.withUTC();
        org.joda.time.DurationField durationField59 = chronology52.months();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter48.withChronology(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField55", Math.signum(durationField13.compareTo(durationField55)) == -Math.signum(durationField55.compareTo(durationField13)));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology30);
        java.lang.Object obj34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj34, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property39 = dateTime38.weekyear();
        int int40 = dateTime38.getYearOfCentury();
        int int41 = dateTime38.getSecondOfDay();
        org.joda.time.DateTime dateTime43 = dateTime38.plusDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime38.withPeriodAdded(readablePeriod44, (int) '4');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime46.minus(readableDuration47);
        boolean boolean49 = dateTime33.isEqual((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.DateTime dateTime51 = dateTime33.minusMinutes((-457423));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        int int8 = dateTime7.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(4);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime9.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1646722800000L, dateTimeZone12);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant15", (dateTime13.compareTo(instant15) == 0) == dateTime13.equals(instant15));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(4);
        int int13 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime15 = dateTime4.withYearOfEra((int) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.plusDays(19059);
        int int18 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime20 = dateTime15.plusHours(2021);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getDayOfWeek();
        org.joda.time.LocalDate localDate25 = localDate21.minusMonths(32770);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        org.joda.time.DateTime dateTime32 = property31.roundCeilingCopy();
        org.joda.time.DateTime dateTime34 = dateTime32.withCenturyOfEra((int) ' ');
        java.lang.Object obj35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj35, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime39.weekyear();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.DurationField durationField42 = property40.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property40.getFieldType();
        java.lang.String str44 = dateTimeFieldType43.toString();
        boolean boolean45 = dateTime34.isSupported(dateTimeFieldType43);
        org.joda.time.LocalDate.Property property46 = localDate21.property(dateTimeFieldType43);
        java.lang.String str47 = localDate21.toString();
        org.joda.time.LocalDate localDate49 = localDate21.withWeekyear(26176839);
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.DateTime dateTime51 = dateTime20.withChronology(chronology50);
        org.joda.time.Chronology chronology52 = dateTime51.getChronology();
        org.joda.time.DurationField durationField53 = chronology52.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime51", (dateTime20.compareTo(dateTime51) == 0) == dateTime20.equals(dateTime51));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTime dateTime16 = dateTime4.withChronology(chronology12);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readableDuration17);
        int int19 = dateTime16.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(20000801142000000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        int int4 = mutableDateTime3.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant1.minus(readableDuration9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant10", (dateTime2.compareTo(instant10) == 0) == dateTime2.equals(instant10));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withPeriodAdded(readablePeriod9, 8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.minusMillis(600032);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.minus(readablePeriod14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.withPeriodAdded(readablePeriod16, 33);
        org.joda.time.Chronology chronology19 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.eras();
        org.joda.time.DurationField durationField21 = chronology19.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField20, durationField21, and durationField20", !(durationField20.compareTo(durationField21) == 0) || (Math.signum(durationField20.compareTo(durationField20)) == Math.signum(durationField21.compareTo(durationField20))));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 32769, chronology11);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology11);
        long long18 = chronology11.add(1646723809228L, (long) 2, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = chronology11.getZone();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology11.add(readablePeriod20, 1646723860263L, 21);
        org.joda.time.DateTime dateTime24 = dateTime8.withChronology(chronology11);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        java.lang.String str26 = dateTime24.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant25", (dateTime3.compareTo(instant25) == 0) == dateTime3.equals(instant25));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.DateTime dateTime6 = dateTime1.minus(readablePeriod5);
        int int7 = dateTime6.getHourOfDay();
        int int8 = dateTime6.getMillisOfSecond();
        org.joda.time.Instant instant9 = dateTime6.toInstant();
        org.joda.time.DateTime.Property property10 = dateTime6.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant9", (dateTime6.compareTo(instant9) == 0) == dateTime6.equals(instant9));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long10 = dateTimeField2.add(1646723755047L, 23);
        java.util.Locale locale15 = new java.util.Locale("", "2022", "");
        java.lang.String str16 = dateTimeField2.getAsText((int) (short) 1, locale15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        int int23 = dateTime21.getYear();
        org.joda.time.DateTime dateTime24 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        boolean boolean27 = localDate25.isSupported(durationFieldType26);
        int int28 = localDate25.size();
        org.joda.time.DateTime dateTime29 = dateTime24.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate31 = localDate25.minusWeeks((int) (short) 0);
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property38 = dateTime37.weekyear();
        java.util.Locale locale40 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime41 = property38.setCopy("0", locale40);
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale40);
        java.util.Locale locale43 = java.util.Locale.UK;
        java.lang.String str44 = locale40.getDisplayCountry(locale43);
        java.lang.String str45 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate25, 292269054, locale43);
        org.joda.time.DurationField durationField46 = dateTimeField2.getRangeDurationField();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.yearOfCentury();
        org.joda.time.DurationField durationField50 = chronology48.weeks();
        org.joda.time.DateTime dateTime51 = org.joda.time.DateTime.now(chronology48);
        org.joda.time.DateTimeField dateTimeField52 = chronology48.halfdayOfDay();
        org.joda.time.DurationField durationField53 = chronology48.halfdays();
        org.joda.time.DurationField durationField54 = chronology48.halfdays();
        int int55 = durationField46.compareTo(durationField54);
        long long57 = durationField46.getValueAsLong(1646723935959L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime51", (dateTime19.compareTo(dateTime51) == 0) == dateTime19.equals(dateTime51));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.DurationField durationField20 = property18.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property18.getFieldType();
        java.lang.String str22 = dateTimeFieldType21.toString();
        boolean boolean23 = dateTime7.isSupported(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.getName();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.minuteOfDay();
        java.lang.String str29 = chronology26.toString();
        org.joda.time.DurationField durationField30 = chronology26.weeks();
        boolean boolean31 = dateTimeFieldType21.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField32 = chronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.halfdayOfDay();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime34", (dateTime2.compareTo(dateTime34) == 0) == dateTime2.equals(dateTime34));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(20000801142000000L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        java.util.Date date4 = mutableDateTime3.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        java.util.Date date3 = instant1.toDate();
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime2.minusHours(0);
        org.joda.time.Instant instant11 = dateTime2.toInstant();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 391);
        org.joda.time.Instant instant16 = instant11.withDurationAdded(1646723870645L, 457423);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant11.plus(readableDuration17);
        org.joda.time.DateTime dateTime19 = instant18.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant18", (dateTime2.compareTo(instant18) == 0) == dateTime2.equals(instant18));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(chronology2);
        org.joda.time.DurationField durationField9 = chronology2.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(dateTimeZone14);
        org.joda.time.DateTime.Property property16 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        int int25 = dateTime23.getYear();
        org.joda.time.DateTime dateTime26 = dateTime23.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays(6);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime26.plus(readablePeriod29);
        int int31 = property16.getDifference((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DurationField durationField32 = property16.getDurationField();
        int int33 = durationField9.compareTo(durationField32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime11", (dateTime8.compareTo(dateTime11) == 0) == dateTime8.equals(dateTime11));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DurationField durationField13 = chronology9.weeks();
        org.joda.time.DateTime dateTime14 = dateTime4.withChronology(chronology9);
        org.joda.time.Chronology chronology15 = chronology9.withUTC();
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder8 = builder3.setLocale(locale7);
        java.util.Calendar calendar9 = builder8.build();
        java.util.Calendar.Builder builder13 = builder8.setDate(45173193, 26329469, 26388882);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar1 and calendar9", (calendar1.compareTo(calendar9) == 0) == calendar1.equals(calendar9));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = chronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.minuteOfDay();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean18 = dateTimeZone17.isFixed();
        int int20 = dateTimeZone17.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime21 = localDate14.toDateTimeAtCurrentTime(dateTimeZone17);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.Interval interval24 = property22.toInterval();
        org.joda.time.DateTime dateTime25 = property22.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        boolean boolean30 = durationFieldType26.isSupported(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = chronology28.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = chronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField36 = chronology28.yearOfEra();
        org.joda.time.DateTimeField dateTimeField37 = chronology28.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology28.getZone();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime25.toMutableDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime40 = localDate11.toDateTimeAtStartOfDay(dateTimeZone38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime39", (dateTime25.compareTo(mutableDateTime39) == 0) == dateTime25.equals(mutableDateTime39));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField7 = chronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField7, and durationField4", !(durationField4.compareTo(durationField7) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField7.compareTo(durationField4))));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfDay();
        long long17 = chronology11.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        int int25 = property23.get();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        int int28 = property23.compareTo((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate localDate33 = localDate29.minusYears(10);
        int[] intArray34 = localDate29.getValues();
        chronology11.validate((org.joda.time.ReadablePartial) localDate26, intArray34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        int int43 = property41.get();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        int int46 = property41.compareTo((org.joda.time.ReadablePartial) localDate44);
        org.joda.time.LocalDate localDate48 = localDate44.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.plus(readablePeriod49);
        org.joda.time.DateTime dateTime51 = localDate48.toDateTimeAtCurrentTime();
        boolean boolean52 = localDate26.isAfter((org.joda.time.ReadablePartial) localDate48);
        java.lang.Object obj53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj53, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property58 = dateTime57.weekyear();
        int int59 = dateTime57.getYear();
        org.joda.time.DateTime dateTime60 = dateTime57.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean64 = dateTimeZone63.isFixed();
        int int66 = dateTimeZone63.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime67 = dateTime60.withZoneRetainFields(dateTimeZone63);
        java.lang.String str69 = dateTimeZone63.getShortName((long) 5);
        org.joda.time.DateTime dateTime70 = localDate26.toDateTimeAtStartOfDay(dateTimeZone63);
        org.joda.time.DateTime dateTime71 = dateTime3.toDateTime(dateTimeZone63);
        org.joda.time.DateTime dateTime73 = dateTime3.plusYears(66534);
        org.joda.time.DateTime dateTime75 = dateTime3.withMillis((long) 66644299);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime71", (dateTime3.compareTo(dateTime71) == 0) == dateTime3.equals(dateTime71));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.lang.String[] strArray17 = new java.lang.String[] { "French", "", "hi!", "weekyear", "ISOChronology[UTC]", "French", "French", "97", "French", "2022-02-22T23:59:59.999Z", "2022", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        strSet18.clear();
        java.lang.String str21 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.lang.String>) strSet18);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale[] localeArray28 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList29 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList29, localeArray28);
        java.util.Locale.FilteringMode filteringMode31 = null;
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.util.Locale>) localeList29, filteringMode31);
        java.util.List<java.util.Locale> localeList33 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList32);
        boolean boolean34 = strSet18.containsAll((java.util.Collection<java.util.Locale>) localeList33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField39 = chronology36.days();
        boolean boolean40 = strSet18.remove((java.lang.Object) chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.minuteOfDay();
        org.joda.time.DurationField durationField42 = chronology36.eras();
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now(chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField42", Math.signum(durationField39.compareTo(durationField42)) == -Math.signum(durationField42.compareTo(durationField39)));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 32769, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology8);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(1340);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZone(dateTimeZone18);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime23.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfSecond((int) (byte) 100);
        int int30 = property20.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime32 = dateTime29.minusYears(40320000);
        int int33 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(81952L);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.DurationField durationField4 = chronology2.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField3, durationField4, and durationField3", !(durationField3.compareTo(durationField4) == 0) || (Math.signum(durationField3.compareTo(durationField3)) == Math.signum(durationField4.compareTo(durationField3))));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 8);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant23 = instant21.minus(readableDuration22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant23.plus(readableDuration24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        java.lang.Object obj1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        long long9 = chronology3.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        int int17 = property15.get();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = property15.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getDayOfWeek();
        org.joda.time.LocalDate localDate25 = localDate21.minusYears(10);
        int[] intArray26 = localDate21.getValues();
        chronology3.validate((org.joda.time.ReadablePartial) localDate18, intArray26);
        org.joda.time.DateTimeField dateTimeField28 = chronology3.weekyear();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj1, chronology3);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 26430650, chronology3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime29", (dateTime12.compareTo(dateTime29) == 0) == dateTime12.equals(dateTime29));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '4');
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = dateTime7.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime27 = dateTime7.plusMonths(66514657);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime22", (dateTime7.compareTo(dateTime22) == 0) == dateTime7.equals(dateTime22));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone1.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        boolean boolean5 = dateTimeZone1.isFixed();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) 2024);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 6, dateTimeZone1);
        long long11 = dateTimeZone1.adjustOffset(1646724055106L, false);
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        long long18 = dateTime16.getMillis();
        org.joda.time.DateTime.Property property19 = dateTime16.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime16, dateTimeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.era();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfYear();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusDays(100);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withEra(0);
        boolean boolean38 = dateTimeZone22.isLocalDateTimeGap(localDateTime37);
        long long40 = dateTimeZone1.getMillisKeepLocal(dateTimeZone22, 1646724010575L);
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime25", (dateTime14.compareTo(dateTime25) == 0) == dateTime14.equals(dateTime25));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime.Property property4 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime6 = localTime2.minusSeconds(15);
        org.joda.time.LocalTime.Property property7 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime9 = property7.setCopy(59);
        org.joda.time.LocalTime localTime11 = property7.addWrapFieldToCopy((-284887110));
        org.joda.time.DateTime dateTime12 = localTime11.toDateTimeToday();
        int int13 = dateTime12.getEra();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        org.joda.time.MutableDateTime mutableDateTime15 = instant14.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        boolean boolean23 = dateTime19.isAfter((long) 4);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(dateTimeZone26);
        long long30 = dateTimeZone26.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '#');
        int int36 = dateTime35.getMonthOfYear();
        org.joda.time.DateTime dateTime38 = dateTime35.plusMinutes(1340);
        int int39 = dateTime38.getMillisOfSecond();
        org.joda.time.DateTime dateTime41 = dateTime38.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime38.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime38.getZone();
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime33.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime31.withZoneRetainFields(dateTimeZone43);
        boolean boolean47 = mutableDateTime15.isAfter((org.joda.time.ReadableInstant) dateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone10);
        long long14 = dateTimeZone10.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(dateTimeZone10);
        int int16 = dateTime3.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime14 = dateTime10.minusSeconds(66514147);
        int int15 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.minus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime23.getZone();
        boolean boolean27 = dateTimeZone26.isFixed();
        java.lang.String str29 = dateTimeZone26.getShortName((long) 99);
        int int31 = dateTimeZone26.getOffset((long) 38);
        org.joda.time.DateTime dateTime32 = dateTime10.toDateTime(dateTimeZone26);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 32769, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology8);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(1340);
        org.joda.time.DateTime.Property property14 = dateTime13.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant5.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 20);
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        long long12 = dateTime10.getMillis();
        int int13 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime20.get(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        int int31 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean32 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime34 = dateTime20.plusWeeks(4);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime36.minusMinutes((int) (short) 100);
        boolean boolean39 = dateTime34.isBefore((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean40 = dateTime34.isEqualNow();
        boolean boolean41 = instant0.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime43 = dateTime34.withYear(2405);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime8", (instant0.compareTo(dateTime8) == 0) == instant0.equals(dateTime8));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        java.lang.String str9 = property8.getAsText();
        int int10 = property8.get();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.LocalDate localDate19 = localDate17.plusWeeks(32770);
        org.joda.time.LocalDate localDate20 = localDate0.withFields((org.joda.time.ReadablePartial) localDate19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = property26.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.Instant instant33 = dateTime31.toInstant();
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        java.lang.String str35 = chronology34.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(chronology1);
        org.joda.time.DurationField durationField7 = chronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        org.joda.time.Instant instant7 = instant1.withMillis((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 213120000);
        org.joda.time.DateTime dateTime11 = instant1.toDateTime();
        org.joda.time.Instant instant13 = instant1.plus((-19819295999560L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime11", (instant1.compareTo(dateTime11) == 0) == instant1.equals(dateTime11));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 8);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant21.withDurationAdded(readableDuration22, 0);
        org.joda.time.Instant instant26 = instant24.minus(128L);
        org.joda.time.Instant instant28 = instant24.minus((-17975955L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Calendar.Builder builder7 = builder5.setLenient(false);
        java.util.Calendar.Builder builder11 = builder7.setDate(26309603, 66720783, 66611409);
        java.util.Calendar.Builder builder16 = builder7.setTimeOfDay(66734049, 292278994, 19, 81075);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        long long26 = dateTimeField24.roundHalfFloor(1646723823994L);
        java.lang.String str28 = dateTimeField24.getAsText((long) 216);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.minuteOfDay();
        boolean boolean34 = durationFieldType30.isSupported(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.millisOfSecond();
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField37 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = chronology32.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = chronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField40 = chronology32.yearOfCentury();
        java.lang.String str41 = dateTimeField40.toString();
        boolean boolean43 = dateTimeField40.isLeap(26891009280000L);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        boolean boolean50 = durationFieldType46.isSupported(chronology48);
        org.joda.time.DateTimeField dateTimeField51 = chronology48.yearOfEra();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = chronology48.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField54 = chronology48.clockhourOfHalfday();
        java.util.Locale locale58 = new java.util.Locale("24", "hi!");
        java.lang.String str59 = dateTimeField54.getAsShortText(5555776727L, locale58);
        org.joda.time.DurationFieldType durationFieldType61 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology63 = localDate62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.minuteOfDay();
        boolean boolean65 = durationFieldType61.isSupported(chronology63);
        org.joda.time.DateTimeField dateTimeField66 = chronology63.yearOfEra();
        org.joda.time.DateTimeField dateTimeField67 = chronology63.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField68 = chronology63.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField69 = chronology63.clockhourOfHalfday();
        java.util.Locale locale73 = new java.util.Locale("24", "hi!");
        java.lang.String str74 = dateTimeField69.getAsShortText(5555776727L, locale73);
        java.lang.String str75 = dateTimeField54.getAsShortText(35, locale73);
        java.lang.String str76 = locale73.getLanguage();
        java.util.Locale locale77 = locale73.stripExtensions();
        java.lang.String str79 = locale73.getExtension('a');
        long long80 = dateTimeField40.set(1646723960289L, "31", locale73);
        java.lang.String str81 = dateTimeField24.getAsText(66700352, locale73);
        java.util.Calendar.Builder builder82 = builder7.setLocale(locale73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime36", (dateTime19.compareTo(dateTime36) == 0) == dateTime19.equals(dateTime36));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int9 = dateTimeZone7.getOffsetFromLocal(1646723759380L);
        java.lang.String str11 = dateTimeZone7.getShortName(1646723851079L);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("2022");
        int int14 = timeZone13.getRawOffset();
        int int16 = timeZone13.getOffset(379209600000L);
        java.time.ZoneId zoneId17 = timeZone13.toZoneId();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("2022");
        int int20 = timeZone19.getRawOffset();
        java.util.TimeZone.setDefault(timeZone19);
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean24 = timeZone19.hasSameRules(timeZone23);
        boolean boolean25 = timeZone13.hasSameRules(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        long long29 = dateTimeZone7.getMillisKeepLocal(dateTimeZone26, 1646722800000L);
        org.joda.time.DateTime dateTime30 = dateTime4.toDateTime(dateTimeZone26);
        org.joda.time.DateTime.Property property31 = dateTime4.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime30", (dateTime4.compareTo(dateTime30) == 0) == dateTime4.equals(dateTime30));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime10 = property6.addToCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime11 = property6.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(chronology14);
        org.joda.time.DateTime dateTime19 = dateTime12.minusSeconds(13);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(549, 1);
        java.lang.String str24 = dateTimeZone22.getName(1646723777197L);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = dateTime19.toDateTime(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime17", (dateTime12.compareTo(dateTime17) == 0) == dateTime12.equals(dateTime17));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.Instant instant6 = instant3.withDurationAdded(358000L, 26462567);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime1", (instant3.compareTo(dateTime1) == 0) == instant3.equals(dateTime1));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.Instant instant8 = dateTime3.toInstant();
        boolean boolean10 = dateTime3.isBefore((long) 1113);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant8", (dateTime3.compareTo(instant8) == 0) == dateTime3.equals(instant8));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        java.util.Locale locale1 = new java.util.Locale("59");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getDisplayScript();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.plus((long) (short) 0);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DateTime dateTime8 = instant6.toDateTime();
        java.util.Locale locale9 = java.util.Locale.US;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        java.lang.String str11 = locale9.getDisplayCountry();
        java.lang.String str12 = locale1.getDisplayScript(locale9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and dateTime8", (instant4.compareTo(dateTime8) == 0) == instant4.equals(dateTime8));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(6);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) 'a');
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        int int18 = dateTime16.getYear();
        org.joda.time.DateTime dateTime19 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean23 = dateTimeZone22.isFixed();
        int int25 = dateTimeZone22.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime26 = dateTime19.withZoneRetainFields(dateTimeZone22);
        long long29 = dateTimeZone22.adjustOffset((long) 999, true);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.Instant instant32 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime33 = instant32.toDateTimeISO();
        org.joda.time.Instant instant36 = instant32.withDurationAdded((long) 12, 80982);
        int int37 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) instant32);
        org.joda.time.DateTime dateTime38 = dateTime9.withZone(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and dateTime33", (instant32.compareTo(dateTime33) == 0) == instant32.equals(dateTime33));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime4.toMutableDateTimeISO();
        boolean boolean10 = mutableDateTime8.isEqual(1646723885836L);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar18 = dateTime15.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.year();
        boolean boolean20 = dateTime15.isSupported(dateTimeFieldType19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.minuteOfDay();
        boolean boolean25 = durationFieldType21.isSupported(chronology23);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.millisOfSecond();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology23);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.minuteOfDay();
        java.lang.String str32 = chronology29.toString();
        org.joda.time.DateTime dateTime33 = dateTime27.withChronology(chronology29);
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType19.getField(chronology29);
        boolean boolean35 = mutableDateTime8.isSupported(dateTimeFieldType19);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType19.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime27", (dateTime13.compareTo(dateTime27) == 0) == dateTime13.equals(dateTime27));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean4 = instant0.isSupported(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = instant0.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant0", (dateTime1.compareTo(instant0) == 0) == dateTime1.equals(instant0));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfMonth();
        org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay(959);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekyear();
        org.joda.time.DurationField durationField10 = chronology7.eras();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology7.era();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime2.toMutableDateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField14 = chronology7.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate9 = localDate6.minusDays((int) '#');
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime2.withChronology(chronology10);
        int int12 = dateTime11.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        org.joda.time.DateTime dateTime10 = property5.setCopy("24");
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime16 = dateTime15.withLaterOffsetAtOverlap();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        java.lang.String str23 = property22.getAsText();
        int int24 = property22.get();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = property22.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate29 = localDate25.plusWeeks((int) (short) 100);
        boolean boolean31 = localDate29.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate33 = localDate29.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean37 = dateTimeZone36.isFixed();
        int int39 = dateTimeZone36.getStandardOffset((long) (-1));
        org.joda.time.Interval interval40 = localDate29.toInterval(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime15.toMutableDateTime(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int45 = dateTimeZone43.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        java.util.Locale locale52 = java.util.Locale.CANADA;
        java.lang.String str53 = locale52.toLanguageTag();
        java.lang.String str54 = locale52.getDisplayVariant();
        java.lang.String str55 = dateTimeField50.getAsText((long) (short) 100, locale52);
        java.util.Set<java.lang.Character> charSet56 = locale52.getExtensionKeys();
        java.lang.String str57 = dateTimeZone43.getShortName((long) 66514147, locale52);
        java.util.Calendar calendar58 = dateTime15.toCalendar(locale52);
        long long59 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property60 = dateTime15.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime41", (dateTime4.compareTo(mutableDateTime41) == 0) == dateTime4.equals(mutableDateTime41));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime4, dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays(100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(0);
        boolean boolean26 = dateTimeZone10.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusMinutes(52);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundFloorCopy();
        boolean boolean31 = property29.isLeap();
        org.joda.time.LocalDateTime localDateTime32 = property29.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(292278993);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMinutes(67);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.minus(1646723815209L);
        int int13 = dateTime3.compareTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant15 = instant12.plus(435L);
        org.joda.time.DateTime dateTime16 = instant12.toDateTime();
        org.joda.time.Instant instant18 = instant12.minus((long) 66587392);
        org.joda.time.MutableDateTime mutableDateTime19 = instant18.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime20 = instant18.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime16", (instant12.compareTo(dateTime16) == 0) == instant12.equals(dateTime16));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        int int18 = dateTime16.getHourOfDay();
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property19.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime22 = property19.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = dateTime22.minusSeconds((-51));
        org.joda.time.LocalDate localDate25 = dateTime24.toLocalDate();
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime32 = dateTime28.withMinuteOfHour(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType33.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType33.getDurationType();
        org.joda.time.DateTime.Property property37 = dateTime32.property(dateTimeFieldType33);
        org.joda.time.DateTime.Property property38 = dateTime24.property(dateTimeFieldType33);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.era();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.LocalDateTime localDateTime46 = property44.addToCopy((long) 26162278);
        org.joda.time.LocalDateTime localDateTime47 = property44.withMaximumValue();
        org.joda.time.Chronology chronology48 = localDateTime47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        org.joda.time.DurationField durationField50 = chronology48.years();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.centuryOfEra();
        org.joda.time.DurationField durationField52 = chronology48.minutes();
        boolean boolean53 = dateTimeFieldType33.isSupported(chronology48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField11 and durationField50", (durationField11.compareTo(durationField50) == 0) == durationField11.equals(durationField50));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime3.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(23);
        boolean boolean9 = dateTimeZone7.isStandardOffset((long) 0);
        boolean boolean10 = dateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 5995227979L, dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime11", (dateTime3.compareTo(dateTime11) == 0) == dateTime3.equals(dateTime11));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime4.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMillis(100);
        int int15 = localDateTime12.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withYear((-1));
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime.Property property19 = localDateTime12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = localDateTime12.getField((int) (byte) 1);
        int int22 = mutableDateTime4.get(dateTimeField21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime5", (instant0.compareTo(mutableDateTime5) == 0) == instant0.equals(mutableDateTime5));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DurationField durationField9 = chronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = chronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField13 = chronology1.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField12", Math.signum(durationField9.compareTo(durationField12)) == -Math.signum(durationField12.compareTo(durationField9)));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.DateMidnight dateMidnight19 = localDate14.toDateMidnight();
        int int20 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate14.withYearOfEra(32769);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = localDate23.getDayOfWeek();
        int int26 = localDate23.getWeekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate29 = localDate23.withPeriodAdded(readablePeriod27, 40319999);
        org.joda.time.LocalDate localDate30 = localDate22.withFields((org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate.Property property31 = localDate22.era();
        org.joda.time.LocalDate localDate32 = property31.getLocalDate();
        org.joda.time.Interval interval33 = localDate32.toInterval();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology35 = localDate34.getChronology();
        int int36 = localDate34.getDayOfWeek();
        int int37 = localDate34.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str39 = dateTimeFieldType38.toString();
        int int40 = localDate34.get(dateTimeFieldType38);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType38.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        boolean boolean46 = durationFieldType42.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.yearOfEra();
        org.joda.time.DateTimeField dateTimeField48 = chronology44.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology44.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = chronology44.yearOfEra();
        org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.now(chronology44);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology44);
        boolean boolean53 = durationFieldType41.isSupported(chronology44);
        org.joda.time.LocalDate localDate55 = localDate32.withFieldAdded(durationFieldType41, 2021);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime52", (dateTime2.compareTo(dateTime52) == 0) == dateTime2.equals(dateTime52));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime18 = dateTime3.withDayOfWeek(7);
        org.joda.time.DateTime dateTime20 = dateTime3.withCenturyOfEra(14);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime3.plus(readableDuration21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime22.toMutableDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.dayOfWeek();
        boolean boolean29 = dateTimeField27.isLeap(1646205544700L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime26", (dateTime3.compareTo(mutableDateTime26) == 0) == dateTime3.equals(mutableDateTime26));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 40319999);
        org.joda.time.DateTime dateTime2 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime4 = dateTime1.withYear(15);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.weekyear();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology6.add(readablePeriod11, 1646731065140L, 0);
        org.joda.time.DateTime dateTime15 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField16 = chronology6.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime15", (dateTime1.compareTo(dateTime15) == 0) == dateTime1.equals(dateTime15));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        boolean boolean11 = localDate9.isSupported(durationFieldType10);
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = localDate13.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate13.minusMonths(32770);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra((int) ' ');
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        java.lang.String str33 = property32.getAsText();
        org.joda.time.DurationField durationField34 = property32.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
        java.lang.String str36 = dateTimeFieldType35.toString();
        boolean boolean37 = dateTime26.isSupported(dateTimeFieldType35);
        org.joda.time.LocalDate.Property property38 = localDate13.property(dateTimeFieldType35);
        org.joda.time.DateTimeField dateTimeField39 = property38.getField();
        java.util.Locale locale44 = new java.util.Locale("hi!", "", "");
        java.lang.String str45 = locale44.getDisplayScript();
        java.util.Locale locale49 = new java.util.Locale("hi!", "", "");
        java.lang.String str50 = locale44.getDisplayScript(locale49);
        java.lang.String str51 = dateTimeField39.getAsText((int) (byte) -1, locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = dateTimeField39.getType();
        int int53 = localDate9.indexOf(dateTimeFieldType52);
        int int54 = localDate9.getDayOfWeek();
        org.joda.time.Instant instant55 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime56 = instant55.toDateTimeISO();
        org.joda.time.Instant instant57 = instant55.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean59 = instant55.isSupported(dateTimeFieldType58);
        boolean boolean60 = localDate9.equals((java.lang.Object) boolean59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant55", (dateTime20.compareTo(instant55) == 0) == dateTime20.equals(instant55));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Instant instant9 = instant1.withDurationAdded((long) 12, 23);
        org.joda.time.Instant instant12 = instant1.withDurationAdded((long) 26309603, 14);
        org.joda.time.Instant instant13 = instant1.toInstant();
        org.joda.time.Instant instant15 = instant13.minus((-1260954909386519L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and mutableDateTime2", (instant13.compareTo(mutableDateTime2) == 0) == instant13.equals(mutableDateTime2));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime12 = dateTime8.withDurationAdded(66571079L, 0);
        java.util.GregorianCalendar gregorianCalendar13 = dateTime8.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime8", (instant9.compareTo(dateTime8) == 0) == instant9.equals(dateTime8));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        java.lang.String str14 = property13.getAsText();
        int int15 = property13.get();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = property13.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate19.minusYears(10);
        int[] intArray24 = localDate19.getValues();
        chronology1.validate((org.joda.time.ReadablePartial) localDate16, intArray24);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        int int32 = dateTime30.getYear();
        org.joda.time.DateTime dateTime33 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        boolean boolean36 = localDate34.isSupported(durationFieldType35);
        int int37 = localDate34.size();
        org.joda.time.DateTime dateTime38 = dateTime33.withFields((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTime dateTime39 = localDate16.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfDay();
        boolean boolean44 = durationFieldType40.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology42.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime38.toMutableDateTime(chronology42);
        org.joda.time.DateTime dateTime51 = dateTime38.minusSeconds(26315140);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime49", (dateTime10.compareTo(mutableDateTime49) == 0) == dateTime10.equals(mutableDateTime49));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime8 = dateTime2.withMillisOfDay(2024);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        boolean boolean9 = dateTime4.isSupported(dateTimeFieldType8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        boolean boolean14 = durationFieldType10.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfSecond();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology12);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        java.lang.String str21 = chronology18.toString();
        org.joda.time.DateTime dateTime22 = dateTime16.withChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType8.getField(chronology18);
        org.joda.time.DurationField durationField24 = chronology18.hours();
        long long27 = durationField24.getDifferenceAsLong(649258L, 150914903735000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Calendar.Builder builder10 = builder3.setTimeOfDay(20, 66514147, 600032, 24);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        boolean boolean15 = durationFieldType11.isSupported(chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = chronology13.clockhourOfHalfday();
        java.util.Locale locale23 = new java.util.Locale("24", "hi!");
        java.lang.String str24 = dateTimeField19.getAsShortText(5555776727L, locale23);
        java.util.Calendar.Builder builder25 = builder10.setLocale(locale23);
        java.util.Calendar.Builder builder29 = builder10.setWeekDate(29, 213120000, 572);
        java.util.Calendar.Builder builder33 = builder10.setTimeOfDay(2652, 26182169, (int) 'x');
        org.joda.time.Instant instant35 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime36 = instant35.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTime36.getZone();
        java.util.Calendar.Builder builder39 = new java.util.Calendar.Builder();
        java.util.Calendar calendar40 = builder39.build();
        java.util.Calendar.Builder builder42 = builder39.setLenient(false);
        java.util.Calendar.Builder builder46 = builder42.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder51 = builder46.setTimeOfDay(16, 23, 32769, 0);
        java.util.Calendar.Builder builder55 = builder51.setWeekDate(66512921, 40319999, 455544);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.minuteOfDay();
        java.util.Locale locale62 = new java.util.Locale("hi!", "", "");
        int int63 = dateTimeField58.getMaximumShortTextLength(locale62);
        long long66 = dateTimeField58.add(1646723755047L, 23);
        java.util.Locale locale68 = java.util.Locale.CHINA;
        boolean boolean69 = locale68.hasExtensions();
        java.lang.String str70 = dateTimeField58.getAsShortText(22, locale68);
        java.util.Locale locale72 = java.util.Locale.CHINA;
        java.util.Locale locale73 = java.util.Locale.ROOT;
        java.lang.String str74 = locale73.getISO3Country();
        java.util.Locale locale75 = java.util.Locale.CANADA;
        java.lang.String str76 = locale75.toLanguageTag();
        java.lang.String str77 = locale75.getDisplayVariant();
        java.lang.String str78 = locale73.getDisplayName(locale75);
        boolean boolean79 = locale75.hasExtensions();
        java.lang.String str80 = locale72.getDisplayScript(locale75);
        java.lang.String str81 = dateTimeField58.getAsShortText((long) 26162278, locale75);
        java.util.Set<java.lang.String> strSet82 = locale75.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder83 = builder55.setLocale(locale75);
        java.lang.String str84 = locale75.getCountry();
        java.lang.String str85 = dateTimeZone37.getName(0L, locale75);
        java.util.Calendar.Builder builder86 = builder33.setLocale(locale75);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and dateTime36", (instant35.compareTo(dateTime36) == 0) == instant35.equals(dateTime36));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime2.era();
        org.joda.time.DateTime dateTime6 = property5.getDateTime();
        org.joda.time.DateTime dateTime7 = property5.getDateTime();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime7.toDateTime(chronology9);
        org.joda.time.DurationField durationField17 = chronology9.halfdays();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime16", (dateTime2.compareTo(dateTime16) == 0) == dateTime2.equals(dateTime16));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime9 = property5.addWrapFieldToCopy(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType10.getDurationType();
        org.joda.time.DateTime dateTime15 = dateTime9.withFieldAdded(durationFieldType13, 40319);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        org.joda.time.DurationField durationField21 = chronology17.days();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology17.add(readablePeriod22, 1646723777197L, 19059);
        org.joda.time.Chronology chronology26 = chronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.yearOfEra();
        org.joda.time.DurationField durationField30 = chronology26.years();
        boolean boolean31 = durationFieldType13.isSupported(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField7 and durationField30", (durationField7.compareTo(durationField30) == 0) == durationField7.equals(durationField30));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtMidnight();
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = property5.setCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property5.getFieldType();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.LocalDate localDate22 = localDate19.minusDays((int) '#');
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType16.getField(chronology23);
        int int26 = dateTimeField24.get(0L);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        java.lang.String str33 = property32.getAsText();
        int int34 = property32.get();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        int int37 = property32.compareTo((org.joda.time.ReadablePartial) localDate35);
        int[] intArray38 = localDate35.getValues();
        org.joda.time.LocalDate localDate40 = localDate35.minusMonths(40319999);
        org.joda.time.LocalDate.Property property41 = localDate40.dayOfYear();
        java.util.Locale locale46 = new java.util.Locale("2022-02-22T07:18:31.110+00:00:00.435", "hi!", "");
        java.lang.String str47 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localDate40, 26175799, locale46);
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale46);
        java.lang.String str49 = locale46.getDisplayName();
        java.lang.Object obj50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj50, dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withYear(7);
        java.util.Date date55 = dateTime52.toDate();
        org.joda.time.Instant instant56 = dateTime52.toInstant();
        boolean boolean57 = locale46.equals((java.lang.Object) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant56", (dateTime2.compareTo(instant56) == 0) == dateTime2.equals(instant56));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime17 = dateTime6.toDateTime(dateTimeZone16);
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Calendar calendar20 = builder19.build();
        java.util.Calendar.Builder builder25 = builder19.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("2022");
        timeZone27.setID("French");
        java.util.Calendar.Builder builder30 = builder25.setTimeZone(timeZone27);
        java.util.Calendar.Builder builder34 = builder25.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale39 = new java.util.Locale("24", "hi!");
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.util.Calendar.Builder builder41 = builder25.setLocale(locale39);
        java.lang.String str42 = dateTimeZone16.getShortName(1645514264031L, locale39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        java.lang.String str45 = dateTimeZone16.getName((long) 223);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DurationField durationField4 = chronology2.weeks();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(chronology2);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(1646723796784L, chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology2.getZone();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate10.minusYears(10);
        int[] intArray15 = localDate10.getValues();
        org.joda.time.LocalDate.Property property16 = localDate10.era();
        org.joda.time.LocalDate localDate17 = property16.roundCeilingCopy();
        org.joda.time.LocalDate localDate19 = property16.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate20 = property16.roundFloorCopy();
        int int21 = localDate20.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property22 = localDate20.dayOfWeek();
        int int23 = localDate20.getDayOfWeek();
        long long25 = chronology2.set((org.joda.time.ReadablePartial) localDate20, 66556989000L);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '#');
        int int28 = dateTime27.getMonthOfYear();
        org.joda.time.DateTime dateTime30 = dateTime27.plusMinutes(1340);
        int int31 = dateTime30.getMillisOfSecond();
        org.joda.time.DateTime dateTime33 = dateTime30.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime30.toMutableDateTimeISO();
        boolean boolean36 = mutableDateTime34.isEqual(1646723885836L);
        java.lang.Object obj37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj37, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime43 = dateTime41.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar44 = dateTime41.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.year();
        boolean boolean46 = dateTime41.isSupported(dateTimeFieldType45);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.minuteOfDay();
        boolean boolean51 = durationFieldType47.isSupported(chronology49);
        org.joda.time.DateTimeField dateTimeField52 = chronology49.millisOfSecond();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology49);
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.minuteOfDay();
        java.lang.String str58 = chronology55.toString();
        org.joda.time.DateTime dateTime59 = dateTime53.withChronology(chronology55);
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType45.getField(chronology55);
        boolean boolean61 = mutableDateTime34.isSupported(dateTimeFieldType45);
        int int62 = localDate20.indexOf(dateTimeFieldType45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and dateTime53", (dateTime39.compareTo(dateTime53) == 0) == dateTime39.equals(dateTime53));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.year();
        org.joda.time.DurationField durationField11 = chronology7.days();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        long long15 = chronology7.add(readablePeriod12, 1646723777197L, 19059);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((-1893235578000L), chronology7);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1893235578000L));
        boolean boolean18 = languageRange1.equals((java.lang.Object) (-1893235578000L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime17", (dateTime16.compareTo(dateTime17) == 0) == dateTime16.equals(dateTime17));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        int int10 = dateTime8.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        org.joda.time.Chronology chronology8 = instant1.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime2.era();
        org.joda.time.DateTime dateTime6 = property5.getDateTime();
        org.joda.time.DateTime dateTime7 = property5.getDateTime();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime7.toDateTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(17, 16);
        long long21 = dateTimeZone19.previousTransition(5555771676L);
        org.joda.time.DateTime dateTime22 = dateTime16.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime16.plusHours(8525680);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        org.joda.time.DateTime dateTime16 = dateTime4.withChronology(chronology12);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfEra();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 32769, chronology20);
        org.joda.time.DateTimeZone dateTimeZone23 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.year();
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(chronology20);
        org.joda.time.LocalDate localDate27 = localDate25.withWeekyear(1);
        org.joda.time.DateTime dateTime28 = localDate27.toDateTimeAtMidnight();
        int int29 = property17.getDifference((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = chronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology1.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.dayOfYear();
        org.joda.time.DurationField durationField7 = chronology1.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        int int4 = calendar0.getWeekYear();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekOfWeekyear();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = property12.getAsShortText(locale13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone5, locale13);
        calendar15.setFirstDayOfWeek(0);
        java.util.Date date18 = calendar15.getTime();
        date18.setMinutes(26461576);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar15", (calendar0.compareTo(calendar15) == 0) == calendar0.equals(calendar15));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        org.joda.time.LocalTime localTime7 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property5.addCopy((long) 1340);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime12 = localTime9.minusHours(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        int int20 = dateTime19.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int22 = dateTime19.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = dateTime19.getChronology();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime25 = dateTime19.plus(readableDuration24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime28 = dateTime19.withPeriodAdded(readablePeriod26, 2022);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone30);
        org.joda.time.LocalTime localTime33 = localTime31.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime31.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTime35.getZone();
        org.joda.time.DateTime dateTime37 = dateTime35.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone39);
        org.joda.time.LocalTime localTime42 = localTime40.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = localTime40.toDateTimeToday(dateTimeZone43);
        boolean boolean46 = dateTime44.isAfter((long) 2);
        org.joda.time.DateTime dateTime48 = dateTime44.minusDays(1);
        org.joda.time.DateTime dateTime50 = dateTime44.minusHours((-1));
        java.lang.String str51 = dateTime44.toString();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone53);
        org.joda.time.LocalTime localTime56 = localTime54.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = localTime54.toDateTimeToday(dateTimeZone57);
        int int59 = dateTime58.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int61 = dateTime58.get(dateTimeFieldType60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone63);
        org.joda.time.LocalTime localTime66 = localTime64.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = localTime64.toDateTimeToday(dateTimeZone67);
        int int69 = dateTime58.compareTo((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean70 = dateTime44.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime44.toMutableDateTimeISO();
        boolean boolean73 = dateTime44.isBefore((-5679974778000L));
        org.joda.time.Chronology chronology74 = dateTime44.getChronology();
        org.joda.time.DateTime dateTime75 = dateTime37.withChronology(chronology74);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long82 = dateTimeZone78.convertLocalToUTC((long) 28, true, 1017118800002L);
        org.joda.time.Chronology chronology83 = chronology74.withZone(dateTimeZone78);
        org.joda.time.DateTime dateTime84 = dateTime28.toDateTime(dateTimeZone78);
        org.joda.time.DateTime dateTime85 = localTime12.toDateTimeToday(dateTimeZone78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime84", (dateTime19.compareTo(dateTime84) == 0) == dateTime19.equals(dateTime84));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (-457079));
        int int2 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        int int5 = localDate3.getDayOfWeek();
        org.joda.time.LocalDate localDate7 = localDate3.minusYears(10);
        int[] intArray8 = localDate3.getValues();
        org.joda.time.LocalDate.Property property9 = localDate3.era();
        org.joda.time.LocalDate localDate11 = localDate3.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDate localDate13 = localDate3.plus(readablePeriod12);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        int int20 = dateTime18.getYear();
        org.joda.time.DateTime dateTime21 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        boolean boolean24 = localDate22.isSupported(durationFieldType23);
        int int25 = localDate22.size();
        org.joda.time.DateTime dateTime26 = dateTime21.withFields((org.joda.time.ReadablePartial) localDate22);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        java.lang.String str33 = property32.getAsText();
        org.joda.time.DurationField durationField34 = property32.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
        java.lang.String str36 = dateTimeFieldType35.toString();
        boolean boolean37 = dateTime21.isSupported(dateTimeFieldType35);
        java.lang.String str38 = dateTimeFieldType35.getName();
        java.lang.String str39 = dateTimeFieldType35.getName();
        boolean boolean40 = localDate3.isSupported(dateTimeFieldType35);
        org.joda.time.LocalDate.Property property41 = localDate1.property(dateTimeFieldType35);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.minuteOfDay();
        boolean boolean47 = durationFieldType43.isSupported(chronology45);
        org.joda.time.DateTimeField dateTimeField48 = chronology45.millisOfSecond();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology45);
        org.joda.time.DateTimeField dateTimeField50 = chronology45.yearOfCentury();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 572, chronology45);
        org.joda.time.DateTimeField dateTimeField52 = chronology45.hourOfDay();
        org.joda.time.DateTimeField dateTimeField53 = dateTimeFieldType35.getField(chronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime49", (dateTime16.compareTo(dateTime49) == 0) == dateTime16.equals(dateTime49));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(4);
        org.joda.time.DateTime.Property property13 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime14 = property13.withMaximumValue();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime21 = property20.roundCeilingCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra((int) ' ');
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate localDate29 = localDate25.minusYears(10);
        int[] intArray30 = localDate25.getValues();
        org.joda.time.LocalDate.Property property31 = localDate25.era();
        org.joda.time.LocalDate.Property property32 = localDate25.dayOfYear();
        org.joda.time.DateTime dateTime33 = dateTime23.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readableDuration34);
        org.joda.time.DateTime dateTime37 = dateTime33.minusDays(28);
        org.joda.time.DateTime dateTime39 = dateTime33.minusSeconds(32768);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime33.plus(readablePeriod40);
        boolean boolean42 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj47, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property52 = dateTime51.weekyear();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DurationField durationField54 = property52.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property52.getFieldType();
        int int56 = dateTime46.get(dateTimeFieldType55);
        org.joda.time.DateTime dateTime58 = dateTime46.plusMonths((int) (short) -1);
        org.joda.time.Instant instant59 = dateTime46.toInstant();
        boolean boolean60 = dateTime14.isBefore((org.joda.time.ReadableInstant) instant59);
        org.joda.time.DateTime dateTime62 = dateTime14.plusMillis(805);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant59", (dateTime46.compareTo(instant59) == 0) == dateTime46.equals(instant59));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((-1260954909386381L));
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant10 = instant6.plus(readableDuration9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime18 = property16.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime18.hourOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.withTimeAtStartOfDay();
        int int23 = instant10.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.Instant instant25 = instant10.plus(1646724103578L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime13", (instant10.compareTo(dateTime13) == 0) == instant10.equals(dateTime13));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        boolean boolean8 = property7.isLeap();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("2022");
        int int11 = timeZone10.getRawOffset();
        timeZone10.setRawOffset(0);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        java.lang.String str15 = timeZone10.getID();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        long long23 = chronology17.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.minuteOfHour();
        org.joda.time.DurationField durationField25 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfHalfday();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.lang.String str30 = dateTimeField26.getAsShortText((int) (byte) 10, locale28);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone10, locale28);
        java.lang.String str32 = property7.getAsText(locale28);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale28);
        java.util.Calendar calendar34 = java.util.Calendar.getInstance(locale28);
        java.lang.String str35 = locale28.getDisplayLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar33", (calendar14.compareTo(calendar33) == 0) == calendar14.equals(calendar33));
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime8.toMutableDateTime(dateTimeZone11);
        int int15 = dateTime8.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime8.withPeriodAdded(readablePeriod16, (-27445));
        org.joda.time.DateTime.Property property19 = dateTime8.monthOfYear();
        int int20 = dateTime8.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and dateTime8", (mutableDateTime14.compareTo(dateTime8) == 0) == mutableDateTime14.equals(dateTime8));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime2.era();
        org.joda.time.DateTime dateTime6 = property5.getDateTime();
        org.joda.time.DateTime dateTime7 = property5.getDateTime();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime7.toDateTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(17, 16);
        long long21 = dateTimeZone19.previousTransition(5555771676L);
        org.joda.time.DateTime dateTime22 = dateTime16.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime24 = dateTime16.minusWeeks(387);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant4 = dateTime3.toInstant();
        org.joda.time.Instant instant7 = instant4.withDurationAdded(1646723948714L, 32772);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant4.plus(readableDuration8);
        org.joda.time.DateTime dateTime10 = instant4.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant4", (dateTime3.compareTo(instant4) == 0) == dateTime3.equals(instant4));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        java.lang.String str9 = property8.getAsText();
        int int10 = property8.get();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.LocalDate localDate19 = localDate17.plusWeeks(32770);
        org.joda.time.LocalDate localDate20 = localDate0.withFields((org.joda.time.ReadablePartial) localDate19);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        org.joda.time.DateTime dateTime28 = property26.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.minus(readablePeriod29);
        org.joda.time.DateTime dateTime31 = localDate20.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        java.util.Date date32 = dateTime31.toDate();
        org.joda.time.Instant instant33 = dateTime31.toInstant();
        org.joda.time.Instant instant35 = instant33.withMillis((long) 66514657);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant38 = instant35.withDurationAdded(readableDuration36, 7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and instant33", (dateTime31.compareTo(instant33) == 0) == dateTime31.equals(instant33));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 66514657);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.years();
        long long9 = durationField7.getMillis((int) 'x');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField6 = dateTimeField5.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField6, and durationField4", !(durationField4.compareTo(durationField6) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField6.compareTo(durationField4))));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.year();
        org.joda.time.DurationField durationField12 = chronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology2.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField10", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField10)) == Math.signum(durationField9.compareTo(durationField10))));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        int int8 = calendar6.getGreatestMinimum(11);
        calendar6.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("2022");
        int int18 = timeZone17.getRawOffset();
        calendar6.setTimeZone(timeZone17);
        boolean boolean20 = timeZone1.hasSameRules(timeZone17);
        java.time.ZoneId zoneId21 = timeZone1.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        timeZone22.setID("52");
        boolean boolean25 = timeZone22.observesDaylightTime();
        java.util.Locale locale29 = new java.util.Locale("hi!", "", "");
        java.lang.String str30 = locale29.getDisplayScript();
        java.util.Locale locale34 = new java.util.Locale("hi!", "", "");
        java.lang.String str35 = locale29.getDisplayScript(locale34);
        java.lang.String str36 = locale29.getDisplayName();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone22, locale29);
        java.util.TimeZone.setDefault(timeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar37", (calendar5.compareTo(calendar37) == 0) == calendar5.equals(calendar37));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        int int8 = calendar6.getGreatestMinimum(11);
        calendar6.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("2022");
        int int18 = timeZone17.getRawOffset();
        calendar6.setTimeZone(timeZone17);
        boolean boolean20 = timeZone1.hasSameRules(timeZone17);
        java.time.ZoneId zoneId21 = timeZone1.toZoneId();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone(zoneId21);
        int int23 = timeZone22.getRawOffset();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone27 = dateTimeZone26.toTimeZone();
        int int29 = timeZone27.getOffset(0L);
        boolean boolean30 = timeZone22.hasSameRules(timeZone27);
        timeZone22.setRawOffset(70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar24", (calendar5.compareTo(calendar24) == 0) == calendar5.equals(calendar24));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.toDateTime(chronology29);
        java.util.Date date31 = dateTime30.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        org.joda.time.LocalDate localDate28 = localDate26.plusMonths(9);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long35 = dateTimeZone31.convertLocalToUTC((long) 28, true, 1017118800002L);
        java.lang.String str37 = dateTimeZone31.getNameKey(1646723818150L);
        boolean boolean39 = dateTimeZone31.isStandardOffset((long) 23);
        org.joda.time.DateTime dateTime40 = localDate26.toDateTimeAtMidnight(dateTimeZone31);
        java.util.Calendar.Builder builder41 = new java.util.Calendar.Builder();
        java.util.Calendar calendar42 = builder41.build();
        java.util.Calendar.Builder builder44 = builder41.setLenient(false);
        java.util.Calendar.Builder builder48 = builder44.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder52 = builder44.setTimeOfDay(0, 33, 66534);
        java.util.TimeZone timeZone54 = java.util.TimeZone.getTimeZone("2022");
        java.util.Calendar.Builder builder55 = builder44.setTimeZone(timeZone54);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime40.toMutableDateTime(dateTimeZone56);
        int int59 = dateTimeZone56.getOffsetFromLocal(39943117323144000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and mutableDateTime57", (dateTime40.compareTo(mutableDateTime57) == 0) == dateTime40.equals(mutableDateTime57));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '4');
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = dateTime7.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime27 = dateTime7.plusMillis(1970);
        org.joda.time.DateTime dateTime29 = dateTime7.minusMonths(19059);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime22", (dateTime7.compareTo(dateTime22) == 0) == dateTime7.equals(dateTime22));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime4, dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays(100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(0);
        boolean boolean26 = dateTimeZone10.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusMinutes(52);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusSeconds(194);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withDurationAdded(readableDuration31, 69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime17 = dateTime6.toDateTime(dateTimeZone16);
        java.util.Calendar.Builder builder19 = new java.util.Calendar.Builder();
        java.util.Calendar calendar20 = builder19.build();
        java.util.Calendar.Builder builder25 = builder19.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone27 = java.util.TimeZone.getTimeZone("2022");
        timeZone27.setID("French");
        java.util.Calendar.Builder builder30 = builder25.setTimeZone(timeZone27);
        java.util.Calendar.Builder builder34 = builder25.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale35 = java.util.Locale.CHINA;
        boolean boolean36 = locale35.hasExtensions();
        java.util.Locale locale39 = new java.util.Locale("24", "hi!");
        java.lang.String str40 = locale35.getDisplayLanguage(locale39);
        java.util.Calendar.Builder builder41 = builder25.setLocale(locale39);
        java.lang.String str42 = dateTimeZone16.getShortName(1645514264031L, locale39);
        java.lang.String str43 = dateTimeZone16.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale9.getISO3Country();
        java.lang.String str11 = dateTimeZone7.getName((long) 'u', locale9);
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        int int18 = dateTime16.getYear();
        org.joda.time.DateTime dateTime19 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property20 = dateTime19.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime23.toDateTimeToday(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime27.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long33 = dateTimeZone28.getMillisKeepLocal(dateTimeZone31, (long) '4');
        org.joda.time.DateTime dateTime34 = dateTime19.toDateTime(dateTimeZone31);
        int int35 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime34);
        long long37 = dateTimeZone7.previousTransition((long) 11);
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime34", (dateTime16.compareTo(dateTime34) == 0) == dateTime16.equals(dateTime34));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        java.lang.Object obj0 = null;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        java.lang.String str7 = property6.getAsText();
        int int8 = property6.get();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        int int11 = property6.compareTo((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate13 = localDate9.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate13.plus(readablePeriod14);
        org.joda.time.LocalDate localDate17 = localDate15.plusWeeks(32770);
        org.joda.time.LocalDate localDate19 = localDate17.minusYears(671);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj0, chronology20);
        java.lang.String str23 = chronology20.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime22", (dateTime3.compareTo(dateTime22) == 0) == dateTime3.equals(dateTime22));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        int int8 = dateTime7.getWeekyear();
        org.joda.time.DateTime dateTime9 = dateTime7.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(4);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime9.getZone();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1646722800000L, dateTimeZone12);
        org.joda.time.Instant instant14 = dateTime13.toInstant();
        org.joda.time.Instant instant15 = instant14.toInstant();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.plus(readableDuration16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant17", (dateTime13.compareTo(instant17) == 0) == dateTime13.equals(instant17));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.plusMonths((int) (short) -1);
        org.joda.time.Instant instant16 = dateTime3.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.plus(readableDuration17);
        org.joda.time.Instant instant20 = instant18.minus((long) 600032);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant18", (dateTime3.compareTo(instant18) == 0) == dateTime3.equals(instant18));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime4, dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusDays(100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(0);
        boolean boolean26 = dateTimeZone10.isLocalDateTimeGap(localDateTime25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusMinutes(52);
        org.joda.time.LocalDateTime.Property property29 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.plusMinutes(26175799);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime25.withFields((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.weekyear();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        int int38 = localDate36.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate36.minusYears(10);
        int[] intArray41 = localDate36.getValues();
        org.joda.time.LocalDate.Property property42 = localDate36.era();
        org.joda.time.Chronology chronology43 = localDate36.getChronology();
        int int44 = localDate36.getYearOfCentury();
        org.joda.time.LocalDate.Property property45 = localDate36.monthOfYear();
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.seconds();
        boolean boolean47 = localDate36.isSupported(durationFieldType46);
        org.joda.time.LocalDate.Property property48 = localDate36.dayOfYear();
        org.joda.time.LocalDate localDate50 = localDate36.plusDays(671);
        org.joda.time.Chronology chronology51 = localDate50.getChronology();
        org.joda.time.DurationField durationField52 = chronology51.centuries();
        org.joda.time.DurationFieldType durationFieldType53 = durationField52.getType();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime33.withFieldAdded(durationFieldType53, 967);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis((long) 292278993);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        long long8 = instant7.getMillis();
        org.joda.time.Instant instant10 = instant7.withMillis((-831003259745486522L));
        org.joda.time.Instant instant12 = instant10.withMillis(0L);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant10.plus(readableDuration13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean7 = dateTimeZone6.isFixed();
        int int9 = dateTimeZone6.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime10 = localDate3.toDateTimeAtCurrentTime(dateTimeZone6);
        long long14 = dateTimeZone6.convertLocalToUTC((long) (short) 0, false, (long) 8);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 26545045, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property25 = dateTime24.weekyear();
        java.lang.String str26 = property25.getAsText();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property25.getFieldType();
        int int29 = dateTime19.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime31 = dateTime19.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime32 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property33 = dateTime32.monthOfYear();
        int int34 = dateTime32.getHourOfDay();
        org.joda.time.DateTime.Property property35 = dateTime32.centuryOfEra();
        org.joda.time.DateTime dateTime37 = property35.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime38 = property35.roundCeilingCopy();
        org.joda.time.DateTime dateTime40 = property35.setCopy((int) (short) 0);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj41, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property46 = dateTime45.weekyear();
        org.joda.time.DateTime dateTime47 = property46.roundCeilingCopy();
        org.joda.time.DateTime dateTime49 = dateTime47.withCenturyOfEra((int) ' ');
        boolean boolean50 = dateTime49.isBeforeNow();
        boolean boolean51 = dateTime40.isEqual((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        int int54 = localDate52.getDayOfWeek();
        org.joda.time.LocalDate localDate56 = localDate52.minusYears(10);
        int[] intArray57 = localDate52.getValues();
        org.joda.time.LocalDate.Property property58 = localDate52.era();
        org.joda.time.LocalDate.Property property59 = localDate52.dayOfYear();
        org.joda.time.LocalDate localDate61 = property59.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate62 = property59.withMinimumValue();
        int int63 = localDate62.getYearOfCentury();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.yearOfCentury();
        org.joda.time.DurationField durationField68 = chronology66.weeks();
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(chronology66);
        org.joda.time.LocalDate localDate70 = org.joda.time.LocalDate.now(chronology66);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime73 = localDate70.toDateTimeAtStartOfDay(dateTimeZone72);
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate(1646723868410L, dateTimeZone72);
        org.joda.time.Interval interval75 = localDate62.toInterval(dateTimeZone72);
        org.joda.time.MutableDateTime mutableDateTime76 = dateTime40.toMutableDateTime(dateTimeZone72);
        org.joda.time.DateTime dateTime77 = dateTime15.withZoneRetainFields(dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and mutableDateTime76", (dateTime40.compareTo(mutableDateTime76) == 0) == dateTime40.equals(mutableDateTime76));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone10);
        long long14 = dateTimeZone10.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        int int20 = dateTime19.getMonthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMinutes(1340);
        int int23 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime22.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime22.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime22.getZone();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime15.withZoneRetainFields(dateTimeZone27);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(dateTimeZone27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        boolean boolean10 = durationFieldType6.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        int int13 = instant1.get(dateTimeField12);
        int int15 = dateTimeField12.get(60144394838400000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime14 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((-27445));
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime19 = localTime17.minusMillis(0);
        org.joda.time.LocalTime localTime21 = localTime17.withMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime23", (dateTime14.compareTo(dateTime23) == 0) == dateTime14.equals(dateTime23));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate9 = localDate6.minusDays((int) '#');
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTime dateTime11 = dateTime2.withChronology(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant3", (dateTime2.compareTo(instant3) == 0) == dateTime2.equals(instant3));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.Instant instant5 = instant1.toInstant();
        org.joda.time.Instant instant7 = instant5.minus(14L);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        long long14 = dateTime12.getMillis();
        int int15 = dateTime12.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        int int23 = dateTime22.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int25 = dateTime22.get(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone27);
        org.joda.time.LocalTime localTime30 = localTime28.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        int int33 = dateTime22.compareTo((org.joda.time.ReadableInstant) dateTime32);
        boolean boolean34 = dateTime12.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime36 = dateTime22.plusWeeks(4);
        org.joda.time.DateTime.Property property37 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime39 = dateTime22.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj44, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property49 = dateTime48.weekyear();
        java.lang.String str50 = property49.getAsText();
        org.joda.time.DurationField durationField51 = property49.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        int int53 = dateTime43.get(dateTimeFieldType52);
        org.joda.time.DateTime.Property property54 = dateTime39.property(dateTimeFieldType52);
        org.joda.time.DateTime dateTime55 = dateTime39.withEarlierOffsetAtOverlap();
        java.util.GregorianCalendar gregorianCalendar56 = dateTime55.toGregorianCalendar();
        org.joda.time.DateTime.Property property57 = dateTime55.centuryOfEra();
        org.joda.time.DateTime dateTime59 = property57.addToCopy(28);
        org.joda.time.DateTime dateTime61 = dateTime59.withWeekyear(659);
        boolean boolean62 = instant7.isAfter((org.joda.time.ReadableInstant) dateTime59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 8);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant21.withDurationAdded(readableDuration22, 0);
        org.joda.time.Instant instant26 = instant24.minus(128L);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant26.withDurationAdded(readableDuration27, 119);
        org.joda.time.Instant instant31 = instant29.minus((-1508822910638L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.Instant instant4 = instant1.plus(1646723835553L);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        java.util.Locale locale14 = java.util.Locale.ROOT;
        java.lang.String str15 = locale14.getISO3Country();
        java.lang.String str16 = dateTimeZone12.getName((long) 'u', locale14);
        boolean boolean18 = dateTimeZone12.equals((java.lang.Object) 66512921);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone12);
        boolean boolean20 = instant4.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.Instant instant6 = instant4.minus((-186820810L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime2", (instant4.compareTo(mutableDateTime2) == 0) == instant4.equals(mutableDateTime2));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime6 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology7 = instant1.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.Chronology chronology3 = chronology1.withUTC();
        org.joda.time.DurationField durationField4 = chronology1.centuries();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.minuteOfDay();
        long long7 = dateTimeField5.roundHalfEven((long) 52);
        org.joda.time.DurationField durationField8 = dateTimeField5.getLeapDurationField();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 32769, chronology11);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology11);
        org.joda.time.LocalDate.Property property15 = localDate14.weekyear();
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        int int22 = dateTime20.getYear();
        org.joda.time.DateTime dateTime23 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime26 = dateTime20.withPeriodAdded(readablePeriod24, (int) '#');
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.year();
        org.joda.time.DateTime dateTime32 = dateTime20.withChronology(chronology28);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.parse("0");
        org.joda.time.LocalDate localDate36 = localDate34.plusYears(66525863);
        int[] intArray38 = chronology28.get((org.joda.time.ReadablePartial) localDate34, (-343407230L));
        int int39 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDate14, intArray38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime32", (dateTime20.compareTo(dateTime32) == 0) == dateTime20.equals(dateTime32));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.DateMidnight dateMidnight19 = localDate14.toDateMidnight();
        int int20 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        int int23 = localDate21.getDayOfWeek();
        boolean boolean25 = localDate21.equals((java.lang.Object) 2022);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        int int32 = dateTime30.getYear();
        org.joda.time.DateTime dateTime33 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        boolean boolean36 = localDate34.isSupported(durationFieldType35);
        int int37 = localDate34.size();
        org.joda.time.DateTime dateTime38 = dateTime33.withFields((org.joda.time.ReadablePartial) localDate34);
        java.lang.Object obj39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(obj39, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property44 = dateTime43.weekyear();
        java.lang.String str45 = property44.getAsText();
        org.joda.time.DurationField durationField46 = property44.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        java.lang.String str48 = dateTimeFieldType47.toString();
        boolean boolean49 = dateTime33.isSupported(dateTimeFieldType47);
        int int50 = localDate21.indexOf(dateTimeFieldType47);
        boolean boolean51 = localDate14.isSupported(dateTimeFieldType47);
        org.joda.time.LocalDate.Property property52 = localDate14.centuryOfEra();
        org.joda.time.Chronology chronology53 = localDate14.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.days();
        org.joda.time.DurationField durationField55 = chronology53.years();
        org.joda.time.DateTimeField dateTimeField56 = chronology53.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField46 and durationField55", (durationField46.compareTo(durationField55) == 0) == durationField46.equals(durationField55));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone10);
        long long14 = dateTimeZone10.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        int int20 = dateTime19.getMonthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMinutes(1340);
        int int23 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime22.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime22.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime22.getZone();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime15.withZoneRetainFields(dateTimeZone27);
        int int31 = dateTime30.getMinuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar calendar6 = builder5.build();
        java.util.Calendar.Builder builder8 = builder5.setLenient(false);
        java.util.Calendar.Builder builder12 = builder8.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder17 = builder12.setTimeOfDay(16, 23, 32769, 0);
        java.util.Calendar.Builder builder21 = builder17.setWeekDate(66512921, 40319999, 455544);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.minuteOfDay();
        java.util.Locale locale28 = new java.util.Locale("hi!", "", "");
        int int29 = dateTimeField24.getMaximumShortTextLength(locale28);
        long long32 = dateTimeField24.add(1646723755047L, 23);
        java.util.Locale locale34 = java.util.Locale.CHINA;
        boolean boolean35 = locale34.hasExtensions();
        java.lang.String str36 = dateTimeField24.getAsShortText(22, locale34);
        java.util.Locale locale38 = java.util.Locale.CHINA;
        java.util.Locale locale39 = java.util.Locale.ROOT;
        java.lang.String str40 = locale39.getISO3Country();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale41.getDisplayVariant();
        java.lang.String str44 = locale39.getDisplayName(locale41);
        boolean boolean45 = locale41.hasExtensions();
        java.lang.String str46 = locale38.getDisplayScript(locale41);
        java.lang.String str47 = dateTimeField24.getAsShortText((long) 26162278, locale41);
        java.util.Set<java.lang.String> strSet48 = locale41.getUnicodeLocaleAttributes();
        java.util.Calendar.Builder builder49 = builder21.setLocale(locale41);
        java.lang.String str50 = locale41.getCountry();
        java.lang.String str51 = dateTimeZone3.getName(0L, locale41);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(dateTimeZone3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime4, dateTimeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone10);
        long long15 = dateTimeZone10.convertUTCToLocal(1645514264031L);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime13", (dateTime2.compareTo(dateTime13) == 0) == dateTime2.equals(dateTime13));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        int int4 = dateTime2.getYearOfCentury();
        org.joda.time.DateTime.Property property5 = dateTime2.era();
        org.joda.time.DateTime dateTime6 = property5.getDateTime();
        org.joda.time.DateTime dateTime7 = property5.getDateTime();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime7.toDateTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(17, 16);
        long long21 = dateTimeZone19.previousTransition(5555771676L);
        org.joda.time.DateTime dateTime22 = dateTime16.withZone(dateTimeZone19);
        boolean boolean23 = dateTimeZone19.isFixed();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime22", (dateTime2.compareTo(dateTime22) == 0) == dateTime2.equals(dateTime22));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 435);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localTime4.toDateTimeToday(dateTimeZone7);
        int int9 = dateTime8.getWeekyear();
        int int10 = dateTime8.getSecondOfDay();
        boolean boolean12 = dateTime8.isBefore(1646723767611L);
        int int13 = dateTime8.getEra();
        org.joda.time.DateTime dateTime15 = dateTime8.withYearOfCentury(49);
        boolean boolean17 = dateTime15.isEqual((long) 'a');
        boolean boolean18 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime15);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.DateTime dateTime23 = dateTime21.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime21.minus(readablePeriod24);
        java.util.Date date26 = dateTime25.toDate();
        boolean boolean27 = dateTime15.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(440);
        org.joda.time.DateTime dateTime30 = dateTime15.toDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(dateTimeZone29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime30", (dateTime15.compareTo(dateTime30) == 0) == dateTime15.equals(dateTime30));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField7, and durationField5", !(durationField5.compareTo(durationField7) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField7.compareTo(durationField5))));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str6 = timeZone1.getID();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("2022");
        timeZone8.setID("French");
        java.util.TimeZone.setDefault(timeZone8);
        boolean boolean12 = timeZone1.hasSameRules(timeZone8);
        java.util.Locale locale13 = java.util.Locale.CHINESE;
        java.util.Locale locale14 = java.util.Locale.CHINESE;
        java.lang.String str15 = locale13.getDisplayCountry(locale14);
        java.util.Set<java.lang.String> strSet16 = locale13.getUnicodeLocaleKeys();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale13);
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(timeZone8, locale13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar5 and calendar17", (calendar5.compareTo(calendar17) == 0) == calendar5.equals(calendar17));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.hourOfHalfday();
        org.joda.time.DurationField durationField7 = chronology1.hours();
        org.joda.time.DurationField durationField8 = chronology1.months();
        org.joda.time.DurationField durationField9 = chronology1.months();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        int int17 = dateTime15.getYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        boolean boolean21 = localDate19.isSupported(durationFieldType20);
        int int22 = localDate19.size();
        org.joda.time.DateTime dateTime23 = dateTime18.withFields((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate25 = localDate19.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int27 = localDate19.get(dateTimeFieldType26);
        org.joda.time.LocalDate localDate29 = localDate19.withWeekyear(26162278);
        org.joda.time.LocalDate.Property property30 = localDate29.era();
        org.joda.time.LocalDate localDate31 = property30.roundFloorCopy();
        org.joda.time.LocalDate localDate32 = property30.roundHalfFloorCopy();
        int int33 = localDate32.size();
        org.joda.time.LocalDate.Property property34 = localDate32.weekOfWeekyear();
        org.joda.time.LocalDate localDate36 = property34.addToCopy(0);
        int[] intArray38 = chronology1.get((org.joda.time.ReadablePartial) localDate36, (long) (-4098));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime13", (dateTime10.compareTo(dateTime13) == 0) == dateTime10.equals(dateTime13));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime(chronology7);
        int int9 = dateTime6.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        int int23 = dateTime13.get(dateTimeFieldType22);
        java.lang.String str24 = dateTimeFieldType22.getName();
        org.joda.time.DateTime dateTime26 = dateTime6.withField(dateTimeFieldType22, 26171150);
        org.joda.time.DateTime dateTime28 = dateTime6.withMillisOfDay(2022);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((java.lang.Object) dateTime28);
        java.lang.Object obj30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj30, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withYear(7);
        java.lang.Object obj35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj35, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime39.weekyear();
        java.lang.String str41 = property40.getAsText();
        org.joda.time.DurationField durationField42 = property40.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property40.getFieldType();
        org.joda.time.DateTime dateTime44 = property40.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime46 = dateTime44.plusYears(24);
        boolean boolean47 = dateTime34.equals((java.lang.Object) dateTime46);
        boolean boolean48 = dateTime28.isEqual((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime50 = dateTime34.minusDays((-457));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and instant29", (dateTime28.compareTo(instant29) == 0) == dateTime28.equals(instant29));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean10 = dateTime8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.minusMillis((int) (short) 0);
        java.lang.String str13 = dateTime8.toString();
        org.joda.time.DateTime dateTime15 = dateTime8.withDayOfYear(18);
        org.joda.time.Instant instant16 = dateTime15.toInstant();
        long long17 = dateTime15.getMillis();
        org.joda.time.DateTime dateTime18 = dateTime15.toDateTime();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime21 = localTime19.minusMillis(0);
        org.joda.time.LocalTime localTime23 = localTime19.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property24 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime26 = property24.addWrapFieldToCopy(34);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime15.toDateTime(chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant16 and dateTime15", (instant16.compareTo(dateTime15) == 0) == instant16.equals(dateTime15));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = dateTime7.withCenturyOfEra((int) ' ');
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate11.minusYears(10);
        int[] intArray16 = localDate11.getValues();
        org.joda.time.LocalDate.Property property17 = localDate11.era();
        org.joda.time.LocalDate.Property property18 = localDate11.dayOfYear();
        org.joda.time.DateTime dateTime19 = dateTime9.withFields((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime19.minusDays(28);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra(66586053);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 32769, chronology28);
        org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.now(chronology28);
        long long35 = chronology28.add(1646723809228L, (long) 2, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone36 = chronology28.getZone();
        org.joda.time.DateTime dateTime37 = dateTime25.withZone(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((-62007368032025L), dateTimeZone36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime37", (dateTime25.compareTo(dateTime37) == 0) == dateTime25.equals(dateTime37));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.hourOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.DateTimeField dateTimeField8 = chronology2.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = chronology2.millisOfSecond();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = localDate11.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate11.minusMonths(32770);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra((int) ' ');
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        java.lang.String str31 = property30.getAsText();
        org.joda.time.DurationField durationField32 = property30.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property30.getFieldType();
        java.lang.String str34 = dateTimeFieldType33.toString();
        boolean boolean35 = dateTime24.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDate.Property property36 = localDate11.property(dateTimeFieldType33);
        org.joda.time.LocalDate localDate37 = property36.roundCeilingCopy();
        org.joda.time.LocalDate localDate39 = property36.addToCopy(1340);
        org.joda.time.LocalDate localDate40 = property36.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime41 = localDate40.toDateTimeAtCurrentTime();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate44 = localDate40.withPeriodAdded(readablePeriod42, (-457037));
        int int45 = localDate44.getDayOfYear();
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(chronology48);
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfEra();
        org.joda.time.LocalDate localDate51 = property50.withMinimumValue();
        java.util.Locale locale52 = java.util.Locale.ITALIAN;
        boolean boolean53 = locale52.hasExtensions();
        int int54 = property50.getMaximumShortTextLength(locale52);
        java.lang.String str55 = locale52.getVariant();
        boolean boolean56 = locale52.hasExtensions();
        java.lang.String str57 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) localDate44, 66592207, locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField9 and durationField32", (durationField9.compareTo(durationField32) == 0) == durationField9.equals(durationField32));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        java.util.GregorianCalendar gregorianCalendar20 = dateTime6.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant19", (dateTime16.compareTo(instant19) == 0) == dateTime16.equals(instant19));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = dateTime4.withLaterOffsetAtOverlap();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        int int13 = property11.get();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = property11.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate18 = localDate14.plusWeeks((int) (short) 100);
        boolean boolean20 = localDate18.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate22 = localDate18.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean26 = dateTimeZone25.isFixed();
        int int28 = dateTimeZone25.getStandardOffset((long) (-1));
        org.joda.time.Interval interval29 = localDate18.toInterval(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime4.toMutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int34 = dateTimeZone32.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.minuteOfDay();
        java.util.Locale locale41 = java.util.Locale.CANADA;
        java.lang.String str42 = locale41.toLanguageTag();
        java.lang.String str43 = locale41.getDisplayVariant();
        java.lang.String str44 = dateTimeField39.getAsText((long) (short) 100, locale41);
        java.util.Set<java.lang.Character> charSet45 = locale41.getExtensionKeys();
        java.lang.String str46 = dateTimeZone32.getShortName((long) 66514147, locale41);
        java.util.Calendar calendar47 = dateTime4.toCalendar(locale41);
        java.lang.String str48 = locale41.getDisplayScript();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime30", (dateTime4.compareTo(mutableDateTime30) == 0) == dateTime4.equals(mutableDateTime30));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTime();
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("2024-01-23");
        java.lang.String str7 = locale6.getISO3Language();
        java.util.Set<java.lang.Character> charSet8 = locale6.getExtensionKeys();
        boolean boolean9 = instant2.equals((java.lang.Object) charSet8);
        org.joda.time.MutableDateTime mutableDateTime10 = instant2.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 8);
        org.joda.time.Instant instant22 = instant19.toInstant();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant25 = instant22.withDurationAdded(readableDuration23, 245);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant25", (dateTime6.compareTo(instant25) == 0) == dateTime6.equals(instant25));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtStartOfDay(dateTimeZone7);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime14 = dateTime13.withLaterOffsetAtOverlap();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        int int22 = property20.get();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = property20.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate27 = localDate23.plusWeeks((int) (short) 100);
        boolean boolean29 = localDate27.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate31 = localDate27.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean35 = dateTimeZone34.isFixed();
        int int37 = dateTimeZone34.getStandardOffset((long) (-1));
        org.joda.time.Interval interval38 = localDate27.toInterval(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime13.toMutableDateTime(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight40 = localDate5.toDateMidnight(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime39", (dateTime13.compareTo(mutableDateTime39) == 0) == dateTime13.equals(mutableDateTime39));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
        org.joda.time.DurationField durationField6 = chronology3.eras();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 26174796, chronology3);
        org.joda.time.Chronology chronology8 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField11 = chronology3.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField11, and durationField6", !(durationField6.compareTo(durationField11) == 0) || (Math.signum(durationField6.compareTo(durationField6)) == Math.signum(durationField11.compareTo(durationField6))));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.DateTime dateTime6 = localDateTime4.toDateTime();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(7);
        int int12 = dateTime11.getMonthOfYear();
        int int13 = dateTime11.getDayOfMonth();
        org.joda.time.DateTime.Property property14 = dateTime11.minuteOfHour();
        org.joda.time.DateTime.Property property15 = dateTime11.minuteOfHour();
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        long long22 = dateTime20.getMillis();
        org.joda.time.DateTime.Property property23 = dateTime20.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime20, dateTimeZone26);
        long long30 = dateTimeZone26.convertLocalToUTC(5555762122L, false);
        org.joda.time.DateTime dateTime31 = dateTime11.withZone(dateTimeZone26);
        org.joda.time.DateTime dateTime32 = dateTime6.withZoneRetainFields(dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime31", (dateTime11.compareTo(dateTime31) == 0) == dateTime11.equals(dateTime31));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime17 = dateTime6.toDateTime(dateTimeZone16);
        org.joda.time.Instant instant18 = dateTime6.toInstant();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        long long25 = dateTime23.getMillis();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone27);
        org.joda.time.LocalTime localTime30 = localTime28.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.minusMinutes((int) (short) 100);
        int int38 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime23.withZoneRetainFields(dateTimeZone33);
        java.lang.String str40 = dateTimeZone33.getID();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now(dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime43 = instant18.toMutableDateTime(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime17", (dateTime6.compareTo(dateTime17) == 0) == dateTime6.equals(dateTime17));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTime.Property property10 = dateTime9.dayOfMonth();
        org.joda.time.DateTime dateTime12 = dateTime9.minusMonths(1970);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.year();
        org.joda.time.DurationField durationField18 = chronology14.days();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology14.add(readablePeriod19, 1646723777197L, 19059);
        org.joda.time.DateTimeField dateTimeField23 = chronology14.year();
        org.joda.time.Chronology chronology24 = chronology14.withUTC();
        org.joda.time.DateTime dateTime25 = dateTime12.withChronology(chronology14);
        org.joda.time.DateTimeField dateTimeField26 = chronology14.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime25", (dateTime12.compareTo(dateTime25) == 0) == dateTime12.equals(dateTime25));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        int int4 = calendar0.getWeekYear();
        java.util.TimeZone timeZone5 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekOfWeekyear();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = property12.getAsShortText(locale13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone5, locale13);
        calendar15.setFirstDayOfWeek(0);
        java.util.Date date18 = calendar15.getTime();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromDateFields(date18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar15", (calendar0.compareTo(calendar15) == 0) == calendar0.equals(calendar15));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '4');
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = dateTime7.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime27 = dateTime7.plusMillis(1970);
        org.joda.time.DateTime.Property property28 = dateTime27.year();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DurationField durationField33 = chronology31.weeks();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now(chronology31);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate(1646723796784L, chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = chronology31.add(readablePeriod38, 1646724018245L, 24);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) dateTime27, chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(12);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        boolean boolean16 = dateTime14.isAfter((long) 2);
        org.joda.time.DateTime dateTime18 = dateTime14.minusDays(1);
        org.joda.time.DateTime dateTime20 = dateTime14.minusHours((-1));
        java.lang.String str21 = dateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime25 = dateTime14.toDateTime(dateTimeZone24);
        java.util.Calendar.Builder builder27 = new java.util.Calendar.Builder();
        java.util.Calendar calendar28 = builder27.build();
        java.util.Calendar.Builder builder33 = builder27.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("2022");
        timeZone35.setID("French");
        java.util.Calendar.Builder builder38 = builder33.setTimeZone(timeZone35);
        java.util.Calendar.Builder builder42 = builder33.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale43 = java.util.Locale.CHINA;
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale47 = new java.util.Locale("24", "hi!");
        java.lang.String str48 = locale43.getDisplayLanguage(locale47);
        java.util.Calendar.Builder builder49 = builder33.setLocale(locale47);
        java.lang.String str50 = dateTimeZone24.getShortName(1645514264031L, locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter2.withZone(dateTimeZone24);
        java.util.Locale locale52 = dateTimeFormatter2.getLocale();
        org.joda.time.Chronology chronology53 = dateTimeFormatter2.getChronolgy();
        org.joda.time.Chronology chronology54 = dateTimeFormatter2.getChronology();
        boolean boolean55 = dateTimeFormatter2.isPrinter();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime25", (dateTime14.compareTo(dateTime25) == 0) == dateTime14.equals(dateTime25));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate0.monthOfYear();
        boolean boolean10 = property9.isLeap();
        org.joda.time.LocalDate localDate11 = property9.roundHalfCeilingCopy();
        int int12 = localDate11.getEra();
        int int13 = localDate11.getDayOfYear();
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        int int18 = dateTime16.getYearOfCentury();
        org.joda.time.DateTime.Property property19 = dateTime16.era();
        org.joda.time.DateTime dateTime20 = property19.getDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(48);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime20.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate11.toDateTimeAtMidnight(dateTimeZone22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime23", (dateTime16.compareTo(mutableDateTime23) == 0) == dateTime16.equals(mutableDateTime23));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        java.lang.String[] strArray20 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale[] localeArray26 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale.FilteringMode filteringMode29 = null;
        java.util.List<java.util.Locale> localeList30 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.util.Locale>) localeList27, filteringMode29);
        boolean boolean31 = strSet21.removeAll((java.util.Collection<java.util.Locale>) localeList27);
        int int32 = strSet21.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean34 = strSet21.remove((java.lang.Object) dateTimeFieldType33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(4838400000L, chronology36);
        org.joda.time.DateTime dateTime38 = dateTime37.withTimeAtStartOfDay();
        boolean boolean39 = strSet21.equals((java.lang.Object) dateTime37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int43 = dateTimeZone41.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.minuteOfDay();
        java.util.Locale locale50 = java.util.Locale.CANADA;
        java.lang.String str51 = locale50.toLanguageTag();
        java.lang.String str52 = locale50.getDisplayVariant();
        java.lang.String str53 = dateTimeField48.getAsText((long) (short) 100, locale50);
        java.util.Set<java.lang.Character> charSet54 = locale50.getExtensionKeys();
        java.lang.String str55 = dateTimeZone41.getShortName((long) 66514147, locale50);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime37.toMutableDateTime(dateTimeZone41);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(21960000L, dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and mutableDateTime57", (dateTime37.compareTo(mutableDateTime57) == 0) == dateTime37.equals(mutableDateTime57));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate14 = localDate8.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int16 = localDate8.get(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = localDate8.withWeekyear(26162278);
        org.joda.time.LocalDate.Property property19 = localDate18.era();
        org.joda.time.LocalDate localDate20 = property19.roundFloorCopy();
        org.joda.time.LocalDate localDate21 = property19.roundHalfFloorCopy();
        int int22 = localDate21.size();
        org.joda.time.LocalDate.Property property23 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate25 = property23.addToCopy(0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds((int) ' ');
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) localTime27);
        java.lang.Object obj31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(obj31, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property36 = dateTime35.weekyear();
        long long37 = dateTime35.getMillis();
        org.joda.time.DateTime.Property property38 = dateTime35.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime35, dateTimeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone41);
        long long46 = dateTimeZone41.convertUTCToLocal(1645514264031L);
        org.joda.time.DateTime dateTime47 = localDate25.toDateTime(localTime30, dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime44", (dateTime2.compareTo(dateTime44) == 0) == dateTime2.equals(dateTime44));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 66609);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) '4');
        java.lang.String str17 = dateTimeZone14.getID();
        long long20 = dateTimeZone14.convertLocalToUTC(9223120513967362020L, false);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime1.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime23 = dateTime1.minus(1646724097235L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime21", (dateTime1.compareTo(mutableDateTime21) == 0) == dateTime1.equals(mutableDateTime21));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime2.minusHours(0);
        org.joda.time.Instant instant11 = dateTime2.toInstant();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 391);
        org.joda.time.Instant instant16 = instant11.withDurationAdded(1646723870645L, 457423);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant11.plus(readableDuration17);
        boolean boolean19 = instant11.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant11", (dateTime2.compareTo(instant11) == 0) == dateTime2.equals(instant11));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) 1017118800002L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.minus(37874678106122L);
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) (short) 100);
        int int26 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter12.withZone(dateTimeZone21);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) dateTimePrinter5, dateTimeZone21);
        org.joda.time.DateTime dateTime30 = dateTime28.withYearOfEra((int) 'x');
        org.joda.time.DateTime dateTime32 = dateTime28.withYear(82800000);
        int int33 = instant4.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = localDateTime6.getField((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime6.minusHours(7);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime6.plusMonths(2012);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusDays(2024);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant27 = instant24.withDurationAdded(readableDuration25, 51);
        org.joda.time.Instant instant28 = instant24.toInstant();
        org.joda.time.Instant instant30 = instant28.withMillis((-1260954909386381L));
        org.joda.time.Instant instant32 = instant28.withMillis(1646724114593L);
        boolean boolean33 = localDateTime19.equals((java.lang.Object) instant28);
        java.lang.Object obj34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj34, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property39 = dateTime38.weekyear();
        org.joda.time.DateTime dateTime40 = property39.roundCeilingCopy();
        org.joda.time.DateTime dateTime42 = dateTime40.withCenturyOfEra((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime43 = dateTime40.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime44 = dateTime40.toDateTimeISO();
        org.joda.time.DateTime dateTime46 = dateTime40.minusMonths(22);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime49.withYearOfCentury(34);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime49.withYear(32770);
        int int54 = localDateTime49.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str56 = dateTimeFieldType55.toString();
        org.joda.time.LocalDateTime.Property property57 = localDateTime49.property(dateTimeFieldType55);
        java.lang.String str58 = dateTimeFieldType55.toString();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType55.getRangeDurationType();
        org.joda.time.DateTime dateTime61 = dateTime46.withFieldAdded(durationFieldType59, 8535);
        boolean boolean62 = localDateTime19.equals((java.lang.Object) 8535);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant22 and dateTime36", (instant22.compareTo(dateTime36) == 0) == instant22.equals(dateTime36));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.DateTime dateTime30 = dateTime8.minus(21960000L);
        long long31 = dateTime30.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        java.lang.String[] strArray19 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale[] localeArray25 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        boolean boolean30 = strSet20.removeAll((java.util.Collection<java.util.Locale>) localeList26);
        int int31 = strSet20.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean33 = strSet20.remove((java.lang.Object) dateTimeFieldType32);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(4838400000L, chronology35);
        org.joda.time.DateTime dateTime37 = dateTime36.withTimeAtStartOfDay();
        boolean boolean38 = strSet20.equals((java.lang.Object) dateTime36);
        org.joda.time.format.DateTimePrinter dateTimePrinter39 = null;
        org.joda.time.format.DateTimeParser dateTimeParser40 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter39, dateTimeParser40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser44 = dateTimeFormatter41.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter41.withDefaultYear(10);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone48);
        org.joda.time.LocalTime localTime51 = localTime49.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = localTime49.toDateTimeToday(dateTimeZone52);
        boolean boolean55 = dateTime53.isAfter((long) 2);
        org.joda.time.DateTime dateTime57 = dateTime53.minusDays(1);
        org.joda.time.DateTime dateTime59 = dateTime53.minusHours((-1));
        java.lang.String str60 = dateTime53.toString();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone62);
        org.joda.time.LocalTime localTime65 = localTime63.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.DateTime dateTime67 = localTime63.toDateTimeToday(dateTimeZone66);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime67.getZone();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long73 = dateTimeZone68.getMillisKeepLocal(dateTimeZone71, (long) '4');
        org.joda.time.DateTime dateTime74 = dateTime53.toDateTime(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter75 = dateTimeFormatter46.withZone(dateTimeZone68);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter46.withPivotYear((java.lang.Integer) 10);
        boolean boolean78 = dateTimeFormatter77.isOffsetParsed();
        org.joda.time.LocalTime localTime80 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.Chronology chronology81 = localTime80.getChronology();
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime(chronology81);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter83 = dateTimeFormatter77.withChronology(chronology81);
        org.joda.time.DateTime dateTime84 = dateTime36.toDateTime(chronology81);
        org.joda.time.DurationField durationField85 = chronology81.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime84", (dateTime36.compareTo(dateTime84) == 0) == dateTime36.equals(dateTime84));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(292278993);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMinutes(67);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.minus(1646723815209L);
        int int13 = dateTime3.compareTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant12.toMutableDateTimeISO();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        long long21 = dateTime19.getMillis();
        int int22 = dateTime19.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone24);
        org.joda.time.LocalTime localTime27 = localTime25.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = localTime25.toDateTimeToday(dateTimeZone28);
        int int30 = dateTime29.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int32 = dateTime29.get(dateTimeFieldType31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone34);
        org.joda.time.LocalTime localTime37 = localTime35.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = localTime35.toDateTimeToday(dateTimeZone38);
        int int40 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime39);
        boolean boolean41 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime43 = dateTime29.plusWeeks(4);
        org.joda.time.DateTime.Property property44 = dateTime29.minuteOfDay();
        org.joda.time.DateTime dateTime46 = dateTime29.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(obj51, dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime53.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property56 = dateTime55.weekyear();
        java.lang.String str57 = property56.getAsText();
        org.joda.time.DurationField durationField58 = property56.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property56.getFieldType();
        int int60 = dateTime50.get(dateTimeFieldType59);
        org.joda.time.DateTime.Property property61 = dateTime46.property(dateTimeFieldType59);
        org.joda.time.DateTime dateTime62 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime63 = dateTime62.toDateTimeISO();
        boolean boolean64 = instant12.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and dateTime17", (instant10.compareTo(dateTime17) == 0) == instant10.equals(dateTime17));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.lang.String str12 = chronology9.toString();
        org.joda.time.DurationField durationField13 = chronology9.weeks();
        org.joda.time.DateTime dateTime14 = dateTime4.withChronology(chronology9);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        boolean boolean20 = durationFieldType16.isSupported(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.eras();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(1646723766584L, chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.secondOfDay();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((java.lang.Object) dateTime14, chronology18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField21", Math.signum(durationField13.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField13)));
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean6 = dateTimeZone5.isFixed();
        int int8 = dateTimeZone5.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtCurrentTime(dateTimeZone5);
        long long13 = dateTimeZone5.convertLocalToUTC((long) (short) 0, false, (long) 8);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        int int15 = localDate14.getDayOfWeek();
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtMidnight();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        java.lang.String str23 = property22.getAsText();
        int int24 = property22.get();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = property22.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate29 = localDate25.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.plus(readablePeriod30);
        org.joda.time.LocalDate localDate33 = localDate31.plusWeeks(32770);
        org.joda.time.LocalDate localDate34 = localDate14.withFields((org.joda.time.ReadablePartial) localDate33);
        java.lang.Object obj35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(obj35, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property40 = dateTime39.weekyear();
        org.joda.time.DateTime dateTime42 = property40.addToCopy(9);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.minus(readablePeriod43);
        org.joda.time.DateTime dateTime45 = localDate34.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        java.util.Date date46 = dateTime45.toDate();
        org.joda.time.Instant instant47 = dateTime45.toInstant();
        org.joda.time.DateTime dateTime48 = instant47.toDateTimeISO();
        int int49 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime45 and instant47", (dateTime45.compareTo(instant47) == 0) == dateTime45.equals(instant47));
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.year();
        org.joda.time.DurationField durationField5 = chronology1.days();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology1.add(readablePeriod6, 1646723777197L, 19059);
        org.joda.time.Chronology chronology10 = chronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology10.hours();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        boolean boolean19 = durationFieldType15.isSupported(chronology17);
        org.joda.time.DurationField durationField20 = chronology17.eras();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(1646723766584L, chronology17);
        int[] intArray23 = chronology10.get((org.joda.time.ReadablePartial) localDate21, 1646723919336L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField20", Math.signum(durationField5.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField5)));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.DateTime dateTime4 = instant3.toDateTime();
        org.joda.time.Instant instant6 = instant3.withMillis(1645514261975L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfDay();
        boolean boolean33 = durationFieldType29.isSupported(chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.yearOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology31.getZone();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(chronology31);
        org.joda.time.DateTimeField dateTimeField38 = chronology31.hourOfDay();
        org.joda.time.DurationField durationField39 = chronology31.halfdays();
        org.joda.time.DateTime dateTime40 = dateTime8.toDateTime(chronology31);
        org.joda.time.DateTime dateTime41 = org.joda.time.DateTime.now(chronology31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        long long11 = property5.remainder();
        org.joda.time.DateTime dateTime12 = property5.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime14 = property5.setCopy(22);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTimeISO();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        long long23 = chronology17.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField25 = chronology17.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime14.toMutableDateTime(chronology17);
        org.joda.time.DateTime.Property property27 = dateTime14.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime26", (mutableDateTime15.compareTo(mutableDateTime26) == 0) == mutableDateTime15.equals(mutableDateTime26));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = localDate10.getDayOfWeek();
        org.joda.time.LocalDate localDate14 = localDate10.minusYears(10);
        int[] intArray15 = localDate10.getValues();
        org.joda.time.LocalDate.Property property16 = localDate10.era();
        org.joda.time.LocalDate.Property property17 = localDate10.dayOfYear();
        org.joda.time.DateTime dateTime18 = dateTime8.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime18.minusDays(28);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra(66586053);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 32769, chronology27);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(chronology27);
        long long34 = chronology27.add(1646723809228L, (long) 2, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone35 = chronology27.getZone();
        org.joda.time.DateTime dateTime36 = dateTime24.withZone(dateTimeZone35);
        org.joda.time.DateTime.Property property37 = dateTime24.year();
        org.joda.time.Instant instant39 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTimeISO();
        org.joda.time.Instant instant42 = instant39.plus(1646723751922L);
        org.joda.time.DateTime dateTime43 = instant39.toDateTime();
        java.lang.Object obj44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(obj44, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime50 = dateTime48.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime52 = dateTime48.minusSeconds(66514147);
        int int53 = instant39.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.DateTime dateTime59 = dateTime57.toDateTime(dateTimeZone58);
        org.joda.time.DateTime.Property property60 = dateTime59.weekOfWeekyear();
        org.joda.time.DateTime dateTime61 = property60.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod62 = null;
        org.joda.time.DateTime dateTime63 = dateTime61.minus(readablePeriod62);
        org.joda.time.DateTimeZone dateTimeZone64 = dateTime61.getZone();
        boolean boolean65 = dateTimeZone64.isFixed();
        java.lang.String str67 = dateTimeZone64.getShortName((long) 99);
        int int69 = dateTimeZone64.getOffset((long) 38);
        org.joda.time.DateTime dateTime70 = dateTime48.toDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime72 = dateTime48.plusDays(66932092);
        int int73 = dateTime24.compareTo((org.joda.time.ReadableInstant) dateTime72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant39 and mutableDateTime40", (instant39.compareTo(mutableDateTime40) == 0) == instant39.equals(mutableDateTime40));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-24T11:11:59.999+59:12");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("2022");
        int int4 = timeZone3.getRawOffset();
        timeZone3.setRawOffset(0);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone3);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("2022");
        int int10 = timeZone9.getRawOffset();
        timeZone9.setRawOffset(0);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone9);
        java.lang.String str14 = timeZone9.getID();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("2022");
        timeZone16.setID("French");
        java.util.TimeZone.setDefault(timeZone16);
        boolean boolean20 = timeZone9.hasSameRules(timeZone16);
        calendar7.setTimeZone(timeZone9);
        boolean boolean22 = timeZone1.hasSameRules(timeZone9);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone1);
        long long24 = calendar23.getTimeInMillis();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("2022");
        int int27 = timeZone26.getRawOffset();
        timeZone26.setRawOffset(0);
        timeZone26.setRawOffset((int) '4');
        boolean boolean32 = timeZone26.observesDaylightTime();
        java.lang.String str33 = timeZone26.getID();
        java.util.TimeZone.setDefault(timeZone26);
        calendar23.setTimeZone(timeZone26);
        boolean boolean36 = timeZone26.useDaylightTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar7 and calendar23", (calendar7.compareTo(calendar23) == 0) == calendar7.equals(calendar23));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        org.joda.time.DateTime dateTime6 = dateTime2.withWeekOfWeekyear(11);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str18 = dateTimeZone16.getNameKey(0L);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) dateTime13, dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime2.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property21 = dateTime2.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime20", (dateTime9.compareTo(dateTime20) == 0) == dateTime9.equals(dateTime20));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis((long) 292278993);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        org.joda.time.LocalDate localDate15 = property14.roundCeilingCopy();
        org.joda.time.LocalDate localDate17 = property14.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate18 = property14.getLocalDate();
        org.joda.time.LocalDate.Property property19 = localDate18.yearOfCentury();
        org.joda.time.LocalDate localDate21 = localDate18.minusDays(150);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTime dateTime26 = localDate24.toDateTimeAtCurrentTime();
        int int27 = dateTimeZone23.getOffset((org.joda.time.ReadableInstant) dateTime26);
        long long30 = dateTimeZone23.convertLocalToUTC(0L, false);
        org.joda.time.DateTime dateTime31 = localDate18.toDateTimeAtMidnight(dateTimeZone23);
        int int32 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime34 = dateTime31.minusYears(26540330);
        int int35 = dateTime34.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant7", (dateTime6.compareTo(instant7) == 0) == dateTime6.equals(instant7));
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = property5.getMaximumValue();
        org.joda.time.DateTime dateTime7 = property5.roundHalfFloorCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) (short) 100);
        int int27 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter13.withZone(dateTimeZone22);
        java.lang.String str29 = dateTimeZone22.toString();
        long long31 = dateTimeZone22.convertUTCToLocal((-19819295999995L));
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(63808156944000L, dateTimeZone22);
        org.joda.time.DateTime dateTime33 = dateTime7.toDateTime(dateTimeZone22);
        boolean boolean35 = dateTime7.isBefore((long) 213120000);
        org.joda.time.Instant instant36 = new org.joda.time.Instant((java.lang.Object) dateTime7);
        org.joda.time.DateTime dateTime38 = dateTime7.minusMonths(81205);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant36", (dateTime7.compareTo(instant36) == 0) == dateTime7.equals(instant36));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(4);
        org.joda.time.DateTime.Property property13 = dateTime4.minuteOfHour();
        org.joda.time.DateTime dateTime14 = property13.withMaximumValue();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        org.joda.time.DateTime dateTime21 = property20.roundCeilingCopy();
        org.joda.time.DateTime dateTime23 = dateTime21.withCenturyOfEra((int) ' ');
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = localDate25.getDayOfWeek();
        org.joda.time.LocalDate localDate29 = localDate25.minusYears(10);
        int[] intArray30 = localDate25.getValues();
        org.joda.time.LocalDate.Property property31 = localDate25.era();
        org.joda.time.LocalDate.Property property32 = localDate25.dayOfYear();
        org.joda.time.DateTime dateTime33 = dateTime23.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readableDuration34);
        org.joda.time.DateTime dateTime37 = dateTime33.minusDays(28);
        org.joda.time.DateTime dateTime39 = dateTime33.minusSeconds(32768);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime41 = dateTime33.plus(readablePeriod40);
        boolean boolean42 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(obj47, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = dateTime49.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property52 = dateTime51.weekyear();
        java.lang.String str53 = property52.getAsText();
        org.joda.time.DurationField durationField54 = property52.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property52.getFieldType();
        int int56 = dateTime46.get(dateTimeFieldType55);
        org.joda.time.DateTime dateTime58 = dateTime46.plusMonths((int) (short) -1);
        org.joda.time.Instant instant59 = dateTime46.toInstant();
        boolean boolean60 = dateTime14.isBefore((org.joda.time.ReadableInstant) instant59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.DateTime dateTime62 = dateTime14.plus(readableDuration61);
        org.joda.time.DateTime.Property property63 = dateTime14.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and instant59", (dateTime46.compareTo(instant59) == 0) == dateTime46.equals(instant59));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant0.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant0.withMillis(1646726483609L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant0", (dateTime1.compareTo(instant0) == 0) == dateTime1.equals(instant0));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = property25.getLeapDurationField();
        long long30 = durationField27.getMillis((long) 26171150, 1646723779141L);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekyear();
        org.joda.time.DurationField durationField35 = chronology32.eras();
        int int36 = durationField27.compareTo(durationField35);
        long long39 = durationField27.getValueAsLong(1646723939461L, (long) 32400435);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField21 and durationField35", Math.signum(durationField21.compareTo(durationField35)) == -Math.signum(durationField35.compareTo(durationField21)));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZone(dateTimeZone5);
        boolean boolean8 = dateTime4.isAfter((long) 4);
        org.joda.time.DateTime dateTime10 = dateTime4.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone11);
        long long15 = dateTimeZone11.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(dateTimeZone11);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 41065, dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime16", (dateTime4.compareTo(dateTime16) == 0) == dateTime4.equals(dateTime16));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = durationFieldType0.getField(chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField5, durationField8, and durationField5", !(durationField5.compareTo(durationField8) == 0) || (Math.signum(durationField5.compareTo(durationField5)) == Math.signum(durationField8.compareTo(durationField5))));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        org.joda.time.Instant instant9 = instant7.withMillis(625L);
        java.lang.String str10 = instant9.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.DateTime.Property property29 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime31 = dateTime14.withMillisOfSecond(0);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        org.joda.time.DurationField durationField43 = property41.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = property41.getFieldType();
        int int45 = dateTime35.get(dateTimeFieldType44);
        org.joda.time.DateTime.Property property46 = dateTime31.property(dateTimeFieldType44);
        org.joda.time.DateTime dateTime48 = property46.addToCopy((long) 53);
        org.joda.time.Instant instant49 = dateTime48.toInstant();
        org.joda.time.MutableDateTime mutableDateTime50 = instant49.toMutableDateTime();
        int int51 = mutableDateTime50.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime48 and instant49", (dateTime48.compareTo(instant49) == 0) == dateTime48.equals(instant49));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone12);
        org.joda.time.LocalTime localTime15 = localTime13.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime13.toDateTimeToday(dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime13.minusHours(2021);
        int int20 = localTime13.getSecondOfMinute();
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DurationField durationField28 = property26.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        java.lang.String str30 = dateTimeFieldType29.toString();
        boolean boolean31 = localTime13.isSupported(dateTimeFieldType29);
        org.joda.time.DateTime dateTime32 = localTime13.toDateTimeToday();
        org.joda.time.DateTime dateTime34 = dateTime32.minusMillis(17);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTime32.getZone();
        long long37 = dateTimeZone35.previousTransition(1645514231810L);
        org.joda.time.Instant instant39 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime40 = instant39.toMutableDateTimeISO();
        org.joda.time.Instant instant43 = instant39.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime44 = instant39.toDateTimeISO();
        org.joda.time.Instant instant47 = instant39.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant49 = instant39.plus(readableDuration48);
        org.joda.time.MutableDateTime mutableDateTime50 = instant49.toMutableDateTime();
        org.joda.time.Instant instant52 = instant49.minus((long) 17267435);
        boolean boolean53 = dateTimeZone35.equals((java.lang.Object) instant52);
        org.joda.time.DateTime dateTime54 = dateTime6.toDateTime(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant39 and mutableDateTime40", (instant39.compareTo(mutableDateTime40) == 0) == instant39.equals(mutableDateTime40));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.lang.String str1 = dateTimeFieldType0.toString();
        java.lang.String str2 = dateTimeFieldType0.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology5);
        org.joda.time.DurationField durationField8 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.hourOfHalfday();
        boolean boolean11 = dateTimeFieldType0.isSupported(chronology5);
        org.joda.time.DurationField durationField12 = chronology5.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField12, and durationField8", !(durationField8.compareTo(durationField12) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField12.compareTo(durationField8))));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis((long) 292278993);
        org.joda.time.Instant instant7 = dateTime6.toInstant();
        long long8 = instant7.getMillis();
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime15.toGregorianCalendar();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        int int19 = localDate17.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = localDate17.minusYears(10);
        int[] intArray22 = localDate17.getValues();
        org.joda.time.LocalDate.Property property23 = localDate17.era();
        boolean boolean24 = gregorianCalendar16.before((java.lang.Object) property23);
        java.util.Date date26 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant27 = new org.joda.time.Instant((java.lang.Object) date26);
        gregorianCalendar16.setTime(date26);
        date26.setTime((long) 366);
        boolean boolean31 = instant7.equals((java.lang.Object) 366);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant7.minus(readableDuration32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.plus(readableDuration34);
        org.joda.time.Instant instant37 = instant33.plus(1646790375451L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant33", (dateTime6.compareTo(instant33) == 0) == dateTime6.equals(instant33));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '4');
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        java.lang.String str33 = property32.getAsText();
        org.joda.time.DurationField durationField34 = property32.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
        int int36 = dateTime26.get(dateTimeFieldType35);
        org.joda.time.DateTime dateTime38 = dateTime26.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime39 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property40 = dateTime39.monthOfYear();
        int int41 = dateTime39.getHourOfDay();
        org.joda.time.DateTime.Property property42 = dateTime39.centuryOfEra();
        org.joda.time.DateTime dateTime44 = property42.addWrapFieldToCopy(8);
        org.joda.time.Interval interval45 = property42.toInterval();
        boolean boolean46 = dateTime22.equals((java.lang.Object) property42);
        org.joda.time.DateTime dateTime47 = property42.roundHalfEvenCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime14 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone10);
        long long17 = dateTimeZone10.previousTransition(1645514268958L);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime15", (dateTime2.compareTo(dateTime15) == 0) == dateTime2.equals(dateTime15));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '#');
        int int10 = dateTime9.getMonthOfYear();
        org.joda.time.DateTime dateTime12 = dateTime9.plusMinutes(1340);
        int int13 = dateTime12.getMillisOfSecond();
        org.joda.time.DateTime dateTime15 = dateTime12.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime12.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime12.getZone();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime7.toDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property20 = dateTime19.dayOfYear();
        boolean boolean21 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        long long11 = property5.remainder();
        org.joda.time.DateTime dateTime12 = property5.roundHalfFloorCopy();
        java.util.Calendar.Builder builder14 = new java.util.Calendar.Builder();
        java.util.Calendar calendar15 = builder14.build();
        java.util.Calendar.Builder builder17 = builder14.setLenient(false);
        java.util.Calendar.Builder builder19 = builder17.setLenient(false);
        java.util.Calendar.Builder builder24 = builder19.setTimeOfDay((int) 'a', 2012, (-52), 22);
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("2022");
        int int27 = timeZone26.getRawOffset();
        timeZone26.setRawOffset(0);
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(timeZone26);
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("2022");
        int int33 = timeZone32.getRawOffset();
        timeZone32.setRawOffset(0);
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(timeZone32);
        java.lang.String str37 = timeZone32.getID();
        java.util.TimeZone timeZone39 = java.util.TimeZone.getTimeZone("2022");
        timeZone39.setID("French");
        java.util.TimeZone.setDefault(timeZone39);
        boolean boolean43 = timeZone32.hasSameRules(timeZone39);
        calendar30.setTimeZone(timeZone32);
        java.util.TimeZone timeZone45 = calendar30.getTimeZone();
        java.util.Calendar.Builder builder46 = builder19.setTimeZone(timeZone45);
        java.util.Calendar.Builder builder49 = builder19.set(16, (-2));
        java.util.Calendar.Builder builder54 = builder49.setTimeOfDay(40320000, 2922690, 46, (-27445));
        java.util.Locale locale58 = new java.util.Locale("Japanese", "minuteOfDay", "2022-02-22T07:18:31.110+00:00:00.435");
        java.util.Calendar calendar59 = java.util.Calendar.getInstance(locale58);
        java.util.Calendar.Builder builder60 = builder54.setLocale(locale58);
        org.joda.time.DateTime dateTime61 = property5.setCopy("66923794", locale58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar30 and calendar59", (calendar30.compareTo(calendar59) == 0) == calendar30.equals(calendar59));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, (-2181646));
        org.joda.time.Instant instant8 = instant1.withDurationAdded(1646724112583L, 434);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        int int6 = localDate4.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate4.minusYears(10);
        int[] intArray9 = localDate4.getValues();
        org.joda.time.LocalDate.Property property10 = localDate4.era();
        org.joda.time.LocalDate localDate11 = property10.roundCeilingCopy();
        org.joda.time.LocalDate localDate12 = property10.roundHalfCeilingCopy();
        int int13 = localDate12.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str15 = dateTimeFieldType14.toString();
        int int16 = localDate12.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime18 = dateTime1.withField(dateTimeFieldType14, 0);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.yearOfCentury();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 32769, chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekOfWeekyear();
        org.joda.time.DateTime dateTime25 = dateTime1.toDateTime(chronology21);
        org.joda.time.DateTime dateTime27 = dateTime1.minusMonths(12);
        java.lang.String str29 = dateTime27.toString("434");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime25", (dateTime1.compareTo(dateTime25) == 0) == dateTime1.equals(dateTime25));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTimeISO();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.joda.time.Chronology chronology3 = instant0.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant0", (dateTime1.compareTo(instant0) == 0) == dateTime1.equals(instant0));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTime dateTime33 = dateTime8.toDateTime(chronology30);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((-62135596800000L));
        int int36 = localTime35.size();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime35.toDateTimeToday(dateTimeZone37);
        long long39 = dateTime38.getMillis();
        int int40 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DateTime dateTime7 = property5.roundHalfCeilingCopy();
        int int8 = dateTime7.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime(dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        int int17 = dateTime15.getYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(86399999);
        org.joda.time.DateTime.Property property21 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone30);
        org.joda.time.LocalTime localTime33 = localTime31.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime31.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withMillisOfSecond((int) (byte) 100);
        int int38 = property28.compareTo((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str40 = dateTime37.toString("97");
        boolean boolean41 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str42 = dateTime18.toString();
        int int43 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(17, 16);
        long long48 = dateTimeZone46.previousTransition(5555771676L);
        long long50 = dateTimeZone46.convertUTCToLocal(1646723908966L);
        org.joda.time.DateTime dateTime51 = dateTime18.toDateTime(dateTimeZone46);
        org.joda.time.DateTime.Property property52 = dateTime18.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime51", (dateTime4.compareTo(dateTime51) == 0) == dateTime4.equals(dateTime51));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Instant instant6 = instant2.plus(172800000L);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and dateTime4", (instant2.compareTo(dateTime4) == 0) == instant2.equals(dateTime4));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        org.joda.time.MutableDateTime mutableDateTime6 = instant1.toMutableDateTime();
        java.lang.String str7 = instant1.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime6", (instant1.compareTo(mutableDateTime6) == 0) == instant1.equals(mutableDateTime6));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime4", (instant1.compareTo(mutableDateTime4) == 0) == instant1.equals(mutableDateTime4));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        java.util.Calendar.Builder builder10 = builder5.setTimeOfDay((int) 'a', 2012, (-52), 22);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("2022");
        int int13 = timeZone12.getRawOffset();
        timeZone12.setRawOffset(0);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone12);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getTimeZone("2022");
        int int19 = timeZone18.getRawOffset();
        timeZone18.setRawOffset(0);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone18);
        java.lang.String str23 = timeZone18.getID();
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("2022");
        timeZone25.setID("French");
        java.util.TimeZone.setDefault(timeZone25);
        boolean boolean29 = timeZone18.hasSameRules(timeZone25);
        calendar16.setTimeZone(timeZone18);
        java.util.TimeZone timeZone31 = calendar16.getTimeZone();
        java.util.Calendar.Builder builder32 = builder5.setTimeZone(timeZone31);
        java.util.Calendar.Builder builder35 = builder5.set(16, (-2));
        java.util.Calendar.Builder builder40 = builder35.setTimeOfDay(40320000, 2922690, 46, (-27445));
        java.util.Locale locale44 = new java.util.Locale("Japanese", "minuteOfDay", "2022-02-22T07:18:31.110+00:00:00.435");
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        java.util.Calendar.Builder builder46 = builder40.setLocale(locale44);
        java.util.Calendar.Builder builder51 = builder40.setTimeOfDay(26315140, 266, 46319, 2351);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar16 and calendar45", (calendar16.compareTo(calendar45) == 0) == calendar16.equals(calendar45));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property4 = dateTime1.secondOfMinute();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusDays((int) 'a');
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.DateTime dateTime9 = dateTime1.withChronology(chronology8);
        int int10 = dateTime1.getMinuteOfHour();
        org.joda.time.DateTime dateTime11 = dateTime1.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes(26620);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime9", (dateTime11.compareTo(dateTime9) == 0) == dateTime11.equals(dateTime9));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DateTime dateTime7 = property5.roundHalfCeilingCopy();
        int int8 = dateTime7.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.toDateTime(dateTimeZone9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        int int17 = dateTime15.getYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime20 = dateTime18.plusMonths(86399999);
        org.joda.time.DateTime.Property property21 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.withZone(dateTimeZone26);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone30);
        org.joda.time.LocalTime localTime33 = localTime31.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localTime31.toDateTimeToday(dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withMillisOfSecond((int) (byte) 100);
        int int38 = property28.compareTo((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str40 = dateTime37.toString("97");
        boolean boolean41 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str42 = dateTime18.toString();
        int int43 = dateTime7.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(17, 16);
        long long48 = dateTimeZone46.previousTransition(5555771676L);
        long long50 = dateTimeZone46.convertUTCToLocal(1646723908966L);
        org.joda.time.DateTime dateTime51 = dateTime18.toDateTime(dateTimeZone46);
        org.joda.time.LocalTime localTime52 = dateTime18.toLocalTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime51", (dateTime4.compareTo(dateTime51) == 0) == dateTime4.equals(dateTime51));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime4 = instant2.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant2.plus(readableDuration5);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime4", (instant6.compareTo(mutableDateTime4) == 0) == instant6.equals(mutableDateTime4));
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = dateTime3.toLocalDateTime();
        org.joda.time.Chronology chronology9 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.clockhourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.hours();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(1646723983321L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.dayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withPeriodAdded(readablePeriod23, 8);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime18.minusMillis(600032);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDateTime localDateTime29 = localDateTime18.minus(readablePeriod28);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime18.withPeriodAdded(readablePeriod30, 33);
        org.joda.time.Chronology chronology33 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime13.toMutableDateTime(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime35", (dateTime13.compareTo(mutableDateTime35) == 0) == dateTime13.equals(mutableDateTime35));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(292278993);
        org.joda.time.DateTime dateTime9 = dateTime3.plusMinutes(67);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.Instant instant12 = instant10.minus(1646723815209L);
        int int13 = dateTime3.compareTo((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant15 = instant12.plus(435L);
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        org.joda.time.Instant instant19 = instant15.withDurationAdded((-38846L), 26442184);
        org.joda.time.Instant instant21 = instant15.minus((long) 436);
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant15 and mutableDateTime16", (instant15.compareTo(mutableDateTime16) == 0) == instant15.equals(mutableDateTime16));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        org.joda.time.DateTime dateTime6 = dateTime2.withWeekOfWeekyear(11);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str18 = dateTimeZone16.getNameKey(0L);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) dateTime13, dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime2.withZone(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime2.plusWeeks(27445399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime20", (dateTime9.compareTo(dateTime20) == 0) == dateTime9.equals(dateTime20));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        java.lang.String str19 = property18.getAsText();
        org.joda.time.DurationField durationField20 = property18.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property18.getFieldType();
        java.lang.String str22 = dateTimeFieldType21.toString();
        boolean boolean23 = dateTime7.isSupported(dateTimeFieldType21);
        java.lang.String str24 = dateTimeFieldType21.getName();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.minuteOfDay();
        java.lang.String str29 = chronology26.toString();
        org.joda.time.DurationField durationField30 = chronology26.weeks();
        boolean boolean31 = dateTimeFieldType21.isSupported(chronology26);
        org.joda.time.DateTimeField dateTimeField32 = chronology26.monthOfYear();
        org.joda.time.DateTimeField dateTimeField33 = chronology26.halfdayOfDay();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology26);
        org.joda.time.DateTimeField dateTimeField35 = chronology26.secondOfMinute();
        long long37 = dateTimeField35.roundFloor(5L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime34", (dateTime2.compareTo(dateTime34) == 0) == dateTime2.equals(dateTime34));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone10);
        long long14 = dateTimeZone10.convertLocalToUTC(22L, true);
        org.joda.time.DateTime dateTime15 = dateTime3.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 82800000);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) '#');
        int int20 = dateTime19.getMonthOfYear();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMinutes(1340);
        int int23 = dateTime22.getMillisOfSecond();
        org.joda.time.DateTime dateTime25 = dateTime22.withDayOfYear(24);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime22.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime22.getZone();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime15.withZoneRetainFields(dateTimeZone27);
        int int32 = dateTimeZone27.getStandardOffset(1646723980453L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime15", (dateTime3.compareTo(dateTime15) == 0) == dateTime3.equals(dateTime15));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTime dateTime15 = localDate12.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology16.add(readablePeriod19, 1646724110722L, 660);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime18", (dateTime2.compareTo(dateTime18) == 0) == dateTime2.equals(dateTime18));
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfEra();
        org.joda.time.LocalDate localDate11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtMidnight();
        int int13 = property5.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime.Property property14 = dateTime12.minuteOfDay();
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfMonth();
        java.util.GregorianCalendar gregorianCalendar16 = dateTime12.toGregorianCalendar();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime12.plus(readablePeriod17);
        org.joda.time.Instant instant20 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime21 = instant20.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime22 = instant20.toMutableDateTimeISO();
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.minus(readableDuration28);
        boolean boolean30 = mutableDateTime22.isEqual((org.joda.time.ReadableInstant) dateTime27);
        int int31 = dateTime12.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant20 and dateTime21", (instant20.compareTo(dateTime21) == 0) == instant20.equals(dateTime21));
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusDays((int) 'a');
        org.joda.time.LocalDate localDate4 = localDate2.plusYears(51);
        org.joda.time.LocalDate localDate6 = localDate2.minusMonths(66514147);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.withYear(26176839);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours(26329469);
        boolean boolean17 = localDate2.equals((java.lang.Object) dateTime14);
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime14);
        org.joda.time.Chronology chronology19 = instant18.getChronology();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and instant18", (dateTime14.compareTo(instant18) == 0) == dateTime14.equals(instant18));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime14 = dateTime10.minusSeconds(66514147);
        int int15 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.minus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime23.getZone();
        boolean boolean27 = dateTimeZone26.isFixed();
        java.lang.String str29 = dateTimeZone26.getShortName((long) 99);
        int int31 = dateTimeZone26.getOffset((long) 38);
        org.joda.time.DateTime dateTime32 = dateTime10.toDateTime(dateTimeZone26);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime35 = localTime33.minusMillis(0);
        org.joda.time.LocalTime localTime37 = localTime33.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime.Property property38 = localTime33.secondOfMinute();
        int int39 = localTime33.getMillisOfDay();
        org.joda.time.LocalTime localTime41 = localTime33.minusHours(970);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(122, 0);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.now(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localTime33.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime32.toDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime2.withLaterOffsetAtOverlap();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) (byte) 0);
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        boolean boolean22 = dateTimeFormatter21.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter21.getZone();
        org.joda.time.DateTime dateTime24 = dateTime2.toDateTime(dateTimeZone23);
        java.lang.String str25 = dateTimeZone23.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime24", (dateTime2.compareTo(dateTime24) == 0) == dateTime2.equals(dateTime24));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.lang.String str6 = chronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.weekyear();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology2);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        int int16 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate21 = localDate17.plusWeeks((int) (short) 100);
        int int22 = localDate21.getEra();
        int[] intArray24 = chronology2.get((org.joda.time.ReadablePartial) localDate21, (-62135567811000L));
        org.joda.time.DateTimeField dateTimeField25 = chronology2.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime11", (dateTime8.compareTo(dateTime11) == 0) == dateTime8.equals(dateTime11));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 70);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.Instant instant7 = instant4.minus((long) 600);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant8.withDurationAdded(readableDuration10, 26666);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime9", (instant12.compareTo(dateTime9) == 0) == instant12.equals(dateTime9));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        int int13 = localDate12.getWeekyear();
        int[] intArray14 = localDate12.getValues();
        int int15 = localDate12.getCenturyOfEra();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.withZone(dateTimeZone20);
        boolean boolean23 = dateTime19.isAfter((long) 4);
        org.joda.time.DateTime dateTime25 = dateTime19.minusMillis(53);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime19.getZone();
        org.joda.time.DateTime dateTime27 = localDate12.toDateTimeAtCurrentTime(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillisOfDay(900);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.clockhourOfDay();
        java.lang.String str36 = dateTimeField34.getAsShortText((long) 32769);
        long long38 = dateTimeField34.roundCeiling(0L);
        org.joda.time.DurationField durationField39 = dateTimeField34.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType40 = durationField39.getType();
        org.joda.time.DurationFieldType durationFieldType41 = durationField39.getType();
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        boolean boolean46 = durationFieldType42.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.millisOfSecond();
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(chronology44);
        boolean boolean49 = durationFieldType41.isSupported(chronology44);
        java.lang.String str50 = durationFieldType41.toString();
        org.joda.time.DateTime dateTime52 = dateTime27.withFieldAdded(durationFieldType41, 791);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime48", (dateTime2.compareTo(dateTime48) == 0) == dateTime2.equals(dateTime48));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar7 = dateTime4.toGregorianCalendar();
        gregorianCalendar7.set((int) 'a', (-457037), (int) (short) 10, 3, 34, 66556173);
        long long15 = gregorianCalendar7.getTimeInMillis();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("2022-02-24T11:11:59.999+59:12");
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("2022");
        int int20 = timeZone19.getRawOffset();
        timeZone19.setRawOffset(0);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone19);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("2022");
        int int26 = timeZone25.getRawOffset();
        timeZone25.setRawOffset(0);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25);
        java.lang.String str30 = timeZone25.getID();
        java.util.TimeZone timeZone32 = java.util.TimeZone.getTimeZone("2022");
        timeZone32.setID("French");
        java.util.TimeZone.setDefault(timeZone32);
        boolean boolean36 = timeZone25.hasSameRules(timeZone32);
        calendar23.setTimeZone(timeZone25);
        boolean boolean38 = timeZone17.hasSameRules(timeZone25);
        gregorianCalendar7.setTimeZone(timeZone17);
        java.util.Locale locale41 = new java.util.Locale("0_24");
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(timeZone17, locale41);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        java.lang.String str44 = dateTimeZone43.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar42", (calendar23.compareTo(calendar42) == 0) == calendar23.equals(calendar42));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = instant1.toDateTimeISO();
        int int5 = dateTime4.getSecondOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        org.joda.time.Instant instant7 = instant1.withMillis((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant10 = instant1.withDurationAdded(readableDuration8, 213120000);
        org.joda.time.Instant instant12 = instant10.minus(5443200001L);
        org.joda.time.MutableDateTime mutableDateTime13 = instant10.toMutableDateTime();
        org.joda.time.Instant instant15 = instant10.withMillis((long) 55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant10 and mutableDateTime13", (instant10.compareTo(mutableDateTime13) == 0) == instant10.equals(mutableDateTime13));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        java.util.Date date1 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant2 = new org.joda.time.Instant((java.lang.Object) date1);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DateTime dateTime4 = instant2.toDateTimeISO();
        org.joda.time.Instant instant7 = instant2.withDurationAdded(600032L, (int) 'x');
        org.joda.time.Instant instant10 = instant2.withDurationAdded((long) 162, 0);
        java.lang.String str11 = instant2.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant2", (dateTime4.compareTo(instant2) == 0) == dateTime4.equals(instant2));
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.year();
        org.joda.time.DurationField durationField5 = chronology1.days();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = chronology1.add(readablePeriod6, 1646723777197L, 19059);
        org.joda.time.Chronology chronology10 = chronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField13 = chronology10.eras();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = chronology10.add(readablePeriod14, 1646724033395L, 847);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField13", Math.signum(durationField5.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField5)));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        java.lang.String str14 = property13.getAsText();
        int int15 = property13.get();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = property13.compareTo((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate19.minusYears(10);
        int[] intArray24 = localDate19.getValues();
        chronology1.validate((org.joda.time.ReadablePartial) localDate16, intArray24);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        int int32 = dateTime30.getYear();
        org.joda.time.DateTime dateTime33 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        boolean boolean36 = localDate34.isSupported(durationFieldType35);
        int int37 = localDate34.size();
        org.joda.time.DateTime dateTime38 = dateTime33.withFields((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTime dateTime39 = localDate16.toDateTime((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology42 = localDate41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.minuteOfDay();
        boolean boolean44 = durationFieldType40.isSupported(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.yearOfEra();
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology42.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField48 = chronology42.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime38.toMutableDateTime(chronology42);
        org.joda.time.DateTime.Property property50 = dateTime38.dayOfMonth();
        org.joda.time.DateTime dateTime52 = dateTime38.minusHours(26501648);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime49", (dateTime10.compareTo(mutableDateTime49) == 0) == dateTime10.equals(mutableDateTime49));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.DateTime dateTime9 = dateTime6.plusSeconds(26176839);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.Instant instant12 = instant10.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant15 = instant12.withDurationAdded(readableDuration13, 51);
        org.joda.time.Instant instant16 = instant15.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.minus(readableDuration17);
        org.joda.time.Instant instant20 = instant18.plus(24352039164111L);
        org.joda.time.Instant instant23 = instant20.withDurationAdded((-61407838432136L), 33366);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        boolean boolean25 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant10", (dateTime2.compareTo(instant10) == 0) == dateTime2.equals(instant10));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours(437);
        long long13 = dateTimeZone11.convertUTCToLocal(1646723863664L);
        org.joda.time.MutableDateTime mutableDateTime14 = instant9.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime13 = dateTime10.minusMonths(0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.minus(readablePeriod14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusSeconds(999);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(48);
        long long23 = dateTimeZone20.adjustOffset((long) 2012, false);
        java.util.TimeZone timeZone24 = dateTimeZone20.toTimeZone();
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((java.lang.Object) 1646723940190L, dateTimeZone20);
        org.joda.time.DateTime dateTime26 = dateTime15.toDateTime(dateTimeZone20);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTimeISO();
        int int28 = dateTime26.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime27", (dateTime10.compareTo(mutableDateTime27) == 0) == dateTime10.equals(mutableDateTime27));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DurationField durationField4 = chronology1.eras();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = chronology1.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField4, durationField7, and durationField4", !(durationField4.compareTo(durationField7) == 0) || (Math.signum(durationField4.compareTo(durationField4)) == Math.signum(durationField7.compareTo(durationField4))));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime2.minusHours(0);
        org.joda.time.Instant instant11 = dateTime2.toInstant();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 391);
        org.joda.time.Instant instant16 = instant11.withDurationAdded(1646723870645L, 457423);
        org.joda.time.Instant instant19 = instant16.withDurationAdded(1646724219974L, (-5540824));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant11", (dateTime2.compareTo(instant11) == 0) == dateTime2.equals(instant11));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime8.toMutableDateTime(dateTimeZone11);
        int int15 = dateTime8.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime8.withPeriodAdded(readablePeriod16, (-27445));
        org.joda.time.DateTime.Property property19 = dateTime8.monthOfYear();
        org.joda.time.DurationField durationField20 = property19.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and mutableDateTime14", (dateTime8.compareTo(mutableDateTime14) == 0) == dateTime8.equals(mutableDateTime14));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DurationField durationField10 = chronology6.centuries();
        java.lang.String str11 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField12 = chronology6.centuryOfEra();
        org.joda.time.DurationField durationField13 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField9 = chronology2.minuteOfHour();
        org.joda.time.DurationField durationField10 = chronology2.millis();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology2.eras();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(5538134664L, chronology2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime.Property property7 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime9 = dateTime4.withYear((-1970));
        org.joda.time.DateTime dateTime11 = dateTime4.withYearOfEra(12);
        org.joda.time.DateTime dateTime13 = dateTime11.plusSeconds(26162278);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int19 = dateTimeZone17.getOffsetFromLocal(1646723759380L);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfDay();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.lang.String str28 = locale26.getDisplayVariant();
        java.lang.String str29 = dateTimeField24.getAsText((long) (short) 100, locale26);
        java.util.Set<java.lang.Character> charSet30 = locale26.getExtensionKeys();
        java.lang.String str31 = dateTimeZone17.getShortName((long) 66514147, locale26);
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale34 = java.util.Locale.getDefault(category33);
        java.util.Locale locale35 = java.util.Locale.getDefault(category33);
        java.util.Calendar.Builder builder36 = new java.util.Calendar.Builder();
        java.util.Calendar calendar37 = builder36.build();
        java.util.Calendar.Builder builder39 = builder36.setLenient(false);
        java.util.Calendar.Builder builder41 = builder39.setLenient(false);
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("yearOfCentury");
        java.util.Calendar.Builder builder44 = builder39.setLocale(locale43);
        java.util.Locale locale48 = new java.util.Locale("hi!", "", "");
        java.lang.String str49 = locale48.getDisplayScript();
        java.util.Locale locale53 = new java.util.Locale("hi!", "", "");
        java.lang.String str54 = locale48.getDisplayScript(locale53);
        java.lang.String str55 = locale48.getISO3Language();
        java.util.Locale locale56 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str57 = locale48.getDisplayName(locale56);
        java.lang.String str58 = locale43.getDisplayName(locale56);
        java.util.Locale.setDefault(category33, locale43);
        java.lang.String str60 = dateTimeZone17.getShortName((long) 1649, locale43);
        org.joda.time.DateTime dateTime61 = dateTime13.withZone(dateTimeZone17);
        java.lang.String str63 = dateTimeZone17.getName((long) 344);
        java.util.TimeZone timeZone65 = java.util.TimeZone.getTimeZone("2022");
        int int66 = timeZone65.getRawOffset();
        int int68 = timeZone65.getOffset(379209600000L);
        java.time.ZoneId zoneId69 = timeZone65.toZoneId();
        java.util.TimeZone timeZone71 = java.util.TimeZone.getTimeZone("2022");
        int int72 = timeZone71.getRawOffset();
        java.util.TimeZone.setDefault(timeZone71);
        java.util.TimeZone timeZone75 = java.util.TimeZone.getTimeZone("weekyear");
        boolean boolean76 = timeZone71.hasSameRules(timeZone75);
        boolean boolean77 = timeZone65.hasSameRules(timeZone71);
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forTimeZone(timeZone71);
        boolean boolean80 = dateTimeZone78.isStandardOffset((long) 436);
        int int82 = dateTimeZone78.getOffsetFromLocal(1646723751922L);
        java.lang.String str83 = dateTimeZone78.toString();
        long long85 = dateTimeZone17.getMillisKeepLocal(dateTimeZone78, (long) 264);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime61", (dateTime13.compareTo(dateTime61) == 0) == dateTime13.equals(dateTime61));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime8.toMutableDateTime(dateTimeZone11);
        int int15 = dateTime8.getMonthOfYear();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime8.withPeriodAdded(readablePeriod16, (-27445));
        org.joda.time.DateTime.Property property19 = dateTime8.monthOfYear();
        java.util.Locale locale21 = java.util.Locale.forLanguageTag("weekyears");
        java.lang.String str22 = locale21.toLanguageTag();
        java.util.Set<java.lang.String> strSet23 = locale21.getUnicodeLocaleKeys();
        java.util.Calendar calendar24 = dateTime8.toCalendar(locale21);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime14 and dateTime8", (mutableDateTime14.compareTo(dateTime8) == 0) == mutableDateTime14.equals(dateTime8));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTime dateTime1 = localDateTime0.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property8.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime10 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property8.roundHalfFloorCopy();
        int int12 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfFloorCopy();
        int int15 = property13.get();
        org.joda.time.Instant instant17 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime18 = instant17.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime19 = instant17.toMutableDateTime();
        org.joda.time.DateTime dateTime20 = instant17.toDateTimeISO();
        int int21 = property13.compareTo((org.joda.time.ReadableInstant) dateTime20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant17 and mutableDateTime18", (instant17.compareTo(mutableDateTime18) == 0) == instant17.equals(mutableDateTime18));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime7 = property5.addToCopy(9);
        org.joda.time.DateTime dateTime8 = property5.roundHalfFloorCopy();
        org.joda.time.Instant instant9 = dateTime8.toInstant();
        org.joda.time.Instant instant12 = instant9.withDurationAdded(1646723814995L, 46);
        org.joda.time.Chronology chronology13 = instant12.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant9", (dateTime8.compareTo(instant9) == 0) == dateTime8.equals(instant9));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        int int7 = dateTime5.getYear();
        org.joda.time.DateTime dateTime8 = dateTime5.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        boolean boolean11 = localDate9.isSupported(durationFieldType10);
        int int12 = localDate9.size();
        org.joda.time.DateTime dateTime13 = dateTime8.withFields((org.joda.time.ReadablePartial) localDate9);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime8.isSupported(dateTimeFieldType22);
        java.lang.String str25 = dateTimeFieldType22.getName();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.minuteOfDay();
        java.lang.String str30 = chronology27.toString();
        org.joda.time.DurationField durationField31 = chronology27.weeks();
        boolean boolean32 = dateTimeFieldType22.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField33 = chronology27.monthOfYear();
        org.joda.time.DateTimeField dateTimeField34 = chronology27.halfdayOfDay();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DateTimeField dateTimeField36 = chronology27.secondOfMinute();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(1646723921713L, chronology27);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime35", (dateTime3.compareTo(dateTime35) == 0) == dateTime3.equals(dateTime35));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationField durationField3 = chronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DateTimeField dateTimeField6 = chronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = chronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology1.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField7", (durationField3.compareTo(durationField7) == 0) == durationField3.equals(durationField7));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.plus((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant2.withDurationAdded(readableDuration3, 51);
        org.joda.time.Instant instant6 = instant5.toInstant();
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.plus(readableDuration8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and mutableDateTime7", (instant9.compareTo(mutableDateTime7) == 0) == instant9.equals(mutableDateTime7));
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 32769, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology8);
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        java.lang.String str16 = dateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) '4');
        org.joda.time.DateTime dateTime30 = dateTime9.toDateTime(dateTimeZone24);
        boolean boolean31 = calendar0.before((java.lang.Object) dateTime9);
        java.util.Date date32 = calendar0.getTime();
        java.util.TimeZone timeZone33 = calendar0.getTimeZone();
        java.util.Calendar calendar34 = java.util.Calendar.getInstance();
        int int36 = calendar34.getGreatestMinimum(11);
        calendar34.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone45 = java.util.TimeZone.getTimeZone("2022");
        int int46 = timeZone45.getRawOffset();
        calendar34.setTimeZone(timeZone45);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone50 = dateTimeZone49.toTimeZone();
        boolean boolean51 = timeZone45.hasSameRules(timeZone50);
        timeZone45.setID("GMT+00:00");
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate(chronology56);
        org.joda.time.LocalDate.Property property58 = localDate57.yearOfEra();
        org.joda.time.LocalDate localDate59 = property58.withMinimumValue();
        java.util.Locale locale60 = java.util.Locale.ITALIAN;
        boolean boolean61 = locale60.hasExtensions();
        int int62 = property58.getMaximumShortTextLength(locale60);
        java.lang.String str63 = locale60.getVariant();
        java.lang.String str64 = locale60.getDisplayVariant();
        java.util.Calendar calendar65 = java.util.Calendar.getInstance(timeZone45, locale60);
        java.lang.String str66 = timeZone33.getDisplayName(locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar65", (calendar0.compareTo(calendar65) == 0) == calendar0.equals(calendar65));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.plus(readableDuration3);
        org.joda.time.MutableDateTime mutableDateTime5 = instant1.toMutableDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(12L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant1.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime9 = instant1.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime14 = dateTime10.minusSeconds(66514147);
        int int15 = instant1.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property22 = dateTime21.weekOfWeekyear();
        org.joda.time.DateTime dateTime23 = property22.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.minus(readablePeriod24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime23.getZone();
        boolean boolean27 = dateTimeZone26.isFixed();
        java.lang.String str29 = dateTimeZone26.getShortName((long) 99);
        int int31 = dateTimeZone26.getOffset((long) 38);
        org.joda.time.DateTime dateTime32 = dateTime10.toDateTime(dateTimeZone26);
        org.joda.time.ReadableInstant readableInstant33 = null;
        boolean boolean34 = dateTime32.isBefore(readableInstant33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        java.lang.String str9 = property8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMillis((int) (short) -1);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withPeriodAdded(readablePeriod19, 8);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.minusMillis(600032);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusSeconds((int) (short) 100);
        int int26 = property8.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        int int27 = localDateTime25.size();
        org.joda.time.LocalDateTime.Property property28 = localDateTime25.yearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = property28.setCopy(26411601);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        int int33 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate localDate35 = localDate31.minusYears(10);
        int[] intArray36 = localDate31.getValues();
        org.joda.time.LocalDate.Property property37 = localDate31.era();
        org.joda.time.LocalDate localDate38 = property37.roundCeilingCopy();
        org.joda.time.LocalDate localDate40 = property37.addWrapFieldToCopy((-292275054));
        int int41 = property37.getLeapAmount();
        org.joda.time.LocalDate localDate42 = property37.roundHalfFloorCopy();
        java.lang.Object obj43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(obj43, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime49 = dateTime47.plusHours(4);
        java.util.GregorianCalendar gregorianCalendar50 = dateTime47.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.year();
        boolean boolean52 = dateTime47.isSupported(dateTimeFieldType51);
        org.joda.time.DurationFieldType durationFieldType53 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.minuteOfDay();
        boolean boolean57 = durationFieldType53.isSupported(chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.millisOfSecond();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology55);
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.minuteOfDay();
        java.lang.String str64 = chronology61.toString();
        org.joda.time.DateTime dateTime65 = dateTime59.withChronology(chronology61);
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType51.getField(chronology61);
        int int67 = localDate42.get(dateTimeFieldType51);
        boolean boolean68 = localDateTime30.isSupported(dateTimeFieldType51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime59", (dateTime2.compareTo(dateTime59) == 0) == dateTime2.equals(dateTime59));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.plusMonths((int) (short) -1);
        org.joda.time.Instant instant16 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime17 = instant16.toDateTimeISO();
        org.joda.time.LocalDateTime localDateTime18 = dateTime17.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant16", (dateTime3.compareTo(instant16) == 0) == dateTime3.equals(instant16));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant5 = instant1.withDurationAdded((long) 12, 80982);
        org.joda.time.Instant instant8 = instant5.withDurationAdded((long) 689, 29);
        boolean boolean10 = instant5.isEqual(987190269392328L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        int int18 = dateTime16.getHourOfDay();
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.DateTime dateTime22 = property19.setCopy(21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.minusMillis(0);
        org.joda.time.LocalTime localTime27 = localTime23.withMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(chronology28);
        org.joda.time.DurationField durationField30 = chronology28.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        org.joda.time.Instant instant7 = instant1.withMillis(1646723868942L);
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        int int13 = dateTime7.getCenturyOfEra();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfDay();
        java.lang.String str18 = chronology15.toString();
        org.joda.time.DurationField durationField19 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.hourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology15.hours();
        org.joda.time.DurationField durationField22 = chronology15.months();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime7.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime7.toDateTimeISO();
        org.joda.time.DateTime.Property property25 = dateTime7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime23", (dateTime7.compareTo(mutableDateTime23) == 0) == dateTime7.equals(mutableDateTime23));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        int int16 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        int int22 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate localDate24 = localDate20.minusYears(10);
        int[] intArray25 = localDate20.getValues();
        chronology2.validate((org.joda.time.ReadablePartial) localDate17, intArray25);
        org.joda.time.DateTimeField dateTimeField27 = chronology2.weekyear();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj0, chronology2);
        org.joda.time.DateTimeField dateTimeField29 = chronology2.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime28", (dateTime11.compareTo(dateTime28) == 0) == dateTime11.equals(dateTime28));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        boolean boolean7 = dateTime3.isAfter((long) 4);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMillis(53);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfDay();
        long long17 = chronology11.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        int int25 = property23.get();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        int int28 = property23.compareTo((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate localDate33 = localDate29.minusYears(10);
        int[] intArray34 = localDate29.getValues();
        chronology11.validate((org.joda.time.ReadablePartial) localDate26, intArray34);
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property41 = dateTime40.weekyear();
        java.lang.String str42 = property41.getAsText();
        int int43 = property41.get();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        int int46 = property41.compareTo((org.joda.time.ReadablePartial) localDate44);
        org.joda.time.LocalDate localDate48 = localDate44.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalDate localDate50 = localDate48.plus(readablePeriod49);
        org.joda.time.DateTime dateTime51 = localDate48.toDateTimeAtCurrentTime();
        boolean boolean52 = localDate26.isAfter((org.joda.time.ReadablePartial) localDate48);
        java.lang.Object obj53 = null;
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(obj53, dateTimeZone54);
        org.joda.time.DateTime dateTime57 = dateTime55.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property58 = dateTime57.weekyear();
        int int59 = dateTime57.getYear();
        org.joda.time.DateTime dateTime60 = dateTime57.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean64 = dateTimeZone63.isFixed();
        int int66 = dateTimeZone63.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime67 = dateTime60.withZoneRetainFields(dateTimeZone63);
        java.lang.String str69 = dateTimeZone63.getShortName((long) 5);
        org.joda.time.DateTime dateTime70 = localDate26.toDateTimeAtStartOfDay(dateTimeZone63);
        org.joda.time.DateTime dateTime71 = dateTime3.toDateTime(dateTimeZone63);
        org.joda.time.DateTimeZone dateTimeZone72 = dateTime3.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime71", (dateTime3.compareTo(dateTime71) == 0) == dateTime3.equals(dateTime71));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.minus(readableDuration2);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant3.minus(readableDuration5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime4", (instant6.compareTo(mutableDateTime4) == 0) == instant6.equals(mutableDateTime4));
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtCurrentTime();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        java.lang.String str9 = property8.getAsText();
        int int10 = property8.get();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = property8.compareTo((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate15 = localDate11.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate15.plus(readablePeriod16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int19 = localDate17.get(dateTimeFieldType18);
        java.lang.String str21 = localDate17.toString("24");
        org.joda.time.DateMidnight dateMidnight22 = localDate17.toDateMidnight();
        int int23 = localDate17.getDayOfWeek();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        int int26 = localDate24.getDayOfWeek();
        boolean boolean28 = localDate24.equals((java.lang.Object) 2022);
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property34 = dateTime33.weekyear();
        int int35 = dateTime33.getYear();
        org.joda.time.DateTime dateTime36 = dateTime33.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.hours();
        boolean boolean39 = localDate37.isSupported(durationFieldType38);
        int int40 = localDate37.size();
        org.joda.time.DateTime dateTime41 = dateTime36.withFields((org.joda.time.ReadablePartial) localDate37);
        java.lang.Object obj42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(obj42, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = dateTime44.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property47 = dateTime46.weekyear();
        java.lang.String str48 = property47.getAsText();
        org.joda.time.DurationField durationField49 = property47.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property47.getFieldType();
        java.lang.String str51 = dateTimeFieldType50.toString();
        boolean boolean52 = dateTime36.isSupported(dateTimeFieldType50);
        int int53 = localDate24.indexOf(dateTimeFieldType50);
        boolean boolean54 = localDate17.isSupported(dateTimeFieldType50);
        int int55 = localDate17.getMonthOfYear();
        org.joda.time.DateTime dateTime56 = localDate17.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime57 = dateTime2.withFields((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Instant instant59 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime60 = instant59.toMutableDateTimeISO();
        org.joda.time.Instant instant63 = instant59.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime64 = instant59.toDateTimeISO();
        org.joda.time.Instant instant67 = instant59.withDurationAdded((long) 12, 23);
        org.joda.time.ReadableDuration readableDuration68 = null;
        org.joda.time.Instant instant69 = instant59.plus(readableDuration68);
        org.joda.time.MutableDateTime mutableDateTime70 = instant69.toMutableDateTime();
        boolean boolean71 = dateTime57.isBefore((org.joda.time.ReadableInstant) mutableDateTime70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant59 and mutableDateTime60", (instant59.compareTo(mutableDateTime60) == 0) == instant59.equals(mutableDateTime60));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalTime localTime5 = property2.addNoWrapToCopy(4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        org.joda.time.LocalTime localTime8 = property6.roundCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZoneUTC();
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) (short) 100);
        int int27 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter13.withZone(dateTimeZone22);
        java.lang.String str30 = dateTimeZone22.getShortName((long) 10);
        java.lang.String str31 = dateTimeZone22.getID();
        org.joda.time.Instant instant32 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime33 = instant32.toDateTimeISO();
        int int34 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean35 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.Instant instant38 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime39 = instant38.toMutableDateTimeISO();
        org.joda.time.Instant instant42 = instant38.withDurationAdded((-1893235578000L), 4);
        org.joda.time.DateTime dateTime43 = instant38.toDateTimeISO();
        org.joda.time.Instant instant46 = instant38.withDurationAdded((long) 12, 23);
        boolean boolean47 = dateTime33.isAfter((org.joda.time.ReadableInstant) instant46);
        org.joda.time.Instant instant48 = instant46.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant32 and dateTime33", (instant32.compareTo(dateTime33) == 0) == instant32.equals(dateTime33));
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str4 = dateTimeZone2.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        boolean boolean6 = dateTimeZone2.isFixed();
        java.lang.String str8 = dateTimeZone2.getNameKey((long) 2024);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 6, dateTimeZone2);
        long long12 = dateTimeZone2.adjustOffset(1646724055106L, false);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        long long19 = dateTime17.getMillis();
        org.joda.time.DateTime.Property property20 = dateTime17.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.era();
        org.joda.time.LocalDateTime localDateTime31 = property30.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.dayOfYear();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusDays(100);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withEra(0);
        boolean boolean39 = dateTimeZone23.isLocalDateTimeGap(localDateTime38);
        long long41 = dateTimeZone2.getMillisKeepLocal(dateTimeZone23, 1646724010575L);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(obj0, dateTimeZone2);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime26", (dateTime15.compareTo(dateTime26) == 0) == dateTime15.equals(dateTime26));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime4.toDateTime();
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        boolean boolean8 = property7.isLeap();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("2022");
        int int11 = timeZone10.getRawOffset();
        timeZone10.setRawOffset(0);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10);
        java.lang.String str15 = timeZone10.getID();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        long long23 = chronology17.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.minuteOfHour();
        org.joda.time.DurationField durationField25 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField26 = chronology17.hourOfHalfday();
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.lang.String str30 = dateTimeField26.getAsShortText((int) (byte) 10, locale28);
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(timeZone10, locale28);
        java.lang.String str32 = property7.getAsText(locale28);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(locale28);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.fromCalendarFields(calendar33);
        org.joda.time.LocalDate localDate36 = localDate34.withWeekyear(23142);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar14 and calendar33", (calendar14.compareTo(calendar33) == 0) == calendar14.equals(calendar33));
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        int int18 = dateTime16.getHourOfDay();
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        java.lang.String str20 = property19.getAsShortText();
        org.joda.time.DateTime dateTime22 = property19.setCopy(21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime25 = localTime23.minusMillis(0);
        org.joda.time.LocalTime localTime27 = localTime23.withMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and dateTime29", (dateTime22.compareTo(dateTime29) == 0) == dateTime22.equals(dateTime29));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.withEarlierOffsetAtOverlap();
        int int12 = dateTime7.getDayOfMonth();
        java.lang.Object obj13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        java.util.Date date16 = localDate14.toDate();
        org.joda.time.LocalDate localDate18 = localDate14.minusMonths(292278993);
        org.joda.time.LocalDate localDate20 = localDate14.withYearOfEra(26176839);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey(0L);
        boolean boolean24 = dateTimeZone21.isFixed();
        org.joda.time.DateTime dateTime25 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj13, dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime7.toDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfYear(163);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        java.lang.String str8 = property7.getAsText();
        int int9 = property7.get();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = property7.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate14 = localDate10.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate15 = localDate1.withFields((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate17 = localDate1.plusYears(20);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate20 = localDate1.withPeriodAdded(readablePeriod18, 4);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfEra(5);
        org.joda.time.LocalDate.Property property23 = localDate22.monthOfYear();
        org.joda.time.LocalDate localDate25 = property23.addToCopy(27746803);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillisOfSecond((int) (byte) 1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) ' ', chronology31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekyear(66594065);
        org.joda.time.DateTime dateTime36 = dateTime32.plusMonths(494);
        int int37 = dateTime36.getEra();
        int int38 = dateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime40 = dateTime36.plusMonths(791);
        long long41 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime43 = instant42.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant42.minus(readableDuration44);
        org.joda.time.MutableDateTime mutableDateTime46 = instant45.toMutableDateTimeISO();
        long long47 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and instant42", (dateTime4.compareTo(instant42) == 0) == dateTime4.equals(instant42));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime14 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((-27445));
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime19 = localTime17.minusMillis(0);
        org.joda.time.LocalTime localTime21 = localTime17.withMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime14.toDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime14.withMinuteOfHour(32);
        org.joda.time.DateTime dateTime26 = dateTime25.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime23", (dateTime4.compareTo(dateTime23) == 0) == dateTime4.equals(dateTime23));
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime3 = instant1.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = instant1.toDateTimeISO();
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis(257353426800000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime2", (instant1.compareTo(mutableDateTime2) == 0) == instant1.equals(mutableDateTime2));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        gregorianCalendar7.setFirstDayOfWeek(0);
        gregorianCalendar7.clear();
        java.util.TimeZone timeZone28 = java.util.TimeZone.getTimeZone("2022");
        int int29 = timeZone28.getRawOffset();
        timeZone28.setRawOffset(0);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone28);
        java.util.TimeZone timeZone34 = java.util.TimeZone.getTimeZone("2022");
        int int35 = timeZone34.getRawOffset();
        timeZone34.setRawOffset(0);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance(timeZone34);
        java.lang.String str39 = timeZone34.getID();
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("2022");
        timeZone41.setID("French");
        java.util.TimeZone.setDefault(timeZone41);
        boolean boolean45 = timeZone34.hasSameRules(timeZone41);
        calendar32.setTimeZone(timeZone34);
        java.util.Date date48 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant49 = new org.joda.time.Instant((java.lang.Object) date48);
        calendar32.setTime(date48);
        java.lang.String str51 = date48.toLocaleString();
        gregorianCalendar7.setTime(date48);
        int int53 = date48.getSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on gregorianCalendar7 and calendar32", (gregorianCalendar7.compareTo(calendar32) == 0) == gregorianCalendar7.equals(calendar32));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime6.plus(readableDuration11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime15 = dateTime6.withPeriodAdded(readablePeriod13, 2022);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime27.toDateTimeToday(dateTimeZone30);
        boolean boolean33 = dateTime31.isAfter((long) 2);
        org.joda.time.DateTime dateTime35 = dateTime31.minusDays(1);
        org.joda.time.DateTime dateTime37 = dateTime31.minusHours((-1));
        java.lang.String str38 = dateTime31.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone40);
        org.joda.time.LocalTime localTime43 = localTime41.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localTime41.toDateTimeToday(dateTimeZone44);
        int int46 = dateTime45.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int48 = dateTime45.get(dateTimeFieldType47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone50);
        org.joda.time.LocalTime localTime53 = localTime51.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateTime dateTime55 = localTime51.toDateTimeToday(dateTimeZone54);
        int int56 = dateTime45.compareTo((org.joda.time.ReadableInstant) dateTime55);
        boolean boolean57 = dateTime31.isAfter((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime31.toMutableDateTimeISO();
        boolean boolean60 = dateTime31.isBefore((-5679974778000L));
        org.joda.time.Chronology chronology61 = dateTime31.getChronology();
        org.joda.time.DateTime dateTime62 = dateTime24.withChronology(chronology61);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long69 = dateTimeZone65.convertLocalToUTC((long) 28, true, 1017118800002L);
        org.joda.time.Chronology chronology70 = chronology61.withZone(dateTimeZone65);
        org.joda.time.DateTime dateTime71 = dateTime15.toDateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime73 = dateTime71.withYear(18);
        org.joda.time.DateTime dateTime75 = dateTime71.minusMonths(558);
        org.joda.time.DateTime dateTime76 = dateTime75.withTimeAtStartOfDay();
        org.joda.time.DateMidnight dateMidnight77 = dateTime75.toDateMidnight();
        org.joda.time.DateTime dateTime79 = dateTime75.plusYears(872);
        boolean boolean80 = dateTime75.isEqualNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime71", (dateTime6.compareTo(dateTime71) == 0) == dateTime6.equals(dateTime71));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        org.joda.time.Chronology chronology8 = dateTime2.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology8.hours();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYear(22);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.monthOfYear();
        int int21 = localDateTime16.getValue(0);
        long long23 = chronology8.set((org.joda.time.ReadablePartial) localDateTime16, 1646723961729L);
        org.joda.time.DurationField durationField24 = chronology8.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField9, and durationField11", !(durationField24.compareTo(durationField9) == 0) || (Math.signum(durationField24.compareTo(durationField11)) == Math.signum(durationField9.compareTo(durationField11))));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(chronology1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime8 = localDate5.toDateTimeAtStartOfDay(dateTimeZone7);
        int int9 = localDate5.getYearOfEra();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime16 = property15.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar17 = dateTime16.toGregorianCalendar();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate18.minusYears(10);
        int[] intArray23 = localDate18.getValues();
        org.joda.time.LocalDate.Property property24 = localDate18.era();
        boolean boolean25 = gregorianCalendar17.before((java.lang.Object) property24);
        org.joda.time.LocalDate localDate26 = property24.roundHalfFloorCopy();
        org.joda.time.DurationField durationField27 = property24.getDurationField();
        org.joda.time.LocalDate localDate28 = property24.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.toDateTime(dateTimeZone33);
        org.joda.time.DateTime.Property property35 = dateTime34.weekOfWeekyear();
        org.joda.time.DateTime dateTime36 = property35.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readablePeriod37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readableDuration39);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj41, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property46 = dateTime45.weekyear();
        java.lang.String str47 = property46.getAsText();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology49);
        org.joda.time.LocalDate.Property property51 = localDate50.yearOfEra();
        org.joda.time.LocalDate localDate52 = property51.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime53 = localDate52.toDateTimeAtMidnight();
        int int54 = property46.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = property46.setCopy((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property46.getFieldType();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology59 = localDate58.getChronology();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(chronology59);
        org.joda.time.LocalDate.Property property61 = localDate60.yearOfEra();
        org.joda.time.LocalDate localDate63 = localDate60.minusDays((int) '#');
        org.joda.time.Chronology chronology64 = localDate63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType57.getField(chronology64);
        boolean boolean66 = dateTime38.isSupported(dateTimeFieldType57);
        boolean boolean67 = localDate28.isSupported(dateTimeFieldType57);
        int int68 = localDate5.indexOf(dateTimeFieldType57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField27", Math.signum(durationField3.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField3)));
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property8 = dateTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) '4');
        org.joda.time.DateTime dateTime22 = dateTime7.toDateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        boolean boolean25 = dateTime7.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime dateTime27 = dateTime7.plusMonths(66850);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.withDurationAdded(readableDuration28, 27435044);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime22", (dateTime4.compareTo(dateTime22) == 0) == dateTime4.equals(dateTime22));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime14 = dateTime7.withZoneRetainFields(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.weekOfWeekyear();
        org.joda.time.DateTime dateTime22 = property21.roundCeilingCopy();
        boolean boolean23 = dateTime7.isBefore((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime7.withCenturyOfEra(22);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.minuteOfDay();
        boolean boolean30 = durationFieldType26.isSupported(chronology28);
        org.joda.time.DurationField durationField31 = chronology28.eras();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) dateTime7, chronology28);
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(obj33, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property38 = dateTime37.weekyear();
        int int39 = dateTime37.getYear();
        org.joda.time.DateTime dateTime40 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean44 = dateTimeZone43.isFixed();
        int int46 = dateTimeZone43.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime47 = dateTime40.withZoneRetainFields(dateTimeZone43);
        long long49 = dateTimeZone43.convertUTCToLocal((long) (-292275054));
        long long51 = dateTimeZone43.nextTransition((long) 66571079);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.Chronology chronology53 = chronology28.withZone(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and dateTime52", (dateTime35.compareTo(dateTime52) == 0) == dateTime35.equals(dateTime52));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(12);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        boolean boolean16 = dateTime14.isAfter((long) 2);
        org.joda.time.DateTime dateTime18 = dateTime14.minusDays(1);
        org.joda.time.DateTime dateTime20 = dateTime14.minusHours((-1));
        java.lang.String str21 = dateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTime dateTime25 = dateTime14.toDateTime(dateTimeZone24);
        java.util.Calendar.Builder builder27 = new java.util.Calendar.Builder();
        java.util.Calendar calendar28 = builder27.build();
        java.util.Calendar.Builder builder33 = builder27.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("2022");
        timeZone35.setID("French");
        java.util.Calendar.Builder builder38 = builder33.setTimeZone(timeZone35);
        java.util.Calendar.Builder builder42 = builder33.setTimeOfDay(19059, 366, (int) (short) -1);
        java.util.Locale locale43 = java.util.Locale.CHINA;
        boolean boolean44 = locale43.hasExtensions();
        java.util.Locale locale47 = new java.util.Locale("24", "hi!");
        java.lang.String str48 = locale43.getDisplayLanguage(locale47);
        java.util.Calendar.Builder builder49 = builder33.setLocale(locale47);
        java.lang.String str50 = dateTimeZone24.getShortName(1645514264031L, locale47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = dateTimeFormatter2.withZone(dateTimeZone24);
        java.util.TimeZone timeZone52 = dateTimeZone24.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and dateTime25", (dateTime14.compareTo(dateTime25) == 0) == dateTime14.equals(dateTime25));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = property5.getAsText(locale6);
        org.joda.time.LocalTime localTime9 = property5.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        boolean boolean18 = dateTime16.isAfter((long) 2);
        org.joda.time.DateTime dateTime20 = dateTime16.minusDays(1);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean26 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime20.year();
        boolean boolean29 = property5.equals((java.lang.Object) dateTime20);
        org.joda.time.LocalTime localTime31 = property5.addWrapFieldToCopy(66789177);
        org.joda.time.Instant instant33 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime34 = instant33.toDateTimeISO();
        long long35 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalTime localTime37 = property5.addWrapFieldToCopy(57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant33 and dateTime34", (instant33.compareTo(dateTime34) == 0) == instant33.equals(dateTime34));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.Instant instant19 = dateTime6.toInstant();
        org.joda.time.Instant instant21 = instant19.minus((long) 8);
        org.joda.time.Instant instant22 = instant19.toInstant();
        org.joda.time.Instant instant24 = instant19.minus((long) 59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and instant19", (dateTime6.compareTo(instant19) == 0) == dateTime6.equals(instant19));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        int int18 = dateTime16.getHourOfDay();
        org.joda.time.DateTime.Property property19 = dateTime16.centuryOfEra();
        org.joda.time.DateTime dateTime21 = property19.addWrapFieldToCopy(8);
        org.joda.time.DateTime dateTime22 = property19.roundCeilingCopy();
        org.joda.time.DateTime dateTime24 = property19.setCopy((int) (short) 0);
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        org.joda.time.DateTime dateTime31 = property30.roundCeilingCopy();
        org.joda.time.DateTime dateTime33 = dateTime31.withCenturyOfEra((int) ' ');
        boolean boolean34 = dateTime33.isBeforeNow();
        boolean boolean35 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        int int38 = localDate36.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate36.minusYears(10);
        int[] intArray41 = localDate36.getValues();
        org.joda.time.LocalDate.Property property42 = localDate36.era();
        org.joda.time.LocalDate.Property property43 = localDate36.dayOfYear();
        org.joda.time.LocalDate localDate45 = property43.addWrapFieldToCopy(6);
        org.joda.time.LocalDate localDate46 = property43.withMinimumValue();
        int int47 = localDate46.getYearOfCentury();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.yearOfCentury();
        org.joda.time.DurationField durationField52 = chronology50.weeks();
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(chronology50);
        org.joda.time.LocalDate localDate54 = org.joda.time.LocalDate.now(chronology50);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHours(0);
        org.joda.time.DateTime dateTime57 = localDate54.toDateTimeAtStartOfDay(dateTimeZone56);
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate(1646723868410L, dateTimeZone56);
        org.joda.time.Interval interval59 = localDate46.toInterval(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime24.toMutableDateTime(dateTimeZone56);
        int int61 = dateTime24.getWeekyear();
        org.joda.time.DateTime dateTime63 = dateTime24.withWeekyear(66548193);
        org.joda.time.LocalDateTime localDateTime64 = dateTime63.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime60", (dateTime24.compareTo(mutableDateTime60) == 0) == dateTime24.equals(mutableDateTime60));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1646723752816L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 70);
        org.joda.time.Instant instant5 = instant4.toInstant();
        org.joda.time.Instant instant7 = instant4.minus((long) 600);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.DateTime dateTime9 = instant8.toDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant8.withDurationAdded(readableDuration10, 292275055);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime9", (instant12.compareTo(dateTime9) == 0) == instant12.equals(dateTime9));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean10 = dateTime8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.minusMillis((int) (short) 0);
        org.joda.time.DateTime dateTime14 = dateTime8.withSecondOfMinute((int) (short) 10);
        org.joda.time.Instant instant15 = dateTime8.toInstant();
        org.joda.time.DateTime dateTime17 = dateTime8.minusMillis(245);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and instant15", (dateTime8.compareTo(instant15) == 0) == dateTime8.equals(instant15));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        int int9 = dateTime8.getMillisOfDay();
        org.joda.time.DateTime.Property property10 = dateTime8.millisOfSecond();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.clockhourOfDay();
        org.joda.time.DateTime dateTime16 = dateTime8.withChronology(chronology12);
        org.joda.time.Chronology chronology17 = chronology12.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.withDayOfYear(24);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTime dateTime12 = dateTime4.withChronology(chronology9);
        int int13 = dateTime4.getHourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime4.minusDays(435);
        long long16 = dateTime15.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime12", (dateTime4.compareTo(dateTime12) == 0) == dateTime4.equals(dateTime12));
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.minus(readableDuration9);
        int int11 = dateTime4.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime4.minusMillis(12);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime8", (dateTime2.compareTo(dateTime8) == 0) == dateTime2.equals(dateTime8));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.yearOfCentury();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 32769, chronology11);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now(chronology11);
        long long18 = chronology11.add(1646723809228L, (long) 2, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone19 = chronology11.getZone();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        long long23 = chronology11.add(readablePeriod20, 1646723860263L, 21);
        org.joda.time.DateTime dateTime24 = dateTime8.withChronology(chronology11);
        org.joda.time.Instant instant25 = dateTime24.toInstant();
        org.joda.time.DateTime dateTime26 = instant25.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime24", (dateTime3.compareTo(dateTime24) == 0) == dateTime3.equals(dateTime24));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = dateTime2.getZone();
        org.joda.time.DateTime dateTime5 = dateTime2.minusSeconds((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight7 = dateTime2.toDateMidnight();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime2.minus(readableDuration8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.weeks();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(chronology12);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(1646723796784L, chronology12);
        org.joda.time.DateTimeField dateTimeField18 = chronology12.minuteOfHour();
        long long20 = dateTimeField18.roundHalfFloor(3L);
        int int21 = dateTime2.get(dateTimeField18);
        long long23 = dateTimeField18.remainder(1646723924071L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime2", (instant1.compareTo(dateTime2) == 0) == instant1.equals(dateTime2));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekOfWeekyear(11);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        org.joda.time.DateTime dateTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.withCenturyOfEra((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str19 = dateTimeZone17.getNameKey(0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) dateTime14, dateTimeZone17);
        org.joda.time.DateTime dateTime21 = dateTime3.withZone(dateTimeZone17);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(1645514624863L, dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime21", (dateTime3.compareTo(dateTime21) == 0) == dateTime3.equals(dateTime21));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DurationField durationField16 = property14.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property14.getFieldType();
        java.lang.String str18 = dateTimeFieldType17.toString();
        boolean boolean19 = dateTime8.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology22 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.minuteOfDay();
        boolean boolean24 = durationFieldType20.isSupported(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.millisOfSecond();
        java.lang.String str26 = chronology22.toString();
        org.joda.time.DurationField durationField27 = chronology22.halfdays();
        org.joda.time.DateTime dateTime28 = dateTime8.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField29 = chronology22.dayOfWeek();
        java.util.Locale locale30 = java.util.Locale.CHINA;
        boolean boolean31 = locale30.hasExtensions();
        java.util.Set<java.lang.String> strSet32 = locale30.getUnicodeLocaleAttributes();
        java.util.Locale locale33 = locale30.stripExtensions();
        int int34 = dateTimeField29.getMaximumShortTextLength(locale33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime28", (dateTime8.compareTo(dateTime28) == 0) == dateTime8.equals(dateTime28));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime5 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis(2026);
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime7);
        org.joda.time.DateTime dateTime10 = dateTime7.minusSeconds(66609);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant8", (dateTime7.compareTo(instant8) == 0) == dateTime7.equals(instant8));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime5 = dateTime2.withLaterOffsetAtOverlap();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime12 = property11.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra((int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) (byte) 0);
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.format.DateTimePrinter dateTimePrinter18 = null;
        org.joda.time.format.DateTimeParser dateTimeParser19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter18, dateTimeParser19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withZoneUTC();
        boolean boolean22 = dateTimeFormatter21.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeFormatter21.getZone();
        org.joda.time.DateTime dateTime24 = dateTime2.toDateTime(dateTimeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        java.util.Date date27 = localDate25.toDate();
        org.joda.time.LocalDate localDate29 = localDate25.minusYears(26176839);
        int int30 = localDate25.getWeekyear();
        org.joda.time.LocalDate localDate32 = localDate25.plusMonths(665258);
        org.joda.time.LocalDate localDate34 = localDate32.withYear((-284887288));
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) (-52));
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfCentury();
        org.joda.time.LocalDate localDate38 = property37.withMaximumValue();
        org.joda.time.LocalDate localDate40 = localDate38.minusYears(63);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getDurationType();
        org.joda.time.LocalDate localDate44 = localDate40.withFieldAdded(durationFieldType42, 66694859);
        boolean boolean45 = localDate32.isSupported(durationFieldType42);
        org.joda.time.DateTime dateTime47 = dateTime2.withFieldAdded(durationFieldType42, 341);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime24", (mutableDateTime3.compareTo(dateTime24) == 0) == mutableDateTime3.equals(dateTime24));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) (short) 100);
        int int19 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime4.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths((int) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.plusMillis((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readableDuration25);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMillis(67);
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfYear();
        org.joda.time.DateTime dateTime30 = property29.withMinimumValue();
        org.joda.time.DateTime dateTime31 = property29.roundHalfCeilingCopy();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime31.plus(readableDuration32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withYear(22);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withMinuteOfHour(10);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj41, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property46 = dateTime45.weekyear();
        long long47 = dateTime45.getMillis();
        org.joda.time.DateTime.Property property48 = dateTime45.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime45, dateTimeZone51);
        int int53 = localDateTime38.compareTo((org.joda.time.ReadablePartial) localDateTime52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime52.yearOfCentury();
        org.joda.time.Chronology chronology55 = localDateTime52.getChronology();
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.DateTime dateTime57 = dateTime33.toDateTime(chronology55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime56", (dateTime2.compareTo(dateTime56) == 0) == dateTime2.equals(dateTime56));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime4 = instant3.toDateTimeISO();
        org.joda.time.Instant instant5 = instant3.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean7 = instant3.isSupported(dateTimeFieldType6);
        int int8 = localTime1.indexOf(dateTimeFieldType6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and dateTime4", (instant3.compareTo(dateTime4) == 0) == instant3.equals(dateTime4));
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.minus(readableDuration9);
        int int11 = dateTime4.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime4.minusMillis(12);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime16.minus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime16.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
        boolean boolean23 = dateTime4.isSupported(dateTimeFieldType22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime8", (dateTime4.compareTo(dateTime8) == 0) == dateTime4.equals(dateTime8));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime6.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime10 = dateTime6.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = dateTime6.minusMonths(22);
        int int13 = dateTime12.getSecondOfDay();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.monthOfYear();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(chronology15);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology15.add(readablePeriod19, (long) 435, (int) 'a');
        org.joda.time.DateTimeField dateTimeField23 = chronology15.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime12.toMutableDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and mutableDateTime24", (dateTime12.compareTo(mutableDateTime24) == 0) == dateTime12.equals(mutableDateTime24));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.plusMonths((int) (short) -1);
        org.joda.time.Instant instant16 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime17 = instant16.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant16.plus(readableDuration18);
        long long20 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant16", (dateTime3.compareTo(instant16) == 0) == dateTime3.equals(instant16));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime5 = dateTime1.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 32769, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(chronology8);
        org.joda.time.DurationField durationField12 = chronology8.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime11", (dateTime1.compareTo(dateTime11) == 0) == dateTime1.equals(dateTime11));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.minus(readablePeriod8);
        int int10 = dateTime7.getMinuteOfDay();
        org.joda.time.DateTime dateTime11 = dateTime7.withEarlierOffsetAtOverlap();
        int int12 = dateTime7.getDayOfMonth();
        java.lang.Object obj13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        java.util.Date date16 = localDate14.toDate();
        org.joda.time.LocalDate localDate18 = localDate14.minusMonths(292278993);
        org.joda.time.LocalDate localDate20 = localDate14.withYearOfEra(26176839);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey(0L);
        boolean boolean24 = dateTimeZone21.isFixed();
        org.joda.time.DateTime dateTime25 = localDate20.toDateTimeAtCurrentTime(dateTimeZone21);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj13, dateTimeZone21);
        org.joda.time.DateTime dateTime27 = dateTime7.toDateTime(dateTimeZone21);
        boolean boolean28 = dateTime27.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str30 = dateTimeFieldType29.toString();
        int int31 = dateTime27.get(dateTimeFieldType29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime26", (dateTime1.compareTo(dateTime26) == 0) == dateTime1.equals(dateTime26));
    }
}

