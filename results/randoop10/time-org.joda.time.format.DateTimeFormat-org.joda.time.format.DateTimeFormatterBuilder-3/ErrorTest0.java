import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime1.toMutableDateTime(dateTimeZone5);
        java.lang.String str8 = dateTimeZone5.getName((long) 20);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime6", (dateTime1.compareTo(mutableDateTime6) == 0) == dateTime1.equals(mutableDateTime6));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.DurationField durationField11 = chronology7.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.DurationField durationField11 = chronology7.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField11, and durationField9", !(durationField9.compareTo(durationField11) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField11.compareTo(durationField9))));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        org.joda.time.DateTime dateTime22 = property19.addWrapFieldToCopy((int) '#');
        java.util.Locale locale23 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime28 = property27.roundHalfEven();
        java.util.Locale locale30 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime31 = property27.set("22", locale30);
        java.lang.String str32 = locale23.getDisplayScript(locale30);
        int int33 = property19.getMaximumShortTextLength(locale30);
        java.lang.String str34 = dateTimeZone13.getShortName((long) 99, locale30);
        org.joda.time.Chronology chronology35 = chronology7.withZone(dateTimeZone13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField20", Math.signum(durationField9.compareTo(durationField20)) == -Math.signum(durationField20.compareTo(durationField9)));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTime(chronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime10 = dateTime3.toDateTime(dateTimeZone9);
        int int12 = dateTimeZone9.getStandardOffset((long) 15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology5.add(readablePeriod10, (long) 23, 59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.DurationField durationField29 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfMonth();
        org.joda.time.DurationField durationField31 = durationFieldType18.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField32 = chronology26.clockhourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property8.getMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((-292275054));
        mutableDateTime11.setZoneRetainFields(dateTimeZone13);
        int int15 = mutableDateTime11.getSecondOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) 'a', chronology17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.yearOfCentury();
        mutableDateTime18.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology22 = null;
        mutableDateTime18.setChronology(chronology22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        int int29 = mutableDateTime26.getDayOfMonth();
        mutableDateTime26.setWeekyear((int) (short) 0);
        boolean boolean32 = mutableDateTime18.isAfter((org.joda.time.ReadableInstant) mutableDateTime26);
        long long33 = mutableDateTime26.getMillis();
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        mutableDateTime26.add(durationFieldType34, 40);
        mutableDateTime26.setSecondOfDay(22);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime26.dayOfMonth();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime26.minuteOfHour();
        org.joda.time.DateTime dateTime41 = mutableDateTime26.toDateTimeISO();
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) mutableDateTime26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime41", (mutableDateTime11.compareTo(dateTime41) == 0) == mutableDateTime11.equals(dateTime41));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.DurationField durationField29 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfMonth();
        org.joda.time.DurationField durationField31 = durationFieldType18.getField(chronology26);
        org.joda.time.DurationField durationField32 = chronology26.seconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology5);
        org.joda.time.DurationField durationField14 = chronology5.seconds();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField11, and durationField14", !(durationField15.compareTo(durationField11) == 0) || (Math.signum(durationField15.compareTo(durationField14)) == Math.signum(durationField11.compareTo(durationField14))));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DurationField durationField40 = chronology38.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField40", Math.signum(durationField39.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField39)));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.millis();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime5.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int16 = localTime12.get(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localTime12.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology17);
        org.joda.time.DurationField durationField19 = chronology17.eras();
        mutableDateTime11.setChronology(chronology17);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime11.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime23 = mutableDateTime22.toDateTimeISO();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime27.getZone();
        int int33 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime27);
        mutableDateTime9.setTime((org.joda.time.ReadableInstant) dateTime23);
        mutableDateTime9.setWeekyear(585);
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime40 = localTime38.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int42 = localTime38.get(dateTimeFieldType41);
        org.joda.time.Chronology chronology43 = localTime38.getChronology();
        org.joda.time.DurationField durationField44 = chronology43.months();
        org.joda.time.DurationField durationField45 = chronology43.days();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.dayOfWeek();
        org.joda.time.DurationField durationField47 = chronology43.weekyears();
        org.joda.time.tz.NameProvider nameProvider48 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale49 = java.util.Locale.ITALIAN;
        java.lang.String str52 = nameProvider48.getShortName(locale49, "United States", "1970-01-01T00:00:00.000Z");
        java.util.Locale locale53 = java.util.Locale.GERMAN;
        java.lang.String str54 = locale53.getCountry();
        java.lang.String str57 = nameProvider48.getShortName(locale53, "English", "february 21, 2022_FEBRUARY 21, 2022");
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 'a', chronology59);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime60.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime62 = property61.roundHalfEven();
        java.util.Locale locale64 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime65 = property61.set("22", locale64);
        mutableDateTime65.addYears(10);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime(chronology68);
        org.joda.time.DateTime.Property property70 = dateTime69.yearOfCentury();
        org.joda.time.DateTime dateTime71 = property70.withMinimumValue();
        org.joda.time.DateTime dateTime73 = dateTime71.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime75 = dateTime71.plusMillis(1);
        mutableDateTime65.setDate((org.joda.time.ReadableInstant) dateTime75);
        org.joda.time.DateTime dateTime78 = dateTime75.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime79 = dateTime78.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime81 = dateTime79.minusWeeks(2);
        java.util.Locale locale82 = java.util.Locale.ITALY;
        java.util.Calendar calendar83 = dateTime81.toCalendar(locale82);
        java.lang.String str84 = locale53.getDisplayVariant(locale82);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket(32L, chronology43, locale82, (java.lang.Integer) 54345623, 54381815);
        java.util.Calendar calendar88 = mutableDateTime9.toCalendar(locale82);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField19 and durationField44", Math.signum(durationField19.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField19)));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DurationField durationField13 = chronology7.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField13, and durationField9", !(durationField9.compareTo(durationField13) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField13.compareTo(durationField9))));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime13.getZone();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime13.toMutableDateTime(chronology34);
        mutableDateTime36.setWeekyear(914);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.DateTime dateTime27 = dateTime17.plusHours((-54353560));
        java.util.GregorianCalendar gregorianCalendar28 = dateTime17.toGregorianCalendar();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime17.minus(readablePeriod29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime33 = dateTime17.withDurationAdded(readableDuration31, 1998);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime7.withWeekyear((int) (short) 0);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime14 = localTime12.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int16 = localTime12.get(dateTimeFieldType15);
        org.joda.time.Chronology chronology17 = localTime12.getChronology();
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology17, locale18);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.year();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.getMillisKeepLocal(dateTimeZone22, (long) '#');
        java.lang.String str25 = dateTimeZone22.getID();
        int int27 = dateTimeZone22.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology28 = chronology17.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField29 = chronology28.centuries();
        org.joda.time.DateTime dateTime30 = dateTime7.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime30", (dateTime3.compareTo(dateTime30) == 0) == dateTime3.equals(dateTime30));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.String str18 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter16.withZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone25);
        int int33 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime34 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.DateTime.Property property35 = dateTime6.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime34", (dateTime6.compareTo(dateTime34) == 0) == dateTime6.equals(dateTime34));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.DurationField durationField7 = chronology5.eras();
        org.joda.time.DurationField durationField8 = chronology5.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField7, durationField8, and durationField7", !(durationField7.compareTo(durationField8) == 0) || (Math.signum(durationField7.compareTo(durationField7)) == Math.signum(durationField8.compareTo(durationField7))));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTime(chronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime10 = dateTime3.toDateTime(dateTimeZone9);
        java.util.TimeZone timeZone11 = dateTimeZone9.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime10", (dateTime1.compareTo(dateTime10) == 0) == dateTime1.equals(dateTime10));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime13.getZone();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime13.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField37 = chronology34.eras();
        org.joda.time.DurationField durationField38 = chronology34.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField38, and durationField9", !(durationField9.compareTo(durationField38) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField38.compareTo(durationField9))));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime2.add(readableDuration6, 8);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DurationField durationField19 = chronology15.eras();
        mutableDateTime2.setChronology(chronology15);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField18 and durationField19", Math.signum(durationField18.compareTo(durationField19)) == -Math.signum(durationField19.compareTo(durationField18)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.DurationField durationField29 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfMonth();
        org.joda.time.DurationField durationField31 = durationFieldType18.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        mutableDateTime7.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.property(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        mutableDateTime16.setZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(dateTimeZone19);
        java.lang.String str22 = dateTimeZone19.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and dateTime21", (mutableDateTime2.compareTo(dateTime21) == 0) == mutableDateTime2.equals(dateTime21));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.DurationField durationField10 = chronology6.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField8, durationField10, and durationField8", !(durationField8.compareTo(durationField10) == 0) || (Math.signum(durationField8.compareTo(durationField8)) == Math.signum(durationField10.compareTo(durationField8))));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.DateTime dateTime27 = dateTime17.minusDays((int) (byte) -1);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int32 = localTime28.get(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = localTime28.getChronology();
        org.joda.time.DurationField durationField34 = chronology33.months();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.hourOfHalfday();
        int int38 = dateTimeField35.getDifference((long) 39, (-62166787199903L));
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField35.getType();
        org.joda.time.DurationFieldType durationFieldType40 = dateTimeFieldType39.getDurationType();
        boolean boolean41 = dateTime17.isSupported(dateTimeFieldType39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField34", Math.signum(durationField9.compareTo(durationField34)) == -Math.signum(durationField34.compareTo(durationField9)));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.MutableDateTime mutableDateTime10 = property8.add((long) 1);
        mutableDateTime10.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        mutableDateTime10.add(readablePeriod13);
        org.joda.time.DateTime dateTime15 = mutableDateTime10.toDateTime();
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.weekyear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(42);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        mutableDateTime10.setZone(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime15", (mutableDateTime10.compareTo(dateTime15) == 0) == mutableDateTime10.equals(dateTime15));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.secondOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a', chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        mutableDateTime8.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology12 = null;
        mutableDateTime8.setChronology(chronology12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.weekyear();
        org.joda.time.MutableDateTime mutableDateTime16 = property14.add((long) 1);
        mutableDateTime16.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime16.add(readablePeriod19);
        org.joda.time.DateTime dateTime21 = mutableDateTime16.toDateTime();
        java.util.TimeZone timeZone23 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        mutableDateTime16.setZone(dateTimeZone25);
        mutableDateTime2.setZone(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(dateTimeZone25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime21", (mutableDateTime8.compareTo(dateTime21) == 0) == mutableDateTime8.equals(dateTime21));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime18.getZone();
        int int24 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime14.getZone();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime29 = localTime27.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int31 = localTime27.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = localTime27.getChronology();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology32, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime14.toMutableDateTime(chronology35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(259200097L, chronology35);
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime2 and mutableDateTime13", (mutableDateTime2.compareTo(mutableDateTime13) == 0) == mutableDateTime2.equals(mutableDateTime13));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        java.lang.Object obj11 = dateTimeParserBucket8.saveState();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.secondOfMinute();
        org.joda.time.DurationField durationField14 = chronology12.eras();
        org.joda.time.DurationField durationField15 = chronology12.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField14, durationField15, and durationField14", !(durationField14.compareTo(durationField15) == 0) || (Math.signum(durationField14.compareTo(durationField14)) == Math.signum(durationField15.compareTo(durationField14))));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        mutableDateTime7.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.property(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        mutableDateTime16.setZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(dateTimeZone19);
        int int22 = mutableDateTime2.getYearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime21", (dateTime4.compareTo(dateTime21) == 0) == dateTime4.equals(dateTime21));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.String str18 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter16.withZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone25);
        int int33 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime34 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime36 = dateTime34.withMonthOfYear(2);
        org.joda.time.DateTime dateTime38 = dateTime36.withYear(2139);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime36", (dateTime4.compareTo(dateTime36) == 0) == dateTime4.equals(dateTime36));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        boolean boolean13 = localTime8.equals((java.lang.Object) boolean12);
        boolean boolean14 = property7.equals((java.lang.Object) localTime8);
        org.joda.time.LocalTime localTime16 = localTime8.plusHours(59);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime18 = property17.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.months();
        org.joda.time.DurationField durationField29 = chronology27.days();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.dayOfWeek();
        org.joda.time.DurationField durationField31 = durationFieldType21.getField(chronology27);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime35 = localTime33.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int37 = localTime33.get(dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = localTime33.getChronology();
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology38, locale39);
        org.joda.time.DurationField durationField41 = durationFieldType21.getField(chronology38);
        boolean boolean42 = localTime20.isSupported(durationFieldType21);
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime46 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime48 = localTime46.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int50 = localTime46.get(dateTimeFieldType49);
        org.joda.time.Chronology chronology51 = localTime46.getChronology();
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.now(chronology51);
        org.joda.time.DurationField durationField53 = chronology51.eras();
        mutableDateTime45.setChronology(chronology51);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.MutableDateTime mutableDateTime56 = mutableDateTime45.toMutableDateTime(chronology55);
        org.joda.time.DateTime dateTime57 = mutableDateTime56.toDateTimeISO();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology58);
        org.joda.time.DateTime.Property property60 = dateTime59.yearOfCentury();
        org.joda.time.DateTime dateTime61 = property60.withMinimumValue();
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime65 = dateTime61.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        int int67 = dateTime57.compareTo((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.DateTimeZone dateTimeZone68 = dateTime57.getZone();
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime72 = localTime70.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int74 = localTime70.get(dateTimeFieldType73);
        org.joda.time.Chronology chronology75 = localTime70.getChronology();
        java.util.Locale locale76 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology75, locale76);
        org.joda.time.Chronology chronology78 = dateTimeParserBucket77.getChronology();
        org.joda.time.DateTimeField dateTimeField79 = chronology78.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime80 = dateTime57.toMutableDateTime(chronology78);
        org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime(259200097L, chronology78);
        boolean boolean82 = durationFieldType21.isSupported(chronology78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField53", Math.signum(durationField28.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField28)));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime5.getZone();
        java.lang.String str10 = dateTimeZone8.getNameKey((long) (-1));
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a', chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        mutableDateTime14.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology18 = null;
        mutableDateTime14.setChronology(chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((long) 'a', chronology21);
        mutableDateTime22.addWeekyears((int) (byte) -1);
        int int25 = mutableDateTime22.getDayOfMonth();
        mutableDateTime22.setWeekyear((int) (short) 0);
        boolean boolean28 = mutableDateTime14.isAfter((org.joda.time.ReadableInstant) mutableDateTime22);
        long long29 = mutableDateTime22.getMillis();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.years();
        mutableDateTime22.add(durationFieldType30, 40);
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime35 = localTime33.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int37 = localTime33.get(dateTimeFieldType36);
        org.joda.time.Chronology chronology38 = localTime33.getChronology();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.now(chronology38);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology38);
        org.joda.time.DurationField durationField41 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField43 = durationFieldType30.getField(chronology38);
        org.joda.time.LocalDate localDate45 = localDate11.withFieldAdded(durationFieldType30, 40043431);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField41 and durationField43", (durationField41.compareTo(durationField43) == 0) == durationField41.equals(durationField43));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime15 = localTime12.withFieldAdded(durationFieldType13, 100);
        int[] intArray16 = localTime12.getValues();
        org.joda.time.LocalTime.Property property17 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime19 = property17.addCopy((-1));
        long long21 = chronology5.set((org.joda.time.ReadablePartial) localTime19, 83155380L);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DurationField durationField23 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField23, durationField6, and durationField7", !(durationField23.compareTo(durationField6) == 0) || (Math.signum(durationField23.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.secondOfDay();
        org.joda.time.DurationField durationField12 = chronology10.halfdays();
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime((long) '#', chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = chronology10.era();
        org.joda.time.DurationField durationField16 = chronology10.months();
        org.joda.time.Chronology chronology17 = chronology10.withUTC();
        org.joda.time.DurationField durationField18 = chronology10.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField12, and durationField16", !(durationField18.compareTo(durationField12) == 0) || (Math.signum(durationField18.compareTo(durationField16)) == Math.signum(durationField12.compareTo(durationField16))));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime13.getZone();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime36 = dateTime13.toMutableDateTime(chronology34);
        org.joda.time.DurationField durationField37 = chronology34.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField37, and durationField9", !(durationField9.compareTo(durationField37) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField37.compareTo(durationField9))));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.lang.String str9 = dateTimeField6.getAsText(100L, locale8);
        boolean boolean11 = dateTimeField6.isLeap((long) 54345623);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, (int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localTime14.getFieldType(1);
        org.joda.time.LocalTime localTime21 = localTime14.minusMillis(70);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int29 = localTime25.get(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = localTime25.getChronology();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.now(chronology30);
        org.joda.time.DurationField durationField32 = chronology30.eras();
        mutableDateTime24.setChronology(chronology30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = mutableDateTime24.toMutableDateTime(chronology34);
        org.joda.time.DateTime dateTime36 = mutableDateTime35.toDateTimeISO();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.DateTime.Property property39 = dateTime38.yearOfCentury();
        org.joda.time.DateTime dateTime40 = property39.withMinimumValue();
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime44 = dateTime40.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone45 = dateTime40.getZone();
        int int46 = dateTime36.compareTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTime36.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone47);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime53 = localTime51.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int55 = localTime51.get(dateTimeFieldType54);
        org.joda.time.Chronology chronology56 = localTime51.getChronology();
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology56, locale57);
        org.joda.time.Chronology chronology59 = dateTimeParserBucket58.getChronology();
        java.util.Locale locale60 = dateTimeParserBucket58.getLocale();
        java.lang.String str61 = locale60.getDisplayName();
        java.lang.String str62 = dateTimeZone47.getName((long) 2067, locale60);
        java.lang.String str63 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localTime21, 107, locale60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField5 and durationField32", Math.signum(durationField5.compareTo(durationField32)) == -Math.signum(durationField32.compareTo(durationField5)));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str17 = dateTimeZone15.getName((long) 54);
        java.lang.String str19 = dateTimeZone15.getShortName(26265600000L);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime22 = dateTime11.plusMinutes(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.millis();
        org.joda.time.DurationField durationField7 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.millisOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField7", Math.signum(durationField6.compareTo(durationField7)) == -Math.signum(durationField7.compareTo(durationField6)));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.DurationField durationField9 = chronology5.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology5.era();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = chronology5.add(readablePeriod7, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField11 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField12 = chronology5.dayOfYear();
        org.joda.time.DurationField durationField13 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology5.clockhourOfHalfday();
        org.joda.time.DurationField durationField15 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField15, durationField11, and durationField13", !(durationField15.compareTo(durationField11) == 0) || (Math.signum(durationField15.compareTo(durationField13)) == Math.signum(durationField11.compareTo(durationField13))));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime4.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime8.withWeekyear((int) (short) 0);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.DateTimeField dateTimeField21 = chronology18.year();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        long long25 = dateTimeZone22.getMillisKeepLocal(dateTimeZone23, (long) '#');
        java.lang.String str26 = dateTimeZone23.getID();
        int int28 = dateTimeZone23.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology29 = chronology18.withZone(dateTimeZone23);
        org.joda.time.DurationField durationField30 = chronology29.centuries();
        org.joda.time.DateTime dateTime31 = dateTime8.toDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology29);
        org.joda.time.DurationField durationField33 = chronology29.eras();
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.util.Locale locale35 = locale34.stripExtensions();
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.util.Locale locale38 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((long) 'a', chronology40);
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime43 = property42.roundHalfEven();
        java.util.Locale locale45 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime46 = property42.set("22", locale45);
        java.lang.String str47 = locale38.getDisplayScript(locale45);
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        java.lang.String str49 = locale45.getDisplayLanguage(locale48);
        java.lang.String str50 = locale35.getDisplayCountry(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 55, chronology29, locale45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField30 and durationField33", Math.signum(durationField30.compareTo(durationField33)) == -Math.signum(durationField33.compareTo(durationField30)));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTime dateTime7 = property4.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(53);
        org.joda.time.DateTime dateTime11 = dateTime9.plusMonths(83155380);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMinutes(47);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) 'a', chronology15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.yearOfCentury();
        mutableDateTime16.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology20 = null;
        mutableDateTime16.setChronology(chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a', chronology23);
        mutableDateTime24.addWeekyears((int) (byte) -1);
        int int27 = mutableDateTime24.getDayOfMonth();
        mutableDateTime24.setWeekyear((int) (short) 0);
        boolean boolean30 = mutableDateTime16.isAfter((org.joda.time.ReadableInstant) mutableDateTime24);
        long long31 = mutableDateTime24.getMillis();
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.years();
        mutableDateTime24.add(durationFieldType32, 40);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime38 = localTime36.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int40 = localTime36.get(dateTimeFieldType39);
        org.joda.time.Chronology chronology41 = localTime36.getChronology();
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology41, locale42);
        org.joda.time.DateTimeField dateTimeField44 = chronology41.year();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        long long48 = dateTimeZone45.getMillisKeepLocal(dateTimeZone46, (long) '#');
        java.lang.String str49 = dateTimeZone46.getID();
        int int51 = dateTimeZone46.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology52 = chronology41.withZone(dateTimeZone46);
        org.joda.time.DurationField durationField53 = durationFieldType32.getField(chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.era();
        org.joda.time.DateTime dateTime55 = dateTime11.toDateTime(chronology52);
        org.joda.time.DurationField durationField56 = chronology52.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField56, durationField5, and durationField53", !(durationField56.compareTo(durationField5) == 0) || (Math.signum(durationField56.compareTo(durationField53)) == Math.signum(durationField5.compareTo(durationField53))));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = dateTimeField3.getType();
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int12 = localTime8.get(dateTimeFieldType11);
        org.joda.time.Chronology chronology13 = localTime8.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.DurationField durationField15 = chronology13.eras();
        mutableDateTime7.setChronology(chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology13);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime22 = localTime20.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int24 = localTime20.get(dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = localTime20.getChronology();
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology25, locale26);
        long long29 = dateTimeParserBucket27.computeMillis(false);
        dateTimeParserBucket27.setOffset(54345623);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime34 = localTime32.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int36 = localTime32.get(dateTimeFieldType35);
        org.joda.time.Chronology chronology37 = localTime32.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.months();
        org.joda.time.DurationField durationField39 = chronology37.days();
        org.joda.time.DateTimeField dateTimeField40 = chronology37.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.secondOfDay();
        dateTimeParserBucket27.saveField(dateTimeField42, 75600);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.MutableDateTime mutableDateTime49 = new org.joda.time.MutableDateTime((long) 'a', chronology48);
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime51 = property50.roundHalfEven();
        java.util.Locale locale53 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime54 = property50.set("22", locale53);
        mutableDateTime54.addYears(10);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfCentury();
        org.joda.time.DateTime dateTime60 = property59.withMinimumValue();
        org.joda.time.DateTime dateTime62 = dateTime60.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime64 = dateTime60.plusMillis(1);
        mutableDateTime54.setDate((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        mutableDateTime54.add(readablePeriod66, (int) (short) 0);
        org.joda.time.Chronology chronology69 = mutableDateTime54.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = chronology69.dayOfYear();
        java.util.Locale.Builder builder71 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder74 = builder71.setExtension('a', "");
        java.util.Locale.Builder builder75 = builder71.clear();
        java.util.Locale locale76 = builder71.build();
        java.lang.String str77 = locale76.getScript();
        int int78 = dateTimeField70.getMaximumShortTextLength(locale76);
        java.lang.String str79 = locale76.getDisplayVariant();
        dateTimeParserBucket27.saveField(dateTimeFieldType45, "0001-01-03T23:59:59.001", locale76);
        java.lang.String str81 = dateTimeField3.getAsText((org.joda.time.ReadablePartial) localTime17, locale76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField15 and durationField38", Math.signum(durationField15.compareTo(durationField38)) == -Math.signum(durationField38.compareTo(durationField15)));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        org.joda.time.DurationField durationField13 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property5 = localDate2.era();
        org.joda.time.LocalDate localDate6 = property5.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate7 = property5.withMaximumValue();
        int int8 = localDate7.size();
        org.joda.time.LocalDate.Property property9 = localDate7.weekyear();
        java.lang.String str11 = localDate7.toString("45");
        org.joda.time.DateTime dateTime12 = localDate7.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property13 = localDate7.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.getMillisKeepLocal(dateTimeZone15, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(dateTimeZone15);
        boolean boolean19 = dateTimeZone15.isFixed();
        long long21 = dateTimeZone15.previousTransition((long) '4');
        org.joda.time.DateTime dateTime22 = localDate7.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.LocalDate localDate24 = localDate7.plusDays(54345623);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime27.add(readableDuration28, 21);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime27.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = property31.set((int) (byte) 100);
        java.util.TimeZone timeZone35 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        long long40 = dateTimeZone37.adjustOffset((-62166787199903L), false);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(dateTimeZone37);
        mutableDateTime33.setZoneRetainFields(dateTimeZone37);
        org.joda.time.Interval interval43 = localDate7.toInterval(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate7.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.LocalDate localDate47 = localDate7.withYearOfCentury(0);
        org.joda.time.LocalDate.Property property48 = localDate47.dayOfWeek();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and dateTime45", (mutableDateTime18.compareTo(dateTime45) == 0) == mutableDateTime18.equals(dateTime45));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        boolean boolean21 = dateTimeField17.isSupported();
        dateTimeParserBucket8.saveField(dateTimeField17, (int) (short) 100);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        org.joda.time.DateTime dateTime29 = dateTime27.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime31 = dateTime27.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property32 = dateTime31.dayOfMonth();
        org.joda.time.DateTime dateTime33 = property32.withMaximumValue();
        java.lang.String str34 = property32.toString();
        org.joda.time.DateTime dateTime35 = property32.roundCeilingCopy();
        org.joda.time.DateTime dateTime37 = dateTime35.minus((long) 17268551);
        java.lang.Object obj38 = null;
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime41 = localTime39.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int43 = localTime39.get(dateTimeFieldType42);
        org.joda.time.Chronology chronology44 = localTime39.getChronology();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.now(chronology44);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        long long49 = chronology44.add(readablePeriod46, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(obj38, chronology44);
        org.joda.time.DateTimeZone dateTimeZone51 = chronology44.getZone();
        org.joda.time.DateTime dateTime52 = dateTime35.withZone(dateTimeZone51);
        int int54 = dateTimeZone51.getOffset((long) (short) -1);
        dateTimeParserBucket8.setZone(dateTimeZone51);
        org.joda.time.MutableDateTime mutableDateTime57 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime60 = localTime58.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int62 = localTime58.get(dateTimeFieldType61);
        org.joda.time.Chronology chronology63 = localTime58.getChronology();
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.now(chronology63);
        org.joda.time.DurationField durationField65 = chronology63.eras();
        mutableDateTime57.setChronology(chronology63);
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime57.toMutableDateTime(chronology67);
        org.joda.time.DateTime dateTime69 = mutableDateTime68.toDateTimeISO();
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(chronology70);
        org.joda.time.DateTime.Property property72 = dateTime71.yearOfCentury();
        org.joda.time.DateTime dateTime73 = property72.withMinimumValue();
        org.joda.time.DateTime dateTime75 = dateTime73.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime77 = dateTime73.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone78 = dateTime73.getZone();
        int int79 = dateTime69.compareTo((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime81 = dateTime73.minusYears(59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter82 = org.joda.time.format.DateTimeFormat.longDateTime();
        boolean boolean83 = dateTimeFormatter82.isPrinter();
        java.lang.String str84 = dateTime81.toString(dateTimeFormatter82);
        org.joda.time.DateTime.Property property85 = dateTime81.millisOfDay();
        boolean boolean86 = dateTimeParserBucket8.restoreState((java.lang.Object) dateTime81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField65", Math.signum(durationField16.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField16)));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(10);
        int int5 = localDateTime1.getWeekyear();
        org.joda.time.Chronology chronology6 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1940L, chronology6);
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.minuteOfHour();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int10 = localTime6.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = localTime6.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.eras();
        mutableDateTime5.setChronology(chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime5.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime21.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime21.getZone();
        int int27 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime17.getZone();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime32 = localTime30.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int34 = localTime30.get(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localTime30.getChronology();
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology35, locale36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime17.toMutableDateTime(chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter3.withChronology(chronology38);
        org.joda.time.DurationField durationField42 = chronology38.centuries();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField13, durationField42, and durationField13", !(durationField13.compareTo(durationField42) == 0) || (Math.signum(durationField13.compareTo(durationField13)) == Math.signum(durationField42.compareTo(durationField13))));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.String str18 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter16.withZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone25);
        int int33 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime34 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.DateTime dateTime36 = dateTime34.withMonthOfYear(2);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readablePeriod37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime38", (dateTime4.compareTo(dateTime38) == 0) == dateTime4.equals(dateTime38));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DurationField durationField40 = chronology38.eras();
        org.joda.time.DurationField durationField41 = chronology38.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField40", Math.signum(durationField39.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField39)));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        mutableDateTime4.setDate((long) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        mutableDateTime4.add(readablePeriod7, 9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        mutableDateTime17.addYears(10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime23 = property22.withMinimumValue();
        org.joda.time.DateTime dateTime25 = dateTime23.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime27 = dateTime23.plusMillis(1);
        mutableDateTime17.setDate((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        mutableDateTime17.add(readablePeriod29, (int) (short) 0);
        org.joda.time.Chronology chronology32 = mutableDateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfYear();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long38 = dateTimeZone35.getMillisKeepLocal(dateTimeZone36, (long) '#');
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.now(dateTimeZone36);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((java.lang.Object) dateTime34, dateTimeZone36);
        boolean boolean41 = mutableDateTime4.equals((java.lang.Object) dateTime34);
        org.joda.time.DateTime dateTime42 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(chronology44);
        org.joda.time.DateTime.Property property46 = dateTime45.yearOfCentury();
        org.joda.time.DateTime dateTime48 = dateTime45.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime50 = dateTime45.toMutableDateTime(dateTimeZone49);
        long long53 = dateTimeZone49.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) 'a', dateTimeZone49);
        org.joda.time.DateTime dateTime55 = dateTime54.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str60 = dateTimeZone58.getName((long) 54);
        java.lang.String str62 = dateTimeZone58.getShortName(26265600000L);
        org.joda.time.DateTime dateTime63 = dateTime54.toDateTime(dateTimeZone58);
        org.joda.time.DateTime dateTime64 = dateTime34.toDateTime(dateTimeZone58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime54 and dateTime63", (dateTime54.compareTo(dateTime63) == 0) == dateTime54.equals(dateTime63));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        mutableDateTime7.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.property(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        mutableDateTime16.setZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(dateTimeZone19);
        java.lang.Object obj22 = mutableDateTime2.clone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime21", (dateTime4.compareTo(dateTime21) == 0) == dateTime4.equals(dateTime21));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTime dateTime7 = property5.addToCopy((int) (short) 10);
        int int8 = property5.get();
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int15 = localTime11.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.DurationField durationField18 = chronology16.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter10.withChronology(chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter19.withPivotYear(16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter21.withOffsetParsed();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) ' ');
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfMonth(21);
        org.joda.time.DateTime dateTime31 = dateTime27.minusSeconds((int) (short) 100);
        java.lang.String str32 = dateTimeFormatter22.print((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.Chronology chronology33 = dateTimeFormatter22.getChronolgy();
        org.joda.time.DateTime dateTime34 = dateTime9.withChronology(chronology33);
        org.joda.time.DurationField durationField35 = chronology33.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField18, durationField35, and durationField18", !(durationField18.compareTo(durationField35) == 0) || (Math.signum(durationField18.compareTo(durationField18)) == Math.signum(durationField35.compareTo(durationField18))));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate localDate8 = localDate6.minusYears((int) (byte) -1);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.eras();
        org.joda.time.DurationField durationField11 = chronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField11, and durationField10", !(durationField10.compareTo(durationField11) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField11.compareTo(durationField10))));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DurationField durationField40 = chronology38.eras();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField40", Math.signum(durationField39.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField39)));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime18.getZone();
        int int24 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime14.getZone();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime29 = localTime27.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int31 = localTime27.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = localTime27.getChronology();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology32, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime14.toMutableDateTime(chronology35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(259200097L, chronology35);
        org.joda.time.DurationField durationField39 = chronology35.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField39, and durationField10", !(durationField10.compareTo(durationField39) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField39.compareTo(durationField10))));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.DateTime dateTime15 = dateTime13.plusMinutes((-292275054));
        org.joda.time.DateTime dateTime17 = dateTime15.withYear(54391465);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime18.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.months();
        org.joda.time.DurationField durationField25 = chronology23.days();
        org.joda.time.DateTime dateTime26 = dateTime17.toDateTime(chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField24", Math.signum(durationField9.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField9)));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfEven();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime12 = property8.set("22", locale11);
        mutableDateTime12.addYears(10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(1);
        mutableDateTime12.setDate((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime22.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime25.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks(2);
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.util.Calendar calendar30 = dateTime28.toCalendar(locale29);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) dateTime28);
        java.util.Locale locale32 = null;
        java.util.Calendar calendar33 = dateTime28.toCalendar(locale32);
        org.joda.time.DateTime dateTime35 = dateTime28.plusDays(34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on calendar30 and calendar33", (calendar30.compareTo(calendar33) == 0) == calendar30.equals(calendar33));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(10);
        int int5 = localDateTime1.getWeekyear();
        org.joda.time.Chronology chronology6 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1940L, chronology6);
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekOfWeekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "seconds", "Thursday" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.util.List<java.lang.String> strList8 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "1970-01-01T00:00:00.000Z", "12:00 AM" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        java.util.stream.Stream<java.lang.String> strStream15 = strList13.parallelStream();
        java.lang.String str16 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList13);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap17 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList18 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap17);
        org.joda.time.tz.NameProvider nameProvider19 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale20 = java.util.Locale.CANADA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Locale locale22 = java.util.Locale.ROOT;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale21.getDisplayName();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 'a', chronology26);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime32 = property28.set("22", locale31);
        java.lang.String str33 = locale21.getDisplayScript(locale31);
        java.lang.String str36 = nameProvider19.getName(locale31, "Canada", "2022-02-21T15:05:41.396Z");
        java.util.Set<java.lang.String> strSet37 = locale31.getUnicodeLocaleAttributes();
        strSet37.clear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale40 = dateTimeFormatter39.getLocale();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        org.joda.time.DateTime.Property property43 = dateTime42.yearOfCentury();
        org.joda.time.DateTime dateTime45 = dateTime42.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime42.toMutableDateTime(dateTimeZone46);
        int int50 = dateTimeFormatter39.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime47, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime54 = localTime52.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int56 = localTime52.get(dateTimeFieldType55);
        org.joda.time.Chronology chronology57 = localTime52.getChronology();
        java.util.Locale locale58 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology57, locale58);
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime47.toMutableDateTime(chronology57);
        boolean boolean61 = strSet37.equals((java.lang.Object) chronology57);
        java.lang.String str62 = java.util.Locale.lookupTag(languageRangeList18, (java.util.Collection<java.lang.String>) strSet37);
        java.util.Locale locale63 = java.util.Locale.KOREA;
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.util.Set<java.lang.Character> charSet65 = locale63.getExtensionKeys();
        java.util.Set<java.lang.String> strSet66 = locale63.getUnicodeLocaleKeys();
        java.lang.Object[] objArray67 = strSet66.toArray();
        java.util.stream.Stream<java.lang.String> strStream68 = strSet66.stream();
        boolean boolean69 = strSet37.retainAll((java.util.Collection<java.lang.String>) strSet66);
        java.util.Iterator<java.lang.String> strItor70 = strSet66.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime42 and mutableDateTime47", (dateTime42.compareTo(mutableDateTime47) == 0) == dateTime42.equals(mutableDateTime47));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        mutableDateTime10.setSecondOfDay(22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 'a', chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfCentury();
        mutableDateTime25.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology29 = null;
        mutableDateTime25.setChronology(chronology29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 'a', chronology32);
        mutableDateTime33.addWeekyears((int) (byte) -1);
        int int36 = mutableDateTime33.getDayOfMonth();
        mutableDateTime33.setWeekyear((int) (short) 0);
        boolean boolean39 = mutableDateTime25.isAfter((org.joda.time.ReadableInstant) mutableDateTime33);
        long long40 = mutableDateTime33.getMillis();
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime33.add(readableDuration41);
        mutableDateTime10.setDate((org.joda.time.ReadableInstant) mutableDateTime33);
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime47 = localTime45.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int49 = localTime45.get(dateTimeFieldType48);
        org.joda.time.Chronology chronology50 = localTime45.getChronology();
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology50, locale51);
        org.joda.time.DurationField durationField53 = chronology50.minutes();
        org.joda.time.MutableDateTime mutableDateTime54 = org.joda.time.MutableDateTime.now(chronology50);
        mutableDateTime10.setChronology(chronology50);
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime60 = localTime57.withField(dateTimeFieldType58, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology62 = dateTimeFormatter61.getChronolgy();
        java.lang.String str63 = localTime60.toString(dateTimeFormatter61);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateTime dateTime66 = new org.joda.time.DateTime(chronology65);
        org.joda.time.DateTime.Property property67 = dateTime66.yearOfCentury();
        org.joda.time.DateTime dateTime69 = dateTime66.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime71 = dateTime66.toMutableDateTime(dateTimeZone70);
        long long74 = dateTimeZone70.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 'a', dateTimeZone70);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter61.withZone(dateTimeZone70);
        org.joda.time.MutableDateTime mutableDateTime77 = new org.joda.time.MutableDateTime(dateTimeZone70);
        long long80 = dateTimeZone70.adjustOffset(5L, true);
        org.joda.time.DateTime dateTime81 = mutableDateTime10.toDateTime(dateTimeZone70);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime54 and dateTime66", (mutableDateTime54.compareTo(dateTime66) == 0) == mutableDateTime54.equals(dateTime66));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withDayOfMonth(8);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMillis(21);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDate12.getFieldType(0);
        org.joda.time.DateTime dateTime15 = localDate12.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate17 = localDate12.plusMonths(1);
        org.joda.time.LocalDate localDate19 = localDate12.minusWeeks(100);
        org.joda.time.Chronology chronology20 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime9.toMutableDateTime(chronology20);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.plus(readablePeriod25);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        org.joda.time.DurationField durationField28 = property27.getDurationField();
        org.joda.time.DateTime dateTime30 = property27.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime32 = dateTime30.plusWeeks(53);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a', chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfEven();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime40 = property36.set("22", locale39);
        mutableDateTime40.addYears(10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.DateTime dateTime46 = property45.withMinimumValue();
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime50 = dateTime46.plusMillis(1);
        mutableDateTime40.setDate((org.joda.time.ReadableInstant) dateTime50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        mutableDateTime40.add(readablePeriod52, (int) (short) 0);
        org.joda.time.Chronology chronology55 = mutableDateTime40.getChronology();
        long long56 = mutableDateTime40.getMillis();
        org.joda.time.Instant instant57 = mutableDateTime40.toInstant();
        int int58 = dateTime32.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.Instant instant59 = mutableDateTime40.toInstant();
        boolean boolean60 = dateTime9.equals((java.lang.Object) mutableDateTime40);
        org.joda.time.DateTime.Property property61 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime63 = property61.setCopy(54359);
        org.joda.time.DateTime dateTime65 = dateTime63.plusHours(54345623);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and mutableDateTime22", (dateTime9.compareTo(mutableDateTime22) == 0) == dateTime9.equals(mutableDateTime22));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.months();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = chronology6.add(readablePeriod9, 1L, 2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter13.withOffsetParsed();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.withField(dateTimeFieldType19, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology23 = dateTimeFormatter22.getChronolgy();
        java.lang.String str24 = localTime21.toString(dateTimeFormatter22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        long long35 = dateTimeZone31.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 'a', dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter22.withZone(dateTimeZone31);
        java.lang.String str39 = dateTimeZone31.getShortName((long) 54348);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter13.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology41 = chronology6.withZone(dateTimeZone31);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime44 = localTime42.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int46 = localTime42.get(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = localTime42.getChronology();
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology47.add(readablePeriod49, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField53 = chronology47.minutes();
        org.joda.time.DateTimeField dateTimeField54 = chronology47.dayOfYear();
        java.util.Locale locale57 = new java.util.Locale("+00:00");
        java.lang.String str58 = dateTimeField54.getAsShortText(0L, locale57);
        java.lang.String str59 = locale57.getDisplayCountry();
        java.lang.String str60 = locale57.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 39989669, chronology6, locale57, (java.lang.Integer) 2922789);
        dateTimeParserBucket62.setOffset((java.lang.Integer) 442);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime32", (dateTime27.compareTo(mutableDateTime32) == 0) == dateTime27.equals(mutableDateTime32));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        boolean boolean11 = localTime9.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology14);
        org.joda.time.DateTime dateTime16 = dateTime5.toDateTimeISO();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 'a', chronology18);
        mutableDateTime19.addWeekyears((int) (byte) -1);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((long) 'a', chronology23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime24.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime27.property(dateTimeFieldType28);
        mutableDateTime19.set(dateTimeFieldType28, (int) ' ');
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime36 = localTime33.withField(dateTimeFieldType34, (int) '#');
        java.util.TimeZone timeZone38 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTime dateTime41 = localTime33.toDateTimeToday(dateTimeZone40);
        java.util.Locale locale43 = java.util.Locale.CHINESE;
        java.lang.String str44 = dateTimeZone40.getName((long) 7, locale43);
        mutableDateTime19.setZoneRetainFields(dateTimeZone40);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int51 = localTime47.get(dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = localTime47.getChronology();
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology52, locale53);
        long long56 = dateTimeParserBucket54.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone57 = dateTimeParserBucket54.getZone();
        long long59 = dateTimeZone40.getMillisKeepLocal(dateTimeZone57, (long) 25);
        java.lang.String str60 = dateTimeZone40.toString();
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime16, dateTimeZone40);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and mutableDateTime15", (dateTime16.compareTo(mutableDateTime15) == 0) == dateTime16.equals(mutableDateTime15));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime13.plusSeconds(44);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.getMillisKeepLocal(dateTimeZone29, (long) '#');
        java.util.TimeZone timeZone32 = dateTimeZone28.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(46L, dateTimeZone33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(4460746081L, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime13.withZoneRetainFields(dateTimeZone33);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(chronology37);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.DateTime dateTime40 = dateTime38.plus(readablePeriod39);
        org.joda.time.DateTime.Property property41 = dateTime40.millisOfDay();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 'a', chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfEven();
        long long47 = mutableDateTime46.getMillis();
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime46.add(readableDuration48, 39);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime46.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime46.copy();
        int int53 = property41.compareTo((org.joda.time.ReadableInstant) mutableDateTime46);
        boolean boolean54 = dateTimeZone33.equals((java.lang.Object) int53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime1.toMutableDateTime(dateTimeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = org.joda.time.MutableDateTime.now(dateTimeZone5);
        int int8 = mutableDateTime7.getDayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime6", (dateTime1.compareTo(mutableDateTime6) == 0) == dateTime1.equals(mutableDateTime6));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendFractionOfSecond(59, 0);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime19 = localTime16.withField(dateTimeFieldType17, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronolgy();
        java.lang.String str22 = localTime19.toString(dateTimeFormatter20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime25.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime25.toMutableDateTime(dateTimeZone29);
        long long33 = dateTimeZone29.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 'a', dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter20.withZone(dateTimeZone29);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter20.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder9.append(dateTimePrinter36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendSecondOfMinute(25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder39.appendLiteral('x');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder39.appendMinuteOfHour(54482775);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime30", (dateTime25.compareTo(mutableDateTime30) == 0) == dateTime25.equals(mutableDateTime30));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        java.lang.Object[] objArray2 = strSet1.toArray();
        java.lang.String[] strArray39 = new java.lang.String[] { "\ufffd\ufffd\ufffd\ufffd 12:00 AM", "UTC", "0", "1/1/32 12:00 AM", "12:00 AM", "English (Canada)", "DateTimeField[millisOfDay]", "0001-01-03T23:59:59.001", "12:00:00 AM +00:00", "en", "22", "secondOfDay", "2022-02-21T15:05:40.918", "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", "0001-01-03T23:59:59.001", "Thursday", "secondOfDay", "1/1/32 12:00 AM", "\ud55c\uad6d\uc5b4", "4", "en_CA", "DateTimeField[millisOfDay]", "en_CA", "Jan", "Dec 29, 1969", "", "12:00 AM", "2022-02-21T15:05:37.737Z", "0", "English (Canada)", "100", "secondOfDay", "100", "Property[dayOfMonth]", "4", "1/1/70 12:00 AM" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        java.lang.Object obj42 = null;
        boolean boolean43 = strSet40.remove(obj42);
        java.lang.Throwable throwable46 = null;
        java.io.IOException iOException47 = new java.io.IOException("22", throwable46);
        java.io.IOException iOException48 = new java.io.IOException("English (Canada)", (java.lang.Throwable) iOException47);
        java.lang.Throwable[] throwableArray49 = iOException47.getSuppressed();
        boolean boolean50 = strSet40.remove((java.lang.Object) iOException47);
        boolean boolean51 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet40);
        java.util.Locale locale52 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(chronology54);
        boolean boolean56 = strSet53.remove((java.lang.Object) mutableDateTime55);
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder60 = builder57.setExtension('a', "");
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder64 = builder61.setExtension('a', "");
        java.util.Locale.Builder builder65 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray66 = new java.util.Locale.Builder[] { builder57, builder64, builder65 };
        java.util.Locale.Builder[] builderArray67 = strSet53.toArray(builderArray66);
        boolean boolean68 = strSet53.isEmpty();
        boolean boolean69 = strSet1.containsAll((java.util.Collection<java.lang.String>) strSet53);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.MutableDateTime mutableDateTime72 = new org.joda.time.MutableDateTime((long) 'a', chronology71);
        org.joda.time.MutableDateTime.Property property73 = mutableDateTime72.yearOfCentury();
        mutableDateTime72.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology76 = null;
        mutableDateTime72.setChronology(chronology76);
        org.joda.time.MutableDateTime.Property property78 = mutableDateTime72.weekyear();
        org.joda.time.MutableDateTime mutableDateTime80 = property78.add((long) 1);
        mutableDateTime80.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        mutableDateTime80.add(readablePeriod83);
        org.joda.time.DateTime dateTime85 = mutableDateTime80.toDateTime();
        java.util.TimeZone timeZone87 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone88 = org.joda.time.DateTimeZone.forTimeZone(timeZone87);
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forTimeZone(timeZone87);
        mutableDateTime80.setZone(dateTimeZone89);
        boolean boolean91 = strSet1.remove((java.lang.Object) dateTimeZone89);
        long long94 = dateTimeZone89.adjustOffset(0L, true);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime72 and dateTime85", (mutableDateTime72.compareTo(dateTime85) == 0) == mutableDateTime72.equals(dateTime85));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(false);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        boolean boolean21 = dateTimeField17.isSupported();
        dateTimeParserBucket8.saveField(dateTimeField17, (int) (short) 100);
        dateTimeParserBucket8.setOffset(52);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a', chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfCentury();
        mutableDateTime28.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology32 = null;
        mutableDateTime28.setChronology(chronology32);
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime28.weekyear();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime28);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalTime localTime38 = localTime35.withPeriodAdded(readablePeriod36, 57);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.DateTime dateTime43 = dateTime40.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime40.toMutableDateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localTime38.toDateTimeToday(dateTimeZone44);
        dateTimeParserBucket8.setZone(dateTimeZone44);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime40 and mutableDateTime45", (dateTime40.compareTo(mutableDateTime45) == 0) == dateTime40.equals(mutableDateTime45));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.hourOfDay();
        int int4 = localDateTime2.getWeekOfWeekyear();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        long long9 = dateTimeZone7.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        int int12 = localDateTime11.getWeekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDurationAdded(readableDuration13, 36130021);
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = dateTime18.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime18.getZone();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.DateTime dateTime27 = dateTime18.withDurationAdded(readableDuration25, 54359);
        org.joda.time.DateTime dateTime29 = dateTime18.minusDays(411);
        org.joda.time.DateTime dateTime30 = localDateTime15.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime32 = dateTime18.withWeekyear(86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime23 and dateTime18", (mutableDateTime23.compareTo(dateTime18) == 0) == mutableDateTime23.equals(dateTime18));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.DateTime.Property property5 = dateTime4.weekOfWeekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime9 = dateTime7.plus(readablePeriod8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(909);
        org.joda.time.DateTime dateTime13 = dateTime11.plusMillis(100);
        org.joda.time.DateTime.Property property14 = dateTime11.yearOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.yearOfCentury();
        mutableDateTime17.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology21 = null;
        mutableDateTime17.setChronology(chronology21);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 'a', chronology24);
        mutableDateTime25.addWeekyears((int) (byte) -1);
        int int28 = mutableDateTime25.getDayOfMonth();
        mutableDateTime25.setWeekyear((int) (short) 0);
        boolean boolean31 = mutableDateTime17.isAfter((org.joda.time.ReadableInstant) mutableDateTime25);
        long long32 = mutableDateTime25.getMillis();
        org.joda.time.DurationFieldType durationFieldType33 = org.joda.time.DurationFieldType.years();
        mutableDateTime25.add(durationFieldType33, 40);
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime39 = localTime37.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int41 = localTime37.get(dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = localTime37.getChronology();
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology42, locale43);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.year();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        long long49 = dateTimeZone46.getMillisKeepLocal(dateTimeZone47, (long) '#');
        java.lang.String str50 = dateTimeZone47.getID();
        int int52 = dateTimeZone47.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology53 = chronology42.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField54 = durationFieldType33.getField(chronology53);
        org.joda.time.DateTimeField dateTimeField55 = chronology53.millisOfSecond();
        org.joda.time.DurationField durationField56 = chronology53.years();
        org.joda.time.DurationField durationField57 = chronology53.years();
        org.joda.time.DateTimeField dateTimeField58 = chronology53.dayOfMonth();
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(chronology53);
        org.joda.time.DurationField durationField60 = chronology53.days();
        org.joda.time.DateTime dateTime61 = dateTime11.withChronology(chronology53);
        org.joda.time.DateTime dateTime62 = dateTime4.withChronology(chronology53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and dateTime59", (dateTime7.compareTo(dateTime59) == 0) == dateTime7.equals(dateTime59));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.DateTime dateTime27 = dateTime17.plusHours((-54353560));
        java.util.GregorianCalendar gregorianCalendar28 = dateTime17.toGregorianCalendar();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime17.minus(readablePeriod29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear(54371);
        org.joda.time.DateTime dateTime34 = dateTime32.plusMonths(14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 57);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime14.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localTime12.toDateTimeToday(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology23);
        boolean boolean26 = localTime24.equals((java.lang.Object) 10L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime33 = localTime30.withFieldAdded(durationFieldType31, 100);
        org.joda.time.LocalTime localTime35 = localTime33.withMillisOfDay(21);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        long long39 = dateTimeZone36.getMillisKeepLocal(dateTimeZone37, (long) '#');
        java.lang.String str40 = dateTimeZone37.getID();
        org.joda.time.DateTime dateTime41 = localTime35.toDateTimeToday(dateTimeZone37);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((long) 20, dateTimeZone37);
        long long46 = dateTimeZone37.convertLocalToUTC((long) 33, true, (long) 54);
        org.joda.time.DateTime dateTime47 = localTime24.toDateTimeToday(dateTimeZone37);
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.now(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime49 = mutableDateTime21.toMutableDateTime(dateTimeZone37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime19", (dateTime14.compareTo(mutableDateTime19) == 0) == dateTime14.equals(mutableDateTime19));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime8 = dateTime4.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property9 = dateTime8.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = property9.toString();
        org.joda.time.DateTime dateTime12 = property9.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = dateTime12.minus((long) 17268551);
        java.lang.Object obj15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = chronology21.add(readablePeriod23, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(obj15, chronology21);
        org.joda.time.DateTimeZone dateTimeZone28 = chronology21.getZone();
        org.joda.time.DateTime dateTime29 = dateTime12.withZone(dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekyear(0);
        org.joda.time.DateTime.Property property32 = dateTime29.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int38 = localTime34.get(dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = localTime34.getChronology();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(chronology39);
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(chronology39);
        int int42 = mutableDateTime41.getSecondOfMinute();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean46 = localTime44.isSupported(dateTimeFieldType45);
        org.joda.time.MutableDateTime.Property property47 = mutableDateTime41.property(dateTimeFieldType45);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime51 = localTime49.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int53 = localTime49.get(dateTimeFieldType52);
        org.joda.time.Chronology chronology54 = localTime49.getChronology();
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology54, locale55);
        mutableDateTime41.setChronology(chronology54);
        org.joda.time.MutableDateTime mutableDateTime58 = org.joda.time.MutableDateTime.now(chronology54);
        org.joda.time.DateTimeField dateTimeField59 = chronology54.yearOfCentury();
        boolean boolean60 = dateTimeFieldType33.isSupported(chronology54);
        org.joda.time.DateTimeField dateTimeField61 = chronology54.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField62 = chronology54.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime29.toMutableDateTime(chronology54);
        org.joda.time.MutableDateTime mutableDateTime64 = new org.joda.time.MutableDateTime(0L, chronology54);
        org.joda.time.LocalDate localDate65 = org.joda.time.LocalDate.now(chronology54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime12 and dateTime29", (dateTime12.compareTo(dateTime29) == 0) == dateTime12.equals(dateTime29));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minusYears(0);
        org.joda.time.DateTime dateTime6 = dateTime1.withSecondOfMinute(0);
        org.joda.time.DateTime dateTime8 = dateTime1.plusHours((-292275054));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        int int13 = localDateTime11.getWeekOfWeekyear();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone16.nextTransition((long) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDateTime11.toDateTime(dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime20 = org.joda.time.MutableDateTime.now(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime22 = dateTime1.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.ReadableInstant readableInstant24 = null;
        int int25 = dateTimeZone16.getOffset(readableInstant24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime20", (dateTime1.compareTo(mutableDateTime20) == 0) == dateTime1.equals(mutableDateTime20));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMillis(1);
        org.joda.time.DateTime.Property property8 = dateTime7.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean10 = dateTime7.isSupported(dateTimeFieldType9);
        org.joda.time.Instant instant11 = dateTime7.toInstant();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        boolean boolean16 = timeZone12.hasSameRules(timeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime18 = dateTime7.toDateTime(dateTimeZone17);
        org.joda.time.DateTime.Property property19 = dateTime7.dayOfYear();
        java.lang.String str20 = property19.getAsText();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and instant11", (dateTime7.compareTo(instant11) == 0) == dateTime7.equals(instant11));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withMillisOfSecond(7);
        int int7 = dateTime6.getMillisOfSecond();
        org.joda.time.DateTime dateTime8 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay9 = dateTime8.toTimeOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime14 = property13.roundHalfEven();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime17 = property13.set("22", locale16);
        java.util.GregorianCalendar gregorianCalendar18 = mutableDateTime17.toGregorianCalendar();
        mutableDateTime17.addMinutes(44);
        mutableDateTime17.addWeeks((int) (short) 100);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime17.millisOfDay();
        boolean boolean24 = dateTime8.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology26);
        boolean boolean29 = localTime27.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalTime localTime31 = localTime27.plus(readablePeriod30);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.LocalTime localTime33 = org.joda.time.LocalTime.now(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime8.withChronology(chronology32);
        org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField36 = chronology32.weekOfWeekyear();
        long long39 = dateTimeField36.add((long) (-26), 39);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and dateTime35", (dateTime1.compareTo(dateTime35) == 0) == dateTime1.equals(dateTime35));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a', chronology3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfEven();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime9 = property5.set("22", locale8);
        mutableDateTime9.addYears(10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMillis(1);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime9.add(readablePeriod21, (int) (short) 0);
        org.joda.time.Chronology chronology24 = mutableDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a', chronology28);
        mutableDateTime29.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.secondOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a', chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.yearOfCentury();
        mutableDateTime35.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology39 = null;
        mutableDateTime35.setChronology(chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.weekyear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) 1);
        mutableDateTime43.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.DateTime dateTime48 = mutableDateTime43.toDateTime();
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        mutableDateTime43.setZone(dateTimeZone52);
        mutableDateTime29.setZone(dateTimeZone52);
        org.joda.time.Chronology chronology55 = chronology24.withZone(dateTimeZone52);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1969, chronology24);
        org.joda.time.DateTimeField dateTimeField57 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField58 = chronology24.clockhourOfHalfday();
        org.joda.time.Chronology chronology59 = chronology24.withUTC();
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(38613L, chronology24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime48", (mutableDateTime35.compareTo(dateTime48) == 0) == mutableDateTime35.equals(dateTime48));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.LocalDate localDate9 = localDate2.minusWeeks(100);
        org.joda.time.Chronology chronology10 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.millisOfDay();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime12", (dateTime5.compareTo(dateTime12) == 0) == dateTime5.equals(dateTime12));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = chronology5.add(readablePeriod8, 1L, 2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter12.withOffsetParsed();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withField(dateTimeFieldType18, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology22 = dateTimeFormatter21.getChronolgy();
        java.lang.String str23 = localTime20.toString(dateTimeFormatter21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology25);
        org.joda.time.DateTime.Property property27 = dateTime26.yearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime26.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime26.toMutableDateTime(dateTimeZone30);
        long long34 = dateTimeZone30.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) 'a', dateTimeZone30);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter21.withZone(dateTimeZone30);
        java.lang.String str38 = dateTimeZone30.getShortName((long) 54348);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter12.withZone(dateTimeZone30);
        org.joda.time.Chronology chronology40 = chronology5.withZone(dateTimeZone30);
        org.joda.time.DurationField durationField41 = chronology40.days();
        org.joda.time.DateTimeField dateTimeField42 = chronology40.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime26 and mutableDateTime31", (dateTime26.compareTo(mutableDateTime31) == 0) == dateTime26.equals(mutableDateTime31));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        mutableDateTime7.setMillis((long) 54341029);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime17.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime7.toDateTime(dateTimeZone21);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        mutableDateTime7.add(readablePeriod24);
        int int26 = mutableDateTime7.getRoundingMode();
        mutableDateTime7.addMillis(86399);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime22", (dateTime17.compareTo(mutableDateTime22) == 0) == dateTime17.equals(mutableDateTime22));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.joda.time.tz.NameProvider nameProvider1 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Locale locale4 = java.util.Locale.ROOT;
        java.lang.String str5 = locale3.getDisplayVariant(locale4);
        java.lang.String str6 = locale3.getDisplayName();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a', chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property10.roundHalfEven();
        java.util.Locale locale13 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime14 = property10.set("22", locale13);
        java.lang.String str15 = locale3.getDisplayScript(locale13);
        java.lang.String str18 = nameProvider1.getName(locale13, "Canada", "2022-02-21T15:05:41.396Z");
        java.util.Set<java.lang.String> strSet19 = locale13.getUnicodeLocaleAttributes();
        strSet19.clear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale22 = dateTimeFormatter21.getLocale();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime24.toMutableDateTime(dateTimeZone28);
        int int32 = dateTimeFormatter21.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime29, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int38 = localTime34.get(dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = localTime34.getChronology();
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology39, locale40);
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime29.toMutableDateTime(chronology39);
        boolean boolean43 = strSet19.equals((java.lang.Object) chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime(0L, chronology39);
        org.joda.time.DateTimeField dateTimeField45 = chronology39.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime29", (dateTime24.compareTo(mutableDateTime29) == 0) == dateTime24.equals(mutableDateTime29));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(2);
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear(21);
        org.joda.time.DateTime dateTime10 = dateTime4.minusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(2022);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int18 = localTime14.get(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = localTime14.getChronology();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology19, locale20);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket21.getChronology();
        org.joda.time.Chronology chronology23 = chronology22.withUTC();
        org.joda.time.DateTime dateTime24 = dateTime10.withChronology(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.seconds();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(1782539892L, chronology23);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 40002512);
        org.joda.time.LocalDate localDate29 = dateTime28.toLocalDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime24", (dateTime10.compareTo(dateTime24) == 0) == dateTime10.equals(dateTime24));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendWeekyear(39, 5);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendHourOfHalfday(2067);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder17 = dateTimeFormatterBuilder14.appendTwoDigitWeekyear(10, false);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale19 = dateTimeFormatter18.getLocale();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        int int29 = dateTimeFormatter18.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime26, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = dateTimeFormatter18.getPrinter();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder31 = dateTimeFormatterBuilder17.append(dateTimePrinter30);
        org.joda.time.format.DateTimeParser dateTimeParser32 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime21 and mutableDateTime26", (dateTime21.compareTo(mutableDateTime26) == 0) == dateTime21.equals(mutableDateTime26));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(obj0);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        int int3 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate6.getFieldType(0);
        org.joda.time.DateMidnight dateMidnight9 = localDate6.toDateMidnight();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime11.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = dateTime11.getZone();
        org.joda.time.Interval interval18 = localDate6.toInterval(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate1.toDateTimeAtStartOfDay(dateTimeZone17);
        java.lang.String str20 = dateTimeZone17.getID();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("0");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime1.minus((long) 2023);
        org.joda.time.Instant instant6 = dateTime1.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime1.withYearOfEra(966);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and instant6", (dateTime1.compareTo(instant6) == 0) == dateTime1.equals(instant6));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 57);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = dateTime14.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime14.toMutableDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localTime12.toDateTimeToday(dateTimeZone18);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(dateTimeZone18);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone18);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime14 and mutableDateTime19", (dateTime14.compareTo(mutableDateTime19) == 0) == dateTime14.equals(mutableDateTime19));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime3.plus(readableDuration6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.plus(readableDuration8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.months();
        org.joda.time.DurationField durationField17 = chronology15.days();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime9.toMutableDateTime(chronology15);
        java.lang.String str19 = chronology15.toString();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.yearOfCentury();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime18", (dateTime3.compareTo(mutableDateTime18) == 0) == dateTime3.equals(mutableDateTime18));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = dateTimeFormatterBuilder0.appendYearOfEra(39, (int) (byte) 0);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = null;
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder0.appendTimeZoneShortName(strMap13);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder16 = dateTimeFormatterBuilder14.appendDayOfWeek(99);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.withField(dateTimeFieldType19, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology23 = dateTimeFormatter22.getChronolgy();
        java.lang.String str24 = localTime21.toString(dateTimeFormatter22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        long long35 = dateTimeZone31.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 'a', dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter22.withZone(dateTimeZone31);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = dateTimeFormatter22.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser39);
        int int41 = dateTimePrinter38.estimatePrintedLength();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder14.append(dateTimePrinter38);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder42.appendCenturyOfEra(3, 36130021);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatterBuilder45.toFormatter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withDefaultYear(993);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime32", (dateTime27.compareTo(mutableDateTime32) == 0) == dateTime27.equals(mutableDateTime32));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime2.hourOfDay();
        int int6 = property5.getMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.roundHalfEven();
        mutableDateTime7.setYear((int) 'u');
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) 'a', chronology11);
        mutableDateTime12.addWeekyears((int) (byte) -1);
        int int15 = mutableDateTime12.getDayOfMonth();
        int int16 = mutableDateTime12.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime12.toMutableDateTime(dateTimeZone17);
        long long22 = dateTimeZone17.convertLocalToUTC((long) (byte) 0, true, 5050L);
        int int24 = dateTimeZone17.getOffsetFromLocal(4460783880L);
        mutableDateTime7.setZoneRetainFields(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime7.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime12 and mutableDateTime18", (mutableDateTime12.compareTo(mutableDateTime18) == 0) == mutableDateTime12.equals(mutableDateTime18));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(dateTimeZone7);
        boolean boolean11 = dateTimeZone7.isFixed();
        java.lang.String str12 = dateTimeZone7.getID();
        org.joda.time.DateTime dateTime13 = localDateTime0.toDateTime(dateTimeZone7);
        boolean boolean15 = dateTime13.isAfter((long) 465);
        org.joda.time.DateTime.Property property16 = dateTime13.dayOfWeek();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.DateTime dateTime20 = dateTime18.plus(readablePeriod19);
        org.joda.time.DateTime.Property property21 = dateTime20.millisOfDay();
        org.joda.time.DurationField durationField22 = property21.getDurationField();
        org.joda.time.DateTimeField dateTimeField23 = property21.getField();
        boolean boolean24 = dateTimeField23.isLenient();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withWeekOfWeekyear(10);
        int int29 = localDateTime25.getWeekyear();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime25.withYear(2000);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusHours((int) 'a');
        int int34 = localDateTime31.getHourOfDay();
        java.util.Locale locale38 = new java.util.Locale("", "seconds");
        java.lang.String str39 = locale38.getISO3Language();
        java.lang.String str40 = dateTimeField23.getAsShortText((org.joda.time.ReadablePartial) localDateTime31, 54353, locale38);
        boolean boolean41 = locale38.hasExtensions();
        java.util.Calendar calendar42 = dateTime13.toCalendar(locale38);
        java.lang.String str43 = locale38.getDisplayCountry();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and dateTime18", (mutableDateTime10.compareTo(dateTime18) == 0) == mutableDateTime10.equals(dateTime18));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateMidnight dateMidnight5 = localDate2.toDateMidnight();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime7.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime7.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime7.getZone();
        org.joda.time.Interval interval14 = localDate2.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate2.minusYears(22);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate2.minus(readablePeriod17);
        org.joda.time.LocalDate.Property property19 = localDate18.era();
        org.joda.time.LocalDate localDate20 = property19.withMaximumValue();
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.LocalDate.Property property22 = localDate20.monthOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime12", (dateTime7.compareTo(mutableDateTime12) == 0) == dateTime7.equals(mutableDateTime12));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime8.toMutableDateTime(chronology18);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime8.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        org.joda.time.MutableDateTime mutableDateTime25 = property22.addWrapField(4460774);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime21", (dateTime3.compareTo(mutableDateTime21) == 0) == dateTime3.equals(mutableDateTime21));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.withField(dateTimeFieldType19, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology23 = dateTimeFormatter22.getChronolgy();
        java.lang.String str24 = localTime21.toString(dateTimeFormatter22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        long long35 = dateTimeZone31.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 'a', dateTimeZone31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter22.withZone(dateTimeZone31);
        java.lang.String str39 = dateTimeZone31.getShortName((long) 54348);
        mutableDateTime2.setZoneRetainFields(dateTimeZone31);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime2.dayOfWeek();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime2.centuryOfEra();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and mutableDateTime32", (dateTime27.compareTo(mutableDateTime32) == 0) == dateTime27.equals(mutableDateTime32));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime8.toMutableDateTime(chronology18);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int28 = localTime24.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = localTime24.getChronology();
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology29, locale30);
        org.joda.time.Chronology chronology32 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(chronology33);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.DateTime dateTime36 = dateTime34.plus(readablePeriod35);
        org.joda.time.DateTime.Property property37 = dateTime36.millisOfDay();
        org.joda.time.DurationField durationField38 = property37.getDurationField();
        org.joda.time.DateTimeField dateTimeField39 = property37.getField();
        long long42 = dateTimeField39.add((-259199980L), (int) (short) 1);
        java.lang.String str43 = dateTimeField39.toString();
        java.util.Locale locale44 = java.util.Locale.GERMAN;
        int int45 = dateTimeField39.getMaximumShortTextLength(locale44);
        dateTimeParserBucket31.saveField(dateTimeField39, 0);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime52 = localTime49.withField(dateTimeFieldType50, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology54 = dateTimeFormatter53.getChronolgy();
        java.lang.String str55 = localTime52.toString(dateTimeFormatter53);
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime(chronology57);
        org.joda.time.DateTime.Property property59 = dateTime58.yearOfCentury();
        org.joda.time.DateTime dateTime61 = dateTime58.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime58.toMutableDateTime(dateTimeZone62);
        long long66 = dateTimeZone62.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime((long) 'a', dateTimeZone62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter68 = dateTimeFormatter53.withZone(dateTimeZone62);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeFormatter68.getZone();
        dateTimeParserBucket31.setZone(dateTimeZone69);
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(1L, dateTimeZone69);
        java.lang.String str73 = dateTimeZone69.getName((long) 2067);
        org.joda.time.MutableDateTime mutableDateTime74 = mutableDateTime21.toMutableDateTime(dateTimeZone69);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime8", (dateTime3.compareTo(mutableDateTime8) == 0) == dateTime3.equals(mutableDateTime8));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.DateTimeField dateTimeField17 = property15.getField();
        long long20 = dateTimeField17.add((-259199980L), (int) (short) 1);
        java.lang.String str21 = dateTimeField17.toString();
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        int int23 = dateTimeField17.getMaximumShortTextLength(locale22);
        dateTimeParserBucket9.saveField(dateTimeField17, 0);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime30 = localTime27.withField(dateTimeFieldType28, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology32 = dateTimeFormatter31.getChronolgy();
        java.lang.String str33 = localTime30.toString(dateTimeFormatter31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.DateTime dateTime39 = dateTime36.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone40);
        long long44 = dateTimeZone40.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter31.withZone(dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeFormatter46.getZone();
        dateTimeParserBucket9.setZone(dateTimeZone47);
        org.joda.time.LocalTime localTime49 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int51 = localTime49.indexOf(dateTimeFieldType50);
        dateTimeParserBucket9.saveField(dateTimeFieldType50, 56);
        org.joda.time.Chronology chronology54 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeParserBucket9.getZone();
        org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(4460797114L, dateTimeZone55);
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime61 = localTime58.withField(dateTimeFieldType59, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology63 = dateTimeFormatter62.getChronolgy();
        java.lang.String str64 = localTime61.toString(dateTimeFormatter62);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateTime dateTime67 = new org.joda.time.DateTime(chronology66);
        org.joda.time.DateTime.Property property68 = dateTime67.yearOfCentury();
        org.joda.time.DateTime dateTime70 = dateTime67.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime72 = dateTime67.toMutableDateTime(dateTimeZone71);
        long long75 = dateTimeZone71.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime76 = new org.joda.time.DateTime((long) 'a', dateTimeZone71);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter77 = dateTimeFormatter62.withZone(dateTimeZone71);
        long long79 = dateTimeZone71.convertUTCToLocal(10L);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime56.toMutableDateTime(dateTimeZone71);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and mutableDateTime41", (dateTime36.compareTo(mutableDateTime41) == 0) == dateTime36.equals(mutableDateTime41));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.longDateTime();
        boolean boolean27 = dateTimeFormatter26.isPrinter();
        java.lang.String str28 = dateTime25.toString(dateTimeFormatter26);
        org.joda.time.DateTime dateTime30 = dateTime25.minusMinutes(40025595);
        org.joda.time.DateTime.Property property31 = dateTime25.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and mutableDateTime12", (mutableDateTime1.compareTo(mutableDateTime12) == 0) == mutableDateTime1.equals(mutableDateTime12));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 1969);
        int int2 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property3 = localDate1.dayOfYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime5.minus((long) ' ');
        java.util.GregorianCalendar gregorianCalendar9 = dateTime5.toGregorianCalendar();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar) gregorianCalendar9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int15 = localTime11.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.months();
        org.joda.time.DurationField durationField18 = chronology16.days();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField21 = chronology16.dayOfMonth();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.LocalTime.Property property23 = localTime22.millisOfSecond();
        int int24 = localTime22.getSecondOfMinute();
        org.joda.time.LocalTime localTime25 = localTime10.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.LocalDateTime localDateTime26 = localDate1.toLocalDateTime(localTime22);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime20", (dateTime5.compareTo(mutableDateTime20) == 0) == dateTime5.equals(mutableDateTime20));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(2);
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTime dateTime9 = dateTime6.withWeekyear(0);
        java.lang.String str10 = dateTime6.toString();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDate13.getFieldType(0);
        org.joda.time.DateTime dateTime16 = localDate13.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate18 = localDate13.plusMonths(1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime((long) 'a', chronology20);
        mutableDateTime21.addWeekyears((int) (byte) -1);
        int int24 = mutableDateTime21.getDayOfMonth();
        int int25 = mutableDateTime21.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime21.toMutableDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime6.toDateTime(dateTimeZone26);
        java.util.TimeZone timeZone30 = dateTimeZone26.toTimeZone();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone26);
        long long33 = dateTimeZone26.convertUTCToLocal((long) 54392189);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 366, dateTimeZone26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime6 and dateTime29", (dateTime6.compareTo(dateTime29) == 0) == dateTime6.equals(dateTime29));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder0.appendDayOfWeek(44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder13 = dateTimeFormatterBuilder11.appendHourOfDay(2023);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime18 = localTime15.withField(dateTimeFieldType16, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology20 = dateTimeFormatter19.getChronolgy();
        java.lang.String str21 = localTime18.toString(dateTimeFormatter19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.DateTime dateTime27 = dateTime24.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime24.toMutableDateTime(dateTimeZone28);
        long long32 = dateTimeZone28.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 'a', dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter19.withZone(dateTimeZone28);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter34.withPivotYear((java.lang.Integer) 39);
        int int37 = dateTimeFormatter36.getDefaultYear();
        java.lang.String str39 = dateTimeFormatter36.print(130021L);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder40 = dateTimeFormatterBuilder11.append(dateTimeFormatter36);
        org.joda.time.format.DateTimePrinter dateTimePrinter41 = dateTimeFormatter36.getPrinter();
        int int42 = dateTimePrinter41.estimatePrintedLength();
        int int43 = dateTimePrinter41.estimatePrintedLength();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and mutableDateTime29", (dateTime24.compareTo(mutableDateTime29) == 0) == dateTime24.equals(mutableDateTime29));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 39);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology24);
        org.joda.time.LocalTime.Property property26 = localTime25.hourOfDay();
        org.joda.time.LocalTime localTime27 = property26.withMaximumValue();
        org.joda.time.LocalTime localTime28 = property26.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime29 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property26.getLocalTime();
        org.joda.time.LocalTime localTime32 = localTime30.plusHours((-54353560));
        java.lang.String str33 = dateTimeFormatter22.print((org.joda.time.ReadablePartial) localTime30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay18 = dateTime15.toTimeOfDay();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes(2);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTime dateTime26 = dateTime15.toDateTime(dateTimeZone25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str28 = durationFieldType27.toString();
        org.joda.time.DateTime dateTime30 = dateTime15.withFieldAdded(durationFieldType27, 42);
        org.joda.time.LocalTime localTime32 = localTime11.withFieldAdded(durationFieldType27, (-4201));
        java.lang.String str33 = durationFieldType27.toString();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.DateTime dateTime37 = property36.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime39 = property36.addWrapFieldToCopy(20);
        long long40 = property36.remainder();
        java.util.Locale.Category category41 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.lang.String str44 = locale42.getDisplayScript();
        java.util.Locale.setDefault(category41, locale42);
        java.lang.String str46 = property36.getAsShortText(locale42);
        java.util.Set<java.lang.String> strSet47 = locale42.getUnicodeLocaleAttributes();
        java.util.Locale locale48 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet49 = locale48.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(chronology50);
        boolean boolean52 = strSet49.remove((java.lang.Object) mutableDateTime51);
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder56 = builder53.setExtension('a', "");
        java.util.Locale.Builder builder57 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder60 = builder57.setExtension('a', "");
        java.util.Locale.Builder builder61 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray62 = new java.util.Locale.Builder[] { builder53, builder60, builder61 };
        java.util.Locale.Builder[] builderArray63 = strSet49.toArray(builderArray62);
        boolean boolean64 = strSet49.isEmpty();
        boolean boolean65 = strSet49.isEmpty();
        boolean boolean66 = strSet47.addAll((java.util.Collection<java.lang.String>) strSet49);
        java.util.Spliterator<java.lang.String> strSpliterator67 = strSet49.spliterator();
        java.util.Iterator<java.lang.String> strItor68 = strSet49.iterator();
        java.util.Spliterator<java.lang.String> strSpliterator69 = strSet49.spliterator();
        org.joda.time.LocalTime localTime71 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime73 = localTime71.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int75 = localTime71.get(dateTimeFieldType74);
        org.joda.time.Chronology chronology76 = localTime71.getChronology();
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology76, locale77);
        org.joda.time.DateTimeZone dateTimeZone79 = chronology76.getZone();
        org.joda.time.DateTimeField dateTimeField80 = chronology76.dayOfWeek();
        boolean boolean81 = strSet49.contains((java.lang.Object) chronology76);
        org.joda.time.DateTimeField dateTimeField82 = chronology76.weekyearOfCentury();
        org.joda.time.DurationField durationField83 = durationFieldType27.getField(chronology76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField9, durationField83, and durationField9", !(durationField9.compareTo(durationField83) == 0) || (Math.signum(durationField9.compareTo(durationField9)) == Math.signum(durationField83.compareTo(durationField9))));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str17 = dateTimeZone15.getName((long) 54);
        java.lang.String str19 = dateTimeZone15.getShortName(26265600000L);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime22 = dateTime11.plusHours(54465);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(16);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusHours((int) (byte) 0);
        org.joda.time.DateTime.Property property22 = dateTime21.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime21.withWeekyear((int) (short) 0);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology31, locale32);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.year();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        long long38 = dateTimeZone35.getMillisKeepLocal(dateTimeZone36, (long) '#');
        java.lang.String str39 = dateTimeZone36.getID();
        int int41 = dateTimeZone36.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology42 = chronology31.withZone(dateTimeZone36);
        org.joda.time.DurationField durationField43 = chronology42.centuries();
        org.joda.time.DateTime dateTime44 = dateTime21.toDateTime(chronology42);
        org.joda.time.DateTimeField dateTimeField45 = chronology42.centuryOfEra();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter13.withChronology(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField43", Math.signum(durationField8.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField8)));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter1.withChronology(chronology7);
        java.util.Locale locale11 = java.util.Locale.TRADITIONAL_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) -1, chronology7, locale11, (java.lang.Integer) 70, 41);
        java.lang.Object obj15 = dateTimeParserBucket14.saveState();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime18.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology23, locale24);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.secondOfDay();
        org.joda.time.DurationField durationField28 = chronology26.halfdays();
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '#', chronology26);
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfWeek();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 'a', chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfEven();
        java.util.Locale locale38 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime39 = property35.set("22", locale38);
        mutableDateTime39.addYears(10);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfCentury();
        org.joda.time.DateTime dateTime45 = property44.withMinimumValue();
        org.joda.time.DateTime dateTime47 = dateTime45.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime49 = dateTime45.plusMillis(1);
        mutableDateTime39.setDate((org.joda.time.ReadableInstant) dateTime49);
        org.joda.time.ReadablePeriod readablePeriod51 = null;
        mutableDateTime39.add(readablePeriod51, (int) (short) 0);
        org.joda.time.Chronology chronology54 = mutableDateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.dayOfYear();
        java.util.Locale.Builder builder56 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder59 = builder56.setExtension('a', "");
        java.util.Locale.Builder builder60 = builder56.clear();
        java.util.Locale locale61 = builder56.build();
        java.lang.String str62 = locale61.getScript();
        int int63 = dateTimeField55.getMaximumShortTextLength(locale61);
        java.lang.String str64 = locale61.getDisplayName();
        java.lang.String str65 = dateTimeField30.getAsShortText((long) 2922789, locale61);
        int int67 = dateTimeField30.getMinimumValue((long) 54409662);
        dateTimeParserBucket14.saveField(dateTimeField30, 75600097);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField28", Math.signum(durationField9.compareTo(durationField28)) == -Math.signum(durationField28.compareTo(durationField9)));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.clockhourOfHalfday();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField11", Math.signum(durationField10.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField10)));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(10);
        int int5 = localDateTime1.getWeekyear();
        org.joda.time.Chronology chronology6 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1940L, chronology6);
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str2 = dateTimeFormatter0.print((-259199980L));
        int int3 = dateTimeFormatter0.getDefaultYear();
        boolean boolean4 = dateTimeFormatter0.isPrinter();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.DateTime dateTime9 = dateTime6.minusYears(0);
        org.joda.time.DateTime dateTime11 = dateTime6.withSecondOfMinute(0);
        java.lang.String str12 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter0.withZoneUTC();
        boolean boolean14 = dateTimeFormatter13.isPrinter();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int19 = localTime15.get(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localTime15.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = chronology20.add(readablePeriod22, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField26 = chronology20.minutes();
        org.joda.time.DateTimeField dateTimeField27 = chronology20.dayOfYear();
        org.joda.time.DurationField durationField28 = chronology20.days();
        org.joda.time.DateTimeField dateTimeField29 = chronology20.clockhourOfHalfday();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter13.withChronology(chronology20);
        org.joda.time.DurationField durationField32 = chronology20.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField32, durationField26, and durationField28", !(durationField32.compareTo(durationField26) == 0) || (Math.signum(durationField32.compareTo(durationField28)) == Math.signum(durationField26.compareTo(durationField28))));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) 'a', chronology6);
        mutableDateTime7.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime7.secondOfDay();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime7.yearOfCentury();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime7.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property12.roundHalfCeiling();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.property(dateTimeFieldType14);
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        mutableDateTime16.setZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = mutableDateTime2.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((long) (short) 10, chronology23);
        int int25 = localTime24.getSecondOfMinute();
        org.joda.time.LocalTime localTime27 = localTime24.withHourOfDay((int) (short) 10);
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.LocalTime localTime29 = property28.withMinimumValue();
        org.joda.time.LocalTime localTime30 = property28.roundCeilingCopy();
        org.joda.time.LocalTime localTime32 = property28.addWrapFieldToCopy(2022);
        org.joda.time.LocalTime localTime33 = property28.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime34 = property28.roundCeilingCopy();
        org.joda.time.LocalTime localTime35 = property28.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.millisOfSecond();
        java.lang.String str37 = dateTimeFieldType36.toString();
        boolean boolean38 = localTime35.isSupported(dateTimeFieldType36);
        mutableDateTime2.set(dateTimeFieldType36, 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime21", (dateTime4.compareTo(dateTime21) == 0) == dateTime4.equals(dateTime21));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.millisOfSecond();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) 'a', chronology8);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.yearOfCentury();
        mutableDateTime9.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology13 = null;
        mutableDateTime9.setChronology(chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        mutableDateTime17.addWeekyears((int) (byte) -1);
        int int20 = mutableDateTime17.getDayOfMonth();
        mutableDateTime17.setWeekyear((int) (short) 0);
        boolean boolean23 = mutableDateTime9.isAfter((org.joda.time.ReadableInstant) mutableDateTime17);
        long long24 = mutableDateTime17.getMillis();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.years();
        mutableDateTime17.add(durationFieldType25, 40);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int32 = localTime28.get(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = localTime28.getChronology();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        org.joda.time.DurationField durationField36 = chronology33.weekyears();
        org.joda.time.DateTimeField dateTimeField37 = chronology33.dayOfMonth();
        org.joda.time.DurationField durationField38 = durationFieldType25.getField(chronology33);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((java.lang.Object) dateTime5, chronology33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField36 and durationField38", (durationField36.compareTo(durationField38) == 0) == durationField36.equals(durationField38));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.String str18 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter16.withZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone25);
        int int33 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime34 = dateTime6.withZone(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime34", (dateTime4.compareTo(dateTime34) == 0) == dateTime4.equals(dateTime34));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.dayOfMonth();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.months();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.hourOfHalfday();
        org.joda.time.DurationField durationField24 = chronology21.weekyears();
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 43, chronology21);
        org.joda.time.Chronology chronology26 = mutableDateTime25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.era();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((long) 'a', chronology30);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime31.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime33 = property32.roundHalfEven();
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime36 = property32.set("22", locale35);
        mutableDateTime36.addYears(10);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        org.joda.time.DateTime dateTime44 = dateTime42.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime46 = dateTime42.plusMillis(1);
        mutableDateTime36.setDate((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        mutableDateTime36.add(readablePeriod48, (int) (short) 0);
        org.joda.time.Chronology chronology51 = mutableDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField52 = chronology51.dayOfYear();
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder56 = builder53.setExtension('a', "");
        java.util.Locale.Builder builder57 = builder53.clear();
        java.util.Locale locale58 = builder53.build();
        java.lang.String str59 = locale58.getScript();
        int int60 = dateTimeField52.getMaximumShortTextLength(locale58);
        java.lang.String str61 = locale58.getDisplayVariant();
        java.util.Locale locale62 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.MutableDateTime mutableDateTime65 = new org.joda.time.MutableDateTime((long) 'a', chronology64);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime65.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime67 = property66.roundHalfEven();
        java.util.Locale locale69 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime70 = property66.set("22", locale69);
        java.lang.String str71 = locale62.getDisplayScript(locale69);
        java.util.Locale locale72 = java.util.Locale.KOREAN;
        java.lang.String str73 = locale69.getDisplayLanguage(locale72);
        java.lang.String str74 = locale69.getDisplayLanguage();
        java.lang.String str75 = locale58.getDisplayScript(locale69);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) 844, chronology26, locale58, (java.lang.Integer) 54511);
        int int78 = dateTimeField13.getMaximumTextLength(locale58);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField22", Math.signum(durationField9.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField9)));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) 1, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusSeconds((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, 0);
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.property(dateTimeFieldType11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime18 = dateTime15.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime15.toMutableDateTime(dateTimeZone19);
        long long23 = dateTimeZone19.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 'a', dateTimeZone19);
        org.joda.time.DateTime dateTime25 = dateTime24.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str30 = dateTimeZone28.getName((long) 54);
        java.lang.String str32 = dateTimeZone28.getShortName(26265600000L);
        org.joda.time.DateTime dateTime33 = dateTime24.toDateTime(dateTimeZone28);
        int int34 = property12.getDifference((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime24 and dateTime33", (dateTime24.compareTo(dateTime33) == 0) == dateTime24.equals(dateTime33));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        org.joda.time.DurationField durationField13 = chronology8.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField13, and durationField10", !(durationField10.compareTo(durationField13) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField13.compareTo(durationField10))));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime3.toMutableDateTime(chronology6);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours(57);
        org.joda.time.DateTime dateTime10 = dateTime3.toDateTime(dateTimeZone9);
        java.util.GregorianCalendar gregorianCalendar11 = dateTime3.toGregorianCalendar();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime10", (dateTime3.compareTo(dateTime10) == 0) == dateTime3.equals(dateTime10));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.Chronology chronology13 = dateTimeFormatter12.getChronolgy();
        boolean boolean14 = dateTimeFormatter12.isParser();
        java.util.Locale locale15 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
        boolean boolean19 = strSet16.remove((java.lang.Object) mutableDateTime18);
        java.util.Locale.Builder builder20 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder23 = builder20.setExtension('a', "");
        java.util.Locale.Builder builder24 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder27 = builder24.setExtension('a', "");
        java.util.Locale.Builder builder28 = new java.util.Locale.Builder();
        java.util.Locale.Builder[] builderArray29 = new java.util.Locale.Builder[] { builder20, builder27, builder28 };
        java.util.Locale.Builder[] builderArray30 = strSet16.toArray(builderArray29);
        java.io.IOException iOException32 = new java.io.IOException("00:00:00.097");
        java.lang.Throwable throwable35 = null;
        java.io.IOException iOException36 = new java.io.IOException("22", throwable35);
        java.io.IOException iOException37 = new java.io.IOException("English (Canada)", (java.lang.Throwable) iOException36);
        java.io.IOException iOException38 = new java.io.IOException((java.lang.Throwable) iOException36);
        iOException32.addSuppressed((java.lang.Throwable) iOException36);
        java.lang.Exception[] exceptionArray40 = new java.lang.Exception[] { iOException36 };
        java.lang.Exception[] exceptionArray41 = strSet16.toArray(exceptionArray40);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime44 = localTime42.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int46 = localTime42.get(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = localTime42.getChronology();
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.now(chronology47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        long long52 = chronology47.add(readablePeriod49, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField53 = chronology47.minutes();
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField55 = chronology47.millisOfSecond();
        boolean boolean56 = strSet16.remove((java.lang.Object) chronology47);
        org.joda.time.DurationField durationField57 = chronology47.months();
        org.joda.time.DateTime dateTime58 = org.joda.time.DateTime.now(chronology47);
        org.joda.time.DurationField durationField59 = chronology47.days();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter12.withChronology(chronology47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField53", Math.signum(durationField8.compareTo(durationField53)) == -Math.signum(durationField53.compareTo(durationField8)));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int19 = localTime15.get(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localTime15.getChronology();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology20, locale21);
        mutableDateTime7.setChronology(chronology20);
        org.joda.time.DateTimeField dateTimeField24 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField25 = chronology20.eras();
        org.joda.time.DurationField durationField26 = chronology20.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField25, durationField26, and durationField25", !(durationField25.compareTo(durationField26) == 0) || (Math.signum(durationField25.compareTo(durationField25)) == Math.signum(durationField26.compareTo(durationField25))));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay18 = dateTime15.toTimeOfDay();
        org.joda.time.DateTime dateTime20 = dateTime15.minusMinutes(2);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury((int) (short) 1);
        java.util.TimeZone timeZone24 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTime dateTime26 = dateTime15.toDateTime(dateTimeZone25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str28 = durationFieldType27.toString();
        org.joda.time.DateTime dateTime30 = dateTime15.withFieldAdded(durationFieldType27, 42);
        org.joda.time.LocalTime localTime32 = localTime11.withFieldAdded(durationFieldType27, (-4201));
        java.lang.String str33 = durationFieldType27.toString();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology35);
        org.joda.time.LocalTime.Property property37 = localTime36.hourOfDay();
        org.joda.time.LocalTime localTime38 = property37.withMaximumValue();
        org.joda.time.LocalTime localTime39 = property37.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalTime localTime41 = localTime39.minus(readablePeriod40);
        org.joda.time.Chronology chronology42 = localTime39.getChronology();
        org.joda.time.DurationField durationField43 = chronology42.halfdays();
        org.joda.time.DurationField durationField44 = durationFieldType27.getField(chronology42);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField43", Math.signum(durationField9.compareTo(durationField43)) == -Math.signum(durationField43.compareTo(durationField9)));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMinutes((int) (short) 100);
        java.lang.String str10 = dateTime3.toString();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(100L);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) dateTime11, chronology14);
        org.joda.time.DurationField durationField16 = chronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.millisOfDay();
        org.joda.time.DurationField durationField18 = chronology14.eras();
        org.joda.time.DurationField durationField19 = chronology14.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField16 and durationField18", Math.signum(durationField16.compareTo(durationField18)) == -Math.signum(durationField18.compareTo(durationField16)));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter9.withChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DateTime dateTime22 = dateTime8.toDateTime(chronology15);
        org.joda.time.DurationField durationField23 = chronology15.minutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField23, and durationField17", !(durationField17.compareTo(durationField23) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField23.compareTo(durationField17))));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(16);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime17 = localTime14.withField(dateTimeFieldType15, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronolgy();
        java.lang.String str20 = localTime17.toString(dateTimeFormatter18);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.DateTime.Property property24 = dateTime23.yearOfCentury();
        org.joda.time.DateTime dateTime26 = dateTime23.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime23.toMutableDateTime(dateTimeZone27);
        long long31 = dateTimeZone27.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 'a', dateTimeZone27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter18.withZone(dateTimeZone27);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone27);
        java.lang.String str35 = dateTimeFormatter11.print((org.joda.time.ReadableInstant) mutableDateTime34);
        int int36 = mutableDateTime34.getWeekyear();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 'a', chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime39.yearOfCentury();
        mutableDateTime39.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology43 = null;
        mutableDateTime39.setChronology(chronology43);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) 'a', chronology46);
        mutableDateTime47.addWeekyears((int) (byte) -1);
        int int50 = mutableDateTime47.getDayOfMonth();
        mutableDateTime47.setWeekyear((int) (short) 0);
        boolean boolean53 = mutableDateTime39.isAfter((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime57 = localTime55.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int59 = localTime55.get(dateTimeFieldType58);
        org.joda.time.Chronology chronology60 = localTime55.getChronology();
        java.util.Locale locale61 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology60, locale61);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket62.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.secondOfDay();
        org.joda.time.DurationField durationField65 = chronology63.halfdays();
        mutableDateTime39.setChronology(chronology63);
        org.joda.time.DateTimeField dateTimeField67 = chronology63.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime68 = mutableDateTime34.toMutableDateTime(chronology63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField65", Math.signum(durationField8.compareTo(durationField65)) == -Math.signum(durationField65.compareTo(durationField8)));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter9.withChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField19 = chronology15.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.DateTime dateTime22 = dateTime8.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField23 = chronology15.secondOfMinute();
        org.joda.time.DurationField durationField24 = chronology15.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField17, durationField24, and durationField17", !(durationField17.compareTo(durationField24) == 0) || (Math.signum(durationField17.compareTo(durationField17)) == Math.signum(durationField24.compareTo(durationField17))));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.months();
        org.joda.time.DurationField durationField7 = chronology5.days();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology5);
        org.joda.time.DateTimeField dateTimeField10 = chronology5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.DurationField durationField12 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField12, durationField6, and durationField7", !(durationField12.compareTo(durationField6) == 0) || (Math.signum(durationField12.compareTo(durationField7)) == Math.signum(durationField6.compareTo(durationField7))));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = org.joda.time.format.DateTimeFormat.longDateTime();
        boolean boolean27 = dateTimeFormatter26.isPrinter();
        java.lang.String str28 = dateTime25.toString(dateTimeFormatter26);
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) (byte) 10);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = property31.roundHalfCeiling();
        java.lang.String str33 = dateTimeFormatter26.print((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime36 = localTime34.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int38 = localTime34.get(dateTimeFieldType37);
        org.joda.time.Chronology chronology39 = localTime34.getChronology();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.now(chronology39);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology39.add(readablePeriod41, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField45 = chronology39.minutes();
        org.joda.time.DateTimeField dateTimeField46 = chronology39.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime47 = org.joda.time.MutableDateTime.now(chronology39);
        mutableDateTime47.addSeconds((int) '4');
        mutableDateTime47.addYears(40014437);
        int int54 = dateTimeFormatter26.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime47, "ita", 54489659);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField45", Math.signum(durationField9.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField9)));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfWeek();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 21, chronology7);
        org.joda.time.DateTimeField dateTimeField13 = chronology7.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology7.dayOfMonth();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology17);
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime20 = property19.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime21 = property19.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime23 = localTime21.minusMillis((int) (byte) 1);
        int[] intArray24 = localTime21.getValues();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int29 = localTime25.get(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = localTime25.getChronology();
        org.joda.time.DurationField durationField31 = chronology30.months();
        org.joda.time.DurationField durationField32 = chronology30.days();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField34 = chronology30.dayOfMonth();
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.util.Locale locale37 = locale36.stripExtensions();
        java.util.Locale locale38 = java.util.Locale.ROOT;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.lang.String str40 = locale37.getDisplayName();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(chronology41);
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.DateTime dateTime44 = dateTime42.plus(readablePeriod43);
        org.joda.time.DateTime.Property property45 = dateTime44.millisOfDay();
        org.joda.time.DurationField durationField46 = property45.getDurationField();
        org.joda.time.DateTimeField dateTimeField47 = property45.getField();
        long long50 = dateTimeField47.add((-259199980L), (int) (short) 1);
        boolean boolean51 = dateTimeField47.isSupported();
        java.util.Locale.Builder builder53 = new java.util.Locale.Builder();
        java.util.Locale locale54 = builder53.build();
        java.util.Locale locale55 = builder53.build();
        java.lang.String str56 = dateTimeField47.getAsText(10, locale55);
        java.lang.String str57 = locale37.getDisplayCountry(locale55);
        java.lang.String str58 = dateTimeField34.getAsShortText((long) '4', locale55);
        java.util.Locale locale59 = locale55.stripExtensions();
        boolean boolean60 = localTime21.equals((java.lang.Object) locale59);
        java.lang.String str61 = dateTimeField14.getAsText((long) (-22), locale59);
        org.joda.time.LocalTime localTime65 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime67 = localTime65.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int69 = localTime65.get(dateTimeFieldType68);
        org.joda.time.Chronology chronology70 = localTime65.getChronology();
        java.util.Locale locale71 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket72 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology70, locale71);
        org.joda.time.DateTimeZone dateTimeZone73 = chronology70.getZone();
        org.joda.time.DateTimeField dateTimeField74 = chronology70.dayOfWeek();
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 21, chronology70);
        org.joda.time.DateTimeField dateTimeField76 = chronology70.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField77 = chronology70.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime79 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime81 = localTime79.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType82 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int83 = localTime79.get(dateTimeFieldType82);
        org.joda.time.Chronology chronology84 = localTime79.getChronology();
        org.joda.time.LocalTime localTime85 = org.joda.time.LocalTime.now(chronology84);
        org.joda.time.DurationField durationField86 = chronology84.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter87 = dateTimeFormatter78.withChronology(chronology84);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter89 = dateTimeFormatter87.withPivotYear(16);
        java.util.Locale locale90 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter89.withLocale(locale90);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket(345598981L, chronology70, locale90, (java.lang.Integer) 54534156);
        int int94 = dateTimeField14.getMaximumShortTextLength(locale90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField31 and durationField86", Math.signum(durationField31.compareTo(durationField86)) == -Math.signum(durationField86.compareTo(durationField31)));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.days();
        org.joda.time.DurationField durationField11 = chronology9.eras();
        org.joda.time.DurationField durationField12 = chronology9.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField12 and durationField11", Math.signum(durationField12.compareTo(durationField11)) == -Math.signum(durationField11.compareTo(durationField12)));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime7 = dateTime3.withDayOfMonth(8);
        int int8 = dateTime3.getMinuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int15 = localTime11.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime18.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology23, locale24);
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long30 = dateTimeZone27.getMillisKeepLocal(dateTimeZone28, (long) '#');
        java.lang.String str31 = dateTimeZone28.getID();
        int int33 = dateTimeZone28.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology34 = chronology23.withZone(dateTimeZone28);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone28);
        java.lang.String str36 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime37 = localTime11.toDateTimeToday(dateTimeZone28);
        java.lang.String str38 = dateTimeFormatter9.print((org.joda.time.ReadableInstant) dateTime37);
        java.lang.String str39 = dateTime3.toString(dateTimeFormatter9);
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime45 = localTime43.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int47 = localTime43.get(dateTimeFieldType46);
        org.joda.time.Chronology chronology48 = localTime43.getChronology();
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology48, locale49);
        org.joda.time.DateTimeZone dateTimeZone51 = chronology48.getZone();
        org.joda.time.DateTimeField dateTimeField52 = chronology48.dayOfWeek();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) 21, chronology48);
        org.joda.time.DateTimeField dateTimeField54 = chronology48.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField55 = chronology48.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter56 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime59 = localTime57.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int61 = localTime57.get(dateTimeFieldType60);
        org.joda.time.Chronology chronology62 = localTime57.getChronology();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.now(chronology62);
        org.joda.time.DurationField durationField64 = chronology62.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter65 = dateTimeFormatter56.withChronology(chronology62);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = dateTimeFormatter65.withPivotYear(16);
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter67.withLocale(locale68);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket71 = new org.joda.time.format.DateTimeParserBucket(345598981L, chronology48, locale68, (java.lang.Integer) 54534156);
        dateTimeParserBucket71.setPivotYear((java.lang.Integer) 54499);
        org.joda.time.Chronology chronology74 = dateTimeParserBucket71.getChronology();
        org.joda.time.MutableDateTime mutableDateTime75 = dateTime3.toMutableDateTime(chronology74);
        org.joda.time.DateTimeField dateTimeField76 = chronology74.year();
        org.joda.time.DurationField durationField77 = chronology74.halfdays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField64, durationField77, and durationField64", !(durationField64.compareTo(durationField77) == 0) || (Math.signum(durationField64.compareTo(durationField64)) == Math.signum(durationField77.compareTo(durationField64))));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minusYears(0);
        org.joda.time.DateTime dateTime7 = dateTime2.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime2.hourOfDay();
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime2.toYearMonthDay();
        org.joda.time.DateTime dateTime11 = dateTime2.minus(117L);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime2.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(19380000);
        long long16 = dateTimeZone12.getMillisKeepLocal(dateTimeZone14, 4460852984L);
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) (-54501223), dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime17", (dateTime2.compareTo(mutableDateTime17) == 0) == dateTime2.equals(mutableDateTime17));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        long long11 = dateTimeParserBucket9.computeMillis(false);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        long long21 = dateTimeField18.add((-259199980L), (int) (short) 1);
        boolean boolean22 = dateTimeField18.isSupported();
        dateTimeParserBucket9.saveField(dateTimeField18, (int) (short) 100);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket9.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.days();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 45, chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField29 = chronology25.hourOfHalfday();
        org.joda.time.DurationField durationField30 = chronology25.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField30, durationField17, and durationField26", !(durationField30.compareTo(durationField17) == 0) || (Math.signum(durationField30.compareTo(durationField26)) == Math.signum(durationField17.compareTo(durationField26))));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        int int9 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.property(dateTimeFieldType12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology21, locale22);
        mutableDateTime8.setChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.yearOfCentury();
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology21);
        org.joda.time.DurationField durationField28 = chronology21.millis();
        org.joda.time.Chronology chronology29 = chronology21.withUTC();
        org.joda.time.DurationField durationField30 = chronology29.eras();
        org.joda.time.DurationField durationField31 = chronology29.weeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField28 and durationField30", Math.signum(durationField28.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField28)));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.DateTime dateTime27 = dateTime17.minusDays((int) (byte) -1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.toDateTime(chronology28);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime32 = localTime30.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int34 = localTime30.get(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localTime30.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.months();
        org.joda.time.DurationField durationField37 = chronology35.days();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField39 = chronology35.dayOfMonth();
        java.lang.String str40 = chronology35.toString();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((java.lang.Object) chronology28, chronology35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField36", Math.signum(durationField9.compareTo(durationField36)) == -Math.signum(durationField36.compareTo(durationField9)));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale8);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.monthOfYear();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfSecond();
        org.joda.time.DurationField durationField13 = chronology10.months();
        long long17 = chronology10.add(4460746081L, (long) (-67), 38);
        java.util.Locale.Builder builder18 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder21 = builder18.setExtension('a', "");
        java.util.Locale.Builder builder22 = builder18.clear();
        java.util.Locale locale23 = builder18.build();
        java.util.Locale locale24 = builder18.build();
        java.lang.String str25 = locale24.toLanguageTag();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(1979L, chronology10, locale24);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket26.getZone();
        java.lang.String str29 = dateTimeZone27.getNameKey(105503615609L);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 'a', chronology31);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.yearOfCentury();
        mutableDateTime32.setMillisOfDay((int) 'a');
        org.joda.time.ReadableDuration readableDuration36 = null;
        mutableDateTime32.add(readableDuration36, 8);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime32.millisOfDay();
        int int40 = dateTimeZone27.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime43 = localTime41.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int45 = localTime41.get(dateTimeFieldType44);
        org.joda.time.Chronology chronology46 = localTime41.getChronology();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.now(chronology46);
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(chronology46);
        int int49 = mutableDateTime48.getSecondOfMinute();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean53 = localTime51.isSupported(dateTimeFieldType52);
        org.joda.time.MutableDateTime.Property property54 = mutableDateTime48.property(dateTimeFieldType52);
        int int55 = mutableDateTime48.getWeekyear();
        java.util.TimeZone timeZone57 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forTimeZone(timeZone57);
        long long62 = dateTimeZone59.adjustOffset((-62166787199903L), false);
        org.joda.time.MutableDateTime mutableDateTime63 = new org.joda.time.MutableDateTime(dateTimeZone59);
        mutableDateTime48.setZoneRetainFields(dateTimeZone59);
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime48.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.forOffsetMillis(54435852);
        org.joda.time.DateTime dateTime68 = mutableDateTime48.toDateTime(dateTimeZone67);
        mutableDateTime32.setZone(dateTimeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime48 and dateTime68", (mutableDateTime48.compareTo(dateTime68) == 0) == mutableDateTime48.equals(dateTime68));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 206, chronology8);
        org.joda.time.DurationField durationField15 = chronology8.months();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField15, and durationField10", !(durationField10.compareTo(durationField15) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField15.compareTo(durationField10))));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(10);
        int int5 = localDateTime1.getWeekyear();
        org.joda.time.Chronology chronology6 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1940L, chronology6);
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.weekyear();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) mutableDateTime2);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime2.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration11 = null;
        mutableDateTime10.add(readableDuration11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.weekyears();
        mutableDateTime10.add(durationFieldType13, 44);
        java.lang.String str16 = durationFieldType13.toString();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology18);
        boolean boolean21 = localTime19.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime23 = localTime19.plus(readablePeriod22);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.era();
        org.joda.time.DurationField durationField26 = chronology24.weeks();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.secondOfMinute();
        org.joda.time.DurationField durationField28 = durationFieldType13.getField(chronology24);
        org.joda.time.DurationField durationField29 = chronology24.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField29, durationField26, and durationField28", !(durationField29.compareTo(durationField26) == 0) || (Math.signum(durationField29.compareTo(durationField28)) == Math.signum(durationField26.compareTo(durationField28))));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withField(dateTimeFieldType3, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronolgy();
        java.lang.String str8 = localTime5.toString(dateTimeFormatter6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime11.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(dateTimeZone15);
        long long19 = dateTimeZone15.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 'a', dateTimeZone15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter6.withZone(dateTimeZone15);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime((long) 'a', chronology24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime25.toMutableDateTime(dateTimeZone27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime28.property(dateTimeFieldType29);
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology32);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.DateTime dateTime35 = dateTime33.plus(readablePeriod34);
        org.joda.time.DateTime.Property property36 = dateTime35.millisOfDay();
        org.joda.time.DurationField durationField37 = property36.getDurationField();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        long long41 = dateTimeField38.add((-259199980L), (int) (short) 1);
        java.lang.String str42 = dateTimeField38.toString();
        java.util.Locale locale43 = java.util.Locale.GERMAN;
        int int44 = dateTimeField38.getMaximumShortTextLength(locale43);
        int int45 = property30.getMaximumTextLength(locale43);
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.lang.String str47 = locale46.getCountry();
        java.lang.String str48 = locale43.getDisplayCountry(locale46);
        boolean boolean49 = locale43.hasExtensions();
        java.lang.String str50 = dateTimeZone15.getShortName((long) 121, locale43);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(4460829998L, dateTimeZone15);
        java.util.Locale locale53 = null;
        java.lang.String str54 = dateTimeZone15.getName((long) 54364690, locale53);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime16", (dateTime11.compareTo(mutableDateTime16) == 0) == dateTime11.equals(mutableDateTime16));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 7);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = dateTime6.minusYears(2);
        org.joda.time.DateTime dateTime10 = dateTime6.withWeekyear(21);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone0);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology21, locale22);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.year();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) '#');
        java.lang.String str29 = dateTimeZone26.getID();
        int int31 = dateTimeZone26.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology32 = chronology21.withZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology32);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) 432000035L, chronology32);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfEra();
        org.joda.time.DateTime dateTime38 = property36.addToCopy((long) 99);
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) dateTime38);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and mutableDateTime34", (dateTime4.compareTo(mutableDateTime34) == 0) == dateTime4.equals(mutableDateTime34));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.DateTime dateTime11 = property8.setCopy(978);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean16 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder19 = dateTimeFormatterBuilder12.appendSignedDecimal(dateTimeFieldType15, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder21 = dateTimeFormatterBuilder12.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder23 = dateTimeFormatterBuilder12.appendDayOfWeek(44);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder25 = dateTimeFormatterBuilder23.appendHourOfDay(2023);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime30 = localTime27.withField(dateTimeFieldType28, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology32 = dateTimeFormatter31.getChronolgy();
        java.lang.String str33 = localTime30.toString(dateTimeFormatter31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(chronology35);
        org.joda.time.DateTime.Property property37 = dateTime36.yearOfCentury();
        org.joda.time.DateTime dateTime39 = dateTime36.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime36.toMutableDateTime(dateTimeZone40);
        long long44 = dateTimeZone40.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) 'a', dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter31.withZone(dateTimeZone40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter46.withPivotYear((java.lang.Integer) 39);
        int int49 = dateTimeFormatter48.getDefaultYear();
        java.lang.String str51 = dateTimeFormatter48.print(130021L);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder52 = dateTimeFormatterBuilder23.append(dateTimeFormatter48);
        java.lang.String str53 = dateTime11.toString(dateTimeFormatter48);
        org.joda.time.DateTime dateTime55 = dateTime11.withDayOfYear(323);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime41", (dateTime1.compareTo(mutableDateTime41) == 0) == dateTime1.equals(mutableDateTime41));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.util.Locale locale3 = new java.util.Locale("2022-03-21", "1/1/70 12:00 AM", "Coordinated Universal Time");
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int8 = localTime4.get(dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = localTime4.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology9);
        org.joda.time.DurationField durationField12 = chronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.dayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.plus(readablePeriod16);
        org.joda.time.DateTime.Property property18 = dateTime17.millisOfDay();
        org.joda.time.DurationField durationField19 = property18.getDurationField();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        long long23 = dateTimeField20.add((-259199980L), (int) (short) 1);
        boolean boolean24 = dateTimeField20.isSupported();
        java.lang.String str26 = dateTimeField20.getAsShortText((long) 5);
        int int27 = dateTimeField20.getMinimumValue();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology30);
        boolean boolean33 = localTime31.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime31.plus(readablePeriod34);
        org.joda.time.LocalTime.Property property36 = localTime31.secondOfMinute();
        java.util.Locale locale37 = java.util.Locale.KOREAN;
        java.lang.String str38 = property36.getAsShortText(locale37);
        java.lang.String str39 = dateTimeField20.getAsText(6, locale37);
        int int40 = dateTimeField13.getMaximumTextLength(locale37);
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str42 = locale37.getDisplayCountry(locale41);
        java.lang.String str43 = locale3.getDisplayLanguage(locale37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and dateTime15", (mutableDateTime11.compareTo(dateTime15) == 0) == mutableDateTime11.equals(dateTime15));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        java.lang.Object obj9 = null;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int14 = localTime10.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localTime10.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = chronology15.add(readablePeriod17, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(obj9, chronology15);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology15.getZone();
        long long24 = dateTimeZone6.getMillisKeepLocal(dateTimeZone22, 0L);
        long long27 = dateTimeZone6.adjustOffset((long) ' ', true);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(7L, dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime28.withDurationAdded(readableDuration29, 2022);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime2 and mutableDateTime7", (dateTime2.compareTo(mutableDateTime7) == 0) == dateTime2.equals(mutableDateTime7));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate11 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property12 = localDate11.monthOfYear();
        java.util.Date date13 = localDate11.toDate();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.weeks();
        boolean boolean15 = localDate11.isSupported(durationFieldType14);
        java.lang.String str16 = localDate11.toString();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime21 = localDate17.toDateTimeAtStartOfDay(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate17.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property24 = localDate17.yearOfEra();
        org.joda.time.LocalDate localDate25 = property24.roundCeilingCopy();
        org.joda.time.LocalDate localDate27 = property24.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval28 = property24.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property24.getFieldType();
        org.joda.time.LocalDate localDate31 = property24.setCopy("54361031");
        org.joda.time.LocalDate localDate33 = localDate31.withYearOfEra(3);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime35.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime35.toMutableDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDate31.toDateTimeAtMidnight(dateTimeZone39);
        org.joda.time.DateMidnight dateMidnight42 = localDate11.toDateMidnight(dateTimeZone39);
        int[] intArray43 = localDate11.getValues();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime35 and mutableDateTime40", (dateTime35.compareTo(mutableDateTime40) == 0) == dateTime35.equals(mutableDateTime40));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime21.add(readablePeriod22, (-2720));
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int19 = localTime15.get(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localTime15.getChronology();
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology20, locale21);
        mutableDateTime7.setChronology(chronology20);
        org.joda.time.MutableDateTime mutableDateTime24 = org.joda.time.MutableDateTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField25 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField26 = chronology20.hours();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime31 = dateTime28.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime28.toMutableDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime34 = org.joda.time.MutableDateTime.now(dateTimeZone32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology36);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime40 = localTime37.withFieldAdded(durationFieldType38, 100);
        org.joda.time.LocalTime localTime42 = localTime40.withMillisOfDay(21);
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        long long46 = dateTimeZone43.getMillisKeepLocal(dateTimeZone44, (long) '#');
        java.lang.String str47 = dateTimeZone44.getID();
        org.joda.time.DateTime dateTime48 = localTime42.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime dateTime50 = dateTime48.plusWeeks((-54353560));
        org.joda.time.MutableDateTime mutableDateTime51 = dateTime48.toMutableDateTime();
        int int52 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) mutableDateTime51);
        org.joda.time.Chronology chronology53 = chronology20.withZone(dateTimeZone32);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(chronology53);
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(chronology55);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.DateTime dateTime58 = dateTime56.minus(readableDuration57);
        org.joda.time.DateTime.Property property59 = dateTime56.monthOfYear();
        int int60 = dateTime56.getSecondOfDay();
        boolean boolean61 = localTime54.equals((java.lang.Object) int60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime7 and dateTime28", (mutableDateTime7.compareTo(dateTime28) == 0) == mutableDateTime7.equals(dateTime28));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        mutableDateTime3.addWeekyears((int) (byte) -1);
        int int6 = mutableDateTime3.getDayOfMonth();
        int int7 = mutableDateTime3.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = mutableDateTime3.toMutableDateTime(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC((long) (byte) 0, true, 5050L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.DateTime.Property property19 = dateTime18.millisOfDay();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        org.joda.time.DateTimeField dateTimeField21 = property19.getField();
        long long24 = dateTimeField21.add((-259199980L), (int) (short) 1);
        boolean boolean25 = dateTimeField21.isSupported();
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.util.Locale locale27 = locale26.stripExtensions();
        java.util.Locale locale28 = java.util.Locale.ROOT;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.lang.String str30 = locale27.getDisplayName();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime32.plus(readablePeriod33);
        org.joda.time.DateTime.Property property35 = dateTime34.millisOfDay();
        org.joda.time.DurationField durationField36 = property35.getDurationField();
        org.joda.time.DateTimeField dateTimeField37 = property35.getField();
        long long40 = dateTimeField37.add((-259199980L), (int) (short) 1);
        boolean boolean41 = dateTimeField37.isSupported();
        java.util.Locale.Builder builder43 = new java.util.Locale.Builder();
        java.util.Locale locale44 = builder43.build();
        java.util.Locale locale45 = builder43.build();
        java.lang.String str46 = dateTimeField37.getAsText(10, locale45);
        java.lang.String str47 = locale27.getDisplayCountry(locale45);
        int int48 = dateTimeField21.getMaximumShortTextLength(locale45);
        java.lang.String str49 = dateTimeZone8.getShortName(47041L, locale45);
        java.lang.String str51 = dateTimeZone8.getName((-62166787199903L));
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) (-229), dateTimeZone8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime3 and mutableDateTime9", (mutableDateTime3.compareTo(mutableDateTime9) == 0) == mutableDateTime3.equals(mutableDateTime9));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateMidnight dateMidnight5 = localDate2.toDateMidnight();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime7.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime7.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime7.getZone();
        org.joda.time.Interval interval14 = localDate2.toInterval(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate2.minusYears(22);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate2.minus(readablePeriod17);
        org.joda.time.LocalDate.Property property19 = localDate18.era();
        org.joda.time.LocalDate localDate20 = property19.withMaximumValue();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate23 = localDate21.withDayOfYear((int) '4');
        org.joda.time.LocalDate localDate25 = localDate23.minusDays((int) 'a');
        org.joda.time.LocalDate.Property property26 = localDate23.era();
        org.joda.time.LocalDate localDate27 = property26.withMaximumValue();
        org.joda.time.LocalDate.Property property28 = localDate27.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = localDate27.getFieldType(0);
        org.joda.time.LocalDate localDate32 = localDate20.withField(dateTimeFieldType30, 19597734);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime12", (dateTime7.compareTo(mutableDateTime12) == 0) == dateTime7.equals(mutableDateTime12));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        mutableDateTime7.setMillis((long) 54341029);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.DateTime dateTime20 = dateTime17.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime17.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = mutableDateTime7.toDateTime(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int25 = mutableDateTime7.get(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime7.dayOfMonth();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime7.dayOfYear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime17 and mutableDateTime22", (dateTime17.compareTo(mutableDateTime22) == 0) == dateTime17.equals(mutableDateTime22));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime5.add(readablePeriod6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime5.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.roundHalfFloor();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int15 = localTime11.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology16, locale17);
        long long20 = dateTimeParserBucket18.computeMillis(false);
        long long23 = dateTimeParserBucket18.computeMillis(false, "1970-01-01T00:00:00.000Z");
        long long26 = dateTimeParserBucket18.computeMillis(false, "3:05 PM");
        java.lang.Integer int27 = dateTimeParserBucket18.getPivotYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long) 'a', chronology29);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.yearOfCentury();
        mutableDateTime30.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology34 = null;
        mutableDateTime30.setChronology(chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.weekyear();
        long long37 = property36.remainder();
        org.joda.time.DateTimeField dateTimeField38 = property36.getField();
        boolean boolean39 = dateTimeParserBucket18.restoreState((java.lang.Object) dateTimeField38);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket18.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime42 = mutableDateTime9.toMutableDateTime(chronology40);
        org.joda.time.Chronology chronology43 = chronology40.withUTC();
        long long47 = chronology40.add(4460974767L, 4460926641L, 220);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime42", (mutableDateTime5.compareTo(mutableDateTime42) == 0) == mutableDateTime5.equals(mutableDateTime42));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DateTime dateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTime dateTime7 = dateTime5.minusMonths(1998);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.yearOfCentury();
        mutableDateTime10.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology14 = null;
        mutableDateTime10.setChronology(chronology14);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime10.weekyear();
        int int17 = mutableDateTime10.getMinuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime22 = dateTime19.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime19.toMutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime19.getZone();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime28 = dateTime19.withDurationAdded(readableDuration26, 54359);
        mutableDateTime10.setMillis((org.joda.time.ReadableInstant) dateTime19);
        boolean boolean30 = dateTime5.isBefore((org.joda.time.ReadableInstant) mutableDateTime10);
        mutableDateTime10.addWeeks(54478);
        mutableDateTime10.addHours(558);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime24", (dateTime1.compareTo(mutableDateTime24) == 0) == dateTime1.equals(mutableDateTime24));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear(21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int10 = localTime6.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology11 = localTime6.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology11);
        org.joda.time.DurationField durationField13 = chronology11.eras();
        mutableDateTime5.setChronology(chronology11);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime5.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime17 = mutableDateTime16.toDateTimeISO();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = dateTime21.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime21.getZone();
        int int27 = dateTime17.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTime17.getZone();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime32 = localTime30.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int34 = localTime30.get(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localTime30.getChronology();
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology35, locale36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime17.toMutableDateTime(chronology38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter3.withChronology(chronology38);
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime46 = localTime44.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int48 = localTime44.get(dateTimeFieldType47);
        org.joda.time.Chronology chronology49 = localTime44.getChronology();
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology49, locale50);
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        java.lang.String str54 = dateTimeZone52.getNameKey(4460741743L);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) 86399999, dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime56 = org.joda.time.MutableDateTime.now(dateTimeZone52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter3.withZone(dateTimeZone52);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime();
        mutableDateTime58.addHours(100);
        int int61 = mutableDateTime58.getWeekyear();
        java.lang.String str62 = dateTimeFormatter3.print((org.joda.time.ReadableInstant) mutableDateTime58);
        org.joda.time.DateTimeField dateTimeField63 = mutableDateTime58.getRoundingField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime5 and mutableDateTime16", (mutableDateTime5.compareTo(mutableDateTime16) == 0) == mutableDateTime5.equals(mutableDateTime16));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        java.lang.String str7 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 'a', dateTimeZone14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter5.withZone(dateTimeZone14);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime26 = localTime23.withField(dateTimeFieldType24, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronolgy();
        java.lang.String str29 = localTime26.toString(dateTimeFormatter27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.DateTime dateTime35 = dateTime32.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime32.toMutableDateTime(dateTimeZone36);
        long long40 = dateTimeZone36.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 'a', dateTimeZone36);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter27.withZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone36);
        int int46 = dateTimeFormatter20.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime43, "Japanese (Japan)", 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter20.withPivotYear((java.lang.Integer) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter48.withPivotYear((java.lang.Integer) 54381815);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter48.withPivotYear((java.lang.Integer) 229);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and mutableDateTime15", (dateTime10.compareTo(mutableDateTime15) == 0) == dateTime10.equals(mutableDateTime15));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.minus(readableDuration4);
        org.joda.time.Instant instant6 = dateTime3.toInstant();
        org.joda.time.DateTime dateTime8 = dateTime3.minusSeconds(40002512);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and instant6", (dateTime3.compareTo(instant6) == 0) == dateTime3.equals(instant6));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime4 = dateTime3.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfSecond();
        org.joda.time.DateTime.Property property6 = dateTime3.minuteOfDay();
        long long7 = property6.remainder();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        org.joda.time.DateTime dateTime9 = property6.withMinimumValue();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        int int11 = dateTime9.getMonthOfYear();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfSecond();
        org.joda.time.DateTime.Property property18 = dateTime15.minuteOfDay();
        int int19 = property18.getLeapAmount();
        org.joda.time.DurationField durationField20 = property18.getLeapDurationField();
        org.joda.time.DateTime dateTime22 = property18.addWrapFieldToCopy(54391);
        boolean boolean23 = dateTime9.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(432000035L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime27.plus(readablePeriod28);
        org.joda.time.DateTime dateTime30 = dateTime29.toDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime30.toMutableDateTime();
        int int32 = mutableDateTime25.compareTo((org.joda.time.ReadableInstant) dateTime30);
        mutableDateTime25.addWeeks((int) 'a');
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime40 = localTime38.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int42 = localTime38.get(dateTimeFieldType41);
        org.joda.time.Chronology chronology43 = localTime38.getChronology();
        org.joda.time.LocalTime localTime44 = org.joda.time.LocalTime.now(chronology43);
        org.joda.time.DurationField durationField45 = chronology43.eras();
        mutableDateTime37.setChronology(chronology43);
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology43);
        org.joda.time.LocalTime.Property property48 = localTime47.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property48.getFieldType();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime25.property(dateTimeFieldType49);
        int int51 = dateTime22.get(dateTimeFieldType49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField45", Math.signum(durationField8.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField8)));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime2.toMutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.property(dateTimeFieldType6);
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.roundCeiling();
        mutableDateTime9.addWeeks(442);
        org.joda.time.DateTime dateTime12 = mutableDateTime9.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours(37);
        mutableDateTime9.setZone(dateTimeZone14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime9 and dateTime12", (mutableDateTime9.compareTo(dateTime12) == 0) == mutableDateTime9.equals(dateTime12));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        int int5 = mutableDateTime2.getDayOfMonth();
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTime(dateTimeZone7);
        mutableDateTime8.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.secondOfMinute();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a', chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        long long17 = mutableDateTime16.getMillis();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime16.add(readableDuration18, 39);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add(292278993);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime23);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.DateTime dateTime30 = dateTime27.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime27.toMutableDateTime(dateTimeZone31);
        long long35 = dateTimeZone31.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 'a', dateTimeZone31);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str42 = dateTimeZone40.getName((long) 54);
        java.lang.String str44 = dateTimeZone40.getShortName(26265600000L);
        org.joda.time.DateTime dateTime45 = dateTime36.toDateTime(dateTimeZone40);
        boolean boolean46 = mutableDateTime8.isBefore((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime36 and dateTime45", (dateTime36.compareTo(dateTime45) == 0) == dateTime36.equals(dateTime45));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime26 = localTime24.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int28 = localTime24.get(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = localTime24.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.months();
        org.joda.time.DurationField durationField31 = chronology29.days();
        org.joda.time.DateTimeField dateTimeField32 = chronology29.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField34 = chronology29.dayOfMonth();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.now(chronology29);
        org.joda.time.DurationField durationField36 = chronology29.hours();
        org.joda.time.DateTimeField dateTimeField37 = chronology29.era();
        org.joda.time.DurationField durationField38 = chronology29.weekyears();
        org.joda.time.MutableDateTime mutableDateTime39 = org.joda.time.MutableDateTime.now(chronology29);
        org.joda.time.DateTimeField dateTimeField40 = chronology29.halfdayOfDay();
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) dateTime17, chronology29);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField9 and durationField30", Math.signum(durationField9.compareTo(durationField30)) == -Math.signum(durationField30.compareTo(durationField9)));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withWeekOfWeekyear(10);
        int int5 = localDateTime1.getWeekyear();
        org.joda.time.Chronology chronology6 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1940L, chronology6);
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.halfdayOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField9", Math.signum(durationField8.compareTo(durationField9)) == -Math.signum(durationField9.compareTo(durationField8)));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        int int14 = mutableDateTime10.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone15);
        org.joda.time.LocalDate localDate19 = localDate7.withYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = localDate7.toString(dateTimeFormatter20);
        org.joda.time.LocalDate.Property property22 = localDate7.dayOfMonth();
        org.joda.time.LocalDate localDate23 = property22.roundFloorCopy();
        java.lang.String str24 = localDate23.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and mutableDateTime16", (mutableDateTime10.compareTo(mutableDateTime16) == 0) == mutableDateTime10.equals(mutableDateTime16));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.String str2 = dateTimeFormatter0.print((-259199980L));
        int int3 = dateTimeFormatter0.getDefaultYear();
        boolean boolean4 = dateTimeFormatter0.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 54359);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int13 = localTime9.get(dateTimeFieldType12);
        org.joda.time.Chronology chronology14 = localTime9.getChronology();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology14, locale15);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.plus(readablePeriod20);
        org.joda.time.DateTime.Property property22 = dateTime21.millisOfDay();
        org.joda.time.DurationField durationField23 = property22.getDurationField();
        org.joda.time.DateTimeField dateTimeField24 = property22.getField();
        long long27 = dateTimeField24.add((-259199980L), (int) (short) 1);
        java.lang.String str28 = dateTimeField24.toString();
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        int int30 = dateTimeField24.getMaximumShortTextLength(locale29);
        dateTimeParserBucket16.saveField(dateTimeField24, 0);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime37 = localTime34.withField(dateTimeFieldType35, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology39 = dateTimeFormatter38.getChronolgy();
        java.lang.String str40 = localTime37.toString(dateTimeFormatter38);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfCentury();
        org.joda.time.DateTime dateTime46 = dateTime43.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime43.toMutableDateTime(dateTimeZone47);
        long long51 = dateTimeZone47.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) 'a', dateTimeZone47);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter53 = dateTimeFormatter38.withZone(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeFormatter53.getZone();
        dateTimeParserBucket16.setZone(dateTimeZone54);
        org.joda.time.LocalTime localTime56 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int58 = localTime56.indexOf(dateTimeFieldType57);
        dateTimeParserBucket16.saveField(dateTimeFieldType57, 56);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket16.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.yearOfEra();
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.fromMillisOfDay((long) 411, chronology61);
        java.lang.String str64 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime63);
        org.joda.time.LocalTime localTime66 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.LocalTime.Property property67 = localTime66.millisOfDay();
        int int68 = localTime66.getSecondOfMinute();
        org.joda.time.LocalTime localTime69 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime71 = localTime69.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType72 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int73 = localTime69.get(dateTimeFieldType72);
        org.joda.time.Chronology chronology74 = localTime69.getChronology();
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.now(chronology74);
        org.joda.time.MutableDateTime mutableDateTime76 = new org.joda.time.MutableDateTime(chronology74);
        int int77 = mutableDateTime76.getSecondOfMinute();
        org.joda.time.LocalTime localTime79 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean81 = localTime79.isSupported(dateTimeFieldType80);
        org.joda.time.MutableDateTime.Property property82 = mutableDateTime76.property(dateTimeFieldType80);
        mutableDateTime76.setMillis((long) 54341029);
        org.joda.time.Chronology chronology85 = null;
        org.joda.time.DateTime dateTime86 = new org.joda.time.DateTime(chronology85);
        org.joda.time.DateTime.Property property87 = dateTime86.yearOfCentury();
        org.joda.time.DateTime dateTime89 = dateTime86.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone90 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime91 = dateTime86.toMutableDateTime(dateTimeZone90);
        org.joda.time.DateTime dateTime92 = mutableDateTime76.toDateTime(dateTimeZone90);
        org.joda.time.DateTimeFieldType dateTimeFieldType93 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int94 = mutableDateTime76.get(dateTimeFieldType93);
        org.joda.time.LocalTime.Property property95 = localTime66.property(dateTimeFieldType93);
        int int96 = localTime66.size();
        org.joda.time.ReadablePeriod readablePeriod97 = null;
        org.joda.time.LocalTime localTime98 = localTime66.minus(readablePeriod97);
        java.lang.String str99 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localTime66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime19 and mutableDateTime48", (dateTime19.compareTo(mutableDateTime48) == 0) == dateTime19.equals(mutableDateTime48));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime8.add(readablePeriod20, (int) (short) 0);
        org.joda.time.Chronology chronology23 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a', chronology27);
        mutableDateTime28.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime28.secondOfDay();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) 'a', chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.yearOfCentury();
        mutableDateTime34.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology38 = null;
        mutableDateTime34.setChronology(chronology38);
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime34.weekyear();
        org.joda.time.MutableDateTime mutableDateTime42 = property40.add((long) 1);
        mutableDateTime42.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        mutableDateTime42.add(readablePeriod45);
        org.joda.time.DateTime dateTime47 = mutableDateTime42.toDateTime();
        java.util.TimeZone timeZone49 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone49);
        mutableDateTime42.setZone(dateTimeZone51);
        mutableDateTime28.setZone(dateTimeZone51);
        org.joda.time.Chronology chronology54 = chronology23.withZone(dateTimeZone51);
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate((long) 1969, chronology23);
        org.joda.time.DateTimeField dateTimeField56 = chronology23.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField57 = chronology23.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField58 = chronology23.weekyear();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime34 and dateTime47", (mutableDateTime34.compareTo(dateTime47) == 0) == mutableDateTime34.equals(dateTime47));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval11 = property7.toInterval();
        org.joda.time.LocalDate localDate12 = property7.getLocalDate();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((long) 'a', chronology14);
        mutableDateTime15.addWeekyears((int) (byte) -1);
        int int18 = mutableDateTime15.getDayOfMonth();
        int int19 = mutableDateTime15.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime15.toMutableDateTime(dateTimeZone20);
        long long25 = dateTimeZone20.convertLocalToUTC((long) (byte) 0, true, 5050L);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(chronology27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.plus(readablePeriod29);
        org.joda.time.DateTime.Property property31 = dateTime30.millisOfDay();
        org.joda.time.DurationField durationField32 = property31.getDurationField();
        org.joda.time.DateTimeField dateTimeField33 = property31.getField();
        long long36 = dateTimeField33.add((-259199980L), (int) (short) 1);
        boolean boolean37 = dateTimeField33.isSupported();
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.util.Locale locale39 = locale38.stripExtensions();
        java.util.Locale locale40 = java.util.Locale.ROOT;
        java.lang.String str41 = locale39.getDisplayVariant(locale40);
        java.lang.String str42 = locale39.getDisplayName();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime46 = dateTime44.plus(readablePeriod45);
        org.joda.time.DateTime.Property property47 = dateTime46.millisOfDay();
        org.joda.time.DurationField durationField48 = property47.getDurationField();
        org.joda.time.DateTimeField dateTimeField49 = property47.getField();
        long long52 = dateTimeField49.add((-259199980L), (int) (short) 1);
        boolean boolean53 = dateTimeField49.isSupported();
        java.util.Locale.Builder builder55 = new java.util.Locale.Builder();
        java.util.Locale locale56 = builder55.build();
        java.util.Locale locale57 = builder55.build();
        java.lang.String str58 = dateTimeField49.getAsText(10, locale57);
        java.lang.String str59 = locale39.getDisplayCountry(locale57);
        int int60 = dateTimeField33.getMaximumShortTextLength(locale57);
        java.lang.String str61 = dateTimeZone20.getShortName(47041L, locale57);
        int int62 = property7.getMaximumTextLength(locale57);
        org.joda.time.LocalDate localDate63 = property7.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate65 = localDate63.minusYears(18000010);
        org.joda.time.Interval interval66 = localDate65.toInterval();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime21", (mutableDateTime15.compareTo(mutableDateTime21) == 0) == mutableDateTime15.equals(mutableDateTime21));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        long long19 = dateTimeField16.add((-259199980L), (int) (short) 1);
        java.lang.String str20 = dateTimeField16.toString();
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        int int22 = dateTimeField16.getMaximumShortTextLength(locale21);
        dateTimeParserBucket8.saveField(dateTimeField16, 0);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime29 = localTime26.withField(dateTimeFieldType27, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology31 = dateTimeFormatter30.getChronolgy();
        java.lang.String str32 = localTime29.toString(dateTimeFormatter30);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.DateTime.Property property36 = dateTime35.yearOfCentury();
        org.joda.time.DateTime dateTime38 = dateTime35.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime35.toMutableDateTime(dateTimeZone39);
        long long43 = dateTimeZone39.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 'a', dateTimeZone39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter30.withZone(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTimeFormatter45.getZone();
        dateTimeParserBucket8.setZone(dateTimeZone46);
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int50 = localTime48.indexOf(dateTimeFieldType49);
        dateTimeParserBucket8.saveField(dateTimeFieldType49, 56);
        org.joda.time.Chronology chronology53 = dateTimeParserBucket8.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.yearOfEra();
        java.util.Locale locale58 = new java.util.Locale("", "seconds");
        java.lang.String str59 = dateTimeField54.getAsShortText(50266230, locale58);
        java.lang.String str60 = locale58.getLanguage();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime40", (dateTime11.compareTo(mutableDateTime40) == 0) == dateTime11.equals(mutableDateTime40));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay6 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes(2);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = dateTime3.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime3.era();
        org.joda.time.LocalTime localTime16 = dateTime3.toLocalTime();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTime();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime22 = dateTime18.withDurationAdded(readableDuration20, (-8));
        org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks(8);
        org.joda.time.DateTime dateTime26 = dateTime22.minusMonths(54341029);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a', chronology28);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.yearOfCentury();
        mutableDateTime29.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology33 = null;
        mutableDateTime29.setChronology(chronology33);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime29.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = mutableDateTime29.getRoundingField();
        org.joda.time.ReadableDuration readableDuration37 = null;
        mutableDateTime29.add(readableDuration37);
        int int39 = dateTime22.compareTo((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.DateTime dateTime42 = dateTime22.withPeriodAdded(readablePeriod40, 5922);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateTime dateTime45 = dateTime22.withField(dateTimeFieldType43, 18);
        org.joda.time.DateTime dateTime47 = dateTime3.withField(dateTimeFieldType43, 54650);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and dateTime14", (dateTime3.compareTo(dateTime14) == 0) == dateTime3.equals(dateTime14));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        org.joda.time.DateTime dateTime7 = dateTime3.withWeekyear(21);
        org.joda.time.DateTime dateTime9 = dateTime3.minusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(2022);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.Chronology chronology21 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology22 = chronology21.withUTC();
        org.joda.time.DateTime dateTime23 = dateTime9.withChronology(chronology22);
        org.joda.time.DurationField durationField24 = chronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.dayOfMonth();
        java.lang.String str27 = dateTimeField26.toString();
        int int29 = dateTimeField26.get(55352L);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime23", (dateTime9.compareTo(dateTime23) == 0) == dateTime9.equals(dateTime23));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.addHours(0);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.toMutableDateTimeISO();
        mutableDateTime3.addHours(86399999);
        mutableDateTime3.add(4460811586L);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now();
        mutableDateTime8.addHours(0);
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime8.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime8.property(dateTimeFieldType13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int21 = localTime17.get(dateTimeFieldType20);
        org.joda.time.Chronology chronology22 = localTime17.getChronology();
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology22, locale23);
        org.joda.time.Chronology chronology25 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology26 = chronology25.withUTC();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.dayOfWeek();
        mutableDateTime8.setChronology(chronology25);
        mutableDateTime3.setChronology(chronology25);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime3.year();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime0 and mutableDateTime8", (mutableDateTime0.compareTo(mutableDateTime8) == 0) == mutableDateTime0.equals(mutableDateTime8));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.plusYears((int) (byte) 10);
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology8);
        boolean boolean11 = localTime9.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.plus(readablePeriod12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime5, chronology14);
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime15.toMutableDateTimeISO();
        int int17 = mutableDateTime16.getEra();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime16.weekOfWeekyear();
        java.lang.Object obj19 = mutableDateTime16.clone();
        mutableDateTime16.addMillis(54361031);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.plus(readablePeriod24);
        org.joda.time.DateTime dateTime27 = dateTime25.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime29 = dateTime25.withDayOfMonth(8);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMillis(21);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.DateTime dateTime33 = dateTime29.minus(readableDuration32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.minus(readableDuration36);
        int int38 = dateTime29.compareTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.DateTime dateTime40 = dateTime29.withMillisOfDay((int) ' ');
        org.joda.time.DateTime dateTime41 = dateTime29.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime43 = dateTime41.withWeekOfWeekyear(24);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime43);
        mutableDateTime16.setYear(19380000);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and mutableDateTime15", (dateTime5.compareTo(mutableDateTime15) == 0) == dateTime5.equals(mutableDateTime15));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        long long9 = dateTimeField6.add((-259199980L), (int) (short) 1);
        java.lang.String str10 = dateTimeField6.toString();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        int int12 = dateTimeField6.getMaximumShortTextLength(locale11);
        java.lang.String str14 = dateTimeField6.getAsText((long) 45);
        long long17 = dateTimeField6.add(0L, (-62135596800000L));
        java.util.Locale locale18 = java.util.Locale.ITALY;
        int int19 = dateTimeField6.getMaximumShortTextLength(locale18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology21);
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        org.joda.time.LocalTime localTime24 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime25 = property23.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.withMaximumValue();
        org.joda.time.LocalTime localTime27 = property23.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime28 = property23.roundHalfEvenCopy();
        org.joda.time.Interval interval29 = property23.toInterval();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime33 = localTime31.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int35 = localTime31.get(dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = localTime31.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.months();
        org.joda.time.DurationField durationField38 = chronology36.days();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField41 = chronology36.dayOfMonth();
        org.joda.time.DurationField durationField42 = chronology36.centuries();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = new org.joda.time.MutableDateTime((long) 'a', chronology44);
        org.joda.time.MutableDateTime.Property property46 = mutableDateTime45.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField47 = property46.getField();
        java.util.Locale locale49 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = new org.joda.time.MutableDateTime((long) 'a', chronology51);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime52.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime54 = property53.roundHalfEven();
        java.util.Locale locale56 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime57 = property53.set("22", locale56);
        java.lang.String str58 = locale49.getDisplayScript(locale56);
        boolean boolean59 = locale49.hasExtensions();
        java.lang.String str60 = dateTimeField47.getAsText((long) 101, locale49);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) 897, chronology36, locale49);
        int int62 = property23.getMaximumShortTextLength(locale49);
        java.lang.String str63 = locale18.getDisplayLanguage(locale49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime40", (dateTime1.compareTo(mutableDateTime40) == 0) == dateTime1.equals(mutableDateTime40));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale.Builder builder5 = builder4.clear();
        org.joda.time.tz.NameProvider nameProvider6 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str10 = nameProvider6.getShortName(locale7, "United States", "1970-01-01T00:00:00.000Z");
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getCountry();
        java.lang.String str15 = nameProvider6.getShortName(locale11, "English", "february 21, 2022_FEBRUARY 21, 2022");
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getDisplayScript();
        java.lang.String str20 = nameProvider6.getName(locale16, "12:00 AM", "4");
        java.lang.String str21 = locale16.getLanguage();
        java.lang.String str22 = locale16.getScript();
        java.util.Locale.Builder builder23 = builder5.setLocale(locale16);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.LocalDate localDate30 = localDate24.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property31 = localDate24.yearOfEra();
        org.joda.time.LocalDate localDate32 = property31.roundCeilingCopy();
        org.joda.time.LocalDate localDate34 = property31.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval35 = property31.toInterval();
        org.joda.time.LocalDate localDate36 = property31.getLocalDate();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 'a', chronology38);
        mutableDateTime39.addWeekyears((int) (byte) -1);
        int int42 = mutableDateTime39.getDayOfMonth();
        int int43 = mutableDateTime39.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime39.toMutableDateTime(dateTimeZone44);
        long long49 = dateTimeZone44.convertLocalToUTC((long) (byte) 0, true, 5050L);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.DateTime dateTime54 = dateTime52.plus(readablePeriod53);
        org.joda.time.DateTime.Property property55 = dateTime54.millisOfDay();
        org.joda.time.DurationField durationField56 = property55.getDurationField();
        org.joda.time.DateTimeField dateTimeField57 = property55.getField();
        long long60 = dateTimeField57.add((-259199980L), (int) (short) 1);
        boolean boolean61 = dateTimeField57.isSupported();
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale64 = java.util.Locale.ROOT;
        java.lang.String str65 = locale63.getDisplayVariant(locale64);
        java.lang.String str66 = locale63.getDisplayName();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime(chronology67);
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.DateTime dateTime70 = dateTime68.plus(readablePeriod69);
        org.joda.time.DateTime.Property property71 = dateTime70.millisOfDay();
        org.joda.time.DurationField durationField72 = property71.getDurationField();
        org.joda.time.DateTimeField dateTimeField73 = property71.getField();
        long long76 = dateTimeField73.add((-259199980L), (int) (short) 1);
        boolean boolean77 = dateTimeField73.isSupported();
        java.util.Locale.Builder builder79 = new java.util.Locale.Builder();
        java.util.Locale locale80 = builder79.build();
        java.util.Locale locale81 = builder79.build();
        java.lang.String str82 = dateTimeField73.getAsText(10, locale81);
        java.lang.String str83 = locale63.getDisplayCountry(locale81);
        int int84 = dateTimeField57.getMaximumShortTextLength(locale81);
        java.lang.String str85 = dateTimeZone44.getShortName(47041L, locale81);
        int int86 = property31.getMaximumTextLength(locale81);
        java.lang.String str88 = locale81.getExtension('x');
        java.util.Locale.Builder builder89 = builder5.setLocale(locale81);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime39 and mutableDateTime45", (mutableDateTime39.compareTo(mutableDateTime45) == 0) == mutableDateTime39.equals(mutableDateTime45));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology6);
        int int9 = mutableDateTime8.getSecondOfMinute();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean13 = localTime11.isSupported(dateTimeFieldType12);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime8.property(dateTimeFieldType12);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int20 = localTime16.get(dateTimeFieldType19);
        org.joda.time.Chronology chronology21 = localTime16.getChronology();
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology21, locale22);
        mutableDateTime8.setChronology(chronology21);
        org.joda.time.MutableDateTime mutableDateTime25 = org.joda.time.MutableDateTime.now(chronology21);
        org.joda.time.DateTimeField dateTimeField26 = chronology21.yearOfCentury();
        boolean boolean27 = dateTimeFieldType0.isSupported(chronology21);
        org.joda.time.DateTimeField dateTimeField28 = chronology21.dayOfWeek();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime31 = localTime29.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int33 = localTime29.get(dateTimeFieldType32);
        org.joda.time.Chronology chronology34 = localTime29.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology34.year();
        long long38 = dateTimeField36.roundFloor((long) 7);
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = dateTimeField36.getAsText((-259199979L), locale40);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime((long) 'a', chronology43);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime44.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime46 = property45.roundHalfEven();
        java.util.Locale locale48 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime49 = property45.set("22", locale48);
        mutableDateTime49.addYears(10);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfCentury();
        org.joda.time.DateTime dateTime55 = property54.withMinimumValue();
        org.joda.time.DateTime dateTime57 = dateTime55.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime59 = dateTime55.plusMillis(1);
        mutableDateTime49.setDate((org.joda.time.ReadableInstant) dateTime59);
        org.joda.time.ReadablePeriod readablePeriod61 = null;
        mutableDateTime49.add(readablePeriod61, (int) (short) 0);
        org.joda.time.Chronology chronology64 = mutableDateTime49.getChronology();
        org.joda.time.DateTimeField dateTimeField65 = chronology64.dayOfYear();
        java.util.Locale.Builder builder66 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder69 = builder66.setExtension('a', "");
        java.util.Locale.Builder builder70 = builder66.clear();
        java.util.Locale locale71 = builder66.build();
        java.lang.String str72 = locale71.getScript();
        int int73 = dateTimeField65.getMaximumShortTextLength(locale71);
        java.lang.String str74 = locale71.getISO3Country();
        java.lang.String str75 = locale40.getDisplayName(locale71);
        int int76 = dateTimeField28.getMaximumShortTextLength(locale40);
        java.lang.String str77 = dateTimeField28.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime8 and dateTime53", (mutableDateTime8.compareTo(dateTime53) == 0) == mutableDateTime8.equals(dateTime53));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval11 = property7.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property7.getFieldType();
        org.joda.time.LocalDate localDate14 = property7.setCopy("54361031");
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra(3);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = dateTime18.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate.Property property25 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate27 = localDate14.withDayOfYear(311);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime23", (dateTime18.compareTo(mutableDateTime23) == 0) == dateTime18.equals(mutableDateTime23));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime1.toMutableDateTime(dateTimeZone5);
        long long9 = dateTimeZone5.adjustOffset((long) 52, false);
        java.lang.String str11 = dateTimeZone5.getNameKey((long) 54775766);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime6", (dateTime1.compareTo(mutableDateTime6) == 0) == dateTime1.equals(mutableDateTime6));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        mutableDateTime2.addWeekyears((int) (byte) -1);
        int int5 = mutableDateTime2.getDayOfMonth();
        int int6 = mutableDateTime2.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime2.toMutableDateTime(dateTimeZone7);
        mutableDateTime8.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime8.secondOfMinute();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) 'a', chronology13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime14.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime16 = property15.roundHalfEven();
        long long17 = mutableDateTime16.getMillis();
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime16.add(readableDuration18, 39);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = property21.add(292278993);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) mutableDateTime23);
        int int25 = mutableDateTime8.getMinuteOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(chronology26);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean31 = localTime29.isSupported(dateTimeFieldType30);
        java.lang.String str32 = dateTimeFieldType30.getName();
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType30.getDurationType();
        org.joda.time.DateTime dateTime35 = dateTime27.withFieldAdded(durationFieldType33, 17);
        mutableDateTime8.add(durationFieldType33, 1000736783);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) 'a', chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime40.yearOfCentury();
        mutableDateTime40.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology44 = null;
        mutableDateTime40.setChronology(chronology44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime((long) 'a', chronology47);
        mutableDateTime48.addWeekyears((int) (byte) -1);
        int int51 = mutableDateTime48.getDayOfMonth();
        mutableDateTime48.setWeekyear((int) (short) 0);
        boolean boolean54 = mutableDateTime40.isAfter((org.joda.time.ReadableInstant) mutableDateTime48);
        long long55 = mutableDateTime48.getMillis();
        org.joda.time.DurationFieldType durationFieldType56 = org.joda.time.DurationFieldType.years();
        mutableDateTime48.add(durationFieldType56, 40);
        org.joda.time.LocalTime localTime60 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime62 = localTime60.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int64 = localTime60.get(dateTimeFieldType63);
        org.joda.time.Chronology chronology65 = localTime60.getChronology();
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology65, locale66);
        org.joda.time.DateTimeField dateTimeField68 = chronology65.year();
        org.joda.time.DateTimeZone dateTimeZone69 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.UTC;
        long long72 = dateTimeZone69.getMillisKeepLocal(dateTimeZone70, (long) '#');
        java.lang.String str73 = dateTimeZone70.getID();
        int int75 = dateTimeZone70.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology76 = chronology65.withZone(dateTimeZone70);
        org.joda.time.DurationField durationField77 = durationFieldType56.getField(chronology76);
        org.joda.time.DateTimeField dateTimeField78 = chronology76.millisOfSecond();
        org.joda.time.DurationField durationField79 = chronology76.years();
        org.joda.time.DurationField durationField80 = chronology76.years();
        org.joda.time.DateTimeField dateTimeField81 = chronology76.dayOfMonth();
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime(chronology76);
        org.joda.time.DateTime dateTime83 = org.joda.time.DateTime.now(chronology76);
        org.joda.time.DateTimeField dateTimeField84 = chronology76.millisOfSecond();
        boolean boolean85 = durationFieldType33.isSupported(chronology76);
        org.joda.time.DateTimeField dateTimeField86 = chronology76.millisOfSecond();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime27 and dateTime82", (dateTime27.compareTo(dateTime82) == 0) == dateTime27.equals(dateTime82));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = dateTime3.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime3.toMutableDateTime(dateTimeZone7);
        int int11 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime8, "\ufffd\ufffd\ufffd\ufffd 12:00 AM", 100);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology18, locale19);
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime8.toMutableDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField22 = chronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology18.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = chronology18.centuryOfEra();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtStartOfDay(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate26.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property33 = localDate26.yearOfEra();
        org.joda.time.LocalDate localDate34 = property33.roundCeilingCopy();
        org.joda.time.LocalDate localDate36 = property33.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDate localDate38 = localDate36.plusMonths(0);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDate localDate40 = localDate36.minus(readablePeriod39);
        org.joda.time.LocalDate.Property property41 = localDate36.weekOfWeekyear();
        org.joda.time.LocalDate localDate43 = localDate36.plusWeeks(844);
        int[] intArray45 = chronology18.get((org.joda.time.ReadablePartial) localDate43, (long) 47);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime3 and mutableDateTime8", (dateTime3.compareTo(mutableDateTime8) == 0) == dateTime3.equals(mutableDateTime8));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        mutableDateTime10.setSecondOfDay(22);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime10.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime25 = property23.add((long) 25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime((long) 'a', chronology27);
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime28.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime30 = property29.roundHalfEven();
        java.util.Locale locale32 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime33 = property29.set("22", locale32);
        mutableDateTime33.addYears(10);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.DateTime dateTime39 = property38.withMinimumValue();
        org.joda.time.DateTime dateTime41 = dateTime39.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime43 = dateTime39.plusMillis(1);
        mutableDateTime33.setDate((org.joda.time.ReadableInstant) dateTime43);
        org.joda.time.DateTime dateTime46 = dateTime43.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime47 = dateTime46.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property48 = dateTime47.yearOfEra();
        org.joda.time.DateTime dateTime49 = property48.withMinimumValue();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        org.joda.time.DateTime dateTime55 = dateTime53.minusYears(2);
        org.joda.time.DateTime dateTime57 = dateTime53.withWeekyear(21);
        org.joda.time.DateTime dateTime59 = dateTime53.minusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime61 = dateTime59.withWeekyear(2022);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime65 = localTime63.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int67 = localTime63.get(dateTimeFieldType66);
        org.joda.time.Chronology chronology68 = localTime63.getChronology();
        java.util.Locale locale69 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology68, locale69);
        org.joda.time.Chronology chronology71 = dateTimeParserBucket70.getChronology();
        org.joda.time.Chronology chronology72 = chronology71.withUTC();
        org.joda.time.DateTime dateTime73 = dateTime59.withChronology(chronology72);
        org.joda.time.DurationField durationField74 = chronology72.seconds();
        org.joda.time.DateTimeField dateTimeField75 = chronology72.weekOfWeekyear();
        org.joda.time.DateTime dateTime76 = dateTime49.toDateTime(chronology72);
        int int77 = property23.getDifference((org.joda.time.ReadableInstant) dateTime76);
        boolean boolean78 = dateTime76.isEqualNow();
        java.util.Date date79 = dateTime76.toDate();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime59 and dateTime73", (dateTime59.compareTo(dateTime73) == 0) == dateTime59.equals(dateTime73));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime5 = property2.addWrapFieldToCopy(20);
        org.joda.time.DateTime dateTime6 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime.Property property8 = dateTime6.property(dateTimeFieldType7);
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.DateTime dateTime11 = property8.addToCopy(2);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(20);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        int int15 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime13.withYearOfEra(31);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = org.joda.time.format.DateTimeFormat.fullDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter18.withDefaultYear(1998);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter20.withOffsetParsed();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.now(chronology27);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(chronology27);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter21.withChronology(chronology27);
        org.joda.time.DateTimeField dateTimeField31 = chronology27.hourOfHalfday();
        int int32 = dateTimeField31.getMaximumValue();
        java.util.Locale locale37 = new java.util.Locale("25", "2022-02-21T15:06:50.800", "2022-02-21T15:06:06.289Z");
        java.lang.String str38 = dateTimeField31.getAsText((-51L), locale37);
        int int39 = dateTime17.get(dateTimeField31);
        int int42 = dateTimeField31.getDifference((long) 756, (-51L));
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("97");
        int int45 = dateTimeField31.getMaximumTextLength(locale44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime1 and mutableDateTime29", (dateTime1.compareTo(mutableDateTime29) == 0) == dateTime1.equals(mutableDateTime29));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        mutableDateTime7.add(readablePeriod19, (int) (short) 0);
        org.joda.time.Chronology chronology22 = mutableDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfYear();
        org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        long long28 = dateTimeZone25.getMillisKeepLocal(dateTimeZone26, (long) '#');
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.now(dateTimeZone26);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((java.lang.Object) dateTime24, dateTimeZone26);
        java.lang.String str32 = dateTime30.toString("\ub144\uc6d4\uc77c\ubaa9\uc694\uc77c\uc624\uc804\uc2dc\ubd84\ucd08 +00:00");
        int int33 = dateTime30.getMinuteOfDay();
        org.joda.time.DateTime.Property property34 = dateTime30.weekyear();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime38 = localTime36.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int40 = localTime36.get(dateTimeFieldType39);
        org.joda.time.Chronology chronology41 = localTime36.getChronology();
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology41, locale42);
        long long45 = dateTimeParserBucket43.computeMillis(false);
        long long48 = dateTimeParserBucket43.computeMillis(false, "1970-01-01T00:00:00.000Z");
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology50);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalTime localTime54 = localTime51.withPeriodAdded(readablePeriod52, (int) (byte) -1);
        org.joda.time.LocalTime.Property property55 = localTime54.millisOfSecond();
        org.joda.time.LocalTime localTime56 = property55.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) 'a', chronology60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.yearOfCentury();
        int int63 = property62.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime64 = property62.roundHalfEven();
        java.util.Locale locale65 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Set<java.lang.String> strSet66 = locale65.getUnicodeLocaleAttributes();
        int int67 = property62.getMaximumShortTextLength(locale65);
        dateTimeParserBucket43.saveField(dateTimeFieldType57, "Chinese", locale65);
        org.joda.time.LocalTime localTime70 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime72 = localTime70.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int74 = localTime70.get(dateTimeFieldType73);
        org.joda.time.Chronology chronology75 = localTime70.getChronology();
        java.util.Locale locale76 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology75, locale76);
        org.joda.time.Chronology chronology78 = dateTimeParserBucket77.getChronology();
        java.util.Locale locale79 = dateTimeParserBucket77.getLocale();
        java.util.Set<java.lang.String> strSet80 = locale79.getUnicodeLocaleKeys();
        java.lang.String str81 = locale79.getLanguage();
        java.lang.String str82 = locale65.getDisplayName(locale79);
        java.lang.String str83 = locale65.getDisplayLanguage();
        java.lang.String str84 = property34.getAsText(locale65);
        org.joda.time.DateTimeField dateTimeField85 = property34.getField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime30", (dateTime11.compareTo(dateTime30) == 0) == dateTime11.equals(dateTime30));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime.Property property4 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.DateTime dateTime7 = property4.addWrapFieldToCopy((int) '#');
        org.joda.time.DateTime dateTime9 = dateTime7.plusWeeks(53);
        org.joda.time.DateTime.Property property10 = dateTime7.secondOfMinute();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime7.plus(readableDuration11);
        org.joda.time.DateTime.Property property13 = dateTime7.secondOfDay();
        org.joda.time.DateTime.Property property14 = dateTime7.hourOfDay();
        int int15 = dateTime7.getDayOfWeek();
        org.joda.time.DateTime dateTime17 = dateTime7.minusHours(0);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime20 = localTime18.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int22 = localTime18.get(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localTime18.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.months();
        org.joda.time.DurationField durationField25 = chronology23.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime17, chronology23);
        org.joda.time.DateTimeField dateTimeField28 = chronology23.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime7 and mutableDateTime27", (dateTime7.compareTo(mutableDateTime27) == 0) == dateTime7.equals(mutableDateTime27));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime3 = property2.withMinimumValue();
        org.joda.time.DateTime dateTime5 = dateTime3.minusYears(2);
        int int6 = dateTime5.getDayOfMonth();
        org.joda.time.DateTime.Property property7 = dateTime5.year();
        org.joda.time.DateTime dateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) dateTime8);
        org.joda.time.Chronology chronology10 = mutableDateTime9.getChronology();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int) '4');
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) 'a', chronology18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.yearOfCentury();
        mutableDateTime19.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology23 = null;
        mutableDateTime19.setChronology(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTime();
        org.joda.time.DateTime.Property property28 = dateTime27.monthOfYear();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology29);
        org.joda.time.DateTime.Property property31 = dateTime30.yearOfCentury();
        org.joda.time.DateTime dateTime32 = property31.withMinimumValue();
        org.joda.time.DateTime dateTime34 = dateTime32.minusYears(2);
        org.joda.time.DateTime dateTime36 = dateTime32.withWeekyear(21);
        int int37 = dateTime27.compareTo((org.joda.time.ReadableInstant) dateTime32);
        mutableDateTime19.setTime((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime41 = localTime39.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int43 = localTime39.get(dateTimeFieldType42);
        org.joda.time.Chronology chronology44 = localTime39.getChronology();
        org.joda.time.LocalTime localTime45 = org.joda.time.LocalTime.now(chronology44);
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime(chronology44);
        mutableDateTime19.setChronology(chronology44);
        org.joda.time.DateTime dateTime48 = dateTime16.withChronology(chronology44);
        org.joda.time.DateTime dateTime49 = dateTime48.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.DateTime dateTime53 = property52.withMinimumValue();
        org.joda.time.DateTime dateTime55 = dateTime53.minusYears(2);
        org.joda.time.DateTime dateTime57 = dateTime53.withWeekyear(21);
        org.joda.time.DateTime.Property property58 = dateTime57.yearOfCentury();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime(chronology59);
        org.joda.time.DateTime.Property property61 = dateTime60.yearOfCentury();
        org.joda.time.DateTime dateTime63 = dateTime60.minusYears(0);
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime66 = localTime64.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int68 = localTime64.get(dateTimeFieldType67);
        org.joda.time.DateTime dateTime69 = dateTime63.withFields((org.joda.time.ReadablePartial) localTime64);
        boolean boolean70 = dateTime57.isAfter((org.joda.time.ReadableInstant) dateTime69);
        org.joda.time.DateTime dateTime72 = dateTime69.minusYears(40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime75 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType76 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean77 = localTime75.isSupported(dateTimeFieldType76);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder80 = dateTimeFormatterBuilder73.appendSignedDecimal(dateTimeFieldType76, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder82 = dateTimeFormatterBuilder73.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder84 = dateTimeFormatterBuilder82.appendClockhourOfDay((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType85 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str86 = dateTimeFieldType85.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder87 = dateTimeFormatterBuilder82.appendShortText(dateTimeFieldType85);
        org.joda.time.DateTime dateTime89 = dateTime69.withField(dateTimeFieldType85, 25);
        org.joda.time.DurationFieldType durationFieldType90 = dateTimeFieldType85.getRangeDurationType();
        java.lang.String str91 = dateTimeFieldType85.getName();
        org.joda.time.DateTime dateTime93 = dateTime48.withField(dateTimeFieldType85, 569);
        org.joda.time.DateTimeZone dateTimeZone95 = org.joda.time.DateTimeZone.forOffsetMillis(19380000);
        java.lang.String str96 = dateTimeZone95.getID();
        org.joda.time.DateTime dateTime97 = dateTime48.toDateTime(dateTimeZone95);
        org.joda.time.Chronology chronology98 = chronology10.withZone(dateTimeZone95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime16 and dateTime97", (dateTime16.compareTo(dateTime97) == 0) == dateTime16.equals(dateTime97));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DurationField durationField40 = chronology38.eras();
        org.joda.time.DurationField durationField41 = chronology38.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField39 and durationField40", Math.signum(durationField39.compareTo(durationField40)) == -Math.signum(durationField40.compareTo(durationField39)));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology26);
        org.joda.time.DurationField durationField29 = chronology26.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = chronology26.dayOfMonth();
        org.joda.time.DurationField durationField31 = durationFieldType18.getField(chronology26);
        java.lang.String str32 = durationFieldType18.toString();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField29 and durationField31", (durationField29.compareTo(durationField31) == 0) == durationField29.equals(durationField31));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int4 = localTime0.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = localTime0.getChronology();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(chronology5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology5);
        int int8 = mutableDateTime7.getSecondOfMinute();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean12 = localTime10.isSupported(dateTimeFieldType11);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime7.property(dateTimeFieldType11);
        int int14 = mutableDateTime7.getWeekyear();
        java.util.TimeZone timeZone16 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long21 = dateTimeZone18.adjustOffset((-62166787199903L), false);
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone18);
        mutableDateTime7.setZoneRetainFields(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime7.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(54435852);
        org.joda.time.DateTime dateTime27 = mutableDateTime7.toDateTime(dateTimeZone26);
        mutableDateTime7.setYear(54634254);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime22 and dateTime27", (mutableDateTime22.compareTo(dateTime27) == 0) == mutableDateTime22.equals(dateTime27));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.months();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfHalfday();
        org.joda.time.DurationField durationField9 = chronology6.weekyears();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 43, chronology6);
        org.joda.time.Chronology chronology11 = mutableDateTime10.getChronology();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime10.secondOfMinute();
        java.lang.Object obj13 = null;
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int18 = localTime14.get(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = localTime14.getChronology();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        long long24 = chronology19.add(readablePeriod21, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(obj13, chronology19);
        org.joda.time.DateTimeZone dateTimeZone26 = chronology19.getZone();
        org.joda.time.DurationField durationField27 = chronology19.eras();
        mutableDateTime10.setChronology(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField7 and durationField27", Math.signum(durationField7.compareTo(durationField27)) == -Math.signum(durationField27.compareTo(durationField7)));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology6, locale7);
        org.joda.time.DateTimeField dateTimeField9 = chronology6.year();
        org.joda.time.DurationField durationField10 = chronology6.days();
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology6);
        org.joda.time.DateTimeField dateTimeField12 = chronology6.year();
        org.joda.time.DurationField durationField13 = chronology6.eras();
        org.joda.time.DateTimeField dateTimeField14 = chronology6.secondOfMinute();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField10 and durationField13", Math.signum(durationField10.compareTo(durationField13)) == -Math.signum(durationField13.compareTo(durationField10)));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.dayOfWeek();
        org.joda.time.DateTime dateTime4 = mutableDateTime2.toDateTime();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        mutableDateTime2.add(readablePeriod5, 54409443);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        mutableDateTime9.add(readablePeriod10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.minus(readableDuration14);
        org.joda.time.DateTime dateTime18 = dateTime15.withDurationAdded((long) 99, (int) (short) 0);
        boolean boolean19 = mutableDateTime9.isBefore((org.joda.time.ReadableInstant) dateTime15);
        mutableDateTime9.addSeconds((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        mutableDateTime9.add(readablePeriod22, 2122);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int30 = localTime26.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.now(chronology31);
        org.joda.time.DurationField durationField33 = chronology31.eras();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.dayOfMonth();
        mutableDateTime9.setChronology(chronology31);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) mutableDateTime2, chronology31);
        org.joda.time.DurationField durationField37 = chronology31.days();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField33, durationField37, and durationField33", !(durationField33.compareTo(durationField37) == 0) || (Math.signum(durationField33.compareTo(durationField33)) == Math.signum(durationField37.compareTo(durationField33))));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.TimeOfDay timeOfDay6 = dateTime3.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime3.minusMinutes(2);
        org.joda.time.DateTime dateTime10 = dateTime3.withYearOfCentury((int) (short) 1);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = dateTime3.toDateTime(dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.seconds();
        java.lang.String str16 = durationFieldType15.toString();
        org.joda.time.DateTime dateTime18 = dateTime3.withFieldAdded(durationFieldType15, 42);
        org.joda.time.DateTime.Property property19 = dateTime18.centuryOfEra();
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology20.eras();
        org.joda.time.DurationField durationField23 = chronology20.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField22, durationField23, and durationField22", !(durationField22.compareTo(durationField23) == 0) || (Math.signum(durationField22.compareTo(durationField22)) == Math.signum(durationField23.compareTo(durationField22))));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology8, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.secondOfDay();
        org.joda.time.DurationField durationField13 = chronology11.halfdays();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) '#', chronology11);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        long long18 = chronology11.add(readablePeriod15, 4741L, (-101));
        org.joda.time.DateTimeField dateTimeField19 = chronology11.yearOfEra();
        org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(chronology11);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology23);
        boolean boolean26 = localTime24.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime28 = localTime24.plus(readablePeriod27);
        org.joda.time.Chronology chronology29 = localTime28.getChronology();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("5");
        java.lang.String str32 = locale31.getVariant();
        java.lang.String str33 = locale31.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) 56, chronology29, locale31);
        java.lang.String str35 = locale31.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime39 = localTime37.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int41 = localTime37.get(dateTimeFieldType40);
        org.joda.time.Chronology chronology42 = localTime37.getChronology();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.now(chronology42);
        org.joda.time.DurationField durationField44 = chronology42.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter45 = dateTimeFormatter36.withChronology(chronology42);
        org.joda.time.Chronology chronology46 = dateTimeFormatter36.getChronology();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int51 = localTime47.get(dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = localTime47.getChronology();
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.now(chronology52);
        org.joda.time.MutableDateTime mutableDateTime54 = new org.joda.time.MutableDateTime(chronology52);
        int int55 = mutableDateTime54.getSecondOfMinute();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean59 = localTime57.isSupported(dateTimeFieldType58);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime54.property(dateTimeFieldType58);
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime64 = localTime62.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int66 = localTime62.get(dateTimeFieldType65);
        org.joda.time.Chronology chronology67 = localTime62.getChronology();
        java.util.Locale locale68 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology67, locale68);
        mutableDateTime54.setChronology(chronology67);
        org.joda.time.MutableDateTime mutableDateTime71 = org.joda.time.MutableDateTime.now(chronology67);
        org.joda.time.DateTimeField dateTimeField72 = chronology67.secondOfMinute();
        java.util.Locale.Builder builder73 = new java.util.Locale.Builder();
        java.util.Locale locale74 = builder73.build();
        int int75 = dateTimeField72.getMaximumTextLength(locale74);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter36.withLocale(locale74);
        java.lang.String str77 = locale31.getDisplayVariant(locale74);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(4461135156L, chronology11, locale31, (java.lang.Integer) 501, 220);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField13 and durationField44", Math.signum(durationField13.compareTo(durationField44)) == -Math.signum(durationField44.compareTo(durationField13)));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter0.getPrinter();
        boolean boolean11 = dateTimeFormatter0.isOffsetParsed();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int18 = localTime14.get(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = localTime14.getChronology();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology19, locale20);
        org.joda.time.DateTimeZone dateTimeZone22 = chronology19.getZone();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.dayOfWeek();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 21, chronology19);
        org.joda.time.DateTimeField dateTimeField25 = chronology19.dayOfWeek();
        org.joda.time.DurationField durationField26 = chronology19.halfdays();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter0.withChronology(chronology19);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField26", Math.signum(durationField8.compareTo(durationField26)) == -Math.signum(durationField26.compareTo(durationField8)));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withWeekOfWeekyear(10);
        int int4 = localDateTime0.getWeekyear();
        org.joda.time.Chronology chronology5 = localDateTime0.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.millis();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.weekyear();
        org.joda.time.DurationField durationField8 = chronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = chronology5.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField6, and durationField8", !(durationField10.compareTo(durationField6) == 0) || (Math.signum(durationField10.compareTo(durationField8)) == Math.signum(durationField6.compareTo(durationField8))));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        mutableDateTime10.add(durationFieldType18, 40);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime24 = localTime22.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int26 = localTime22.get(dateTimeFieldType25);
        org.joda.time.Chronology chronology27 = localTime22.getChronology();
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.year();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.getMillisKeepLocal(dateTimeZone32, (long) '#');
        java.lang.String str35 = dateTimeZone32.getID();
        int int37 = dateTimeZone32.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology38 = chronology27.withZone(dateTimeZone32);
        org.joda.time.DurationField durationField39 = durationFieldType18.getField(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfSecond();
        org.joda.time.DurationField durationField41 = chronology38.years();
        org.joda.time.DurationField durationField42 = chronology38.years();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.dayOfMonth();
        org.joda.time.DurationField durationField44 = chronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = chronology38.dayOfMonth();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField39 and durationField44", (durationField39.compareTo(durationField44) == 0) == durationField39.equals(durationField44));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        mutableDateTime3.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology7 = null;
        mutableDateTime3.setChronology(chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) 'a', chronology10);
        mutableDateTime11.addWeekyears((int) (byte) -1);
        int int14 = mutableDateTime11.getDayOfMonth();
        mutableDateTime11.setWeekyear((int) (short) 0);
        boolean boolean17 = mutableDateTime3.isAfter((org.joda.time.ReadableInstant) mutableDateTime11);
        long long18 = mutableDateTime11.getMillis();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.years();
        mutableDateTime11.add(durationFieldType19, 40);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int27 = localTime23.get(dateTimeFieldType26);
        org.joda.time.Chronology chronology28 = localTime23.getChronology();
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = chronology28.year();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
        long long35 = dateTimeZone32.getMillisKeepLocal(dateTimeZone33, (long) '#');
        java.lang.String str36 = dateTimeZone33.getID();
        int int38 = dateTimeZone33.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology39 = chronology28.withZone(dateTimeZone33);
        org.joda.time.DurationField durationField40 = durationFieldType19.getField(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.millisOfSecond();
        org.joda.time.DurationField durationField42 = chronology39.years();
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((long) (-34), chronology39);
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(chronology39);
        org.joda.time.DurationField durationField45 = chronology39.eras();
        org.joda.time.DurationField durationField46 = chronology39.weekyears();
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField40 and durationField45", Math.signum(durationField40.compareTo(durationField45)) == -Math.signum(durationField45.compareTo(durationField40)));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.months();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.hourOfHalfday();
        org.joda.time.DurationField durationField10 = chronology7.weekyears();
        org.joda.time.tz.NameProvider nameProvider11 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale12 = java.util.Locale.ITALIAN;
        java.lang.String str15 = nameProvider11.getShortName(locale12, "United States", "1970-01-01T00:00:00.000Z");
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        java.lang.String str17 = locale16.getCountry();
        java.lang.String str20 = nameProvider11.getShortName(locale16, "English", "february 21, 2022_FEBRUARY 21, 2022");
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((long) 'a', chronology22);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime23.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime25 = property24.roundHalfEven();
        java.util.Locale locale27 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime28 = property24.set("22", locale27);
        mutableDateTime28.addYears(10);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(chronology31);
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfCentury();
        org.joda.time.DateTime dateTime34 = property33.withMinimumValue();
        org.joda.time.DateTime dateTime36 = dateTime34.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime38 = dateTime34.plusMillis(1);
        mutableDateTime28.setDate((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime41 = dateTime38.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime42 = dateTime41.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime44 = dateTime42.minusWeeks(2);
        java.util.Locale locale45 = java.util.Locale.ITALY;
        java.util.Calendar calendar46 = dateTime44.toCalendar(locale45);
        java.lang.String str47 = locale16.getDisplayVariant(locale45);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(234348L, chronology7, locale45, (java.lang.Integer) 70);
        org.joda.time.DateTimeField dateTimeField50 = chronology7.clockhourOfDay();
        org.joda.time.DurationField durationField51 = chronology7.halfdays();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime(chronology52);
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.DateTime dateTime55 = dateTime53.plus(readablePeriod54);
        org.joda.time.DateTime.Property property56 = dateTime55.millisOfDay();
        org.joda.time.DurationField durationField57 = property56.getDurationField();
        org.joda.time.DateTimeField dateTimeField58 = property56.getField();
        java.util.Locale locale60 = java.util.Locale.GERMAN;
        java.lang.String str61 = dateTimeField58.getAsText(100L, locale60);
        java.util.Locale locale62 = java.util.Locale.CANADA;
        java.util.Locale locale63 = locale62.stripExtensions();
        java.util.Locale locale66 = new java.util.Locale("February 21, 2022", "February 21, 2022");
        java.lang.String str67 = locale62.getDisplayLanguage(locale66);
        java.lang.String str68 = locale60.getDisplayVariant(locale62);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) 2122, chronology7, locale62, (java.lang.Integer) 897);
        org.joda.time.DurationField durationField71 = chronology7.years();
        org.joda.time.DateTimeField dateTimeField72 = chronology7.hourOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField10 and durationField71", (durationField10.compareTo(durationField71) == 0) == durationField10.equals(durationField71));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str17 = dateTimeZone15.getName((long) 54);
        java.lang.String str19 = dateTimeZone15.getShortName(26265600000L);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        java.lang.String str21 = dateTimeZone15.getID();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((long) 'a', chronology3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime6 = property5.roundHalfEven();
        java.util.Locale locale8 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime9 = property5.set("22", locale8);
        mutableDateTime9.addYears(10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = dateTime15.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime19 = dateTime15.plusMillis(1);
        mutableDateTime9.setDate((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        mutableDateTime9.add(readablePeriod21, (int) (short) 0);
        org.joda.time.Chronology chronology24 = mutableDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfYear();
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) 'a', chronology28);
        mutableDateTime29.addWeekyears((int) (byte) -1);
        org.joda.time.MutableDateTime.Property property32 = mutableDateTime29.secondOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a', chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.yearOfCentury();
        mutableDateTime35.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology39 = null;
        mutableDateTime35.setChronology(chronology39);
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime35.weekyear();
        org.joda.time.MutableDateTime mutableDateTime43 = property41.add((long) 1);
        mutableDateTime43.addDays((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        mutableDateTime43.add(readablePeriod46);
        org.joda.time.DateTime dateTime48 = mutableDateTime43.toDateTime();
        java.util.TimeZone timeZone50 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        mutableDateTime43.setZone(dateTimeZone52);
        mutableDateTime29.setZone(dateTimeZone52);
        org.joda.time.Chronology chronology55 = chronology24.withZone(dateTimeZone52);
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate((long) 1969, chronology24);
        org.joda.time.DateTimeField dateTimeField57 = chronology24.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField58 = chronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField59 = chronology24.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime60 = new org.joda.time.MutableDateTime((long) 54629, chronology24);
        org.joda.time.DurationField durationField61 = chronology24.millis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime35 and dateTime48", (mutableDateTime35.compareTo(dateTime48) == 0) == mutableDateTime35.equals(dateTime48));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder0 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean4 = localTime2.isSupported(dateTimeFieldType3);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder7 = dateTimeFormatterBuilder0.appendSignedDecimal(dateTimeFieldType3, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder9 = dateTimeFormatterBuilder0.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder11 = dateTimeFormatterBuilder9.appendMinuteOfHour(100);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder14 = dateTimeFormatterBuilder9.appendFractionOfSecond(59, 0);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime19 = localTime16.withField(dateTimeFieldType17, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronolgy();
        java.lang.String str22 = localTime19.toString(dateTimeFormatter20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.DateTime dateTime28 = dateTime25.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime25.toMutableDateTime(dateTimeZone29);
        long long33 = dateTimeZone29.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 'a', dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter20.withZone(dateTimeZone29);
        org.joda.time.format.DateTimePrinter dateTimePrinter36 = dateTimeFormatter20.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser37 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter36, dateTimeParser37);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder39 = dateTimeFormatterBuilder9.append(dateTimePrinter36);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder41 = dateTimeFormatterBuilder39.appendSecondOfMinute(25);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder42 = dateTimeFormatterBuilder41.appendEraText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder43 = dateTimeFormatterBuilder42.appendDayOfWeekShortText();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder45 = dateTimeFormatterBuilder42.appendTwoDigitWeekyear(2090);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder48 = dateTimeFormatterBuilder42.appendFractionOfDay(46, 716);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder49 = dateTimeFormatterBuilder42.appendTimeZoneId();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime25 and mutableDateTime30", (dateTime25.compareTo(mutableDateTime30) == 0) == dateTime25.equals(mutableDateTime30));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str17 = dateTimeZone15.getName((long) 54);
        java.lang.String str19 = dateTimeZone15.getShortName(26265600000L);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        org.joda.time.DateTime.Property property21 = dateTime20.hourOfDay();
        org.joda.time.DurationField durationField22 = property21.getLeapDurationField();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("Thursday");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        long long6 = dateTimeZone3.adjustOffset((-62166787199903L), false);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.weekyear();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int15 = localTime11.get(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology16, locale17);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.year();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long23 = dateTimeZone20.getMillisKeepLocal(dateTimeZone21, (long) '#');
        java.lang.String str24 = dateTimeZone21.getID();
        int int26 = dateTimeZone21.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology27 = chronology16.withZone(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField28 = chronology16.millisOfSecond();
        long long30 = dateTimeField28.roundHalfEven((long) 36130021);
        mutableDateTime8.setRounding(dateTimeField28);
        long long33 = dateTimeField28.roundHalfEven((long) 23);
        org.joda.time.DurationField durationField34 = dateTimeField28.getRangeDurationField();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology38);
        boolean boolean41 = localTime39.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalTime localTime43 = localTime39.plus(readablePeriod42);
        org.joda.time.Chronology chronology44 = localTime43.getChronology();
        java.util.Locale locale46 = java.util.Locale.forLanguageTag("5");
        java.lang.String str47 = locale46.getVariant();
        java.lang.String str48 = locale46.getCountry();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) 56, chronology44, locale46);
        java.lang.String str50 = locale46.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime54 = localTime52.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int56 = localTime52.get(dateTimeFieldType55);
        org.joda.time.Chronology chronology57 = localTime52.getChronology();
        org.joda.time.LocalTime localTime58 = org.joda.time.LocalTime.now(chronology57);
        org.joda.time.DurationField durationField59 = chronology57.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter60 = dateTimeFormatter51.withChronology(chronology57);
        org.joda.time.Chronology chronology61 = dateTimeFormatter51.getChronology();
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime64 = localTime62.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int66 = localTime62.get(dateTimeFieldType65);
        org.joda.time.Chronology chronology67 = localTime62.getChronology();
        org.joda.time.LocalTime localTime68 = org.joda.time.LocalTime.now(chronology67);
        org.joda.time.MutableDateTime mutableDateTime69 = new org.joda.time.MutableDateTime(chronology67);
        int int70 = mutableDateTime69.getSecondOfMinute();
        org.joda.time.LocalTime localTime72 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType73 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean74 = localTime72.isSupported(dateTimeFieldType73);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime69.property(dateTimeFieldType73);
        org.joda.time.LocalTime localTime77 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime79 = localTime77.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType80 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int81 = localTime77.get(dateTimeFieldType80);
        org.joda.time.Chronology chronology82 = localTime77.getChronology();
        java.util.Locale locale83 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology82, locale83);
        mutableDateTime69.setChronology(chronology82);
        org.joda.time.MutableDateTime mutableDateTime86 = org.joda.time.MutableDateTime.now(chronology82);
        org.joda.time.DateTimeField dateTimeField87 = chronology82.secondOfMinute();
        java.util.Locale.Builder builder88 = new java.util.Locale.Builder();
        java.util.Locale locale89 = builder88.build();
        int int90 = dateTimeField87.getMaximumTextLength(locale89);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter91 = dateTimeFormatter51.withLocale(locale89);
        java.lang.String str92 = locale46.getDisplayVariant(locale89);
        java.lang.String str93 = locale46.getISO3Country();
        java.util.Locale.setDefault(locale46);
        java.lang.String str95 = dateTimeField28.getAsShortText((long) 2139, locale46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField34 and durationField59", Math.signum(durationField34.compareTo(durationField59)) == -Math.signum(durationField59.compareTo(durationField34)));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime.Property property5 = dateTime4.millisOfDay();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        org.joda.time.DateTimeField dateTimeField7 = property5.getField();
        long long10 = dateTimeField7.add((-259199980L), (int) (short) 1);
        boolean boolean11 = dateTimeField7.isSupported();
        java.lang.String str13 = dateTimeField7.getAsShortText((long) 5);
        int int14 = dateTimeField7.getMinimumValue();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology17);
        boolean boolean20 = localTime18.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime18.plus(readablePeriod21);
        org.joda.time.LocalTime.Property property23 = localTime18.secondOfMinute();
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.lang.String str25 = property23.getAsShortText(locale24);
        java.lang.String str26 = dateTimeField7.getAsText(6, locale24);
        java.lang.String str27 = locale0.getDisplayLanguage(locale24);
        java.util.Set<java.lang.String> strSet28 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime32 = localTime30.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int34 = localTime30.get(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localTime30.getChronology();
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology35, locale36);
        org.joda.time.DateTimeField dateTimeField38 = chronology35.millisOfDay();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.DateTime dateTime43 = dateTime40.withSecondOfMinute(0);
        org.joda.time.LocalTime localTime44 = dateTime40.toLocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime47 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime49 = localTime47.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int51 = localTime47.get(dateTimeFieldType50);
        org.joda.time.Chronology chronology52 = localTime47.getChronology();
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.now(chronology52);
        org.joda.time.DurationField durationField54 = chronology52.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter46.withChronology(chronology52);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter55.withPivotYear(16);
        java.util.Locale locale58 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withLocale(locale58);
        java.util.Set<java.lang.String> strSet60 = locale58.getUnicodeLocaleKeys();
        java.lang.String str61 = dateTimeField38.getAsText((org.joda.time.ReadablePartial) localTime44, (-54383307), locale58);
        boolean boolean62 = strSet28.remove((java.lang.Object) (-54383307));
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField6 and durationField54", Math.signum(durationField6.compareTo(durationField54)) == -Math.signum(durationField54.compareTo(durationField6)));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readablePeriod2);
        org.joda.time.DateTime dateTime5 = dateTime3.minusWeeks((int) '4');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 'a', chronology7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        mutableDateTime8.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology12 = null;
        mutableDateTime8.setChronology(chronology12);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(10L);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.DateTime dateTime21 = property20.withMinimumValue();
        org.joda.time.DateTime dateTime23 = dateTime21.minusYears(2);
        org.joda.time.DateTime dateTime25 = dateTime21.withWeekyear(21);
        int int26 = dateTime16.compareTo((org.joda.time.ReadableInstant) dateTime21);
        mutableDateTime8.setTime((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int32 = localTime28.get(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = localTime28.getChronology();
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology33);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology33);
        mutableDateTime8.setChronology(chronology33);
        org.joda.time.DateTime dateTime37 = dateTime5.withChronology(chronology33);
        org.joda.time.DateTime dateTime38 = dateTime37.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(chronology39);
        org.joda.time.DateTime.Property property41 = dateTime40.yearOfCentury();
        org.joda.time.DateTime dateTime42 = property41.withMinimumValue();
        org.joda.time.DateTime dateTime44 = dateTime42.minusYears(2);
        org.joda.time.DateTime dateTime46 = dateTime42.withWeekyear(21);
        org.joda.time.DateTime.Property property47 = dateTime46.yearOfCentury();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime(chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.DateTime dateTime52 = dateTime49.minusYears(0);
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime55 = localTime53.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int57 = localTime53.get(dateTimeFieldType56);
        org.joda.time.DateTime dateTime58 = dateTime52.withFields((org.joda.time.ReadablePartial) localTime53);
        boolean boolean59 = dateTime46.isAfter((org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.DateTime dateTime61 = dateTime58.minusYears(40);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder62 = new org.joda.time.format.DateTimeFormatterBuilder();
        org.joda.time.LocalTime localTime64 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType65 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean66 = localTime64.isSupported(dateTimeFieldType65);
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder69 = dateTimeFormatterBuilder62.appendSignedDecimal(dateTimeFieldType65, 1969, (int) 'u');
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder71 = dateTimeFormatterBuilder62.appendLiteral("");
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder73 = dateTimeFormatterBuilder71.appendClockhourOfDay((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType74 = org.joda.time.DateTimeFieldType.year();
        java.lang.String str75 = dateTimeFieldType74.toString();
        org.joda.time.format.DateTimeFormatterBuilder dateTimeFormatterBuilder76 = dateTimeFormatterBuilder71.appendShortText(dateTimeFieldType74);
        org.joda.time.DateTime dateTime78 = dateTime58.withField(dateTimeFieldType74, 25);
        org.joda.time.DurationFieldType durationFieldType79 = dateTimeFieldType74.getRangeDurationType();
        java.lang.String str80 = dateTimeFieldType74.getName();
        org.joda.time.DateTime dateTime82 = dateTime37.withField(dateTimeFieldType74, 569);
        org.joda.time.DateTimeZone dateTimeZone84 = org.joda.time.DateTimeZone.forOffsetMillis(19380000);
        java.lang.String str85 = dateTimeZone84.getID();
        org.joda.time.DateTime dateTime86 = dateTime37.toDateTime(dateTimeZone84);
        java.util.TimeZone timeZone87 = dateTimeZone84.toTimeZone();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime5 and dateTime86", (dateTime5.compareTo(dateTime86) == 0) == dateTime5.equals(dateTime86));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.DurationField durationField3 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.addCopy(54745164);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime11 = property9.add(558);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int19 = localTime15.get(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localTime15.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.DurationField durationField22 = chronology20.eras();
        mutableDateTime14.setChronology(chronology20);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology20);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
        boolean boolean27 = mutableDateTime11.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime.Property property28 = localTime6.property(dateTimeFieldType26);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField3 and durationField22", Math.signum(durationField3.compareTo(durationField22)) == -Math.signum(durationField22.compareTo(durationField3)));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        org.joda.time.DateTime dateTime4 = dateTime1.minus((long) ' ');
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfMonth(21);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.withField(dateTimeFieldType13, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology17 = dateTimeFormatter16.getChronolgy();
        java.lang.String str18 = localTime15.toString(dateTimeFormatter16);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = dateTime21.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime21.toMutableDateTime(dateTimeZone25);
        long long29 = dateTimeZone25.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 'a', dateTimeZone25);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter16.withZone(dateTimeZone25);
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((long) 1940, dateTimeZone25);
        int int33 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) mutableDateTime32);
        org.joda.time.DateTime dateTime34 = dateTime6.withZone(dateTimeZone9);
        boolean boolean36 = dateTime34.isEqual((long) 2122);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime39 = dateTime34.withDurationAdded(readableDuration37, 54353559);
        org.joda.time.MutableDateTime mutableDateTime40 = dateTime34.toMutableDateTimeISO();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime4 and dateTime34", (dateTime4.compareTo(dateTime34) == 0) == dateTime4.equals(dateTime34));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 'a', dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str17 = dateTimeZone15.getName((long) 54);
        java.lang.String str19 = dateTimeZone15.getShortName(26265600000L);
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths(844);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime28 = localTime25.withPeriodAdded(readablePeriod26, (int) (byte) -1);
        org.joda.time.LocalTime.Property property29 = localTime28.millisOfSecond();
        org.joda.time.LocalTime localTime30 = property29.roundHalfEvenCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = org.joda.time.format.DateTimeFormat.shortDateTime();
        java.lang.String str32 = localTime30.toString(dateTimeFormatter31);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime((long) 'a', chronology34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime37 = property36.roundHalfEven();
        java.util.Locale locale39 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime40 = property36.set("22", locale39);
        mutableDateTime40.addYears(10);
        boolean boolean44 = mutableDateTime40.isAfter((long) (short) 1);
        java.lang.String str45 = dateTimeFormatter31.print((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter31.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeFormatter31.getZone();
        org.joda.time.Chronology chronology48 = dateTimeFormatter31.getChronolgy();
        java.lang.String str49 = dateTime22.toString(dateTimeFormatter31);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and dateTime20", (dateTime11.compareTo(dateTime20) == 0) == dateTime11.equals(dateTime20));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 'a', chronology2);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime5 = property4.roundHalfEven();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime8 = property4.set("22", locale7);
        mutableDateTime8.addYears(10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime16 = dateTime14.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime18 = dateTime14.plusMillis(1);
        mutableDateTime8.setDate((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        mutableDateTime8.add(readablePeriod20, (int) (short) 0);
        org.joda.time.Chronology chronology23 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology23);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(86400121L, chronology23);
        org.joda.time.DurationField durationField28 = chronology23.eras();
        org.joda.time.DateTimeField dateTimeField29 = chronology23.year();
        org.joda.time.DurationField durationField30 = chronology23.hours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField28, durationField30, and durationField28", !(durationField28.compareTo(durationField30) == 0) || (Math.signum(durationField28.compareTo(durationField28)) == Math.signum(durationField30.compareTo(durationField28))));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int5 = localTime1.get(dateTimeFieldType4);
        org.joda.time.Chronology chronology6 = localTime1.getChronology();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology6);
        org.joda.time.DurationField durationField8 = chronology6.eras();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter0.withChronology(chronology6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear(16);
        java.util.Locale locale12 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withLocale(locale12);
        java.util.Set<java.lang.String> strSet14 = locale12.getUnicodeLocaleKeys();
        java.util.Spliterator<java.lang.String> strSpliterator15 = strSet14.spliterator();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology17);
        boolean boolean20 = localTime18.equals((java.lang.Object) 10L);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime18.plus(readablePeriod21);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.months();
        boolean boolean25 = strSet14.remove((java.lang.Object) chronology23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField8 and durationField24", Math.signum(durationField8.compareTo(durationField24)) == -Math.signum(durationField24.compareTo(durationField8)));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime7 = property3.set("22", locale6);
        mutableDateTime7.addYears(10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.DateTime dateTime13 = property12.withMinimumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime17 = dateTime13.plusMillis(1);
        mutableDateTime7.setDate((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime20 = dateTime17.plusSeconds((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks(2);
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Calendar calendar25 = dateTime23.toCalendar(locale24);
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.fromCalendarFields(calendar25);
        org.joda.time.LocalDate localDate28 = localDate26.withWeekyear(42);
        org.joda.time.LocalDate.Property property29 = localDate26.dayOfMonth();
        org.joda.time.LocalDate localDate31 = localDate26.minusDays(54388519);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str36 = dateTimeZone34.getShortName((long) (byte) 0);
        long long38 = dateTimeZone34.nextTransition((long) 1940);
        java.lang.String str40 = dateTimeZone34.getName(45988L);
        int int42 = dateTimeZone34.getOffsetFromLocal((-19379946L));
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(dateTimeZone34);
        org.joda.time.DateTime dateTime44 = localDate26.toDateTimeAtCurrentTime(dateTimeZone34);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime11 and mutableDateTime43", (dateTime11.compareTo(mutableDateTime43) == 0) == dateTime11.equals(mutableDateTime43));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int6 = localTime2.get(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = localTime2.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.DurationField durationField9 = chronology7.eras();
        mutableDateTime1.setChronology(chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime1.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime13 = mutableDateTime12.toDateTimeISO();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime19 = dateTime17.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime21 = dateTime17.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime17.getZone();
        int int23 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime25 = dateTime17.minusYears(59);
        org.joda.time.DateTime dateTime27 = dateTime17.plusHours((-54353560));
        java.util.GregorianCalendar gregorianCalendar28 = dateTime17.toGregorianCalendar();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime17.minus(readablePeriod29);
        org.joda.time.DateTime dateTime32 = dateTime30.withWeekyear(54371);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(5, 23);
        java.lang.String str37 = dateTimeZone35.getShortName((long) (byte) 0);
        long long39 = dateTimeZone35.nextTransition((long) 1940);
        java.lang.String str41 = dateTimeZone35.getName(45988L);
        int int43 = dateTimeZone35.getOffsetFromLocal((-19379946L));
        org.joda.time.MutableDateTime mutableDateTime44 = org.joda.time.MutableDateTime.now(dateTimeZone35);
        org.joda.time.DateTime dateTime45 = dateTime30.withZone(dateTimeZone35);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime15 and mutableDateTime44", (dateTime15.compareTo(mutableDateTime44) == 0) == dateTime15.equals(mutableDateTime44));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("1970-01-01T00:00:00.000Z");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.eras();
        mutableDateTime2.setChronology(chronology8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = mutableDateTime2.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime14 = mutableDateTime13.toDateTimeISO();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.DateTime dateTime18 = property17.withMinimumValue();
        org.joda.time.DateTime dateTime20 = dateTime18.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime22 = dateTime18.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime18.getZone();
        int int24 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime14.getZone();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime29 = localTime27.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int31 = localTime27.get(dateTimeFieldType30);
        org.joda.time.Chronology chronology32 = localTime27.getChronology();
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology32, locale33);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime37 = dateTime14.toMutableDateTime(chronology35);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(259200097L, chronology35);
        org.joda.time.DurationField durationField39 = chronology35.years();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField10, durationField39, and durationField10", !(durationField10.compareTo(durationField39) == 0) || (Math.signum(durationField10.compareTo(durationField10)) == Math.signum(durationField39.compareTo(durationField10))));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology8, locale9);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.getMillisKeepLocal(dateTimeZone13, (long) '#');
        java.lang.String str16 = dateTimeZone13.getID();
        int int18 = dateTimeZone13.getOffsetFromLocal((long) 'u');
        org.joda.time.Chronology chronology19 = chronology8.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.halfdayOfDay();
        org.joda.time.DurationField durationField23 = chronology19.months();
        org.joda.time.DurationField durationField24 = durationFieldType0.getField(chronology19);
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology19);
        org.joda.time.DurationField durationField26 = chronology19.eras();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on durationField26, durationField23, and durationField24", !(durationField26.compareTo(durationField23) == 0) || (Math.signum(durationField26.compareTo(durationField24)) == Math.signum(durationField23.compareTo(durationField24))));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        long long5 = mutableDateTime4.getMillis();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime4.add(readableDuration6, 39);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime4.copy();
        int int11 = mutableDateTime10.getSecondOfMinute();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime16 = dateTime13.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime13.toMutableDateTime(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(dateTimeZone17);
        java.lang.Object obj20 = null;
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime23 = localTime21.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int25 = localTime21.get(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localTime21.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology26);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = chronology26.add(readablePeriod28, 4460736516L, (int) (short) -1);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(obj20, chronology26);
        org.joda.time.DateTimeZone dateTimeZone33 = chronology26.getZone();
        long long35 = dateTimeZone17.getMillisKeepLocal(dateTimeZone33, 0L);
        java.util.TimeZone timeZone36 = dateTimeZone33.toTimeZone();
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone33);
        mutableDateTime10.setZoneRetainFields(dateTimeZone33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime18", (dateTime13.compareTo(mutableDateTime18) == 0) == dateTime13.equals(mutableDateTime18));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(0);
        org.joda.time.DateTime dateTime5 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        int int14 = mutableDateTime10.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime16 = mutableDateTime10.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate7.toDateTimeAtMidnight(dateTimeZone15);
        int int18 = localDate7.getDayOfWeek();
        org.joda.time.LocalDate localDate20 = localDate7.minusDays((int) ' ');
        org.joda.time.LocalDate localDate22 = localDate20.plusYears(54730239);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime10 and mutableDateTime16", (mutableDateTime10.compareTo(mutableDateTime16) == 0) == mutableDateTime10.equals(mutableDateTime16));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfEven();
        long long5 = mutableDateTime4.getMillis();
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutableDateTime4.add(readableDuration6, 39);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime4.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime4.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.secondOfMinute();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int17 = localTime13.get(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localTime13.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology18);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology18);
        int int21 = mutableDateTime20.getSecondOfMinute();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean25 = localTime23.isSupported(dateTimeFieldType24);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime20.property(dateTimeFieldType24);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime30 = localTime28.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int32 = localTime28.get(dateTimeFieldType31);
        org.joda.time.Chronology chronology33 = localTime28.getChronology();
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology33, locale34);
        mutableDateTime20.setChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now(chronology33);
        org.joda.time.DateTimeField dateTimeField38 = chronology33.yearOfCentury();
        boolean boolean39 = dateTimeFieldType12.isSupported(chronology33);
        org.joda.time.DurationField durationField40 = chronology33.millis();
        org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(206L, chronology33);
        mutableDateTime10.setTime((org.joda.time.ReadableInstant) mutableDateTime41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.DateTime dateTime46 = property45.withMinimumValue();
        org.joda.time.DateTime dateTime48 = dateTime46.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime50 = dateTime46.plusMillis(1);
        org.joda.time.DateTimeZone dateTimeZone51 = dateTime46.getZone();
        long long53 = dateTimeZone51.nextTransition(100L);
        long long55 = dateTimeZone51.convertUTCToLocal((long) 46);
        java.util.TimeZone timeZone56 = dateTimeZone51.toTimeZone();
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime(dateTimeZone51);
        mutableDateTime10.setZone(dateTimeZone51);
        mutableDateTime10.setWeekOfWeekyear(44);
        org.joda.time.MutableDateTime.Property property61 = mutableDateTime10.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime10.copy();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and dateTime44", (mutableDateTime20.compareTo(dateTime44) == 0) == mutableDateTime20.equals(dateTime44));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.yearOfCentury();
        int int3 = dateTime1.getWeekOfWeekyear();
        org.joda.time.DateTime dateTime5 = dateTime1.plusSeconds((int) (short) 0);
        org.joda.time.LocalDate localDate6 = dateTime5.toLocalDate();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property9.withMinimumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.minusYears(2);
        int int13 = dateTime12.getDayOfMonth();
        org.joda.time.DateTime.Property property14 = dateTime12.year();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTime12.getZone();
        java.lang.String str17 = dateTimeZone15.getNameKey((long) (-1));
        long long21 = dateTimeZone15.convertLocalToUTC((long) 1940, false, (long) 70);
        org.joda.time.DateTime dateTime22 = dateTime5.withZone(dateTimeZone15);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) dateTime22);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 'a', chronology25);
        mutableDateTime26.addWeekyears((int) (byte) -1);
        int int29 = mutableDateTime26.getDayOfMonth();
        int int30 = mutableDateTime26.getDayOfYear();
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime33 = localTime31.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int35 = localTime31.get(dateTimeFieldType34);
        org.joda.time.Chronology chronology36 = localTime31.getChronology();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.now(chronology36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        long long41 = chronology36.add(readablePeriod38, 4460736516L, (int) (short) -1);
        org.joda.time.DurationField durationField42 = chronology36.minutes();
        org.joda.time.MutableDateTime mutableDateTime43 = org.joda.time.MutableDateTime.now(chronology36);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) 'a', chronology45);
        mutableDateTime46.addWeekyears((int) (byte) -1);
        int int49 = mutableDateTime46.getDayOfMonth();
        int int50 = mutableDateTime46.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime52 = mutableDateTime46.toMutableDateTime(dateTimeZone51);
        long long55 = dateTimeZone51.convertLocalToUTC((long) 54, true);
        mutableDateTime43.setZoneRetainFields(dateTimeZone51);
        boolean boolean57 = dateTimeZone51.isFixed();
        mutableDateTime26.setZone(dateTimeZone51);
        long long62 = dateTimeZone51.convertLocalToUTC(39633L, false, 4460855846L);
        org.joda.time.DateTime dateTime63 = dateTime22.toDateTime(dateTimeZone51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime22 and mutableDateTime43", (dateTime22.compareTo(mutableDateTime43) == 0) == dateTime22.equals(mutableDateTime43));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) 'a', chronology1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.yearOfCentury();
        mutableDateTime2.setMillisOfDay((int) 'a');
        org.joda.time.Chronology chronology6 = null;
        mutableDateTime2.setChronology(chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((long) 'a', chronology9);
        mutableDateTime10.addWeekyears((int) (byte) -1);
        int int13 = mutableDateTime10.getDayOfMonth();
        mutableDateTime10.setWeekyear((int) (short) 0);
        boolean boolean16 = mutableDateTime2.isAfter((org.joda.time.ReadableInstant) mutableDateTime10);
        long long17 = mutableDateTime10.getMillis();
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime10.copy();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.dayOfWeek();
        mutableDateTime18.setMinuteOfDay(0);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime18.year();
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime18.centuryOfEra();
        mutableDateTime18.setSecondOfDay(54624);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime18.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = property26.getMutableDateTime();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime31 = localTime29.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int33 = localTime29.get(dateTimeFieldType32);
        org.joda.time.Chronology chronology34 = localTime29.getChronology();
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology34, locale35);
        org.joda.time.Chronology chronology37 = dateTimeParserBucket36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.monthOfYear();
        org.joda.time.Chronology chronology39 = chronology37.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.monthOfYear();
        org.joda.time.LocalTime localTime43 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime46 = localTime43.withField(dateTimeFieldType44, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology48 = dateTimeFormatter47.getChronolgy();
        java.lang.String str49 = localTime46.toString(dateTimeFormatter47);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(chronology51);
        org.joda.time.DateTime.Property property53 = dateTime52.yearOfCentury();
        org.joda.time.DateTime dateTime55 = dateTime52.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime52.toMutableDateTime(dateTimeZone56);
        long long60 = dateTimeZone56.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime61 = new org.joda.time.DateTime((long) 'a', dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter62 = dateTimeFormatter47.withZone(dateTimeZone56);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter62.withPivotYear((java.lang.Integer) 39);
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.LocalTime localTime67 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology66);
        org.joda.time.LocalTime.Property property68 = localTime67.hourOfDay();
        org.joda.time.LocalTime localTime69 = property68.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime70 = property68.roundHalfFloorCopy();
        java.lang.String str71 = dateTimeFormatter64.print((org.joda.time.ReadablePartial) localTime70);
        org.joda.time.Chronology chronology72 = dateTimeFormatter64.getChronology();
        java.util.Locale locale74 = java.util.Locale.forLanguageTag("year");
        java.util.Set<java.lang.Character> charSet75 = locale74.getExtensionKeys();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter76 = dateTimeFormatter64.withLocale(locale74);
        java.lang.String str77 = dateTimeField40.getAsText(0, locale74);
        java.util.Locale locale78 = locale74.stripExtensions();
        int int79 = property26.getMaximumTextLength(locale74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime52 and mutableDateTime57", (dateTime52.compareTo(mutableDateTime57) == 0) == dateTime52.equals(mutableDateTime57));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.withMinimumValue();
        org.joda.time.DateTime dateTime6 = dateTime4.minusYears(2);
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear(21);
        org.joda.time.DateTime dateTime10 = dateTime4.minusMinutes((int) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear(2022);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int18 = localTime14.get(dateTimeFieldType17);
        org.joda.time.Chronology chronology19 = localTime14.getChronology();
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology19, locale20);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket21.getChronology();
        org.joda.time.Chronology chronology23 = chronology22.withUTC();
        org.joda.time.DateTime dateTime24 = dateTime10.withChronology(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.seconds();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(1782539892L, chronology23);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 40002512);
        int int29 = dateTime28.getMinuteOfDay();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime10 and dateTime24", (dateTime10.compareTo(dateTime24) == 0) == dateTime10.equals(dateTime24));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.withDayOfYear((int) '4');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate0.plusDays((int) ' ');
        org.joda.time.LocalDate.Property property7 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate10 = property7.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Interval interval11 = property7.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property7.getFieldType();
        org.joda.time.LocalDate localDate14 = property7.setCopy("54361031");
        org.joda.time.LocalDate localDate16 = localDate14.withYearOfEra(3);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.DateTime dateTime21 = dateTime18.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localDate14.toDateTimeAtMidnight(dateTimeZone22);
        org.joda.time.LocalDate localDate26 = localDate14.minusYears(462);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime18 and mutableDateTime23", (dateTime18.compareTo(mutableDateTime23) == 0) == dateTime18.equals(mutableDateTime23));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int7 = localTime3.get(dateTimeFieldType6);
        org.joda.time.Chronology chronology8 = localTime3.getChronology();
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology8, locale9);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket10.getChronology();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readablePeriod14);
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.joda.time.DateTimeField dateTimeField18 = property16.getField();
        long long21 = dateTimeField18.add((-259199980L), (int) (short) 1);
        java.lang.String str22 = dateTimeField18.toString();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        int int24 = dateTimeField18.getMaximumShortTextLength(locale23);
        dateTimeParserBucket10.saveField(dateTimeField18, 0);
        org.joda.time.LocalTime localTime28 = org.joda.time.LocalTime.fromMillisOfDay(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withField(dateTimeFieldType29, (int) '#');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = org.joda.time.format.DateTimeFormat.shortTime();
        org.joda.time.Chronology chronology33 = dateTimeFormatter32.getChronolgy();
        java.lang.String str34 = localTime31.toString(dateTimeFormatter32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.DateTime dateTime40 = dateTime37.minus((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime37.toMutableDateTime(dateTimeZone41);
        long long45 = dateTimeZone41.adjustOffset((long) 52, false);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) 'a', dateTimeZone41);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter47 = dateTimeFormatter32.withZone(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeFormatter47.getZone();
        dateTimeParserBucket10.setZone(dateTimeZone48);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfSecond();
        int int52 = localTime50.indexOf(dateTimeFieldType51);
        dateTimeParserBucket10.saveField(dateTimeFieldType51, 56);
        org.joda.time.Chronology chronology55 = dateTimeParserBucket10.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.yearOfEra();
        org.joda.time.LocalTime localTime57 = org.joda.time.LocalTime.fromMillisOfDay((long) 411, chronology55);
        org.joda.time.DateTimeField dateTimeField58 = chronology55.hourOfHalfday();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime((long) 'a', chronology60);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime61.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime63 = property62.roundHalfEven();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime66 = property62.set("22", locale65);
        mutableDateTime66.addYears(10);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(chronology69);
        org.joda.time.DateTime.Property property71 = dateTime70.yearOfCentury();
        org.joda.time.DateTime dateTime72 = property71.withMinimumValue();
        org.joda.time.DateTime dateTime74 = dateTime72.plusYears((int) (byte) 10);
        org.joda.time.DateTime dateTime76 = dateTime72.plusMillis(1);
        mutableDateTime66.setDate((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.DateTime dateTime79 = dateTime76.plusSeconds((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration80 = null;
        org.joda.time.DateTime dateTime81 = dateTime76.plus(readableDuration80);
        java.util.Locale locale82 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = new org.joda.time.MutableDateTime((long) 'a', chronology84);
        org.joda.time.MutableDateTime.Property property86 = mutableDateTime85.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime87 = property86.roundHalfEven();
        java.util.Locale locale89 = java.util.Locale.KOREAN;
        org.joda.time.MutableDateTime mutableDateTime90 = property86.set("22", locale89);
        java.lang.String str91 = locale82.getDisplayScript(locale89);
        java.lang.String str92 = locale89.toLanguageTag();
        java.util.Calendar calendar93 = dateTime81.toCalendar(locale89);
        java.util.Locale locale95 = new java.util.Locale("54522");
        java.lang.String str96 = locale89.getDisplayName(locale95);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket98 = new org.joda.time.format.DateTimeParserBucket((long) 54926, chronology55, locale89, (java.lang.Integer) 448);
        long long99 = dateTimeParserBucket98.computeMillis();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime13 and mutableDateTime42", (dateTime13.compareTo(mutableDateTime42) == 0) == dateTime13.equals(mutableDateTime42));
    }
}

