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
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime7 = property5.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime11 = dateTime7.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime7.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int21 = dateTime19.get(dateTimeFieldType20);
        org.joda.time.DateTime dateTime22 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime26 = dateTime19.toDateTime(dateTimeZone25);
        org.joda.time.Chronology chronology27 = dateTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType13.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.weekyear();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime7.toMutableDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField32 = chronology27.millisOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology27.dayOfWeek();
        org.joda.time.DurationField durationField34 = durationFieldType1.getField(chronology27);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(9L, chronology27);
        java.util.TimeZone timeZone37 = java.util.TimeZone.getTimeZone("South Korea");
        int int38 = timeZone37.getRawOffset();
        timeZone37.setRawOffset(10);
        int int41 = timeZone37.getRawOffset();
        java.util.TimeZone.setDefault(timeZone37);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        long long45 = dateTimeZone43.nextTransition((long) 17);
        java.lang.String str47 = dateTimeZone43.getName(1645455524468L);
        org.joda.time.DateTime dateTime48 = localDate35.toDateTimeAtMidnight(dateTimeZone43);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime48", (dateTime4.compareTo(dateTime48) == 0) == dateTime4.equals(dateTime48));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.minus(readableDuration11);
        boolean boolean13 = dateTime10.isAfterNow();
        org.joda.time.Instant instant14 = dateTime10.toInstant();
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant14", (dateTime2.compareTo(instant14) == 0) == dateTime2.equals(instant14));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType2.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.centuryOfEra();
        boolean boolean20 = durationFieldType1.isSupported(chronology16);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology16.add(readablePeriod21, 0L, (int) (short) 0);
        org.joda.time.DurationField durationField25 = chronology16.eras();
        org.joda.time.DateTimeField dateTimeField26 = chronology16.hourOfHalfday();
        org.joda.time.DurationField durationField27 = chronology16.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField27, and durationField25", !(durationField25.compareTo(durationField27) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField27.compareTo(durationField25))));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.millisOfSecond();
        int int23 = localDateTime16.getSecondOfMinute();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.Instant instant26 = instant24.plus((long) (short) 1);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        boolean boolean29 = localDateTime16.equals((java.lang.Object) instant28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant32 = instant28.withDurationAdded(readableDuration30, 889);
        org.joda.time.Instant instant35 = instant28.withDurationAdded((long) 97, 4871);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.MutableDateTime mutableDateTime38 = instant35.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime39 = instant35.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant35 and mutableDateTime38", (instant35.compareTo(mutableDateTime38) == 0) == instant35.equals(mutableDateTime38));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-10), 44);
        int int4 = dateTimeZone2.getStandardOffset(125999905L);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime.Property property9 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime11 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime13 = property9.addToCopy(32772);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) '#');
        int int16 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField35 = chronology31.clockhourOfDay();
        java.lang.String str36 = chronology31.toString();
        org.joda.time.DateTime dateTime37 = dateTime13.withChronology(chronology31);
        org.joda.time.Instant instant38 = new org.joda.time.Instant((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime39 = instant38.toDateTimeISO();
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and instant38", (dateTime13.compareTo(instant38) == 0) == dateTime13.equals(instant38));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.millisOfSecond();
        int int23 = localDateTime16.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.withYear((int) (short) -1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime16.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property7 = localTime4.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime9 = localTime4.minus(readablePeriod8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType10.getField(chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        int int16 = dateTimeField12.getMinimumValue((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime.Property property17 = localTime14.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime19 = localTime14.minus(readablePeriod18);
        int int20 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime27.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType21.getField(chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.weekyear();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.yearOfCentury();
        org.joda.time.DurationField durationField40 = chronology35.months();
        org.joda.time.DateTimeField dateTimeField41 = chronology35.clockhourOfDay();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology35);
        boolean boolean43 = localTime14.equals((java.lang.Object) dateTime42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime34", (dateTime24.compareTo(dateTime34) == 0) == dateTime24.equals(dateTime34));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.LocalDate localDate14 = property12.withMaximumValue();
        int int15 = localDate14.getWeekyear();
        int int16 = localDate14.getDayOfYear();
        org.joda.time.LocalDate.Property property17 = localDate14.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime24.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime24.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType18.getField(chronology32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int38 = dateTimeZone36.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime39 = localDateTime34.toDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property40 = localDateTime34.millisOfSecond();
        int int41 = localDateTime34.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property42 = localDateTime34.year();
        boolean boolean43 = localDate14.equals((java.lang.Object) localDateTime34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime31", (dateTime2.compareTo(dateTime31) == 0) == dateTime2.equals(dateTime31));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.DurationField durationField19 = chronology14.seconds();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(chronology14);
        int int21 = localDate20.getDayOfMonth();
        org.joda.time.LocalDate localDate23 = localDate20.minusWeeks(45);
        org.joda.time.LocalDate.Property property24 = localDate23.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.getLocalDateTime();
        int int24 = property22.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField26 = property22.getField();
        org.joda.time.LocalDateTime localDateTime27 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusHours((-292275054));
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.dayOfYear();
        java.lang.String str31 = property30.getAsShortText();
        org.joda.time.LocalDateTime localDateTime32 = property30.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime33 = property30.withMaximumValue();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.yearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime15.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime15.minus(readablePeriod23);
        long long25 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DurationField durationField26 = property9.getLeapDurationField();
        org.joda.time.LocalTime localTime27 = property9.getLocalTime();
        org.joda.time.LocalTime localTime29 = localTime27.withSecondOfMinute(0);
        org.joda.time.LocalTime.Property property30 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime32 = localTime27.minusHours(1991);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime35.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime35.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime35.plus(readableDuration41);
        org.joda.time.DateTime dateTime43 = dateTime35.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime49 = localTime46.withFields((org.joda.time.ReadablePartial) localTime48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime54 = localTime51.withFields((org.joda.time.ReadablePartial) localTime53);
        int int55 = localTime48.compareTo((org.joda.time.ReadablePartial) localTime51);
        int int56 = localTime51.getHourOfDay();
        int int57 = localTime51.getMillisOfSecond();
        org.joda.time.LocalTime.Property property58 = localTime51.minuteOfHour();
        org.joda.time.LocalTime.Property property59 = localTime51.hourOfDay();
        org.joda.time.Chronology chronology60 = localTime51.getChronology();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((-32481758L), chronology60);
        org.joda.time.DateTimeField dateTimeField62 = chronology60.secondOfMinute();
        org.joda.time.DateTime dateTime63 = dateTime35.withChronology(chronology60);
        org.joda.time.DateTime dateTime64 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and dateTime63", (dateTime15.compareTo(dateTime63) == 0) == dateTime15.equals(dateTime63));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(9);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.MutableDateTime mutableDateTime8 = instant6.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone10);
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime15.minus((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime15.withDayOfWeek(4);
        boolean boolean23 = dateTime15.equals((java.lang.Object) "eras");
        int int24 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime25 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) 'u');
        int int28 = dateTime27.getWeekyear();
        int int29 = dateTime27.getSecondOfDay();
        org.joda.time.DateTime dateTime31 = dateTime27.minusWeeks((int) (short) 0);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime34.toMutableDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) '#');
        org.joda.time.DateTime dateTime40 = dateTime34.withDayOfWeek(4);
        org.joda.time.LocalDate localDate41 = dateTime34.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.plus(readablePeriod42);
        org.joda.time.LocalDate.Property property44 = localDate43.weekyear();
        org.joda.time.LocalDate localDate46 = localDate43.withYearOfEra(37919999);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateTime dateTime57 = dateTime52.withWeekOfWeekyear((int) (short) 10);
        int int58 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime57);
        long long60 = dateTimeZone49.nextTransition((long) '#');
        org.joda.time.DateTime dateTime61 = localDate46.toDateTimeAtMidnight(dateTimeZone49);
        org.joda.time.DateTime dateTime62 = dateTime31.toDateTime(dateTimeZone49);
        org.joda.time.DateTime.Property property63 = dateTime31.secondOfDay();
        org.joda.time.DateTime.Property property64 = dateTime31.millisOfSecond();
        boolean boolean65 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusHours(1970);
        int int18 = dateTime17.getMonthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime17.plusDays(678);
        org.joda.time.DateTime.Property property21 = dateTime17.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone23);
        org.joda.time.LocalDate.Property property25 = localDate24.weekOfWeekyear();
        org.joda.time.LocalDate localDate26 = property25.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        boolean boolean35 = localDate26.equals((java.lang.Object) dateTime32);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int44 = dateTime42.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime45 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime49 = dateTime42.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType36.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.weekyear();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.halfdayOfDay();
        org.joda.time.DateTime dateTime54 = dateTime32.toDateTime(chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.secondOfDay();
        org.joda.time.Chronology chronology56 = chronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.hourOfHalfday();
        org.joda.time.DateTime dateTime58 = dateTime17.withChronology(chronology56);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 0, chronology60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime61.toMutableDateTime(chronology62);
        org.joda.time.DateTime dateTime65 = dateTime61.minus((long) '#');
        int int66 = dateTime61.getCenturyOfEra();
        org.joda.time.DateTime dateTime68 = dateTime61.plusWeeks((int) (short) 0);
        org.joda.time.DateTime dateTime70 = dateTime61.plusMillis((int) (byte) 100);
        org.joda.time.DateTime.Property property71 = dateTime61.secondOfMinute();
        org.joda.time.DateTime dateTime72 = property71.roundFloorCopy();
        org.joda.time.Chronology chronology73 = dateTime72.getChronology();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 0, chronology75);
        org.joda.time.DateTime.Property property77 = dateTime76.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration78 = null;
        org.joda.time.DateTime dateTime79 = dateTime76.plus(readableDuration78);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int81 = dateTime79.get(dateTimeFieldType80);
        org.joda.time.DateTime dateTime82 = dateTime79.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone85 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime86 = dateTime79.toDateTime(dateTimeZone85);
        java.util.Locale locale90 = new java.util.Locale("2022-02-21T01:05:35.943", "ISOChronology[+10:32]");
        java.lang.String str91 = dateTimeZone85.getName(1645455558544L, locale90);
        org.joda.time.DateTime dateTime92 = dateTime72.withZoneRetainFields(dateTimeZone85);
        org.joda.time.DateTime dateTime93 = dateTime17.toDateTime(dateTimeZone85);
        long long96 = dateTimeZone85.convertLocalToUTC((long) (-1036628640), true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime58", (dateTime17.compareTo(dateTime58) == 0) == dateTime17.equals(dateTime58));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(24L);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTime dateTime13 = dateTime8.withWeekOfWeekyear((int) (short) 10);
        int int14 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime16 = dateTime13.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.halfdayOfDay();
        org.joda.time.DurationField durationField35 = chronology31.hours();
        org.joda.time.DateTime dateTime36 = dateTime13.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField37 = chronology31.secondOfDay();
        org.joda.time.DateTime dateTime38 = org.joda.time.DateTime.now(chronology31);
        org.joda.time.DateTime dateTime39 = instant1.toDateTime(chronology31);
        org.joda.time.DateTime dateTime40 = instant1.toDateTimeISO();
        org.joda.time.DateTime.Property property41 = dateTime40.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime39", (instant1.compareTo(dateTime39) == 0) == instant1.equals(dateTime39));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        java.lang.String str25 = dateTimeFieldType9.getName();
        boolean boolean26 = instant8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        org.joda.time.DateTime dateTime36 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime40 = dateTime33.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType27.getField(chronology41);
        boolean boolean43 = instant8.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology44 = instant8.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant8", (dateTime2.compareTo(instant8) == 0) == dateTime2.equals(instant8));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime19 = property17.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean20 = calendar0.after((java.lang.Object) property17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        int int24 = dateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime26 = dateTime23.withYear(10);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime29.toMutableDateTime(chronology30);
        org.joda.time.DateTime dateTime33 = dateTime29.minus((long) '#');
        org.joda.time.DateTime dateTime35 = dateTime29.withDayOfWeek(4);
        boolean boolean37 = dateTime29.equals((java.lang.Object) "eras");
        boolean boolean38 = dateTime23.isEqual((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DateTime dateTime40 = dateTime29.plusMinutes(2022);
        int int41 = property17.getDifference((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime.Property property42 = dateTime40.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 0, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.plus(readableDuration50);
        org.joda.time.DateTime dateTime53 = dateTime48.withWeekOfWeekyear((int) (short) 10);
        int int54 = dateTimeZone45.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime56 = dateTime53.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.plus(readableDuration57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.DateTime dateTime61 = dateTime56.withPeriodAdded(readablePeriod59, 37920);
        org.joda.time.DateTime dateTime64 = dateTime61.withDurationAdded((-9223372016611199989L), (-1));
        org.joda.time.DateTime dateTime66 = dateTime64.minus((long) '#');
        int int67 = dateTime64.getDayOfWeek();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime((long) 0, chronology69);
        int int71 = dateTime64.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Instant instant72 = dateTime70.toInstant();
        org.joda.time.MutableDateTime mutableDateTime73 = instant72.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.Instant instant76 = instant72.withDurationAdded(readableDuration74, 49);
        long long77 = property42.getDifferenceAsLong((org.joda.time.ReadableInstant) instant72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and instant72", (dateTime16.compareTo(instant72) == 0) == dateTime16.equals(instant72));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((java.lang.Object) dateTime5);
        org.joda.time.Instant instant32 = instant30.plus((-62197664365985L));
        org.joda.time.MutableDateTime mutableDateTime33 = instant32.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant30", (dateTime5.compareTo(instant30) == 0) == dateTime5.equals(instant30));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(4);
        org.joda.time.LocalDate localDate10 = dateTime3.toLocalDate();
        boolean boolean12 = localDate10.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate14 = localDate10.plusYears(0);
        int int15 = localDate10.getWeekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.DateTime dateTime24 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime28 = dateTime21.toDateTime(dateTimeZone27);
        int int30 = dateTimeZone27.getStandardOffset((long) 9);
        long long32 = dateTimeZone27.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime35.toMutableDateTime(chronology36);
        org.joda.time.DateTime dateTime39 = dateTime35.minus((long) '#');
        org.joda.time.DateTime dateTime41 = dateTime35.withDayOfWeek(4);
        org.joda.time.DateTime.Property property42 = dateTime41.minuteOfHour();
        org.joda.time.DateTime dateTime44 = dateTime41.withCenturyOfEra(1);
        int int45 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) dateTime41);
        java.lang.String str47 = dateTimeZone27.getShortName(1645455501905L);
        long long51 = dateTimeZone27.convertLocalToUTC(37920197L, true, 1645455538430L);
        org.joda.time.DateTime dateTime52 = localDate10.toDateTimeAtStartOfDay(dateTimeZone27);
        int int53 = localDate10.size();
        org.joda.time.LocalDate localDate55 = localDate10.withWeekyear(34);
        org.joda.time.LocalDate localDate57 = localDate10.minusYears(0);
        java.util.TimeZone timeZone59 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean60 = timeZone59.observesDaylightTime();
        java.util.Calendar calendar61 = java.util.Calendar.getInstance(timeZone59);
        int int62 = timeZone59.getRawOffset();
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone59);
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(timeZone59);
        java.util.TimeZone timeZone66 = java.util.TimeZone.getTimeZone("South Korea");
        int int67 = timeZone66.getRawOffset();
        timeZone66.setRawOffset(10);
        java.lang.String str70 = timeZone66.getID();
        boolean boolean71 = timeZone59.hasSameRules(timeZone66);
        org.joda.time.DateTimeZone dateTimeZone72 = org.joda.time.DateTimeZone.forTimeZone(timeZone66);
        int int74 = dateTimeZone72.getOffsetFromLocal(22L);
        org.joda.time.DateMidnight dateMidnight75 = localDate57.toDateMidnight(dateTimeZone72);
        org.joda.time.LocalDate localDate76 = new org.joda.time.LocalDate(1645455524468L, dateTimeZone72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateMidnight75", (dateTime3.compareTo(dateMidnight75) == 0) == dateTime3.equals(dateMidnight75));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-1));
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 5420956);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        long long6 = instant4.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant4 and mutableDateTime5", (instant4.compareTo(mutableDateTime5) == 0) == instant4.equals(mutableDateTime5));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.Instant instant3 = instant0.withDurationAdded(readableDuration1, (int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        org.joda.time.DateTime dateTime5 = instant3.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant3 and mutableDateTime4", (instant3.compareTo(mutableDateTime4) == 0) == instant3.equals(mutableDateTime4));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime9 = dateTime2.withFieldAdded(durationFieldType7, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        boolean boolean23 = localDate14.equals((java.lang.Object) dateTime20);
        int int24 = localDate14.getWeekyear();
        org.joda.time.Chronology chronology25 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.centuryOfEra();
        org.joda.time.DurationField durationField27 = durationFieldType7.getField(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int37 = dateTime35.get(dateTimeFieldType36);
        org.joda.time.DateTime dateTime38 = dateTime35.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime35.toDateTime(dateTimeZone41);
        org.joda.time.Chronology chronology43 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType29.getField(chronology43);
        org.joda.time.DurationField durationField45 = chronology43.minutes();
        org.joda.time.DurationField durationField46 = chronology43.millis();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 9, chronology43);
        org.joda.time.DateTimeField dateTimeField48 = chronology43.millisOfSecond();
        org.joda.time.DurationField durationField49 = durationFieldType7.getField(chronology43);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField27 and durationField49", (durationField27.compareTo(durationField49) == 0) == durationField27.equals(durationField49));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(9);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.Instant instant8 = instant6.plus((long) 28);
        org.joda.time.Instant instant9 = instant6.toInstant();
        long long10 = instant6.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.Instant instant30 = new org.joda.time.Instant((java.lang.Object) dateTime5);
        org.joda.time.DateTime.Property property31 = dateTime5.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime29 and instant30", (mutableDateTime29.compareTo(instant30) == 0) == mutableDateTime29.equals(instant30));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        int int4 = timeZone1.getRawOffset();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("South Korea");
        int int9 = timeZone8.getRawOffset();
        timeZone8.setRawOffset(10);
        java.lang.String str12 = timeZone8.getID();
        boolean boolean13 = timeZone1.hasSameRules(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone8);
        int int17 = timeZone8.getOffset(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar15", (calendar3.compareTo(calendar15) == 0) == calendar3.equals(calendar15));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 37920000);
        org.joda.time.Instant instant7 = instant4.withDurationAdded(102L, 22);
        long long8 = instant7.getMillis();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        java.lang.String str10 = durationFieldType9.getName();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime17.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay22 = dateTime17.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.plus(readableDuration28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTime dateTime32 = dateTime29.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime36 = dateTime29.toDateTime(dateTimeZone35);
        org.joda.time.Chronology chronology37 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = dateTimeFieldType23.getField(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.weekyear();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime17.toMutableDateTime(chronology37);
        org.joda.time.DateTimeField dateTimeField42 = chronology37.millisOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology37.dayOfWeek();
        org.joda.time.DurationField durationField44 = durationFieldType11.getField(chronology37);
        org.joda.time.DateTimeZone dateTimeZone45 = chronology37.getZone();
        org.joda.time.DurationField durationField46 = durationFieldType9.getField(chronology37);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = dateTime50.minus((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.withDayOfWeek(4);
        org.joda.time.Chronology chronology57 = dateTime50.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = dateTimeFieldType47.getField(chronology57);
        org.joda.time.DateTimeField dateTimeField59 = chronology57.millisOfDay();
        org.joda.time.DurationField durationField60 = durationFieldType9.getField(chronology57);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((java.lang.Object) long8, chronology57);
        org.joda.time.DateTimeField dateTimeField62 = chronology57.weekyearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant7 and dateTime61", (instant7.compareTo(dateTime61) == 0) == instant7.equals(dateTime61));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis((int) 'u');
        int int25 = localDateTime22.getEra();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusMonths(58);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 0, chronology30);
        org.joda.time.DateTime.Property property32 = dateTime31.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.DateTime dateTime34 = dateTime31.plus(readableDuration33);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int36 = dateTime34.get(dateTimeFieldType35);
        org.joda.time.DateTime dateTime37 = dateTime34.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime34.toDateTime(dateTimeZone40);
        org.joda.time.Chronology chronology42 = dateTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType28.getField(chronology42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology42);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime44.withField(dateTimeFieldType45, 5);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusHours(23);
        int int50 = localDateTime49.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withYearOfEra(11);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.dayOfWeek();
        boolean boolean54 = localDateTime27.isAfter((org.joda.time.ReadablePartial) localDateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime41", (dateTime2.compareTo(dateTime41) == 0) == dateTime2.equals(dateTime41));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        java.lang.Integer int24 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZoneUTC();
        boolean boolean26 = dateTimeFormatter25.isParser();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.millisOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.millisOfDay();
        org.joda.time.Chronology chronology29 = localDateTime21.getChronology();
        org.joda.time.LocalDateTime.Property property30 = localDateTime21.year();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime21.minusHours(5415578);
        java.lang.String str33 = localDateTime21.toString();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime21.minus(readableDuration34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime21.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder8 = builder0.setDate(37920000, (-1), 37920);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("South Korea");
        java.util.Calendar.Builder builder11 = builder8.setTimeZone(timeZone10);
        java.util.Calendar calendar12 = builder11.build();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime18.withWeekOfWeekyear((int) (short) 10);
        int int24 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        org.joda.time.DateTime dateTime36 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime40 = dateTime33.toDateTime(dateTimeZone39);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType27.getField(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyear();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.halfdayOfDay();
        org.joda.time.DurationField durationField45 = chronology41.hours();
        org.joda.time.DateTime dateTime46 = dateTime23.toDateTime(chronology41);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.plus(readableDuration53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int56 = dateTime54.get(dateTimeFieldType55);
        org.joda.time.DateTime dateTime57 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime61 = dateTime54.toDateTime(dateTimeZone60);
        org.joda.time.Chronology chronology62 = dateTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType48.getField(chronology62);
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(chronology62);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime67 = localDateTime64.withField(dateTimeFieldType65, 5);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusHours(23);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property72 = localDateTime71.dayOfYear();
        org.joda.time.LocalDateTime localDateTime74 = localDateTime71.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withYearOfEra(59);
        org.joda.time.LocalDateTime.Property property77 = localDateTime74.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod78 = null;
        org.joda.time.LocalDateTime localDateTime80 = localDateTime74.withPeriodAdded(readablePeriod78, 365);
        int int81 = dateTimeField47.getMinimumValue((org.joda.time.ReadablePartial) localDateTime74);
        java.util.Locale locale83 = java.util.Locale.FRENCH;
        java.util.Set<java.lang.Character> charSet84 = locale83.getExtensionKeys();
        java.util.Set<java.lang.Character> charSet85 = locale83.getExtensionKeys();
        java.lang.String str86 = locale83.getLanguage();
        java.lang.String str87 = dateTimeField47.getAsText((long) 5782138, locale83);
        java.util.Calendar.Builder builder88 = builder11.setLocale(locale83);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime40", (dateTime18.compareTo(dateTime40) == 0) == dateTime18.equals(dateTime40));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.joda.time.DurationField durationField19 = chronology14.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone23);
        org.joda.time.LocalDate.Property property25 = localDate24.weekOfWeekyear();
        org.joda.time.LocalDate localDate26 = property25.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        boolean boolean35 = localDate26.equals((java.lang.Object) dateTime32);
        int int36 = localDate26.getWeekyear();
        org.joda.time.Chronology chronology37 = localDate26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone38 = chronology37.getZone();
        long long41 = dateTimeZone38.adjustOffset(946646880000L, false);
        org.joda.time.Chronology chronology42 = chronology14.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField43 = chronology42.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 14, chronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.plus(readableDuration25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime29 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType20.getField(chronology34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withField(dateTimeFieldType37, 5);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.minusHours(23);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfYear();
        org.joda.time.LocalDateTime localDateTime46 = property44.addToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withWeekyear(632);
        int int49 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime46);
        org.joda.time.LocalDateTime.Property property50 = localDateTime46.weekyear();
        org.joda.time.LocalDateTime localDateTime51 = property50.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plus(readableDuration21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusYears(37920097);
        org.joda.time.LocalDateTime.Property property25 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property26.addToCopy(616);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) localDateTime29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField36 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField38 = chronology14.millis();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.minus((long) '#');
        org.joda.time.DateTime dateTime48 = dateTime42.withDayOfWeek(4);
        org.joda.time.LocalDate localDate49 = dateTime42.toLocalDate();
        org.joda.time.LocalDate localDate51 = localDate49.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property53 = localDate51.property(dateTimeFieldType52);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 0, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime56.toMutableDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime56.minus((long) '#');
        org.joda.time.DateTime dateTime62 = dateTime56.withDayOfWeek(4);
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime66 = dateTime62.withZone(dateTimeZone65);
        org.joda.time.Interval interval67 = localDate51.toInterval(dateTimeZone65);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(dateTimeZone65);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(126000005L, dateTimeZone65);
        boolean boolean71 = dateTimeZone65.isStandardOffset((-37919999L));
        long long73 = dateTimeZone65.convertUTCToLocal(9600960099L);
        org.joda.time.Chronology chronology74 = chronology14.withZone(dateTimeZone65);
        org.joda.time.DateTimeField dateTimeField75 = chronology14.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.hourOfHalfday();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(chronology25);
        int int33 = localDate32.getWeekyear();
        org.joda.time.ReadablePartial readablePartial34 = null;
        org.joda.time.LocalDate localDate35 = localDate32.withFields(readablePartial34);
        int int36 = localDate32.getWeekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime24", (dateTime2.compareTo(dateTime24) == 0) == dateTime2.equals(dateTime24));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.LocalDate.Property property35 = localDate31.era();
        java.lang.String str37 = localDate31.toString("1970-01-01");
        org.joda.time.LocalDate localDate39 = localDate31.plusYears(19);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate42 = localDate39.withPeriodAdded(readablePeriod40, 37920197);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField20 = chronology14.clockhourOfHalfday();
        boolean boolean21 = dateTimeField20.isLenient();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusYears(6);
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.dayOfWeek();
        org.joda.time.DateTime dateTime24 = localDateTime16.toDateTime();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.plusDays(33);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusMinutes(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withPivotYear(121);
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = dateTimeFormatter27.getPrinter();
        java.lang.Integer int29 = dateTimeFormatter27.getPivotYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = dateTimeFormatter27.getPrinter();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime27 = property24.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime28 = property24.roundFloorCopy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 0, chronology30);
        int int32 = dateTime31.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = dateTime31.withYear(10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime37.minus((long) '#');
        org.joda.time.DateTime dateTime43 = dateTime37.withDayOfWeek(4);
        boolean boolean45 = dateTime37.equals((java.lang.Object) "eras");
        boolean boolean46 = dateTime31.isEqual((org.joda.time.ReadableInstant) dateTime37);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("");
        java.lang.String str49 = locale48.getScript();
        java.util.Calendar calendar50 = dateTime37.toCalendar(locale48);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime37);
        org.joda.time.DateTime dateTime53 = dateTime37.withHourOfDay((int) (short) 10);
        long long54 = dateTime37.getMillis();
        org.joda.time.DateTime.Property property55 = dateTime37.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int57 = dateTime37.get(dateTimeFieldType56);
        int int58 = localDateTime28.get(dateTimeFieldType56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime28.minusDays(12);
        int int61 = localDateTime28.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.Chronology chronology17 = chronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology17.months();
        org.joda.time.DurationField durationField21 = chronology17.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 37296071);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = property18.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime24 = dateTime20.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay25 = dateTime20.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        org.joda.time.DateTime dateTime35 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime39 = dateTime32.toDateTime(dateTimeZone38);
        org.joda.time.Chronology chronology40 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType26.getField(chronology40);
        org.joda.time.DateTimeField dateTimeField42 = chronology40.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology40.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime20.toMutableDateTime(chronology40);
        org.joda.time.DateTimeField dateTimeField45 = chronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology40.dayOfWeek();
        org.joda.time.DurationField durationField47 = durationFieldType14.getField(chronology40);
        org.joda.time.DateTimeZone dateTimeZone48 = chronology40.getZone();
        boolean boolean49 = durationFieldType13.isSupported(chronology40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter2.withChronology(chronology40);
        int int51 = dateTimeFormatter50.getDefaultYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter50.withPivotYear((java.lang.Integer) 37920);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime39", (dateTime17.compareTo(dateTime39) == 0) == dateTime17.equals(dateTime39));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DurationField durationField39 = chronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long44 = dateTimeZone41.adjustOffset((long) 9, true);
        java.lang.String str45 = dateTimeZone41.getID();
        org.joda.time.Chronology chronology46 = chronology14.withZone(dateTimeZone41);
        org.joda.time.DurationField durationField47 = chronology14.years();
        org.joda.time.DateTimeField dateTimeField48 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField49 = chronology14.secondOfMinute();
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(chronology14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        java.lang.String str25 = dateTimeFieldType9.getName();
        boolean boolean26 = instant8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTime dateTime27 = instant8.toDateTime();
        org.joda.time.Instant instant29 = instant8.withMillis(50L);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readableDuration37);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekOfWeekyear((int) (short) 10);
        int int41 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime40.minus((long) 100);
        org.joda.time.DateTime dateTime45 = dateTime43.withYearOfCentury((int) (byte) 1);
        org.joda.time.DateTime dateTime47 = dateTime45.plusMinutes((int) (short) 1);
        org.joda.time.DateTime dateTime48 = dateTime45.withTimeAtStartOfDay();
        boolean boolean49 = dateTime45.isEqualNow();
        org.joda.time.Instant instant50 = dateTime45.toInstant();
        org.joda.time.DateTime dateTime51 = instant50.toDateTime();
        boolean boolean52 = instant8.isEqual((org.joda.time.ReadableInstant) instant50);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant50.plus(readableDuration53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant8", (dateTime2.compareTo(instant8) == 0) == dateTime2.equals(instant8));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getDayOfMonth();
        int int4 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime2.getZone();
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 15);
        boolean boolean10 = instant6.isAfterNow();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant6", (dateTime2.compareTo(instant6) == 0) == dateTime2.equals(instant6));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        boolean boolean10 = dateTime8.isAfter(1645455503803L);
        java.util.Date date12 = new java.util.Date((long) 44940);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        java.lang.String str15 = localDateTime13.toString("-292275054");
        int int16 = localDateTime13.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int37 = dateTimeZone35.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime38 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.millisOfSecond();
        int int40 = localDateTime33.getSecondOfMinute();
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.Instant instant43 = instant41.plus((long) (short) 1);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.Instant instant45 = instant43.plus(readableDuration44);
        boolean boolean46 = localDateTime33.equals((java.lang.Object) instant45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.Instant instant49 = instant45.withDurationAdded(readableDuration47, 889);
        org.joda.time.Instant instant52 = instant45.withDurationAdded((long) 97, 4871);
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.Instant instant54 = instant45.plus(readableDuration53);
        org.joda.time.DateTimeZone dateTimeZone55 = instant54.getZone();
        org.joda.time.DateTime dateTime56 = localDateTime13.toDateTime(dateTimeZone55);
        java.lang.String str58 = dateTimeZone55.getShortName(1645455716488L);
        org.joda.time.DateTime dateTime59 = dateTime8.withZoneRetainFields(dateTimeZone55);
        org.joda.time.YearMonthDay yearMonthDay60 = dateTime8.toYearMonthDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime59", (dateTime2.compareTo(dateTime59) == 0) == dateTime2.equals(dateTime59));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getDayOfMonth();
        int int4 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime2.getZone();
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 15);
        org.joda.time.DateTime dateTime10 = instant9.toDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant9", (dateTime2.compareTo(instant9) == 0) == dateTime2.equals(instant9));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.dayOfWeek();
        org.joda.time.DurationField durationField32 = chronology25.eras();
        org.joda.time.DateTimeField dateTimeField33 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField34 = dateTimeField33.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField34, and durationField32", !(durationField32.compareTo(durationField34) == 0) || (Math.signum(durationField32.compareTo(durationField32)) == Math.signum(durationField34.compareTo(durationField32))));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        org.joda.time.Instant instant11 = dateTime2.toInstant();
        org.joda.time.MutableDateTime mutableDateTime12 = instant11.toMutableDateTimeISO();
        org.joda.time.Instant instant14 = instant11.plus(271459400L);
        long long15 = instant14.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant11", (dateTime2.compareTo(instant11) == 0) == dateTime2.equals(instant11));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 37920000);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime14 = dateTime10.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime10.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime10.toMutableDateTime(chronology30);
        org.joda.time.DateTime dateTime35 = instant4.toDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField36 = chronology30.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime35", (instant0.compareTo(dateTime35) == 0) == instant0.equals(dateTime35));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.DateTime dateTime2 = instant0.toDateTime();
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withField(dateTimeFieldType21, 5);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusHours(23);
        int int26 = localDateTime25.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime29 = localDateTime25.toDateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime2.withZoneRetainFields(dateTimeZone28);
        org.joda.time.DateTime dateTime32 = dateTime31.withLaterOffsetAtOverlap();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and dateTime2", (instant0.compareTo(dateTime2) == 0) == instant0.equals(dateTime2));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        boolean boolean17 = dateTime8.equals((java.lang.Object) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime8.withMillis(2L);
        org.joda.time.DateTime.Property property20 = dateTime8.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime8.minusDays(44940);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime25.withYearOfEra(9);
        org.joda.time.Instant instant29 = dateTime25.toInstant();
        org.joda.time.DateTime dateTime30 = instant29.toDateTime();
        org.joda.time.DateTime dateTime31 = instant29.toDateTime();
        boolean boolean32 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant29", (dateTime2.compareTo(instant29) == 0) == dateTime2.equals(instant29));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-21T01:05:10.241");
        org.joda.time.DateTime dateTime2 = instant1.toDateTime();
        org.joda.time.Instant instant4 = instant1.plus((long) 37919999);
        org.joda.time.Instant instant6 = instant1.minus(519L);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant1.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((-62197750784952L));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime15 = localTime12.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime20 = localTime17.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime27 = property25.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean28 = localTime17.equals((java.lang.Object) dateTime27);
        boolean boolean29 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime dateTime31 = dateTime10.minusWeeks(9867);
        org.joda.time.DateMidnight dateMidnight32 = dateTime10.toDateMidnight();
        boolean boolean33 = instant1.isEqual((org.joda.time.ReadableInstant) dateMidnight32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant1", (dateTime2.compareTo(instant1) == 0) == dateTime2.equals(instant1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        boolean boolean8 = dateTime5.isEqual(1645455491851L);
        org.joda.time.DateTime dateTime9 = dateTime5.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime5.withMillis((long) 292278993);
        org.joda.time.DateTime dateTime13 = dateTime5.minus(0L);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property16.setCopy(31);
        org.joda.time.LocalTime localTime20 = property16.addWrapFieldToCopy(37920000);
        org.joda.time.LocalTime localTime22 = property16.addCopy(22);
        org.joda.time.LocalTime localTime23 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay(21);
        org.joda.time.LocalTime localTime27 = localTime25.plusHours(1970);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime32 = localTime29.withFields((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0, chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTime dateTime41 = dateTime38.plus(readableDuration40);
        org.joda.time.DateTime dateTime43 = dateTime38.withWeekOfWeekyear((int) (short) 10);
        int int44 = dateTimeZone35.getOffset((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((java.lang.Object) localTime31, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime48 = localTime45.toDateTimeToday(dateTimeZone47);
        int int50 = dateTimeZone47.getOffsetFromLocal((long) (byte) 100);
        org.joda.time.DateTime dateTime51 = localTime27.toDateTimeToday(dateTimeZone47);
        java.lang.String str52 = dateTimeZone47.getID();
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime13.toMutableDateTime(dateTimeZone47);
        long long56 = dateTimeZone47.convertLocalToUTC((long) 3938617, false);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime53", (dateTime2.compareTo(mutableDateTime53) == 0) == dateTime2.equals(mutableDateTime53));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime24 = property22.roundHalfEvenCopy();
        int int25 = property22.getMaximumValueOverall();
        int int26 = property22.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime27 = property22.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = property22.setCopy((int) (short) 1);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTimeISO();
        long long32 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) instant30);
        org.joda.time.DateTimeField dateTimeField33 = property22.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant30 and mutableDateTime31", (instant30.compareTo(mutableDateTime31) == 0) == instant30.equals(mutableDateTime31));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusMillis(86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean24 = localDateTime19.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone26);
        int int28 = localDate27.getDayOfMonth();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) 0, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime31.toMutableDateTime(chronology32);
        org.joda.time.DateTime dateTime35 = dateTime31.minus((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime31.withDayOfWeek(4);
        boolean boolean39 = dateTime31.equals((java.lang.Object) "eras");
        int int40 = dateTime31.getWeekyear();
        org.joda.time.DateTime dateTime41 = localDate27.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime43 = dateTime31.withYearOfEra((int) '#');
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 0, chronology45);
        org.joda.time.DateTime.Property property47 = dateTime46.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTime dateTime49 = dateTime46.plus(readableDuration48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int51 = dateTime49.get(dateTimeFieldType50);
        org.joda.time.DateTime dateTime52 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime56 = dateTime49.toDateTime(dateTimeZone55);
        org.joda.time.Chronology chronology57 = dateTime56.getChronology();
        org.joda.time.DateTimeField dateTimeField58 = chronology57.millisOfDay();
        org.joda.time.Chronology chronology59 = chronology57.withUTC();
        org.joda.time.Chronology chronology60 = chronology59.withUTC();
        org.joda.time.DateTime dateTime61 = dateTime31.withChronology(chronology60);
        boolean boolean62 = dateTimeFieldType23.isSupported(chronology60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime61", (dateTime3.compareTo(dateTime61) == 0) == dateTime3.equals(dateTime61));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField32 = chronology25.hours();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = chronology25.add(readablePeriod33, 1645455532813L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField37 = chronology25.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField38 = chronology25.weekyearOfCentury();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.plus(readableDuration46);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int49 = dateTime47.get(dateTimeFieldType48);
        org.joda.time.LocalTime.Property property50 = localTime41.property(dateTimeFieldType48);
        java.lang.String str51 = property50.getName();
        java.util.Locale locale52 = java.util.Locale.CHINA;
        java.lang.String str53 = property50.getAsShortText(locale52);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        boolean boolean58 = dateTimeField56.isLeap((long) 9);
        boolean boolean59 = dateTimeField56.isSupported();
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        java.lang.String str61 = locale60.getDisplayScript();
        int int62 = dateTimeField56.getMaximumShortTextLength(locale60);
        java.lang.String str63 = locale60.getISO3Language();
        java.util.Set<java.lang.Character> charSet64 = locale60.getExtensionKeys();
        java.lang.String str65 = locale52.getDisplayScript(locale60);
        java.util.Locale locale66 = locale52.stripExtensions();
        java.util.Set<java.lang.Character> charSet67 = locale52.getExtensionKeys();
        java.lang.String str68 = dateTimeField38.getAsText(2023, locale52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime24", (dateTime2.compareTo(dateTime24) == 0) == dateTime2.equals(dateTime24));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        java.util.Locale locale9 = dateTimeFormatter2.getLocale();
        org.joda.time.tz.NameProvider nameProvider10 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleAttributes();
        java.lang.String str16 = nameProvider10.getName(locale12, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = property20.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime26 = dateTime22.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime28 = dateTime26.withDayOfMonth(2);
        java.util.Locale locale29 = java.util.Locale.FRANCE;
        java.util.Calendar calendar30 = dateTime26.toCalendar(locale29);
        java.lang.String str33 = nameProvider10.getShortName(locale29, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime();
        int int42 = dateTime36.getMonthOfYear();
        org.joda.time.DateTime dateTime44 = dateTime36.plus((long) 1970);
        org.joda.time.DateTime dateTime46 = dateTime36.minusWeeks(23);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime52.plus(readableDuration54);
        org.joda.time.DateTime dateTime57 = dateTime52.withWeekOfWeekyear((int) (short) 10);
        int int58 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone49);
        int int61 = dateTimeZone49.getOffset((long) 19);
        java.lang.String str63 = dateTimeZone49.getName((long) 17);
        org.joda.time.DateTime dateTime64 = dateTime46.toDateTime(dateTimeZone49);
        java.util.Locale locale65 = java.util.Locale.JAPAN;
        boolean boolean66 = dateTimeZone49.equals((java.lang.Object) locale65);
        java.lang.String str69 = nameProvider10.getShortName(locale65, "ISOChronology[+10:32]", "31 Dec 1969 23:59:59 GMT");
        java.util.Calendar calendar70 = java.util.Calendar.getInstance(locale65);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter71 = dateTimeFormatter2.withLocale(locale65);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType72.getField(chronology73);
        boolean boolean76 = dateTimeField74.isLeap((long) 9);
        boolean boolean77 = dateTimeField74.isSupported();
        java.util.Locale locale78 = java.util.Locale.TAIWAN;
        java.lang.String str79 = locale78.getDisplayScript();
        int int80 = dateTimeField74.getMaximumShortTextLength(locale78);
        java.lang.String str81 = locale78.getISO3Language();
        java.util.Set<java.lang.Character> charSet82 = locale78.getExtensionKeys();
        java.lang.String str83 = locale78.getDisplayName();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter84 = dateTimeFormatter2.withLocale(locale78);
        java.lang.String str85 = locale78.getISO3Language();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime46 and dateTime64", (dateTime46.compareTo(dateTime64) == 0) == dateTime46.equals(dateTime64));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(chronology14);
        org.joda.time.DateTime dateTime17 = dateTime10.withCenturyOfEra(0);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks(0);
        org.joda.time.Instant instant20 = dateTime17.toInstant();
        org.joda.time.DateTime dateTime21 = instant20.toDateTime();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.minus((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.withDayOfWeek(4);
        org.joda.time.LocalDate localDate31 = dateTime24.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate31.plus(readablePeriod32);
        org.joda.time.LocalDate.Property property34 = localDate33.weekyear();
        org.joda.time.LocalDate localDate35 = property34.roundFloorCopy();
        org.joda.time.LocalDate localDate37 = property34.addToCopy((int) (byte) 1);
        org.joda.time.LocalDate localDate38 = property34.roundHalfEvenCopy();
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        long long40 = instant39.getMillis();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.Instant instant43 = instant39.withDurationAdded(readableDuration41, 37920000);
        org.joda.time.Chronology chronology44 = instant39.getChronology();
        org.joda.time.Instant instant46 = instant39.withMillis(1645455564339L);
        org.joda.time.DateTime dateTime47 = localDate38.toDateTime((org.joda.time.ReadableInstant) instant39);
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.Instant instant50 = instant39.withDurationAdded(readableDuration48, 5745878);
        boolean boolean51 = dateTime21.isEqual((org.joda.time.ReadableInstant) instant39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and instant20", (dateTime17.compareTo(instant20) == 0) == dateTime17.equals(instant20));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DurationField durationField39 = chronology14.centuries();
        org.joda.time.DurationField durationField40 = chronology14.halfdays();
        org.joda.time.DurationField durationField41 = chronology14.weeks();
        org.joda.time.DurationField durationField42 = chronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.DurationField durationField34 = chronology30.years();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        long long38 = chronology30.add(readablePeriod35, (long) 32769, 292278993);
        org.joda.time.DurationField durationField39 = chronology30.hours();
        org.joda.time.DateTimeField dateTimeField40 = chronology30.minuteOfDay();
        boolean boolean41 = dateTimeFieldType0.isSupported(chronology30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.weekyear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.DateTime.Property property22 = dateTime20.yearOfCentury();
        org.joda.time.DateTime dateTime23 = property22.roundFloorCopy();
        org.joda.time.DateTime dateTime24 = property22.roundFloorCopy();
        int int25 = property22.getMaximumValue();
        java.util.Locale locale29 = new java.util.Locale("", "South Korea", "1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime34 = localTime31.withFields((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime39 = localTime36.withFields((org.joda.time.ReadablePartial) localTime38);
        int int40 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime36);
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = localTime33.toString("1", locale42);
        java.lang.String str44 = locale29.getDisplayScript(locale42);
        int int45 = property22.getMaximumShortTextLength(locale42);
        java.lang.String str46 = dateTimeField16.getAsShortText(8, locale42);
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleAttributes();
        org.joda.time.tz.Provider provider48 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider48);
        org.joda.time.DateTimeZone.setProvider(provider48);
        java.util.Set<java.lang.String> strSet51 = provider48.getAvailableIDs();
        java.util.Set<java.lang.String> strSet52 = provider48.getAvailableIDs();
        java.util.Set<java.lang.String> strSet53 = provider48.getAvailableIDs();
        boolean boolean54 = strSet47.containsAll((java.util.Collection<java.lang.String>) strSet53);
        int int55 = strSet53.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime19.getEra();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        int int22 = localDateTime19.getYearOfEra();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale25.getDisplayName(locale26);
        java.lang.String str28 = localDateTime19.toString("70", locale26);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime19.minus(readablePeriod29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime19.plusMillis(53958682);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.minusWeeks(4533);
        org.joda.time.DateTimeField[] dateTimeFieldArray35 = localDateTime34.getFields();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.getLocalDateTime();
        java.lang.String str26 = property24.getAsText();
        org.joda.time.LocalDateTime localDateTime27 = property24.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime28 = property24.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusYears(5832252);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.DateTimeField dateTimeField38 = chronology14.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField38.getType();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = dateTimeField38.getType();
        java.lang.String str41 = dateTimeField38.getName();
        org.joda.time.DurationField durationField42 = dateTimeField38.getDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        boolean boolean17 = dateTime8.equals((java.lang.Object) (short) 10);
        org.joda.time.DateTime dateTime18 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime21.toMutableDateTime(chronology22);
        org.joda.time.DateTime dateTime25 = dateTime21.minus((long) '#');
        org.joda.time.DateTime dateTime27 = dateTime21.withDayOfWeek(4);
        org.joda.time.LocalDate localDate28 = dateTime21.toLocalDate();
        org.joda.time.Instant instant29 = dateTime21.toInstant();
        boolean boolean30 = dateTime18.isAfter((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        int int35 = dateTime33.getMillisOfSecond();
        org.joda.time.DateTime dateTime37 = dateTime33.plusYears(6);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime40 = dateTime33.withFieldAdded(durationFieldType38, (int) ' ');
        org.joda.time.DateTime dateTime42 = dateTime40.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 0, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.plus(readableDuration49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.DateTime dateTime53 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime57 = dateTime50.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology58 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType44.getField(chronology58);
        org.joda.time.DateTimeField dateTimeField60 = chronology58.weekyear();
        org.joda.time.DateTimeField dateTimeField61 = chronology58.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField62 = chronology58.weekyearOfCentury();
        boolean boolean63 = dateTimeFieldType43.isSupported(chronology58);
        boolean boolean64 = dateTime42.isSupported(dateTimeFieldType43);
        int int65 = instant29.get(dateTimeFieldType43);
        org.joda.time.Instant instant67 = instant29.minus((long) (short) 100);
        long long68 = instant67.getMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant29", (dateTime2.compareTo(instant29) == 0) == dateTime2.equals(instant29));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        int int13 = dateTime5.getSecondOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        org.joda.time.DateTime dateTime19 = dateTime16.withYear(10);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.withDayOfWeek(4);
        boolean boolean30 = dateTime22.equals((java.lang.Object) "eras");
        boolean boolean31 = dateTime16.isEqual((org.joda.time.ReadableInstant) dateTime22);
        int int32 = dateTime16.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long37 = dateTimeZone34.adjustOffset((long) 9, true);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime16, dateTimeZone34);
        org.joda.time.DateTime dateTime39 = dateTime5.toDateTime(dateTimeZone34);
        org.joda.time.DateTime dateTime41 = dateTime5.minusMillis(35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime12", (dateTime5.compareTo(dateTime12) == 0) == dateTime5.equals(dateTime12));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.centuryOfEra();
        org.joda.time.DurationField durationField19 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.yearOfCentury();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(632L, chronology15);
        org.joda.time.DurationField durationField22 = chronology15.minutes();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology15.add(readablePeriod23, 1645455618047L, 37289415);
        org.joda.time.Chronology chronology27 = chronology15.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.DurationField durationField19 = chronology14.weeks();
        org.joda.time.Chronology chronology20 = chronology14.withUTC();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.DurationField durationField38 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField40 = chronology14.millisOfDay();
        boolean boolean42 = dateTimeField40.isLeap((long) 51);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType43.getField(chronology44);
        boolean boolean47 = dateTimeField45.isLeap((long) 9);
        long long49 = dateTimeField45.roundHalfFloor((-37920000L));
        boolean boolean51 = dateTimeField45.isLeap((long) 5416138);
        java.util.Locale locale54 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale55 = java.util.Locale.UK;
        java.lang.String str56 = locale54.getDisplayName(locale55);
        java.lang.String str57 = locale54.getCountry();
        java.lang.String str58 = locale54.toLanguageTag();
        java.lang.String str59 = dateTimeField45.getAsShortText(94661920839L, locale54);
        java.util.Locale locale60 = locale54.stripExtensions();
        int int61 = dateTimeField40.getMaximumTextLength(locale54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime34.toMutableDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) '#');
        org.joda.time.DateTime dateTime40 = dateTime34.withDayOfWeek(4);
        org.joda.time.LocalDate localDate41 = dateTime34.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.plus(readablePeriod42);
        org.joda.time.LocalDate.Property property44 = localDate43.weekyear();
        org.joda.time.LocalDate localDate45 = property44.withMinimumValue();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfEra();
        long long48 = chronology28.set((org.joda.time.ReadablePartial) localDate45, (long) 11);
        org.joda.time.DateTime dateTime49 = dateTime13.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField50 = chronology28.hourOfDay();
        long long52 = dateTimeField50.remainder(40L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime27", (dateTime5.compareTo(dateTime27) == 0) == dateTime5.equals(dateTime27));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(37919889);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType3.getField(chronology4);
        boolean boolean7 = dateTimeField5.isLeap((long) 9);
        int int9 = dateTimeField5.getMaximumValue((long) 4);
        int int11 = dateTimeField5.get((long) 59);
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.lang.String str14 = dateTimeField5.getAsText(37231208, locale13);
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale15.getISO3Language();
        int int17 = dateTimeField5.getMaximumShortTextLength(locale15);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        int int25 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.LocalTime localTime27 = localTime23.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField29 = localTime23.getField((int) (short) 0);
        int int31 = dateTimeField29.getMinimumValue((long) 9);
        org.joda.time.DurationField durationField32 = dateTimeField29.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int42 = dateTime40.get(dateTimeFieldType41);
        org.joda.time.DateTime dateTime43 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime47 = dateTime40.toDateTime(dateTimeZone46);
        org.joda.time.Chronology chronology48 = dateTime47.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = dateTimeFieldType34.getField(chronology48);
        org.joda.time.DateTimeField dateTimeField50 = chronology48.weekyear();
        org.joda.time.DateTimeField dateTimeField51 = chronology48.clockhourOfDay();
        java.util.Locale.Category category52 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale53 = java.util.Locale.getDefault(category52);
        java.util.Locale locale54 = java.util.Locale.TAIWAN;
        java.lang.String str55 = locale53.getDisplayCountry(locale54);
        int int56 = dateTimeField51.getMaximumTextLength(locale54);
        java.lang.String str57 = dateTimeField29.getAsShortText((long) 332, locale54);
        java.lang.String str58 = dateTimeField5.getAsText((long) 5438242, locale54);
        boolean boolean59 = dateTimeZone1.equals((java.lang.Object) str58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime37 and dateTime47", (dateTime37.compareTo(dateTime47) == 0) == dateTime37.equals(dateTime47));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology14.add(readablePeriod19, (long) 32769, 292278993);
        org.joda.time.DurationField durationField23 = chronology14.hours();
        org.joda.time.DurationField durationField24 = chronology14.days();
        org.joda.time.DateTimeField dateTimeField25 = chronology14.clockhourOfHalfday();
        boolean boolean27 = dateTimeField25.isLeap((long) 951);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime30);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfMonth();
        org.joda.time.LocalDateTime.Property property36 = localDateTime34.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        boolean boolean41 = dateTimeField39.isLeap((long) 9);
        long long43 = dateTimeField39.roundHalfFloor((-37920000L));
        boolean boolean45 = dateTimeField39.isLeap((long) 5416138);
        java.util.Locale locale48 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale49 = java.util.Locale.UK;
        java.lang.String str50 = locale48.getDisplayName(locale49);
        java.lang.String str51 = locale48.getCountry();
        java.lang.String str52 = locale48.toLanguageTag();
        java.lang.String str53 = dateTimeField39.getAsShortText(94661920839L, locale48);
        java.util.Locale locale54 = locale48.stripExtensions();
        java.lang.String str55 = dateTimeField25.getAsText((org.joda.time.ReadablePartial) localDateTime34, locale48);
        java.util.Date date56 = localDateTime34.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime6.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField33 = durationFieldType0.getField(chronology26);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        long long37 = chronology26.add(readablePeriod34, (long) (-9), 19);
        org.joda.time.DurationField durationField38 = chronology26.hours();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 6);
        java.lang.String str15 = localDate9.toString();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime();
        int int24 = dateTime18.getMonthOfYear();
        org.joda.time.DateTime dateTime26 = dateTime18.plus((long) 1970);
        org.joda.time.DateTime dateTime28 = dateTime18.minusWeeks(23);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        int int40 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        int int43 = dateTimeZone31.getOffset((long) 19);
        java.lang.String str45 = dateTimeZone31.getName((long) 17);
        org.joda.time.DateTime dateTime46 = dateTime28.toDateTime(dateTimeZone31);
        boolean boolean48 = dateTimeZone31.equals((java.lang.Object) 5);
        org.joda.time.DateMidnight dateMidnight49 = localDate9.toDateMidnight(dateTimeZone31);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((java.lang.Object) dateMidnight49);
        org.joda.time.DateTime.Property property51 = dateTime50.monthOfYear();
        org.joda.time.DateTime dateTime53 = dateTime50.plusDays(532);
        int int54 = dateTime53.getHourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime28 and dateTime46", (dateTime28.compareTo(dateTime46) == 0) == dateTime28.equals(dateTime46));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.Instant instant10 = dateTime2.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        boolean boolean13 = instant10.isSupported(dateTimeFieldType11);
        org.joda.time.Instant instant15 = instant10.withMillis(125999905L);
        org.joda.time.Instant instant17 = instant15.minus(1645455609746L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant10", (dateTime2.compareTo(instant10) == 0) == dateTime2.equals(instant10));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        boolean boolean17 = dateTime8.equals((java.lang.Object) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime8.withMillis(2L);
        org.joda.time.DateTime dateTime21 = dateTime19.plusDays(24);
        org.joda.time.DateTime dateTime23 = dateTime21.plusWeeks(5427565);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        int int27 = dateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime29 = dateTime26.withYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        int int36 = dateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.LocalTime localTime38 = localTime34.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property39 = localTime38.minuteOfHour();
        org.joda.time.DateTime dateTime40 = dateTime29.withFields((org.joda.time.ReadablePartial) localTime38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getRangeDurationType();
        int int43 = localTime38.get(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType44 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 0, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.plus(readableDuration49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.DateTime dateTime53 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime57 = dateTime50.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology58 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = chronology58.millisOfDay();
        org.joda.time.Chronology chronology60 = chronology58.withUTC();
        org.joda.time.Chronology chronology61 = chronology60.withUTC();
        org.joda.time.DurationField durationField62 = durationFieldType44.getField(chronology61);
        long long66 = chronology61.add(23L, (long) (short) 0, 21);
        org.joda.time.DateTimeField dateTimeField67 = chronology61.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField68 = chronology61.minuteOfHour();
        org.joda.time.DateTime dateTime69 = dateTime23.toDateTime(chronology61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime57", (dateTime2.compareTo(dateTime57) == 0) == dateTime2.equals(dateTime57));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        java.util.Date date16 = new java.util.Date((long) (byte) -1);
        date16.setTime((long) ' ');
        date16.setYear((int) 'u');
        int int21 = date16.getMonth();
        boolean boolean22 = localDate13.equals((java.lang.Object) int21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone24);
        org.joda.time.LocalDate.Property property26 = localDate25.weekOfWeekyear();
        org.joda.time.LocalDate localDate27 = property26.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime30.plus(readableDuration32);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int35 = dateTime33.get(dateTimeFieldType34);
        boolean boolean36 = localDate27.equals((java.lang.Object) dateTime33);
        int int37 = localDate27.getWeekyear();
        boolean boolean38 = localDate13.isAfter((org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate40 = localDate27.withYear((int) ' ');
        int int41 = localDate40.getCenturyOfEra();
        org.joda.time.LocalDate localDate43 = localDate40.withWeekOfWeekyear(33);
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfCentury();
        org.joda.time.LocalDate localDate45 = property44.getLocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.withDayOfYear((int) '4');
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((-62197750784952L));
        int int52 = dateTimeZone49.getOffset((org.joda.time.ReadableInstant) dateTime51);
        org.joda.time.DateTime dateTime53 = localDate45.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0, chronology56);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.plus(readableDuration59);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int62 = dateTime60.get(dateTimeFieldType61);
        org.joda.time.DateTime dateTime63 = dateTime60.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone66 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime67 = dateTime60.toDateTime(dateTimeZone66);
        org.joda.time.Chronology chronology68 = dateTime67.getChronology();
        org.joda.time.DateTimeField dateTimeField69 = dateTimeFieldType54.getField(chronology68);
        org.joda.time.LocalDateTime localDateTime70 = new org.joda.time.LocalDateTime(chronology68);
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime73 = localDateTime70.withField(dateTimeFieldType71, 5);
        org.joda.time.LocalDateTime.Property property74 = localDateTime73.monthOfYear();
        org.joda.time.LocalDateTime localDateTime76 = localDateTime73.minusMillis(86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int78 = localDateTime73.get(dateTimeFieldType77);
        org.joda.time.LocalDateTime localDateTime80 = localDateTime73.minusMonths(44940);
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.LocalDateTime localDateTime82 = localDateTime80.minus(readableDuration81);
        org.joda.time.LocalDateTime.Property property83 = localDateTime80.dayOfMonth();
        java.lang.String str84 = property83.toString();
        org.joda.time.LocalDateTime localDateTime86 = property83.addToCopy(31);
        boolean boolean87 = dateTimeZone49.isLocalDateTimeGap(localDateTime86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime67", (dateTime2.compareTo(dateTime67) == 0) == dateTime2.equals(dateTime67));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusWeeks((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYearOfEra(59);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = localDateTime28.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusMillis(5419344);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType32.getRangeDurationType();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType32.getDurationType();
        boolean boolean35 = localDateTime31.isSupported(durationFieldType34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime31.minusSeconds(86399999);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) 0, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTime(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime40.minus((long) '#');
        org.joda.time.DateTime dateTime46 = dateTime40.withDayOfWeek(4);
        org.joda.time.LocalDate localDate47 = dateTime40.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.LocalDate localDate49 = localDate47.plus(readablePeriod48);
        org.joda.time.LocalDate.Property property50 = localDate49.weekyear();
        org.joda.time.LocalDate localDate51 = property50.roundFloorCopy();
        org.joda.time.LocalDate localDate52 = property50.withMaximumValue();
        org.joda.time.LocalDate localDate53 = property50.getLocalDate();
        org.joda.time.LocalDate localDate55 = localDate53.withYearOfEra(330060);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone57);
        org.joda.time.LocalDate.Property property59 = localDate58.weekOfWeekyear();
        org.joda.time.LocalDate localDate60 = property59.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) 0, chronology62);
        org.joda.time.DateTime.Property property64 = dateTime63.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.plus(readableDuration65);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int68 = dateTime66.get(dateTimeFieldType67);
        boolean boolean69 = localDate60.equals((java.lang.Object) dateTime66);
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = dateTime66.toDateTime(chronology70);
        org.joda.time.DateTime dateTime73 = dateTime66.withCenturyOfEra(0);
        org.joda.time.DateTime.Property property74 = dateTime73.hourOfDay();
        org.joda.time.DateTime.Property property75 = dateTime73.hourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = property75.getFieldType();
        boolean boolean77 = localDate55.isSupported(dateTimeFieldType76);
        boolean boolean78 = localDateTime31.isSupported(dateTimeFieldType76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en,CA");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.parse("days", strMap3);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap5 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList6 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList4, strMap5);
        java.util.Locale.LanguageRange[] languageRangeArray7 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList8 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList8, languageRangeArray7);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleAttributes();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.lang.String str15 = locale14.getScript();
        java.lang.String str16 = locale11.getDisplayLanguage(locale14);
        java.util.Set<java.lang.String> strSet17 = locale11.getUnicodeLocaleAttributes();
        java.lang.String str18 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, (java.util.Collection<java.lang.String>) strSet17);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap19 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList20 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList8, strMap19);
        java.util.Collection<java.util.Locale> localeCollection21 = null;
        java.util.List<java.util.Locale> localeList22 = java.util.Locale.filter(languageRangeList20, localeCollection21);
        java.util.Locale.LanguageRange[] languageRangeArray23 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList24 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList24, languageRangeArray23);
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleAttributes();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("");
        java.lang.String str31 = locale30.getScript();
        java.lang.String str32 = locale27.getDisplayLanguage(locale30);
        java.util.Set<java.lang.String> strSet33 = locale27.getUnicodeLocaleAttributes();
        java.lang.String str34 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, (java.util.Collection<java.lang.String>) strSet33);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap35 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList36 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList24, strMap35);
        java.util.Collection<java.util.Locale> localeCollection37 = null;
        java.util.List<java.util.Locale> localeList38 = java.util.Locale.filter(languageRangeList36, localeCollection37);
        java.util.List<java.util.Locale> localeList39 = java.util.Locale.filter(languageRangeList20, localeCollection37);
        java.util.Locale locale40 = java.util.Locale.lookup(languageRangeList6, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale locale41 = java.util.Locale.lookup(languageRangeList1, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.Locale locale43 = java.util.Locale.forLanguageTag("UTC");
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.util.stream.Stream<java.lang.String> strStream45 = strSet44.parallelStream();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int54 = dateTime52.get(dateTimeFieldType53);
        org.joda.time.DateTime dateTime55 = dateTime52.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime59 = dateTime52.toDateTime(dateTimeZone58);
        org.joda.time.Chronology chronology60 = dateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField61 = dateTimeFieldType46.getField(chronology60);
        org.joda.time.LocalDateTime localDateTime62 = new org.joda.time.LocalDateTime(chronology60);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime62.withField(dateTimeFieldType63, 5);
        int int66 = localDateTime62.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime68 = localDateTime62.minusYears(6);
        org.joda.time.LocalDateTime.Property property69 = localDateTime62.dayOfWeek();
        org.joda.time.DateTime dateTime70 = localDateTime62.toDateTime();
        org.joda.time.LocalDateTime.Property property71 = localDateTime62.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime72 = property71.getLocalDateTime();
        boolean boolean73 = strSet44.remove((java.lang.Object) property71);
        java.util.List<java.lang.String> strList74 = java.util.Locale.filterTags(languageRangeList1, (java.util.Collection<java.lang.String>) strSet44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime49 and dateTime59", (dateTime49.compareTo(dateTime59) == 0) == dateTime49.equals(dateTime59));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime8.withZone(dateTimeZone11);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone11);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        int int18 = dateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime17.withYear(10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withDayOfWeek(4);
        boolean boolean31 = dateTime23.equals((java.lang.Object) "eras");
        boolean boolean32 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime23);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("");
        java.lang.String str35 = locale34.getScript();
        java.util.Calendar calendar36 = dateTime23.toCalendar(locale34);
        org.joda.time.DateTime dateTime38 = dateTime23.withYearOfEra(1970);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTimeISO();
        org.joda.time.DateTime dateTime40 = localDate13.toDateTime((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = dateTime39.minusYears(2141);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime2.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addToCopy((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone13);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        boolean boolean25 = localDate16.equals((java.lang.Object) dateTime22);
        int int26 = localDate16.getWeekyear();
        org.joda.time.Chronology chronology27 = localDate16.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getRangeDurationType();
        boolean boolean30 = localDate16.isSupported(dateTimeFieldType28);
        boolean boolean31 = dateTime11.isSupported(dateTimeFieldType28);
        org.joda.time.DateTime dateTime33 = dateTime11.withWeekyear((int) (byte) -1);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra(44940);
        java.lang.String str36 = dateTime33.toString();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime33.minus(readableDuration37);
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = property43.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime49 = dateTime45.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay50 = dateTime45.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 0, chronology53);
        org.joda.time.DateTime.Property property55 = dateTime54.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.DateTime dateTime57 = dateTime54.plus(readableDuration56);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int59 = dateTime57.get(dateTimeFieldType58);
        org.joda.time.DateTime dateTime60 = dateTime57.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime64 = dateTime57.toDateTime(dateTimeZone63);
        org.joda.time.Chronology chronology65 = dateTime64.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType51.getField(chronology65);
        org.joda.time.DateTimeField dateTimeField67 = chronology65.weekyear();
        org.joda.time.DateTimeField dateTimeField68 = chronology65.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime69 = dateTime45.toMutableDateTime(chronology65);
        org.joda.time.DateTimeField dateTimeField70 = chronology65.millisOfDay();
        org.joda.time.DateTimeField dateTimeField71 = chronology65.dayOfWeek();
        org.joda.time.DurationField durationField72 = durationFieldType39.getField(chronology65);
        org.joda.time.DateTimeZone dateTimeZone73 = chronology65.getZone();
        org.joda.time.DurationField durationField74 = chronology65.weeks();
        org.joda.time.DateTimeField dateTimeField75 = chronology65.halfdayOfDay();
        org.joda.time.DateTime dateTime76 = dateTime33.withChronology(chronology65);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime64", (dateTime2.compareTo(dateTime64) == 0) == dateTime2.equals(dateTime64));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.withDurationAdded(readableDuration26, 22);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfEra();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime7 = dateTime2.minusSeconds(121);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTime dateTime18 = dateTime13.withWeekOfWeekyear((int) (short) 10);
        int int19 = dateTimeZone10.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        java.lang.String str22 = dateTimeZone10.getShortName(126000005L);
        long long24 = dateTimeZone10.convertUTCToLocal((-37919977L));
        long long27 = dateTimeZone10.adjustOffset((long) 7, true);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(dateTimeZone10);
        org.joda.time.DateTime dateTime29 = dateTime2.toDateTime(dateTimeZone10);
        java.lang.String str31 = dateTimeZone10.getName((long) 5423123);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(dateTimeZone10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime29", (dateTime2.compareTo(dateTime29) == 0) == dateTime2.equals(dateTime29));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.DateTime dateTime17 = dateTime13.minusHours(1970);
        int int18 = dateTime17.getMonthOfYear();
        org.joda.time.DateTime dateTime20 = dateTime17.plusDays(678);
        org.joda.time.DateTime.Property property21 = dateTime17.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone23);
        org.joda.time.LocalDate.Property property25 = localDate24.weekOfWeekyear();
        org.joda.time.LocalDate localDate26 = property25.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int34 = dateTime32.get(dateTimeFieldType33);
        boolean boolean35 = localDate26.equals((java.lang.Object) dateTime32);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int44 = dateTime42.get(dateTimeFieldType43);
        org.joda.time.DateTime dateTime45 = dateTime42.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime49 = dateTime42.toDateTime(dateTimeZone48);
        org.joda.time.Chronology chronology50 = dateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = dateTimeFieldType36.getField(chronology50);
        org.joda.time.DateTimeField dateTimeField52 = chronology50.weekyear();
        org.joda.time.DateTimeField dateTimeField53 = chronology50.halfdayOfDay();
        org.joda.time.DateTime dateTime54 = dateTime32.toDateTime(chronology50);
        org.joda.time.DateTimeField dateTimeField55 = chronology50.secondOfDay();
        org.joda.time.Chronology chronology56 = chronology50.withUTC();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.hourOfHalfday();
        org.joda.time.DateTime dateTime58 = dateTime17.withChronology(chronology56);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime58", (dateTime17.compareTo(dateTime58) == 0) == dateTime17.equals(dateTime58));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTimeField dateTimeField3 = dateTimeFieldType1.getField(chronology2);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        int int7 = dateTimeField3.getMinimumValue((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime localTime9 = localTime5.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime16.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime23 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime16.minus(readablePeriod24);
        long long26 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime27 = property10.withMaximumValue();
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(632L, chronology28);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long35 = dateTimeZone32.adjustOffset((long) 9, true);
        java.lang.String str36 = dateTimeZone32.getID();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone32);
        long long39 = dateTimeZone32.convertUTCToLocal((long) (short) 1);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone32);
        java.lang.String str42 = dateTimeZone32.getName(1645455527600L);
        org.joda.time.DateTime dateTime43 = dateTime30.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(dateTimeZone32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime30 and dateTime40", (dateTime30.compareTo(dateTime40) == 0) == dateTime30.equals(dateTime40));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) 53);
        org.joda.time.DateTime dateTime23 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.DateTime.Property property24 = dateTime23.year();
        org.joda.time.DateTime dateTime25 = property24.withMinimumValue();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime23", (dateTime13.compareTo(dateTime23) == 0) == dateTime13.equals(dateTime23));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (-1));
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 5420956);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType5.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.centuryOfEra();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime25.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime25.minus((long) '#');
        org.joda.time.DateTime dateTime31 = dateTime25.withDayOfWeek(4);
        org.joda.time.LocalDate localDate32 = dateTime25.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.plus(readablePeriod33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekyear();
        org.joda.time.LocalDate localDate36 = property35.withMinimumValue();
        org.joda.time.LocalDate.Property property37 = localDate36.yearOfEra();
        long long39 = chronology19.set((org.joda.time.ReadablePartial) localDate36, (long) 11);
        org.joda.time.DurationField durationField40 = chronology19.months();
        org.joda.time.DateTimeField dateTimeField41 = chronology19.year();
        java.lang.String str42 = chronology19.toString();
        org.joda.time.DurationField durationField43 = chronology19.days();
        org.joda.time.DateTimeField dateTimeField44 = chronology19.year();
        org.joda.time.DateTime dateTime45 = instant4.toDateTime(chronology19);
        org.joda.time.DateTimeField dateTimeField46 = chronology19.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant1 and dateTime45", (instant1.compareTo(dateTime45) == 0) == instant1.equals(dateTime45));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        int int11 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.Instant instant14 = dateTime12.toInstant();
        org.joda.time.Instant instant17 = instant14.withDurationAdded(1645455533666L, 43);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate22 = property21.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        boolean boolean31 = localDate22.equals((java.lang.Object) dateTime28);
        int int32 = localDate22.getWeekyear();
        org.joda.time.Chronology chronology33 = localDate22.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone35 = chronology33.getZone();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.monthOfYear();
        org.joda.time.DateTime dateTime38 = instant17.toDateTime(chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and instant14", (dateTime12.compareTo(instant14) == 0) == dateTime12.equals(instant14));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYear(37920000);
        int int28 = localDateTime27.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        int int40 = dateTimeZone31.getOffset((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTime dateTime42 = dateTime39.minus((long) 100);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) 0, chronology47);
        org.joda.time.DateTime.Property property49 = dateTime48.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTime dateTime51 = dateTime48.plus(readableDuration50);
        org.joda.time.DateTime dateTime53 = dateTime48.withWeekOfWeekyear((int) (short) 10);
        int int54 = dateTimeZone45.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone45);
        org.joda.time.DateTime dateTime56 = dateTime42.withZone(dateTimeZone45);
        org.joda.time.LocalDateTime localDateTime57 = new org.joda.time.LocalDateTime(dateTimeZone45);
        boolean boolean58 = dateTimeZone45.isFixed();
        org.joda.time.DateTime dateTime59 = localDateTime27.toDateTime(dateTimeZone45);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) 0, chronology61);
        int int63 = dateTime62.getSecondOfMinute();
        org.joda.time.DateTime.Property property64 = dateTime62.dayOfWeek();
        org.joda.time.DateTime.Property property65 = dateTime62.minuteOfDay();
        org.joda.time.DateTime dateTime67 = dateTime62.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTime dateTime69 = dateTime62.plusHours(5501598);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalDate localDate72 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone71);
        org.joda.time.LocalDate.Property property73 = localDate72.weekOfWeekyear();
        org.joda.time.LocalDate localDate74 = property73.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) 0, chronology76);
        org.joda.time.DateTime.Property property78 = dateTime77.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration79 = null;
        org.joda.time.DateTime dateTime80 = dateTime77.plus(readableDuration79);
        org.joda.time.DateTimeFieldType dateTimeFieldType81 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int82 = dateTime80.get(dateTimeFieldType81);
        boolean boolean83 = localDate74.equals((java.lang.Object) dateTime80);
        int int84 = localDate74.getWeekyear();
        org.joda.time.Chronology chronology85 = localDate74.getChronology();
        org.joda.time.DateTimeZone dateTimeZone86 = chronology85.getZone();
        long long89 = dateTimeZone86.adjustOffset(946646880000L, false);
        org.joda.time.DateTime dateTime90 = dateTime62.toDateTime(dateTimeZone86);
        org.joda.time.DateTime dateTime91 = dateTime59.withZone(dateTimeZone86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime90", (dateTime3.compareTo(dateTime90) == 0) == dateTime3.equals(dateTime90));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        java.lang.String str1 = instant0.toString();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant0.withDurationAdded(readableDuration3, 44);
        org.joda.time.Instant instant7 = instant5.minus((long) 305282);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant5 and mutableDateTime2", (instant5.compareTo(mutableDateTime2) == 0) == instant5.equals(mutableDateTime2));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Italian");
        timeZone1.setID("minutes");
        java.util.Calendar.Builder builder4 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder4.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder12 = builder4.setDate(37920000, (-1), 37920);
        java.util.Calendar.Builder builder14 = builder12.setLenient(true);
        java.util.Calendar.Builder builder16 = builder12.setLenient(false);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.plus(readableDuration25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime29 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType20.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.weekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.halfdayOfDay();
        org.joda.time.DurationField durationField38 = chronology34.hours();
        org.joda.time.DurationField durationField39 = chronology34.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter19.withChronology(chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter19.withChronology(chronology41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter19.withPivotYear((java.lang.Integer) 889);
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int54 = dateTime52.get(dateTimeFieldType53);
        org.joda.time.LocalTime.Property property55 = localTime46.property(dateTimeFieldType53);
        java.lang.String str56 = property55.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTimeField dateTimeField60 = dateTimeFieldType58.getField(chronology59);
        boolean boolean62 = dateTimeField60.isLeap((long) 9);
        boolean boolean63 = dateTimeField60.isSupported();
        java.util.Locale locale64 = java.util.Locale.TAIWAN;
        java.lang.String str65 = locale64.getDisplayScript();
        int int66 = dateTimeField60.getMaximumShortTextLength(locale64);
        org.joda.time.LocalTime localTime67 = property55.setCopy("53", locale64);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTimeField dateTimeField70 = dateTimeFieldType68.getField(chronology69);
        org.joda.time.ReadablePartial readablePartial71 = null;
        java.util.Locale locale74 = java.util.Locale.forLanguageTag("");
        java.lang.String str75 = dateTimeField70.getAsShortText(readablePartial71, (int) (byte) 1, locale74);
        java.util.Locale locale79 = new java.util.Locale("Greenwich Mean Time", "ISOChronology[+10:32]", "en_CA");
        java.lang.String str80 = locale74.getDisplayLanguage(locale79);
        java.lang.String str81 = locale64.getDisplayScript(locale79);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = dateTimeFormatter44.withLocale(locale64);
        java.lang.String str83 = locale64.getVariant();
        java.util.Calendar.Builder builder84 = builder12.setLocale(locale64);
        java.lang.String str85 = locale64.toLanguageTag();
        java.lang.String str86 = locale64.getVariant();
        java.util.Calendar calendar87 = java.util.Calendar.getInstance(timeZone1, locale64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime23 and dateTime33", (dateTime23.compareTo(dateTime33) == 0) == dateTime23.equals(dateTime33));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMonths(37919999);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int18 = dateTime16.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTime(dateTimeZone22);
        int int25 = dateTimeZone22.getStandardOffset((long) 9);
        long long27 = dateTimeZone22.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime30.toMutableDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime30.minus((long) '#');
        org.joda.time.DateTime dateTime36 = dateTime30.withDayOfWeek(4);
        org.joda.time.DateTime.Property property37 = dateTime36.minuteOfHour();
        org.joda.time.DateTime dateTime39 = dateTime36.withCenturyOfEra(1);
        int int40 = dateTimeZone22.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) localDate10, dateTimeZone22);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        int int45 = dateTime44.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.plus(readableDuration53);
        org.joda.time.DateTime dateTime56 = dateTime51.withWeekOfWeekyear((int) (short) 10);
        int int57 = dateTimeZone48.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone48);
        long long61 = dateTimeZone48.convertLocalToUTC((long) 23, false);
        org.joda.time.DateTime dateTime62 = dateTime44.withZoneRetainFields(dateTimeZone48);
        org.joda.time.DateTime dateTime64 = dateTime44.minusMinutes(32769);
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 0, chronology68);
        org.joda.time.DateTime.Property property70 = dateTime69.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration71 = null;
        org.joda.time.DateTime dateTime72 = dateTime69.plus(readableDuration71);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int74 = dateTime72.get(dateTimeFieldType73);
        org.joda.time.DateTime dateTime75 = dateTime72.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone78 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime79 = dateTime72.toDateTime(dateTimeZone78);
        org.joda.time.Chronology chronology80 = dateTime79.getChronology();
        org.joda.time.DateTimeField dateTimeField81 = dateTimeFieldType66.getField(chronology80);
        org.joda.time.DateTimeField dateTimeField82 = chronology80.weekyear();
        org.joda.time.DateTimeField dateTimeField83 = chronology80.halfdayOfDay();
        org.joda.time.DurationField durationField84 = chronology80.hours();
        org.joda.time.DateTimeField dateTimeField85 = chronology80.minuteOfHour();
        org.joda.time.DurationField durationField86 = durationFieldType65.getField(chronology80);
        org.joda.time.DateTime dateTime88 = dateTime44.withFieldAdded(durationFieldType65, 50);
        org.joda.time.LocalDate localDate90 = localDate41.withFieldAdded(durationFieldType65, (int) (short) -1);
        org.joda.time.LocalDate.Property property91 = localDate90.yearOfEra();
        org.joda.time.LocalDate localDate93 = property91.setCopy(1439);
        java.lang.String str94 = property91.getAsShortText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime23", (dateTime2.compareTo(dateTime23) == 0) == dateTime2.equals(dateTime23));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        int int6 = calendar0.getWeeksInWeekYear();
        int int8 = calendar0.getActualMaximum(6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone10 = calendar0.getTimeZone();
        timeZone10.setID("1970-01-01T10:32:00.000+10:32");
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = dateTimeField15.getAsShortText(readablePartial16, (int) (byte) 1, locale19);
        java.util.Locale locale24 = new java.util.Locale("Greenwich Mean Time", "ISOChronology[+10:32]", "en_CA");
        java.lang.String str25 = locale19.getDisplayLanguage(locale24);
        boolean boolean26 = locale24.hasExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale24);
        java.util.Set<java.lang.Character> charSet28 = locale24.getExtensionKeys();
        java.util.Calendar calendar29 = java.util.Calendar.getInstance(timeZone10, locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar0 and calendar27", (calendar0.compareTo(calendar27) == 0) == calendar0.equals(calendar27));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        java.util.Date date4 = new java.util.Date();
        long long5 = date4.getTime();
        long long6 = date4.getTime();
        int int7 = date4.getDay();
        int int8 = date4.getMinutes();
        calendar3.setTime(date4);
        calendar3.setMinimalDaysInFirstWeek(5482542);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean14 = timeZone13.observesDaylightTime();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(timeZone13);
        java.util.Date date16 = new java.util.Date();
        long long17 = date16.getTime();
        long long18 = date16.getTime();
        int int19 = date16.getDay();
        int int20 = date16.getMinutes();
        calendar15.setTime(date16);
        int int22 = date16.getYear();
        calendar3.setTime(date16);
        int int24 = date16.getDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar3 and calendar15", (calendar3.compareTo(calendar15) == 0) == calendar3.equals(calendar15));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime6.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.halfdayOfDay();
        org.joda.time.DurationField durationField33 = chronology26.minutes();
        org.joda.time.DurationField durationField34 = chronology26.months();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(1645455632396L, chronology26);
        org.joda.time.LocalDate localDate37 = localDate35.minusMonths(5961593);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        int int39 = dateTimeZone37.getOffsetFromLocal((long) 53);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(dateTimeZone37);
        org.joda.time.Chronology chronology41 = chronology14.withZone(dateTimeZone37);
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone45);
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = dateTimeField48.getType();
        java.util.Locale locale51 = java.util.Locale.TAIWAN;
        java.lang.String str52 = locale51.getDisplayScript();
        java.lang.String str53 = dateTimeField48.getAsText(5, locale51);
        java.lang.String str54 = dateTimeZone37.getShortName(22934016000007L, locale51);
        long long56 = dateTimeZone37.nextTransition((long) 305);
        java.util.TimeZone timeZone57 = dateTimeZone37.toTimeZone();
        int int58 = timeZone57.getDSTSavings();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        java.util.Locale locale1 = new java.util.Locale("5767-02-22T00:05:43.235");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType2.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.clockhourOfDay();
        int int20 = dateTimeField19.getMaximumValue();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        java.util.Locale locale24 = java.util.Locale.FRENCH;
        java.lang.String str25 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localTime21, 11, locale24);
        java.lang.String str26 = locale1.getDisplayScript(locale24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime15", (dateTime5.compareTo(dateTime15) == 0) == dateTime5.equals(dateTime15));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime23 = localTime20.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime29.withWeekOfWeekyear((int) (short) 10);
        int int35 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) localTime22, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime39 = localTime36.toDateTimeToday(dateTimeZone38);
        int int41 = dateTimeZone38.getOffsetFromLocal((long) (byte) 100);
        long long45 = dateTimeZone38.convertLocalToUTC((long) 24, true, (-1969L));
        org.joda.time.Chronology chronology46 = chronology14.withZone(dateTimeZone38);
        org.joda.time.DateTimeField dateTimeField47 = chronology14.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime((long) 37920000, dateTimeZone50);
        org.joda.time.DateTime dateTime52 = localTime51.toDateTimeToday();
        int int53 = localTime51.getHourOfDay();
        org.joda.time.LocalTime localTime55 = localTime51.withMillisOfDay(19);
        org.joda.time.LocalTime localTime57 = localTime51.minusMinutes(5432960);
        java.util.Locale locale58 = java.util.Locale.ENGLISH;
        java.lang.String str59 = dateTimeField47.getAsText((org.joda.time.ReadablePartial) localTime51, locale58);
        boolean boolean60 = locale58.hasExtensions();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.minusDays(7);
        int int29 = localDateTime28.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.minusYears(5882918);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("52");
        org.joda.time.DateTime dateTime3 = dateTime1.withYear((-632));
        org.joda.time.DateTime.Property property4 = dateTime1.millisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime1.plusYears(37314920);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withField(dateTimeFieldType24, 5);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusHours(23);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime40 = dateTime37.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime42 = dateTime37.withYear(11);
        org.joda.time.DateTime.Property property43 = dateTime42.monthOfYear();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 0, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime46.toMutableDateTime(chronology47);
        org.joda.time.DateTime dateTime50 = dateTime46.minus((long) '#');
        int int51 = dateTime50.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int53 = dateTime50.get(dateTimeFieldType52);
        int int54 = dateTime42.get(dateTimeFieldType52);
        int int55 = localDateTime30.get(dateTimeFieldType52);
        int int56 = dateTime1.get(dateTimeFieldType52);
        org.joda.time.DateTime.Property property57 = dateTime1.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime20", (dateTime10.compareTo(dateTime20) == 0) == dateTime10.equals(dateTime20));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        java.util.Locale locale1 = new java.util.Locale("37920001");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.lang.String[] strArray13 = new java.lang.String[] { "37920032", "eras", "12:12:00.097", "10:32:00.097", "-1", "9", "hi!", "java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]", "millisOfDay", "-1" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = strSet2.retainAll((java.util.Collection<java.lang.String>) strList14);
        java.lang.Object[] objArray17 = strSet2.toArray();
        org.joda.time.tz.Provider provider18 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider18);
        boolean boolean20 = strSet2.contains((java.lang.Object) provider18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime27.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType21.getField(chronology35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withField(dateTimeFieldType38, 5);
        int int41 = localDateTime37.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property42 = localDateTime37.yearOfEra();
        boolean boolean43 = strSet2.contains((java.lang.Object) localDateTime37);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) 0, chronology46);
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime47.plus(readableDuration49);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.DateTime dateTime53 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime57 = dateTime50.toDateTime(dateTimeZone56);
        org.joda.time.Chronology chronology58 = dateTime57.getChronology();
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType44.getField(chronology58);
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.withField(dateTimeFieldType61, 5);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime63.minusHours(23);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime65.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime71 = localDateTime69.minusWeeks(100);
        int int72 = localDateTime37.compareTo((org.joda.time.ReadablePartial) localDateTime69);
        int int73 = localDateTime69.getEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime34", (dateTime24.compareTo(dateTime34) == 0) == dateTime24.equals(dateTime34));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology24);
        java.lang.Integer int26 = dateTimeFormatter2.getPivotYear();
        boolean boolean27 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withDefaultYear(778);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime16", (dateTime6.compareTo(dateTime16) == 0) == dateTime6.equals(dateTime16));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime6.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField33 = durationFieldType0.getField(chronology26);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology26.getZone();
        org.joda.time.DurationField durationField35 = chronology26.weeks();
        org.joda.time.DateTimeField dateTimeField36 = chronology26.centuryOfEra();
        long long38 = dateTimeField36.roundFloor(0L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getRangeDurationType();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.centuryOfEra();
        boolean boolean25 = durationFieldType6.isSupported(chronology21);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) dateTime4, chronology21);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField28 = chronology21.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime20", (dateTime2.compareTo(dateTime20) == 0) == dateTime2.equals(dateTime20));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.dayOfYear();
        long long18 = dateTimeField15.getDifferenceAsLong(1475620188260000L, (long) (-513253579));
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = dateTimeField15.getType();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType19.getRangeDurationType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusYears(6);
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMinimumValue();
        int int25 = localDateTime24.getCenturyOfEra();
        java.lang.String str26 = localDateTime24.toString();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusHours(19);
        int int29 = localDateTime24.getMillisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours(26);
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 69, dateTimeZone20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        int int25 = dateTime24.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = dateTime24.withYear(10);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime30.toMutableDateTime(chronology31);
        org.joda.time.DateTime dateTime34 = dateTime30.minus((long) '#');
        org.joda.time.DateTime dateTime36 = dateTime30.withDayOfWeek(4);
        boolean boolean38 = dateTime30.equals((java.lang.Object) "eras");
        boolean boolean39 = dateTime24.isEqual((org.joda.time.ReadableInstant) dateTime30);
        int int40 = dateTime24.getSecondOfDay();
        org.joda.time.DateTime dateTime42 = dateTime24.withWeekOfWeekyear(23);
        org.joda.time.Chronology chronology43 = dateTime24.getChronology();
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.parse("53");
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.minusDays(50);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.minusWeeks(22);
        int[] intArray51 = chronology43.get((org.joda.time.ReadablePartial) localDateTime49, 0L);
        int int52 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDateTime21, intArray51);
        org.joda.time.DurationField durationField53 = dateTimeField17.getRangeDurationField();
        java.lang.String str54 = dateTimeField17.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds(15);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfSecond(31);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.monthOfYear();
        org.joda.time.LocalDateTime.Property property25 = localDateTime21.weekyear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.dayOfYear();
        java.lang.Class<?> wildcardClass27 = property26.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime23.plusDays(86399999);
        int int28 = localDateTime23.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime23.plusYears((-19044));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime4.toMutableDateTime(chronology5);
        org.joda.time.DateTime dateTime8 = dateTime4.minus((long) '#');
        org.joda.time.DateTime dateTime10 = dateTime4.withDayOfWeek(4);
        org.joda.time.LocalDate localDate11 = dateTime4.toLocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property15 = localDate13.property(dateTimeFieldType14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime18.toMutableDateTime(chronology19);
        org.joda.time.DateTime dateTime22 = dateTime18.minus((long) '#');
        org.joda.time.DateTime dateTime24 = dateTime18.withDayOfWeek(4);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime28 = dateTime24.withZone(dateTimeZone27);
        org.joda.time.Interval interval29 = localDate13.toInterval(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(126000005L, dateTimeZone27);
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(obj0, dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        int int35 = localDate32.get(dateTimeFieldType33);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType33.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTime dateTime45 = dateTime42.plus(readableDuration44);
        org.joda.time.DateTime dateTime47 = dateTime42.withWeekOfWeekyear((int) (short) 10);
        int int48 = dateTimeZone39.getOffset((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime50 = dateTime47.minus((long) 100);
        org.joda.time.DateTime dateTime52 = dateTime50.plusDays(1);
        org.joda.time.DateTime.Property property53 = dateTime50.hourOfDay();
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.DateTime dateTime55 = dateTime50.plus(readableDuration54);
        java.util.GregorianCalendar gregorianCalendar56 = dateTime50.toGregorianCalendar();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((long) 0, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime60.toMutableDateTime(chronology61);
        org.joda.time.DateTime dateTime64 = dateTime60.minus((long) '#');
        org.joda.time.DateTime dateTime66 = dateTime60.withDayOfWeek(4);
        org.joda.time.Chronology chronology67 = dateTime60.getChronology();
        org.joda.time.LocalDate localDate68 = new org.joda.time.LocalDate((long) 197, chronology67);
        org.joda.time.DurationField durationField69 = chronology67.months();
        boolean boolean70 = gregorianCalendar56.after((java.lang.Object) chronology67);
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType33.getField(chronology67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime28", (dateTime4.compareTo(dateTime28) == 0) == dateTime4.equals(dateTime28));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        boolean boolean7 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        calendar0.setLenient(false);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter13.withDefaultYear(5767);
        org.joda.time.format.DateTimePrinter dateTimePrinter19 = null;
        org.joda.time.format.DateTimeParser dateTimeParser20 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter19, dateTimeParser20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType22.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.halfdayOfDay();
        org.joda.time.DurationField durationField40 = chronology36.hours();
        org.joda.time.DurationField durationField41 = chronology36.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter21.withChronology(chronology36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter18.withChronology(chronology36);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) calendar0, chronology36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and dateTime35", (dateTime25.compareTo(dateTime35) == 0) == dateTime25.equals(dateTime35));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        long long16 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        boolean boolean20 = dateTimeField19.isLenient();
        long long22 = dateTimeField19.roundCeiling((long) 5);
        java.lang.String str24 = dateTimeField19.getAsText(32L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime27.minus((long) '#');
        org.joda.time.DateTime dateTime33 = dateTime27.withDayOfWeek(4);
        org.joda.time.LocalDate localDate34 = dateTime27.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        int int38 = localDate36.size();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale42 = java.util.Locale.UK;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.lang.String str44 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDate36, 53, locale41);
        java.lang.String str45 = property7.getAsShortText(locale41);
        java.lang.String str46 = property7.getAsString();
        org.joda.time.DateTime dateTime47 = property7.withMaximumValue();
        int int48 = property7.getMaximumValue();
        org.joda.time.DateTime dateTime49 = property7.getDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 0, chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTime dateTime56 = dateTime53.plus(readableDuration55);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int58 = dateTime56.get(dateTimeFieldType57);
        org.joda.time.DateTime dateTime59 = dateTime56.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime63 = dateTime56.toDateTime(dateTimeZone62);
        org.joda.time.Chronology chronology64 = dateTime63.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = dateTimeFieldType50.getField(chronology64);
        org.joda.time.DurationField durationField66 = chronology64.minutes();
        org.joda.time.DateTimeField dateTimeField67 = chronology64.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime68 = dateTime49.toMutableDateTime(chronology64);
        org.joda.time.DateTimeField dateTimeField69 = chronology64.yearOfCentury();
        long long71 = dateTimeField69.roundHalfFloor(1645455606214L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime63", (dateTime2.compareTo(dateTime63) == 0) == dateTime2.equals(dateTime63));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = chronology14.add(readablePeriod19, (long) 32769, 292278993);
        org.joda.time.DateTimeField dateTimeField23 = chronology14.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusYears(6);
        org.joda.time.LocalDateTime.Property property23 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime24 = property23.withMinimumValue();
        int int25 = localDateTime24.getCenturyOfEra();
        java.lang.String str26 = localDateTime24.toString();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.plusHours(19);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDate localDate30 = localDateTime28.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        int int17 = localDateTime16.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withPeriodAdded(readablePeriod19, 68);
        int int22 = localDateTime21.getWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        java.lang.String str21 = localDateTime19.toString();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withSecondOfMinute(19);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusYears((-292275055));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = property24.addToCopy((int) (byte) 100);
        java.lang.String str27 = property24.toString();
        org.joda.time.LocalDateTime localDateTime28 = property24.roundFloorCopy();
        int int29 = localDateTime28.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusHours(64);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMinutes(5920908);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean27 = localDateTime21.isSupported(dateTimeFieldType26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime21.minusMillis(184);
        org.joda.time.LocalDateTime.Property property31 = localDateTime21.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear(9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter7.withZoneUTC();
        boolean boolean9 = dateTimeFormatter7.isParser();
        org.joda.time.Chronology chronology10 = dateTimeFormatter7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 4629);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.centuryOfEra();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime34.toMutableDateTime(chronology35);
        org.joda.time.DateTime dateTime38 = dateTime34.minus((long) '#');
        org.joda.time.DateTime dateTime40 = dateTime34.withDayOfWeek(4);
        org.joda.time.LocalDate localDate41 = dateTime34.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDate localDate43 = localDate41.plus(readablePeriod42);
        org.joda.time.LocalDate.Property property44 = localDate43.weekyear();
        org.joda.time.LocalDate localDate45 = property44.withMinimumValue();
        org.joda.time.LocalDate.Property property46 = localDate45.yearOfEra();
        long long48 = chronology28.set((org.joda.time.ReadablePartial) localDate45, (long) 11);
        org.joda.time.DurationField durationField49 = chronology28.months();
        org.joda.time.DateTimeField dateTimeField50 = chronology28.year();
        java.lang.String str51 = chronology28.toString();
        org.joda.time.DurationField durationField52 = chronology28.days();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter12.withChronology(chronology28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and dateTime27", (dateTime17.compareTo(dateTime27) == 0) == dateTime17.equals(dateTime27));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        org.joda.time.DateTime dateTime25 = localDateTime21.toDateTime(dateTimeZone24);
        java.lang.String str27 = dateTimeZone24.getNameKey((long) 6);
        java.lang.String str28 = dateTimeZone24.getID();
        long long31 = dateTimeZone24.convertLocalToUTC((long) 58, false);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime41 = dateTime34.minusMillis(100);
        int int42 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 0, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime45.plus(readableDuration47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int50 = dateTime48.get(dateTimeFieldType49);
        org.joda.time.DateTime dateTime51 = dateTime48.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime53 = dateTime48.withYear(11);
        org.joda.time.DateTime.Property property54 = dateTime53.monthOfYear();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime57.toMutableDateTime(chronology58);
        org.joda.time.DateTime dateTime61 = dateTime57.minus((long) '#');
        int int62 = dateTime61.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int64 = dateTime61.get(dateTimeFieldType63);
        int int65 = dateTime53.get(dateTimeFieldType63);
        org.joda.time.ReadableDuration readableDuration66 = null;
        org.joda.time.DateTime dateTime67 = dateTime53.minus(readableDuration66);
        int int68 = dateTimeZone24.getOffset((org.joda.time.ReadableInstant) dateTime53);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(dateTimeZone24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        int int15 = localDate14.getYearOfEra();
        org.joda.time.LocalDate localDate17 = localDate14.minusWeeks(59);
        int int18 = localDate14.getDayOfYear();
        int int19 = localDate14.getDayOfMonth();
        org.joda.time.LocalDate.Property property20 = localDate14.weekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withDayOfWeek(4);
        org.joda.time.LocalDate localDate30 = dateTime23.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate35 = localDate30.withFieldAdded(durationFieldType33, 6);
        org.joda.time.LocalDate localDate37 = localDate30.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property38 = localDate30.weekyear();
        int int39 = localDate14.compareTo((org.joda.time.ReadablePartial) localDate30);
        int int40 = localDate14.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(4);
        org.joda.time.LocalDate localDate10 = dateTime3.toLocalDate();
        boolean boolean12 = localDate10.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate14 = localDate10.plusYears(10);
        org.joda.time.Interval interval15 = localDate14.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        org.joda.time.DateTime dateTime42 = dateTime36.withDayOfWeek(4);
        org.joda.time.LocalDate localDate43 = dateTime36.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate43.plus(readablePeriod44);
        org.joda.time.LocalDate.Property property46 = localDate45.weekyear();
        org.joda.time.LocalDate localDate47 = property46.withMinimumValue();
        org.joda.time.LocalDate.Property property48 = localDate47.yearOfEra();
        long long50 = chronology30.set((org.joda.time.ReadablePartial) localDate47, (long) 11);
        org.joda.time.DurationField durationField51 = chronology30.months();
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) 0, chronology56);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.DateTime dateTime60 = dateTime57.plus(readableDuration59);
        org.joda.time.DateTime dateTime62 = dateTime57.withWeekOfWeekyear((int) (short) 10);
        int int63 = dateTimeZone54.getOffset((org.joda.time.ReadableInstant) dateTime62);
        org.joda.time.Chronology chronology64 = chronology30.withZone(dateTimeZone54);
        org.joda.time.DateTime dateTime65 = localDate14.toDateTimeAtMidnight(dateTimeZone54);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate((long) 889, dateTimeZone54);
        org.joda.time.ReadablePeriod readablePeriod67 = null;
        org.joda.time.LocalDate localDate68 = localDate66.minus(readablePeriod67);
        org.joda.time.DateTime dateTime69 = localDate68.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate71 = localDate68.withWeekyear(1972);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime29", (dateTime3.compareTo(dateTime29) == 0) == dateTime3.equals(dateTime29));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology14.centuries();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime23 = localTime20.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime29.withWeekOfWeekyear((int) (short) 10);
        int int35 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) localTime22, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime39 = localTime36.toDateTimeToday(dateTimeZone38);
        int int41 = dateTimeZone38.getOffsetFromLocal((long) (byte) 100);
        long long45 = dateTimeZone38.convertLocalToUTC((long) 24, true, (-1969L));
        org.joda.time.Chronology chronology46 = chronology14.withZone(dateTimeZone38);
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.halfdayOfDay();
        long long50 = dateTimeField48.roundHalfEven(1645455987368L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds(15);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMillisOfSecond(31);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, 20);
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.centuryOfEra();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.centuryOfEra();
        org.joda.time.LocalDateTime.Property property29 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime23.plusWeeks(575);
        org.joda.time.LocalDateTime.Property property32 = localDateTime23.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone2);
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.withDayOfWeek(4);
        boolean boolean15 = dateTime7.equals((java.lang.Object) "eras");
        int int16 = dateTime7.getWeekyear();
        org.joda.time.DateTime dateTime17 = localDate3.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTime dateTime19 = dateTime17.plusMinutes((int) 'u');
        int int20 = dateTime19.getWeekyear();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.plus(readableDuration25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime29 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTime(dateTimeZone32);
        long long36 = dateTimeZone32.convertLocalToUTC((long) 8, false);
        java.util.Calendar.Builder builder38 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder42 = builder38.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder46 = builder38.setDate(20, (int) 'u', 37920197);
        java.util.Locale locale47 = java.util.Locale.ENGLISH;
        java.util.Calendar.Builder builder48 = builder46.setLocale(locale47);
        java.lang.String str49 = dateTimeZone32.getName((-37919999L), locale47);
        org.joda.time.DateTime dateTime50 = dateTime19.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 0, chronology55);
        org.joda.time.DateTime.Property property57 = dateTime56.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration58 = null;
        org.joda.time.DateTime dateTime59 = dateTime56.plus(readableDuration58);
        org.joda.time.DateTime dateTime61 = dateTime56.withWeekOfWeekyear((int) (short) 10);
        int int62 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone53);
        java.lang.String str65 = dateTimeZone53.getShortName(126000005L);
        long long67 = dateTimeZone53.convertUTCToLocal((-37919977L));
        org.joda.time.DateTime dateTime68 = dateTime50.toDateTime(dateTimeZone53);
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(1645455833834L, dateTimeZone53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime33", (dateTime7.compareTo(dateTime33) == 0) == dateTime7.equals(dateTime33));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime8 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime8.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime18.withWeekOfWeekyear((int) (short) 10);
        int int24 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime26 = dateTime23.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readableDuration27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.withPeriodAdded(readablePeriod29, 37920);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime dateTime40 = dateTime37.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime44 = dateTime37.toDateTime(dateTimeZone43);
        int int46 = dateTimeZone43.getStandardOffset((long) 9);
        long long48 = dateTimeZone43.convertUTCToLocal(100L);
        org.joda.time.format.DateTimePrinter dateTimePrinter49 = null;
        org.joda.time.format.DateTimeParser dateTimeParser50 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter49, dateTimeParser50);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 0, chronology54);
        org.joda.time.DateTime.Property property56 = dateTime55.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime55.plus(readableDuration57);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int60 = dateTime58.get(dateTimeFieldType59);
        org.joda.time.DateTime dateTime61 = dateTime58.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime65 = dateTime58.toDateTime(dateTimeZone64);
        org.joda.time.Chronology chronology66 = dateTime65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = dateTimeFieldType52.getField(chronology66);
        org.joda.time.DateTimeField dateTimeField68 = chronology66.weekyear();
        org.joda.time.DateTimeField dateTimeField69 = chronology66.halfdayOfDay();
        org.joda.time.DurationField durationField70 = chronology66.hours();
        org.joda.time.DurationField durationField71 = chronology66.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter51.withChronology(chronology66);
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter51.withChronology(chronology73);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter51.withPivotYear(121);
        boolean boolean77 = dateTimeFormatter76.isParser();
        boolean boolean78 = dateTimeZone43.equals((java.lang.Object) boolean77);
        org.joda.time.DateTime dateTime79 = dateTime31.toDateTime(dateTimeZone43);
        long long81 = dateTimeZone11.getMillisKeepLocal(dateTimeZone43, 12L);
        org.joda.time.LocalDate localDate82 = org.joda.time.LocalDate.now(dateTimeZone43);
        long long84 = dateTimeZone43.convertUTCToLocal((long) 331699);
        long long86 = dateTimeZone43.previousTransition(3277245076111812L);
        java.lang.String str87 = dateTimeZone43.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime44", (dateTime2.compareTo(dateTime44) == 0) == dateTime2.equals(dateTime44));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        org.joda.time.LocalDate localDate13 = property11.setCopy(7);
        org.joda.time.LocalDate.Property property14 = localDate13.centuryOfEra();
        org.joda.time.LocalDate localDate16 = localDate13.plusDays(0);
        org.joda.time.DateTime dateTime17 = localDate16.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime21.plus(readableDuration23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int26 = dateTime24.get(dateTimeFieldType25);
        org.joda.time.DateTime dateTime27 = dateTime24.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime31 = dateTime24.toDateTime(dateTimeZone30);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = dateTimeFieldType18.getField(chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.centuryOfEra();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) 0, chronology37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime38.toMutableDateTime(chronology39);
        org.joda.time.DateTime dateTime42 = dateTime38.minus((long) '#');
        org.joda.time.DateTime dateTime44 = dateTime38.withDayOfWeek(4);
        org.joda.time.LocalDate localDate45 = dateTime38.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDate localDate47 = localDate45.plus(readablePeriod46);
        org.joda.time.LocalDate.Property property48 = localDate47.weekyear();
        org.joda.time.LocalDate localDate49 = property48.withMinimumValue();
        org.joda.time.LocalDate.Property property50 = localDate49.yearOfEra();
        long long52 = chronology32.set((org.joda.time.ReadablePartial) localDate49, (long) 11);
        org.joda.time.DurationField durationField53 = chronology32.months();
        org.joda.time.DateTimeField dateTimeField54 = chronology32.year();
        java.lang.String str55 = chronology32.toString();
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.now(chronology32);
        org.joda.time.DurationField durationField57 = chronology32.centuries();
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long62 = dateTimeZone59.adjustOffset((long) 9, true);
        java.lang.String str63 = dateTimeZone59.getID();
        org.joda.time.Chronology chronology64 = chronology32.withZone(dateTimeZone59);
        org.joda.time.DurationField durationField65 = chronology32.years();
        org.joda.time.DateTime dateTime66 = dateTime17.toDateTime(chronology32);
        org.joda.time.DateTime.Property property67 = dateTime17.millisOfDay();
        org.joda.time.DateTime dateTime69 = property67.addWrapFieldToCopy((int) (byte) 100);
        int int70 = dateTime69.getDayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime31", (dateTime2.compareTo(dateTime31) == 0) == dateTime2.equals(dateTime31));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.getLocalDateTime();
        int int24 = property22.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField26 = property22.getField();
        org.joda.time.LocalDateTime localDateTime27 = property22.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfWeek();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withField(dateTimeFieldType34, 5);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusHours(23);
        org.joda.time.LocalDateTime.Property property39 = localDateTime36.weekyear();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.yearOfEra();
        org.joda.time.LocalDateTime.Property property42 = localDateTime40.millisOfDay();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime40.plusDays(86399999);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withDayOfWeek(1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime44);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime47.minusHours(37214189);
        int int50 = localDateTime47.getEra();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime47.minusHours(7);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.minusYears(69);
        int int55 = localDateTime47.getYearOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology14.getZone();
        org.joda.time.ReadableInstant readableInstant19 = null;
        int int20 = dateTimeZone18.getOffset(readableInstant19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime21.millisOfDay();
        org.joda.time.DateTime dateTime27 = localDateTime21.toDateTime();
        org.joda.time.LocalDateTime.Property property28 = localDateTime21.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property28.addToCopy((long) 0);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withCenturyOfEra(22);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusDays((int) '4');
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField37 = chronology14.yearOfEra();
        boolean boolean38 = dateTimeField37.isSupported();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime19.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.plusMonths(44940);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.weekOfWeekyear();
        int int24 = localDateTime22.getDayOfMonth();
        java.lang.String str25 = localDateTime22.toString();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.plusDays(41);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusWeeks(843);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime27.minusDays(305070);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.halfdayOfDay();
        org.joda.time.DurationField durationField32 = chronology28.hours();
        org.joda.time.DateTime dateTime33 = dateTime10.toDateTime(chronology28);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.DateTime.Property property40 = dateTime39.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.DateTime dateTime42 = dateTime39.plus(readableDuration41);
        org.joda.time.DateTime dateTime44 = dateTime39.withWeekOfWeekyear((int) (short) 10);
        int int45 = dateTimeZone36.getOffset((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.DateTime dateTime47 = dateTime44.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration53 = null;
        org.joda.time.DateTime dateTime54 = dateTime51.plus(readableDuration53);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int56 = dateTime54.get(dateTimeFieldType55);
        org.joda.time.DateTime dateTime57 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime61 = dateTime54.toDateTime(dateTimeZone60);
        org.joda.time.Chronology chronology62 = dateTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField63 = dateTimeFieldType48.getField(chronology62);
        org.joda.time.DateTimeField dateTimeField64 = chronology62.weekyear();
        org.joda.time.DateTimeField dateTimeField65 = chronology62.centuryOfEra();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) 0, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.MutableDateTime mutableDateTime70 = dateTime68.toMutableDateTime(chronology69);
        org.joda.time.DateTime dateTime72 = dateTime68.minus((long) '#');
        org.joda.time.DateTime dateTime74 = dateTime68.withDayOfWeek(4);
        org.joda.time.LocalDate localDate75 = dateTime68.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod76 = null;
        org.joda.time.LocalDate localDate77 = localDate75.plus(readablePeriod76);
        org.joda.time.LocalDate.Property property78 = localDate77.weekyear();
        org.joda.time.LocalDate localDate79 = property78.withMinimumValue();
        org.joda.time.LocalDate.Property property80 = localDate79.yearOfEra();
        long long82 = chronology62.set((org.joda.time.ReadablePartial) localDate79, (long) 11);
        org.joda.time.DateTime dateTime83 = dateTime47.toDateTime(chronology62);
        boolean boolean84 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime47);
        org.joda.time.DateTime dateTime86 = dateTime10.plusMinutes((int) 'x');
        org.joda.time.DateTime.Property property87 = dateTime86.millisOfDay();
        org.joda.time.DateTime.Property property88 = dateTime86.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime27", (dateTime5.compareTo(dateTime27) == 0) == dateTime5.equals(dateTime27));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime15.withYear(11);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime23 = dateTime6.plusSeconds(778);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone25);
        int int27 = localDate26.getDayOfMonth();
        int int28 = localDate26.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField30 = localDate26.getField(0);
        org.joda.time.DateTime dateTime31 = localDate26.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readableDuration37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int40 = dateTime38.get(dateTimeFieldType39);
        org.joda.time.DateTime dateTime41 = dateTime38.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime45 = dateTime38.toDateTime(dateTimeZone44);
        org.joda.time.Chronology chronology46 = dateTime45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = dateTimeFieldType32.getField(chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.weekyear();
        org.joda.time.DateTimeField dateTimeField49 = chronology46.centuryOfEra();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 0, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = dateTime52.toMutableDateTime(chronology53);
        org.joda.time.DateTime dateTime56 = dateTime52.minus((long) '#');
        org.joda.time.DateTime dateTime58 = dateTime52.withDayOfWeek(4);
        org.joda.time.LocalDate localDate59 = dateTime52.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod60 = null;
        org.joda.time.LocalDate localDate61 = localDate59.plus(readablePeriod60);
        org.joda.time.LocalDate.Property property62 = localDate61.weekyear();
        org.joda.time.LocalDate localDate63 = property62.withMinimumValue();
        org.joda.time.LocalDate.Property property64 = localDate63.yearOfEra();
        long long66 = chronology46.set((org.joda.time.ReadablePartial) localDate63, (long) 11);
        org.joda.time.DurationField durationField67 = chronology46.months();
        org.joda.time.DateTimeField dateTimeField68 = chronology46.year();
        java.lang.String str69 = chronology46.toString();
        org.joda.time.DurationField durationField70 = chronology46.days();
        org.joda.time.DateTime dateTime71 = dateTime31.withChronology(chronology46);
        org.joda.time.DateTimeZone dateTimeZone73 = null;
        org.joda.time.LocalDate localDate74 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone73);
        int int75 = localDate74.getDayOfMonth();
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime((long) 0, chronology77);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.MutableDateTime mutableDateTime80 = dateTime78.toMutableDateTime(chronology79);
        org.joda.time.DateTime dateTime82 = dateTime78.minus((long) '#');
        org.joda.time.DateTime dateTime84 = dateTime78.withDayOfWeek(4);
        boolean boolean86 = dateTime78.equals((java.lang.Object) "eras");
        int int87 = dateTime78.getWeekyear();
        org.joda.time.DateTime dateTime88 = localDate74.toDateTime((org.joda.time.ReadableInstant) dateTime78);
        org.joda.time.DateTime dateTime90 = dateTime88.plusMinutes((int) 'u');
        int int91 = dateTime90.getWeekyear();
        int int92 = dateTime90.getSecondOfDay();
        int int93 = dateTime71.compareTo((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime95 = dateTime90.withMillis((-10L));
        boolean boolean96 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime98 = dateTime6.minusYears(247);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime45", (dateTime2.compareTo(dateTime45) == 0) == dateTime2.equals(dateTime45));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder8 = builder0.setDate(37920000, (-1), 37920);
        java.util.Calendar.Builder builder10 = builder8.setLenient(true);
        java.util.Calendar.Builder builder12 = builder8.setLenient(false);
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.halfdayOfDay();
        org.joda.time.DurationField durationField34 = chronology30.hours();
        org.joda.time.DurationField durationField35 = chronology30.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter15.withChronology(chronology30);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter15.withChronology(chronology37);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 889);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 0, chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime45.plus(readableDuration47);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int50 = dateTime48.get(dateTimeFieldType49);
        org.joda.time.LocalTime.Property property51 = localTime42.property(dateTimeFieldType49);
        java.lang.String str52 = property51.getName();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTimeField dateTimeField56 = dateTimeFieldType54.getField(chronology55);
        boolean boolean58 = dateTimeField56.isLeap((long) 9);
        boolean boolean59 = dateTimeField56.isSupported();
        java.util.Locale locale60 = java.util.Locale.TAIWAN;
        java.lang.String str61 = locale60.getDisplayScript();
        int int62 = dateTimeField56.getMaximumShortTextLength(locale60);
        org.joda.time.LocalTime localTime63 = property51.setCopy("53", locale60);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTimeField dateTimeField66 = dateTimeFieldType64.getField(chronology65);
        org.joda.time.ReadablePartial readablePartial67 = null;
        java.util.Locale locale70 = java.util.Locale.forLanguageTag("");
        java.lang.String str71 = dateTimeField66.getAsShortText(readablePartial67, (int) (byte) 1, locale70);
        java.util.Locale locale75 = new java.util.Locale("Greenwich Mean Time", "ISOChronology[+10:32]", "en_CA");
        java.lang.String str76 = locale70.getDisplayLanguage(locale75);
        java.lang.String str77 = locale60.getDisplayScript(locale75);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter40.withLocale(locale60);
        java.lang.String str79 = locale60.getVariant();
        java.util.Calendar.Builder builder80 = builder8.setLocale(locale60);
        java.lang.String str81 = locale60.toLanguageTag();
        java.lang.String str82 = locale60.getVariant();
        java.util.Set<java.lang.String> strSet83 = locale60.getUnicodeLocaleAttributes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and dateTime29", (dateTime19.compareTo(dateTime29) == 0) == dateTime19.equals(dateTime29));
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.centuryOfEra();
        org.joda.time.DurationField durationField19 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.era();
        long long24 = chronology15.add(56L, (-62197664487806L), (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType0.getField(chronology15);
        long long28 = dateTimeField25.getDifferenceAsLong(0L, 31460160000L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime6.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField33 = durationFieldType0.getField(chronology26);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology26.getZone();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime37.minus((long) '#');
        org.joda.time.DateTime dateTime43 = dateTime37.withDayOfWeek(4);
        org.joda.time.LocalDate localDate44 = dateTime37.toLocalDate();
        boolean boolean46 = localDate44.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate48 = localDate44.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone50);
        org.joda.time.LocalDate.Property property52 = localDate51.weekOfWeekyear();
        org.joda.time.LocalDate localDate53 = property52.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 0, chronology55);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime56.toMutableDateTime(chronology57);
        org.joda.time.DateTime dateTime60 = dateTime56.minus((long) '#');
        org.joda.time.DateTime dateTime62 = dateTime56.withDayOfWeek(4);
        org.joda.time.LocalDate localDate63 = dateTime56.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.LocalDate localDate65 = localDate63.plus(readablePeriod64);
        org.joda.time.LocalDate.Property property66 = localDate65.weekyear();
        org.joda.time.LocalDate localDate67 = localDate53.withFields((org.joda.time.ReadablePartial) localDate65);
        int int68 = localDate48.compareTo((org.joda.time.ReadablePartial) localDate67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.DateTime dateTime70 = localDate48.toDateTimeAtCurrentTime(dateTimeZone69);
        long long72 = chronology26.set((org.joda.time.ReadablePartial) localDate48, 37920197L);
        org.joda.time.LocalDate.Property property73 = localDate48.centuryOfEra();
        int int74 = property73.getMinimumValueOverall();
        org.joda.time.Chronology chronology76 = null;
        org.joda.time.DateTime dateTime77 = new org.joda.time.DateTime((long) 0, chronology76);
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.MutableDateTime mutableDateTime79 = dateTime77.toMutableDateTime(chronology78);
        org.joda.time.DateTime dateTime81 = dateTime77.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime82 = dateTime77.toMutableDateTime();
        int int83 = dateTime77.getMonthOfYear();
        org.joda.time.DateTime dateTime85 = dateTime77.plus((long) 1970);
        org.joda.time.DateTime dateTime87 = dateTime77.withYearOfEra(4);
        int int88 = property73.getDifference((org.joda.time.ReadableInstant) dateTime77);
        org.joda.time.LocalDate localDate89 = property73.roundCeilingCopy();
        org.joda.time.LocalDate localDate90 = property73.roundHalfFloorCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime25", (dateTime3.compareTo(dateTime25) == 0) == dateTime3.equals(dateTime25));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.Chronology chronology9 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime2.withDurationAdded((long) 37919900, 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        int int16 = dateTimeZone13.getOffset((long) 5427565);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime2.toMutableDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = dateTime2.withWeekyear(5581099);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime26 = dateTime23.plus(readableDuration25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime dateTime29 = dateTime26.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime33 = dateTime26.toDateTime(dateTimeZone32);
        org.joda.time.Chronology chronology34 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType20.getField(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.weekyear();
        org.joda.time.DateTimeField dateTimeField37 = chronology34.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField38 = chronology34.clockhourOfDay();
        org.joda.time.DurationField durationField39 = chronology34.weekyears();
        org.joda.time.DateTimeField dateTimeField40 = chronology34.monthOfYear();
        org.joda.time.DateTime dateTime41 = dateTime2.toDateTime(chronology34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime4 and dateTime33", (mutableDateTime4.compareTo(dateTime33) == 0) == mutableDateTime4.equals(dateTime33));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withField(dateTimeFieldType18, 5);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.minusHours(23);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withYear(37920000);
        int int29 = localDateTime28.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 0, chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime35.plus(readableDuration37);
        org.joda.time.DateTime dateTime40 = dateTime35.withWeekOfWeekyear((int) (short) 10);
        int int41 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTime dateTime43 = dateTime40.minus((long) 100);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.DateTime dateTime52 = dateTime49.plus(readableDuration51);
        org.joda.time.DateTime dateTime54 = dateTime49.withWeekOfWeekyear((int) (short) 10);
        int int55 = dateTimeZone46.getOffset((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone46);
        org.joda.time.DateTime dateTime57 = dateTime43.withZone(dateTimeZone46);
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone46);
        boolean boolean59 = dateTimeZone46.isFixed();
        org.joda.time.DateTime dateTime60 = localDateTime28.toDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 4871, dateTimeZone46);
        org.joda.time.DateTime dateTime63 = dateTime61.withYear(292275055);
        org.joda.time.ReadablePeriod readablePeriod64 = null;
        org.joda.time.DateTime dateTime66 = dateTime63.withPeriodAdded(readablePeriod64, 56);
        org.joda.time.Instant instant67 = new org.joda.time.Instant((java.lang.Object) readablePeriod64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime14", (dateTime4.compareTo(dateTime14) == 0) == dateTime4.equals(dateTime14));
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime35 = dateTime32.plus(readableDuration34);
        org.joda.time.DateTime dateTime37 = dateTime32.withWeekOfWeekyear((int) (short) 10);
        int int38 = dateTimeZone29.getOffset((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone29);
        java.util.Locale locale41 = java.util.Locale.ENGLISH;
        java.lang.String str42 = dateTimeZone29.getShortName((long) 37920, locale41);
        java.lang.String str43 = locale41.getDisplayScript();
        int int44 = dateTimeField19.getMaximumTextLength(locale41);
        long long46 = dateTimeField19.roundCeiling((-37919969L));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime13", (dateTime3.compareTo(dateTime13) == 0) == dateTime3.equals(dateTime13));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) 'u');
        int int19 = dateTime18.getWeekyear();
        int int20 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusWeeks((int) (short) 0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime25.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime25.minus((long) '#');
        org.joda.time.DateTime dateTime31 = dateTime25.withDayOfWeek(4);
        org.joda.time.LocalDate localDate32 = dateTime25.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.plus(readablePeriod33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekyear();
        org.joda.time.LocalDate localDate37 = localDate34.withYearOfEra(37919999);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0, chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.plus(readableDuration45);
        org.joda.time.DateTime dateTime48 = dateTime43.withWeekOfWeekyear((int) (short) 10);
        int int49 = dateTimeZone40.getOffset((org.joda.time.ReadableInstant) dateTime48);
        long long51 = dateTimeZone40.nextTransition((long) '#');
        org.joda.time.DateTime dateTime52 = localDate37.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.DateTime dateTime53 = dateTime22.toDateTime(dateTimeZone40);
        org.joda.time.DateTime dateTime55 = dateTime53.minusWeeks(26);
        org.joda.time.DateTime.Property property56 = dateTime55.secondOfMinute();
        org.joda.time.DateTime dateTime57 = property56.roundHalfCeilingCopy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and dateTime53", (dateTime18.compareTo(dateTime53) == 0) == dateTime18.equals(dateTime53));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime6.plusMinutes(14);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime12.toMutableDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime12.minus((long) '#');
        org.joda.time.DateTime.Property property17 = dateTime12.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime19 = property17.roundHalfFloorCopy();
        int int20 = dateTime19.getMinuteOfHour();
        org.joda.time.DateTime dateTime22 = dateTime19.plusMinutes(50400000);
        boolean boolean23 = dateTime6.isEqual((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.minus((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.withDayOfWeek(4);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int42 = dateTime40.get(dateTimeFieldType41);
        org.joda.time.LocalTime.Property property43 = localTime34.property(dateTimeFieldType41);
        int int44 = localTime34.getMillisOfSecond();
        java.lang.String str46 = localTime34.toString("10:32:00.097");
        org.joda.time.LocalTime localTime48 = localTime34.plusSeconds(23);
        org.joda.time.DateTime dateTime49 = dateTime26.withFields((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.Instant instant50 = dateTime26.toInstant();
        boolean boolean51 = dateTime6.isEqual((org.joda.time.ReadableInstant) instant50);
        int int52 = dateTime6.getSecondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant50", (dateTime2.compareTo(instant50) == 0) == dateTime2.equals(instant50));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(9);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.DateTime.Property property7 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime5.plusHours(64);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant6", (dateTime5.compareTo(instant6) == 0) == dateTime5.equals(instant6));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        int int14 = dateTimeZone11.getStandardOffset((long) 9);
        long long16 = dateTimeZone11.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.withDayOfWeek(4);
        org.joda.time.DateTime.Property property26 = dateTime25.minuteOfHour();
        org.joda.time.DateTime dateTime28 = dateTime25.withCenturyOfEra(1);
        int int29 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        org.joda.time.DateTime dateTime36 = property34.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime37 = property34.roundFloorCopy();
        org.joda.time.DateTime dateTime39 = property34.addWrapFieldToCopy(17);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMillis(36);
        org.joda.time.DateMidnight dateMidnight42 = dateTime39.toDateMidnight();
        boolean boolean43 = dateTime30.isAfter((org.joda.time.ReadableInstant) dateMidnight42);
        org.joda.time.DateTime.Property property44 = dateTime30.secondOfMinute();
        org.joda.time.DateTime.Property property45 = dateTime30.year();
        org.joda.time.DateTime dateTime46 = property45.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime48 = dateTime46.withDayOfYear(121);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.DateTime dateTime50 = dateTime46.plus(readableDuration49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and dateTime12", (dateTime2.compareTo(dateTime12) == 0) == dateTime2.equals(dateTime12));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime2.plus(readablePeriod7);
        org.joda.time.TimeOfDay timeOfDay9 = dateTime8.toTimeOfDay();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMonths(2000);
        org.joda.time.DateTime.Property property12 = dateTime8.weekyear();
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        long long14 = instant13.getMillis();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant17 = instant13.withDurationAdded(readableDuration15, 37920000);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.plus(readableDuration18);
        org.joda.time.DateTime dateTime20 = instant17.toDateTime();
        boolean boolean21 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime8.minus((long) 5488539);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant13 and dateTime20", (instant13.compareTo(dateTime20) == 0) == instant13.equals(dateTime20));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField32 = chronology28.dayOfMonth();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale34.getDisplayCountry();
        java.lang.String str36 = dateTimeField32.getAsText((-71L), locale34);
        java.lang.String str37 = dateTimeZone2.getShortName(3214875194192552L, locale34);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTimeField dateTimeField40 = dateTimeFieldType38.getField(chronology39);
        org.joda.time.ReadablePartial readablePartial41 = null;
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("");
        java.lang.String str45 = dateTimeField40.getAsShortText(readablePartial41, (int) (byte) 1, locale44);
        java.lang.String str46 = locale44.getDisplayVariant();
        java.lang.String str47 = locale44.toLanguageTag();
        java.util.Set<java.lang.String> strSet48 = locale44.getUnicodeLocaleKeys();
        java.lang.String str49 = locale34.getDisplayName(locale44);
        java.lang.String str50 = locale34.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime17", (dateTime5.compareTo(dateTime17) == 0) == dateTime5.equals(dateTime17));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        long long1 = instant0.getMillis();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant0.withDurationAdded(readableDuration2, 37920000);
        org.joda.time.Chronology chronology5 = instant0.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        org.joda.time.DurationField durationField8 = chronology5.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        java.lang.String str1 = instant0.toString();
        org.joda.time.MutableDateTime mutableDateTime2 = instant0.toMutableDateTimeISO();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone14);
        int int17 = dateTimeZone14.getStandardOffset((long) 9);
        long long19 = dateTimeZone14.convertUTCToLocal(100L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.withDayOfWeek(4);
        org.joda.time.DateTime.Property property29 = dateTime28.minuteOfHour();
        org.joda.time.DateTime dateTime31 = dateTime28.withCenturyOfEra(1);
        int int32 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTime dateTime33 = mutableDateTime2.toDateTime(dateTimeZone14);
        java.lang.String str35 = dateTimeZone14.getNameKey(1645455720309L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant0 and mutableDateTime2", (instant0.compareTo(mutableDateTime2) == 0) == instant0.equals(mutableDateTime2));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTime dateTime21 = dateTime18.withDurationAdded((-9223372016611199989L), (-1));
        org.joda.time.DateTime dateTime23 = dateTime21.minus((long) '#');
        int int24 = dateTime21.getDayOfWeek();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        int int28 = dateTime21.compareTo((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.Instant instant29 = dateTime27.toInstant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        boolean boolean32 = mutableDateTime30.isSupported(dateTimeFieldType31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and instant29", (dateTime5.compareTo(instant29) == 0) == dateTime5.equals(instant29));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        java.lang.String str1 = instant0.toString();
        org.joda.time.Instant instant3 = instant0.plus((long) 13);
        org.joda.time.MutableDateTime mutableDateTime4 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant6 = instant0.plus(0L);
        org.joda.time.Instant instant8 = instant6.minus(229835L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant6 and mutableDateTime4", (instant6.compareTo(mutableDateTime4) == 0) == instant6.equals(mutableDateTime4));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        java.lang.String str25 = dateTimeFieldType9.getName();
        boolean boolean26 = instant8.isSupported(dateTimeFieldType9);
        org.joda.time.DateTime dateTime27 = instant8.toDateTime();
        org.joda.time.Instant instant29 = instant8.withMillis(50L);
        org.joda.time.Chronology chronology30 = instant8.getChronology();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.Instant instant33 = instant8.withDurationAdded(readableDuration31, 0);
        boolean boolean35 = instant33.equals((java.lang.Object) "Feb 22, 2022 1:37:01 AM");
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant33", (dateTime2.compareTo(instant33) == 0) == dateTime2.equals(instant33));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        int int11 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime12 = dateTime2.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.plusDays(26);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        int int18 = dateTime17.getSecondOfMinute();
        org.joda.time.DateTime dateTime20 = dateTime17.withYear(10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withDayOfWeek(4);
        boolean boolean31 = dateTime23.equals((java.lang.Object) "eras");
        boolean boolean32 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime23);
        java.util.Locale locale34 = java.util.Locale.forLanguageTag("");
        java.lang.String str35 = locale34.getScript();
        java.util.Calendar calendar36 = dateTime23.toCalendar(locale34);
        org.joda.time.DateTime.Property property37 = dateTime23.millisOfSecond();
        org.joda.time.DateTime dateTime39 = property37.addToCopy(1);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime39.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long45 = dateTimeZone42.adjustOffset((long) 9, true);
        java.lang.String str46 = dateTimeZone42.getID();
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        long long50 = dateTimeZone42.getMillisKeepLocal(dateTimeZone48, (long) (short) -1);
        java.lang.String str51 = dateTimeZone42.toString();
        org.joda.time.DateTime dateTime52 = mutableDateTime40.toDateTime(dateTimeZone42);
        org.joda.time.Instant instant53 = dateTime52.toInstant();
        int int54 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime52);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime39 and instant53", (dateTime39.compareTo(instant53) == 0) == dateTime39.equals(instant53));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime16.millisOfSecond();
        int int23 = localDateTime16.getSecondOfMinute();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.Instant instant26 = instant24.plus((long) (short) 1);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant26.plus(readableDuration27);
        boolean boolean29 = localDateTime16.equals((java.lang.Object) instant28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant28.minus(readableDuration30);
        org.joda.time.DateTime dateTime32 = instant31.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime33 = instant31.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant31 and dateTime32", (instant31.compareTo(dateTime32) == 0) == instant31.equals(dateTime32));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.halfdayOfDay();
        org.joda.time.DurationField durationField32 = chronology28.hours();
        org.joda.time.DateTime dateTime33 = dateTime10.toDateTime(chronology28);
        org.joda.time.DurationField durationField34 = chronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology36 = chronology28.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = chronology36.monthOfYear();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyearOfCentury();
        org.joda.time.DurationField durationField40 = chronology36.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField40, durationField32, and durationField34", !(durationField40.compareTo(durationField32) == 0) || (Math.signum(durationField40.compareTo(durationField34)) == Math.signum(durationField32.compareTo(durationField34))));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getDayOfMonth();
        int int4 = dateTime2.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime2.getZone();
        org.joda.time.Instant instant6 = dateTime2.toInstant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) 20);
        org.joda.time.Instant instant9 = instant6.toInstant();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.plus(readableDuration10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and instant11", (dateTime2.compareTo(instant11) == 0) == dateTime2.equals(instant11));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime13.withPeriodAdded(readablePeriod16, 37920);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        int int22 = dateTimeZone20.getOffsetFromLocal((long) 53);
        org.joda.time.DateTime dateTime23 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and dateTime23", (dateTime13.compareTo(dateTime23) == 0) == dateTime13.equals(dateTime23));
    }
}

