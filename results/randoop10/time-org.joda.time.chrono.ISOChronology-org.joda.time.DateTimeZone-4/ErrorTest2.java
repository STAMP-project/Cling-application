import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTime dateTime18 = dateTime11.withFieldAdded(durationFieldType16, 2);
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(496);
        org.joda.time.DateTime dateTime23 = dateTime19.minusMinutes(26234817);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology24.secondOfDay();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology24.millisOfSecond();
        java.lang.String str31 = iSOChronology24.toString();
        org.joda.time.DurationField durationField32 = iSOChronology24.days();
        org.joda.time.DurationField durationField33 = iSOChronology24.weeks();
        org.joda.time.Chronology chronology34 = iSOChronology24.withUTC();
        org.joda.time.DateTime dateTime35 = dateTime23.toDateTime((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = iSOChronology24.add(readablePeriod36, 5911668690919212031L, 12096);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime35", (dateTime23.compareTo(dateTime35) == 0) == dateTime23.equals(dateTime35));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 55);
        java.util.Date date23 = instant16.toDate();
        org.joda.time.Instant instant26 = instant16.withDurationAdded(648000000L, (int) (short) 10);
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        int int17 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(0L);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime11.toMutableDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime16 = property14.roundFloorCopy();
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        org.joda.time.Instant instant18 = new org.joda.time.Instant((java.lang.Object) dateTime17);
        int int19 = dateTime17.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant18", (dateTime15.compareTo(instant18) == 0) == dateTime15.equals(instant18));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField5", (durationField1.compareTo(durationField5) == 0) == durationField1.equals(durationField5));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = instant16.toMutableDateTime(dateTimeZone19);
        org.joda.time.Instant instant23 = instant16.plus((-18934127999983L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long32 = dateTimeZone30.previousTransition((long) (-1));
        long long36 = dateTimeZone30.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = dateTimeZone30.getShortName((long) '#', locale38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.DateTime dateTime42 = dateTime40.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays(35);
        org.joda.time.DateTime dateTime45 = localDate26.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean47 = dateTime45.isAfter(1645837200000L);
        org.joda.time.YearMonthDay yearMonthDay48 = dateTime45.toYearMonthDay();
        org.joda.time.DateTime dateTime50 = dateTime45.withMinuteOfHour(52);
        org.joda.time.DateTime.Property property51 = dateTime45.weekyear();
        org.joda.time.DateTime dateTime53 = property51.addToCopy((int) (short) 10);
        org.joda.time.DateTime dateTime54 = property51.withMaximumValue();
        java.util.Date date55 = dateTime54.toDate();
        boolean boolean56 = instant23.isBefore((org.joda.time.ReadableInstant) dateTime54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getWeekyear();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.DateTime dateTime18 = dateTime11.withFieldAdded(durationFieldType16, 2);
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime21 = dateTime19.plusMinutes(496);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(0L, dateTimeZone23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.LocalDate localDate27 = localDate24.withField(dateTimeFieldType25, 6);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property35 = localDate32.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean37 = localDate32.isSupported(dateTimeFieldType36);
        boolean boolean38 = localDate24.equals((java.lang.Object) dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate(dateTimeZone40);
        java.util.Locale locale43 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str44 = locale43.getDisplayScript();
        java.lang.String str45 = dateTimeZone40.getShortName((long) 22, locale43);
        org.joda.time.DateTime dateTime46 = localDate24.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.DateTime dateTime47 = dateTime19.toDateTime(dateTimeZone40);
        org.joda.time.Instant instant49 = org.joda.time.Instant.parse("2022-02-22T07:18:45.292");
        org.joda.time.Instant instant52 = instant49.withDurationAdded((long) (-27425177), 816);
        org.joda.time.MutableDateTime mutableDateTime53 = instant52.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime54 = instant52.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime55 = instant52.toMutableDateTimeISO();
        boolean boolean56 = dateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime55);
        int int57 = dateTime19.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant52 and mutableDateTime53", (instant52.compareTo(mutableDateTime53) == 0) == instant52.equals(mutableDateTime53));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property11 = localDate8.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localDate8.toString(dateTimeFormatter12);
        int int14 = localDate8.getDayOfMonth();
        int int15 = localDate8.getMonthOfYear();
        org.joda.time.LocalDate.Property property16 = localDate8.yearOfCentury();
        int[] intArray18 = iSOChronology0.get((org.joda.time.ReadablePartial) localDate8, (long) 42);
        org.joda.time.DurationField durationField19 = iSOChronology0.hours();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField23 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField24 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField24, durationField1, and durationField3", !(durationField24.compareTo(durationField1) == 0) || (Math.signum(durationField24.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField4", (durationField1.compareTo(durationField4) == 0) == durationField1.equals(durationField4));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = instant16.toMutableDateTime(dateTimeZone19);
        org.joda.time.Instant instant23 = instant16.plus((-18934127999983L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = dateTimeZone25.getShortName((long) '#', locale33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property38 = dateTime35.weekyear();
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime dateTime40 = property38.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int43 = dateTime40.get(dateTimeFieldType42);
        boolean boolean44 = instant16.isBefore((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.MutableDateTime mutableDateTime45 = instant16.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.Instant instant47 = instant16.minus(readableDuration46);
        long long48 = instant16.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(52);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = localDate7.isSupported(dateTimeFieldType9);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone16, locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter14.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.secondOfMinute();
        org.joda.time.DurationField durationField27 = iSOChronology23.hours();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long32 = dateTimeZone30.previousTransition((long) (-1));
        long long36 = dateTimeZone30.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = dateTimeZone30.getShortName((long) '#', locale38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.Chronology chronology41 = iSOChronology23.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter22.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(1642130191922L, dateTimeZone30);
        org.joda.time.DateTime dateTime44 = localDate7.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.Instant instant45 = dateTime44.toInstant();
        org.joda.time.Instant instant46 = dateTime44.toInstant();
        org.joda.time.Instant instant47 = instant46.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and instant45", (dateTime44.compareTo(instant45) == 0) == dateTime44.equals(instant45));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DurationField durationField24 = iSOChronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.monthOfYear();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology22);
        boolean boolean27 = dateTime15.equals((java.lang.Object) iSOChronology22);
        org.joda.time.Instant instant28 = dateTime15.toInstant();
        org.joda.time.Instant instant29 = instant28.toInstant();
        java.lang.String str30 = instant29.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant29", (dateTime15.compareTo(instant29) == 0) == dateTime15.equals(instant29));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfDay();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField7 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField7", (durationField1.compareTo(durationField7) == 0) == durationField1.equals(durationField7));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime21.getCenturyOfEra();
        int int23 = dateTime21.getDayOfYear();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime21.toMutableDateTime();
        org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) instant25, dateTimeZone26);
        boolean boolean28 = instant25.isEqualNow();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.secondOfDay();
        int int33 = instant25.get(dateTimeField32);
        boolean boolean35 = instant25.isAfter(1645514267789L);
        java.util.Date date36 = instant25.toDate();
        date36.setTime((long) 158);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DurationField durationField8 = iSOChronology0.days();
        org.joda.time.DurationField durationField9 = iSOChronology0.weeks();
        org.joda.time.Chronology chronology10 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology0.year();
        org.joda.time.DurationField durationField12 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField8, and durationField9", !(durationField12.compareTo(durationField8) == 0) || (Math.signum(durationField12.compareTo(durationField9)) == Math.signum(durationField8.compareTo(durationField9))));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        int int7 = date6.getMinutes();
        java.lang.String str8 = date6.toGMTString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) date6);
        boolean boolean10 = instant9.isEqualNow();
        boolean boolean12 = instant9.isAfter((long) 40);
        org.joda.time.DateTime dateTime13 = instant9.toDateTime();
        org.joda.time.DateTime dateTime14 = instant9.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant9.minus(readableDuration15);
        org.joda.time.Instant instant18 = instant9.plus((long) 441);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant9", (dateTime13.compareTo(instant9) == 0) == dateTime13.equals(instant9));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.yearOfCentury();
        long long8 = iSOChronology1.getDateTimeMillis(496, (int) (byte) 10, 14, 6);
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfEra();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(1645154232961L, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField12 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField14 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField9, and durationField12", !(durationField14.compareTo(durationField9) == 0) || (Math.signum(durationField14.compareTo(durationField12)) == Math.signum(durationField9.compareTo(durationField12))));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        org.joda.time.DateTime dateTime24 = dateTime11.withYearOfCentury(20);
        org.joda.time.DateTime dateTime26 = dateTime11.minusMillis(371);
        boolean boolean27 = dateTime26.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "days" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.util.Locale.FilteringMode filteringMode9 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList10 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList7, filteringMode9);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap11 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList12 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap11);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) ' ', dateTimeZone18);
        org.joda.time.LocalTime.Property property22 = localTime21.minuteOfHour();
        java.util.Locale locale23 = java.util.Locale.ITALY;
        java.lang.String str24 = property22.getAsText(locale23);
        java.lang.String str25 = locale23.getISO3Country();
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale30.getScript();
        java.util.Locale locale32 = java.util.Locale.JAPANESE;
        java.lang.String str33 = locale32.getScript();
        java.util.Locale[] localeArray34 = new java.util.Locale[] { locale23, locale26, locale28, locale29, locale30, locale32 };
        java.util.ArrayList<java.util.Locale> localeList35 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList35, localeArray34);
        java.util.Locale.FilteringMode filteringMode37 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList35, filteringMode37);
        java.util.Locale locale39 = java.util.Locale.lookup(languageRangeList12, (java.util.Collection<java.util.Locale>) localeList35);
        org.joda.time.chrono.ISOChronology iSOChronology40 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField41 = iSOChronology40.weekyears();
        org.joda.time.DurationField durationField42 = iSOChronology40.halfdays();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) locale39, (org.joda.time.Chronology) iSOChronology40);
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology40.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology40.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology40.era();
        org.joda.time.DurationField durationField47 = iSOChronology40.years();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology40.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField47", (durationField41.compareTo(durationField47) == 0) == durationField41.equals(durationField47));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getTimeZone("days");
        boolean boolean18 = timeZone17.observesDaylightTime();
        int int20 = timeZone17.getOffset((-39720000L));
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTime dateTime22 = dateTime11.withZoneRetainFields(dateTimeZone21);
        int int23 = dateTime22.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant15", (dateTime11.compareTo(instant15) == 0) == dateTime11.equals(instant15));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime11.minusYears((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str19 = dateTimeFieldType18.getName();
        boolean boolean20 = dateTime11.isSupported(dateTimeFieldType18);
        boolean boolean22 = dateTime11.isBefore((long) 386);
        org.joda.time.DateTime dateTime24 = dateTime11.withMillisOfDay(31);
        int int25 = dateTime11.getHourOfDay();
        java.util.GregorianCalendar gregorianCalendar26 = dateTime11.toGregorianCalendar();
        org.joda.time.DateTime dateTime28 = dateTime11.minusSeconds((-27425177));
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.dayOfMonth();
        org.joda.time.DurationField durationField33 = iSOChronology29.halfdays();
        org.joda.time.DurationField durationField34 = iSOChronology29.millis();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.dayOfYear();
        org.joda.time.DateTime dateTime36 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(dateTimeZone38);
        org.joda.time.LocalDate localDate41 = localDate39.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate43 = localDate41.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property44 = localDate41.weekyear();
        org.joda.time.LocalDate localDate46 = localDate41.withYearOfCentury(55);
        org.joda.time.LocalDate localDate48 = localDate41.minusDays((int) (short) -1);
        org.joda.time.LocalDate localDate50 = localDate48.withYearOfEra(13);
        org.joda.time.LocalDate localDate52 = localDate48.plusYears(32286745);
        int int53 = localDate48.getMonthOfYear();
        long long55 = iSOChronology29.set((org.joda.time.ReadablePartial) localDate48, 31536000000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime36", (dateTime11.compareTo(dateTime36) == 0) == dateTime11.equals(dateTime36));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField10 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField1, and durationField3", !(durationField10.compareTo(durationField1) == 0) || (Math.signum(durationField10.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getWeekyear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        org.joda.time.DateTime dateTime17 = instant16.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime18 = instant16.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime17", (dateTime11.compareTo(dateTime17) == 0) == dateTime11.equals(dateTime17));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField1, and durationField2", !(durationField7.compareTo(durationField1) == 0) || (Math.signum(durationField7.compareTo(durationField2)) == Math.signum(durationField1.compareTo(durationField2))));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        long long10 = dateTimeZone4.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#', locale12);
        java.lang.String str14 = dateTimeZone4.getID();
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(1645837200000L, (org.joda.time.Chronology) iSOChronology15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.minuteOfHour();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = locale18.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.lang.String str21 = locale18.getDisplayName(locale20);
        int int22 = dateTimeField17.getMaximumTextLength(locale20);
        java.util.Calendar calendar23 = java.util.Calendar.getInstance(timeZone1, locale20);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone25);
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25, locale28);
        java.util.TimeZone timeZone30 = java.util.TimeZone.getDefault();
        calendar29.setTimeZone(timeZone30);
        calendar23.setTimeZone(timeZone30);
        java.time.Instant instant33 = calendar23.toInstant();
        long long34 = calendar23.getTimeInMillis();
        java.util.Date date35 = calendar23.getTime();
        java.lang.String str36 = date35.toGMTString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar23 and calendar29", (calendar23.compareTo(calendar29) == 0) == calendar23.equals(calendar29));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        org.joda.time.DateTime dateTime24 = dateTime11.withYearOfCentury(20);
        int int25 = dateTime24.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DurationField durationField24 = iSOChronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.monthOfYear();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology22);
        boolean boolean27 = dateTime15.equals((java.lang.Object) iSOChronology22);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = iSOChronology22.add(readablePeriod29, (long) (byte) 10, 1970);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology22.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology22.era();
        org.joda.time.DurationField durationField36 = dateTimeField35.getRangeDurationField();
        org.joda.time.DurationField durationField37 = dateTimeField35.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField37, durationField23, and durationField24", !(durationField37.compareTo(durationField23) == 0) || (Math.signum(durationField37.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.weekyear();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTime dateTime10 = dateTime7.withDurationAdded(0L, (-27425177));
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = iSOChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.hourOfDay();
        org.joda.time.DurationField durationField15 = iSOChronology11.centuries();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.Chronology chronology27 = iSOChronology11.withZone(dateTimeZone17);
        java.lang.String str29 = dateTimeZone17.getName((long) 47);
        org.joda.time.DateTime dateTime30 = dateTime10.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime31 = dateTime10.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime30", (dateTime31.compareTo(dateTime30) == 0) == dateTime31.equals(dateTime30));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusHours(55);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.LocalDateTime localDateTime17 = property15.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.dayOfWeek();
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField20 = iSOChronology19.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.monthOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(55);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime26.dayOfYear();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.year();
        org.joda.time.LocalDateTime localDateTime31 = property29.addToCopy(32772);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.minusMinutes(620);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withYearOfEra(55);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = iSOChronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.hourOfDay();
        org.joda.time.LocalDateTime localDateTime40 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField[] dateTimeFieldArray41 = localDateTime40.getFields();
        int int42 = localDateTime40.getDayOfMonth();
        int int43 = localDateTime40.getYear();
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int46 = localDateTime40.get(dateTimeFieldType45);
        org.joda.time.DurationFieldType durationFieldType47 = dateTimeFieldType45.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime33.withFieldAdded(durationFieldType47, 339);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime17.withFieldAdded(durationFieldType47, 15513385);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime17.withYearOfEra(496);
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField55 = iSOChronology54.weekyears();
        org.joda.time.DurationField durationField56 = iSOChronology54.halfdays();
        org.joda.time.DurationField durationField57 = iSOChronology54.years();
        org.joda.time.DurationFieldType durationFieldType58 = durationField57.getType();
        boolean boolean59 = localDateTime17.isSupported(durationFieldType58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField57", (durationField1.compareTo(durationField57) == 0) == durationField1.equals(durationField57));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.joda.time.DateTime dateTime16 = dateTime13.withYear(1970);
        org.joda.time.DateTime dateTime18 = dateTime13.plusMinutes(26253159);
        long long19 = dateTime13.getMillis();
        org.joda.time.Instant instant20 = dateTime13.toInstant();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.joda.time.Instant instant24 = instant20.plus(184L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant20", (dateTime13.compareTo(instant20) == 0) == dateTime13.equals(instant20));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalTime localTime12 = dateTime11.toLocalTime();
        org.joda.time.DateTime.Property property13 = dateTime11.secondOfDay();
        org.joda.time.DateTime dateTime15 = property13.addToCopy(425);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = iSOChronology16.weekyears();
        org.joda.time.DurationField durationField18 = iSOChronology16.minutes();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.secondOfMinute();
        org.joda.time.DurationField durationField20 = iSOChronology16.hours();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.Chronology chronology34 = iSOChronology16.withZone(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime15.toDateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology16.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime35", (dateTime15.compareTo(dateTime35) == 0) == dateTime15.equals(dateTime35));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime15 = dateTime7.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        int int17 = dateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.LocalTime localTime30 = dateTime29.toLocalTime();
        org.joda.time.DateTime dateTime32 = dateTime29.minusWeeks(428);
        boolean boolean33 = dateTime15.equals((java.lang.Object) dateTime32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime29", (dateTime7.compareTo(dateTime29) == 0) == dateTime7.equals(dateTime29));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = instant16.toMutableDateTime(dateTimeZone19);
        org.joda.time.Instant instant23 = instant16.plus((-18934127999983L));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = dateTimeZone25.getShortName((long) '#', locale33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property38 = dateTime35.weekyear();
        org.joda.time.DateTime dateTime39 = property38.roundFloorCopy();
        org.joda.time.DateTime dateTime40 = property38.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        int int43 = dateTime40.get(dateTimeFieldType42);
        boolean boolean44 = instant16.isBefore((org.joda.time.ReadableInstant) dateTime40);
        java.lang.String str45 = instant16.toString();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long49 = dateTimeZone47.previousTransition((long) (-1));
        long long53 = dateTimeZone47.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str56 = dateTimeZone47.getShortName((long) '#', locale55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime59 = dateTime57.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property60 = dateTime57.weekyear();
        int int61 = dateTime57.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = dateTime57.withZone(dateTimeZone62);
        org.joda.time.DateTime dateTime65 = dateTime63.minusYears(999);
        org.joda.time.Instant instant66 = dateTime63.toInstant();
        boolean boolean67 = instant16.isBefore((org.joda.time.ReadableInstant) dateTime63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant66", (dateTime11.compareTo(instant66) == 0) == dateTime11.equals(instant66));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.LocalTime localTime9 = property6.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        boolean boolean12 = localTime9.isSupported(dateTimeFieldType10);
        org.joda.time.LocalTime localTime14 = localTime9.plusSeconds(55);
        org.joda.time.LocalTime.Property property15 = localTime9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours((int) (short) 100);
        int int30 = dateTime27.getWeekOfWeekyear();
        int int31 = dateTime27.getSecondOfMinute();
        org.joda.time.DateTime.Property property32 = dateTime27.millisOfDay();
        org.joda.time.DateTime dateTime34 = dateTime27.minusHours(39326399);
        org.joda.time.DateTime dateTime36 = dateTime27.minus(568L);
        org.joda.time.format.DateTimePrinter dateTimePrinter37 = null;
        org.joda.time.format.DateTimeParser dateTimeParser38 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter37, dateTimeParser38);
        java.util.TimeZone timeZone41 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone41);
        java.util.Locale.Category category43 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale44 = java.util.Locale.getDefault(category43);
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(timeZone41, locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter39.withLocale(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter46.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter47.withOffsetParsed();
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology49.era();
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology49);
        org.joda.time.DurationField durationField52 = iSOChronology49.seconds();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology49.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology49.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter48.withChronology((org.joda.time.Chronology) iSOChronology49);
        org.joda.time.Chronology chronology56 = iSOChronology49.withUTC();
        org.joda.time.DateTime dateTime57 = dateTime27.withChronology((org.joda.time.Chronology) iSOChronology49);
        long long58 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime57);
        java.lang.String str59 = property15.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime57", (dateTime27.compareTo(dateTime57) == 0) == dateTime27.equals(dateTime57));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(103418443094399999L);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.era();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.secondOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology2.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology2.clockhourOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTime dateTime13 = dateTime1.toDateTime((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime15", (dateTime1.compareTo(dateTime15) == 0) == dateTime1.equals(dateTime15));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology13);
        int int16 = localTime10.get(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        java.lang.String str28 = dateTimeZone18.getID();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.halfdayOfDay();
        org.joda.time.DurationField durationField31 = iSOChronology29.months();
        boolean boolean32 = dateTimeFieldType11.isSupported((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField34 = iSOChronology33.weekyears();
        org.joda.time.DurationField durationField35 = iSOChronology33.halfdays();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology33.monthOfYear();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology33.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DurationField durationField41 = iSOChronology33.weeks();
        org.joda.time.DateTime dateTime42 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DurationField durationField43 = iSOChronology33.years();
        org.joda.time.DateTimeField dateTimeField44 = iSOChronology33.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField14 and durationField43", (durationField14.compareTo(durationField43) == 0) == durationField14.equals(durationField43));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        int int10 = localDateTime8.getDayOfWeek();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusWeeks(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.era();
        java.lang.Object obj15 = null;
        boolean boolean16 = property14.equals(obj15);
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property14.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = property14.addWrapFieldToCopy(26328233);
        org.joda.time.DurationField durationField21 = property14.getDurationField();
        org.joda.time.LocalDateTime localDateTime22 = property14.withMaximumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField21", Math.signum(durationField1.compareTo(durationField21)) == -Math.signum(durationField21.compareTo(durationField1)));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant0.withDurationAdded(40000L, 35);
        org.joda.time.Instant instant6 = instant3.withDurationAdded(1645024700755L, 946);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant3.plus(readableDuration7);
        org.joda.time.DateTime dateTime9 = instant3.toDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant12 = instant3.withDurationAdded(readableDuration10, 221);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant12 and dateTime9", (instant12.compareTo(dateTime9) == 0) == instant12.equals(dateTime9));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        int int17 = dateTime11.getDayOfYear();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(0L);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime11.toMutableDateTime(dateTimeZone20);
        int int23 = dateTimeZone20.getOffset(15917904172800203L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology0.secondOfDay();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField20 = iSOChronology0.years();
        org.joda.time.DurationField durationField21 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField20", (durationField1.compareTo(durationField20) == 0) == durationField1.equals(durationField20));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        org.joda.time.DateTime.Property property23 = dateTime11.centuryOfEra();
        boolean boolean24 = property23.isLeap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1, locale4);
        int int6 = calendar5.getFirstDayOfWeek();
        calendar5.setWeekDate(99, 657, 1);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(103418443094399999L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long16 = dateTimeZone14.previousTransition((long) (-1));
        long long20 = dateTimeZone14.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale22 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str23 = dateTimeZone14.getShortName((long) '#', locale22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime25 = dateTime12.toDateTime(dateTimeZone14);
        java.util.TimeZone timeZone26 = dateTimeZone14.toTimeZone();
        calendar5.setTimeZone(timeZone26);
        calendar5.set(5, 181, 331, 411, 699, (-1));
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime25", (dateTime12.compareTo(dateTime25) == 0) == dateTime12.equals(dateTime25));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.dayOfMonth();
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime((org.joda.time.Chronology) iSOChronology21);
        int int26 = dateTime25.getYearOfEra();
        org.joda.time.DateTime dateTime28 = dateTime25.withYearOfEra(37153425);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.era();
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfWeek();
        org.joda.time.DurationField durationField34 = iSOChronology29.weeks();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        long long39 = iSOChronology29.add(readablePeriod36, (long) 52, 0);
        org.joda.time.DateTimeZone dateTimeZone40 = iSOChronology29.getZone();
        org.joda.time.DateTime dateTime41 = dateTime25.toDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime25", (dateTime18.compareTo(dateTime25) == 0) == dateTime18.equals(dateTime25));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) ' ', dateTimeZone25);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int31 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday();
        int int33 = dateTime32.getWeekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.era();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology34);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology34.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology34.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology34.secondOfDay();
        org.joda.time.DurationField durationField40 = iSOChronology34.weeks();
        org.joda.time.DurationField durationField41 = iSOChronology34.centuries();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology34.dayOfMonth();
        org.joda.time.DateTime dateTime43 = dateTime32.toDateTime((org.joda.time.Chronology) iSOChronology34);
        boolean boolean44 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.chrono.ISOChronology iSOChronology45 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField46 = iSOChronology45.weekyears();
        org.joda.time.DurationField durationField47 = iSOChronology45.halfdays();
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology45.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology45.yearOfEra();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology45.minuteOfDay();
        org.joda.time.DurationField durationField51 = iSOChronology45.centuries();
        org.joda.time.DateTime dateTime52 = dateTime11.toDateTime((org.joda.time.Chronology) iSOChronology45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime32 and dateTime43", (dateTime32.compareTo(dateTime43) == 0) == dateTime32.equals(dateTime43));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("0");
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Instant instant5 = instant1.plus(readableDuration4);
        long long6 = instant5.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and dateTime2", (instant5.compareTo(dateTime2) == 0) == instant5.equals(dateTime2));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = dateTime20.withZoneRetainFields(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) ' ', dateTimeZone25);
        org.joda.time.LocalTime.Property property29 = localTime28.minuteOfHour();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime33 = localTime31.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField37 = iSOChronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType34.getField((org.joda.time.Chronology) iSOChronology36);
        int int39 = localTime33.get(dateTimeFieldType34);
        boolean boolean40 = dateTime20.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime.Property property41 = dateTime20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long45 = dateTimeZone43.previousTransition((long) (-1));
        long long49 = dateTimeZone43.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = dateTimeZone43.getShortName((long) '#', locale51);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTime dateTime55 = dateTime53.minusHours((int) (short) 100);
        int int56 = dateTime53.getWeekOfWeekyear();
        int int57 = dateTime53.getWeekyear();
        org.joda.time.DateTime dateTime59 = dateTime53.minusYears((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str61 = dateTimeFieldType60.getName();
        boolean boolean62 = dateTime53.isSupported(dateTimeFieldType60);
        org.joda.time.chrono.ISOChronology iSOChronology63 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField64 = iSOChronology63.era();
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology63);
        org.joda.time.DateTimeField dateTimeField66 = iSOChronology63.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField67 = iSOChronology63.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField68 = iSOChronology63.secondOfDay();
        org.joda.time.DurationField durationField69 = iSOChronology63.weeks();
        org.joda.time.DurationField durationField70 = iSOChronology63.centuries();
        org.joda.time.DateTimeField dateTimeField71 = iSOChronology63.year();
        boolean boolean72 = dateTimeFieldType60.isSupported((org.joda.time.Chronology) iSOChronology63);
        int int73 = dateTime20.get(dateTimeFieldType60);
        org.joda.time.DateTime dateTime75 = dateTime20.minusYears(254);
        org.joda.time.chrono.ISOChronology iSOChronology76 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField77 = iSOChronology76.weekyears();
        org.joda.time.DurationField durationField78 = iSOChronology76.halfdays();
        org.joda.time.DateTimeField dateTimeField79 = iSOChronology76.dayOfMonth();
        org.joda.time.DurationField durationField80 = iSOChronology76.seconds();
        org.joda.time.DurationField durationField81 = iSOChronology76.seconds();
        org.joda.time.Chronology chronology82 = iSOChronology76.withUTC();
        org.joda.time.DurationField durationField83 = iSOChronology76.weekyears();
        org.joda.time.DateTime dateTime84 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology76);
        org.joda.time.DateTime dateTime86 = dateTime84.plusDays(38326318);
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.DateTime dateTime88 = dateTime86.minus(readablePeriod87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime84", (dateTime18.compareTo(dateTime84) == 0) == dateTime18.equals(dateTime84));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 226, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField2, and durationField3", !(durationField8.compareTo(durationField2) == 0) || (Math.signum(durationField8.compareTo(durationField3)) == Math.signum(durationField2.compareTo(durationField3))));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, (int) (short) 1);
        org.joda.time.Chronology chronology6 = iSOChronology0.withZone(dateTimeZone5);
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.era();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology7.millisOfSecond();
        org.joda.time.DurationField durationField17 = iSOChronology7.weekyears();
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = iSOChronology18.weekyears();
        org.joda.time.DateTimeZone dateTimeZone20 = iSOChronology18.getZone();
        org.joda.time.DurationField durationField21 = iSOChronology18.seconds();
        org.joda.time.DurationField durationField22 = iSOChronology18.halfdays();
        org.joda.time.DurationField durationField23 = iSOChronology18.seconds();
        org.joda.time.DurationField durationField24 = iSOChronology18.millis();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology18.minuteOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField27 = iSOChronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.hourOfDay();
        org.joda.time.DurationField durationField30 = iSOChronology26.centuries();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        long long38 = dateTimeZone32.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = dateTimeZone32.getShortName((long) '#', locale40);
        org.joda.time.Chronology chronology42 = iSOChronology26.withZone(dateTimeZone32);
        java.lang.String str44 = dateTimeZone32.getName((long) 47);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime(dateTimeZone32);
        org.joda.time.Chronology chronology47 = iSOChronology18.withZone(dateTimeZone32);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone50);
        java.util.Locale.Category category52 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone50, locale53);
        java.util.Locale locale55 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.Character> charSet56 = locale55.getExtensionKeys();
        java.util.Calendar calendar57 = java.util.Calendar.getInstance(locale55);
        java.lang.String str58 = locale53.getDisplayLanguage(locale55);
        java.lang.String str59 = locale55.getDisplayVariant();
        java.lang.String str60 = dateTimeZone32.getShortName(1642130223000L, locale55);
        org.joda.time.Chronology chronology61 = iSOChronology7.withZone(dateTimeZone32);
        long long63 = dateTimeZone5.getMillisKeepLocal(dateTimeZone32, (long) 529);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField2 and durationField17", (durationField2.compareTo(durationField17) == 0) == durationField2.equals(durationField17));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDate7.toString(dateTimeFormatter11);
        int int13 = localDate7.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight14 = localDate7.toDateMidnight();
        org.joda.time.LocalDate localDate16 = localDate7.plusWeeks((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate7.minus(readablePeriod17);
        long long20 = iSOChronology0.set((org.joda.time.ReadablePartial) localDate7, (long) 39326399);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology0.era();
        org.joda.time.DurationField durationField22 = iSOChronology0.eras();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology0.centuryOfEra();
        org.joda.time.DurationField durationField24 = iSOChronology0.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField24, and durationField22", !(durationField22.compareTo(durationField24) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField24.compareTo(durationField22))));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.LocalDate localDate5 = localDate2.withField(dateTimeFieldType3, 6);
        org.joda.time.LocalDate.Property property6 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long11 = dateTimeZone9.previousTransition((long) (-1));
        long long15 = dateTimeZone9.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = dateTimeZone9.getShortName((long) '#', locale17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime21 = dateTime19.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(35);
        int int24 = dateTime21.getMinuteOfHour();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.Instant instant27 = instant25.withMillis((long) 48);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long31 = dateTimeZone29.previousTransition((long) (-1));
        long long35 = dateTimeZone29.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale37 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str38 = dateTimeZone29.getShortName((long) '#', locale37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekyear((int) (byte) 10);
        org.joda.time.DateMidnight dateMidnight42 = dateTime39.toDateMidnight();
        boolean boolean43 = instant25.isAfter((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = instant25.getZone();
        org.joda.time.DateTime dateTime45 = localDate7.toDateTimeAtCurrentTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and instant25", (dateTime21.compareTo(instant25) == 0) == dateTime21.equals(instant25));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = dateTime20.withZoneRetainFields(dateTimeZone21);
        org.joda.time.LocalTime localTime23 = dateTime20.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.parse("37988355");
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.lang.String[] strArray33 = new java.lang.String[] { "", "hi!", "days" };
        java.util.ArrayList<java.lang.String> strList34 = new java.util.ArrayList<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList34, strArray33);
        java.util.Locale.FilteringMode filteringMode36 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList37 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strList34, filteringMode36);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap38 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList39 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap38);
        java.util.Locale.LanguageRange[] languageRangeArray40 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList41 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList41, languageRangeArray40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long47 = dateTimeZone45.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) ' ', dateTimeZone45);
        org.joda.time.LocalTime.Property property49 = localTime48.minuteOfHour();
        java.util.Locale locale50 = java.util.Locale.ITALY;
        java.lang.String str51 = property49.getAsText(locale50);
        java.lang.String str52 = locale50.getISO3Country();
        java.util.Locale locale53 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str54 = locale53.toLanguageTag();
        java.util.Locale locale55 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale56 = java.util.Locale.KOREA;
        java.util.Locale locale57 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str58 = locale57.getScript();
        java.util.Locale locale59 = java.util.Locale.JAPANESE;
        java.lang.String str60 = locale59.getScript();
        java.util.Locale[] localeArray61 = new java.util.Locale[] { locale50, locale53, locale55, locale56, locale57, locale59 };
        java.util.ArrayList<java.util.Locale> localeList62 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList62, localeArray61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList41, (java.util.Collection<java.util.Locale>) localeList62, filteringMode64);
        java.util.Locale locale66 = java.util.Locale.lookup(languageRangeList39, (java.util.Collection<java.util.Locale>) localeList62);
        org.joda.time.chrono.ISOChronology iSOChronology67 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField68 = iSOChronology67.weekyears();
        org.joda.time.DurationField durationField69 = iSOChronology67.halfdays();
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((java.lang.Object) locale66, (org.joda.time.Chronology) iSOChronology67);
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime70.toMutableDateTimeISO();
        int int72 = dateTime70.getMillisOfSecond();
        int int73 = dateTime26.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int75 = dateTime26.get(dateTimeFieldType74);
        java.lang.String str76 = dateTimeFieldType74.getName();
        boolean boolean77 = localTime23.isSupported(dateTimeFieldType74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime70", (dateTime11.compareTo(dateTime70) == 0) == dateTime11.equals(dateTime70));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology2.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology2.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        java.util.GregorianCalendar gregorianCalendar10 = dateTime9.toGregorianCalendar();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology12.era();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology12.dayOfWeek();
        org.joda.time.DurationField durationField17 = iSOChronology12.weeks();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology12.year();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology12.year();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.DurationField durationField22 = iSOChronology12.years();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) ' ', dateTimeZone25);
        org.joda.time.LocalTime.Property property29 = localTime28.minuteOfHour();
        java.util.Locale locale30 = java.util.Locale.ITALY;
        java.lang.String str31 = property29.getAsText(locale30);
        org.joda.time.LocalTime localTime32 = property29.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        boolean boolean35 = localTime32.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime localTime37 = localTime32.plusSeconds(55);
        org.joda.time.LocalTime.Property property38 = localTime32.millisOfSecond();
        org.joda.time.Chronology chronology39 = localTime32.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.days();
        int int41 = durationField22.compareTo(durationField40);
        boolean boolean42 = gregorianCalendar10.before((java.lang.Object) durationField40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField22", (durationField3.compareTo(durationField22) == 0) == durationField3.equals(durationField22));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.years();
        org.joda.time.DurationField durationField7 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField6", (durationField1.compareTo(durationField6) == 0) == durationField1.equals(durationField6));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.plusMillis(99);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime25 = dateTime20.withDurationAdded(readableDuration23, (int) (short) 100);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        int int27 = dateTime25.getWeekyear();
        int int28 = dateTime25.getWeekyear();
        org.joda.time.DateTime dateTime29 = dateTime25.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long33 = dateTimeZone31.previousTransition((long) (-1));
        long long37 = dateTimeZone31.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale39 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str40 = dateTimeZone31.getShortName((long) '#', locale39);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime43 = dateTime41.minusHours((int) (short) 100);
        int int44 = dateTime41.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property45 = dateTime41.monthOfYear();
        org.joda.time.Instant instant46 = dateTime41.toInstant();
        boolean boolean48 = dateTime41.isBefore(1L);
        org.joda.time.DateTime dateTime50 = dateTime41.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime52 = dateTime41.withYearOfCentury(3);
        org.joda.time.DateTime dateTime54 = dateTime41.withYearOfCentury(20);
        int int55 = dateTime41.getCenturyOfEra();
        boolean boolean56 = dateTime25.isBefore((org.joda.time.ReadableInstant) dateTime41);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant46", (dateTime11.compareTo(instant46) == 0) == dateTime11.equals(instant46));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean9 = localDate4.isSupported(dateTimeFieldType8);
        org.joda.time.LocalDate localDate11 = localDate4.minusDays(292278993);
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        boolean boolean17 = dateTimeZone15.isStandardOffset((long) (-27425175));
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        long long21 = dateTimeZone15.nextTransition(1645514325513L);
        java.lang.String str22 = dateTimeZone15.getID();
        boolean boolean23 = dateTimeZone15.isFixed();
        java.util.Calendar.Builder builder24 = new java.util.Calendar.Builder();
        java.util.TimeZone timeZone26 = java.util.TimeZone.getTimeZone("days");
        java.util.Calendar.Builder builder27 = builder24.setTimeZone(timeZone26);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property35 = localDate34.dayOfMonth();
        java.util.Locale locale36 = java.util.Locale.ENGLISH;
        java.lang.String str37 = property35.getAsText(locale36);
        java.util.Calendar.Builder builder38 = builder24.setLocale(locale36);
        java.util.Locale locale40 = new java.util.Locale("2022-02-06T08:17:18.746+97:00");
        java.lang.String str41 = locale36.getDisplayVariant(locale40);
        boolean boolean42 = dateTimeZone15.equals((java.lang.Object) str41);
        org.joda.time.DateTime dateTime43 = localDate13.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long47 = dateTimeZone45.previousTransition((long) (-1));
        long long51 = dateTimeZone45.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale53 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str54 = dateTimeZone45.getShortName((long) '#', locale53);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(dateTimeZone45);
        org.joda.time.DateTime dateTime57 = dateTime55.withWeekyear((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(0L, dateTimeZone59);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate63 = new org.joda.time.LocalDate(dateTimeZone62);
        org.joda.time.LocalDate localDate65 = localDate63.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate68 = localDate63.withField(dateTimeFieldType66, 6);
        org.joda.time.LocalDate.Property property69 = localDate60.property(dateTimeFieldType66);
        org.joda.time.DateTime dateTime71 = dateTime55.withField(dateTimeFieldType66, 55);
        org.joda.time.DateTime.Property property72 = dateTime71.yearOfEra();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((java.lang.Object) dateTime71, chronology73);
        int int75 = dateTime71.getYearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.DateTime dateTime77 = dateTime71.plus(readablePeriod76);
        boolean boolean78 = dateTime43.isAfter((org.joda.time.ReadableInstant) dateTime77);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime77 and dateTime74", (dateTime77.compareTo(dateTime74) == 0) == dateTime77.equals(dateTime74));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        int int7 = date6.getMinutes();
        java.lang.String str8 = date6.toGMTString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) date6);
        boolean boolean10 = instant9.isEqualNow();
        boolean boolean12 = instant9.isAfter((long) 40);
        org.joda.time.DateTime dateTime13 = instant9.toDateTime();
        org.joda.time.DateTime dateTime14 = instant9.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime15 = instant9.toMutableDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = iSOChronology16.weekyears();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology16.getZone();
        org.joda.time.DurationField durationField19 = iSOChronology16.seconds();
        org.joda.time.DurationField durationField20 = iSOChronology16.halfdays();
        org.joda.time.DurationField durationField21 = iSOChronology16.seconds();
        org.joda.time.DurationField durationField22 = iSOChronology16.millis();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology16.minuteOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.hourOfDay();
        org.joda.time.DurationField durationField28 = iSOChronology24.centuries();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long32 = dateTimeZone30.previousTransition((long) (-1));
        long long36 = dateTimeZone30.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = dateTimeZone30.getShortName((long) '#', locale38);
        org.joda.time.Chronology chronology40 = iSOChronology24.withZone(dateTimeZone30);
        java.lang.String str42 = dateTimeZone30.getName((long) 47);
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.Chronology chronology45 = iSOChronology16.withZone(dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime46 = mutableDateTime15.toMutableDateTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology16.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant9 and dateTime13", (instant9.compareTo(dateTime13) == 0) == instant9.equals(dateTime13));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekyear((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField17 = iSOChronology16.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType14.getField((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        int int22 = dateTimeField18.getDifference((long) 15, (long) 'x');
        int int24 = dateTimeField18.get((long) 32770);
        int int25 = dateTime13.get(dateTimeField18);
        int int26 = dateTime13.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime13.plus(readablePeriod27);
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTime();
        org.joda.time.DateTime dateTime31 = dateTime28.minus((-349199978L));
        org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology32.era();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology32.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology32.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology32.clockhourOfHalfday();
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime((org.joda.time.Chronology) iSOChronology32);
        org.joda.time.DurationField durationField40 = iSOChronology32.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime31 and dateTime39", (dateTime31.compareTo(dateTime39) == 0) == dateTime31.equals(dateTime39));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        java.util.Date date14 = dateTime11.toDate();
        org.joda.time.DateTime dateTime16 = dateTime11.minusSeconds((int) (byte) 100);
        int int17 = dateTime11.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long22 = dateTimeZone20.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 32772, dateTimeZone20);
        int int25 = dateTimeZone20.getOffsetFromLocal(4838400000L);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime11.toMutableDateTime(dateTimeZone20);
        org.joda.time.Instant instant27 = dateTime11.toInstant();
        long long28 = instant27.getMillis();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant30 = instant27.minus(readableDuration29);
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant30", (dateTime11.compareTo(instant30) == 0) == dateTime11.equals(instant30));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField6, durationField1, and durationField3", !(durationField6.compareTo(durationField1) == 0) || (Math.signum(durationField6.compareTo(durationField3)) == Math.signum(durationField1.compareTo(durationField3))));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        boolean boolean19 = instant16.isBeforeNow();
        boolean boolean21 = instant16.isEqual(315569520000000L);
        org.joda.time.Instant instant23 = instant16.minus((long) 899);
        org.joda.time.DateTime dateTime24 = instant16.toDateTime();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant16.minus(readableDuration25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant29 = instant26.withDurationAdded(readableDuration27, 456919);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant29", (dateTime11.compareTo(instant29) == 0) == dateTime11.equals(instant29));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology13.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology13.centuries();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        org.joda.time.Chronology chronology29 = iSOChronology13.withZone(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) ' ', dateTimeZone32);
        int int37 = dateTimeZone32.getOffsetFromLocal((long) (short) -1);
        long long39 = dateTimeZone19.getMillisKeepLocal(dateTimeZone32, (long) (byte) -1);
        int int41 = dateTimeZone32.getOffsetFromLocal((-1649167199000L));
        org.joda.time.DateTime dateTime42 = dateTime12.withZone(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = dateTime42.withMillis((long) 0);
        org.joda.time.chrono.ISOChronology iSOChronology45 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology45.era();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology45);
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology45.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology45.secondOfDay();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology45.millisOfSecond();
        java.lang.String str52 = iSOChronology45.toString();
        org.joda.time.DurationField durationField53 = iSOChronology45.days();
        org.joda.time.DurationField durationField54 = iSOChronology45.weeks();
        org.joda.time.Chronology chronology55 = iSOChronology45.withUTC();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology45.year();
        org.joda.time.DateTime dateTime57 = dateTime44.toDateTime((org.joda.time.Chronology) iSOChronology45);
        org.joda.time.DateTime.Property property58 = dateTime44.dayOfWeek();
        org.joda.time.DateTime dateTime59 = property58.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and dateTime57", (dateTime59.compareTo(dateTime57) == 0) == dateTime59.equals(dateTime57));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField1 and durationField3", Math.signum(durationField1.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField1)));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(103418443094399999L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int3 = dateTime1.get(dateTimeFieldType2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone5.previousTransition((long) (-1));
        long long11 = dateTimeZone5.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = dateTimeZone5.getShortName((long) '#', locale13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTime dateTime17 = dateTime15.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property18 = dateTime15.weekyear();
        int int19 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = dateTime15.withZone(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(999);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(0L, dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths(40);
        org.joda.time.LocalDate localDate30 = localDate26.minusMonths(760);
        org.joda.time.LocalDate localDate32 = localDate30.plusWeeks(57);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long36 = dateTimeZone34.previousTransition((long) (-1));
        long long40 = dateTimeZone34.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone34.getShortName((long) '#', locale42);
        org.joda.time.DateTime dateTime44 = localDate32.toDateTimeAtMidnight(dateTimeZone34);
        org.joda.time.DateTime dateTime45 = dateTime21.toDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = dateTime45.withZone(dateTimeZone46);
        int int48 = dateTime1.compareTo((org.joda.time.ReadableInstant) dateTime45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime21", (dateTime15.compareTo(dateTime21) == 0) == dateTime15.equals(dateTime21));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant2 = instant0.plus(readableDuration1);
        org.joda.time.MutableDateTime mutableDateTime3 = instant0.toMutableDateTimeISO();
        java.util.Locale locale6 = new java.util.Locale("2022-01-18T04:16:29.013+97:00", "Property[weekOfWeekyear]");
        java.util.Calendar calendar7 = mutableDateTime3.toCalendar(locale6);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTime();
        boolean boolean11 = calendar7.before((java.lang.Object) mutableDateTime10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime3", (instant0.compareTo(mutableDateTime3) == 0) == instant0.equals(mutableDateTime3));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone5);
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone5, locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withLocale(locale8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withZoneUTC();
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DurationField durationField14 = iSOChronology12.minutes();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.secondOfMinute();
        org.joda.time.DurationField durationField16 = iSOChronology12.hours();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology12.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.Chronology chronology30 = iSOChronology12.withZone(dateTimeZone19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter11.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(1642130191922L, dateTimeZone19);
        java.lang.String str33 = dateTimeZone19.getID();
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.era();
        int int37 = dateTimeField35.getLeapAmount((long) 10);
        boolean boolean39 = dateTimeField35.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType40.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology42 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField43 = iSOChronology42.weekyears();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType40.getField((org.joda.time.Chronology) iSOChronology42);
        org.joda.time.DurationField durationField45 = dateTimeField44.getDurationField();
        int int48 = dateTimeField44.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(dateTimeZone50);
        org.joda.time.LocalDate localDate53 = localDate51.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate55 = localDate53.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.years();
        boolean boolean57 = localDate53.isSupported(durationFieldType56);
        int[] intArray59 = new int[] { (short) 10 };
        int int60 = dateTimeField44.getMaximumValue((org.joda.time.ReadablePartial) localDate53, intArray59);
        org.joda.time.LocalDate.Property property61 = localDate53.yearOfCentury();
        int[] intArray66 = new int[] { 20, 6, 8 };
        int[] intArray68 = dateTimeField35.addWrapPartial((org.joda.time.ReadablePartial) localDate53, 99, intArray66, 0);
        org.joda.time.DateMidnight dateMidnight69 = localDate53.toDateMidnight();
        org.joda.time.DateTime dateTime70 = localDate53.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property71 = dateTime70.dayOfWeek();
        int int72 = dateTime70.getSecondOfDay();
        org.joda.time.DateTime dateTime73 = dateTime70.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime74 = dateTime70.withTimeAtStartOfDay();
        org.joda.time.Instant instant75 = new org.joda.time.Instant();
        org.joda.time.Instant instant78 = instant75.withDurationAdded(40000L, 35);
        org.joda.time.Instant instant81 = instant78.withDurationAdded(1645024700755L, 946);
        boolean boolean82 = dateTime74.isEqual((org.joda.time.ReadableInstant) instant81);
        int int83 = dateTimeZone19.getOffset((org.joda.time.ReadableInstant) instant81);
        org.joda.time.Chronology chronology84 = instant81.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime29 and instant75", (dateTime29.compareTo(instant75) == 0) == dateTime29.equals(instant75));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 55);
        org.joda.time.MutableDateTime mutableDateTime23 = instant16.toMutableDateTimeISO();
        boolean boolean25 = mutableDateTime23.isAfter((long) 26362129);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology21.era();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology21.dayOfMonth();
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime((org.joda.time.Chronology) iSOChronology21);
        int int26 = dateTime25.getYearOfEra();
        org.joda.time.DateTime dateTime28 = dateTime25.minusDays((int) (byte) 10);
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime25", (dateTime18.compareTo(dateTime25) == 0) == dateTime18.equals(dateTime25));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) (short) 10);
        int[] intArray20 = iSOChronology0.get((org.joda.time.ReadablePartial) localTime16, (long) (-1));
        org.joda.time.DurationField durationField21 = iSOChronology0.eras();
        org.joda.time.Chronology chronology22 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField27 = iSOChronology0.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField21, durationField27, and durationField21", !(durationField21.compareTo(durationField27) == 0) || (Math.signum(durationField21.compareTo(durationField21)) == Math.signum(durationField27.compareTo(durationField21))));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean23 = dateTime21.isAfter(1645837200000L);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime21.toYearMonthDay();
        org.joda.time.DateTime dateTime26 = dateTime21.withMillisOfSecond(31);
        org.joda.time.DateTime dateTime28 = dateTime21.minus((-971535367000L));
        org.joda.time.DateTime dateTime30 = dateTime28.withMillisOfSecond(731);
        org.joda.time.Instant instant31 = dateTime30.toInstant();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Instant instant33 = instant31.minus(readableDuration32);
        boolean boolean34 = instant33.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and instant33", (dateTime30.compareTo(instant33) == 0) == dateTime30.equals(instant33));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        int int7 = date6.getMinutes();
        java.lang.String str8 = date6.toGMTString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) date6);
        boolean boolean10 = instant9.isEqualNow();
        boolean boolean12 = instant9.isAfter((long) 40);
        org.joda.time.DateTime dateTime13 = instant9.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime14 = instant9.toMutableDateTimeISO();
        org.joda.time.Instant instant15 = instant9.toInstant();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime29 = dateTime27.minusHours((int) (short) 100);
        int int30 = dateTime27.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime27.monthOfYear();
        org.joda.time.DateTime dateTime32 = property31.withMinimumValue();
        org.joda.time.DateTime dateTime34 = property31.addWrapFieldToCopy((int) '4');
        int int35 = dateTime34.getDayOfMonth();
        org.joda.time.DateTime dateTime36 = dateTime34.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime38 = dateTime36.withZoneRetainFields(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long43 = dateTimeZone41.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((long) ' ', dateTimeZone41);
        org.joda.time.LocalTime.Property property45 = localTime44.minuteOfHour();
        org.joda.time.LocalTime localTime47 = localTime44.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime49 = localTime47.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType51 = dateTimeFieldType50.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology52 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField53 = iSOChronology52.weekyears();
        org.joda.time.DateTimeField dateTimeField54 = dateTimeFieldType50.getField((org.joda.time.Chronology) iSOChronology52);
        int int55 = localTime49.get(dateTimeFieldType50);
        boolean boolean56 = dateTime36.isSupported(dateTimeFieldType50);
        org.joda.time.DateTime.Property property57 = dateTime36.dayOfYear();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime60 = dateTime36.withDurationAdded(readableDuration58, 816);
        org.joda.time.DateTime dateTime62 = dateTime36.minusMillis(962);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long66 = dateTimeZone64.previousTransition((long) (-1));
        long long70 = dateTimeZone64.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale72 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str73 = dateTimeZone64.getShortName((long) '#', locale72);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime76 = dateTime74.minusHours((int) (short) 100);
        int int77 = dateTime74.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property78 = dateTime74.monthOfYear();
        org.joda.time.Instant instant79 = dateTime74.toInstant();
        boolean boolean81 = instant79.isEqual((long) 52);
        boolean boolean82 = instant79.isBeforeNow();
        boolean boolean84 = instant79.isEqual(315569520000000L);
        org.joda.time.Instant instant86 = instant79.minus((long) 899);
        boolean boolean87 = dateTime62.isEqual((org.joda.time.ReadableInstant) instant79);
        long long88 = instant79.getMillis();
        org.joda.time.DateTime dateTime89 = instant79.toDateTime();
        boolean boolean90 = instant9.isAfter((org.joda.time.ReadableInstant) dateTime89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant9", (dateTime13.compareTo(instant9) == 0) == dateTime13.equals(instant9));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        int int15 = dateTime11.getSecondOfMinute();
        org.joda.time.DateTime.Property property16 = dateTime11.millisOfDay();
        org.joda.time.DateTime dateTime18 = dateTime11.minusHours(39326399);
        org.joda.time.DateTime dateTime20 = dateTime11.minus(568L);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        java.util.TimeZone timeZone25 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone25);
        java.util.Locale.Category category27 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale28 = java.util.Locale.getDefault(category27);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone25, locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter23.withLocale(locale28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter30.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter31.withOffsetParsed();
        org.joda.time.chrono.ISOChronology iSOChronology33 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology33.era();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DurationField durationField36 = iSOChronology33.seconds();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology33.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology33.dayOfYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter32.withChronology((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.Chronology chronology40 = iSOChronology33.withUTC();
        org.joda.time.DateTime dateTime41 = dateTime11.withChronology((org.joda.time.Chronology) iSOChronology33);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType42.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.era();
        org.joda.time.DurationField durationField46 = iSOChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType42.getField((org.joda.time.Chronology) iSOChronology44);
        org.joda.time.DateTimeField dateTimeField48 = iSOChronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField49 = iSOChronology44.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime11.toMutableDateTime((org.joda.time.Chronology) iSOChronology44);
        org.joda.time.DurationField durationField51 = iSOChronology44.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime41", (dateTime11.compareTo(dateTime41) == 0) == dateTime11.equals(dateTime41));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(4000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType3 = dateTimeFieldType2.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = iSOChronology4.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType2.getField((org.joda.time.Chronology) iSOChronology4);
        org.joda.time.DurationField durationField7 = iSOChronology4.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology4.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) ' ', dateTimeZone12);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int18 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime17);
        long long20 = iSOChronology4.set((org.joda.time.ReadablePartial) localTime15, (long) 86399999);
        org.joda.time.LocalTime localTime22 = localTime15.withHourOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean24 = localTime22.equals((java.lang.Object) dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = instant1.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and mutableDateTime25", (instant1.compareTo(mutableDateTime25) == 0) == instant1.equals(mutableDateTime25));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 52);
        boolean boolean19 = instant16.isBeforeNow();
        boolean boolean21 = instant16.isEqual(315569520000000L);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant16.withDurationAdded(readableDuration22, 16);
        org.joda.time.Instant instant27 = instant16.withDurationAdded(4000L, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant27", (dateTime11.compareTo(instant27) == 0) == dateTime11.equals(instant27));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(52);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean10 = localDate7.isSupported(dateTimeFieldType9);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("days");
        java.util.TimeZone.setDefault(timeZone16);
        java.util.Locale.Category category18 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale19 = java.util.Locale.getDefault(category18);
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(timeZone16, locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter14.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withZoneUTC();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.secondOfMinute();
        org.joda.time.DurationField durationField27 = iSOChronology23.hours();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long32 = dateTimeZone30.previousTransition((long) (-1));
        long long36 = dateTimeZone30.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale38 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str39 = dateTimeZone30.getShortName((long) '#', locale38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone30);
        org.joda.time.Chronology chronology41 = iSOChronology23.withZone(dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter22.withZone(dateTimeZone30);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(1642130191922L, dateTimeZone30);
        org.joda.time.DateTime dateTime44 = localDate7.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long48 = dateTimeZone46.previousTransition((long) 10);
        org.joda.time.LocalDate localDate49 = org.joda.time.LocalDate.now(dateTimeZone46);
        org.joda.time.chrono.ISOChronology iSOChronology50 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField51 = iSOChronology50.weekyears();
        org.joda.time.DurationField durationField52 = iSOChronology50.halfdays();
        org.joda.time.DateTimeField dateTimeField53 = iSOChronology50.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology50.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone55 = iSOChronology50.getZone();
        java.util.TimeZone timeZone56 = dateTimeZone55.toTimeZone();
        long long58 = dateTimeZone46.getMillisKeepLocal(dateTimeZone55, 0L);
        org.joda.time.DateTime dateTime59 = dateTime44.toDateTime(dateTimeZone55);
        boolean boolean61 = dateTime59.isEqual((long) 30009);
        org.joda.time.DateTime dateTime63 = dateTime59.minusDays(0);
        org.joda.time.DateTime dateTime65 = dateTime63.withSecondOfMinute(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime44 and dateTime63", (dateTime44.compareTo(dateTime63) == 0) == dateTime44.equals(dateTime63));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime22 = dateTime20.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        org.joda.time.Instant instant24 = dateTime20.toInstant();
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        boolean boolean26 = instant24.isAfterNow();
        org.joda.time.Instant instant28 = instant24.plus((long) 366);
        org.joda.time.DateTime dateTime29 = instant28.toDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and instant24", (dateTime20.compareTo(instant24) == 0) == dateTime20.equals(instant24));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDate localDate9 = localDate4.minus(readablePeriod8);
        org.joda.time.LocalDate localDate11 = localDate4.plusYears(233);
        org.joda.time.DateTime dateTime12 = localDate11.toDateTimeAtStartOfDay();
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime12.millisOfDay();
        java.util.Date date15 = dateTime12.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime12.getZone();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant13", (dateTime12.compareTo(instant13) == 0) == dateTime12.equals(instant13));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology0.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField11", (durationField1.compareTo(durationField11) == 0) == durationField1.equals(durationField11));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        org.joda.time.Instant instant18 = instant16.plus((-62190374399900L));
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long27 = dateTimeZone25.previousTransition((long) (-1));
        long long31 = dateTimeZone25.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str34 = dateTimeZone25.getShortName((long) '#', locale33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime37 = dateTime35.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays(35);
        org.joda.time.DateTime dateTime40 = localDate21.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime41 = dateTime39.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTime39.getZone();
        org.joda.time.DateTime dateTime44 = dateTime39.withMinuteOfHour(23);
        boolean boolean45 = instant16.isBefore((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.MutableDateTime mutableDateTime46 = instant16.toMutableDateTimeISO();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = mutableDateTime46.toDateTime(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant16", (dateTime11.compareTo(instant16) == 0) == dateTime11.equals(instant16));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DurationField durationField24 = iSOChronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.monthOfYear();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology22);
        boolean boolean27 = dateTime15.equals((java.lang.Object) iSOChronology22);
        org.joda.time.Instant instant28 = dateTime15.toInstant();
        org.joda.time.Instant instant29 = instant28.toInstant();
        org.joda.time.Instant instant30 = instant28.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and instant30", (dateTime15.compareTo(instant30) == 0) == dateTime15.equals(instant30));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DurationField durationField3 = iSOChronology0.eras();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField3", Math.signum(durationField2.compareTo(durationField3)) == -Math.signum(durationField3.compareTo(durationField2)));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField23 = iSOChronology22.weekyears();
        org.joda.time.DurationField durationField24 = iSOChronology22.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.monthOfYear();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology22);
        boolean boolean27 = dateTime15.equals((java.lang.Object) iSOChronology22);
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        long long32 = iSOChronology22.add(readablePeriod29, (long) (byte) 10, 1970);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology22.minuteOfDay();
        org.joda.time.DurationField durationField35 = dateTimeField34.getRangeDurationField();
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology36);
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology36.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology36.dayOfWeek();
        org.joda.time.Chronology chronology42 = iSOChronology36.withUTC();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology36.weekOfWeekyear();
        org.joda.time.DurationField durationField44 = iSOChronology36.years();
        org.joda.time.DurationField durationField45 = iSOChronology36.seconds();
        int int46 = durationField35.compareTo(durationField45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField23 and durationField44", (durationField23.compareTo(durationField44) == 0) == durationField23.equals(durationField44));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(55);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMillis(15);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        java.lang.String str14 = durationFieldType13.getName();
        boolean boolean15 = localDateTime10.isSupported(durationFieldType13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) ' ', dateTimeZone18);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int24 = localTime21.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean27 = localTime23.isAfter((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.Chronology chronology28 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.monthOfYear();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.era();
        org.joda.time.DurationField durationField31 = chronology28.weekyears();
        org.joda.time.DurationField durationField32 = chronology28.years();
        org.joda.time.DurationFieldType durationFieldType33 = durationField32.getType();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime10.withFieldAdded(durationFieldType33, 26727797);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField32", (durationField1.compareTo(durationField32) == 0) == durationField1.equals(durationField32));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property15.addWrapFieldToCopy((int) '4');
        int int19 = dateTime18.getDayOfMonth();
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTime();
        org.joda.time.DateTime dateTime22 = dateTime20.plusMillis(99);
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology24.era();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.weekyearOfCentury();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology24);
        boolean boolean29 = dateTime22.isAfter((org.joda.time.ReadableInstant) dateTime28);
        java.util.Date date30 = dateTime28.toDate();
        int int31 = date30.getYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime28", (dateTime11.compareTo(dateTime28) == 0) == dateTime11.equals(dateTime28));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        java.lang.String str2 = durationFieldType1.getName();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        long long10 = dateTimeZone4.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#', locale12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.weekyearOfCentury();
        int int23 = dateTime18.get(dateTimeField22);
        org.joda.time.DateTime dateTime26 = dateTime18.withDurationAdded((long) (byte) 10, (int) (short) 0);
        int int27 = dateTime26.getEra();
        long long28 = dateTime26.getMillis();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DurationField durationField31 = iSOChronology29.minutes();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.era();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.centuryOfEra();
        long long39 = iSOChronology29.add(1655882498375L, 80L, 27);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime26.toMutableDateTime((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField41 = durationFieldType1.getField((org.joda.time.Chronology) iSOChronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime40", (dateTime18.compareTo(mutableDateTime40) == 0) == dateTime18.equals(mutableDateTime40));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = iSOChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology9.hourOfDay();
        org.joda.time.DurationField durationField13 = iSOChronology9.centuries();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology9.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField17 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology0.era();
        org.joda.time.DurationField durationField19 = dateTimeField18.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField19, durationField5, and durationField8", !(durationField19.compareTo(durationField5) == 0) || (Math.signum(durationField19.compareTo(durationField8)) == Math.signum(durationField5.compareTo(durationField8))));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.YearMonthDay yearMonthDay14 = dateTime13.toYearMonthDay();
        org.joda.time.DateTime dateTime16 = dateTime13.plusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.minuteOfDay();
        org.joda.time.Instant instant20 = dateTime18.toInstant();
        org.joda.time.MutableDateTime mutableDateTime21 = instant20.toMutableDateTime();
        long long22 = mutableDateTime21.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant20", (dateTime13.compareTo(instant20) == 0) == dateTime13.equals(instant20));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.Instant instant17 = instant15.plus((long) ' ');
        boolean boolean18 = instant15.isEqualNow();
        java.lang.String str19 = instant15.toString();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.Instant instant21 = instant15.plus(readableDuration20);
        org.joda.time.Instant instant22 = instant21.toInstant();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and instant22", (dateTime11.compareTo(instant22) == 0) == dateTime11.equals(instant22));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology0.years();
        org.joda.time.DurationField durationField9 = iSOChronology0.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField1 and durationField8", (durationField1.compareTo(durationField8) == 0) == durationField1.equals(durationField8));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        int int7 = date6.getMinutes();
        java.lang.String str8 = date6.toGMTString();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) date6);
        boolean boolean10 = instant9.isEqualNow();
        org.joda.time.Instant instant12 = instant9.withMillis((long) 17);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Instant instant14 = instant9.minus(readableDuration13);
        org.joda.time.DateTime dateTime15 = instant9.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant18 = instant9.withDurationAdded(readableDuration16, 6900032);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant18 and dateTime15", (instant18.compareTo(dateTime15) == 0) == instant18.equals(dateTime15));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        java.lang.String str18 = dateTime15.toString();
        org.joda.time.DateTime dateTime20 = dateTime15.withMillis(28401256800000L);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField25 = iSOChronology24.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType22.getField((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DurationField durationField27 = iSOChronology24.hours();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology24.secondOfMinute();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 349200000, (org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTime dateTime30 = dateTime20.withChronology((org.joda.time.Chronology) iSOChronology24);
        org.joda.time.DateTime dateTime32 = dateTime20.withYearOfCentury(84);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long36 = dateTimeZone34.previousTransition((long) (-1));
        long long40 = dateTimeZone34.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str43 = dateTimeZone34.getShortName((long) '#', locale42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime46 = dateTime44.minusHours((int) (short) 100);
        int int47 = dateTime44.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property48 = dateTime44.monthOfYear();
        org.joda.time.DateTime dateTime49 = property48.withMinimumValue();
        org.joda.time.DateTime dateTime51 = property48.addWrapFieldToCopy((int) '4');
        int int52 = dateTime51.getDayOfMonth();
        org.joda.time.DateTime dateTime53 = dateTime51.toDateTime();
        org.joda.time.chrono.ISOChronology iSOChronology54 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology54.era();
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology54);
        org.joda.time.DateTimeField dateTimeField57 = iSOChronology54.dayOfMonth();
        org.joda.time.DateTime dateTime58 = dateTime51.toDateTime((org.joda.time.Chronology) iSOChronology54);
        int int59 = dateTime58.getYearOfEra();
        boolean boolean60 = dateTime20.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.Chronology chronology61 = dateTime58.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime30", (dateTime20.compareTo(dateTime30) == 0) == dateTime20.equals(dateTime30));
    }
}

