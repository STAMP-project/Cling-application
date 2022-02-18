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
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology26 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        mutableDateTime21.setChronology(chronology26);
        org.joda.time.DateTimeZone dateTimeZone30 = chronology26.getZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime21", (dateTime9.compareTo(mutableDateTime21) == 0) == dateTime9.equals(mutableDateTime21));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        int[] intArray6 = localDateTime3.getValues();
        int int7 = localDateTime3.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusMinutes(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj16 = null;
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(obj16, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDateTime13.toDateTime(dateTimeZone18);
        boolean boolean23 = dateTime21.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime25 = dateTime21.minusMinutes((int) (short) 10);
        long long26 = dateTime25.getMillis();
        org.joda.time.Chronology chronology27 = dateTime25.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime25.plusHours((int) (short) 10);
        java.lang.Object obj30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj30, dateTimeZone32);
        int int36 = dateTimeZone32.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone32);
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = dateTimeZone32.getShortName(1644572330264L, locale40);
        java.lang.String str42 = dateTimeZone32.getID();
        org.joda.time.DateTime dateTime43 = localDateTime11.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime11.plusDays(292278993);
        int int46 = localDateTime11.getDayOfYear();
        java.util.TimeZone timeZone47 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId48 = timeZone47.toZoneId();
        int int50 = timeZone47.getOffset(1644572333371L);
        boolean boolean51 = timeZone47.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        long long54 = dateTimeZone52.convertUTCToLocal(1644572348441L);
        org.joda.time.DateTime dateTime55 = localDateTime11.toDateTime(dateTimeZone52);
        org.joda.time.LocalDate localDate56 = localDateTime11.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime43 and dateTime55", (dateTime43.compareTo(dateTime55) == 0) == dateTime43.equals(dateTime55));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.seconds();
        org.joda.time.DurationField durationField7 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfSecond();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) 1644572334300L, chronology5);
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField7", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime22 = property20.setCopy(10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime25 = dateTime22.withPeriodAdded(readablePeriod23, 4044);
        java.lang.String str26 = dateTime25.toString();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.monthOfYear();
        org.joda.time.LocalDateTime localDateTime31 = property29.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology32 = localDateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone34 = chronology32.getZone();
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTime dateTime36 = dateTime25.withChronology(chronology32);
        org.joda.time.DateTime.Property property37 = dateTime36.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime35", (dateTime15.compareTo(dateTime35) == 0) == dateTime15.equals(dateTime35));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        int int20 = dateTime17.getYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        boolean boolean32 = dateTime17.equals((java.lang.Object) property31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj33, dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime17.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(13);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.monthOfYear();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusSeconds((int) (byte) -1);
        boolean boolean57 = localDateTime49.isEqual((org.joda.time.ReadablePartial) localDateTime54);
        int int58 = localDateTime49.getHourOfDay();
        org.joda.time.Chronology chronology59 = localDateTime49.getChronology();
        org.joda.time.DateTime dateTime60 = dateTime47.withChronology(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.withMonthOfYear(3);
        org.joda.time.DateTime dateTime64 = dateTime60.plusSeconds(469);
        org.joda.time.DateTime dateTime66 = dateTime60.withYearOfCentury(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime60", (dateTime47.compareTo(dateTime60) == 0) == dateTime47.equals(dateTime60));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.setCopy(0);
        org.joda.time.LocalTime localTime7 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(58);
        java.lang.String str12 = dateTimeZone10.getName(1644572340589L);
        org.joda.time.DateTime dateTime13 = dateTime8.toDateTime(dateTimeZone10);
        long long16 = dateTimeZone10.adjustOffset((long) 35421575, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime13", (dateTime8.compareTo(dateTime13) == 0) == dateTime8.equals(dateTime13));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        org.joda.time.DurationField durationField24 = chronology22.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology22);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("2022-02-11T09:38:52.644Z");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter25.withLocale(locale27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj33 = null;
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(obj33, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDateTime30.toDateTime(dateTimeZone35);
        boolean boolean40 = dateTime38.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) (short) 10);
        long long43 = dateTime42.getMillis();
        org.joda.time.Chronology chronology44 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime42.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime42.minus(readableDuration47);
        org.joda.time.DateTime dateTime50 = dateTime48.minusMillis(59);
        org.joda.time.DateTime dateTime52 = dateTime48.withEra(0);
        org.joda.time.DateTime.Property property53 = dateTime48.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHours(58);
        long long58 = dateTimeZone55.convertLocalToUTC(1644572332644L, false);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime48.toMutableDateTime(dateTimeZone55);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter25.withZone(dateTimeZone55);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime59", (dateTime20.compareTo(mutableDateTime59) == 0) == dateTime20.equals(mutableDateTime59));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime13.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis(59);
        org.joda.time.DateTime dateTime23 = dateTime19.withEra(0);
        org.joda.time.DateTime.Property property24 = dateTime19.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours(58);
        long long29 = dateTimeZone26.convertLocalToUTC(1644572332644L, false);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime19.toMutableDateTime(dateTimeZone26);
        java.util.Locale.Category category31 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale32 = java.util.Locale.getDefault(category31);
        org.joda.time.format.DateTimePrinter dateTimePrinter33 = null;
        org.joda.time.format.DateTimeParser dateTimeParser34 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter33, dateTimeParser34);
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone37);
        long long41 = dateTimeZone37.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter35.withZone(dateTimeZone37);
        boolean boolean43 = dateTimeFormatter42.isOffsetParsed();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter42.withLocale(locale44);
        java.util.Locale locale46 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str47 = locale46.getISO3Language();
        java.lang.String str48 = locale44.getDisplayName(locale46);
        java.lang.String str49 = locale32.getDisplayName(locale46);
        java.util.Calendar calendar50 = dateTime19.toCalendar(locale32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime30", (dateTime19.compareTo(mutableDateTime30) == 0) == dateTime19.equals(mutableDateTime30));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.setMillis(1644572335842L);
        mutableDateTime2.setWeekOfWeekyear(20);
        mutableDateTime2.setYear(22);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(8);
        org.joda.time.DateTime dateTime34 = mutableDateTime2.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology37);
        org.joda.time.ReadableDuration readableDuration39 = null;
        mutableDateTime38.add(readableDuration39, (int) (byte) 10);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime43.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj46 = null;
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(obj46, dateTimeZone48);
        org.joda.time.DateTime dateTime51 = localDateTime43.toDateTime(dateTimeZone48);
        mutableDateTime38.setDate((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime54 = dateTime51.minusMillis(9);
        org.joda.time.DateTime dateTime55 = dateTime54.toDateTimeISO();
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(dateTimeZone57);
        long long61 = dateTimeZone57.convertUTCToLocal(1644572334850L);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime55.toMutableDateTime(dateTimeZone57);
        mutableDateTime62.setMillisOfSecond((int) (byte) 1);
        java.util.TimeZone timeZone65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone66);
        mutableDateTime62.setZone(dateTimeZone66);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime((java.lang.Object) 1644572947838L, dateTimeZone66);
        long long71 = dateTimeZone33.getMillisKeepLocal(dateTimeZone66, 1644572395478L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime34", (mutableDateTime2.compareTo(dateTime34) == 0) == mutableDateTime2.equals(dateTime34));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long3 = dateTimeZone1.convertUTCToLocal((long) 22);
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        mutableDateTime7.add(readableDuration8, (int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj15 = null;
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(obj15, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDateTime12.toDateTime(dateTimeZone17);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = mutableDateTime7.isSupported(dateTimeFieldType22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime7.era();
        java.lang.Object obj25 = mutableDateTime7.clone();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        mutableDateTime7.add(readablePeriod26, 35351730);
        mutableDateTime7.setMillisOfSecond((int) 'x');
        int int31 = dateTimeZone1.getOffset((org.joda.time.ReadableInstant) mutableDateTime7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime20", (dateTime4.compareTo(dateTime20) == 0) == dateTime4.equals(dateTime20));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DateTime.Property property16 = dateTime14.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime19 = dateTime14.withPeriodAdded(readablePeriod17, (int) 'u');
        org.joda.time.DateTime.Property property20 = dateTime14.yearOfEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        mutableDateTime23.add(readableDuration24, (int) (byte) 10);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDateTime28.toDateTime(dateTimeZone33);
        mutableDateTime23.setDate((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime39 = dateTime36.minusMillis(9);
        org.joda.time.DateTime dateTime40 = dateTime39.toDateTimeISO();
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfHour();
        org.joda.time.DateTime dateTime43 = property41.setCopy(10);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.withPeriodAdded(readablePeriod44, 4044);
        java.lang.String str47 = dateTime46.toString();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.monthOfYear();
        org.joda.time.LocalDateTime localDateTime52 = property50.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology53 = localDateTime52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology53.getZone();
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(chronology53);
        org.joda.time.DateTime dateTime57 = dateTime46.withChronology(chronology53);
        org.joda.time.DateTime dateTime58 = dateTime57.withTimeAtStartOfDay();
        int int59 = property20.compareTo((org.joda.time.ReadableInstant) dateTime58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime56", (dateTime9.compareTo(dateTime56) == 0) == dateTime9.equals(dateTime56));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology26 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        mutableDateTime21.setChronology(chronology26);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime21", (dateTime9.compareTo(mutableDateTime21) == 0) == dateTime9.equals(mutableDateTime21));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Instant instant21 = mutableDateTime19.toInstant();
        int int22 = mutableDateTime19.getMillisOfSecond();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(obj27, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDateTime24.toDateTime(dateTimeZone29);
        boolean boolean34 = dateTime32.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime36 = dateTime32.minusMinutes((int) (short) 10);
        long long37 = dateTime36.getMillis();
        org.joda.time.Chronology chronology38 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.era();
        org.joda.time.DateTimeField dateTimeField40 = chronology38.yearOfCentury();
        org.joda.time.DurationField durationField41 = chronology38.days();
        org.joda.time.DurationField durationField42 = chronology38.hours();
        java.lang.Object obj43 = null;
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(obj43, dateTimeZone45);
        int int49 = dateTimeZone45.getOffset((long) (byte) -1);
        boolean boolean50 = dateTimeZone45.isFixed();
        int int52 = dateTimeZone45.getStandardOffset(1644572334551L);
        org.joda.time.Chronology chronology53 = chronology38.withZone(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.Chronology chronology55 = chronology53.withZone(dateTimeZone54);
        org.joda.time.DateTimeField dateTimeField56 = chronology55.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfCentury();
        org.joda.time.DateTime dateTime58 = mutableDateTime19.toDateTime(chronology55);
        org.joda.time.ReadableDuration readableDuration59 = null;
        mutableDateTime19.add(readableDuration59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant21", (dateTime9.compareTo(instant21) == 0) == dateTime9.equals(instant21));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Instant instant21 = mutableDateTime19.toInstant();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime(dateTimeZone28);
        boolean boolean33 = dateTime31.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes((int) (short) 10);
        long long36 = dateTime35.getMillis();
        org.joda.time.DateTime dateTime38 = dateTime35.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime40 = dateTime35.plusMinutes(35331916);
        java.lang.String str41 = dateTime40.toString();
        java.util.GregorianCalendar gregorianCalendar42 = dateTime40.toGregorianCalendar();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj48 = null;
        java.util.TimeZone timeZone49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone50);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(obj48, dateTimeZone50);
        org.joda.time.DateTime dateTime53 = localDateTime45.toDateTime(dateTimeZone50);
        boolean boolean55 = dateTime53.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime57 = dateTime53.minusMinutes((int) (short) 10);
        long long58 = dateTime57.getMillis();
        org.joda.time.Chronology chronology59 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.era();
        org.joda.time.DateTimeField dateTimeField61 = chronology59.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(0L, chronology59);
        org.joda.time.DateTime dateTime63 = dateTime40.toDateTime(chronology59);
        mutableDateTime19.setTime((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and instant21", (dateTime9.compareTo(instant21) == 0) == dateTime9.equals(instant21));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears((int) 'a');
        org.joda.time.LocalDateTime localDateTime21 = dateTime18.toLocalDateTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime(dateTimeZone28);
        boolean boolean33 = dateTime31.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes((int) (short) 10);
        long long36 = dateTime35.getMillis();
        java.lang.String str37 = dateTime35.toString();
        org.joda.time.DateTime.Property property38 = dateTime35.hourOfDay();
        org.joda.time.DateTime dateTime39 = property38.roundCeilingCopy();
        org.joda.time.DateTime dateTime40 = property38.roundFloorCopy();
        org.joda.time.DateTime dateTime42 = property38.addToCopy((int) (short) 1);
        org.joda.time.DateTime dateTime43 = property38.roundCeilingCopy();
        boolean boolean44 = dateTime18.isBefore((org.joda.time.ReadableInstant) dateTime43);
        boolean boolean46 = dateTime43.isEqual(1644572357778L);
        org.joda.time.DateTime dateTime47 = dateTime43.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property48 = dateTime43.millisOfDay();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology53 = localDateTime50.getChronology();
        org.joda.time.DurationField durationField54 = chronology53.centuries();
        org.joda.time.DateTime dateTime55 = dateTime43.toDateTime(chronology53);
        java.lang.String str56 = chronology53.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime55", (dateTime17.compareTo(dateTime55) == 0) == dateTime17.equals(dateTime55));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        mutableDateTime1.setMillis(1644572329999L);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.copy();
        org.joda.time.DateTime dateTime5 = mutableDateTime4.toDateTimeISO();
        java.lang.Object obj7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj7, dateTimeZone14);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(1644572339488L, chronology19);
        mutableDateTime4.setChronology(chronology19);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime4.dayOfMonth();
        java.lang.String str23 = property22.getAsText();
        org.joda.time.DurationField durationField24 = property22.getRangeDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime4", (mutableDateTime1.compareTo(mutableDateTime4) == 0) == mutableDateTime1.equals(mutableDateTime4));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        int int13 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime14 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime15 = property10.roundCeilingCopy();
        boolean boolean16 = property10.isLeap();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj21 = null;
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj21, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDateTime18.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology32 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.seconds();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekyearOfCentury();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology32);
        org.joda.time.Chronology chronology36 = chronology32.withUTC();
        org.joda.time.DateTime dateTime37 = dateTime26.withChronology(chronology32);
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime40 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime42 = dateTime37.minusDays(35392668);
        org.joda.time.DateTime.Property property43 = dateTime37.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime35", (dateTime9.compareTo(dateTime35) == 0) == dateTime9.equals(dateTime35));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        int int16 = dateTime13.getHourOfDay();
        org.joda.time.DateTime dateTime18 = dateTime13.minusSeconds(20);
        int int19 = dateTime18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime18.withDurationAdded(0L, (-27403790));
        int int24 = dateTime23.getYearOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.monthOfYear();
        org.joda.time.LocalDateTime localDateTime29 = property27.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology30 = localDateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology30.getZone();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DurationField durationField34 = chronology30.weeks();
        org.joda.time.DurationField durationField35 = chronology30.eras();
        org.joda.time.DateTime dateTime36 = dateTime23.toDateTime(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime33", (dateTime9.compareTo(dateTime33) == 0) == dateTime9.equals(dateTime33));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        int int20 = dateTime17.getYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        boolean boolean32 = dateTime17.equals((java.lang.Object) property31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj33, dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime17.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(13);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.monthOfYear();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusSeconds((int) (byte) -1);
        boolean boolean57 = localDateTime49.isEqual((org.joda.time.ReadablePartial) localDateTime54);
        int int58 = localDateTime49.getHourOfDay();
        org.joda.time.Chronology chronology59 = localDateTime49.getChronology();
        org.joda.time.DateTime dateTime60 = dateTime47.withChronology(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.withMonthOfYear(3);
        org.joda.time.DateTime dateTime64 = dateTime60.plusSeconds(469);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime64.toMutableDateTime();
        mutableDateTime65.setDate(1644572430215L);
        java.lang.Object obj68 = mutableDateTime65.clone();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(chronology69);
        org.joda.time.LocalDateTime localDateTime72 = localDateTime70.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj73 = null;
        java.util.TimeZone timeZone74 = null;
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forTimeZone(timeZone74);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone75);
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(obj73, dateTimeZone75);
        org.joda.time.DateTime dateTime78 = localDateTime70.toDateTime(dateTimeZone75);
        boolean boolean80 = dateTime78.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime82 = dateTime78.minusMinutes((int) (short) 10);
        long long83 = dateTime82.getMillis();
        org.joda.time.Chronology chronology84 = dateTime82.getChronology();
        org.joda.time.DateTimeField dateTimeField85 = chronology84.era();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField87 = chronology84.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod88 = null;
        long long91 = chronology84.add(readablePeriod88, 1644572335512L, 640);
        org.joda.time.DurationField durationField92 = chronology84.minutes();
        org.joda.time.MutableDateTime mutableDateTime93 = mutableDateTime65.toMutableDateTime(chronology84);
        org.joda.time.DurationField durationField94 = chronology84.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime60", (dateTime47.compareTo(dateTime60) == 0) == dateTime47.equals(dateTime60));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime17 = property15.roundHalfCeiling();
        org.joda.time.MutableDateTime mutableDateTime18 = property15.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(46800000);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime18.toMutableDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        mutableDateTime24.add(readableDuration25, (int) (byte) 10);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(obj32, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime(dateTimeZone34);
        boolean boolean39 = dateTime37.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMinutes((int) (short) 10);
        long long42 = dateTime41.getMillis();
        org.joda.time.Chronology chronology43 = dateTime41.getChronology();
        org.joda.time.DateTime dateTime45 = dateTime41.plusHours((int) (short) 10);
        java.lang.Object obj46 = null;
        java.util.TimeZone timeZone47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forTimeZone(timeZone47);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(obj46, dateTimeZone48);
        int int52 = dateTimeZone48.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime53 = dateTime41.toDateTime(dateTimeZone48);
        mutableDateTime24.setZoneRetainFields(dateTimeZone48);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime24.minuteOfDay();
        java.util.Locale locale56 = null;
        java.util.Calendar calendar57 = mutableDateTime24.toCalendar(locale56);
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.fromCalendarFields(calendar57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime58.withMillisOfDay(35341772);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.LocalDateTime localDateTime62 = localDateTime60.minus(readableDuration61);
        org.joda.time.LocalDateTime.Property property63 = localDateTime62.millisOfDay();
        int int64 = property63.getMinimumValueOverall();
        java.lang.String str65 = property63.getAsText();
        int int66 = property63.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime67 = property63.roundHalfEvenCopy();
        boolean boolean68 = dateTimeZone20.isLocalDateTimeGap(localDateTime67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime21", (dateTime13.compareTo(mutableDateTime21) == 0) == dateTime13.equals(mutableDateTime21));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfCeiling();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj23 = null;
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj23, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDateTime20.toDateTime(dateTimeZone25);
        boolean boolean30 = dateTime28.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime32 = dateTime28.minusMinutes((int) (short) 10);
        long long33 = dateTime32.getMillis();
        org.joda.time.Chronology chronology34 = dateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.era();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.secondOfDay();
        org.joda.time.DurationField durationField38 = chronology34.centuries();
        org.joda.time.DurationField durationField39 = chronology34.halfdays();
        mutableDateTime18.setChronology(chronology34);
        org.joda.time.DurationField durationField41 = chronology34.centuries();
        org.joda.time.DurationField durationField42 = chronology34.millis();
        org.joda.time.DurationField durationField43 = chronology34.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField43, durationField38, and durationField39", !(durationField43.compareTo(durationField38) == 0) || (Math.signum(durationField43.compareTo(durationField39)) == Math.signum(durationField38.compareTo(durationField39))));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1644572333722L);
        org.joda.time.DateTimeField dateTimeField2 = mutableDateTime1.getRoundingField();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime5.add(readableDuration6, (int) (byte) 10);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj13 = null;
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(obj13, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime(dateTimeZone15);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime18.withLaterOffsetAtOverlap();
        mutableDateTime1.setDate((org.joda.time.ReadableInstant) dateTime18);
        mutableDateTime1.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology29 = localDateTime26.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.seconds();
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long) 49, chronology29);
        mutableDateTime1.setChronology(chronology29);
        org.joda.time.DurationField durationField33 = chronology29.weeks();
        org.joda.time.DurationField durationField34 = chronology29.centuries();
        org.joda.time.DurationField durationField35 = chronology29.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField35, durationField30, and durationField33", !(durationField35.compareTo(durationField30) == 0) || (Math.signum(durationField35.compareTo(durationField33)) == Math.signum(durationField30.compareTo(durationField33))));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = chronology5.getZone();
        java.lang.String str7 = chronology5.toString();
        org.joda.time.DurationField durationField8 = chronology5.weeks();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.minuteOfHour();
        org.joda.time.DurationField durationField11 = chronology5.eras();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField11", Math.signum(durationField8.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField8)));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, (int) (byte) 10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        mutableDateTime3.setDate((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime3.add(readableDuration18);
        mutableDateTime3.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime3.setDayOfYear((int) (short) 1);
        mutableDateTime3.addSeconds(4044);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj33 = null;
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(obj33, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDateTime30.toDateTime(dateTimeZone35);
        boolean boolean40 = dateTime38.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) (short) 10);
        long long43 = dateTime42.getMillis();
        org.joda.time.Chronology chronology44 = dateTime42.getChronology();
        org.joda.time.DateTime dateTime46 = dateTime42.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime48 = dateTime46.withWeekyear((int) (short) 100);
        int int49 = dateTime46.getYear();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj54 = null;
        java.util.TimeZone timeZone55 = null;
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forTimeZone(timeZone55);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone56);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(obj54, dateTimeZone56);
        org.joda.time.DateTime dateTime59 = localDateTime51.toDateTime(dateTimeZone56);
        org.joda.time.DateTime.Property property60 = dateTime59.minuteOfHour();
        boolean boolean61 = dateTime46.equals((java.lang.Object) property60);
        java.lang.Object obj62 = null;
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj67 = null;
        java.util.TimeZone timeZone68 = null;
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.forTimeZone(timeZone68);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(obj67, dateTimeZone69);
        org.joda.time.DateTime dateTime72 = localDateTime64.toDateTime(dateTimeZone69);
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(obj62, dateTimeZone69);
        org.joda.time.DateTime dateTime74 = dateTime46.withZoneRetainFields(dateTimeZone69);
        org.joda.time.DateTime dateTime76 = dateTime74.plusMonths(13);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(chronology77);
        org.joda.time.LocalDateTime.Property property79 = localDateTime78.monthOfYear();
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(chronology80);
        org.joda.time.LocalDateTime localDateTime83 = localDateTime81.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime85 = localDateTime83.plusSeconds((int) (byte) -1);
        boolean boolean86 = localDateTime78.isEqual((org.joda.time.ReadablePartial) localDateTime83);
        int int87 = localDateTime78.getHourOfDay();
        org.joda.time.Chronology chronology88 = localDateTime78.getChronology();
        org.joda.time.DateTime dateTime89 = dateTime76.withChronology(chronology88);
        org.joda.time.DateTime dateTime90 = mutableDateTime3.toDateTime(chronology88);
        org.joda.time.DateTimeField dateTimeField91 = chronology88.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField92 = chronology88.era();
        org.joda.time.LocalDateTime localDateTime93 = new org.joda.time.LocalDateTime(1644572338694L, chronology88);
        org.joda.time.LocalDateTime localDateTime95 = localDateTime93.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalDateTime.Property property96 = localDateTime95.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime98 = localDateTime95.minusMonths(35506913);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and dateTime90", (mutableDateTime3.compareTo(dateTime90) == 0) == mutableDateTime3.equals(dateTime90));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.addSeconds(4044);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(obj32, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime(dateTimeZone34);
        boolean boolean39 = dateTime37.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMinutes((int) (short) 10);
        long long42 = dateTime41.getMillis();
        org.joda.time.Chronology chronology43 = dateTime41.getChronology();
        org.joda.time.DateTime dateTime45 = dateTime41.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime47 = dateTime45.withWeekyear((int) (short) 100);
        int int48 = dateTime45.getYear();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj53 = null;
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(obj53, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDateTime50.toDateTime(dateTimeZone55);
        org.joda.time.DateTime.Property property59 = dateTime58.minuteOfHour();
        boolean boolean60 = dateTime45.equals((java.lang.Object) property59);
        java.lang.Object obj61 = null;
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.LocalDateTime localDateTime63 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj66 = null;
        java.util.TimeZone timeZone67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone67);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(obj66, dateTimeZone68);
        org.joda.time.DateTime dateTime71 = localDateTime63.toDateTime(dateTimeZone68);
        org.joda.time.LocalDateTime localDateTime72 = new org.joda.time.LocalDateTime(obj61, dateTimeZone68);
        org.joda.time.DateTime dateTime73 = dateTime45.withZoneRetainFields(dateTimeZone68);
        org.joda.time.DateTime dateTime75 = dateTime73.plusMonths(13);
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.LocalDateTime localDateTime77 = new org.joda.time.LocalDateTime(chronology76);
        org.joda.time.LocalDateTime.Property property78 = localDateTime77.monthOfYear();
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.LocalDateTime localDateTime80 = new org.joda.time.LocalDateTime(chronology79);
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime84 = localDateTime82.plusSeconds((int) (byte) -1);
        boolean boolean85 = localDateTime77.isEqual((org.joda.time.ReadablePartial) localDateTime82);
        int int86 = localDateTime77.getHourOfDay();
        org.joda.time.Chronology chronology87 = localDateTime77.getChronology();
        org.joda.time.DateTime dateTime88 = dateTime75.withChronology(chronology87);
        org.joda.time.DateTime dateTime89 = mutableDateTime2.toDateTime(chronology87);
        org.joda.time.DateTimeField dateTimeField90 = chronology87.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        long long94 = chronology87.add(readablePeriod91, 1644572447464L, 0);
        java.lang.String str95 = chronology87.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime89", (mutableDateTime2.compareTo(dateTime89) == 0) == mutableDateTime2.equals(dateTime89));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyearOfCentury();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology15);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.DateTime dateTime37 = dateTime34.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime39 = dateTime34.plusMinutes(35331916);
        java.lang.String str40 = dateTime39.toString();
        java.util.GregorianCalendar gregorianCalendar41 = dateTime39.toGregorianCalendar();
        boolean boolean42 = dateTime20.equals((java.lang.Object) gregorianCalendar41);
        int int43 = dateTime20.getYearOfCentury();
        org.joda.time.DateTime dateTime45 = dateTime20.plusMinutes(46800000);
        org.joda.time.DateTime.Property property46 = dateTime45.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime18", (dateTime9.compareTo(dateTime18) == 0) == dateTime9.equals(dateTime18));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond(10);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.centuries();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.yearOfEra();
        org.joda.time.DurationField durationField22 = chronology19.eras();
        org.joda.time.DurationField durationField23 = chronology19.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField23 and durationField22", Math.signum(durationField23.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField23)));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        int int13 = property10.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime14 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime15 = property10.roundCeilingCopy();
        boolean boolean16 = property10.isLeap();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj21 = null;
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj21, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDateTime18.toDateTime(dateTimeZone23);
        org.joda.time.DateTime.Property property27 = dateTime26.minuteOfHour();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology32 = localDateTime29.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.seconds();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekyearOfCentury();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology32);
        org.joda.time.Chronology chronology36 = chronology32.withUTC();
        org.joda.time.DateTime dateTime37 = dateTime26.withChronology(chronology32);
        int int38 = property10.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj43 = null;
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(obj43, dateTimeZone45);
        org.joda.time.DateTime dateTime48 = localDateTime40.toDateTime(dateTimeZone45);
        boolean boolean50 = dateTime48.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime52 = dateTime48.minusMinutes((int) (short) 10);
        long long53 = dateTime52.getMillis();
        org.joda.time.DateTime dateTime55 = dateTime52.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime57 = dateTime52.plusMinutes(35331916);
        org.joda.time.DateTime dateTime59 = dateTime57.withWeekyear(35396708);
        int int60 = property10.getDifference((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.LocalDate localDate61 = dateTime57.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime35", (dateTime9.compareTo(dateTime35) == 0) == dateTime9.equals(dateTime35));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime13.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis(59);
        org.joda.time.DateTime dateTime23 = dateTime19.withEra(0);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj29 = null;
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(obj29, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDateTime26.toDateTime(dateTimeZone31);
        boolean boolean36 = dateTime34.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property37 = dateTime34.secondOfDay();
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.millisOfDay();
        java.util.Date date41 = mutableDateTime39.toDate();
        boolean boolean42 = dateTime24.equals((java.lang.Object) date41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime24.getZone();
        org.joda.time.DateMidnight dateMidnight44 = dateTime24.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime24.toMutableDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = dateTime24.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and mutableDateTime48", (dateTime49.compareTo(mutableDateTime48) == 0) == dateTime49.equals(mutableDateTime48));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfMonth(12);
        long long25 = chronology15.set((org.joda.time.ReadablePartial) localDateTime23, 1644572330264L);
        org.joda.time.DateTimeField dateTimeField26 = chronology15.halfdayOfDay();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDateTime28.toDateTime(dateTimeZone33);
        boolean boolean38 = dateTime36.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime40 = dateTime36.minusMinutes((int) (short) 10);
        long long41 = dateTime40.getMillis();
        org.joda.time.Chronology chronology42 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime44 = dateTime40.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime40.minus(readableDuration45);
        org.joda.time.DateTime dateTime48 = dateTime46.minusMillis(59);
        org.joda.time.DateTime dateTime50 = dateTime46.withEra(0);
        org.joda.time.DateTime.Property property51 = dateTime46.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours(58);
        long long56 = dateTimeZone53.convertLocalToUTC(1644572332644L, false);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime46.toMutableDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology58 = chronology15.withZone(dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime57", (dateTime13.compareTo(mutableDateTime57) == 0) == dateTime13.equals(mutableDateTime57));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTime9.get(dateTimeField13);
        long long15 = dateTime9.getMillis();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime9.plus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        boolean boolean31 = dateTime29.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) (short) 10);
        long long34 = dateTime33.getMillis();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime33.plusHours((int) (short) 10);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        int int44 = dateTimeZone40.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime45 = dateTime33.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = dateTimeZone40.getShortName(1644572330264L, locale48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        boolean boolean53 = dateTimeZone52.isFixed();
        long long55 = dateTimeZone40.getMillisKeepLocal(dateTimeZone52, 1644572360656L);
        org.joda.time.DateTime dateTime56 = dateTime18.toDateTime(dateTimeZone52);
        org.joda.time.DateTime.Property property57 = dateTime18.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime56", (dateTime18.compareTo(dateTime56) == 0) == dateTime18.equals(dateTime56));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.setCopy(0);
        org.joda.time.LocalTime localTime7 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(58);
        java.lang.String str12 = dateTimeZone10.getName(1644572340589L);
        org.joda.time.DateTime dateTime13 = dateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property14 = dateTime8.yearOfEra();
        org.joda.time.DateTime.Property property15 = dateTime8.yearOfEra();
        org.joda.time.DateTime dateTime18 = dateTime8.withDurationAdded(1644572407824L, 2027);
        int int19 = dateTime18.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime13", (dateTime8.compareTo(dateTime13) == 0) == dateTime8.equals(dateTime13));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime22 = property20.setCopy(10);
        org.joda.time.DateTime dateTime23 = property20.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(46800000);
        org.joda.time.DateTime dateTime26 = dateTime23.withZone(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset(1644572476368L, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime26", (dateTime23.compareTo(dateTime26) == 0) == dateTime23.equals(dateTime26));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTime9.get(dateTimeField13);
        long long15 = dateTime9.getMillis();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime9.plus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        boolean boolean31 = dateTime29.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) (short) 10);
        long long34 = dateTime33.getMillis();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime33.plusHours((int) (short) 10);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        int int44 = dateTimeZone40.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime45 = dateTime33.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = dateTimeZone40.getShortName(1644572330264L, locale48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        boolean boolean53 = dateTimeZone52.isFixed();
        long long55 = dateTimeZone40.getMillisKeepLocal(dateTimeZone52, 1644572360656L);
        org.joda.time.DateTime dateTime56 = dateTime18.toDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime58 = dateTime56.plusYears(35454450);
        org.joda.time.LocalDateTime localDateTime59 = dateTime58.toLocalDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime56", (dateTime9.compareTo(dateTime56) == 0) == dateTime9.equals(dateTime56));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        int int21 = mutableDateTime19.getMillisOfSecond();
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutableDateTime19.add(readableDuration22);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime19.toMutableDateTimeISO();
        mutableDateTime24.addHours((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime24.getZone();
        int int29 = dateTimeZone27.getOffset((long) 999);
        long long31 = dateTimeZone27.previousTransition(1644572533485L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        mutableDateTime34.add(readableDuration35, (int) (byte) 10);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj42 = null;
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(obj42, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDateTime39.toDateTime(dateTimeZone44);
        mutableDateTime34.setDate((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.ReadableDuration readableDuration49 = null;
        mutableDateTime34.add(readableDuration49);
        mutableDateTime34.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime34.setDayOfYear((int) (short) 1);
        mutableDateTime34.setMillis(1644572335842L);
        mutableDateTime34.setWeekOfWeekyear(20);
        mutableDateTime34.setYear(22);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHours(8);
        org.joda.time.DateTime dateTime66 = mutableDateTime34.toDateTime(dateTimeZone65);
        long long68 = dateTimeZone27.getMillisKeepLocal(dateTimeZone65, 1644572417844L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and dateTime66", (mutableDateTime34.compareTo(dateTime66) == 0) == mutableDateTime34.equals(dateTime66));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime14.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime14.minus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMillis(59);
        org.joda.time.DateTime dateTime24 = dateTime20.withEra(0);
        org.joda.time.DateTime dateTime25 = dateTime24.toDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj30, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = localDateTime27.toDateTime(dateTimeZone32);
        boolean boolean37 = dateTime35.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property38 = dateTime35.secondOfDay();
        org.joda.time.DateTime dateTime39 = property38.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.millisOfDay();
        java.util.Date date42 = mutableDateTime40.toDate();
        boolean boolean43 = dateTime25.equals((java.lang.Object) date42);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTime25.getZone();
        org.joda.time.DateMidnight dateMidnight45 = dateTime25.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, 0);
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime25.toMutableDateTime(dateTimeZone48);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime(1644572448425L, dateTimeZone48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime49", (dateTime24.compareTo(mutableDateTime49) == 0) == dateTime24.equals(mutableDateTime49));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime14 = dateTime10.minusWeeks((int) (short) 1);
        boolean boolean15 = dateTime14.isAfterNow();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDateTime17.toDateTime(dateTimeZone22);
        boolean boolean27 = dateTime25.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime29 = dateTime25.minusMinutes((int) (short) 10);
        long long30 = dateTime29.getMillis();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.era();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(1644572330722L, chronology31);
        org.joda.time.DateTimeField dateTimeField36 = chronology31.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField37 = chronology31.minuteOfDay();
        org.joda.time.DurationField durationField38 = chronology31.eras();
        org.joda.time.DurationField durationField39 = chronology31.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField38, durationField39, and durationField38", !(durationField38.compareTo(durationField39) == 0) || (Math.signum(durationField38.compareTo(durationField38)) == Math.signum(durationField39.compareTo(durationField38))));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        int int3 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        java.lang.String str22 = dateTime20.toString();
        org.joda.time.DateTime.Property property23 = dateTime20.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundCeilingCopy();
        org.joda.time.DateTime dateTime25 = property23.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime25);
        org.joda.time.DateTime.Property property27 = dateTime25.secondOfMinute();
        mutableDateTime6.setTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.minusYears(35364918);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.monthOfYear();
        org.joda.time.LocalDateTime localDateTime35 = property33.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology36 = localDateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology36.getZone();
        org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DurationField durationField40 = chronology36.weeks();
        org.joda.time.DurationField durationField41 = chronology36.centuries();
        org.joda.time.DateTime dateTime42 = dateTime30.toDateTime(chronology36);
        boolean boolean43 = dateTime42.isBeforeNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime39", (dateTime16.compareTo(dateTime39) == 0) == dateTime16.equals(dateTime39));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17, (int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateTime29);
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone33);
        mutableDateTime16.setZone(dateTimeZone33);
        java.lang.String str37 = dateTimeZone33.getID();
        org.joda.time.DateTime dateTime38 = dateTime13.withZoneRetainFields(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime38);
        org.joda.time.DateTime dateTime41 = dateTime38.minusDays((-2));
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime();
        org.joda.time.DateTime.Property property43 = dateTime42.weekyear();
        org.joda.time.DateTime dateTime45 = dateTime42.withYear(86);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.LocalDateTime localDateTime47 = new org.joda.time.LocalDateTime(chronology46);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology50 = localDateTime47.getChronology();
        org.joda.time.DurationField durationField51 = chronology50.seconds();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.weekyearOfCentury();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology50);
        org.joda.time.Chronology chronology54 = chronology50.withUTC();
        org.joda.time.DurationField durationField55 = chronology54.weeks();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime45, chronology54);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withMillisOfDay(35511);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime53", (dateTime9.compareTo(dateTime53) == 0) == dateTime9.equals(dateTime53));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology6 = localDateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = chronology6.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.weeks();
        org.joda.time.DurationField durationField11 = chronology6.eras();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) 1644572621432L, chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.setMillis(1644572335842L);
        mutableDateTime2.setWeekOfWeekyear(20);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime2.minuteOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.seconds();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.weekyearOfCentury();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology35);
        org.joda.time.Chronology chronology39 = chronology35.withUTC();
        org.joda.time.Chronology chronology40 = chronology35.withUTC();
        boolean boolean41 = mutableDateTime2.equals((java.lang.Object) chronology35);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        mutableDateTime45.add(readableDuration46, (int) (byte) 10);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj53 = null;
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(obj53, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDateTime50.toDateTime(dateTimeZone55);
        mutableDateTime45.setDate((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = dateTime58.minusMillis(9);
        org.joda.time.DateTime dateTime62 = dateTime61.toDateTimeISO();
        java.util.TimeZone timeZone63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone64);
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(dateTimeZone64);
        long long68 = dateTimeZone64.convertUTCToLocal(1644572334850L);
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime62.toMutableDateTime(dateTimeZone64);
        mutableDateTime69.setMillisOfSecond((int) (byte) 1);
        java.util.TimeZone timeZone72 = null;
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forTimeZone(timeZone72);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone73);
        mutableDateTime69.setZone(dateTimeZone73);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime((java.lang.Object) 1644572947838L, dateTimeZone73);
        java.lang.String str78 = dateTimeZone73.getName(1644572535759L);
        mutableDateTime2.setZone(dateTimeZone73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime38", (dateTime15.compareTo(dateTime38) == 0) == dateTime15.equals(dateTime38));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.yearOfCentury();
        org.joda.time.DurationField durationField19 = chronology16.days();
        org.joda.time.DurationField durationField20 = chronology16.hours();
        org.joda.time.DurationField durationField21 = chronology16.halfdays();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(3764487297492L, chronology16);
        org.joda.time.DateTimeField dateTimeField23 = chronology16.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology16);
        org.joda.time.DateTimeZone dateTimeZone25 = chronology16.getZone();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone25);
        org.joda.time.DateTime.Property property27 = dateTime26.dayOfMonth();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj33 = null;
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(obj33, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDateTime30.toDateTime(dateTimeZone35);
        boolean boolean40 = dateTime38.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) (short) 10);
        long long43 = dateTime42.getMillis();
        org.joda.time.Chronology chronology44 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.era();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(0L, chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.hourOfHalfday();
        org.joda.time.DurationField durationField49 = chronology44.eras();
        org.joda.time.DateTime dateTime50 = dateTime26.withChronology(chronology44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField49", Math.signum(durationField19.compareTo(durationField49)) == -Math.signum(durationField49.compareTo(durationField19)));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology15 = localDateTime12.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.seconds();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyearOfCentury();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Chronology chronology19 = chronology15.withUTC();
        org.joda.time.DateTime dateTime20 = dateTime9.withChronology(chronology15);
        org.joda.time.DateTime.Property property21 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime23 = property21.addToCopy(798);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime18", (dateTime9.compareTo(dateTime18) == 0) == dateTime9.equals(dateTime18));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        int int2 = dateTime1.getYearOfEra();
        org.joda.time.DateTime.Property property3 = dateTime1.secondOfDay();
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        java.util.TimeZone timeZone9 = dateTimeZone6.toTimeZone();
        java.time.ZoneId zoneId10 = timeZone9.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.hourOfDay();
        java.lang.String str20 = property19.getName();
        org.joda.time.LocalDateTime localDateTime22 = property19.addToCopy(1644572345240L);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(obj27, dateTimeZone29);
        org.joda.time.DateTime dateTime32 = localDateTime24.toDateTime(dateTimeZone29);
        boolean boolean34 = dateTime32.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime36 = dateTime32.minusMinutes((int) (short) 10);
        long long37 = dateTime36.getMillis();
        org.joda.time.Chronology chronology38 = dateTime36.getChronology();
        org.joda.time.DateTime dateTime40 = dateTime36.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        mutableDateTime43.add(readableDuration44, (int) (byte) 10);
        boolean boolean47 = dateTime36.isBefore((org.joda.time.ReadableInstant) mutableDateTime43);
        org.joda.time.DateTimeZone dateTimeZone48 = mutableDateTime43.getZone();
        org.joda.time.DateTime dateTime49 = localDateTime22.toDateTime(dateTimeZone48);
        long long51 = dateTimeZone11.getMillisKeepLocal(dateTimeZone48, (long) 35406991);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj56 = null;
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(obj56, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDateTime53.toDateTime(dateTimeZone58);
        boolean boolean63 = dateTime61.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime65 = dateTime61.minusMinutes((int) (short) 10);
        long long66 = dateTime65.getMillis();
        org.joda.time.Chronology chronology67 = dateTime65.getChronology();
        org.joda.time.DateTime dateTime69 = dateTime65.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime71 = dateTime69.withWeekyear((int) (short) 100);
        int int72 = dateTime69.getYear();
        org.joda.time.DateTimeZone dateTimeZone73 = dateTime69.getZone();
        boolean boolean75 = dateTimeZone73.isStandardOffset(1644572392129L);
        long long77 = dateTimeZone11.getMillisKeepLocal(dateTimeZone73, (long) 4044);
        org.joda.time.DateTime dateTime78 = dateTime1.toDateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime79 = org.joda.time.DateTime.now(dateTimeZone11);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime78", (dateTime1.compareTo(dateTime78) == 0) == dateTime1.equals(dateTime78));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setMinuteOfHour((int) '#');
        int int26 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeFormatter29.getZone();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology35 = localDateTime32.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.seconds();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.weekyearOfCentury();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology35);
        org.joda.time.Chronology chronology39 = chronology35.withUTC();
        org.joda.time.DurationField durationField40 = chronology39.weeks();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.year();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter29.withChronology(chronology39);
        org.joda.time.DateTimeZone dateTimeZone43 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField44 = chronology39.era();
        org.joda.time.DateTimeField dateTimeField45 = chronology39.clockhourOfHalfday();
        int int46 = mutableDateTime2.get(dateTimeField45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime38", (dateTime15.compareTo(dateTime38) == 0) == dateTime15.equals(dateTime38));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = localDate7.toDateMidnight();
        java.lang.String str9 = localDate7.toString();
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.DateMidnight dateMidnight12 = localDate4.toDateMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.DateTime dateTime19 = dateTime13.withZone(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime19", (dateTime13.compareTo(dateTime19) == 0) == dateTime13.equals(dateTime19));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        int int20 = dateTime17.getYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        boolean boolean32 = dateTime17.equals((java.lang.Object) property31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj33, dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime17.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(13);
        int int48 = dateTime47.getMinuteOfDay();
        org.joda.time.DateTime dateTime49 = dateTime47.toDateTimeISO();
        java.util.Locale.Category category50 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale51 = java.util.Locale.getDefault(category50);
        java.util.Calendar calendar52 = dateTime47.toCalendar(locale51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(chronology53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj57 = null;
        java.util.TimeZone timeZone58 = null;
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone58);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone59);
        org.joda.time.LocalDateTime localDateTime61 = new org.joda.time.LocalDateTime(obj57, dateTimeZone59);
        org.joda.time.DateTime dateTime62 = localDateTime54.toDateTime(dateTimeZone59);
        org.joda.time.DateTime dateTime64 = dateTime62.plusDays((int) (short) 10);
        java.util.TimeZone timeZone65 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId66 = timeZone65.toZoneId();
        int int68 = timeZone65.getOffset(1644572333371L);
        boolean boolean69 = timeZone65.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone65);
        java.util.Locale locale72 = java.util.Locale.CHINESE;
        java.lang.String str73 = locale72.getISO3Language();
        java.lang.String str74 = dateTimeZone70.getShortName((long) 100, locale72);
        java.util.Calendar calendar75 = dateTime64.toCalendar(locale72);
        java.lang.String str76 = locale72.getCountry();
        java.util.Calendar calendar77 = dateTime47.toCalendar(locale72);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetHours(209);
        org.joda.time.DateTime dateTime80 = dateTime47.toDateTime(dateTimeZone79);
        boolean boolean82 = dateTime47.isEqual(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime80", (dateTime47.compareTo(dateTime80) == 0) == dateTime47.equals(dateTime80));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTime9.get(dateTimeField13);
        long long15 = dateTime9.getMillis();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime9.plus(readablePeriod16);
        org.joda.time.DateTime dateTime18 = dateTime17.toDateTimeISO();
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        boolean boolean31 = dateTime29.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) (short) 10);
        long long34 = dateTime33.getMillis();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime33.plusHours((int) (short) 10);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        int int44 = dateTimeZone40.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime45 = dateTime33.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone40);
        java.util.Locale locale48 = java.util.Locale.US;
        java.lang.String str49 = dateTimeZone40.getShortName(1644572330264L, locale48);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 0);
        boolean boolean53 = dateTimeZone52.isFixed();
        long long55 = dateTimeZone40.getMillisKeepLocal(dateTimeZone52, 1644572360656L);
        org.joda.time.DateTime dateTime56 = dateTime18.toDateTime(dateTimeZone52);
        org.joda.time.DateTime.Property property57 = dateTime18.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime56", (dateTime18.compareTo(dateTime56) == 0) == dateTime18.equals(dateTime56));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.setCopy(0);
        org.joda.time.LocalTime localTime7 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours(58);
        java.lang.String str12 = dateTimeZone10.getName(1644572340589L);
        org.joda.time.DateTime dateTime13 = dateTime8.toDateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property14 = dateTime8.yearOfEra();
        org.joda.time.DateTime.Property property15 = dateTime8.yearOfEra();
        org.joda.time.DateTime dateTime17 = property15.setCopy(35743285);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime8 and dateTime13", (dateTime8.compareTo(dateTime13) == 0) == dateTime8.equals(dateTime13));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.minus(readablePeriod3);
        org.joda.time.Chronology chronology5 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfMonth();
        org.joda.time.DurationField durationField7 = chronology5.weeks();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) 1644572376463L, chronology5);
        org.joda.time.DurationField durationField9 = chronology5.years();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField7, and durationField9", !(durationField10.compareTo(durationField7) == 0) || (Math.signum(durationField10.compareTo(durationField9)) == Math.signum(durationField7.compareTo(durationField9))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime13.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis(59);
        org.joda.time.DateTime dateTime23 = dateTime19.withEra(0);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj29 = null;
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(obj29, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDateTime26.toDateTime(dateTimeZone31);
        boolean boolean36 = dateTime34.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property37 = dateTime34.secondOfDay();
        org.joda.time.DateTime dateTime38 = property37.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.millisOfDay();
        java.util.Date date41 = mutableDateTime39.toDate();
        boolean boolean42 = dateTime24.equals((java.lang.Object) date41);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTime24.getZone();
        org.joda.time.DateMidnight dateMidnight44 = dateTime24.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, 0);
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime24.toMutableDateTime(dateTimeZone47);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now(dateTimeZone47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and mutableDateTime48", (dateTime23.compareTo(mutableDateTime48) == 0) == dateTime23.equals(mutableDateTime48));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.centuryOfEra();
        int int4 = mutableDateTime2.getRoundingMode();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.era();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime2.copy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        boolean boolean19 = dateTime17.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMinutes((int) (short) 10);
        long long22 = dateTime21.getMillis();
        java.lang.String str23 = dateTime21.toString();
        org.joda.time.DateTime.Property property24 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime25 = property24.roundCeilingCopy();
        org.joda.time.DateTime dateTime26 = property24.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime26.secondOfMinute();
        mutableDateTime7.setTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime dateTime31 = dateTime26.minusYears(35364918);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.monthOfYear();
        org.joda.time.LocalDateTime localDateTime36 = property34.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology37 = localDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone39 = chronology37.getZone();
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology37);
        org.joda.time.DurationField durationField41 = chronology37.weeks();
        org.joda.time.DurationField durationField42 = chronology37.centuries();
        org.joda.time.DateTime dateTime43 = dateTime31.toDateTime(chronology37);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay((long) 94, chronology37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime40", (dateTime17.compareTo(dateTime40) == 0) == dateTime17.equals(dateTime40));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfFloor();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = localDate9.toDateMidnight();
        java.lang.String str11 = localDate9.toString();
        org.joda.time.Chronology chronology12 = localDate9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology12.getZone();
        java.lang.String str14 = chronology12.toString();
        org.joda.time.DurationField durationField15 = chronology12.weeks();
        mutableDateTime6.setChronology(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfWeek();
        org.joda.time.DurationField durationField18 = chronology12.eras();
        org.joda.time.DurationField durationField19 = chronology12.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField18", Math.signum(durationField15.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField15)));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond(10);
        org.joda.time.DateTime dateTime20 = dateTime16.withCenturyOfEra(59);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(10);
        org.joda.time.DateTime.Property property23 = dateTime20.secondOfMinute();
        org.joda.time.DateTime.Property property24 = dateTime20.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(4);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime20.toMutableDateTime(dateTimeZone26);
        java.lang.String str29 = dateTimeZone26.getShortName(1644572408992L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and mutableDateTime27", (dateTime20.compareTo(mutableDateTime27) == 0) == dateTime20.equals(mutableDateTime27));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.days();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        org.joda.time.DurationField durationField20 = chronology15.halfdays();
        org.joda.time.DurationField durationField21 = chronology15.years();
        org.joda.time.DurationField durationField22 = chronology15.months();
        org.joda.time.DurationField durationField23 = chronology15.minutes();
        org.joda.time.DurationField durationField24 = chronology15.seconds();
        org.joda.time.DurationField durationField25 = chronology15.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField18, and durationField19", !(durationField25.compareTo(durationField18) == 0) || (Math.signum(durationField25.compareTo(durationField19)) == Math.signum(durationField18.compareTo(durationField19))));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = mutableDateTime1.getRoundingField();
        mutableDateTime1.addMonths(35350603);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime1.copy();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.monthOfYear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        boolean boolean19 = dateTime17.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMinutes((int) (short) 10);
        long long22 = dateTime21.getMillis();
        org.joda.time.DateTime dateTime24 = dateTime21.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime26 = dateTime24.withMillisOfSecond(10);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology27);
        boolean boolean31 = dateTime29.isBefore(1644572953413L);
        org.joda.time.DateTime dateTime33 = dateTime29.plus(1644572340439L);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.withDurationAdded(readableDuration34, 18);
        boolean boolean37 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime39 = dateTime33.plusMonths(46800001);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(869);
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime39.toMutableDateTime(dateTimeZone41);
        mutableDateTime1.setZone(dateTimeZone41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and mutableDateTime42", (dateTime39.compareTo(mutableDateTime42) == 0) == dateTime39.equals(mutableDateTime42));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusWeeks((int) (short) 1);
        org.joda.time.DateTime.Property property14 = dateTime13.secondOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.seconds();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 49, chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology20.clockhourOfHalfday();
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(chronology20);
        java.lang.String str26 = chronology20.toString();
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withCenturyOfEra(608);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime25", (dateTime13.compareTo(dateTime25) == 0) == dateTime13.equals(dateTime25));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.seconds();
        org.joda.time.DurationField durationField6 = chronology4.weeks();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = chronology4.dayOfMonth();
        org.joda.time.DurationField durationField9 = chronology4.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField5, and durationField6", !(durationField9.compareTo(durationField5) == 0) || (Math.signum(durationField9.compareTo(durationField6)) == Math.signum(durationField5.compareTo(durationField6))));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.days();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        org.joda.time.DurationField durationField20 = chronology15.halfdays();
        org.joda.time.DurationField durationField21 = chronology15.years();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology15.add(readablePeriod22, 1644572329811L, 35347060);
        org.joda.time.DurationField durationField26 = chronology15.weekyears();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField21 and durationField26", (durationField21.compareTo(durationField26) == 0) == durationField21.equals(durationField26));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj17 = null;
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(obj17, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = localDateTime14.toDateTime(dateTimeZone19);
        boolean boolean24 = dateTime22.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime26 = dateTime22.minusMinutes((int) (short) 10);
        long long27 = dateTime26.getMillis();
        org.joda.time.DateTime dateTime29 = dateTime26.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillisOfSecond(10);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.millis();
        org.joda.time.DurationField durationField34 = chronology32.years();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.year();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((long) 6, chronology32);
        int[] intArray37 = localDateTime36.getValues();
        org.joda.time.DateTime dateTime38 = dateTime10.withFields((org.joda.time.ReadablePartial) localDateTime36);
        java.lang.Object obj40 = null;
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(chronology41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj45 = null;
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(obj45, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = localDateTime42.toDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(obj40, dateTimeZone47);
        org.joda.time.Chronology chronology52 = localDateTime51.getChronology();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(1644572339488L, chronology52);
        org.joda.time.DurationField durationField54 = chronology52.weekyears();
        org.joda.time.DateTimeField dateTimeField55 = chronology52.dayOfMonth();
        org.joda.time.DateTime dateTime56 = dateTime10.toDateTime(chronology52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField34 and durationField54", (durationField34.compareTo(durationField54) == 0) == durationField34.equals(durationField54));
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        mutableDateTime2.addYears((int) (byte) 10);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        boolean boolean16 = dateTime14.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime18 = dateTime14.minusMinutes((int) (short) 10);
        long long19 = dateTime18.getMillis();
        org.joda.time.DateTime dateTime21 = dateTime18.minusWeeks((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime18.minusWeeks((int) (short) 100);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Instant instant25 = mutableDateTime2.toInstant();
        int int26 = mutableDateTime2.getCenturyOfEra();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime2.year();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(obj32, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime(dateTimeZone34);
        org.joda.time.MutableDateTime mutableDateTime38 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        int int40 = dateTimeZone34.getStandardOffset(1644572444581L);
        mutableDateTime2.setZoneRetainFields(dateTimeZone34);
        java.lang.String str42 = dateTimeZone34.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and instant25", (mutableDateTime2.compareTo(instant25) == 0) == mutableDateTime2.equals(instant25));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("2022-02-11T09:38:49.811Z");
        mutableDateTime1.setMillis((long) 52);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        boolean boolean15 = dateTime13.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes((int) (short) 10);
        long long18 = dateTime17.getMillis();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime17.plusHours((int) (short) 10);
        java.lang.Object obj22 = null;
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(obj22, dateTimeZone24);
        int int28 = dateTimeZone24.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime29 = dateTime17.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTime29.getZone();
        org.joda.time.DateTime dateTime32 = dateTime29.plusHours((int) (byte) 10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime29.minus(readableDuration34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and dateTime35", (mutableDateTime1.compareTo(dateTime35) == 0) == mutableDateTime1.equals(dateTime35));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.size();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.plusSeconds(35402805);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, (int) (byte) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj14 = null;
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj14, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDateTime11.toDateTime(dateTimeZone16);
        mutableDateTime6.setDate((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime6.add(readableDuration21);
        mutableDateTime6.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime6.setDayOfYear((int) (short) 1);
        mutableDateTime6.setMillis(1644572335842L);
        mutableDateTime6.setWeekOfWeekyear(20);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDateTime35.toDateTime(dateTimeZone40);
        boolean boolean45 = dateTime43.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime47 = dateTime43.minusMinutes((int) (short) 10);
        long long48 = dateTime47.getMillis();
        org.joda.time.Chronology chronology49 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField50 = chronology49.era();
        org.joda.time.DateTimeField dateTimeField51 = chronology49.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = chronology49.weekyear();
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime(chronology49);
        java.lang.Object obj54 = mutableDateTime53.clone();
        org.joda.time.MutableDateTime mutableDateTime55 = mutableDateTime53.toMutableDateTimeISO();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = localDateTime57.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology60 = localDateTime57.getChronology();
        org.joda.time.DurationField durationField61 = chronology60.seconds();
        org.joda.time.DateTimeField dateTimeField62 = chronology60.weekyearOfCentury();
        mutableDateTime55.setChronology(chronology60);
        org.joda.time.DateTimeField dateTimeField64 = chronology60.secondOfMinute();
        mutableDateTime6.setRounding(dateTimeField64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        mutableDateTime6.add(readablePeriod66, 35462141);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(chronology69);
        org.joda.time.LocalDateTime.Property property71 = localDateTime70.monthOfYear();
        org.joda.time.LocalDateTime localDateTime73 = property71.addWrapFieldToCopy((int) (short) 100);
        int int74 = property71.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime75 = property71.roundHalfFloorCopy();
        java.lang.String str76 = property71.getAsText();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = property71.getFieldType();
        boolean boolean78 = mutableDateTime6.isSupported(dateTimeFieldType77);
        boolean boolean79 = localDateTime3.isSupported(dateTimeFieldType77);
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.LocalDateTime localDateTime81 = localDateTime3.minus(readableDuration80);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime55", (dateTime19.compareTo(mutableDateTime55) == 0) == dateTime19.equals(mutableDateTime55));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        int int20 = dateTime17.getYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        boolean boolean32 = dateTime17.equals((java.lang.Object) property31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj38 = null;
        java.util.TimeZone timeZone39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj38, dateTimeZone40);
        org.joda.time.DateTime dateTime43 = localDateTime35.toDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj33, dateTimeZone40);
        org.joda.time.DateTime dateTime45 = dateTime17.withZoneRetainFields(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMonths(13);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.monthOfYear();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.plusSeconds((int) (byte) -1);
        boolean boolean57 = localDateTime49.isEqual((org.joda.time.ReadablePartial) localDateTime54);
        int int58 = localDateTime49.getHourOfDay();
        org.joda.time.Chronology chronology59 = localDateTime49.getChronology();
        org.joda.time.DateTime dateTime60 = dateTime47.withChronology(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime60.withMonthOfYear(3);
        org.joda.time.DateTime dateTime64 = dateTime60.plusSeconds(469);
        org.joda.time.MutableDateTime mutableDateTime65 = dateTime64.toMutableDateTime();
        mutableDateTime65.setDate(1644572430215L);
        java.lang.Object obj68 = mutableDateTime65.clone();
        org.joda.time.MutableDateTime.Property property69 = mutableDateTime65.millisOfDay();
        org.joda.time.MutableDateTime.Property property70 = mutableDateTime65.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime47 and dateTime60", (dateTime47.compareTo(dateTime60) == 0) == dateTime47.equals(dateTime60));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = mutableDateTime2.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.secondOfMinute();
        mutableDateTime34.setMinuteOfHour(55);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj42 = null;
        java.util.TimeZone timeZone43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone43);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(obj42, dateTimeZone44);
        org.joda.time.DateTime dateTime47 = localDateTime39.toDateTime(dateTimeZone44);
        boolean boolean49 = dateTime47.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime51 = dateTime47.minusMinutes((int) (short) 10);
        org.joda.time.DateTime dateTime53 = dateTime47.withMinuteOfHour(42);
        org.joda.time.DateTime.Property property54 = dateTime53.minuteOfHour();
        int int55 = dateTime53.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone56 = dateTime53.getZone();
        mutableDateTime34.setZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime34.year();
        org.joda.time.MutableDateTime mutableDateTime60 = property58.add(0L);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(1644572333722L);
        org.joda.time.DateTimeField dateTimeField63 = mutableDateTime62.getRoundingField();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.MutableDateTime mutableDateTime66 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology65);
        org.joda.time.ReadableDuration readableDuration67 = null;
        mutableDateTime66.add(readableDuration67, (int) (byte) 10);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.LocalDateTime localDateTime71 = new org.joda.time.LocalDateTime(chronology70);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime71.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj74 = null;
        java.util.TimeZone timeZone75 = null;
        org.joda.time.DateTimeZone dateTimeZone76 = org.joda.time.DateTimeZone.forTimeZone(timeZone75);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone76);
        org.joda.time.LocalDateTime localDateTime78 = new org.joda.time.LocalDateTime(obj74, dateTimeZone76);
        org.joda.time.DateTime dateTime79 = localDateTime71.toDateTime(dateTimeZone76);
        mutableDateTime66.setDate((org.joda.time.ReadableInstant) dateTime79);
        org.joda.time.DateTime dateTime81 = dateTime79.withLaterOffsetAtOverlap();
        mutableDateTime62.setDate((org.joda.time.ReadableInstant) dateTime79);
        mutableDateTime62.setDayOfYear((int) ' ');
        org.joda.time.Chronology chronology86 = null;
        org.joda.time.LocalDateTime localDateTime87 = new org.joda.time.LocalDateTime(chronology86);
        org.joda.time.LocalDateTime localDateTime89 = localDateTime87.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology90 = localDateTime87.getChronology();
        org.joda.time.DurationField durationField91 = chronology90.seconds();
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime((long) 49, chronology90);
        mutableDateTime62.setChronology(chronology90);
        org.joda.time.DateTimeField dateTimeField94 = chronology90.clockhourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime95 = new org.joda.time.MutableDateTime((java.lang.Object) mutableDateTime60, chronology90);
        org.joda.time.DateTime dateTime96 = org.joda.time.DateTime.now(chronology90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and mutableDateTime95", (mutableDateTime34.compareTo(mutableDateTime95) == 0) == mutableDateTime34.equals(mutableDateTime95));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.setMillis(1644572335842L);
        mutableDateTime2.setWeekOfWeekyear(20);
        mutableDateTime2.setYear(22);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(8);
        org.joda.time.DateTime dateTime34 = mutableDateTime2.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis(1644572339471L);
        org.joda.time.Instant instant37 = dateTime36.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime34", (mutableDateTime2.compareTo(dateTime34) == 0) == mutableDateTime2.equals(dateTime34));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        long long17 = dateTime13.getMillis();
        org.joda.time.DateTime.Property property18 = dateTime13.dayOfYear();
        org.joda.time.DateTime dateTime20 = property18.addWrapFieldToCopy(116);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMonths((int) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(409);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.minus(readablePeriod25);
        long long27 = dateTime24.getMillis();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(obj32, dateTimeZone34);
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime(dateTimeZone34);
        boolean boolean39 = dateTime37.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime41 = dateTime37.minusMinutes((int) (short) 10);
        long long42 = dateTime41.getMillis();
        org.joda.time.Chronology chronology43 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.era();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.weekyear();
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime(chronology43);
        java.lang.Object obj48 = mutableDateTime47.clone();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(chronology49);
        org.joda.time.LocalDateTime localDateTime52 = localDateTime50.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj53 = null;
        java.util.TimeZone timeZone54 = null;
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forTimeZone(timeZone54);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(obj53, dateTimeZone55);
        org.joda.time.DateTime dateTime58 = localDateTime50.toDateTime(dateTimeZone55);
        boolean boolean60 = dateTime58.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime62 = dateTime58.minusMinutes((int) (short) 10);
        long long63 = dateTime62.getMillis();
        org.joda.time.Chronology chronology64 = dateTime62.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.era();
        org.joda.time.DateTimeField dateTimeField66 = chronology64.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.weekyear();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime(chronology64);
        org.joda.time.DateTime dateTime69 = mutableDateTime47.toDateTime(chronology64);
        mutableDateTime47.addHours((int) (short) 100);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(chronology72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology76 = localDateTime73.getChronology();
        org.joda.time.DurationField durationField77 = chronology76.seconds();
        org.joda.time.DateTimeField dateTimeField78 = chronology76.weekyearOfCentury();
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime(chronology76);
        mutableDateTime47.setChronology(chronology76);
        org.joda.time.DateTime dateTime81 = dateTime24.withChronology(chronology76);
        org.joda.time.DateTime.Property property82 = dateTime24.minuteOfHour();
        org.joda.time.DateTime dateTime84 = property82.addToCopy((-27409541));
        java.lang.String str85 = property82.getAsString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime79", (dateTime9.compareTo(dateTime79) == 0) == dateTime9.equals(dateTime79));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.setMillis(1644572335842L);
        mutableDateTime2.setWeekOfWeekyear(20);
        mutableDateTime2.setYear(22);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours(8);
        org.joda.time.DateTime dateTime34 = mutableDateTime2.toDateTime(dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis(1644572339471L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(chronology39);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime40.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology43 = localDateTime40.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.seconds();
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((long) 49, chronology43);
        org.joda.time.DateTimeField dateTimeField46 = chronology43.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.dayOfYear();
        org.joda.time.DateTimeField dateTimeField49 = chronology43.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime((java.lang.Object) 1644572416453L, chronology43);
        java.lang.String str51 = chronology43.toString();
        org.joda.time.DurationField durationField52 = chronology43.seconds();
        org.joda.time.DateTime dateTime53 = dateTime34.toDateTime(chronology43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusYears(806);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime34", (mutableDateTime2.compareTo(dateTime34) == 0) == mutableDateTime2.equals(dateTime34));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5, (int) (byte) 10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        mutableDateTime4.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.minusMillis(9);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        org.joda.time.DateTime.Property property22 = dateTime21.minuteOfHour();
        org.joda.time.DateTime dateTime24 = dateTime21.minusMillis(11);
        org.joda.time.DateTime.Property property25 = dateTime21.millisOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundCeilingCopy();
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra(32);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj33 = null;
        java.util.TimeZone timeZone34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forTimeZone(timeZone34);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(obj33, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = localDateTime30.toDateTime(dateTimeZone35);
        boolean boolean40 = dateTime38.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime42 = dateTime38.minusMinutes((int) (short) 10);
        long long43 = dateTime42.getMillis();
        org.joda.time.Chronology chronology44 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.era();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.weekyear();
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology44);
        java.lang.Object obj49 = mutableDateTime48.clone();
        org.joda.time.Instant instant50 = mutableDateTime48.toInstant();
        int int51 = mutableDateTime48.getMillisOfSecond();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj56 = null;
        java.util.TimeZone timeZone57 = null;
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(obj56, dateTimeZone58);
        org.joda.time.DateTime dateTime61 = localDateTime53.toDateTime(dateTimeZone58);
        boolean boolean63 = dateTime61.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime65 = dateTime61.minusMinutes((int) (short) 10);
        long long66 = dateTime65.getMillis();
        org.joda.time.Chronology chronology67 = dateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField68 = chronology67.era();
        org.joda.time.DateTimeField dateTimeField69 = chronology67.yearOfCentury();
        org.joda.time.DurationField durationField70 = chronology67.days();
        org.joda.time.DurationField durationField71 = chronology67.hours();
        java.lang.Object obj72 = null;
        java.util.TimeZone timeZone73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = org.joda.time.DateTimeZone.forTimeZone(timeZone73);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone74);
        org.joda.time.LocalDateTime localDateTime76 = new org.joda.time.LocalDateTime(obj72, dateTimeZone74);
        int int78 = dateTimeZone74.getOffset((long) (byte) -1);
        boolean boolean79 = dateTimeZone74.isFixed();
        int int81 = dateTimeZone74.getStandardOffset(1644572334551L);
        org.joda.time.Chronology chronology82 = chronology67.withZone(dateTimeZone74);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.Chronology chronology84 = chronology82.withZone(dateTimeZone83);
        org.joda.time.DateTimeField dateTimeField85 = chronology84.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField86 = chronology84.yearOfCentury();
        org.joda.time.DateTime dateTime87 = mutableDateTime48.toDateTime(chronology84);
        org.joda.time.DateTime dateTime88 = dateTime28.withChronology(chronology84);
        org.joda.time.MutableDateTime mutableDateTime89 = new org.joda.time.MutableDateTime((long) 158, chronology84);
        org.joda.time.DurationField durationField90 = chronology84.seconds();
        org.joda.time.LocalTime localTime91 = new org.joda.time.LocalTime((java.lang.Object) 1644572547863L, chronology84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant50", (dateTime17.compareTo(instant50) == 0) == dateTime17.equals(instant50));
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = localDateTime3.toDateTime(dateTimeZone8);
        boolean boolean13 = dateTime11.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMinutes((int) (short) 10);
        long long16 = dateTime15.getMillis();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime15.plusHours((int) (short) 10);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        int int26 = dateTimeZone22.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime27 = dateTime15.toDateTime(dateTimeZone22);
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.lang.String str30 = locale29.getDisplayScript();
        java.lang.String str31 = dateTimeZone22.getName(0L, locale29);
        java.util.Set<java.lang.Character> charSet32 = locale29.getExtensionKeys();
        boolean boolean33 = charSet1.contains((java.lang.Object) charSet32);
        boolean boolean34 = charSet1.isEmpty();
        int int35 = charSet1.size();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(chronology37);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj41 = null;
        java.util.TimeZone timeZone42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone42);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(obj41, dateTimeZone43);
        org.joda.time.DateTime dateTime46 = localDateTime38.toDateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime48 = dateTime46.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime50 = dateTime46.minusWeeks((int) (short) 1);
        org.joda.time.DateTime.Property property51 = dateTime50.secondOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(chronology52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology56 = localDateTime53.getChronology();
        org.joda.time.DurationField durationField57 = chronology56.seconds();
        org.joda.time.DurationField durationField58 = chronology56.weeks();
        org.joda.time.DateTimeField dateTimeField59 = chronology56.hourOfDay();
        org.joda.time.DateTime dateTime60 = dateTime50.withChronology(chronology56);
        org.joda.time.Chronology chronology61 = dateTime60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.weekOfWeekyear();
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(1644572592497L, chronology61);
        boolean boolean64 = charSet1.equals((java.lang.Object) dateTime63);
        org.joda.time.DateTime.Property property65 = dateTime63.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime50 and dateTime60", (dateTime50.compareTo(dateTime60) == 0) == dateTime50.equals(dateTime60));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone4);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withDefaultYear(35402493);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter9.withDefaultYear(35388348);
        boolean boolean15 = dateTimeFormatter9.isPrinter();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = localDate18.toDateMidnight();
        java.lang.String str20 = localDate18.toString();
        org.joda.time.Chronology chronology21 = localDate18.getChronology();
        org.joda.time.LocalDate localDate23 = localDate18.plusYears(2022);
        org.joda.time.Chronology chronology24 = localDate18.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTimeZone dateTimeZone26 = chronology24.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter9.withZone(dateTimeZone26);
        long long30 = dateTimeZone26.adjustOffset(1644572869642L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime25", (dateTime6.compareTo(dateTime25) == 0) == dateTime6.equals(dateTime25));
    }
}

